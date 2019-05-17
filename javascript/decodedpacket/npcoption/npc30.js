/* 7680 - 7935 */

// TzHaar-Mej-Dir
DecodedPacketNpcOption.prototype.npc_7680 = function(player, index, npc) { }

// TzHaar-Mej-Bal
DecodedPacketNpcOption.prototype.npc_7681 = function(player, index, npc) { }

// TzHaar-Hur
DecodedPacketNpcOption.prototype.npc_7682 = function(player, index, npc) { }

// TzHaar-Hur
DecodedPacketNpcOption.prototype.npc_7683 = function(player, index, npc) { }

// TzHaar-Hur
DecodedPacketNpcOption.prototype.npc_7684 = function(player, index, npc) { }

// TzHaar-Hur
DecodedPacketNpcOption.prototype.npc_7685 = function(player, index, npc) { }

// TzHaar-Hur
DecodedPacketNpcOption.prototype.npc_7686 = function(player, index, npc) { }

// TzHaar-Hur
DecodedPacketNpcOption.prototype.npc_7687 = function(player, index, npc) { }

// TzHaar-Hur-Zal
DecodedPacketNpcOption.prototype.npc_7688 = function(player, index, npc) { }

// TzHaar-Hur-Rin
DecodedPacketNpcOption.prototype.npc_7689 = function(player, index, npc) { }

// TzHaar-Ket-Keh
DecodedPacketNpcOption.prototype.npc_7690 = function(player, index, npc) {
    player.openDialogue("tzhaar", 6);
}

// Rock Golem
DecodedPacketNpcOption.prototype.npc_7711 = function(player, index, npc) { }

// Dwarf
DecodedPacketNpcOption.prototype.npc_7712 = function(player, index, npc) { }

// Dwarf
DecodedPacketNpcOption.prototype.npc_7713 = function(player, index, npc) { }

// Dwarf
DecodedPacketNpcOption.prototype.npc_7714 = function(player, index, npc) { }

// Dwarf
DecodedPacketNpcOption.prototype.npc_7715 = function(player, index, npc) { }

