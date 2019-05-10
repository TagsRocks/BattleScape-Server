var START_FIRE_ANIMATION = 733;
var ADD_TO_FIRE_ANIMATION = 897;
var FIRE_MAP_OBJECT = 5249;

var ENTRIES = Utils.toList(
    new SkillContainer.Entry().setLevel(1).setXP(40).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.LOGS, 1))
        .setPet(461808, ItemID.PHOENIX),
    new SkillContainer.Entry().setLevel(1).setXP(40).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.ACHEY_TREE_LOGS, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(40).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.KINDLING_20799, 1))
        .setPet(461808, ItemID.PHOENIX),
    new SkillContainer.Entry().setLevel(15).setXP(60).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.OAK_LOGS, 1))
        .setPet(443697, ItemID.PHOENIX),
    new SkillContainer.Entry().setLevel(30).setXP(90).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.WILLOW_LOGS, 1))
        .setPet(435165, ItemID.PHOENIX),
    new SkillContainer.Entry().setLevel(35).setXP(105).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.TEAK_LOGS, 1))
        .setPet(426954, ItemID.PHOENIX),
    new SkillContainer.Entry().setLevel(42).setXP(125).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.ARCTIC_PINE_LOGS, 1))
        .setPet(382609, ItemID.PHOENIX),
    new SkillContainer.Entry().setLevel(45).setXP(135).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.MAPLE_LOGS, 1))
        .setPet(305792, ItemID.PHOENIX),
    new SkillContainer.Entry().setLevel(50).setXP(157).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.MAHOGANY_LOGS, 1))
        .setPet(170874, ItemID.PHOENIX),
    new SkillContainer.Entry().setLevel(60).setXP(202).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.YEW_LOGS, 1))
        .setPet(149434, ItemID.PHOENIX),
    new SkillContainer.Entry().setLevel(75).setXP(303).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.MAGIC_LOGS, 1))
        .setPet(138583, ItemID.PHOENIX),
    new SkillContainer.Entry().setLevel(90).setXP(350).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.REDWOOD_LOGS, 1))
        .setPet(128885, ItemID.PHOENIX),
    new SkillContainer.Entry().setLevel(49)
        .setTool(new Item(ItemID.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemID.BULLSEYE_LANTERN, 1))
        .setCreate(new RandomItem(ItemID.BULLSEYE_LANTERN_4550, 1))
);

skill = new SkillContainer() {
    getSkillID: function() {
        return Skills.FIREMAKING;
    },

    getEntries: function() {
        return ENTRIES;
    },

    xpHook: function(player, xp, npc, mapObject, entry) {
        if (player.getEquipment().wearingPyromancerOutfit()) {
            xp *= 1.1;
        }
        return xp;
    },

    canDoActionHook: function(player, event, npc, mapObject, entry) {
        if (mapObject == null && this.isLog(entry.getConsume().getID())) {
            if (player.getHeight() != player.getClientHeight() || player.getController().hasSolidMapObject(player)) {
                player.getGameEncoder().sendMessage("You can't do this here.");
                return false;
            }
        }
        return true;
    },

    actionSuccessHook: function(player, event, npc, mapObject, entry) {
        if (this.isLog(entry.getConsume().getID())) {
            if (Utils.randomE(160 - entry.getLevel()) == 0) {
                player.getInventory().addOrDropItem(ItemID.SUPPLY_CRATE, 1);
            }
            if (entry.getAnimation() == START_FIRE_ANIMATION && mapObject != null) {
                player.setAnimation(ADD_TO_FIRE_ANIMATION);
            }
            if (mapObject != null) {
                player.setFaceTile(mapObject);
                if (player.withinDistance(mapObject, 0)) {
                    Route.moveOffTile(player);
                }
            } else {
                player.lock();
                var logMapItem = MapItem.getForPacket(entry.getConsume(), player);
                player.getGameEncoder().sendMapItem(logMapItem);
                var event = new Event(2) {
                    execute: function() {
                        var fire = new MapObject(FIRE_MAP_OBJECT, player, 10, 0);
                        player.getWorld().addEvent(new TempMapObject(100, player.getController(), fire));
                        AchievementDiary.makeFireHooks(player, entry.getConsume());
                        Route.moveOffTile(player);
                        player.getGameEncoder().sendRemoveMapItem(logMapItem);
                        player.unlock();
                        event.stop();
                    }
                };
                player.getWorld().addEvent(event);
            }
        }
    },

    widgetOnMapObjectHook: function(player, interfaceID, childID, slot, mapObject) {
        if (interfaceID != WidgetID.INVENTORY || mapObject.getID() != FIRE_MAP_OBJECT) {
            return false;
        }
        var itemID = player.getInventory().getID(slot);
        if (!this.isLog(itemID)) {
            return false;
        }
        skill.openMakeX(player, mapObject, WidgetManager.MakeX.FIRE, player.getInventory().getCount(itemID),
                Utils.toList(skill.findEntryFromConsume(itemID)));
        return true;
    },

    isLog: function(itemID) {
        return itemID == ItemID.LOGS || itemID == ItemID.OAK_LOGS || itemID == ItemID.WILLOW_LOGS
                || itemID == ItemID.MAPLE_LOGS || itemID == ItemID.YEW_LOGS || itemID == ItemID.MAGIC_LOGS
                || itemID == ItemID.ACHEY_TREE_LOGS || itemID == ItemID.TEAK_LOGS || itemID == ItemID.ARCTIC_PINE_LOGS
                || itemID == ItemID.MAHOGANY_LOGS || itemID == ItemID.REDWOOD_LOGS || itemID == ItemID.KINDLING_20799;
    }
}
