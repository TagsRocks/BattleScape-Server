/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacket12() {
    var decodedPacket = new DecodedPacket() {
        execute: function(player, stream) {
            var gender = stream.getUByte();
            if (gender > 1) {
                return;
            }
            var styles = [];
            for (var i = 0; i < 7; i++) {
                var id = stream.getUByte();
                if (gender == 1 && i == 1) {
                    styles.push(-1);
                    continue;
                }
                if (!IdentityKit.isValidStyle(id, i, gender)) {
                    return;
                }
                styles[i] = id;
            }
            var colors = [];
            for (var i = 0; i < 5; i++) {
                var id = stream.getUByte();
                if (id >= IdentityKit.COLORS[i].length) {
                    colors.push(0);
                    continue;
                }
                colors.push(id);
            }
            player.clearIdleTime();
            player.getAppearance().setGender(gender);
            player.getAppearance().setStyles(styles);
            player.getAppearance().setColors(colors);
            player.getAppearance().setUpdate(true);
            player.getWidgetManager().removeInteractiveOverlay();
        }
    };
    return decodedPacket;
}
