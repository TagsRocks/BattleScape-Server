package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class SCCommand implements Command {
    @Override
    public String getExample() {
        return "message to staff";
    }

    @Override
    public boolean canUse(Player player) {
        return player.getRights() == Player.RIGHTS_ADMIN || player.getRights() == Player.RIGHTS_MOD;
    }

    @Override
    public void execute(Player player, String message) {
        var msg = message.substring(3);
        player.getWorld().sendStaffMessage(
                "[<col=00f>Staff</col>] " + player.getMessaging().getIconImage() + player.getUsername() + ": " + msg);
    }
}
