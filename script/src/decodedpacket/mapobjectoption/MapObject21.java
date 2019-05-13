package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;

public class MapObject21 {
    /* 5376 - 5631 */

    // Ship's ladder
    public static void mapObject5415(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject5416(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5453(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5454(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject5488(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5490(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5491(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5492(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject5493(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5501(Player player, int index, MapObject mapObject) {}

    // Onion
    public static void mapObject5538(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject5553(Player player, int index, MapObject mapObject) {
        // Mos Le'Harmless Cave
        Tile tile = new Tile(3748, 9373, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Logs
    public static void mapObject5581(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject5583(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject5584(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject5585(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject5618(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject5619(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject5622(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject5623(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject5624(Player player, int index, MapObject mapObject) {}

    // Picket fence
    public static void mapObject5631(Player player, int index, MapObject mapObject) {}
}

