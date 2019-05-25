package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class BountyHunterWidget {
    public static void widget90(Player player, int index, int childID, int slot, int itemID) {
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 57:
            player.openDialogue("bountyhunter", 0);
            break;
        }
    }
}

