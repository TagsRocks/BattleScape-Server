/* 30208 - 30463 */

// rope
DecodedPacketObjectOption.prototype.object_30234 = function(player, index, object) { }

// chasm
DecodedPacketObjectOption.prototype.object_30236 = function(player, index, object) { }

// Lift
DecodedPacketObjectOption.prototype.object_30258 = function(player, index, object) {
    if (object.getX() == 1437 && object.getY() == 10094) {
        player.getMovement().ladderUpTeleport(new Tile(1437, 10093, 2));
    } else if (object.getX() == 1452 && object.getY() == 10068) {
        player.getMovement().ladderUpTeleport(new Tile(1451, 10069, 2));
    } else if (object.getX() == 1458 && object.getY() == 10095) {
        player.getMovement().ladderUpTeleport(new Tile(1457, 10095, 1));
    }
}

// Lift
DecodedPacketObjectOption.prototype.object_30259 = function(player, index, object) {
    if (object.getX() == 1437 && object.getY() == 10094) {
        player.getMovement().ladderUpTeleport(new Tile(1437, 10093, 3));
    } else if (object.getX() == 1452 && object.getY() == 10068) {
        player.getMovement().ladderUpTeleport(new Tile(1451, 10069, 3));
    } else if (object.getX() == 1458 && object.getY() == 10095) {
        player.getMovement().ladderUpTeleport(new Tile(1457, 10095, 2));
    }
}

// hot vent door
DecodedPacketObjectOption.prototype.object_30266 = function(player, index, object) { }

// bank chest
DecodedPacketObjectOption.prototype.object_30267 = function(player, index, object) { }

// bank deposit box
DecodedPacketObjectOption.prototype.object_30268 = function(player, index, object) {
    player.getBank().openDepositBox();
}

// shop counter
DecodedPacketObjectOption.prototype.object_30279 = function(player, index, object) { }

// shop counter
DecodedPacketObjectOption.prototype.object_30280 = function(player, index, object) { }

// the inferno
DecodedPacketObjectOption.prototype.object_30282 = function(player, index, object) { }

// cave exit
DecodedPacketObjectOption.prototype.object_30283 = function(player, index, object) {
    player.getTzHaar().exitInferno();
}

// the inferno
DecodedPacketObjectOption.prototype.object_30352 = function(player, index, object) {
    if (player.getTzHaar().getInfernoSacrificedCape()) {
        player.openDialogue("tzhaar", 4);
    } else {
        player.openDialogue("tzhaar", 5);
    }
}

// barrel
DecodedPacketObjectOption.prototype.object_30357 = function(player, index, object) { }

// door
DecodedPacketObjectOption.prototype.object_30364 = function(player, index, object) {
    Region.openDoor(player, object);
}

// door
DecodedPacketObjectOption.prototype.object_30365 = function(player, index, object) {
    Region.openDoor(player, object);
}

// door
DecodedPacketObjectOption.prototype.object_30366 = function(player, index, object) {
    Region.openDoor(player, object);
}

// ladder
DecodedPacketObjectOption.prototype.object_30367 = function(player, index, object) { }

// crystals
DecodedPacketObjectOption.prototype.object_30371 = function(player, index, object) { }

// crystals
DecodedPacketObjectOption.prototype.object_30372 = function(player, index, object) { }

// empty wall
DecodedPacketObjectOption.prototype.object_30373 = function(player, index, object) { }

// cave
DecodedPacketObjectOption.prototype.object_30374 = function(player, index, object) { }

// tunnel
DecodedPacketObjectOption.prototype.object_30375 = function(player, index, object) { }

// row boat
DecodedPacketObjectOption.prototype.object_30376 = function(player, index, object) {
    player.getMovement().teleport(2614, 3440);
}

// row boat
DecodedPacketObjectOption.prototype.object_30377 = function(player, index, object) {
    player.getMovement().teleport(2600, 3425);
}

// lizardman lair
DecodedPacketObjectOption.prototype.object_30380 = function(player, index, object) {
    player.getMovement().ladderDownTeleport(new Tile(1305, 9973, 0));
}

// crevice
DecodedPacketObjectOption.prototype.object_30381 = function(player, index, object) {
    player.getMovement().ladderUpTeleport(new Tile(1309, 3574, 0));
}

