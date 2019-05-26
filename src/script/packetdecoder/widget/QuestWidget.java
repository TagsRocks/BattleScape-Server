package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.WidgetId;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;

public class QuestWidget {
    public static void widget629(Player player, int index, int childId, int slot, int itemId) {
        if (childId == 3) {
            player.getWidgetManager().sendQuestOverlay(WidgetId.QUEST);
        } else if (childId == 4) {
            player.getWidgetManager().sendQuestOverlay(WidgetId.ACHIEVEMENT_DIARY);
        }
    }

    public static void widget399(Player player, int index, int childId, int slot, int itemId) {}

    public static void widget259(Player player, int index, int childId, int slot, int itemId) {
        if (player.isLocked()) {
            return;
        }
        if (childId == 2) {
            if (slot == 2) {
                AchievementDiary.getDiary(AchievementDiary.Name.FALADOR).sendTaskList(player);
            } else {
                player.getGameEncoder().sendMessage("This diary is currently unavailable.");
            }
        }
    }
}

