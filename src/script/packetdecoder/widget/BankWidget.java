package script.packetdecoder.widget;

import com.palidino.osrs.io.ValueEnteredEvent;
import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.player.Bank;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.Player;

public class BankWidget {
    public static void widget12(Player player, int index, int childID, int slot, int itemID) {
        // Bank
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 11:
            if (index == 0) {
                player.getBank().setViewingTab(slot - 10);
                player.getGameEncoder().sendScript(101, 11);
            } else if (index == 5) {
                player.getBank().collapseTab(slot - 10, 0);
            }
            break;
        case 13:
            int[] realSlot = player.getBank().getRealSlot(slot);
            if (index == 0) {
                if (player.getBank().getDefaultQuantity() == Bank.DefaultQuantity.X) {
                    player.getBank().withdraw(itemID, realSlot, player.getBank().getLastEnteredX());
                } else {
                    player.getBank().withdraw(itemID, realSlot, player.getBank().getDefaultQuantity().quantity);
                }
            } else if (index == 1) {
                player.getBank().withdraw(itemID, realSlot, 1);
            } else if (index == 2) {
                player.getBank().withdraw(itemID, realSlot, 5);
            } else if (index == 3) {
                player.getBank().withdraw(itemID, realSlot, 10);
            } else if (index == 4) {
                player.getBank().withdraw(itemID, realSlot, player.getBank().getLastEnteredX());
            } else if (index == 5) {
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        player.getBank().setLastEnteredX(value);
                        player.getBank().withdraw(itemID, realSlot, value);
                    }
                });
            } else if (index == 6) {
                player.getBank().withdraw(itemID, realSlot, Item.MAX_AMOUNT);
            } else if (index == 7) {
                Item item = player.getBank().getItem(realSlot);
                if (item != null) {
                    player.getBank().withdraw(itemID, realSlot, item.getAmount() - 1);
                }
            } else if (index == 8) {
                player.getBank().withdraw(itemID, realSlot, -1);
            }
            break;
        case 17:
            player.getBank().setInsertMode(false);
            break;
        case 19:
            player.getBank().setInsertMode(true);
            break;
        case 22:
            player.getBank().setTakeAsNote(false);
            break;
        case 24:
            player.getBank().setTakeAsNote(true);
            break;
        case 28:
            player.getBank().setDefaultQuantity(Bank.DefaultQuantity.ONE);
            break;
        case 30:
            player.getBank().setDefaultQuantity(Bank.DefaultQuantity.FIVE);
            break;
        case 32:
            player.getBank().setDefaultQuantity(Bank.DefaultQuantity.TEN);
            break;
        case 34:
            player.getBank().setDefaultQuantity(Bank.DefaultQuantity.X);
            break;
        case 36:
            player.getBank().setDefaultQuantity(Bank.DefaultQuantity.ALL);
            break;
        case 38:
            player.getBank().setAlwaysSetPlaceholders(!player.getBank().getAlwaysSetPlaceholders());
            break;
        case 42:
            player.getBank().storeInventory();
            break;
        case 44:
            player.getBank().storeEquipment();
            break;
        case 47:
            player.getBank().incinerateItem(itemID, slot - 1);
            break;
        case 50:
            if (slot == 0) {
                player.getBank().setTabDisplay(Bank.TAB_DISPLAY_FIRST_ITEM);
            } else if (slot == 1) {
                player.getBank().setTabDisplay(Bank.TAB_DISPLAY_DIGIT);
            } else if (slot == 2) {
                player.getBank().setTabDisplay(Bank.TAB_DISPLAY_ROMAN_NUMERAL);
            } else if (slot == 3) {
                player.getBank().setTabDisplay(Bank.TAB_DISPLAY_HIDDEN);
            }
            break;
        case 51:
            player.getBank().setIncinerator(!player.getBank().getIncinerator());
            break;
        case 52:
            player.getBank().setHideWornItems(!player.getBank().getHideWornItems());
            break;
        }
    }

    public static void widget15(Player player, int index, int childID, int slot, int itemID) {
        // Inventory
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 3:
            if (index == 1) {
                if (player.getBank().getDefaultQuantity() == Bank.DefaultQuantity.X) {
                    player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                        @Override
                        public void execute(int value) {
                            player.getBank().setLastEnteredX(value);
                            player.getBank().deposit(itemID, slot, value);
                        }
                    });
                } else {
                    player.getBank().deposit(itemID, slot, player.getBank().getDefaultQuantity().quantity);
                }
            } else if (index == 2) {
                player.getBank().deposit(itemID, slot, 1);
            } else if (index == 3) {
                player.getBank().deposit(itemID, slot, 5);
            } else if (index == 4) {
                player.getBank().deposit(itemID, slot, 10);
            } else if (index == 5) {
                player.getBank().deposit(itemID, slot, player.getBank().getLastEnteredX());
            } else if (index == 6) {
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        player.getBank().setLastEnteredX(value);
                        player.getBank().deposit(itemID, slot, value);
                    }
                });
            } else if (index == 7) {
                player.getBank().deposit(itemID, slot, Item.MAX_AMOUNT);
            } else if (index == 8) {
                if (itemID == player.getInventory().getID(slot) && itemID == ItemID.RUNE_POUCH) {
                    player.getMagic().removeRunesFromPouch(0, Magic.MAX_RUNE_POUCH_AMOUNT);
                    player.getMagic().removeRunesFromPouch(1, Magic.MAX_RUNE_POUCH_AMOUNT);
                    player.getMagic().removeRunesFromPouch(2, Magic.MAX_RUNE_POUCH_AMOUNT);
                }
            }
            break;
        }
    }

    public static void widget192(Player player, int index, int childID, int slot, int itemID) {
        // Deposit box
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 2:
            if (index == 1) {
                player.getBank().deposit(itemID, slot, 1);
            } else if (index == 2) {
                player.getBank().deposit(itemID, slot, 5);
            } else if (index == 3) {
                player.getBank().deposit(itemID, slot, 10);
            } else if (index == 4) {
                player.getBank().deposit(itemID, slot, Item.MAX_AMOUNT);
            } else if (index == 5) {
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        player.getBank().deposit(itemID, slot, value);
                    }
                });
            }
            break;
        case 4:
            player.getBank().storeInventory();
            break;
        case 6:
            player.getBank().storeEquipment();
            break;
        case 8:
            player.getBank().storeLootingBag();
            break;
        }
    }

    public static void widget14(Player player, int index, int childID, int slot, int itemID) {
        // Pin settings
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 19:
        case 22:
            player.getBank().openPinSettingsConfirm(false);
            break;
        case 23:
        case 26:
            player.getBank().openPinSettingsConfirm(true);
            break;
        case 33:
            if (player.getAttributeBool("remove_bank_pin")) {
                player.getBank().deletePin();
            } else {
                player.getBank().openPinEnter(true);
            }
            break;
        case 36:
            player.removeAttribute("remove_bank_pin");
            break;
        }
    }
}
