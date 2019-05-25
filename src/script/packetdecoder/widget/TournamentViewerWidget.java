package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class TournamentViewerWidget {
    public static void widget130(Player player, int index, int childID, int slot, int itemID) {
        if (player.isLocked()) {
            return;
        }
        if (player.getMovement().getTeleporting() || player.getMovement().getTeleported()
                || player.getMovement().isViewing()) {
            return;
        }
        switch (childID) {
        case 8:
            player.getClanWars().teleportViewing(-1);
            break;
        }
    }
}

