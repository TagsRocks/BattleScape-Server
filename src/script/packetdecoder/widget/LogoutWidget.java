package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.io.cache.WidgetChild;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.player.Player;

public class LogoutWidget {
    public static void widget182(Player player, int index, int childID, int slot, int itemID) {
        // Tab
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 3:
            player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.LOGOUT, WidgetID.WORLD_SELECT);
            player.getGameEncoder().sendWidgetSettings(WidgetID.WORLD_SELECT, 18, 0, 20, 2);
            /*
             * player.getGameEncoder().sendEnterString("Quick feedback:", new ValueEnteredEvent.StringEvent() {
             *
             * @Override public void execute(int value) { Logger.println("[QUICK FEEDBACK; " + player.getIP() +
             * "] " + player.getUsername() + ": " + value); } });
             */
            break;
        case 8:
            player.getController().logoutWidgetHook();
            if (!player.canLogout() || player.carryingItem(ItemID.BLOODY_KEY)
                    || player.carryingItem(ItemID.BLOODIER_KEY)) {
                player.getGameEncoder().sendMessage("You can't logout right now.");
                player.getCombat().getTzHaar().pause();
                return;
            }
            player.getGameEncoder().sendLogout();
            player.setVisible(false);
            break;
        }
    }

    public static void widget69(Player player, int index, int childID, int slot, int itemID) {
        // World lists
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 3:
            player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.LOGOUT, WidgetID.LOGOUT);
            player.getWidgetManager().sendLogoutText();
            break;
        case 18:
            player.getController().logoutWidgetHook();
            if (!player.canLogout() || player.carryingItem(ItemID.BLOODY_KEY)
                    || player.carryingItem(ItemID.BLOODIER_KEY)) {
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
            if (!player.canLogout() || player.carryingItem(ItemID.BLOODY_KEY)
                    || player.carryingItem(ItemID.BLOODIER_KEY)) {
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

