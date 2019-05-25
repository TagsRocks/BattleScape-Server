package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.dialogue.Dialogue;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Utils;

public class WelcomeWidget {
    public static void widget378(Player player, int index, int childID, int slot, int itemID) {
        switch (childID) {
        case 81:
            player.getWidgetManager().sendGameViewport();
            if (player.isNewAccount()) {
                player.getWidgetManager().sendInteractiveOverlay(WidgetID.CHARACTER_DESIGN);
            } else if (!player.getGoldMember() && Utils.randomE(5) == 0) {
                Dialogue.openChatboxMessage(player,
                        "<col=ff0000>Bonds</col> can be purchased for $4 and can be used for: trading, membership, mystery box, 100K blood money, ring of wealth (i), herb sack, seed box, and skilling outfits.");
            }
            break;
        }
    }
}

