var entries = new ArrayList();
var title = "";
var lines = new ArrayList();
var actions = new ArrayList();

title = "273,742 XP (Level 60); 91,248 HP XP";
lines.add("Attack");
actions.add("close|script");
lines.add("Strength");
actions.add("close|script");
lines.add("Ranged");
actions.add("close|script");
lines.add("Magic");
actions.add("close|script");
lines.add("Defence");
actions.add("close|script");
var obj0 = new DialogueEntry();
entries.add(obj0);
obj0.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Level 99";
lines.add("Attack");
actions.add("close|script");
lines.add("Strength");
actions.add("close|script");
lines.add("Ranged");
actions.add("close|script");
lines.add("Magic");
actions.add("close|script");
lines.add("Next Options");
actions.add("dialogue=combatlamp,2");
var obj1 = new DialogueEntry();
entries.add(obj1);
obj1.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Level 99";
lines.add("Defence");
actions.add("close|script");
lines.add("Hitpoints");
actions.add("close|script");
lines.add("Prayer");
actions.add("close|script");
lines.add("Previous Option");
actions.add("dialogue=combatlamp,1");
var obj2 = new DialogueEntry();
entries.add(obj2);
obj2.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Prayer";
lines.add("Level 25");
actions.add("close|script");
lines.add("Level 34");
actions.add("close|script");
lines.add("Level 43");
actions.add("close|script");
lines.add("Level 45");
actions.add("close|script");
lines.add("Level 52");
actions.add("close|script");
var obj3 = new DialogueEntry();
entries.add(obj3);
obj3.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Level 99; (XP Rem. / 3) HP XP";
lines.add("Attack");
actions.add("close|script");
lines.add("Strength");
actions.add("close|script");
lines.add("Ranged");
actions.add("close|script");
lines.add("Magic");
actions.add("close|script");
lines.add("Defence");
actions.add("close|script");
var obj4 = new DialogueEntry();
entries.add(obj4);
obj4.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

instance = new DialogueScript() {
    execute: function(player, index, childID, slot) {
        if (player.isLocked()) {
            return;
        }
        if (index == 0) {
            var skillID = -1;
            if (slot == 0) {
                skillID = Skills.ATTACK;
            } else if (slot == 1) {
                skillID = Skills.STRENGTH;
            } else if (slot == 2) {
                skillID = Skills.RANGED;
            } else if (slot == 3) {
                skillID = Skills.MAGIC;
            } else if (slot == 4) {
                skillID = Skills.DEFENCE;
            }
            if (skillID == -1) {
                return;
            }
            if (!player.getInventory().hasItem(10586)) {
                return;
            }
            if (player.getController().getLevelForXP(skillID) == 99) {
                player.getGameEncoder().sendMessage("You can't use this on a level 99 skill.");
                return;
            }
            player.getInventory().deleteItem(10586, 1);
            player.getSkills().addXP(skillID, 273742, false);
            player.getSkills().addXP(Skills.HITPOINTS, 91248, false);
        } else if (index == 1 || index == 2) {
            var skillID = -1;
            if (index == 1) {
                if (slot == 0) {
                    skillID = Skills.ATTACK;
                } else if (slot == 1) {
                    skillID = Skills.STRENGTH;
                } else if (slot == 2) {
                    skillID = Skills.RANGED;
                } else if (slot == 3) {
                    skillID = Skills.MAGIC;
                }
            } else if (index == 2) {
                if (slot == 0) {
                    skillID = Skills.DEFENCE;
                } else if (slot == 1) {
                    skillID = Skills.HITPOINTS;
                } else if (slot == 2) {
                    skillID = Skills.PRAYER;
                }
            }
            if (skillID == -1) {
                return;
            }
            if (!player.getInventory().hasItem(9656) && !player.getInventory().hasItem(9657)
                    && !player.getInventory().hasItem(9658)) {
                return;
            }
            if (player.getController().getLevelForXP(skillID) == 99) {
                player.getGameEncoder().sendMessage("Your " + Skills.SKILL_NAMES[skillID] + " level is already 99.");
                return;
            }
            var xp = Skills.XP_TABLE[99] - player.getSkills().getXP(skillID);
            if (player.getInventory().hasItem(9656)) {
                player.getInventory().deleteItem(9656, 1);
                player.getInventory().addItem(9657, 1);
            } else if (player.getInventory().hasItem(9657)) {
                player.getInventory().deleteItem(9657, 1);
                player.getInventory().addItem(9658, 1);
            } else if (player.getInventory().hasItem(9658)) {
                player.getInventory().deleteItem(9658, 1);
            }
            player.getSkills().addXP(skillID, xp, false);
        } else if (index == 3) {
            var level = -1;
            if (slot == 0) {
                level = 25;
            } else if (slot == 1) {
                level = 34;
            } else if (slot == 2) {
                level = 43;
            } else if (slot == 3) {
                level = 45;
            } else if (slot == 4) {
                level = 52;
            }
            if (level == -1) {
                return;
            }
            if (!player.getInventory().hasItem(10889)) {
                return;
            }
            if (player.getController().getLevelForXP(Skills.PRAYER) == 99) {
                player.getGameEncoder().sendMessage("You can't use this on level 99 Prayer.");
                return;
            }
            player.getInventory().deleteItem(10889, 1);
            player.getSkills().addXP(Skills.PRAYER, Skills.XP_TABLE[level], false);
        } else if (index == 4) {
            var skillID = -1;
            if (index == 4) {
                if (slot == 0) {
                    skillID = Skills.ATTACK;
                } else if (slot == 1) {
                    skillID = Skills.STRENGTH;
                } else if (slot == 2) {
                    skillID = Skills.RANGED;
                } else if (slot == 3) {
                    skillID = Skills.MAGIC;
                } else if (slot == 3) {
                    skillID = Skills.DEFENCE;
                }
            }
            if (skillID == -1) {
                return;
            }
            if (!player.getInventory().hasItem(4447)) {
                return;
            }
            if (player.getController().getLevelForXP(skillID) == 99) {
                player.getGameEncoder().sendMessage("Your " + Skills.SKILL_NAMES[skillID] + " level is already 99.");
                return;
            }
            var xp = Skills.XP_TABLE[99] - player.getSkills().getXP(skillID);
            var hitpointsXP = xp / 3;
            player.getInventory().deleteItem(4447, 1);
            player.getSkills().addXP(skillID, xp, false);
            player.getSkills().addXP(Skills.HITPOINTS, hitpointsXP, false);
        }
    },

    getDialogueEntries: function() {
        return entries;
    }
}
