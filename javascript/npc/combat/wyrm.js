var npc = null;

cs = new NCombatScript() {
    setNPCHook: function(n) {
        npc = n;
    },

    tick: function() {
        if (npc.isLocked()) {
            return;
        }
        if (npc.getID() != NpcID.WYRM_99 && npc.getCombatDelay() == 0 && !npc.getAttacking()) {
            npc.setTransformationID(NpcID.WYRM_99);
            npc.setAnimation(8269);
        } else if (npc.getID() != NpcID.WYRM_99_8611 && (npc.getCombatDelay() > 0 || npc.getAttacking())) {
            npc.setTransformationID(NpcID.WYRM_99_8611);
            npc.setAnimation(8268);
        }
    }
};
