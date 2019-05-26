package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.ItemId;
import com.palidino.osrs.io.cache.WidgetChild;
import com.palidino.osrs.io.cache.WidgetId;
import com.palidino.osrs.model.player.Player;

public class LogoutWidget {
    public static void widget182(Player player, int index, int childId, int slot, int itemId) {
        // Tab
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 3:
            player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.LOGOUT, WidgetId.WORLD_SELECT);
            player.getGameEncoder().sendWidgetSettings(WidgetId.WORLD_SELECT, 18, 0, 20, 2);
            /*
             * player.getGameEncoder().sendEnterString("Quick feedback:", new ValueEnteredEvent.StringEvent() {
             *
             * @Override public void execute(int value) { Logger.println("[QUICK FEEDBACK; " + player.getIP() +
             * "] " + player.getUsername() + ": " + value); } });
             */
            break;
        case 8:
            player.getController().logoutWidgetHook();
            if (!player.canLogout() || player.carryingItem(ItemId.BLOODY_KEY)
                    || player.carryingItem(ItemId.BLOODIER_KEY)) {
                player.getGameEncoder().sendMessage("You can't logout right now.");
                player.getCombat().getTzHaar().pause();
                return;
            }
            player.getGameEncoder().sendLogout();
            player.setVisible(false);
            break;
        }
    }

    public static void widget69(Player player, int index, int childId, int slot, int itemId) {
        // World lists
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 3:
            player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.LOGOUT, WidgetId.LOGOUT);
            player.getWidgetManager().sendLogoutText();
            break;
        case 18:
            player.getController().logoutWidgetHook();
            if (!player.canLogout() || player.carryingItem(ItemId.BLOODY_KEY)
                    || player.carryingItem(ItemId.BLOODIER_KEY)) {
                player.getGameEncoder().sendMessage("You can't logout right now.");
                player.getCombat().getTzHaar().pause();
                return;
            }
            if (slot == 1) {
                player.putAttribute("swap_world_ip", "world1.battle-scape.com");
                player.putAttribute("swap_world_id", 1);
                player.putAttribute("swap_world_mask", 1 + 33554432);
            } else if (slot == 2) {
                player.putAttribute("swap_world_ip", "s2-world1.battle-scape.com");
                player.putAttribute("swap_world_id", 2);
                player.putAttribute("swap_world_mask", 1 + 33554432);
            } else if (slot == 3) {
                player.putAttribute("swap_world_ip", "s2-world2.battle-scape.com");
                player.putAttribute("swap_world_id", 3);
                player.putAttribute("swap_world_mask", 1 + 33554432);
            }
            player.setVisible(false);
            break;
        case 23:
            player.getController().logoutWidgetHook();
            if (!player.canLogout() || player.carryingItem(ItemId.BLOODY_KEY)
                    || player.carryingItem(ItemId.BLOODIER_KEY)) {
                player.getGameEncoder().sendMessage("You can't logout right now.");
                player.getCombat().getTzHaar().pause();
                return;
            }
            player.getGameEncoder().sendLogout();
            player.setVisible(false);
            break;
        }
    }
}

