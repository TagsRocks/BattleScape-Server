package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.io.cache.ItemId;
import com.palidino.osrs.model.player.Player;

public class VengCommand implements Command {

    @Override
    public void execute(Player player, String message) {

        player.getInventory().addItem(ItemId.EARTH_RUNE, 5000);
        player.getInventory().addItem(ItemId.ASTRAL_RUNE, 5000);
        player.getInventory().addItem(ItemId.DEATH_RUNE, 5000);
    }


}
