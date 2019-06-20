package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;

public class CallistoCommand implements Command {

    @Override
    public boolean canUse(Player player) {
        return Main.isSpawn() && player.inEdgeville() && !player.getController().inPvPWorld()
                && player.getController().canTeleport(false);
    }

    @Override
    public void execute(Player player, String message) {
        player.getMagic().standardTeleport(3269, 3836, 0);
        player.getGameEncoder().sendMessage("You teleport to Callisto..");
    }

}
