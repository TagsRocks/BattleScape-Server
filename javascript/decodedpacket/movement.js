/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacketMovement(index) {
    var decodedPacket = new DecodedPacket(index) {
        execute: function(player, stream) {
            var y = stream.getUShort128();
            var x = stream.getUShort128();
            var moveType = stream.getUByte128();
            if (player.getGameMode() == 0 || player.isDead()) {
                return;
            } else if (player.getMovement().isViewing()
                    || player.getAppearance().getNpcID() == Movement.VIEWING_NPC_ID) {
                if (!player.getMovement().getTeleporting() && !player.getMovement().getTeleported()) {
                    player.getMovement().stopViewing();
                    player.getWidgetManager().removeInteractiveWidgets();
                }
                return;
            }
            player.clearIdleTime();
            player.putAttribute("decodedpacket_move_x", x);
            player.putAttribute("decodedpacket_move_y", y);
            player.putAttribute("decodedpacket_move_type", moveType);
            if (decodedPacket.complete(player)) {
                decodedPacket.stop(player);
            } else {
                player.putAttribute("decodedpacket", decodedPacket);
            }
        },

        complete: function(player) {
            var x = player.getAttributeInt("decodedpacket_move_x");
            var y = player.getAttributeInt("decodedpacket_move_y");
            var moveType = player.getAttributeInt("decodedpacket_move_type");
            if (player.isLocked()) {
                return false;
            }
            if (!player.getMovement().isRouting() && player.getX() == x && player.getY() == y) {
                player.getCombat().clear(false);
                return false;
            }
            if (player.getController().movementHook(decodedPacket.index(), x, y, moveType)) {
                return;
            }
            player.getMovement().fullRoute(x, y, moveType);
            return true;
        },

        stop: function(player) {
            player.removeAttribute("decodedpacket_move_x");
            player.removeAttribute("decodedpacket_move_y");
            player.removeAttribute("decodedpacket_move_type");
        }
    };
    return decodedPacket;
}

function DecodedPacket96() {
    return new DecodedPacketMovement(0);
}

function DecodedPacket52() {
    return new DecodedPacketMovement(1);
}
