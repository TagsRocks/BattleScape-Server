/* 2048 - 2303 */

// Fritz the Glassblower
DecodedPacketNpcOption.prototype.npc_2053 = function(player, index, npc) { }

// Chaos Elemental Jr.
DecodedPacketNpcOption.prototype.npc_2055 = function(player, index, npc) { }

// Dodgy Squire
DecodedPacketNpcOption.prototype.npc_2060 = function(player, index, npc) { }

// Glough
DecodedPacketNpcOption.prototype.npc_2061 = function(player, index, npc) { }

// Ork
DecodedPacketNpcOption.prototype.npc_2104 = function(player, index, npc) { }

// Ork
DecodedPacketNpcOption.prototype.npc_2105 = function(player, index, npc) { }

// Ork
DecodedPacketNpcOption.prototype.npc_2106 = function(player, index, npc) { }

// Ork
DecodedPacketNpcOption.prototype.npc_2107 = function(player, index, npc) { }

// Wise Old Man
DecodedPacketNpcOption.prototype.npc_2108 = function(player, index, npc) {
    player.openShop("platinum_tokens");
}

// Wise Old Man
DecodedPacketNpcOption.prototype.npc_2110 = function(player, index, npc) { }

// Wise Old Man
DecodedPacketNpcOption.prototype.npc_2111 = function(player, index, npc) { }

// Wise Old Man
DecodedPacketNpcOption.prototype.npc_2112 = function(player, index, npc) { }

// Bed
DecodedPacketNpcOption.prototype.npc_2114 = function(player, index, npc) { }

// Miss Schism
DecodedPacketNpcOption.prototype.npc_2116 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_2117 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_2118 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_2119 = function(player, index, npc) { }

// Olivia
DecodedPacketNpcOption.prototype.npc_2121 = function(player, index, npc) { }

// Bank guard
DecodedPacketNpcOption.prototype.npc_2123 = function(player, index, npc) { }

// Snakeling
DecodedPacketNpcOption.prototype.npc_2127 = function(player, index, npc) { }

// Snakeling
DecodedPacketNpcOption.prototype.npc_2128 = function(player, index, npc) { }

// Snakeling
DecodedPacketNpcOption.prototype.npc_2129 = function(player, index, npc) { }

// Snakeling
DecodedPacketNpcOption.prototype.npc_2130 = function(player, index, npc) { }

// Snakeling
DecodedPacketNpcOption.prototype.npc_2131 = function(player, index, npc) { }

// Snakeling
DecodedPacketNpcOption.prototype.npc_2132 = function(player, index, npc) { }

// Tiles
DecodedPacketNpcOption.prototype.npc_2133 = function(player, index, npc) { }

// Aisles
DecodedPacketNpcOption.prototype.npc_2134 = function(player, index, npc) { }

// Lorelai
DecodedPacketNpcOption.prototype.npc_2135 = function(player, index, npc) { }

// Rory
DecodedPacketNpcOption.prototype.npc_2136 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_2146 = function(player, index, npc) { }

// Veos
DecodedPacketNpcOption.prototype.npc_2147 = function(player, index, npc) { }

// Grand Exchange Clerk
DecodedPacketNpcOption.prototype.npc_2148 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("grandexchange", 0);
    } else if (index == 2) {
        player.getGrandExchange().open();
    } else if (index == 3) {
        player.getGrandExchange().openHistory(GrandExchangeUser.HISTORY);
    } else if (index == 4) {
        player.getGrandExchange().exchangeItemSets();
    }
}

// Grand Exchange Clerk
DecodedPacketNpcOption.prototype.npc_2149 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("grandexchange", 0);
    } else if (index == 2) {
        player.getGrandExchange().open();
    } else if (index == 3) {
        player.getGrandExchange().openHistory(GrandExchangeUser.HISTORY);
    } else if (index == 4) {
        player.getGrandExchange().exchangeItemSets();
    }
}

// Grand Exchange Clerk
DecodedPacketNpcOption.prototype.npc_2150 = function(player, index, npc) { }

// Grand Exchange Clerk
DecodedPacketNpcOption.prototype.npc_2151 = function(player, index, npc) { }

// Brugsen Bursen
DecodedPacketNpcOption.prototype.npc_2152 = function(player, index, npc) { }

// Gunnjorn
DecodedPacketNpcOption.prototype.npc_2153 = function(player, index, npc) { }

// TzHaar-Mej-Jal
DecodedPacketNpcOption.prototype.npc_2180 = function(player, index, npc) {
    player.openDialogue("tzhaar", 1);
}

