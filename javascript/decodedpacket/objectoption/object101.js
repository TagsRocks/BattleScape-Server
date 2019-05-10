/* 25856 - 26111 */

// Metal door
DecodedPacketObjectOption.prototype.object_25876 = function(player, index, object) { }

// Metal door
DecodedPacketObjectOption.prototype.object_25877 = function(player, index, object) { }

// Vent
DecodedPacketObjectOption.prototype.object_25880 = function(player, index, object) { }

// Sir Tristram
DecodedPacketObjectOption.prototype.object_25889 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_25927 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_25935 = function(player, index, object) { }

// Bank deposit box
DecodedPacketObjectOption.prototype.object_25937 = function(player, index, object) {
    player.getBank().openDepositBox();
}

// Ladder
DecodedPacketObjectOption.prototype.object_25938 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_25939 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_25940 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_25941 = function(player, index, object) { }

// King Arthur
DecodedPacketObjectOption.prototype.object_25942 = function(player, index, object) { }

// King Arthur
DecodedPacketObjectOption.prototype.object_25943 = function(player, index, object) { }

// Court judge
DecodedPacketObjectOption.prototype.object_25956 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_26017 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_26042 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_26053 = function(player, index, object) { }

// Statue
DecodedPacketObjectOption.prototype.object_26073 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_26081 = function(player, index, object) {
    if (object.getX() == 3085 && object.getY() == 3484 || object.getX() == 3086 && object.getY() == 3484) {
        if (!player.getInventory().isEmpty() || !player.getEquipment().isEmpty()) {
            player.getGameEncoder().sendMessage("No items can be taken beyond this point.");
            return;
        }
        player.getClanWars().openJoinTournament();
    }
}

// Gate
DecodedPacketObjectOption.prototype.object_26082 = function(player, index, object) {
    if (object.getX() == 3085 && object.getY() == 3484 || object.getX() == 3086 && object.getY() == 3484) {
        if (!player.getInventory().isEmpty() || !player.getEquipment().isEmpty()) {
            player.getGameEncoder().sendMessage("No items can be taken beyond this point.");
            return;
        }
        player.getClanWars().openJoinTournament();
    }
}

// null
DecodedPacketObjectOption.prototype.object_26083 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_26084 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_26106 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_26107 = function(player, index, object) { }

// Spiders' nest
DecodedPacketObjectOption.prototype.object_26109 = function(player, index, object) { }

// Smashed window
DecodedPacketObjectOption.prototype.object_26110 = function(player, index, object) { }

// Smashed window
DecodedPacketObjectOption.prototype.object_26111 = function(player, index, object) { }
