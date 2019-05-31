package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class BroadcastCommand implements Command {
    @Override
    public String getExample() {
        return "message";
    }

    @Override
    public boolean canUse(Player player) {
        return player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {
        var img = "";
        if (player.getRights() > 0 && player.getRights() < 3) {
            img = "<img=" + (player.getRights() - 1) + ">";
        }
        player.getWorld().sendBroadcast(img + player.getUsername() + ": " + message);
    }
}
