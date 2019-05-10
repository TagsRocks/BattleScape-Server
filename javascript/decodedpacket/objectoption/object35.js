/* 8960 - 9215 */

// Door
DecodedPacketObjectOption.prototype.object_8960 = function(player, index, object) {
    // Waterbirth Dungeon bottom
    if (player.getX() <= 2490) {
        var tile = new Tile(player.getX() + 2, player.getY(), 0);
        player.getMovement().teleport(tile);
    } else {
        var tile = new Tile(player.getX() - 2, player.getY(), 0);
        player.getMovement().teleport(tile);
    }
}

// Steps
DecodedPacketObjectOption.prototype.object_8966 = function(player, index, object) {
    // Waterbirth Dungeon exit
    var tile = new Tile(2524, 3739, 0);
    player.getMovement().ladderUpTeleport(tile);
}

// Net trap
DecodedPacketObjectOption.prototype.object_8973 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Dense runestone
DecodedPacketObjectOption.prototype.object_8975 = function(player, index, object) { }

// Depleted runestone
DecodedPacketObjectOption.prototype.object_8976 = function(player, index, object) { }

// Dense runestone
DecodedPacketObjectOption.prototype.object_8981 = function(player, index, object) { }

// Pinball Post
DecodedPacketObjectOption.prototype.object_8982 = function(player, index, object) { }

// Pinball Post
DecodedPacketObjectOption.prototype.object_8983 = function(player, index, object) { }

// Pinball Post
DecodedPacketObjectOption.prototype.object_8984 = function(player, index, object) { }

// Net trap
DecodedPacketObjectOption.prototype.object_8986 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Net trap
DecodedPacketObjectOption.prototype.object_8988 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Young tree
DecodedPacketObjectOption.prototype.object_8989 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Young tree
DecodedPacketObjectOption.prototype.object_8990 = function(player, index, object) {
    player.getHunter().layTrap(-1, object);
}

// Net trap
DecodedPacketObjectOption.prototype.object_8992 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Pinball Post
DecodedPacketObjectOption.prototype.object_8994 = function(player, index, object) { }

// Pinball Post
DecodedPacketObjectOption.prototype.object_8995 = function(player, index, object) { }

// Net trap
DecodedPacketObjectOption.prototype.object_8996 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Net trap
DecodedPacketObjectOption.prototype.object_8998 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Young tree
DecodedPacketObjectOption.prototype.object_8999 = function(player, index, object) {
    player.getHunter().layTrap(-1, object);
}

// Young tree
DecodedPacketObjectOption.prototype.object_9000 = function(player, index, object) {
    player.getHunter().layTrap(-1, object);
}

// Net trap
DecodedPacketObjectOption.prototype.object_9002 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Net trap
DecodedPacketObjectOption.prototype.object_9004 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Funeral Pyre
DecodedPacketObjectOption.prototype.object_9008 = function(player, index, object) { }

// Funeral Pyre
DecodedPacketObjectOption.prototype.object_9009 = function(player, index, object) { }

// Light Jungle
DecodedPacketObjectOption.prototype.object_9010 = function(player, index, object) { }

// Light Jungle
DecodedPacketObjectOption.prototype.object_9011 = function(player, index, object) { }

// Light Jungle
DecodedPacketObjectOption.prototype.object_9012 = function(player, index, object) { }

// Light Jungle
DecodedPacketObjectOption.prototype.object_9013 = function(player, index, object) { }

// Light Jungle
DecodedPacketObjectOption.prototype.object_9014 = function(player, index, object) { }

// Medium Jungle
DecodedPacketObjectOption.prototype.object_9015 = function(player, index, object) { }

// Medium Jungle
DecodedPacketObjectOption.prototype.object_9016 = function(player, index, object) { }

// Medium Jungle
DecodedPacketObjectOption.prototype.object_9017 = function(player, index, object) { }

// Medium Jungle
DecodedPacketObjectOption.prototype.object_9018 = function(player, index, object) { }

// Medium Jungle
DecodedPacketObjectOption.prototype.object_9019 = function(player, index, object) { }

// Dense Jungle
DecodedPacketObjectOption.prototype.object_9020 = function(player, index, object) { }

// Dense Jungle
DecodedPacketObjectOption.prototype.object_9021 = function(player, index, object) { }

