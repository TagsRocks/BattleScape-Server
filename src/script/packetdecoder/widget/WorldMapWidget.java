package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class WorldMapWidget {
    public static void widget595(Player player, int index, int childID, int slot, int itemID) {
        switch (childID) {
        case 3:
        case 37:
            player.getWidgetManager().removeWorldMap();
            break;
        }
    }
}

