DecodedPacketWidget.prototype.widget_703 = function(player, index, childID, slot, itemID) {
    if (player.isLocked()) {
        return;
    }
    if (!player.getController().canTeleport(true)) {
        return;
    }
    if (childID >= 21 && childID <= 53) {
        player.getWidgetManager().setLastTeleportViewingIndex((childID - 19) / 3);
        Teleports.open(player);
    } else if (childID >= 59 && childID <= 198) {
        Teleports.destinationWidgetPressed(player, childID);
    } else if (childID == 199) {
        Teleports.openHomeSelect(player);
    } else if (childID >= 207 && childID <= 209) {
        var teleportIndices = player.getWidgetManager().getLastTeleport(childID - 207);
        Teleports.destinationWidgetPressed(player, teleportIndices[0], teleportIndices[1]);
    }
}
