/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacketNpcOption(index) {
    var invalid = new ArrayList();
    var decodedPacket = new DecodedPacket(index) {
        execute: function(player, stream) {
            var id = -1;
            var moveType = 0;
            if (decodedPacket.index() == 0) {
                moveType = stream.getUReversedByte();
                id = stream.getUShortLE();
            } else if (decodedPacket.index() == 1) {
                id = stream.getUShort128();
                moveType = stream.getUByte();
            } else if (decodedPacket.index() == 2) {
                id = stream.getUShortLE128();
                moveType = stream.getUByte();
            } else if (decodedPacket.index() == 3) {
                id = stream.getUShort();
                moveType = stream.getUByte128();
            } else if (decodedPacket.index() == 4) {
                moveType = stream.getUByte();
                id = stream.getUShort128();
            }
            var npc = player.getWorld().getNPCByIndex(id);
            if (npc == null) {
                return;
            }
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[NpcOption(" + decodedPacket.index() + ")] id=" + id
                        + "; moveType=" + moveType + "; NPC=" + npc.getID();
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            if (player.isLocked() || player.getMovement().isViewing()) {
                return;
            }
            player.clearIdleTime();
            player.clearAllActions(false, true);
            player.setFaceEntity(npc);
            if (npc.getMoveRange() == null && !npc.getDef().getName().equals("Fishing spot")) {
                player.getMovement().setFollowFront(npc);
            } else {
                player.getMovement().setFollowing(npc);
            }
            if (decodedPacket.index() == 1 && npc.getMaxHitpoints() > 0) {
                player.setAttacking(true);
                player.setEngagingEntity(npc);
                player.getCombat().setFollowing(npc);
                player.getMovement().follow();
                if (player.getMagic().getAutoSpellID() != 0 && player.getHitDelay() <= 0) {
                    player.setHitDelay(2);
                }
                return;
            }
            player.getMovement().follow();
            player.putAttribute("decodedpacket_npc_index", id);
            if (decodedPacket.complete(player)) {
                decodedPacket.stop(player);
            } else {
                player.putAttribute("decodedpacket", decodedPacket);
            }
        },

        complete: function(player) {
            var id = player.getAttributeInt("decodedpacket_npc_index");
            var npc = player.getWorld().getNPCByIndex(id);
            if (npc == null) {
                return true;
            }
            var range = 1;
            if (npc.getDef().hasOption("bank")) {
                range = 2;
            }
            if (player.getMovement().isRouting() && npc.getMovement().isRouting()) {
                range++;
            }
            if (player.isLocked() || !player.withinDistance(npc, range)) {
                return false;
            }
            if (!npc.getMovement().isRouting() && npc.getSizeX() == 1 && player.getX() != npc.getX()
                    && player.getY() != npc.getY()) {
                return false;
            }
            if (Hunter.getHuntedNPC(npc.getID()) != null && !player.getHunter().catchNPCStage(npc)) {
                return false;
            }
            player.setFaceEntity(null);
            player.getMovement().setFollowing(null);
            if (player.getX() == npc.getX() || player.getY() == npc.getY()) {
                player.getMovement().clear();
            }
            player.setFaceTile(npc);
            var scriptName = "npc_" + npc.getID();
            AchievementDiary.npcOptionHooks(player, decodedPacket.index(), npc);
            if (player.getController().npcOptionHook(decodedPacket.index(), npc)) {
                return true;
            }
            if (SkillContainer.npcOptionHooks(player, decodedPacket.index(), npc)) {
                return true;
            }
            if (npc.getDef().isOption(decodedPacket.index(), "pick-up") && Familiar.isPetNPC(npc.getID())) {
                player.getFamiliar().removeFamiliar();
                return true;
            }
            if (invalid.contains(scriptName) || !DecodedPacketNpcOption.prototype.hasOwnProperty(scriptName)) {
                player.getGameEncoder().sendMessage("Nothing interesting happens.");
                return true;
            }
            try {
                DecodedPacketNpcOption.prototype[scriptName](player, decodedPacket.index(), npc);
            } catch (e) {
                invalid.add(scriptName);
                throw e;
            }
            return true;
        },

        stop: function(player) {
            player.removeAttribute("decodedpacket_npc_index");
        }
    };
    return decodedPacket;
}

function DecodedPacket71() {
    return new DecodedPacketNpcOption(0);
}

function DecodedPacket1() {
    return new DecodedPacketNpcOption(1);
}

function DecodedPacket33() {
    return new DecodedPacketNpcOption(2);
}

function DecodedPacket59() {
    return new DecodedPacketNpcOption(3);
}

function DecodedPacket31() {
    return new DecodedPacketNpcOption(4);
}
