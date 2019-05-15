DecodedPacketWidget.prototype.widget_387 = function(player, index, childID, slot, itemID) {
    // Tab
    if (player.isLocked()) {
        return;
    }
    var equipSlot = childID - 6;
    if (equipSlot >= Equipment.Slot.LEG.ordinal() - 1) {
        equipSlot += equipSlot >= Equipment.Slot.RING.ordinal() - 3
                ? 3 : (equipSlot >= Equipment.Slot.HAND.ordinal() - 2 ? 2 : 1);
    }
    if (equipSlot >= Equipment.Slot.HEAD.ordinal() && equipSlot <= Equipment.Slot.AMMO.ordinal()) {
        if (index == 0) {
            player.getController().unequip(equipSlot);
        } else {
            switch (player.getEquipment().getID(equipSlot)) {
            case ItemID.SERPENTINE_HELM:
            case ItemID.TANZANITE_HELM:
            case ItemID.MAGMA_HELM:
                player.getCharges().checkSerpentineHelm(equipSlot + 65536);
                break;
            case ItemID.SLAYER_HELMET:
            case ItemID.SLAYER_HELMET_I:
            case ItemID.BLACK_SLAYER_HELMET:
            case ItemID.BLACK_SLAYER_HELMET_I:
            case ItemID.GREEN_SLAYER_HELMET:
            case ItemID.GREEN_SLAYER_HELMET_I:
            case ItemID.RED_SLAYER_HELMET:
            case ItemID.RED_SLAYER_HELMET_I:
            case ItemID.PURPLE_SLAYER_HELMET:
            case ItemID.PURPLE_SLAYER_HELMET_I:
            case ItemID.TURQUOISE_SLAYER_HELMET:
            case ItemID.TURQUOISE_SLAYER_HELMET_I:
            case ItemID.HYDRA_SLAYER_HELMET:
            case ItemID.HYDRA_SLAYER_HELMET_I:
                if (index == 3) {
                    player.getSlayer().sendTask();
                }
                break;
            case ItemID.AMULET_OF_GLORY:
            case ItemID.AMULET_OF_GLORY_T:
                player.openDialogue("amuletofglory", 0);
                break;
            case ItemID.AMULET_OF_GLORY_1:
            case ItemID.AMULET_OF_GLORY_2:
            case ItemID.AMULET_OF_GLORY_3:
            case ItemID.AMULET_OF_GLORY_4:
            case ItemID.AMULET_OF_GLORY_T1:
            case ItemID.AMULET_OF_GLORY_T2:
            case ItemID.AMULET_OF_GLORY_T3:
            case ItemID.AMULET_OF_GLORY_T4:
            case ItemID.AMULET_OF_ETERNAL_GLORY:
                if (!player.getController().canTeleport(30, true)) {
                    break;
                }
                var gloryTeleport = null;
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
            case ItemID.BINDING_NECKLACE:
                player.getGameEncoder().sendMessage("Your Binding Necklace has "
                        + player.getSkills().getBindingNecklace() + " charges remaining.");
                break;
            case ItemID.RUBBER_CHICKEN:
                player.setAnimation(1835);
                break;
            case ItemID.TOXIC_STAFF_OF_THE_DEAD:
                player.getCharges().checkToxicStaff(equipSlot + 65536);
                break;
            case ItemID.TOXIC_BLOWPIPE:
                player.getCharges().checkToxicBlowpipe(equipSlot + 65536);
                break;
            case ItemID.BRACELET_OF_ETHEREUM:
            case ItemID.BRACELET_OF_ETHEREUM_UNCHARGED:
                if (index == 1) {
                    player.getCharges().checkCharges(equipSlot + 65536);
                } else if (index == 2) {
                    player.getCharges().setEthereumAutoAbsorb(!player.getCharges().getEthereumAutoAbsorb());
                    player.getGameEncoder().sendMessage("Ether automatic absorption: "
                            + player.getCharges().getEthereumAutoAbsorb());
                }
                break;
            case ItemID.RING_OF_RECOIL:
                player.getGameEncoder().sendMessage("You can inflict " + player.getCharges().getRingOfRecoil()
                        + " more points of damage before your ring will shatter.");
                break;
            case ItemID.SLAYER_RING_8:
            case ItemID.SLAYER_RING_7:
            case ItemID.SLAYER_RING_6:
            case ItemID.SLAYER_RING_5:
            case ItemID.SLAYER_RING_4:
            case ItemID.SLAYER_RING_3:
            case ItemID.SLAYER_RING_2:
            case ItemID.SLAYER_RING_1:
            case ItemID.SLAYER_RING_ETERNAL:
                if (index == 1) {
                    player.getCharges().checkCharges(equipSlot + 65536);
                } else if (index == 2) {
                    player.putAttribute("slayer_ring_slot", equipSlot + 65536);
                    player.openDialogue("slayer", 5);
                }
                break;
            case ItemID.RING_OF_WEALTH_I:
                player.openDialogue("ringwealth", 0);
                break;
            case ItemID.MAGIC_CAPE:
            case ItemID.MAGIC_CAPE_T:
                player.openDialogue("spellbooks", 1);
                break;
            default:
                player.getCharges().checkCharges(equipSlot + 65536);
                break;
            }
        }
    } else if (childID == 17) {
        player.getEquipment().openStats();
    } else if (childID == 21) {
        player.getCombat().openItemsKeptOnDeath();
    } else if (childID == 23) {
        player.getFamiliar().callPet(false);
    }
}

DecodedPacketWidget.prototype.widget_84 = function(player, index, childID, slot, itemID) {
    // Stats
    if (player.isLocked()) {
        return;
    }
    this.widget_387(player, index, childID - 5, slot, itemID);
}

DecodedPacketWidget.prototype.widget_85 = function(player, index, childID, slot, itemID) {
    // Stats inventory
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 0:
        if (index == 0) {
            player.getEquipment().equip(itemID, slot);
        }
        break;
    }
}
