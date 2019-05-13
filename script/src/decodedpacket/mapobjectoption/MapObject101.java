package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;

public class MapObject101 {
    /* 25856 - 26111 */

    // Metal door
    public static void mapObject25876(Player player, int index, MapObject mapObject) {}

    // Metal door
    public static void mapObject25877(Player player, int index, MapObject mapObject) {}

    // Vent
    public static void mapObject25880(Player player, int index, MapObject mapObject) {}

    // Sir Tristram
    public static void mapObject25889(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject25927(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject25935(Player player, int index, MapObject mapObject) {}

    // Bank deposit box
    public static void mapObject25937(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Ladder
    public static void mapObject25938(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25939(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25940(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25941(Player player, int index, MapObject mapObject) {}

    // King Arthur
    public static void mapObject25942(Player player, int index, MapObject mapObject) {}

    // King Arthur
    public static void mapObject25943(Player player, int index, MapObject mapObject) {}

    // Court judge
    public static void mapObject25956(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject26017(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject26042(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject26053(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject26073(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject26081(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3085 && mapObject.getY() == 3484
                || mapObject.getX() == 3086 && mapObject.getY() == 3484) {
            if (!player.getInventory().isEmpty() || !player.getEquipment().isEmpty()) {
                player.getGameEncoder().sendMessage("No items can be taken beyond this point.");
                return;
            }
            player.getClanWars().openJoinTournament();
        }
    }

    // Gate
    public static void mapObject26082(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3085 && mapObject.getY() == 3484
                || mapObject.getX() == 3086 && mapObject.getY() == 3484) {
            if (!player.getInventory().isEmpty() || !player.getEquipment().isEmpty()) {
                player.getGameEncoder().sendMessage("No items can be taken beyond this point.");
                return;
            }
            player.getClanWars().openJoinTournament();
        }
    }

    // null
    public static void mapObject26083(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject26084(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject26106(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject26107(Player player, int index, MapObject mapObject) {}

    // Spiders' nest
    public static void mapObject26109(Player player, int index, MapObject mapObject) {}

    // Smashed window
    public static void mapObject26110(Player player, int index, MapObject mapObject) {}

    // Smashed window
    public static void mapObject26111(Player player, int index, MapObject mapObject) {}

}


