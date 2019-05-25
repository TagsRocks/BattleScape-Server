var entries = new ArrayList();
var title = "";
var lines = new ArrayList();
var actions = new ArrayList();

title = "Select an Option";
lines.add("Easy");
actions.add("close|script");
lines.add("Medium");
actions.add("close|script");
lines.add("Hard");
actions.add("close|script");
lines.add("Elite");
actions.add("close|script");
lines.add("Master");
actions.add("close|script");
var obj0 = new DialogueEntry();
entries.add(obj0);
obj0.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

instance = new DialogueScript() {
    execute: function(player, index, childId, slot) {
        if (player.isLocked()) {
            return;
        }
        if (index == 0) {
            if (slot == 0) {
                player.getClueChest().open(ItemDef.ClueChestType.EASY);
            } else if (slot == 1) {
                player.getClueChest().open(ItemDef.ClueChestType.MEDIUM);
            } else if (slot == 2) {
                player.getClueChest().open(ItemDef.ClueChestType.HARD);
            } else if (slot == 3) {
                player.getClueChest().open(ItemDef.ClueChestType.ELITE);
            } else if (slot == 4) {
                player.getClueChest().open(ItemDef.ClueChestType.MASTER);
            }
        }
    },

    getDialogueEntries: function() {
        return entries;
    }
}
