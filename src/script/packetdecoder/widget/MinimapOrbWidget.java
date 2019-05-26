package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class MinimapOrbWidget {
    public static void widget160(Player player, int index, int childId, int slot, int itemId) {
        switch (childId) {
        case 1:
            if (index == 0) {
                player.getXPDrops().switchShow();
            } else if (index == 1) {
                player.getXPDrops().openSetup();
            }
            break;
        case 14:
            if (index == 0) {
                player.getPrayer().activateQuick();
            } else if (index == 1) {
                player.getPrayer().switchQuick();
            }
            break;
        case 22:
            player.getMovement().setRunning(!player.getMovement().getRunning());
            break;
        case 30:
            player.getCombat().activateSpecialAttack();
            break;
        case 43:
            if (index == 0) {
                player.getWidgetManager().changeWorldMapState();
            } else if (index == 1) {
                player.getWidgetManager().sendWorldMap(true);
            }
            break;
        }
    }
}

