var COMBAT_ID = NpcId.CURSED_KRAKEN_127_16013;
var WHIRLPOOL_ID = NpcId.CURSED_WHIRLPOOL_127_16014;

var npc = null;

cs = new NCombatScript() {
    setNPCHook: function(n) {
        npc = n;
    },

    tick: function() {
        if (npc.isLocked()) {
            return;
        }
        if (npc.getCombatDelay() == 0 && !npc.getAttacking() && npc.getId() != WHIRLPOOL_ID) {
            npc.setTransformationId(WHIRLPOOL_ID);
        } else if (npc.getCombatDelay() > 0 || npc.getAttacking()) {
            npc.getMovement().clear();
            if (npc.getId() != COMBAT_ID) {
                npc.setTransformationId(COMBAT_ID);
                npc.setAnimation(7135);
                npc.setHitDelay(4);
            }
        }
    },

    canBeAttackedHook: function(player, sendMessage, hitType) {
        if (hitType == Hit.Type.MELEE || hitType == Hit.Type.RANGED) {
            if (sendMessage) {
                player.getGameEncoder().sendMessage("Only magic seems effective against these...");
            }
            return false;
        }
        return true;
    },

    droppingItemHook: function(player, droppingItem, dropTableChance) {
        if (!player.getSlayer().isWildernessTask(npc)) {
            return null;
        }
        return droppingItem;
    }
};
