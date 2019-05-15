var entries = new ArrayList();
var title = "";
var lines = new ArrayList();
var actions = new ArrayList();

title = "Banknote # x Item name";
lines.add("Yes - # gp");
actions.add("script|close");
lines.add("Cancel");
actions.add("close");
var obj0 = new DialogueEntry();
entries.add(obj0);
obj0.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

instance = new DialogueScript() {
    execute: function(player, index, childID, slot) {
        if (player.isLocked()) {
            return;
        }
        if (index == 0) {
            var itemID = player.getAttributeInt("use_item_id");
            if (slot == 0) {
                var amount = player.getInventory().getCount(itemID);
                if (amount == 0 || ItemDef.getNotedID(itemID) == -1) {
                    return;
                }
                var cost = amount * 50;
                if (player.getInventory().getCount(ItemID.COINS) < cost) {
                    player.getGameEncoder().sendMessage("You need " + Utils.formatNumber(cost) + " coins to do this.");
                    return;
                }
                player.getInventory().deleteItem(itemID, amount);
                player.getInventory().deleteItem(ItemID.COINS, cost);
                player.getInventory().addItem(ItemDef.getNotedID(itemID), amount);
            }
        }
    },

    getDialogueEntries: function() {
        return entries;
    }
}
