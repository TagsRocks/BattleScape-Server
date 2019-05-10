/* 32000 - 32255 */

// cave entrance
DecodedPacketObjectOption.prototype.object_32047 = function(player, index, object) { }

// door
DecodedPacketObjectOption.prototype.object_32052 = function(player, index, object) { }

// stone chest
DecodedPacketObjectOption.prototype.object_32053 = function(player, index, object) { }

// lever
DecodedPacketObjectOption.prototype.object_32056 = function(player, index, object) { }

// ancient machinery
DecodedPacketObjectOption.prototype.object_32073 = function(player, index, object) { }

// ancient machinery
DecodedPacketObjectOption.prototype.object_32074 = function(player, index, object) { }

// ancient equipment
DecodedPacketObjectOption.prototype.object_32075 = function(player, index, object) { }

// ancient incubator
DecodedPacketObjectOption.prototype.object_32076 = function(player, index, object) { }

// ancient equipment
DecodedPacketObjectOption.prototype.object_32077 = function(player, index, object) { }

// ancient incubator
DecodedPacketObjectOption.prototype.object_32078 = function(player, index, object) { }

// rowboat
DecodedPacketObjectOption.prototype.object_32079 = function(player, index, object) { }

// staircase
DecodedPacketObjectOption.prototype.object_32080 = function(player, index, object) { }

// stairs
DecodedPacketObjectOption.prototype.object_32081 = function(player, index, object) { }

// stairs
DecodedPacketObjectOption.prototype.object_32082 = function(player, index, object) { }

// ladder
DecodedPacketObjectOption.prototype.object_32083 = function(player, index, object) { }

// trapdoor
DecodedPacketObjectOption.prototype.object_32084 = function(player, index, object) { }

// stairs
DecodedPacketObjectOption.prototype.object_32089 = function(player, index, object) { }

// skeleton
DecodedPacketObjectOption.prototype.object_32091 = function(player, index, object) { }

// staircase
DecodedPacketObjectOption.prototype.object_32112 = function(player, index, object) { }

// staircase
DecodedPacketObjectOption.prototype.object_32113 = function(player, index, object) { }

// grandiose doors
DecodedPacketObjectOption.prototype.object_32114 = function(player, index, object) { }

// grandiose doors
DecodedPacketObjectOption.prototype.object_32115 = function(player, index, object) { }

// grandiose doors
DecodedPacketObjectOption.prototype.object_32116 = function(player, index, object) { }

// broken grandiose doors
DecodedPacketObjectOption.prototype.object_32117 = function(player, index, object) { }

// broken grandiose doors
DecodedPacketObjectOption.prototype.object_32132 = function(player, index, object) { }

// grandiose doors
DecodedPacketObjectOption.prototype.object_32133 = function(player, index, object) { }

// mural
DecodedPacketObjectOption.prototype.object_32144 = function(player, index, object) { }

// barrier
DecodedPacketObjectOption.prototype.object_32153 = function(player, index, object) {
    if (object.getDirection() == 1) {
        if (player.getX() > object.getX()) {
            player.openDialogue("lithkrenvault", 0);
        } else {
            player.getMovement().teleport(1562, 5074);
        }
    } else if (object.getDirection() == 3) {
        if (player.getX() < object.getX()) {
            player.openDialogue("lithkrenvault", 1);
        } else {
            player.getMovement().teleport(1573, 5074);
        }
    }
}

// machinery
DecodedPacketObjectOption.prototype.object_32156 = function(player, index, object) { }

// machinery
DecodedPacketObjectOption.prototype.object_32157 = function(player, index, object) { }

// ancient machinery
DecodedPacketObjectOption.prototype.object_32158 = function(player, index, object) { }

// incubator
DecodedPacketObjectOption.prototype.object_32159 = function(player, index, object) { }

// incubator
DecodedPacketObjectOption.prototype.object_32160 = function(player, index, object) { }

// machinery
DecodedPacketObjectOption.prototype.object_32161 = function(player, index, object) { }

// stone crate
DecodedPacketObjectOption.prototype.object_32162 = function(player, index, object) { }

// blockage
DecodedPacketObjectOption.prototype.object_32165 = function(player, index, object) { }

// blockage
DecodedPacketObjectOption.prototype.object_32166 = function(player, index, object) { }

// blockage
DecodedPacketObjectOption.prototype.object_32167 = function(player, index, object) { }

// blockage
DecodedPacketObjectOption.prototype.object_32168 = function(player, index, object) { }

// tunnel
DecodedPacketObjectOption.prototype.object_32169 = function(player, index, object) { }

// tunnel
DecodedPacketObjectOption.prototype.object_32170 = function(player, index, object) { }

// ancient machinery
DecodedPacketObjectOption.prototype.object_32185 = function(player, index, object) { }

// cave entrance
DecodedPacketObjectOption.prototype.object_32198 = function(player, index, object) { }

// ancient mural
DecodedPacketObjectOption.prototype.object_32203 = function(player, index, object) { }

// ladder
DecodedPacketObjectOption.prototype.object_32205 = function(player, index, object) { }

// stairs
DecodedPacketObjectOption.prototype.object_32206 = function(player, index, object) { }

// mithril door
DecodedPacketObjectOption.prototype.object_32208 = function(player, index, object) { }

// rough hewn steps
DecodedPacketObjectOption.prototype.object_32211 = function(player, index, object) { }

// rough hewn steps
DecodedPacketObjectOption.prototype.object_32212 = function(player, index, object) { }

// anvil
DecodedPacketObjectOption.prototype.object_32215 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_32235 = function(player, index, object) { }
