/* 23296 - 23551 */

// Door
DecodedPacketObjectOption.prototype.object_23338 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_23339 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_23340 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_23341 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_23342 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_23343 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_23376 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_23377 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_23378 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_23499 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_23504 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_23530 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_23531 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_23532 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_23533 = function(player, index, object) { }

// Log balance
DecodedPacketObjectOption.prototype.object_23542 = function(player, index, object) { }

// Climbing rocks
DecodedPacketObjectOption.prototype.object_23543 = function(player, index, object) { }

// Climbing rocks
DecodedPacketObjectOption.prototype.object_23544 = function(player, index, object) { }

// Climbing rocks
DecodedPacketObjectOption.prototype.object_23545 = function(player, index, object) { }

// Balancing ledge
DecodedPacketObjectOption.prototype.object_23546 = function(player, index, object) { }

// Balancing ledge
DecodedPacketObjectOption.prototype.object_23547 = function(player, index, object) {
    if (player.getY() != object.getY()) {
        return;
    }
    player.getGameEncoder().sendMessage("You put your foot on the ledge and try to edge across...");
    var toTile = new Tile(2532, object.getY(), object.getHeight());
    var running = player.getMovement().getRunning();
    player.setAnimation(753);
    player.lock();
    var event = new Event() {
        execute: function() {
            if (!player.isVisible()) {
                event.stop();
                return;
            }
            if (event.getExecutions() == 0) {
                player.getMovement().clear();
                player.getMovement().addMovement(toTile);
                player.getMovement().setRunning(false);
                player.getAppearance().setForceMoveAnimation(756);
            }
            if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                event.stop();
                player.setAnimation(759);
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                var xp = 22;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                player.getGameEncoder().sendMessage("You skillfully edge across the gap.");
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

// Balancing ledge
DecodedPacketObjectOption.prototype.object_23548 = function(player, index, object) { }
