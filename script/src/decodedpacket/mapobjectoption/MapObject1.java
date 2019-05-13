package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Prayer;
import com.palidino.osrs.model.player.Skills;

public class MapObject1 {
    /* 256 - 511 */

    // Ship's ladder
    public static void mapObject272(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3018 && mapObject.getY() == 3957) {
            player.getMovement().ladderUpTeleport(new Tile(3018, 3956, player.getHeight() + 1));
        }
    }

    // Ship's ladder
    public static void mapObject273(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3018 && mapObject.getY() == 3957) {
            player.getMovement().ladderDownTeleport(new Tile(3018, 3958, player.getHeight() - 1));
        }
    }

    // Ladder
    public static void mapObject287(Player player, int index, MapObject mapObject) {}

    // Hay bales
    public static void mapObject298(Player player, int index, MapObject mapObject) {}

    // Hay bales
    public static void mapObject299(Player player, int index, MapObject mapObject) {}

    // Haystack
    public static void mapObject300(Player player, int index, MapObject mapObject) {}

    // Hay bale
    public static void mapObject304(Player player, int index, MapObject mapObject) {}

    // Potato
    public static void mapObject312(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject313(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject348(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject349(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject350(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject351(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject352(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject353(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject354(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject355(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject356(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject357(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject358(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject359(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject360(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject361(Player player, int index, MapObject mapObject) {}

    // Sacks
    public static void mapObject365(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject366(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject367(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject368(Player player, int index, MapObject mapObject) {}

    // Large cupboard
    public static void mapObject369(Player player, int index, MapObject mapObject) {}

    // Open Cupboard
    public static void mapObject370(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject371(Player player, int index, MapObject mapObject) {}

    // Large open cupboard
    public static void mapObject372(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject375(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject376(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject377(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject378(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject379(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject380(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject381(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject388(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject389(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject390(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject393(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject394(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject398(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject399(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject409(Player player, int index, MapObject mapObject) {}

    // Altar of Guthix
    public static void mapObject410(Player player, int index, MapObject mapObject) {}

    // Chaos altar
    public static void mapObject411(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Chaos altar
    public static void mapObject412(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject414(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject415(Player player, int index, MapObject mapObject) {}

    // Church organ
    public static void mapObject416(Player player, int index, MapObject mapObject) {}
}
