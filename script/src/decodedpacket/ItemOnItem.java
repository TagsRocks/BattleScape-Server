package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.GameDecoder;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;

class ItemOnItem extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            63
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        int useWidgetHash = stream.getIntV2();
        int onWidgetHash = stream.getIntV3();
        int useSlot = stream.getUShortLE128();
        int useItemID = stream.getUShortLE();
        int onSlot = stream.getUShortLE();
        int onItemID = stream.getUShortLE128();
        int useWidgetID = useWidgetHash >> 16;
        int useChildID = useWidgetHash & 65535;
        int onWidgetID = onWidgetHash >> 16;
        int onChildID = onWidgetHash & 65535;
        if (useSlot == 65535) {
            useSlot = -1;
        }
        if (onSlot == 65535) {
            onSlot = -1;
        }
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message = "[ItemOnItem] useWidgetID=" + useWidgetID + "; useChildID=" + useChildID + "; onWidgetID="
                    + onWidgetID + "; onChildID=" + onChildID + "; useSlot=" + useSlot + "; onSlot=" + onSlot
                    + "; useItemID=" + useItemID + "; onItemID=" + onItemID;
            Logger.println(message);
            if (player.getOptions().getPrintPackets()) {
                player.getGameEncoder().sendMessage(message);
            }
        }
        if (player.isLocked() || player.getMovement().isViewing() || !player.getWidgetManager().hasWidget(useWidgetID)
                || !player.getWidgetManager().hasWidget(onWidgetID)) {
            return;
        }
        player.clearIdleTime();
        if (player.getController().itemOnItemHook(useWidgetID, useChildID, onWidgetID, onChildID, useSlot, onSlot,
                useItemID, onItemID)) {
            return;
        }
        if (SkillContainer.widgetOnWidgetHooks(player, useWidgetID, useChildID, onWidgetID, onChildID, useSlot,
                useItemID, onSlot, onItemID)) {
            return;
        }
        // DecodedPacketItemOnItem.prototype["doAction"](player, useWidgetID, useChildID, onWidgetID,
        // onChildID,
        // useSlot, onSlot, useItemID, onItemID);
    }
}
