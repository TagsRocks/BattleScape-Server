var ANCIENT_WARRIOR_DROP_TABLE = [
    new RandomItem(ItemID.VESTAS_LONGSWORD_32254, 1),
    new RandomItem(ItemID.STATIUSS_WARHAMMER_32256, 1),
    new RandomItem(ItemID.VESTAS_SPEAR_32258, 1),
    new RandomItem(ItemID.MORRIGANS_JAVELIN_32260, 50),
    new RandomItem(ItemID.MORRIGANS_THROWING_AXE_32261, 50),
    new RandomItem(ItemID.ZURIELS_STAFF_32262, 1)
];
var UNIQUE_DROP_TABLE = [
    new RandomItem(ItemID.VIGGORAS_CHAINMACE_U, 1).setWeight(1),
    new RandomItem(ItemID.CRAWS_BOW_U, 1).setWeight(1),
    new RandomItem(ItemID.THAMMARONS_SCEPTRE_U, 1).setWeight(1),
    new RandomItem(ItemID.AMULET_OF_AVARICE, 1).setWeight(2)
];
var MEDIOCRE_DROP_TABLE = [
    new RandomItem(ItemID.DRAGON_PLATELEGS, 1).setWeight(1),
    new RandomItem(ItemID.DRAGON_PLATESKIRT, 1).setWeight(1),
    new RandomItem(ItemID.RUNE_FULL_HELM, 1).setWeight(2),
    new RandomItem(ItemID.RUNE_PLATEBODY, 1).setWeight(2),
    new RandomItem(ItemID.RUNE_PLATELEGS, 1).setWeight(2),
    new RandomItem(ItemID.RUNE_KITESHIELD, 1).setWeight(2),
    new RandomItem(ItemID.RUNE_WARHAMMER, 1).setWeight(2),
    new RandomItem(ItemID.DRAGON_LONGSWORD, 1).setWeight(1),
    new RandomItem(ItemID.DRAGON_DAGGER, 1).setWeight(1),
    new RandomItem(ItemID.SUPER_RESTORE_4_NOTED, 3, 5).setWeight(4),
    new RandomItem(ItemID.ONYX_BOLT_TIPS, 5, 10).setWeight(4),
    new RandomItem(ItemID.DRAGONSTONE_BOLT_TIPS, 40, 70).setWeight(4),
    new RandomItem(ItemID.UNCUT_DRAGONSTONE_NOTED, 5, 7).setWeight(1),
    new RandomItem(ItemID.DEATH_RUNE, 60, 100).setWeight(3),
    new RandomItem(ItemID.BLOOD_RUNE, 60, 100).setWeight(3),
    new RandomItem(ItemID.LAW_RUNE, 80, 120).setWeight(3),
    new RandomItem(ItemID.RUNITE_ORE_NOTED, 3, 6).setWeight(6),
    new RandomItem(ItemID.ADAMANTITE_BAR_NOTED, 8, 12).setWeight(6),
    new RandomItem(ItemID.COAL_NOTED, 50, 100).setWeight(6),
    new RandomItem(ItemID.BATTLESTAFF_NOTED, 3).setWeight(5),
    new RandomItem(ItemID.BLACK_DRAGONHIDE_NOTED, 10, 15).setWeight(6),
    new RandomItem(ItemID.MAHOGANY_PLANK_NOTED, 15, 25).setWeight(5),
    new RandomItem(ItemID.MAGIC_LOGS_NOTED, 15, 25).setWeight(2),
    new RandomItem(ItemID.YEW_LOGS_NOTED, 60, 100).setWeight(3),
    new RandomItem(ItemID.MANTA_RAY_NOTED, 30, 50).setWeight(3),
    new RandomItem(ItemID.RUNITE_BAR_NOTED, 3, 5).setWeight(6),
    new RandomItem(ItemID.REVENANT_CAVE_TELEPORT, 1).setWeight(7),
    new RandomItem(ItemID.BRACELET_OF_ETHEREUM_UNCHARGED, 1).setWeight(15),
];

var npc = null;

