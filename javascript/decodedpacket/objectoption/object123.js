/* 31488 - 31743 */

// obelisk
DecodedPacketObjectOption.prototype.object_31554 = function(player, index, object) { }

// cavern
DecodedPacketObjectOption.prototype.object_31555 = function(player, index, object) {
    if (object.getX() == 3073 && object.getY() == 3654) {
        player.getMovement().teleport(3196, 10056);
        player.setObjectOptionDelay(2);
    }
}

// cavern
DecodedPacketObjectOption.prototype.object_31556 = function(player, index, object) {
    if (object.getX() == 3124 && object.getY() == 3831) {
        player.getMovement().teleport(3241, 10234);
        player.setObjectOptionDelay(2);
    }
}

// opening
DecodedPacketObjectOption.prototype.object_31557 = function(player, index, object) {
    if (object.getX() == 3194 && object.getY() == 10055) {
        player.getMovement().teleport(3075, 3653);
        player.setObjectOptionDelay(2);
    }
}

// opening
DecodedPacketObjectOption.prototype.object_31558 = function(player, index, object) {
    if (object.getX() == 3240 && object.getY() == 10235) {
        player.getMovement().teleport(3126, 3832);
        player.setObjectOptionDelay(2);
    }
}

// pillar
DecodedPacketObjectOption.prototype.object_31561 = function(player, index, object) {
    var tile = null;
    var direction = Tile.NORTH;
    var level = 1;
    if (object.getX() == 3241 && object.getY() == 10145) {
        tile = (player.getX() >= 3243) ? (new Tile(3239, 10145)) : (new Tile(3243, 10145));
        direction = (player.getX() >= 3243) ? Tile.WEST : Tile.EAST;
        level = 89;
    } else if (object.getX() == 3200 && object.getY() == 10136) {
        tile = (player.getX() >= 3202) ? (new Tile(3198, 10136)) : (new Tile(3202, 10136));
        direction = (player.getX() >= 3202) ? Tile.WEST : Tile.EAST;
        level = 75;
    } else if (object.getX() == 3220 && object.getY() == 10086) {
        tile = (player.getY() >= 10088) ? (new Tile(3220, 10084)) : (new Tile(3220, 10088));
        direction = (player.getY() >= 10088) ? Tile.SOUTH : Tile.NORTH;
        level = 65;
    } else if (object.getX() == 3202 && object.getY() == 10196) {
        tile = (player.getX() >= 3204) ? (new Tile(3200, 10196)) : (new Tile(3204, 10196));
        direction = (player.getX() >= 3204) ? Tile.WEST : Tile.EAST;
        level = 75;
    } else if (object.getX() == 3180 && object.getY() == 10209) {
        tile = (player.getY() <= 10207) ? (new Tile(3180, 10211)) : (new Tile(3180, 10207));
        direction = (player.getY() <= 10207) ? Tile.NORTH : Tile.SOUTH;
        level = 75;
    }
    if (tile == null) {
        return;
    } else if (player.getSkills().getLevel(Skills.AGILITY) < level) {
        player.getGameEncoder().sendMessage("You need an Agility level of " + level + " to jump this.");
        return;
    }
    player.setObjectOptionDelay(2);
    tile.setHeight(player.getHeight());
    var forceMovement = new ForceMovement(new Tile(player), 1, tile, 2, direction);
    player.setForceMovementTeleport(forceMovement, 6132, 1, null);
    AchievementDiary.agilityObstacleHooks(player, object);
}

// deadman supply chest
DecodedPacketObjectOption.prototype.object_31572 = function(player, index, object) { }

// deadman supply chest
DecodedPacketObjectOption.prototype.object_31574 = function(player, index, object) { }

// deadman supply chest
DecodedPacketObjectOption.prototype.object_31576 = function(player, index, object) { }

// deadman supply chest
DecodedPacketObjectOption.prototype.object_31578 = function(player, index, object) { }

// deadman supply chest
DecodedPacketObjectOption.prototype.object_31580 = function(player, index, object) { }

// deadman supply chest
DecodedPacketObjectOption.prototype.object_31582 = function(player, index, object) { }

// <col=ff9040>tinderbox</col>
DecodedPacketObjectOption.prototype.object_31634 = function(player, index, object) { }

// the cloister bell
DecodedPacketObjectOption.prototype.object_31669 = function(player, index, object) {
    if (!player.getSlayer().isAnyTask(7851) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
        player.getGameEncoder().sendMessage("This can only be killed on task.");
        return;
    } else if (player.getWorld().getNPC(7851, player) != null || player.getWorld().getNPC(7882, player) != null
            || player.getWorld().getNPC(7888, player) != null || player.getWorld().getNPC(7852, player) != null
            || player.getWorld().getNPC(7885, player) != null || player.getWorld().getNPC(7889, player) != null) {
        player.getGameEncoder().sendMessage("Nothing interesting happens.");
        return;
    }
    player.getGameEncoder().setVarp(1667, 3);
    player.getGameEncoder().sendMapObjectAnimation(object, 7748);
    var dusk = new Npc(player.getController(), 7851, new Tile(1685, 4573));
    dusk.setLargeVisibility();
    var dawn = new Npc(player.getController(), 7852, new Tile(1705, 4573));
    dawn.setLargeVisibility();
}

