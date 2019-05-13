package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;

public class MapObject125 {
    /* 32000 - 32255 */

    // cave entrance
    public static void mapObject32047(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject32052(Player player, int index, MapObject mapObject) {}

    // stone chest
    public static void mapObject32053(Player player, int index, MapObject mapObject) {}

    // lever
    public static void mapObject32056(Player player, int index, MapObject mapObject) {}

    // ancient machinery
    public static void mapObject32073(Player player, int index, MapObject mapObject) {}

    // ancient machinery
    public static void mapObject32074(Player player, int index, MapObject mapObject) {}

    // ancient equipment
    public static void mapObject32075(Player player, int index, MapObject mapObject) {}

    // ancient incubator
    public static void mapObject32076(Player player, int index, MapObject mapObject) {}

    // ancient equipment
    public static void mapObject32077(Player player, int index, MapObject mapObject) {}

    // ancient incubator
    public static void mapObject32078(Player player, int index, MapObject mapObject) {}

    // rowboat
    public static void mapObject32079(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject32080(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32081(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32082(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32083(Player player, int index, MapObject mapObject) {}

    // trapdoor
    public static void mapObject32084(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32089(Player player, int index, MapObject mapObject) {}

    // skeleton
    public static void mapObject32091(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject32112(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject32113(Player player, int index, MapObject mapObject) {}

    // grandiose doors
    public static void mapObject32114(Player player, int index, MapObject mapObject) {}

    // grandiose doors
    public static void mapObject32115(Player player, int index, MapObject mapObject) {}

    // grandiose doors
    public static void mapObject32116(Player player, int index, MapObject mapObject) {}

    // broken grandiose doors
    public static void mapObject32117(Player player, int index, MapObject mapObject) {}

    // broken grandiose doors
    public static void mapObject32132(Player player, int index, MapObject mapObject) {}

    // grandiose doors
    public static void mapObject32133(Player player, int index, MapObject mapObject) {}

    // mural
    public static void mapObject32144(Player player, int index, MapObject mapObject) {}

    // barrier
    public static void mapObject32153(Player player, int index, MapObject mapObject) {
        if (mapObject.getDirection() == 1) {
            if (player.getX() > mapObject.getX()) {
                player.openDialogue("lithkrenvault", 0);
            } else {
                player.getMovement().teleport(1562, 5074);
            }
        } else if (mapObject.getDirection() == 3) {
            if (player.getX() < mapObject.getX()) {
                player.openDialogue("lithkrenvault", 1);
            } else {
                player.getMovement().teleport(1573, 5074);
            }
        }
    }

    // machinery
    public static void mapObject32156(Player player, int index, MapObject mapObject) {}

    // machinery
    public static void mapObject32157(Player player, int index, MapObject mapObject) {}

    // ancient machinery
    public static void mapObject32158(Player player, int index, MapObject mapObject) {}

    // incubator
    public static void mapObject32159(Player player, int index, MapObject mapObject) {}

    // incubator
    public static void mapObject32160(Player player, int index, MapObject mapObject) {}

    // machinery
    public static void mapObject32161(Player player, int index, MapObject mapObject) {}

    // stone crate
    public static void mapObject32162(Player player, int index, MapObject mapObject) {}

    // blockage
    public static void mapObject32165(Player player, int index, MapObject mapObject) {}

    // blockage
    public static void mapObject32166(Player player, int index, MapObject mapObject) {}

    // blockage
    public static void mapObject32167(Player player, int index, MapObject mapObject) {}

    // blockage
    public static void mapObject32168(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject32169(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject32170(Player player, int index, MapObject mapObject) {}

    // ancient machinery
    public static void mapObject32185(Player player, int index, MapObject mapObject) {}

    // cave entrance
    public static void mapObject32198(Player player, int index, MapObject mapObject) {}

    // ancient mural
    public static void mapObject32203(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32205(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32206(Player player, int index, MapObject mapObject) {}

    // mithril door
    public static void mapObject32208(Player player, int index, MapObject mapObject) {}

    // rough hewn steps
    public static void mapObject32211(Player player, int index, MapObject mapObject) {}

    // rough hewn steps
    public static void mapObject32212(Player player, int index, MapObject mapObject) {}

    // anvil
    public static void mapObject32215(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject32235(Player player, int index, MapObject mapObject) {}

}


