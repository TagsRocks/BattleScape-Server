package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class ScCommand implements Command {
    @Override
    public String getExample() {
        return "sc hello";
    }

    @Override
    public boolean canUse(Player player) {
        return player.getRights() == Player.RIGHTS_ADMIN || player.getRights() == Player.RIGHTS_MOD;
    }

    @Override
    public void execute(Player player, String message) {
        var msg = message.substring(3);
        var img = "";
        if (player.getRights() > 0 && player.getRights() < 3) {
            img = "<img=" + (player.getRights() - 1) + ">";
        }
        player.getWorld().sendStaffMessage("[<col=00f>Staff</col>] " + img + player.getUsername() + ": " + msg);
    }
}
