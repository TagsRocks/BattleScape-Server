/* 24832 - 25087 */

// Grimgnash
DecodedPacketObjectOption.prototype.object_24839 = function(player, index, object) { }

// Grimgnash
DecodedPacketObjectOption.prototype.object_24840 = function(player, index, object) { }

// Feathers
DecodedPacketObjectOption.prototype.object_24841 = function(player, index, object) { }

// Manhole
DecodedPacketObjectOption.prototype.object_24842 = function(player, index, object) { }

// Cheese
DecodedPacketObjectOption.prototype.object_24874 = function(player, index, object) { }

// Coins
DecodedPacketObjectOption.prototype.object_24875 = function(player, index, object) { }

// Bones
DecodedPacketObjectOption.prototype.object_24876 = function(player, index, object) { }

// Crumbling wall
DecodedPacketObjectOption.prototype.object_24880 = function(player, index, object) { }

// Piano
DecodedPacketObjectOption.prototype.object_24881 = function(player, index, object) { }

// Gramophone
DecodedPacketObjectOption.prototype.object_24882 = function(player, index, object) { }

// Music Stand
DecodedPacketObjectOption.prototype.object_24883 = function(player, index, object) { }

// Earth Mound
DecodedPacketObjectOption.prototype.object_24884 = function(player, index, object) { }

// Pendant
DecodedPacketObjectOption.prototype.object_24886 = function(player, index, object) { }

// Information Scroll
DecodedPacketObjectOption.prototype.object_24908 = function(player, index, object) { }

// Information Scroll
DecodedPacketObjectOption.prototype.object_24909 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_24957 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_24958 = function(player, index, object) { }

// Hopper controls
DecodedPacketObjectOption.prototype.object_24964 = function(player, index, object) { }

// Hopper controls
DecodedPacketObjectOption.prototype.object_24965 = function(player, index, object) { }

// Hopper controls
DecodedPacketObjectOption.prototype.object_24966 = function(player, index, object) { }

// Fire rift
DecodedPacketObjectOption.prototype.object_24971 = function(player, index, object) {
    Runecrafting.abyssTeleport(player, Runecrafting.Altar.FIRE);
}

// Earth rift
DecodedPacketObjectOption.prototype.object_24972 = function(player, index, object) {
    Runecrafting.abyssTeleport(player, Runecrafting.Altar.EARTH);
}

// Body rift
DecodedPacketObjectOption.prototype.object_24973 = function(player, index, object) {
    Runecrafting.abyssTeleport(player, Runecrafting.Altar.BODY);
}

// Cosmic rift
DecodedPacketObjectOption.prototype.object_24974 = function(player, index, object) {
    Runecrafting.abyssTeleport(player, Runecrafting.Altar.COSMIC);
}

// Nature rift
DecodedPacketObjectOption.prototype.object_24975 = function(player, index, object) {
    Runecrafting.abyssTeleport(player, Runecrafting.Altar.NATURE);
}

// Chaos rift
DecodedPacketObjectOption.prototype.object_24976 = function(player, index, object) {
    Runecrafting.abyssTeleport(player, Runecrafting.Altar.CHAOS);
}

// Centre of crop circle
DecodedPacketObjectOption.prototype.object_24988 = function(player, index, object) { }

// Centre of crop circle
DecodedPacketObjectOption.prototype.object_24991 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_25014 = function(player, index, object) { }

