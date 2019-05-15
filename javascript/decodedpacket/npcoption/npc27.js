/* 6912 - 7167 */

// Soldier (tier 5)
DecodedPacketNpcOption.prototype.npc_6912 = function(player, index, npc) { }

// Farmer Gricoller
DecodedPacketNpcOption.prototype.npc_6920 = function(player, index, npc) { }

// Marisi
DecodedPacketNpcOption.prototype.npc_6921 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Konoo
DecodedPacketNpcOption.prototype.npc_6922 = function(player, index, npc) { }

// Clerk
DecodedPacketNpcOption.prototype.npc_6923 = function(player, index, npc) { }

// <col=00ffff>Plough</col>
DecodedPacketNpcOption.prototype.npc_6924 = function(player, index, npc) { }

// <col=00ffff>Plough</col>
DecodedPacketNpcOption.prototype.npc_6925 = function(player, index, npc) { }

// Ewesey
DecodedPacketNpcOption.prototype.npc_6926 = function(player, index, npc) { }

// Ramocean
DecodedPacketNpcOption.prototype.npc_6937 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_6939 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_6940 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_6941 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_6942 = function(player, index, npc) { }

// Horace
DecodedPacketNpcOption.prototype.npc_6943 = function(player, index, npc) { }

// Vannah
DecodedPacketNpcOption.prototype.npc_6944 = function(player, index, npc) { }

// Logava
DecodedPacketNpcOption.prototype.npc_6945 = function(player, index, npc) { }

// Pandur Hosidius
DecodedPacketNpcOption.prototype.npc_6946 = function(player, index, npc) { }

// Farmer
DecodedPacketNpcOption.prototype.npc_6947 = function(player, index, npc) { }

// Farmer
DecodedPacketNpcOption.prototype.npc_6948 = function(player, index, npc) { }

// Farmer
DecodedPacketNpcOption.prototype.npc_6949 = function(player, index, npc) { }

// Farmer
DecodedPacketNpcOption.prototype.npc_6950 = function(player, index, npc) { }

// Farmer
DecodedPacketNpcOption.prototype.npc_6951 = function(player, index, npc) { }

// Farmer
DecodedPacketNpcOption.prototype.npc_6952 = function(player, index, npc) { }

// Golova
DecodedPacketNpcOption.prototype.npc_6953 = function(player, index, npc) { }

// Richard
DecodedPacketNpcOption.prototype.npc_6954 = function(player, index, npc) { }

// Father Jean
DecodedPacketNpcOption.prototype.npc_6955 = function(player, index, npc) { }

// Monk
DecodedPacketNpcOption.prototype.npc_6956 = function(player, index, npc) { }

// Chief Farmer
DecodedPacketNpcOption.prototype.npc_6957 = function(player, index, npc) { }

// Farmer's wife
DecodedPacketNpcOption.prototype.npc_6958 = function(player, index, npc) { }

// Farmer Hayfield
DecodedPacketNpcOption.prototype.npc_6962 = function(player, index, npc) { }

// Frankie
DecodedPacketNpcOption.prototype.npc_6963 = function(player, index, npc) { }

// Tynan
DecodedPacketNpcOption.prototype.npc_6964 = function(player, index, npc) {
    player.openShop("skilling");
}

// Nicholas
DecodedPacketNpcOption.prototype.npc_6965 = function(player, index, npc) { }

// Dockmaster
DecodedPacketNpcOption.prototype.npc_6966 = function(player, index, npc) { }

// Dock worker
DecodedPacketNpcOption.prototype.npc_6967 = function(player, index, npc) { }

// Dock worker
DecodedPacketNpcOption.prototype.npc_6968 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_6969 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_6970 = function(player, index, npc) { }

// Captain Khaled
DecodedPacketNpcOption.prototype.npc_6971 = function(player, index, npc) { }

// Captain Khaled
DecodedPacketNpcOption.prototype.npc_6972 = function(player, index, npc) { }

// Fisherman
DecodedPacketNpcOption.prototype.npc_6981 = function(player, index, npc) { }

// Poor looking man
DecodedPacketNpcOption.prototype.npc_6982 = function(player, index, npc) { }

// Poor looking man
DecodedPacketNpcOption.prototype.npc_6983 = function(player, index, npc) { }

// Poor looking woman
DecodedPacketNpcOption.prototype.npc_6984 = function(player, index, npc) { }

// Poor looking woman
DecodedPacketNpcOption.prototype.npc_6985 = function(player, index, npc) { }

// Leenz
DecodedPacketNpcOption.prototype.npc_6986 = function(player, index, npc) { }

// Man
DecodedPacketNpcOption.prototype.npc_6987 = function(player, index, npc) { }

// Man
DecodedPacketNpcOption.prototype.npc_6988 = function(player, index, npc) { }

// Man
DecodedPacketNpcOption.prototype.npc_6989 = function(player, index, npc) { }

// Woman
DecodedPacketNpcOption.prototype.npc_6990 = function(player, index, npc) { }

// Woman
DecodedPacketNpcOption.prototype.npc_6991 = function(player, index, npc) { }

