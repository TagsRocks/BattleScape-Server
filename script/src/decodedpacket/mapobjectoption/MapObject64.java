package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;

public class MapObject64 {
    /* 16384 - 16639 */

    // Ladder
    public static void mapObject16450(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16464(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject16465(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject16466(Player player, int index, MapObject mapObject) {}

    // Incubation chamber
    public static void mapObject16467(Player player, int index, MapObject mapObject) {}

    // Tight-gap
    public static void mapObject16468(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject16469(Player player, int index, MapObject mapObject) {}

    // Exercise mat
    public static void mapObject16508(Player player, int index, MapObject mapObject) {}

    // Obstacle pipe
    public static void mapObject16509(Player player, int index, MapObject mapObject) {
        // Taverley Dungeon
        if (player.getSkills().getLevel(Skills.AGILITY) < 70) {
            player.getGameEncoder().sendMessage("You need an Agility level of 70 to do this.");
            return;
        }
        if (player.getX() <= 2887) {
            Tile tile = new Tile(2892, 9799, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        } else {
            Tile tile = new Tile(2886, 9799, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Strange floor
    public static void mapObject16510(Player player, int index, MapObject mapObject) {
        // Taverley Dungeon
        if (player.getSkills().getLevel(Skills.AGILITY) < 80) {
            player.getGameEncoder().sendMessage("You need an Agility level of 80 to do this.");
            return;
        }
        if (player.getX() <= 2878) {
            Tile tile = new Tile(2880, 9813, 0);
            player.getMovement().animatedTeleport(tile, 3067, null, 1);
        } else {
            Tile tile = new Tile(2878, 9813, 0);
            player.getMovement().animatedTeleport(tile, 3067, null, 1);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Obstacle pipe
    public static void mapObject16511(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject16513(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16514(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16515(Player player, int index, MapObject mapObject) {}

    // Fence
    public static void mapObject16517(Player player, int index, MapObject mapObject) {}

    // Fence
    public static void mapObject16518(Player player, int index, MapObject mapObject) {}

    // Castle wall
    public static void mapObject16519(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject16520(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16521(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16522(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16523(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16524(Player player, int index, MapObject mapObject) {}

    // Weathered wall
    public static void mapObject16525(Player player, int index, MapObject mapObject) {}

    // Weathered wall
    public static void mapObject16526(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject16527(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject16528(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject16529(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject16530(Player player, int index, MapObject mapObject) {}

    // Jutting wall
    public static void mapObject16532(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject16533(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16534(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16535(Player player, int index, MapObject mapObject) {}

    // Spikey chain
    public static void mapObject16537(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
        player.getMovement().animatedTeleport(tile, 834, null, 1);
    }

    // Spikey chain
    public static void mapObject16538(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().animatedTeleport(tile, 834, null, 1);
    }

    // Crevice
    public static void mapObject16539(Player player, int index, MapObject mapObject) {
        // Fremennik Dungeon
        if (mapObject.getX() == 2734 && mapObject.getY() == 10008) {
            Tile tile = new Tile(2730, 10008, 0);
            player.getMovement().ladderDownTeleport(tile);
        } else if (mapObject.getX() == 2731 && mapObject.getY() == 10008) {
            Tile tile = new Tile(2735, 10008, 0);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Log balance
    public static void mapObject16540(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject16541(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject16542(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject16543(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 42) {
            player.getGameEncoder().sendMessage("You need an Agility level of 42 to do this.");
            return;
        }
        if (mapObject.getX() == 3029 && mapObject.getY() == 9806) {
            player.getMovement().teleport(3035, 9806);
        } else if (mapObject.getX() == 3034 && mapObject.getY() == 9806) {
            player.getMovement().teleport(3028, 9806);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Strange floor
    public static void mapObject16544(Player player, int index, MapObject mapObject) {
        // Fremennik Dungeon
        if (player.getX() >= mapObject.getX()) {
            Tile tile = new Tile(mapObject.getX() - 1, mapObject.getY(), 0);
            player.getMovement().animatedTeleport(tile, 3067, null, 1);
        } else {
            Tile tile = new Tile(mapObject.getX() + 1, mapObject.getY(), 0);
            player.getMovement().animatedTeleport(tile, 3067, null, 1);
        }
    }

    // Rocks
    public static void mapObject16545(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject16546(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject16547(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject16548(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16549(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16550(Player player, int index, MapObject mapObject) {}

    // Ornate railing
    public static void mapObject16552(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16556(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16559(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16560(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16561(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16564(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16565(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16585(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16586(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16587(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16588(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16589(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16590(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16591(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16592(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16593(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16594(Player player, int index, MapObject mapObject) {}

    // My life
    public static void mapObject16599(Player player, int index, MapObject mapObject) {}

    // Hurdle
    public static void mapObject16600(Player player, int index, MapObject mapObject) {}

    // Dream tree
    public static void mapObject16604(Player player, int index, MapObject mapObject) {}

    // Zero
    public static void mapObject16619(Player player, int index, MapObject mapObject) {}

    // One
    public static void mapObject16620(Player player, int index, MapObject mapObject) {}

    // Two
    public static void mapObject16621(Player player, int index, MapObject mapObject) {}

    // Three
    public static void mapObject16622(Player player, int index, MapObject mapObject) {}

    // Four
    public static void mapObject16623(Player player, int index, MapObject mapObject) {}

    // Five
    public static void mapObject16624(Player player, int index, MapObject mapObject) {}

    // Six
    public static void mapObject16625(Player player, int index, MapObject mapObject) {}

    // Seven
    public static void mapObject16626(Player player, int index, MapObject mapObject) {}

    // Eight
    public static void mapObject16627(Player player, int index, MapObject mapObject) {}

    // Nine
    public static void mapObject16628(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16632(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16633(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16634(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16635(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16636(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16637(Player player, int index, MapObject mapObject) {}

    // Dream puff
    public static void mapObject16638(Player player, int index, MapObject mapObject) {}

}


