/* 9472 - 9727 */

// Lever
DecodedPacketObjectOption.prototype.object_9472 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_9523 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_9533 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_9534 = function(player, index, object) { }

// Crates
DecodedPacketObjectOption.prototype.object_9535 = function(player, index, object) { }

// Boxes
DecodedPacketObjectOption.prototype.object_9536 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_9558 = function(player, index, object) {
    player.getMovement().ladderUpTeleport(new Tile(player).setHeight(1));
}

// Ladder
DecodedPacketObjectOption.prototype.object_9559 = function(player, index, object) {
    player.getMovement().ladderDownTeleport(new Tile(player).setHeight(0));
}

// Trapdoor
DecodedPacketObjectOption.prototype.object_9560 = function(player, index, object) { }

// Cell door
DecodedPacketObjectOption.prototype.object_9562 = function(player, index, object) { }

// Cell door
DecodedPacketObjectOption.prototype.object_9563 = function(player, index, object) { }

// Cell door
DecodedPacketObjectOption.prototype.object_9564 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_9565 = function(player, index, object) { }

// Bucket
DecodedPacketObjectOption.prototype.object_9568 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_9582 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_9584 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_9607 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_9608 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_9609 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_9611 = function(player, index, object) { }

// Wheelbarrow
DecodedPacketObjectOption.prototype.object_9625 = function(player, index, object) { }

// Spade
DecodedPacketObjectOption.prototype.object_9662 = function(player, index, object) { }

// Lever
DecodedPacketObjectOption.prototype.object_9706 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    // Mage Arena
    if (player.getMovement().getTeleportBlock() > 0) {
        player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                + player.getMovement().getTeleportBlockRemaining() + ".");
        return;
    }
    var tile = new Tile(3105, 3951, 0);
    player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
            Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
}

// Lever
DecodedPacketObjectOption.prototype.object_9707 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    // Mage Arena
    if (player.getMovement().getTeleportBlock() > 0) {
        player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                + player.getMovement().getTeleportBlockRemaining() + ".");
        return;
    }
    var tile = new Tile(3105, 3956, 0);
    player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
            Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
}

// Gate
DecodedPacketObjectOption.prototype.object_9708 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_9709 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_9710 = function(player, index, object) { }

// Tree Stump
DecodedPacketObjectOption.prototype.object_9711 = function(player, index, object) { }

// Tree Stump
DecodedPacketObjectOption.prototype.object_9712 = function(player, index, object) { }

// Tree Stump
DecodedPacketObjectOption.prototype.object_9713 = function(player, index, object) { }

// Tree Stump
DecodedPacketObjectOption.prototype.object_9714 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_9716 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_9717 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_9718 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_9719 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_9720 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_9721 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_9722 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_9723 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_9724 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_9725 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_9726 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_9727 = function(player, index, object) { }
