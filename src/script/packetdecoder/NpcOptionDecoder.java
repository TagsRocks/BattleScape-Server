package script.packetdecoder;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import com.palidino.io.Stream;
import com.palidino.osrs.io.PacketDecoder;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Familiar;
import com.palidino.osrs.model.player.Hunter;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;
import lombok.var;

public class NpcOptionDecoder extends PacketDecoder {
    private static Map<Integer, Method> actionMethods = new HashMap<>();

    public NpcOptionDecoder() {
        super(71, 1, 33, 59, 31);
    }

    @Override
    public void execute(Player player, int index, int size, Stream stream) {
        var id = -1;
        var moveType = 0;
        if (index == 0) {
            moveType = stream.getUReversedByte();
            id = stream.getUShortLE();
        } else if (index == 1) {
            id = stream.getUShort128();
            moveType = stream.getUByte();
        } else if (index == 2) {
            id = stream.getUShortLE128();
            moveType = stream.getUByte();
        } else if (index == 3) {
            id = stream.getUShort();
            moveType = stream.getUByte128();
        } else if (index == 4) {
            moveType = stream.getUByte();
            id = stream.getUShort128();
        }
        var npc = player.getWorld().getNPCByIndex(id);
        if (npc == null) {
            return;
        }
        var message = "[NpcOption(" + index + ")] id=" + id + "; moveType=" + moveType + "; NPC=" + npc.getId();
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
        player.clearIdleTime();
        player.clearAllActions(false, true);
        player.setFaceEntity(npc);
        if (npc.getMoveRange() == null && !npc.getDef().getName().equals("Fishing spot")) {
            player.getMovement().setFollowFront(npc);
        } else {
            player.getMovement().setFollowing(npc);
        }
        if (index == 1 && npc.getMaxHitpoints() > 0) {
            player.setAttacking(true);
            player.setEngagingEntity(npc);
            player.getCombat().setFollowing(npc);
            player.getMovement().follow();
            if (player.getMagic().getAutoSpellId() != 0 && player.getHitDelay() <= 0) {
                player.setHitDelay(2);
            }
            return;
        }
        player.getMovement().follow();
        player.putAttribute("packet_decoder_index", index);
        player.putAttribute("packet_decoder_npc_index", id);
        if (complete(player)) {
            stop(player);
            return;
        }
        player.putAttribute("packet_decoder", this);
    }

    @Override
    public boolean complete(Player player) {
        var index = player.getAttributeInt("packet_decoder_index");
        var id = player.getAttributeInt("packet_decoder_npc_index");
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
        if (player.isLocked()) {
            return false;
        }
        if (!player.withinDistance(npc, range)) {
            return false;
        }
        if (!npc.getMovement().isRouting() && npc.getSizeX() == 1 && player.getX() != npc.getX()
                && player.getY() != npc.getY()) {
            return false;
        }
        if (Hunter.getHuntedNPC(npc.getId()) != null && !player.getHunter().catchNPCStage(npc)) {
            return false;
        }
        player.setFaceEntity(null);
        player.getMovement().setFollowing(null);
        if (player.getX() == npc.getX() || player.getY() == npc.getY()) {
            player.getMovement().clear();
        }
        player.setFaceTile(npc);
        AchievementDiary.npcOptionHooks(player, index, npc);
        if (player.getController().npcOptionHook(index, npc)) {
            return true;
        }
        if (SkillContainer.npcOptionHooks(player, index, npc)) {
            return true;
        }
        if (npc.getDef().isOption(index, "pick-up") && Familiar.isPetNPC(npc.getId())) {
            player.getFamiliar().removeFamiliar();
            return true;
        }
        if (!actionMethods.containsKey(npc.getId())) {
            try {
                var classReference = Class.forName("script.packetdecoder.misc.NpcOptions");
                var methodName = "mapObject" + npc.getId();
                var actionMethod = classReference.getMethod(methodName, Player.class, Integer.TYPE, Npc.class);
                if ((actionMethod.getModifiers() & Modifier.STATIC) == 0) {
                    actionMethod = null;
                }
                actionMethods.put(npc.getId(), actionMethod);
            } catch (Exception e) {
                actionMethods.put(npc.getId(), null);
            }
        }
        var actionMethod = actionMethods.get(npc.getId());
        if (actionMethod == null) {
            player.getGameEncoder().sendMessage("Nothing interesting happens.");
        } else {
            try {
                actionMethod.invoke(null, player, index, npc);
            } catch (Exception e) {
                Logger.error(e);
                player.getGameEncoder().sendMessage("Nothing interesting happens.");
            }
        }
        return true;
    }

    @Override
    public void stop(Player player) {
        player.removeAttribute("packet_decoder_index");
        player.removeAttribute("packet_decoder_npc_index");
    }
}
