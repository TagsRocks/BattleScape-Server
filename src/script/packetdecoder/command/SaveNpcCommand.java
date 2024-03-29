package script.packetdecoder.command;

import java.util.ArrayList;
import com.palidino.io.FileManager;
import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.io.cache.NpcId;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Utils;
import lombok.var;

public class SaveNpcCommand implements Command {
    @Override
    public String getExample() {
        return "id (distance) (direction)";
    }

    @Override
    public boolean canUse(Player player) {
        return Main.isLocal();
    }

    @Override
    public void execute(Player player, String message) {
        var values = message.split(" ");
        var id = -1;
        if (values[0].matches("[0-9]+")) {
            id = Integer.parseInt(values[0]);
        } else {
            id = NpcId.valueOf(values[0].toUpperCase());
        }
        var distance = 0;
        if (values.length > 2) {
            distance = Integer.parseInt(values[1]);
        }
        var direction = Tile.SOUTH;
        if (values.length > 3) {
            var dirString = values[2];
            if (dirString.equals("north")) {
                direction = Tile.NORTH;
            } else if (dirString.equals("south")) {
                direction = Tile.SOUTH;
            } else if (dirString.equals("east")) {
                direction = Tile.EAST;
            } else if (dirString.equals("west")) {
                direction = Tile.WEST;
            } else if (dirString.equals("north-east")) {
                direction = Tile.NORTH_EAST;
            } else if (dirString.equals("north-west")) {
                direction = Tile.NORTH_WEST;
            } else if (dirString.equals("south-east")) {
                direction = Tile.SOUTH_EAST;
            } else if (dirString.equals("south-west")) {
                direction = Tile.SOUTH_WEST;
            }
        }
        var npc = new Npc(player.getController(), id, player.getX(), player.getY(), player.getHeight());
        var lines = new ArrayList<String>();
        if (!FileManager.fileExists("./npcs.json")) {
            lines.add("[");
        }
        lines.add("  {");
        lines.add("    \"id\": \"NpcId." + NpcId.valueOf(id) + "\",");
        if (distance > 0) {
            lines.add("    \"moveDistance\": " + distance + ",");
        } else {
            lines.add("    \"direction\": " + direction + ",");
        }
        lines.add("    \"x\": " + player.getX() + ",");
        if (player.getHeight() > 0) {
            lines.add("    \"y\": " + player.getY() + ",");
            lines.add("    \"height\": " + player.getHeight());
        } else {
            lines.add("    \"y\": " + player.getY());
        }
        lines.add("  },");
        FileManager.appendTextFile("./npcs.json", Utils.toStringArray(lines));
        player.getGameEncoder().sendMessage("Spawned & saved " + npc.getDef().getName());
    }
}
