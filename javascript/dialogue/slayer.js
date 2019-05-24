var entries = new ArrayList();
var title = "";
var lines = new ArrayList();
var actions = new ArrayList();

title = "Select an Option";
lines.add("Get Task");
actions.add("dialogue=slayer,1");
lines.add("Current Task");
actions.add("close|script");
lines.add("Get Boss Slayer Task");
actions.add("close|script");
lines.add("Cancel Boss Slayer Task");
actions.add("dialogue=slayer,8");
var obj0 = new DialogueEntry();
entries.add(obj0);
obj0.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Mazchna - Level 20");
actions.add("close|script");
lines.add("Chaeldar - Level 70");
actions.add("close|script");
lines.add("Nieve - Level 85");
actions.add("close|script");
lines.add("Duradel - Level 100");
actions.add("close|script");
lines.add("Krystilia - Wilderness Only");
actions.add("close|script");
var obj1 = new DialogueEntry();
entries.add(obj1);
obj1.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Current Task");
actions.add("close|script");
lines.add("Consecutive and Total Tasks");
actions.add("close|script");
lines.add("Slayer Points");
actions.add("close|script");
var obj2 = new DialogueEntry();
entries.add(obj2);
obj2.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Reset All Saved Kill Counts");
actions.add("close|script");
lines.add("Nevermind");
actions.add("close");
var obj3 = new DialogueEntry();
entries.add(obj3);
obj3.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Slayer Rewards");
actions.add("close|script");
lines.add("Boss Slayer Rewards");
actions.add("close|script");
var obj4 = new DialogueEntry();
entries.add(obj4);
obj4.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Teleport to Task");
actions.add("close|script");
lines.add("Charge Bone Noting");
actions.add("dialogue=slayer,7");
lines.add("Toggle Bone Noting");
actions.add("close|script");
var obj5 = new DialogueEntry();
entries.add(obj5);
obj5.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Location One");
actions.add("close|script");
lines.add("Location Two");
actions.add("close|script");
lines.add("Location Three");
actions.add("close|script");
lines.add("Location Four");
actions.add("close|script");
lines.add("Location Five");
actions.add("close|script");
var obj6 = new DialogueEntry();
entries.add(obj6);
obj6.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Bone Noting: 250 Slayer Points for 2,000 Charges");
actions.add("close|script");
lines.add("Nevermind");
actions.add("close");
var obj7 = new DialogueEntry();
entries.add(obj7);
obj7.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Pay 500K and 2 Vote Tickets to Cancel Boss Task");
actions.add("close|script");
lines.add("Nevermind");
actions.add("close");
var obj8 = new DialogueEntry();
entries.add(obj8);
obj8.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Get Task");
actions.add("close|script");
lines.add("Current Task");
actions.add("close|script");
lines.add("Cancel Task (30 Points)");
actions.add("close|script");
var obj9 = new DialogueEntry();
entries.add(obj9);
obj9.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

