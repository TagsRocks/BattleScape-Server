/* 5888 - 6143 */

// Tent door
DecodedPacketObjectOption.prototype.object_5888 = function(player, index, object) { }

// Tent door
DecodedPacketObjectOption.prototype.object_5889 = function(player, index, object) { }

// Tent door
DecodedPacketObjectOption.prototype.object_5890 = function(player, index, object) { }

// Tent door
DecodedPacketObjectOption.prototype.object_5891 = function(player, index, object) { }

// Tent door
DecodedPacketObjectOption.prototype.object_5893 = function(player, index, object) { }

// Shining pool
DecodedPacketObjectOption.prototype.object_5897 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_5902 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_5903 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_5904 = function(player, index, object) { }

// Tree stump
DecodedPacketObjectOption.prototype.object_5905 = function(player, index, object) { }

// Marble wall
DecodedPacketObjectOption.prototype.object_5907 = function(player, index, object) { }

// Climbing rope
DecodedPacketObjectOption.prototype.object_5946 = function(player, index, object) { }

// Dark hole
DecodedPacketObjectOption.prototype.object_5947 = function(player, index, object) { }

// Stepping stone
DecodedPacketObjectOption.prototype.object_5948 = function(player, index, object) { }

// Stepping stone
DecodedPacketObjectOption.prototype.object_5949 = function(player, index, object) { }

// Lever
DecodedPacketObjectOption.prototype.object_5959 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (object.getX() == 3090 && object.getY() == 3956) {
        // Mage Arena to bank
        if (player.getMovement().getTeleportBlock() > 0) {
            player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                    + player.getMovement().getTeleportBlockRemaining() + ".");
            return;
        }
        var tile = new Tile(2539, 4712, 0);
        player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
        player.clearHits();
    }
}

// Lever
DecodedPacketObjectOption.prototype.object_5960 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (object.getX() == 2539 && object.getY() == 4712) {
        // Mage Arena bank to outside
        var tile = new Tile(3090, 3956, 0);
        player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
        player.clearHits();
    }
}

// Cave entrance
DecodedPacketObjectOption.prototype.object_5973 = function(player, index, object) { }

// Dwarf MultiCannon
DecodedPacketObjectOption.prototype.object_5975 = function(player, index, object) { }

// Wall of flame
DecodedPacketObjectOption.prototype.object_5977 = function(player, index, object) { }

// Wall of flame
DecodedPacketObjectOption.prototype.object_5978 = function(player, index, object) { }

// Wall of flame
DecodedPacketObjectOption.prototype.object_5979 = function(player, index, object) { }

// Wall of flame
DecodedPacketObjectOption.prototype.object_5980 = function(player, index, object) { }

// Mineral vein
DecodedPacketObjectOption.prototype.object_5989 = function(player, index, object) { }

// Mineral vein
DecodedPacketObjectOption.prototype.object_5990 = function(player, index, object) { }

// Mineral vein
DecodedPacketObjectOption.prototype.object_5991 = function(player, index, object) { }

// Entrance
DecodedPacketObjectOption.prototype.object_5998 = function(player, index, object) { }

// Mine cart
DecodedPacketObjectOption.prototype.object_6045 = function(player, index, object) { }

// Bank booth
DecodedPacketObjectOption.prototype.object_6084 = function(player, index, object) {
    player.getBank().open();
}

// Stairs
DecodedPacketObjectOption.prototype.object_6085 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_6086 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_6087 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_6088 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_6089 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_6090 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_6091 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_6092 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6100 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6101 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6102 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6103 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6104 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6105 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6106 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6107 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6108 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6109 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6110 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6111 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6112 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6113 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6114 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_6115 = function(player, index, object) { }
