var npc = null;
var changeDelay = 0;

cs = new NCombatScript() {
    /* @Override */
    setNPCHook: function(n) {
        npc = n;
    },

    /* @Override */
    restore: function() {
        this.setChangeDelay();
    },

    /* @Override */
    tick: function() {
        if (npc.isLocked()) {
            return;
        }
        if (changeDelay > 0) {
            changeDelay--;
            if (changeDelay == 0) {
                this.setChangeDelay();
                if (npc.getID() == 983) {
                    npc.setTransformationID(984);
                    npc.setForceMessage("Krrrrrrk");
                } else if (npc.getID() == 984) {
                    npc.setTransformationID(988);
                    npc.setForceMessage("Chkhkhkhkhk");
                } else if (npc.getID() == 988) {
                    npc.setTransformationID(986);
                    npc.setForceMessage("Krrrrrrssssssss");
                } else if (npc.getID() == 986) {
                    npc.setTransformationID(985);
                    npc.setForceMessage("Sssssrrrkkkkkk");
                } else if (npc.getID() == 985) {
                    npc.setTransformationID(987);
                    npc.setForceMessage("Krkrkrkrkrkrkrkr");
                } else if (npc.getID() == 987) {
                    npc.setTransformationID(983);
                    npc.setForceMessage("Tktktktktktkt");
                }
            }
        }
    },

    /* @Override */
    damageReceivedHook: function(damage, entity, hitType, defenceType) {
        if (!(entity instanceof Player)) {
            return damage;
        }
        var spell = entity.getMagic().getActiveSpell();
        if (npc.getID() == 983 && (hitType != Hit.Type.MAGIC || spell == null
                || !spell.getName().startsWith("wind"))) {
            return 0;
        } else if (npc.getID() == 988 && hitType != Hit.Type.MELEE) {
            return 0;
        } else if (npc.getID() == 984 && (hitType != Hit.Type.MAGIC || spell == null
                || !spell.getName().startsWith("water"))) {
            return 0;
        } else if (npc.getID() == 985 && (hitType != Hit.Type.MAGIC || spell == null
                || !spell.getName().startsWith("fire"))) {
            return 0;
        } else if (npc.getID() == 987 && hitType != Hit.Type.RANGED) {
            return 0;
        } else if (npc.getID() == 986 && (hitType != Hit.Type.MAGIC || spell == null
                || !spell.getName().startsWith("earth"))) {
            return 0;
        }
        return damage;
    },

    /* @Override */
    dropItemHook: function(player, dropTile, dropForIndex, hasRoWICharge) {
        player.getGameEncoder().sendMessage("You have defeated the Dagannoth Mother!");
        player.getCombat().setHorrorFromTheDeep(true);
        player.getGameEncoder().sendMessage("<col=ff0000>You have completed Horror from the Deep!");
        player.getInventory().addOrDropItem(ItemID.COINS, 25000);
    },

    setChangeDelay: function() {
        changeDelay = 25 + Utils.randomI(8);
    }
};
