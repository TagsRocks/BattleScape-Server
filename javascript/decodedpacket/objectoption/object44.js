/* 11264 - 11519 */

// Ship's ladder
DecodedPacketObjectOption.prototype.object_11289 = function(player, index, object) { }

// Ship's ladder
DecodedPacketObjectOption.prototype.object_11290 = function(player, index, object) { }

// Ship's ladder
DecodedPacketObjectOption.prototype.object_11308 = function(player, index, object) { }

// Ship's ladder
DecodedPacketObjectOption.prototype.object_11309 = function(player, index, object) { }

// Climbing net
DecodedPacketObjectOption.prototype.object_11310 = function(player, index, object) { }

// Ship hull
DecodedPacketObjectOption.prototype.object_11317 = function(player, index, object) { }

// Ship hull
DecodedPacketObjectOption.prototype.object_11318 = function(player, index, object) { }

// Bank booth
DecodedPacketObjectOption.prototype.object_11338 = function(player, index, object) {
    player.getBank().open();
}

// Interdimensional rift
DecodedPacketObjectOption.prototype.object_11354 = function(player, index, object) { }

// Interdimensional rift
DecodedPacketObjectOption.prototype.object_11355 = function(player, index, object) { }

// Portal Home
DecodedPacketObjectOption.prototype.object_11356 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_11358 = function(player, index, object) { }

// Interdimensional rift
DecodedPacketObjectOption.prototype.object_11359 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_11360 = function(player, index, object) { }

// Tightrope
DecodedPacketObjectOption.prototype.object_11361 = function(player, index, object) { }

// Tightrope
DecodedPacketObjectOption.prototype.object_11364 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_11365 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_11366 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_11367 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_11368 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_11369 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_11370 = function(player, index, object) { }

