DecodedPacketWidget.prototype.widget_549 = function(player, index, childID, slot, itemID) {
    // OSRS version
}

DecodedPacketWidget.prototype.widget_700 = function(player, index, childID, slot, itemID) {
    // Custom version
    switch (childID) {
    case 425:
        player.getCombat().openNPCRareLootList();
        break;
    }
}
