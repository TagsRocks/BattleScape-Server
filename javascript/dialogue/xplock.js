var entries = new ArrayList();
var title = "";
var lines = new ArrayList();
var continueLine = "";
var actions = new ArrayList();

title = "Select an Option";
lines.add("Attack");
actions.add("close|script");
lines.add("Strength");
actions.add("close|script");
lines.add("Defence");
actions.add("close|script");
lines.add("Ranged");
actions.add("close|script");
lines.add("Magic");
actions.add("close|script");
lines.add("Prayer");
actions.add("close|script");
var obj0 = new DialogueEntry();
entries.add(obj0);
obj0.setLargeSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

for (var i = 0; i < 7; i++) { // 1-7
    title = "Select an Option";
    lines.add("Normal XP");
    actions.add("close|script");
    lines.add("RS XP");
    actions.add("close|script");
    if (i != Skills.HITPOINTS) {
        lines.add("XP Disabled");
        actions.add("close|script");
        lines.add("Reset Level");
        actions.add("close|script");
    }
    var obj = new DialogueEntry();
    entries.add(obj);
    obj.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));
}

for (var i = 0; i < 7; i++) { // 8-14
    title = "Select an Option";
    lines.add("Normal XP");
    actions.add("close|script");
    lines.add("RS XP");
    actions.add("close|script");
    if (i != Skills.HITPOINTS) {
        lines.add("XP Disabled");
        actions.add("close|script");
    }
    lines.add("Set Level");
    actions.add("close|script");
    var obj = new DialogueEntry();
    entries.add(obj);
    obj.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));
}

