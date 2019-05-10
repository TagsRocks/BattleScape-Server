/* 18944 - 19199 */

// Winch bucket
DecodedPacketObjectOption.prototype.object_18951 = function(player, index, object) { }

// Wooden cart
DecodedPacketObjectOption.prototype.object_18958 = function(player, index, object) { }

// Wooden cart
DecodedPacketObjectOption.prototype.object_18959 = function(player, index, object) { }

// Cart Camel
DecodedPacketObjectOption.prototype.object_18960 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_18961 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_18962 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_18963 = function(player, index, object) { }

// Climbing rope
DecodedPacketObjectOption.prototype.object_18967 = function(player, index, object) { }

// Climbing rope
DecodedPacketObjectOption.prototype.object_18969 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_18973 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_18982 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_18987 = function(player, index, object) {
    if (object.getX() == 3017 && object.getY() == 3849) {
        if (player.getX() != 3017 || player.getY() != 3850) {
            return;
        }
        player.getMovement().teleport(3069, 10255);
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_18988 = function(player, index, object) {
    if (object.getX() == 3069 && object.getY() == 10256) {
        player.getMovement().teleport(3016, 3849);
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_18989 = function(player, index, object) {
    if (object.getX() == 3069 && object.getY() == 3856) {
        var tile = new Tile(3017, 10250, 0);
        player.getMovement().ladderDownTeleport(tile);
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_18990 = function(player, index, object) {
    if (object.getX() == 3017 && object.getY() == 10249) {
        var tile = new Tile(3069, 3857, 0);
        player.getMovement().ladderDownTeleport(tile);
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_18991 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_18992 = function(player, index, object) { }

// Grain of Plenty
DecodedPacketObjectOption.prototype.object_19000 = function(player, index, object) { }

// Rope
DecodedPacketObjectOption.prototype.object_19001 = function(player, index, object) { }

// Rope
DecodedPacketObjectOption.prototype.object_19002 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_19003 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_19004 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_19005 = function(player, index, object) { }

// Passageway
DecodedPacketObjectOption.prototype.object_19025 = function(player, index, object) { }

// Passageway
DecodedPacketObjectOption.prototype.object_19026 = function(player, index, object) { }

// Passageway
DecodedPacketObjectOption.prototype.object_19027 = function(player, index, object) { }

// Passageway
DecodedPacketObjectOption.prototype.object_19028 = function(player, index, object) { }

// Passageway
DecodedPacketObjectOption.prototype.object_19029 = function(player, index, object) { }

// Snow
DecodedPacketObjectOption.prototype.object_19030 = function(player, index, object) { }

// Snow
DecodedPacketObjectOption.prototype.object_19031 = function(player, index, object) { }

// Underwall tunnel
DecodedPacketObjectOption.prototype.object_19032 = function(player, index, object) { }

// Snow
DecodedPacketObjectOption.prototype.object_19033 = function(player, index, object) { }

// Snow
DecodedPacketObjectOption.prototype.object_19034 = function(player, index, object) { }

// Snow
DecodedPacketObjectOption.prototype.object_19035 = function(player, index, object) { }

// Underwall tunnel
DecodedPacketObjectOption.prototype.object_19036 = function(player, index, object) { }

// Cave
DecodedPacketObjectOption.prototype.object_19037 = function(player, index, object) { }

// Wintumber tree
DecodedPacketObjectOption.prototype.object_19038 = function(player, index, object) { }

// Cave
DecodedPacketObjectOption.prototype.object_19039 = function(player, index, object) { }

// Stepping stone
DecodedPacketObjectOption.prototype.object_19040 = function(player, index, object) { }

// Stepping stone
DecodedPacketObjectOption.prototype.object_19042 = function(player, index, object) { }

// Crevice
DecodedPacketObjectOption.prototype.object_19043 = function(player, index, object) {
    if (object.getX() == 3046 && object.getY() == 10327) {
        player.getMovement().teleport(3048, 10337);
    } else if (object.getX() == 3048 && object.getY() == 10335) {
        player.getMovement().teleport(3046, 10326);
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_19044 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_19045 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_19047 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_19049 = function(player, index, object) { }

// Bank chest
DecodedPacketObjectOption.prototype.object_19051 = function(player, index, object) { }

// Tunnel entrance
DecodedPacketObjectOption.prototype.object_19053 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19054 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19055 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19056 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19057 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19058 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19059 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19060 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19061 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19062 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19063 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19064 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19066 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19067 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19068 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19069 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19070 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19071 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19072 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19073 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19074 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19075 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19076 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19077 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19078 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19079 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19080 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19081 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19082 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19083 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19084 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19085 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19086 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19087 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19088 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19089 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19090 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19091 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19092 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19093 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19094 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19095 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19096 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19097 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19098 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19099 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19100 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19101 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19102 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19103 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19104 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19105 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19106 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19107 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19108 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19109 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19110 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_19111 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_19124 = function(player, index, object) { }

// Dirt
DecodedPacketObjectOption.prototype.object_19125 = function(player, index, object) { }

// Plank
DecodedPacketObjectOption.prototype.object_19126 = function(player, index, object) { }

// Candles
DecodedPacketObjectOption.prototype.object_19127 = function(player, index, object) { }

// Basket
DecodedPacketObjectOption.prototype.object_19128 = function(player, index, object) { }

// Basket
DecodedPacketObjectOption.prototype.object_19129 = function(player, index, object) { }

// Basket
DecodedPacketObjectOption.prototype.object_19133 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_19135 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_19137 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_19139 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_19141 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_19143 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_19145 = function(player, index, object) { }

// Tree patch
DecodedPacketObjectOption.prototype.object_19147 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_19159 = function(player, index, object) { }

// Loose Railing
DecodedPacketObjectOption.prototype.object_19171 = function(player, index, object) { }

// Passageway
DecodedPacketObjectOption.prototype.object_19174 = function(player, index, object) { }
