package decodedpacket.mapobjectoption;

import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.item.MysteryBox;
import com.palidino.osrs.model.item.RandomItem;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.util.RequestManager;

public class MapObject106 {
    /* 27136 - 27391 */

    // Stairs
    public static void mapObject27199(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27200(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27201(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27202(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27203(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27204(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject27205(Player player, int index, MapObject mapObject) {}

    // Information
    public static void mapObject27230(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject27253(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27254(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Crate
    public static void mapObject27256(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject27257(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject27259(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27260(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27262(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27263(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27264(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27265(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27266(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27267(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Chair
    public static void mapObject27268(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27269(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY_32304)) {
            player.getInventory().deleteItem(ItemID.BLOODY_KEY_32304, 1);
            Item item = null;
            if (player.isGameModeNormal() || player.isGameModeHard()) {
                item = MysteryBox.getBoxItem();
            } else {
                item = RandomItem.getItem(MysteryBox.BARROWS_PIECES);
            }
            String itemName =
                    ("aeiouAEIOU".indexOf(item.getName().charAt(0)) != -1 ? "an" : "a") + " " + item.getName();
            player.getWorld().sendNews(player.getMessaging().getIconImage() + player.getUsername() + " has received "
                    + itemName + " from a bloody key!");
            player.getInventory().addOrDropItem(item);
            RequestManager.addPlayerLog(player, "lootbox",
                    player.getLogName() + " received " + item.getLogName() + " from a bloody key.");
        } else if (player.getInventory().hasItem(ItemID.BLOODIER_KEY_32305)) {
            player.getInventory().deleteItem(ItemID.BLOODIER_KEY_32305, 1);
            Item item1 = null;
            Item item2 = null;
            if (player.isGameModeNormal() || player.isGameModeHard()) {
                item1 = MysteryBox.getSuperBoxItem();
                item2 = MysteryBox.getSuperBoxItem();
                String itemNames =
                        ("aeiouAEIOU".indexOf(item1.getName().charAt(0)) != -1 ? "an" : "a") + " " + item1.getName();
                itemNames += " and " + ("aeiouAEIOU".indexOf(item2.getName().charAt(0)) != -1 ? "an" : "a") + " "
                        + item2.getName();
                player.getWorld().sendNews(player.getMessaging().getIconImage() + player.getUsername()
                        + " has received " + itemNames + " from a bloodier key!");
            } else {
                item1 = RandomItem.getItem(MysteryBox.BARROWS_SETS);
                String itemName =
                        ("aeiouAEIOU".indexOf(item1.getName().charAt(0)) != -1 ? "an" : "a") + " " + item1.getName();
                player.getWorld().sendNews(player.getMessaging().getIconImage() + player.getUsername()
                        + " has received " + itemName + " from a bloodier key!");
            }
            player.getInventory().addOrDropItem(item1);
            RequestManager.addPlayerLog(player, "lootbox",
                    player.getLogName() + " received " + item1.getLogName() + " from a bloodier key.");
            if (item2 != null) {
                player.getInventory().addOrDropItem(item2);
                RequestManager.addPlayerLog(player, "lootbox",
                        player.getLogName() + " received " + item2.getLogName() + " from a bloodier key.");
            }
        } else if (player.getInventory().hasItem(ItemID.SINISTER_KEY)) {
            player.getBarrows().openChest(mapObject.getX() != 3551 || mapObject.getY() != 9695);
        } else {
            player.getGameEncoder().sendMessage("You need a key to open this chest.");
        }
    }

    // Chair
    public static void mapObject27270(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27271(Player player, int index, MapObject mapObject) {}

    // Stool
    public static void mapObject27272(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject27273(Player player, int index, MapObject mapObject) {}

    // Potted plant
    public static void mapObject27274(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27275(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject27276(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27277(Player player, int index, MapObject mapObject) {}

    // Potted flower
    public static void mapObject27278(Player player, int index, MapObject mapObject) {}

    // Potted plant
    public static void mapObject27279(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27280(Player player, int index, MapObject mapObject) {}

    // Smashed chair
    public static void mapObject27281(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27282(Player player, int index, MapObject mapObject) {}

    // Stool
    public static void mapObject27283(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27284(Player player, int index, MapObject mapObject) {}

    // Private bank booth
    public static void mapObject27285(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27286(Player player, int index, MapObject mapObject) {}

    // Boulders
    public static void mapObject27287(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27288(Player player, int index, MapObject mapObject) {}

    // Bank Table
    public static void mapObject27289(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27290(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject27291(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27292(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Handholds
    public static void mapObject27362(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1459 && mapObject.getY() == 3690) {
            player.getMovement().ladderDownTeleport(new Tile(1454, 3690, 0));
        } else if (mapObject.getX() == 1455 && mapObject.getY() == 3690) {
            player.getMovement().ladderUpTeleport(new Tile(1460, 3690, 0));
        } else if (mapObject.getX() == 1471 && mapObject.getY() == 3687) {
            player.getMovement().ladderDownTeleport(new Tile(1476, 3687, 0));
        } else if (mapObject.getX() == 1475 && mapObject.getY() == 3687) {
            player.getMovement().ladderUpTeleport(new Tile(1470, 3687, 0));
        }
    }

    // Food cupboard
    public static void mapObject27375(Player player, int index, MapObject mapObject) {}

    // Utensil cupboard
    public static void mapObject27376(Player player, int index, MapObject mapObject) {}

    // Meat table
    public static void mapObject27377(Player player, int index, MapObject mapObject) {}

    // Buffet table
    public static void mapObject27378(Player player, int index, MapObject mapObject) {}

    // Blighted Golovanova seedling
    public static void mapObject27386(Player player, int index, MapObject mapObject) {}

    // Blighted Golovanova plant
    public static void mapObject27389(Player player, int index, MapObject mapObject) {}

}


