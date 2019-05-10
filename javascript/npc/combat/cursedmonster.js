var npc = null;

cs = new NCombatScript() {
    setNPCHook: function(n) {
        npc = n;
    },

    droppingItemHook: function(player, droppingItem, dropTableChance) {
        if (!player.getSlayer().isWildernessTask(npc)) {
            return null;
        }
        return droppingItem;
    }
};
