package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.GameDecoder;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;

class Dialogue extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            39
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        int widgetHash = stream.getIntV3();
        int slot = stream.getUShort128();
        int widgetID = widgetHash >> 16;
        int childID = widgetHash & 65535;
        if (slot == 65535) {
            slot = -1;
        }
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message = "[Dialogue] widgetID=" + widgetID + "; childID=" + childID + "; slot=" + slot;
            Logger.println(message);
            if (player.getOptions().getPrintPackets()) {
                player.getGameEncoder().sendMessage(message);
            }
        }
        if (!player.getWidgetManager().hasWidget(widgetID)) {
            return;
        }
        player.clearIdleTime();
        AchievementDiary.widgetHooks(player, super.index(), widgetID, childID, slot, -1);
        if (player.getController().widgetHook(super.index(), widgetID, childID, slot, -1)) {
            return;
        }
        if (SkillContainer.widgetHooks(player, super.index(), widgetID, childID, slot, -1)) {
            return;
        }
        String scriptName = "widget_" + widgetID;
        /*
         * if (!DecodedPacketWidget.prototype.hasOwnProperty(scriptName)) { return; } try {
         * DecodedPacketWidget.prototype[scriptName](player, decodedPacket.index(), childID, slot, -1); }
         * catch (Exception e) { Logger.println("Widget: " + scriptName); throw e; }
         */
    }
}
