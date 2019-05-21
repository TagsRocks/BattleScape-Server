DecodedPacketWidget.prototype.widget_65 = function(player, index, childID, slot, itemID) {
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 17:
        var inventoryCount = player.getInventory().getCount(ItemID.OLD_SCHOOL_BOND);
        if (inventoryCount == 0) {
            player.getGameEncoder().sendMessage("You have no bonds in your inventory.");
            break;
        }
        if (index == 0) {
            player.getInventory().deleteItem(ItemID.OLD_SCHOOL_BOND, 1);
            player.setBondPouch(Utils.addInt(player.getBondPouch(), 1, Item.MAX_AMOUNT));
        } else if (index == 1) {
            player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                execute: function(value) {
                    var inventoryCount = player.getInventory().getCount(ItemID.OLD_SCHOOL_BOND);
                    value = Math.min(value, inventoryCount);
                    player.getInventory().deleteItem(ItemID.OLD_SCHOOL_BOND, value);
                    player.setBondPouch(Utils.addInt(player.getBondPouch(), value, Item.MAX_AMOUNT));
                    player.getOptions().sendBondCounts();
                }
            });
        } else if (index == 2) {
            player.getInventory().deleteItem(ItemID.OLD_SCHOOL_BOND, inventoryCount);
            player.setBondPouch(Utils.addInt(player.getBondPouch(), inventoryCount, Item.MAX_AMOUNT));
        }
        break;
    case 18:
        if (player.getBondPouch() == 0) {
            player.getGameEncoder().sendMessage("You have no bonds in your pouch.");
            break;
        }
        if (index == 0) {
            var maxWithdraw = Math.min(player.getBondPouch(), player.getInventory().getRemainingSlots());
            maxWithdraw = Math.min(1, maxWithdraw);
            player.setBondPouch(player.getBondPouch() - maxWithdraw);
            player.getInventory().addItem(ItemID.OLD_SCHOOL_BOND, maxWithdraw);
        } else if (index == 1) {
            player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                execute: function(value) {
                    var maxWithdraw = Math.min(player.getBondPouch(), player.getInventory().getRemainingSlots());
                    value = Math.min(value, maxWithdraw);
                    player.setBondPouch(player.getBondPouch() - value);
                    player.getInventory().addItem(ItemID.OLD_SCHOOL_BOND, value);
                    player.getOptions().sendBondCounts();
                }
            });
        } else if (index == 2) {
            var maxWithdraw = Math.min(player.getBondPouch(), player.getInventory().getRemainingSlots());
            player.setBondPouch(player.getBondPouch() - maxWithdraw);
            player.getInventory().addItem(ItemID.OLD_SCHOOL_BOND, maxWithdraw);
        }
        break;
    case 49:
        player.getWidgetManager().removeInteractiveWidgets();
        player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/store");
        break;
    case 54:
        player.getWidgetManager().removeInteractiveWidgets();
        if (Main.isSpawn()) {
            player.openShop("bond_spawn");
        } else if (player.isGameModeNormal() || player.isGameModeHard()) {
            player.openShop("bond");
        } else {
            player.openShop("bond_iron");
        }
        break;
    case 81:
        player.getWidgetManager().removeInteractiveWidgets();
        player.openDialogue("bond", 1);
        break;
    }
    player.getOptions().sendBondCounts();
}