// Dense Jungle
DecodedPacketObjectOption.prototype.object_9022 = function(player, index, object) { }

// Dense Jungle
DecodedPacketObjectOption.prototype.object_9023 = function(player, index, object) { }

// Dense Jungle
DecodedPacketObjectOption.prototype.object_9024 = function(player, index, object) { }

// Rotten village fence
DecodedPacketObjectOption.prototype.object_9025 = function(player, index, object) { }

// Partial fence
DecodedPacketObjectOption.prototype.object_9026 = function(player, index, object) { }

// Short fence
DecodedPacketObjectOption.prototype.object_9027 = function(player, index, object) { }

// Medium fence
DecodedPacketObjectOption.prototype.object_9028 = function(player, index, object) { }

// Village fence
DecodedPacketObjectOption.prototype.object_9029 = function(player, index, object) { }

// Gem Rock
DecodedPacketObjectOption.prototype.object_9030 = function(player, index, object) { }

// Gem Rock
DecodedPacketObjectOption.prototype.object_9031 = function(player, index, object) { }

// Gem Rock
DecodedPacketObjectOption.prototype.object_9032 = function(player, index, object) { }

// Mahogany
DecodedPacketObjectOption.prototype.object_9034 = function(player, index, object) { }

// Teak
DecodedPacketObjectOption.prototype.object_9036 = function(player, index, object) { }

// Hardwood Grove Doors
DecodedPacketObjectOption.prototype.object_9038 = function(player, index, object) { }

// Hardwood Grove Doors
DecodedPacketObjectOption.prototype.object_9039 = function(player, index, object) { }

// Goutweed
DecodedPacketObjectOption.prototype.object_9044 = function(player, index, object) { }

// Goutweed
DecodedPacketObjectOption.prototype.object_9045 = function(player, index, object) { }

// Goutweed
DecodedPacketObjectOption.prototype.object_9046 = function(player, index, object) { }

// Goutweed
DecodedPacketObjectOption.prototype.object_9047 = function(player, index, object) { }

// Goutweed
DecodedPacketObjectOption.prototype.object_9048 = function(player, index, object) { }

// Diseased goutweed
DecodedPacketObjectOption.prototype.object_9049 = function(player, index, object) { }

// Diseased goutweed
DecodedPacketObjectOption.prototype.object_9050 = function(player, index, object) { }

// Diseased goutweed
DecodedPacketObjectOption.prototype.object_9051 = function(player, index, object) { }

// Dead goutweed
DecodedPacketObjectOption.prototype.object_9052 = function(player, index, object) { }

// Dead goutweed
DecodedPacketObjectOption.prototype.object_9053 = function(player, index, object) { }

// Dead goutweed
DecodedPacketObjectOption.prototype.object_9054 = function(player, index, object) { }

// Pinball Post
DecodedPacketObjectOption.prototype.object_9079 = function(player, index, object) { }

// Pinball Post
DecodedPacketObjectOption.prototype.object_9080 = function(player, index, object) { }

// Pinball Post
DecodedPacketObjectOption.prototype.object_9081 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_9084 = function(player, index, object) { }

// Stove
DecodedPacketObjectOption.prototype.object_9085 = function(player, index, object) { }

// Stove
DecodedPacketObjectOption.prototype.object_9086 = function(player, index, object) { }

// Stove
DecodedPacketObjectOption.prototype.object_9087 = function(player, index, object) { }

// Coke
DecodedPacketObjectOption.prototype.object_9088 = function(player, index, object) { }

// Temperature gauge
DecodedPacketObjectOption.prototype.object_9089 = function(player, index, object) { }

// Pump
DecodedPacketObjectOption.prototype.object_9090 = function(player, index, object) { }

// Bars
DecodedPacketObjectOption.prototype.object_9091 = function(player, index, object) { }

// Bar dispenser
DecodedPacketObjectOption.prototype.object_9092 = function(player, index, object) { }

// Bar dispenser
DecodedPacketObjectOption.prototype.object_9093 = function(player, index, object) { }

// Bar dispenser
DecodedPacketObjectOption.prototype.object_9095 = function(player, index, object) { }

// Bar dispenser
DecodedPacketObjectOption.prototype.object_9096 = function(player, index, object) { }

