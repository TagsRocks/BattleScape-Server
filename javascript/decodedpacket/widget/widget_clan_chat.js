DecodedPacketWidget.prototype.widget_7 = function(player, index, childID, slot, itemID) {
    // Tab
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 23:
        if (player.isGameModeGroupIronman()) {
            player.openDialogue("clanchat", 0);
        } else {
            player.getMessaging().openClanSettingsInterface();
        }
        break;
    }
}

DecodedPacketWidget.prototype.widget_94 = function(player, index, childID, slot, itemID) {
    // Settings
    if (player.isLocked()) {
        return;
    }
    var settingValue = 0;
    switch (childID) {
    case 10:
        if (index == 0) {
            player.getGameEncoder().sendEnterString("Enter chat prefix:", new ValueEntered.StringEvent() {
                execute: function(value) {
                    player.getMessaging().sendClanSetupName(value);
                    RequestManager.getInstance().addClanSetting(player, Clan.NAME, value);
                    if (player.getMessaging().getClanChatDisabled()) {
                        player.getMessaging().setClanChatDisabled(false);
                        RequestManager.getInstance().addClanSetting(player, Clan.DISABLE, 0);
                    }
                }
            });
        } else if (index == 1) {
            var disabled = !player.getMessaging().getClanChatDisabled();
            player.getMessaging().setClanChatDisabled(disabled);
            var name = player.getMessaging().getMyClanChatName();
            if (disabled) {
                name = Clan.DISABLED_NAME;
            }
            player.getMessaging().sendClanSetupName(name);
            RequestManager.getInstance().addClanSetting(player, Clan.DISABLE,
                    player.getMessaging().getClanChatDisabled() ? 1 : 0);
        }
        break;
    case 13:
        if (index == 0) {
            settingValue = Clan.ANYONE;
        } else if (index == 1) {
            settingValue = Clan.ANY_FRIENDS;
        } else if (index == 2) {
            settingValue = Clan.RECRUIT;
        } else if (index == 3) {
            settingValue = Clan.CORPORAL;
        } else if (index == 4) {
            settingValue = Clan.SERGEANT;
        } else if (index == 5) {
            settingValue = Clan.LIEUTENANT;
        } else if (index == 6) {
            settingValue = Clan.CAPTAIN;
        } else if (index == 7) {
            settingValue = Clan.GENERAL;
        } else if (index == 8) {
            settingValue = Clan.ONLY_ME;
        }
        player.getMessaging().sendClanSetupEnterLimit(settingValue);
        RequestManager.getInstance().addClanSetting(player, Clan.ENTER_LIMIT, settingValue);
        break;
    case 16:
        if (index == 0) {
            settingValue = Clan.ANYONE;
        } else if (index == 1) {
            settingValue = Clan.ANY_FRIENDS;
        } else if (index == 2) {
            settingValue = Clan.RECRUIT;
        } else if (index == 3) {
            settingValue = Clan.CORPORAL;
        } else if (index == 4) {
            settingValue = Clan.SERGEANT;
        } else if (index == 5) {
            settingValue = Clan.LIEUTENANT;
        } else if (index == 6) {
            settingValue = Clan.CAPTAIN;
        } else if (index == 7) {
            settingValue = Clan.GENERAL;
        } else if (index == 8) {
            settingValue = Clan.ONLY_ME;
        }
        player.getMessaging().sendClanSetupTalkLimit(settingValue);
        RequestManager.getInstance().addClanSetting(player, Clan.TALK_LIMIT, settingValue);
        break;
    case 19:
        if (index == 3) {
            settingValue = Clan.CORPORAL;
        } else if (index == 4) {
            settingValue = Clan.SERGEANT;
        } else if (index == 5) {
            settingValue = Clan.LIEUTENANT;
        } else if (index == 6) {
            settingValue = Clan.CAPTAIN;
        } else if (index == 7) {
            settingValue = Clan.GENERAL;
        } else if (index == 8) {
            settingValue = Clan.ONLY_ME;
        }
        player.getMessaging().sendClanSetupKickLimit(settingValue);
        RequestManager.getInstance().addClanSetting(player, Clan.KICK_LIMIT, settingValue);
        break;
    }
}
