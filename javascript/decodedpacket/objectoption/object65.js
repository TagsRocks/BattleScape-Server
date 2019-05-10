/* 16640 - 16895 */

// Mast
DecodedPacketObjectOption.prototype.object_16640 = function(player, index, object) { }

// Bank booth
DecodedPacketObjectOption.prototype.object_16642 = function(player, index, object) {
    player.getBank().open();
}

// Coffin
DecodedPacketObjectOption.prototype.object_16644 = function(player, index, object) { }

// Coffin
DecodedPacketObjectOption.prototype.object_16645 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16646 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16647 = function(player, index, object) { }

// Ectofuntus
DecodedPacketObjectOption.prototype.object_16648 = function(player, index, object) { }

// Bone grinder
DecodedPacketObjectOption.prototype.object_16650 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_16651 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_16652 = function(player, index, object) { }

// Pirate Captain
DecodedPacketObjectOption.prototype.object_16653 = function(player, index, object) { }

// Bone grinder
DecodedPacketObjectOption.prototype.object_16655 = function(player, index, object) { }

// Bin
DecodedPacketObjectOption.prototype.object_16656 = function(player, index, object) { }

// Furnace
DecodedPacketObjectOption.prototype.object_16657 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16661 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16662 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16663 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16664 = function(player, index, object) {
    if (object.getX() == 3044 && object.getY() == 3924 && player.getHeight() == 0) {
        player.getMovement().teleport(3044, 10322);
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_16665 = function(player, index, object) {
    if (object.getX() == 3044 && object.getY() == 10324 && player.getHeight() == 0) {
        player.getMovement().teleport(3044, 3927);
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_16667 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16668 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16669 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16670 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16671 = function(player, index, object) {
    var tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
    player.getMovement().ladderUpTeleport(tile);
}

// Staircase
DecodedPacketObjectOption.prototype.object_16672 = function(player, index, object) {
    if (index == 0) {
        player.openDialogue("climb", 0);
    } else if (index == 1) {
        var tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
        player.getMovement().ladderUpTeleport(tile);
    } else if (index == 2) {
        var tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().ladderUpTeleport(tile);
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_16673 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16674 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16675 = function(player, index, object) {
    if (object.getX() == 2444 && object.getY() == 3414) {
        player.getMovement().ladderUpTeleport(new Tile(2445, 3416, 1));
    } else if (object.getX() == 2445 && object.getY() == 3434) {
        player.getMovement().ladderUpTeleport(new Tile(2445, 3433, 1));
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_16676 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_16677 = function(player, index, object) {
    if (object.getX() == 2445 && object.getY() == 3415) {
        player.getMovement().ladderDownTeleport(new Tile(2445, 3416));
    } else if (object.getX() == 2445 && object.getY() == 3434) {
        player.getMovement().ladderDownTeleport(new Tile(2445, 3433));
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_16678 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_16679 = function(player, index, object) {
    var tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
    player.getMovement().ladderDownTeleport(tile);
}

// Ladder
DecodedPacketObjectOption.prototype.object_16680 = function(player, index, object) {
    if (object.getX() == 2824 && object.getY() == 3507) {
        // Ice Queen
        player.getMovement().ladderDownTeleport(new Tile(2823, 9907));
    } else if (object.getX() == 2827 && object.getY() == 3510) {
        // Ice Queen
        player.getMovement().ladderDownTeleport(new Tile(2826, 9910));
    } else if (object.getX() == 2859 && object.getY() == 3519) {
        // Ice Queen
        player.getMovement().ladderDownTeleport(new Tile(2858, 9919));
    } else if (object.getX() == 2857 && object.getY() == 3517) {
        // Ice Queen
        player.getMovement().ladderDownTeleport(new Tile(2858, 9917));
    } else if (object.getX() == 3088 && object.getY() == 3571) {
        // Air obelisk
        player.getMovement().ladderDownTeleport(new Tile(3087, 9971));
    } else if (object.getX() == 2884 && object.getY() == 3397) {
        // Taverley Dungeon entrance
        var tile = new Tile(2884, 9798, 0);
        player.getMovement().ladderDownTeleport(tile);
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_16681 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_16682 = function(player, index, object) {
    var tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
    player.getMovement().ladderDownTeleport(tile);
}

// Ladder
DecodedPacketObjectOption.prototype.object_16683 = function(player, index, object) {
    var tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
    player.getMovement().ladderUpTeleport(tile);
}

// Ladder
DecodedPacketObjectOption.prototype.object_16684 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_16685 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_16686 = function(player, index, object) { }

// Rune essence
DecodedPacketObjectOption.prototype.object_16687 = function(player, index, object) { }

// Bank booth
DecodedPacketObjectOption.prototype.object_16700 = function(player, index, object) {
    player.getBank().open();
}

// Tall mirror
DecodedPacketObjectOption.prototype.object_16708 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_16732 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_16733 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_16734 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_16735 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_16736 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_16774 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_16776 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_16777 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_16778 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_16779 = function(player, index, object) { }

// Transport platform
DecodedPacketObjectOption.prototype.object_16829 = function(player, index, object) { }

// Transport platform
DecodedPacketObjectOption.prototype.object_16831 = function(player, index, object) { }

// Transport platform
DecodedPacketObjectOption.prototype.object_16833 = function(player, index, object) { }

// Transport platform
DecodedPacketObjectOption.prototype.object_16835 = function(player, index, object) { }

// Transport platform
DecodedPacketObjectOption.prototype.object_16837 = function(player, index, object) { }

// Transport platform
DecodedPacketObjectOption.prototype.object_16839 = function(player, index, object) { }

// Transport platform
DecodedPacketObjectOption.prototype.object_16841 = function(player, index, object) { }

// Dice
DecodedPacketObjectOption.prototype.object_16843 = function(player, index, object) { }

// Dice
DecodedPacketObjectOption.prototype.object_16844 = function(player, index, object) { }

// Dice
DecodedPacketObjectOption.prototype.object_16845 = function(player, index, object) { }

// Dice
DecodedPacketObjectOption.prototype.object_16846 = function(player, index, object) { }

// Dice
DecodedPacketObjectOption.prototype.object_16847 = function(player, index, object) { }

// Dice
DecodedPacketObjectOption.prototype.object_16848 = function(player, index, object) { }

// Platform edge
DecodedPacketObjectOption.prototype.object_16858 = function(player, index, object) { }

// Tar barrel
DecodedPacketObjectOption.prototype.object_16860 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_16884 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_16885 = function(player, index, object) { }
