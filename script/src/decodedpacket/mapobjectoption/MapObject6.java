package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.player.Player;

public class MapObject6 {
    /* 1536 - 1791 */

    // Door
    public static void mapObject1536(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1537(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1538(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1540(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // Door
    public static void mapObject1541(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1543(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1544(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1546(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // Door
    public static void mapObject1547(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1549(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1550(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1551(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1552(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1558(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1559(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1560(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1561(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1562(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1563(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1564(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1567(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1568(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Gate
    public static void mapObject1569(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Gate
    public static void mapObject1571(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1572(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject1579(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3097 && mapObject.getY() == 3468) {
            // Edgeville dungeon
            player.getMovement().ladderUpTeleport(new Tile(3096, 9867));
        }
    }

    // Trapdoor
    public static void mapObject1580(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject1581(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3097 && mapObject.getY() == 3487) {
            // Edgeville dungeon
            player.getMovement().ladderUpTeleport(new Tile(3096, 9867));
        }
    }

    // Trapdoor
    public static void mapObject1582(Player player, int index, MapObject mapObject) {}

    // Doors
    public static void mapObject1584(Player player, int index, MapObject mapObject) {}

    // Doors
    public static void mapObject1585(Player player, int index, MapObject mapObject) {}

    // Doors
    public static void mapObject1586(Player player, int index, MapObject mapObject) {}

    // Doors
    public static void mapObject1587(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject1594(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject1595(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject1597(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject1598(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1600(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1601(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1722(Player player, int index, MapObject mapObject) {}

    // Odd looking wall
    public static void mapObject1723(Player player, int index, MapObject mapObject) {}

    // Dungeon door
    public static void mapObject1725(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1726(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1727(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1728(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1729(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1730(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1731(Player player, int index, MapObject mapObject) {}

    // Magic guild door
    public static void mapObject1732(Player player, int index, MapObject mapObject) {}

    // Magic guild door
    public static void mapObject1733(Player player, int index, MapObject mapObject) {}

    // Odd looking wall
    public static void mapObject1734(Player player, int index, MapObject mapObject) {}

    // Odd looking wall
    public static void mapObject1736(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject1738(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3008 && mapObject.getY() == 3150) {
            // Asgarnian Ice Dungeon entrance
            Tile tile = new Tile(3007, 9550, 0);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Willow
    public static void mapObject1750(Player player, int index, MapObject mapObject) {}

    // Oak
    public static void mapObject1751(Player player, int index, MapObject mapObject) {}

    // Hollow tree
    public static void mapObject1752(Player player, int index, MapObject mapObject) {}

    // Yew
    public static void mapObject1753(Player player, int index, MapObject mapObject) {}

    // Yew
    public static void mapObject1754(Player player, int index, MapObject mapObject) {}

    // Yew
    public static void mapObject1755(Player player, int index, MapObject mapObject) {}

    // Willow
    public static void mapObject1756(Player player, int index, MapObject mapObject) {}

    // Hollow tree
    public static void mapObject1757(Player player, int index, MapObject mapObject) {}

    // Willow
    public static void mapObject1758(Player player, int index, MapObject mapObject) {}

    // Maple tree
    public static void mapObject1759(Player player, int index, MapObject mapObject) {}

    // Willow
    public static void mapObject1760(Player player, int index, MapObject mapObject) {}

    // Magic tree
    public static void mapObject1761(Player player, int index, MapObject mapObject) {}

    // Magic tree
    public static void mapObject1762(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject1764(Player player, int index, MapObject mapObject) {}

    // Flour bin
    public static void mapObject1781(Player player, int index, MapObject mapObject) {}

    // Flour bin
    public static void mapObject1782(Player player, int index, MapObject mapObject) {}
}

