package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;

public class LavasCommand implements Command {

    @Override
    public boolean canUse(Player player) {
        return !player.getController().inWilderness() && !player.getController().inPvPWorld()
                && player.getController().canTeleport(false);
    }

    @Override
    public void execute(Player player, String message) {
        player.getMovement().teleport(3201, 3858);
        player.getGameEncoder().sendMessage("You teleport to Lava dragons..");
    }

}
