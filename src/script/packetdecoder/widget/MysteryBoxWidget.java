package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class MysteryBoxWidget {
    public static void widget2(Player player, int index, int childId, int slot, int itemId) {
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 74:
            player.getWidgetManager().removeInteractiveWidgets();
            break;
        }
    }
}

