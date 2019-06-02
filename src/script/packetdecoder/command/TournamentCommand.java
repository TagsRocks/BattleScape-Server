package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;

public class TournamentCommand implements Command {
    @Override
    public boolean canUse(Player player) {
        return Main.isSpawn() && !player.getController().inWilderness() && !player.getController().inPvPWorld()
                && player.getController().canTeleport(false) && !player.inJail();
    }

    @Override
    public void execute(Player player, String message) {
        player.getMagic().standardTeleport(3085, 3485, 0);
        player.getGameEncoder().sendMessage("You teleport to the Tournament..");
    }
}