// Pedals
DecodedPacketObjectOption.prototype.object_9097 = function(player, index, object) { }

// Conveyor belt
DecodedPacketObjectOption.prototype.object_9100 = function(player, index, object) { }

// Drive belt
DecodedPacketObjectOption.prototype.object_9103 = function(player, index, object) { }

// Cogs
DecodedPacketObjectOption.prototype.object_9105 = function(player, index, object) { }

// Pipes
DecodedPacketObjectOption.prototype.object_9117 = function(player, index, object) { }

// Pipes
DecodedPacketObjectOption.prototype.object_9121 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_9138 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_9140 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_9141 = function(player, index, object) { }

// Sink
DecodedPacketObjectOption.prototype.object_9143 = function(player, index, object) { }

// Old Bookshelf
DecodedPacketObjectOption.prototype.object_9146 = function(player, index, object) { }

// Old Bookshelf
DecodedPacketObjectOption.prototype.object_9147 = function(player, index, object) { }

// Net trap
DecodedPacketObjectOption.prototype.object_9158 = function(player, index, object) { }

// Delphinium patch
DecodedPacketObjectOption.prototype.object_9165 = function(player, index, object) { }

// Delphinium patch
DecodedPacketObjectOption.prototype.object_9166 = function(player, index, object) { }

// Delphinium patch
DecodedPacketObjectOption.prototype.object_9167 = function(player, index, object) { }

// Delphinium patch
DecodedPacketObjectOption.prototype.object_9168 = function(player, index, object) { }

// Delphinium patch
DecodedPacketObjectOption.prototype.object_9169 = function(player, index, object) { }

// White rose bush patch
DecodedPacketObjectOption.prototype.object_9174 = function(player, index, object) { }

// Red rose bush patch
DecodedPacketObjectOption.prototype.object_9175 = function(player, index, object) { }

// Pink rose bush patch
DecodedPacketObjectOption.prototype.object_9176 = function(player, index, object) { }

// Pink rose bush patch
DecodedPacketObjectOption.prototype.object_9177 = function(player, index, object) { }

// Pink rose bush patch
DecodedPacketObjectOption.prototype.object_9178 = function(player, index, object) { }

// Pink rose bush patch
DecodedPacketObjectOption.prototype.object_9179 = function(player, index, object) { }

// Pink rose bush patch
DecodedPacketObjectOption.prototype.object_9180 = function(player, index, object) { }

// White rose bush patch
DecodedPacketObjectOption.prototype.object_9181 = function(player, index, object) { }

// White rose bush patch
DecodedPacketObjectOption.prototype.object_9182 = function(player, index, object) { }

// White rose bush patch
DecodedPacketObjectOption.prototype.object_9183 = function(player, index, object) { }

// White rose bush patch
DecodedPacketObjectOption.prototype.object_9184 = function(player, index, object) { }

// Red rose bush patch
DecodedPacketObjectOption.prototype.object_9185 = function(player, index, object) { }

// Red rose bush patch
DecodedPacketObjectOption.prototype.object_9186 = function(player, index, object) { }

// Red rose bush patch
DecodedPacketObjectOption.prototype.object_9187 = function(player, index, object) { }

// Red rose bush patch
DecodedPacketObjectOption.prototype.object_9188 = function(player, index, object) { }

// Plantpot
DecodedPacketObjectOption.prototype.object_9197 = function(player, index, object) { }

// Plantpot
DecodedPacketObjectOption.prototype.object_9198 = function(player, index, object) { }

// Plantpot
DecodedPacketObjectOption.prototype.object_9203 = function(player, index, object) { }

// Plantpot
DecodedPacketObjectOption.prototype.object_9204 = function(player, index, object) { }

// White Tree patch
DecodedPacketObjectOption.prototype.object_9209 = function(player, index, object) { }

// White Tree patch
DecodedPacketObjectOption.prototype.object_9210 = function(player, index, object) { }

// White Tree patch
DecodedPacketObjectOption.prototype.object_9211 = function(player, index, object) { }

// White Tree patch
DecodedPacketObjectOption.prototype.object_9212 = function(player, index, object) { }

// White Tree patch
DecodedPacketObjectOption.prototype.object_9213 = function(player, index, object) { }
