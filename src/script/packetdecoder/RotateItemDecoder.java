package script.packetdecoder;

import com.palidino.io.Stream;
import com.palidino.osrs.io.PacketDecoder;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Logger;
import lombok.var;

public class RotateItemDecoder extends PacketDecoder {
    public RotateItemDecoder() {
        super(57, 80);
    }

    @Override
    public void execute(Player player, int index, int size, Stream stream) {
        var fromWidgetHash = -1;
        var fromSlot = 0;
        var fromItemID = -1;
        var toWidgetHash = -1;
        var toSlot = 0;
        var toItemID = -1;
        if (index == 0) {
            fromSlot = stream.getUShort128();
            fromItemID = stream.getUShort128();
            toSlot = stream.getUShort();
            fromWidgetHash = stream.getIntLE();
            toWidgetHash = stream.getIntV2();
            toItemID = stream.getUShort();
        } else if (index == 1) {
            toSlot = stream.getUShort();
            fromSlot = stream.getUShortLE();
            fromWidgetHash = toWidgetHash = stream.getInt();
            stream.getUReversedByte();
        }
        if (fromItemID == 65535) {
            fromItemID = -1;
        }
        if (toItemID == 65535) {
            toItemID = -1;
        }
        var fromInterfaceID = fromWidgetHash >> 16;
        var fromChildID = fromWidgetHash & 65535;
        var toInterfaceID = toWidgetHash >> 16;
        var toChildID = toWidgetHash & 65535;
        if (player.isLocked()) {
            return;
        }
        if (fromInterfaceID != -1 && !player.getWidgetManager().hasWidget(fromInterfaceID)) {
            return;
        }
        if (toInterfaceID != -1 && !player.getWidgetManager().hasWidget(toInterfaceID)) {
            return;
        }
        var message = "[RotateItems(" + index + ")] fromInterfaceID=" + fromInterfaceID + "; fromChildID=" + fromChildID
                + "; toInterfaceID=" + toInterfaceID + "; toChildID=" + toChildID + "; fromSlot=" + fromSlot
                + "; toSlot=" + toSlot + "; fromItemID=" + fromItemID + "; toItemID=" + toItemID;
        if (player.getRights() == Player.RIGHTS_ADMIN) {
            Logger.println(message);
        }
        if (player.getOptions().getPrintPackets()) {
            player.getGameEncoder().sendMessage(message);
        }
        player.clearIdleTime();
        if (fromInterfaceID == WidgetID.INVENTORY && toInterfaceID == WidgetID.INVENTORY
                || fromInterfaceID == WidgetID.BANK_INVENTORY && toInterfaceID == WidgetID.BANK_INVENTORY
                || fromInterfaceID == WidgetID.EQUIPMENT_BONUSES_INVENTORY
                        && toInterfaceID == WidgetID.EQUIPMENT_BONUSES_INVENTORY) {
            player.getInventory().rotateItems(fromSlot, toSlot);
        } else if (fromInterfaceID == WidgetID.BANK && toInterfaceID == WidgetID.BANK) {
            if (fromChildID == 13 && toChildID == 11) {
                player.getBank().moveItemToTab(toItemID, -1, fromSlot, toSlot - 10);
            } else if (fromChildID == 13 && toChildID == 13) {
                player.getBank().rotateItems(fromItemID, -1, player.getBank().getRealSlot(fromSlot),
                        player.getBank().getRealSlot(toSlot));
            } else if (fromChildID == 11 && toChildID == 11) {
                if (toSlot - 10 == 0) {
                    player.getBank().collapseTab(fromSlot - 10, toSlot - 10);
                } else {
                    player.getBank().rotateTabs(fromSlot - 10, toSlot - 10);
                }
            }
        }
    }
}
