/* 9984 - 10239 */

// Staircase
DecodedPacketObjectOption.prototype.object_10015 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_10016 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_10017 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_10018 = function(player, index, object) { }

// Wall support
DecodedPacketObjectOption.prototype.object_10033 = function(player, index, object) { }

// Low wall
DecodedPacketObjectOption.prototype.object_10035 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_10036 = function(player, index, object) { }

// Rope
DecodedPacketObjectOption.prototype.object_10038 = function(player, index, object) { }

// Rope
DecodedPacketObjectOption.prototype.object_10040 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_10041 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10042 = function(player, index, object) {
    var tile = new Tile(2907, 9968, 0);
    player.getMovement().ladderDownTeleport(tile);
}

// Door
DecodedPacketObjectOption.prototype.object_10043 = function(player, index, object) {
    if (object.getX() == 2911 && object.getY() == 9968) {
        if (player.getX() >= 2912) {
            player.getMovement().teleport(2911, 9968, player.getHeight());
        } else {
            if (player.getInventory().getCount(8851) < 100
                    && !player.getEquipment().wearingAccomplishmentCape(Skills.ATTACK)) {
                player.getGameEncoder().sendMessage("You need atleast 100 tokens to enter.");
                return;
            } else if (!player.carryingItem(8850)) {
                player.getGameEncoder().sendMessage("You need a Rune defender to enter.");
                return;
            }
            player.getMovement().teleport(2912, 9968, player.getHeight());
        }
    }
}

// Door
DecodedPacketObjectOption.prototype.object_10045 = function(player, index, object) { }

// Dark tunnel
DecodedPacketObjectOption.prototype.object_10047 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_10048 = function(player, index, object) { }

// Grave
DecodedPacketObjectOption.prototype.object_10049 = function(player, index, object) { }

// Grave
DecodedPacketObjectOption.prototype.object_10053 = function(player, index, object) { }

// Grave
DecodedPacketObjectOption.prototype.object_10054 = function(player, index, object) { }

// Mausoleum
DecodedPacketObjectOption.prototype.object_10055 = function(player, index, object) { }

// Grand Exchange booth
DecodedPacketObjectOption.prototype.object_10060 = function(player, index, object) {
    player.getBank().open();
}

// Grand Exchange booth
DecodedPacketObjectOption.prototype.object_10061 = function(player, index, object) {
    if (player.getHeight() != 0) {
        player.getGameEncoder().sendMessage("You can't use this here.");
        return;
    }
    player.openDialogue("grandexchange", 0);
}

// Sacrificial boat
DecodedPacketObjectOption.prototype.object_10068 = function(player, index, object) {
    player.openDialogue("zulrah", 0);
}

// Rough wall
DecodedPacketObjectOption.prototype.object_10073 = function(player, index, object) { }

// Tightrope
DecodedPacketObjectOption.prototype.object_10074 = function(player, index, object) { }

// Tightrope
DecodedPacketObjectOption.prototype.object_10075 = function(player, index, object) { }

// Narrow wall
DecodedPacketObjectOption.prototype.object_10077 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_10078 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_10079 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_10080 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_10081 = function(player, index, object) { }

// Furnace
DecodedPacketObjectOption.prototype.object_10082 = function(player, index, object) { }

// Bank booth
DecodedPacketObjectOption.prototype.object_10083 = function(player, index, object) {
    player.getBank().open();
}

// Wall
DecodedPacketObjectOption.prototype.object_10084 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_10085 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_10086 = function(player, index, object) { }

// Ominous Fishing Spot
DecodedPacketObjectOption.prototype.object_10087 = function(player, index, object) { }

// Ominous Fishing Spot
DecodedPacketObjectOption.prototype.object_10088 = function(player, index, object) { }

// Ominous Fishing Spot
DecodedPacketObjectOption.prototype.object_10089 = function(player, index, object) { }

// Signpost
DecodedPacketObjectOption.prototype.object_10090 = function(player, index, object) { }

// Aquarium
DecodedPacketObjectOption.prototype.object_10091 = function(player, index, object) { }

// Rough wall
DecodedPacketObjectOption.prototype.object_10093 = function(player, index, object) { }

// Roof top beams
DecodedPacketObjectOption.prototype.object_10094 = function(player, index, object) { }

// Blindweed Patch
DecodedPacketObjectOption.prototype.object_10096 = function(player, index, object) { }

// Blindweed Patch
DecodedPacketObjectOption.prototype.object_10097 = function(player, index, object) { }

// Blindweed Patch
DecodedPacketObjectOption.prototype.object_10098 = function(player, index, object) { }

// Blindweed Patch
DecodedPacketObjectOption.prototype.object_10099 = function(player, index, object) { }

// Blindweed Patch
DecodedPacketObjectOption.prototype.object_10100 = function(player, index, object) { }

// Blindweed Patch
DecodedPacketObjectOption.prototype.object_10101 = function(player, index, object) { }

// Blindweed Patch
DecodedPacketObjectOption.prototype.object_10102 = function(player, index, object) { }

// Trashed Patch
DecodedPacketObjectOption.prototype.object_10103 = function(player, index, object) { }

// Wooden Stair
DecodedPacketObjectOption.prototype.object_10136 = function(player, index, object) { }

// Wooden Stair
DecodedPacketObjectOption.prototype.object_10137 = function(player, index, object) { }

// Output Tap
DecodedPacketObjectOption.prototype.object_10148 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_10162 = function(player, index, object) { }

// Open Cupboard
DecodedPacketObjectOption.prototype.object_10163 = function(player, index, object) { }

// Pressure Lever
DecodedPacketObjectOption.prototype.object_10164 = function(player, index, object) { }

// Pressure Lever
DecodedPacketObjectOption.prototype.object_10165 = function(player, index, object) { }

// Pressure Lever
DecodedPacketObjectOption.prototype.object_10166 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10167 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10168 = function(player, index, object) { }

// Pressure Barrel
DecodedPacketObjectOption.prototype.object_10171 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_10172 = function(player, index, object) { }

// Iron ladder
DecodedPacketObjectOption.prototype.object_10177 = function(player, index, object) {
    // Waterbirth Dungeon
    player.openDialogue("bossinstance", 2);
}

// Ladder
DecodedPacketObjectOption.prototype.object_10193 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10194 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10195 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10196 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10197 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10198 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10199 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10200 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10201 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10202 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10203 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10204 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10205 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10206 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10207 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10208 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10209 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10210 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10211 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10212 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10213 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10214 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10215 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10216 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10217 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10218 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10219 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10220 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10221 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10222 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10223 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10224 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10225 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10226 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10227 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10228 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_10229 = function(player, index, object) {
    // Waterbirth Dungeon
    var tile = new Tile(2545, 10143, 0);
    player.getMovement().ladderUpTeleport(tile);
    player.getController().stopWithTeleport();
}

// Ladder
DecodedPacketObjectOption.prototype.object_10230 = function(player, index, object) { }
