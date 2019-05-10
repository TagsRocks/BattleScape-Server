/* 34304 - 34559 */

// redwood tree
DecodedPacketObjectOption.prototype.object_34304 = function(player, index, object) { }

// redwood tree
DecodedPacketObjectOption.prototype.object_34305 = function(player, index, object) { }

// redwood tree
DecodedPacketObjectOption.prototype.object_34306 = function(player, index, object) { }

// redwood tree
DecodedPacketObjectOption.prototype.object_34307 = function(player, index, object) { }

// redwood tree
DecodedPacketObjectOption.prototype.object_34308 = function(player, index, object) { }

// redwood tree
DecodedPacketObjectOption.prototype.object_34309 = function(player, index, object) { }

// redwood tree
DecodedPacketObjectOption.prototype.object_34310 = function(player, index, object) { }

// redwood tree
DecodedPacketObjectOption.prototype.object_34311 = function(player, index, object) { }

// volcanic furnace
DecodedPacketObjectOption.prototype.object_34342 = function(player, index, object) { }

// bank chest
DecodedPacketObjectOption.prototype.object_34343 = function(player, index, object) { }

// bank deposit box
DecodedPacketObjectOption.prototype.object_34344 = function(player, index, object) { }

// elevator controls
DecodedPacketObjectOption.prototype.object_34356 = function(player, index, object) { }

// elevator
DecodedPacketObjectOption.prototype.object_34359 = function(player, index, object) { }

// rocks
DecodedPacketObjectOption.prototype.object_34396 = function(player, index, object) { }

// rocks
DecodedPacketObjectOption.prototype.object_34397 = function(player, index, object) { }

// lizard dwelling
DecodedPacketObjectOption.prototype.object_34402 = function(player, index, object) { }

// lizard dwelling
DecodedPacketObjectOption.prototype.object_34403 = function(player, index, object) { }

// lizard dwelling
DecodedPacketObjectOption.prototype.object_34404 = function(player, index, object) { }

// lizard dwelling
DecodedPacketObjectOption.prototype.object_34405 = function(player, index, object) { }

// strange hole
DecodedPacketObjectOption.prototype.object_34422 = function(player, index, object) { }

// stone chest
DecodedPacketObjectOption.prototype.object_34429 = function(player, index, object) { }

// stone chest
DecodedPacketObjectOption.prototype.object_34431 = function(player, index, object) { }

// mystical barrier
DecodedPacketObjectOption.prototype.object_34432 = function(player, index, object) { }

// mystical barrier (orange)
DecodedPacketObjectOption.prototype.object_34433 = function(player, index, object) { }

// mystical barrier (red)
DecodedPacketObjectOption.prototype.object_34434 = function(player, index, object) { }

// cave
DecodedPacketObjectOption.prototype.object_34435 = function(player, index, object) { }

// cave
DecodedPacketObjectOption.prototype.object_34436 = function(player, index, object) { }

// door
DecodedPacketObjectOption.prototype.object_34463 = function(player, index, object) { }

// door
DecodedPacketObjectOption.prototype.object_34464 = function(player, index, object) { }

// gate
DecodedPacketObjectOption.prototype.object_34469 = function(player, index, object) { }

// gate
DecodedPacketObjectOption.prototype.object_34470 = function(player, index, object) { }

// gate
DecodedPacketObjectOption.prototype.object_34473 = function(player, index, object) { }

// gate
DecodedPacketObjectOption.prototype.object_34474 = function(player, index, object) { }

// rope ladder
DecodedPacketObjectOption.prototype.object_34477 = function(player, index, object) { }

// rope ladder
DecodedPacketObjectOption.prototype.object_34478 = function(player, index, object) { }

// cave
DecodedPacketObjectOption.prototype.object_34499 = function(player, index, object) { }

// bed
DecodedPacketObjectOption.prototype.object_34501 = function(player, index, object) { }

// staircase
DecodedPacketObjectOption.prototype.object_34502 = function(player, index, object) { }

// staircase
DecodedPacketObjectOption.prototype.object_34503 = function(player, index, object) { }

