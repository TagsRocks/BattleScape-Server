/* 7936 - 8191 */

// Emblem Trader
DecodedPacketNpcOption.prototype.npc_7941 = function(player, index, npc) { }

// Emblem Trader
DecodedPacketNpcOption.prototype.npc_7942 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("emblemtrader", 1);
    } else if (index == 2) {
        player.getGameEncoder().sendMessage("You can't trade him here.");
    } else if (index == 3) {
        var show = !player.getCombat().showKDR();
        player.getCombat().setShowKDR(show);
        if (show) {
            player.getGameEncoder().sendMessage("Now displaying KDR.");
        } else {
            player.getGameEncoder().sendMessage("Now hiding KDR.");
        }
    } else if (index == 4) {
        player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
    }
}

// Fishing spot
DecodedPacketNpcOption.prototype.npc_7946 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_7947 = function(player, index, npc) { }

// Alec Kincade
DecodedPacketNpcOption.prototype.npc_7950 = function(player, index, npc) { }

// Ponts the Bridgemaster
DecodedPacketNpcOption.prototype.npc_7951 = function(player, index, npc) { }

// Erdan
DecodedPacketNpcOption.prototype.npc_7952 = function(player, index, npc) { }

// Primula
DecodedPacketNpcOption.prototype.npc_7953 = function(player, index, npc) { }

// Mysterious Adventurer
DecodedPacketNpcOption.prototype.npc_7954 = function(player, index, npc) { }

// Captain Tock
DecodedPacketNpcOption.prototype.npc_7956 = function(player, index, npc) { }

// Captain Tock
DecodedPacketNpcOption.prototype.npc_7957 = function(player, index, npc) { }

// Captain Tock
DecodedPacketNpcOption.prototype.npc_7958 = function(player, index, npc) { }

// Ithoi the Navigator
DecodedPacketNpcOption.prototype.npc_7961 = function(player, index, npc) { }

// Cabin Boy Colin
DecodedPacketNpcOption.prototype.npc_7965 = function(player, index, npc) { }

// Cabin Boy Colin
DecodedPacketNpcOption.prototype.npc_7966 = function(player, index, npc) { }

// Cabin Boy Colin
DecodedPacketNpcOption.prototype.npc_7967 = function(player, index, npc) { }

// Gnocci the Cook
DecodedPacketNpcOption.prototype.npc_7970 = function(player, index, npc) { }

// Arsen the Thief
DecodedPacketNpcOption.prototype.npc_7976 = function(player, index, npc) { }

// Yusuf
DecodedPacketNpcOption.prototype.npc_7981 = function(player, index, npc) { }

// Yusuf
DecodedPacketNpcOption.prototype.npc_7982 = function(player, index, npc) { }

// Madame Caldarium
DecodedPacketNpcOption.prototype.npc_7984 = function(player, index, npc) { }

// Haris
DecodedPacketNpcOption.prototype.npc_7985 = function(player, index, npc) { }

// Altarkiz
DecodedPacketNpcOption.prototype.npc_7986 = function(player, index, npc) { }

// Lord Marshal Brogan
DecodedPacketNpcOption.prototype.npc_7987 = function(player, index, npc) { }

// Chief Tess
DecodedPacketNpcOption.prototype.npc_7988 = function(player, index, npc) { }

// Elder Chaos druid
DecodedPacketNpcOption.prototype.npc_7995 = function(player, index, npc) {
    player.getGameEncoder().sendMessage("The elder chaos druid will unnote bones for a fee.");
}

// Rift guardian
DecodedPacketNpcOption.prototype.npc_8024 = function(player, index, npc) { }

// Vorki
DecodedPacketNpcOption.prototype.npc_8025 = function(player, index, npc) { }

// Rift guardian
DecodedPacketNpcOption.prototype.npc_8028 = function(player, index, npc) { }

// Vorki
DecodedPacketNpcOption.prototype.npc_8029 = function(player, index, npc) { }

// Bob
DecodedPacketNpcOption.prototype.npc_8034 = function(player, index, npc) { }

// Neite
DecodedPacketNpcOption.prototype.npc_8035 = function(player, index, npc) { }

// Diana
DecodedPacketNpcOption.prototype.npc_8036 = function(player, index, npc) { }

// Jack
DecodedPacketNpcOption.prototype.npc_8037 = function(player, index, npc) { }

// Ellen
DecodedPacketNpcOption.prototype.npc_8038 = function(player, index, npc) { }

// Freja
DecodedPacketNpcOption.prototype.npc_8039 = function(player, index, npc) { }

// Lutwidge
DecodedPacketNpcOption.prototype.npc_8040 = function(player, index, npc) { }

// King Roald
DecodedPacketNpcOption.prototype.npc_8042 = function(player, index, npc) { }

// Aeonisig Raispher
DecodedPacketNpcOption.prototype.npc_8043 = function(player, index, npc) { }

// Sir Amik Varze
DecodedPacketNpcOption.prototype.npc_8044 = function(player, index, npc) { }

