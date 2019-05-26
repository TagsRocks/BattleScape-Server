package script.packetdecoder.widget;

import com.palidino.osrs.model.player.Player;

public class PrayerWidget {
    public static void widget541(Player player, int index, int childId, int slot, int itemId) {
        // Tab
        player.getPrayer().activate(childId);
    }

    public static void widget77(Player player, int index, int childId, int slot, int itemId) {
        // Quick
        switch (childId) {
        case 4:
            int prayerOffset = 5;
            if (slot <= 23 || slot >= 27) {
                player.getPrayer().activate(slot + prayerOffset);
            } else if (slot == 24) {
                player.getPrayer().activate(slot + prayerOffset + 2);
            } else if (slot == 25 || slot == 26) {
                player.getPrayer().activate(slot + prayerOffset - 1);
            }
            break;
        case 5:
            player.getPrayer().switchQuick();
            break;
        }
    }
}

