/* 17152 - 17407 */

// Staircase
DecodedPacketObjectOption.prototype.object_17155 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_17159 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_17160 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_17209 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_17222 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_17223 = function(player, index, object) { }

// Drawers
DecodedPacketObjectOption.prototype.object_17232 = function(player, index, object) { }

// Table
DecodedPacketObjectOption.prototype.object_17235 = function(player, index, object) { }

// Aspidistra plant
DecodedPacketObjectOption.prototype.object_17238 = function(player, index, object) { }

// Singing bowl
DecodedPacketObjectOption.prototype.object_17239 = function(player, index, object) { }

// Oaknock's machine
DecodedPacketObjectOption.prototype.object_17240 = function(player, index, object) { }

// Oaknock's Machine
DecodedPacketObjectOption.prototype.object_17245 = function(player, index, object) { }

// Oaknock's Machine
DecodedPacketObjectOption.prototype.object_17246 = function(player, index, object) { }

// Oaknock's Machine
DecodedPacketObjectOption.prototype.object_17247 = function(player, index, object) { }

// Oaknock's exchanger
DecodedPacketObjectOption.prototype.object_17248 = function(player, index, object) { }

// Oaknock's exchanger
DecodedPacketObjectOption.prototype.object_17249 = function(player, index, object) { }

// Crystal bridge
DecodedPacketObjectOption.prototype.object_17267 = function(player, index, object) { }

// A chasm
DecodedPacketObjectOption.prototype.object_17269 = function(player, index, object) { }

// A chasm
DecodedPacketObjectOption.prototype.object_17270 = function(player, index, object) { }

// Machine panel
DecodedPacketObjectOption.prototype.object_17272 = function(player, index, object) { }

// Argento
DecodedPacketObjectOption.prototype.object_17276 = function(player, index, object) { }

// Oaknock's machine
DecodedPacketObjectOption.prototype.object_17280 = function(player, index, object) { }

// Oaknock's Machine
DecodedPacketObjectOption.prototype.object_17282 = function(player, index, object) { }

// Oaknock's exchanger
DecodedPacketObjectOption.prototype.object_17283 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_17296 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_17297 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_17300 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_17301 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_17302 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_17303 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_17316 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_17317 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_17319 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_17320 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_17321 = function(player, index, object) { }

// Stone Tablet
DecodedPacketObjectOption.prototype.object_17367 = function(player, index, object) { }

// Stone Tablet
DecodedPacketObjectOption.prototype.object_17369 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_17382 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_17383 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_17384 = function(player, index, object) {
    if (object.getX() == 2892 && object.getY() == 3507) {
        // Heros' Guild entrance
        var tile = new Tile(2893, 9907);
        player.getMovement().ladderDownTeleport(tile);
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_17385 = function(player, index, object) {
    if (object.getX() == 2884 && object.getY() == 9797) {
        // Taverley Dungeon exit
        var tile = new Tile(2884, 3396, 0);
        player.getMovement().ladderUpTeleport(tile);
    } else if (object.getX() == 3008 && object.getY() == 9550) {
        // Asgarnian Ice Dungeon exit
        var tile = new Tile(3009, 3150, 0);
        player.getMovement().ladderUpTeleport(tile);
    } else if (object.getX() == 2824 && object.getY() == 9907) {
        // Ice Queen
        player.getMovement().ladderUpTeleport(new Tile(2823, 3507));
    } else if (object.getX() == 2857 && object.getY() == 9917) {
        // Ice Queen
        player.getMovement().ladderUpTeleport(new Tile(2857, 3516));
    } else if (object.getX() == 2859 && object.getY() == 9919) {
        // Ice Queen
        player.getMovement().ladderUpTeleport(new Tile(2858, 3519));
    } else if (object.getX() == 2827 && object.getY() == 9910) {
        // Ice Queen
        player.getMovement().ladderUpTeleport(new Tile(2826, 3510));
    } else if (object.getX() == 3088 && object.getY() == 9971) {
        // Air obelisk
        player.getMovement().ladderUpTeleport(new Tile(3087, 3571));
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_17386 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_17387 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_17388 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_17389 = function(player, index, object) { }

// Steps
DecodedPacketObjectOption.prototype.object_17391 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17392 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17393 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17394 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17395 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17396 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17397 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17398 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17399 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17400 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17401 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17402 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17403 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17404 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17405 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17406 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_17407 = function(player, index, object) { }
