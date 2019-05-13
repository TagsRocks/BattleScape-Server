package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;

public class MapObject134 {
    /* 34304 - 34559 */

    // redwood tree
    public static void mapObject34304(Player player, int index, MapObject mapObject) {}

    // redwood tree
    public static void mapObject34305(Player player, int index, MapObject mapObject) {}

    // redwood tree
    public static void mapObject34306(Player player, int index, MapObject mapObject) {}

    // redwood tree
    public static void mapObject34307(Player player, int index, MapObject mapObject) {}

    // redwood tree
    public static void mapObject34308(Player player, int index, MapObject mapObject) {}

    // redwood tree
    public static void mapObject34309(Player player, int index, MapObject mapObject) {}

    // redwood tree
    public static void mapObject34310(Player player, int index, MapObject mapObject) {}

    // redwood tree
    public static void mapObject34311(Player player, int index, MapObject mapObject) {}

    // volcanic furnace
    public static void mapObject34342(Player player, int index, MapObject mapObject) {}

    // bank chest
    public static void mapObject34343(Player player, int index, MapObject mapObject) {}

    // bank deposit box
    public static void mapObject34344(Player player, int index, MapObject mapObject) {}

    // elevator controls
    public static void mapObject34356(Player player, int index, MapObject mapObject) {}

    // elevator
    public static void mapObject34359(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject34396(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject34397(Player player, int index, MapObject mapObject) {}

    // lizard dwelling
    public static void mapObject34402(Player player, int index, MapObject mapObject) {}

    // lizard dwelling
    public static void mapObject34403(Player player, int index, MapObject mapObject) {}

    // lizard dwelling
    public static void mapObject34404(Player player, int index, MapObject mapObject) {}

    // lizard dwelling
    public static void mapObject34405(Player player, int index, MapObject mapObject) {}

    // strange hole
    public static void mapObject34422(Player player, int index, MapObject mapObject) {}

    // stone chest
    public static void mapObject34429(Player player, int index, MapObject mapObject) {}

    // stone chest
    public static void mapObject34431(Player player, int index, MapObject mapObject) {}

    // mystical barrier
    public static void mapObject34432(Player player, int index, MapObject mapObject) {}

    // mystical barrier (orange)
    public static void mapObject34433(Player player, int index, MapObject mapObject) {}

    // mystical barrier (red)
    public static void mapObject34434(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject34435(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject34436(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject34463(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject34464(Player player, int index, MapObject mapObject) {}

    // gate
    public static void mapObject34469(Player player, int index, MapObject mapObject) {}

    // gate
    public static void mapObject34470(Player player, int index, MapObject mapObject) {}

    // gate
    public static void mapObject34473(Player player, int index, MapObject mapObject) {}

    // gate
    public static void mapObject34474(Player player, int index, MapObject mapObject) {}

    // rope ladder
    public static void mapObject34477(Player player, int index, MapObject mapObject) {}

    // rope ladder
    public static void mapObject34478(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject34499(Player player, int index, MapObject mapObject) {}

    // bed
    public static void mapObject34501(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject34502(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject34503(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject34504(Player player, int index, MapObject mapObject) {}

    // shelves
    public static void mapObject34505(Player player, int index, MapObject mapObject) {}

    // shelves
    public static void mapObject34506(Player player, int index, MapObject mapObject) {}

    // shelves
    public static void mapObject34507(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject34508(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject34509(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject34510(Player player, int index, MapObject mapObject) {}

    // elevator controls
    public static void mapObject34513(Player player, int index, MapObject mapObject) {}

    // cave exit
    public static void mapObject34514(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(1311, 3805));
    }

    // lava gap
    public static void mapObject34515(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1269 && mapObject.getY() == 10171) {
            if (player.getY() >= 10175) {
                player.getMovement().teleport(1270, 10170);
            } else {
                player.getMovement().teleport(1270, 10175);
            }
        } else if (mapObject.getX() == 1307 && mapObject.getY() == 10253) {
            if (player.getY() <= 10252) {
                player.getMovement().teleport(1308, 10257);
            } else {
                player.getMovement().teleport(1308, 10252);
            }
        }
    }

    // tunnel
    public static void mapObject34516(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1330 && mapObject.getY() == 10238) {
            if (player.getX() <= 1329) {
                player.getMovement().teleport(1336, 10239, 1);
            } else {
                player.getMovement().teleport(1329, 10239, 1);
            }
        }
    }

    // steps
    public static void mapObject34530(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1330 && mapObject.getY() == 10205) {
            player.getMovement().ladderUpTeleport(new Tile(1334, 10205, 1));
        }
    }

    // steps
    public static void mapObject34531(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1330 && mapObject.getY() == 10205) {
            player.getMovement().ladderDownTeleport(new Tile(1329, 10205));
        }
    }

    // rocks
    public static void mapObject34544(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1302 && mapObject.getY() == 10205) {
            if (player.getX() >= 1303) {
                player.getMovement().teleport(1301, 10205);
            } else {
                player.getMovement().teleport(1303, 10205);
            }
        } else if (mapObject.getX() == 1321 && mapObject.getY() == 10205) {
            if (player.getX() <= 1320) {
                player.getMovement().teleport(1322, 10205);
            } else {
                player.getMovement().teleport(1320, 10205);
            }
        } else if (mapObject.getX() == 1311 && mapObject.getY() == 10215) {
            if (player.getY() <= 10214) {
                player.getMovement().teleport(1311, 10216);
            } else {
                player.getMovement().teleport(1311, 10214);
            }
        }
    }

    // rocks
    public static void mapObject34548(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1351 && mapObject.getY() == 10251) {
            if (player.getY() <= 10250) {
                player.getMovement().teleport(1351, 10252);
            } else {
                player.getMovement().teleport(1351, 10250);
            }
        }
    }

    // alchemical door
    public static void mapObject34553(Player player, int index, MapObject mapObject) {
        if (player.getX() <= 1355) {
            player.openDialogue("bossinstance", 14);
        } else {
            player.getController().stopWithTeleport();
            player.getMovement().teleport(1355, 10258);
        }
    }

    // alchemical door
    public static void mapObject34554(Player player, int index, MapObject mapObject) {
        if (player.getX() <= 1355) {
            player.openDialogue("bossinstance", 14);
        } else {
            player.getController().stopWithTeleport();
            player.getMovement().teleport(1355, 10258);
        }
    }

}


