/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacketMapItemOption(index) {
    var decodedPacket = new DecodedPacket(index) {
        execute: function(player, stream) {
            var id = -1;
            var x = -1;
            var y = -1;
            var moveType = 0;
            if (decodedPacket.index() == 2) {
                y = stream.getUShortLE();
                moveType = stream.getU128Byte();
                x = stream.getUShortLE();
                id = stream.getUShortLE();
            }
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[MapItemOption(" + decodedPacket.index() + ")] id=" + id + "; x=" + x
                        + "; y=" + y + "; moveType=" + moveType;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            if (player.isLocked() || player.getMovement().isViewing()) {
                return;
            }
            player.clearIdleTime();
            player.getMovement().fullRoute(x, y, moveType);
            player.putAttribute("decodedpacket_item_id", id);
            player.putAttribute("decodedpacket_item_x", x);
            player.putAttribute("decodedpacket_item_y", y);
            if (decodedPacket.complete(player)) {
                decodedPacket.stop(player);
            } else {
                player.putAttribute("decodedpacket", decodedPacket);
            }
        },

        complete: function(player) {
            var id = player.getAttributeInt("decodedpacket_item_id");
            var x = player.getAttributeInt("decodedpacket_item_x");
            var y = player.getAttributeInt("decodedpacket_item_y");
            var reach = 0;
            var t = new Tile(x, y, player.getHeight());
            if (!player.getMovement().isRouting() && player.withinDistance(t, 1)
                    && Route.canReachTile(player, t, true)) {
                reach = 1;
            }
            if (player.isLocked() || !player.withinDistance(t, reach)) {
                return false;
            }
            if (reach == 1 && !player.withinDistance(t, 0)) {
                player.setAnimation(827);
            }
            player.getMovement().clear();
            if (decodedPacket.index() == 2) {
                var isStackableAndCarrying = ItemDef.getStackable(id) && player.getInventory().hasItem(id);
                var result = player.getWorld().pickupMapItem(player, id, x, y);
                if (result.partialSuccess() && (id == ItemID.BLOODY_KEY || id == ItemID.BLOODIER_KEY)
                        && (player.getController().inWilderness() || player.getController().inPvPWorld())) {
                    player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
                    player.getMovement().setEnergy(0);
                    player.getGameEncoder().sendMessage("<col=ff0000>Carrying the key prevents you from teleporting.");
                    if (id == ItemID.BLOODIER_KEY) {
                        player.getWorld().sendNews("A " + ItemDef.getName(id) + " has been picked up by "
                                + player.getUsername() + " at level " + player.getWildernessLevel() + " wilderness!");
                    }
                } else if (result.partialSuccess() && result.getSlot() != -1 && !isStackableAndCarrying
                        && player.getInventory().hasItem(ItemID.LOOTING_BAG_22586)) {
                    player.putAttribute("looting_bag_item_slot", result.getSlot());
                    Dialogue.executeScript(player, "lootingbag", 0, 4);
                    player.removeAttribute("looting_bag_item_slot");
                }
            }
            return true;
        },

        stop: function(player) {
            player.removeAttribute("decodedpacket_item_id");
            player.removeAttribute("decodedpacket_item_x");
            player.removeAttribute("decodedpacket_item_y");
        }
    };
    return decodedPacket;
}

function DecodedPacket6() {
    return new DecodedPacketMapItemOption(2);
}
