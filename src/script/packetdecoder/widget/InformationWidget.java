package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class InformationWidget {
    public static void widget702(Player player, int index, int childID, int slot, int itemID) {
        if (childID == 2) {
            player.getWidgetManager().setQuestIndex(0);
            player.getWidgetManager().resetQuestText();
        } else if (childID == 5) {
            player.getWidgetManager().setQuestIndex(1);
            player.getWidgetManager().resetQuestText();
        } else if (childID == 8) {
            player.getWidgetManager().setQuestIndex(2);
            player.getWidgetManager().resetQuestText();
        } else if (childID == 11) {
            player.getWidgetManager().setQuestIndex(3);
            player.getWidgetManager().resetQuestText();
        } else if (childID == 14) {
            player.getOptions().openBondsMenu();
            // player.getWidgetManager().setQuestIndex(4);
            // player.getWidgetManager().resetQuestText();
        } else {
            player.getWidgetManager().questAction(childID - 33);
        }
    }
}

