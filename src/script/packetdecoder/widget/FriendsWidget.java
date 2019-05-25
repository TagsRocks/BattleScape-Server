package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.WidgetChild;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.player.Player;

public class FriendsWidget {
    public static void widget429(Player player, int index, int childID, int slot, int itemID) {
        if (childID == 1) {
            player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.FRIENDS, WidgetID.IGNORES);
        }
    }

    public static void widget432(Player player, int index, int childID, int slot, int itemID) {
        if (childID == 1) {
            player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.FRIENDS, WidgetID.FRIENDS);
        }
    }

    public static void widget109(Player player, int index, int childID, int slot, int itemID) {
        // Account management
        if (childID == 3 || childID == 8) {
            player.getOptions().openBondsMenu();
        } else if (childID == 15) {
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/private");
        } else if (childID == 22) {
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/forms?do=form&fid=4");
        } else if (childID == 29) {
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/");
        } else if (childID == 32) {
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/forums/19-Support");
        }
    }
}

