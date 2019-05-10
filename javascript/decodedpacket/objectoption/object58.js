/* 14848 - 15103 */

// Portal
DecodedPacketObjectOption.prototype.object_14848 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_14860 = function(player, index, object) {
    player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
    player.setAnimation(Prayer.PRAY_ANIMATION);
}

// Trapdoor
DecodedPacketObjectOption.prototype.object_14880 = function(player, index, object) { }

// Bank chest
DecodedPacketObjectOption.prototype.object_14886 = function(player, index, object) {
    if (!player.getWidgetManager().isDiaryComplete(AchievementDiary.Name.FALADOR,
            AchievementDiaryTask.Difficulty.HARD)) {
        player.getGameEncoder().sendMessage("You need to complete the hard Falador achievement diary.");
        return;
    }
    player.getBank().open();
}

// Pottery Oven
DecodedPacketObjectOption.prototype.object_14888 = function(player, index, object) { }

// Spinning wheel
DecodedPacketObjectOption.prototype.object_14889 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_14892 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_14893 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_14894 = function(player, index, object) { }

// Flax
DecodedPacketObjectOption.prototype.object_14896 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_14897 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.AIR);
}

// Altar
DecodedPacketObjectOption.prototype.object_14898 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.MIND);
}

// Altar
DecodedPacketObjectOption.prototype.object_14899 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.WATER);
}

// Altar
DecodedPacketObjectOption.prototype.object_14900 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.EARTH);
}

// Altar
DecodedPacketObjectOption.prototype.object_14901 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.FIRE);
}

// Altar
DecodedPacketObjectOption.prototype.object_14902 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.BODY);
}

// Altar
DecodedPacketObjectOption.prototype.object_14903 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.COSMIC);
}

// Altar
DecodedPacketObjectOption.prototype.object_14904 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.LAW);
}

// Altar
DecodedPacketObjectOption.prototype.object_14905 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.NATURE);
}

// Altar
DecodedPacketObjectOption.prototype.object_14906 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.CHAOS);
}

// Altar
DecodedPacketObjectOption.prototype.object_14907 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.DEATH);
}

// Flax
DecodedPacketObjectOption.prototype.object_14909 = function(player, index, object) { }

// Guild Door
DecodedPacketObjectOption.prototype.object_14910 = function(player, index, object) {
    if (object.getOriginal() != null || object.getAttachment() != null) {
        return;
    }
    if (player.getSkills().getLevel(Skills.CRAFTING) < 40) {
        player.getGameEncoder().sendMessage("You need a Crafting level of 40 to enter.");
        return;
    }
    player.getMovement().clear();
    if (player.getY() >= 3289) {
        player.getMovement().addMovement(player.getX(), player.getY() - 1);
    } else {
        player.getMovement().addMovement(player.getX(), player.getY() + 1);
    }
    Region.openDoors(player, object, 1, false);
}

// Altar
DecodedPacketObjectOption.prototype.object_14911 = function(player, index, object) { }

// Sand
DecodedPacketObjectOption.prototype.object_14914 = function(player, index, object) { }

// Sand
DecodedPacketObjectOption.prototype.object_14915 = function(player, index, object) { }

// Broken multicannon
DecodedPacketObjectOption.prototype.object_14916 = function(player, index, object) { }

// Stepping stone
DecodedPacketObjectOption.prototype.object_14917 = function(player, index, object) {
    if (player.getSkills().getLevel(Skills.AGILITY) < 82) {
        player.getGameEncoder().sendMessage("You need an Agility level of 82 to use this.");
        return;
    }
    if (player.getController().isMagicBound()) {
        player.getGameEncoder().sendMessage("A magical force stops you from moving for "
                + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                + " more seconds.");
        return;
    }
    if (player.getY() <= 3879) {
        player.getMovement().animatedTeleport(new Tile(3091, 3882, player.getHeight()), 7133, null, 0);
    } else {
        player.getMovement().animatedTeleport(new Tile(3093, 3879, player.getHeight()), 7133, null, 0);
    }
    AchievementDiary.agilityObstacleHooks(player, object);
}

