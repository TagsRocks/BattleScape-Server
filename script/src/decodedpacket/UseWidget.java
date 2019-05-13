package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.GameDecoder;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.Entity;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.route.Route;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Runecrafting;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;

class UseWidget extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            86, 55, 23, 81, 2, 44, 92
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        if (super.index() == 0 || super.index() == 1 || super.index() == 2 || super.index() == 3) {
            executeWidgetOnEntity(player, stream);
        } else if (super.index() == 4) {
            executeWidgetOnWidget(player, stream);
        } else if (super.index() == 5 || super.index() == 6) {
            executeWidgetOnMapObject(player, stream);
        }
    }

    @Override
    public boolean complete(Player player) {
        if (super.index() == 0 || super.index() == 1 || super.index() == 2 || super.index() == 3) {
            return completeWidgetOnEntity(player);
        } else if (super.index() == 4) {
            return completeWidgetOnWidget(player);
        } else if (super.index() == 5 || super.index() == 6) {
            return completeWidgetOnMapObject(player);
        }
        return true;
    }

    @Override
    public void stop(Player player) {
        if (super.index() == 0 || super.index() == 1 || super.index() == 2 || super.index() == 3) {
            stopWidgetOnEntity(player);
        } else if (super.index() == 4) {
            stopWidgetOnWidget(player);
        } else if (super.index() == 5 || super.index() == 6) {
            stopWidgetOnMapObject(player);
        }
    }

    void executeWidgetOnEntity(Player player, Stream stream) {
        int widgetHash = -1;
        int slot = -1;
        int itemID = -1;
        int id = -1;
        int moveType = 0;
        if (super.index() == 0) {
            id = stream.getUShortLE128();
            moveType = stream.getUReversedByte();
            widgetHash = stream.getIntLE();
            slot = stream.getUShort128();
        } else if (super.index() == 1) {
            widgetHash = stream.getIntV3();
            moveType = stream.getU128Byte();
            slot = stream.getUShort128();
            id = stream.getUShort();
        } else if (super.index() == 2) {
            itemID = stream.getUShortLE128();
            slot = stream.getUShort();
            id = stream.getUShortLE128();
            moveType = stream.getUReversedByte();
            widgetHash = stream.getInt();
        } else if (super.index() == 3) {
            slot = stream.getUShortLE128();
            moveType = stream.getU128Byte();
            widgetHash = stream.getIntV2();
            id = stream.getUShort();
            itemID = stream.getUShort();
        }
        int widgetID = widgetHash >> 16;
        int childID = widgetHash & 65535;
        if (slot == 65535) {
            slot = -1;
        }
        Entity entity = (super.index() == 0 || super.index() == 2) ? player.getWorld().getNPCByIndex(id)
                : player.getWorld().getPlayerByIndex(id);
        if (entity == null) {
            return;
        }
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message = "[WidgetOnEntity(" + super.index() + ")] widgetID=" + widgetID + "; childID=" + childID
                    + "; itemID=" + itemID + "; slot=" + slot + "; id=" + id + "; moveType=" + moveType + "; entity="
                    + (entity instanceof Player ? ((Player) entity).getUsername() : entity.getID());
            Logger.println(message);
            if (player.getOptions().getPrintPackets()) {
                player.getGameEncoder().sendMessage(message);
            }
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
        player.putAttribute("decodedpacket_interface_id", widgetID);
        player.putAttribute("decodedpacket_child_id", childID);
        player.putAttribute("decodedpacket_slot", slot);
        player.putAttribute(
                (super.index() == 0 || super.index() == 2) ? "decodedpacket_npc_index" : "decodedpacket_player_index",
                id);
        if (complete(player)) {
            stop(player);
        } else {
            player.putAttribute("decodedpacket", this);
        }
    }

    boolean completeWidgetOnEntity(Player player) {
        int widgetID = player.getAttributeInt("decodedpacket_interface_id");
        int childID = player.getAttributeInt("decodedpacket_child_id");
        int slot = player.getAttributeInt("decodedpacket_slot");
        int id = player.getAttributeInt(
                (super.index() == 0 || super.index() == 2) ? "decodedpacket_npc_index" : "decodedpacket_player_index");
        Entity entity = (super.index() == 0 || super.index() == 2) ? player.getWorld().getNPCByIndex(id)
                : player.getWorld().getPlayerByIndex(id);
        if (entity == null || !player.getWidgetManager().hasWidget(widgetID)) {
            return true;
        }
        if (player.isLocked() || !player.withinDistance(entity, 1)) {
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
        String scriptName = "doAction" + ((super.index() == 0 || super.index() == 2) ? "NPC" : "Player");
        // DecodedPacketWidgetOnEntity.prototype[scriptName](player, decodedPacket.index(), widgetID,
        // childID,
        // slot, entity);
        return true;
    }

    void stopWidgetOnEntity(Player player) {
        player.removeAttribute("decodedpacket_interface_id");
        player.removeAttribute("decodedpacket_child_id");
        player.removeAttribute("decodedpacket_slot");
        player.removeAttribute(
                (super.index() == 0 || super.index() == 2) ? "decodedpacket_npc_index" : "decodedpacket_player_index");
    }

    void executeWidgetOnWidget(Player player, Stream stream) {
        int useWidgetHash = stream.getIntV2();
        int onWidgetHash = stream.getInt();
        int onSlot = stream.getUShort();
        int onItemID = stream.getUShortLE();
        int useItemID = stream.getUShortLE();
        int useWidgetID = useWidgetHash >> 16;
        int onWidgetID = onWidgetHash >> 16;
        int useChildID = useWidgetHash & 65535;
        int onChildID = onWidgetHash & 65535;
        int useSlot = -1;
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
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message = "[WidgetOnWidget] useWidgetID=" + useWidgetID + "; useChildID=" + useChildID
                    + "; onWidgetID=" + onWidgetID + "; onChildID=" + onChildID + "; useItemID=" + useItemID
                    + "; onItemID=" + onItemID + "; onSlot=" + onSlot;
            Logger.println(message);
            if (player.getOptions().getPrintPackets()) {
                player.getGameEncoder().sendMessage(message);
            }
        }
        if (player.isLocked()) {
            return;
        }
        player.clearAllActions(false, true);
        player.putAttribute("decodedpacket_use_interface_id", useWidgetID);
        player.putAttribute("decodedpacket_use_child_id", useChildID);
        player.putAttribute("decodedpacket_on_interface_id", onWidgetID);
        player.putAttribute("decodedpacket_on_child_id", onChildID);
        player.putAttribute("decodedpacket_use_item_id", useItemID);
        player.putAttribute("decodedpacket_use_slot", useSlot);
        player.putAttribute("decodedpacket_on_slot", onSlot);
        player.putAttribute("decodedpacket_on_item_id", onItemID);
        if (complete(player)) {
            stop(player);
        } else {
            player.putAttribute("decodedpacket", this);
        }
    }

    boolean completeWidgetOnWidget(Player player) {
        int useWidgetID = player.getAttributeInt("decodedpacket_use_interface_id");
        int useChildID = player.getAttributeInt("decodedpacket_use_child_id");
        int onWidgetID = player.getAttributeInt("decodedpacket_on_interface_id");
        int onChildID = player.getAttributeInt("decodedpacket_on_child_id");
        int useSlot = player.getAttributeInt("decodedpacket_use_slot");
        int useItemID = player.getAttributeInt("decodedpacket_use_item_id");
        int onSlot = player.getAttributeInt("decodedpacket_on_slot");
        int onItemID = player.getAttributeInt("decodedpacket_on_item_id");
        if (!player.getWidgetManager().hasWidget(useWidgetID) || !player.getWidgetManager().hasWidget(onWidgetID)) {
            return true;
        }
        if (player.isLocked() || player.getUseWidgetOnWidgetDelay() > 0) {
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
        // DecodedPacketWidgetOnWidget.prototype["doAction"](player, useWidgetID, useChildID, onWidgetID,
        // onChildID, useSlot, useItemID, onSlot, onItemID);
        return true;
    }

    void stopWidgetOnWidget(Player player) {
        player.removeAttribute("decodedpacket_use_interface_id");
        player.removeAttribute("decodedpacket_use_child_id");
        player.removeAttribute("decodedpacket_on_interface_id");
        player.removeAttribute("decodedpacket_on_child_id");
        player.removeAttribute("decodedpacket_use_slot");
        player.removeAttribute("decodedpacket_use_item_id");
        player.removeAttribute("decodedpacket_on_slot");
        player.removeAttribute("decodedpacket_on_item_id");
    }

    void executeWidgetOnMapObject(Player player, Stream stream) {
        int x = 0;
        int y = 0;
        int id = -1;
        int slot = -1;
        int itemID = -1;
        int widgetHash = -1;
        int moveType = 0;
        if (super.index() == 0) {
            y = stream.getUShortLE128();
            slot = stream.getUShortLE();
            moveType = stream.getUByte128();
            widgetHash = stream.getIntLE();
            x = stream.getUShortLE128();
            id = stream.getUShort();
            itemID = stream.getUShortLE();
        } else if (super.index() == 1) {
            moveType = stream.getUByte();
            x = stream.getUShort();
            id = stream.getUShort128();
            widgetHash = stream.getIntV3();
            itemID = stream.getUShort();
            y = stream.getUShortLE();
        }
        int widgetID = widgetHash >> 16;
        int childID = widgetHash & 65535;
        if (slot == 65535) {
            slot = -1;
        }
        MapObject mapObject = player.getController().getMapObject(id, x, y, player.getClientHeight());
        if (mapObject == null) {
            return;
        }
        if (player.getHeight() != player.getClientHeight()) {
            if (mapObject.getDef().hasOption("open") || mapObject.getDef().hasOption("close")) {
                return;
            }
        }
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message = "[WidgetOnMapObject] widgetID=" + widgetID + "; childID=" + childID + "; slot=" + slot
                    + "; itemID=" + itemID + "; id=" + id + "; x=" + x + "; y=" + y + "; moveType=" + moveType;
            Logger.println(message);
            if (player.getOptions().getPrintPackets()) {
                player.getGameEncoder().sendMessage(message);
            }
        }
        if (player.isLocked()) {
            return;
        }
        player.clearAllActions(false, true);
        player.getMovement().fullRoute(mapObject, moveType);
        player.putAttribute("decodedpacket_interface_id", widgetID);
        player.putAttribute("decodedpacket_child_id", childID);
        player.putAttribute("decodedpacket_slot", slot);
        player.putAttribute("decodedpacket_object_id", id);
        player.putAttribute("decodedpacket_object_x", x);
        player.putAttribute("decodedpacket_object_y", y);
        if (complete(player)) {
            stop(player);
        } else {
            player.putAttribute("decodedpacket", this);
        }
    }

    boolean completeWidgetOnMapObject(Player player) {
        int widgetID = player.getAttributeInt("decodedpacket_interface_id");
        int childID = player.getAttributeInt("decodedpacket_child_id");
        int slot = player.getAttributeInt("decodedpacket_slot");
        int id = player.getAttributeInt("decodedpacket_object_id");
        int x = player.getAttributeInt("decodedpacket_object_x");
        int y = player.getAttributeInt("decodedpacket_object_y");
        MapObject mapObject = player.getController().getMapObject(id, x, y, player.getClientHeight());
        if (mapObject == null || !player.getWidgetManager().hasWidget(widgetID)) {
            return true;
        }
        int range = 1;
        if (mapObject.getType() >= 4 && mapObject.getType() <= 8) {
            range = 0;
        }
        boolean canReach = !player.getMovement().isRouting() && player.withinDistanceC(mapObject, range);
        if (mapObject.getID() == 5249) {
            canReach = player.withinDistanceC(mapObject, range);
        }
        if (player.isLocked() || !canReach) {
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
        // DecodedPacketWidgetOnMapObject.prototype["doAction"](player, widgetID, childID, slot, mapObject);
        return true;
    }

    void stopWidgetOnMapObject(Player player) {
        player.removeAttribute("decodedpacket_interface_id");
        player.removeAttribute("decodedpacket_child_id");
        player.removeAttribute("decodedpacket_slot");
        player.removeAttribute("decodedpacket_object_id");
        player.removeAttribute("decodedpacket_object_x");
        player.removeAttribute("decodedpacket_object_y");
    }
}
