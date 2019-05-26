package script.packetdecoder;

import java.util.HashMap;
import java.util.Map;
import com.palidino.io.Stream;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.io.PacketDecoder;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Logger;
import com.palidino.util.Utils;
import lombok.var;

public class CommandDecoder extends PacketDecoder {
    private static Map<String, Command> commands = new HashMap<>();

    public CommandDecoder() {
        super(60, 45);
    }

    @Override
    public void execute(Player player, int index, int size, Stream stream) {
        if (index == 0) {
            var commandName = stream.getString();
            var message = "";
            if (commandName.contains(" ")) {
                var indexOfSpace = commandName.indexOf(" ");
                message = commandName.substring(indexOfSpace + 1);
                commandName = Utils.formatName(commandName.substring(0, indexOfSpace));
            } else {
                commandName = Utils.formatName(commandName);
            }
            player.clearIdleTime();
            try {
                if (!commands.containsKey(commandName)) {
                    var className = "script.packetdecoder.command." + commandName + "Command";
                    commands.put(commandName, (Command) Class.forName(className).newInstance());
                }
                if (commands.containsKey(commandName)) {
                    commands.get(commandName).execute(player, message);
                }
            } catch (ClassNotFoundException cnfe) {
            } catch (Exception e) {
                Logger.error(e);
            }
        } else if (index == 1) {
            var tileHash = stream.getIntV2();
            player.clearIdleTime();
            if (player.getRights() != 2) {
                return;
            }
            var x = tileHash >> 14 & 16383;
            var y = tileHash & 16383;
            var z = tileHash >> 28 & 3;
            player.getMovement().teleport(x, y, z);
        }
    }
}
