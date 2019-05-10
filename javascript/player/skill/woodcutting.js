function Hatchet(itemID, level, animation) {
    this.itemID = itemID;
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
        if (!player.carryingItem(hatchet.itemID)) {
            continue;
        } else if (player.getSkills().getLevel(Skills.WOODCUTTING) < hatchet.level) {
            continue;
        }
        return hatchet;
    }
    return null;
}

var HATCHETS = [
    new Hatchet(ItemID.BRONZE_AXE, 1, 879),
    new Hatchet(ItemID.IRON_AXE, 1, 877),
    new Hatchet(ItemID.STEEL_AXE, 6, 875),
    new Hatchet(ItemID.MITHRIL_AXE, 21, 871),
    new Hatchet(ItemID.ADAMANT_AXE, 31, 869),
    new Hatchet(ItemID.RUNE_AXE, 41, 867),
    new Hatchet(ItemID.DRAGON_AXE, 61, 2846),
    new Hatchet(ItemID._3RD_AGE_AXE, 61, 7264),
    new Hatchet(ItemID.INFERNAL_AXE, 61, 2117),
    new Hatchet(ItemID.INFERNAL_AXE_UNCHARGED, 61, 2117)
];

var COLORED_EGG_NESTS = [
    new Item(ItemID.BIRD_NEST, 1),
    new Item(ItemID.BIRD_NEST_5071, 1),
    new Item(ItemID.BIRD_NEST_5072, 1)
];

var EVIL_CHICKEN_OUTFIT = [
    new Item(ItemID.EVIL_CHICKEN_FEET, 1),
    new Item(ItemID.EVIL_CHICKEN_WINGS, 1),
    new Item(ItemID.EVIL_CHICKEN_HEAD, 1),
    new Item(ItemID.EVIL_CHICKEN_LEGS, 1)
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
        .setCreate(new RandomItem(ItemID.LOGS, 1))
        .setPet(317647, ItemID.BEAVER)
        .setClueChance(317647)
        .setTemporaryMapObject(1342, 5, 8),
    new SkillContainer.Entry().setLevel(15).setXP(38)
        .setMapObject(new SkillContainer.Model(0, 1751))
        .setCreate(new RandomItem(ItemID.OAK_LOGS, 1))
        .setPet(361146, ItemID.BEAVER)
        .setClueChance(361146)
        .setTemporaryMapObject(1342, 8, 8),
    new SkillContainer.Entry().setLevel(30).setXP(68)
        .setMapObject(
            new SkillContainer.Model(0, 1750), new SkillContainer.Model(0, 1756), new SkillContainer.Model(0, 1758),
            new SkillContainer.Model(0, 1760)
        )
        .setCreate(new RandomItem(ItemID.WILLOW_LOGS, 1))
        .setPet(289286, ItemID.BEAVER)
        .setClueChance(289286)
        .setTemporaryMapObject(1342, 11, 8),
    new SkillContainer.Entry().setLevel(45).setXP(100)
        .setMapObject(new SkillContainer.Model(0, 1759))
        .setCreate(new RandomItem(ItemID.MAPLE_LOGS, 1))
        .setPet(221918, ItemID.BEAVER)
        .setClueChance(221918)
        .setTemporaryMapObject(1342, 14, 8),
    new SkillContainer.Entry().setLevel(60).setXP(175)
        .setMapObject(new SkillContainer.Model(0, 1753))
        .setCreate(new RandomItem(ItemID.YEW_LOGS, 1))
        .setPet(145013, ItemID.BEAVER)
        .setClueChance(145013)
        .setTemporaryMapObject(1342, 16, 8),
    new SkillContainer.Entry().setLevel(75).setXP(250)
        .setMapObject(new SkillContainer.Model(0, 1761))
        .setCreate(new RandomItem(ItemID.MAGIC_LOGS, 1))
        .setPet(72321, ItemID.BEAVER)
        .setClueChance(72321)
        .setTemporaryMapObject(1342, 20, 8),
    new SkillContainer.Entry().setLevel(90).setXP(380)
        .setMapObject(new SkillContainer.Model(0, 29668), new SkillContainer.Model(0, 29670))
        .setCreate(new RandomItem(ItemID.REDWOOD_LOGS, 1))
        .setPet(72321, ItemID.BEAVER)
        .setClueChance(72321),
    new SkillContainer.Entry().setLevel(1).setXP(45)
        .setMapObject(new SkillContainer.Model(0, 29763))
        .setCreate(new RandomItem(ItemID.KINDLING_20799, 1))
);

