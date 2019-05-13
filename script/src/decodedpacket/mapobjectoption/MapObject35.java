package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;

public class MapObject35 {
    /* 8960 - 9215 */

    // Door
    public static void mapObject8960(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon bottom
        if (player.getX() <= 2490) {
            Tile tile = new Tile(player.getX() + 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        } else {
            Tile tile = new Tile(player.getX() - 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        }
    }

    // Steps
    public static void mapObject8966(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon exit
        Tile tile = new Tile(2524, 3739, 0);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Net trap
    public static void mapObject8973(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Dense runestone
    public static void mapObject8975(Player player, int index, MapObject mapObject) {}

    // Depleted runestone
    public static void mapObject8976(Player player, int index, MapObject mapObject) {}

    // Dense runestone
    public static void mapObject8981(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject8982(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject8983(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject8984(Player player, int index, MapObject mapObject) {}

    // Net trap
    public static void mapObject8986(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Net trap
    public static void mapObject8988(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Young tree
    public static void mapObject8989(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Young tree
    public static void mapObject8990(Player player, int index, MapObject mapObject) {
        player.getHunter().layTrap(-1, mapObject);
    }

    // Net trap
    public static void mapObject8992(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Pinball Post
    public static void mapObject8994(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject8995(Player player, int index, MapObject mapObject) {}

    // Net trap
    public static void mapObject8996(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Net trap
    public static void mapObject8998(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Young tree
    public static void mapObject8999(Player player, int index, MapObject mapObject) {
        player.getHunter().layTrap(-1, mapObject);
    }

    // Young tree
    public static void mapObject9000(Player player, int index, MapObject mapObject) {
        player.getHunter().layTrap(-1, mapObject);
    }

    // Net trap
    public static void mapObject9002(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Net trap
    public static void mapObject9004(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Funeral Pyre
    public static void mapObject9008(Player player, int index, MapObject mapObject) {}

    // Funeral Pyre
    public static void mapObject9009(Player player, int index, MapObject mapObject) {}

    // Light Jungle
    public static void mapObject9010(Player player, int index, MapObject mapObject) {}

    // Light Jungle
    public static void mapObject9011(Player player, int index, MapObject mapObject) {}

    // Light Jungle
    public static void mapObject9012(Player player, int index, MapObject mapObject) {}

    // Light Jungle
    public static void mapObject9013(Player player, int index, MapObject mapObject) {}

    // Light Jungle
    public static void mapObject9014(Player player, int index, MapObject mapObject) {}

    // Medium Jungle
    public static void mapObject9015(Player player, int index, MapObject mapObject) {}

    // Medium Jungle
    public static void mapObject9016(Player player, int index, MapObject mapObject) {}

    // Medium Jungle
    public static void mapObject9017(Player player, int index, MapObject mapObject) {}

    // Medium Jungle
    public static void mapObject9018(Player player, int index, MapObject mapObject) {}

    // Medium Jungle
    public static void mapObject9019(Player player, int index, MapObject mapObject) {}

    // Dense Jungle
    public static void mapObject9020(Player player, int index, MapObject mapObject) {}

    // Dense Jungle
    public static void mapObject9021(Player player, int index, MapObject mapObject) {}

    // Dense Jungle
    public static void mapObject9022(Player player, int index, MapObject mapObject) {}

    // Dense Jungle
    public static void mapObject9023(Player player, int index, MapObject mapObject) {}

    // Dense Jungle
    public static void mapObject9024(Player player, int index, MapObject mapObject) {}

    // Rotten village fence
    public static void mapObject9025(Player player, int index, MapObject mapObject) {}

    // Partial fence
    public static void mapObject9026(Player player, int index, MapObject mapObject) {}

    // Short fence
    public static void mapObject9027(Player player, int index, MapObject mapObject) {}

    // Medium fence
    public static void mapObject9028(Player player, int index, MapObject mapObject) {}

    // Village fence
    public static void mapObject9029(Player player, int index, MapObject mapObject) {}

    // Gem Rock
    public static void mapObject9030(Player player, int index, MapObject mapObject) {}

    // Gem Rock
    public static void mapObject9031(Player player, int index, MapObject mapObject) {}

    // Gem Rock
    public static void mapObject9032(Player player, int index, MapObject mapObject) {}

    // Mahogany
    public static void mapObject9034(Player player, int index, MapObject mapObject) {}

    // Teak
    public static void mapObject9036(Player player, int index, MapObject mapObject) {}

    // Hardwood Grove Doors
    public static void mapObject9038(Player player, int index, MapObject mapObject) {}

    // Hardwood Grove Doors
    public static void mapObject9039(Player player, int index, MapObject mapObject) {}

    // Goutweed
    public static void mapObject9044(Player player, int index, MapObject mapObject) {}

    // Goutweed
    public static void mapObject9045(Player player, int index, MapObject mapObject) {}

    // Goutweed
    public static void mapObject9046(Player player, int index, MapObject mapObject) {}

    // Goutweed
    public static void mapObject9047(Player player, int index, MapObject mapObject) {}

    // Goutweed
    public static void mapObject9048(Player player, int index, MapObject mapObject) {}

    // Diseased goutweed
    public static void mapObject9049(Player player, int index, MapObject mapObject) {}

    // Diseased goutweed
    public static void mapObject9050(Player player, int index, MapObject mapObject) {}

    // Diseased goutweed
    public static void mapObject9051(Player player, int index, MapObject mapObject) {}

    // Dead goutweed
    public static void mapObject9052(Player player, int index, MapObject mapObject) {}

    // Dead goutweed
    public static void mapObject9053(Player player, int index, MapObject mapObject) {}

    // Dead goutweed
    public static void mapObject9054(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject9079(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject9080(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject9081(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject9084(Player player, int index, MapObject mapObject) {}

    // Stove
    public static void mapObject9085(Player player, int index, MapObject mapObject) {}

    // Stove
    public static void mapObject9086(Player player, int index, MapObject mapObject) {}

    // Stove
    public static void mapObject9087(Player player, int index, MapObject mapObject) {}

    // Coke
    public static void mapObject9088(Player player, int index, MapObject mapObject) {}

    // Temperature gauge
    public static void mapObject9089(Player player, int index, MapObject mapObject) {}

    // Pump
    public static void mapObject9090(Player player, int index, MapObject mapObject) {}

    // Bars
    public static void mapObject9091(Player player, int index, MapObject mapObject) {}

    // Bar dispenser
    public static void mapObject9092(Player player, int index, MapObject mapObject) {}

    // Bar dispenser
    public static void mapObject9093(Player player, int index, MapObject mapObject) {}

    // Bar dispenser
    public static void mapObject9095(Player player, int index, MapObject mapObject) {}

    // Bar dispenser
    public static void mapObject9096(Player player, int index, MapObject mapObject) {}

    // Pedals
    public static void mapObject9097(Player player, int index, MapObject mapObject) {}

    // Conveyor belt
    public static void mapObject9100(Player player, int index, MapObject mapObject) {}

    // Drive belt
    public static void mapObject9103(Player player, int index, MapObject mapObject) {}

    // Cogs
    public static void mapObject9105(Player player, int index, MapObject mapObject) {}

    // Pipes
    public static void mapObject9117(Player player, int index, MapObject mapObject) {}

    // Pipes
    public static void mapObject9121(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject9138(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9140(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9141(Player player, int index, MapObject mapObject) {}

    // Sink
    public static void mapObject9143(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject9146(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject9147(Player player, int index, MapObject mapObject) {}

    // Net trap
    public static void mapObject9158(Player player, int index, MapObject mapObject) {}

    // Delphinium patch
    public static void mapObject9165(Player player, int index, MapObject mapObject) {}

    // Delphinium patch
    public static void mapObject9166(Player player, int index, MapObject mapObject) {}

    // Delphinium patch
    public static void mapObject9167(Player player, int index, MapObject mapObject) {}

    // Delphinium patch
    public static void mapObject9168(Player player, int index, MapObject mapObject) {}

    // Delphinium patch
    public static void mapObject9169(Player player, int index, MapObject mapObject) {}

    // White rose bush patch
    public static void mapObject9174(Player player, int index, MapObject mapObject) {}

    // Red rose bush patch
    public static void mapObject9175(Player player, int index, MapObject mapObject) {}

    // Pink rose bush patch
    public static void mapObject9176(Player player, int index, MapObject mapObject) {}

    // Pink rose bush patch
    public static void mapObject9177(Player player, int index, MapObject mapObject) {}

    // Pink rose bush patch
    public static void mapObject9178(Player player, int index, MapObject mapObject) {}

    // Pink rose bush patch
    public static void mapObject9179(Player player, int index, MapObject mapObject) {}

    // Pink rose bush patch
    public static void mapObject9180(Player player, int index, MapObject mapObject) {}

    // White rose bush patch
    public static void mapObject9181(Player player, int index, MapObject mapObject) {}

    // White rose bush patch
    public static void mapObject9182(Player player, int index, MapObject mapObject) {}

    // White rose bush patch
    public static void mapObject9183(Player player, int index, MapObject mapObject) {}

    // White rose bush patch
    public static void mapObject9184(Player player, int index, MapObject mapObject) {}

    // Red rose bush patch
    public static void mapObject9185(Player player, int index, MapObject mapObject) {}

    // Red rose bush patch
    public static void mapObject9186(Player player, int index, MapObject mapObject) {}

    // Red rose bush patch
    public static void mapObject9187(Player player, int index, MapObject mapObject) {}

    // Red rose bush patch
    public static void mapObject9188(Player player, int index, MapObject mapObject) {}

    // Plantpot
    public static void mapObject9197(Player player, int index, MapObject mapObject) {}

    // Plantpot
    public static void mapObject9198(Player player, int index, MapObject mapObject) {}

    // Plantpot
    public static void mapObject9203(Player player, int index, MapObject mapObject) {}

    // Plantpot
    public static void mapObject9204(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9209(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9210(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9211(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9212(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9213(Player player, int index, MapObject mapObject) {}
}

