package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;

public class ScCommand implements Command {
    @Override
    public String getExample() {
        return "message to staff only";
    }

    @Override
    public boolean canUse(Player player) {
        return player.getRights() == Player.RIGHTS_MOD || player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {
        player.getWorld().sendStaffMessage("[<col=0000FF>Staff</col>] " + player.getMessaging().getIconImage()
                + player.getUsername() + ": " + message);
    }
}
