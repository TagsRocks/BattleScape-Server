/* 10752 - 11007 */

// Stairs
DecodedPacketObjectOption.prototype.object_10771 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_10772 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_10773 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_10774 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_10775 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_10776 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_10777 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10778 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10779 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10780 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_10781 = function(player, index, object) { }

// Dense runestone
DecodedPacketObjectOption.prototype.object_10796 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_10804 = function(player, index, object) { }

// Sandy's Desk
DecodedPacketObjectOption.prototype.object_10805 = function(player, index, object) { }

// Edge
DecodedPacketObjectOption.prototype.object_10817 = function(player, index, object) { }

// Tall tree
DecodedPacketObjectOption.prototype.object_10819 = function(player, index, object) {
    if (player.getSkills().getLevel(Skills.AGILITY) < 40) {
        player.getGameEncoder().sendMessage("You need an Agility level of 40 to use this course.");
        return;
    }
    var toTile = new Tile(3506, 3492, 2);
    player.getMovement().ladderUpTeleport(toTile);
    var event = new Event(1) {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            var xp = 10;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    };
    player.getWorld().addEvent(event);
}

// Gap
DecodedPacketObjectOption.prototype.object_10820 = function(player, index, object) {
    if (player.getX() != 3505 || player.getY() != 3497) {
        return;
    }
    var direction = Tile.NORTH;
    player.setAnimation(2588);
    var toTile = new Tile(3503, 3504, 2);
    player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
    player.lock();
    var event = new Event() {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.unlock();
            player.getMovement().teleport(toTile);
            player.setForceMovement(new ForceMovement(direction));
            player.setAnimation(-1);
            var xp = 8;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
        }
    };
    player.getWorld().addEvent(event);
}

// Gap
DecodedPacketObjectOption.prototype.object_10821 = function(player, index, object) {
    if (player.getX() != 3498 || player.getY() != 3504) {
        return;
    }
    var direction = Tile.WEST;
    player.setAnimation(2588);
    var toTile = new Tile(3492, 3504, 2);
    player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
    player.lock();
    var event = new Event() {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.unlock();
            player.getMovement().teleport(toTile);
            player.setForceMovement(new ForceMovement(direction));
            player.setAnimation(-1);
            var xp = 8;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
        }
    };
    player.getWorld().addEvent(event);
}

// Gap
DecodedPacketObjectOption.prototype.object_10822 = function(player, index, object) {
    if (player.getX() != 3478 || player.getY() != 3493) {
        return;
    }
    var direction = Tile.SOUTH;
    player.setAnimation(2588);
    var toTile = new Tile(3478, 3486, 2);
    player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
    player.lock();
    var event = new Event() {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.unlock();
            player.getMovement().teleport(toTile);
            player.setForceMovement(new ForceMovement(direction));
            player.setAnimation(-1);
            var xp = 8;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
        }
    };
    player.getWorld().addEvent(event);
}

// Gap
DecodedPacketObjectOption.prototype.object_10823 = function(player, index, object) {
    if (player.getX() != 3502 || player.getY() != 3476) {
        return;
    }
    var direction = Tile.EAST;
    player.setAnimation(2588);
    var toTile = new Tile(3510, 3476, 2);
    player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
    player.lock();
    var event = new Event() {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.unlock();
            player.getMovement().teleport(toTile);
            player.setForceMovement(new ForceMovement(direction));
            player.setAnimation(-1);
            var xp = 11;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
        }
    };
    player.getWorld().addEvent(event);
}

// Gap
DecodedPacketObjectOption.prototype.object_10828 = function(player, index, object) {
    if (player.getX() != 3487 || player.getY() != 3499) {
        return;
    }
    var direction = Tile.WEST;
    player.setAnimation(2588);
    var toTile = new Tile(3479, 3499, 3);
    player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
    player.lock();
    var event = new Event() {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.unlock();
            player.getMovement().teleport(toTile);
            player.setForceMovement(new ForceMovement(direction));
            player.setAnimation(-1);
            var xp = 10;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
        }
    };
    player.getWorld().addEvent(event);
}

// Tightrope
DecodedPacketObjectOption.prototype.object_10829 = function(player, index, object) { }

// Pole-vault
DecodedPacketObjectOption.prototype.object_10831 = function(player, index, object) {
    if (player.getX() != 3480 || player.getY() != 3484) {
        return;
    }
    player.setAnimation(7132);
    var toTile = new Tile(3489, 3476, 3);
    player.setForceMovement(new ForceMovement(player, 1, toTile, 4, Tile.EAST));
    player.lock();
    var event = new Event(3) {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.unlock();
            player.getMovement().teleport(toTile);
            player.setAnimation(-1);
            var xp = 10;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
        }
    };
    player.getWorld().addEvent(event);
}

// Gap
DecodedPacketObjectOption.prototype.object_10832 = function(player, index, object) {
    if (player.getX() != 3510 || player.getY() != 3482) {
        return;
    }
    var toTile = new Tile(3510, 3485, 0);
    player.getMovement().animatedTeleport(toTile, 7133, null, 0);
    var event = new Event() {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            var xp = 175;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            if (Utils.randomE(10) == 0) {
                var amount = 4;
                if (player.getGoldMember()) {
                    amount = 6;
                }
                player.getInventory().addOrDropItem(11849, amount);
            }
            if (Utils.randomE(2) == 0) {
                var rewardType = Utils.randomE(3);
                if (rewardType == 0) {
                    player.getInventory().addOrDropItem(3009, 1);
                } else if (rewardType == 1) {
                    player.getInventory().addOrDropItem(3017, 1);
                } else if (rewardType == 2) {
                    player.getInventory().addOrDropItem(12640, 4);
                }
            }
            player.getFamiliar().rollSkillPet(Skills.AGILITY, 36842, 20659);
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    };
    player.getWorld().addEvent(event);
}

// Rough wall
DecodedPacketObjectOption.prototype.object_10833 = function(player, index, object) { }

// Tightrope
DecodedPacketObjectOption.prototype.object_10834 = function(player, index, object) { }

// Hand holds
DecodedPacketObjectOption.prototype.object_10836 = function(player, index, object) { }

// Climbing rocks
DecodedPacketObjectOption.prototype.object_10851 = function(player, index, object) { }

// Climbing rocks
DecodedPacketObjectOption.prototype.object_10852 = function(player, index, object) { }

// Doorway
DecodedPacketObjectOption.prototype.object_10855 = function(player, index, object) { }

// Doorway
DecodedPacketObjectOption.prototype.object_10856 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_10857 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_10858 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10859 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_10860 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10861 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10862 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10863 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10864 = function(player, index, object) { }

// Low wall
DecodedPacketObjectOption.prototype.object_10865 = function(player, index, object) { }

// Plank
DecodedPacketObjectOption.prototype.object_10867 = function(player, index, object) { }

// Plank
DecodedPacketObjectOption.prototype.object_10868 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10882 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10883 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10884 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10885 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_10886 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_10887 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_10888 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_10889 = function(player, index, object) { }

// Vine patch
DecodedPacketObjectOption.prototype.object_10949 = function(player, index, object) { }

// Sand pile
DecodedPacketObjectOption.prototype.object_10950 = function(player, index, object) { }

// Magic barrier
DecodedPacketObjectOption.prototype.object_11005 = function(player, index, object) { }