// Woman
DecodedPacketNpcOption.prototype.npc_6992 = function(player, index, npc) { }

// Pirate
DecodedPacketNpcOption.prototype.npc_6993 = function(player, index, npc) { }

// Pirate
DecodedPacketNpcOption.prototype.npc_6994 = function(player, index, npc) { }

// Pirate
DecodedPacketNpcOption.prototype.npc_6995 = function(player, index, npc) { }

// Dark wizard
DecodedPacketNpcOption.prototype.npc_6997 = function(player, index, npc) { }

// Pirate
DecodedPacketNpcOption.prototype.npc_6998 = function(player, index, npc) { }

// Port Official
DecodedPacketNpcOption.prototype.npc_6999 = function(player, index, npc) { }

// Captain Janaway
DecodedPacketNpcOption.prototype.npc_7000 = function(player, index, npc) { }

// Port worker
DecodedPacketNpcOption.prototype.npc_7001 = function(player, index, npc) { }

// Mark
DecodedPacketNpcOption.prototype.npc_7002 = function(player, index, npc) { }

// Cheryl
DecodedPacketNpcOption.prototype.npc_7003 = function(player, index, npc) { }

// Charles
DecodedPacketNpcOption.prototype.npc_7004 = function(player, index, npc) { }

// Sarah
DecodedPacketNpcOption.prototype.npc_7005 = function(player, index, npc) { }

// Darren
DecodedPacketNpcOption.prototype.npc_7006 = function(player, index, npc) { }

// Melvin
DecodedPacketNpcOption.prototype.npc_7007 = function(player, index, npc) { }

// Simon
DecodedPacketNpcOption.prototype.npc_7008 = function(player, index, npc) { }

// Andrea
DecodedPacketNpcOption.prototype.npc_7009 = function(player, index, npc) { }

// Elizabeth
DecodedPacketNpcOption.prototype.npc_7010 = function(player, index, npc) { }

// Lorraine
DecodedPacketNpcOption.prototype.npc_7011 = function(player, index, npc) { }

// Ross and Ben
DecodedPacketNpcOption.prototype.npc_7012 = function(player, index, npc) { }

// Dobwinkle
DecodedPacketNpcOption.prototype.npc_7013 = function(player, index, npc) { }

// Alexander
DecodedPacketNpcOption.prototype.npc_7014 = function(player, index, npc) { }

// Charlie Brown
DecodedPacketNpcOption.prototype.npc_7015 = function(player, index, npc) { }

// Kourend guard
DecodedPacketNpcOption.prototype.npc_7016 = function(player, index, npc) { }

// Kourend head guard
DecodedPacketNpcOption.prototype.npc_7017 = function(player, index, npc) { }

// Clerris
DecodedPacketNpcOption.prototype.npc_7040 = function(player, index, npc) { }

// Enoch
DecodedPacketNpcOption.prototype.npc_7041 = function(player, index, npc) { }

// Aretha
DecodedPacketNpcOption.prototype.npc_7042 = function(player, index, npc) { }

// Logosia
DecodedPacketNpcOption.prototype.npc_7044 = function(player, index, npc) { }

// Biblia
DecodedPacketNpcOption.prototype.npc_7045 = function(player, index, npc) { }

// Horphis
DecodedPacketNpcOption.prototype.npc_7046 = function(player, index, npc) { }

// Villia
DecodedPacketNpcOption.prototype.npc_7047 = function(player, index, npc) { }

// Professor Gracklebone
DecodedPacketNpcOption.prototype.npc_7048 = function(player, index, npc) { }

// Sam
DecodedPacketNpcOption.prototype.npc_7049 = function(player, index, npc) { }

// Tyss
DecodedPacketNpcOption.prototype.npc_7050 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("spellbooks", 0);
    } else if (index == 2) {
        player.getMagic().setVengeanceCast(false);
        if (player.getMagic().getSpellBook() == Magic.NORMAL_MAGIC) {
            player.getMagic().setSpellBook(Magic.ANCIENT_MAGIC);
        } else if (player.getMagic().getSpellBook() == Magic.ANCIENT_MAGIC) {
            player.getMagic().setSpellBook(Magic.LUNAR_MAGIC);
        } else {
            player.getMagic().setSpellBook(Magic.NORMAL_MAGIC);
        }
    }
}

// Trossa
DecodedPacketNpcOption.prototype.npc_7051 = function(player, index, npc) { }

// Rassain
DecodedPacketNpcOption.prototype.npc_7053 = function(player, index, npc) { }

// Mofina
DecodedPacketNpcOption.prototype.npc_7054 = function(player, index, npc) { }

// Regath
DecodedPacketNpcOption.prototype.npc_7056 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_7057 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_7058 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_7059 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_7060 = function(player, index, npc) { }

// Freald
DecodedPacketNpcOption.prototype.npc_7062 = function(player, index, npc) { }

// Dark wizard
DecodedPacketNpcOption.prototype.npc_7064 = function(player, index, npc) { }

// Wizard
DecodedPacketNpcOption.prototype.npc_7067 = function(player, index, npc) { }

// Ouditor
DecodedPacketNpcOption.prototype.npc_7068 = function(player, index, npc) { }

