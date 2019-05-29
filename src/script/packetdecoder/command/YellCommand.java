package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Messaging;
import com.palidino.osrs.model.player.Player;
import com.palidino.setting.SqlRank;
import com.palidino.util.Time;
import lombok.var;

public class YellCommand implements Command {
    @Override
    public String getExample() {
        return "message";
    }



    @Override
    public boolean canUse(Player player) {
        return player.isUsergroup(SqlRank.DONATOR) || player.getRights() == Player.RIGHTS_MOD
                || player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {
        var msg = message.substring(3);
        var yellDelay = 0L;
        if (player.getMessaging().getYellDelay() > 0) {
            player.getGameEncoder().sendMessage("You need to wait "
                    + Time.tickToSec(player.getMessaging().getYellDelay()) + " seconds before you can yell again.");
        }
        if (player.isUsergroup(SqlRank.SUPPORT) || player.isUsergroup(SqlRank.MODERATOR)
                || player.isUsergroup(SqlRank.ADMINISTRATOR)) {
            yellDelay = Time.secToTick(5);
        } else if (player.isUsergroup(SqlRank.UBER_DONATOR)) {
            yellDelay = Time.secToTick(5);
        } else if (player.isUsergroup(SqlRank.LEGENDARY_DONATOR)) {
            yellDelay = Time.secToTick(15);
        } else if (player.isUsergroup(SqlRank.EXTREME_DONATOR)) {
            yellDelay = Time.secToTick(30);
        } else if (player.isUsergroup(SqlRank.SUPER_DONATOR)) {
            yellDelay = Time.secToTick(45);
        } else if (player.isUsergroup(SqlRank.DONATOR)) {
            yellDelay = Time.secToTick(60);
        } else {
            player.getGameEncoder().sendMessage("You need to be a donator to use yell.");
            return;
        }
        player.getWorld().sendMessage(
                "[<col=ff0000>Yell</col>] " + player.getMessaging().getIconImage() + player.getUsername() + ": " + msg);
        player.getMessaging().setYellDelay((int) yellDelay);
    }
}
