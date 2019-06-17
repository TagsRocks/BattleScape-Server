function Hatchet(itemId, level, animation) {
    this.itemId = itemId;
    this.level = level;
    this.animation = animation;
}

function Fire(level, xp, petChance) {
    this.level = level;
    this.xp = xp;
    this.petChance = petChance;
}

function getHatchet(player) {
    for (var i = HATCHETS.length - 1; i >= 0; i--) {
        var hatchet = HATCHETS[i];
        if (!player.carryingItem(hatchet.itemId)) {
            continue;
        } else if (player.getSkills().getLevel(Skills.WOODCUTTING) < hatchet.level) {
            continue;
        }
        return hatchet;
    }
    return null;
}

var HATCHETS = [
    new Hatchet(ItemId.BRONZE_AXE, 1, 879),
    new Hatchet(ItemId.IRON_AXE, 1, 877),
    new Hatchet(ItemId.STEEL_AXE, 6, 875),
    new Hatchet(ItemId.MITHRIL_AXE, 21, 871),
    new Hatchet(ItemId.ADAMANT_AXE, 31, 869),
    new Hatchet(ItemId.RUNE_AXE, 41, 867),
    new Hatchet(ItemId.DRAGON_AXE, 61, 2846),
    new Hatchet(ItemId._3RD_AGE_AXE, 61, 7264),
    new Hatchet(ItemId.INFERNAL_AXE, 61, 2117),
    new Hatchet(ItemId.INFERNAL_AXE_UNCHARGED, 61, 2117)
];

var COLORED_EGG_NESTS = [
    new Item(ItemId.BIRD_NEST, 1),
    new Item(ItemId.BIRD_NEST_5071, 1),
    new Item(ItemId.BIRD_NEST_5072, 1)
];

var EVIL_CHICKEN_OUTFIT = [
    new Item(ItemId.EVIL_CHICKEN_FEET, 1),
    new Item(ItemId.EVIL_CHICKEN_WINGS, 1),
    new Item(ItemId.EVIL_CHICKEN_HEAD, 1),
    new Item(ItemId.EVIL_CHICKEN_LEGS, 1)
];

var ENTRIES = Utils.toList(
    new SkillContainer.Entry().setLevel(1).setXP(25)
        .setMapObject(
            new SkillContainer.Model(0, 1276), new SkillContainer.Model(0, 1277), new SkillContainer.Model(0, 1278),
            new SkillContainer.Model(0, 1279), new SkillContainer.Model(0, 1280), new SkillContainer.Model(0, 1282),
            new SkillContainer.Model(0, 1283), new SkillContainer.Model(0, 1284), new SkillContainer.Model(0, 1285),
            new SkillContainer.Model(0, 1286), new SkillContainer.Model(0, 1289), new SkillContainer.Model(0, 1290),
            new SkillContainer.Model(0, 1291)
        )
        .setCreate(new RandomItem(ItemId.LOGS, 1))
        .setPet(317647, ItemId.BEAVER)
        .setClueChance(317647)
        .setTemporaryMapObject(1342, 5, 8),
    new SkillContainer.Entry().setLevel(15).setXP(38)
        .setMapObject(new SkillContainer.Model(0, 1751))
        .setCreate(new RandomItem(ItemId.OAK_LOGS, 1))
        .setPet(361146, ItemId.BEAVER)
        .setClueChance(361146)
        .setTemporaryMapObject(1342, 8, 8),
    new SkillContainer.Entry().setLevel(30).setXP(68)
        .setMapObject(
            new SkillContainer.Model(0, 1750), new SkillContainer.Model(0, 1756), new SkillContainer.Model(0, 1758),
            new SkillContainer.Model(0, 1760)
        )
        .setCreate(new RandomItem(ItemId.WILLOW_LOGS, 1))
        .setPet(289286, ItemId.BEAVER)
        .setClueChance(289286)
        .setTemporaryMapObject(1342, 11, 8),
    new SkillContainer.Entry().setLevel(45).setXP(100)
        .setMapObject(new SkillContainer.Model(0, 1759))
        .setCreate(new RandomItem(ItemId.MAPLE_LOGS, 1))
        .setPet(221918, ItemId.BEAVER)
        .setClueChance(221918)
        .setTemporaryMapObject(1342, 14, 8),
    new SkillContainer.Entry().setLevel(60).setXP(175)
        .setMapObject(new SkillContainer.Model(0, 1753))
        .setCreate(new RandomItem(ItemId.YEW_LOGS, 1))
        .setPet(145013, ItemId.BEAVER)
        .setClueChance(145013)
        .setTemporaryMapObject(1342, 16, 8),
    new SkillContainer.Entry().setLevel(75).setXP(250)
        .setMapObject(new SkillContainer.Model(0, 1761))
        .setCreate(new RandomItem(ItemId.MAGIC_LOGS, 1))
        .setPet(72321, ItemId.BEAVER)
        .setClueChance(72321)
        .setTemporaryMapObject(1342, 20, 8),
    new SkillContainer.Entry().setLevel(90).setXP(380)
        .setMapObject(new SkillContainer.Model(0, 29668), new SkillContainer.Model(0, 29670))
        .setCreate(new RandomItem(ItemId.REDWOOD_LOGS, 1))
        .setPet(72321, ItemId.BEAVER)
        .setClueChance(72321),
    new SkillContainer.Entry().setLevel(1).setXP(45)
        .setMapObject(new SkillContainer.Model(0, 29763))
        .setCreate(new RandomItem(ItemId.KINDLING_20799, 1))
);

