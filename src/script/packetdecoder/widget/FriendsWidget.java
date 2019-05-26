package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.WidgetChild;
import com.palidino.osrs.io.cache.WidgetId;
import com.palidino.osrs.model.player.Player;

public class FriendsWidget {
    public static void widget429(Player player, int index, int childId, int slot, int itemId) {
        if (childId == 1) {
            player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.FRIENDS, WidgetId.IGNORES);
        }
    }

    public static void widget432(Player player, int index, int childId, int slot, int itemId) {
        if (childId == 1) {
            player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.FRIENDS, WidgetId.FRIENDS);
        }
    }

    public static void widget109(Player player, int index, int childId, int slot, int itemId) {
        // Account management
        if (childId == 3 || childId == 8) {
            player.getOptions().openBondsMenu();
        } else if (childId == 15) {
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/private");
        } else if (childId == 22) {
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/forms?do=form&fid=4");
        } else if (childId == 29) {
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/");
        } else if (childId == 32) {
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/forums/19-Support");
        }
    }
}

