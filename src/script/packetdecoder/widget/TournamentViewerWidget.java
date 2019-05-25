package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class TournamentViewerWidget {
    public static void widget130(Player player, int index, int childId, int slot, int itemId) {
        if (player.isLocked()) {
            return;
        }
        if (player.getMovement().getTeleporting() || player.getMovement().getTeleported()
                || player.getMovement().isViewing()) {
            return;
        }
        switch (childId) {
        case 8:
            player.getClanWars().teleportViewing(-1);
            break;
        }
    }
}

