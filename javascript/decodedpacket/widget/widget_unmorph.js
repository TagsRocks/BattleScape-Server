DecodedPacketWidget.prototype.widget_375 = function(player, index, childID, slot, itemID) {
    switch (childID) {
    case 5:
        player.getMovement().stopViewing();
        player.getWidgetManager().removeInteractiveWidgets();
        player.getAppearance().setNpcID(-1);
        break;
    }
}