// Smoggy
DecodedPacketNpcOption.prototype.npc_7069 = function(player, index, npc) { }

// Toothy
DecodedPacketNpcOption.prototype.npc_7071 = function(player, index, npc) { }

// Operator
DecodedPacketNpcOption.prototype.npc_7072 = function(player, index, npc) { }

// Operator
DecodedPacketNpcOption.prototype.npc_7073 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_7077 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_7078 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_7079 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_7080 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_7081 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_7082 = function(player, index, npc) { }

// Armourer (tier 1)
DecodedPacketNpcOption.prototype.npc_7083 = function(player, index, npc) { }

// Armourer (tier 2)
DecodedPacketNpcOption.prototype.npc_7084 = function(player, index, npc) { }

// Armourer (tier 3)
DecodedPacketNpcOption.prototype.npc_7085 = function(player, index, npc) { }

// Armourer (tier 4)
DecodedPacketNpcOption.prototype.npc_7086 = function(player, index, npc) { }

// Armourer (tier 5)
DecodedPacketNpcOption.prototype.npc_7087 = function(player, index, npc) { }

// Munty
DecodedPacketNpcOption.prototype.npc_7088 = function(player, index, npc) { }

// Moggy
DecodedPacketNpcOption.prototype.npc_7089 = function(player, index, npc) { }

// Fuggy
DecodedPacketNpcOption.prototype.npc_7090 = function(player, index, npc) { }

// Miner
DecodedPacketNpcOption.prototype.npc_7091 = function(player, index, npc) { }

// Miner
DecodedPacketNpcOption.prototype.npc_7092 = function(player, index, npc) { }

// Miner
DecodedPacketNpcOption.prototype.npc_7093 = function(player, index, npc) { }

// Miner
DecodedPacketNpcOption.prototype.npc_7094 = function(player, index, npc) { }

// Stunted demonic gorilla
DecodedPacketNpcOption.prototype.npc_7098 = function(player, index, npc) { }

// Kruk
DecodedPacketNpcOption.prototype.npc_7099 = function(player, index, npc) { }

// Glough
DecodedPacketNpcOption.prototype.npc_7100 = function(player, index, npc) { }

// Keef
DecodedPacketNpcOption.prototype.npc_7104 = function(player, index, npc) { }

// Keef
DecodedPacketNpcOption.prototype.npc_7105 = function(player, index, npc) { }

// Kob
DecodedPacketNpcOption.prototype.npc_7106 = function(player, index, npc) { }

// Kob
DecodedPacketNpcOption.prototype.npc_7107 = function(player, index, npc) { }

// Nieve
DecodedPacketNpcOption.prototype.npc_7108 = function(player, index, npc) { }

// Nieve
DecodedPacketNpcOption.prototype.npc_7109 = function(player, index, npc) { }

// Nieve
DecodedPacketNpcOption.prototype.npc_7110 = function(player, index, npc) { }

// Garkor
DecodedPacketNpcOption.prototype.npc_7111 = function(player, index, npc) { }

// Lumo
DecodedPacketNpcOption.prototype.npc_7112 = function(player, index, npc) { }

// Zooknock
DecodedPacketNpcOption.prototype.npc_7113 = function(player, index, npc) { }

// Carado
DecodedPacketNpcOption.prototype.npc_7114 = function(player, index, npc) { }

// Glough
DecodedPacketNpcOption.prototype.npc_7115 = function(player, index, npc) { }

// Kineer
DecodedPacketNpcOption.prototype.npc_7117 = function(player, index, npc) { }

// Oobapohk
DecodedPacketNpcOption.prototype.npc_7120 = function(player, index, npc) { }

// Jumaane
DecodedPacketNpcOption.prototype.npc_7121 = function(player, index, npc) { }

// Assistant Lori
DecodedPacketNpcOption.prototype.npc_7154 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_7155 = function(player, index, npc) { }

// Anita
DecodedPacketNpcOption.prototype.npc_7156 = function(player, index, npc) { }

// Anita
DecodedPacketNpcOption.prototype.npc_7157 = function(player, index, npc) { }

// Garkor
DecodedPacketNpcOption.prototype.npc_7158 = function(player, index, npc) { }

// Garkor
DecodedPacketNpcOption.prototype.npc_7159 = function(player, index, npc) { }

// Lumo
DecodedPacketNpcOption.prototype.npc_7160 = function(player, index, npc) { }

// Lumo
DecodedPacketNpcOption.prototype.npc_7161 = function(player, index, npc) { }

// Bunkdo
DecodedPacketNpcOption.prototype.npc_7162 = function(player, index, npc) { }

// Bunkdo
DecodedPacketNpcOption.prototype.npc_7163 = function(player, index, npc) { }

// Carado
DecodedPacketNpcOption.prototype.npc_7164 = function(player, index, npc) { }

// Carado
DecodedPacketNpcOption.prototype.npc_7165 = function(player, index, npc) { }

// Bunkwicket
DecodedPacketNpcOption.prototype.npc_7166 = function(player, index, npc) { }

// Bunkwicket
DecodedPacketNpcOption.prototype.npc_7167 = function(player, index, npc) { }
