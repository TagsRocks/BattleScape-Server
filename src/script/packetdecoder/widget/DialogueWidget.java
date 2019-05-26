package script.packetdecoder.widget;

import com.palidino.osrs.model.dialogue.Dialogue;
import com.palidino.osrs.model.player.Player;

public class DialogueWidget {
    public static void widget219(Player player, int index, int childId, int slot, int itemId) {
        // Chatbox selection
        Dialogue.handleWidget(player, childId, slot - 1);
    }

    public static void widget187(Player player, int index, int childId, int slot, int itemId) {
        // Screen selection
        Dialogue.handleWidget(player, childId, slot);
    }

    public static void widget229(Player player, int index, int childId, int slot, int itemId) {
        // Screen selection
        Dialogue.handleWidget(player, childId, 0);
    }

    public static void widget270(Player player, int index, int childId, int slot, int itemId) {
        // Make-x
        Dialogue.handleWidget(player, childId - 14, slot);
    }
}

