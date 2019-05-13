package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;

public class MapObject67 {
    /* 17152 - 17407 */

    // Staircase
    public static void mapObject17155(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17159(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17160(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject17209(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject17222(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject17223(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject17232(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject17235(Player player, int index, MapObject mapObject) {}

    // Aspidistra plant
    public static void mapObject17238(Player player, int index, MapObject mapObject) {}

    // Singing bowl
    public static void mapObject17239(Player player, int index, MapObject mapObject) {}

    // Oaknock's machine
    public static void mapObject17240(Player player, int index, MapObject mapObject) {}

    // Oaknock's Machine
    public static void mapObject17245(Player player, int index, MapObject mapObject) {}

    // Oaknock's Machine
    public static void mapObject17246(Player player, int index, MapObject mapObject) {}

    // Oaknock's Machine
    public static void mapObject17247(Player player, int index, MapObject mapObject) {}

    // Oaknock's exchanger
    public static void mapObject17248(Player player, int index, MapObject mapObject) {}

    // Oaknock's exchanger
    public static void mapObject17249(Player player, int index, MapObject mapObject) {}

    // Crystal bridge
    public static void mapObject17267(Player player, int index, MapObject mapObject) {}

    // A chasm
    public static void mapObject17269(Player player, int index, MapObject mapObject) {}

    // A chasm
    public static void mapObject17270(Player player, int index, MapObject mapObject) {}

    // Machine panel
    public static void mapObject17272(Player player, int index, MapObject mapObject) {}

    // Argento
    public static void mapObject17276(Player player, int index, MapObject mapObject) {}

    // Oaknock's machine
    public static void mapObject17280(Player player, int index, MapObject mapObject) {}

    // Oaknock's Machine
    public static void mapObject17282(Player player, int index, MapObject mapObject) {}

    // Oaknock's exchanger
    public static void mapObject17283(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject17296(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject17297(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject17300(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject17301(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject17302(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject17303(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject17316(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject17317(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject17319(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject17320(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject17321(Player player, int index, MapObject mapObject) {}

    // Stone Tablet
    public static void mapObject17367(Player player, int index, MapObject mapObject) {}

    // Stone Tablet
    public static void mapObject17369(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject17382(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17383(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17384(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2892 && mapObject.getY() == 3507) {
            // Heros' Guild entrance
            Tile tile = new Tile(2893, 9907);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Ladder
    public static void mapObject17385(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2884 && mapObject.getY() == 9797) {
            // Taverley Dungeon exit
            Tile tile = new Tile(2884, 3396, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else if (mapObject.getX() == 3008 && mapObject.getY() == 9550) {
            // Asgarnian Ice Dungeon exit
            Tile tile = new Tile(3009, 3150, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else if (mapObject.getX() == 2824 && mapObject.getY() == 9907) {
            // Ice Queen
            player.getMovement().ladderUpTeleport(new Tile(2823, 3507));
        } else if (mapObject.getX() == 2857 && mapObject.getY() == 9917) {
            // Ice Queen
            player.getMovement().ladderUpTeleport(new Tile(2857, 3516));
        } else if (mapObject.getX() == 2859 && mapObject.getY() == 9919) {
            // Ice Queen
            player.getMovement().ladderUpTeleport(new Tile(2858, 3519));
        } else if (mapObject.getX() == 2827 && mapObject.getY() == 9910) {
            // Ice Queen
            player.getMovement().ladderUpTeleport(new Tile(2826, 3510));
        } else if (mapObject.getX() == 3088 && mapObject.getY() == 9971) {
            // Air obelisk
            player.getMovement().ladderUpTeleport(new Tile(3087, 3571));
        }
    }

    // Ladder
    public static void mapObject17386(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17387(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17388(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17389(Player player, int index, MapObject mapObject) {}

    // Steps
    public static void mapObject17391(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17392(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17393(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17394(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17395(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17396(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17397(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17398(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17399(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17400(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17401(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17402(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17403(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17404(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17405(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17406(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17407(Player player, int index, MapObject mapObject) {}

}


