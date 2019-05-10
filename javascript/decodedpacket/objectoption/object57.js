/* 14592 - 14847 */

// Staircase
DecodedPacketObjectOption.prototype.object_14735 = function(player, index, object) {
    var tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
    player.getMovement().ladderUpTeleport(tile);
}

// Staircase
DecodedPacketObjectOption.prototype.object_14736 = function(player, index, object) {
    if (index == 0) {
        player.openDialogue("climb", 0);
    } else if (index == 1) {
        var tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
        player.getMovement().ladderUpTeleport(tile);
    } else if (index == 2) {
        var tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().ladderDownTeleport(tile);
    }
}

// Staircase
DecodedPacketObjectOption.prototype.object_14737 = function(player, index, object) {
    var tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
    player.getMovement().ladderDownTeleport(tile);
}

// Sack
DecodedPacketObjectOption.prototype.object_14743 = function(player, index, object) {
    if (object.getX() == 3093 && object.getY() == 3956) {
        if (!player.getInventory().hasItem(946)) {
            player.getGameEncoder().sendMessage("You search the sack and find a knife.");
            player.getInventory().addItem(946, 1);
        } else {
            player.getGameEncoder().sendMessage("You search the sack but find nothing.");
        }
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_14745 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_14746 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_14747 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_14749 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Door
DecodedPacketObjectOption.prototype.object_14750 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Door
DecodedPacketObjectOption.prototype.object_14751 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Door
DecodedPacketObjectOption.prototype.object_14752 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Door
DecodedPacketObjectOption.prototype.object_14753 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Door
DecodedPacketObjectOption.prototype.object_14754 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Ladder
DecodedPacketObjectOption.prototype.object_14758 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_14773 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_14774 = function(player, index, object) { }

// Obelisk
DecodedPacketObjectOption.prototype.object_14826 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (index == 0) {
        WildernessObelisk.activateObelisk(player, object);
    }
}

// Obelisk
DecodedPacketObjectOption.prototype.object_14827 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (index == 0) {
        WildernessObelisk.activateObelisk(player, object);
    }
}

// Obelisk
DecodedPacketObjectOption.prototype.object_14828 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (index == 0) {
        WildernessObelisk.activateObelisk(player, object);
    }
}

// Obelisk
DecodedPacketObjectOption.prototype.object_14829 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (index == 0) {
        WildernessObelisk.activateObelisk(player, object);
    }
}

// Obelisk
DecodedPacketObjectOption.prototype.object_14830 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (index == 0) {
        WildernessObelisk.activateObelisk(player, object);
    }
}

// Obelisk
DecodedPacketObjectOption.prototype.object_14831 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (index == 0) {
        WildernessObelisk.activateObelisk(player, object);
    }
}

// Mysterious ruins
DecodedPacketObjectOption.prototype.object_14832 = function(player, index, object) { }

// Mysterious ruins
DecodedPacketObjectOption.prototype.object_14834 = function(player, index, object) { }

// Mysterious ruins
DecodedPacketObjectOption.prototype.object_14836 = function(player, index, object) { }

// Charcoal furnace
DecodedPacketObjectOption.prototype.object_14837 = function(player, index, object) { }

// Charcoal furnace
DecodedPacketObjectOption.prototype.object_14838 = function(player, index, object) { }

// Dead mushroom ring
DecodedPacketObjectOption.prototype.object_14839 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_14841 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_14842 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_14843 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_14844 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_14845 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_14846 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_14847 = function(player, index, object) { }
