var npc = null;
var changeDelay = 0;

cs = new NCombatScript() {
    setNPCHook: function(n) {
        npc = n;
    },

    getVariable: function(name) {
        if (name.equals("smash")) {
            if (npc.getId() != NpcId.CURSED_JEWELLED_CRAB_180_16001) {
                npc.setTransformationId(NpcId.CURSED_JEWELLED_CRAB_180_16001);
                this.setChangeDelay();
            }
        }
        return null;
    },

    restore: function() {
        changeDelay = 1;
    },

    tick: function() {
        if (npc.isLocked()) {
            return;
        }
        if (changeDelay > 0) {
            changeDelay--;
            if (changeDelay == 0) {
                this.setChangeDelay();
                npc.setTransformationId(Utils.arrayRandom(NpcId.CURSED_JEWELLED_CRAB_BLUE_180_16004,
                        NpcId.CURSED_JEWELLED_CRAB_GREEN_180_16003, NpcId.CURSED_JEWELLED_CRAB_RED_180_16002));
            }
        }
    },

    damageReceivedHook: function(damage, entity, hitType, defenceType) {
        if (npc.getId() == NpcId.CURSED_JEWELLED_CRAB_BLUE_180_16004 && hitType == Hit.Type.MAGIC) {
            return 0;
        } else if (npc.getId() == NpcId.CURSED_JEWELLED_CRAB_GREEN_180_16003 && hitType == Hit.Type.RANGED) {
            return 0;
        } else if (npc.getId() == NpcId.CURSED_JEWELLED_CRAB_RED_180_16002 && hitType == Hit.Type.MELEE) {
            return 0;
        }
        if (npc.getId() != NpcId.CURSED_JEWELLED_CRAB_180_16001) {
            if (hitType == Hit.Type.MAGIC) {
                npc.setTransformationId(NpcId.CURSED_JEWELLED_CRAB_BLUE_180_16004);
                this.setChangeDelay();
            } else if (hitType == Hit.Type.RANGED) {
                npc.setTransformationId(NpcId.CURSED_JEWELLED_CRAB_GREEN_180_16003);
                this.setChangeDelay();
            } else if (hitType == Hit.Type.MELEE) {
                npc.setTransformationId(NpcId.CURSED_JEWELLED_CRAB_RED_180_16002);
                this.setChangeDelay();
            }
        }
        return damage;
    },

    droppingItemHook: function(player, droppingItem, dropTableChance) {
        if (!player.getSlayer().isWildernessTask(npc)) {
            player.getGameEncoder().sendMessage("Your loot immediately fades away. Maybe a task would help...");
            return null;
        }
        return droppingItem;
    },

    setChangeDelay: function() {
        changeDelay = 25 + Utils.randomI(4);
    }
};
