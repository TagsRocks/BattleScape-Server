package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.GameDecoder;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;

class Widget extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            68, 21, 48, 19, 40, 66, 85, 14, 84, 0, 69
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        int widgetHash = stream.getInt();
        int slot = -1;
        int itemID = -1;
        if (super.size() == 8) {
            slot = stream.getUShort();
            itemID = stream.getUShort();
        }
        int widgetID = widgetHash >> 16;
        int childID = widgetHash & 65535;
        if (slot == 65535) {
            slot = -1;
        }
        if (itemID == 65535) {
            itemID = -1;
        }
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message = "[Widget(" + super.index() + ")] widgetID=" + widgetID + "; childID=" + childID + "; slot="
                    + slot + "; itemID=" + itemID;
            Logger.println(message);
            if (player.getOptions().getPrintPackets()) {
                player.getGameEncoder().sendMessage(message);
            }
        }
        if (!player.getWidgetManager().hasWidget(widgetID)) {
            return;
        }
        int subIndex = super.index();
        if (subIndex == 10) {
            subIndex = 0;
        }
        player.clearIdleTime();
        AchievementDiary.widgetHooks(player, subIndex, widgetID, childID, slot, itemID);
        if (player.getController().widgetHook(subIndex, widgetID, childID, slot, itemID)) {
            return;
        }
        if (player.getRandomEvent().widgetHook(subIndex, widgetID, childID, slot, itemID)) {
            return;
        }
        if (SkillContainer.widgetHooks(player, subIndex, widgetID, childID, slot, itemID)) {
            return;
        }
        @SuppressWarnings("unused")
        String scriptName = "widget_" + widgetID;
        /*
         * if (!DecodedPacketWidget.prototype.hasOwnProperty(scriptName)) { return; } try {
         * DecodedPacketWidget.prototype[scriptName](player, subIndex, childID, slot, itemID); } catch (e) {
         * Logger.println("Widget: " + scriptName); throw e; }
         */
    }
}
