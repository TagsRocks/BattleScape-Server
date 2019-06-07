package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import lombok.var;

/*
 * Freely edit this to quickly test features. For commands that need more than a single use/test,
 * consider a proper command for it.
 */
@SuppressWarnings("all")
public class TestCommand implements Command {
    @Override
    public boolean canUse(Player player) {
        return player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {}
}
