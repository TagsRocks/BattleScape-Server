var npc = null;

cs = new NCombatScript() {
    setNPCHook: function(n) {
        npc = n;
    },

    tick: function() {
        if (npc.isLocked()) {
            return;
        }
        if (npc.getId() != NpcId.WYRM_99 && npc.getCombatDelay() == 0 && !npc.getAttacking()) {
            npc.setTransformationId(NpcId.WYRM_99);
            npc.setAnimation(8269);
        } else if (npc.getId() != NpcId.WYRM_99_8611 && (npc.getCombatDelay() > 0 || npc.getAttacking())) {
            npc.setTransformationId(NpcId.WYRM_99_8611);
            npc.setAnimation(8268);
        }
    }
};
