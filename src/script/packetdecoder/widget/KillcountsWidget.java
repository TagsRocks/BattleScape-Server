package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class KillcountsWidget {
    public static void widget549(Player player, int index, int childId, int slot, int itemId) {
        // OSRS version
    }

    public static void widget700(Player player, int index, int childId, int slot, int itemId) {
        // Custom version
        switch (childId) {
        case 425:
            player.getCombat().openNPCRareLootList();
            break;
        }
    }
}

