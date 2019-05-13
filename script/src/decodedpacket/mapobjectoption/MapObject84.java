package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.player.Player;

public class MapObject84 {
    /* 21504 - 21759 */

    // Door
    public static void mapObject21505(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject21506(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21507(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject21508(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject21511(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject21512(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject21513(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject21514(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject21515(Player player, int index, MapObject mapObject) {}

    // Exit cavern
    public static void mapObject21560(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject21578(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2398, 3811);
    }

    // Cave
    public static void mapObject21581(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21583(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21584(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21585(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21586(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21587(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21588(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21589(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21590(Player player, int index, MapObject mapObject) {}

    // Stone ladder
    public static void mapObject21592(Player player, int index, MapObject mapObject) {}

    // Stone ladder
    public static void mapObject21593(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21594(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21595(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21596(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21597(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21598(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21599(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject21600(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Gate
    public static void mapObject21601(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Ice Troll King
    public static void mapObject21622(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21668(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21669(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21670(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21671(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21672(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21673(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21674(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21675(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21676(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21677(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21678(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21679(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21680(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21681(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21682(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21683(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21684(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21685(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21686(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21687(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21688(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21689(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21690(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21691(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21692(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21693(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21694(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21695(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject21722(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2643, 9594, 2);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Stairs
    public static void mapObject21724(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2649, 9591, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Stairs
    public static void mapObject21725(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2636, 9510, 2);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Stairs
    public static void mapObject21726(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2636, 9517, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Pipe
    public static void mapObject21727(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (mapObject.getX() == 2698 && mapObject.getY() == 9498) {
            Tile tile = new Tile(2698, 9492, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        } else if (mapObject.getX() == 2698 && mapObject.getY() == 9493) {
            Tile tile = new Tile(2698, 9500, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        }
    }

    // Pipe
    public static void mapObject21728(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (mapObject.getX() == 2655 && mapObject.getY() == 9567) {
            Tile tile = new Tile(2655, 9573, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        } else if (mapObject.getX() == 2655 && mapObject.getY() == 9571) {
            Tile tile = new Tile(2655, 9566, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        }
    }

    // Vines
    public static void mapObject21731(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (player.getX() >= 2691) {
            Tile tile = new Tile(2689, 9564, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2691, 9564, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Vines
    public static void mapObject21732(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (player.getY() <= 9568) {
            Tile tile = new Tile(2683, 9570, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2683, 9568, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Vines
    public static void mapObject21733(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (player.getX() <= 2672) {
            Tile tile = new Tile(2674, 9499, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2672, 9499, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Vines
    public static void mapObject21734(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (player.getX() <= 2674) {
            Tile tile = new Tile(2676, 9479, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2674, 9479, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Vines
    public static void mapObject21735(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (player.getX() <= 2693) {
            Tile tile = new Tile(2695, 9482, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2693, 9482, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Stepping stone
    public static void mapObject21738(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2647, 9557, 0);
        player.getMovement().animatedTeleport(tile, 3067, null, 1);
    }

    // Stepping stone
    public static void mapObject21739(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2649, 9562, 0);
        player.getMovement().animatedTeleport(tile, 3067, null, 1);
    }

}


