package script.packetdecoder.widget;

import com.palidino.osrs.model.dialogue.Dialogue;
import com.palidino.osrs.model.player.Player;

public class DialogueWidget {
    public static void widget219(Player player, int index, int childID, int slot, int itemID) {
        // Chatbox selection
        Dialogue.handleWidget(player, childID, slot - 1);
    }

    public static void widget187(Player player, int index, int childID, int slot, int itemID) {
        // Screen selection
        Dialogue.handleWidget(player, childID, slot);
    }

    public static void widget229(Player player, int index, int childID, int slot, int itemID) {
        // Screen selection
        Dialogue.handleWidget(player, childID, 0);
    }

    public static void widget270(Player player, int index, int childID, int slot, int itemID) {
        // Make-x
        Dialogue.handleWidget(player, childID - 14, slot);
    }
}

