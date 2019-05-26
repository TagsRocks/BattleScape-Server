var ENTRIES = Utils.toList(
    new SkillContainer.Entry().setLevel(1).setXP(8).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcId.MAN_2_3078), new SkillContainer.Model(2, NpcId.MAN_2_3079),
            new SkillContainer.Model(2, NpcId.MAN_2_3080), new SkillContainer.Model(2, NpcId.MAN_2_3081),
            new SkillContainer.Model(2, NpcId.MAN_2_3082), new SkillContainer.Model(2, NpcId.WOMAN_2_3083),
            new SkillContainer.Model(2, NpcId.WOMAN_2_3084), new SkillContainer.Model(2, NpcId.WOMAN_2_3085),
            new SkillContainer.Model(2, NpcId.MAN_2_3264), new SkillContainer.Model(2, NpcId.MAN_2_3265),
            new SkillContainer.Model(2, NpcId.MAN_2_3266), new SkillContainer.Model(2, NpcId.WOMAN_2_3267),
            new SkillContainer.Model(2, NpcId.WOMAN_2_3268))
        .setCreate(new RandomItem(ItemId.BRONZE_SCIMITAR, 1))
        .setPet(257211, ItemId.ROCKY)
        .setFailedHit(new Hit(1)),
    new SkillContainer.Entry().setLevel(25).setXP(26).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcId.WARRIOR_WOMAN_24),
            new SkillContainer.Model(2, NpcId.AL_KHARID_WARRIOR_9))
        .setCreate(new RandomItem(ItemId.IRON_SCIMITAR, 1))
        .setPet(225000, ItemId.ROCKY)
        .setFailedHit(new Hit(2)),
    new SkillContainer.Entry().setLevel(38).setXP(43).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcId.MASTER_FARMER),
            new SkillContainer.Model(2, NpcId.MASTER_FARMER_3258),
            new SkillContainer.Model(2, NpcId.MARTIN_THE_MASTER_GARDENER))
        .setRandomCreate(new RandomItem(ItemId.POTATO_SEED, 1, 4).setWeight(17857),
            new RandomItem(ItemId.ONION_SEED, 1, 3).setWeight(13386),
            new RandomItem(ItemId.CABBAGE_SEED, 1, 3).setWeight(6993),
            new RandomItem(ItemId.TOMATO_SEED, 1, 2).setWeight(6410),
            new RandomItem(ItemId.SWEETCORN_SEED, 1, 2).setWeight(2232),
            new RandomItem(ItemId.STRAWBERRY_SEED, 1).setWeight(1212),
            new RandomItem(ItemId.WATERMELON_SEED, 1).setWeight(534),
            new RandomItem(ItemId.BARLEY_SEED, 1, 4).setWeight(5555),
            new RandomItem(ItemId.HAMMERSTONE_SEED, 1, 3).setWeight(5555),
            new RandomItem(ItemId.ASGARNIAN_SEED, 1, 2).setWeight(4184),
            new RandomItem(ItemId.JUTE_SEED, 1, 3).setWeight(4149),
            new RandomItem(ItemId.YANILLIAN_SEED, 1, 4).setWeight(2770),
            new RandomItem(ItemId.KRANDORIAN_SEED, 1).setWeight(1312),
            new RandomItem(ItemId.WILDBLOOD_SEED, 1).setWeight(704),
            new RandomItem(ItemId.MARIGOLD_SEED, 1).setWeight(4587),
            new RandomItem(ItemId.NASTURTIUM_SEED, 1).setWeight(3039),
            new RandomItem(ItemId.ROSEMARY_SEED, 1).setWeight(19),
            new RandomItem(ItemId.WOAD_SEED, 1).setWeight(1451),
            new RandomItem(ItemId.LIMPWURT_SEED, 1).setWeight(1158),
            new RandomItem(ItemId.REDBERRY_SEED, 1).setWeight(3875),
            new RandomItem(ItemId.CADAVABERRY_SEED, 1).setWeight(2717),
            new RandomItem(ItemId.DWELLBERRY_SEED, 1).setWeight(1941),
            new RandomItem(ItemId.JANGERBERRY_SEED, 1).setWeight(775),
            new RandomItem(ItemId.WHITEBERRY_SEED, 1).setWeight(281),
            new RandomItem(ItemId.POISON_IVY_SEED, 1).setWeight(106),
            new RandomItem(ItemId.GUAM_SEED, 1).setWeight(6144),
            new RandomItem(ItemId.MARRENTILL_SEED, 1).setWeight(4184),
            new RandomItem(ItemId.TARROMIN_SEED, 1).setWeight(2856),
            new RandomItem(ItemId.HARRALANDER_SEED, 1).setWeight(1940),
            new RandomItem(ItemId.RANARR_SEED, 1).setWeight(1324),
            new RandomItem(ItemId.TOADFLAX_SEED, 1).setWeight(900),
            new RandomItem(ItemId.IRIT_SEED, 1).setWeight(612),
            new RandomItem(ItemId.AVANTOE_SEED, 1).setWeight(420),
            new RandomItem(ItemId.KWUARM_SEED, 1).setWeight(284),
            new RandomItem(ItemId.SNAPDRAGON_SEED, 1).setWeight(192),
            new RandomItem(ItemId.CADANTINE_SEED, 1).setWeight(132),
            new RandomItem(ItemId.LANTADYME_SEED, 1).setWeight(92),
            new RandomItem(ItemId.DWARF_WEED_SEED, 1).setWeight(56),
            new RandomItem(ItemId.TORSTOL_SEED, 1).setWeight(36),
            new RandomItem(ItemId.MUSHROOM_SPORE, 1).setWeight(250),
            new RandomItem(ItemId.BELLADONNA_SEED, 1).setWeight(149),
            new RandomItem(ItemId.CACTUS_SEED, 1).setWeight(100))
        .setPet(257211, ItemId.ROCKY)
        .setFailedHit(new Hit(2)),
    new SkillContainer.Entry().setLevel(40).setXP(47).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcId.GUARD_21_3010), new SkillContainer.Model(2, NpcId.GUARD_21_3094),
            new SkillContainer.Model(2, NpcId.GUARD_20), new SkillContainer.Model(2, NpcId.GUARD_21_3269),
            new SkillContainer.Model(2, NpcId.GUARD_22_3270), new SkillContainer.Model(2, NpcId.GUARD_19),
            new SkillContainer.Model(2, NpcId.GUARD_22_3272), new SkillContainer.Model(2, NpcId.GUARD_22_3273),
            new SkillContainer.Model(2, NpcId.GUARD_22_3274))
        .setCreate(new RandomItem(ItemId.BLACK_DAGGER, 1))
        .setPet(200000, ItemId.ROCKY)
        .setFailedHit(new Hit(2)),
    new SkillContainer.Entry().setLevel(55).setXP(85).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcId.KNIGHT_OF_ARDOUGNE_46),
            new SkillContainer.Model(2, NpcId.KNIGHT_OF_ARDOUGNE_46_3111))
        .setCreate(new RandomItem(ItemId.MITHRIL_SCIMITAR, 1))
        .setPet(154625, ItemId.ROCKY)
        .setFailedHit(new Hit(3)),
    new SkillContainer.Entry().setLevel(70).setXP(152).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcId.PALADIN_62),
            new SkillContainer.Model(2, NpcId.PALADIN_62_3105))
        .setCreate(new RandomItem(ItemId.MITHRIL_LONGSWORD, 1))
        .setPet(127056, ItemId.ROCKY)
        .setFailedHit(new Hit(3)),
    new SkillContainer.Entry().setLevel(80).setXP(275).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcId.HERO_69))
        .setCreate(new RandomItem(ItemId.MITHRIL_FULL_HELM, 1))
        .setPet(99175, ItemId.ROCKY)
        .setFailedHit(new Hit(4)),
    new SkillContainer.Entry().setLevel(85).setXP(353).setAnimation(881).setDelay(2)
        .setNpc(new SkillContainer.Model(2, NpcId.GOREU), new SkillContainer.Model(2, NpcId.YSGAWYN),
            new SkillContainer.Model(2, NpcId.ARVEL), new SkillContainer.Model(2, NpcId.MAWRTH),
            new SkillContainer.Model(2, NpcId.KELYN), new SkillContainer.Model(2, NpcId.GOREU))
        .setCreate(new RandomItem(ItemId.BLACK_KITESHIELD, 1))
        .setPet(99175, ItemId.ROCKY)
        .setFailedHit(new Hit(5)),
    new SkillContainer.Entry().setLevel(1).setXP(8).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 4874))
        .setCreate(new RandomItem(ItemId.GOLDEN_NEEDLE, 1))
        .setPet(257211, ItemId.ROCKY),
    new SkillContainer.Entry().setLevel(20).setXP(26).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 4875))
        .setCreate(new RandomItem(ItemId.GOLDEN_POT, 1))
        .setPet(225000, ItemId.ROCKY),
    new SkillContainer.Entry().setLevel(40).setXP(47).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 4876))
        .setCreate(new RandomItem(ItemId.GOLDEN_TINDERBOX, 1))
        .setPet(200000, ItemId.ROCKY),
    new SkillContainer.Entry().setLevel(60).setXP(85).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 4877))
        .setCreate(new RandomItem(ItemId.GOLDEN_CANDLE, 1))
        .setPet(154625, ItemId.ROCKY),
    new SkillContainer.Entry().setLevel(80).setXP(152).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 4878))
        .setCreate(new RandomItem(ItemId.GOLDEN_HAMMER, 1))
        .setPet(127056, ItemId.ROCKY),
    new SkillContainer.Entry().setLevel(84).setXP(100).setAnimation(881).setDelay(6)
        .setMapObject(new SkillContainer.Model(1, 26757))
        .setCreate(new RandomItem(Main.isSpawn() ? ItemId.COINS : ItemId.BLOOD_MONEY, 10, 50))
        .setRandomCreate(new RandomItem(ItemId.DRAGONSTONE, 1).setWeight(1),
            new RandomItem(ItemId.RUNE_SCIMITAR, 1).setWeight(31))
        .setTemporaryMapObject(26758, 50, 0)
        .setNpcProtector(NpcId.ROGUE_135, 2, "Someone's stealing from us, get them!")
);

skill = new SkillContainer() {
    getSkillId: function() {
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
            item = new Item(item.getId(), item.getAmount() + 1);
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
        var power = player.getSkills().getLevel(skill.getSkillId()) + 8;
        var failure = entry.getLevel() + 2;
        var chance = 0;
        if (power > failure) {
            chance = 1 - (failure + 2) / ((power + 1) * 2.0);
        } else {
            chance = power / ((failure + 1) * 2.0);
        }
        if (player.inArdougne() && player.hasItem(ItemId.ARDOUGNE_CLOAK_2) || player.hasItem(ItemId.ARDOUGNE_CLOAK_3)
                || player.hasItem(ItemId.ARDOUGNE_CLOAK_4) || player.hasItem(ItemId.ARDOUGNE_MAX_CAPE)) {
            chance = Math.min(Utils.addDoubles(chance, 0.1), 1.0);
        }
        if (player.getEquipment().wearingRogueOutfit()) {
            chance = Math.min(Utils.addDoubles(chance, 0.1), 1.0);
        }
        if (player.getEquipment().wearingAccomplishmentCape(skill.getSkillId())) {
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
