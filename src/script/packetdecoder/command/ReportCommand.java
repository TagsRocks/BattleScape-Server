package script.packetdecoder.command;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.model.player.Player;

public class ReportCommand implements Command {
    @Override
    public void execute(Player player, String message) {
        player.getGameEncoder().sendOpenURL(Main.getSettings().getReportPlayerUrl());
    }
}
