DecodedPacketWidget.prototype.widget_218 = function(player, index, childID, slot, itemID) {
    // Tab
    var height = 0;
    var spellBookChild = WidgetChild.SpellBook.get(childID);
    if (spellBookChild == null) {
        return;
    }
    switch (spellBookChild) {
    case WidgetChild.SpellBook.SPELL_FILTERS:
        if (slot == 0) {
            player.getMagic().setShowCombatSpells(!player.getMagic().getShowCombatSpells());
        } else if (slot == 1) {
            player.getMagic().setShowTeleportSpells(!player.getMagic().getShowTeleportSpells());
        } else if (slot == 2) {
            player.getMagic().setShowUtilitySpells(!player.getMagic().getShowUtilitySpells());
        } else if (slot == 3) {
            player.getMagic().setShowLackLevelSpells(!player.getMagic().getShowLackLevelSpells());
        } else if (slot == 4) {
            player.getMagic().setShowLackRunesSpells(!player.getMagic().getShowLackRunesSpells());
        }
        break;
    case WidgetChild.SpellBook.TELEPORT_TO_BOUNTY_TARGET:
        if (player.isLocked()) {
            break;
        }
        if (index == 0) {
            player.getBountyHunter().selectTeleportToTarget();
        } else if (index == 9) {
            player.getBountyHunter().setTeleportWarning(!player.getBountyHunter().getTeleportWarning());
            player.getGameEncoder().sendMessage("Teleport warning: " + player.getBountyHunter().getTeleportWarning());
        }
        break;
    case WidgetChild.SpellBook.LUMBRIDGE_HOME_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (player.getCombatDelay() != 0) {
            player.getGameEncoder().sendMessage("You can't use this while in combat.");
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        }
        player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.VARROCK_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 25) {
            player.getGameEncoder().sendMessage("You need a Magic level of 25 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.FIRE_RUNE, 1)
                || !player.getMagic().hasRunes(ItemID.AIR_RUNE, 3)
                || !player.getMagic().hasRunes(ItemID.LAW_RUNE, 1)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.FIRE_RUNE, 1);
        player.getMagic().deleteRunes(ItemID.AIR_RUNE, 3);
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 1);
        player.getSkills().addXP(Skills.MAGIC, 35);
        player.getMovement().animatedTeleport(new Tile(3212, 3428),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.LUMBRIDGE_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 31) {
            player.getGameEncoder().sendMessage("You need a Magic level of 31 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.EARTH_RUNE, 1)
                || !player.getMagic().hasRunes(ItemID.AIR_RUNE, 3)
                || !player.getMagic().hasRunes(ItemID.LAW_RUNE, 1)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.EARTH_RUNE, 1);
        player.getMagic().deleteRunes(ItemID.AIR_RUNE, 3);
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 1);
        player.getSkills().addXP(Skills.MAGIC, 41);
        player.getMovement().animatedTeleport(new Tile(3221, 3218),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.FALADOR_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 37) {
            player.getGameEncoder().sendMessage("You need a Magic level of 37 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.WATER_RUNE, 1)
                || !player.getMagic().hasRunes(ItemID.AIR_RUNE, 3)
                || !player.getMagic().hasRunes(ItemID.LAW_RUNE, 1)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.WATER_RUNE, 1);
        player.getMagic().deleteRunes(ItemID.AIR_RUNE, 3);
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 1);
        player.getSkills().addXP(Skills.MAGIC, 48);
        player.getMovement().animatedTeleport(new Tile(2965, 3379),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.TELEPORT_TO_HOUSE:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 40) {
            player.getGameEncoder().sendMessage("You need a Magic level of 40 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.LAW_RUNE, 1)
                || !player.getMagic().hasRunes(ItemID.AIR_RUNE, 1)
                || !player.getMagic().hasRunes(ItemID.EARTH_RUNE, 1)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 1);
        player.getMagic().deleteRunes(ItemID.AIR_RUNE, 1);
        player.getMagic().deleteRunes(ItemID.EARTH_RUNE, 1);
        player.getSkills().addXP(Skills.MAGIC, 30);
        player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.CAMELOT_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 45) {
            player.getGameEncoder().sendMessage("You need a Magic level of 45 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.AIR_RUNE, 5)
                || !player.getMagic().hasRunes(ItemID.LAW_RUNE, 1)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.AIR_RUNE, 5);
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 1);
        player.getSkills().addXP(Skills.MAGIC, 56);
        player.getMovement().animatedTeleport(new Tile(2757, 3478),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.ARDOUGNE_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 51) {
            player.getGameEncoder().sendMessage("You need a Magic level of 51 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.WATER_RUNE, 2)
                || !player.getMagic().hasRunes(ItemID.LAW_RUNE, 2)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.WATER_RUNE, 2);
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 2);
        player.getSkills().addXP(Skills.MAGIC, 61);
        player.getMovement().animatedTeleport(new Tile(2661, 3305),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.CHARGE:
        if (player.isLocked()) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 80) {
            player.getGameEncoder().sendMessage("Your Magic level is not high enough for this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.FIRE_RUNE, 3)
                || !player.getMagic().hasRunes(ItemID.BLOOD_RUNE, 3)
                || !player.getMagic().hasRunes(ItemID.AIR_RUNE, 3)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        } else if (player.getMagic().getChargeDelay() > 500) {
            player.getGameEncoder().sendMessage("You can't recast that yet, your current Charge is too strong.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.FIRE_RUNE, 3);
        player.getMagic().deleteRunes(ItemID.BLOOD_RUNE, 3);
        player.getMagic().deleteRunes(ItemID.AIR_RUNE, 3);
        player.setAnimation(811);
        player.setGraphic(308, 124, 45);
        player.getMagic().setChargeDelay(600);
        player.getGameEncoder().sendMessage("<col=ef1020>You feel charged with magic power.</col>");
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.PADDEWWA_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 54) {
            player.getGameEncoder().sendMessage("You need a Magic level of 54 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.LAW_RUNE, 2)
                || !player.getMagic().hasRunes(ItemID.FIRE_RUNE, 1)
                || !player.getMagic().hasRunes(ItemID.AIR_RUNE, 1)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 2);
        player.getMagic().deleteRunes(ItemID.FIRE_RUNE, 1);
        player.getMagic().deleteRunes(ItemID.AIR_RUNE, 1);
        player.getSkills().addXP(Skills.MAGIC, 64);
        player.getMovement().animatedTeleport(new Tile(3094, 3470),
                Magic.ANCIENT_MAGIC_ANIMATION, Magic.ANCIENT_MAGIC_GRAPHIC, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.KHARYLL_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 66) {
            player.getGameEncoder().sendMessage("You need a Magic level of 66 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.LAW_RUNE, 2)
                || !player.getMagic().hasRunes(ItemID.BLOOD_RUNE, 1)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 2);
        player.getMagic().deleteRunes(ItemID.BLOOD_RUNE, 1);
        player.getSkills().addXP(Skills.MAGIC, 76);
        player.getMovement().animatedTeleport(new Tile(3499, 3485),
                Magic.ANCIENT_MAGIC_ANIMATION, Magic.ANCIENT_MAGIC_GRAPHIC, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.DAREEYAK_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 78) {
            player.getGameEncoder().sendMessage("You need a Magic level of 78 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.LAW_RUNE, 2)
                || !player.getMagic().hasRunes(ItemID.FIRE_RUNE, 3)
                || !player.getMagic().hasRunes(ItemID.AIR_RUNE, 2)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 2);
        player.getMagic().deleteRunes(ItemID.FIRE_RUNE, 3);
        player.getMagic().deleteRunes(ItemID.AIR_RUNE, 2);
        player.getSkills().addXP(Skills.MAGIC, 88);
        if ((player.inEdgeville() || player.getController().inWilderness()) && player.getClientHeight() == 0) {
            height = player.getHeight();
        }
        player.getMovement().animatedTeleport(new Tile(2968, 3695, height),
                Magic.ANCIENT_MAGIC_ANIMATION, Magic.ANCIENT_MAGIC_GRAPHIC, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.CARRALLANGER_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 84) {
            player.getGameEncoder().sendMessage("You need a Magic level of 84 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.LAW_RUNE, 2)
                || !player.getMagic().hasRunes(ItemID.SOUL_RUNE, 2)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 2);
        player.getMagic().deleteRunes(ItemID.SOUL_RUNE, 2);
        player.getSkills().addXP(Skills.MAGIC, 94);
        if ((player.inEdgeville() || player.getController().inWilderness()) && player.getClientHeight() == 0) {
            height = player.getHeight();
        }
        player.getMovement().animatedTeleport(new Tile(3175, 3669, height),
                Magic.ANCIENT_MAGIC_ANIMATION, Magic.ANCIENT_MAGIC_GRAPHIC, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.ANNAKARL_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 90) {
            player.getGameEncoder().sendMessage("You need a Magic level of 90 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.LAW_RUNE, 2)
                || !player.getMagic().hasRunes(ItemID.BLOOD_RUNE, 2)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 2);
        player.getMagic().deleteRunes(ItemID.BLOOD_RUNE, 2);
        player.getSkills().addXP(Skills.MAGIC, 100);
        if ((player.inEdgeville() || player.getController().inWilderness()) && player.getClientHeight() == 0) {
            height = player.getHeight();
        }
        player.getMovement().animatedTeleport(new Tile(3290, 3886, height),
                Magic.ANCIENT_MAGIC_ANIMATION, Magic.ANCIENT_MAGIC_GRAPHIC, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.GHORROCK_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 96) {
            player.getGameEncoder().sendMessage("You need a Magic level of 96 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.LAW_RUNE, 2)
                || !player.getMagic().hasRunes(ItemID.WATER_RUNE, 8)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 2);
        player.getMagic().deleteRunes(ItemID.WATER_RUNE, 8);
        player.getSkills().addXP(Skills.MAGIC, 106);
        if ((player.inEdgeville() || player.getController().inWilderness()) && player.getClientHeight() == 0) {
            height = player.getHeight();
        }
        player.getMovement().animatedTeleport(new Tile(2974, 3873, height),
                Magic.ANCIENT_MAGIC_ANIMATION, Magic.ANCIENT_MAGIC_GRAPHIC, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.EDGEVILLE_HOME_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (player.getCombatDelay() != 0) {
            player.getGameEncoder().sendMessage("You can't use this while in combat.");
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        }
        player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                Magic.ANCIENT_MAGIC_ANIMATION, Magic.ANCIENT_MAGIC_GRAPHIC, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.LUNAR_HOME_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (player.getCombatDelay() != 0) {
            player.getGameEncoder().sendMessage("You can't use this while in combat.");
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        }
        player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.MAGIC_IMBUE:
        if (player.isLocked()) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 82) {
            player.getGameEncoder().sendMessage("You need a Magic level of 82 to cast Magic Imbue.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.FIRE_RUNE, 7)
                || !player.getMagic().hasRunes(ItemID.WATER_RUNE, 7)
                || !player.getMagic().hasRunes(ItemID.ASTRAL_RUNE, 2)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast Magic Imbue.");
            break;
        } else if (player.getMagic().getMagicImbueTime() > 0) {
            player.getGameEncoder().sendMessage("You can cast Magic Imbue in "
                + Time.tickToSec(player.getMagic().getMagicImbueTime()) + " seconds.");
            break;
        }
        player.getGameEncoder().sendMessage("You are charged to combine runes!");
        player.getMagic().deleteRunes(ItemID.FIRE_RUNE, 7);
        player.getMagic().deleteRunes(ItemID.WATER_RUNE, 7);
        player.getMagic().deleteRunes(ItemID.ASTRAL_RUNE, 2);
        player.getSkills().addXP(Skills.MAGIC, 86);
        player.getMagic().setMagicImbueTime(20);
        player.setGraphic(141, 100);
        player.setAnimation(722);
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.VENGEANCE:
        if (player.isLocked()) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 94
                || player.getController().getLevelForXP(Skills.DEFENCE) < 40) {
            player.getGameEncoder().sendMessage("You need a Magic level of 94 and Defence level of 40 to cast Vengeance.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.EARTH_RUNE, 10)
                || !player.getMagic().hasRunes(ItemID.DEATH_RUNE, 2)
                || !player.getMagic().hasRunes(ItemID.ASTRAL_RUNE, 4)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast Vengeance.");
            break;
        } else if (player.getMagic().getVengeanceDelay() > 0) {
            player.getGameEncoder().sendMessage("You can cast Vengeance in "
                    + Time.tickToSec(player.getMagic().getVengeanceDelay()) + " seconds.");
            break;
        } else if (player.getMagic().getVengeanceCast()) {
            player.getGameEncoder().sendMessage("You already have Vengeance cast.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.EARTH_RUNE, 10);
        player.getMagic().deleteRunes(ItemID.DEATH_RUNE, 2);
        player.getMagic().deleteRunes(ItemID.ASTRAL_RUNE, 4);
        player.getSkills().addXP(Skills.MAGIC, 112);
        player.getMagic().setVengeanceCast(true);
        player.getMagic().setVengeanceDelay(Magic.VENGEANCE_DELAY);
        player.setGraphic(726, 100);
        player.setAnimation(4410);
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.GEOMANCY:
        if (player.isLocked()) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 65) {
            player.getGameEncoder().sendMessage("You need a Magic level of 65 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.ASTRAL_RUNE, 3)
                || !player.getMagic().hasRunes(ItemID.NATURE_RUNE, 3)
                || !player.getMagic().hasRunes(ItemID.EARTH_RUNE, 8)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.ASTRAL_RUNE, 3);
        player.getMagic().deleteRunes(ItemID.NATURE_RUNE, 3);
        player.getMagic().deleteRunes(ItemID.EARTH_RUNE, 8);
        player.getSkills().addXP(Skills.MAGIC, 60);
        player.getFarming().openGeomancy();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    case WidgetChild.SpellBook.OURANIA_TELEPORT:
        if (player.isLocked()) {
            break;
        } else if (!player.getController().canTeleport(true)) {
            break;
        } else if (player.getSkills().getLevel(Skills.MAGIC) < 71) {
            player.getGameEncoder().sendMessage("You need a Magic level of 71 to cast this spell.");
            break;
        } else if (!player.getMagic().hasRunes(ItemID.ASTRAL_RUNE, 2)
                || !player.getMagic().hasRunes(ItemID.LAW_RUNE, 1)
                || !player.getMagic().hasRunes(ItemID.EARTH_RUNE, 6)) {
            player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
            break;
        }
        player.getMagic().deleteRunes(ItemID.ASTRAL_RUNE, 2);
        player.getMagic().deleteRunes(ItemID.LAW_RUNE, 1);
        player.getMagic().deleteRunes(ItemID.EARTH_RUNE, 6);
        player.getSkills().addXP(Skills.MAGIC, 69);
        player.getMovement().animatedTeleport(new Tile(3015, 5628), Magic.NORMAL_MAGIC_ANIMATION_START,
                Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
        AchievementDiary.castSpellHooks(player, spellBookChild, null, null, null);
        break;
    }
}

DecodedPacketWidget.prototype.widget_201 = function(player, index, childID, slot, itemID) {
    // Autocast
    if (player.getEquipment().getWeaponID() == ItemID.TRIDENT_OF_THE_SEAS_FULL
            || player.getEquipment().getWeaponID() == ItemID.TRIDENT_OF_THE_SEAS
            || player.getEquipment().getWeaponID() == ItemID.UNCHARGED_TRIDENT
            || player.getEquipment().getWeaponID() == ItemID.TRIDENT_OF_THE_SEAS_E
            || player.getEquipment().getWeaponID() == ItemID.UNCHARGED_TRIDENT_E
            || player.getEquipment().getWeaponID() == ItemID.TRIDENT_OF_THE_SWAMP
            || player.getEquipment().getWeaponID() == ItemID.UNCHARGED_TOXIC_TRIDENT
            || player.getEquipment().getWeaponID() == ItemID.TRIDENT_OF_THE_SWAMP_E
            || player.getEquipment().getWeaponID() == ItemID.UNCHARGED_TOXIC_TRIDENT_E
            || player.getEquipment().getWeaponID() == ItemID.SANGUINESTI_STAFF
            || player.getEquipment().getWeaponID() == ItemID.SANGUINESTI_STAFF_UNCHARGED) {
        return;
    }
    var spell = null;
    if (player.getMagic().getSpellBook() == Magic.NORMAL_MAGIC) {
        if (slot == 1) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.WIND_STRIKE);
        } else if (slot == 2) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.WATER_STRIKE);
        } else if (slot == 3) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.EARTH_STRIKE);
        } else if (slot == 4) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.FIRE_STRIKE);
        } else if (slot == 5) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.WIND_BOLT);
        } else if (slot == 6) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.WATER_BOLT);
        } else if (slot == 7) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.EARTH_BOLT);
        } else if (slot == 8) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.FIRE_BOLT);
        } else if (slot == 9) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.WIND_BLAST);
        } else if (slot == 10) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.WATER_BLAST);
        } else if (slot == 11) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.EARTH_BLAST);
        } else if (slot == 12) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.FIRE_BLAST);
        } else if (slot == 13) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.WIND_WAVE);
        } else if (slot == 14) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.WATER_WAVE);
        } else if (slot == 15) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.EARTH_WAVE);
        } else if (slot == 16) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.FIRE_WAVE);
        } else if (slot == 48) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.AIR_SURGE);
        } else if (slot == 49) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.WATTER_SURGE);
        } else if (slot == 50) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.EARTH_SURGE);
        } else if (slot == 51) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.FIRE_SURGE);
        }
        if (player.getEquipment().getWeaponID() == ItemID.IBANS_STAFF) {
            if (slot == 47) {
                spell = CombatSpellDef.getDef(WidgetChild.SpellBook.IBAN_BLAST);
            }
        }
        if (player.getEquipment().getWeaponID() == ItemID.SLAYERS_STAFF
                || player.getEquipment().getWeaponID() == ItemID.STAFF_OF_THE_DEAD
                || player.getEquipment().getWeaponID() == ItemID.TOXIC_STAFF_UNCHARGED
                || player.getEquipment().getWeaponID() == ItemID.TOXIC_STAFF_OF_THE_DEAD
                || player.getEquipment().getWeaponID() == ItemID.SLAYERS_STAFF_E) {
            if (slot == 18) {
                spell = CombatSpellDef.getDef(WidgetChild.SpellBook.MAGIC_DART);
            }
        }
        if (player.getEquipment().getWeaponID() == ItemID.STAFF_OF_THE_DEAD
                || player.getEquipment().getWeaponID() == ItemID.TOXIC_STAFF_UNCHARGED
                || player.getEquipment().getWeaponID() == ItemID.TOXIC_STAFF_OF_THE_DEAD) {
            if (slot == 20) {
                spell = CombatSpellDef.getDef(WidgetChild.SpellBook.FLAMES_OF_ZAMORAK);
            }
        }
        if (player.getEquipment().getWeaponID() == ItemID.STAFF_OF_LIGHT) {
            if (slot == 52) {
                spell = CombatSpellDef.getDef(WidgetChild.SpellBook.SARADOMIN_STRIKE);
            }
        }
    } else if (player.getMagic().getSpellBook() == Magic.ANCIENT_MAGIC) {
        if (slot == 31) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.SMOKE_RUSH);
        } else if (slot == 32) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.SHADOW_RUSH);
        } else if (slot == 33) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.BLOOD_RUSH);
        } else if (slot == 34) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.ICE_RUSH);
        } else if (slot == 35) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.SMOKE_BURST);
        } else if (slot == 36) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.SHADOW_BURST);
        } else if (slot == 37) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.BLOOD_BURST);
        } else if (slot == 38) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.ICE_BURST);
        } else if (slot == 39) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.SMOKE_BLITZ);
        } else if (slot == 40) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.SHADOW_BLITZ);
        } else if (slot == 41) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.BLOOD_BLITZ);
        } else if (slot == 42) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.ICE_BLITZ);
        } else if (slot == 43) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.SMOKE_BARRAGE);
        } else if (slot == 44) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.SHADOW_BARRAGE);
        } else if (slot == 45) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.BLOOD_BARRAGE);
        } else if (slot == 46) {
            spell = CombatSpellDef.getDef(WidgetChild.SpellBook.ICE_BARRAGE);
        }
    }
    if (slot != 0 && spell == null) {
        player.getGameEncoder().sendMessage("Unable to find the spell you selected.");
        return;
    }
    player.getMagic().setAutoSpellID(spell != null ? spell.getChildID() : 0);
    player.getMagic().setDefensive(player.getAttributeBool("magic_defensive"));
    player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.COMBAT, WidgetID.COMBAT);
    player.getEquipment().sendCombatTabText();
}

DecodedPacketWidget.prototype.widget_190 = function(player, index, childID, slot, itemID) {
    // Rune pouch
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 4:
        if (index == 0) {
            player.getMagic().removeRunesFromPouch(slot, 1);
        } else if (index == 1) {
            player.getMagic().removeRunesFromPouch(slot, 5);
        } else if (index == 2) {
            player.getMagic().removeRunesFromPouch(slot, Item.MAX_AMOUNT);
        } else if (index == 3) {
            player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                execute: function(value) {
                    player.getMagic().removeRunesFromPouch(slot, value);
                }
            });
        }
        break;
    case 8:
        if (index == 0) {
            player.getMagic().addRunesToPouch(slot, 1);
        } else if (index == 1) {
            player.getMagic().addRunesToPouch(slot, 5);
        } else if (index == 2) {
            player.getMagic().addRunesToPouch(slot, Item.MAX_AMOUNT);
        } else if (index == 3) {
            player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                execute: function(value) {
                    player.getMagic().addRunesToPouch(slot, value);
                }
            });
        }
        break;
    }
}
