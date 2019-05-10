/* 10496 - 10751 */

// Bank booth
DecodedPacketObjectOption.prototype.object_10517 = function(player, index, object) {
    player.getBank().open();
}

// Staircase
DecodedPacketObjectOption.prototype.object_10525 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_10526 = function(player, index, object) { }

// Portcullis
DecodedPacketObjectOption.prototype.object_10553 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10554 = function(player, index, object) { }

// Champion Statue
DecodedPacketObjectOption.prototype.object_10556 = function(player, index, object) { }

// Champion Statue
DecodedPacketObjectOption.prototype.object_10557 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_10558 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_10559 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10560 = function(player, index, object) {
    if (object.getX() == 3190 && object.getY() == 9758) {
        player.getMovement().ladderUpTeleport(new Tile(2212, 4940));
    }
}

// Bank chest
DecodedPacketObjectOption.prototype.object_10562 = function(player, index, object) {
    player.getBank().open();
}

// Tightrope
DecodedPacketObjectOption.prototype.object_10583 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_10585 = function(player, index, object) { }

// Rough wall
DecodedPacketObjectOption.prototype.object_10586 = function(player, index, object) { }

// Clothes line
DecodedPacketObjectOption.prototype.object_10587 = function(player, index, object) { }

// Icy Cavern
DecodedPacketObjectOption.prototype.object_10595 = function(player, index, object) {
    // Asgarnian Ice Dungeon
    var tile = new Tile(3056, 9562, 0);
    player.getMovement().ladderDownTeleport(tile);
}

// Icy Cavern
DecodedPacketObjectOption.prototype.object_10596 = function(player, index, object) {
    // Asgarnian Ice Dungeon
    var tile = new Tile(3056, 9555, 0);
    player.getMovement().ladderDownTeleport(tile);
}

// Altar
DecodedPacketObjectOption.prototype.object_10638 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_10639 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_10640 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10642 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_10661 = function(player, index, object) {
    player.getBank().open();
}

// Crate
DecodedPacketObjectOption.prototype.object_10662 = function(player, index, object) { }

// Stepping stone
DecodedPacketObjectOption.prototype.object_10663 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_10670 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_10672 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_10698 = function(player, index, object) { }

// Doorway
DecodedPacketObjectOption.prototype.object_10721 = function(player, index, object) { }

// Bones
DecodedPacketObjectOption.prototype.object_10725 = function(player, index, object) { }

// Bones
DecodedPacketObjectOption.prototype.object_10726 = function(player, index, object) { }

// Bones
DecodedPacketObjectOption.prototype.object_10727 = function(player, index, object) { }

// Bones
DecodedPacketObjectOption.prototype.object_10728 = function(player, index, object) { }

// Coin Collector
DecodedPacketObjectOption.prototype.object_10734 = function(player, index, object) { }

// Food chute
DecodedPacketObjectOption.prototype.object_10735 = function(player, index, object) { }
