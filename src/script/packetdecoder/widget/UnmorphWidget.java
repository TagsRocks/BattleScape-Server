package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class UnmorphWidget {
    public static void widget375(Player player, int index, int childID, int slot, int itemID) {
        switch (childID) {
        case 5:
            player.getMovement().stopViewing();
            player.getWidgetManager().removeInteractiveWidgets();
            player.getAppearance().setNpcID(-1);
            break;
        }
    }
}

