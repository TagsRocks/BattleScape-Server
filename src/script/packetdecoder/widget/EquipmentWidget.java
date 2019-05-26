package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.ItemId;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.player.Equipment;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.Player;

public class EquipmentWidget {
    public static void widget387(Player player, int index, int childId, int slot, int itemId) {
        // Tab
        if (player.isLocked()) {
            return;
        }
        int equipSlot = childId - 6;
        if (equipSlot >= Equipment.Slot.LEG.ordinal() - 1) {
            equipSlot += equipSlot >= Equipment.Slot.RING.ordinal() - 3 ? 3
                    : equipSlot >= Equipment.Slot.HAND.ordinal() - 2 ? 2 : 1;
        }
        if (equipSlot >= Equipment.Slot.HEAD.ordinal() && equipSlot <= Equipment.Slot.AMMO.ordinal()) {
            if (index == 0) {
                player.getController().unequip(equipSlot);
            } else {
                switch (player.getEquipment().getId(equipSlot)) {
                case ItemId.SERPENTINE_HELM:
                case ItemId.TANZANITE_HELM:
                case ItemId.MAGMA_HELM:
                    player.getCharges().checkSerpentineHelm(equipSlot + 65536);
                    break;
                case ItemId.SLAYER_HELMET:
                case ItemId.SLAYER_HELMET_I:
                case ItemId.BLACK_SLAYER_HELMET:
                case ItemId.BLACK_SLAYER_HELMET_I:
                case ItemId.GREEN_SLAYER_HELMET:
                case ItemId.GREEN_SLAYER_HELMET_I:
                case ItemId.RED_SLAYER_HELMET:
                case ItemId.RED_SLAYER_HELMET_I:
                case ItemId.PURPLE_SLAYER_HELMET:
                case ItemId.PURPLE_SLAYER_HELMET_I:
                case ItemId.TURQUOISE_SLAYER_HELMET:
                case ItemId.TURQUOISE_SLAYER_HELMET_I:
                case ItemId.HYDRA_SLAYER_HELMET:
                case ItemId.HYDRA_SLAYER_HELMET_I:
                    if (index == 3) {
                        player.getSlayer().sendTask();
                    }
                    break;
                case ItemId.AMULET_OF_GLORY:
                case ItemId.AMULET_OF_GLORY_T:
                    player.openDialogue("amuletofglory", 0);
                    break;
                case ItemId.AMULET_OF_GLORY_1:
                case ItemId.AMULET_OF_GLORY_2:
                case ItemId.AMULET_OF_GLORY_3:
                case ItemId.AMULET_OF_GLORY_4:
                case ItemId.AMULET_OF_GLORY_T1:
                case ItemId.AMULET_OF_GLORY_T2:
                case ItemId.AMULET_OF_GLORY_T3:
                case ItemId.AMULET_OF_GLORY_T4:
                case ItemId.AMULET_OF_ETERNAL_GLORY:
                    if (!player.getController().canTeleport(30, true)) {
                        break;
                    }
                    Tile gloryTeleport = null;
                    if (index == 1) {
                        gloryTeleport = new Tile(3087, 3491);
                    } else if (index == 2) {
                        gloryTeleport = new Tile(2915, 3152);
                    } else if (index == 3) {
                        gloryTeleport = new Tile(3085, 3249);
                    } else if (index == 4) {
                        gloryTeleport = new Tile(3293, 3177);
                    }
                    if (gloryTeleport == null) {
                        break;
                    }
                    player.getMovement().animatedTeleport(gloryTeleport, Magic.NORMAL_MAGIC_ANIMATION_START,
                            Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
                    player.getController().stopWithTeleport();
                    player.clearHits();
                    break;
                case ItemId.BINDING_NECKLACE:
                    player.getGameEncoder().sendMessage("Your Binding Necklace has "
                            + player.getSkills().getBindingNecklace() + " charges remaining.");
                    break;
                case ItemId.RUBBER_CHICKEN:
                    player.setAnimation(1835);
                    break;
                case ItemId.TOXIC_STAFF_OF_THE_DEAD:
                    player.getCharges().checkToxicStaff(equipSlot + 65536);
                    break;
                case ItemId.TOXIC_BLOWPIPE:
                    player.getCharges().checkToxicBlowpipe(equipSlot + 65536);
                    break;
                case ItemId.BRACELET_OF_ETHEREUM:
                case ItemId.BRACELET_OF_ETHEREUM_UNCHARGED:
                    if (index == 1) {
                        player.getCharges().checkCharges(equipSlot + 65536);
                    } else if (index == 2) {
                        player.getCharges().setEthereumAutoAbsorb(!player.getCharges().getEthereumAutoAbsorb());
                        player.getGameEncoder().sendMessage(
                                "Ether automatic absorption: " + player.getCharges().getEthereumAutoAbsorb());
                    }
                    break;
                case ItemId.RING_OF_RECOIL:
                    player.getGameEncoder().sendMessage("You can inflict " + player.getCharges().getRingOfRecoil()
                            + " more points of damage before your ring will shatter.");
                    break;
                case ItemId.SLAYER_RING_8:
                case ItemId.SLAYER_RING_7:
                case ItemId.SLAYER_RING_6:
                case ItemId.SLAYER_RING_5:
                case ItemId.SLAYER_RING_4:
                case ItemId.SLAYER_RING_3:
                case ItemId.SLAYER_RING_2:
                case ItemId.SLAYER_RING_1:
                case ItemId.SLAYER_RING_ETERNAL:
                    if (index == 1) {
                        player.getCharges().checkCharges(equipSlot + 65536);
                    } else if (index == 2) {
                        player.putAttribute("slayer_ring_slot", equipSlot + 65536);
                        player.openDialogue("slayer", 5);
                    }
                    break;
                case ItemId.RING_OF_WEALTH_I:
                    player.openDialogue("ringwealth", 0);
                    break;
                case ItemId.MAGIC_CAPE:
                case ItemId.MAGIC_CAPE_T:
                    player.openDialogue("spellbooks", 1);
                    break;
                default:
                    player.getCharges().checkCharges(equipSlot + 65536);
                    break;
                }
            }
        } else if (childId == 17) {
            player.getEquipment().openStats();
        } else if (childId == 21) {
            player.getCombat().openItemsKeptOnDeath();
        } else if (childId == 23) {
            player.getFamiliar().callPet(false);
        }
    }

    public static void widget84(Player player, int index, int childId, int slot, int itemId) {
        // Stats
        if (player.isLocked()) {
            return;
        }
        widget387(player, index, childId - 5, slot, itemId);
    }

    public static void widget85(Player player, int index, int childId, int slot, int itemId) {
        // Stats inventory
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 0:
            if (index == 0) {
                player.getEquipment().equip(itemId, slot);
            }
            break;
        }
    }
}

