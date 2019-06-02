package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.npc.NPCDef;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class PnpcCommand implements Command {

    public void execute(Player player, String message) {
        var id = Integer.parseInt(message);
        player.getAppearance().setNpcId(id);
        if (id != -1 && NPCDef.getNPCDef(id) != null) {
            var animations = NPCDef.getNPCDef(id).getStanceAnimations();
            player.getGameEncoder().sendMessage("Anim: " + animations[0]);
        }
    }
}
