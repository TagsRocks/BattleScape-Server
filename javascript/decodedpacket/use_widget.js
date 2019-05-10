/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacketWidgetOnEntity(index) {
    var decodedPacket = new DecodedPacket(index) {
        execute: function(player, stream) {
            var widgetHash = -1;
            var slot = -1;
            var itemID = -1;
            var id = -1;
            var moveType = 0;
            if (decodedPacket.index() == 0) {
                id = stream.getUShortLE128();
                moveType = stream.getUReversedByte();
                widgetHash = stream.getIntLE();
                slot = stream.getUShort128();
            } else if (decodedPacket.index() == 1) {
                widgetHash = stream.getIntV3();
                moveType = stream.getU128Byte();
                slot = stream.getUShort128();
                id = stream.getUShort();
            } else if (decodedPacket.index() == 2) {
                itemID = stream.getUShortLE128();
                slot = stream.getUShort();
                id = stream.getUShortLE128();
                moveType = stream.getUReversedByte();
                widgetHash = stream.getInt();
            } else if (decodedPacket.index() == 3) {
                slot = stream.getUShortLE128();
                moveType = stream.getU128Byte();
                widgetHash = stream.getIntV2();
                id = stream.getUShort();
                itemID = stream.getUShort();
            }
            var widgetID = widgetHash >> 16;
            var childID = widgetHash & 65535;
            if (slot == 65535) {
                slot = -1;
            }
            var entity = (decodedPacket.index() == 0 || decodedPacket.index() == 2)
                    ? player.getWorld().getNPCByIndex(id) : player.getWorld().getPlayerByIndex(id);
            if (entity == null) {
                return;
            }
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[WidgetOnEntity(" + decodedPacket.index() + ")] widgetID="
                        + widgetID + "; childID=" + childID + "; itemID=" + itemID + "; slot=" + slot
                        + "; id=" + id + "; moveType=" + moveType + "; " + ((decodedPacket.index() == 0
                        || decodedPacket.index() == 2) ? ("NPC=" + entity.getID())
                        : ("Player=" + entity.getUsername()));
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            if (player.isLocked()) {
                return;
            }
            player.clearIdleTime();
            player.clearAllActions(false, true);
            player.setFaceEntity(entity);
            player.getMovement().setFollowing(entity);
            if (widgetID == WidgetID.SPELLBOOK) {
                player.getMagic().setSingleSpellID(childID);
                player.setAttacking(true);
                player.setEngagingEntity(entity);
                player.getCombat().setFollowing(entity);
                player.getMovement().follow();
                player.setFaceTile(entity);
                return;
            }
            player.getMovement().fullRoute(entity, moveType);
            player.putAttribute("decodedpacket_interface_id", widgetID);
            player.putAttribute("decodedpacket_child_id", childID);
            player.putAttribute("decodedpacket_slot", slot);
            player.putAttribute((decodedPacket.index() == 0 || decodedPacket.index() == 2)
                    ? "decodedpacket_npc_index" : "decodedpacket_player_index", id);
            if (decodedPacket.complete(player)) {
                decodedPacket.stop(player);
            } else {
                player.putAttribute("decodedpacket", decodedPacket);
            }
        },

        complete: function(player) {
            var widgetID = player.getAttributeInt("decodedpacket_interface_id");
            var childID = player.getAttributeInt("decodedpacket_child_id");
            var slot = player.getAttributeInt("decodedpacket_slot");
            var id = player.getAttributeInt((decodedPacket.index() == 0 || decodedPacket.index() == 2)
                    ? "decodedpacket_npc_index" : "decodedpacket_player_index");
            var entity = (decodedPacket.index() == 0 || decodedPacket.index() == 2)
                    ? player.getWorld().getNPCByIndex(id) : player.getWorld().getPlayerByIndex(id);
            if (entity == null || !player.getWidgetManager().hasWidget(widgetID)) {
                return true;
            }
            if (player.isLocked() || !player.withinDistance(entity, 1)) {
                return false;
            }
            if (!Route.canReachEntity(player, entity, false)) {
                return false;
            }
            player.getMovement().clear();
            player.setFaceTile(entity);
            if (player.getController().widgetOnEntityHook(widgetID, childID, slot, entity)) {
                return true;
            }
            var scriptName = "doAction" + ((decodedPacket.index() == 0 || decodedPacket.index() == 2)
                    ? "NPC" : "Player");
            DecodedPacketWidgetOnEntity.prototype[scriptName](player, decodedPacket.index(), widgetID, childID,
                    slot, entity);
            return true;
        },

        stop: function(player) {
            player.removeAttribute("decodedpacket_interface_id");
            player.removeAttribute("decodedpacket_child_id");
            player.removeAttribute("decodedpacket_slot");
            player.removeAttribute((decodedPacket.index() == 0 || decodedPacket.index() == 2)
                    ? "decodedpacket_npc_index" : "decodedpacket_player_index");
        }
    };
    return decodedPacket;
}