// crevice
DecodedPacketObjectOption.prototype.object_30382 = function(player, index, object) {
    if (object.getX() == 1305 && object.getY() == 9954) {
        player.getMovement().teleport(1305, 9957);
    } else if (object.getX() == 1318 && object.getY() == 9957) {
        player.getMovement().teleport(1318, 9960);
    }
}

// crevice
DecodedPacketObjectOption.prototype.object_30383 = function(player, index, object) {
    if (object.getX() == 1305 && object.getY() == 9956) {
        player.getMovement().teleport(1305, 9953);
    } else if (object.getX() == 1318 && object.getY() == 9959) {
        player.getMovement().teleport(1318, 9956);
    }
}

// crevice
DecodedPacketObjectOption.prototype.object_30384 = function(player, index, object) {
    if (object.getX() == 1296 && object.getY() == 9959) {
        player.getMovement().teleport(1299, 9959);
    } else if (object.getX() == 1320 && object.getY() == 9966) {
        player.getMovement().teleport(1323, 9966);
    }
}

// crevice
DecodedPacketObjectOption.prototype.object_30385 = function(player, index, object) {
    if (object.getX() == 1298 && object.getY() == 9959) {
        player.getMovement().teleport(1295, 9959);
    } else if (object.getX() == 1322 && object.getY() == 9966) {
        player.getMovement().teleport(1319, 9966);
    }
}

// castle wars portal
DecodedPacketObjectOption.prototype.object_30386 = function(player, index, object) { }

// large door
DecodedPacketObjectOption.prototype.object_30387 = function(player, index, object) { }

// large door
DecodedPacketObjectOption.prototype.object_30388 = function(player, index, object) { }

// grand exchange booth
DecodedPacketObjectOption.prototype.object_30389 = function(player, index, object) { }

// grand exchange booth
DecodedPacketObjectOption.prototype.object_30390 = function(player, index, object) { }

// iron ladder
DecodedPacketObjectOption.prototype.object_30391 = function(player, index, object) { }

// iron ladder
DecodedPacketObjectOption.prototype.object_30392 = function(player, index, object) { }

// inactive portal
DecodedPacketObjectOption.prototype.object_30395 = function(player, index, object) { }

// shimmering barrier
DecodedPacketObjectOption.prototype.object_30396 = function(player, index, object) { }

// shimmering barrier
DecodedPacketObjectOption.prototype.object_30397 = function(player, index, object) { }

// shimmering barrier
DecodedPacketObjectOption.prototype.object_30398 = function(player, index, object) { }

// shimmering barrier
DecodedPacketObjectOption.prototype.object_30399 = function(player, index, object) { }

// shimmering barrier
DecodedPacketObjectOption.prototype.object_30400 = function(player, index, object) { }

// mounted champion's cape
DecodedPacketObjectOption.prototype.object_30403 = function(player, index, object) { }

// mahogany sapling
DecodedPacketObjectOption.prototype.object_30406 = function(player, index, object) { }

// mahogany tree
DecodedPacketObjectOption.prototype.object_30407 = function(player, index, object) { }

// mahogany tree
DecodedPacketObjectOption.prototype.object_30408 = function(player, index, object) { }

// mahogany tree
DecodedPacketObjectOption.prototype.object_30409 = function(player, index, object) { }

// mahogany tree
DecodedPacketObjectOption.prototype.object_30410 = function(player, index, object) { }

// mahogany tree
DecodedPacketObjectOption.prototype.object_30411 = function(player, index, object) { }

// mahogany tree
DecodedPacketObjectOption.prototype.object_30412 = function(player, index, object) { }

// mahogany tree
DecodedPacketObjectOption.prototype.object_30413 = function(player, index, object) { }

// mahogany tree
DecodedPacketObjectOption.prototype.object_30414 = function(player, index, object) { }

// mahogany tree
DecodedPacketObjectOption.prototype.object_30415 = function(player, index, object) { }

// mahogany tree
DecodedPacketObjectOption.prototype.object_30416 = function(player, index, object) { }

// mahogany tree
DecodedPacketObjectOption.prototype.object_30417 = function(player, index, object) { }

// mahogany tree stump
DecodedPacketObjectOption.prototype.object_30418 = function(player, index, object) { }

