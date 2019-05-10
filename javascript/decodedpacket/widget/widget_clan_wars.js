DecodedPacketWidget.prototype.widget_91 = function(player, index, childID, slot, itemID) {
    // Clan Wars 1
    if (player.isLocked()) {
        return;
    }
    var ruleBySlot = null;
    switch (childID) {
    case 27:
        player.getClanWars().acceptRuleSelection();
        break;
    case 6:
        if (slot >= 24) {
            player.getClanWars().setVarp92();
            player.getGameEncoder().sendMessage("This option is currently disabled.");
            break;
        }
        player.getClanWars().changeRule(ClanWars.Rule.GAME_END, slot / 3);
        break;
    case 10:
        var mapID = slot / 3;
        if (ClanWars.Arena.get(mapID) == null || ClanWars.Arena.get(mapID).arenaTop.getX() == 0) {
            player.getClanWars().setVarp92();
            player.getGameEncoder().sendMessage("This option is currently disabled.");
            break;
        }
        player.getClanWars().changeRule(ClanWars.Rule.ARENA, slot / 3);
        break;
    case 14:
        ruleBySlot = ClanWars.Rule.STRAGGLERS;
        break;
    case 17:
        var rule = null;
        if (slot == 0) {
            rule = ClanWars.Rule.IGNORE_FREEZING;
        } else if (slot == 3) {
            rule = ClanWars.Rule.PJ_TIMER;
        } else if (slot == 6) {
            rule = ClanWars.Rule.SINGLE_SPELLS;
        } else if (slot == 9) {
            rule = ClanWars.Rule.ALLOW_TRIDENT_IN_PVP;
        }
        if (rule != null) {
            if (player.getClanWars().ruleSelected(rule, ClanWars.RuleOption.DISABLED)) {
                player.getClanWars().changeRule(rule, ClanWars.RuleOption.ALLOWED);
            } else {
                player.getClanWars().changeRule(rule, ClanWars.RuleOption.DISABLED);
            }
        }
        break;
    case 19:
        ruleBySlot = ClanWars.Rule.MELEE;
        break;
    case 20:
        ruleBySlot = ClanWars.Rule.RANGING;
        break;
    case 21:
        ruleBySlot = ClanWars.Rule.MAGIC;
        break;
    case 22:
        ruleBySlot = ClanWars.Rule.PRAYER;
        break;
    case 23:
        ruleBySlot = ClanWars.Rule.FOOD;
        break;
    case 24:
        ruleBySlot = ClanWars.Rule.DRINKS;
        break;
    case 25:
        ruleBySlot = ClanWars.Rule.SPECIAL_ATTACKS;
        break;
    }
    if (ruleBySlot != null) {
        player.getClanWars().changeRule(ruleBySlot, slot / 3 - 1);
    }
}

DecodedPacketWidget.prototype.widget_92 = function(player, index, childID, slot, itemID) {
    // Clan Wars 2
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 6:
        player.getClanWars().acceptRuleConfirmation();
        break;
    }
}