// roof entrance
DecodedPacketObjectOption.prototype.object_31672 = function(player, index, object) { }

// roof entrance
DecodedPacketObjectOption.prototype.object_31673 = function(player, index, object) { }

// roof exit
DecodedPacketObjectOption.prototype.object_31674 = function(player, index, object) {
    player.getController().stopWithTeleport();
    player.getMovement().teleport(3426, 3540, 2);
}

// magical chest
DecodedPacketObjectOption.prototype.object_31675 = function(player, index, object) { }

// energy sphere
DecodedPacketObjectOption.prototype.object_31678 = function(player, index, object) {
    if (object.getAttachment() != null) {
        object.getAttachment().setAttachment(2, player);
        object.getAttachment().stop();
    }
}

// energy sphere
DecodedPacketObjectOption.prototype.object_31679 = function(player, index, object) {
    if (object.getAttachment() != null) {
        object.getAttachment().setAttachment(2, player);
        object.getAttachment().stop();
    }
}

// energy sphere
DecodedPacketObjectOption.prototype.object_31680 = function(player, index, object) {
    if (object.getAttachment() != null) {
        object.getAttachment().setAttachment(2, player);
        object.getAttachment().stop();
    }
}

// roof entrance
DecodedPacketObjectOption.prototype.object_31681 = function(player, index, object) {
    if (!player.getSlayer().isUnlocked(Slayer.GROTESQUE_GUARDIANS)) {
        if (!player.getInventory().hasItem(21724)) {
            player.getGameEncoder().sendMessage("You need a Brittle key to unlock this.");
            return;
        }
        player.getInventory().deleteItem(21724, 1);
        player.getSlayer().unlock(Slayer.GROTESQUE_GUARDIANS);
        return;
    }
    if (!player.getSlayer().isAnyTask(7851) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
        player.getGameEncoder().sendMessage("This can only be attacked on an appropriate Slayer task.");
        return;
    }
    player.setController(new BossInstancePC());
    player.getController().instance();
    player.getMovement().teleport(1696, 4574);
    player.getController().getVariable("boss_instance_grotesque_guardians");
}

// the cloister bell
DecodedPacketObjectOption.prototype.object_31684 = function(player, index, object) { }

// the cloister bell
DecodedPacketObjectOption.prototype.object_31685 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_31686 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_31687 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_31688 = function(player, index, object) { }

// the grotesque guardians' display
DecodedPacketObjectOption.prototype.object_31689 = function(player, index, object) { }

// cave
DecodedPacketObjectOption.prototype.object_31690 = function(player, index, object) { }

// sand pile
DecodedPacketObjectOption.prototype.object_31691 = function(player, index, object) { }

// tunnel entrance
DecodedPacketObjectOption.prototype.object_31692 = function(player, index, object) { }

// rope
DecodedPacketObjectOption.prototype.object_31693 = function(player, index, object) { }

// crevice
DecodedPacketObjectOption.prototype.object_31695 = function(player, index, object) { }

// crevice
DecodedPacketObjectOption.prototype.object_31696 = function(player, index, object) { }

// rocks
DecodedPacketObjectOption.prototype.object_31697 = function(player, index, object) { }

// rocks
DecodedPacketObjectOption.prototype.object_31698 = function(player, index, object) { }

// stepping stone
DecodedPacketObjectOption.prototype.object_31699 = function(player, index, object) { }

// chest
DecodedPacketObjectOption.prototype.object_31703 = function(player, index, object) { }

// ladder
DecodedPacketObjectOption.prototype.object_31704 = function(player, index, object) { }

// ladder
DecodedPacketObjectOption.prototype.object_31705 = function(player, index, object) { }

// manhole
DecodedPacketObjectOption.prototype.object_31706 = function(player, index, object) { }

// manhole
DecodedPacketObjectOption.prototype.object_31707 = function(player, index, object) { }

// ladder
DecodedPacketObjectOption.prototype.object_31708 = function(player, index, object) { }

// doorway
DecodedPacketObjectOption.prototype.object_31709 = function(player, index, object) { }

// chest
DecodedPacketObjectOption.prototype.object_31710 = function(player, index, object) { }

// fish stall
DecodedPacketObjectOption.prototype.object_31712 = function(player, index, object) { }

// old memorial
DecodedPacketObjectOption.prototype.object_31714 = function(player, index, object) { }

// burning driftwood
DecodedPacketObjectOption.prototype.object_31722 = function(player, index, object) { }

// driftwood
DecodedPacketObjectOption.prototype.object_31724 = function(player, index, object) { }

// closed booth
DecodedPacketObjectOption.prototype.object_31725 = function(player, index, object) { }

// bank deposit box
DecodedPacketObjectOption.prototype.object_31726 = function(player, index, object) {
    player.getBank().openDepositBox();
}

// stairs
DecodedPacketObjectOption.prototype.object_31733 = function(player, index, object) { }

// stairs
DecodedPacketObjectOption.prototype.object_31734 = function(player, index, object) { }

// stairs
DecodedPacketObjectOption.prototype.object_31735 = function(player, index, object) { }