instance = new DialogueScript() {
    execute: function(player, index, childID, slot) {
        if (player.isLocked()) {
            return;
        }
        if (index == 0) {
            if (slot == 1) {
                player.getSlayer().sendTask();
            } else if (slot == 2) {
                SlayerMaster.setBossAssignment(player);
            }
        } else if (index == 1) {
            if (slot == 0) {
                SlayerMaster.setAssignment(player, "mazchna");
            } else if (slot == 1) {
                SlayerMaster.setAssignment(player, "chaeldar");
            } else if (slot == 2) {
                SlayerMaster.setAssignment(player, "nieve");
            } else if (slot == 3) {
                SlayerMaster.setAssignment(player, "duradel");
            } else if (slot == 4) {
                player.getGameEncoder().sendMessage("Please speak to krystilia for a wilderness task.");
            }
        } else if (index == 2) {
            if (slot == 0) {
                player.getSlayer().sendTask();
            } else if (slot == 1) {
                var consecutiveTasks = player.getSlayer().getConsecutiveTasks();
                player.getGameEncoder().sendMessage("You have completed " + consecutiveTasks + " tasks in a row.");
                var totalTasks = player.getSlayer().getTotalTasks();
                player.getGameEncoder().sendMessage("You have completed " + totalTasks + " tasks in total.");
            } else if (slot == 2) {
                var slayerPoints = player.getSlayer().getPoints();
                player.getGameEncoder().sendMessage("You have " + slayerPoints + " Slayer points.");
            }
        } else if (index == 3) {
            if (slot == 0) {
                if (player.getBank().needsPinInput(false)) {
                    return;
                }
                player.getCombat().getBarrows().setTotalCompleted(0);
                player.getCombat().getBarrows().setTotalKeys(0);
                player.getCombat().clearNPCKillCounts();
                player.getGameEncoder().sendMessage("All of your kill counts have reset.");
            }
        } else if (index == 4) {
            if (slot == 0) {
                player.getSlayer().openRewards();
            } else if (slot == 1) {
                player.openShop("boss_slayer");
            }
        } else if (index == 5) {
            if (slot == 0) {
                if (player.getSlayer().getTaskAmount() == 0) {
                    player.getGameEncoder().sendMessage("You need a Slayer task to do this.");
                    return;
                }
                var slayerMaster = SlayerMaster.getSlayerMaster(player.getSlayer().getTaskMaster());
                if (slayerMaster == null) {
                    player.getGameEncoder().sendMessage("Unable to locate your Slayer Master.");
                    return;
                }
                var teleports = slayerMaster.getTaskTeleports(player.getSlayer().getTaskConfig());
                if (teleports == null) {
                    player.getGameEncoder().sendMessage("There are no teleports associated with this task.");
                    return;
                }
                var locs = "";
                for each (var teleport in teleports) {
                    locs += teleport.getName() + "|";
                }
                if (teleports.length == 1) {
                    locs += "Nevermind|";
                }
                locs = locs.substring(0, locs.length() - 1);
                player.openDialogue("slayer", 6);
                player.getGameEncoder().sendScript(58, locs, "Select an Option");
            } else if (slot == 2) {
                player.getCharges().setSlayerRingBoneNoting(!player.getCharges().getSlayerRingBoneNoting());
                player.getGameEncoder().sendMessage("Bone noting: " + player.getCharges().getSlayerRingBoneNoting());
            }
        } else if (index == 6) {
            if (!player.getController().canTeleport(30, true)) {
                return;
            } else if (player.getSlayer().getTaskAmount() == 0) {
                player.getGameEncoder().sendMessage("You need a Slayer task to do this.");
                return;
            }
            var slayerMaster = SlayerMaster.getSlayerMaster(player.getSlayer().getTaskMaster());
            if (slayerMaster == null) {
                player.getGameEncoder().sendMessage("Unable to locate your Slayer Master.");
                return;
            }
            var teleports = slayerMaster.getTaskTeleports(player.getSlayer().getTaskConfig());
            if (teleports == null) {
                player.getGameEncoder().sendMessage("There are no teleports associated with this task.");
                return;
            }
            if (slot >= teleports.length) {
                return;
            }
            var ringSlot = player.getAttributeInt("slayer_ring_slot");
            var ringItem = null;
            if (ringSlot >= 65536) {
                ringItem = player.getEquipment().getItem(ringSlot - 65536);
            } else {
                ringItem = player.getInventory().getItem(ringSlot);
            }
            if (ringItem == null || !(ringItem.getID() >= 11866 && ringItem.getID() <= 11873)
                    && ringItem.getID() != 21268) {
                player.getGameEncoder().sendMessage("Unable to locate your ring.");
                return;
            }
            var ringIDs = [ 11866, 11867, 11868, 11869, 11870, 11871, 11872, 11873, -1 ];
            var newRingID = -2;
            for (var i = 0; i < ringIDs.length; i++) {
                if (ringItem.getID() == ringIDs[i]) {
                    newRingID = ringIDs[i + 1];
                    break;
                }
            }
            if (newRingID != -2) {
                if (ringSlot >= 65536) {
                    player.getEquipment().setItem(ringSlot - 65536, new Item(newRingID, ringItem));
                    player.getEquipment().setUpdate(true);
                } else {
                    player.getInventory().setItem(ringSlot, new Item(newRingID, ringItem));
                    player.getInventory().setUpdate(true);
                }
            }
            player.getMovement().animatedTeleport(teleports[slot].getTile(), Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
        } else if (index == 7) {
            if (slot == 0) {
                var ringSlot = player.getAttributeInt("slayer_ring_slot");
                var ringItem = null;
                if (ringSlot >= 65536) {
                    ringItem = player.getEquipment().getItem(ringSlot - 65536);
                } else {
                    ringItem = player.getInventory().getItem(ringSlot);
                }
                if (ringItem == null || !(ringItem.getID() >= 11866 && ringItem.getID() <= 11873)
                       && ringItem.getID() != 21268) {
                    return;
                }
                var addingAmount = Math.min(player.getSlayer().getPoints(), ItemDef.getDegradeTime(11866));
                var chargeValue = 8;
                if (addingAmount < chargeValue) {
                    player.getGameEncoder().sendMessage("You don't have enough points to do this.");
                    return;
                }
                var charges = (ringItem.getAttachment() != null) ? ringItem.getAttachment() : 0;
                var newCharges = charges + (addingAmount * chargeValue);
                if (newCharges > ItemDef.getDegradeTime(11866)) {
                    addingAmount = (ItemDef.getDegradeTime(11866) - charges) / chargeValue;
                    newCharges = charges + (addingAmount * chargeValue);
                }
                if (newCharges <= 0 || newCharges == charges || newCharges > ItemDef.getDegradeTime(11866)) {
                    player.getGameEncoder().sendMessage("Your " + ringItem.getDef().getName()
                            + " is already charged.");
                    return;
                }
                ringItem.setAttachment(newCharges|0);
                player.getSlayer().setPoints(player.getSlayer().getPoints() - addingAmount);
            }
        } else if (index == 8) {
            if (slot == 0) {
                if (player.getInventory().getCount(ItemID.COINS) < 500000) {
                    player.getGameEncoder().sendMessage("You need 500K coins to do this.");
                    return;
                } else if (player.getInventory().getCount(ItemID.VOTE_TICKET) < 2) {
                    player.getGameEncoder().sendMessage("You need 2 vote tickets to do this.");
                    return;
                } else if (player.getSlayer().getBossTaskAmount() == 0) {
                    player.getGameEncoder().sendMessage("You don't have a Boss Slayer task to cancel.");
                    return;
                }
                player.getSlayer().setBossTaskAmount(0);
                player.getInventory().deleteItem(ItemID.COINS, 500000);
                player.getInventory().deleteItem(ItemID.VOTE_TICKET, 2);
                player.getGameEncoder().sendMessage("Your Boss Slayer task has been cancelled.");
            }
        } else if (index == 9) {
            if (slot == 0) {
                SlayerMaster.setAssignment(player, SlayerMaster.WILDERNESS_MASTER);
            } else if (slot == 1) {
                player.getSlayer().sendTask();
            } else if (slot == 2) {
                player.getSlayer().cancelWildernessTask();
            }
        }
    },

    getDialogueEntries: function() {
        return entries;
    }
}
