package script.packetdecoder;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import com.palidino.io.FileManager;
import com.palidino.io.Stream;
import com.palidino.osrs.io.PacketDecoder;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;
import lombok.var;

public class WidgetDecoder extends PacketDecoder {
    private static Map<Integer, Method> actionMethods = new HashMap<>();

    public WidgetDecoder() {
        super(68, 21, 48, 19, 40, 66, 85, 14, 84, 0, 69, 39);
    }

    @Override
    public void execute(Player player, int index, int size, Stream stream) {
        var widgetHash = -1;
        var slot = -1;
        var itemID = -1;
        if (index == 11) {
            widgetHash = stream.getIntV3();
            slot = stream.getUShort128();
        } else {
            widgetHash = stream.getInt();
            slot = -1;
            itemID = -1;
            if (size == 8) {
                slot = stream.getUShort();
                itemID = stream.getUShort();
            }
        }
        var widgetID = widgetHash >> 16;
        var childID = widgetHash & 65535;
        if (slot == 65535) {
            slot = -1;
        }
        if (itemID == 65535) {
            itemID = -1;
        }
        var message = "[Widget(" + index + ")] widgetID=" + widgetID + "; childID=" + childID + "; slot=" + slot
                + "; itemID=" + itemID;
        if (player.getRights() == Player.RIGHTS_ADMIN) {
            Logger.println(message);
        }
        if (player.getOptions().getPrintPackets()) {
            player.getGameEncoder().sendMessage(message);
        }
        if (!player.getWidgetManager().hasWidget(widgetID)) {
            return;
        }
        if (index >= 10) {
            index = 0;
        }
        player.clearIdleTime();
        AchievementDiary.widgetHooks(player, index, widgetID, childID, slot, itemID);
        if (player.getController().widgetHook(index, widgetID, childID, slot, itemID)) {
            return;
        }
        if (player.getRandomEvent().widgetHook(index, widgetID, childID, slot, itemID)) {
            return;
        }
        if (SkillContainer.widgetHooks(player, index, widgetID, childID, slot, itemID)) {
            return;
        }
        executeAction(player, index, widgetID, childID, slot, itemID);
    }

    public static void executeAction(Player player, int index, int widgetID, int childID, int slot, int itemID) {
        var actionMethod = actionMethods.get(widgetID);
        if (actionMethod != null) {
            try {
                actionMethod.invoke(null, player, index, childID, slot, itemID);
            } catch (Exception e) {
                Logger.error(e);
            }
        }
    }

    static {
        try {
            var classes = FileManager.getClassScripts("packetdecoder.widget");
            for (var className : classes) {
                var classReference = Class.forName(className);
                for (var m : classReference.getMethods()) {
                    if ((m.getModifiers() & Modifier.STATIC) == 0) {
                        continue;
                    }
                    if (!m.getName().matches("widget[0-9]+")) {
                        continue;
                    }
                    actionMethods.put(Integer.parseInt(m.getName().substring(6)), m);
                }
            }
        } catch (Exception e) {
            Logger.error(e);
        }
    }
}
