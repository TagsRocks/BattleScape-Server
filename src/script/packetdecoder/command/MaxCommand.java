package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import lombok.var;

public class MaxCommand implements Command {
    @Override
    public boolean canUse(Player player) {
        return Main.isSpawn() && !player.getController().inWilderness() && !player.getController().inPvPWorld()
                && player.getController().canTeleport(false);
    }

    @Override
    public void execute(Player player, String message) {
        var skills = new int[] {
            Skills.ATTACK, Skills.DEFENCE, Skills.STRENGTH, Skills.HITPOINTS, Skills.RANGED, Skills.PRAYER, Skills.MAGIC
        };
        for (var skillId : skills) {
            player.getSkills().setLevel(skillId, 99);
            player.getSkills().setXP(skillId, Skills.XP_TABLE[99]);
            player.getGameEncoder().sendSkillLevel(skillId);
        }
        player.getSkills().setCombatLevel();
    }
}
