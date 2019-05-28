package script.packetdecoder.widget;

import java.util.ArrayList;
import java.util.List;
import com.palidino.osrs.io.cache.ItemId;
import com.palidino.osrs.io.cache.WidgetId;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.item.ItemDef;
import com.palidino.osrs.model.item.MysteryBox;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.util.RequestManager;
import com.palidino.util.event.Event;
import lombok.var;

public class MysteryBoxWidget {
    public static void widget705(Player player, int index, int childId, int slot, int itemId) {
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 58:
            player.getWidgetManager().removeInteractiveWidgets();
            break;
        case 59:
            var boxId = player.getAttributeInt("mystery_box");
            if (boxId <= 0) {
                break;
            }
            if (!player.getInventory().hasItem(boxId)) {
                player.getGameEncoder().sendMessage("You need a " + ItemDef.getName(boxId) + " to spin.");
                break;
            }
            player.getInventory().deleteItem(boxId, 1);
            final List<Item> mysteryBoxItems = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                Item item = null;
                if (boxId == ItemId.MYSTERY_BOX) {
                    item = MysteryBox.getBoxItem();
                }
                mysteryBoxItems.add(item);
            }
            player.getGameEncoder().sendItems(WidgetId.CUSTOM_MYSTERY_BOX, 41, 0, mysteryBoxItems);
            var event = new Event(0) {
                @Override
                public void execute() {
                    if (!player.isVisible()) {
                        stop();
                        return;
                    }
                    mysteryBoxItems.remove(0);
                    var boxItem = MysteryBox.getBoxItem();
                    mysteryBoxItems.add(boxItem);
                    player.getGameEncoder().sendItems(WidgetId.CUSTOM_MYSTERY_BOX, 41, 0, mysteryBoxItems);
                    player.getSession().write();
                    if (getExecutions() == 8) {
                        stop();
                        boxItem = mysteryBoxItems.get(mysteryBoxItems.size() - 3);
                        player.getInventory().addOrDropItem(boxItem);
                        RequestManager.addPlayerLog(player, "mysterybox",
                                player.getLogName() + " received " + boxItem.getLogName() + " from a mystery box.");
                    }
                }
            };
            player.getWorld().addEvent(event);
            break;
        }
    }
}

