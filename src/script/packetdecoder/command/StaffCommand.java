package script.packetdecoder.command;

import java.util.ArrayList;
import java.util.List;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.dialogue.Dialogue;
import com.palidino.osrs.model.player.Player;
import com.palidino.setting.SqlRank;
import com.palidino.util.Utils;
import lombok.var;

public class StaffCommand implements Command {

    @Override
    public void execute(Player player, String message) {
        var rank = "";
        List<String> lines = new ArrayList<>();
        for (Player staff : player.getWorld().getStaffPlayers()) {
            if (staff.isUsergroup(SqlRank.ADMINISTRATOR)) {
                rank = "Administrator";
            } else if (staff.isUsergroup(SqlRank.HEAD_MODERATOR)) {
                rank = "Head Moderator";
            } else if (staff.isUsergroup(SqlRank.MODERATOR)) {
                rank = "Moderator";
            } else if (staff.isUsergroup(SqlRank.SUPPORT)) {
                rank = "Support";
            }
            lines.add(staff.getMessaging().getIconImage() + staff.getUsername() + " - " + rank);
        }
        Dialogue.openScroll(player, "Staff Members Online", Utils.toStringArray(lines));

    }
}
