package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;

public class MaxCommand implements Command {
    @Override
    public boolean canUse(Player player) {
        return Main.isSpawn() && !player.getController().inWilderness() && !player.getController().inPvPWorld()
                && player.getController().canTeleport(false);
    }

    @Override
    public void execute(Player player, String message) {
        for (int i = 0; i < Skills.SKILL_COUNT; i++) {
            player.getSkills().setLevel(i, 99);
            player.getSkills().setXP(i, Skills.XP_TABLE[99]);
            player.getGameEncoder().sendSkillLevel(i);
        }
        player.getSkills().setCombatLevel();
    }
}