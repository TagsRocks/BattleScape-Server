package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;

public class VoteCommand implements Command {


    @Override
    public void execute(Player player, String message) {
        player.getGameEncoder().sendOpenURL("https://www.battlewild.com/vote");
    }
}
