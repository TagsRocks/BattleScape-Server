/* 23040 - 23295 */

// Tools
DecodedPacketObjectOption.prototype.object_23042 = function(player, index, object) { }

// Tools
DecodedPacketObjectOption.prototype.object_23043 = function(player, index, object) { }

// Tools
DecodedPacketObjectOption.prototype.object_23045 = function(player, index, object) { }

// Fairy ring
DecodedPacketObjectOption.prototype.object_23047 = function(player, index, object) {
    if (index == 0) {
        player.openDialogue("fairyring", 0);
    }
}

// Doorway
DecodedPacketObjectOption.prototype.object_23052 = function(player, index, object) { }

// Broken cart
DecodedPacketObjectOption.prototype.object_23055 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_23056 = function(player, index, object) { }

// Statue
DecodedPacketObjectOption.prototype.object_23057 = function(player, index, object) { }

// Open statue
DecodedPacketObjectOption.prototype.object_23058 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_23073 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_23074 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_23091 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_23092 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_23093 = function(player, index, object) { }

// Floor
DecodedPacketObjectOption.prototype.object_23094 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_23095 = function(player, index, object) { }

// Statue
DecodedPacketObjectOption.prototype.object_23096 = function(player, index, object) { }

// Floor
DecodedPacketObjectOption.prototype.object_23098 = function(player, index, object) { }

// Soul boat
DecodedPacketObjectOption.prototype.object_23101 = function(player, index, object) { }

// Iron Winch
DecodedPacketObjectOption.prototype.object_23104 = function(player, index, object) {
    if (!player.getSlayer().isAnyTask(5862) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
        player.getGameEncoder().sendMessage("You need an appropriate Slayer task of Cerberus to enter.");
        return;
    }
    if (object.getX() == 1291 && object.getY() == 1254) {
        player.getMovement().teleport(1240, 1227);
    } else if (object.getX() == 1328 && object.getY() == 1254) {
        player.getMovement().teleport(1368, 1227);
    } else if (object.getX() == 1307 && object.getY() == 1269) {
        player.openDialogue("bossinstance", 4);
    }
}

// Flames
DecodedPacketObjectOption.prototype.object_23105 = function(player, index, object) { }

// Fishing spot
DecodedPacketObjectOption.prototype.object_23114 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_23115 = function(player, index, object) { }

// Device
DecodedPacketObjectOption.prototype.object_23117 = function(player, index, object) { }

// Rope swing
DecodedPacketObjectOption.prototype.object_23122 = function(player, index, object) { }

// Rope swing
DecodedPacketObjectOption.prototype.object_23123 = function(player, index, object) { }

