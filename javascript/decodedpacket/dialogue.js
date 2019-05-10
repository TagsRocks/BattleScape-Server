/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacket70() {
    var decodedPacket = new DecodedPacket() {
        execute: function(player, stream) {
            var widgetHash = stream.getIntV3();
            var slot = stream.getUShort128();
            var widgetID = widgetHash >> 16;
            var childID = widgetHash & 65535;
            if (slot == 65535) {
                slot = -1;
            }
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[Dialogue] widgetID=" + widgetID + "; childID=" + childID + "; slot=" + slot;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            if (!player.getWidgetManager().hasWidget(widgetID)) {
                return;
            }
            player.clearIdleTime();
            AchievementDiary.widgetHooks(player, decodedPacket.index(), widgetID, childID, slot, -1);
            if (player.getController().widgetHook(decodedPacket.index(), widgetID, childID, slot, -1)) {
                return;
            }
            if (SkillContainer.widgetHooks(player, decodedPacket.index(), widgetID, childID, slot, -1)) {
                return;
            }
            var scriptName = "widget_" + widgetID;
            if (!DecodedPacketWidget.prototype.hasOwnProperty(scriptName)) {
                return;
            }
            try {
                DecodedPacketWidget.prototype[scriptName](player, decodedPacket.index(), childID, slot, -1);
            } catch (e) {
                Logger.println("Widget: " + scriptName);
                throw e;
            }
        }
    };
    return decodedPacket;
}
