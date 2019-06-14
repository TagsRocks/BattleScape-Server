package script.packetdecoder.widget;

import com.palidino.osrs.io.ValueEnteredEvent;
import com.palidino.osrs.model.player.Player;

public class BlacklistWidget {
    public static void widget706(Player player, int index, int childId, int slot, int itemId) {
        if (player.isLocked()) {
            return;
        }
        if (player.getController().inWilderness()) {
            player.getGameEncoder().sendMessage("You can't use the blacklist while in the Wilderness.");
            return;
        }
        if (childId >= 18 && childId <= 27) {
            player.getCombat().getEdgevilleBlacklist().removeName(childId - 18);
        } else if (childId == 28) {
            player.getGameEncoder().sendEnterString("Enter Name:", new ValueEnteredEvent.StringEvent() {
                @Override
                public void execute(String value) {
                    player.getCombat().getEdgevilleBlacklist().addName(value);
                }
            });
        }
    }
}

