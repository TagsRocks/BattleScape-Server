package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;

public class MapObject94 {
    /* 24064 - 24319 */

    // Castle door
    public static void mapObject24064(Player player, int index, MapObject mapObject) {}

    // Castle door
    public static void mapObject24065(Player player, int index, MapObject mapObject) {}

    // Castle door
    public static void mapObject24066(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24067(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2968 && mapObject.getY() == 3347) {
            player.getMovement().ladderUpTeleport(new Tile(2968, 3348, 1));
        }
    }

    // Staircase
    public static void mapObject24068(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2968 && mapObject.getY() == 3347) {
            player.getMovement().ladderDownTeleport(new Tile(2971, 3347));
        }
    }

    // Ladder
    public static void mapObject24070(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2996 && mapObject.getY() == 3341) {
            player.getMovement().ladderUpTeleport(new Tile(2995, 3341, 2));
        } else {
            player.getMovement().ladderUpTeleport(new Tile(player.getX(), player.getY(), player.getHeight() + 1));
        }
    }

    // Ladder
    public static void mapObject24071(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(player.getX(), player.getY(), player.getHeight() - 1));
    }

    // Staircase
    public static void mapObject24072(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2954 && mapObject.getY() == 3338) {
            player.getMovement().ladderUpTeleport(new Tile(2956, 3338, 1));
        } else if (mapObject.getX() == 2960 && mapObject.getY() == 3338) {
            player.getMovement().ladderUpTeleport(new Tile(2959, 3339, 2));
        }
    }

    // Staircase
    public static void mapObject24074(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2955 && mapObject.getY() == 3338) {
            player.getMovement().ladderDownTeleport(new Tile(2956, 3338));
        } else if (mapObject.getX() == 2960 && mapObject.getY() == 3339) {
            player.getMovement().ladderDownTeleport(new Tile(2959, 3339, 1));
        }
    }

    // Staircase
    public static void mapObject24075(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24076(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24077(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2984 && mapObject.getY() == 3337) {
            player.getMovement().ladderUpTeleport(new Tile(2984, 3340, 2));
        }
    }

    // Staircase
    public static void mapObject24078(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2984 && mapObject.getY() == 3338) {
            player.getMovement().ladderDownTeleport(new Tile(2984, 3336, 1));
        }
    }

    // Staircase
    public static void mapObject24079(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24080(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject24082(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject24083(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject24084(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject24085(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject24087(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject24088(Player player, int index, MapObject mapObject) {}

    // Notice board
    public static void mapObject24098(Player player, int index, MapObject mapObject) {}

    // Notice board
    public static void mapObject24099(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject24101(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bookcase
    public static void mapObject24110(Player player, int index, MapObject mapObject) {}

    // Crumbling wall
    public static void mapObject24222(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 5) {
            player.getGameEncoder().sendMessage("You need an Agility level of 5 to use this.");
            return;
        }
        if (player.getX() >= 2936) {
            player.getMovement().animatedTeleport(new Tile(2935, 3355), 3067, null, 1);
        } else {
            player.getMovement().animatedTeleport(new Tile(2936, 3355), 3067, null, 1);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Staircase
    public static void mapObject24248(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24249(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24250(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24251(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24252(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24253(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24254(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24255(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject24286(Player player, int index, MapObject mapObject) {}

    // Locked door
    public static void mapObject24293(Player player, int index, MapObject mapObject) {}

    // Locked door
    public static void mapObject24294(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject24296(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24303(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Door
    public static void mapObject24306(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2847 && (mapObject.getY() == 3540 || mapObject.getY() == 3541)) {
            if (player.getX() >= 2847) {
                player.getMovement().teleport(2846, 3540, player.getHeight());
            } else {
                if (player.getInventory().getCount(8851) < 100
                        && !player.getEquipment().wearingAccomplishmentCape(Skills.ATTACK)) {
                    player.getGameEncoder().sendMessage("You need atleast 100 tokens to enter.");
                    return;
                }
                player.getMovement().teleport(2847, 3540, player.getHeight());
            }
        } else {
            Region.openDoors(player, mapObject);
        }
    }

    // Door
    public static void mapObject24307(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24309(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2847 && (mapObject.getY() == 3540 || mapObject.getY() == 3541)) {
            if (player.getX() >= 2847) {
                player.getMovement().teleport(2846, 3540, player.getHeight());
            } else {
                if (player.getInventory().getCount(8851) < 100
                        && !player.getEquipment().wearingAccomplishmentCape(Skills.ATTACK)) {
                    player.getGameEncoder().sendMessage("You need atleast 100 tokens to enter.");
                    return;
                }
                player.getMovement().teleport(2847, 3540, player.getHeight());
            }
        } else {
            Region.openDoors(player, mapObject);
        }
    }

    // Door
    public static void mapObject24310(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24312(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24313(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24315(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24316(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24318(Player player, int index, MapObject mapObject) {
        if (player.getController().getLevelForXP(Skills.ATTACK) == 99
                || player.getController().getLevelForXP(Skills.STRENGTH) == 99
                || player.getController().getLevelForXP(Skills.ATTACK)
                        + player.getController().getLevelForXP(Skills.STRENGTH) >= 130) {
            player.getMovement().teleport(2876, 3546, 0);
        } else {
            player.getGameEncoder().sendMessage("You do not meet the requirements to enter.");
        }
    }

    // Door
    public static void mapObject24319(Player player, int index, MapObject mapObject) {}

}


