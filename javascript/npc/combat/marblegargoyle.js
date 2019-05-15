var SPECIAL_ATTACK = new NCombatStyle();
SPECIAL_ATTACK.setType(Hit.Type.MAGIC);
SPECIAL_ATTACK.setSubType(Hit.Type.TYPELESS);
SPECIAL_ATTACK.setAnimation(7815);
SPECIAL_ATTACK.setMaxHit(38);
SPECIAL_ATTACK.setAttackSpeed(4);
SPECIAL_ATTACK.setProjectileID(1453);
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

    dropItemHook: function(player, dropTile, dropForIndex, hasRoWICharge) {
        if (npc.inCatacombsofKourend()) {
            var totemBase = player.hasItem(19679);
            var totemMiddle = player.hasItem(19681);
            var totemTop = player.hasItem(19683);
            var hasAll = totemBase && totemMiddle && totemTop;
            var totemIDs = new ArrayList();
            if (!totemBase || hasAll) {
                totemIDs.add(19679);
            }
            if (!totemMiddle || hasAll) {
                totemIDs.add(19681);
            }
            if (!totemTop || hasAll) {
                totemIDs.add(19683);
            }
            var itemID = totemIDs.get(Utils.randomE(totemIDs.size()));
            npc.getController().addMapItem(new Item(itemID, 1), dropTile, player);
        }
    }
};
