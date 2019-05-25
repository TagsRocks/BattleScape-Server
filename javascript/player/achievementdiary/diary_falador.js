var EASY = AchievementDiaryTask.Difficulty.EASY;
var MEDIUM = AchievementDiaryTask.Difficulty.MEDIUM;
var HARD = AchievementDiaryTask.Difficulty.HARD;
var ELITE = AchievementDiaryTask.Difficulty.ELITE;

var Task = {
    CLIMB_WALL: new AchievementDiaryTask("Climb over the western Falador wall.", EASY),
    SARAHS_SHOP: new AchievementDiaryTask("Browse Sarah's farm shop.", EASY),
    FILL_BUCKET: new AchievementDiaryTask("Fill a bucket from the pump north of Falador west bank.", EASY),
    KILL_DUCK: new AchievementDiaryTask("Kill a duck in Falador park.", EASY),
    MIND_TIARA: new AchievementDiaryTask("Make a mind tiara.", EASY),
    ENTRANA: new AchievementDiaryTask("Take the boat to Entrana.", EASY),
    SECURITY_BOOK:
        new AchievementDiaryTask("Claim a security book from the Security guard upstairs at Port Sarim jail.", EASY),
    BLURITE_LIMBS: new AchievementDiaryTask("Smith some Blurite Limbs on Doric's Anvil.", EASY),
    BULLSEYE_LANTERN: new AchievementDiaryTask("Light a Bullseye lantern at the Chemist's in Rimmington.", MEDIUM),
    CRYSTAL_CHEST: new AchievementDiaryTask("Unlock the Crystal chest in Taverley.", MEDIUM),
    KILL_MOGRE: new AchievementDiaryTask("Kill a Mogre at Mudskipper Point.", MEDIUM),
    PICKPOCKET_GUARD: new AchievementDiaryTask("Pickpocket a Falador guard.", MEDIUM),
    GUTHIX_ALTAR:
        new AchievementDiaryTask("Pray at the Altar of Guthix in Taverley whilst wearing full Initiate.",
        MEDIUM),
    MINE_GOLD: new AchievementDiaryTask("Mine some Gold ore at the Crafting Guild.", MEDIUM),
    DWARVERN_CREVICE: new AchievementDiaryTask("Squeeze through the crevice in the Dwarven mines.", MEDIUM),
    BURN_WILLOW: new AchievementDiaryTask("Chop and burn some Willow logs in Taverley.", MEDIUM),
    FALADOR_TELEPORT: new AchievementDiaryTask("Teleport to Falador.", MEDIUM),
    CRAFT_MINDS: new AchievementDiaryTask("Craft 140 Mind runes simultaneously.", HARD),
    KILL_GIANT_MOLE: new AchievementDiaryTask("Kill the Giant Mole beneath Falador park.", HARD),
    KILL_SKELETAL_WYVERN: new AchievementDiaryTask("Kill a Skeletal Wyvern in the Asgarnia Ice Dungeon.", HARD),
    KILL_BLUE_DRAGON: new AchievementDiaryTask("Kill the Blue Dragon under the Heroes' Guild.", HARD),
    SARIM_ALTAR:
        new AchievementDiaryTask("Recharge your prayer in Port Sarim church while wearing full Proselyte.", HARD),
    WARRIORS_GUILD: new AchievementDiaryTask("Enter the Warriors' Guild.", HARD),
    DWARVEN_HELMET: new AchievementDiaryTask("Equip a dwarven helmet within the dwarven mines.", HARD),
    CRAFT_AIRS: new AchievementDiaryTask("Craft 252 Air Runes simultaneously.", ELITE),
    WHITE_2H: new AchievementDiaryTask("Purchase a White 2h Sword from Sir Vyvin.", ELITE),
    MAGIC_ROOTS:
        new AchievementDiaryTask("Find at least 3 magic roots at once when digging up your magic tree in Falador.",
        ELITE),
    CAPE_EMOTE:
        new AchievementDiaryTask("Perform a skillcape or quest cape emote at the top of Falador Castle.",
        ELITE),
    TAVERLEY_FLOOR: new AchievementDiaryTask("Jump over the strange floor in Taverley dungeon.", ELITE),
    SARADOMIN_BREW: new AchievementDiaryTask("Mix a Saradomin brew in Falador east bank.", ELITE)
};