// Sir Tiffy Cashien
DecodedPacketNpcOption.prototype.npc_8045 = function(player, index, npc) { }

// King Lathas
DecodedPacketNpcOption.prototype.npc_8046 = function(player, index, npc) { }

// King Arthur
DecodedPacketNpcOption.prototype.npc_8047 = function(player, index, npc) { }

// Brundt the Chieftain
DecodedPacketNpcOption.prototype.npc_8048 = function(player, index, npc) { }

// Oneiromancer
DecodedPacketNpcOption.prototype.npc_8049 = function(player, index, npc) { }

// Denulth
DecodedPacketNpcOption.prototype.npc_8050 = function(player, index, npc) { }

// Duke Horacio
DecodedPacketNpcOption.prototype.npc_8051 = function(player, index, npc) { }

// Wise Old Man
DecodedPacketNpcOption.prototype.npc_8052 = function(player, index, npc) { }

// Jardric
DecodedPacketNpcOption.prototype.npc_8053 = function(player, index, npc) { }

// Achietties
DecodedPacketNpcOption.prototype.npc_8054 = function(player, index, npc) { }

// Bob
DecodedPacketNpcOption.prototype.npc_8055 = function(player, index, npc) { }

// Vorkath
DecodedPacketNpcOption.prototype.npc_8059 = function(player, index, npc) {
    if (npc.isLocked()) {
        return;
    }
    npc.setTransformationID(8061);
    npc.setAnimation(7950);
    npc.setLock(8);
}

// Dallas Jones
DecodedPacketNpcOption.prototype.npc_8100 = function(player, index, npc) { }

// Dallas Jones
DecodedPacketNpcOption.prototype.npc_8101 = function(player, index, npc) { }

// Dallas Jones
DecodedPacketNpcOption.prototype.npc_8102 = function(player, index, npc) { }

// Dallas Jones
DecodedPacketNpcOption.prototype.npc_8103 = function(player, index, npc) { }

// Jardric
DecodedPacketNpcOption.prototype.npc_8105 = function(player, index, npc) { }

// Jardric
DecodedPacketNpcOption.prototype.npc_8106 = function(player, index, npc) { }

// Jardric
DecodedPacketNpcOption.prototype.npc_8107 = function(player, index, npc) { }

// Bob
DecodedPacketNpcOption.prototype.npc_8111 = function(player, index, npc) { }

// Bob
DecodedPacketNpcOption.prototype.npc_8112 = function(player, index, npc) { }

// Bob
DecodedPacketNpcOption.prototype.npc_8113 = function(player, index, npc) { }

// Bob
DecodedPacketNpcOption.prototype.npc_8114 = function(player, index, npc) { }

// Not Bob
DecodedPacketNpcOption.prototype.npc_8116 = function(player, index, npc) { }

// Torfinn
DecodedPacketNpcOption.prototype.npc_8131 = function(player, index, npc) { }

// Torfinn
DecodedPacketNpcOption.prototype.npc_8132 = function(player, index, npc) { }

// Torfinn
DecodedPacketNpcOption.prototype.npc_8133 = function(player, index, npc) { }

// Sarah
DecodedPacketNpcOption.prototype.npc_8134 = function(player, index, npc) { }

// Zorgoth
DecodedPacketNpcOption.prototype.npc_8136 = function(player, index, npc) { }

// Brundt the Chieftain
DecodedPacketNpcOption.prototype.npc_8145 = function(player, index, npc) { }

// Koschei the Deathless
DecodedPacketNpcOption.prototype.npc_8152 = function(player, index, npc) { }

// Brundt the Chieftain
DecodedPacketNpcOption.prototype.npc_8153 = function(player, index, npc) { }

// Wise Old Man
DecodedPacketNpcOption.prototype.npc_8154 = function(player, index, npc) { }

// Jardric
DecodedPacketNpcOption.prototype.npc_8155 = function(player, index, npc) { }

// Achietties
DecodedPacketNpcOption.prototype.npc_8156 = function(player, index, npc) { }

// Sir Tiffy Cashien
DecodedPacketNpcOption.prototype.npc_8157 = function(player, index, npc) { }

// Oneiromancer
DecodedPacketNpcOption.prototype.npc_8158 = function(player, index, npc) { }

// Bob
DecodedPacketNpcOption.prototype.npc_8159 = function(player, index, npc) { }

// Amelia
DecodedPacketNpcOption.prototype.npc_8180 = function(player, index, npc) { }

// Jonathan
DecodedPacketNpcOption.prototype.npc_8181 = function(player, index, npc) { }

// Natural Historian
DecodedPacketNpcOption.prototype.npc_8182 = function(player, index, npc) { }

// Martin Holt
DecodedPacketNpcOption.prototype.npc_8183 = function(player, index, npc) { }

// Grave digger
DecodedPacketNpcOption.prototype.npc_8189 = function(player, index, npc) { }
