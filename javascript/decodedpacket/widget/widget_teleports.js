DecodedPacketWidget.prototype.widget_703 = function(player, index, childID, slot, itemID) {
    if (player.isLocked()) {
        return;
    }
    if (!player.getController().canTeleport(true)) {
        return;
    }
    switch (childID) {
    case 19:
    case 22:
    case 25:
    case 28:
    case 31:
    case 34:
    case 37:
    case 40:
    case 43:
    case 46:
    case 49:
        player.getWidgetManager().setLastTeleportViewingIndex((childID - 19) / 3);
        Teleports.open(player);
        break;
    case 54:
    case 58:
    case 62:
    case 66:
    case 70:
    case 74:
    case 78:
    case 82:
    case 86:
    case 90:
    case 94:
    case 98:
    case 102:
    case 106:
    case 110:
    case 114:
    case 118:
    case 122:
    case 126:
    case 130:
    case 134:
    case 138:
    case 142:
    case 146:
    case 150:
    case 154:
    case 158:
    case 162:
    case 166:
    case 170:
    case 174:
    case 178:
    case 182:
    case 186:
    case 190:
        Teleports.destinationWidgetPressed(player, childID);
        break;
    case 199:
        Teleports.openHomeSelect(player);
        break;
    case 203:
    case 204:
    case 205:
        var teleportIndices = player.getWidgetManager().getLastTeleport(childID - 204);
        Teleports.destinationWidgetPressed(player, teleportIndices[0], teleportIndices[1]);
        break;
    }
}
