package decodedpacket.mapobjectoption;

import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.map.WildernessObelisk;
import com.palidino.osrs.model.player.Player;

public class MapObject57 {
    /* 14592 - 14847 */

    // Staircase
    public static void mapObject14735(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Staircase
    public static void mapObject14736(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("climb", 0);
        } else if (index == 1) {
            Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
            player.getMovement().ladderUpTeleport(tile);
        } else if (index == 2) {
            Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Staircase
    public static void mapObject14737(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Sack
    public static void mapObject14743(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3093 && mapObject.getY() == 3956) {
            if (!player.getInventory().hasItem(946)) {
                player.getGameEncoder().sendMessage("You search the sack and find a knife.");
                player.getInventory().addItem(946, 1);
            } else {
                player.getGameEncoder().sendMessage("You search the sack but find nothing.");
            }
        }
    }

    // Ladder
    public static void mapObject14745(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject14746(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject14747(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject14749(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject14750(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject14751(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject14752(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject14753(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject14754(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Ladder
    public static void mapObject14758(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject14773(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject14774(Player player, int index, MapObject mapObject) {}

    // Obelisk
    public static void mapObject14826(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Obelisk
    public static void mapObject14827(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Obelisk
    public static void mapObject14828(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Obelisk
    public static void mapObject14829(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Obelisk
    public static void mapObject14830(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Obelisk
    public static void mapObject14831(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Mysterious ruins
    public static void mapObject14832(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14834(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14836(Player player, int index, MapObject mapObject) {}

    // Charcoal furnace
    public static void mapObject14837(Player player, int index, MapObject mapObject) {}

    // Charcoal furnace
    public static void mapObject14838(Player player, int index, MapObject mapObject) {}

    // Dead mushroom ring
    public static void mapObject14839(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14841(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14842(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14843(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14844(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14845(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14846(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14847(Player player, int index, MapObject mapObject) {}

}


