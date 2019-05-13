package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;

public class MapObject65 {
    /* 16640 - 16895 */

    // Mast
    public static void mapObject16640(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject16642(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Coffin
    public static void mapObject16644(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject16645(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16646(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16647(Player player, int index, MapObject mapObject) {}

    // Ectofuntus
    public static void mapObject16648(Player player, int index, MapObject mapObject) {}

    // Bone grinder
    public static void mapObject16650(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject16651(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject16652(Player player, int index, MapObject mapObject) {}

    // Pirate Captain
    public static void mapObject16653(Player player, int index, MapObject mapObject) {}

    // Bone grinder
    public static void mapObject16655(Player player, int index, MapObject mapObject) {}

    // Bin
    public static void mapObject16656(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject16657(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16661(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16662(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16663(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16664(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3044 && mapObject.getY() == 3924 && player.getHeight() == 0) {
            player.getMovement().teleport(3044, 10322);
        }
    }

    // Staircase
    public static void mapObject16665(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3044 && mapObject.getY() == 10324 && player.getHeight() == 0) {
            player.getMovement().teleport(3044, 3927);
        }
    }

    // Staircase
    public static void mapObject16667(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16668(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16669(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16670(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16671(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Staircase
    public static void mapObject16672(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("climb", 0);
        } else if (index == 1) {
            Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
            player.getMovement().ladderUpTeleport(tile);
        } else if (index == 2) {
            Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Staircase
    public static void mapObject16673(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16674(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16675(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2444 && mapObject.getY() == 3414) {
            player.getMovement().ladderUpTeleport(new Tile(2445, 3416, 1));
        } else if (mapObject.getX() == 2445 && mapObject.getY() == 3434) {
            player.getMovement().ladderUpTeleport(new Tile(2445, 3433, 1));
        }
    }

    // Staircase
    public static void mapObject16676(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16677(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2445 && mapObject.getY() == 3415) {
            player.getMovement().ladderDownTeleport(new Tile(2445, 3416));
        } else if (mapObject.getX() == 2445 && mapObject.getY() == 3434) {
            player.getMovement().ladderDownTeleport(new Tile(2445, 3433));
        }
    }

    // Staircase
    public static void mapObject16678(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16679(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Ladder
    public static void mapObject16680(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2824 && mapObject.getY() == 3507) {
            // Ice Queen
            player.getMovement().ladderDownTeleport(new Tile(2823, 9907));
        } else if (mapObject.getX() == 2827 && mapObject.getY() == 3510) {
            // Ice Queen
            player.getMovement().ladderDownTeleport(new Tile(2826, 9910));
        } else if (mapObject.getX() == 2859 && mapObject.getY() == 3519) {
            // Ice Queen
            player.getMovement().ladderDownTeleport(new Tile(2858, 9919));
        } else if (mapObject.getX() == 2857 && mapObject.getY() == 3517) {
            // Ice Queen
            player.getMovement().ladderDownTeleport(new Tile(2858, 9917));
        } else if (mapObject.getX() == 3088 && mapObject.getY() == 3571) {
            // Air obelisk
            player.getMovement().ladderDownTeleport(new Tile(3087, 9971));
        } else if (mapObject.getX() == 2884 && mapObject.getY() == 3397) {
            // Taverley Dungeon entrance
            Tile tile = new Tile(2884, 9798, 0);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Ladder
    public static void mapObject16681(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16682(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Ladder
    public static void mapObject16683(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Ladder
    public static void mapObject16684(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16685(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject16686(Player player, int index, MapObject mapObject) {}

    // Rune essence
    public static void mapObject16687(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject16700(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Tall mirror
    public static void mapObject16708(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16732(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16733(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16734(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16735(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16736(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject16774(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject16776(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject16777(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject16778(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject16779(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16829(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16831(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16833(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16835(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16837(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16839(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16841(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16843(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16844(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16845(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16846(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16847(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16848(Player player, int index, MapObject mapObject) {}

    // Platform edge
    public static void mapObject16858(Player player, int index, MapObject mapObject) {}

    // Tar barrel
    public static void mapObject16860(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject16884(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject16885(Player player, int index, MapObject mapObject) {}

}


