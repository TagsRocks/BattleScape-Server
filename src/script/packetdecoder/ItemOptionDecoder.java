package script.packetdecoder;

import com.palidino.io.Stream;
import com.palidino.osrs.io.PacketDecoder;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;
import lombok.var;

public class ItemOptionDecoder extends PacketDecoder {
    public ItemOptionDecoder() {
        super(87, 98, 72, 7, 58);
    }

    @Override
    public void execute(Player player, int index, int size, Stream stream) {
        var widgetHash = -1;
        var slot = -1;
        var itemID = -1;
        if (index == 0) {
            itemID = stream.getUShortLE();
            widgetHash = stream.getIntV2();
            slot = stream.getUShort();
        } else if (index == 1) {
            itemID = stream.getUShort128();
            widgetHash = stream.getIntV3();
            slot = stream.getUShortLE128();
        } else if (index == 2) {
            widgetHash = stream.getIntLE();
            slot = stream.getUShortLE128();
            itemID = stream.getUShortLE128();
        } else if (index == 3) {
            itemID = stream.getUShortLE128();
            widgetHash = stream.getInt();
            slot = stream.getUShortLE128();
        } else if (index == 4) {
            widgetHash = stream.getInt();
            slot = stream.getUShort();
            itemID = stream.getUShort();
        } else if (index == 10) {
            itemID = stream.getUShortLE128();
            widgetHash = stream.getIntV3();
            slot = stream.getUShortLE();
        }
        var widgetID = widgetHash >> 16;
        var childID = widgetHash & 65535;
        if (slot == 65535) {
            slot = -1;
        }
        if (itemID == 65535) {
            itemID = -1;
        }
        var message = "[ItemOption(" + index + ")] widgetID=" + widgetID + "; childID=" + childID + "; slot=" + slot
                + "; itemID=" + itemID;
        if (player.getRights() == Player.RIGHTS_ADMIN) {
            Logger.println(message);
        }
        if (player.getOptions().getPrintPackets()) {
            player.getGameEncoder().sendMessage(message);
        }
        if (player.isLocked()) {
            return;
        }
        if (player.getMovement().isViewing()) {
            return;
        }
        if (!player.getWidgetManager().hasWidget(widgetID)) {
            return;
        }
        index = index >= 5 ? index - 5 : index;
        player.clearIdleTime();
        AchievementDiary.widgetHooks(player, index, widgetID, childID, slot, itemID);
        if (player.getController().widgetHook(index, widgetID, childID, slot, itemID)) {
            return;
        }
        if (SkillContainer.widgetHooks(player, index, widgetID, childID, slot, itemID)) {
            return;
        }
        WidgetDecoder.executeAction(player, index, widgetID, childID, slot, itemID);
    }
}
