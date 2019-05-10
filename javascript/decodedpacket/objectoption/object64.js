/* 16384 - 16639 */

// Ladder
DecodedPacketObjectOption.prototype.object_16450 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_16464 = function(player, index, object) { }

// Crevice
DecodedPacketObjectOption.prototype.object_16465 = function(player, index, object) { }

// Stepping stone
DecodedPacketObjectOption.prototype.object_16466 = function(player, index, object) { }

// Incubation chamber
DecodedPacketObjectOption.prototype.object_16467 = function(player, index, object) { }

// Tight-gap
DecodedPacketObjectOption.prototype.object_16468 = function(player, index, object) { }

// Furnace
DecodedPacketObjectOption.prototype.object_16469 = function(player, index, object) { }

// Exercise mat
DecodedPacketObjectOption.prototype.object_16508 = function(player, index, object) { }

// Obstacle pipe
DecodedPacketObjectOption.prototype.object_16509 = function(player, index, object) {
    // Taverley Dungeon
    if (player.getSkills().getLevel(Skills.AGILITY) < 70) {
        player.getGameEncoder().sendMessage("You need an Agility level of 70 to do this.");
        return;
    }
    if (player.getX() <= 2887) {
        var tile = new Tile(2892, 9799, 0);
        player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
    } else {
        var tile = new Tile(2886, 9799, 0);
        player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
    }
    AchievementDiary.agilityObstacleHooks(player, object);
}

// Strange floor
DecodedPacketObjectOption.prototype.object_16510 = function(player, index, object) {
    // Taverley Dungeon
    if (player.getSkills().getLevel(Skills.AGILITY) < 80) {
        player.getGameEncoder().sendMessage("You need an Agility level of 80 to do this.");
        return;
    }
    if (player.getX() <= 2878) {
        var tile = new Tile(2880, 9813, 0);
        player.getMovement().animatedTeleport(tile, 3067, null, 1);
    } else {
        var tile = new Tile(2878, 9813, 0);
        player.getMovement().animatedTeleport(tile, 3067, null, 1);
    }
    AchievementDiary.agilityObstacleHooks(player, object);
}

// Obstacle pipe
DecodedPacketObjectOption.prototype.object_16511 = function(player, index, object) { }

// Stepping stone
DecodedPacketObjectOption.prototype.object_16513 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_16514 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_16515 = function(player, index, object) { }

// Fence
DecodedPacketObjectOption.prototype.object_16517 = function(player, index, object) { }

// Fence
DecodedPacketObjectOption.prototype.object_16518 = function(player, index, object) { }

// Castle wall
DecodedPacketObjectOption.prototype.object_16519 = function(player, index, object) { }

// Hole
DecodedPacketObjectOption.prototype.object_16520 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_16521 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_16522 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_16523 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_16524 = function(player, index, object) { }

// Weathered wall
DecodedPacketObjectOption.prototype.object_16525 = function(player, index, object) { }

// Weathered wall
DecodedPacketObjectOption.prototype.object_16526 = function(player, index, object) { }

// Underwall tunnel
DecodedPacketObjectOption.prototype.object_16527 = function(player, index, object) { }

// Underwall tunnel
DecodedPacketObjectOption.prototype.object_16528 = function(player, index, object) { }

// Underwall tunnel
DecodedPacketObjectOption.prototype.object_16529 = function(player, index, object) { }

// Underwall tunnel
DecodedPacketObjectOption.prototype.object_16530 = function(player, index, object) { }

// Jutting wall
DecodedPacketObjectOption.prototype.object_16532 = function(player, index, object) { }

// Stepping stone
DecodedPacketObjectOption.prototype.object_16533 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_16534 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_16535 = function(player, index, object) { }

// Spikey chain
DecodedPacketObjectOption.prototype.object_16537 = function(player, index, object) {
    // Slayer Tower
    var tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
    player.getMovement().animatedTeleport(tile, 834, null, 1);
}

// Spikey chain
DecodedPacketObjectOption.prototype.object_16538 = function(player, index, object) {
    // Slayer Tower
    var tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
    player.getMovement().animatedTeleport(tile, 834, null, 1);
}

// Crevice
DecodedPacketObjectOption.prototype.object_16539 = function(player, index, object) {
    // Fremennik Dungeon
    if (object.getX() == 2734 && object.getY() == 10008) {
        var tile = new Tile(2730, 10008, 0);
        player.getMovement().ladderDownTeleport(tile);
    } else if (object.getX() == 2731 && object.getY() == 10008) {
        var tile = new Tile(2735, 10008, 0);
        player.getMovement().ladderDownTeleport(tile);
    }
}

// Log balance
DecodedPacketObjectOption.prototype.object_16540 = function(player, index, object) { }

// Log balance
DecodedPacketObjectOption.prototype.object_16541 = function(player, index, object) { }

