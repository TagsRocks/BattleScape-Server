package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;

public class MapObject74 {
    /* 18944 - 19199 */

    // Winch bucket
    public static void mapObject18951(Player player, int index, MapObject mapObject) {}

    // Wooden cart
    public static void mapObject18958(Player player, int index, MapObject mapObject) {}

    // Wooden cart
    public static void mapObject18959(Player player, int index, MapObject mapObject) {}

    // Cart Camel
    public static void mapObject18960(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject18961(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject18962(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject18963(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject18967(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject18969(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject18973(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject18982(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18987(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3017 && mapObject.getY() == 3849) {
            if (player.getX() != 3017 || player.getY() != 3850) {
                return;
            }
            player.getMovement().teleport(3069, 10255);
        }
    }

    // Ladder
    public static void mapObject18988(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3069 && mapObject.getY() == 10256) {
            player.getMovement().teleport(3016, 3849);
        }
    }

    // Ladder
    public static void mapObject18989(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3069 && mapObject.getY() == 3856) {
            Tile tile = new Tile(3017, 10250, 0);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Ladder
    public static void mapObject18990(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3017 && mapObject.getY() == 10249) {
            Tile tile = new Tile(3069, 3857, 0);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Staircase
    public static void mapObject18991(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject18992(Player player, int index, MapObject mapObject) {}

    // Grain of Plenty
    public static void mapObject19000(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject19001(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject19002(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject19003(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject19004(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject19005(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19025(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19026(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19027(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19028(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19029(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject19030(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject19031(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject19032(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject19034(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject19035(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject19036(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19037(Player player, int index, MapObject mapObject) {}

    // Wintumber tree
    public static void mapObject19038(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19039(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject19040(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject19042(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject19043(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3046 && mapObject.getY() == 10327) {
            player.getMovement().teleport(3048, 10337);
        } else if (mapObject.getX() == 3048 && mapObject.getY() == 10335) {
            player.getMovement().teleport(3046, 10326);
        }
    }

    // Ladder
    public static void mapObject19044(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject19045(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject19047(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject19049(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject19051(Player player, int index, MapObject mapObject) {}

    // Tunnel entrance
    public static void mapObject19053(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19054(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19055(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19056(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19057(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19058(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19059(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19060(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19061(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19062(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19063(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19064(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19066(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19067(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19068(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19069(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19070(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19071(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19072(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19073(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19074(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19075(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19076(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19077(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19078(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19079(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19080(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19081(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19082(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19083(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19084(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19085(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19086(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19087(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19088(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19089(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19090(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19091(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19092(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19093(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19094(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19095(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19096(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19097(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19098(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19099(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19100(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19101(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19102(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19103(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19104(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19105(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19106(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19107(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19108(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19109(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19110(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19111(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject19124(Player player, int index, MapObject mapObject) {}

    // Dirt
    public static void mapObject19125(Player player, int index, MapObject mapObject) {}

    // Plank
    public static void mapObject19126(Player player, int index, MapObject mapObject) {}

    // Candles
    public static void mapObject19127(Player player, int index, MapObject mapObject) {}

    // Basket
    public static void mapObject19128(Player player, int index, MapObject mapObject) {}

    // Basket
    public static void mapObject19129(Player player, int index, MapObject mapObject) {}

    // Basket
    public static void mapObject19133(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject19135(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject19137(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject19139(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject19141(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject19143(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject19145(Player player, int index, MapObject mapObject) {}

    // Tree patch
    public static void mapObject19147(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject19159(Player player, int index, MapObject mapObject) {}

    // Loose Railing
    public static void mapObject19171(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19174(Player player, int index, MapObject mapObject) {}

}


