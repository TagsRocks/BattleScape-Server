DecodedPacketWidget.prototype.widget_134 = function(player, index, childID, slot, itemID) {
    if (player.isLocked()) {
        return;
    }
    var skillOrder = [
        Skills.ATTACK, Skills.STRENGTH, Skills.RANGED, Skills.MAGIC, Skills.DEFENCE, Skills.HITPOINTS,
        Skills.PRAYER, Skills.AGILITY, Skills.HERBLORE, Skills.THIEVING, Skills.CRAFTING, Skills.RUNECRAFTING,
        Skills.MINING, Skills.SMITHING, Skills.FISHING, Skills.COOKING, Skills.FIREMAKING, Skills.WOODCUTTING,
        Skills.FLETCHING, Skills.SLAYER, Skills.FARMING, Skills.CONSTRUCTION, Skills.HUNTER
    ];
    if (childID - 3 >= 0 && childID - 3 < skillOrder.length) {
        var skillID = skillOrder[childID - 3];
        if (skillID == Skills.CONSTRUCTION) {
            return;
        }
        player.putAttribute("choose_skill_id", skillID);
        player.getGameEncoder().setVarp(VarpID.CHOOSE_ADVANCE_SKILL, childID - 2);
        var xpMultipler = player.getSkills().getXPMultipler(skillID) * player.getAttribute("choose_xp_multiplier");
        if (xpMultipler == 0) {
            xpMultipler = 1;
        }
        var xp = player.getAttributeInt("choose_fixed_xp");
        if (player.getAttributeInt("choose_skill_level_multiplier_" + skillID) > 0) {
            xp = player.getController().getLevelForXP(skillID)
                    * player.getAttributeInt("choose_skill_level_multiplier_" + skillID);
        } else if (player.getAttributeInt("choose_skill_level_multiplier") > 0) {
            xp = player.getController().getLevelForXP(skillID)
                    * player.getAttributeInt("choose_skill_level_multiplier");
        }
        xp *= xpMultipler;
        player.getGameEncoder().sendWidgetText(WidgetID.CHOOSE_ADVANCE_SKILL, 2, "Choose the stat you wish to be advanced!<br>Experience that will be given: " + Utils.formatNumber(xp));
    } else if (childID == 26) {
        var skillID = player.getAttributeInt("choose_skill_id");
        var minLevel = player.getAttributeInt("choose_min_level");
        if (minLevel > 1 && player.getController().getLevelForXP(skillID) < minLevel) {
            player.getGameEncoder().sendMessage("You need a minimum level of " + minLevel + " to do this.");
            return;
        }
        var xpMultipler = player.getSkills().getXPMultipler(skillID) * player.getAttribute("choose_xp_multiplier");
        if (xpMultipler == 0) {
            xpMultipler = 1;
        }
        var xp = player.getAttributeInt("choose_fixed_xp");
        if (player.getAttributeInt("choose_skill_level_multiplier_" + skillID) > 0) {
            xp = player.getController().getLevelForXP(skillID)
                    * player.getAttributeInt("choose_skill_level_multiplier_" + skillID);
        } else if (player.getAttributeInt("choose_skill_level_multiplier") > 0) {
            xp = player.getController().getLevelForXP(skillID)
                    * player.getAttributeInt("choose_skill_level_multiplier");
        }
        xp *= xpMultipler;
        player.getSkills().addXP(skillID, xp, false);
        player.getInventory().deleteItem(player.getAttributeInt("choose_item_id"), 1);
        player.getWidgetManager().removeInteractiveWidgets();
    }
}