// Log balance
DecodedPacketObjectOption.prototype.object_16542 = function(player, index, object) { }

// Crevice
DecodedPacketObjectOption.prototype.object_16543 = function(player, index, object) {
    if (player.getSkills().getLevel(Skills.AGILITY) < 42) {
        player.getGameEncoder().sendMessage("You need an Agility level of 42 to do this.");
        return;
    }
    if (object.getX() == 3029 && object.getY() == 9806) {
        player.getMovement().teleport(3035, 9806);
    } else if (object.getX() == 3034 && object.getY() == 9806) {
        player.getMovement().teleport(3028, 9806);
    }
    AchievementDiary.agilityObstacleHooks(player, object);
}

// Strange floor
DecodedPacketObjectOption.prototype.object_16544 = function(player, index, object) {
    // Fremennik Dungeon
    if (player.getX() >= object.getX()) {
        var tile = new Tile(object.getX() - 1, object.getY(), 0);
        player.getMovement().animatedTeleport(tile, 3067, null, 1);
    } else {
        var tile = new Tile(object.getX() + 1, object.getY(), 0);
        player.getMovement().animatedTeleport(tile, 3067, null, 1);
    }
}

// Rocks
DecodedPacketObjectOption.prototype.object_16545 = function(player, index, object) { }

// Log balance
DecodedPacketObjectOption.prototype.object_16546 = function(player, index, object) { }

// Log balance
DecodedPacketObjectOption.prototype.object_16547 = function(player, index, object) { }

// Log balance
DecodedPacketObjectOption.prototype.object_16548 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_16549 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_16550 = function(player, index, object) { }

// Ornate railing
DecodedPacketObjectOption.prototype.object_16552 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_16556 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_16559 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_16560 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_16561 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_16564 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_16565 = function(player, index, object) { }

// Log pile
DecodedPacketObjectOption.prototype.object_16585 = function(player, index, object) { }

// Log pile
DecodedPacketObjectOption.prototype.object_16586 = function(player, index, object) { }

// Log pile
DecodedPacketObjectOption.prototype.object_16587 = function(player, index, object) { }

// Log pile
DecodedPacketObjectOption.prototype.object_16588 = function(player, index, object) { }

// Log pile
DecodedPacketObjectOption.prototype.object_16589 = function(player, index, object) { }

// Log pile
DecodedPacketObjectOption.prototype.object_16590 = function(player, index, object) { }

// Log pile
DecodedPacketObjectOption.prototype.object_16591 = function(player, index, object) { }

// Log pile
DecodedPacketObjectOption.prototype.object_16592 = function(player, index, object) { }

// Log pile
DecodedPacketObjectOption.prototype.object_16593 = function(player, index, object) { }

// Log pile
DecodedPacketObjectOption.prototype.object_16594 = function(player, index, object) { }

// My life
DecodedPacketObjectOption.prototype.object_16599 = function(player, index, object) { }

// Hurdle
DecodedPacketObjectOption.prototype.object_16600 = function(player, index, object) { }

// Dream tree
DecodedPacketObjectOption.prototype.object_16604 = function(player, index, object) { }

// Zero
DecodedPacketObjectOption.prototype.object_16619 = function(player, index, object) { }

// One
DecodedPacketObjectOption.prototype.object_16620 = function(player, index, object) { }

// Two
DecodedPacketObjectOption.prototype.object_16621 = function(player, index, object) { }

// Three
DecodedPacketObjectOption.prototype.object_16622 = function(player, index, object) { }

// Four
DecodedPacketObjectOption.prototype.object_16623 = function(player, index, object) { }

// Five
DecodedPacketObjectOption.prototype.object_16624 = function(player, index, object) { }

// Six
DecodedPacketObjectOption.prototype.object_16625 = function(player, index, object) { }

// Seven
DecodedPacketObjectOption.prototype.object_16626 = function(player, index, object) { }

// Eight
DecodedPacketObjectOption.prototype.object_16627 = function(player, index, object) { }

// Nine
DecodedPacketObjectOption.prototype.object_16628 = function(player, index, object) { }

// Platform
DecodedPacketObjectOption.prototype.object_16632 = function(player, index, object) { }

// Platform
DecodedPacketObjectOption.prototype.object_16633 = function(player, index, object) { }

// Platform
DecodedPacketObjectOption.prototype.object_16634 = function(player, index, object) { }

// Platform
DecodedPacketObjectOption.prototype.object_16635 = function(player, index, object) { }

// Platform
DecodedPacketObjectOption.prototype.object_16636 = function(player, index, object) { }

// Platform
DecodedPacketObjectOption.prototype.object_16637 = function(player, index, object) { }

// Dream puff
DecodedPacketObjectOption.prototype.object_16638 = function(player, index, object) { }
