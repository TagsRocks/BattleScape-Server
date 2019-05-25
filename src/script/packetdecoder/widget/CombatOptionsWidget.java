package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.io.cache.VarpID;
import com.palidino.osrs.io.cache.WidgetChild;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.Player;

public class CombatOptionsWidget {
    public static void widget593(Player player, int index, int childID, int slot, int itemID) {
        switch (childID) {
        case 3:
        case 7:
        case 11:
        case 15:
            player.getCombat().setAttackStyle((childID - 3) / 4);
            break;
        case 20:
        case 25:
            int varpValue = -1;
            if (player.getMagic().getSpellBook() == Magic.LUNAR_MAGIC
                    || player.getMagic().getSpellBook() == Magic.ARCEUUS_MAGIC) {
                player.getGameEncoder().sendMessage("You can't autocast this spellbook.");
                return;
            } else if (player.getEquipment().getWeaponID() == ItemID.TRIDENT_OF_THE_SEAS_FULL
                    || player.getEquipment().getWeaponID() == ItemID.TRIDENT_OF_THE_SEAS
                    || player.getEquipment().getWeaponID() == ItemID.UNCHARGED_TRIDENT
                    || player.getEquipment().getWeaponID() == ItemID.TRIDENT_OF_THE_SEAS_E
                    || player.getEquipment().getWeaponID() == ItemID.UNCHARGED_TRIDENT_E
                    || player.getEquipment().getWeaponID() == ItemID.TRIDENT_OF_THE_SWAMP
                    || player.getEquipment().getWeaponID() == ItemID.UNCHARGED_TOXIC_TRIDENT
                    || player.getEquipment().getWeaponID() == ItemID.TRIDENT_OF_THE_SWAMP_E
                    || player.getEquipment().getWeaponID() == ItemID.UNCHARGED_TOXIC_TRIDENT_E
                    || player.getEquipment().getWeaponID() == ItemID.SANGUINESTI_STAFF
                    || player.getEquipment().getWeaponID() == ItemID.SANGUINESTI_STAFF_UNCHARGED) {
                player.getGameEncoder().sendMessage("This staff can't autocast spells.");
                return;
            }
            if (player.getMagic().getSpellBook() == Magic.ANCIENT_MAGIC) {
                if (player.getEquipment().getWeaponID() == ItemID.ANCIENT_STAFF
                        || player.getEquipment().getWeaponID() == ItemID.ANCIENT_STAFF_20431
                        || player.getEquipment().getWeaponID() == ItemID.MASTER_WAND
                        || player.getEquipment().getWeaponID() == ItemID.MASTER_WAND_20560
                        || player.getEquipment().getWeaponID() == ItemID.KODAI_WAND
                        || player.getEquipment().wearingFullAhrims()
                                && player.getEquipment().getNeckID() == ItemID.AMULET_OF_THE_DAMNED_FULL
                        || player.getEquipment().getWeaponID() == ItemID.ZURIELS_STAFF_32262
                        || player.getEquipment().getWeaponID() == ItemID.ZURIELS_STAFF_DEG_32269
                        || player.getEquipment().getWeaponID() == ItemID.CORRUPT_ZURIELS_STAFF_32278
                        || player.getEquipment().getWeaponID() == ItemID.C_ZURIELS_STAFF_DEG_32285) {
                    varpValue = ItemID.ANCIENT_STAFF;
                } else {
                    player.getGameEncoder().sendMessage("This staff can't autocast Ancient Magicks.");
                    return;
                }
            } else if (player.getMagic().getSpellBook() == Magic.NORMAL_MAGIC) {
                if (player.getEquipment().getWeaponID() == ItemID.IBANS_STAFF) {
                    varpValue = ItemID.IBANS_STAFF;
                } else if (player.getEquipment().getWeaponID() == ItemID.SLAYERS_STAFF
                        || player.getEquipment().getWeaponID() == ItemID.SLAYERS_STAFF_E) {
                    varpValue = ItemID.SLAYERS_STAFF;
                } else if (player.getEquipment().getWeaponID() == ItemID.STAFF_OF_THE_DEAD
                        || player.getEquipment().getWeaponID() == ItemID.TOXIC_STAFF_UNCHARGED
                        || player.getEquipment().getWeaponID() == ItemID.TOXIC_STAFF_OF_THE_DEAD) {
                    varpValue = ItemID.STAFF_OF_THE_DEAD;
                } else if (player.getEquipment().getWeaponID() == ItemID.STAFF_OF_LIGHT) {
                    varpValue = ItemID.STAFF_OF_LIGHT;
                }
            }
            player.getGameEncoder().setVarp(VarpID.SPELL_SELECT_WEAPON, varpValue);
            player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.COMBAT, WidgetID.SPELL_SELECT);
            player.getGameEncoder().sendWidgetSettings(WidgetID.SPELL_SELECT, 1, 0, 52, 2);
            player.putAttribute("magic_defensive", childID == 20);
            break;
        case 29:
            player.getCombat().setAutoRetaliate(!player.getCombat().getAutoRetaliate());
            break;
        case 35:
            player.getCombat().activateSpecialAttack();
            break;
        }
    }
}

