DecodedPacketWidget.prototype.widget_130 = function(player, index, childID, slot, itemID) {
    if (player.isLocked()) {
        return;
    }
    if (player.getMovement().getTeleporting() || player.getMovement().getTeleported()
            || player.getMovement().isViewing()) {
        return;
    }
    switch (childID) {
    case 8:
        player.getClanWars().teleportViewing(-1);
        break;
    }
}
