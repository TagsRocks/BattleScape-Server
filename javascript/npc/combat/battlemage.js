var npc = null;

cs = new NCombatScript() {
    /* @Override */
    setNPCHook: function(n) {
        npc = n;
    },

    /* @Override */
    canBeAggressiveHook: function(entity) {
        if (!(entity instanceof Player)) {
            return true;
        }
        if (npc.getID() == 1610 && (entity.getEquipment().getWeaponID() == 2417
                || entity.getEquipment().getCapeID() == 2414 || entity.getEquipment().getCapeID() == 13333
                || entity.getEquipment().getCapeID() == 21795 || entity.getEquipment().getCapeID() == 21780)) {
            return false;
        } else if (npc.getID() == 1611 && (entity.getEquipment().getWeaponID() == 2415
                || entity.getEquipment().getCapeID() == 2412 || entity.getEquipment().getCapeID() == 13331
                || entity.getEquipment().getCapeID() == 21791 || entity.getEquipment().getCapeID() == 21776)) {
            return false;
        } else if (npc.getID() == 1612 && (entity.getEquipment().getWeaponID() == 2416
                || entity.getEquipment().getCapeID() == 2413 || entity.getEquipment().getCapeID() == 13335
                || entity.getEquipment().getCapeID() == 21793 || entity.getEquipment().getCapeID() == 21784)) {
            return false;
        }
    }
};