function DecodedPacketWidgetOnWidget() {
    var decodedPacket = new DecodedPacket() {
        execute: function(player, stream) {
            var useWidgetHash = stream.getIntV2();
            var onWidgetHash = stream.getInt();
            var onSlot = stream.getUShort();
            var onItemID = stream.getUShortLE();
            var useItemID = stream.getUShortLE();
            var useWidgetID = useWidgetHash >> 16;
            var onWidgetID = onWidgetHash >> 16;
            var useChildID = useWidgetHash & 65535;
            var onChildID = onWidgetHash & 65535;
            var useSlot = -1;
            if (useItemID == 65535) {
                useItemID = -1;
            }
            if (onItemID == 65535) {
                onItemID = -1;
            }
            if (useSlot == 65535) {
                useSlot = -1;
            }
            if (onSlot == 65535) {
                onSlot = -1;
            }
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[WidgetOnWidget] useWidgetID="
                        + useWidgetID + "; useChildID=" + useChildID + "; onWidgetID=" + onWidgetID
                        + "; onChildID=" + onChildID + "; useItemID=" + useItemID + "; onItemID=" + onItemID
                        + "; onSlot=" + onSlot;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            if (player.isLocked()) {
                return;
            }
            player.clearAllActions(false, true);
            player.putAttribute("decodedpacket_use_interface_id", useWidgetID);
            player.putAttribute("decodedpacket_use_child_id", useChildID);
            player.putAttribute("decodedpacket_on_interface_id", onWidgetID);
            player.putAttribute("decodedpacket_on_child_id", onChildID);
            player.putAttribute("decodedpacket_use_item_id", useItemID);
            player.putAttribute("decodedpacket_use_slot", useSlot);
            player.putAttribute("decodedpacket_on_slot", onSlot);
            player.putAttribute("decodedpacket_on_item_id", onItemID);
            if (decodedPacket.complete(player)) {
                decodedPacket.stop(player);
            } else {
                player.putAttribute("decodedpacket", decodedPacket);
            }
        },

        complete: function(player) {
            var useWidgetID = player.getAttributeInt("decodedpacket_use_interface_id");
            var useChildID = player.getAttributeInt("decodedpacket_use_child_id");
            var onWidgetID = player.getAttributeInt("decodedpacket_on_interface_id");
            var onChildID = player.getAttributeInt("decodedpacket_on_child_id");
            var useSlot = player.getAttributeInt("decodedpacket_use_slot");
            var useItemID = player.getAttributeInt("decodedpacket_use_item_id");
            var onSlot = player.getAttributeInt("decodedpacket_on_slot");
            var onItemID = player.getAttributeInt("decodedpacket_on_item_id");
            if (!player.getWidgetManager().hasWidget(useWidgetID)
                    || !player.getWidgetManager().hasWidget(onWidgetID)) {
                return true;
            }
            if (player.isLocked() || player.getUseWidgetOnWidgetDelay() > 0) {
                return false;
            }
            player.setUseWidgetOnWidgetDelay(5);
            if (player.getController().widgetOnWidgetHook(useWidgetID, useChildID, onWidgetID, onChildID,
                    useSlot, useItemID, onSlot, onItemID)) {
                return true;
            }
            if (SkillContainer.widgetOnWidgetHooks(player, useWidgetID, useChildID, onWidgetID, onChildID,
                    useSlot, useItemID, onSlot, onItemID)) {
                return;
            }
            DecodedPacketWidgetOnWidget.prototype["doAction"](player, useWidgetID, useChildID, onWidgetID,
                    onChildID, useSlot, useItemID, onSlot, onItemID);
            return true;
        },

        stop: function(player) {
            player.removeAttribute("decodedpacket_use_interface_id");
            player.removeAttribute("decodedpacket_use_child_id");
            player.removeAttribute("decodedpacket_on_interface_id");
            player.removeAttribute("decodedpacket_on_child_id");
            player.removeAttribute("decodedpacket_use_slot");
            player.removeAttribute("decodedpacket_use_item_id");
            player.removeAttribute("decodedpacket_on_slot");
            player.removeAttribute("decodedpacket_on_item_id");
        }
    };
    return decodedPacket;
}

