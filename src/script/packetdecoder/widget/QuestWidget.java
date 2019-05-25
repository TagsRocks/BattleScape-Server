package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;

public class QuestWidget {
    public static void widget629(Player player, int index, int childID, int slot, int itemID) {
        if (childID == 3) {
            player.getWidgetManager().sendQuestOverlay(WidgetID.QUEST);
        } else if (childID == 4) {
            player.getWidgetManager().sendQuestOverlay(WidgetID.ACHIEVEMENT_DIARY);
        }
    }

    public static void widget399(Player player, int index, int childID, int slot, int itemID) {}

    public static void widget259(Player player, int index, int childID, int slot, int itemID) {
        if (player.isLocked()) {
            return;
        }
        if (childID == 2) {
            if (slot == 2) {
                AchievementDiary.getDiary(AchievementDiary.Name.FALADOR).sendTaskList(player);
            } else {
                player.getGameEncoder().sendMessage("This diary is currently unavailable.");
            }
        }
    }
}

