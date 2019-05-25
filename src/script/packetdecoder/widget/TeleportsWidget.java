package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Teleports;

public class TeleportsWidget {
    public static void widget703(Player player, int index, int childID, int slot, int itemID) {
        if (player.isLocked()) {
            return;
        }
        if (!player.getController().canTeleport(true)) {
            return;
        }
        if (childID >= 21 && childID <= 53) {
            player.getWidgetManager().setLastTeleportViewingIndex((childID - 19) / 3);
            Teleports.open(player);
        } else if (childID >= 59 && childID <= 198) {
            Teleports.destinationWidgetPressed(player, childID);
        } else if (childID == 199) {
            Teleports.openHomeSelect(player);
        } else if (childID >= 207 && childID <= 209) {
            int[] teleportIndices = player.getWidgetManager().getLastTeleport(childID - 207);
            Teleports.destinationWidgetPressed(player, teleportIndices[0], teleportIndices[1]);
        }
    }
}

