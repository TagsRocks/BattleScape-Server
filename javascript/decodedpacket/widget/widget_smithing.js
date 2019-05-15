DecodedPacketWidget.prototype.widget_312 = function(player, index, childID, slot, itemID) {
    if (player.isLocked()) {
        return;
    }
    var selected = childID - 2;
    var itemArray = player.getAttribute("smithing_ids");
    if (itemArray == null || selected < 0 || selected >= itemArray.length) {
        return;
    }
    var itemID = itemArray[selected];
    if (index == 0) {
        Smithing.start(player, itemID, 1);
    } else if (index == 1) {
        Smithing.start(player, itemID, 5);
    } else if (index == 2) {
        Smithing.start(player, itemID, 10);
    } else if (index == 3) {
        player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
            execute: function(value) {
                Smithing.start(player, itemID, value);
            }
        });
    } else if (index == 4) {
        Smithing.start(player, itemID, 28);
    }
}
