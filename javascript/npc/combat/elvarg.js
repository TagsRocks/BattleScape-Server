var npc = null;

cs = new NCombatScript() {
    /* @Override */
    setNPCHook: function(n) {
        npc = n;
    },

    /* @Override */
    dropItemHook: function(player, dropTile, dropForIndex, hasRoWICharge) {
        player.getCombat().setDragonSlayer(true);
        player.getMovement().teleport(3109, 3514, 0);
        player.getGameEncoder().sendMessage("<col=ff0000>You have completed Dragon Slayer!");
        player.getInventory().addOrDropItem(ItemID.COINS, 25000);
    }
};
