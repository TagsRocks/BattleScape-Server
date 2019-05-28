package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class WidgetCommand implements Command {
    @Override
    public String getExample() {
        return "id";
    }

    @Override
    public boolean canUse(Player player) {
        return Main.ownerPrivledges(player);
    }

    @Override
    public void execute(Player player, String message) {
        var id = Integer.parseInt(message);
        player.getWidgetManager().sendInteractiveOverlay(id);
    }
}