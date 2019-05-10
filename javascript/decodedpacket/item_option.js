/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacketItemOption(index) {
    var decodedPacket = new DecodedPacket(index) {
        execute: function(player, stream) {
            var widgetHash = -1;
            var slot = -1;
            var itemID = -1;
            if (decodedPacket.index() == 0) {
                itemID = stream.getUShortLE();
                widgetHash = stream.getIntV2();
                slot = stream.getUShort();
            } else if (decodedPacket.index() == 1) {
                itemID = stream.getUShort128();
                widgetHash = stream.getIntV3();
                slot = stream.getUShortLE128();
            } else if (decodedPacket.index() == 2) {
                widgetHash = stream.getIntLE();
                slot = stream.getUShortLE128();
                itemID = stream.getUShortLE128();
            } else if (decodedPacket.index() == 3) {
                itemID = stream.getUShortLE128();
                widgetHash = stream.getInt();
                slot = stream.getUShortLE128();
            } else if (decodedPacket.index() == 4) {
                widgetHash = stream.getInt();
                slot = stream.getUShort();
                itemID = stream.getUShort();
            } else if (decodedPacket.index() == 10) {
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
            var subIndex = (decodedPacket.index() >= 5) ? (decodedPacket.index() - 5) : decodedPacket.index();
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[ItemOption(" + decodedPacket.index() + "/" + subIndex + ")] widgetID="
                        + widgetID + "; childID=" + childID + "; slot=" + slot + "; itemID=" + itemID;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            if (player.isLocked() || player.getMovement().isViewing()
                    || !player.getWidgetManager().hasWidget(widgetID)) {
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
            DecodedPacketWidget.prototype["widget_" + widgetID](player, subIndex, childID, slot, itemID);
        }
    };
    return decodedPacket;
}

function DecodedPacket87() {
    return new DecodedPacketItemOption(0);
}

function DecodedPacket98() {
    return new DecodedPacketItemOption(1);
}

function DecodedPacket72() {
    return new DecodedPacketItemOption(2);
}

function DecodedPacket7() {
    return new DecodedPacketItemOption(3);
}

function DecodedPacket58() {
    return new DecodedPacketItemOption(4);
}

function DecodedPacket980() {
    return new DecodedPacketItemOption(10);
}
