var TOTAL_RESOURCES = 30;
var DRAGON_HARPOON = new Item(ItemID.DRAGON_HARPOON, 1)
var INFERNAL_HARPOON = new Item(ItemID.INFERNAL_HARPOON, 1);
var UNCHARGED_INFERNAL_HARPOON = new Item(ItemID.INFERNAL_HARPOON_UNCHARGED, 1);
var FLYING_FISH_GRAPHIC = new Graphic(1387);

var FLYING_FISH_ATTACHMENT = 0;

var ENTRIES = Utils.toList(
    new SkillContainer.Entry().setLevel(1).setXP(10).setAnimation(621)
        .setNpc(new SkillContainer.Model(0, NpcID.FISHING_SPOT_1514))
        .setTool(new Item(ItemID.SMALL_FISHING_NET, 1))
        .setCreate(new RandomItem(ItemID.RAW_SHRIMPS, 1))
        .setPet(435165, ItemID.HERON)
        .setClueChance(870330),
    new SkillContainer.Entry().setLevel(5).setXP(20).setAnimation(623)
        .setNpc(new SkillContainer.Model(2, NpcID.FISHING_SPOT_1514))
        .setTool(new Item(ItemID.FISHING_ROD, 1))
        .setConsume(new RandomItem(ItemID.FISHING_BAIT, 1))
        .setCreate(new RandomItem(ItemID.RAW_SARDINE, 1))
        .setPet(528000, ItemID.HERON)
        .setClueChance(1056000),
    new SkillContainer.Entry().setLevel(30).setXP(70).setAnimation(622)
        .setNpc(new SkillContainer.Model(0, NpcID.FISHING_SPOT_1506))
        .setTool(new Item(ItemID.FLY_FISHING_ROD, 1))
        .setConsume(new RandomItem(ItemID.FEATHER, 1))
        .setCreate(new RandomItem(ItemID.RAW_SALMON, 1))
        .setPet(461808, ItemID.HERON)
        .setClueChance(923616),
    new SkillContainer.Entry().setLevel(25).setXP(60).setAnimation(623)
        .setNpc(new SkillContainer.Model(2, NpcID.FISHING_SPOT_1506))
        .setTool(new Item(ItemID.FISHING_ROD, 1))
        .setConsume(new RandomItem(ItemID.FISHING_BAIT, 1))
        .setCreate(new RandomItem(ItemID.RAW_PIKE, 1))
        .setPet(305792, ItemID.HERON)
        .setClueChance(305792),
    new SkillContainer.Entry().setLevel(40).setXP(90).setAnimation(619)
        .setNpc(new SkillContainer.Model(0, NpcID.FISHING_SPOT_1510))
        .setTool(new Item(ItemID.LOBSTER_POT, 1))
        .setCreate(new RandomItem(ItemID.RAW_LOBSTER, 1))
        .setPet(116129, ItemID.HERON)
        .setClueChance(116129),
    new SkillContainer.Entry().setLevel(50).setXP(100).setAnimation(618)
        .setNpc(new SkillContainer.Model(2, NpcID.FISHING_SPOT_1510))
        .setTool(new Item(ItemID.HARPOON, 1))
        .setCreate(new RandomItem(ItemID.RAW_SWORDFISH, 1))
        .setPet(128885, ItemID.HERON)
        .setClueChance(257770),
    new SkillContainer.Entry().setLevel(46).setXP(100).setAnimation(620)
        .setNpc(new SkillContainer.Model(0, NpcID.FISHING_SPOT_1511))
        .setTool(new Item(ItemID.BIG_FISHING_NET, 1))
        .setCreate(new RandomItem(ItemID.RAW_BASS, 1))
        .setPet(128885, ItemID.HERON)
        .setClueChance(1147827),
    new SkillContainer.Entry().setLevel(76).setXP(110).setAnimation(618)
        .setNpc(new SkillContainer.Model(2, NpcID.FISHING_SPOT_1511),
            new SkillContainer.Model(2, NpcID.FISHING_SPOT_1520))
        .setTool(new Item(ItemID.HARPOON, 1))
        .setCreate(new RandomItem(ItemID.RAW_SHARK, 1))
        .setPet(82243, ItemID.HERON)
        .setClueChance(82243),
    new SkillContainer.Entry().setLevel(62).setXP(120).setAnimation(621)
        .setNpc(new SkillContainer.Model(0, NpcID.FISHING_SPOT_4316))
        .setTool(new Item(ItemID.SMALL_FISHING_NET, 1))
        .setCreate(new RandomItem(ItemID.RAW_MONKFISH, 1))
        .setPet(138583, ItemID.HERON)
        .setClueChance(138583),
    new SkillContainer.Entry().setLevel(65).setXP(105).setAnimation(620)
        .setNpc(new SkillContainer.Model(0, NpcID.FISHING_SPOT_4712))
        .setTool(new Item(ItemID.BIG_FISHING_NET, 1))
        .setCreate(new RandomItem(ItemID.RAW_KARAMBWAN, 1))
        .setPet(170874, ItemID.HERON)
        .setClueChance(170874),
    new SkillContainer.Entry().setLevel(85).setXP(130).setAnimation(619)
        .setNpc(new SkillContainer.Model(0, NpcID.FISHING_SPOT_1536))
        .setTool(new Item(ItemID.LOBSTER_POT, 1))
        .setConsume(new RandomItem(ItemID.DARK_FISHING_BAIT, 1))
        .setCreate(new RandomItem(ItemID.RAW_DARK_CRAB, 1))
        .setPet(149434, ItemID.HERON)
        .setClueChance(149434),
    new SkillContainer.Entry().setLevel(82).setXP(120).setAnimation(623)
        .setNpc(new SkillContainer.Model(0, NpcID.FISHING_SPOT_6825))
        .setTool(new Item(ItemID.FISHING_ROD, 1))
        .setConsume(new RandomItem(ItemID.SANDWORMS, 1))
        .setCreate(new RandomItem(ItemID.RAW_ANGLERFISH, 1))
        .setPet(78649, ItemID.HERON)
        .setClueChance(78649),
    new SkillContainer.Entry().setLevel(82).setXP(26).setAnimation(621)
        .setNpc(new SkillContainer.Model(0, NpcID.FISHING_SPOT_7730),
            new SkillContainer.Model(0, NpcID.FISHING_SPOT_7731))
        .setTool(new Item(ItemID.SMALL_FISHING_NET, 1))
        .setCreate(new RandomItem(ItemID.MINNOW, 10, 14))
        .setPet(977778, ItemID.HERON)
);

