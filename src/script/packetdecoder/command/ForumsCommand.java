package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;

public class ForumsCommand implements Command {
    @Override
    public void execute(Player player, String message) {
        if (Main.isSpawn()) {
            player.getGameEncoder().sendOpenURL("https://www.battlewild.com/");
        }
    }
}
