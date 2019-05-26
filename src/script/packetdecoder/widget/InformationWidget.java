package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class InformationWidget {
    public static void widget702(Player player, int index, int childId, int slot, int itemId) {
        if (childId == 2) {
            player.getWidgetManager().setQuestIndex(0);
            player.getWidgetManager().resetQuestText();
        } else if (childId == 5) {
            player.getWidgetManager().setQuestIndex(1);
            player.getWidgetManager().resetQuestText();
        } else if (childId == 8) {
            player.getWidgetManager().setQuestIndex(2);
            player.getWidgetManager().resetQuestText();
        } else if (childId == 11) {
            player.getWidgetManager().setQuestIndex(3);
            player.getWidgetManager().resetQuestText();
        } else if (childId == 14) {
            player.getOptions().openBondsMenu();
            // player.getWidgetManager().setQuestIndex(4);
            // player.getWidgetManager().resetQuestText();
        } else {
            player.getWidgetManager().questAction(childId - 33);
        }
    }
}

