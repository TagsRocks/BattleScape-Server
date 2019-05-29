package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class EmptyCommand implements Command {

    @Override
    public void execute(Player player, String message) {
        for (var i = 0; i < player.getInventory().size(); i++) {
            var id = player.getInventory().getId(i);
            player.getInventory().deleteItem(id, Item.MAX_AMOUNT);
            player.getInventory().setItem(i, null);
            player.getInventory().setUpdate(true);
        }
        player.getGameEncoder().sendMessage("You empty your inventory..");
    }

}
