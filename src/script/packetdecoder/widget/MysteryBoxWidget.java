package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class MysteryBoxWidget {
    public static void widget2(Player player, int index, int childID, int slot, int itemID) {
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 74:
            player.getWidgetManager().removeInteractiveWidgets();
            break;
        }
    }
}

