package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.GameDecoder;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Familiar;
import com.palidino.osrs.model.player.Hunter;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;

class NpcOption extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            71, 1, 33, 59, 31
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        int id = -1;
        int moveType = 0;
        if (super.index() == 0) {
            moveType = stream.getUReversedByte();
            id = stream.getUShortLE();
        } else if (super.index() == 1) {
            id = stream.getUShort128();
            moveType = stream.getUByte();
        } else if (super.index() == 2) {
            id = stream.getUShortLE128();
            moveType = stream.getUByte();
        } else if (super.index() == 3) {
            id = stream.getUShort();
            moveType = stream.getUByte128();
        } else if (super.index() == 4) {
            moveType = stream.getUByte();
            id = stream.getUShort128();
        }
        Npc npc = player.getWorld().getNPCByIndex(id);
        if (npc == null) {
            return;
        }
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message =
                    "[NpcOption(" + super.index() + ")] id=" + id + "; moveType=" + moveType + "; NPC=" + npc.getID();
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
        if (super.index() == 1 && npc.getMaxHitpoints() > 0) {
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
        if (complete(player)) {
            stop(player);
        } else {
            player.putAttribute("decodedpacket", this);
        }
    }

    @Override
    public boolean complete(Player player) {
        int id = player.getAttributeInt("decodedpacket_npc_index");
        Npc npc = player.getWorld().getNPCByIndex(id);
        if (npc == null) {
            return true;
        }
        int range = 1;
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
        @SuppressWarnings("unused")
        String scriptName = "npc_" + npc.getID();
        AchievementDiary.npcOptionHooks(player, super.index(), npc);
        if (player.getController().npcOptionHook(super.index(), npc)) {
            return true;
        }
        if (SkillContainer.npcOptionHooks(player, super.index(), npc)) {
            return true;
        }
        if (npc.getDef().isOption(super.index(), "pick-up") && Familiar.isPetNPC(npc.getID())) {
            player.getFamiliar().removeFamiliar();
            return true;
        }
        /*
         * if (invalid.contains(scriptName) || !DecodedPacketNpcOption.prototype.hasOwnProperty(scriptName))
         * { player.getGameEncoder().sendMessage("Nothing interesting happens."); return true; } try {
         * DecodedPacketNpcOption.prototype[scriptName](player, decodedPacket.index(), npc); } catch (e) {
         * invalid.add(scriptName); throw e; }
         */
        return true;
    }

    public void stop(Player player) {
        player.removeAttribute("decodedpacket_npc_index");
    }
}
