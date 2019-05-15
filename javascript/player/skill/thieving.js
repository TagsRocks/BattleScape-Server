var ENTRIES = Utils.toList(
    new SkillContainer.Entry().setLevel(1).setXP(8).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcID.MAN_2_3078), new SkillContainer.Model(2, NpcID.MAN_2_3079),
            new SkillContainer.Model(2, NpcID.MAN_2_3080), new SkillContainer.Model(2, NpcID.MAN_2_3081),
            new SkillContainer.Model(2, NpcID.MAN_2_3082), new SkillContainer.Model(2, NpcID.WOMAN_2_3083),
            new SkillContainer.Model(2, NpcID.WOMAN_2_3084), new SkillContainer.Model(2, NpcID.WOMAN_2_3085),
            new SkillContainer.Model(2, NpcID.MAN_2_3264), new SkillContainer.Model(2, NpcID.MAN_2_3265),
            new SkillContainer.Model(2, NpcID.MAN_2_3266), new SkillContainer.Model(2, NpcID.WOMAN_2_3267),
            new SkillContainer.Model(2, NpcID.WOMAN_2_3268))
        .setCreate(new RandomItem(ItemID.BRONZE_SCIMITAR, 1))
        .setPet(257211, ItemID.ROCKY)
        .setFailedHit(new Hit(1)),
    new SkillContainer.Entry().setLevel(25).setXP(26).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcID.WARRIOR_WOMAN_24),
            new SkillContainer.Model(2, NpcID.AL_KHARID_WARRIOR_9))
        .setCreate(new RandomItem(ItemID.IRON_SCIMITAR, 1))
        .setPet(225000, ItemID.ROCKY)
        .setFailedHit(new Hit(2)),
    new SkillContainer.Entry().setLevel(38).setXP(43).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcID.MASTER_FARMER),
            new SkillContainer.Model(2, NpcID.MASTER_FARMER_3258),
            new SkillContainer.Model(2, NpcID.MARTIN_THE_MASTER_GARDENER))
        .setRandomCreate(new RandomItem(ItemID.POTATO_SEED, 1, 4).setWeight(17857),
            new RandomItem(ItemID.ONION_SEED, 1, 3).setWeight(13386),
            new RandomItem(ItemID.CABBAGE_SEED, 1, 3).setWeight(6993),
            new RandomItem(ItemID.TOMATO_SEED, 1, 2).setWeight(6410),
            new RandomItem(ItemID.SWEETCORN_SEED, 1, 2).setWeight(2232),
            new RandomItem(ItemID.STRAWBERRY_SEED, 1).setWeight(1212),
            new RandomItem(ItemID.WATERMELON_SEED, 1).setWeight(534),
            new RandomItem(ItemID.BARLEY_SEED, 1, 4).setWeight(5555),
            new RandomItem(ItemID.HAMMERSTONE_SEED, 1, 3).setWeight(5555),
            new RandomItem(ItemID.ASGARNIAN_SEED, 1, 2).setWeight(4184),
            new RandomItem(ItemID.JUTE_SEED, 1, 3).setWeight(4149),
            new RandomItem(ItemID.YANILLIAN_SEED, 1, 4).setWeight(2770),
            new RandomItem(ItemID.KRANDORIAN_SEED, 1).setWeight(1312),
            new RandomItem(ItemID.WILDBLOOD_SEED, 1).setWeight(704),
            new RandomItem(ItemID.MARIGOLD_SEED, 1).setWeight(4587),
            new RandomItem(ItemID.NASTURTIUM_SEED, 1).setWeight(3039),
            new RandomItem(ItemID.ROSEMARY_SEED, 1).setWeight(19),
            new RandomItem(ItemID.WOAD_SEED, 1).setWeight(1451),
            new RandomItem(ItemID.LIMPWURT_SEED, 1).setWeight(1158),
            new RandomItem(ItemID.REDBERRY_SEED, 1).setWeight(3875),
            new RandomItem(ItemID.CADAVABERRY_SEED, 1).setWeight(2717),
            new RandomItem(ItemID.DWELLBERRY_SEED, 1).setWeight(1941),
            new RandomItem(ItemID.JANGERBERRY_SEED, 1).setWeight(775),
            new RandomItem(ItemID.WHITEBERRY_SEED, 1).setWeight(281),
            new RandomItem(ItemID.POISON_IVY_SEED, 1).setWeight(106),
            new RandomItem(ItemID.GUAM_SEED, 1).setWeight(6144),
            new RandomItem(ItemID.MARRENTILL_SEED, 1).setWeight(4184),
            new RandomItem(ItemID.TARROMIN_SEED, 1).setWeight(2856),
            new RandomItem(ItemID.HARRALANDER_SEED, 1).setWeight(1940),
            new RandomItem(ItemID.RANARR_SEED, 1).setWeight(1324),
            new RandomItem(ItemID.TOADFLAX_SEED, 1).setWeight(900),
            new RandomItem(ItemID.IRIT_SEED, 1).setWeight(612),
            new RandomItem(ItemID.AVANTOE_SEED, 1).setWeight(420),
            new RandomItem(ItemID.KWUARM_SEED, 1).setWeight(284),
            new RandomItem(ItemID.SNAPDRAGON_SEED, 1).setWeight(192),
            new RandomItem(ItemID.CADANTINE_SEED, 1).setWeight(132),
            new RandomItem(ItemID.LANTADYME_SEED, 1).setWeight(92),
            new RandomItem(ItemID.DWARF_WEED_SEED, 1).setWeight(56),
            new RandomItem(ItemID.TORSTOL_SEED, 1).setWeight(36),
            new RandomItem(ItemID.MUSHROOM_SPORE, 1).setWeight(250),
            new RandomItem(ItemID.BELLADONNA_SEED, 1).setWeight(149),
            new RandomItem(ItemID.CACTUS_SEED, 1).setWeight(100))
        .setPet(257211, ItemID.ROCKY)
        .setFailedHit(new Hit(2)),
    new SkillContainer.Entry().setLevel(40).setXP(47).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcID.GUARD_21_3010), new SkillContainer.Model(2, NpcID.GUARD_21_3094),
            new SkillContainer.Model(2, NpcID.GUARD_20), new SkillContainer.Model(2, NpcID.GUARD_21_3269),
            new SkillContainer.Model(2, NpcID.GUARD_22_3270), new SkillContainer.Model(2, NpcID.GUARD_19),
            new SkillContainer.Model(2, NpcID.GUARD_22_3272), new SkillContainer.Model(2, NpcID.GUARD_22_3273),
            new SkillContainer.Model(2, NpcID.GUARD_22_3274))
        .setCreate(new RandomItem(ItemID.BLACK_DAGGER, 1))
        .setPet(200000, ItemID.ROCKY)
        .setFailedHit(new Hit(2)),
    new SkillContainer.Entry().setLevel(55).setXP(85).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcID.KNIGHT_OF_ARDOUGNE_46),
            new SkillContainer.Model(2, NpcID.KNIGHT_OF_ARDOUGNE_46_3111))
        .setCreate(new RandomItem(ItemID.MITHRIL_SCIMITAR, 1))
        .setPet(154625, ItemID.ROCKY)
        .setFailedHit(new Hit(3)),
    new SkillContainer.Entry().setLevel(70).setXP(152).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcID.PALADIN_62),
            new SkillContainer.Model(2, NpcID.PALADIN_62_3105))
        .setCreate(new RandomItem(ItemID.MITHRIL_LONGSWORD, 1))
        .setPet(127056, ItemID.ROCKY)
        .setFailedHit(new Hit(3)),
    new SkillContainer.Entry().setLevel(80).setXP(275).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcID.HERO_69))
        .setCreate(new RandomItem(ItemID.MITHRIL_FULL_HELM, 1))
        .setPet(99175, ItemID.ROCKY)
        .setFailedHit(new Hit(4)),
    new SkillContainer.Entry().setLevel(85).setXP(353).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcID.GOREU), new SkillContainer.Model(2, NpcID.YSGAWYN),
            new SkillContainer.Model(2, NpcID.ARVEL), new SkillContainer.Model(2, NpcID.MAWRTH),
            new SkillContainer.Model(2, NpcID.KELYN), new SkillContainer.Model(2, NpcID.GOREU))
        .setCreate(new RandomItem(ItemID.BLACK_KITESHIELD, 1))
        .setPet(99175, ItemID.ROCKY)
        .setFailedHit(new Hit(5)),
    new SkillContainer.Entry().setLevel(1).setXP(8).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 4874))
        .setCreate(new RandomItem(ItemID.GOLDEN_NEEDLE, 1))
        .setPet(257211, ItemID.ROCKY),
    new SkillContainer.Entry().setLevel(20).setXP(26).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 4875))
        .setCreate(new RandomItem(ItemID.GOLDEN_POT, 1))
        .setPet(225000, ItemID.ROCKY),
    new SkillContainer.Entry().setLevel(40).setXP(47).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 4876))
        .setCreate(new RandomItem(ItemID.GOLDEN_TINDERBOX, 1))
        .setPet(200000, ItemID.ROCKY),
    new SkillContainer.Entry().setLevel(60).setXP(85).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 4877))
        .setCreate(new RandomItem(ItemID.GOLDEN_CANDLE, 1))
        .setPet(154625, ItemID.ROCKY),
    new SkillContainer.Entry().setLevel(80).setXP(152).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 4878))
        .setCreate(new RandomItem(ItemID.GOLDEN_HAMMER, 1))
        .setPet(127056, ItemID.ROCKY),
    new SkillContainer.Entry().setLevel(84).setXP(100).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 26757))
        .setCreate(new RandomItem(ItemID.BLOOD_MONEY, 10, 50))
        .setRandomCreate(new RandomItem(ItemID.DRAGONSTONE, 1).setWeight(1),
            new RandomItem(ItemID.RUNE_SCIMITAR, 1).setWeight(31))
        .setTemporaryMapObject(26758, 50, 0)
        .setNpcProtector(NpcID.ROGUE_135, 2, "Someone's stealing from us, get them!")
);

