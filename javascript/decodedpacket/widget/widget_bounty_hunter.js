DecodedPacketWidget.prototype.widget_90 = function(player, index, childID, slot, itemID) {
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 57:
        player.openDialogue("bountyhunter", 0);
        break;
    }
}
