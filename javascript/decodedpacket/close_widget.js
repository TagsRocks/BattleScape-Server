/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacket20() {
    var decodedPacket = new DecodedPacket() {
        execute: function(player, stream) {
            player.clearIdleTime();
            player.getWidgetManager().removeInteractiveWidgets();
        }
    };
    return decodedPacket;
}
