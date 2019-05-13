package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;

public class MapObject14 {
    /* 3584 - 3839 */

    // Ticket Dispenser
    public static void mapObject3608(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject3610(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject3617(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject3618(Player player, int index, MapObject mapObject) {}

    // Dying tree
    public static void mapObject3648(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject3650(Player player, int index, MapObject mapObject) {
        // Mos Le'Harmless Cave
        Tile tile = new Tile(3748, 9373, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Cooking pot
    public static void mapObject3662(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject3685(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject3686(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject3687(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3722(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3723(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3725(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3726(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3727(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3728(Player player, int index, MapObject mapObject) {}

    // Stile
    public static void mapObject3730(Player player, int index, MapObject mapObject) {}

    // Cave Entrance
    public static void mapObject3735(Player player, int index, MapObject mapObject) {}

    // Cave Exit
    public static void mapObject3736(Player player, int index, MapObject mapObject) {}

    // Danger sign
    public static void mapObject3742(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject3743(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3745(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3746(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3747(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3748(Player player, int index, MapObject mapObject) {}

    // Cave Entrance
    public static void mapObject3757(Player player, int index, MapObject mapObject) {}

    // Cave Exit
    public static void mapObject3758(Player player, int index, MapObject mapObject) {}

    // Cave Entrance
    public static void mapObject3759(Player player, int index, MapObject mapObject) {}

    // Cave Exit
    public static void mapObject3760(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject3761(Player player, int index, MapObject mapObject) {}

    // Secret Door
    public static void mapObject3762(Player player, int index, MapObject mapObject) {}

    // Cell Door
    public static void mapObject3763(Player player, int index, MapObject mapObject) {}

    // Cell Door
    public static void mapObject3764(Player player, int index, MapObject mapObject) {}

    // Cell Door
    public static void mapObject3765(Player player, int index, MapObject mapObject) {}

    // Cell Door
    public static void mapObject3767(Player player, int index, MapObject mapObject) {}

    // Stronghold
    public static void mapObject3771(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject3772(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject3773(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject3774(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3776(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3777(Player player, int index, MapObject mapObject) {}

    // Prison Door
    public static void mapObject3780(Player player, int index, MapObject mapObject) {}

    // Arena Entrance
    public static void mapObject3782(Player player, int index, MapObject mapObject) {}

    // Arena Entrance
    public static void mapObject3783(Player player, int index, MapObject mapObject) {}

    // Arena Exit
    public static void mapObject3785(Player player, int index, MapObject mapObject) {}

    // Arena Exit
    public static void mapObject3786(Player player, int index, MapObject mapObject) {}

    // Stone Staircase
    public static void mapObject3788(Player player, int index, MapObject mapObject) {}

    // Stone Staircase
    public static void mapObject3789(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3790(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3791(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3803(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3804(Player player, int index, MapObject mapObject) {}

    // Storeroom Door
    public static void mapObject3810(Player player, int index, MapObject mapObject) {}

    // Kitchen Drawers
    public static void mapObject3816(Player player, int index, MapObject mapObject) {}

    // Kitchen Drawers
    public static void mapObject3817(Player player, int index, MapObject mapObject) {}

    // Rack
    public static void mapObject3821(Player player, int index, MapObject mapObject) {}

    // Goutweed Crate
    public static void mapObject3822(Player player, int index, MapObject mapObject) {}

    // Tunnel entrance
    public static void mapObject3827(Player player, int index, MapObject mapObject) {}

    // Tunnel entrance
    public static void mapObject3828(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject3829(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3830(Player player, int index, MapObject mapObject) {}

    // Tunnel entrance
    public static void mapObject3831(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject3832(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3508 && mapObject.getY() == 9494) {
            player.getMovement().ladderUpTeleport(new Tile(3509, 9496, 2));
            player.getController().stopWithTeleport();
        }
    }

    // Picnic table
    public static void mapObject3834(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3835(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3836(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3837(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3838(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3839(Player player, int index, MapObject mapObject) {}
}

