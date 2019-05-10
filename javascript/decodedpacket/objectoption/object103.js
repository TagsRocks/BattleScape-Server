/* 26368 - 26623 */

// Rope
DecodedPacketObjectOption.prototype.object_26370 = function(player, index, object) { }

// Rope
DecodedPacketObjectOption.prototype.object_26371 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_26372 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_26373 = function(player, index, object) { }

// Rope
DecodedPacketObjectOption.prototype.object_26374 = function(player, index, object) { }

// Rope
DecodedPacketObjectOption.prototype.object_26375 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_26376 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_26377 = function(player, index, object) { }

// Rope
DecodedPacketObjectOption.prototype.object_26378 = function(player, index, object) { }

// Pillar
DecodedPacketObjectOption.prototype.object_26380 = function(player, index, object) { }

// Little crack
DecodedPacketObjectOption.prototype.object_26382 = function(player, index, object) { }

// Knight
DecodedPacketObjectOption.prototype.object_26383 = function(player, index, object) { }

// Rocky handholds
DecodedPacketObjectOption.prototype.object_26400 = function(player, index, object) { }

// Rocky handholds
DecodedPacketObjectOption.prototype.object_26401 = function(player, index, object) { }

// Rocky handholds
DecodedPacketObjectOption.prototype.object_26402 = function(player, index, object) { }

// Rocky handholds
DecodedPacketObjectOption.prototype.object_26404 = function(player, index, object) { }

// Rocky handholds
DecodedPacketObjectOption.prototype.object_26405 = function(player, index, object) { }

// Rocky handholds
DecodedPacketObjectOption.prototype.object_26406 = function(player, index, object) { }

// Boulder
DecodedPacketObjectOption.prototype.object_26415 = function(player, index, object) { }

// Hole
DecodedPacketObjectOption.prototype.object_26417 = function(player, index, object) { }

// Hole
DecodedPacketObjectOption.prototype.object_26418 = function(player, index, object) { }

// Hole
DecodedPacketObjectOption.prototype.object_26419 = function(player, index, object) {
    // God Wars entrance
    player.setController(new GodWarsPC());
    player.getMovement().ladderDownTeleport(new Tile(2882, 5311, 2));
}

// Broken pillar
DecodedPacketObjectOption.prototype.object_26420 = function(player, index, object) { }

// Rope
DecodedPacketObjectOption.prototype.object_26422 = function(player, index, object) { }

// Big door
DecodedPacketObjectOption.prototype.object_26461 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26492 = function(player, index, object) { }

// Big door
DecodedPacketObjectOption.prototype.object_26502 = function(player, index, object) {
    if (player.getY() <= 5294) {
        //player.getMovement().teleport(new Tile(2839, 5296, 2));
        player.openDialogue("bossinstance", 7);
    } else {
        player.getGameEncoder().sendMessage("You must use the altar to leave.");
        //player.getMovement().teleport(new Tile(2839, 5294, 2));
    }
}

// Big door
DecodedPacketObjectOption.prototype.object_26503 = function(player, index, object) {
    if (player.getX() <= 2862) {
        //player.getMovement().teleport(new Tile(2864, 5354, 2));
        player.openDialogue("bossinstance", 8);
    } else {
        player.getGameEncoder().sendMessage("You must use the altar to leave.");
        //player.getMovement().teleport(new Tile(2862, 5354, 2));
    }
}

// Big door
DecodedPacketObjectOption.prototype.object_26504 = function(player, index, object) {
    if (player.getX() >= 2909) {
        //player.getMovement().teleport(new Tile(2907, 5265, 0));
        player.openDialogue("bossinstance", 10);
    } else {
        player.getGameEncoder().sendMessage("You must use the altar to leave.");
        //player.getMovement().teleport(new Tile(2909, 5265, 0));
    }
}

// Big door
DecodedPacketObjectOption.prototype.object_26505 = function(player, index, object) {
    if (player.getY() >= 5333) {
        //player.getMovement().teleport(new Tile(2925, 5331, 2));
        player.openDialogue("bossinstance", 9);
    } else {
        player.getGameEncoder().sendMessage("You must use the altar to leave.");
        //player.getMovement().teleport(new Tile(2925, 5333, 2));
    }
}

// Ice bridge
DecodedPacketObjectOption.prototype.object_26518 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_26519 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_26561 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_26562 = function(player, index, object) { }

// Knight
DecodedPacketObjectOption.prototype.object_26563 = function(player, index, object) { }

// Cave
DecodedPacketObjectOption.prototype.object_26564 = function(player, index, object) { }

// Cave
DecodedPacketObjectOption.prototype.object_26565 = function(player, index, object) { }

// Cave
DecodedPacketObjectOption.prototype.object_26566 = function(player, index, object) { }

// Cave
DecodedPacketObjectOption.prototype.object_26567 = function(player, index, object) { }

// Cave
DecodedPacketObjectOption.prototype.object_26568 = function(player, index, object) { }

// Cave
DecodedPacketObjectOption.prototype.object_26569 = function(player, index, object) { }

// Blighted vine
DecodedPacketObjectOption.prototype.object_26572 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_26574 = function(player, index, object) {
    if (!player.getInventory().hasItem(" pickaxe")) {
        player.getGameEncoder().sendMessage("You need a pickaxe to do this.");
        return;
    } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.MINING) + 1)) {
        player.getGameEncoder().sendMessage("You fail to mine the rock.");
        return;
    }
    if (object.getX() == 3049 && object.getY() == 4813) {
        player.getMovement().teleport(3048, 4822);
    }
}

// Fruit Tree Patch
DecodedPacketObjectOption.prototype.object_26579 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26580 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26600 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26601 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26602 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26603 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26604 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26605 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26606 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26607 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26608 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26609 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26610 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26611 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26612 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26613 = function(player, index, object) { }

// Grand Gold Chest
DecodedPacketObjectOption.prototype.object_26614 = function(player, index, object) { }

// Sarcophagus
DecodedPacketObjectOption.prototype.object_26615 = function(player, index, object) { }

// Grand Gold Chest
DecodedPacketObjectOption.prototype.object_26616 = function(player, index, object) { }

// Tomb Door
DecodedPacketObjectOption.prototype.object_26617 = function(player, index, object) { }

// Tomb Door
DecodedPacketObjectOption.prototype.object_26618 = function(player, index, object) { }

// Tomb Door
DecodedPacketObjectOption.prototype.object_26619 = function(player, index, object) { }

// Tomb Door
DecodedPacketObjectOption.prototype.object_26620 = function(player, index, object) { }

// Tomb Door
DecodedPacketObjectOption.prototype.object_26621 = function(player, index, object) { }

// An anonymous looking door
DecodedPacketObjectOption.prototype.object_26622 = function(player, index, object) { }

// An anonymous looking door
DecodedPacketObjectOption.prototype.object_26623 = function(player, index, object) { }
