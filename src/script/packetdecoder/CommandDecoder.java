package script.packetdecoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.palidino.io.FileManager;
import com.palidino.io.Stream;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.io.PacketDecoder;
import com.palidino.osrs.model.dialogue.Dialogue;
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
            if (commandName.equals("commands")) {
                var examples = new ArrayList<String>();
                for (var entry : commands.entrySet()) {
                    if (!entry.getValue().canUse(player)) {
                        continue;
                    }
                    examples.add(getExample(entry.getKey(), entry.getValue()));
                }
                Dialogue.openScroll(player, "Commands", examples);
                return;
            }
            var message = "";
            if (commandName.contains(" ")) {
                var indexOfSpace = commandName.indexOf(" ");
                message = commandName.substring(indexOfSpace + 1);
                commandName = Utils.formatName(commandName.substring(0, indexOfSpace));
            } else {
                commandName = Utils.formatName(commandName);
            }
            player.clearIdleTime();
            var command = commands.get(commandName);
            if (command == null) {
                player.getGameEncoder().sendMessage("Command not found.");
                return;
            }
            if (!command.canUse(player)) {
                return;
            }
            try {
                command.execute(player, message);
            } catch (Exception e) {
                Logger.error(e);
                player.getGameEncoder().sendMessage(getExample(commandName, command));
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

    private String getExample(String commandName, Command command) {
        return "::" + commandName.toLowerCase() + " " + command.getExample();
    }

    static {
        try {
            var classes = FileManager.getClassScripts("packetdecoder.command");
            for (var className : classes) {
                var classReference = Class.forName(className);
                if (!classReference.getName().endsWith("Command")) {
                    continue;
                }
                var commandName = classReference.getName();
                var lastPeriodIndex = commandName.lastIndexOf(".");
                if (lastPeriodIndex != -1) {
                    commandName = commandName.substring(lastPeriodIndex + 1);
                }
                commandName = commandName.substring(0, commandName.length() - 7).toLowerCase();
                commands.put(commandName, (Command) classReference.newInstance());
            }
        } catch (Exception e) {
            Logger.error(e);
        }
    }
}