diary = new AchievementDiary(AchievementDiary.Name.FALADOR) {
    getTasks: function() {
        return Object.keys(Task).map(function(e) {
            return Task[e];
        });
    },

    animationHook: function(player, id, delay) {
        if (id == 4959 || id == 4961 || id == 4981 || id == 4971 || id == 4973 || id == 4979 || id == 4939
                || id == 4955 || id == 4957 || id == 4937 || id == 4951 || id == 4975 || id == 4949 || id == 4943
                || id == 4941 || id == 4969 || id == 4977 || id == 4965 || id == 4967 || id == 4963 || id == 4947
                || id == 5158 || id == 4953 || id == 7121) {
            if (player.getHeight() == 3 && player.within(2954, 3328, 2998, 3353)) {
                diary.addCompletedTask(player, Task.CAPE_EMOTE);
            }
        }
    },

    teleportedHook: function(player, fromTile) {
        if (player.getRegionId() == 11316 && fromTile.getRegionId() == 12082) {
            diary.addCompletedTask(player, Task.ENTRANA);
        }
    },

    equipItemHook: function(player, item, slot) {
        if (item.getId() == ItemId.DWARVEN_HELMET && player.within(2962, 9699, 3061, 9852)) {
            diary.addCompletedTask(player, Task.DWARVEN_HELMET);
        }
    },

    buyShopItemHook: function(player, shopItem, item, price) {
        if (item.getId() == ItemId.WHITE_2H_SWORD && item.getAmount() > 0 && shopItem.getMonsterKillCount() > 0) {
            diary.addCompletedTask(player, Task.WHITE_2H);
        }
    },

    makeItemHook: function(player, skillId, item, npc, mapObject) {
        if (item.getId() == ItemId.BUCKET_OF_WATER && player.getRegionId() == 11828) {
            diary.addCompletedTask(player, Task.FILL_BUCKET);
        } else if (item.getId() == ItemId.MIND_TIARA) {
            diary.addCompletedTask(player, Task.MIND_TIARA);
        } else if (item.getId() == ItemId.BLURITE_LIMBS) {
            diary.addCompletedTask(player, Task.BLURITE_LIMBS);
        } else if (item.getId() == ItemId.BULLSEYE_LANTERN_4550 && player.within(2925, 3205, 2941, 3215)) {
            diary.addCompletedTask(player, Task.BULLSEYE_LANTERN);
        } else if (npc != null && (npc.getId() == NpcId.GUARD_21_3269 || npc.getId() == NpcId.GUARD_22_3270
                || npc.getId() == NpcId.GUARD_19 || npc.getId() == NpcId.GUARD_22_3272)
                && (player.getRegionId() == 11828 || player.getRegionId() == 12084)) {
            diary.addCompletedTask(player, Task.PICKPOCKET_GUARD);
        } else if (item.getId() == ItemId.GOLD_ORE && player.getRegionId() == 11571) {
            diary.addCompletedTask(player, Task.MINE_GOLD);
        } else if (item.getId() == ItemId.MIND_RUNE && item.getAmount() >= 140) {
            diary.addCompletedTask(player, Task.CRAFT_MINDS);
        } else if (item.getId() == ItemId.AIR_RUNE && item.getAmount() >= 252) {
            diary.addCompletedTask(player, Task.CRAFT_AIRS);
        } else if (item.getId() == ItemId.MAGIC_ROOTS && item.getAmount() >= 3) {
            diary.addCompletedTask(player, Task.MAGIC_ROOTS);
        } else if (item.getId() == ItemId.SARADOMIN_BREW_3 && player.within(3009, 3355, 3019, 3358)) {
            diary.addCompletedTask(player, Task.SARADOMIN_BREW);
        }
    },

    makeFireHook: function(player, item) {
        if (item.getId() == ItemId.WILLOW_LOGS && player.getRegionId() == 11573) {
            diary.addCompletedTask(player, Task.BURN_WILLOW);
        }
    },

    castSpellHook: function(player, spellBookChild, item, entity, mapObject) {
        if (spellBookChild == WidgetChild.SpellBook.FALADOR_TELEPORT) {
            diary.addCompletedTask(player, Task.FALADOR_TELEPORT);
        }
    },

    agilityObstacleHook: function(player, mapObject) {
        if (mapObject.getId() == 24222 && player.getRegionId() == 11572) {
            diary.addCompletedTask(player, Task.CLIMB_WALL);
        } else if (mapObject.getId() == 16543 && player.getRegionId() == 12185) {
            diary.addCompletedTask(player, Task.DWARVERN_CREVICE);
        } else if (mapObject.getId() == 16510 && (player.getRegionId() == 11673 || player.getRegionId() == 11417)) {
            diary.addCompletedTask(player, Task.TAVERLEY_FLOOR);
        }
    },

    npcKilledHook: function(player, npc) {
        if ((npc.getId() == NpcId.DUCK_1 || npc.getId() == NpcId.DUCK_1_1839) && player.getRegionId() == 12084) {
            diary.addCompletedTask(player, Task.KILL_DUCK);
        } else if (npc.getId() == NpcId.MOGRE_60) {
            diary.addCompletedTask(player, Task.KILL_MOGRE);
        } else if (npc.getId() == NpcId.GIANT_MOLE_230 && (player.getRegionId() == 6992
                || player.getRegionId() == 6993)) {
            diary.addCompletedTask(player, Task.KILL_GIANT_MOLE);
        } else if ((npc.getId() == NpcId.SKELETAL_WYVERN_140 || npc.getId() == NpcId.SKELETAL_WYVERN_140_466
                || npc.getId() == NpcId.SKELETAL_WYVERN_140_467 || npc.getId() == NpcId.SKELETAL_WYVERN_140_468)
                && (player.getRegionId() == 12181 || player.getRegionId() == 12437)) {
            diary.addCompletedTask(player, Task.KILL_SKELETAL_WYVERN);
        } else if (npc.getId() == NpcId.BLUE_DRAGON_111 && player.getRegionId() == 11674) {
            diary.addCompletedTask(player, Task.KILL_BLUE_DRAGON);
        }
    },

    openShopHook: function(player, referenceName) {
        if (referenceName != null && referenceName.equals("skilling") && player.getRegionId() == 12083) {
            diary.addCompletedTask(player, Task.SARAHS_SHOP);
        }
    },

    mapObjectOptionHook: function(player, index, mapObject) {
        if (mapObject.getId() == 172 && mapObject.getX() == 2914 && mapObject.getY() == 3452
                && player.getInventory().hasItem(ItemId.CRYSTAL_KEY)) {
            diary.addCompletedTask(player, Task.CRYSTAL_CHEST);
        } else if (mapObject.getId() == 410 && player.getEquipment().getHeadId() == ItemId.INITIATE_SALLET
                && player.getEquipment().getChestId() == ItemId.INITIATE_HAUBERK
                && player.getEquipment().getLegId() == ItemId.INITIATE_CUISSE) {
            diary.addCompletedTask(player, Task.GUTHIX_ALTAR);
        } else if (mapObject.getId() == 409 && player.getEquipment().getHeadId() == ItemId.PROSELYTE_SALLET
                && player.getEquipment().getChestId() == ItemId.PROSELYTE_HAUBERK
                && player.getEquipment().getLegId() == ItemId.PROSELYTE_CUISSE) {
            diary.addCompletedTask(player, Task.SARIM_ALTAR);
        } else if (mapObject.getId() == 24318) {
            if (player.getController().getLevelForXP(Skills.ATTACK) == 99
                    || player.getController().getLevelForXP(Skills.STRENGTH) == 99
                    || player.getController().getLevelForXP(Skills.ATTACK)
                    + player.getController().getLevelForXP(Skills.STRENGTH) >= 130) {
                diary.addCompletedTask(player, Task.WARRIORS_GUILD);
            }
        }
    },

    npcOptionHook: function(player, index, npc) {
        if (npc.getId() == NpcId.SECURITY_GUARD) {
            diary.addCompletedTask(player, Task.SECURITY_BOOK);
        }
    },
};
