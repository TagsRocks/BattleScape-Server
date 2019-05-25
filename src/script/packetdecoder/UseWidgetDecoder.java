package script.packetdecoder;

import com.palidino.io.Stream;
import com.palidino.osrs.io.PacketDecoder;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.map.route.Route;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Runecrafting;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;
import lombok.var;
import script.packetdecoder.misc.UseWidgetAction;

public class UseWidgetDecoder extends PacketDecoder {
    public UseWidgetDecoder() {
        super(86, 55, 23, 81, 2, 44, 92);
    }

    @Override
    public void execute(Player player, int index, int size, Stream stream) {
        if (index == 0 || index == 1 || index == 2 || index == 3) {
            executeWidgetOnEntity(player, index, size, stream);
        } else if (index == 4) {
            executeWidgetOnWidget(player, index, size, stream);
        } else if (index == 5 || index == 6) {
            executeWidgetOnMapObject(player, index, size, stream);
        }
    }

    @Override
    public boolean complete(Player player) {
        var index = player.getAttributeInt("packet_decoder_index");
        if (index == 0 || index == 1 || index == 2 || index == 3) {
            return completeWidgetOnEntity(player);
        } else if (index == 4) {
            return completeWidgetOnWidget(player);
        } else if (index == 5 || index == 6) {
            return completeWidgetOnMapObject(player);
        }
        return true;
    }

    @Override
    public void stop(Player player) {
        player.removeAttribute("packet_decoder_index");
        player.removeAttribute("packet_decoder_widget_id");
        player.removeAttribute("packet_decoder_child_id");
        player.removeAttribute("packet_decoder_slot");
        player.removeAttribute("packet_decoder_npc_index");
        player.removeAttribute("packet_decoder_player_index");
        player.removeAttribute("packet_decoder_object_id");
        player.removeAttribute("packet_decoder_object_x");
        player.removeAttribute("packet_decoder_object_y");
        player.removeAttribute("packet_decoder_use_widget_id");
        player.removeAttribute("packet_decoder_use_child_id");
        player.removeAttribute("packet_decoder_on_widget_id");
        player.removeAttribute("packet_decoder_on_child_id");
        player.removeAttribute("packet_decoder_use_slot");
        player.removeAttribute("packet_decoder_use_item_id");
        player.removeAttribute("packet_decoder_on_slot");
        player.removeAttribute("packet_decoder_on_item_id");
    }

    private void executeWidgetOnEntity(Player player, int index, int size, Stream stream) {
        var widgetHash = -1;
        var slot = -1;
        var itemID = -1;
        var id = -1;
        var moveType = 0;
        if (index == 0) {
            id = stream.getUShortLE128();
            moveType = stream.getUReversedByte();
            widgetHash = stream.getIntLE();
            slot = stream.getUShort128();
        } else if (index == 1) {
            widgetHash = stream.getIntV3();
            moveType = stream.getU128Byte();
            slot = stream.getUShort128();
            id = stream.getUShort();
        } else if (index == 2) {
            itemID = stream.getUShortLE128();
            slot = stream.getUShort();
            id = stream.getUShortLE128();
            moveType = stream.getUReversedByte();
            widgetHash = stream.getInt();
        } else if (index == 3) {
            slot = stream.getUShortLE128();
            moveType = stream.getU128Byte();
            widgetHash = stream.getIntV2();
            id = stream.getUShort();
            itemID = stream.getUShort();
        }
        var widgetID = widgetHash >> 16;
        var childID = widgetHash & 65535;
        if (slot == 65535) {
            slot = -1;
        }
        var entity =
                index == 0 || index == 2 ? player.getWorld().getNPCByIndex(id) : player.getWorld().getPlayerByIndex(id);
        if (entity == null) {
            return;
        }
        var message = "[WidgetOnEntity(" + index + ")] widgetID=" + widgetID + "; childID=" + childID + "; itemID="
                + itemID + "; slot=" + slot + "; id=" + id + "; moveType=" + moveType + "; entity="
                + (entity instanceof Player ? ((Player) entity).getUsername() : entity.getID());
        if (player.getRights() == Player.RIGHTS_ADMIN) {
            Logger.println(message);
        }
        if (player.getOptions().getPrintPackets()) {
            player.getGameEncoder().sendMessage(message);
        }
        if (player.isLocked()) {
            return;
        }
        player.clearIdleTime();
        player.clearAllActions(false, true);
        player.setFaceEntity(entity);
        player.getMovement().setFollowing(entity);
        if (widgetID == WidgetID.SPELLBOOK) {
            player.getMagic().setSingleSpellID(childID);
            player.setAttacking(true);
            player.setEngagingEntity(entity);
            player.getCombat().setFollowing(entity);
            player.getMovement().follow();
            player.setFaceTile(entity);
            return;
        }
        player.getMovement().fullRoute(entity, moveType);
        player.putAttribute("packet_decoder_index", index);
        player.putAttribute("packet_decoder_widget_id", widgetID);
        player.putAttribute("packet_decoder_child_id", childID);
        player.putAttribute("packet_decoder_slot", slot);
        player.putAttribute(entity instanceof Npc ? "packet_decoder_npc_index" : "packet_decoder_player_index", id);
        if (complete(player)) {
            stop(player);
            return;
        }
        player.putAttribute("packet_decoder", this);
    }

