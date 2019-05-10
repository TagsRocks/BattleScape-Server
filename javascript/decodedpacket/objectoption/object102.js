/* 26112 - 26367 */

// Window
DecodedPacketObjectOption.prototype.object_26112 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_26113 = function(player, index, object) { }

// Odd looking wall
DecodedPacketObjectOption.prototype.object_26114 = function(player, index, object) { }

// Odd looking wall
DecodedPacketObjectOption.prototype.object_26115 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_26118 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_26119 = function(player, index, object) { }

// Sinclair family compost heap
DecodedPacketObjectOption.prototype.object_26120 = function(player, index, object) { }

// Sinclair family beehive
DecodedPacketObjectOption.prototype.object_26121 = function(player, index, object) { }

// Barrel of flour
DecodedPacketObjectOption.prototype.object_26122 = function(player, index, object) { }

// Smashed window
DecodedPacketObjectOption.prototype.object_26123 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_26130 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_26131 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_26132 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_26133 = function(player, index, object) { }

// Spinning wheel
DecodedPacketObjectOption.prototype.object_26143 = function(player, index, object) { }

// Eyes
DecodedPacketObjectOption.prototype.object_26146 = function(player, index, object) { }

// Blockage
DecodedPacketObjectOption.prototype.object_26187 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_26188 = function(player, index, object) {
    if (!player.getInventory().hasItem(" pickaxe")) {
        player.getGameEncoder().sendMessage("You need a pickaxe to do this.");
        return;
    } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.MINING) + 1)) {
        player.getGameEncoder().sendMessage("You fail to mine the rock.");
        return;
    }
    if (object.getX() == 3026 && object.getY() == 4813) {
        player.getMovement().teleport(3030, 4822);
    }
}

// Tendrils
DecodedPacketObjectOption.prototype.object_26189 = function(player, index, object) {
    if (!player.getInventory().hasItem(" axe")) {
        player.getGameEncoder().sendMessage("You need an axe to do this.");
        return;
    } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.WOODCUTTING) + 1)) {
        player.getGameEncoder().sendMessage("You fail to chop the tendrils.");
        return;
    }
    if (object.getX() == 3018 && object.getY() == 4821) {
        player.getMovement().teleport(3029, 4824);
    }
}

// Boil
DecodedPacketObjectOption.prototype.object_26190 = function(player, index, object) {
    if (!player.getInventory().hasItem(590)) {
        player.getGameEncoder().sendMessage("You need a tinderbox to do this.");
        return;
    } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.FIREMAKING) + 1)) {
        player.getGameEncoder().sendMessage("You fail to burn down the boil.");
        return;
    }
    if (object.getX() == 3018 && object.getY() == 4833) {
        player.getMovement().teleport(3025, 4833);
    }
}

// Eyes
DecodedPacketObjectOption.prototype.object_26191 = function(player, index, object) {
    if (!Utils.inRange(player.getController().getLevelForXP(Skills.THIEVING) + 1)) {
        player.getGameEncoder().sendMessage("You fail to distract the eyes.");
        return;
    }
    if (object.getX() == 3021 && object.getY() == 4842) {
        player.getMovement().teleport(3028, 4840);
    }
}

// Gap
DecodedPacketObjectOption.prototype.object_26192 = function(player, index, object) {
    if (!Utils.inRange(player.getController().getLevelForXP(Skills.AGILITY) + 1)) {
        player.getGameEncoder().sendMessage("You fail to squeeze through the gap.");
        return;
    }
    if (object.getX() == 3028 && object.getY() == 4849) {
        player.getMovement().teleport(3032, 4843);
    }
}

// Chest
DecodedPacketObjectOption.prototype.object_26193 = function(player, index, object) { }

// Lever
DecodedPacketObjectOption.prototype.object_26194 = function(player, index, object) { }

// Large door
DecodedPacketObjectOption.prototype.object_26207 = function(player, index, object) { }

// Passage
DecodedPacketObjectOption.prototype.object_26208 = function(player, index, object) {
    if (object.getX() == 3038 && object.getY() == 4853) {
        player.getMovement().teleport(3039, 4845);
    }
}

// Trapdoor
DecodedPacketObjectOption.prototype.object_26243 = function(player, index, object) { }

// Broken rope bridge
DecodedPacketObjectOption.prototype.object_26244 = function(player, index, object) { }

// Broken rope bridge
DecodedPacketObjectOption.prototype.object_26245 = function(player, index, object) { }

// Broken rope bridge
DecodedPacketObjectOption.prototype.object_26246 = function(player, index, object) { }

// Broken rope bridge
DecodedPacketObjectOption.prototype.object_26247 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_26248 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_26249 = function(player, index, object) { }

