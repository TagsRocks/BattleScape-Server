/* 2048 - 2303 */

// Door
DecodedPacketObjectOption.prototype.object_2048 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2049 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2050 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2051 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2054 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_2056 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_2057 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2058 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2060 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_2062 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_2063 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_2064 = function(player, index, object) { }

// Rope Ladder
DecodedPacketObjectOption.prototype.object_2065 = function(player, index, object) { }

// Watchtower
DecodedPacketObjectOption.prototype.object_2067 = function(player, index, object) { }

// Fence
DecodedPacketObjectOption.prototype.object_2068 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2069 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_2071 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_2072 = function(player, index, object) { }

// Banana Tree
DecodedPacketObjectOption.prototype.object_2073 = function(player, index, object) { }

// Banana Tree
DecodedPacketObjectOption.prototype.object_2074 = function(player, index, object) { }

// Banana Tree
DecodedPacketObjectOption.prototype.object_2075 = function(player, index, object) { }

// Banana Tree
DecodedPacketObjectOption.prototype.object_2076 = function(player, index, object) { }

// Banana Tree
DecodedPacketObjectOption.prototype.object_2077 = function(player, index, object) { }

// Banana Tree
DecodedPacketObjectOption.prototype.object_2078 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2079 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_2081 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_2082 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_2083 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_2084 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_2085 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_2086 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_2087 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_2088 = function(player, index, object) { }

// Evergreen
DecodedPacketObjectOption.prototype.object_2091 = function(player, index, object) { }

// Evergreen
DecodedPacketObjectOption.prototype.object_2092 = function(player, index, object) { }

