package decodedpacket.mapobjectoption;

import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.Player;

public class MapObject37 {
    /* 9472 - 9727 */

    // Lever
    public static void mapObject9472(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject9523(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject9533(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject9534(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject9535(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject9536(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject9558(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(player).setHeight(1));
    }

    // Ladder
    public static void mapObject9559(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(player).setHeight(0));
    }

    // Trapdoor
    public static void mapObject9560(Player player, int index, MapObject mapObject) {}

    // Cell door
    public static void mapObject9562(Player player, int index, MapObject mapObject) {}

    // Cell door
    public static void mapObject9563(Player player, int index, MapObject mapObject) {}

    // Cell door
    public static void mapObject9564(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9565(Player player, int index, MapObject mapObject) {}

    // Bucket
    public static void mapObject9568(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject9582(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject9584(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject9607(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject9608(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject9609(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject9611(Player player, int index, MapObject mapObject) {}

    // Wheelbarrow
    public static void mapObject9625(Player player, int index, MapObject mapObject) {}

    // Spade
    public static void mapObject9662(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject9706(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        // Mage Arena
        if (player.getMovement().getTeleportBlock() > 0) {
            player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                    + player.getMovement().getTeleportBlockRemaining() + ".");
            return;
        }
        Tile tile = new Tile(3105, 3951, 0);
        player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
    }

    // Lever
    public static void mapObject9707(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        // Mage Arena
        if (player.getMovement().getTeleportBlock() > 0) {
            player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                    + player.getMovement().getTeleportBlockRemaining() + ".");
            return;
        }
        Tile tile = new Tile(3105, 3956, 0);
        player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
    }

    // Gate
    public static void mapObject9708(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9709(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9710(Player player, int index, MapObject mapObject) {}

    // Tree Stump
    public static void mapObject9711(Player player, int index, MapObject mapObject) {}

    // Tree Stump
    public static void mapObject9712(Player player, int index, MapObject mapObject) {}

    // Tree Stump
    public static void mapObject9713(Player player, int index, MapObject mapObject) {}

    // Tree Stump
    public static void mapObject9714(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9716(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9717(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9718(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9719(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9720(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9721(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9722(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9723(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9724(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject9725(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject9726(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject9727(Player player, int index, MapObject mapObject) {}
}

