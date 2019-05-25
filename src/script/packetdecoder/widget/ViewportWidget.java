package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.WidgetChild;
import com.palidino.osrs.model.player.Player;

public class ViewportWidget {
    public static void widget548(Player player, int index, int childID, int slot, int itemID) {
        // Fixed screen
        WidgetChild.FixedViewport child = WidgetChild.FixedViewport.getByChild(childID);
        if (child.getIcon() != null) {
            player.getOptions().setViewingIcon(child.getIcon());
            if (child.getIcon() == WidgetChild.ViewportIcon.QUESTS) {
                player.getWidgetManager().sendQuestOverlay();
            } else if (child.getIcon() == WidgetChild.ViewportIcon.MAGIC && index == 1) {
                player.getMagic().setDisableSpellFiltering(!player.getMagic().getDisableSpellFiltering());
            }
        }
    }

    public static void widget161(Player player, int index, int childID, int slot, int itemID) {
        // Resizable box
        WidgetChild.ResizeableBoxViewport child = WidgetChild.ResizeableBoxViewport.getByChild(childID);
        if (child.getIcon() != null) {
            player.getOptions().setViewingIcon(child.getIcon());
            if (child.getIcon() == WidgetChild.ViewportIcon.QUESTS) {
                player.getWidgetManager().sendQuestOverlay();
            } else if (child.getIcon() == WidgetChild.ViewportIcon.MAGIC && index == 1) {
                player.getMagic().setDisableSpellFiltering(!player.getMagic().getDisableSpellFiltering());
            }
        }
    }

    public static void widget164(Player player, int index, int childID, int slot, int itemID) {
        // Resizable line
        WidgetChild.ResizeableLineViewport child = WidgetChild.ResizeableLineViewport.getByChild(childID);
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

