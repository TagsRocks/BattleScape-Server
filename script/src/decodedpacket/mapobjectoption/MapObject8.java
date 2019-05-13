package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Smithing;

public class MapObject8 {
    /* 2048 - 2303 */

    // Door
    public static void mapObject2048(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2049(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2050(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2051(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2054(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2056(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2057(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2058(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2060(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2062(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2063(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject2064(Player player, int index, MapObject mapObject) {}

    // Rope Ladder
    public static void mapObject2065(Player player, int index, MapObject mapObject) {}

    // Watchtower
    public static void mapObject2067(Player player, int index, MapObject mapObject) {}

    // Fence
    public static void mapObject2068(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2069(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject2071(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject2072(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2073(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2074(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2075(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2076(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2077(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2078(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2079(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2081(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2082(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2083(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2084(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2085(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2086(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2087(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2088(Player player, int index, MapObject mapObject) {}

    // Evergreen
    public static void mapObject2091(Player player, int index, MapObject mapObject) {}

    // Evergreen
    public static void mapObject2092(Player player, int index, MapObject mapObject) {}

    // Anvil
    public static void mapObject2097(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(Smithing.BRONZE_BAR_ID)) {
            Smithing.openSmith(player, Smithing.BRONZE_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.IRON_BAR_ID)) {
            Smithing.openSmith(player, Smithing.IRON_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.STEEL_BAR_ID)) {
            Smithing.openSmith(player, Smithing.STEEL_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.MITHRIL_BAR_ID)) {
            Smithing.openSmith(player, Smithing.MITHRIL_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.ADAMANT_BAR_ID)) {
            Smithing.openSmith(player, Smithing.ADAMANT_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.RUNE_BAR_ID)) {
            Smithing.openSmith(player, Smithing.RUNE_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.BLURITE_BAR_ID)) {
            Smithing.openSmith(player, Smithing.BLURITE_BAR_ID);
        }
    }

    // Door
    public static void mapObject2100(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject2101(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2102(Player player, int index, MapObject mapObject) {
        // Slayer Tower bloodvelds
        if (player.getY() >= 3556) {
            player.getMovement().teleport(player.getX(), 3555, 1);
        } else {
            player.getMovement().teleport(player.getX(), 3556, 1);
        }
    }

    // Door
    public static void mapObject2103(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2104(Player player, int index, MapObject mapObject) {
        // Slayer Tower bloodvelds
        if (player.getY() >= 3556) {
            player.getMovement().teleport(player.getX(), 3555, 1);
        } else {
            player.getMovement().teleport(player.getX(), 3556, 1);
        }
    }

    // Door
    public static void mapObject2105(Player player, int index, MapObject mapObject) {}

    // Danger sign
    public static void mapObject2107(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2108(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject2109(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject2110(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2111(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2112(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2113(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject2114(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(3433, 3537, 1);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Gate
    public static void mapObject2115(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Gate
    public static void mapObject2116(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Old wall
    public static void mapObject2117(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject2118(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(3438, 3537, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Staircase
    public static void mapObject2119(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(3417, 3540, 2);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Staircase
    public static void mapObject2120(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(3412, 3540, 1);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Staircase
    public static void mapObject2121(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject2122(Player player, int index, MapObject mapObject) {}

    // Cave Entrance
    public static void mapObject2123(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2135(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject2141(Player player, int index, MapObject mapObject) {}

    // Prison door
    public static void mapObject2143(Player player, int index, MapObject mapObject) {}

    // Prison door
    public static void mapObject2144(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject2145(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject2146(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2147(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2148(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2154(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2155(Player player, int index, MapObject mapObject) {}

    // Magic Portal
    public static void mapObject2156(Player player, int index, MapObject mapObject) {}

    // Magic Portal
    public static void mapObject2157(Player player, int index, MapObject mapObject) {}

    // Magic Portal
    public static void mapObject2158(Player player, int index, MapObject mapObject) {}

    // Ballista
    public static void mapObject2181(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject2182(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject2183(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2184(Player player, int index, MapObject mapObject) {}

    // Crumbled wall
    public static void mapObject2185(Player player, int index, MapObject mapObject) {}

    // Loose Railing
    public static void mapObject2186(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2515 && mapObject.getY() == 3161) {
            if (player.getY() >= 3161) {
                player.getMovement().teleport(2515, 3160);
            } else {
                player.getMovement().teleport(2515, 3161);
            }
        }
    }

    // Stairs
    public static void mapObject2187(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject2190(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2191(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2194(Player player, int index, MapObject mapObject) {}

    // Kitchen gate
    public static void mapObject2199(Player player, int index, MapObject mapObject) {}

    // Kitchen gate
    public static void mapObject2200(Player player, int index, MapObject mapObject) {}

    // Telescope
    public static void mapObject2210(Player player, int index, MapObject mapObject) {}

    // Grave of Scorpius
    public static void mapObject2211(Player player, int index, MapObject mapObject) {}

    // Broken cart
    public static void mapObject2216(Player player, int index, MapObject mapObject) {}

    // Mound of earth
    public static void mapObject2217(Player player, int index, MapObject mapObject) {}

    // Fissure
    public static void mapObject2218(Player player, int index, MapObject mapObject) {}

    // Fissure
    public static void mapObject2219(Player player, int index, MapObject mapObject) {}

    // Cave in
    public static void mapObject2220(Player player, int index, MapObject mapObject) {}

    // Strange looking stone
    public static void mapObject2221(Player player, int index, MapObject mapObject) {}

    // Loose rocks
    public static void mapObject2222(Player player, int index, MapObject mapObject) {}

    // Old sacks
    public static void mapObject2223(Player player, int index, MapObject mapObject) {}

    // Ancient gallows
    public static void mapObject2224(Player player, int index, MapObject mapObject) {}

    // Waterfall rocks
    public static void mapObject2225(Player player, int index, MapObject mapObject) {}

    // Smashed table
    public static void mapObject2226(Player player, int index, MapObject mapObject) {}

    // Crude raft
    public static void mapObject2227(Player player, int index, MapObject mapObject) {}

    // Tribal Statue
    public static void mapObject2229(Player player, int index, MapObject mapObject) {}

    // Travel cart
    public static void mapObject2230(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject2231(Player player, int index, MapObject mapObject) {}

    // Well stacked rocks
    public static void mapObject2234(Player player, int index, MapObject mapObject) {}

    // Tomb dolmen
    public static void mapObject2235(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject2236(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject2237(Player player, int index, MapObject mapObject) {}

    // Hillside entrance
    public static void mapObject2238(Player player, int index, MapObject mapObject) {}

    // Hillside entrance
    public static void mapObject2239(Player player, int index, MapObject mapObject) {}

    // Carved doors
    public static void mapObject2240(Player player, int index, MapObject mapObject) {}

    // Carved doors
    public static void mapObject2241(Player player, int index, MapObject mapObject) {}

    // Tomb exit
    public static void mapObject2242(Player player, int index, MapObject mapObject) {}

    // Tomb exit
    public static void mapObject2243(Player player, int index, MapObject mapObject) {}

    // Tomb doors
    public static void mapObject2246(Player player, int index, MapObject mapObject) {}

    // Tomb doors
    public static void mapObject2247(Player player, int index, MapObject mapObject) {}

    // Tomb doors
    public static void mapObject2248(Player player, int index, MapObject mapObject) {}

    // Tomb doors
    public static void mapObject2249(Player player, int index, MapObject mapObject) {}

    // Tomb doors
    public static void mapObject2250(Player player, int index, MapObject mapObject) {}

    // Tomb exit
    public static void mapObject2253(Player player, int index, MapObject mapObject) {}

    // Tomb exit
    public static void mapObject2254(Player player, int index, MapObject mapObject) {}

    // Ancient metal gate
    public static void mapObject2255(Player player, int index, MapObject mapObject) {}

    // Ancient metal gate
    public static void mapObject2256(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject2257(Player player, int index, MapObject mapObject) {}

    // Tomb dolmen
    public static void mapObject2258(Player player, int index, MapObject mapObject) {}

    // Metal gate
    public static void mapObject2259(Player player, int index, MapObject mapObject) {}

    // Metal gate
    public static void mapObject2260(Player player, int index, MapObject mapObject) {}

    // Wooden gate
    public static void mapObject2261(Player player, int index, MapObject mapObject) {}

    // Wooden gate
    public static void mapObject2262(Player player, int index, MapObject mapObject) {}

    // Travel cart
    public static void mapObject2265(Player player, int index, MapObject mapObject) {}

    // Blacksmith's door
    public static void mapObject2266(Player player, int index, MapObject mapObject) {}

    // Blacksmith's door
    public static void mapObject2267(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2268(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2269(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2271(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2272(Player player, int index, MapObject mapObject) {}
}

