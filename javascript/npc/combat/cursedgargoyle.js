var SPECIAL_ATTACK = new NCombatStyle();
SPECIAL_ATTACK.setType(Hit.Type.MAGIC);
SPECIAL_ATTACK.setSubType(Hit.Type.TYPELESS);
SPECIAL_ATTACK.setAnimation(7815);
SPECIAL_ATTACK.setMaxHit(38);
SPECIAL_ATTACK.setAttackSpeed(4);
SPECIAL_ATTACK.setProjectileId(1453);
SPECIAL_ATTACK.setIgnorePrayer(true);
SPECIAL_ATTACK.setSpeedMinDistance(8);
SPECIAL_ATTACK.setMagicBind(6);
SPECIAL_ATTACK.setTargetTile(true);

var npc = null;

cs = new NCombatScript() {
    setNPCHook: function(n) {
        npc = n;
    },

    combatStyleHook: function(combatStyle) {
        return Utils.randomE(8) == 0 ? SPECIAL_ATTACK : combatStyle;
    },

    droppingItemHook: function(player, droppingItem, dropTableChance) {
        if (!player.getSlayer().isWildernessTask(npc)) {
            return null;
        }
        return droppingItem;
    }
};
