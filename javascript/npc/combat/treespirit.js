var npc = null;

cs = new NCombatScript() {
    /* @Override */
    setNPCHook: function(n) {
        npc = n;
    },

    /* @Override */
    dropItemHook: function(player, dropTile, dropForIndex, hasRoWICharge) {
        player.getCombat().setLostCity(true);
        player.getMovement().teleport(3082, 3484, 0);
        player.getGameEncoder().sendMessage("<col=ff0000>You have completed Lost City!");
        player.getInventory().addOrDropItem(ItemID.COINS, 25000);
    }
};
