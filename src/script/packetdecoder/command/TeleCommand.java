package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class TeleCommand implements Command {
    @Override
    public void execute(Player player, String message) {
        if (!Main.ownerPrivledges(player)) {
            return;
        }
        var values = message.split(" ");
        if (values.length == 1) {
            var id = Integer.parseInt(values[0]);
            player.getMovement().teleport(Tile.getAbsRegionX(id) + 32, Tile.getAbsRegionY(id) + 32);
            return;
        }
        var x = Integer.parseInt(values[0]);
        var y = Integer.parseInt(values[1]);
        var z = 0;
        if (values.length == 3) {
            z = Integer.parseInt(values[2]);
        }
        player.getMovement().teleport(x, y, z);
    }
}
