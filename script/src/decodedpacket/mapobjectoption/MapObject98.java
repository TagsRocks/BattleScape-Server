package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Utils;

public class MapObject98 {
    /* 25088 - 25343 */

    // Magic door
    public static void mapObject25115(Player player, int index, MapObject mapObject) {}

    // Magic door
    public static void mapObject25118(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject25154(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject25161(Player player, int index, MapObject mapObject) {
        if (player.getX() <= 2845) {
            player.getMovement().teleport(2847, 9636);
        } else {
            player.getMovement().teleport(2845, 9636);
        }
    }

    // Climbing rope
    public static void mapObject25213(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject25214(Player player, int index, MapObject mapObject) {}

    // Aged log
    public static void mapObject25216(Player player, int index, MapObject mapObject) {}

    // Barbarian bed
    public static void mapObject25268(Player player, int index, MapObject mapObject) {}

    // Whirlpool
    public static void mapObject25274(Player player, int index, MapObject mapObject) {}

    // Whirlpool
    public static void mapObject25275(Player player, int index, MapObject mapObject) {}

    // Pyre site
    public static void mapObject25286(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(11338)) {
            player.getInventory().deleteItem(11338, 1);
            if (Utils.inRange(player.getCombat().getDropRate(11335, 0.8))) {
                player.getInventory().addItem(11335, 1);
                player.getGameEncoder()
                        .sendMessage("You burn the chewed bones... And find a dragon full helm in the ashes!");
            } else {
                player.getGameEncoder().sendMessage("You burn the chewed bones... All that remains is ash.");
            }
        }
    }

    // Stairs
    public static void mapObject25336(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(1768, 5366, 1));
    }

    // Stairs
    public static void mapObject25337(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject25338(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(1772, 5366, 0));
    }

    // Stairs
    public static void mapObject25339(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(1778, 5343, 1));
    }

    // Stairs
    public static void mapObject25340(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(1778, 5346, 0));
    }

    // Mithril door
    public static void mapObject25341(Player player, int index, MapObject mapObject) {}

}


