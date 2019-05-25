package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class ChatboxWidget {
    public static void widget162(Player player, int index, int childID, int slot, int itemID) {
        switch (childID) {
        case 27:
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/");
            break;
        }
    }
}

