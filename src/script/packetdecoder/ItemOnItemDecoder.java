package script.packetdecoder;

import com.palidino.io.Stream;
import com.palidino.osrs.io.PacketDecoder;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;
import lombok.var;
import script.packetdecoder.misc.ItemOnItemAction;

public class ItemOnItemDecoder extends PacketDecoder {
    public ItemOnItemDecoder() {
        super(63);
    }

    @Override
    public void execute(Player player, int index, int size, Stream stream) {
        var useWidgetHash = stream.getIntV2();
        var onWidgetHash = stream.getIntV3();
        var useSlot = stream.getUShortLE128();
        var useItemID = stream.getUShortLE();
        var onSlot = stream.getUShortLE();
        var onItemID = stream.getUShortLE128();
        var useWidgetID = useWidgetHash >> 16;
        var useChildID = useWidgetHash & 65535;
        var onWidgetID = onWidgetHash >> 16;
        var onChildID = onWidgetHash & 65535;
        if (useSlot == 65535) {
            useSlot = -1;
        }
        if (onSlot == 65535) {
            onSlot = -1;
        }
        var message = "[ItemOnItem] useWidgetID=" + useWidgetID + "; useChildID=" + useChildID + "; onWidgetID="
                + onWidgetID + "; onChildID=" + onChildID + "; useSlot=" + useSlot + "; onSlot=" + onSlot
                + "; useItemID=" + useItemID + "; onItemID=" + onItemID;
        if (player.getRights() == Player.RIGHTS_ADMIN) {
            Logger.println(message);
        }
        if (player.getOptions().getPrintPackets()) {
            player.getGameEncoder().sendMessage(message);
        }
        if (player.isLocked()) {
            return;
        }
        if (player.getMovement().isViewing()) {
            return;
        }
        if (!player.getWidgetManager().hasWidget(useWidgetID)) {
            return;
        }
        if (!player.getWidgetManager().hasWidget(onWidgetID)) {
            return;
        }
        player.clearIdleTime();
        if (player.getController().itemOnItemHook(useWidgetID, useChildID, onWidgetID, onChildID, useSlot, onSlot,
                useItemID, onItemID)) {
            return;
        }
        if (SkillContainer.widgetOnWidgetHooks(player, useWidgetID, useChildID, onWidgetID, onChildID, useSlot,
                useItemID, onSlot, onItemID)) {
            return;
        }
        ItemOnItemAction.doAction(player, useWidgetID, useChildID, onWidgetID, onChildID, useSlot, onSlot, useItemID,
                onItemID);
    }
}