// Edge
DecodedPacketObjectOption.prototype.object_11371 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_11373 = function(player, index, object) {
    if (player.getX() != 2729 || player.getY() != 3489) {
        return;
    }
    if (player.getSkills().getLevel(Skills.AGILITY) < 60) {
        player.getGameEncoder().sendMessage("You need an Agility level of 60 to use this course.");
        return;
    }
    var toTile1 = new Tile(2729, 3488, 1);
    var toTile2 = new Tile(2729, 3491, 3);
    player.setFaceTile(toTile2);
    player.getMovement().animatedTeleport(toTile1, 3063, null, 1);
    var event = new Event() {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (event.getExecutions() == 1) {
                player.getMovement().animatedTeleport(toTile2, 1120, null, 2);
            } else if (event.getExecutions() == 4) {
                event.stop();
                var xp = 45;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Gap
DecodedPacketObjectOption.prototype.object_11374 = function(player, index, object) {
    if (player.getX() != 2721 || player.getY() != 3494) {
        return;
    }
    var toTile1 = new Tile(2719, 3495, 2);
    var toTile2 = new Tile(2713, 3494, 2);
    var direction = Tile.WEST;
    player.setFaceTile(toTile2);
    player.setAnimation(2588);
    player.setForceMovement(new ForceMovement(player, 0, toTile1, 4, direction));
    player.lock();
    var event = new Event() {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (event.getExecutions() == 0) {
                player.getMovement().teleport(toTile1);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
            } else if (event.getExecutions() == 1) {
                player.setAnimation(2588);
                player.setForceMovement(new ForceMovement(player, 0, toTile2, 4, direction));
            } else if (event.getExecutions() == 2) {
                player.unlock();
                player.getMovement().teleport(toTile2);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                var xp = 20;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                event.stop();
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Gap
DecodedPacketObjectOption.prototype.object_11375 = function(player, index, object) {
    if (player.getX() != 2710 && player.getX() != 2711 || player.getY() != 3477) {
        return;
    }
    var toTile1 = new Tile(2710, 3474, 1);
    var toTile2 = new Tile(2710, 3472, 3);
    var direction = Tile.SOUTH;
    player.setFaceTile(toTile2);
    player.setAnimation(2588);
    player.setForceMovement(new ForceMovement(player, 0, toTile1, 4, direction));
    player.lock();
    var event = new Event() {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (event.getExecutions() == 0) {
                player.getMovement().teleport(toTile1);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(1120);
            } else if (event.getExecutions() == 2) {
                player.unlock();
                player.getMovement().teleport(toTile2);
                player.setAnimation(-1);
                var xp = 35;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                event.stop();
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Gap
DecodedPacketObjectOption.prototype.object_11376 = function(player, index, object) {
    if (player.getX() != 2702 || player.getY() != 3470) {
        return;
    }
    var direction = Tile.SOUTH;
    player.setAnimation(2588);
    var toTile = new Tile(2702, 3465, 2);
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
            var xp = 15;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    };
    player.getWorld().addEvent(event);
}

// Edge
DecodedPacketObjectOption.prototype.object_11377 = function(player, index, object) {
    if (player.getX() != 2702 || player.getY() != 3464) {
        return;
    }
    var toTile = new Tile(2704, 3464, 0);
    player.setFaceTile(toTile);
    player.getMovement().animatedTeleport(toTile, 7133, null, 0);
    var event = new Event() {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            var xp = 435;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            if (Utils.randomE(6) == 0) {
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
            player.getFamiliar().rollSkillPet(Skills.AGILITY, 35205, 20659);
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    };
    player.getWorld().addEvent(event);
}

// Tightrope
DecodedPacketObjectOption.prototype.object_11378 = function(player, index, object) {
    if (player.getX() != 2710) {
        return;
    }
    var toTile = new Tile(object.getX(), 3480, object.getHeight());
    player.getMovement().clear();
    player.getMovement().addMovement(toTile);
    player.getAppearance().setForceMoveAnimation(762);
    var running = player.getMovement().getRunning();
    player.getMovement().setRunning(false);
    player.lock();
    var event = new Event() {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                event.stop();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                var xp = 20;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                player.unlock();
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Basket
DecodedPacketObjectOption.prototype.object_11380 = function(player, index, object) { }

// Market stall
DecodedPacketObjectOption.prototype.object_11381 = function(player, index, object) { }

// Banner
DecodedPacketObjectOption.prototype.object_11382 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_11383 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_11384 = function(player, index, object) { }

// Rough wall
DecodedPacketObjectOption.prototype.object_11385 = function(player, index, object) { }

// Monkeybars
DecodedPacketObjectOption.prototype.object_11386 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_11389 = function(player, index, object) { }

// Drying line
DecodedPacketObjectOption.prototype.object_11390 = function(player, index, object) { }

// Rough wall
DecodedPacketObjectOption.prototype.object_11391 = function(player, index, object) {
    if (player.getX() != 2625 || player.getY() != 3677) {
        return;
    }
    if (player.getSkills().getLevel(Skills.AGILITY) < 80) {
        player.getGameEncoder().sendMessage("You need an Agility level of 80 to use this course.");
        return;
    }
    var toTile = new Tile(2625, 3675, 3);
    player.getMovement().ladderUpTeleport(toTile);
    var event = new Event(1) {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            var xp = 20;
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
DecodedPacketObjectOption.prototype.object_11392 = function(player, index, object) {
    if (player.getX() != 2622 || player.getY() != 3672) {
        return;
    }
    var direction = Tile.SOUTH;
    player.setAnimation(6132);
    var toTile = new Tile(2622, 3668, 3);
    player.setForceMovement(new ForceMovement(player, 1, toTile, 2, direction));
    player.lock();
    var event = new Event(1) {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.unlock();
            player.getMovement().teleport(toTile);
            var xp = 30;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    };
    player.getWorld().addEvent(event);
}

// Tightrope
DecodedPacketObjectOption.prototype.object_11393 = function(player, index, object) {
    if (player.getX() != 2622 || player.getY() != 3658) {
        return;
    }
    var toTile = new Tile(2627, 3654, object.getHeight());
    player.getMovement().clear();
    player.getMovement().addMovement(toTile);
    player.getAppearance().setForceMoveAnimation(762);
    var running = player.getMovement().getRunning();
    player.getMovement().setRunning(false);
    player.lock();
    var event = new Event() {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                event.stop();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                var xp = 40;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                player.unlock();
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Gap
DecodedPacketObjectOption.prototype.object_11395 = function(player, index, object) {
    if (player.getX() != 2629 || player.getY() != 3655) {
        return;
    }
    player.setAnimation(6132);
    var toTile1 = new Tile(2629, 3658, 3);
    var toTile2 = new Tile(2635, 3658, 3);
    var toTile3 = new Tile(2640, 3652, 3);
    player.setForceMovement(new ForceMovement(player, 1, toTile1, 2, Tile.NORTH));
    var running = player.getMovement().getRunning();
    player.getMovement().setRunning(false);
    player.lock();
    var reachedRope = false;
    var event = new Event() {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (event.getExecutions() == 0) {
                return;
            } else if (event.getExecutions() == 1) {
                player.getMovement().teleport(toTile1);
            } else if (event.getExecutions() == 2) {
                player.getMovement().clear();
                player.getMovement().addMovement(toTile2);
                player.getAppearance().setForceMoveAnimation(754);
            } else if (!reachedRope) {
                if (player.getX() == toTile2.getX() && player.getY() == toTile2.getY()) {
                    reachedRope = true;
                    player.getMovement().clear();
                    player.getMovement().addMovement(toTile3);
                    player.getAppearance().setForceMoveAnimation(762);
                }
            } else if (player.getX() == toTile3.getX() && player.getY() == toTile3.getY()) {
                event.stop();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                var xp = 85;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                player.unlock();
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Gap
DecodedPacketObjectOption.prototype.object_11396 = function(player, index, object) {
    if (player.getX() != 2643 || player.getY() != 3653) {
        return;
    }
    var direction = Tile.NORTH;
    player.setAnimation(6132);
    var toTile = new Tile(2643, 3657, 3);
    player.setForceMovement(new ForceMovement(player, 1, toTile, 2, direction));
    player.lock();
    var event = new Event(1) {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.unlock();
            player.getMovement().teleport(toTile);
            var xp = 25;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    };
    player.getWorld().addEvent(event);
}

// Tightrope
DecodedPacketObjectOption.prototype.object_11397 = function(player, index, object) {
    if (player.getX() != 2647 || player.getY() != 3662) {
        return;
    }
    var toTile = new Tile(2655, 3670, 3);
    player.getMovement().clear();
    player.getMovement().addMovement(2647, 3663);
    player.getMovement().addMovement(toTile);
    player.getAppearance().setForceMoveAnimation(762);
    var running = player.getMovement().getRunning();
    player.getMovement().setRunning(false);
    player.lock();
    var event = new Event() {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                event.stop();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                var xp = 105;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                player.unlock();
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Our lives
DecodedPacketObjectOption.prototype.object_11398 = function(player, index, object) {
    if (index == 1) {
        player.getController().stop();
    }
}

// Cave entrance
DecodedPacketObjectOption.prototype.object_11399 = function(player, index, object) { }

// Web
DecodedPacketObjectOption.prototype.object_11400 = function(player, index, object) { }

// Pile of fish
DecodedPacketObjectOption.prototype.object_11404 = function(player, index, object) {
    if (player.getX() != 2655 || player.getY() != 3676) {
        return;
    }
    var toTile = new Tile(2652, 3676, 0);
    player.getMovement().animatedTeleport(toTile, 7133, null, 0);
    var event = new Event() {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            var xp = 475;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            if (Utils.randomE(4) == 0) {
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
            player.getFamiliar().rollSkillPet(Skills.AGILITY, 31063, 20659);
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    };
    player.getWorld().addEvent(event);
}

// Wooden Beams
DecodedPacketObjectOption.prototype.object_11405 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_11406 = function(player, index, object) { }

// Dug hole
DecodedPacketObjectOption.prototype.object_11417 = function(player, index, object) { }

// Grill
DecodedPacketObjectOption.prototype.object_11422 = function(player, index, object) { }

// Grill
DecodedPacketObjectOption.prototype.object_11423 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_11429 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_11430 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_11441 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_11450 = function(player, index, object) { }

// Lever A
DecodedPacketObjectOption.prototype.object_11451 = function(player, index, object) { }

// Lever A
DecodedPacketObjectOption.prototype.object_11452 = function(player, index, object) { }

// Lever B
DecodedPacketObjectOption.prototype.object_11453 = function(player, index, object) { }

// Lever B
DecodedPacketObjectOption.prototype.object_11454 = function(player, index, object) { }

// Lever C
DecodedPacketObjectOption.prototype.object_11455 = function(player, index, object) { }

// Lever C
DecodedPacketObjectOption.prototype.object_11456 = function(player, index, object) { }

// Lever D
DecodedPacketObjectOption.prototype.object_11457 = function(player, index, object) { }

// Lever D
DecodedPacketObjectOption.prototype.object_11458 = function(player, index, object) { }

// Lever E
DecodedPacketObjectOption.prototype.object_11459 = function(player, index, object) { }

// Lever E
DecodedPacketObjectOption.prototype.object_11460 = function(player, index, object) { }

// Lever F
DecodedPacketObjectOption.prototype.object_11461 = function(player, index, object) { }

// Lever F
DecodedPacketObjectOption.prototype.object_11462 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_11470 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_11471 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_11483 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_11485 = function(player, index, object) { }

// Crates
DecodedPacketObjectOption.prototype.object_11486 = function(player, index, object) { }

// Cabbage
DecodedPacketObjectOption.prototype.object_11494 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_11498 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_11499 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_11511 = function(player, index, object) { }
