var START_FIRE_ANIMATION = 733;
var ADD_TO_FIRE_ANIMATION = 897;
var FIRE_MAP_OBJECT = 5249;

var ENTRIES = Utils.toList(
    new SkillContainer.Entry().setLevel(1).setXP(40).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.LOGS, 1))
        .setPet(461808, ItemId.PHOENIX),
    new SkillContainer.Entry().setLevel(1).setXP(40).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.ACHEY_TREE_LOGS, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(40).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.KINDLING_20799, 1))
        .setPet(461808, ItemId.PHOENIX),
    new SkillContainer.Entry().setLevel(15).setXP(60).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.OAK_LOGS, 1))
        .setPet(443697, ItemId.PHOENIX),
    new SkillContainer.Entry().setLevel(30).setXP(90).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.WILLOW_LOGS, 1))
        .setPet(435165, ItemId.PHOENIX),
    new SkillContainer.Entry().setLevel(35).setXP(105).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.TEAK_LOGS, 1))
        .setPet(426954, ItemId.PHOENIX),
    new SkillContainer.Entry().setLevel(42).setXP(125).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.ARCTIC_PINE_LOGS, 1))
        .setPet(382609, ItemId.PHOENIX),
    new SkillContainer.Entry().setLevel(45).setXP(135).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.MAPLE_LOGS, 1))
        .setPet(305792, ItemId.PHOENIX),
    new SkillContainer.Entry().setLevel(50).setXP(157).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.MAHOGANY_LOGS, 1))
        .setPet(170874, ItemId.PHOENIX),
    new SkillContainer.Entry().setLevel(60).setXP(202).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.YEW_LOGS, 1))
        .setPet(149434, ItemId.PHOENIX),
    new SkillContainer.Entry().setLevel(75).setXP(303).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.MAGIC_LOGS, 1))
        .setPet(138583, ItemId.PHOENIX),
    new SkillContainer.Entry().setLevel(90).setXP(350).setAnimation(START_FIRE_ANIMATION).setAlwaysMake1(true)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.REDWOOD_LOGS, 1))
        .setPet(128885, ItemId.PHOENIX),
    new SkillContainer.Entry().setLevel(49)
        .setTool(new Item(ItemId.TINDERBOX, 1))
        .setConsume(new RandomItem(ItemId.BULLSEYE_LANTERN, 1))
        .setCreate(new RandomItem(ItemId.BULLSEYE_LANTERN_4550, 1))
);

skill = new SkillContainer() {
    getSkillId: function() {
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
        if (mapObject == null && this.isLog(entry.getConsume().getId())) {
            if (player.getHeight() != player.getClientHeight() || player.getController().hasSolidMapObject(player)) {
                player.getGameEncoder().sendMessage("You can't do this here.");
                return false;
            }
        }
        return true;
    },

    actionSuccessHook: function(player, event, npc, mapObject, entry) {
        if (this.isLog(entry.getConsume().getId())) {
            if (Utils.randomE(160 - entry.getLevel()) == 0) {
                player.getInventory().addOrDropItem(ItemId.SUPPLY_CRATE, 1);
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

    widgetOnMapObjectHook: function(player, interfaceId, childId, slot, mapObject) {
        if (interfaceId != WidgetId.INVENTORY || mapObject.getId() != FIRE_MAP_OBJECT) {
            return false;
        }
        var itemId = player.getInventory().getId(slot);
        if (!this.isLog(itemId)) {
            return false;
        }
        skill.openMakeX(player, mapObject, WidgetManager.MakeX.FIRE, player.getInventory().getCount(itemId),
                Utils.toList(skill.findEntryFromConsume(itemId)));
        return true;
    },

    isLog: function(itemId) {
        return itemId == ItemId.LOGS || itemId == ItemId.OAK_LOGS || itemId == ItemId.WILLOW_LOGS
                || itemId == ItemId.MAPLE_LOGS || itemId == ItemId.YEW_LOGS || itemId == ItemId.MAGIC_LOGS
                || itemId == ItemId.ACHEY_TREE_LOGS || itemId == ItemId.TEAK_LOGS || itemId == ItemId.ARCTIC_PINE_LOGS
                || itemId == ItemId.MAHOGANY_LOGS || itemId == ItemId.REDWOOD_LOGS || itemId == ItemId.KINDLING_20799;
    }
}