cs = new NCombatScript() {
    setNPCHook: function(n) {
        npc = n;
    },

    tick: function() {
        if (!npc.isLocked() && npc.getHitpoints() < npc.getMaxHitpoints() / 2 && npc.getHitDelay() == 0
                && Utils.randomE(4) == 0) {
            npc.adjustHitpoints(npc.getMaxHitpoints() * 0.2, 0);
            npc.setHitDelay(npc.getHitDelay() + 2);
            npc.setGraphic(1221);
        }
    },

    damageInflictedHook: function(combatStyle, damage, entity) {
        if (entity instanceof Player) {
            if (entity.getCharges().degradeItems(false, ItemID.BRACELET_OF_ETHEREUM, false)) {
                damage = 0;
            }
        }
        return damage;
    },

    canBeAggressiveHook: function(entity) {
        return !(entity instanceof Player) || entity.getEquipment().getHandID() != ItemID.BRACELET_OF_ETHEREUM;
    },

    dropItemHook: function(player, dropTile, dropForIndex, hasRoWICharge) {
        var item = null;
        var logDrop = false;
        var clampedLevel = Math.min(Math.max(1, npc.getDef().getCombatLevel()), 144);
        var chanceA = 2200 / Math.sqrt(clampedLevel);
        var chanceB = 15 + (Math.pow(npc.getDef().getCombatLevel() + 60, 2) / 200);
        chanceA = chanceA / 4 / player.getCombat().getDropRateMultiplier(-1, npc.getDef());
        var selectedChanceA = Utils.randomE(chanceA);
        if (selectedChanceA == 1) {
            logDrop = true;
            var roll = Utils.randomI(player.getCombat().getPKSkullDelay() > 0 ? 13 : 39);
            if (roll == 0) {
                item = RandomItem.getItem(UNIQUE_DROP_TABLE);
            } else if (roll == 1) {
                item = new Item(ItemID.ANCIENT_RELIC, 1);
            } else if (roll == 2) {
                item = new Item(ItemID.ANCIENT_EFFIGY, 1);
            } else if (roll >= 3 && roll <= 4) {
                item = new Item(ItemID.ANCIENT_MEDALLION, 1);
            } else if (roll >= 5 && roll <= 8) {
                item = new Item(ItemID.ANCIENT_STATUETTE, 1);
            } else if (roll >= 9 && roll <= 12) {
                item = new Item(ItemID.MAGIC_SEED, 5 + Utils.randomI(4));
            } else if (roll >= 13 && roll <= 15) {
                item = new Item(ItemID.ANCIENT_CRYSTAL, 1);
            } else if (roll >= 16 && roll <= 20) {
                item = new Item(ItemID.ANCIENT_TOTEM, 1);
            } else if (roll >= 21 && roll <= 26) {
                item = new Item(ItemID.ANCIENT_EMBLEM, 1);
            } else if (roll >= 27 && roll <= 39) {
                item = new Item(ItemID.DRAGON_MED_HELM, 1);
            }
        } else if (selectedChanceA < chanceB) {
            item = RandomItem.getItem(MEDIOCRE_DROP_TABLE);
        } else if (selectedChanceA < 3000) {
            item = new Item(ItemID.COINS, 1000 + Utils.randomE(9000));
        }
        if (item != null) {
            npc.getController().addMapItem(item, dropTile, player);
            if (logDrop) {
                player.getCombat().logNPCItem(npc.getDef().getKillCountName(), item.getID(), item.getAmount());
                npc.getWorld().sendRevenantCavesMessage("<col=005500>" + player.getUsername()
                        + " received a drop: " + (item.getAmount() > 1 ? item.getAmount() + " x " : "")
                        + item.getName());
            }
        }
        if (Utils.randomE(8000 / Math.sqrt(clampedLevel)) == 0) {
            var pvpItem = RandomItem.getItem(ANCIENT_WARRIOR_DROP_TABLE);
            npc.getController().addMapItem(pvpItem, dropTile, player);
            player.getCombat().logNPCItem(npc.getDef().getKillCountName(), pvpItem.getID(), pvpItem.getAmount());
            npc.getWorld().sendRevenantCavesMessage("<col=005500>" + player.getUsername()
                    + " received a drop: " + (pvpItem.getAmount() > 1 ? pvpItem.getAmount() + " x " : "")
                    + pvpItem.getName());
        }
        var etherCount = 1 + Utils.randomE(Math.sqrt(clampedLevel));
        if (player.getCharges().getEthereumAutoAbsorb()
                && (player.getEquipment().getHandID() == ItemID.BRACELET_OF_ETHEREUM
                || player.getEquipment().getHandID() == ItemID.BRACELET_OF_ETHEREUM_UNCHARGED)) {
            etherCount -= player.getCharges().charge(ItemID.BRACELET_OF_ETHEREUM,
                    Equipment.Slot.HAND.ordinal() + 65536, etherCount, new Item(ItemID.REVENANT_ETHER, 1), 1);
        }
        if (etherCount > 0) {
            npc.getController().addMapItem(new Item(ItemID.REVENANT_ETHER, etherCount), dropTile, player);
        }
    }
};
