/* 24064 - 24319 */

// Castle door
DecodedPacketObjectOption.prototype.object_24064 = function(player, index, object) { }

// Castle door
DecodedPacketObjectOption.prototype.object_24065 = function(player, index, object) { }

// Castle door
DecodedPacketObjectOption.prototype.object_24066 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24067 = function(player, index, object) {
    if (object.getX() == 2968 && object.getY() == 3347) {
        player.getMovement().ladderUpTeleport(new Tile(2968, 3348, 1));
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_24068 = function(player, index, object) {
    if (object.getX() == 2968 && object.getY() == 3347) {
        player.getMovement().ladderDownTeleport(new Tile(2971, 3347));
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_24070 = function(player, index, object) {
    if (object.getX() == 2996 && object.getY() == 3341) {
        player.getMovement().ladderUpTeleport(new Tile(2995, 3341, 2));
    } else {
        player.getMovement().ladderUpTeleport(new Tile(player.getX(), player.getY(), player.getHeight() + 1));
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_24071 = function(player, index, object) {
    player.getMovement().ladderDownTeleport(new Tile(player.getX(), player.getY(), player.getHeight() - 1));
}

// Staircase
DecodedPacketObjectOption.prototype.object_24072 = function(player, index, object) {
    if (object.getX() == 2954 && object.getY() == 3338) {
        player.getMovement().ladderUpTeleport(new Tile(2956, 3338, 1));
    } else if (object.getX() == 2960 && object.getY() == 3338) {
        player.getMovement().ladderUpTeleport(new Tile(2959, 3339, 2));
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_24074 = function(player, index, object) {
    if (object.getX() == 2955 && object.getY() == 3338) {
        player.getMovement().ladderDownTeleport(new Tile(2956, 3338));
    } else if (object.getX() == 2960 && object.getY() == 3339) {
        player.getMovement().ladderDownTeleport(new Tile(2959, 3339, 1));
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_24075 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24076 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24077 = function(player, index, object) {
    if (object.getX() == 2984 && object.getY() == 3337) {
        player.getMovement().ladderUpTeleport(new Tile(2984, 3340, 2));
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_24078 = function(player, index, object) {
    if (object.getX() == 2984 && object.getY() == 3338) {
        player.getMovement().ladderDownTeleport(new Tile(2984, 3336, 1));
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_24079 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24080 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_24082 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_24083 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_24084 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_24085 = function(player, index, object) { }

// Boxes
DecodedPacketObjectOption.prototype.object_24087 = function(player, index, object) { }

// Crates
DecodedPacketObjectOption.prototype.object_24088 = function(player, index, object) { }

// Notice board
DecodedPacketObjectOption.prototype.object_24098 = function(player, index, object) { }

// Notice board
DecodedPacketObjectOption.prototype.object_24099 = function(player, index, object) { }

// Bank booth
DecodedPacketObjectOption.prototype.object_24101 = function(player, index, object) {
    player.getBank().open();
}

// Bookcase
DecodedPacketObjectOption.prototype.object_24110 = function(player, index, object) { }

// Crumbling wall
DecodedPacketObjectOption.prototype.object_24222 = function(player, index, object) {
    if (player.getSkills().getLevel(Skills.AGILITY) < 5) {
        player.getGameEncoder().sendMessage("You need an Agility level of 5 to use this.");
        return;
    }
    if (player.getX() >= 2936) {
        player.getMovement().animatedTeleport(new Tile(2935, 3355), 3067, null, 1);
    } else {
        player.getMovement().animatedTeleport(new Tile(2936, 3355), 3067, null, 1);
    }
    AchievementDiary.agilityObstacleHooks(player, object);
}

// Staircase
DecodedPacketObjectOption.prototype.object_24248 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24249 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24250 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24251 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24252 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24253 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24254 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24255 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_24286 = function(player, index, object) { }

// Locked door
DecodedPacketObjectOption.prototype.object_24293 = function(player, index, object) { }

// Locked door
DecodedPacketObjectOption.prototype.object_24294 = function(player, index, object) { }

// Lever
DecodedPacketObjectOption.prototype.object_24296 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_24303 = function(player, index, object) {
    var tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
    player.getMovement().ladderUpTeleport(tile);
}

// Door
DecodedPacketObjectOption.prototype.object_24306 = function(player, index, object) {
    if (object.getX() == 2847 && (object.getY() == 3540 || object.getY() == 3541)) {
        if (player.getX() >= 2847) {
            player.getMovement().teleport(2846, 3540, player.getHeight());
        } else {
            if (player.getInventory().getCount(8851) < 100
                    && !player.getEquipment().wearingAccomplishmentCape(Skills.ATTACK)) {
                player.getGameEncoder().sendMessage("You need atleast 100 tokens to enter.");
                return;
            }
            player.getMovement().teleport(2847, 3540, player.getHeight());
        }
    } else {
        Region.openDoors(player, object);
    }
}

// Door
DecodedPacketObjectOption.prototype.object_24307 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_24309 = function(player, index, object) {
    if (object.getX() == 2847 && (object.getY() == 3540 || object.getY() == 3541)) {
        if (player.getX() >= 2847) {
            player.getMovement().teleport(2846, 3540, player.getHeight());
        } else {
            if (player.getInventory().getCount(8851) < 100
                    && !player.getEquipment().wearingAccomplishmentCape(Skills.ATTACK)) {
                player.getGameEncoder().sendMessage("You need atleast 100 tokens to enter.");
                return;
            }
            player.getMovement().teleport(2847, 3540, player.getHeight());
        }
    } else {
        Region.openDoors(player, object);
    }
}

// Door
DecodedPacketObjectOption.prototype.object_24310 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_24312 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_24313 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_24315 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_24316 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_24318 = function(player, index, object) {
    if (player.getController().getLevelForXP(Skills.ATTACK) == 99
            || player.getController().getLevelForXP(Skills.STRENGTH) == 99
            || player.getController().getLevelForXP(Skills.ATTACK)
            + player.getController().getLevelForXP(Skills.STRENGTH) >= 130) {
        player.getMovement().teleport(2876, 3546, 0);
    } else {
        player.getGameEncoder().sendMessage("You do not meet the requirements to enter.");
    }
}

// Door
DecodedPacketObjectOption.prototype.object_24319 = function(player, index, object) { }
