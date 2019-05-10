/* 23552 - 23807 */

// Gate
DecodedPacketObjectOption.prototype.object_23552 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_23553 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_23554 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_23555 = function(player, index, object) { }

// Stepping stone
DecodedPacketObjectOption.prototype.object_23556 = function(player, index, object) { }

// Balancing rope
DecodedPacketObjectOption.prototype.object_23557 = function(player, index, object) {
    if (player.getX() != 2477 || player.getY() != 3420) {
        return;
    }
    player.getGameEncoder().sendMessage("You walk carefully across the rope...");
    var toTile = new Tile(2483, object.getY(), object.getHeight());
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
                if (player.getAttributeInt("agility_stage") == 3) {
                    player.putAttribute("agility_stage", 4);
                }
                player.unlock();
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Balancing rope
DecodedPacketObjectOption.prototype.object_23558 = function(player, index, object) { }

// Tree branch
DecodedPacketObjectOption.prototype.object_23559 = function(player, index, object) {
    player.getGameEncoder().sendMessage("You climb the tree...");
    var toTile = new Tile(2473, 3420, 2);
    player.getMovement().ladderUpTeleport(toTile);
    var event = new Event(1) {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.getGameEncoder().sendMessage("... to the platform above.");
            var xp = 5;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            if (player.getAttributeInt("agility_stage") == 2) {
                player.putAttribute("agility_stage", 3);
            }
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    };
    player.getWorld().addEvent(event);
}

// Tree branch
DecodedPacketObjectOption.prototype.object_23560 = function(player, index, object) {
    player.getGameEncoder().sendMessage("You climb down the tree...");
    var toTile = new Tile(2487, 3421, 0);
    player.getMovement().ladderUpTeleport(toTile);
    var event = new Event(1) {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.getGameEncoder().sendMessage("... and land on the ground.");
            var xp = 5;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            if (player.getAttributeInt("agility_stage") == 4) {
                player.putAttribute("agility_stage", 5);
            }
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    };
    player.getWorld().addEvent(event);
}

// Tree branch
DecodedPacketObjectOption.prototype.object_23561 = function(player, index, object) {
    player.getGameEncoder().sendMessage("You climb down the tree...");
    var toTile = new Tile(2487, 3421, 0);
    player.getMovement().ladderUpTeleport(toTile);
    var event = new Event(1) {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.getGameEncoder().sendMessage("... and land on the ground.");
            var xp = 5;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            if (player.getAttributeInt("agility_stage") == 4) {
                player.putAttribute("agility_stage", 5);
            }
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    };
    player.getWorld().addEvent(event);
}

// Staircase
DecodedPacketObjectOption.prototype.object_23562 = function(player, index, object) { }

// Pile of rubble
DecodedPacketObjectOption.prototype.object_23563 = function(player, index, object) { }

// Pile of rubble
DecodedPacketObjectOption.prototype.object_23564 = function(player, index, object) { }

// Monkeybars
DecodedPacketObjectOption.prototype.object_23566 = function(player, index, object) {
    if (player.getController().isMagicBound()) {
        player.getGameEncoder().sendMessage("A magical force stops you from moving for "
                + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                + " more seconds.");
        return;
    }
    if (object.getX() == 3120 && object.getY() == 9964) {
        player.getMovement().teleport(3121, 9970);
    } else if (object.getX() == 3120 && object.getY() == 9969) {
        player.getMovement().teleport(3121, 9963);
    }
}

// Monkeybars
DecodedPacketObjectOption.prototype.object_23567 = function(player, index, object) { }

// Ropeswing
DecodedPacketObjectOption.prototype.object_23568 = function(player, index, object) { }

// Ropeswing
DecodedPacketObjectOption.prototype.object_23569 = function(player, index, object) { }

// Ropeswing
DecodedPacketObjectOption.prototype.object_23570 = function(player, index, object) { }

// Ropeswing
DecodedPacketObjectOption.prototype.object_23571 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_23584 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_23585 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_23586 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_23596 = function(player, index, object) { }

// Tunnel entrance
DecodedPacketObjectOption.prototype.object_23609 = function(player, index, object) {
    if (object.getX() == 3509 && object.getY() == 9497) {
        player.openDialogue("bossinstance", 13);
    }
}

// Cocoon
DecodedPacketObjectOption.prototype.object_23611 = function(player, index, object) { }

// Cadava bush
DecodedPacketObjectOption.prototype.object_23625 = function(player, index, object) { }

// Cadava bush
DecodedPacketObjectOption.prototype.object_23626 = function(player, index, object) { }

// Cadava bush
DecodedPacketObjectOption.prototype.object_23627 = function(player, index, object) { }

// Redberry bush
DecodedPacketObjectOption.prototype.object_23628 = function(player, index, object) { }

// Redberry bush
DecodedPacketObjectOption.prototype.object_23629 = function(player, index, object) { }

// Redberry bush
DecodedPacketObjectOption.prototype.object_23630 = function(player, index, object) { }

// Plaque
DecodedPacketObjectOption.prototype.object_23636 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_23640 = function(player, index, object) { }

// A wooden log
DecodedPacketObjectOption.prototype.object_23644 = function(player, index, object) { }

// Stepping stones
DecodedPacketObjectOption.prototype.object_23645 = function(player, index, object) { }

// Stepping stones
DecodedPacketObjectOption.prototype.object_23646 = function(player, index, object) { }

// Stepping stones
DecodedPacketObjectOption.prototype.object_23647 = function(player, index, object) { }

// Oozing barrier
DecodedPacketObjectOption.prototype.object_23653 = function(player, index, object) { }

// Oozing barrier
DecodedPacketObjectOption.prototype.object_23654 = function(player, index, object) { }

// Telekinetic Teleport
DecodedPacketObjectOption.prototype.object_23673 = function(player, index, object) { }

// Enchanters Teleport
DecodedPacketObjectOption.prototype.object_23674 = function(player, index, object) { }

// Alchemists Teleport
DecodedPacketObjectOption.prototype.object_23675 = function(player, index, object) { }

// Graveyard Teleport
DecodedPacketObjectOption.prototype.object_23676 = function(player, index, object) { }

// Exit Teleport
DecodedPacketObjectOption.prototype.object_23677 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23678 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23679 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23680 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23681 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23682 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23683 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23684 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23685 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23686 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23687 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23688 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23689 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23690 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23691 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23692 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_23693 = function(player, index, object) { }

// Cube Pile
DecodedPacketObjectOption.prototype.object_23694 = function(player, index, object) { }

// Cylinder Pile
DecodedPacketObjectOption.prototype.object_23695 = function(player, index, object) { }

// Icosahedron Pile
DecodedPacketObjectOption.prototype.object_23696 = function(player, index, object) { }

// Pentamid Pile
DecodedPacketObjectOption.prototype.object_23697 = function(player, index, object) { }

// Hole
DecodedPacketObjectOption.prototype.object_23698 = function(player, index, object) { }

// Goo covered vine
DecodedPacketObjectOption.prototype.object_23703 = function(player, index, object) { }

// Goo covered vine
DecodedPacketObjectOption.prototype.object_23704 = function(player, index, object) { }

// Dripping vine
DecodedPacketObjectOption.prototype.object_23705 = function(player, index, object) { }

// Dripping vine
DecodedPacketObjectOption.prototype.object_23706 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_23707 = function(player, index, object) { }

// Box of Health
DecodedPacketObjectOption.prototype.object_23709 = function(player, index, object) {
    if (player.inPvPWorld()) {
        player.getGameEncoder().sendMessage("You can't use this here.");
        return;
    }
    player.setGraphic(436);
    player.getGameEncoder().sendMessage("The pool restores you.");
    player.rejuvenate();
}

// Portal of Death
DecodedPacketObjectOption.prototype.object_23727 = function(player, index, object) { }

// Portal of Death
DecodedPacketObjectOption.prototype.object_23728 = function(player, index, object) { }

// Cradle of Life
DecodedPacketObjectOption.prototype.object_23731 = function(player, index, object) { }

// Bone Chain
DecodedPacketObjectOption.prototype.object_23732 = function(player, index, object) { }
