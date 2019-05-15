DecodedPacketWidget.prototype.widget_2 = function(player, index, childID, slot, itemID) {
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 74:
        player.getWidgetManager().removeInteractiveWidgets();
        break;
    }
}
