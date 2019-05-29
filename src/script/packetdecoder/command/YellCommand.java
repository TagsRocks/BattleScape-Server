package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class YellCommand implements Command {
    @Override
    public String getExample() {
        return "message you want to Yell.";
    }

    @Override
    public boolean canUse(Player player) {
        return player.getRights() > 0;
    }

    @Override
    public void execute(Player player, String message) {
        var msg = message.substring(3);
        var img = "";
        if (player.getRights() > 0 && player.getRights() < 3) {
            img = "<img=" + (player.getRights() - 1) + ">";
        }
        player.getWorld().sendStaffMessage("[<col=ff0000>Yell</col>] " + img + player.getUsername() + ": " + msg);
    }
}
