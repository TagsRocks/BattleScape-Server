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
        if (npc.getID() == 2906) {
            asObjectID = Hunter.SWAMP_LIZARD_OBJECT;
        } else if (npc.getID() == 2903) {
            asObjectID = Hunter.ORANGE_SALAMANDER_OBJECT;
        } else if (npc.getID() == 2904) {
            asObjectID = Hunter.RED_SALAMANDER_OBJECT;
        } else if (npc.getID() == 2905) {
            asObjectID = Hunter.BLACK_SALAMANDER_OBJECT;
        }
        if (npc.isLocked() || asObjectID == -1) {
            return;
        }
        var mapObject = npc.getController().getSolidMapObject(npc);
        if (mapObject == null || mapObject.getID() != Hunter.NET_TRAP_OBJECT) {
            return;
        }
        if (!(mapObject.getAttachment() instanceof TempMapObject)
                || !(mapObject.getAttachment().getAttachment() instanceof Player)) {
            return;
        }
        var player = Main.getWorld().getPlayerByID(mapObject.getAttachment().getAttachment());
        if (player == null || !player.getHunter().canHuntObject(asObjectID)) {
            return;
        }
        mapObject.getAttachment().resetMapObject(0);
        if (player.getHunter().success(Hunter.getObjectLevelRequirement(asObjectID), true)) {
            mapObject.getAttachment().getTempMapObject(1).setID(asObjectID);
            npc.getCombat().timedDeath(2);
        } else {
            mapObject.getAttachment().getTempMapObject(1).setID(Hunter.NET_TRAP_FAIL_OBJECT);
        }
        npc.getController().sendMapObject(mapObject.getAttachment().getTempMapObject(1));
    }
};
