/* 8704 - 8959 */

// Loom
DecodedPacketObjectOption.prototype.object_8717 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_8720 = function(player, index, object) {
    player.openDialogue("vote", 0);
}

// Pile of Rock
DecodedPacketObjectOption.prototype.object_8725 = function(player, index, object) { }

// Pile of Rock
DecodedPacketObjectOption.prototype.object_8726 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_8727 = function(player, index, object) { }

// Steps
DecodedPacketObjectOption.prototype.object_8729 = function(player, index, object) {
    // Asgarnian Ice Dungeon
    if (player.getY() >= 9557) {
        var tile = new Tile(3060, 9555, 0);
        player.getMovement().ladderUpTeleport(tile);
    } else {
        var tile = new Tile(3060, 9557, 0);
        player.getMovement().ladderUpTeleport(tile);
    }
}

// Young tree
DecodedPacketObjectOption.prototype.object_8730 = function(player, index, object) { }

// Net trap
DecodedPacketObjectOption.prototype.object_8731 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Young tree
DecodedPacketObjectOption.prototype.object_8732 = function(player, index, object) {
    player.getHunter().layTrap(-1, object);
}

// Net trap
DecodedPacketObjectOption.prototype.object_8734 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Ardougne Wall Door
DecodedPacketObjectOption.prototype.object_8738 = function(player, index, object) { }

// Ardougne Wall Door
DecodedPacketObjectOption.prototype.object_8739 = function(player, index, object) { }

// Ardougne Wall Door
DecodedPacketObjectOption.prototype.object_8740 = function(player, index, object) { }

// Ardougne Wall Door
DecodedPacketObjectOption.prototype.object_8741 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_8742 = function(player, index, object) { }

// ladder
DecodedPacketObjectOption.prototype.object_8744 = function(player, index, object) {
    player.getMovement().ladderUpTeleport((new Tile(player)).setHeight(player.getHeight() + 1));
}

// ladder
DecodedPacketObjectOption.prototype.object_8745 = function(player, index, object) {
    player.openDialogue("climb", 0);
}

// ladder
DecodedPacketObjectOption.prototype.object_8746 = function(player, index, object) {
    player.getMovement().ladderDownTeleport((new Tile(player)).setHeight(player.getHeight() - 1));
}

// Spinning wheel
DecodedPacketObjectOption.prototype.object_8748 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_8749 = function(player, index, object) {
    player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
    player.setAnimation(Prayer.PRAY_ANIMATION);
}

// Bookcase
DecodedPacketObjectOption.prototype.object_8752 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_8753 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_8754 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_8783 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_8785 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_8786 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_8787 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_8788 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_8789 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_8791 = function(player, index, object) { }

// Gnome on a rack
DecodedPacketObjectOption.prototype.object_8794 = function(player, index, object) { }

// Gnome on a rack
DecodedPacketObjectOption.prototype.object_8795 = function(player, index, object) { }

// Closed chest
DecodedPacketObjectOption.prototype.object_8797 = function(player, index, object) { }

// Open chest
DecodedPacketObjectOption.prototype.object_8798 = function(player, index, object) { }

// Desk
DecodedPacketObjectOption.prototype.object_8799 = function(player, index, object) { }

// Closed chest
DecodedPacketObjectOption.prototype.object_8800 = function(player, index, object) { }

// Rotten Apple Pile
DecodedPacketObjectOption.prototype.object_8809 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_8810 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_8811 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_8812 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_8813 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_8818 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_8819 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_8820 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_8821 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_8844 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_8845 = function(player, index, object) { }

// Kelda Hops Patch
DecodedPacketObjectOption.prototype.object_8862 = function(player, index, object) { }

// Kelda Hops Patch
DecodedPacketObjectOption.prototype.object_8863 = function(player, index, object) { }

// Kelda Hops Patch
DecodedPacketObjectOption.prototype.object_8864 = function(player, index, object) { }

// Kelda Hops
DecodedPacketObjectOption.prototype.object_8865 = function(player, index, object) { }

// Kelda Hops
DecodedPacketObjectOption.prototype.object_8866 = function(player, index, object) { }

// Kelda Hops
DecodedPacketObjectOption.prototype.object_8867 = function(player, index, object) { }

// Kelda Hops
DecodedPacketObjectOption.prototype.object_8868 = function(player, index, object) { }

// Kelda Hops
DecodedPacketObjectOption.prototype.object_8869 = function(player, index, object) { }

// Kelda Stout
DecodedPacketObjectOption.prototype.object_8870 = function(player, index, object) { }

// Kelda Hops Patch
DecodedPacketObjectOption.prototype.object_8877 = function(player, index, object) { }

// Dwarven machinery
DecodedPacketObjectOption.prototype.object_8878 = function(player, index, object) { }

// Box
DecodedPacketObjectOption.prototype.object_8879 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_8881 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_8883 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_8884 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_8910 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_8913 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_8914 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_8915 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_8916 = function(player, index, object) { }

// Train cart
DecodedPacketObjectOption.prototype.object_8924 = function(player, index, object) { }

// Train cart
DecodedPacketObjectOption.prototype.object_8925 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_8929 = function(player, index, object) {
    // Waterbirth Dungeon entrance
    var tile = new Tile(2443, 10146, 0);
    player.getMovement().ladderDownTeleport(tile);
}

// Cave entrance
DecodedPacketObjectOption.prototype.object_8930 = function(player, index, object) { }

// Iron ladder
DecodedPacketObjectOption.prototype.object_8956 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_8958 = function(player, index, object) {
    // Waterbirth Dungeon top
    if (player.getX() <= 2490) {
        var tile = new Tile(player.getX() + 2, player.getY(), 0);
        player.getMovement().teleport(tile);
    } else {
        var tile = new Tile(player.getX() - 2, player.getY(), 0);
        player.getMovement().teleport(tile);
    }
}

// Door
DecodedPacketObjectOption.prototype.object_8959 = function(player, index, object) {
    // Waterbirth Dungeon middle
    if (player.getX() <= 2490) {
        var tile = new Tile(player.getX() + 2, player.getY(), 0);
        player.getMovement().teleport(tile);
    } else {
        var tile = new Tile(player.getX() - 2, player.getY(), 0);
        player.getMovement().teleport(tile);
    }
}
