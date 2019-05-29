
package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class RandomCommand implements Command {
    @Override
    public String getExample() {
        return "random username";
    }

    @Override
    public boolean canUse(Player player) {
        return player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {
        if (message.length() <= 7) {
            player.getGameEncoder().sendMessage("Please use as ::random username");
            return;
        }
        var username = message.substring(7);
        var player2 = player.getWorld().getPlayerByUsername(username);
        if (player2 == null) {
            player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
            return;
        } else if (player2.getController().isInstanced()) {
            player.getGameEncoder().sendMessage(username + " is in an instance located at: " + player.getX() + ", "
                    + player.getY() + ", " + player.getHeight() + ".");
            return;
        }
        player.getMovement().teleport(3228, 3410);
        player2.getRandomEvent().startRandom(player.getId());
    }
}
