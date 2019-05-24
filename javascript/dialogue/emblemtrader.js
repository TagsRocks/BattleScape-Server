var entries = new ArrayList();
var title = "";
var lines = new ArrayList();
var actions = new ArrayList();

title = "Select an Option";
lines.add("View Shop");
actions.add("close|script");
lines.add("Exchange Mysterious Emblems");
actions.add("close|script");
lines.add("Options");
actions.add("dialogue=wilderness,1");
var obj0 = new DialogueEntry();
entries.add(obj0);
obj0.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

title = "Select an Option";
lines.add("Exchange Ancient Emblems");
actions.add("close|script");
lines.add("Nevermind");
actions.add("close");
var obj1 = new DialogueEntry();
entries.add(obj1);
obj1.setSelection(title, Utils.toStringArray(lines, true), Utils.toStringArray(actions, true));

instance = new DialogueScript() {
    execute: function(player, index, childID, slot) {
        if (player.isLocked()) {
            return;
        }
        if (index == 0) {
            if (slot == 0) {
                if (Main.isSpawn()) {
                    player.openShop("blood_money_spawn");
                } else if (player.isGameModeNormal() || player.isGameModeHard()) {
                    player.openShop("blood_money");
                } else {
                    player.openShop("blood_money_iron");
                }
            } else if (slot == 1) {
                for (var i = 0; i < player.getInventory().size(); i++) {
                    var itemID = player.getInventory().getID(i);
                    var coinValue = BountyHunter.MysteriousEmblem.getValue(itemID);
                    if (itemID == ItemID.MYSTERIOUS_EMBLEM_NOTED || coinValue == 0) {
                        continue;
                    }
                    var bloodMoneyValue = BountyHunter.MysteriousEmblem.getBloodValue(itemID);
                    var inventoryAmount = player.getInventory().getAmount(i);
                    player.getInventory().deleteItem(itemID, inventoryAmount, i);
                    player.getInventory().addOrDropItem(ItemID.COINS, inventoryAmount * coinValue);
                    if (Main.isEconomy()) {
                        player.getInventory().addOrDropItem(ItemID.BLOOD_MONEY, inventoryAmount * bloodMoneyValue);
                    }
                    if (itemID == ItemID.MYSTERIOUS_EMBLEM_TIER_10) {
                        player.getInventory().addOrDropItem(ItemID.BLOODY_KEY_32304, inventoryAmount);
                    }
                }
            }
        } else if (index == 1) {
            if (slot == 0) {
                for (var i = 0; i < player.getInventory().size(); i++) {
                    var id = player.getInventory().getID(i);
                    var value = 0;
                    if (id == ItemID.ANCIENT_EMBLEM) {
                        value = 500000;
                    } else if (id == ItemID.ANCIENT_TOTEM) {
                        value = 1000000;
                    } else if (id == ItemID.ANCIENT_STATUETTE) {
                        value = 2000000;
                    } else if (id == ItemID.ANCIENT_MEDALLION) {
                        value = 4000000;
                    } else if (id == ItemID.ANCIENT_EFFIGY) {
                        value = 8000000;
                    } else if (id == ItemID.ANCIENT_RELIC) {
                        value = 16000000;
                    }
                    if (value == 0) {
                        continue;
                    }
                    var amount = player.getInventory().getAmount(i);
                    var toAmount = amount * value;
                    if (player.getInventory().canAddItem(ItemID.COINS, toAmount)) {
                        player.getInventory().deleteItem(id, amount, i);
                        player.getInventory().addItem(ItemID.COINS, toAmount);
                    }
                }
            }
        }
    },

    getDialogueEntries: function() {
        return entries;
    }
}
