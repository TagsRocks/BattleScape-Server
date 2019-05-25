package script.packetdecoder.widget;

import com.palidino.osrs.io.ValueEnteredEvent;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.player.Player;

public class TradeWidget {
    public static void widget335(Player player, int index, int childId, int slot, int itemId) {
        // Trade
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 10:
            player.getTrade().accept1();
            break;
        case 25:
            if (index == 0) {
                player.getTrade().removeOffer(itemId, slot, 1);
            } else if (index == 1) {
                player.getTrade().removeOffer(itemId, slot, 5);
            } else if (index == 2) {
                player.getTrade().removeOffer(itemId, slot, 10);
            } else if (index == 3) {
                player.getTrade().removeOffer(itemId, slot, Item.MAX_AMOUNT);
            } else if (index == 4) {
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        player.getTrade().removeOffer(itemId, slot, value);
                    }
                });
            }
            break;
        }
    }

    public static void widget336(Player player, int index, int childId, int slot, int itemId) {
        // Inventory
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 0:
            if (index == 0) {
                player.getTrade().offerItem(itemId, slot, 1);
            } else if (index == 1) {
                player.getTrade().offerItem(itemId, slot, 5);
            } else if (index == 2) {
                player.getTrade().offerItem(itemId, slot, 10);
            } else if (index == 3) {
                player.getTrade().offerItem(itemId, slot, Item.MAX_AMOUNT);
            } else if (index == 4) {
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        player.getTrade().offerItem(itemId, slot, value);
                    }
                });
            }
            break;
        }
    }

    public static void widget334(Player player, int index, int childId, int slot, int itemId) {
        // Accept
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 13:
            player.getTrade().accept2();
            break;
        case 14:
            player.getWidgetManager().removeInteractiveWidgets();
            break;
        }
    }
}

