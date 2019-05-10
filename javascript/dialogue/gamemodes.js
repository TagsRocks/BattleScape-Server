var entries = new ArrayList();
var title = "";
var lines = new ArrayList();
var actions = new ArrayList();

title = "Select an Option";
lines.add("Normal Mode");
actions.add("dialogue=gamemodes,1");
lines.add("Hard Mode");
actions.add("dialogue=gamemodes,3");
lines.add("Ironman Mode");
actions.add("dialogue=gamemodes,2");
lines.add("Hardcore Ironman Mode");
actions.add("dialogue=gamemodes,4");
lines.add("Group Ironman Mode");
actions.add("dialogue=gamemodes,5");
var obj0 = new DialogueEntry();
entries.add(obj0);
obj0.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Normal Mode");
actions.add("close|script");
lines.add("Go Back");
actions.add("dialogue=gamemodes,0");
var obj1 = new DialogueEntry();
entries.add(obj1);
obj1.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Ironman Mode");
actions.add("close|script");
lines.add("Go Back");
actions.add("dialogue=gamemodes,0");
var obj2 = new DialogueEntry();
entries.add(obj2);
obj2.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Hard Mode (Non-Ironman)");
actions.add("close|script");
lines.add("Go Back");
actions.add("dialogue=gamemodes,0");
var obj3 = new DialogueEntry();
entries.add(obj3);
obj3.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Hardcore Ironman Mode");
actions.add("close|script");
lines.add("Go Back");
actions.add("dialogue=gamemodes,0");
var obj4 = new DialogueEntry();
entries.add(obj4);
obj4.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Group Ironman Mode");
actions.add("close|script");
lines.add("Go Back");
actions.add("dialogue=gamemodes,0");
var obj5 = new DialogueEntry();
entries.add(obj5);
obj5.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

instance = new DialogueScript() {
    execute: function(player, index, childID, slot) {
        if (index == 1 || index == 2 || index == 3 || index == 4 || index == 5) {
            if (player.getGameMode() != 0 || player.getSkills().getCombatLevel() != 3
                    || player.getPlayTime() >= 3000) {
                if (player.getGameMode() == 0) {
                    player.setGameMode(RSPlayer.GAME_MODE_NORMAL);
                    player.unlock();
                }
                return;
            }
            if (slot == 0) {
                player.unlock();
                if (index == 1) {
                    player.setGameMode(RSPlayer.GAME_MODE_NORMAL);
                } else if (index == 2) {
                    player.setGameMode(RSPlayer.GAME_MODE_IRONMAN);
                } else if (index == 3) {
                    player.setGameMode(RSPlayer.GAME_MODE_HARD);
                } else if (index == 4) {
                    player.setGameMode(RSPlayer.GAME_MODE_HARDCORE_IRONMAN);
                } else if (index == 5) {
                    player.setGameMode(RSPlayer.GAME_MODE_GROUP_IRONMAN);
                    player.getGameEncoder().sendMessage("<col=ff0000>Choose your group through your Clan Chat settings.");
                }
                player.getInventory().addItem(ItemID.COINS, 100000);
                player.getInventory().addItem(ItemID.MONKFISH_NOTED, 50);
                player.getInventory().addItem(ItemID.SUPER_ATTACK_4_NOTED, 5);
                player.getInventory().addItem(ItemID.SUPER_STRENGTH_4_NOTED, 5);
                player.getInventory().addItem(ItemID.SUPER_DEFENCE_4_NOTED, 5);
                player.getInventory().addItem(ItemID.PRAYER_POTION_4_NOTED, 20);
                player.getInventory().addItem(ItemID.STARTER_SWORD, 1);
                player.getInventory().addItem(ItemID.STARTER_BOW, 1);
                player.getInventory().addItem(ItemID.STARTER_STAFF, 1);
                player.getInventory().addItem(ItemID.INITIATE_SALLET, 1);
                player.getInventory().addItem(ItemID.INITIATE_HAUBERK, 1);
                player.getInventory().addItem(ItemID.INITIATE_CUISSE, 1);
                player.getInventory().addItem(ItemID.STARTER_PACK_32288, 1);
                player.getEquipment().setItem(Equipment.Slot.NECK, ItemID.AMULET_OF_POWER, 1);
                if (player.isGameModeIronman() || player.isGameModeGroupIronman()) {
                    player.getEquipment().setItem(Equipment.Slot.HEAD, ItemID.IRONMAN_HELM, 1);
                    player.getEquipment().setItem(Equipment.Slot.CHEST, ItemID.IRONMAN_PLATEBODY, 1);
                    player.getEquipment().setItem(Equipment.Slot.LEG, ItemID.IRONMAN_PLATELEGS, 1);
                } else if (player.isGameModeHardcoreIronman()) {
                    player.getEquipment().setItem(Equipment.Slot.HEAD, ItemID.HARDCORE_IRONMAN_HELM, 1);
                    player.getEquipment().setItem(Equipment.Slot.CHEST, ItemID.HARDCORE_IRONMAN_PLATEBODY, 1);
                    player.getEquipment().setItem(Equipment.Slot.LEG, ItemID.HARDCORE_IRONMAN_PLATELEGS, 1);
                } else {
                    player.getEquipment().setItem(Equipment.Slot.CHEST, ItemID.MONKS_ROBE_TOP, 1);
                    player.getEquipment().setItem(Equipment.Slot.LEG, ItemID.MONKS_ROBE, 1);
                }
                player.getEquipment().setItem(Equipment.Slot.CAPE, ItemID.AVAS_ATTRACTOR, 1);
                player.getEquipment().setItem(Equipment.Slot.HAND, ItemID.MITHRIL_GLOVES, 1);
                player.getEquipment().setItem(Equipment.Slot.FOOT, ItemID.CLIMBING_BOOTS, 1);
                player.getEquipment().setItem(Equipment.Slot.SHIELD, ItemID.UNHOLY_BOOK, 1);
                player.getEquipment().setUpdate(true);
                player.getAppearance().setUpdate(true);
            }
        }
    },

    getDialogueEntries: function() {
        return entries;
    }
}