// diseased mahogany
DecodedPacketObjectOption.prototype.object_30419 = function(player, index, object) { }

// diseased mahogany
DecodedPacketObjectOption.prototype.object_30420 = function(player, index, object) { }

// diseased mahogany
DecodedPacketObjectOption.prototype.object_30421 = function(player, index, object) { }

// diseased mahogany
DecodedPacketObjectOption.prototype.object_30422 = function(player, index, object) { }

// diseased mahogany
DecodedPacketObjectOption.prototype.object_30423 = function(player, index, object) { }

// diseased mahogany
DecodedPacketObjectOption.prototype.object_30424 = function(player, index, object) { }

// diseased mahogany
DecodedPacketObjectOption.prototype.object_30425 = function(player, index, object) { }

// diseased mahogany
DecodedPacketObjectOption.prototype.object_30426 = function(player, index, object) { }

// diseased mahogany
DecodedPacketObjectOption.prototype.object_30427 = function(player, index, object) { }

// dead mahogany
DecodedPacketObjectOption.prototype.object_30428 = function(player, index, object) { }

// dead mahogany
DecodedPacketObjectOption.prototype.object_30429 = function(player, index, object) { }

// dead mahogany
DecodedPacketObjectOption.prototype.object_30430 = function(player, index, object) { }

// dead mahogany
DecodedPacketObjectOption.prototype.object_30431 = function(player, index, object) { }

// dead mahogany
DecodedPacketObjectOption.prototype.object_30432 = function(player, index, object) { }

// dead mahogany
DecodedPacketObjectOption.prototype.object_30433 = function(player, index, object) { }

// dead mahogany
DecodedPacketObjectOption.prototype.object_30434 = function(player, index, object) { }

// dead mahogany
DecodedPacketObjectOption.prototype.object_30435 = function(player, index, object) { }

// dead mahogany
DecodedPacketObjectOption.prototype.object_30436 = function(player, index, object) { }

// teak tree
DecodedPacketObjectOption.prototype.object_30437 = function(player, index, object) { }

// teak tree
DecodedPacketObjectOption.prototype.object_30438 = function(player, index, object) { }

// teak tree
DecodedPacketObjectOption.prototype.object_30439 = function(player, index, object) { }

// teak tree
DecodedPacketObjectOption.prototype.object_30440 = function(player, index, object) { }

// teak tree
DecodedPacketObjectOption.prototype.object_30441 = function(player, index, object) { }

// teak tree
DecodedPacketObjectOption.prototype.object_30442 = function(player, index, object) { }

// teak tree
DecodedPacketObjectOption.prototype.object_30443 = function(player, index, object) { }

// teak tree
DecodedPacketObjectOption.prototype.object_30444 = function(player, index, object) { }

// teak tree
DecodedPacketObjectOption.prototype.object_30445 = function(player, index, object) { }

// tree stump
DecodedPacketObjectOption.prototype.object_30446 = function(player, index, object) { }

// diseased teak
DecodedPacketObjectOption.prototype.object_30447 = function(player, index, object) { }

// diseased teak
DecodedPacketObjectOption.prototype.object_30448 = function(player, index, object) { }

// diseased teak
DecodedPacketObjectOption.prototype.object_30449 = function(player, index, object) { }

// diseased teak
DecodedPacketObjectOption.prototype.object_30450 = function(player, index, object) { }

// diseased teak
DecodedPacketObjectOption.prototype.object_30451 = function(player, index, object) { }

// diseased teak
DecodedPacketObjectOption.prototype.object_30452 = function(player, index, object) { }

// dead teak
DecodedPacketObjectOption.prototype.object_30453 = function(player, index, object) { }

// dead teak
DecodedPacketObjectOption.prototype.object_30454 = function(player, index, object) { }

// dead teak
DecodedPacketObjectOption.prototype.object_30455 = function(player, index, object) { }

// dead teak
DecodedPacketObjectOption.prototype.object_30456 = function(player, index, object) { }

// dead teak
DecodedPacketObjectOption.prototype.object_30457 = function(player, index, object) { }

// dead teak
DecodedPacketObjectOption.prototype.object_30458 = function(player, index, object) { }

// dead teak
DecodedPacketObjectOption.prototype.object_30459 = function(player, index, object) { }