// Gadrin
DecodedPacketNpcOption.prototype.npc_7716 = function(player, index, npc) {
    if (npc.getX() == 2446 && npc.getY() == 3426) {
        player.getMovement().animatedTeleport(new Tile(2467, 9905), Magic.NORMAL_MAGIC_ANIMATION_START,
                Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
    } else if (npc.getX() == 3272 && npc.getY() == 3164) {
        player.getMovement().animatedTeleport(new Tile(3294, 3282), Magic.NORMAL_MAGIC_ANIMATION_START,
                Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
    } else {
        player.openShop("skilling");
    }
}

// Hendor
DecodedPacketNpcOption.prototype.npc_7717 = function(player, index, npc) { }

// Yarsul
DecodedPacketNpcOption.prototype.npc_7718 = function(player, index, npc) { }

// Belona
DecodedPacketNpcOption.prototype.npc_7719 = function(player, index, npc) {
    if (index == 3) {
        player.getSkills().setMiningMinerals(!player.getSkills().getMiningMinerals());
        player.getGameEncoder().sendMessage("Minerals while mining: " + player.getSkills().getMiningMinerals());
    } else {
        player.openShop("mining_minerals");
    }
}

// Utrec
DecodedPacketNpcOption.prototype.npc_7720 = function(player, index, npc) { }

// Dwarf
DecodedPacketNpcOption.prototype.npc_7721 = function(player, index, npc) { }

// Gertrude
DecodedPacketNpcOption.prototype.npc_7723 = function(player, index, npc) { }

// Barbarian guard
DecodedPacketNpcOption.prototype.npc_7724 = function(player, index, npc) { }

// Dwarven Boatman
DecodedPacketNpcOption.prototype.npc_7725 = function(player, index, npc) { }

// Dwarven Boatman
DecodedPacketNpcOption.prototype.npc_7726 = function(player, index, npc) { }

// Kylie Minnow
DecodedPacketNpcOption.prototype.npc_7727 = function(player, index, npc) { }

// Kylie Minnow
DecodedPacketNpcOption.prototype.npc_7728 = function(player, index, npc) {
    player.openShop("minnows");
}

// Fishing spot
DecodedPacketNpcOption.prototype.npc_7730 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_7731 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_7732 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_7733 = function(player, index, npc) { }

// Recruiter
DecodedPacketNpcOption.prototype.npc_7734 = function(player, index, npc) { }

// Rock Golem
DecodedPacketNpcOption.prototype.npc_7736 = function(player, index, npc) { }

// Rock Golem
DecodedPacketNpcOption.prototype.npc_7737 = function(player, index, npc) { }

// Rock Golem
DecodedPacketNpcOption.prototype.npc_7738 = function(player, index, npc) { }

// Rock Golem
DecodedPacketNpcOption.prototype.npc_7739 = function(player, index, npc) { }

// Rock Golem
DecodedPacketNpcOption.prototype.npc_7740 = function(player, index, npc) { }

// Rock Golem
DecodedPacketNpcOption.prototype.npc_7741 = function(player, index, npc) { }

// Captain Cleive
DecodedPacketNpcOption.prototype.npc_7742 = function(player, index, npc) { }

// Soldier
DecodedPacketNpcOption.prototype.npc_7743 = function(player, index, npc) { }

// Wizard Mizgog
DecodedPacketNpcOption.prototype.npc_7746 = function(player, index, npc) { }

// Wizard Mizgog
DecodedPacketNpcOption.prototype.npc_7747 = function(player, index, npc) { }

// Fairy
DecodedPacketNpcOption.prototype.npc_7748 = function(player, index, npc) { }

// Dark mage
DecodedPacketNpcOption.prototype.npc_7752 = function(player, index, npc) { }

// Dark mage
DecodedPacketNpcOption.prototype.npc_7753 = function(player, index, npc) { }

// Squirrel
DecodedPacketNpcOption.prototype.npc_7754 = function(player, index, npc) { }

// Squirrel
DecodedPacketNpcOption.prototype.npc_7755 = function(player, index, npc) { }

// Squirrel
DecodedPacketNpcOption.prototype.npc_7756 = function(player, index, npc) { }

// Tool Leprechaun
DecodedPacketNpcOption.prototype.npc_7757 = function(player, index, npc) { }

// Mernia
DecodedPacketNpcOption.prototype.npc_7758 = function(player, index, npc) { }

// Herbi
DecodedPacketNpcOption.prototype.npc_7759 = function(player, index, npc) { }

// Herbi
DecodedPacketNpcOption.prototype.npc_7760 = function(player, index, npc) { }

// Lead Navigator
DecodedPacketNpcOption.prototype.npc_7761 = function(player, index, npc) { }

// Lead Navigator
DecodedPacketNpcOption.prototype.npc_7762 = function(player, index, npc) { }

// Junior Navigator
DecodedPacketNpcOption.prototype.npc_7763 = function(player, index, npc) { }

// Junior Navigator
DecodedPacketNpcOption.prototype.npc_7764 = function(player, index, npc) { }

// John
DecodedPacketNpcOption.prototype.npc_7765 = function(player, index, npc) { }

// David
DecodedPacketNpcOption.prototype.npc_7766 = function(player, index, npc) { }

// Barge guard
DecodedPacketNpcOption.prototype.npc_7767 = function(player, index, npc) { }

// Barge guard
DecodedPacketNpcOption.prototype.npc_7768 = function(player, index, npc) { }

// Shop keeper
DecodedPacketNpcOption.prototype.npc_7769 = function(player, index, npc) { }

// Fossil Collector
DecodedPacketNpcOption.prototype.npc_7770 = function(player, index, npc) { }

// Peter
DecodedPacketNpcOption.prototype.npc_7772 = function(player, index, npc) { }

// Charles
DecodedPacketNpcOption.prototype.npc_7773 = function(player, index, npc) { }

// John
DecodedPacketNpcOption.prototype.npc_7774 = function(player, index, npc) { }

// Jardric
DecodedPacketNpcOption.prototype.npc_7775 = function(player, index, npc) { }

// Petrified Pete
DecodedPacketNpcOption.prototype.npc_7776 = function(player, index, npc) { }

// Weve
DecodedPacketNpcOption.prototype.npc_7777 = function(player, index, npc) { }

// Irene
DecodedPacketNpcOption.prototype.npc_7778 = function(player, index, npc) { }

// Bobbing fossil
DecodedPacketNpcOption.prototype.npc_7779 = function(player, index, npc) { }

// Puffer Fish
DecodedPacketNpcOption.prototype.npc_7780 = function(player, index, npc) { }

// Fish shoal
DecodedPacketNpcOption.prototype.npc_7782 = function(player, index, npc) { }

// Ceto
DecodedPacketNpcOption.prototype.npc_7783 = function(player, index, npc) { }

// Mairin
DecodedPacketNpcOption.prototype.npc_7784 = function(player, index, npc) { }

// Herbiboar
DecodedPacketNpcOption.prototype.npc_7785 = function(player, index, npc) { }

// Mattimeo
DecodedPacketNpcOption.prototype.npc_7787 = function(player, index, npc) { }

// Charles Charlington
DecodedPacketNpcOption.prototype.npc_7788 = function(player, index, npc) { }

// Holgart
DecodedPacketNpcOption.prototype.npc_7789 = function(player, index, npc) { }

// John
DecodedPacketNpcOption.prototype.npc_7790 = function(player, index, npc) { }

// David
DecodedPacketNpcOption.prototype.npc_7791 = function(player, index, npc) { }

// Ancient Zygomite
DecodedPacketNpcOption.prototype.npc_7797 = function(player, index, npc) { }

// Ancient Fungi
DecodedPacketNpcOption.prototype.npc_7798 = function(player, index, npc) { }

// Hoop Snake
DecodedPacketNpcOption.prototype.npc_7802 = function(player, index, npc) { }

// Stunned Hoop Snake
DecodedPacketNpcOption.prototype.npc_7803 = function(player, index, npc) { }

// David
DecodedPacketNpcOption.prototype.npc_7818 = function(player, index, npc) { }

// Grim Reaper
DecodedPacketNpcOption.prototype.npc_7856 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_7857 = function(player, index, npc) { }

// Jarvis
DecodedPacketNpcOption.prototype.npc_7858 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_7859 = function(player, index, npc) { }

// Jarvis
DecodedPacketNpcOption.prototype.npc_7860 = function(player, index, npc) { }

// Jarvis
DecodedPacketNpcOption.prototype.npc_7861 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_7862 = function(player, index, npc) { }

// Jarvis
DecodedPacketNpcOption.prototype.npc_7863 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_7870 = function(player, index, npc) { }

// Masked stranger
DecodedPacketNpcOption.prototype.npc_7871 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_7872 = function(player, index, npc) { }

// Masked stranger
DecodedPacketNpcOption.prototype.npc_7873 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_7874 = function(player, index, npc) { }

// Masked stranger
DecodedPacketNpcOption.prototype.npc_7875 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_7876 = function(player, index, npc) { }

// Masked stranger
DecodedPacketNpcOption.prototype.npc_7877 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_7878 = function(player, index, npc) { }

// Masked stranger
DecodedPacketNpcOption.prototype.npc_7879 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_7880 = function(player, index, npc) { }

// Masked stranger
DecodedPacketNpcOption.prototype.npc_7881 = function(player, index, npc) { }

// Midnight
DecodedPacketNpcOption.prototype.npc_7890 = function(player, index, npc) { }

// Noon
DecodedPacketNpcOption.prototype.npc_7891 = function(player, index, npc) { }

// Noon
DecodedPacketNpcOption.prototype.npc_7892 = function(player, index, npc) { }

// Midnight
DecodedPacketNpcOption.prototype.npc_7893 = function(player, index, npc) { }

// Lord Kandur Hosidius
DecodedPacketNpcOption.prototype.npc_7896 = function(player, index, npc) { }

// Elena Hosidius
DecodedPacketNpcOption.prototype.npc_7897 = function(player, index, npc) { }

// Artur Hosidius
DecodedPacketNpcOption.prototype.npc_7898 = function(player, index, npc) { }

// Artur Hosidius
DecodedPacketNpcOption.prototype.npc_7899 = function(player, index, npc) { }

// Butler Jarvis
DecodedPacketNpcOption.prototype.npc_7900 = function(player, index, npc) { }

// Chef Olivia
DecodedPacketNpcOption.prototype.npc_7901 = function(player, index, npc) { }

// Galana
DecodedPacketNpcOption.prototype.npc_7902 = function(player, index, npc) { }

// Tomas Lawry
DecodedPacketNpcOption.prototype.npc_7904 = function(player, index, npc) { }

// Robert O'Reilly
DecodedPacketNpcOption.prototype.npc_7905 = function(player, index, npc) { }

// Devan Rutter
DecodedPacketNpcOption.prototype.npc_7906 = function(player, index, npc) { }

// Conrad King
DecodedPacketNpcOption.prototype.npc_7907 = function(player, index, npc) { }

// The Queen of Thieves
DecodedPacketNpcOption.prototype.npc_7908 = function(player, index, npc) { }

// Lady Shauna Piscarilius
DecodedPacketNpcOption.prototype.npc_7909 = function(player, index, npc) { }

// Councillor Hughes
DecodedPacketNpcOption.prototype.npc_7910 = function(player, index, npc) { }

// Bartender
DecodedPacketNpcOption.prototype.npc_7911 = function(player, index, npc) { }

// Fish monger
DecodedPacketNpcOption.prototype.npc_7912 = function(player, index, npc) { }

// Shop keeper
DecodedPacketNpcOption.prototype.npc_7913 = function(player, index, npc) { }

// Thief
DecodedPacketNpcOption.prototype.npc_7914 = function(player, index, npc) { }

// Thief
DecodedPacketNpcOption.prototype.npc_7915 = function(player, index, npc) { }

// Thief
DecodedPacketNpcOption.prototype.npc_7916 = function(player, index, npc) { }

// Pirate
DecodedPacketNpcOption.prototype.npc_7917 = function(player, index, npc) { }

// Pirate
DecodedPacketNpcOption.prototype.npc_7918 = function(player, index, npc) { }

// Man
DecodedPacketNpcOption.prototype.npc_7919 = function(player, index, npc) { }

// Man
DecodedPacketNpcOption.prototype.npc_7920 = function(player, index, npc) { }

// Woman
DecodedPacketNpcOption.prototype.npc_7921 = function(player, index, npc) { }

// Woman
DecodedPacketNpcOption.prototype.npc_7922 = function(player, index, npc) { }

// Poor looking woman
DecodedPacketNpcOption.prototype.npc_7923 = function(player, index, npc) { }

// Councillor Andrews
DecodedPacketNpcOption.prototype.npc_7924 = function(player, index, npc) { }
