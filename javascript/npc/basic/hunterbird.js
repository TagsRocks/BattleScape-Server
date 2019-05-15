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
        if (npc.getID() == 5549) {
            asObjectID = Hunter.CRIMSON_SWIFT_OBJECT;
        } else if (npc.getID() == 5551) {
            asObjectID = Hunter.GOLDEN_WARBLER_OBJECT;
        } else if (npc.getID() == 5552) {
            asObjectID = Hunter.COPPER_LONGTAIL_OBJECT;
        } else if (npc.getID() == 5550) {
            asObjectID = Hunter.CERULEAN_TWITCH_OBJECT;
        } else if (npc.getID() == 5548) {
            asObjectID = Hunter.TROPICAL_WAGTAIL_OBJECT;
        }
        if (npc.isLocked() || asObjectID == -1) {
            return;
        }
        var mapObject = npc.getController().getSolidMapObject(npc);
        if (mapObject == null || mapObject.getID() != Hunter.BIRD_SNARE_OBJECT) {
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
            mapObject.setID(Hunter.BIRD_SNARE_FAIL_OBJECT);
        }
        mapObject.getAttachment().setTick(HunterTrap.TRAP_EXPIRIY);
        npc.getController().sendMapObject(mapObject);
    }
};
