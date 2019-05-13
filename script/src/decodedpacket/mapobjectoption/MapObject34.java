package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Prayer;
import com.palidino.osrs.model.player.Skills;

public class MapObject34 {
    /* 8704 - 8959 */

    // Loom
    public static void mapObject8717(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject8720(Player player, int index, MapObject mapObject) {
        player.openDialogue("vote", 0);
    }

    // Pile of Rock
    public static void mapObject8725(Player player, int index, MapObject mapObject) {}

    // Pile of Rock
    public static void mapObject8726(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject8727(Player player, int index, MapObject mapObject) {}

    // Steps
    public static void mapObject8729(Player player, int index, MapObject mapObject) {
        // Asgarnian Ice Dungeon
        if (player.getY() >= 9557) {
            Tile tile = new Tile(3060, 9555, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(3060, 9557, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Young tree
    public static void mapObject8730(Player player, int index, MapObject mapObject) {}

    // Net trap
    public static void mapObject8731(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Young tree
    public static void mapObject8732(Player player, int index, MapObject mapObject) {
        player.getHunter().layTrap(-1, mapObject);
    }

    // Net trap
    public static void mapObject8734(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Ardougne Wall Door
    public static void mapObject8738(Player player, int index, MapObject mapObject) {}

    // Ardougne Wall Door
    public static void mapObject8739(Player player, int index, MapObject mapObject) {}

    // Ardougne Wall Door
    public static void mapObject8740(Player player, int index, MapObject mapObject) {}

    // Ardougne Wall Door
    public static void mapObject8741(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject8742(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject8744(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport((new Tile(player)).setHeight(player.getHeight() + 1));
    }

    // ladder
    public static void mapObject8745(Player player, int index, MapObject mapObject) {
        player.openDialogue("climb", 0);
    }

    // ladder
    public static void mapObject8746(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport((new Tile(player)).setHeight(player.getHeight() - 1));
    }

    // Spinning wheel
    public static void mapObject8748(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject8749(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Bookcase
    public static void mapObject8752(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject8753(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject8754(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject8783(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject8785(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8786(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8787(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8788(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8789(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8791(Player player, int index, MapObject mapObject) {}

    // Gnome on a rack
    public static void mapObject8794(Player player, int index, MapObject mapObject) {}

    // Gnome on a rack
    public static void mapObject8795(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject8797(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject8798(Player player, int index, MapObject mapObject) {}

    // Desk
    public static void mapObject8799(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject8800(Player player, int index, MapObject mapObject) {}

    // Rotten Apple Pile
    public static void mapObject8809(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject8810(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject8811(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject8812(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject8813(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8818(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8819(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8820(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8821(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject8844(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject8845(Player player, int index, MapObject mapObject) {}

    // Kelda Hops Patch
    public static void mapObject8862(Player player, int index, MapObject mapObject) {}

    // Kelda Hops Patch
    public static void mapObject8863(Player player, int index, MapObject mapObject) {}

    // Kelda Hops Patch
    public static void mapObject8864(Player player, int index, MapObject mapObject) {}

    // Kelda Hops
    public static void mapObject8865(Player player, int index, MapObject mapObject) {}

    // Kelda Hops
    public static void mapObject8866(Player player, int index, MapObject mapObject) {}

    // Kelda Hops
    public static void mapObject8867(Player player, int index, MapObject mapObject) {}

    // Kelda Hops
    public static void mapObject8868(Player player, int index, MapObject mapObject) {}

    // Kelda Hops
    public static void mapObject8869(Player player, int index, MapObject mapObject) {}

    // Kelda Stout
    public static void mapObject8870(Player player, int index, MapObject mapObject) {}

    // Kelda Hops Patch
    public static void mapObject8877(Player player, int index, MapObject mapObject) {}

    // Dwarven machinery
    public static void mapObject8878(Player player, int index, MapObject mapObject) {}

    // Box
    public static void mapObject8879(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject8881(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject8883(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject8884(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject8910(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject8913(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject8914(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject8915(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject8916(Player player, int index, MapObject mapObject) {}

    // Train cart
    public static void mapObject8924(Player player, int index, MapObject mapObject) {}

    // Train cart
    public static void mapObject8925(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject8929(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon entrance
        Tile tile = new Tile(2443, 10146, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Cave entrance
    public static void mapObject8930(Player player, int index, MapObject mapObject) {}

    // Iron ladder
    public static void mapObject8956(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8958(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon top
        if (player.getX() <= 2490) {
            Tile tile = new Tile(player.getX() + 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        } else {
            Tile tile = new Tile(player.getX() - 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        }
    }

    // Door
    public static void mapObject8959(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon middle
        if (player.getX() <= 2490) {
            Tile tile = new Tile(player.getX() + 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        } else {
            Tile tile = new Tile(player.getX() - 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        }
    }
}

