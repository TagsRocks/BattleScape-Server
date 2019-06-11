package script.packetdecoder.widget;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.ValueEnteredEvent;
import com.palidino.osrs.io.cache.ItemId;
import com.palidino.osrs.model.guide.Guide;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.player.Player;

public class BondWidget {
    public static void widget704(Player player, int index, int childId, int slot, int itemId) {
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 28:
            int inventoryCount = player.getInventory().getCount(ItemId.BOND_32318);
            if (inventoryCount == 0) {
                player.getGameEncoder().sendMessage("You have no bonds in your inventory.");
                break;
            }
            if (index == 0) {
                player.getInventory().deleteItem(ItemId.BOND_32318, 1);
                player.getBonds().setPouch(player.getBonds().getPouch() + 1);
            } else if (index == 1) {
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        int inventoryCount = player.getInventory().getCount(ItemId.BOND_32318);
                        value = Math.min(value, inventoryCount);
                        player.getInventory().deleteItem(ItemId.BOND_32318, value);
                        player.getBonds().setPouch(player.getBonds().getPouch() + value);
                        player.getBonds().sendPouchCounts();
                    }
                });
            } else if (index == 2) {
                player.getInventory().deleteItem(ItemId.BOND_32318, inventoryCount);
                player.getBonds().setPouch(player.getBonds().getPouch() + inventoryCount);
            }
            break;
        case 29:
            if (player.getBonds().getPouch() == 0) {
                player.getGameEncoder().sendMessage("You have no bonds in your pouch.");
                break;
            }
            if (index == 0) {
                int maxWithdraw = (int) Math.min(player.getBonds().getPouch(), Item.MAX_AMOUNT);
                maxWithdraw = Math.min(1, maxWithdraw);
                player.getBonds().setPouch(player.getBonds().getPouch() - maxWithdraw);
                player.getInventory().addItem(ItemId.BOND_32318, maxWithdraw);
            } else if (index == 1) {
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        int maxWithdraw = (int) Math.min(player.getBonds().getPouch(), Item.MAX_AMOUNT);
                        value = Math.min(value, maxWithdraw);
                        player.getBonds().setPouch(player.getBonds().getPouch() - value);
                        player.getInventory().addItem(ItemId.BOND_32318, value);
                        player.getBonds().sendPouchCounts();
                    }
                });
            } else if (index == 2) {
                int maxWithdraw = (int) Math.min(player.getBonds().getPouch(), Item.MAX_AMOUNT);
                player.getBonds().setPouch(player.getBonds().getPouch() - maxWithdraw);
                player.getInventory().addItem(ItemId.BOND_32318, maxWithdraw);
            }
            break;
        case 69:
            if (Main.isSpawn()) {
                player.getGameEncoder().sendOpenURL("https://www.battlewild.com/store");
            } else {
                player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/store");
            }
            break;
        case 71:
            if (Main.isSpawn()) {
                player.openShop("bond_spawn");
            } else if (player.isGameModeNormal() || player.isGameModeHard()) {
                player.openShop("bond");
            } else {
                player.openShop("bond_iron");
            }
            break;
        case 73:
            Guide.openEntry(player, "main", "bonds");
            break;
        case 75:
            // player.openDialogue("bond", 2);
            break;
        }
        player.getBonds().sendPouchCounts();
    }
}

