var entries = new ArrayList();
var title = "";
var lines = new ArrayList();
var actions = new ArrayList();

title = "Select an Option";
lines.add("Start");
actions.add("script|close");
var obj0 = new DialogueEntry();
entries.add(obj0);
obj0.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

instance = new DialogueScript() {
    execute: function(player, index, childID, slot) {
        if (player.isLocked()) {
            return;
        }
        if (index == 0) {
            var itemID = player.getAttributeInt("item_id_" + childID);
            if (itemID == 0) {
                return;
            }
            Herblore.start(player, itemID, slot);
        }
    },

    getDialogueEntries: function() {
        return entries;
    }
}
