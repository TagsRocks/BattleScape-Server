package script.packetdecoder.command;

import java.util.ArrayList;
import com.palidino.osrs.io.Command;
import com.palidino.osrs.io.cache.WidgetId;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.dialogue.Dialogue;
import com.palidino.osrs.model.dialogue.DialogueEntry;
import com.palidino.osrs.model.player.Player;
import com.palidino.setting.SqlUserRank;
import lombok.var;

public class PlayersCommand implements Command {
    @Override
    public boolean canUse(Player player) {
        return !player.isUsergroup(SqlUserRank.SUPPORT) && player.getRights() == Player.RIGHTS_MOD
                || player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {
        var players = new ArrayList<String>();
        for (var player2 : player.getWorld().getPlayers()) {
            players.add(player2.getUsername());
        }
        var dialogue = new DialogueEntry();
        dialogue.setLargeSelection("Players", players.toArray(new String[players.size()]));
        dialogue.setScript((myPlayer, index, childId, slot) -> {
            if (myPlayer.isDead() || myPlayer.getInCombatDelay() > 0) {
                return;
            }
            if (slot < 0 || slot >= players.size()) {
                return;
            }
            var player2 = myPlayer.getWorld().getPlayerByUsername(players.get(slot));
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user.");
                return;
            } else if (player == player2) {
                player.getGameEncoder().sendMessage("You can't view yourself.");
                return;
            } else if (player.getController().isInstanced()) {
                player.getGameEncoder().sendMessage("You can't view while in an instance.");
                return;
            } else if (player2.getController().isInstanced()) {
                player.getGameEncoder().sendMessage(player2.getUsername() + " is in an instance located at: "
                        + player2.getX() + ", " + player2.getY() + ", " + player2.getHeight() + ".");
                return;
            }
            var viewTile = new Tile(player2);
            viewTile.randomize(1);
            player.getMovement().setViewing(viewTile);
            player.getWidgetManager().sendInventoryOverlay(WidgetId.UNMORPH);
        });
        Dialogue.open(player, dialogue);
    }
}
