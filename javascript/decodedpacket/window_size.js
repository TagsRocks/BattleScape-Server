/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacket35() {
    var decodedPacket = new DecodedPacket() {
        execute: function(player, stream) {
            var viewportType = WidgetManager.ViewportType.get(stream.getUByte());
            var width = stream.getUShort();
            var height = stream.getUShort();
            var currentViewportType = player.getWidgetManager().getViewportType();
            if (viewportType == null || viewportType == currentViewportType) {
                return;
            }
            player.clearIdleTime();
            player.getWidgetManager().setViewportType(viewportType);
            player.getWidgetManager().sendGameViewport();
        }
    };
    return decodedPacket;
}
