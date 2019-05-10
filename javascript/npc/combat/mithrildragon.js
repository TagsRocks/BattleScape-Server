var npc = null;

cs = new NCombatScript() {
    /* @Override */
    setNPCHook: function(n) {
        npc = n;
    },

    /* @Override */
    droppingItemHook: function(player, droppingItem, dropTableChance) {
        if (player.getSlayer().isUnlocked(Slayer.DULY_NOTED) && player.getSlayer().isAnyTask(npc)
                && droppingItem.getID() == ItemID.MITHRIL_BAR) {
            droppingItem = new Item(ItemID.MITHRIL_BAR_NOTED, droppingItem);
        }
        return droppingItem;
    }
};
