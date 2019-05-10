/* 1792 - 2047 */

// Door
DecodedPacketObjectOption.prototype.object_1804 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1805 = function(player, index, object) { }

// Web
DecodedPacketObjectOption.prototype.object_1810 = function(player, index, object) { }

// Lever
DecodedPacketObjectOption.prototype.object_1814 = function(player, index, object) { }

// Lever
DecodedPacketObjectOption.prototype.object_1815 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (object.getX() == 3153 && object.getY() == 3923) {
        // Deep wild lever
        if (player.getMovement().getTeleportBlock() > 0) {
            player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                    + player.getMovement().getTeleportBlockRemaining() + ".");
            return;
        }
        var tile = new Tile(3090, 3475, 0);
        if (player.getClientHeight() == tile.getHeight()) {
            tile.setHeight(player.getHeight());
        }
        player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
        player.clearHits();
    }
}

// Lever
DecodedPacketObjectOption.prototype.object_1816 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (object.getX() == 3067 && object.getY() == 10253) {
        // KBD entrance lever
        if (player.getMovement().getTeleportBlock() > 0) {
            player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                    + player.getMovement().getTeleportBlockRemaining() + ".");
            return;
        }
        if (index == 0) {
            var tile = new Tile(2271, 4680, 0);
            player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
            player.clearHits();
        } else if (index == 4) {
            player.openDialogue("bossinstance", 3);
        }
    }
}

// Lever
DecodedPacketObjectOption.prototype.object_1817 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (object.getX() == 2271 && object.getY() == 4680) {
        // KBD exit lever
        var tile = new Tile(3067, 10253, 0);
        player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
    }
}

// Crumbling wall
DecodedPacketObjectOption.prototype.object_1947 = function(player, index, object) { }

// Crumbling wall
DecodedPacketObjectOption.prototype.object_1948 = function(player, index, object) {
    if (player.getY() != object.getY() || player.getX() > object.getX()) {
        return;
    }
    player.getGameEncoder().sendMessage("You climb the low wall...");
    player.setAnimation(840);
    var toTile = new Tile(object.getX() + 1, object.getY(), object.getHeight());
    player.setForceMovement(new ForceMovement(player, 0, toTile, 2, Tile.EAST));
    player.lock();
    var event = new Event() {
        execute: function() {
            event.stop();
            if (!player.isVisible()) {
                return;
            }
            player.unlock();
            player.getMovement().teleport(toTile);
            var xp = 14;
            if (player.getEquipment().wearingMinimumGraceful()) {
                xp *= 1.1;
            }
            player.getSkills().addXP(Skills.AGILITY, xp);
            if (player.getAttributeInt("agility_stage") == 4) {
                player.putAttribute("agility_stage", 5);
                AchievementDiary.agilityObstacleHooks(player, object);
            } else if (player.getAttributeInt("agility_stage") == 5) {
                player.putAttribute("agility_stage", 6);
                AchievementDiary.agilityObstacleHooks(player, object);
            } else if (player.getAttributeInt("agility_stage") == 6) {
                player.removeAttribute("agility_stage");
                xp = 47;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                // 102 laps an hour
                if (Utils.randomE(25) == 0) {
                    var amount = 4;
                    if (player.getGoldMember()) {
                        amount = 6;
                    }
                    player.getInventory().addOrDropItem(11849, amount);
                }
                if (Utils.randomE(2) == 0) {
                    var rewardType = Utils.randomE(3);
                    if (rewardType == 0) {
                        player.getInventory().addOrDropItem(3009, 1);
                    } else if (rewardType == 1) {
                        player.getInventory().addOrDropItem(3017, 1);
                    } else if (rewardType == 2) {
                        player.getInventory().addOrDropItem(12640, 4);
                    }
                }
                player.getFamiliar().rollSkillPet(Skills.AGILITY, 44376, 20659);
                AchievementDiary.agilityObstacleHooks(player, object);
            }
        }
    };
    player.getWorld().addEvent(event);
}

// Tree Door
DecodedPacketObjectOption.prototype.object_1967 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Tree Door
DecodedPacketObjectOption.prototype.object_1968 = function(player, index, object) {
    Region.openDoors(player, object);
}

// null
DecodedPacketObjectOption.prototype.object_1980 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_1981 = function(player, index, object) { }

// Root
DecodedPacketObjectOption.prototype.object_1985 = function(player, index, object) { }

// Root
DecodedPacketObjectOption.prototype.object_1986 = function(player, index, object) { }

// Log raft
DecodedPacketObjectOption.prototype.object_1987 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_1989 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_1990 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1991 = function(player, index, object) { }

// Glarial's tombstone
DecodedPacketObjectOption.prototype.object_1992 = function(player, index, object) { }

// Glarial's tomb
DecodedPacketObjectOption.prototype.object_1993 = function(player, index, object) { }

// Closed chest
DecodedPacketObjectOption.prototype.object_1994 = function(player, index, object) { }

// Open chest
DecodedPacketObjectOption.prototype.object_1995 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_1996 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_1997 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_1999 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2000 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2002 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_2010 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_2011 = function(player, index, object) { }

// Ledge
DecodedPacketObjectOption.prototype.object_2012 = function(player, index, object) { }

// Vine
DecodedPacketObjectOption.prototype.object_2013 = function(player, index, object) { }

// Chalice of Eternity
DecodedPacketObjectOption.prototype.object_2014 = function(player, index, object) { }

// Chalice of Eternity
DecodedPacketObjectOption.prototype.object_2015 = function(player, index, object) { }

// Dead tree
DecodedPacketObjectOption.prototype.object_2020 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_2022 = function(player, index, object) { }

// Achey Tree
DecodedPacketObjectOption.prototype.object_2023 = function(player, index, object) { }

// Cauldron
DecodedPacketObjectOption.prototype.object_2024 = function(player, index, object) { }

// Furnace
DecodedPacketObjectOption.prototype.object_2030 = function(player, index, object) { }

// Anvil
DecodedPacketObjectOption.prototype.object_2031 = function(player, index, object) {
    if (player.getInventory().hasItem(Smithing.BRONZE_BAR_ID)) {
        Smithing.openSmith(player, Smithing.BRONZE_BAR_ID);
    } else if (player.getInventory().hasItem(Smithing.IRON_BAR_ID)) {
        Smithing.openSmith(player, Smithing.IRON_BAR_ID);
    } else if (player.getInventory().hasItem(Smithing.STEEL_BAR_ID)) {
        Smithing.openSmith(player, Smithing.STEEL_BAR_ID);
    } else if (player.getInventory().hasItem(Smithing.MITHRIL_BAR_ID)) {
        Smithing.openSmith(player, Smithing.MITHRIL_BAR_ID);
    } else if (player.getInventory().hasItem(Smithing.ADAMANT_BAR_ID)) {
        Smithing.openSmith(player, Smithing.ADAMANT_BAR_ID);
    } else if (player.getInventory().hasItem(Smithing.RUNE_BAR_ID)) {
        Smithing.openSmith(player, Smithing.RUNE_BAR_ID);
    } else if (player.getInventory().hasItem(Smithing.BLURITE_BAR_ID)) {
        Smithing.openSmith(player, Smithing.BLURITE_BAR_ID);
    }
}

// Bedroom door
DecodedPacketObjectOption.prototype.object_2032 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2034 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2036 = function(player, index, object) { }

// Dummy
DecodedPacketObjectOption.prototype.object_2038 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2039 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2041 = function(player, index, object) { }
