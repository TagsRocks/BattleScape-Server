package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.WidgetChild;
import com.palidino.osrs.model.player.Player;

public class ViewportWidget {
    public static void widget548(Player player, int index, int childId, int slot, int itemId) {
        // Fixed screen
        WidgetChild.FixedViewport child = WidgetChild.FixedViewport.getByChild(childId);
        if (child.getIcon() != null) {
            player.getOptions().setViewingIcon(child.getIcon());
            if (child.getIcon() == WidgetChild.ViewportIcon.QUESTS) {
                player.getWidgetManager().sendQuestOverlay();
            } else if (child.getIcon() == WidgetChild.ViewportIcon.MAGIC && index == 1) {
                player.getMagic().setDisableSpellFiltering(!player.getMagic().getDisableSpellFiltering());
            }
        }
    }

    public static void widget161(Player player, int index, int childId, int slot, int itemId) {
        // Resizable box
        WidgetChild.ResizeableBoxViewport child = WidgetChild.ResizeableBoxViewport.getByChild(childId);
        if (child.getIcon() != null) {
            player.getOptions().setViewingIcon(child.getIcon());
            if (child.getIcon() == WidgetChild.ViewportIcon.QUESTS) {
                player.getWidgetManager().sendQuestOverlay();
            } else if (child.getIcon() == WidgetChild.ViewportIcon.MAGIC && index == 1) {
                player.getMagic().setDisableSpellFiltering(!player.getMagic().getDisableSpellFiltering());
            }
        }
    }

    public static void widget164(Player player, int index, int childId, int slot, int itemId) {
        // Resizable line
        WidgetChild.ResizeableLineViewport child = WidgetChild.ResizeableLineViewport.getByChild(childId);
        if (child.getIcon() != null) {
            player.getOptions().setViewingIcon(child.getIcon());
            if (child.getIcon() == WidgetChild.ViewportIcon.QUESTS) {
                player.getWidgetManager().sendQuestOverlay();
            } else if (child.getIcon() == WidgetChild.ViewportIcon.MAGIC && index == 1) {
                player.getMagic().setDisableSpellFiltering(!player.getMagic().getDisableSpellFiltering());
            }
        }
    }
}