skill = new SkillContainer() {
    getSkillID: function() {
        return Skills.FISHING;
    },

    getEntries: function() {
        return ENTRIES;
    },

    getEventTick: function(player, event, npc, mapObject, entry) {
        return entry.getCreate().getID() == ItemID.MINNOW ? 1 : 5;
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
        if (entry.getCreate().getID() == ItemID.MINNOW) {
            unusualChance *= 5;
        }
        if (player.getEquipment().wearingAccomplishmentCape(skill.getSkillID())) {
            unusualChance /= 1.1;
        }
        if (Utils.randomE(unusualChance - entry.level) == 0) {
            player.getGameEncoder().sendMessage("<col=ff0000>You catch an unusual fish.</col>");
            return new Item(ItemID.UNUSUAL_FISH, 1);
        } else if (this.usingInfernalHarpoon(player, entry) && Cooking.getCook(entry.getCreate().getID()) != null
                && Utils.randomE(3) == 0) {
            player.setGraphic(86, 100);
            player.getSkills().addXP(Skills.COOKING, Cooking.getCook(entry.getCreate().getID()).getXP() / 2);
            player.getCharges().degradeItem(ItemID.INFERNAL_HARPOON);
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
        if (entry.getTool().getID() == ItemID.HARPOON) {
            if (this.usingInfernalHarpoon(player, entry) || this.usingUnchargedInfernalHarpoon(player, entry)) {
                return 7402;
            } else if (this.usingDragonHarpoon(player, entry)) {
                return 7401;
            }
        }
        return animation;
    },

    toolHook: function(player, tool, npc, mapObject, entry) {
        if (tool.getID() == ItemID.HARPOON) {
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
            player.getInventory().deleteItem(entry.getCreate().getID(), 16 + Utils.randomI(10));
            return true;
        }
        var power = player.getSkills().getLevel(skill.getSkillID()) + 8;
        var failure = entry.getLevel() + 2;
        if (player.inWildernessResourceArea()) {
            failure /= 2;
        }
        if (inFishingGuild(player)) {
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
        if (entry.getCreate().getID() == ItemID.MINNOW && Utils.randomE(64) == 0) {
            npc.setGraphic(FLYING_FISH_GRAPHIC);
            event.setAttachment(FLYING_FISH_ATTACHMENT, true);
        }
        if (npc.getID() == NpcID.FISHING_SPOT_7730 || npc.getID() == NpcID.FISHING_SPOT_7731
                || npc.getID() == NpcID.FISHING_SPOT_7732 || npc.getID() == NpcID.FISHING_SPOT_7733) {
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
        var clueID = ItemID.CLUE_BOTTLE_EASY;
        if (Utils.randomE(100) < 10) {
            clueID = ItemID.CLUE_BOTTLE_ELITE;
        } else if (Utils.randomE(100) < 20) {
            clueID = ItemID.CLUE_BOTTLE_HARD;
        } else if (Utils.randomE(100) < 30) {
            clueID = ItemID.CLUE_BOTTLE_MEDIUM;
        }
        player.getInventory().addOrDropItem(clueID, 1);
    },

    npcOptionHook: function(player, index, npc) {
        switch (npc.getID()) {
        case NpcID.ROACHEY:
            if (index == 0) {
                var unusualFishCount = player.getInventory().getCount(ItemID.UNUSUAL_FISH);
                if (unusualFishCount == 0) {
                    player.getGameEncoder().sendMessage("You have no unusual fish to exchange.")
                    return true;
                }
                player.getInventory().deleteItem(ItemID.UNUSUAL_FISH, Item.MAX_AMOUNT);
                player.getInventory().addOrDropItem(ItemID.COINS, 250000 * unusualFishCount);
                if (Utils.randomE(600 / unusualFishCount) == 0) {
                    player.getInventory().addOrDropItem(ItemID.GOLDEN_TENCH, 1);
                }
            } else if (index == 2) {
                player.openShop("skilling");
            }
            return true;
        }
        return false;
    },

    usingDragonHarpoon: function(player, entry) {
        return player.getSkills().getLevel(skill.getSkillID()) >= 61 && entry.usesTool(ItemID.HARPOON)
                && player.carryingItem(ItemID.DRAGON_HARPOON);
    },

    usingInfernalHarpoon: function(player, entry) {
        return player.getSkills().getLevel(skill.getSkillID()) >= 75 && entry.usesTool(ItemID.HARPOON)
                && player.carryingItem(ItemID.INFERNAL_HARPOON);
    },

    usingUnchargedInfernalHarpoon: function(player, entry) {
        return player.getSkills().getLevel(skill.getSkillID()) >= 75 && entry.usesTool(ItemID.HARPOON)
                && player.carryingItem(ItemID.INFERNAL_HARPOON);
    },

    inFishingGuild: function(tile) {
        return tile.getX() >= 2595 && tile.getX() <= 2622 && tile.getY() >= 3405 && tile.getY() <= 3446;
    }
}
