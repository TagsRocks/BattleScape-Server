var TOTAL_RESOURCES = 30;
var DRAGON_HARPOON = new Item(ItemId.DRAGON_HARPOON, 1)
var INFERNAL_HARPOON = new Item(ItemId.INFERNAL_HARPOON, 1);
var UNCHARGED_INFERNAL_HARPOON = new Item(ItemId.INFERNAL_HARPOON_UNCHARGED, 1);
var FLYING_FISH_GRAPHIC = new Graphic(1387);

var FLYING_FISH_ATTACHMENT = 0;

var ENTRIES = Utils.toList(
    new SkillContainer.Entry().setLevel(1).setXP(10).setAnimation(621)
        .setNpc(new SkillContainer.Model(0, NpcId.FISHING_SPOT_1514))
        .setTool(new Item(ItemId.SMALL_FISHING_NET, 1))
        .setCreate(new RandomItem(ItemId.RAW_SHRIMPS, 1))
        .setPet(435165, ItemId.HERON)
        .setClueChance(870330),
    new SkillContainer.Entry().setLevel(5).setXP(20).setAnimation(623)
        .setNpc(new SkillContainer.Model(2, NpcId.FISHING_SPOT_1514))
        .setTool(new Item(ItemId.FISHING_ROD, 1))
        .setConsume(new RandomItem(ItemId.FISHING_BAIT, 1))
        .setCreate(new RandomItem(ItemId.RAW_SARDINE, 1))
        .setPet(528000, ItemId.HERON)
        .setClueChance(1056000),
    new SkillContainer.Entry().setLevel(30).setXP(70).setAnimation(622)
        .setNpc(new SkillContainer.Model(0, NpcId.FISHING_SPOT_1506))
        .setTool(new Item(ItemId.FLY_FISHING_ROD, 1))
        .setConsume(new RandomItem(ItemId.FEATHER, 1))
        .setCreate(new RandomItem(ItemId.RAW_SALMON, 1))
        .setPet(461808, ItemId.HERON)
        .setClueChance(923616),
    new SkillContainer.Entry().setLevel(25).setXP(60).setAnimation(623)
        .setNpc(new SkillContainer.Model(2, NpcId.FISHING_SPOT_1506))
        .setTool(new Item(ItemId.FISHING_ROD, 1))
        .setConsume(new RandomItem(ItemId.FISHING_BAIT, 1))
        .setCreate(new RandomItem(ItemId.RAW_PIKE, 1))
        .setPet(305792, ItemId.HERON)
        .setClueChance(305792),
    new SkillContainer.Entry().setLevel(40).setXP(90).setAnimation(619)
        .setNpc(new SkillContainer.Model(0, NpcId.FISHING_SPOT_1510))
        .setTool(new Item(ItemId.LOBSTER_POT, 1))
        .setCreate(new RandomItem(ItemId.RAW_LOBSTER, 1))
        .setPet(116129, ItemId.HERON)
        .setClueChance(116129),
    new SkillContainer.Entry().setLevel(50).setXP(100).setAnimation(618)
        .setNpc(new SkillContainer.Model(2, NpcId.FISHING_SPOT_1510))
        .setTool(new Item(ItemId.HARPOON, 1))
        .setCreate(new RandomItem(ItemId.RAW_SWORDFISH, 1))
        .setPet(128885, ItemId.HERON)
        .setClueChance(257770),
    new SkillContainer.Entry().setLevel(46).setXP(100).setAnimation(620)
        .setNpc(new SkillContainer.Model(0, NpcId.FISHING_SPOT_1511))
        .setTool(new Item(ItemId.BIG_FISHING_NET, 1))
        .setCreate(new RandomItem(ItemId.RAW_BASS, 1))
        .setPet(128885, ItemId.HERON)
        .setClueChance(1147827),
    new SkillContainer.Entry().setLevel(76).setXP(110).setAnimation(618)
        .setNpc(new SkillContainer.Model(2, NpcId.FISHING_SPOT_1511),
            new SkillContainer.Model(2, NpcId.FISHING_SPOT_1520))
        .setTool(new Item(ItemId.HARPOON, 1))
        .setCreate(new RandomItem(ItemId.RAW_SHARK, 1))
        .setPet(82243, ItemId.HERON)
        .setClueChance(82243),
    new SkillContainer.Entry().setLevel(62).setXP(120).setAnimation(621)
        .setNpc(new SkillContainer.Model(0, NpcId.FISHING_SPOT_4316))
        .setTool(new Item(ItemId.SMALL_FISHING_NET, 1))
        .setCreate(new RandomItem(ItemId.RAW_MONKFISH, 1))
        .setPet(138583, ItemId.HERON)
        .setClueChance(138583),
    new SkillContainer.Entry().setLevel(65).setXP(105).setAnimation(620)
        .setNpc(new SkillContainer.Model(0, NpcId.FISHING_SPOT_4712))
        .setTool(new Item(ItemId.BIG_FISHING_NET, 1))
        .setCreate(new RandomItem(ItemId.RAW_KARAMBWAN, 1))
        .setPet(170874, ItemId.HERON)
        .setClueChance(170874),
    new SkillContainer.Entry().setLevel(85).setXP(130).setAnimation(619)
        .setNpc(new SkillContainer.Model(0, NpcId.FISHING_SPOT_1536))
        .setTool(new Item(ItemId.LOBSTER_POT, 1))
        .setConsume(new RandomItem(ItemId.DARK_FISHING_BAIT, 1))
        .setCreate(new RandomItem(ItemId.RAW_DARK_CRAB, 1))
        .setPet(149434, ItemId.HERON)
        .setClueChance(149434),
    new SkillContainer.Entry().setLevel(82).setXP(120).setAnimation(623)
        .setNpc(new SkillContainer.Model(0, NpcId.FISHING_SPOT_6825))
        .setTool(new Item(ItemId.FISHING_ROD, 1))
        .setConsume(new RandomItem(ItemId.SANDWORMS, 1))
        .setCreate(new RandomItem(ItemId.RAW_ANGLERFISH, 1))
        .setPet(78649, ItemId.HERON)
        .setClueChance(78649),
    new SkillContainer.Entry().setLevel(82).setXP(26).setAnimation(621)
        .setNpc(new SkillContainer.Model(0, NpcId.FISHING_SPOT_7730),
            new SkillContainer.Model(0, NpcId.FISHING_SPOT_7731))
        .setTool(new Item(ItemId.SMALL_FISHING_NET, 1))
        .setCreate(new RandomItem(ItemId.MINNOW, 10, 14))
        .setPet(977778, ItemId.HERON)
);