lines.add("<col=ff0000>WARNING</col>: Setting a level HIGHER than x will reduce drop rates by 25%. This can be undone at any time by lowering the level back down to x.");
continueLine = "Click here to continue";
actions.add("close|script");
var obj15 = new DialogueEntry();
entries.add(obj15);
obj15.setTextContinue(continueLine, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Reset All Combat Levels?";
lines.add("Yes");
actions.add("close|script");
lines.add("Nevermind");
actions.add("close");
var obj16 = new DialogueEntry();
entries.add(obj16);
obj16.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

instance = new DialogueScript() {
    execute: function(player, index, childID, slot) {
        if (player.isLocked()) {
            return;
        }
        if (index == 0) {
            var skillID = Skills.ATTACK
            if (slot == 1) {
                skillID = Skills.STRENGTH;
            } else if (slot == 2) {
                skillID = Skills.DEFENCE;
            } else if (slot == 3) {
                skillID = Skills.RANGED;
            } else if (slot == 4) {
                skillID = Skills.MAGIC;
            } else if (slot == 5) {
                skillID = Skills.PRAYER;
            }
            if (player.isGameModeNormal()) {
                player.openDialogue("xplock", skillID + 8);
            } else {
                player.openDialogue("xplock", skillID + 1);
            }
        }
        if (index >= 1 && index <= 7) {
            index -= 1;
            if (slot == 0) {
                player.getSkills().setXPLock(index, Skills.NORMAL_XP);
                player.getGameEncoder().sendMessage(Skills.SKILL_NAMES[index] + " XP rate normal.");
            } else if (slot == 1) {
                player.getSkills().setXPLock(index, Skills.X1_XP);
                player.getGameEncoder().sendMessage(Skills.SKILL_NAMES[index] + " XP rate x1.");
            } else if (slot == 2) {
                player.getSkills().setXPLock(index, Skills.DISABLED_XP);
                player.getGameEncoder().sendMessage(Skills.SKILL_NAMES[index] + " XP rate disabled.");
            } else if (slot == 3) {
                if (player.getSkills().getXP(index) > Skills.XP_TABLE[10] && index != Skills.DEFENCE
                        || player.getController().getLevelForXP(index) == 1) {
                    player.getGameEncoder().sendMessage("You can't reset this stat.");
                    return;
                } else if (player.getInventory().getCount(ItemID.COINS) < 500000) {
                    player.getGameEncoder().sendMessage("You need 500K coins to do this.");
                    return;
                } else if (player.getBank().needsPinInput(false)) {
                    return;
                }
                if (player.getSkills().changeCombatXP(index, 1)) {
                    player.getInventory().deleteItem(ItemID.COINS, 500000);
                }
            }
        } else if (index >= 8 && index <= 14) {
            index -= 8;
            if (slot == 0) {
                player.getSkills().setXPLock(index, Skills.NORMAL_XP);
                player.getGameEncoder().sendMessage(Skills.SKILL_NAMES[index] + " XP rate normal.");
            } else if (slot == 1) {
                player.getSkills().setXPLock(index, Skills.X1_XP);
                player.getGameEncoder().sendMessage(Skills.SKILL_NAMES[index] + " XP rate x1.");
            } else if (slot == 2 && index != Skills.HITPOINTS) {
                player.getSkills().setXPLock(index, Skills.DISABLED_XP);
                player.getGameEncoder().sendMessage(Skills.SKILL_NAMES[index] + " XP rate disabled.");
            } else if (slot == 2 && index == Skills.HITPOINTS || slot == 3 && index != Skills.HITPOINTS) {
                if (player.getBank().needsPinInput(false)) {
                    return;
                }
                if (player.getSkills().withinCombatLevelsAchieved()
                        && player.getSkills().getCombatLevelsAchieved()[index] != 99) {
                    player.openDialogue("xplock", 15);
                    Dialogue.setText(player, null, "<col=ff0000>WARNING</col>: Setting a level HIGHER than <b>"
                            + player.getSkills().getCombatLevelsAchieved()[index]
                            + "</b> will reduce drop rates by 25%. This can be undone at any time by lowering the level back down to "
                            + player.getSkills().getCombatLevelsAchieved()[index] + ".");
                    player.putAttribute("change_skill", index);
                    return;
                }
                player.getGameEncoder().sendEnterAmount(new ValueEntered.IntegerEvent() {
                    execute: function(value) {
                        player.getSkills().changeCombatXP(index, value);
                        if (player.getController().getLevelForXP(index)
                                > player.getSkills().getCombatLevelsAchieved()[index]) {
                            player.getGameEncoder().sendMessage("You have received a 25% PvM drop rate penalty because you have not manually trained "
                                    + Skills.SKILL_NAMES[index] + " to level " + value + ".");
                            player.getGameEncoder().sendMessage("To remove this penalty, set your "
                                    + Skills.SKILL_NAMES[index] + " to level "
                                    + player.getSkills().getCombatLevelsAchieved()[index]
                                    + " or lower and manually train it.");
                        }
                    }
                });
            }
        } else if (index == 15) {
            index = player.getAttributeInt("change_skill");
            player.getGameEncoder().sendEnterAmount(new ValueEntered.IntegerEvent() {
                execute: function(value) {
                    player.getSkills().changeCombatXP(index, value);
                    if (player.getController().getLevelForXP(index)
                            > player.getSkills().getCombatLevelsAchieved()[index]) {
                        player.getGameEncoder().sendMessage("You have received a 25% PvM drop rate penalty because you have not manually trained "
                                + Skills.SKILL_NAMES[index] + " to level " + value + ".");
                        player.getGameEncoder().sendMessage("To remove this penalty, set your "
                                + Skills.SKILL_NAMES[index] + " to level "
                                + player.getSkills().getCombatLevelsAchieved()[index]
                                + " or lower and manually train it.");
                    }
                }
            });
        } else if (index == 16) {
            if (slot == 0) {
                if (player.getBank().needsPinInput(false)) {
                    return;
                }
                player.getSkills().changeCombatXP(Skills.ATTACK, 1);
                player.getSkills().changeCombatXP(Skills.DEFENCE, 1);
                player.getSkills().changeCombatXP(Skills.STRENGTH, 1);
                player.getSkills().changeCombatXP(Skills.RANGED, 1);
                player.getSkills().changeCombatXP(Skills.PRAYER, 1);
                player.getSkills().changeCombatXP(Skills.MAGIC, 1);
                player.getSkills().changeCombatXP(Skills.HITPOINTS, 10);
            }
        }
    },

    getDialogueEntries: function() {
        return entries;
    }
}