// Ropeswing
DecodedPacketObjectOption.prototype.object_23131 = function(player, index, object) {
    if (player.getSkills().getLevel(Skills.AGILITY) < 35) {
        player.getGameEncoder().sendMessage("You need an Agility level of 35 to use this course.");
        return;
    }
    if (player.getY() != 3554) {
        player.getGameEncoder().sendMessage("You'll need to get closer to make this jump.");
        return;
    }
    var startTile = new Tile(object.getX(), 3554, object.getHeight());
    var toTile = new Tile(object.getX(), 3549, object.getHeight());
    player.getMovement().clear();
    player.getMovement().addMovement(startTile);
    player.lock();
    var reachedStartTile = false;
    var reachedStartTileTries = 0;
    var event = new Event() {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (!reachedStartTile) {
                if (player.getX() == startTile.getX() && player.getY() == startTile.getY()) {
                    reachedStartTile = true;
                    player.setAnimation(751);
                    player.setForceMovement(new ForceMovement(player, 1, toTile, 2, Tile.SOUTH));
                    event.setTick(1);
                } else if (reachedStartTileTries++ > 32) {
                    player.unlock();
                    event.stop();
                }
            } else {
                event.stop();
                player.getGameEncoder().sendMessage("You skillfully swing across.");
                player.getMovement().teleport(toTile);
                var xp = 22;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                player.putAttribute("agility_stage", 1);
                player.unlock();
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    }
    player.getWorld().addEvent(event);
}

// Ropeswing
DecodedPacketObjectOption.prototype.object_23132 = function(player, index, object) { }

// Obstacle net
DecodedPacketObjectOption.prototype.object_23133 = function(player, index, object) { }

// Obstacle net
DecodedPacketObjectOption.prototype.object_23134 = function(player, index, object) {
    if (player.getY() != 3426) {
        return;
    }
    player.getGameEncoder().sendMessage("You climb the netting.");
    var toTile = new Tile(player.getX(), 3423, 1);
    player.getMovement().ladderUpTeleport(toTile);
    player.setFaceTile(toTile);
    var event = new Event(1) {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            var xp = 8;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            if (player.getAttributeInt("agility_stage") == 1) {
                player.putAttribute("agility_stage", 2);
            }
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    };
    player.getWorld().addEvent(event);
}

// Obstacle net
DecodedPacketObjectOption.prototype.object_23135 = function(player, index, object) {
    if (player.getY() != 3425) {
        return;
    }
    player.getGameEncoder().sendMessage("You climb the netting.");
    var currentTile = new Tile(player);
    var toTile = new Tile(player.getX(), player.getY() == 3425 ? 3427 : 3425, 0);
    player.setLock(5);
    player.getMovement().animatedTeleport(toTile, 3063, -2, null, null, 2);
    player.setFaceTile(toTile);
    var event = new Event(Event.MILLIS_600) {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (event.getExecutions() == 2) {
                player.setFaceTile(currentTile);
            } else if (event.getExecutions() == 5) {
                event.stop();
                var xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 5) {
                    player.putAttribute("agility_stage", 6);
                }
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Obstacle pipe
DecodedPacketObjectOption.prototype.object_23136 = function(player, index, object) { }

// Obstacle pipe
DecodedPacketObjectOption.prototype.object_23137 = function(player, index, object) { }

// Obstacle pipe
DecodedPacketObjectOption.prototype.object_23138 = function(player, index, object) {
    if (player.getX() != object.getX()) {
        return;
    }
    var toTile = new Tile(object.getX(), object.getY() == 3431 ? 3437 : 3430, object.getHeight());
    player.getMovement().clear();
    player.getMovement().addMovement(toTile);
    player.getAppearance().setForceMoveAnimation(749);
    var running = player.getMovement().getRunning();
    player.getMovement().setRunning(false);
    player.lock();
    var event = new Event(Event.MILLIS_600) {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (event.getExecutions() == 1) {
                player.getAppearance().setForceMoveAnimation(747);
            }
            if (player.getDistance(toTile) == 1) {
                player.getAppearance().setForceMoveAnimation(748);
            }
            if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                event.stop();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                var xp = 8 + (player.getAttributeInt("agility_stage") == 6 ? 39 : 0);
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 6) {
                    player.removeAttribute("agility_stage");
                    // 102 laps an hour
                    if (Utils.randomE(50) == 0) {
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
                    player.getFamiliar().rollSkillPet(Skills.AGILITY, 35609, 20659);
                }
                player.unlock();
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Obstacle pipe
DecodedPacketObjectOption.prototype.object_23139 = function(player, index, object) {
    if (player.getX() != object.getX()) {
        return;
    }
    var toTile = new Tile(object.getX(), object.getY() == 3431 ? 3437 : 3430, object.getHeight());
    player.getMovement().clear();
    player.getMovement().addMovement(toTile);
    player.getAppearance().setForceMoveAnimation(749);
    var running = player.getMovement().getRunning();
    player.getMovement().setRunning(false);
    player.lock();
    var event = new Event(Event.MILLIS_600) {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (event.getExecutions() == 1) {
                player.getAppearance().setForceMoveAnimation(747);
            }
            if (player.getDistance(toTile) == 1) {
                player.getAppearance().setForceMoveAnimation(748);
            }
            if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                event.stop();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                var xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 6) {
                    player.removeAttribute("agility_stage");
                    xp = 39;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
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
                }
                player.unlock();
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Obstacle pipe
DecodedPacketObjectOption.prototype.object_23140 = function(player, index, object) { }

// Log balance
DecodedPacketObjectOption.prototype.object_23144 = function(player, index, object) {
    if (player.getSkills().getLevel(Skills.AGILITY) < 35) {
        player.getGameEncoder().sendMessage("You need an Agility level of 35 to use this course.");
        return;
    }
    player.lock();
    var startTile = new Tile(2551, object.getY(), object.getHeight());
    var toTile = new Tile(2541, object.getY(), object.getHeight());
    player.getMovement().clear();
    player.getMovement().addMovement(startTile);
    var running = player.getMovement().getRunning();
    var reachedStartTile = false;
    var event = new Event() {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (!reachedStartTile) {
                if (player.getX() == startTile.getX() && player.getY() == startTile.getY()) {
                    reachedStartTile = true;
                    player.getGameEncoder().sendMessage("You walk carefully across the slippery log...");
                    player.getAppearance().setForceMoveAnimation(762);
                    player.getMovement().setRunning(false);
                    player.getMovement().addMovement(toTile);
                    event.setTick(1);
                }
            } else if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                event.stop();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                var xp = 14;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                player.getGameEncoder().sendMessage("... and make it safely to the other side.");
                player.putAttribute("agility_stage", 2);
                player.unlock();
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    }
    player.getWorld().addEvent(event);
}

// Log balance
DecodedPacketObjectOption.prototype.object_23145 = function(player, index, object) {
    if (player.getX() != object.getX()) {
        return;
    }
    player.getGameEncoder().sendMessage("You walk carefully across the slippery log...");
    var toTile = new Tile(object.getX(), 3429, object.getHeight());
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
                var xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                player.getGameEncoder().sendMessage("... and make it safely to the other side.");
                player.putAttribute("agility_stage", 1);
                player.unlock();
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Picture wall
DecodedPacketObjectOption.prototype.object_23156 = function(player, index, object) { }

// Cave
DecodedPacketObjectOption.prototype.object_23157 = function(player, index, object) {
    // Brine Rat Cavern exit
    var tile = new Tile(2729, 3734, 0);
    player.getMovement().ladderDownTeleport(tile);
}

// Cave
DecodedPacketObjectOption.prototype.object_23158 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_23216 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_23217 = function(player, index, object) { }

// Wilderness Ditch
DecodedPacketObjectOption.prototype.object_23271 = function(player, index, object) {
    var tile;
    if (player.getY() < object.getY()) {
        tile = new Tile(player.getX(), object.getY() + 2, player.getHeight());
        var compareTile = new Tile(tile);
        compareTile.setY(compareTile.getY() + 8);
        if (!player.getController().canTeleport(compareTile, true)) {
            return;
        }
    } else {
        tile = new Tile(player.getX(), object.getY() - 1, player.getHeight());
    }
    var forceMovement = new ForceMovement(new Tile(player), 1, tile, 2,
            player.getY() < object.getY() ? Tile.NORTH : Tile.SOUTH);
    player.setForceMovementTeleport(forceMovement, 6132, 1, null);
    player.clearHits();
    player.getMovement().setTeleportBlock(0);
}

// Log balance
DecodedPacketObjectOption.prototype.object_23274 = function(player, index, object) { }

// Sign
DecodedPacketObjectOption.prototype.object_23275 = function(player, index, object) { }

// Sign
DecodedPacketObjectOption.prototype.object_23276 = function(player, index, object) { }

// Sign
DecodedPacketObjectOption.prototype.object_23277 = function(player, index, object) { }

// Sign
DecodedPacketObjectOption.prototype.object_23278 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_23279 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_23282 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_23283 = function(player, index, object) { }

// Zanik
DecodedPacketObjectOption.prototype.object_23284 = function(player, index, object) { }

// Doorway
DecodedPacketObjectOption.prototype.object_23285 = function(player, index, object) { }

// Doorway
DecodedPacketObjectOption.prototype.object_23286 = function(player, index, object) { }

// Doorway
DecodedPacketObjectOption.prototype.object_23287 = function(player, index, object) { }
