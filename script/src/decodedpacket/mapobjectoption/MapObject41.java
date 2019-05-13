package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;

public class MapObject41 {
    /* 10496 - 10751 */

    // Bank booth
    public static void mapObject10517(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Staircase
    public static void mapObject10525(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject10526(Player player, int index, MapObject mapObject) {}

    // Portcullis
    public static void mapObject10553(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10554(Player player, int index, MapObject mapObject) {}

    // Champion Statue
    public static void mapObject10556(Player player, int index, MapObject mapObject) {}

    // Champion Statue
    public static void mapObject10557(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject10558(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject10559(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10560(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3190 && mapObject.getY() == 9758) {
            player.getMovement().ladderUpTeleport(new Tile(2212, 4940));
        }
    }

    // Bank chest
    public static void mapObject10562(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Tightrope
    public static void mapObject10583(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject10585(Player player, int index, MapObject mapObject) {}

    // Rough wall
    public static void mapObject10586(Player player, int index, MapObject mapObject) {}

    // Clothes line
    public static void mapObject10587(Player player, int index, MapObject mapObject) {}

    // Icy Cavern
    public static void mapObject10595(Player player, int index, MapObject mapObject) {
        // Asgarnian Ice Dungeon
        Tile tile = new Tile(3056, 9562, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Icy Cavern
    public static void mapObject10596(Player player, int index, MapObject mapObject) {
        // Asgarnian Ice Dungeon
        Tile tile = new Tile(3056, 9555, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Altar
    public static void mapObject10638(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject10639(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject10640(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10642(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject10661(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Crate
    public static void mapObject10662(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject10663(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject10670(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject10672(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject10698(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject10721(Player player, int index, MapObject mapObject) {}

    // Bones
    public static void mapObject10725(Player player, int index, MapObject mapObject) {}

    // Bones
    public static void mapObject10726(Player player, int index, MapObject mapObject) {}

    // Bones
    public static void mapObject10727(Player player, int index, MapObject mapObject) {}

    // Bones
    public static void mapObject10728(Player player, int index, MapObject mapObject) {}

    // Coin Collector
    public static void mapObject10734(Player player, int index, MapObject mapObject) {}

    // Food chute
    public static void mapObject10735(Player player, int index, MapObject mapObject) {}

}


