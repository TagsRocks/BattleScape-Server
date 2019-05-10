/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacketWidget(index) {
    var decodedPacket = new DecodedPacket(index) {
        execute: function(player, stream) {
            var widgetHash = stream.getInt();
            var slot = -1;
            var itemID = -1;
            if (decodedPacket.size() == 8) {
                slot = stream.getUShort();
                itemID = stream.getUShort();
            }
            var widgetID = widgetHash >> 16;
            var childID = widgetHash & 65535;
            if (slot == 65535) {
                slot = -1;
            }
            if (itemID == 65535) {
                itemID = -1;
            }
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[Widget(" + decodedPacket.index() + ")] widgetID=" + widgetID
                        + "; childID=" + childID + "; slot=" + slot + "; itemID=" + itemID;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            if (!player.getWidgetManager().hasWidget(widgetID)) {
                return;
            }
            player.clearIdleTime();
            AchievementDiary.widgetHooks(player, decodedPacket.index(), widgetID, childID, slot, itemID);
            if (player.getController().widgetHook(decodedPacket.index(), widgetID, childID, slot, itemID)) {
                return;
            }
            if (player.getRandomEvent().widgetHook(decodedPacket.index(), widgetID, childID, slot, itemID)) {
                return;
            }
            if (SkillContainer.widgetHooks(player, decodedPacket.index(), widgetID, childID, slot, itemID)) {
                return;
            }
            var scriptName = "widget_" + widgetID;
            if (!DecodedPacketWidget.prototype.hasOwnProperty(scriptName)) {
                return;
            }
            try {
                DecodedPacketWidget.prototype[scriptName](player, decodedPacket.index(), childID, slot, itemID);
            } catch (e) {
                Logger.println("Widget: " + scriptName);
                throw e;
            }
        }
    };
    return decodedPacket;
}

function DecodedPacket68() {
    return new DecodedPacketWidget(0);
}

function DecodedPacket21() {
    return new DecodedPacketWidget(1);
}

function DecodedPacket48() {
    return new DecodedPacketWidget(2);
}

function DecodedPacket19() {
    return new DecodedPacketWidget(3);
}

function DecodedPacket40() {
    return new DecodedPacketWidget(4);
}

function DecodedPacket66() {
    return new DecodedPacketWidget(5);
}

function DecodedPacket85() {
    return new DecodedPacketWidget(6);
}

function DecodedPacket14() {
    return new DecodedPacketWidget(7);
}

function DecodedPacket84() {
    return new DecodedPacketWidget(8);
}

function DecodedPacket0() {
    return new DecodedPacketWidget(9);
}

function DecodedPacket69() {
    return new DecodedPacketWidget(0);
}
