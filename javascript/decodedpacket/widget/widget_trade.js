DecodedPacketWidget.prototype.widget_335 = function(player, index, childID, slot, itemID) {
    // Trade
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 10:
        player.getTrade().accept1();
        break;
    case 25:
        if (index == 0) {
            player.getTrade().removeOffer(itemID, slot, 1);
        } else if (index == 1) {
            player.getTrade().removeOffer(itemID, slot, 5);
        } else if (index == 2) {
            player.getTrade().removeOffer(itemID, slot, 10);
        } else if (index == 3) {
            player.getTrade().removeOffer(itemID, slot, Item.MAX_AMOUNT);
        } else if (index == 4) {
            player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                execute: function(value) {
                    player.getTrade().removeOffer(itemID, slot, value);
                }
            });
        }
        break;
    }
}

DecodedPacketWidget.prototype.widget_336 = function(player, index, childID, slot, itemID) {
    // Inventory
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 0:
        if (index == 0) {
            player.getTrade().offerItem(itemID, slot, 1);
        } else if (index == 1) {
            player.getTrade().offerItem(itemID, slot, 5);
        } else if (index == 2) {
            player.getTrade().offerItem(itemID, slot, 10);
        } else if (index == 3) {
            player.getTrade().offerItem(itemID, slot, Item.MAX_AMOUNT);
        } else if (index == 4) {
            player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                execute: function(value) {
                    player.getTrade().offerItem(itemID, slot, value);
                }
            });
        }
        break;
    }
}

DecodedPacketWidget.prototype.widget_334 = function(player, index, childID, slot, itemID) {
    // Accept
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 13:
        player.getTrade().accept2();
        break;
    case 14:
        player.getWidgetManager().removeInteractiveWidgets();
        break;
    }
}
