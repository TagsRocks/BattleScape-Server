package script.packetdecoder.widget;

import com.palidino.osrs.model.dialogue.Dialogue;
import com.palidino.osrs.model.player.Player;

public class LootingBagWidget {
    public static void widget81(Player player, int index, int childID, int slot, int itemID) {
        if (player.isLocked()) {
            return;
        }
        player.getWidgetManager().initLootingBag();
        switch (childID) {
        case 5:
            player.putAttribute("looting_bag_item_slot", slot);
            if (index == 0) {
                Dialogue.executeScript(player, "lootingbag", 0, 0);
            } else if (index == 1) {
                Dialogue.executeScript(player, "lootingbag", 0, 1);
            } else if (index == 2) {
                Dialogue.executeScript(player, "lootingbag", 0, 2);
            } else if (index == 3) {
                Dialogue.executeScript(player, "lootingbag", 0, 3);
            }
            player.removeAttribute("looting_bag_item_slot");
            break;
        }
    }
}

