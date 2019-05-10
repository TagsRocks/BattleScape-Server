DecodedPacketWidget.prototype.widget_219 = function(player, index, childID, slot, itemID) {
    // Chatbox selection
    Dialogue.handleWidget(player, childID, slot - 1);
}

DecodedPacketWidget.prototype.widget_187 = function(player, index, childID, slot, itemID) {
    // Screen selection
    Dialogue.handleWidget(player, childID, slot);
}

DecodedPacketWidget.prototype.widget_229 = function(player, index, childID, slot, itemID) {
    // Screen selection
    Dialogue.handleWidget(player, childID, 0);
}

DecodedPacketWidget.prototype.widget_270 = function(player, index, childID, slot, itemID) {
    // Make-x
    Dialogue.handleWidget(player, childID - 14, slot);
}
