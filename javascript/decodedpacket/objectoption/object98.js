/* 25088 - 25343 */

// Magic door
DecodedPacketObjectOption.prototype.object_25115 = function(player, index, object) { }

// Magic door
DecodedPacketObjectOption.prototype.object_25118 = function(player, index, object) { }

// Hole
DecodedPacketObjectOption.prototype.object_25154 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_25161 = function(player, index, object) {
    if (player.getX() <= 2845) {
        player.getMovement().teleport(2847, 9636);
    } else {
        player.getMovement().teleport(2845, 9636);
    }
}

// Climbing rope
DecodedPacketObjectOption.prototype.object_25213 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_25214 = function(player, index, object) { }

// Aged log
DecodedPacketObjectOption.prototype.object_25216 = function(player, index, object) { }

// Barbarian bed
DecodedPacketObjectOption.prototype.object_25268 = function(player, index, object) { }

// Whirlpool
DecodedPacketObjectOption.prototype.object_25274 = function(player, index, object) { }

// Whirlpool
DecodedPacketObjectOption.prototype.object_25275 = function(player, index, object) { }

// Pyre site
DecodedPacketObjectOption.prototype.object_25286 = function(player, index, object) {
    if (player.getInventory().hasItem(11338)) {
        player.getInventory().deleteItem(11338, 1);
        if (Utils.inRange(player.getCombat().getDropRate(11335, 0.8))) {
            player.getInventory().addItem(11335, 1);
            player.getGameEncoder().sendMessage("You burn the chewed bones... And find a dragon full helm in the ashes!");
        } else {
            player.getGameEncoder().sendMessage("You burn the chewed bones... All that remains is ash.");
        }
    }
}

// Stairs
DecodedPacketObjectOption.prototype.object_25336 = function(player, index, object) {
    player.getMovement().ladderUpTeleport(new Tile(1768, 5366, 1));
}

// Stairs
DecodedPacketObjectOption.prototype.object_25337 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_25338 = function(player, index, object) {
    player.getMovement().ladderDownTeleport(new Tile(1772, 5366, 0));
}

// Stairs
DecodedPacketObjectOption.prototype.object_25339 = function(player, index, object) {
    player.getMovement().ladderUpTeleport(new Tile(1778, 5343, 1));
}

// Stairs
DecodedPacketObjectOption.prototype.object_25340 = function(player, index, object) {
    player.getMovement().ladderDownTeleport(new Tile(1778, 5346, 0));
}

// Mithril door
DecodedPacketObjectOption.prototype.object_25341 = function(player, index, object) { }
