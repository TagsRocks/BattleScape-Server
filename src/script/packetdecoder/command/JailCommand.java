package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class JailCommand implements Command {
    @Override
    public String getExample() {
        return "username";
    }

    @Override
    public boolean canUse(Player player) {
        return player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {
        var username = message.substring(5);
        var player2 = player.getWorld().getPlayerByUsername(username);
        if (player2 == null) {
            player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
            return;
        } else if (player2.getController().isInstanced()) {
            player.getGameEncoder().sendMessage(username + " is in an instance located at: " + player.getX() + ", "
                    + player.getY() + ", " + player.getHeight() + ".");
            return;
        }
        player.getMovement().teleport(2772, 2794);
        player.getGameEncoder().sendMessage(username + " has been jailed.");
        player.getWorld().sendStaffMessage(player.getUsername() + " jailed " + player2.getUsername() + ".");

    }
}
