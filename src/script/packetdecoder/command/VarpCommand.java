package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class VarpCommand implements Command {
    @Override
    public String getExample() {
        return "id value";
    }

    @Override
    public boolean canUse(Player player) {
        return player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {
        var values = message.split(" ");
        var id = Integer.parseInt(values[0]);
        var value = Integer.parseInt(values[1]);
        player.getGameEncoder().setVarp(id, value);
    }
}
