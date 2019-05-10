var entries = new ArrayList();
var title = "";
var lines = new ArrayList();
var actions = new ArrayList();

title = "Select an Option";
lines.add("Shop");
actions.add("close|script");
lines.add("Miniquest");
actions.add("close|script");
var obj0 = new DialogueEntry();
entries.add(obj0);
obj0.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

instance = new DialogueScript() {
    execute: function(player, index, childID, slot) {
        if (index == 0) {
            if (slot == 0) {
                if (!player.getCombat().getLostCity()) {
                    player.getGameEncoder().sendMessage("You can't view this shop.");
                    return;
                }
                player.openShop("lost_city");
            } else if (slot == 1) {
                if (player.getCombat().getLostCity()) {
                    player.getGameEncoder().sendMessage("You've already completed this.");
                    return;
                }
                for (var i = 0; i < player.getInventory().size(); i++) {
                    var itemID = player.getInventory().getID(i);
                    if (itemID == -1 || ItemDef.getEquipSlot(itemID) == null) {
                        continue;
                    }
                    var isAllowed = ItemDef.getName(itemID).contains("arrow") || itemID == 3840 || itemID == 3842
                            || itemID == 3844 || itemID == 12608 || itemID == 12610 || itemID == 12612;
                    if (isAllowed) {
                        continue;
                    }
                    player.getGameEncoder().sendMessage("You can't take " + ItemDef.getName(itemID) + " to Entrana.");
                    return;
                }
                for (var i = 0; i < player.getEquipment().size(); i++) {
                    var itemID = player.getEquipment().getID(i);
                    if (itemID == -1 || ItemDef.getEquipSlot(itemID) == null) {
                        continue;
                    }
                    var isAllowed = ItemDef.getName(itemID).contains("arrow") || itemID == 3840 || itemID == 3842
                            || itemID == 3844 || itemID == 12608 || itemID == 12610 || itemID == 12612;
                    if (isAllowed) {
                        continue;
                    }
                    player.getGameEncoder().sendMessage("You can't take " + ItemDef.getName(itemID) + " to Entrana.");
                    return;
                }
                player.getMovement().teleport(2830, 9772);
            }
        }
    },

    getDialogueEntries: function() {
        return entries;
    }
}

