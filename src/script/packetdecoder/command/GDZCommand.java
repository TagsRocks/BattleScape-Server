package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;

public class GDZCommand implements Command {

    @Override
    public boolean canUse(Player player) {
        return !player.getController().inWilderness() && !player.getController().inPvPWorld()
                && player.getController().canTeleport(false);
    }

    @Override
    public void execute(Player player, String message) {
        player.getMagic().standardTeleport(3287, 3884, 0);
        player.getGameEncoder().sendMessage("You teleport to Gdz..");
    }

}
