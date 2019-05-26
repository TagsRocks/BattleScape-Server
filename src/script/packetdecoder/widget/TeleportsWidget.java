package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Teleports;

public class TeleportsWidget {
    public static void widget703(Player player, int index, int childId, int slot, int itemId) {
        if (player.isLocked()) {
            return;
        }
        if (!player.getController().canTeleport(true)) {
            return;
        }
        if (childId >= 21 && childId <= 53) {
            player.getWidgetManager().setLastTeleportViewingIndex((childId - 19) / 3);
            Teleports.open(player);
        } else if (childId >= 59 && childId <= 198) {
            Teleports.destinationWidgetPressed(player, childId);
        } else if (childId == 199) {
            Teleports.openHomeSelect(player);
        } else if (childId >= 207 && childId <= 209) {
            int[] teleportIndices = player.getWidgetManager().getLastTeleport(childId - 207);
            Teleports.destinationWidgetPressed(player, teleportIndices[0], teleportIndices[1]);
        }
    }
}