// Stepping stone
DecodedPacketObjectOption.prototype.object_14918 = function(player, index, object) {
    if (player.getSkills().getLevel(Skills.AGILITY) < 74) {
        player.getGameEncoder().sendMessage("You need an Agility level of 74 to use this.");
        return;
    }
    if (player.getController().isMagicBound()) {
        player.getGameEncoder().sendMessage("A magical force stops you from moving for "
                + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                + " more seconds.");
        return;
    }
    if (player.getX() == 3201 && player.getY() == 3810) {
        player.getMovement().animatedTeleport(new Tile(3201, 3807, player.getHeight()), 7133, null, 0);
    } else if (player.getX() == 3201 && player.getY() == 3807) {
        player.getMovement().animatedTeleport(new Tile(3201, 3810, player.getHeight()), 7133, null, 0);
    }
    AchievementDiary.agilityObstacleHooks(player, object);
}

// Sand
DecodedPacketObjectOption.prototype.object_14948 = function(player, index, object) { }

// Mill
DecodedPacketObjectOption.prototype.object_14960 = function(player, index, object) { }

// Bamboo Door
DecodedPacketObjectOption.prototype.object_14974 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_14977 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_14979 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_14980 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_14981 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_14982 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_14983 = function(player, index, object) { }

// Strange shrine
DecodedPacketObjectOption.prototype.object_14985 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_14986 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_14988 = function(player, index, object) { }

// Mysterious ruins
DecodedPacketObjectOption.prototype.object_14989 = function(player, index, object) { }

// Mysterious ruins
DecodedPacketObjectOption.prototype.object_14990 = function(player, index, object) { }

// Mysterious ruins
DecodedPacketObjectOption.prototype.object_14991 = function(player, index, object) { }

// Mysterious ruins
DecodedPacketObjectOption.prototype.object_14992 = function(player, index, object) { }

// Mysterious ruins
DecodedPacketObjectOption.prototype.object_14993 = function(player, index, object) { }

// Mysterious ruins
DecodedPacketObjectOption.prototype.object_14994 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_14995 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_14996 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_15030 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_15031 = function(player, index, object) { }

// Crates
DecodedPacketObjectOption.prototype.object_15032 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_15050 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_15051 = function(player, index, object) { }

// Coffin
DecodedPacketObjectOption.prototype.object_15052 = function(player, index, object) { }

// Coffin
DecodedPacketObjectOption.prototype.object_15053 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_15056 = function(player, index, object) { }

// Coffin
DecodedPacketObjectOption.prototype.object_15061 = function(player, index, object) { }

// Teak
DecodedPacketObjectOption.prototype.object_15062 = function(player, index, object) { }

// Weedy patch
DecodedPacketObjectOption.prototype.object_15063 = function(player, index, object) { }

// Weedy patch
DecodedPacketObjectOption.prototype.object_15064 = function(player, index, object) { }

// Weedy patch
DecodedPacketObjectOption.prototype.object_15065 = function(player, index, object) { }

// Weedy patch
DecodedPacketObjectOption.prototype.object_15067 = function(player, index, object) { }

// Flax
DecodedPacketObjectOption.prototype.object_15075 = function(player, index, object) { }

// Flax
DecodedPacketObjectOption.prototype.object_15076 = function(player, index, object) { }

// Flax
DecodedPacketObjectOption.prototype.object_15077 = function(player, index, object) { }

// Flax
DecodedPacketObjectOption.prototype.object_15079 = function(player, index, object) { }

// Herbs
DecodedPacketObjectOption.prototype.object_15080 = function(player, index, object) { }

// Herbs
DecodedPacketObjectOption.prototype.object_15081 = function(player, index, object) { }

// Herbs
DecodedPacketObjectOption.prototype.object_15082 = function(player, index, object) { }

// Herbs
DecodedPacketObjectOption.prototype.object_15084 = function(player, index, object) { }
