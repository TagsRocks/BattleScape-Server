package script.packetdecoder.widget;

import com.palidino.osrs.Main;
import com.palidino.osrs.model.player.Player;

public class ChatboxWidget {
    public static void widget162(Player player, int index, int childId, int slot, int itemId) {
        switch (childId) {
        case 27:
            player.getGameEncoder().sendOpenURL(Main.getSettings().getWebsiteUrl());
            break;
        }
    }
}

