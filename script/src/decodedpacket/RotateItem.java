package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.GameDecoder;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Logger;

class RotateItem extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            57, 80
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        int fromWidgetHash = -1;
        int fromSlot = 0;
        int fromItemID = -1;
        int toWidgetHash = -1;
        int toSlot = 0;
        int toItemID = -1;
        if (super.index() == 0) {
            fromSlot = stream.getUShort128();
            fromItemID = stream.getUShort128();
            toSlot = stream.getUShort();
            fromWidgetHash = stream.getIntLE();
            toWidgetHash = stream.getIntV2();
            toItemID = stream.getUShort();
        } else if (super.index() == 1) {
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
        int fromInterfaceID = fromWidgetHash >> 16;
        int fromChildID = fromWidgetHash & 65535;
        int toInterfaceID = toWidgetHash >> 16;
        int toChildID = toWidgetHash & 65535;
        if (fromInterfaceID != -1 && !player.getWidgetManager().hasWidget(fromInterfaceID)
                || toInterfaceID != -1 && !player.getWidgetManager().hasWidget(toInterfaceID) || player.isLocked()) {
            return;
        }
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message = "[RotateItems(" + super.index() + ")] fromInterfaceID=" + fromInterfaceID
                    + "; fromChildID=" + fromChildID + "; toInterfaceID=" + toInterfaceID + "; toChildID=" + toChildID
                    + "; fromSlot=" + fromSlot + "; toSlot=" + toSlot + "; fromItemID=" + fromItemID + "; toItemID="
                    + toItemID;
            Logger.println(message);
            if (player.getOptions().getPrintPackets()) {
                player.getGameEncoder().sendMessage(message);
            }
        }
        player.clearIdleTime();
        if (fromInterfaceID == WidgetID.INVENTORY && toInterfaceID == WidgetID.INVENTORY
                || fromInterfaceID == WidgetID.BANK_INVENTORY && toInterfaceID == WidgetID.BANK_INVENTORY
                || fromInterfaceID == WidgetID.EQUIPMENT_BONUSES_INVENTORY
                        && toInterfaceID == WidgetID.EQUIPMENT_BONUSES_INVENTORY) {
            player.getInventory().rotateItems(fromSlot, toSlot);
        } else if (fromInterfaceID == WidgetID.BANK && toInterfaceID == WidgetID.BANK) {
            if (fromChildID == 13 && toChildID == 11) {
                player.getBank().moveItemToTab(toItemID, -1, fromSlot, (toSlot - 10));
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
