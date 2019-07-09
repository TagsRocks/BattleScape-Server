package script.packetdecoder.command;

import com.palidino.osrs.io.Command;
import com.palidino.osrs.io.cache.ItemId;
import com.palidino.osrs.model.player.Player;

public class StarterPackCommand implements Command {
    @Override
    public boolean canUse(Player player) {
        return player.getRights() == Player.RIGHTS_ADMIN;
    }

    @Override
    public void execute(Player player, String message) {
        player.getInventory().addOrDropItem(ItemId.DRAGON_SCIMITAR, 1);
        player.getInventory().addOrDropItem(ItemId.RUNE_FULL_HELM, 1);
        player.getInventory().addOrDropItem(ItemId.RUNE_PLATEBODY, 1);
        player.getInventory().addOrDropItem(ItemId.RUNE_PLATELEGS, 1);
        player.getInventory().addOrDropItem(ItemId.RUNE_KITESHIELD, 1);
        player.getInventory().addOrDropItem(ItemId.RUNE_BOOTS, 1);
        player.getInventory().addOrDropItem(ItemId.RUNE_CROSSBOW, 1);
        player.getInventory().addOrDropItem(ItemId.DIAMOND_BOLTS_E, 100);
        player.getInventory().addOrDropItem(ItemId.BLACK_DHIDE_BODY, 1);
        player.getInventory().addOrDropItem(ItemId.BLACK_DHIDE_CHAPS, 1);
        player.getInventory().addOrDropItem(ItemId.BLACK_DHIDE_VAMB, 1);
        player.getInventory().addOrDropItem(ItemId.BLACK_DHIDE_SHIELD, 1);
        player.getInventory().addOrDropItem(ItemId.MYSTIC_AIR_STAFF, 1);
        player.getInventory().addOrDropItem(ItemId.DEATH_RUNE, 100);
        player.getInventory().addOrDropItem(ItemId.BLOOD_RUNE, 100);
        player.getInventory().addOrDropItem(ItemId.MYSTIC_HAT, 1);
        player.getInventory().addOrDropItem(ItemId.MYSTIC_ROBE_TOP, 1);
        player.getInventory().addOrDropItem(ItemId.MYSTIC_ROBE_BOTTOM, 1);
        player.getInventory().addOrDropItem(ItemId.MYSTIC_GLOVES, 1);
        player.getInventory().addOrDropItem(ItemId.MYSTIC_BOOTS, 1);
        player.getInventory().addOrDropItem(ItemId.COINS, 400000);
        player.getInventory().addOrDropItem(ItemId.MONKFISH_NOTED, 150);
        player.getInventory().addOrDropItem(ItemId.SUPER_ATTACK_4_NOTED, 15);
        player.getInventory().addOrDropItem(ItemId.SUPER_STRENGTH_4_NOTED, 15);
        player.getInventory().addOrDropItem(ItemId.SUPER_DEFENCE_4_NOTED, 15);
        player.getInventory().addOrDropItem(ItemId.PRAYER_POTION_4_NOTED, 60);
    }
}
