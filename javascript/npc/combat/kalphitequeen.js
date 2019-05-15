var CONSUMABLE_TABLE = [
    new RandomItem(ItemID.MONKFISH, 3), new RandomItem(ItemID.SHARK, 2),
    new RandomItem(ItemID.SUPER_COMBAT_POTION_2, 1), new RandomItem(ItemID.RANGING_POTION_3, 1),
    new RandomItem(ItemID.SUPERANTIPOISON_2, 1), new RandomItem(ItemID.DARK_CRAB, 2),
    new RandomItem(ItemID.SARADOMIN_BREW_4, 1), new RandomItem(ItemID.SUPER_RESTORE_4, 1),
    new RandomItem(ItemID.PRAYER_POTION_4, 2)
];

var npc = null;

cs = new NCombatScript() {
    /* @Override */
    setNPCHook: function(n) {
        npc = n;
    },

    /* @Override */
    dropItemHook: function(player, dropTile, dropForIndex, hasRoWICharge) {
        npc.getController().addMapItem(RandomItem.getItem(CONSUMABLE_TABLE), dropTile, player);
    }
};
