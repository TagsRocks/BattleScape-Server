package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.GameDecoder;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;

class ItemOption extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            87, 98, 72, 7, 58
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        int widgetHash = -1;
        int slot = -1;
        int itemID = -1;
        if (super.index() == 0) {
            itemID = stream.getUShortLE();
            widgetHash = stream.getIntV2();
            slot = stream.getUShort();
        } else if (super.index() == 1) {
            itemID = stream.getUShort128();
            widgetHash = stream.getIntV3();
            slot = stream.getUShortLE128();
        } else if (super.index() == 2) {
            widgetHash = stream.getIntLE();
            slot = stream.getUShortLE128();
            itemID = stream.getUShortLE128();
        } else if (super.index() == 3) {
            itemID = stream.getUShortLE128();
            widgetHash = stream.getInt();
            slot = stream.getUShortLE128();
        } else if (super.index() == 4) {
            widgetHash = stream.getInt();
            slot = stream.getUShort();
            itemID = stream.getUShort();
        } else if (super.index() == 10) {
            itemID = stream.getUShortLE128();
            widgetHash = stream.getIntV3();
            slot = stream.getUShortLE();
        }
        int widgetID = widgetHash >> 16;
        int childID = widgetHash & 65535;
        if (slot == 65535) {
            slot = -1;
        }
        if (itemID == 65535) {
            itemID = -1;
        }
        int subIndex = (super.index() >= 5) ? (super.index() - 5) : super.index();
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message = "[ItemOption(" + super.index() + "/" + subIndex + ")] widgetID=" + widgetID + "; childID="
                    + childID + "; slot=" + slot + "; itemID=" + itemID;
            Logger.println(message);
            if (player.getOptions().getPrintPackets()) {
                player.getGameEncoder().sendMessage(message);
            }
        }
        if (player.isLocked() || player.getMovement().isViewing() || !player.getWidgetManager().hasWidget(widgetID)) {
            return;
        }
        player.clearIdleTime();
        AchievementDiary.widgetHooks(player, subIndex, widgetID, childID, slot, itemID);
        if (player.getController().widgetHook(subIndex, widgetID, childID, slot, itemID)) {
            return;
        }
        if (SkillContainer.widgetHooks(player, subIndex, widgetID, childID, slot, itemID)) {
            return;
        }
        // DecodedPacketWidget.prototype["widget_" + widgetID](player, subIndex, childID, slot, itemID);
    }
}
