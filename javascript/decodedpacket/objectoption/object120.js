/* 30720 - 30975 */

// stone chest
DecodedPacketObjectOption.prototype.object_30720 = function(player, index, object) { }

// trapdoor
DecodedPacketObjectOption.prototype.object_30725 = function(player, index, object) { }

// ladder
DecodedPacketObjectOption.prototype.object_30727 = function(player, index, object) { }

// obstacle
DecodedPacketObjectOption.prototype.object_30766 = function(player, index, object) { }

// obstacle
DecodedPacketObjectOption.prototype.object_30767 = function(player, index, object) { }

// bank chest-wreck
DecodedPacketObjectOption.prototype.object_30796 = function(player, index, object) { }

// trap door
DecodedPacketObjectOption.prototype.object_30842 = function(player, index, object) { }

// exit
DecodedPacketObjectOption.prototype.object_30844 = function(player, index, object) { }

// stairs
DecodedPacketObjectOption.prototype.object_30845 = function(player, index, object) { }

// stairs
DecodedPacketObjectOption.prototype.object_30846 = function(player, index, object) { }

// stairs
DecodedPacketObjectOption.prototype.object_30847 = function(player, index, object) {
    player.getMovement().teleport(3633, 10260);
}

// stairs
DecodedPacketObjectOption.prototype.object_30849 = function(player, index, object) {
    player.getMovement().teleport(3633, 10264);
}

// stairs
DecodedPacketObjectOption.prototype.object_30850 = function(player, index, object) { }

// burnt tree
DecodedPacketObjectOption.prototype.object_30852 = function(player, index, object) { }

// burnt tree
DecodedPacketObjectOption.prototype.object_30854 = function(player, index, object) { }

// cave entrance
DecodedPacketObjectOption.prototype.object_30869 = function(player, index, object) { }

// cave exit
DecodedPacketObjectOption.prototype.object_30878 = function(player, index, object) { }

// rowboat
DecodedPacketObjectOption.prototype.object_30914 = function(player, index, object) { }

// rowboat
DecodedPacketObjectOption.prototype.object_30915 = function(player, index, object) { }

// rope anchor
DecodedPacketObjectOption.prototype.object_30916 = function(player, index, object) {
    if (player.getSkills().getLevel(Skills.AGILITY) < 64) {
        player.getGameEncoder().sendMessage("You need an Agility level of 64 to do this.");
        return;
    }
    player.getMovement().teleport(3784, 3821);
}

// rope anchor
DecodedPacketObjectOption.prototype.object_30917 = function(player, index, object) {
    if (player.getSkills().getLevel(Skills.AGILITY) < 64) {
        player.getGameEncoder().sendMessage("You need an Agility level of 64 to do this.");
        return;
    }
    player.getMovement().teleport(3778, 3821);
}

// rowboat
DecodedPacketObjectOption.prototype.object_30919 = function(player, index, object) { }

// magic mushtree
DecodedPacketObjectOption.prototype.object_30920 = function(player, index, object) { }

// magic mushtree
DecodedPacketObjectOption.prototype.object_30922 = function(player, index, object) { }

// magic mushtree
DecodedPacketObjectOption.prototype.object_30924 = function(player, index, object) { }

// bank chest
DecodedPacketObjectOption.prototype.object_30926 = function(player, index, object) { }

// chest pieces
DecodedPacketObjectOption.prototype.object_30927 = function(player, index, object) { }

// fossil cleaning bench
DecodedPacketObjectOption.prototype.object_30928 = function(player, index, object) { }

// table parts
DecodedPacketObjectOption.prototype.object_30929 = function(player, index, object) { }

// ring of stones
DecodedPacketObjectOption.prototype.object_30931 = function(player, index, object) { }

// fire pit
DecodedPacketObjectOption.prototype.object_30933 = function(player, index, object) { }

// spinning wheel
DecodedPacketObjectOption.prototype.object_30934 = function(player, index, object) { }

// broken spinning wheel
DecodedPacketObjectOption.prototype.object_30935 = function(player, index, object) { }

// loom
DecodedPacketObjectOption.prototype.object_30936 = function(player, index, object) { }

// half-built loom
DecodedPacketObjectOption.prototype.object_30937 = function(player, index, object) { }

// ladder
DecodedPacketObjectOption.prototype.object_30938 = function(player, index, object) { }

// ladder
DecodedPacketObjectOption.prototype.object_30939 = function(player, index, object) { }

// ladder
DecodedPacketObjectOption.prototype.object_30940 = function(player, index, object) { }

// ladder
DecodedPacketObjectOption.prototype.object_30941 = function(player, index, object) { }

// crate
DecodedPacketObjectOption.prototype.object_30942 = function(player, index, object) { }

// strange machine
DecodedPacketObjectOption.prototype.object_30944 = function(player, index, object) { }

// pile of ancient books
DecodedPacketObjectOption.prototype.object_30946 = function(player, index, object) { }

// anchor rope
DecodedPacketObjectOption.prototype.object_30948 = function(player, index, object) { }

// drift net anchors
DecodedPacketObjectOption.prototype.object_30952 = function(player, index, object) { }

// drift net anchors
DecodedPacketObjectOption.prototype.object_30953 = function(player, index, object) { }

// drift net anchors
DecodedPacketObjectOption.prototype.object_30954 = function(player, index, object) { }

// drift net (full)
DecodedPacketObjectOption.prototype.object_30955 = function(player, index, object) { }

// tunnel
DecodedPacketObjectOption.prototype.object_30958 = function(player, index, object) { }

// tunnel
DecodedPacketObjectOption.prototype.object_30959 = function(player, index, object) { }

// plant door
DecodedPacketObjectOption.prototype.object_30960 = function(player, index, object) { }

// plant door
DecodedPacketObjectOption.prototype.object_30961 = function(player, index, object) { }

// obstacle
DecodedPacketObjectOption.prototype.object_30962 = function(player, index, object) { }

// obstacle
DecodedPacketObjectOption.prototype.object_30964 = function(player, index, object) { }

// hole
DecodedPacketObjectOption.prototype.object_30966 = function(player, index, object) { }

// pile of fishbowls
DecodedPacketObjectOption.prototype.object_30967 = function(player, index, object) { }

// pile of fishbowls
DecodedPacketObjectOption.prototype.object_30968 = function(player, index, object) { }

// clam
DecodedPacketObjectOption.prototype.object_30969 = function(player, index, object) { }

// chest
DecodedPacketObjectOption.prototype.object_30971 = function(player, index, object) { }

// hopper
DecodedPacketObjectOption.prototype.object_30973 = function(player, index, object) { }

// sluice gate
DecodedPacketObjectOption.prototype.object_30975 = function(player, index, object) { }
