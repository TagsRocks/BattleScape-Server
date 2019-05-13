package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;

public class MapObject117 {
    /* 29952 - 30207 */

    // Steps
    public static void mapObject29993(Player player, int index, MapObject mapObject) {
        if (player.getY() >= 9991) {
            player.getMovement().teleport(2703, 9987);
        } else {
            player.getMovement().teleport(2703, 9992);
        }
    }

    // Chambers of Xeric
    public static void mapObject29777(Player player, int index, MapObject mapObject) {
        player.openDialogue("raids", 0);
    }

    // Bank chest
    public static void mapObject30087(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Tunnel
    public static void mapObject30174(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 72) {
            player.getGameEncoder().sendMessage("You need an Agility level of 72 to use this.");
            return;
        }
        if (mapObject.getX() == 2430 && mapObject.getY() == 9806) {
            player.getMovement().ladderUpTeleport(new Tile(2435, 9806, 0));
        } else if (mapObject.getX() == 2434 && mapObject.getY() == 9806) {
            player.getMovement().ladderUpTeleport(new Tile(2429, 9806, 0));
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Tunnel
    public static void mapObject30175(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 72) {
            player.getGameEncoder().sendMessage("You need an Agility level of 72 to use this.");
            return;
        }
        if (mapObject.getX() == 2430 && mapObject.getY() == 9807) {
            player.getMovement().ladderUpTeleport(new Tile(2435, 9807, 0));
        } else if (mapObject.getX() == 2434 && mapObject.getY() == 9807) {
            player.getMovement().ladderUpTeleport(new Tile(2429, 9807, 0));
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Steps
    public static void mapObject30189(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2881 && mapObject.getY() == 9825) {
            // Taverley Dungeon
            player.getMovement().ladderUpTeleport(new Tile(2880, 9825, 1));
        } else if (mapObject.getX() == 2904 && mapObject.getY() == 9813) {
            // Taverley Dungeon
            player.getMovement().ladderUpTeleport(new Tile(2903, 9813, 1));
        }
    }

    // Steps
    public static void mapObject30190(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2881 && mapObject.getY() == 9825) {
            // Taverley Dungeon
            player.getMovement().ladderDownTeleport(new Tile(2883, 9825, 0));
        } else if (mapObject.getX() == 2904 && mapObject.getY() == 9813) {
            // Taverley Dungeon
            player.getMovement().ladderDownTeleport(new Tile(2906, 9813, 0));
        }
    }

    // Ladder
    public static void mapObject30191(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(3412, 9932, 3));
    }

    // Ladder
    public static void mapObject30192(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(3417, 3536, 0));
    }

    // Crevice
    public static void mapObject30198(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2696 && mapObject.getY() == 9436) {
            // Brimhaven Dungeon
            player.getMovement().ladderDownTeleport(new Tile(2684, 9436, 0));
        } else if (mapObject.getX() == 2685 && mapObject.getY() == 9436) {
            // Brimhaven Dungeon
            player.getMovement().ladderDownTeleport(new Tile(2697, 9436, 0));
        }
    }

}


