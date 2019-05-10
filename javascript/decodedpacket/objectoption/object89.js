/* 22784 - 23039 */

// Bank booth
DecodedPacketObjectOption.prototype.object_22819 = function(player, index, object) {
    player.getBank().open();
}

// Door
DecodedPacketObjectOption.prototype.object_22913 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_22914 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_22920 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_22921 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_22931 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_22932 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_22933 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_22934 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_22935 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_22936 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_22937 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_22938 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_22939 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_22940 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_22941 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_22942 = function(player, index, object) { }

// Bone door
DecodedPacketObjectOption.prototype.object_22945 = function(player, index, object) {
    var entryRequirement = 0;
    if (object.getX() == 2652 && object.getY() == 5449) {
        entryRequirement = 100000;
    } else if (object.getX() == 2658 && object.getY() == 5449) {
        entryRequirement = 500000;
    } else if (object.getX() == 2652 && object.getY() == 5463) {
        entryRequirement = 1000000;
    } else if (object.getX() == 2658 && object.getY() == 5463) {
        entryRequirement = 5000000;
    } else if (object.getX() == 2652 && object.getY() == 5478) {
        entryRequirement = 10000000;
    } else if (object.getX() == 2658 && object.getY() == 5478) {
        entryRequirement = 25000000;
    } else if (object.getX() == 2652 && object.getY() == 5493) {
        entryRequirement = 50000000;
    } else if (object.getX() == 2658 && object.getY() == 5493) {
        entryRequirement = 100000000;
    }
    if (entryRequirement == 0) {
        return;
    }
    if (player.getX() > object.getX() && object.getDirection() == 3
            || player.getX() < object.getX() && object.getDirection() == 1) {
        if (player.getCombat().getRiskedValue() < entryRequirement) {
            player.getGameEncoder().sendMessage("You need to risk at least " + Utils.formatNumber(entryRequirement)
                    + " to enter.");
            return;
        }
        if (object.getDirection() == 1) {
            player.getMovement().teleport(player.getX() + 2, player.getY());
        } else if (object.getDirection() == 3) {
            player.getMovement().teleport(player.getX() - 2, player.getY());
        }
    } else {
        if (object.getDirection() == 1) {
            player.getMovement().teleport(player.getX() - 2, player.getY());
        } else if (object.getDirection() == 3) {
            player.getMovement().teleport(player.getX() + 2, player.getY());
        }
    }
}
