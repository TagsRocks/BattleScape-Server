package script.packetdecoder.widget;

import com.palidino.osrs.io.ValueEnteredEvent;
import com.palidino.osrs.io.cache.ItemId;
import com.palidino.osrs.model.player.Duel;
import com.palidino.osrs.model.player.Player;

public class DuelWidget {
    public static void widget482(Player player, int index, int childId, int slot, int itemId) {
        // Options
        if (player.isLocked()) {
            return;
        }
        if (childId >= 37 && childId <= 47) {
            player.getDuel().changeRule(childId - 37);
            return;
        } else if (childId >= 48 && childId <= 49) {
            player.getDuel().changeRule(childId - 36);
            return;
        } else if (childId >= 50 && childId <= 60) {
            player.getDuel().changeRule(childId - 50);
            return;
        } else if (childId >= 61 && childId <= 62) {
            player.getDuel().changeRule(childId - 49);
            return;
        }
        switch (childId) {
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

    public static void widget481(Player player, int index, int childId, int slot, int itemId) {
        // Stake
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 19:
            itemId = ItemId.PLATINUM_TOKEN;
            if (slot == 0) {
                player.getDuel().removeOffer(player.getDuel().getSlotById(itemId), itemId, 1);
            } else if (slot == 1) {
                player.getDuel().addOffer(player.getInventory().getSlotById(itemId), itemId, 1);
            } else if (slot == 2) {
                player.getDuel().addOffer(player.getInventory().getSlotById(itemId), itemId, 10);
            } else if (slot == 3) {
                player.getDuel().addOffer(player.getInventory().getSlotById(itemId), itemId, 100);
            } else if (slot == 4) {
                player.getDuel().addOffer(player.getInventory().getSlotById(itemId), itemId, 1000);
            } else if (slot == 5) {
                final int usingItemId = itemId;
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        int currentCount = player.getDuel().getCount(usingItemId);
                        if (currentCount > value) {
                            int coinSlot = player.getDuel().getSlotById(usingItemId);
                            player.getDuel().removeOffer(coinSlot, usingItemId, currentCount - value);
                        } else {
                            int coinSlot = player.getInventory().getSlotById(usingItemId);
                            player.getDuel().addOffer(coinSlot, usingItemId, value - currentCount);
                        }
                    }
                });
            }
            break;
        case 20:
            itemId = ItemId.COINS;
            if (slot == 0) {
                player.getDuel().removeOffer(player.getDuel().getSlotById(itemId), itemId, 1);
            } else if (slot == 1) {
                player.getDuel().addOffer(player.getInventory().getSlotById(itemId), itemId, 1);
            } else if (slot == 2) {
                player.getDuel().addOffer(player.getInventory().getSlotById(itemId), itemId, 100000);
            } else if (slot == 3) {
                player.getDuel().addOffer(player.getInventory().getSlotById(itemId), itemId, 1000000);
            } else if (slot == 4) {
                player.getDuel().addOffer(player.getInventory().getSlotById(itemId), itemId, 10000000);
            } else if (slot == 5) {
                final int usingItemId = itemId;
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        int currentCount = player.getDuel().getCount(usingItemId);
                        if (currentCount > value) {
                            int coinSlot = player.getDuel().getSlotById(usingItemId);
                            player.getDuel().removeOffer(coinSlot, usingItemId, currentCount - value);
                        } else {
                            int coinSlot = player.getInventory().getSlotById(usingItemId);
                            player.getDuel().addOffer(coinSlot, usingItemId, value - currentCount);
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

    public static void widget476(Player player, int index, int childId, int slot, int itemId) {
        // Confirm
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 72:
            player.getDuel().acceptConfirm();
            break;
        case 74:
            player.getWidgetManager().removeInteractiveWidgets();
            break;
        }
    }

    public static void widget372(Player player, int index, int childId, int slot, int itemId) {
        // Complete
        player.getWidgetManager().removeInteractiveWidgets();
    }
}

