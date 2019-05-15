DecodedPacketWidget.prototype.widget_302 = function(player, index, childID, slot, itemID) {
    var bookID = -1;
    var price = 1;
    switch (childID) {
    case 3: // Holy book
        bookID = ItemID.HOLY_BOOK;
        price = 100000;
        break;
    case 4: // Book of balance
        bookID = ItemID.BOOK_OF_BALANCE;
        price = 100000;
        break;
    case 5: // Unholy book
        bookID = ItemID.UNHOLY_BOOK;
        price = 100000;
        break;
    case 6: // Book of war
        bookID = ItemID.BOOK_OF_WAR;
        price = 500000;
        break;
    case 7: // Book of law
        bookID = ItemID.BOOK_OF_LAW;
        price = 500000;
        break;
    case 8: // Book of darkness
        bookID = ItemID.BOOK_OF_DARKNESS;
        price = 500000;
        break;
    }
    if (bookID == -1) {
        return;
    }
    if (player.getInventory().getCount(ItemID.COINS) < price) {
        player.getGameEncoder().sendMessage(ItemDef.getName(bookID) + ": currently costs "
                + Utils.formatNumber(price) + " coins.");
        return;
    } else if (!player.getInventory().canAddItem(bookID, 1)) {
        player.getInventory().notEnoughSpace();
        return;
    }
    player.getInventory().deleteItem(ItemID.COINS, price);
    player.getInventory().addItem(bookID, 1);
}
