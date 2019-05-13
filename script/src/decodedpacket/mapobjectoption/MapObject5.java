package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.Player;

public class MapObject5 {
    /* 1280 - 1535 */

    // Tree
    public static void mapObject1280(Player player, int index, MapObject mapObject) {}

    // Cage door
    public static void mapObject1281(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1282(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1283(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1284(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1285(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1286(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1289(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1290(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1291(Player player, int index, MapObject mapObject) {}

    // Dramen tree
    public static void mapObject1292(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(" axe") && !player.getEquipment().hasItem(" axe")) {
            player.getGameEncoder().sendMessage("You need an axe to chop down this tree.");
            return;
        }
        if (player.getWorld().getTargetNPC(1163, player) != null) {
            return;
        }
        Npc treeSpiritNPC = new Npc(player.getController(), 1163, new Tile(2860, 9736, player.getHeight()));
        treeSpiritNPC.setForceMessage("You must defeat me before touching the tree!");
        treeSpiritNPC.getCombat().setTarget(player);
    }

    // Spirit tree
    public static void mapObject1293(Player player, int index, MapObject mapObject) {
        player.openDialogue("spirittree", 0);
    }

    // Spirit tree
    public static void mapObject1294(Player player, int index, MapObject mapObject) {
        player.openDialogue("spirittree", 0);
    }

    // Spirit tree
    public static void mapObject1295(Player player, int index, MapObject mapObject) {
        player.openDialogue("spirittree", 0);
    }

    // Evergreen
    public static void mapObject1318(Player player, int index, MapObject mapObject) {}

    // Evergreen
    public static void mapObject1319(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject1330(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject1331(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject1332(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1365(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1383(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1384(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1408(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1409(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1410(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1411(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1412(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1413(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1511(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Large door
    public static void mapObject1512(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1513(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Large door
    public static void mapObject1516(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1517(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1518(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1519(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1520(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1521(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Large door
    public static void mapObject1522(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1524(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Large door
    public static void mapObject1525(Player player, int index, MapObject mapObject) {}

    // Curtain
    public static void mapObject1531(Player player, int index, MapObject mapObject) {}

    // Curtain
    public static void mapObject1533(Player player, int index, MapObject mapObject) {}

    // Curtain
    public static void mapObject1534(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1535(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }
}

