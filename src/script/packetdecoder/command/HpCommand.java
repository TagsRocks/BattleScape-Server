package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import lombok.var;

public class HPCommand implements Command {

    @Override
    public String getExample() {
        return "amount";
    }

    @Override
    public boolean canUse(Player player) {
        return player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {
        var amount = Integer.parseInt(message);
        player.getMovement().setEnergy(amount);
        player.setHitpoints(amount);
        player.getSkills().setLevel(6, amount);
        player.getGameEncoder().sendSkillLevel(6);
        player.getGameEncoder().sendMessage("You set your hitpoints to " + amount + ".");
    }
}
