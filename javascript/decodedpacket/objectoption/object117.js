/* 29952 - 30207 */

// Steps
DecodedPacketObjectOption.prototype.object_29993 = function(player, index, object) {
    if (player.getY() >= 9991) {
        player.getMovement().teleport(2703, 9987);
    } else {
        player.getMovement().teleport(2703, 9992);
    }
}

// Chambers of Xeric
DecodedPacketObjectOption.prototype.object_29777 = function(player, index, object) {
    player.openDialogue("raids", 0);
}

// Bank chest
DecodedPacketObjectOption.prototype.object_30087 = function(player, index, object) {
    player.getBank().open();
}

// Tunnel
DecodedPacketObjectOption.prototype.object_30174 = function(player, index, object) {
    if (player.getSkills().getLevel(Skills.AGILITY) < 72) {
        player.getGameEncoder().sendMessage("You need an Agility level of 72 to use this.");
        return;
    }
    if (object.getX() == 2430 && object.getY() == 9806) {
        player.getMovement().ladderUpTeleport(new Tile(2435, 9806, 0));
    } else if (object.getX() == 2434 && object.getY() == 9806) {
        player.getMovement().ladderUpTeleport(new Tile(2429, 9806, 0));
    }
    AchievementDiary.agilityObstacleHooks(player, object);
}

// Tunnel
DecodedPacketObjectOption.prototype.object_30175 = function(player, index, object) {
    if (player.getSkills().getLevel(Skills.AGILITY) < 72) {
        player.getGameEncoder().sendMessage("You need an Agility level of 72 to use this.");
        return;
    }
    if (object.getX() == 2430 && object.getY() == 9807) {
        player.getMovement().ladderUpTeleport(new Tile(2435, 9807, 0));
    } else if (object.getX() == 2434 && object.getY() == 9807) {
        player.getMovement().ladderUpTeleport(new Tile(2429, 9807, 0));
    }
    AchievementDiary.agilityObstacleHooks(player, object);
}

// Steps
DecodedPacketObjectOption.prototype.object_30189 = function(player, index, object) {
    if (object.getX() == 2881 && object.getY() == 9825) {
        // Taverley Dungeon
        player.getMovement().ladderUpTeleport(new Tile(2880, 9825, 1));
    } else if (object.getX() == 2904 && object.getY() == 9813) {
        // Taverley Dungeon
        player.getMovement().ladderUpTeleport(new Tile(2903, 9813, 1));
    }
}

// Steps
DecodedPacketObjectOption.prototype.object_30190 = function(player, index, object) {
    if (object.getX() == 2881 && object.getY() == 9825) {
        // Taverley Dungeon
        player.getMovement().ladderDownTeleport(new Tile(2883, 9825, 0));
    } else if (object.getX() == 2904 && object.getY() == 9813) {
        // Taverley Dungeon
        player.getMovement().ladderDownTeleport(new Tile(2906, 9813, 0));
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_30191 = function(player, index, object) {
    player.getMovement().ladderDownTeleport(new Tile(3412, 9932, 3));
}

// Ladder
DecodedPacketObjectOption.prototype.object_30192 = function(player, index, object) {
    player.getMovement().ladderUpTeleport(new Tile(3417, 3536, 0));
}

// Crevice
DecodedPacketObjectOption.prototype.object_30198 = function(player, index, object) {
    if (object.getX() == 2696 && object.getY() == 9436) {
        // Brimhaven Dungeon
        player.getMovement().ladderDownTeleport(new Tile(2684, 9436, 0));
    } else if (object.getX() == 2685 && object.getY() == 9436) {
        // Brimhaven Dungeon
        player.getMovement().ladderDownTeleport(new Tile(2697, 9436, 0));
    }
}
