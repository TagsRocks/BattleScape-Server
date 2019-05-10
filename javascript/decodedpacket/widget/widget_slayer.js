DecodedPacketWidget.prototype.widget_426 = function(player, index, childID, slot, itemID) {
    // Rewards
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 8:
        switch (slot) {
        case 4:
            player.getSlayer().unlock(Slayer.MORE_DARKNESS, 100);
            break;
        case 5:
            player.getSlayer().unlock(Slayer.MALEVOLENT_MASQUERADE, 400);
            break;
        case 7:
            player.getSlayer().unlock(Slayer.BROADER_FLETCHING, 300);
            break;
        case 8:
            player.getSlayer().unlock(Slayer.ANKOU_MUCH, 100);
            break;
        case 10:
            player.getSlayer().unlock(Slayer.FIRE_DARKNESS, 50);
            break;
        case 11:
            player.getSlayer().unlock(Slayer.PEDAL_METAL, 100);
            break;
        case 13:
            player.getSlayer().unlock(Slayer.AUGMENT_ABBIES, 100);
            break;
        case 14:
            player.getSlayer().unlock(Slayer.DARK_HERE, 100);
            break;
        case 15:
            player.getSlayer().unlock(Slayer.GREATER_CHALLENGE, 100);
            break;
        case 16:
            player.getSlayer().unlock(Slayer.MITH_ME, 80);
            break;
        case 17:
            player.getSlayer().unlock(Slayer.WATCH_BIRDIE, 80);
            break;
        case 18:
            player.getSlayer().unlock(Slayer.HOT_STUFF, 100);
            break;
        case 19:
            player.getSlayer().unlock(Slayer.LIKE_A_BOSS, 200);
            break;
        case 20:
            player.getSlayer().unlock(Slayer.BLEED_DRY, 75);
            break;
        case 21:
            player.getSlayer().unlock(Slayer.SMELL_LATER, 100);
            break;
        case 22:
            player.getSlayer().unlock(Slayer.BIRDS_FEATHER, 100);
            break;
        case 23:
            player.getSlayer().unlock(Slayer.MITH_YOU, 120);
            break;
        case 24:
            player.getSlayer().unlock(Slayer.HORRORIFIC, 100);
            break;
        case 25:
            player.getSlayer().unlock(Slayer.DUST_RETURN, 100);
            break;
        case 26:
            player.getSlayer().unlock(Slayer.WYVERNOTHER_ONE, 100);
            break;
        case 27:
            player.getSlayer().unlock(Slayer.GET_SMASHED, 100);
            break;
        case 28:
            player.getSlayer().unlock(Slayer.NECHS_PLEASE, 100);
            break;
        case 29:
            player.getSlayer().unlock(Slayer.KRACK_ON, 100);
            break;
        case 30:
            player.getSlayer().unlock(Slayer.REPTILE_RIPPED, 75);
            break;
        case 31:
            player.getSlayer().unlock(Slayer.KING_BLACK_BONNET, 1000);
            break;
        case 32:
            player.getSlayer().unlock(Slayer.KALPHITE_KHAT, 1000);
            break;
        case 33:
            player.getSlayer().unlock(Slayer.UNHOLY_HELMET, 1000);
            break;
        case 34:
            player.getSlayer().unlock(Slayer.SEEING_RED, 50);
            break;
        case 35:
            player.getSlayer().unlock(Slayer.BIGGER_BADDER, 150);
            break;
        case 37:
            player.getSlayer().unlock(Slayer.DULY_NOTED, 200);
            break;
        case 38:
            player.getSlayer().unlock(Slayer.DARK_MANTLE, 1000);
            break;
        case 39:
            player.getSlayer().unlock(Slayer.WYVERNOTHER_TWO, 100);
            break;
        case 40:
            player.getSlayer().unlock(Slayer.ADAMIND_SOME_MORE, 100);
            break;
        case 41:
            player.getSlayer().unlock(Slayer.RUUUUUNE, 100);
            break;
        case 42:
            player.getSlayer().unlock(Slayer.UNDEAD_HEAD, 1000);
            break;
        case 44:
            player.getSlayer().unlock(Slayer.DOUBLE_TROUBLE, 500);
            break;
        case 45:
            player.getSlayer().unlock(Slayer.USE_MORE_HEAD, 1000);
            break;
        case 46:
            player.getSlayer().cancelTask();
            break;
        case 47:
            player.getSlayer().blockTask();
            break;
        case 48:
        case 49:
        case 50:
        case 51:
        case 52:
        case 53:
            player.getSlayer().unblockTask(slot - 48);
            break;
        }
        break;
    case 23:
        if (itemID == ItemID.BROAD_BOLTS) {
            if (index == 1) {
                player.getSlayer().buy(new Item(itemID, 250), 35);
            } else if (index == 2) {
                player.getSlayer().buy(new Item(itemID, 1250), 175);
            } else if (index == 3) {
                player.getSlayer().buy(new Item(itemID, 2500), 350);
            }
        } else if (itemID == ItemID.RUNE_POUCH) {
            if (index == 1) {
                player.getSlayer().buy(new Item(itemID, 1), 1250);
            }
        } else {
            player.getGameEncoder().sendMessage("This item can't be purchased.");
        }
        break;
    }
}

DecodedPacketWidget.prototype.widget_68 = function(player, index, childID, slot, itemID) {
    // Partner
    if (player.isLocked()) {
        return;
    }
    if (childID != 7) {
        return;
    }
    if (player.getAttribute("clan_chat_usernames") != null) {
        var groupMap = player.canUpdateGroupIronman();
        if (groupMap == null) {
            return;
        }
        if (player.getGroupIronmanUsernames().contains("<col=ff0000>")) {
            player.openDialogue("clanchat", 1);
            return;
        }
        for each (var username in groupMap.values()) {
            var player2 = player.getWorld().getPlayerByUsername(username);
            player2.setGroupIronman(groupMap);
            player2.getGameEncoder().sendMessage("Your ironman group has been updated.");
        }
        player.getWidgetManager().removeInteractiveWidgets();
    } else {
        player.getGameEncoder().sendMessage("No action associated with this click, please reload the interface.");
    }
}
