package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.model.player.Player;

class Movement extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            96, 52
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        int y = stream.getUShort128();
        int x = stream.getUShort128();
        int moveType = stream.getUByte128();
        if (player.getGameMode() == 0 || player.isDead()) {
            return;
        } else if (player.getMovement().isViewing()
                || player.getAppearance().getNpcID() == com.palidino.osrs.model.Movement.VIEWING_NPC_ID) {
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
        if (complete(player)) {
            stop(player);
        } else {
            player.putAttribute("decodedpacket", this);
        }
    }

    @Override
    public boolean complete(Player player) {
        int x = player.getAttributeInt("decodedpacket_move_x");
        int y = player.getAttributeInt("decodedpacket_move_y");
        int moveType = player.getAttributeInt("decodedpacket_move_type");
        if (player.isLocked()) {
            return false;
        }
        if (!player.getMovement().isRouting() && player.getX() == x && player.getY() == y) {
            player.getCombat().clear(false);
            return false;
        }
        if (player.getController().movementHook(super.index(), x, y, moveType)) {
            return true;
        }
        player.getMovement().fullRoute(x, y, moveType);
        return true;
    }

    @Override
    public void stop(Player player) {
        player.removeAttribute("decodedpacket_move_x");
        player.removeAttribute("decodedpacket_move_y");
        player.removeAttribute("decodedpacket_move_type");
    }
}
