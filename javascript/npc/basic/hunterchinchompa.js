var npc = null;

instance = new NScript() {
    setNPC: function(n) {
        npc = n;
    },

    getVariable: function(name) {
        return null;
    },

    restore: function() { },

    tick: function() {
        if (npc.getMovement().getWalkDir() == -1) {
            return;
        }
        var asObjectID = -1;
        if (npc.getID() == 1505) {
            asObjectID = Hunter.FERRET_OBJECT;
        } else if (npc.getID() == 2910) {
            asObjectID = Hunter.CHINCHOMPA_OBJECT;
        } else if (npc.getID() == 2911) {
            asObjectID = Hunter.CARNIVOROUS_CHINCHOMPA_OBJECT;
        } else if (npc.getID() == 2912) {
            asObjectID = Hunter.BLACK_CHINCHOMPA_OBJECT;
        }
        if (npc.isLocked() || asObjectID == -1) {
            return;
        }
        var mapObject = npc.getController().getSolidMapObject(npc);
        if (mapObject == null || mapObject.getID() != Hunter.BOX_TRAP_OBJECT) {
            return;
        }
        if (!(mapObject.getAttachment() instanceof TempMapObject)
                || !(mapObject.getAttachment().getAttachment() instanceof Integer)) {
            return;
        }
        var player = Main.getWorld().getPlayerByID(mapObject.getAttachment().getAttachment());
        if (player == null || !player.getHunter().canHuntObject(asObjectID)) {
            return;
        } else if (player.getHunter().success(Hunter.getObjectLevelRequirement(asObjectID), true)) {
            mapObject.setID(asObjectID);
            npc.getCombat().timedDeath(2);
        } else {
            mapObject.setID(Hunter.BOX_TRAP_FAIL_OBJECT);
        }
        mapObject.getAttachment().setTick(HunterTrap.TRAP_EXPIRIY);
        npc.getController().sendMapObject(mapObject);
    }
};
