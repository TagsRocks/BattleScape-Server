/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacketRotateItems(index) {
    var decodedPacket = new DecodedPacket(index) {
        execute: function(player, stream) {
            var fromWidgetHash = -1;
            var fromSlot = 0;
            var fromItemID = -1;
            var toWidgetHash = -1;
            var toSlot = 0;
            var toItemID = -1;
            if (decodedPacket.index() == 0) {
                fromSlot = stream.getUShort128();
                fromItemID = stream.getUShort128();
                toSlot = stream.getUShort();
                fromWidgetHash = stream.getIntLE();
                toWidgetHash = stream.getIntV2();
                toItemID = stream.getUShort();
            } else if (decodedPacket.index() == 1) {
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
            if (fromInterfaceID != -1 && !player.getWidgetManager().hasWidget(fromInterfaceID)
                    || toInterfaceID != -1 && !player.getWidgetManager().hasWidget(toInterfaceID)
                    || player.isLocked()) {
                return;
            }
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[RotateItems(" + decodedPacket.index() + ")] fromInterfaceID=" + fromInterfaceID
                        + "; fromChildID=" + fromChildID + "; toInterfaceID=" + toInterfaceID
                        + "; toChildID=" + toChildID + "; fromSlot=" + fromSlot + "; toSlot=" + toSlot
                        + "; fromItemID=" + fromItemID + "; toItemID=" + toItemID;
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
    };
    return decodedPacket;
}

function DecodedPacket57() {
    return new DecodedPacketRotateItems(0);
}

function DecodedPacket80() {
    return new DecodedPacketRotateItems(1);
}
