package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.player.Player;

public class MapObject118 {
    /* 30208 - 30463 */

    // rope
    public static void mapObject30234(Player player, int index, MapObject mapObject) {}

    // chasm
    public static void mapObject30236(Player player, int index, MapObject mapObject) {}

    // Lift
    public static void mapObject30258(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1437 && mapObject.getY() == 10094) {
            player.getMovement().ladderUpTeleport(new Tile(1437, 10093, 2));
        } else if (mapObject.getX() == 1452 && mapObject.getY() == 10068) {
            player.getMovement().ladderUpTeleport(new Tile(1451, 10069, 2));
        } else if (mapObject.getX() == 1458 && mapObject.getY() == 10095) {
            player.getMovement().ladderUpTeleport(new Tile(1457, 10095, 1));
        }
    }

    // Lift
    public static void mapObject30259(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1437 && mapObject.getY() == 10094) {
            player.getMovement().ladderUpTeleport(new Tile(1437, 10093, 3));
        } else if (mapObject.getX() == 1452 && mapObject.getY() == 10068) {
            player.getMovement().ladderUpTeleport(new Tile(1451, 10069, 3));
        } else if (mapObject.getX() == 1458 && mapObject.getY() == 10095) {
            player.getMovement().ladderUpTeleport(new Tile(1457, 10095, 2));
        }
    }

    // hot vent door
    public static void mapObject30266(Player player, int index, MapObject mapObject) {}

    // bank chest
    public static void mapObject30267(Player player, int index, MapObject mapObject) {}

    // bank deposit box
    public static void mapObject30268(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // shop counter
    public static void mapObject30279(Player player, int index, MapObject mapObject) {}

    // shop counter
    public static void mapObject30280(Player player, int index, MapObject mapObject) {}

    // the inferno
    public static void mapObject30282(Player player, int index, MapObject mapObject) {}

    // cave exit
    public static void mapObject30283(Player player, int index, MapObject mapObject) {
        player.getTzHaar().exitInferno();
    }

    // the inferno
    public static void mapObject30352(Player player, int index, MapObject mapObject) {
        if (player.getTzHaar().getInfernoSacrificedCape()) {
            player.openDialogue("tzhaar", 4);
        } else {
            player.openDialogue("tzhaar", 5);
        }
    }

    // barrel
    public static void mapObject30357(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject30364(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // door
    public static void mapObject30365(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // door
    public static void mapObject30366(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // ladder
    public static void mapObject30367(Player player, int index, MapObject mapObject) {}

    // crystals
    public static void mapObject30371(Player player, int index, MapObject mapObject) {}

    // crystals
    public static void mapObject30372(Player player, int index, MapObject mapObject) {}

    // empty wall
    public static void mapObject30373(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject30374(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject30375(Player player, int index, MapObject mapObject) {}

    // row boat
    public static void mapObject30376(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2614, 3440);
    }

    // row boat
    public static void mapObject30377(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2600, 3425);
    }

    // lizardman lair
    public static void mapObject30380(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(1305, 9973, 0));
    }

    // crevice
    public static void mapObject30381(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(1309, 3574, 0));
    }

    // crevice
    public static void mapObject30382(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1305 && mapObject.getY() == 9954) {
            player.getMovement().teleport(1305, 9957);
        } else if (mapObject.getX() == 1318 && mapObject.getY() == 9957) {
            player.getMovement().teleport(1318, 9960);
        }
    }

    // crevice
    public static void mapObject30383(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1305 && mapObject.getY() == 9956) {
            player.getMovement().teleport(1305, 9953);
        } else if (mapObject.getX() == 1318 && mapObject.getY() == 9959) {
            player.getMovement().teleport(1318, 9956);
        }
    }

    // crevice
    public static void mapObject30384(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1296 && mapObject.getY() == 9959) {
            player.getMovement().teleport(1299, 9959);
        } else if (mapObject.getX() == 1320 && mapObject.getY() == 9966) {
            player.getMovement().teleport(1323, 9966);
        }
    }

    // crevice
    public static void mapObject30385(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1298 && mapObject.getY() == 9959) {
            player.getMovement().teleport(1295, 9959);
        } else if (mapObject.getX() == 1322 && mapObject.getY() == 9966) {
            player.getMovement().teleport(1319, 9966);
        }
    }

    // castle wars portal
    public static void mapObject30386(Player player, int index, MapObject mapObject) {}

    // large door
    public static void mapObject30387(Player player, int index, MapObject mapObject) {}

    // large door
    public static void mapObject30388(Player player, int index, MapObject mapObject) {}

    // grand exchange booth
    public static void mapObject30389(Player player, int index, MapObject mapObject) {}

    // grand exchange booth
    public static void mapObject30390(Player player, int index, MapObject mapObject) {}

    // iron ladder
    public static void mapObject30391(Player player, int index, MapObject mapObject) {}

    // iron ladder
    public static void mapObject30392(Player player, int index, MapObject mapObject) {}

    // inactive portal
    public static void mapObject30395(Player player, int index, MapObject mapObject) {}

    // shimmering barrier
    public static void mapObject30396(Player player, int index, MapObject mapObject) {}

    // shimmering barrier
    public static void mapObject30397(Player player, int index, MapObject mapObject) {}

    // shimmering barrier
    public static void mapObject30398(Player player, int index, MapObject mapObject) {}

    // shimmering barrier
    public static void mapObject30399(Player player, int index, MapObject mapObject) {}

    // shimmering barrier
    public static void mapObject30400(Player player, int index, MapObject mapObject) {}

    // mounted champion's cape
    public static void mapObject30403(Player player, int index, MapObject mapObject) {}

    // mahogany sapling
    public static void mapObject30406(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30407(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30408(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30409(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30410(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30411(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30412(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30413(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30414(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30415(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30416(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30417(Player player, int index, MapObject mapObject) {}

    // mahogany tree stump
    public static void mapObject30418(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30419(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30420(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30421(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30422(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30423(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30424(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30425(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30426(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30427(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30428(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30429(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30430(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30431(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30432(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30433(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30434(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30435(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30436(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30437(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30438(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30439(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30440(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30441(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30442(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30443(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30444(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30445(Player player, int index, MapObject mapObject) {}

    // tree stump
    public static void mapObject30446(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30447(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30448(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30449(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30450(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30451(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30452(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30453(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30454(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30455(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30456(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30457(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30458(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30459(Player player, int index, MapObject mapObject) {}

}


