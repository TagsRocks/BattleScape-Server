package decodedpacket.mapobjectoption;

import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.Player;

public class MapObject23 {
    /* 5888 - 6143 */

    // Tent door
    public static void mapObject5888(Player player, int index, MapObject mapObject) {}

    // Tent door
    public static void mapObject5889(Player player, int index, MapObject mapObject) {}

    // Tent door
    public static void mapObject5890(Player player, int index, MapObject mapObject) {}

    // Tent door
    public static void mapObject5891(Player player, int index, MapObject mapObject) {}

    // Tent door
    public static void mapObject5893(Player player, int index, MapObject mapObject) {}

    // Shining pool
    public static void mapObject5897(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject5902(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject5903(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject5904(Player player, int index, MapObject mapObject) {}

    // Tree stump
    public static void mapObject5905(Player player, int index, MapObject mapObject) {}

    // Marble wall
    public static void mapObject5907(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject5946(Player player, int index, MapObject mapObject) {}

    // Dark hole
    public static void mapObject5947(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject5948(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject5949(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject5959(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 3090 && mapObject.getY() == 3956) {
            // Mage Arena to bank
            if (player.getMovement().getTeleportBlock() > 0) {
                player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                        + player.getMovement().getTeleportBlockRemaining() + ".");
                return;
            }
            Tile tile = new Tile(2539, 4712, 0);
            player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
            player.clearHits();
        }
    }

    // Lever
    public static void mapObject5960(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 2539 && mapObject.getY() == 4712) {
            // Mage Arena bank to outside
            Tile tile = new Tile(3090, 3956, 0);
            player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
            player.clearHits();
        }
    }

    // Cave entrance
    public static void mapObject5973(Player player, int index, MapObject mapObject) {}

    // Dwarf MultiCannon
    public static void mapObject5975(Player player, int index, MapObject mapObject) {}

    // Wall of flame
    public static void mapObject5977(Player player, int index, MapObject mapObject) {}

    // Wall of flame
    public static void mapObject5978(Player player, int index, MapObject mapObject) {}

    // Wall of flame
    public static void mapObject5979(Player player, int index, MapObject mapObject) {}

    // Wall of flame
    public static void mapObject5980(Player player, int index, MapObject mapObject) {}

    // Mineral vein
    public static void mapObject5989(Player player, int index, MapObject mapObject) {}

    // Mineral vein
    public static void mapObject5990(Player player, int index, MapObject mapObject) {}

    // Mineral vein
    public static void mapObject5991(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject5998(Player player, int index, MapObject mapObject) {}

    // Mine cart
    public static void mapObject6045(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject6084(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Stairs
    public static void mapObject6085(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6086(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6087(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6088(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6089(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6090(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject6091(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject6092(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6100(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6101(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6102(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6103(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6104(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6105(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6106(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6107(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6108(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6109(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6110(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6111(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6112(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6113(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6114(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6115(Player player, int index, MapObject mapObject) {}
}

