/* 1280 - 1535 */

// Tree
DecodedPacketObjectOption.prototype.object_1280 = function(player, index, object) { }

// Cage door
DecodedPacketObjectOption.prototype.object_1281 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_1282 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_1283 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_1284 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_1285 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_1286 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_1289 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_1290 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_1291 = function(player, index, object) { }

// Dramen tree
DecodedPacketObjectOption.prototype.object_1292 = function(player, index, object) {
    if (!player.getInventory().hasItem(" axe") && !player.getEquipment().hasItem(" axe")) {
        player.getGameEncoder().sendMessage("You need an axe to chop down this tree.");
        return;
    }
    if (player.getWorld().getTargetNPC(1163, player) != null) {
        return;
    }
    var treeSpiritNPC = new Npc(player.getController(), 1163, new Tile(2860, 9736, player.getHeight()));
    treeSpiritNPC.setForceMessage("You must defeat me before touching the tree!");
    treeSpiritNPC.getCombat().setTarget(player);
}

// Spirit tree
DecodedPacketObjectOption.prototype.object_1293 = function(player, index, object) {
    player.openDialogue("spirittree", 0);
}

// Spirit tree
DecodedPacketObjectOption.prototype.object_1294 = function(player, index, object) {
    player.openDialogue("spirittree", 0);
}

// Spirit tree
DecodedPacketObjectOption.prototype.object_1295 = function(player, index, object) {
    player.openDialogue("spirittree", 0);
}

// Evergreen
DecodedPacketObjectOption.prototype.object_1318 = function(player, index, object) { }

// Evergreen
DecodedPacketObjectOption.prototype.object_1319 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_1330 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_1331 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_1332 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_1365 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_1383 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_1384 = function(player, index, object) { }

// Pineapple Plant
DecodedPacketObjectOption.prototype.object_1408 = function(player, index, object) { }

// Pineapple Plant
DecodedPacketObjectOption.prototype.object_1409 = function(player, index, object) { }

// Pineapple Plant
DecodedPacketObjectOption.prototype.object_1410 = function(player, index, object) { }

// Pineapple Plant
DecodedPacketObjectOption.prototype.object_1411 = function(player, index, object) { }

// Pineapple Plant
DecodedPacketObjectOption.prototype.object_1412 = function(player, index, object) { }

// Pineapple Plant
DecodedPacketObjectOption.prototype.object_1413 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_1511 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Large door
DecodedPacketObjectOption.prototype.object_1512 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_1513 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Large door
DecodedPacketObjectOption.prototype.object_1516 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_1517 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_1518 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_1519 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_1520 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_1521 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Large door
DecodedPacketObjectOption.prototype.object_1522 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_1524 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Large door
DecodedPacketObjectOption.prototype.object_1525 = function(player, index, object) { }

// Curtain
DecodedPacketObjectOption.prototype.object_1531 = function(player, index, object) { }

// Curtain
DecodedPacketObjectOption.prototype.object_1533 = function(player, index, object) { }

// Curtain
DecodedPacketObjectOption.prototype.object_1534 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1535 = function(player, index, object) {
    Region.openDoor(player, object);
}
