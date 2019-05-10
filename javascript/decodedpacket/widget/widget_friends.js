DecodedPacketWidget.prototype.widget_429 = function(player, index, childID, slot, itemID) {
    if (childID == 1) {
        player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.FRIENDS, WidgetID.IGNORES);
    }
}

DecodedPacketWidget.prototype.widget_432 = function(player, index, childID, slot, itemID) {
    if (childID == 1) {
        player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.FRIENDS, WidgetID.FRIENDS);
    }
}

DecodedPacketWidget.prototype.widget_109 = function(player, index, childID, slot, itemID) {
    // Account management
    if (childID == 3 || childID == 8) {
        player.getOptions().openBondsMenu();
    } else if (childID == 15) {
        player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/private");
    } else if (childID == 22) {
        player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/forms?do=form&fid=4");
    } else if (childID == 29) {
        player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/");
    } else if (childID == 32) {
        player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/forums/19-Support");
    }
}
