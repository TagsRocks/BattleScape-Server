DecodedPacketWidget.prototype.widget_261 = function(player, index, childID, slot, itemID) {
    // Tab
    if (childID >= 18 && childID <= 21) {
        player.getOptions().setBrightness(childID - 18 + 1);
    } else if (childID >= 45 && childID <= 49) {
        player.getOptions().setMusicVolume(49 - childID);
    } else if (childID >= 51 && childID <= 55) {
        player.getOptions().setSoundEffectVolume(55 - childID);
    } else if (childID >= 57 && childID <= 61) {
        player.getOptions().setAreaSoundVolume(61 - childID);
    }
    switch (childID) {
    case 5:
        player.getOptions().setMouseWheelZoom(!player.getOptions().getMouseWheelZoom());
        break;
    case 35:
        if (player.isLocked()) {
            break;
        }
        player.getWidgetManager().sendInteractiveOverlay(WidgetID.ADVANCED_OPTIONS);
        break;
    case 63:
        player.getOptions().setChatEffects(!player.getOptions().getChatEffects());
        break;
    case 65:
        player.getOptions().setSplitPrivateChat(!player.getOptions().getSplitPrivateChat());
        break;
    case 67:
        player.getOptions().setHidePrivateChat(!player.getOptions().getHidePrivateChat());
        break;
    case 69:
        player.getOptions().setProfanityFilter(!player.getOptions().getProfanityFilter());
        break;
    case 73:
        player.getOptions().setLogNotificationTimeout(!player.getOptions().getLogNotificationTimeout());
        break;
    case 75:
        player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/forms.php?do=form&fid=4");
        break;
    case 77:
       player.getOptions().setOneMouseButton(!player.getOptions().getOneMouseButton());
       break;
    case 79:
        player.getOptions().setMiddleMouseCameraControl(!player.getOptions().getMiddleMouseCameraControl());
        break;
    case 81:
        player.getOptions().setFollowerOptionsPriority(!player.getOptions().getFollowerOptionsPriority());
        break;
    case 83:
        player.getOptions().sendKeyBindingInterface();
        break;
    case 85:
        player.getOptions().setShiftClickDrop(!player.getOptions().getShiftClickDrop());
        break;
    case 92:
        player.getOptions().setAcceptAid(!player.getOptions().getAcceptAid());
        break;
    case 95:
        player.getMovement().setRunning(!player.getMovement().getRunning());
        break;
    case 100:
        player.getOptions().openBondsMenu();
        break;
    case 106:
        player.getOptions().setPlayerAttackOption(slot - 1);
        break;
    case 107:
        player.getOptions().setNPCAttackOption(slot - 1);
        break;
    }
}

DecodedPacketWidget.prototype.widget_60 = function(player, index, childID, slot, itemID) {
    // Advanced settings
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 4:
        player.getOptions().setScrollbarLeft(!player.getOptions().getScrollbarLeft());
        break;
    case 6:
        player.getOptions().setTransparentSidePanel(!player.getOptions().getTransparentSidePanel());
        break;
    case 8:
        player.getOptions().setRemainingXPTooltips(!player.getOptions().getRemainingXPTooltips());
        break;
    case 10:
        player.getOptions().setPrayerTooltips(!player.getOptions().getPrayerTooltips());
        break;
    case 12:
        player.getOptions().setSpecialAttackTooltips(!player.getOptions().getSpecialAttackTooltips());
        break;
    case 16:
        player.getOptions().setDataOrbs(!player.getOptions().getDataOrbs());
        player.getWidgetManager().sendGameViewport();
        break;
    case 18:
        player.getOptions().setTransparentChatbox(!player.getOptions().getTransparentChatbox());
        break;
    case 20:
        player.getOptions().setClickThroughChatbox(!player.getOptions().getClickThroughChatbox());
        break;
    case 21:
        player.getOptions().setBottomLineResizable(!player.getOptions().getBottomLineResizable());
        player.getWidgetManager().sendGameViewport();
        break;
    case 23:
        player.getOptions().setSidePanelsClosable(!player.getOptions().getSidePanelsClosable());
        break;
    }
}
