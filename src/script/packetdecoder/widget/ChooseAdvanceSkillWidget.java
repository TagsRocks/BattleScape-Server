package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.VarpID;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import com.palidino.util.Utils;

public class ChooseAdvanceSkillWidget {
    public static void widget134(Player player, int index, int childID, int slot, int itemID) {
        if (player.isLocked()) {
            return;
        }
        int[] skillOrder = new int[] {
            Skills.ATTACK, Skills.STRENGTH, Skills.RANGED, Skills.MAGIC, Skills.DEFENCE, Skills.HITPOINTS,
            Skills.PRAYER, Skills.AGILITY, Skills.HERBLORE, Skills.THIEVING, Skills.CRAFTING, Skills.RUNECRAFTING,
            Skills.MINING, Skills.SMITHING, Skills.FISHING, Skills.COOKING, Skills.FIREMAKING, Skills.WOODCUTTING,
            Skills.FLETCHING, Skills.SLAYER, Skills.FARMING, Skills.CONSTRUCTION, Skills.HUNTER
        };
        if (childID - 3 >= 0 && childID - 3 < skillOrder.length) {
            int skillID = skillOrder[childID - 3];
            if (skillID == Skills.CONSTRUCTION) {
                return;
            }
            player.putAttribute("choose_skill_id", skillID);
            player.getGameEncoder().setVarp(VarpID.CHOOSE_ADVANCE_SKILL, childID - 2);
            int xpMultipler =
                    player.getSkills().getXPMultipler(skillID) * player.getAttributeInt("choose_xp_multiplier");
            if (xpMultipler == 0) {
                xpMultipler = 1;
            }
            int xp = player.getAttributeInt("choose_fixed_xp");
            if (player.getAttributeInt("choose_skill_level_multiplier_" + skillID) > 0) {
                xp = player.getController().getLevelForXP(skillID)
                        * player.getAttributeInt("choose_skill_level_multiplier_" + skillID);
            } else if (player.getAttributeInt("choose_skill_level_multiplier") > 0) {
                xp = player.getController().getLevelForXP(skillID)
                        * player.getAttributeInt("choose_skill_level_multiplier");
            }
            xp *= xpMultipler;
            player.getGameEncoder().sendWidgetText(WidgetID.CHOOSE_ADVANCE_SKILL, 2,
                    "Choose the stat you wish to be advanced!<br>Experience that will be given: "
                            + Utils.formatNumber(xp));
        } else if (childID == 26) {
            int skillID = player.getAttributeInt("choose_skill_id");
            int minLevel = player.getAttributeInt("choose_min_level");
            if (minLevel > 1 && player.getController().getLevelForXP(skillID) < minLevel) {
                player.getGameEncoder().sendMessage("You need a minimum level of " + minLevel + " to do this.");
                return;
            }
            int xpMultipler =
                    player.getSkills().getXPMultipler(skillID) * player.getAttributeInt("choose_xp_multiplier");
            if (xpMultipler == 0) {
                xpMultipler = 1;
            }
            int xp = player.getAttributeInt("choose_fixed_xp");
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
}