    private boolean completeWidgetOnEntity(Player player) {
        var index = player.getAttributeInt("packet_decoder_index");
        var widgetID = player.getAttributeInt("packet_decoder_widget_id");
        var childID = player.getAttributeInt("packet_decoder_child_id");
        var slot = player.getAttributeInt("packet_decoder_slot");
        var id = player
                .getAttributeInt(index == 0 || index == 2 ? "packet_decoder_npc_index" : "packet_decoder_player_index");
        var entity =
                index == 0 || index == 2 ? player.getWorld().getNPCByIndex(id) : player.getWorld().getPlayerByIndex(id);
        if (entity == null) {
            return true;
        }
        if (!player.getWidgetManager().hasWidget(widgetID)) {
            return true;
        }
        if (player.isLocked()) {
            return false;
        }
        if (!player.withinDistance(entity, 1)) {
            return false;
        }
        if (!Route.canReachEntity(player, entity, false)) {
            return false;
        }
        player.getMovement().clear();
        player.setFaceTile(entity);
        if (player.getController().widgetOnEntityHook(widgetID, childID, slot, entity)) {
            return true;
        }
        if (entity instanceof Npc) {
            UseWidgetAction.doActionNpc(player, index, widgetID, childID, slot, (Npc) entity);
        } else if (entity instanceof Player) {
            UseWidgetAction.doActionPlayer(player, index, widgetID, childID, slot, (Player) entity);
        }
        return true;
    }

    private void executeWidgetOnWidget(Player player, int index, int size, Stream stream) {
        var useWidgetHash = stream.getIntV2();
        var onWidgetHash = stream.getInt();
        var onSlot = stream.getUShort();
        var onItemID = stream.getUShortLE();
        var useItemID = stream.getUShortLE();
        var useWidgetID = useWidgetHash >> 16;
        var onWidgetID = onWidgetHash >> 16;
        var useChildID = useWidgetHash & 65535;
        var onChildID = onWidgetHash & 65535;
        var useSlot = -1;
        if (useItemID == 65535) {
            useItemID = -1;
        }
        if (onItemID == 65535) {
            onItemID = -1;
        }
        if (useSlot == 65535) {
            useSlot = -1;
        }
        if (onSlot == 65535) {
            onSlot = -1;
        }
        var message = "[WidgetOnWidget] useWidgetID=" + useWidgetID + "; useChildID=" + useChildID + "; onWidgetID="
                + onWidgetID + "; onChildID=" + onChildID + "; useItemID=" + useItemID + "; onItemID=" + onItemID
                + "; onSlot=" + onSlot;
        if (player.getRights() == Player.RIGHTS_ADMIN) {
            Logger.println(message);
        }
        if (player.getOptions().getPrintPackets()) {
            player.getGameEncoder().sendMessage(message);
        }
        if (player.isLocked()) {
            return;
        }
        player.clearAllActions(false, true);
        player.putAttribute("packet_decoder_use_widget_id", useWidgetID);
        player.putAttribute("packet_decoder_use_child_id", useChildID);
        player.putAttribute("packet_decoder_on_widget_id", onWidgetID);
        player.putAttribute("packet_decoder_on_child_id", onChildID);
        player.putAttribute("packet_decoder_use_item_id", useItemID);
        player.putAttribute("packet_decoder_use_slot", useSlot);
        player.putAttribute("packet_decoder_on_slot", onSlot);
        player.putAttribute("packet_decoder_on_item_id", onItemID);
        if (complete(player)) {
            stop(player);
            return;
        }
        player.putAttribute("packet_decoder", this);
    }

    private boolean completeWidgetOnWidget(Player player) {
        var useWidgetID = player.getAttributeInt("packet_decoder_use_widget_id");
        var useChildID = player.getAttributeInt("packet_decoder_use_child_id");
        var onWidgetID = player.getAttributeInt("packet_decoder_on_widget_id");
        var onChildID = player.getAttributeInt("packet_decoder_on_child_id");
        var useSlot = player.getAttributeInt("packet_decoder_use_slot");
        var useItemID = player.getAttributeInt("packet_decoder_use_item_id");
        var onSlot = player.getAttributeInt("packet_decoder_on_slot");
        var onItemID = player.getAttributeInt("packet_decoder_on_item_id");
        if (!player.getWidgetManager().hasWidget(useWidgetID)) {
            return true;
        }
        if (!player.getWidgetManager().hasWidget(onWidgetID)) {
            return true;
        }
        if (player.isLocked()) {
            return false;
        }
        if (player.getUseWidgetOnWidgetDelay() > 0) {
            return false;
        }
        player.setUseWidgetOnWidgetDelay(5);
        if (player.getController().widgetOnWidgetHook(useWidgetID, useChildID, onWidgetID, onChildID, useSlot,
                useItemID, onSlot, onItemID)) {
            return true;
        }
        if (SkillContainer.widgetOnWidgetHooks(player, useWidgetID, useChildID, onWidgetID, onChildID, useSlot,
                useItemID, onSlot, onItemID)) {
            return true;
        }
        UseWidgetAction.doActionWidgetOnWidget(player, useWidgetID, useChildID, onWidgetID, onChildID, useSlot,
                useItemID, onSlot, onItemID);
        return true;
    }