skill = new SkillContainer() {
    getSkillId: function() {
        return Skills.WOODCUTTING;
    },

    getEntries: function() {
        return ENTRIES;
    },

    script: function(name, args) {
        if (name.equals("farming_resources")) {
            return 8;
        } else if (name.equals("animation")) {
            var hatchet = getHatchet(args[0]);
            return hatchet != null ? hatchet.animation : -1;
        }
        return null;
    },

    getEventTick: function(player, event, npc, mapObject, entry) {
        return 5;
    },

    eventStartedHook: function(player, event, npc, mapObject, entry) {
        player.getGameEncoder().sendMessage("You swing your axe at the tree.");
    },

    eventStoppedHook: function(player, event, npc, mapObject, entry) {
        player.setAnimation(-1);
    },

    createHook: function(player, item, npc, mapObject, entry) {
        var fireContainer = SkillContainer.get(Skills.FIREMAKING);
        var fireEntry = fireContainer.findEntryFromConsume(item.getId());
        if (getHatchet(player).itemId == ItemId.INFERNAL_AXE && fireEntry != null
                && Utils.randomE(3) == 0) {
            var fireXP = fireContainer.xpHook(player, fireEntry.getXP(), npc, mapObject, fireEntry);
            player.setGraphic(86, 100);
            player.getSkills().addXP(Skills.FIREMAKING, fireXP / 2);
            player.getCharges().degradeItem(ItemId.INFERNAL_AXE);
            fireContainer.rollPet(player, fireEntry);
            if (Utils.randomE(160 - fireEntry.getLevel()) == 0) {
                player.getInventory().addOrDropItem(ItemId.SUPPLY_CRATE, 1);
            }
            return null;
        } else {
            player.getGameEncoder().sendMessage("You get some " + item.getDef().getLCName() + ".");
        }
        return item;
    },

    xpHook: function(player, xp, npc, mapObject, entry) {
        if (player.getEquipment().wearingLumberjackOutfit()) {
            xp *= 1.1;
        }
        return xp;
    },

    animationHook: function(player, animation, npc, mapObject, entry) {
        return getHatchet(player).animation;
    },

    canDoActionHook: function(player, event, npc, mapObject, entry) {
        if (getHatchet(player) == null) {
            player.getGameEncoder().sendMessage("You need an axe to do this.");
            return false;
        }
        return true;
    },

    failedActionHook: function(player, event, npc, mapObject, entry) {
        var power = (player.getSkills().getLevel(skill.getSkillId()) / 2)
                + (getHatchet(player).level / 2) + 8;
        var failure = entry.getLevel() + 2;
        if (this.inWoodcuttingGuild(player)) {
            power += 7;
        }
        var chance = 0;
        if (power > failure) {
            chance = 1 - (failure + 2) / ((power + 1) * 2.0);
        } else {
            chance = power / ((failure + 1) * 2.0);
        }
        if (player.getEquipment().wearingLumberjackOutfit()) {
            chance = Math.min(Utils.addDoubles(chance, 0.1), 1.0);
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
        skill.setTemporaryMapObject(player, mapObject, entry);
        var nestChance = 256;
        if (player.getEquipment().wearingAccomplishmentCape(skill.getSkillId())) {
            nestChance /= 1.1;
        }
        if (Utils.randomE(nestChance - entry.level) == 0) {
            if (this.inWoodcuttingGuild(player)) {
                player.getController().addMapItem(Utils.arrayRandom(COLORED_EGG_NESTS), player, player);
            } else {
                player.getController().addMapItem(new Item(ItemId.BIRD_NEST_5073, 1), player, player);
            }
            player.getGameEncoder().sendMessage("<col=ff0000>A bird's nest falls out of the tree.</col>");
        }
    },

    clueChanceHook: function(player, chance, npc, mapObject, entry) {
        if (player.getEquipment().wearingLumberjackOutfit()) {
            return chance / 1.05;
        }
        return chance;
    },

    clueRolledHook: function(player, npc, mapObject, entry) {
        var clueId = ItemId.CLUE_NEST_EASY;
        if (Utils.randomE(100) < 10) {
            clueId = ItemId.CLUE_NEST_ELITE;
        } else if (Utils.randomE(100) < 20) {
            clueId = ItemId.CLUE_NEST_HARD;
        } else if (Utils.randomE(100) < 30) {
            clueId = ItemId.CLUE_NEST_MEDIUM;
        }
        player.getInventory().addOrDropItem(clueId, 1);
    },

    mapObjectOptionHook: function(player, index, mapObject) {
        switch (mapObject.getId()) {
        case 29088: // Woodcutting Guild shrine
            var eggCount = player.getInventory().getCount(ItemId.BIRDS_EGG)
                    + player.getInventory().getCount(ItemId.BIRDS_EGG_5077)
                    + player.getInventory().getCount(ItemId.BIRDS_EGG_5078);
            if (eggCount == 0) {
                player.getGameEncoder().sendMessage("You have no eggs to exchange.")
                return true;
            }
            player.getInventory().deleteItem(ItemId.BIRDS_EGG, Item.MAX_AMOUNT);
            player.getInventory().deleteItem(ItemId.BIRDS_EGG_5077, Item.MAX_AMOUNT);
            player.getInventory().deleteItem(ItemId.BIRDS_EGG_5078, Item.MAX_AMOUNT);
            player.getInventory().addOrDropItem(ItemId.COINS, 400000 * eggCount);
            player.getInventory().addOrDropItem(ItemId.BIRD_NEST_5073, 1 * eggCount);
            if (Utils.randomE(300 / eggCount) == 0) {
                player.getInventory().addOrDropItem(Utils.arrayRandom(EVIL_CHICKEN_OUTFIT));
            }
            return true;
        }
        return false;
    },

    inWoodcuttingGuild: function(tile) {
        return tile.getX() >= 1607 && tile.getX() <= 1657 && tile.getY() >= 3487 && tile.getY() <= 3518
                || tile.getX() >= 1563 && tile.getX() <= 1600 && tile.getY() >= 3472 && tile.getY() <= 3503;
    }
}
