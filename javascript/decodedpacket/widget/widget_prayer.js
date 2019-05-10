DecodedPacketWidget.prototype.widget_541 = function(player, index, childID, slot, itemID) {
    // Tab
    player.getPrayer().activate(childID);
}

DecodedPacketWidget.prototype.widget_77 = function(player, index, childID, slot, itemID) {
    // Quick
    switch (childID) {
    case 4:
        var prayerOffset = 5;
        if (slot <= 23 || slot >= 27) {
            player.getPrayer().activate(slot + prayerOffset);
        } else if (slot == 24) {
            player.getPrayer().activate(slot + prayerOffset + 2);
        } else if (slot == 25 || slot == 26) {
            player.getPrayer().activate(slot + prayerOffset - 1);
        }
        break;
    case 5:
        player.getPrayer().switchQuick();
        break;
    }
}
