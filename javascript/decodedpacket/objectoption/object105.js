/* 26880 - 27135 */

// Vine
DecodedPacketObjectOption.prototype.object_26880 = function(player, index, object) {
    // Brimhaven Dungeon
    var tile = new Tile(2670, 9583, 2);
    player.getMovement().ladderUpTeleport(tile);
}

// Vine
DecodedPacketObjectOption.prototype.object_26882 = function(player, index, object) {
    // Brimhaven Dungeon
    var tile = new Tile(2673, 9583, 0);
    player.getMovement().ladderUpTeleport(tile);
}

// Blighted vine
DecodedPacketObjectOption.prototype.object_26884 = function(player, index, object) { }

// Blighted vine
DecodedPacketObjectOption.prototype.object_26886 = function(player, index, object) { }

// Appendage
DecodedPacketObjectOption.prototype.object_27027 = function(player, index, object) { }

// <col=ffff00>The Overseer</col>
DecodedPacketObjectOption.prototype.object_27044 = function(player, index, object) { }

// <col=ff9040>Overseer's book</col>
DecodedPacketObjectOption.prototype.object_27047 = function(player, index, object) { }

// Passage
DecodedPacketObjectOption.prototype.object_27054 = function(player, index, object) {
    player.getMovement().teleport(3039, 4800);
}

// Passage
DecodedPacketObjectOption.prototype.object_27055 = function(player, index, object) {
    if (player.getEquipment().getHandID() == 11095 || player.getEquipment().getHandID() == 11097
            || player.getEquipment().getHandID() == 11099 || player.getEquipment().getHandID() == 11101
            || player.getEquipment().getHandID() == 11103) {
        player.getEquipment().setItem(Equipment.Slot.HAND, (player.getEquipment().getHandID() == 11103)
                ? null : new Item(player.getEquipment().getHandID() + 2, 1));
        player.getAppearance().setUpdate(true);
    } else {
        player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
    }
    player.getMovement().teleport(3039, 4805);
}

// <col=ffff00>The Overseer</col>
DecodedPacketObjectOption.prototype.object_27057 = function(player, index, object) {
    player.openDialogue("bossinstance", 11);
}

// Boils
DecodedPacketObjectOption.prototype.object_27058 = function(player, index, object) { }

// Evergreen
DecodedPacketObjectOption.prototype.object_27060 = function(player, index, object) { }

// Tree stump
DecodedPacketObjectOption.prototype.object_27061 = function(player, index, object) { }

// Rockslide
DecodedPacketObjectOption.prototype.object_27062 = function(player, index, object) { }

// Rockslide
DecodedPacketObjectOption.prototype.object_27063 = function(player, index, object) { }

// Old log
DecodedPacketObjectOption.prototype.object_27064 = function(player, index, object) { }

// Log raft
DecodedPacketObjectOption.prototype.object_27065 = function(player, index, object) { }

// Row boat
DecodedPacketObjectOption.prototype.object_27066 = function(player, index, object) { }

// Old log
DecodedPacketObjectOption.prototype.object_27067 = function(player, index, object) { }

// Door hotspot
DecodedPacketObjectOption.prototype.object_27068 = function(player, index, object) { }

// Door hotspot
DecodedPacketObjectOption.prototype.object_27069 = function(player, index, object) { }

// Window space
DecodedPacketObjectOption.prototype.object_27070 = function(player, index, object) { }

// Floor space
DecodedPacketObjectOption.prototype.object_27071 = function(player, index, object) { }

// Floor decoration
DecodedPacketObjectOption.prototype.object_27072 = function(player, index, object) { }

// Shuttered window
DecodedPacketObjectOption.prototype.object_27073 = function(player, index, object) { }

// Decorative window
DecodedPacketObjectOption.prototype.object_27074 = function(player, index, object) { }

// Stained-glass window
DecodedPacketObjectOption.prototype.object_27075 = function(player, index, object) { }

// Decorative window
DecodedPacketObjectOption.prototype.object_27076 = function(player, index, object) { }

// Stained-glass window
DecodedPacketObjectOption.prototype.object_27077 = function(player, index, object) { }

// Decorative window
DecodedPacketObjectOption.prototype.object_27078 = function(player, index, object) { }

// Stained-glass window
DecodedPacketObjectOption.prototype.object_27079 = function(player, index, object) { }

// Decorative window
DecodedPacketObjectOption.prototype.object_27080 = function(player, index, object) { }

// Stained-glass window
DecodedPacketObjectOption.prototype.object_27081 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_27084 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_27085 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_27086 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_27087 = function(player, index, object) { }

// Light
DecodedPacketObjectOption.prototype.object_27093 = function(player, index, object) { }

// Clan Cup portal
DecodedPacketObjectOption.prototype.object_27094 = function(player, index, object) { }

// Clan Cup portal
DecodedPacketObjectOption.prototype.object_27095 = function(player, index, object) { }

// Exit portal
DecodedPacketObjectOption.prototype.object_27096 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_27100 = function(player, index, object) { }

// Crates
DecodedPacketObjectOption.prototype.object_27101 = function(player, index, object) { }

// Crates
DecodedPacketObjectOption.prototype.object_27102 = function(player, index, object) { }

// Charcoal furnace
DecodedPacketObjectOption.prototype.object_27107 = function(player, index, object) { }

// Charcoal furnace
DecodedPacketObjectOption.prototype.object_27108 = function(player, index, object) { }

// Charcoal furnace
DecodedPacketObjectOption.prototype.object_27109 = function(player, index, object) { }

// Charcoal furnace
DecodedPacketObjectOption.prototype.object_27110 = function(player, index, object) { }

// Flower Patch
DecodedPacketObjectOption.prototype.object_27111 = function(player, index, object) { }

// Compost Bin
DecodedPacketObjectOption.prototype.object_27112 = function(player, index, object) { }

// Allotment
DecodedPacketObjectOption.prototype.object_27113 = function(player, index, object) { }

// Allotment
DecodedPacketObjectOption.prototype.object_27114 = function(player, index, object) { }

// Herb patch
DecodedPacketObjectOption.prototype.object_27115 = function(player, index, object) { }

// Spirit Tree Patch
DecodedPacketObjectOption.prototype.object_27116 = function(player, index, object) { }

// Fishing spot
DecodedPacketObjectOption.prototype.object_27121 = function(player, index, object) { }

// Dead mushroom ring
DecodedPacketObjectOption.prototype.object_27123 = function(player, index, object) { }

// Fairy ring
DecodedPacketObjectOption.prototype.object_27124 = function(player, index, object) {
    if (index == 0) {
        player.openDialogue("fairyring", 0);
    }
}
