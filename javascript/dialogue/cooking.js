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
    execute: function(player, index, childId, slot) {
        if (player.isLocked()) {
            return;
        }
        if (index == 0) {
            var itemId = player.getAttributeInt("cook_raw_id");
            var object = player.getAttribute("cook_object");
            Cooking.start(player, itemId, slot, object);
        }
    },

    getDialogueEntries: function() {
        return entries;
    }
}

