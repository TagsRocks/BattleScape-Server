DecodedPacketWidget.prototype.widget_378 = function(player, index, childID, slot, itemID) {
    switch (childID) {
    case 81:
        player.getWidgetManager().sendGameViewport();
        if (player.isNewAccount()) {
            player.getWidgetManager().sendInteractiveOverlay(WidgetID.CHARACTER_DESIGN);
        } else if (!player.getGoldMember() && Utils.randomE(5) == 0) {
            Dialogue.openChatboxMessage(player, "<col=ff0000>Bonds</col> can be purchased for $4 and can be used for: trading, membership, mystery box, 100K blood money, ring of wealth (i), herb sack, seed box, and skilling outfits.");
        }
        break;
    }
}