skill = new SkillContainer() {
    getSkillID: function() {
        return Skills.WOODCUTTING;
    },

    getEntries: function() {
        return ENTRIES;
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
        var fireEntry = fireContainer.findEntryFromConsume(item.getID());
        if (getHatchet(player).itemID == ItemID.INFERNAL_AXE && fireEntry != null
                && Utils.randomE(3) == 0) {
            var fireXP = fireContainer.xpHook(player, fireEntry.getXP(), npc, mapObject, fireEntry);
            player.setGraphic(86, 100);
            player.getSkills().addXP(Skills.FIREMAKING, fireXP / 2);
            player.getCharges().degradeItem(ItemID.INFERNAL_AXE);
            fireContainer.rollPet(player, fireEntry);
            if (Utils.randomE(160 - fireEntry.getLevel()) == 0) {
                player.getInventory().addOrDropItem(ItemID.SUPPLY_CRATE, 1);
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
        var power = (player.getSkills().getLevel(skill.getSkillID()) / 2)
                + (getHatchet(player).level / 2) + 8;
        var failure = entry.getLevel() + 2;
        if (player.inWoodcuttingGuild()) {
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
        if (player.getEquipment().wearingAccomplishmentCape(skill.getSkillID())) {
            nestChance /= 1.1;
        }
        if (Utils.randomE(nestChance - entry.level) == 0) {
            if (player.inWoodcuttingGuild()) {
                player.getController().addMapItem(Utils.arrayRandom(COLORED_EGG_NESTS), player, player);
            } else {
                player.getController().addMapItem(new Item(ItemID.BIRD_NEST_5073, 1), player, player);
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
        var clueID = ItemID.CLUE_NEST_EASY;
        if (Utils.randomE(100) < 10) {
            clueID = ItemID.CLUE_NEST_ELITE;
        } else if (Utils.randomE(100) < 20) {
            clueID = ItemID.CLUE_NEST_HARD;
        } else if (Utils.randomE(100) < 30) {
            clueID = ItemID.CLUE_NEST_MEDIUM;
        }
        player.getInventory().addOrDropItem(clueID, 1);
    },

    mapObjectOptionHook: function(player, index, mapObject) {
        switch (mapObject.getID()) {
        case 29088: // Woodcutting Guild shrine
            var eggCount = player.getInventory().getCount(ItemID.BIRDS_EGG)
                    + player.getInventory().getCount(ItemID.BIRDS_EGG_5077)
                    + player.getInventory().getCount(ItemID.BIRDS_EGG_5078);
            if (eggCount == 0) {
                player.getGameEncoder().sendMessage("You have no eggs to exchange.")
                return true;
            }
            player.getInventory().deleteItem(ItemID.BIRDS_EGG, Item.MAX_AMOUNT);
            player.getInventory().deleteItem(ItemID.BIRDS_EGG_5077, Item.MAX_AMOUNT);
            player.getInventory().deleteItem(ItemID.BIRDS_EGG_5078, Item.MAX_AMOUNT);
            player.getInventory().addOrDropItem(ItemID.COINS, 400000 * eggCount);
            player.getInventory().addOrDropItem(ItemID.BIRD_NEST_5073, 1 * eggCount);
            if (Utils.randomE(300 / eggCount) == 0) {
                player.getInventory().addOrDropItem(Utils.arrayRandom(EVIL_CHICKEN_OUTFIT));
            }
            return true;
        }
        return false;
    }
}
