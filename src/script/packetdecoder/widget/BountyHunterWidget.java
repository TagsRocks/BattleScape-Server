package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class BountyHunterWidget {
    public static void widget90(Player player, int index, int childId, int slot, int itemId) {
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 57:
            player.openDialogue("bountyhunter", 0);
            break;
        }
    }
}

