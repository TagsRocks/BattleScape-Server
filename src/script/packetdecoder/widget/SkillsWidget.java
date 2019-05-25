package script.packetdecoder.widget;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import com.palidino.osrs.model.player.WidgetManager;

public class SkillsWidget {
    public static void widget320(Player player, int index, int childID, int slot, int itemID) {
        // Tab
        if (player.isLocked()) {
            return;
        }
        int guideID = -1;
        switch (childID) {
        case 1:
            guideID = Skills.ATTACK;
            break;
        case 2:
            guideID = Skills.STRENGTH;
            break;
        case 3:
            guideID = Skills.DEFENCE;
            break;
        case 4:
            guideID = Skills.RANGED;
            break;
        case 5:
            guideID = Skills.PRAYER;
            break;
        case 6:
            guideID = Skills.MAGIC;
            break;
        case 7:
            guideID = Skills.RUNECRAFTING;
            break;
        case 8:
            guideID = Skills.CONSTRUCTION;
            break;
        case 9:
            guideID = Skills.HITPOINTS;
            break;
        case 10:
            guideID = Skills.AGILITY;
            break;
        case 11:
            guideID = Skills.HERBLORE;
            break;
        case 12:
            guideID = Skills.THIEVING;
            break;
        case 13:
            guideID = Skills.CRAFTING;
            break;
        case 14:
            guideID = Skills.FLETCHING;
            break;
        case 15:
            guideID = Skills.SLAYER;
            break;
        case 16:
            guideID = Skills.HUNTER;
            break;
        case 17:
            guideID = Skills.MINING;
            break;
        case 18:
            guideID = Skills.SMITHING;
            break;
        case 19:
            guideID = Skills.FISHING;
            break;
        case 20:
            guideID = Skills.COOKING;
            break;
        case 21:
            guideID = Skills.FIREMAKING;
            break;
        case 22:
            guideID = Skills.WOODCUTTING;
            break;
        case 23:
            guideID = Skills.FARMING;
            break;
        }
        if (guideID != -1) {
            player.getWidgetManager().removeInteractiveWidgets();
            player.getWidgetManager().sendInteractiveOverlay(WidgetID.SKILL_GUIDE, new WidgetManager.CloseEvent() {
                @Override
                public void execute() {
                    player.removeAttribute("skill_guide_id");
                }
            });
            player.getGameEncoder().sendWidgetSettings(WidgetID.SKILL_GUIDE, 8, 0, 99, 0);
            player.getGameEncoder().setVarp(965, Skills.GUIDE_CONFIGS[guideID][0]);
            player.putAttribute("skill_guide_id", guideID);
            if (guideID < player.getSkills().getXPLocks().length) {
                if (Main.isSpawn()) {
                    player.openDialogue("xplock", guideID + 7);
                } else {
                    player.openDialogue("xplock", guideID);
                }
            }
        }
    }

    public static void widget214(Player player, int index, int childID, int slot, int itemID) {
        // Guide
        if (player.isLocked()) {
            return;
        }
        if (childID >= 11 && childID <= 24) {
            int guideID = player.getAttributeInt("skill_guide_id");
            int guideIndex = childID - 11;
            if (guideIndex >= Skills.GUIDE_CONFIGS[guideID].length) {
                return;
            }
            player.getGameEncoder().setVarp(965, Skills.GUIDE_CONFIGS[guideID][guideIndex]);
        }
    }
}