// Magical wheat
DecodedPacketObjectOption.prototype.object_25016 = function(player, index, object) {
    var toTile = null;
    if (object.getDirection() == 0 || object.getDirection() == 2) {
        if (player.getX() != object.getX()) {
            return;
        }
        if (player.getY() > object.getY()) {
            toTile = new Tile(object.getX(), object.getY() - 1, object.getHeight());
        } else {
            toTile = new Tile(object.getX(), object.getY() + 1, object.getHeight());
        }
    } else {
        if (player.getY() != object.getY()) {
            return;
        }
        if (player.getX() > object.getX()) {
            toTile = new Tile(object.getX() - 1, object.getY(), object.getHeight());
        } else {
            toTile = new Tile(object.getX() + 1, object.getY(), object.getHeight());
        }
    }
    player.getMovement().clear();
    player.getMovement().addMovement(toTile);
    player.getAppearance().setForceMoveAnimation(6593);
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
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                player.unlock();
                event.stop();
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Magical wheat
DecodedPacketObjectOption.prototype.object_25019 = function(player, index, object) {
    var toTile = null;
    if (object.getDirection() == 1 || object.getDirection() == 3) {
        if (player.getX() != object.getX()) {
            return;
        }
        if (player.getY() > object.getY()) {
            toTile = new Tile(object.getX(), object.getY() - 1, object.getHeight());
        } else {
            toTile = new Tile(object.getX(), object.getY() + 1, object.getHeight());
        }
    } else {
        if (player.getY() != object.getY()) {
            return;
        }
        if (player.getX() > object.getX()) {
            toTile = new Tile(object.getX() - 1, object.getY(), object.getHeight());
        } else {
            toTile = new Tile(object.getX() + 1, object.getY(), object.getHeight());
        }
    }
    player.getMovement().clear();
    player.getMovement().addMovement(toTile);
    player.getAppearance().setForceMoveAnimation(6593);
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
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                player.unlock();
                event.stop();
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Magical wheat
DecodedPacketObjectOption.prototype.object_25020 = function(player, index, object) {
    var toTile = null;
    if (object.getDirection() == 1 || object.getDirection() == 3) {
        if (player.getX() != object.getX()) {
            return;
        }
        if (player.getY() > object.getY()) {
            toTile = new Tile(object.getX(), object.getY() - 1, object.getHeight());
        } else {
            toTile = new Tile(object.getX(), object.getY() + 1, object.getHeight());
        }
    } else {
        if (player.getY() != object.getY()) {
            return;
        }
        if (player.getX() > object.getX()) {
            toTile = new Tile(object.getX() - 1, object.getY(), object.getHeight());
        } else {
            toTile = new Tile(object.getX() + 1, object.getY(), object.getHeight());
        }
    }
    player.getMovement().clear();
    player.getMovement().addMovement(toTile);
    player.getAppearance().setForceMoveAnimation(6593);
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
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                player.unlock();
                event.stop();
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Magical wheat
DecodedPacketObjectOption.prototype.object_25021 = function(player, index, object) {
    var toTile = null;
    if (object.getDirection() == 1 || object.getDirection() == 3) {
        if (player.getX() != object.getX()) {
            return;
        }
        if (player.getY() > object.getY()) {
            toTile = new Tile(object.getX(), object.getY() - 1, object.getHeight());
        } else {
            toTile = new Tile(object.getX(), object.getY() + 1, object.getHeight());
        }
    } else {
        if (player.getY() != object.getY()) {
            return;
        }
        if (player.getX() > object.getX()) {
            toTile = new Tile(object.getX() - 1, object.getY(), object.getHeight());
        } else {
            toTile = new Tile(object.getX() + 1, object.getY(), object.getHeight());
        }
    }
    player.getMovement().clear();
    player.getMovement().addMovement(toTile);
    player.getAppearance().setForceMoveAnimation(6593);
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
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                player.unlock();
                event.stop();
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Magical wheat
DecodedPacketObjectOption.prototype.object_25029 = function(player, index, object) {
    var toTile = null;
    if (player.getX() != object.getX() && player.getY() != object.getY()) {
        return;
    }
    if (player.getX() == object.getX()) {
        if (player.getY() > object.getY()) {
            toTile = new Tile(object.getX(), object.getY() - 1, object.getHeight());
        } else {
            toTile = new Tile(object.getX(), object.getY() + 1, object.getHeight());
        }
    } else if (player.getY() == object.getY()) {
        if (player.getX() > object.getX()) {
            toTile = new Tile(object.getX() - 1, object.getY(), object.getHeight());
        } else {
            toTile = new Tile(object.getX() + 1, object.getY(), object.getHeight());
        }
    } else {
        return;
    }
    player.getMovement().clear();
    player.getMovement().addMovement(toTile);
    player.getAppearance().setForceMoveAnimation(6593);
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
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setRunning(running);
                player.unlock();
                event.stop();
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Law rift
DecodedPacketObjectOption.prototype.object_25034 = function(player, index, object) {
    Runecrafting.abyssTeleport(player, Runecrafting.Altar.LAW);
}

// Death rift
DecodedPacketObjectOption.prototype.object_25035 = function(player, index, object) {
    Runecrafting.abyssTeleport(player, Runecrafting.Altar.DEATH);
}

// Hole
DecodedPacketObjectOption.prototype.object_25036 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_25038 = function(player, index, object) { }

// Wardrobe
DecodedPacketObjectOption.prototype.object_25040 = function(player, index, object) { }

// Wardrobe
DecodedPacketObjectOption.prototype.object_25041 = function(player, index, object) { }

// Wardrobe
DecodedPacketObjectOption.prototype.object_25042 = function(player, index, object) { }

// Wardrobe
DecodedPacketObjectOption.prototype.object_25043 = function(player, index, object) { }

// Wardrobe
DecodedPacketObjectOption.prototype.object_25044 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_25045 = function(player, index, object) { }

// Bookshelves
DecodedPacketObjectOption.prototype.object_25046 = function(player, index, object) { }
