var npc = null;

cs = new NCombatScript() {
    /* @Override */
    setNPCHook: function(n) {
        npc = n;
    },

    /* @Override */
    canBeAttackedHook: function(player, sendMessage, hitType) {
        if (!player.getSlayer().isAnyTask(npc) && !player.isUsergroup(SqlRank.YOUTUBER)) {
            if (sendMessage) {
                player.getGameEncoder().sendMessage("This can only be attacked on an appropriate Slayer task.");
            }
            return false;
        }
        return true;
    }
};
