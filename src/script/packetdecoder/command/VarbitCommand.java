package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class VarbitCommand implements Command {
    @Override
    public String getExample() {
        return "id value";
    }

    @Override
    public boolean canUse(Player player) {
        return Main.ownerPrivledges(player);
    }

    @Override
    public void execute(Player player, String message) {
        var values = message.split(" ");
        var id = Integer.parseInt(values[0]);
        var value = Integer.parseInt(values[1]);
        player.getGameEncoder().setVarbit(id, value);
    }
}
