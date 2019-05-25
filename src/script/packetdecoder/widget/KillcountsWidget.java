package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class KillcountsWidget {
    public static void widget549(Player player, int index, int childID, int slot, int itemID) {
        // OSRS version
    }

    public static void widget700(Player player, int index, int childID, int slot, int itemID) {
        // Custom version
        switch (childID) {
        case 425:
            player.getCombat().openNPCRareLootList();
            break;
        }
    }
}

