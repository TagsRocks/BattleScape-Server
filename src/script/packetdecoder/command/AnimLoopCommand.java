package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.event.Event;
import lombok.var;

public class AnimLoopCommand implements Command {
    @Override
    public String getExample() {
        return "id";
    }

    @Override
    public boolean canUse(Player player) {
        return player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {
        var fromId = Integer.parseInt(message);
        var event = new Event(1) {
            int id = fromId;
            boolean reset = false;

            @Override
            public void execute() {
                if (reset) {
                    reset = false;
                    player.setAnimation(-1);
                    setTick(0);
                } else {
                    reset = true;
                    player.getGameEncoder().sendMessage("Anim: " + id);
                    player.setAnimation(id++, 20);
                    setTick(1);
                }
            }
        };
        player.setAction(event);
    }
}
