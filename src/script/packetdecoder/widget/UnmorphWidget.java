package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class UnmorphWidget {
    public static void widget375(Player player, int index, int childId, int slot, int itemId) {
        switch (childId) {
        case 5:
            player.getMovement().stopViewing();
            player.getWidgetManager().removeInteractiveWidgets();
            player.getAppearance().setNpcId(-1);
            break;
        }
    }
}

