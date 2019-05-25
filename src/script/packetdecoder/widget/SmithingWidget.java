package script.packetdecoder.widget;

import com.palidino.osrs.io.ValueEnteredEvent;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Smithing;

public class SmithingWidget {
    public static void widget312(Player player, int index, int childID, int slot, int itemID) {
        if (player.isLocked()) {
            return;
        }
        int selected = childID - 2;
        int[] itemArray = (int[]) player.getAttribute("smithing_ids");
        if (itemArray == null || selected < 0 || selected >= itemArray.length) {
            return;
        }
        int smithID = itemArray[selected];
        if (index == 0) {
            Smithing.start(player, smithID, 1);
        } else if (index == 1) {
            Smithing.start(player, smithID, 5);
        } else if (index == 2) {
            Smithing.start(player, smithID, 10);
        } else if (index == 3) {
            player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                @Override
                public void execute(int value) {
                    Smithing.start(player, smithID, value);
                }
            });
        } else if (index == 4) {
            Smithing.start(player, smithID, 28);
        }
    }
}

