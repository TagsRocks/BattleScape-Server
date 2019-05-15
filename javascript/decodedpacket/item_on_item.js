/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacketItemOnItem() {
    var decodedPacket = new DecodedPacket() {
        execute: function(player, stream) {
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
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[ItemOnItem] useWidgetID=" + useWidgetID + "; useChildID=" + useChildID
                        + "; onWidgetID=" + onWidgetID + "; onChildID=" + onChildID + "; useSlot=" + useSlot
                        + "; onSlot=" + onSlot + "; useItemID=" + useItemID + "; onItemID=" + onItemID;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            if (player.isLocked() || player.getMovement().isViewing()
                    || !player.getWidgetManager().hasWidget(useWidgetID)
                    || !player.getWidgetManager().hasWidget(onWidgetID)) {
                return;
            }
            player.clearIdleTime();
            if (player.getController().itemOnItemHook(useWidgetID, useChildID, onWidgetID, onChildID, useSlot,
                    onSlot, useItemID, onItemID)) {
                return;
            }
            if (SkillContainer.widgetOnWidgetHooks(player, useWidgetID, useChildID, onWidgetID, onChildID,
                    useSlot, useItemID, onSlot, onItemID)) {
                return;
            }
            DecodedPacketItemOnItem.prototype["doAction"](player, useWidgetID, useChildID, onWidgetID, onChildID,
                    useSlot, onSlot, useItemID, onItemID);
        }
    };
    return decodedPacket;
}

function DecodedPacket63() {
    return new DecodedPacketItemOnItem();
}