// crate
DecodedPacketObjectOption.prototype.object_34504 = function(player, index, object) { }

// shelves
DecodedPacketObjectOption.prototype.object_34505 = function(player, index, object) { }

// shelves
DecodedPacketObjectOption.prototype.object_34506 = function(player, index, object) { }

// shelves
DecodedPacketObjectOption.prototype.object_34507 = function(player, index, object) { }

// crate
DecodedPacketObjectOption.prototype.object_34508 = function(player, index, object) { }

// crate
DecodedPacketObjectOption.prototype.object_34509 = function(player, index, object) { }

// crate
DecodedPacketObjectOption.prototype.object_34510 = function(player, index, object) { }

// elevator controls
DecodedPacketObjectOption.prototype.object_34513 = function(player, index, object) { }

// cave exit
DecodedPacketObjectOption.prototype.object_34514 = function(player, index, object) {
    player.getMovement().ladderUpTeleport(new Tile(1311, 3805));
}

// lava gap
DecodedPacketObjectOption.prototype.object_34515 = function(player, index, object) {
    if (object.getX() == 1269 && object.getY() == 10171) {
        if (player.getY() >= 10175) {
            player.getMovement().teleport(1270, 10170);
        } else {
            player.getMovement().teleport(1270, 10175);
        }
    } else if (object.getX() == 1307 && object.getY() == 10253) {
        if (player.getY() <= 10252) {
            player.getMovement().teleport(1308, 10257);
        } else {
            player.getMovement().teleport(1308, 10252);
        }
    }
}

// tunnel
DecodedPacketObjectOption.prototype.object_34516 = function(player, index, object) {
    if (object.getX() == 1330 && object.getY() == 10238) {
        if (player.getX() <= 1329) {
            player.getMovement().teleport(1336, 10239, 1);
        } else {
            player.getMovement().teleport(1329, 10239, 1);
        }
    }
}

// steps
DecodedPacketObjectOption.prototype.object_34530 = function(player, index, object) {
    if (object.getX() == 1330 && object.getY() == 10205) {
        player.getMovement().ladderUpTeleport(new Tile(1334, 10205, 1));
    }
}

// steps
DecodedPacketObjectOption.prototype.object_34531 = function(player, index, object) {
    if (object.getX() == 1330 && object.getY() == 10205) {
        player.getMovement().ladderDownTeleport(new Tile(1329, 10205));
    }
}

// rocks
DecodedPacketObjectOption.prototype.object_34544 = function(player, index, object) {
    if (object.getX() == 1302 && object.getY() == 10205) {
        if (player.getX() >= 1303) {
            player.getMovement().teleport(1301, 10205);
        } else {
            player.getMovement().teleport(1303, 10205);
        }
    } else if (object.getX() == 1321 && object.getY() == 10205) {
        if (player.getX() <= 1320) {
            player.getMovement().teleport(1322, 10205);
        } else {
            player.getMovement().teleport(1320, 10205);
        }
    } else if (object.getX() == 1311 && object.getY() == 10215) {
        if (player.getY() <= 10214) {
            player.getMovement().teleport(1311, 10216);
        } else {
            player.getMovement().teleport(1311, 10214);
        }
    }
}

// rocks
DecodedPacketObjectOption.prototype.object_34548 = function(player, index, object) {
    if (object.getX() == 1351 && object.getY() == 10251) {
        if (player.getY() <= 10250) {
            player.getMovement().teleport(1351, 10252);
        } else {
            player.getMovement().teleport(1351, 10250);
        }
    }
}

// alchemical door
DecodedPacketObjectOption.prototype.object_34553 = function(player, index, object) {
    if (player.getX() <= 1355) {
        player.openDialogue("bossinstance", 14);
    } else {
        player.getController().stopWithTeleport();
        player.getMovement().teleport(1355, 10258);
    }
}

// alchemical door
DecodedPacketObjectOption.prototype.object_34554 = function(player, index, object) {
    if (player.getX() <= 1355) {
        player.openDialogue("bossinstance", 14);
    } else {
        player.getController().stopWithTeleport();
        player.getMovement().teleport(1355, 10258);
    }
}