// Anvil
DecodedPacketObjectOption.prototype.object_2097 = function(player, index, object) {
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
DecodedPacketObjectOption.prototype.object_2100 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Door
DecodedPacketObjectOption.prototype.object_2101 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2102 = function(player, index, object) {
    // Slayer Tower bloodvelds
    if (player.getY() >= 3556) {
        player.getMovement().teleport(player.getX(), 3555, 1);
    } else {
        player.getMovement().teleport(player.getX(), 3556, 1);
    }
}

// Door
DecodedPacketObjectOption.prototype.object_2103 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2104 = function(player, index, object) {
    // Slayer Tower bloodvelds
    if (player.getY() >= 3556) {
        player.getMovement().teleport(player.getX(), 3555, 1);
    } else {
        player.getMovement().teleport(player.getX(), 3556, 1);
    }
}

// Door
DecodedPacketObjectOption.prototype.object_2105 = function(player, index, object) { }

// Danger sign
DecodedPacketObjectOption.prototype.object_2107 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2108 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_2109 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_2110 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2111 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2112 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2113 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_2114 = function(player, index, object) {
    // Slayer Tower
    var tile = new Tile(3433, 3537, 1);
    player.getMovement().ladderUpTeleport(tile);
}

// Gate
DecodedPacketObjectOption.prototype.object_2115 = function(player, index, object) {
    Region.openGates(player, object);
}

// Gate
DecodedPacketObjectOption.prototype.object_2116 = function(player, index, object) {
    Region.openGates(player, object);
}

// Old wall
DecodedPacketObjectOption.prototype.object_2117 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_2118 = function(player, index, object) {
    // Slayer Tower
    var tile = new Tile(3438, 3537, 0);
    player.getMovement().ladderDownTeleport(tile);
}

// Staircase
DecodedPacketObjectOption.prototype.object_2119 = function(player, index, object) {
    // Slayer Tower
    var tile = new Tile(3417, 3540, 2);
    player.getMovement().ladderUpTeleport(tile);
}

// Staircase
DecodedPacketObjectOption.prototype.object_2120 = function(player, index, object) {
    // Slayer Tower
    var tile = new Tile(3412, 3540, 1);
    player.getMovement().ladderDownTeleport(tile);
}

// Staircase
DecodedPacketObjectOption.prototype.object_2121 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_2122 = function(player, index, object) { }

// Cave Entrance
DecodedPacketObjectOption.prototype.object_2123 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_2135 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_2141 = function(player, index, object) { }

// Prison door
DecodedPacketObjectOption.prototype.object_2143 = function(player, index, object) { }

// Prison door
DecodedPacketObjectOption.prototype.object_2144 = function(player, index, object) { }

// Coffin
DecodedPacketObjectOption.prototype.object_2145 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_2146 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2147 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2148 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2154 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2155 = function(player, index, object) { }

// Magic Portal
DecodedPacketObjectOption.prototype.object_2156 = function(player, index, object) { }

// Magic Portal
DecodedPacketObjectOption.prototype.object_2157 = function(player, index, object) { }

// Magic Portal
DecodedPacketObjectOption.prototype.object_2158 = function(player, index, object) { }

// Ballista
DecodedPacketObjectOption.prototype.object_2181 = function(player, index, object) { }

// Open chest
DecodedPacketObjectOption.prototype.object_2182 = function(player, index, object) { }

// Closed chest
DecodedPacketObjectOption.prototype.object_2183 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2184 = function(player, index, object) { }

// Crumbled wall
DecodedPacketObjectOption.prototype.object_2185 = function(player, index, object) { }

// Loose Railing
DecodedPacketObjectOption.prototype.object_2186 = function(player, index, object) {
    if (object.getX() == 2515 && object.getY() == 3161) {
        if (player.getY() >= 3161) {
            player.getMovement().teleport(2515, 3160);
        } else {
            player.getMovement().teleport(2515, 3161);
        }
    }
}

// Stairs
DecodedPacketObjectOption.prototype.object_2187 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_2190 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2191 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2194 = function(player, index, object) { }

// Kitchen gate
DecodedPacketObjectOption.prototype.object_2199 = function(player, index, object) { }

// Kitchen gate
DecodedPacketObjectOption.prototype.object_2200 = function(player, index, object) { }

// Telescope
DecodedPacketObjectOption.prototype.object_2210 = function(player, index, object) { }

// Grave of Scorpius
DecodedPacketObjectOption.prototype.object_2211 = function(player, index, object) { }

// Broken cart
DecodedPacketObjectOption.prototype.object_2216 = function(player, index, object) { }

// Mound of earth
DecodedPacketObjectOption.prototype.object_2217 = function(player, index, object) { }

// Fissure
DecodedPacketObjectOption.prototype.object_2218 = function(player, index, object) { }

// Fissure
DecodedPacketObjectOption.prototype.object_2219 = function(player, index, object) { }

// Cave in
DecodedPacketObjectOption.prototype.object_2220 = function(player, index, object) { }

// Strange looking stone
DecodedPacketObjectOption.prototype.object_2221 = function(player, index, object) { }

// Loose rocks
DecodedPacketObjectOption.prototype.object_2222 = function(player, index, object) { }

// Old sacks
DecodedPacketObjectOption.prototype.object_2223 = function(player, index, object) { }

// Ancient gallows
DecodedPacketObjectOption.prototype.object_2224 = function(player, index, object) { }

// Waterfall rocks
DecodedPacketObjectOption.prototype.object_2225 = function(player, index, object) { }

// Smashed table
DecodedPacketObjectOption.prototype.object_2226 = function(player, index, object) { }

// Crude raft
DecodedPacketObjectOption.prototype.object_2227 = function(player, index, object) { }

// Tribal Statue
DecodedPacketObjectOption.prototype.object_2229 = function(player, index, object) { }

// Travel cart
DecodedPacketObjectOption.prototype.object_2230 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_2231 = function(player, index, object) { }

// Well stacked rocks
DecodedPacketObjectOption.prototype.object_2234 = function(player, index, object) { }

// Tomb dolmen
DecodedPacketObjectOption.prototype.object_2235 = function(player, index, object) { }

// Climbing rocks
DecodedPacketObjectOption.prototype.object_2236 = function(player, index, object) { }

// Palm tree
DecodedPacketObjectOption.prototype.object_2237 = function(player, index, object) { }

// Hillside entrance
DecodedPacketObjectOption.prototype.object_2238 = function(player, index, object) { }

// Hillside entrance
DecodedPacketObjectOption.prototype.object_2239 = function(player, index, object) { }

// Carved doors
DecodedPacketObjectOption.prototype.object_2240 = function(player, index, object) { }

// Carved doors
DecodedPacketObjectOption.prototype.object_2241 = function(player, index, object) { }

// Tomb exit
DecodedPacketObjectOption.prototype.object_2242 = function(player, index, object) { }

// Tomb exit
DecodedPacketObjectOption.prototype.object_2243 = function(player, index, object) { }

// Tomb doors
DecodedPacketObjectOption.prototype.object_2246 = function(player, index, object) { }

// Tomb doors
DecodedPacketObjectOption.prototype.object_2247 = function(player, index, object) { }

// Tomb doors
DecodedPacketObjectOption.prototype.object_2248 = function(player, index, object) { }

// Tomb doors
DecodedPacketObjectOption.prototype.object_2249 = function(player, index, object) { }

// Tomb doors
DecodedPacketObjectOption.prototype.object_2250 = function(player, index, object) { }

// Tomb exit
DecodedPacketObjectOption.prototype.object_2253 = function(player, index, object) { }

// Tomb exit
DecodedPacketObjectOption.prototype.object_2254 = function(player, index, object) { }

// Ancient metal gate
DecodedPacketObjectOption.prototype.object_2255 = function(player, index, object) { }

// Ancient metal gate
DecodedPacketObjectOption.prototype.object_2256 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_2257 = function(player, index, object) { }

// Tomb dolmen
DecodedPacketObjectOption.prototype.object_2258 = function(player, index, object) { }

// Metal gate
DecodedPacketObjectOption.prototype.object_2259 = function(player, index, object) { }

// Metal gate
DecodedPacketObjectOption.prototype.object_2260 = function(player, index, object) { }

// Wooden gate
DecodedPacketObjectOption.prototype.object_2261 = function(player, index, object) { }

// Wooden gate
DecodedPacketObjectOption.prototype.object_2262 = function(player, index, object) { }

// Travel cart
DecodedPacketObjectOption.prototype.object_2265 = function(player, index, object) { }

// Blacksmith's door
DecodedPacketObjectOption.prototype.object_2266 = function(player, index, object) { }

// Blacksmith's door
DecodedPacketObjectOption.prototype.object_2267 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2268 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2269 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_2271 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_2272 = function(player, index, object) { }