// TzHaar-Mej-Kah
DecodedPacketNpcOption.prototype.npc_2181 = function(player, index, npc) { }

// TzHaar-Ket-Zuh
DecodedPacketNpcOption.prototype.npc_2182 = function(player, index, npc) {
    player.getBank().open();
}

// TzHaar-Hur-Tel
DecodedPacketNpcOption.prototype.npc_2183 = function(player, index, npc) {
    player.openShop("tzhaar_equipment");
}

// TzHaar-Hur-Lek
DecodedPacketNpcOption.prototype.npc_2184 = function(player, index, npc) {
    player.openShop("tzhaar_rocks");
}

// TzHaar-Mej-Roh
DecodedPacketNpcOption.prototype.npc_2185 = function(player, index, npc) {
    player.openShop("tzhaar_runes");
}

// TzHaar-Ket
DecodedPacketNpcOption.prototype.npc_2186 = function(player, index, npc) { }

// TzHaar-Ket
DecodedPacketNpcOption.prototype.npc_2187 = function(player, index, npc) { }

// William
DecodedPacketNpcOption.prototype.npc_2195 = function(player, index, npc) { }

// Ian
DecodedPacketNpcOption.prototype.npc_2196 = function(player, index, npc) { }

// Larry
DecodedPacketNpcOption.prototype.npc_2197 = function(player, index, npc) { }

// Darren
DecodedPacketNpcOption.prototype.npc_2198 = function(player, index, npc) { }

// Edward
DecodedPacketNpcOption.prototype.npc_2199 = function(player, index, npc) { }

// Richard
DecodedPacketNpcOption.prototype.npc_2200 = function(player, index, npc) {
    player.openShop("teamcapes");
}

// Neil
DecodedPacketNpcOption.prototype.npc_2201 = function(player, index, npc) { }

// Edmond
DecodedPacketNpcOption.prototype.npc_2202 = function(player, index, npc) { }

// Simon
DecodedPacketNpcOption.prototype.npc_2203 = function(player, index, npc) { }

// Sam
DecodedPacketNpcOption.prototype.npc_2204 = function(player, index, npc) { }

// Door-support
DecodedPacketNpcOption.prototype.npc_2250 = function(player, index, npc) { }

// Door-support
DecodedPacketNpcOption.prototype.npc_2253 = function(player, index, npc) { }

// Door-support
DecodedPacketNpcOption.prototype.npc_2256 = function(player, index, npc) { }

// Askeladden
DecodedPacketNpcOption.prototype.npc_2260 = function(player, index, npc) { }

// Bardur
DecodedPacketNpcOption.prototype.npc_2263 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2268 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2269 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2270 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2271 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2272 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2273 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2274 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2275 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2276 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2277 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2278 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2279 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2280 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2281 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2282 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2283 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2284 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2285 = function(player, index, npc) { }

// Ur-zek
DecodedPacketNpcOption.prototype.npc_2286 = function(player, index, npc) { }

// Ur-vass
DecodedPacketNpcOption.prototype.npc_2287 = function(player, index, npc) { }

// Ur-taal
DecodedPacketNpcOption.prototype.npc_2288 = function(player, index, npc) { }

// Ur-meg
DecodedPacketNpcOption.prototype.npc_2289 = function(player, index, npc) { }

// Ur-lun
DecodedPacketNpcOption.prototype.npc_2290 = function(player, index, npc) { }

// Ur-pel
DecodedPacketNpcOption.prototype.npc_2291 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_2292 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_2293 = function(player, index, npc) { }

// Bartak
DecodedPacketNpcOption.prototype.npc_2294 = function(player, index, npc) { }

// Turgall
DecodedPacketNpcOption.prototype.npc_2295 = function(player, index, npc) { }

// Reldak
DecodedPacketNpcOption.prototype.npc_2296 = function(player, index, npc) { }

// Miltog
DecodedPacketNpcOption.prototype.npc_2297 = function(player, index, npc) { }

// Mernik
DecodedPacketNpcOption.prototype.npc_2298 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2299 = function(player, index, npc) { }

// Crate goblin
DecodedPacketNpcOption.prototype.npc_2300 = function(player, index, npc) { }

// Cave goblin
DecodedPacketNpcOption.prototype.npc_2301 = function(player, index, npc) { }

// Goblin scribe
DecodedPacketNpcOption.prototype.npc_2302 = function(player, index, npc) { }

// Oldak
DecodedPacketNpcOption.prototype.npc_2303 = function(player, index, npc) { }
