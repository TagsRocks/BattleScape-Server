package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.Movement;
import com.palidino.osrs.model.player.Player;

public class InvisibleCommand implements Command {
    @Override
    public boolean canUse(Player player) {
        return Main.ownerPrivledges(player) || Main.isSpawn();
    }

    @Override
    public void execute(Player player, String message) {
        if (player.getAppearance().getNpcId() == Movement.VIEWING_NPC_ID) {
            player.getAppearance().setNpcId(-1);
        } else {
            player.getAppearance().setNpcId(Movement.VIEWING_NPC_ID);
        }
    }
}
