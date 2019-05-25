package script.packetdecoder.widget;

import com.palidino.osrs.io.ValueEnteredEvent;
import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.player.Duel;
import com.palidino.osrs.model.player.Player;

public class DuelWidget {
    public static void widget482(Player player, int index, int childID, int slot, int itemID) {
        // Options
        if (player.isLocked()) {
            return;
        }
        if (childID >= 37 && childID <= 47) {
            player.getDuel().changeRule(childID - 37);
            return;
        } else if (childID >= 48 && childID <= 49) {
            player.getDuel().changeRule(childID - 36);
            return;
        } else if (childID >= 50 && childID <= 60) {
            player.getDuel().changeRule(childID - 50);
            return;
        } else if (childID >= 61 && childID <= 62) {
            player.getDuel().changeRule(childID - 49);
            return;
        }
        switch (childID) {
        case 103:
            player.getDuel().acceptOptions();
            break;
        case 69:
            player.getDuel().changeRule(Duel.Rule.DISABLE_HEAD_SLOT);
            break;
        case 70:
            player.getDuel().changeRule(Duel.Rule.DISABLE_CAPE_SLOT);
            break;
        case 71:
            player.getDuel().changeRule(Duel.Rule.DISABLE_NECK_SLOT);
            break;
        case 72:
            player.getDuel().changeRule(Duel.Rule.DISABLE_WEAPON_SLOT);
            break;
        case 73:
            player.getDuel().changeRule(Duel.Rule.DISABLE_CHEST_SLOT);
            break;
        case 74:
            player.getDuel().changeRule(Duel.Rule.DISABLE_SHIELD_SLOT);
            break;
        case 75:
            player.getDuel().changeRule(Duel.Rule.DISABLE_LEG_SLOT);
            break;
        case 76:
            player.getDuel().changeRule(Duel.Rule.DISABLE_HAND_SLOT);
            break;
        case 77:
            player.getDuel().changeRule(Duel.Rule.DISABLE_FEET_SLOT);
            break;
        case 78:
            player.getDuel().changeRule(Duel.Rule.DISABLE_RING_SLOT);
            break;
        case 79:
            player.getDuel().changeRule(Duel.Rule.DISABLE_AMMO_SLOT);
            break;
        case 104:
            player.getWidgetManager().removeInteractiveWidgets();
            break;
        case 108:
        case 112:
            player.getDuel().saveAsPreset();
            break;
        case 110:
        case 113:
            player.getDuel().loadPreset();
            break;
        case 109:
        case 111:
            player.getDuel().loadPrevious();
            break;
        }
    }

    public static void widget481(Player player, int index, int childID, int slot, int itemID) {
        // Stake
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 19:
            itemID = ItemID.PLATINUM_TOKEN;
            if (slot == 0) {
                player.getDuel().removeOffer(player.getDuel().getSlotByID(itemID), itemID, 1);
            } else if (slot == 1) {
                player.getDuel().addOffer(player.getInventory().getSlotByID(itemID), itemID, 1);
            } else if (slot == 2) {
                player.getDuel().addOffer(player.getInventory().getSlotByID(itemID), itemID, 10);
            } else if (slot == 3) {
                player.getDuel().addOffer(player.getInventory().getSlotByID(itemID), itemID, 100);
            } else if (slot == 4) {
                player.getDuel().addOffer(player.getInventory().getSlotByID(itemID), itemID, 1000);
            } else if (slot == 5) {
                final int usingItemID = itemID;
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        int currentCount = player.getDuel().getCount(usingItemID);
                        if (currentCount > value) {
                            int coinSlot = player.getDuel().getSlotByID(usingItemID);
                            player.getDuel().removeOffer(coinSlot, usingItemID, currentCount - value);
                        } else {
                            int coinSlot = player.getInventory().getSlotByID(usingItemID);
                            player.getDuel().addOffer(coinSlot, usingItemID, value - currentCount);
                        }
                    }
                });
            }
            break;
        case 20:
            itemID = ItemID.COINS;
            if (slot == 0) {
                player.getDuel().removeOffer(player.getDuel().getSlotByID(itemID), itemID, 1);
            } else if (slot == 1) {
                player.getDuel().addOffer(player.getInventory().getSlotByID(itemID), itemID, 1);
            } else if (slot == 2) {
                player.getDuel().addOffer(player.getInventory().getSlotByID(itemID), itemID, 100000);
            } else if (slot == 3) {
                player.getDuel().addOffer(player.getInventory().getSlotByID(itemID), itemID, 1000000);
            } else if (slot == 4) {
                player.getDuel().addOffer(player.getInventory().getSlotByID(itemID), itemID, 10000000);
            } else if (slot == 5) {
                final int usingItemID = itemID;
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        int currentCount = player.getDuel().getCount(usingItemID);
                        if (currentCount > value) {
                            int coinSlot = player.getDuel().getSlotByID(usingItemID);
                            player.getDuel().removeOffer(coinSlot, usingItemID, currentCount - value);
                        } else {
                            int coinSlot = player.getInventory().getSlotByID(usingItemID);
                            player.getDuel().addOffer(coinSlot, usingItemID, value - currentCount);
                        }
                    }
                });
            }
            break;
        case 74:
            player.getDuel().acceptStake();
            break;
        case 75:
            player.getWidgetManager().removeInteractiveWidgets();
            break;
        }
    }

    public static void widget476(Player player, int index, int childID, int slot, int itemID) {
        // Confirm
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 72:
            player.getDuel().acceptConfirm();
            break;
        case 74:
            player.getWidgetManager().removeInteractiveWidgets();
            break;
        }
    }

    public static void widget372(Player player, int index, int childID, int slot, int itemID) {
        // Complete
        player.getWidgetManager().removeInteractiveWidgets();
    }
}