function DecodedPacketWidgetOnMapObject(index) {
    var decodedPacket = new DecodedPacket(index) {
        execute: function(player, stream) {
            var x = 0;
            var y = 0;
            var id = -1;
            var slot = -1;
            var itemID = -1;
            var widgetHash = -1;
            var moveType = 0;
            if (decodedPacket.index() == 0) {
                y = stream.getUShortLE128();
                slot = stream.getUShortLE();
                moveType = stream.getUByte128();
                widgetHash = stream.getIntLE();
                x = stream.getUShortLE128();
                id = stream.getUShort();
                itemID = stream.getUShortLE();
            } else if (decodedPacket.index() == 1) {
                moveType = stream.getUByte();
                x = stream.getUShort();
                id = stream.getUShort128();
                widgetHash = stream.getIntV3();
                itemID = stream.getUShort();
                y = stream.getUShortLE();
            }
            var widgetID = widgetHash >> 16;
            var childID = widgetHash & 65535;
            if (slot == 65535) {
                slot = -1;
            }
            var mapObject = player.getController().getMapObject(id, x, y, player.getClientHeight());
            if (mapObject == null) {
                return;
            }
            if (player.getHeight() != player.getClientHeight()) {
                if (mapObject.getDef().hasOption("open") || mapObject.getDef().hasOption("close")) {
                    return;
                }
            }
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[WidgetOnMapObject] widgetID=" + widgetID + "; childID=" + childID
                        + "; slot=" + slot + "; itemID=" + itemID + "; id=" + id + "; x=" + x
                        + "; y=" + y + "; moveType=" + moveType;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            if (player.isLocked()) {
                return;
            }
            player.clearAllActions(false, true);
            player.getMovement().fullRoute(mapObject, moveType);
            player.putAttribute("decodedpacket_interface_id", widgetID);
            player.putAttribute("decodedpacket_child_id", childID);
            player.putAttribute("decodedpacket_slot", slot);
            player.putAttribute("decodedpacket_object_id", id);
            player.putAttribute("decodedpacket_object_x", x);
            player.putAttribute("decodedpacket_object_y", y);
            if (decodedPacket.complete(player)) {
                decodedPacket.stop(player);
            } else {
                player.putAttribute("decodedpacket", decodedPacket);
            }
        },

        complete: function(player) {
            var widgetID = player.getAttributeInt("decodedpacket_interface_id");
            var childID = player.getAttributeInt("decodedpacket_child_id");
            var slot = player.getAttributeInt("decodedpacket_slot");
            var id = player.getAttributeInt("decodedpacket_object_id");
            var x = player.getAttributeInt("decodedpacket_object_x");
            var y = player.getAttributeInt("decodedpacket_object_y");
            var mapObject = player.getController().getMapObject(id, x, y, player.getClientHeight());
            if (mapObject == null || !player.getWidgetManager().hasWidget(widgetID)) {
                return true;
            }
            var range = 1;
            if (mapObject.getType() >= 4 && mapObject.getType() <= 8) {
                range = 0;
            }
            var canReach = !player.getMovement().isRouting() && player.withinDistanceC(mapObject, range);
            if (mapObject.getID() == 5249) {
                canReach = player.withinDistanceC(mapObject, range);
            }
            if (player.isLocked() || !canReach) {
                return false;
            }
            player.getMovement().clear();
            player.setFaceTile(mapObject);
            if (player.getController().widgetOnMapObjectHook(widgetID, childID, slot, mapObject)) {
                return true;
            }
            if (SkillContainer.widgetOnMapObjectHooks(player, widgetID, childID, slot, mapObject)) {
                return true;
            }
            if (player.getFarming().widgetOnMapObjectHook(widgetID, childID, slot, mapObject)) {
                return true;
            }
            if (Runecrafting.widgetOnMapObjectHook(player, widgetID, childID, slot, mapObject)) {
                return true;
            }
            DecodedPacketWidgetOnMapObject.prototype["doAction"](player, widgetID, childID, slot, mapObject);
            return true;
        },

        stop: function(player) {
            player.removeAttribute("decodedpacket_interface_id");
            player.removeAttribute("decodedpacket_child_id");
            player.removeAttribute("decodedpacket_slot");
            player.removeAttribute("decodedpacket_object_id");
            player.removeAttribute("decodedpacket_object_x");
            player.removeAttribute("decodedpacket_object_y");
        }
    };
    return decodedPacket;
}

function DecodedPacket86() { // Widget on NPC
    return new DecodedPacketWidgetOnEntity(0);
}

function DecodedPacket55() { // Widget on player
    return new DecodedPacketWidgetOnEntity(1);
}

function DecodedPacket23() { // Inventory on NPC
    return new DecodedPacketWidgetOnEntity(2);
}

function DecodedPacket81() { // Inventory on player
    return new DecodedPacketWidgetOnEntity(3);
}

function DecodedPacket2() {
    return new DecodedPacketWidgetOnWidget();
}

function DecodedPacket44() {
    return new DecodedPacketWidgetOnMapObject(0);
}

function DecodedPacket92() {
    return new DecodedPacketWidgetOnMapObject(1);
}