skill = new SkillContainer() {
    getSkillId: function() {
        return Skills.FISHING;
    },

    getEntries: function() {
        return ENTRIES;
    },

    getEventTick: function(player, event, npc, mapObject, entry) {
        return entry.getCreate().getId() == ItemId.MINNOW ? 1 : 5;
    },

    eventStartedHook: function(player, event, npc, mapObject, entry) {
        player.getGameEncoder().sendMessage("You attempt to catch a fish.");
        player.setFaceEntity(npc);
    },

    eventStoppedHook: function(player, event, npc, mapObject, entry) {
        player.setAnimation(-1);
    },

    createHook: function(player, item, npc, mapObject, entry) {
        var unusualChance = 256;
        if (entry.getCreate().getId() == ItemId.MINNOW) {
            unusualChance *= 5;
        }
        if (player.getEquipment().wearingAccomplishmentCape(skill.getSkillId())) {
            unusualChance /= 1.1;
        }
        if (Utils.randomE(unusualChance - entry.level) == 0) {
            player.getGameEncoder().sendMessage("<col=ff0000>You catch an unusual fish.</col>");
            return new Item(ItemId.UNUSUAL_FISH, 1);
        } else if (this.usingInfernalHarpoon(player, entry) && Cooking.getCook(entry.getCreate().getId()) != null
                && Utils.randomE(3) == 0) {
            player.setGraphic(86, 100);
            player.getSkills().addXP(Skills.COOKING, Cooking.getCook(entry.getCreate().getId()).getXP() / 2);
            player.getCharges().degradeItem(ItemId.INFERNAL_HARPOON);
            return null;
        } else {
            amount = item.getAmount();
            if (player.inWildernessResourceArea() && Utils.randomE(2) == 0) {
                item.setAmount(item.getAmount() * 2);
            }
            var createName = item.getName().replace("Raw ", "");
            if (createName.endsWith("s")) {
                player.getGameEncoder().sendFilteredMessage("You catch some " + createName + ".");
            } else if (amount > 1) {
                player.getGameEncoder().sendFilteredMessage("You catch some " + createName + "s.");
            } else {
                player.getGameEncoder().sendFilteredMessage("You catch a " + createName + ".");
            }
        }
        return item;
    },

    xpHook: function(player, xp, npc, mapObject, entry) {
        if (player.getEquipment().wearingAnglerOutfit()) {
            xp *= 1.1;
        }
        return xp;
    },

    animationHook: function(player, animation, npc, mapObject, entry) {
        if (entry.getTool().getId() == ItemId.HARPOON) {
            if (this.usingInfernalHarpoon(player, entry) || this.usingUnchargedInfernalHarpoon(player, entry)) {
                return 7402;
            } else if (this.usingDragonHarpoon(player, entry)) {
                return 7401;
            }
        }
        return animation;
    },

    toolHook: function(player, tool, npc, mapObject, entry) {
        if (tool.getId() == ItemId.HARPOON) {
            if (this.usingInfernalHarpoon(player, entry)) {
                return INFERNAL_HARPOON;
            } else if (this.usingUnchargedInfernalHarpoon(player, entry)) {
                return UNCHARGED_INFERNAL_HARPOON;
            } else if (this.usingDragonHarpoon(player, entry)) {
                return DRAGON_HARPOON;
            }
        }
        return tool;
    },

    failedActionHook: function(player, event, npc, mapObject, entry) {
        if (event != null && event.getAttachment(FLYING_FISH_ATTACHMENT) == true) {
            npc.setGraphic(FLYING_FISH_GRAPHIC);
            player.getInventory().deleteItem(entry.getCreate().getId(), 16 + Utils.randomI(10));
            return true;
        }
        var power = player.getSkills().getLevel(skill.getSkillId()) + 8;
        var failure = entry.getLevel() + 2;
        if (player.inWildernessResourceArea()) {
            failure /= 2;
        }
        if (this.inFishingGuild(player)) {
            power += 7;
        }
        var chance = 0;
        if (power > failure) {
            chance = 1 - (failure + 2) / ((power + 1) * 2.0);
        } else {
            chance = power / ((failure + 1) * 2.0);
        }
        if (player.getEquipment().wearingAnglerOutfit()) {
            chance = Math.min(Utils.addDoubles(chance, 0.1), 1.0);
        }
        if (this.usingDragonHarpoon(player, entry) || this.usingInfernalHarpoon(player, entry)
                || this.usingUnchargedInfernalHarpoon(player, entry)) {
            chance = Math.min(Utils.addDoubles(chance, 0.2), 1.0);
        }
        if (player.getGoldMember()) {
            chance = Math.min(Utils.addDoubles(chance, 0.05), 1.0);
        }
        if (player.hasVoted()) {
            chance = Math.min(Utils.addDoubles(chance, 0.05), 1.0);
        }
        if (player.getController().inWilderness()) {
            chance = Math.min(Utils.addDoubles(chance, 0.1), 1.0);
        }
        return Utils.randomI(100) < Math.max(0.01, 1 - chance) * 100;
    },

    actionSuccessHook: function(player, event, npc, mapObject, entry) {
        if (entry.getCreate().getId() == ItemId.MINNOW && Utils.randomE(64) == 0) {
            npc.setGraphic(FLYING_FISH_GRAPHIC);
            event.setAttachment(FLYING_FISH_ATTACHMENT, true);
        }
        if (npc.getId() == NpcId.FISHING_SPOT_7730 || npc.getId() == NpcId.FISHING_SPOT_7731
                || npc.getId() == NpcId.FISHING_SPOT_7732 || npc.getId() == NpcId.FISHING_SPOT_7733) {
            return;
        }
        if (npc.getMaxHitpoints() == 0) {
            npc.setMaxHitpoints(TOTAL_RESOURCES);
            npc.setHitpoints(TOTAL_RESOURCES);
        }
        npc.adjustHitpoints(-1);
    },

    clueChanceHook: function(player, chance, npc, mapObject, entry) {
        if (player.getEquipment().wearingAnglerOutfit()) {
            return chance / 1.05;
        }
        return chance;
    },

    clueRolledHook: function(player, npc, mapObject, entry) {
        var clueId = ItemId.CLUE_BOTTLE_EASY;
        if (Utils.randomE(100) < 10) {
            clueId = ItemId.CLUE_BOTTLE_ELITE;
        } else if (Utils.randomE(100) < 20) {
            clueId = ItemId.CLUE_BOTTLE_HARD;
        } else if (Utils.randomE(100) < 30) {
            clueId = ItemId.CLUE_BOTTLE_MEDIUM;
        }
        player.getInventory().addOrDropItem(clueId, 1);
    },

    npcOptionHook: function(player, index, npc) {
        switch (npc.getId()) {
        case NpcId.ROACHEY:
            if (index == 0) {
                var unusualFishCount = player.getInventory().getCount(ItemId.UNUSUAL_FISH);
                if (unusualFishCount == 0) {
                    player.getGameEncoder().sendMessage("You have no unusual fish to exchange.")
                    return true;
                }
                player.getInventory().deleteItem(ItemId.UNUSUAL_FISH, Item.MAX_AMOUNT);
                player.getInventory().addOrDropItem(ItemId.COINS, 250000 * unusualFishCount);
                if (Utils.randomE(600 / unusualFishCount) == 0) {
                    player.getInventory().addOrDropItem(ItemId.GOLDEN_TENCH, 1);
                }
            } else if (index == 2) {
                if (Main.isSpawn()) {
                    player.openShop("skilling_spawn");
                } else {
                    player.openShop("skilling");
                }
            }
            return true;
        }
        return false;
    },

    usingDragonHarpoon: function(player, entry) {
        return player.getSkills().getLevel(skill.getSkillId()) >= 61 && entry.usesTool(ItemId.HARPOON)
                && player.carryingItem(ItemId.DRAGON_HARPOON);
    },

    usingInfernalHarpoon: function(player, entry) {
        return player.getSkills().getLevel(skill.getSkillId()) >= 75 && entry.usesTool(ItemId.HARPOON)
                && player.carryingItem(ItemId.INFERNAL_HARPOON);
    },

    usingUnchargedInfernalHarpoon: function(player, entry) {
        return player.getSkills().getLevel(skill.getSkillId()) >= 75 && entry.usesTool(ItemId.HARPOON)
                && player.carryingItem(ItemId.INFERNAL_HARPOON);
    },

    inFishingGuild: function(tile) {
        return tile.getX() >= 2595 && tile.getX() <= 2622 && tile.getY() >= 3405 && tile.getY() <= 3446;
    }
}
