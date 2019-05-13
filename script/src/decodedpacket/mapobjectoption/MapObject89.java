package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Utils;

public class MapObject89 {
    /* 22784 - 23039 */

    // Bank booth
    public static void mapObject22819(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Door
    public static void mapObject22913(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22914(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22920(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22921(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22931(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22932(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22933(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22934(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22935(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22936(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22937(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22938(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22939(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22940(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22941(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22942(Player player, int index, MapObject mapObject) {}

    // Bone door
    public static void mapObject22945(Player player, int index, MapObject mapObject) {
        int entryRequirement = 0;
        if (mapObject.getX() == 2652 && mapObject.getY() == 5449) {
            entryRequirement = 100000;
        } else if (mapObject.getX() == 2658 && mapObject.getY() == 5449) {
            entryRequirement = 500000;
        } else if (mapObject.getX() == 2652 && mapObject.getY() == 5463) {
            entryRequirement = 1000000;
        } else if (mapObject.getX() == 2658 && mapObject.getY() == 5463) {
            entryRequirement = 5000000;
        } else if (mapObject.getX() == 2652 && mapObject.getY() == 5478) {
            entryRequirement = 10000000;
        } else if (mapObject.getX() == 2658 && mapObject.getY() == 5478) {
            entryRequirement = 25000000;
        } else if (mapObject.getX() == 2652 && mapObject.getY() == 5493) {
            entryRequirement = 50000000;
        } else if (mapObject.getX() == 2658 && mapObject.getY() == 5493) {
            entryRequirement = 100000000;
        }
        if (entryRequirement == 0) {
            return;
        }
        if (player.getX() > mapObject.getX() && mapObject.getDirection() == 3
                || player.getX() < mapObject.getX() && mapObject.getDirection() == 1) {
            if (player.getCombat().getRiskedValue() < entryRequirement) {
                player.getGameEncoder().sendMessage(
                        "You need to risk at least " + Utils.formatNumber(entryRequirement) + " to enter.");
                return;
            }
            if (mapObject.getDirection() == 1) {
                player.getMovement().teleport(player.getX() + 2, player.getY());
            } else if (mapObject.getDirection() == 3) {
                player.getMovement().teleport(player.getX() - 2, player.getY());
            }
        } else {
            if (mapObject.getDirection() == 1) {
                player.getMovement().teleport(player.getX() - 2, player.getY());
            } else if (mapObject.getDirection() == 3) {
                player.getMovement().teleport(player.getX() + 2, player.getY());
            }
        }
    }

}


