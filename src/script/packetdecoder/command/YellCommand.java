package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;
import com.palidino.setting.SqlUserRank;
import com.palidino.util.Time;
import lombok.var;

public class YellCommand implements Command {
    @Override
    public String getExample() {
        return "message";
    }

    @Override
    public boolean canUse(Player player) {
        return Main.isSpawn() && player.isUsergroup(SqlUserRank.DONATOR) || player.getRights() == Player.RIGHTS_MOD
                || player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {
        var yellDelay = 0L;
        if (player.getMessaging().getYellDelay() > 0) {
            player.getGameEncoder().sendMessage("You need to wait "
                    + Time.tickToSec(player.getMessaging().getYellDelay()) + " seconds before you can yell again.");
            return;
        }
        if (player.inJail()) {
            player.getGameEncoder().sendMessage("You can not yell while in jail..");
            return;
        }

        if (player.getMessaging().isMuted()) {
            player.getGameEncoder().sendMessage("You can not yell while muted.");
            return;
        }

        if (player.isUsergroup(SqlUserRank.SUPPORT) || player.isUsergroup(SqlUserRank.MODERATOR)
                || player.isUsergroup(SqlUserRank.ADMINISTRATOR) || player.getUsername().equalsIgnoreCase("miika")) {
            yellDelay = Time.secToTick(5);
        } else if (player.isUsergroup(SqlUserRank.UBER_DONATOR)) {
            yellDelay = Time.secToTick(5);
        } else if (player.isUsergroup(SqlUserRank.LEGENDARY_DONATOR)) {
            yellDelay = Time.secToTick(15);
        } else if (player.isUsergroup(SqlUserRank.EXTREME_DONATOR)) {
            yellDelay = Time.secToTick(30);
        } else if (player.isUsergroup(SqlUserRank.SUPER_DONATOR)) {
            yellDelay = Time.secToTick(45);
        } else if (player.isUsergroup(SqlUserRank.DONATOR)) {
            yellDelay = Time.secToTick(60);
        }
        player.getWorld().sendMessage("[<col=ff0000>Yell</col>] " + player.getMessaging().getIconImage()
                + player.getUsername() + ": " + message);
        player.getMessaging().setYellDelay((int) yellDelay);
    }
}