skill = new SkillContainer() {
    getSkillID: function() {
        return Skills.THIEVING;
    },

    getEntries: function() {
        return ENTRIES;
    },

    getDefaultMakeAmount: function() {
        return 1;
    },

    createHook: function(player, item, npc, mapObject, entry) {
        if (player.getEquipment().wearingRogueOutfit() && Utils.randomE(10) == 0) {
            item = new Item(item.getID(), item.getAmount() + 1);
        }
        return item;
    },

    xpHook: function(player, xp, npc, mapObject, entry) {
        if (player.getEquipment().wearingRogueOutfit()) {
            xp *= 1.1;
        }
        return xp;
    },

    failedActionHook: function(player, event, npc, mapObject, entry) {
        var power = player.getSkills().getLevel(skill.getSkillID()) + 8;
        var failure = entry.getLevel() + 2;
        var chance = 0;
        if (power > failure) {
            chance = 1 - (failure + 2) / ((power + 1) * 2.0);
        } else {
            chance = power / ((failure + 1) * 2.0);
        }
        if (player.inArdougne() && player.hasItem(ItemID.ARDOUGNE_CLOAK_2) || player.hasItem(ItemID.ARDOUGNE_CLOAK_3)
                || player.hasItem(ItemID.ARDOUGNE_CLOAK_4) || player.hasItem(ItemID.ARDOUGNE_MAX_CAPE)) {
            chance = Math.min(Utils.addDoubles(chance, 0.1), 1.0);
        }
        if (player.getEquipment().wearingRogueOutfit()) {
            chance = Math.min(Utils.addDoubles(chance, 0.1), 1.0);
        }
        if (player.getEquipment().wearingAccomplishmentCape(skill.getSkillID())) {
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
        if (npc != null && Utils.randomI(100) < Math.max(0.01, 1 - chance) * 100) {
            npc.setForceMessage("What do you think you're doing?");
            npc.setAnimation(npc.getDef().getAttackAnimation());
            npc.setFaceTile(player);
            player.setAnimation(player.getCombat().getBlockAnimation());
            player.setGraphic(80, 100);
            player.getGameEncoder().sendMessage("You've been stunned!");
            player.setLock(8);
            return true;
        }
        return false;
    },

    actionSuccessHook: function(player, event, npc, mapObject, entry) {
        if (npc != null) {
            player.getGameEncoder().sendMessage("You pick the " + npc.getName() + "'s pocket.");
        } else if (mapObject != null) {
            player.getGameEncoder().sendMessage("You steal from the " + mapObject.getName() + ".");
            skill.setTemporaryMapObject(player, mapObject, entry);
        }
    },

    deathReasonHook: function(player, event, npc, mapObject, entry) {
        if (npc != null) {
            return "pickpocketing a " + npc.getName();
        }
        return "thieving";
    }
}
