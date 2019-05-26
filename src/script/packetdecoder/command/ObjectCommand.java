package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class ObjectCommand implements Command {
    @Override
    public void execute(Player player, String message) {
        if (!Main.ownerPrivledges(player)) {
            return;
        }
        var values = message.split(" ");
        var id = Integer.parseInt(values[0]);
        var type = Integer.parseInt(values[1]);
        var direction = Integer.parseInt(values[2]);
        var object = new MapObject(id, player, type, direction);
        player.getGameEncoder().sendMapObject(object);
    }
}