// Gap
DecodedPacketObjectOption.prototype.object_26250 = function(player, index, object) {
    if (!Utils.inRange(player.getController().getLevelForXP(Skills.AGILITY) + 1)) {
        player.getGameEncoder().sendMessage("You fail to squeeze through the gap.");
        return;
    }
    if (object.getX() == 3049 && object.getY() == 4849) {
        player.getMovement().teleport(3047, 4843);
    }
}

// Eyes
DecodedPacketObjectOption.prototype.object_26251 = function(player, index, object) {
    if (!Utils.inRange(player.getController().getLevelForXP(Skills.THIEVING) + 1)) {
        player.getGameEncoder().sendMessage("You fail to distract the eyes.");
        return;
    }
    if (object.getX() == 3058 && object.getY() == 4839) {
        player.getMovement().teleport(3051, 4838);
    }
}

// Boil
DecodedPacketObjectOption.prototype.object_26252 = function(player, index, object) {
    if (!player.getInventory().hasItem(590)) {
        player.getGameEncoder().sendMessage("You need a tinderbox to do this.");
        return;
    } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.FIREMAKING) + 1)) {
        player.getGameEncoder().sendMessage("You fail to burn down the boil.");
        return;
    }
    if (object.getX() == 3060 && object.getY() == 4830) {
        player.getMovement().teleport(3053, 4831);
    }
}

// Tendrils
DecodedPacketObjectOption.prototype.object_26253 = function(player, index, object) {
    if (!player.getInventory().hasItem(" axe")) {
        player.getGameEncoder().sendMessage("You need an axe to do this.");
        return;
    } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.WOODCUTTING) + 1)) {
        player.getGameEncoder().sendMessage("You fail to chop the tendrils.");
        return;
    }
    if (object.getX() == 3057 && object.getY() == 4821) {
        player.getMovement().teleport(3050, 4823);
    }
}

// Bank deposit box
DecodedPacketObjectOption.prototype.object_26254 = function(player, index, object) {
    player.getBank().openDepositBox();
}

// Sign
DecodedPacketObjectOption.prototype.object_26255 = function(player, index, object) { }

// <col=ff9040>Zapper
DecodedPacketObjectOption.prototype.object_26256 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_26257 = function(player, index, object) { }

// Chaos altar
DecodedPacketObjectOption.prototype.object_26258 = function(player, index, object) { }

// Spirit tree
DecodedPacketObjectOption.prototype.object_26259 = function(player, index, object) { }

// Spirit tree
DecodedPacketObjectOption.prototype.object_26260 = function(player, index, object) { }

// Spirit tree
DecodedPacketObjectOption.prototype.object_26261 = function(player, index, object) { }

// Spirit tree
DecodedPacketObjectOption.prototype.object_26262 = function(player, index, object) { }

// Spirit tree
DecodedPacketObjectOption.prototype.object_26263 = function(player, index, object) { }

// <col=ff9040>Power surge
DecodedPacketObjectOption.prototype.object_26264 = function(player, index, object) { }

// <col=ff9040>Recurrent damage
DecodedPacketObjectOption.prototype.object_26265 = function(player, index, object) { }

// <col=ff9040>Ultimate force
DecodedPacketObjectOption.prototype.object_26266 = function(player, index, object) { }

// <col=ff9040>Empty vial
DecodedPacketObjectOption.prototype.object_26268 = function(player, index, object) { }

// <col=ff9040>Potion
DecodedPacketObjectOption.prototype.object_26269 = function(player, index, object) { }

// <col=ff9040>Spectator potion
DecodedPacketObjectOption.prototype.object_26270 = function(player, index, object) { }

// Dominic's coffer
DecodedPacketObjectOption.prototype.object_26271 = function(player, index, object) { }

// Dominic's coffer
DecodedPacketObjectOption.prototype.object_26272 = function(player, index, object) { }

// Rewards chest
DecodedPacketObjectOption.prototype.object_26273 = function(player, index, object) { }

// <col=ff9040>Potion
DecodedPacketObjectOption.prototype.object_26276 = function(player, index, object) { }

// Super ranging potion
DecodedPacketObjectOption.prototype.object_26277 = function(player, index, object) { }

// Super magic potion
DecodedPacketObjectOption.prototype.object_26278 = function(player, index, object) { }

// Overload potion
DecodedPacketObjectOption.prototype.object_26279 = function(player, index, object) { }

// Absorption potion
DecodedPacketObjectOption.prototype.object_26280 = function(player, index, object) { }

// <col=ff9040>Anti-dragon shield
DecodedPacketObjectOption.prototype.object_26281 = function(player, index, object) { }

// <col=ff9040>Magic secateurs
DecodedPacketObjectOption.prototype.object_26282 = function(player, index, object) { }