    private void executeWidgetOnMapObject(Player player, int index, int size, Stream stream) {
        var x = 0;
        var y = 0;
        var id = -1;
        var slot = -1;
        var itemID = -1;
        var widgetHash = -1;
        var moveType = 0;
        if (index == 0) {
            y = stream.getUShortLE128();
            slot = stream.getUShortLE();
            moveType = stream.getUByte128();
            widgetHash = stream.getIntLE();
            x = stream.getUShortLE128();
            id = stream.getUShort();
            itemID = stream.getUShortLE();
        } else if (index == 1) {
            moveType = stream.getUByte();
            x = stream.getUShort();
            id = stream.getUShort128();
            widgetHash = stream.getIntV3();
            itemID = stream.getUShort();
            y = stream.getUShortLE();
        }
        var widgetID = widgetHash >> 16;
        var childID = widgetHash & 65535;
        if (slot == 65535) {
            slot = -1;
        }
        var mapObject = player.getController().getMapObject(id, x, y, player.getClientHeight());
        if (mapObject == null) {
            return;
        }
        if (player.getHeight() != player.getClientHeight()) {
            if (mapObject.getDef().hasOption("open") || mapObject.getDef().hasOption("close")) {
                return;
            }
        }
        var message = "[WidgetOnMapObject] widgetID=" + widgetID + "; childID=" + childID + "; slot=" + slot
                + "; itemID=" + itemID + "; id=" + id + "; x=" + x + "; y=" + y + "; moveType=" + moveType;
        if (player.getRights() == Player.RIGHTS_ADMIN) {
            Logger.println(message);
        }
        if (player.getOptions().getPrintPackets()) {
            player.getGameEncoder().sendMessage(message);
        }
        if (player.isLocked()) {
            return;
        }
        player.clearAllActions(false, true);
        player.getMovement().fullRoute(mapObject, moveType);
        player.putAttribute("packet_decoder_index", index);
        player.putAttribute("packet_decoder_widget_id", widgetID);
        player.putAttribute("packet_decoder_child_id", childID);
        player.putAttribute("packet_decoder_slot", slot);
        player.putAttribute("packet_decoder_object_id", id);
        player.putAttribute("packet_decoder_object_x", x);
        player.putAttribute("packet_decoder_object_y", y);
        if (complete(player)) {
            stop(player);
            return;
        }
        player.putAttribute("packet_decoder", this);
    }

    private boolean completeWidgetOnMapObject(Player player) {
        var widgetID = player.getAttributeInt("packet_decoder_widget_id");
        var childID = player.getAttributeInt("packet_decoder_child_id");
        var slot = player.getAttributeInt("packet_decoder_slot");
        var id = player.getAttributeInt("packet_decoder_object_id");
        var x = player.getAttributeInt("packet_decoder_object_x");
        var y = player.getAttributeInt("packet_decoder_object_y");
        var mapObject = player.getController().getMapObject(id, x, y, player.getClientHeight());
        if (mapObject == null) {
            return true;
        }
        if (!player.getWidgetManager().hasWidget(widgetID)) {
            return true;
        }
        var range = 1;
        if (mapObject.getType() >= 4 && mapObject.getType() <= 8) {
            range = 0;
        }
        var canReach = !player.getMovement().isRouting() && player.withinDistanceC(mapObject, range);
        if (mapObject.getID() == 5249) {
            canReach = player.withinDistanceC(mapObject, range);
        }
        if (player.isLocked()) {
            return false;
        }
        if (!canReach) {
            return false;
        }
        player.getMovement().clear();
        player.setFaceTile(mapObject);
        if (player.getController().widgetOnMapObjectHook(widgetID, childID, slot, mapObject)) {
            return true;
        }
        if (SkillContainer.widgetOnMapObjectHooks(player, widgetID, childID, slot, mapObject)) {
            return true;
        }
        if (player.getFarming().widgetOnMapObjectHook(widgetID, childID, slot, mapObject)) {
            return true;
        }
        if (Runecrafting.widgetOnMapObjectHook(player, widgetID, childID, slot, mapObject)) {
            return true;
        }
        UseWidgetAction.doActionMapObject(player, widgetID, childID, slot, mapObject);
        return true;
    }
}
