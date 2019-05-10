DecodedPacketWidget.prototype.widget_548 = function(player, index, childID, slot, itemID) {
    // Fixed screen
    var child = WidgetChild.FixedViewport.getByChild(childID);
    if (child.getIcon() != null) {
        player.getOptions().setViewingIcon(child.getIcon());
        if (child.getIcon() == WidgetChild.ViewportIcon.QUESTS) {
            player.getWidgetManager().sendQuestOverlay();
        } else if (child.getIcon() == WidgetChild.ViewportIcon.MAGIC && index == 1) {
            player.getMagic().setDisableSpellFiltering(!player.getMagic().getDisableSpellFiltering());
        }
    }
}

DecodedPacketWidget.prototype.widget_161 = function(player, index, childID, slot, itemID) {
    // Resizable box
    var child = WidgetChild.ResizeableBoxViewport.getByChild(childID);
    if (child.getIcon() != null) {
        player.getOptions().setViewingIcon(child.getIcon());
        if (child.getIcon() == WidgetChild.ViewportIcon.QUESTS) {
            player.getWidgetManager().sendQuestOverlay();
        } else if (child.getIcon() == WidgetChild.ViewportIcon.MAGIC && index == 1) {
            player.getMagic().setDisableSpellFiltering(!player.getMagic().getDisableSpellFiltering());
        }
    }
}

DecodedPacketWidget.prototype.widget_164 = function(player, index, childID, slot, itemID) {
    // Resizable line
    var child = WidgetChild.ResizeableLineViewport.getByChild(childID);
    if (child.getIcon() != null) {
        player.getOptions().setViewingIcon(child.getIcon());
        if (child.getIcon() == WidgetChild.ViewportIcon.QUESTS) {
            player.getWidgetManager().sendQuestOverlay();
        } else if (child.getIcon() == WidgetChild.ViewportIcon.MAGIC && index == 1) {
            player.getMagic().setDisableSpellFiltering(!player.getMagic().getDisableSpellFiltering());
        }
    }
}