// <col=ff9040>Chaos rune
DecodedPacketObjectOption.prototype.object_26283 = function(player, index, object) { }

// <col=ff9040>Death rune
DecodedPacketObjectOption.prototype.object_26284 = function(player, index, object) { }

// <col=ff9040>Blood rune
DecodedPacketObjectOption.prototype.object_26285 = function(player, index, object) { }

// <col=ff9040>Air rune
DecodedPacketObjectOption.prototype.object_26286 = function(player, index, object) { }

// <col=ff9040>Water rune
DecodedPacketObjectOption.prototype.object_26287 = function(player, index, object) { }

// <col=ff9040>Earth rune
DecodedPacketObjectOption.prototype.object_26288 = function(player, index, object) { }

// <col=ff9040>Fire rune
DecodedPacketObjectOption.prototype.object_26289 = function(player, index, object) { }

// <col=ff9040>Pickaxe
DecodedPacketObjectOption.prototype.object_26290 = function(player, index, object) { }

// <col=ff9040>Empty vial
DecodedPacketObjectOption.prototype.object_26291 = function(player, index, object) { }

// Dominic's coffer
DecodedPacketObjectOption.prototype.object_26292 = function(player, index, object) { }

// Pet house space
DecodedPacketObjectOption.prototype.object_26296 = function(player, index, object) { }

// Oak house
DecodedPacketObjectOption.prototype.object_26297 = function(player, index, object) { }

// Teak house
DecodedPacketObjectOption.prototype.object_26298 = function(player, index, object) { }

// Mahogany house
DecodedPacketObjectOption.prototype.object_26299 = function(player, index, object) { }

// Furnace
DecodedPacketObjectOption.prototype.object_26300 = function(player, index, object) {
    player.getGameEncoder().sendMessage("Perhaps I should use this to forge something...");
}

// Zamorak altar
DecodedPacketObjectOption.prototype.object_26363 = function(player, index, object) {
    if (index == 0) {
        if (player.getCombat().getGodWarsAltar() > 0) {
            var seconds = 600 - Time.tickToSec(player.getCombat().getGodWarsAltar());
            player.getGameEncoder().sendMessage("The gods blessed you recently. They will ignore your prayers for another "
                    + ((seconds > 60) ? ((seconds / 60)|0) + " minutes." : seconds + " seconds."));
            return;
        }
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
        player.getGameEncoder().sendMessage("You recharge your Prayer.");
        player.getCombat().setGodWarsAltar(Time.minToTick(10));
    } else if (index == 1) {
        player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
    }
}

// Saradomin altar
DecodedPacketObjectOption.prototype.object_26364 = function(player, index, object) {
    if (index == 0) {
        if (player.getCombat().getGodWarsAltar() > 0) {
            var seconds = 600 - Time.tickToSec(player.getCombat().getGodWarsAltar());
            player.getGameEncoder().sendMessage("The gods blessed you recently. They will ignore your prayers for another "
                    + ((seconds > 60) ? ((seconds / 60)|0) + " minutes." : seconds + " seconds."));
            return;
        }
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
        player.getGameEncoder().sendMessage("You recharge your Prayer.");
        player.getCombat().setGodWarsAltar(Time.minToTick(10));
    } else if (index == 1) {
        player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
    }
}

// Armadyl altar
DecodedPacketObjectOption.prototype.object_26365 = function(player, index, object) {
    if (index == 0) {
        if (player.getCombat().getGodWarsAltar() > 0) {
            var seconds = 600 - Time.tickToSec(player.getCombat().getGodWarsAltar());
            player.getGameEncoder().sendMessage("The gods blessed you recently. They will ignore your prayers for another "
                    + ((seconds > 60) ? ((seconds / 60)|0) + " minutes." : seconds + " seconds."));
            return;
        }
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
        player.getGameEncoder().sendMessage("You recharge your Prayer.");
        player.getCombat().setGodWarsAltar(Time.minToTick(10));
    } else if (index == 1) {
        player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
    }
}

// Bandos altar
DecodedPacketObjectOption.prototype.object_26366 = function(player, index, object) {
    if (index == 0) {
        if (player.getCombat().getGodWarsAltar() > 0) {
            var seconds = 600 - Time.tickToSec(player.getCombat().getGodWarsAltar());
            player.getGameEncoder().sendMessage("The gods blessed you recently. They will ignore your prayers for another "
                    + ((seconds > 60) ? ((seconds / 60)|0) + " minutes." : seconds + " seconds."));
            return;
        }
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
        player.getGameEncoder().sendMessage("You recharge your Prayer.");
        player.getCombat().setGodWarsAltar(Time.minToTick(10));
    } else if (index == 1) {
        player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                null, 2);
        player.getController().stopWithTeleport();
    }
}
