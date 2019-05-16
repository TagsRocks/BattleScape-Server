/**
 * AUTO-GENERATED: DO NOT EDIT
 */

// this shit is a mess
function DecodedPacket60() {
    normalCommand = function(player, command) {
        var split = command.split(" ");
        var action = split[0];
        if (action.equals("vote")) {
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/vote");
        } else if (action.equals("store") || action.equals("donate")) {
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/store");
        } else if (action.equals("hiscores") || action.equals("highscores")) {
            player.getGameEncoder().sendOpenURL("https://www.battle-scape.com/hiscores");
        } else if (action.equals("deleteinv") && Main.ownerPrivledges(player)) {
            for (var i = 0; i < player.getInventory().size(); i++) {
                var id = player.getInventory().getID(i);
                player.getInventory().deleteItem(id, Item.MAX_AMOUNT);
                player.getInventory().setItem(i, null);
                player.getInventory().setUpdate(true);
            }
        } else if (action.equals("item") && (Main.ownerPrivledges(player) || Main.isBeta())) {
            var id = -1;
            if (split.length == 1) {
                return;
            }
            if (split[1].matches("[0-9]+")) {
                id = Integer.parseInt(split[1]);
            } else {
                id = ItemID.valueOf(split[1].toUpperCase());
            }
            var amount = 1;
            if (id == -1) {
                player.getGameEncoder().sendMessage("Couldn't find item.");
                return;
            }
            if (split.length == 3) {
                amount = Integer.parseInt(split[2]);
            }
            player.getInventory().addItem(id, amount);
        } else if (action.equals("largeview") && Main.adminPrivledges(player)) {
            player.setLargeVisibility();
        } else if (action.equals("max") && Main.adminPrivledges(player)) {
            for (var i = 0; i < Skills.SKILL_COUNT; i++) {
                player.getSkills().setXP(i, Skills.XP_TABLE[99]);
                player.getGameEncoder().sendSkillLevel(i);
            }
        } else if (action.equals("maxcombat") && Main.adminPrivledges(player)) {
            var combatSkills = [
                Skills.ATTACK, Skills.DEFENCE, Skills.STRENGTH, Skills.HITPOINTS, Skills.RANGED, Skills.MAGIC,
                Skills.PRAYER, Skills.SLAYER
            ];
            for each (var skillID in combatSkills) {
                player.getSkills().setXP(skillID, Skills.XP_TABLE[99]);
                player.getGameEncoder().sendSkillLevel(skillID);
            }
            player.restore();
        } else if (action.equals("rstbnk") && Main.adminPrivledges(player)) {
            player.getBank().resetBank();
        } else if (action.equals("unlockpin321")) {
            player.getBank().unlockPin();
        } else if (action.equals("unlockpin") && Main.adminPrivledges(player)) {
            player.getBank().unlockPin();
        } else if (action.equals("lvl") && Main.adminPrivledges(player)) {
            if (command.length() < 7) {
                player.getGameEncoder().sendMessage("Please use as ::lvl skill_id skill_level username_or_userid");
                return;
            }
            try {
                var skillID = Integer.parseInt(split[1]);
            } catch (e) {
                player.getGameEncoder().sendMessage("Please use as ::lvl skill_id skill_level username_or_userid");
                return;
            }
            if (skillID < 0 || skillID > Skills.SKILL_COUNT) {
                player.getGameEncoder().sendMessage("Max skill ID is " + Skills.SKILL_COUNT);
                return;
            }
            try {
                var skillLevel = Integer.parseInt(split[2]);
            } catch (e) {
                player.getGameEncoder().sendMessage("Please use as ::lvl skill_id skill_level username_or_userid");
                return;
            }
            if (skillLevel < 1 || skillLevel > 99) {
                player.getGameEncoder().sendMessage("Skill level can be 1-99");
                return;
            }
            var baseString = skillID + " " + skillLevel;
            var username = command.substring(command.indexOf(baseString) + baseString.length() + 1);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                var userID = -1;
                try {
                    userID = Integer.parseInt(username);
                } catch (e) { }
                if (userID != -1) {
                    player2 = player.getWorld().getPlayerByID(userID);
                }
                if (player2 == null) {
                    player2 = player;
                }
            }
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username);
                return;
            }
            player2.getGameEncoder().sendMessage(player.getUsername() + " has adjusted your "
                    + Skills.SKILL_NAMES[skillID] + " to " + skillLevel);
            player.getGameEncoder().sendMessage("You have adjusted " + player2.getUsername() + "'s "
                    + Skills.SKILL_NAMES[skillID] + " to " + skillLevel);
            if (player2.getSkills().getLevelForXP(skillID) < skillLevel) {
                player2.getSkills().addXP(skillID, Skills.XP_TABLE[skillLevel] - player2.getSkills().getXP(skillID),
                        false);
            } else {
                player2.getSkills().setXP(skillID, Skills.XP_TABLE[skillLevel]);
                player2.getSkills().setLevel(skillID, skillLevel);
                player2.getSkills().setCombatLevel();
                player2.getGameEncoder().sendSkillLevel(skillID);
            }
        } else if (action.equals("xp") && Main.adminPrivledges(player)) {
            if (command.length() < 6) {
                player.getGameEncoder().sendMessage("Please use as ::xp skill_id skill_xp username_or_userid");
                return;
            }
            try {
                var skillID = Integer.parseInt(split[1]);
            } catch (e) {
                player.getGameEncoder().sendMessage("Please use as ::xp skill_id skill_xp username_or_userid");
                return;
            }
            if (skillID < 0 || skillID > Skills.SKILL_COUNT) {
                player.getGameEncoder().sendMessage("Max skill ID is " + Skills.SKILL_COUNT);
                return;
            }
            try {
                var skillXP = Integer.parseInt(split[2]);
            } catch (e) {
                player.getGameEncoder().sendMessage("Please use as ::xp skill_id skill_xp username_or_userid");
                return;
            }
            if (skillXP < 0 || skillXP > Skills.MAX_XP) {
                player.getGameEncoder().sendMessage("Skill level can be 0-" + Skills.MAX_XP);
                return;
            }
            var baseString = skillID + " " + skillXP;
            var username = command.substring(command.indexOf(baseString) + baseString.length() + 1);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                var userID = -1;
                try {
                    userID = Integer.parseInt(username);
                } catch (e) { }
                if (userID != -1) {
                    player2 = player.getWorld().getPlayerByID(userID);
                }
                if (player2 == null) {
                    player2 = player;
                }
            }
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username);
                return;
            }
            player2.getGameEncoder().sendMessage(player.getUsername() + " has adjusted your "
                    + Skills.SKILL_NAMES[skillID] + " to " + Skills.getLevelSuppliedXP(skillXP));
            player.getGameEncoder().sendMessage("You have adjusted " + player2.getUsername() + "'s "
                    + Skills.SKILL_NAMES[skillID] + " to " + Skills.getLevelSuppliedXP(skillXP));
            player2.getSkills().setXP(skillID, skillXP);
            player2.getSkills().setLevel(skillID, Skills.getLevelSuppliedXP(skillXP));
            player2.getSkills().setCombatLevel();
            player2.getGameEncoder().sendSkillLevel(skillID);
        } else if (action.equals("bnk") && Main.ownerPrivledges(player)) {
            player.getBank().open();
        } else if (action.equals("ge") && Main.ownerPrivledges(player)) {
            player.getGrandExchange().open();
        } else if (action.equals("item2") && Main.ownerPrivledges(player)) {
            var id = Integer.parseInt(split[1]);
            var amount = 1;
            if (split.length == 3) {
                amount = Integer.parseInt(split[2]);
            }
            player.getInventory().addOrDropItem(id, amount);
        } else if (action.equals("mapitem") && Main.ownerPrivledges(player)) {
            var id = Integer.parseInt(split[1]);
            var amount = 1;
            if (split.length == 3) {
                amount = Integer.parseInt(split[2]);
            }
            player.getController().addMapItem(new Item(id, amount), player, player);
        } else if (action.equals("items") && Main.ownerPrivledges(player)) {
            player.openShop("admin");
        } else if (action.equals("coords")) {
            player.getGameEncoder().sendMessage("mapClip=" + player.getController().getMapClip(player.getX(),
                    player.getY(), player.getHeight()));
            player.getGameEncoder().sendMessage("solidMapObject=" + player.getController().getSolidMapObject(player));
            player.getGameEncoder().sendMessage("x=" + player.getX() + ", y=" + player.getY() + ", z="
                    + player.getHeight() + ", client-z=" + player.getClientHeight() + ", region-id="
                    + player.getRegionID() + ", instanced=" + player.getController().isInstanced());
        } else if (action.equals("yell") && (player.getRights() > 0 || player.isUsergroup(Player.GROUP_ADVERTISER))) {
            var message = command.substring(5);
            var img = "";
            if (player.getRights() > 0 && player.getRights() < 3) {
                img = "<img=" + (player.getRights() - 1) + ">";
            }
            player.getWorld().sendMessage("[<col=ff0000>Yell</col>] " + img + player.getUsername()
                    + ": " + message);
        } else if (action.equals("youtuber") && Main.ownerPrivledges(player)) {
            player.getBank().add(new Item(ItemID.SERPENTINE_HELM_UNCHARGED, 1));
            player.getBank().add(new Item(ItemID.BANDOS_CHESTPLATE, 1));
            player.getBank().add(new Item(ItemID.BANDOS_TASSETS, 1));
            player.getBank().add(new Item(ItemID.ARMADYL_HELMET, 1));
            player.getBank().add(new Item(ItemID.ARMADYL_CHESTPLATE, 1));
            player.getBank().add(new Item(ItemID.ARMADYL_CHAINSKIRT, 1));
            player.getBank().add(new Item(ItemID.ANCESTRAL_HAT, 1));
            player.getBank().add(new Item(ItemID.ANCESTRAL_ROBE_TOP, 1));
            player.getBank().add(new Item(ItemID.ANCESTRAL_ROBE_BOTTOM, 1));
            player.getBank().add(new Item(ItemID.AHRIMS_HOOD, 1));
            player.getBank().add(new Item(ItemID.AHRIMS_ROBETOP, 1));
            player.getBank().add(new Item(ItemID.AHRIMS_ROBESKIRT, 1));
            player.getBank().add(new Item(ItemID.AHRIMS_STAFF, 1));
            player.getBank().add(new Item(ItemID.DHAROKS_HELM, 1));
            player.getBank().add(new Item(ItemID.DHAROKS_PLATEBODY, 1));
            player.getBank().add(new Item(ItemID.DHAROKS_PLATELEGS, 1));
            player.getBank().add(new Item(ItemID.DHAROKS_GREATAXE, 1));
            player.getBank().add(new Item(ItemID.KARILS_COIF, 1));
            player.getBank().add(new Item(ItemID.KARILS_LEATHERTOP, 1));
            player.getBank().add(new Item(ItemID.KARILS_LEATHERSKIRT, 1));
            player.getBank().add(new Item(ItemID.KARILS_CROSSBOW, 1));
            player.getBank().add(new Item(ItemID.VOID_KNIGHT_SET, 1));
            player.getBank().add(new Item(ItemID.FIGHTER_TORSO, 1));
            player.getBank().add(new Item(ItemID.AMULET_OF_FURY, 1));
            player.getBank().add(new Item(ItemID.NECKLACE_OF_ANGUISH, 1));
            player.getBank().add(new Item(ItemID.AMULET_OF_TORTURE, 1));
            player.getBank().add(new Item(ItemID.OCCULT_NECKLACE, 1));
            player.getBank().add(new Item(ItemID.SALVE_AMULET_EI, 1));
            player.getBank().add(new Item(ItemID.FIRE_CAPE, 1));
            player.getBank().add(new Item(ItemID.INFERNAL_CAPE, 1));
            player.getBank().add(new Item(ItemID.AVAS_ASSEMBLER, 1));
            player.getBank().add(new Item(ItemID.IMBUED_SARADOMIN_CAPE, 1));
            player.getBank().add(new Item(ItemID.IMBUED_GUTHIX_CAPE, 1));
            player.getBank().add(new Item(ItemID.IMBUED_ZAMORAK_CAPE, 1));
            player.getBank().add(new Item(ItemID.DIAMOND_DRAGON_BOLTS_E, 10000));
            player.getBank().add(new Item(ItemID.DRAGONSTONE_DRAGON_BOLTS_E, 10000));
            player.getBank().add(new Item(ItemID.DRAGONFIRE_SHIELD_11284, 1));
            player.getBank().add(new Item(ItemID.DRAGONFIRE_WARD_22003, 1));
            player.getBank().add(new Item(ItemID.ANCIENT_WYVERN_SHIELD_21634, 1));
            player.getBank().add(new Item(ItemID.MAGES_BOOK, 1));
            player.getBank().add(new Item(ItemID.TWISTED_BUCKLER, 1));
            player.getBank().add(new Item(ItemID.DRAGON_DEFENDER, 1));
            player.getBank().add(new Item(ItemID.ELYSIAN_SPIRIT_SHIELD, 1));
            player.getBank().add(new Item(ItemID.DINHS_BULWARK, 1));
            player.getBank().add(new Item(ItemID.FEROCIOUS_GLOVES, 1));
            player.getBank().add(new Item(ItemID.BARROWS_GLOVES, 1));
            player.getBank().add(new Item(ItemID.TORMENTED_BRACELET, 1));
            player.getBank().add(new Item(ItemID.PRIMORDIAL_BOOTS, 1));
            player.getBank().add(new Item(ItemID.PEGASIAN_BOOTS, 1));
            player.getBank().add(new Item(ItemID.ETERNAL_BOOTS, 1));
            player.getBank().add(new Item(ItemID.GUARDIAN_BOOTS, 1));
            player.getBank().add(new Item(ItemID.BOOTS_OF_STONE, 1));
            player.getBank().add(new Item(ItemID.BERSERKER_RING_I, 1));
            player.getBank().add(new Item(ItemID.ARCHERS_RING_I, 1));
            player.getBank().add(new Item(ItemID.SEERS_RING_I, 1));
            player.getBank().add(new Item(ItemID.RING_OF_SUFFERING_I, 1));
            player.getBank().add(new Item(ItemID.DEXTEROUS_PRAYER_SCROLL, 1));
            player.getBank().add(new Item(ItemID.ARCANE_PRAYER_SCROLL, 1));
            player.getBank().add(new Item(ItemID.ABYSSAL_TENTACLE, 1));
            player.getBank().add(new Item(ItemID.ZAMORAKIAN_SPEAR, 1));
            player.getBank().add(new Item(ItemID.ZAMORAKIAN_HASTA, 1));
            player.getBank().add(new Item(ItemID.ARMADYL_GODSWORD, 1));
            player.getBank().add(new Item(ItemID.ELDER_MAUL, 1));
            player.getBank().add(new Item(ItemID.DRAGON_CLAWS, 1));
            player.getBank().add(new Item(ItemID.DRAGON_WARHAMMER, 1));
            player.getBank().add(new Item(ItemID.DRAGON_HUNTER_LANCE, 1));
            player.getBank().add(new Item(ItemID.ABYSSAL_BLUDGEON, 1));
            player.getBank().add(new Item(ItemID.TWISTED_BOW, 1));
            player.getBank().add(new Item(ItemID.ARMADYL_CROSSBOW, 1));
            player.getBank().add(new Item(ItemID.DRAGON_HUNTER_CROSSBOW, 1));
            player.getBank().add(new Item(ItemID.TOXIC_BLOWPIPE_EMPTY, 1));
            player.getBank().add(new Item(ItemID.DRAGON_CROSSBOW, 1));
            player.getBank().add(new Item(ItemID.DRAGON_DART, 10000));
            player.getBank().add(new Item(ItemID.DRAGON_ARROW, 10000));
            player.getBank().add(new Item(ItemID.ZULRAHS_SCALES, 40000));
            player.getBank().add(new Item(ItemID.UNCHARGED_TOXIC_TRIDENT, 1));
            player.getBank().add(new Item(ItemID.TOXIC_STAFF_UNCHARGED, 1));
            player.getBank().add(new Item(ItemID.KODAI_WAND, 1));
            player.getBank().add(new Item(ItemID.MASTER_WAND, 1));
            player.getBank().add(new Item(ItemID.SLAYER_HELMET_I, 1));
            player.getBank().add(new Item(ItemID.BLACK_SLAYER_HELMET_I, 1));
            player.getBank().add(new Item(ItemID.GREEN_SLAYER_HELMET_I, 1));
            player.getBank().add(new Item(ItemID.HYDRA_SLAYER_HELMET_I, 1));
            player.getBank().add(new Item(ItemID.PURPLE_SLAYER_HELMET_I, 1));
            player.getBank().add(new Item(ItemID.RED_SLAYER_HELMET_I, 1));
            player.getBank().add(new Item(ItemID.TURQUOISE_SLAYER_HELMET_I, 1));
            player.getBank().add(new Item(ItemID.SUPER_COMBAT_POTION_4, 5000));
            player.getBank().add(new Item(ItemID.BASTION_POTION_4, 5000));
            player.getBank().add(new Item(ItemID.BATTLEMAGE_POTION_4, 5000));
            player.getBank().add(new Item(ItemID.SUPER_RESTORE_4, 5000));
            player.getBank().add(new Item(ItemID.STAMINA_POTION_4, 5000));
            player.getBank().add(new Item(ItemID.SARADOMIN_BREW_4, 5000));
            player.getBank().add(new Item(ItemID.ANGLERFISH, 5000));
            player.getBank().add(new Item(ItemID.COINS, 100000000));
            player.getBank().add(new Item(ItemID.OLD_SCHOOL_BOND, 10));
        }
    }

    modCommand = function(player, command) {
        var split = command.split(" ");
        var action = split[0];
        if (action.equals("mute")) {
            if (command.length() <= 5) {
                player.getGameEncoder().sendMessage("Please use as ::mute hours username_or_userid");
                return;
            }
            try {
                var hours = Integer.parseInt(split[1]);
            } catch (e) {
                player.getGameEncoder().sendMessage("Please use as ::mute hours username_or_userid");
                return;
            }
            if (hours > 24) {
                player.getGameEncoder().sendMessage("Max mute time is 24 hours.");
                return;
            }
            var username = command.substring(command.indexOf(split[1]) + split[1].length() + 1);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                var userID = -1;
                try {
                    userID = Integer.parseInt(username);
                } catch (e) { }
                if (userID != -1) {
                    player2 = player.getWorld().getPlayerByID(userID);
                }
            }
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            } else if (player == player2) {
                player.getGameEncoder().sendMessage("You can't mute yourself.");
                return;
            }
            player2.getGameEncoder().sendMessage(player.getUsername() + " has muted you for " + hours + " hours.");
            player2.getMessaging().setMuteTime(hours * 60, player.getUsername());
            player.getGameEncoder().sendMessage(username + " has been muted for " + hours + " hours.");
            player.getWorld().sendStaffMessage(player.getUsername() + " muted " + player2.getUsername()
                    + " for " + hours + " hours.");
            RequestManager.addPlayerLog("mute/0.txt", player.getLogName() + " muted " + player2.getLogName()
                    + " for " + hours + " hours.");
        } else if (action.equals("unmute")) {
            if (command.length() <= 7) {
                player.getGameEncoder().sendMessage("Please use as ::unmute username");
                return;
            }
            var username = command.substring(7);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            } else if (player == player2) {
                player.getGameEncoder().sendMessage("You can't unmute yourself.");
                return;
            }
            player2.getGameEncoder().sendMessage(player.getUsername() + " has unmuted you.");
            player2.getMessaging().setMuteTime(0, null);
            player.getGameEncoder().sendMessage(username + " has been unmuted.");
            player.getWorld().sendStaffMessage(player.getUsername() + " unmuted " + player2.getUsername() + ".");
            RequestManager.addPlayerLog("mute/0.txt", player.getLogName() + " unmuted " + player2.getLogName() + ".");
        } else if (action.equals("kick")) {
            if (command.length() <= 5) {
                player.getGameEncoder().sendMessage("Please use as ::kick username");
                return;
            }
            var username = command.substring(5);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            } else if (player2.getController().inWilderness()) {
                player.getGameEncoder().sendMessage("This player is in the wilderness.");
                return;
            } else if (player2.getController().inPvPWorld()) {
                player.getGameEncoder().sendMessage("This player is in the PvP world.");
                return;
            }
            player2.getGameEncoder().sendMessage(player.getUsername() + " has kicked you.");
            var event = new Event(Event.MILLIS_600) {
                execute: function() {
                    event.stop();
                    if (!player2.isVisible()) {
                        return;
                    }
                    player2.getGameEncoder().sendLogout();
                    if (!player2.isLocked()) {
                        player2.setVisible(false);
                    }
                }
            };
            player.getWorld().addEvent(event);
            player.getGameEncoder().sendMessage(username + " has been kicked.");
            player.getWorld().sendStaffMessage(player.getUsername() + " kicked " + player2.getUsername() + ".");
        } else if (action.equals("move")) {
            if (!player.isUsergroup(Player.GROUP_MODERATOR) && !player.isUsergroup(Player.GROUP_SENIOR_MODERATOR)
                    && !player.isUsergroup(Player.GROUP_ADMINISTRATOR)) {
                return;
            } else if (command.length() <= 5) {
                player.getGameEncoder().sendMessage("Please use as ::move username");
                return;
            }
            var username = command.substring(5);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            } else if (player == player2) {
                player.getGameEncoder().sendMessage("You can't move yourself.");
                return;
            } else if (player2.getController().isInstanced()) {
                player.getGameEncoder().sendMessage(username + " is in an instance located at: "
                        + player.getX() + ", " + player.getY() + ", " + player.getHeight() + ".");
                return;
            } else if (!player2.getController().canTeleport(30, false)) {
                player.getGameEncoder().sendMessage(username + " can't currently be moved.");
                return;
            }
            player2.getGameEncoder().sendMessage(player.getUsername() + " has moved you.");
            player.getGameEncoder().sendMessage(username + " has been moved.");
            player2.getMovement().teleport(World.DEFAULT_TILE);
            player2.getController().stopWithTeleport();
        } else if (action.equals("private")) {
            if (command.length() <= 8) {
                player.getGameEncoder().sendMessage("Please use as ::private username");
                return;
            }
            var username = command.substring(8);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            } else if (player2.getController().isInstanced()) {
                player.getGameEncoder().sendMessage(username + " is in an instance located at: "
                        + player.getX() + ", " + player.getY() + ", " + player.getHeight() + ".");
                return;
            } else if (!player2.getController().canTeleport(30, false)) {
                player.getGameEncoder().sendMessage(username + " can't currently be moved.");
                return;
            }
            player2.getGameEncoder().sendMessage(player.getUsername() + " has moved you.");
            player.getGameEncoder().sendMessage(username + " has been moved.");
            player2.getMovement().teleport(2895, 2727);
            player2.getController().stopWithTeleport();
        } else if (action.equals("view")) {
            if (command.length() <= 5) {
                player.getGameEncoder().sendMessage("Please use as ::view username");
                return;
            }
            var username = command.substring(5);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            } else if (player == player2) {
                player.getGameEncoder().sendMessage("You can't view yourself.");
                return;
            } else if (player.getController().isInstanced()) {
                player.getGameEncoder().sendMessage("You can't view while in an instance.");
                return;
            } else if (player2.getController().isInstanced()) {
                player.getGameEncoder().sendMessage(username + " is in an instance located at: "
                        + player2.getX() + ", " + player2.getY() + ", " + player2.getHeight() + ".");
                return;
            } else if (player.isUsergroup(Player.GROUP_OVERSEER) && (player2.getController().inWilderness()
                    || player2.getController().inPvPWorld())) {
                player.getGameEncoder().sendMessage("This player is in the wilderness.");
                return;
            }
            var viewTile = new Tile(player2);
            viewTile.randomize(1);
            player.getMovement().setViewing(viewTile);
            player.getWidgetManager().sendInventoryOverlay(WidgetID.UNMORPH);
        } else if (action.equals("random")) {
            if (command.length() <= 7) {
                player.getGameEncoder().sendMessage("Please use as ::random username");
                return;
            }
            var username = command.substring(7);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            } else if (player2.getController().isInstanced()) {
                player.getGameEncoder().sendMessage(username + " is in an instance located at: "
                        + player.getX() + ", " + player.getY() + ", " + player.getHeight() + ".");
                return;
            } else if (player.isUsergroup(Player.GROUP_OVERSEER) && (player2.getController().inWilderness()
            || player2.getController().inPvPWorld())) {
                player.getGameEncoder().sendMessage("This player is in the wilderness.");
                return;
            }
            player.getMovement().teleport(3228, 3410);
            player2.getRandomEvent().startRandom(player.getID());
        } else if (action.equals("teleto")) {
            if (!player.isUsergroup(Player.GROUP_SENIOR_MODERATOR)
                    && !player.isUsergroup(Player.GROUP_ADMINISTRATOR)) {
                return;
            } else if (command.length() <= 7) {
                player.getGameEncoder().sendMessage("Please use as ::teleto username");
                return;
            }
            var username = command.substring(7);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            } else if (player == player2) {
                player.getGameEncoder().sendMessage("You can't teleport to yourself.");
                return;
            } else if (player.getController().isInstanced()) {
                player.getGameEncoder().sendMessage("You can't teleport while in an instance.");
                return;
            } else if (player2.getController().isInstanced()) {
                player.getGameEncoder().sendMessage(username + " is in an instance located at: "
                        + player2.getX() + ", " + player2.getY() + ", " + player2.getHeight() + ".");
                return;
            }
            player.getMovement().teleport(player2);
        } else if (action.equals("teletome")) {
            if (!player.isUsergroup(Player.GROUP_SENIOR_MODERATOR)
                    && !player.isUsergroup(Player.GROUP_ADMINISTRATOR)) {
                return;
            } else if (command.length() <= 9) {
                player.getGameEncoder().sendMessage("Please use as ::teletome username");
                return;
            }
            var username = command.substring(9);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            } else if (player == player2) {
                player.getGameEncoder().sendMessage("You can't teleport to yourself.");
                return;
            } else if (player.getController().isInstanced()) {
                player.getGameEncoder().sendMessage("You can't teleport while in an instance.");
                return;
            } else if ((player.getController().inWilderness() || player.getController().inPvPWorld())
                    && !player.isUsergroup(Player.GROUP_ADMINISTRATOR)) {
                player.getGameEncoder().sendMessage("You can't teleport while in the wilderness.");
                return;
            } else if (player2.getController().isInstanced()) {
                player.getGameEncoder().sendMessage(username + " is in an instance located at: "
                        + player.getX() + ", " + player.getY() + ", " + player.getHeight() + ".");
                return;
            }
            player2.getMovement().teleport(player);
        } else if (action.equals("shutdown")) {
            if (!player.isUsergroup(Player.GROUP_SENIOR_MODERATOR)
                    && !player.isUsergroup(Player.GROUP_ADMINISTRATOR)) {
                player.getGameEncoder().sendMessage("You don't have the correct privledges for this.");
                return;
            }
            try {
                var time = Integer.parseInt(split[1]);
            } catch (e) {
                player.getGameEncoder().sendMessage("Please use as ::shutdown minutes");
                return;
            }
            Logger.println(player.getUsername() + " shut the server down with a countdown of " + time);
            player.getWorld().startShutdown(time);
        } else if (action.equals("shutdownall")) {
            if (!player.isUsergroup(Player.GROUP_SENIOR_MODERATOR)
                    && !player.isUsergroup(Player.GROUP_ADMINISTRATOR)) {
                player.getGameEncoder().sendMessage("You don't have the correct privledges for this.");
                return;
            }
            try {
                var time = Integer.parseInt(split[1]);
            } catch (e) {
                player.getGameEncoder().sendMessage("Please use as ::shutdownall minutes");
                return;
            }
            Logger.println(player.getUsername() + " shut the server down with a countdown of " + time);
            RequestServer.getInstance().addWorldsShutdown(time);
        } else if (action.equals("stats")) {
            if (!player.isUsergroup(Player.GROUP_SENIOR_MODERATOR)
                    && !player.isUsergroup(Player.GROUP_ADMINISTRATOR)) {
                return;
            }
            player.getWorld().printStats();
        } else if (action.equals("players")) {
            var normals = 0;
            var ironmans = 0;
            var hards = 0;
            var hardcores = 0;
            var groups = 0;
            var idleTime = 0;
            for each (var player2 in player.getWorld().getPlayers()) {
                if (player2.isGameModeNormal()) {
                    normals++;
                } else if (player2.isGameModeIronman()) {
                    ironmans++;
                } else if (player2.isGameModeHard()) {
                    hards++;
                } else if (player2.isGameModeHardcoreIronman()) {
                    hardcores++;
                } else if (player2.isGameModeGroupIronman()) {
                    groups++;
                }
                if (player2.getIdleTime() > idleTime) {
                    idleTime = player2.getIdleTime();
                }
            }
            var lines = new ArrayList();
            lines.add("Normals: " + normals);
            lines.add("Hards: " + hards);
            lines.add("Ironmans: " + ironmans);
            lines.add("Hardcore Ironmans: " + hardcores);
            lines.add("Group Ironmans: " + groups);
            lines.add("Highest Idle: " + Time.ticksToLongDuration(idleTime));
            var players = new ArrayList(player.getWorld().getPlayers());
            Collections.sort(players, new Comparator() {
                compare: function(p1, p2) {
                    return Integer.compare(p1.getIdleTime(), p2.getIdleTime());
                }
            });
            //Mapping region ids -> location name would be so much better, to do
            for each (var player2 in players) {
                var title = player2.getMessaging().getIconImage();
                var username = player2.getUsername();
                if (player.getRights() == 0) {
                    username = "Hidden";
                }
                var location = "Dungeon";
                if (player2.getX() >= 1562 && player2.getY() >= 3471 && player2.getX() <= 1658
                        && player2.getY() <= 3519) {
                    location = "Woodcutting Guild";
                } else if (player2.getX() >= 1710 && player2.getY() >= 3435 && player2.getX() <= 1875
                        && player2.getY() <= 3473) {
                    location = "Sand Crabs";
                } else if (player2.getX() >= 1808 && player2.getY() >= 3480 && player2.getX() <= 1821
                        && player2.getY() <= 3493) {
                    location = "Hosidius Farm";
                } else if (player2.getX() >= 1740 && player2.getY() >= 3670 && player2.getX() <= 1865
                        && player2.getY() <= 3804) {
                    location = "Piscarilius House";
                } else if (player2.getX() >= 1143 && player2.getY() >= 3311 && player2.getX() <= 2001
                        && player2.getY() <= 4099) {
                    location = "Great Kourend";
                } else if (player2.getX() >= 2045 && player2.getY() >= 3837 && player2.getX() <= 2186
                        && player2.getY() <= 3969) {
                    location = "Lunar Isle";
                } else if (player2.getX() >= 2171 && player2.getY() >= 3781 && player2.getX() <= 2238
                        && player2.getY() <= 3842) {
                    location = "Pirate's Cove";
                } else if (player2.getX() >= 2303 && player2.getY() >= 3776 && player2.getX() <= 2367
                        && player2.getY() <= 3821) {
                    location = "Neitiznot";
                } else if (player2.getX() >= 2368 && player2.getY() >= 3776 && player2.getX() <= 2435
                        && player2.getY() <= 3827) {
                    location = "Jatizso";
                } else if (player2.getX() >= 2368 && player2.getY() >= 3844 && player2.getX() <= 2381
                        && player2.getY() <= 3858) {
                    location = "Fremennik Isles Small Mine";
                } else if (player2.getX() >= 2297 && player2.getY() >= 3772 && player2.getX() <= 2439
                        && player2.getY() <= 3906) {
                    location = "Fremennik Isles";
                } else if (player2.getX() >= 2490 && player2.getY() >= 3710 && player2.getX() <= 2565
                        && player2.getY() <= 3772) {
                    location = "Waterbirth Island";
                } else if (player2.getX() >= 2483 && player2.getY() >= 3811 && player2.getX() <= 2636
                        && player2.getY() <= 3928) {
                    location = "Miscellania";
                } else if (player2.getX() >= 2602 && player2.getY() >= 2552 && player2.getX() <= 2710
                        && player2.getY() <= 2683) {
                    location = "Pest Control";
                } else if (player2.getX() >= 2688 && player2.getY() >= 2686 && player2.getX() <= 2824
                        && player2.getY() <= 2816) {
                    location = "Ape Atoll";
                } else if (player2.getX() >= 2882 && player2.getY() >= 2694 && player2.getX() <= 2943
                        && player2.getY() <= 2747) {
                    location = "Crash Island";
                } else if (player2.getX() >= 3770 && player2.getY() >= 2812 && player2.getX() <= 3844
                        && player2.getY() <= 2879) {
                    location = "Harmony Island";
                } else if (player2.getX() >= 3635 && player2.getY() >= 2920 && player2.getX() <= 3866
                        && player2.getY() <= 3077) {
                    location = "Mos Le'Harmless";
                } else if (player2.getX() >= 2807 && player2.getY() >= 3218 && player2.getX() <= 2874
                        && player2.getY() <= 3312) {
                    location = "Crandor";
                } else if (player2.getX() >= 2756 && player2.getY() >= 3268 && player2.getX() <= 2800
                        && player2.getY() <= 3295) {
                    location = "Fishing Platform";
                } else if (player2.getX() >= 2800 && player2.getY() >= 3327 && player2.getX() <= 2877
                        && player2.getY() <= 3394) {
                    location = "Entrana";
                } else if (player2.getX() >= 3043 && player2.getY() >= 3060 && player2.getX() <= 3157
                        && player2.getY() <= 3134) {
                    location = "Tutorial Island";
                } else if (player2.getX() >= 2426 && player2.getY() >= 2812 && player2.getX() <= 2478
                        && player2.getY() <= 2875) {
                    location = "Myth's Guild";
                } else if (player2.getX() >= 2426 && player2.getY() >= 2812 && player2.getX() <= 2478
                        && player2.getY() <= 2875) {
                    location = "Myth's Guild";
                } else if (player2.getX() >= 2537 && player2.getY() >= 2837 && player2.getX() <= 2607
                        && player2.getY() <= 2876) {
                    location = "Corsair Cove";
                } else if (player2.getX() >= 2489 && player2.getY() >= 2877 && player2.getX() <= 2626
                        && player2.getY() <= 2948) {
                    location = "Feldip Hills Hunter";
                } else if (player2.getX() >= 2363 && player2.getY() >= 3066 && player2.getX() <= 2476
                        && player2.getY() <= 3141) {
                    location = "Castle Wars";
                } else if (player2.getX() >= 2312 && player2.getY() >= 3144 && player2.getX() <= 2362
                        && player2.getY() <= 3199) {
                    location = "Lleyta";
                } else if (player2.getX() >= 2178 && player2.getY() >= 3037 && player2.getX() <= 2223
                        && player2.getY() <= 3074) {
                    location = "Zul-Andra";
                } else if (player2.getX() >= 2256 && player2.getY() >= 3063 && player2.getX() <= 2280
                        && player2.getY() <= 3084) {
                    location = "Zulrah's Shrine";
                } else if (player2.getX() >= 2139 && player2.getY() >= 3100 && player2.getX() <= 2226
                        && player2.getY() <= 3164) {
                    location = "Tyras Camp";
                } else if (player2.getX() >= 2173 && player2.getY() >= 3230 && player2.getX() <= 2218
                        && player2.getY() <= 3265) {
                    location = "Elf Camp";
                } else if (player2.getX() >= 2174 && player2.getY() >= 3268 && player2.getX() <= 2300
                        && player2.getY() <= 3390) {
                    location = "Prifddinas";
                } else if (player2.getX() >= 2104 && player2.getY() >= 3113 && player2.getX() <= 2359
                        && player2.getY() <= 3458) {
                    location = "Elven Land";
                } else if (player2.getX() >= 2467 && player2.getY() >= 3411 && player2.getX() <= 2492
                        && player2.getY() <= 3442) {
                    location = "Gnome Agility";
                } else if (player2.getX() >= 2467 && player2.getY() >= 3411 && player2.getX() <= 2492
                        && player2.getY() <= 3442) {
                    location = "Gnome Agility";
                } else if (player2.getX() >= 2371 && player2.getY() >= 3387 && player2.getX() <= 2504
                        && player2.getY() <= 3523) {
                    location = "Tree Gnome Stronghold";
                } else if (player2.getX() >= 2527 && player2.getY() >= 3541 && player2.getX() <= 2554
                        && player2.getY() <= 3557) {
                    location = "Barbarian Agility";
                } else if (player2.getX() >= 2496 && player2.getY() >= 3531 && player2.getX() <= 2563
                        && player2.getY() <= 3592) {
                    location = "Barbarian Outpost";
                } else if (player2.getX() >= 2494 && player2.getY() >= 3462 && player2.getX() <= 2540
                        && player2.getY() <= 3535) {
                    location = "Pyre Ship/Grotto";
                } else if (player2.getX() >= 2488 && player2.getY() >= 3596 && player2.getX() <= 2591
                        && player2.getY() <= 3653) {
                    location = "Lighthouse";
                } else if (player2.getX() >= 2531 && player2.getY() >= 3070 && player2.getX() <= 2624
                        && player2.getY() <= 3111) {
                    location = "Yanille";
                } else if (player2.getX() >= 2577 && player2.getY() >= 3393 && player2.getX() <= 2624
                        && player2.getY() <= 3428) {
                    location = "Fishing Guild";
                } else if (player2.getX() >= 2605 && player2.getY() >= 3439 && player2.getX() <= 2624
                        && player2.getY() <= 3448) {
                    location = "Fishing Guild Platform";
                } else if (player2.getX() >= 2681 && player2.getY() >= 3450 && player2.getX() <= 2742
                        && player2.getY() <= 3517) {
                    location = "Seers' Village";
                } else if (player2.getX() >= 2597 && player2.getY() >= 3642 && player2.getX() <= 2695
                        && player2.getY() <= 3744) {
                    location = "Rellekka";
                } else if (player2.getX() >= 2686 && player2.getY() >= 3746 && player2.getX() <= 2749
                        && player2.getY() <= 3809) {
                    location = "Fremennik Hunter";
                } else if (player2.getX() >= 3286 && player2.getY() >= 3273 && player2.getX() <= 3313
                        && player2.getY() <= 3319) {
                    location = "Al Kharid Mine";
                } else if (player2.getX() >= 3310 && player2.getY() >= 3197 && player2.getX() <= 3402
                        && player2.getY() <= 3287) {
                    location = "Duel Arena";
                } else if (player2.getX() >= 3341 && player2.getY() >= 3122 && player2.getX() <= 3395
                        && player2.getY() <= 3181) {
                    location = "Clan Wars";
                } else if (player2.getX() >= 3293 && player2.getY() >= 3105 && player2.getX() <= 3326
                        && player2.getY() <= 3135) {
                    location = "Shantay Pass";
                } else if (player2.getX() >= 3190 && player2.getY() >= 3228 && player2.getX() <= 3196
                        && player2.getY() <= 3234) {
                    location = "Lumbridge Farm";
                } else if (player2.getX() >= 3188 && player2.getY() >= 3188 && player2.getX() <= 3254
                        && player2.getY() <= 3260) {
                    location = "Lumbridge";
                } else if (player2.getX() >= 3135 && player2.getY() >= 3135 && player2.getX() <= 3252
                        && player2.getY() <= 3213) {
                    location = "Lumbridge Swamp";
                } else if (player2.getX() >= 3253 && player2.getY() >= 3135 && player2.getX() <= 3340
                        && player2.getY() <= 3222) {
                    location = "Al Kharid";
                } else if (player2.getX() >= 3351 && player2.getY() >= 3289 && player2.getX() <= 3375
                        && player2.getY() <= 3325) {
                    location = "Mage Training Arena";
                } else if (player2.getX() >= 3091 && player2.getY() >= 3143 && player2.getX() <= 3125
                        && player2.getY() <= 3209) {
                    location = "Wizards' Tower";
                } else if (player2.getX() >= 2977 && player2.getY() >= 3102 && player2.getX() <= 3042
                        && player2.getY() <= 3190) {
                    location = "Mudskipper Point";
                } else if (player2.getX() >= 2911 && player2.getY() >= 3192 && player2.getX() <= 2997
                        && player2.getY() <= 3263) {
                    location = "Rimmington";
                } else if (player2.getX() >= 2900 && player2.getY() >= 3266 && player2.getX() <= 2944
                        && player2.getY() <= 3299) {
                    location = "Crafting Guild";
                } else if (player2.getX() >= 3004 && player2.getY() >= 3191 && player2.getX() <= 3072
                        && player2.getY() <= 3263) {
                    location = "Port Sarim";
                } else if (player2.getX() >= 3069 && player2.getY() >= 3229 && player2.getX() <= 3134
                        && player2.getY() <= 3299) {
                    location = "Draynor Village";
                } else if (player2.getX() >= 2933 && player2.getY() >= 3307 && player2.getX() <= 3066
                        && player2.getY() <= 3396) {
                    location = "Falador";
                } else if (player2.getX() >= 3012 && player2.getY() >= 3280 && player2.getX() <= 3069
                        && player2.getY() <= 3314) {
                    location = "Falador Farm";
                } else if (player2.getX() >= 2788 && player2.getY() >= 3406 && player2.getX() <= 2865
                        && player2.getY() <= 3470) {
                    location = "Catherby";
                } else if (player2.getX() >= 2831 && player2.getY() >= 3533 && player2.getX() <= 2879
                        && player2.getY() <= 3556) {
                    location = "Warriors' Guild";
                } else if (player2.getX() >= 3006 && player2.getY() >= 3438 && player2.getX() <= 3026
                        && player2.getY() <= 3455) {
                    location = "Dwarven Mine";
                } else if (player2.getX() >= 3070 && player2.getY() >= 3404 && player2.getX() <= 3105
                        && player2.getY() <= 3449) {
                    location = "Barbarian Village";
                } else if (player2.getX() >= 3135 && player2.getY() >= 3442 && player2.getX() <= 3149
                        && player2.getY() <= 3454) {
                    location = "Cooks' Guild";
                } else if (player2.getX() >= 3136 && player2.getY() >= 3466 && player2.getX() <= 3197
                        && player2.getY() <= 3518) {
                    location = "Grand Exchange";
                } else if (player2.getX() >= 3040 && player2.getY() >= 3471 && player2.getX() <= 3064
                        && player2.getY() <= 3510) {
                    location = "Edgeville Monastery";
                } else if (player2.getX() >= 3065 && player2.getY() >= 3461 && player2.getX() <= 3135
                        && player2.getY() <= 3520) {
                    location = "Edgeville";
                } else if (player2.getX() >= 3226 && player2.getY() >= 3456 && player2.getX() <= 3232
                        && player2.getY() <= 3462) {
                    location = "Varrock Farm";
                } else if (player2.getX() >= 3170 && player2.getY() >= 3359 && player2.getX() <= 3185
                        && player2.getY() <= 3380) {
                    location = "Varrock South West Mine";
                } else if (player2.getX() >= 3276 && player2.getY() >= 3354 && player2.getX() <= 3296
                        && player2.getY() <= 3371) {
                    location = "Varrock South East Mine";
                } else if (player2.getX() >= 3173 && player2.getY() >= 3373 && player2.getX() <= 3291
                        && player2.getY() <= 3508) {
                    location = "Varrock";
                } else if (player2.getX() >= 3401 && player2.getY() >= 3527 && player2.getX() <= 3454
                        && player2.getY() <= 3582) {
                    location = "Slayer Tower";
                } else if (player2.getX() >= 3466 && player2.getY() >= 3459 && player2.getX() <= 3521
                        && player2.getY() <= 3515) {
                    location = "Canifis";
                } else if (player2.getX() >= 3544 && player2.getY() >= 3266 && player2.getX() <= 3585
                        && player2.getY() <= 3317) {
                    location = "Barrows";
                } else if (player2.getX() >= 3423 && player2.getY() >= 3202 && player2.getX() <= 3469
                        && player2.getY() <= 3258) {
                    location = "Abandoned Mine";
                } else if (player2.getX() >= 2487 && player2.getY() >= 3177 && player2.getX() <= 2492
                        && player2.getY() <= 3182) {
                    location = "Tree Gnome Village Farm";
                } else if (player2.getX() >= 2485 && player2.getY() >= 3132 && player2.getX() <= 2560
                        && player2.getY() <= 3205) {
                    location = "Tree Gnome Village";
                } else if (player2.getX() >= 2561 && player2.getY() >= 3136 && player2.getX() <= 2620
                        && player2.getY() <= 3199) {
                    location = "Fight Arena";
                } else if (player2.getX() >= 2590 && player2.getY() >= 3202 && player2.getX() <= 2622
                        && player2.getY() <= 3219) {
                    location = "Ardougne Monastery";
                } else if (player2.getX() >= 2626 && player2.getY() >= 3138 && player2.getX() <= 2689
                        && player2.getY() <= 3192) {
                    location = "Port Khazard";
                } else if (player2.getX() >= 2635 && player2.getY() >= 3359 && player2.getX() <= 2640
                        && player2.getY() <= 3368) {
                    location = "Ardougne Master Farmer";
                } else if (player2.getX() >= 2615 && player2.getY() >= 3340 && player2.getX() <= 2678
                        && player2.getY() <= 3392) {
                    location = "Ardougne Farm";
                } else if (player2.getX() >= 2431 && player2.getY() >= 3262 && player2.getX() <= 2559
                        && player2.getY() <= 3336) {
                    location = "West Ardougne";
                } else if (player2.getX() >= 2560 && player2.getY() >= 3254 && player2.getX() <= 2688
                        && player2.getY() <= 3391) {
                    location = "East Ardougne";
                } else if (player2.getX() >= 2750 && player2.getY() >= 2879 && player2.getX() <= 2988
                        && player2.getY() <= 2942) {
                    location = "Kharazi Jungle";
                } else if (player2.getX() >= 2815 && player2.getY() >= 2941 && player2.getX() <= 2881
                        && player2.getY() <= 3008) {
                    location = "Shilo Village";
                } else if (player2.getX() >= 2815 && player2.getY() >= 2941 && player2.getX() <= 2881
                        && player2.getY() <= 3008) {
                    location = "Shilo Village";
                } else if (player2.getX() >= 2945 && player2.getY() >= 3014 && player2.getX() <= 3005
                        && player2.getY() <= 3070) {
                    location = "Karamja Ship Yard";
                } else if (player2.getX() >= 2752 && player2.getY() >= 2961 && player2.getX() <= 2779
                        && player2.getY() <= 2991) {
                    location = "Cairn Isle";
                } else if (player2.getX() >= 2770 && player2.getY() >= 3050 && player2.getX() <= 2820
                        && player2.getY() <= 3079) {
                    location = "Tai Bwo Wannai";
                } else if (player2.getX() >= 2818 && player2.getY() >= 3136 && player2.getX() <= 2964
                        && player2.getY() <= 3207) {
                    location = "Musa Point";
                } else if (player2.getX() >= 2639 && player2.getY() >= 3210 && player2.getX() <= 2659
                        && player2.getY() <= 3226) {
                    location = "Tower of Life";
                } else if (player2.getX() >= 2685 && player2.getY() >= 3256 && player2.getX() <= 2637
                        && player2.getY() <= 3204) {
                    location = "Ardougne Necromancer";
                } else if (player2.getX() >= 2697 && player2.getY() >= 3134 && player2.getX() <= 2817
                        && player2.getY() <= 3248) {
                    location = "Brimhaven";
                } else if (player2.getX() >= 2746 && player2.getY() >= 2880 && player2.getX() <= 2991
                        && player2.getY() <= 3137) {
                    location = "Karamja";
                } else if (player2.getX() >= 2915 && player2.getY() >= 3473 && player2.getX() <= 2935
                        && player2.getY() <= 3492) {
                    location = "Druids' Circle";
                } else if (player2.getX() >= 2927 && player2.getY() >= 3508 && player2.getX() <= 2945
                        && player2.getY() <= 3523) {
                    location = "Chaos Temple";
                } else if (player2.getX() >= 2882 && player2.getY() >= 3503 && player2.getX() <= 2903
                        && player2.getY() <= 3519) {
                    location = "Heroes' Guild";
                } else if (player2.getX() >= 2942 && player2.getY() >= 3479 && player2.getX() <= 2971
                        && player2.getY() <= 3519) {
                    location = "Goblin Village";
                } else if (player2.getX() >= 2933 && player2.getY() >= 3435 && player2.getX() <= 2939
                        && player2.getY() <= 3441) {
                    location = "Taverley Farm";
                } else if (player2.getX() >= 2874 && player2.getY() >= 3407 && player2.getX() <= 2942
                        && player2.getY() <= 3455) {
                    location = "Taverley";
                } else if (player2.getX() >= 3080 && player2.getY() >= 3328 && player2.getX() <= 3130
                        && player2.getY() <= 3389) {
                    location = "Draynor Manor";
                } else if (player2.getX() >= 2471 && player2.getY() >= 2949 && player2.getX() <= 2654
                        && player2.getY() <= 3012) {
                    location = "Feldip Hills";
                } else if (player2.getX() >= 2446 && player2.getY() >= 3013 && player2.getX() <= 2589
                        && player2.getY() <= 3069) {
                    location = "Gu'Tunoth";
                } else if (player2.getX() >= 2440 && player2.getY() >= 3212 && player2.getX() <= 2484
                        && player2.getY() <= 3260) {
                    location = "Red Salamanders";
                } else if (player2.getX() >= 2305 && player2.getY() >= 3661 && player2.getX() <= 2364
                        && player2.getY() <= 3705) {
                    location = "Piscatoris Fishing Colony";
                } else if (player2.getX() >= 2364 && player2.getY() >= 3573 && player2.getX() <= 2394
                        && player2.getY() <= 3620) {
                    location = "Piscatoris Falconer";
                } else if (player2.getX() >= 2302 && player2.getY() >= 3458 && player2.getX() <= 2367
                        && player2.getY() <= 3513) {
                    location = "Eagles' Peak";
                } else if (player2.getX() >= 2259 && player2.getY() >= 3460 && player2.getX() <= 2405
                        && player2.getY() <= 3665) {
                    location = "Piscatoris";
                } else if (player2.getX() >= 2717 && player2.getY() >= 3350 && player2.getX() <= 2739
                        && player2.getY() <= 3387) {
                    location = "Legends' Guild";
                } else if (player2.getX() >= 2840 && player2.getY() >= 3573 && player2.getX() <= 2886
                        && player2.getY() <= 3610) {
                    location = "Death Plateau";
                } else if (player2.getX() >= 2906 && player2.getY() >= 3733 && player2.getX() <= 2933
                        && player2.getY() <= 3758) {
                    location = "God Wars";
                } else if (player2.getX() >= 3182 && player2.getY() >= 3351 && player2.getX() <= 3199
                        && player2.getY() <= 3365) {
                    location = "Champions' Guild";
                } else if (player2.getX() >= 3460 && player2.getY() >= 3257 && player2.getX() <= 3525
                        && player2.getY() <= 3313) {
                    location = "Mort'ton";
                } else if (player2.getX() >= 3473 && player2.getY() >= 3161 && player2.getX() <= 3538
                        && player2.getY() <= 3245) {
                    location = "Burgh de Rott";
                } else if (player2.getX() >= 3530 && player2.getY() >= 3426 && player2.getX() <= 3580
                        && player2.getY() <= 3453) {
                    location = "Swamp Lizards";
                } else if (player2.getX() >= 3650 && player2.getY() >= 3509 && player2.getX() <= 3669
                        && player2.getY() <= 3528) {
                    location = "Ectofuntus";
                } else if (player2.getX() >= 3582 && player2.getY() >= 3513 && player2.getX() <= 3637
                        && player2.getY() <= 3546) {
                    location = "Phasmatys Farm";
                } else if (player2.getX() >= 3648 && player2.getY() >= 3452 && player2.getX() <= 3712
                        && player2.getY() <= 3547) {
                    location = "Port Phasmatys";
                } else if (player2.getX() >= 3140 && player2.getY() >= 2956 && player2.getX() <= 3198
                        && player2.getY() <= 3000) {
                    location = "Bandit Camp";
                } else if (player2.getX() >= 3143 && player2.getY() >= 3016 && player2.getX() <= 3196
                        && player2.getY() <= 3060) {
                    location = "Bedabin Camp";
                } else if (player2.getX() >= 3390 && player2.getY() >= 3073 && player2.getX() <= 3419
                        && player2.getY() <= 3131) {
                    location = "Desert Hunter";
                } else if (player2.getX() >= 3768 && player2.getY() >= 3514 && player2.getX() <= 3846
                        && player2.getY() <= 3581) {
                    location = "Dragontooth Island";
                } else if (player2.getX() >= 3628 && player2.getY() >= 3690 && player2.getX() <= 3858
                        && player2.getY() <= 3913) {
                    location = "Fossil Island";
                } else if (player2.getX() >= 2753 && player2.getY() >= 3648 && player2.getX() <= 2863
                        && player2.getY() <= 3706) {
                    location = "Troll Stronghold";
                } else if (player2.getX() >= 2864 && player2.getY() >= 3648 && player2.getX() <= 2921
                        && player2.getY() <= 3706) {
                    location = "Trollheim";
                } else if (player2.getController().inWilderness()) {
                    location = "Wilderness";
                } else if (player2.getController().inPvPWorld()) {
                    location = "PvP World";
                } else if (player2.getX() >= 1137 && player2.getY() >= 2491 && player2.getX() <= 3905
                        && player2.getY() <= 4163) {
                    location = "Mainland";
                } else if (player2.getX() >= 2368 && player2.getY() >= 5055 && player2.getX() <= 2429
                        && player2.getY() <= 5119) {
                    location = "Fight Cave";
                } else if (player2.getX() >= 2373 && player2.getY() >= 5127 && player2.getX() <= 2422
                        && player2.getY() <= 5175) {
                    location = "Fight Pit";
                } else if (player2.getX() >= 2368 && player2.getY() >= 5058 && player2.getX() <= 2557
                        && player2.getY() <= 5183) {
                    location = "TzHaar";
                } else if (player2.getX() >= 1721 && player2.getY() >= 5122 && player2.getX() <= 1799
                        && player2.getY() <= 5254) {
                    location = "Mole Lair";
                } else if (player2.getX() >= 1602 && player2.getY() >= 5311 && player2.getX() <= 1801
                        && player2.getY() <= 5382) {
                    location = "Ancient Cavern";
                } else if (player2.getX() >= 2245 && player2.getY() >= 5315 && player2.getX() <= 2298
                        && player2.getY() <= 5374) {
                    location = "The Inferno";
                } else if (player2.getX() >= 3006 && player2.getY() >= 5565 && player2.getX() <= 3074
                        && player2.getY() <= 5636) {
                    location = "Ourania Cave";
                } else if (player2.getX() >= 2823 && player2.getY() >= 9541 && player2.getX() <= 2870
                        && player2.getY() <= 9601) {
                    location = "Karamja Dungeon";
                } else if (player2.getX() >= 2825 && player2.getY() >= 9602 && player2.getX() <= 2868
                        && player2.getY() <= 9662) {
                    location = "Crandor Dungeon";
                } else if (player2.getX() >= 2981 && player2.getY() >= 9535 && player2.getX() <= 3084
                        && player2.getY() <= 9606) {
                    location = "Asgarnian Ice Dungeon";
                } else if (player2.getX() >= 2528 && player2.getY() >= 9860 && player2.getX() <= 2614
                        && player2.getY() <= 9923) {
                    location = "Waterfall Dungeon";
                } else if (player2.getX() >= 2233 && player2.getY() >= 9978 && player2.getX() <= 2311
                        && player2.getY() <= 10052) {
                    location = "Kraken Cove";
                } else if (player2.getX() >= 2883 && player2.getY() >= 9880 && player2.getX() <= 2945
                        && player2.getY() <= 9920) {
                    location = "Heroes' Guild Dungeon";
                } else if (player2.getX() >= 2812 && player2.getY() >= 9896 && player2.getX() <= 2897
                        && player2.getY() <= 9980) {
                    location = "Ice Queen's Dungeon";
                } else if (player2.getX() >= 2689 && player2.getY() >= 9951 && player2.getX() <= 2813
                        && player2.getY() <= 10045) {
                    location = "Fremennik Slayer Dungeon";
                } else if (player2.getX() >= 2431 && player2.getY() >= 10109 && player2.getX() <= 2561
                        && player2.getY() <= 10179) {
                    location = "Waterbirth Dungeon";
                } else if (player2.getX() >= 2812 && player2.getY() >= 9670 && player2.getX() <= 2970
                        && player2.getY() <= 9855) {
                    location = "Taverley Dungeon";
                } else if (player2.getX() >= 3200 && player2.getY() >= 9344 && player2.getX() <= 3330
                        && player2.getY() <= 9407) {
                    location = "Smoke Dungeon";
                } else if (player2.getX() >= 3523 && player2.getY() >= 9665 && player2.getX() <= 3580
                        && player2.getY() <= 9727) {
                    location = "Barrows Dungeon";
                } else if (player2.getX() >= 2625 && player2.getY() >= 9409 && player2.getX() <= 2753
                        && player2.getY() <= 9599) {
                    location = "Brimhaven Dungeon";
                } else if (player2.getX() >= 2495 && player2.getY() >= 9981 && player2.getX() <= 2546
                        && player2.getY() <= 10045) {
                    location = "Lighthouse Dungeon";
                } else if (player2.getX() >= 1588 && player2.getY() >= 9973 && player2.getX() <= 1749
                        && player2.getY() <= 10117) {
                    location = "Catacombs of Kourend";
                } else if (player2.getX() >= 1401 && player2.getY() >= 10047 && player2.getX() <= 1475
                        && player2.getY() <= 10111) {
                    location = "Chasm of Fire";
                } else if (player2.getX() >= 3579 && player2.getY() >= 10174 && player2.getX() <= 3655
                        && player2.getY() <= 10310) {
                    location = "Fossil Island Wyverns";
                } else if (player2.getX() >= 3254 && player2.getY() >= 5120 && player2.getX() <= 3374
                        && player2.getY() <= 5482) {
                    location = "Chambers of Xeric";
                } else if (player2.getX() >= 3010 && player2.getY() >= 9697 && player2.getX() <= 3057
                        && player2.getY() <= 9756) {
                    location = "Mining Guild";
                } else if (player2.getX() >= 2971 && player2.getY() >= 9757 && player2.getX() <= 3061
                        && player2.getY() <= 9854) {
                    location = "Dwarvern Mine Dungeon";
                } else if (player2.getX() >= 2881 && player2.getY() >= 4802 && player2.getX() <= 2940
                        && player2.getY() <= 4862) {
                    location = "Rune Essence Mine";
                }
                lines.add(title + username + ": on: " + Time.ticksToLongDuration(player2.getTotalTicks())
                        + ", map: " + Time.ticksToLongDuration(player2.getLastMapUpdate())
                        + ", idle: " + Time.ticksToLongDuration(player2.getIdleTime()) + ", loc: " + location);
            }
            Dialogue.openScroll(player, "Game Modes Online", Utils.toStringArray(lines));
        }
    }

    adminCommand = function(player, command) {
        var split = command.split(" ");
        var action = split[0];
        if (action.equals("fkick")) {
            if (command.length() <= 6) {
                player.getGameEncoder().sendMessage("Please use as ::fkick username");
                return;
            }
            var username = command.substring(6);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            }
            player2.getGameEncoder().sendMessage(player.getUsername() + " has kicked you.");
            player2.getGameEncoder().sendLogout();
            player2.setVisible(false);
            player.getGameEncoder().sendMessage(username + " has been kicked.");
        } else if (action.equals("tohcim")) {
            var username = command.substring(7);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            }
            player2.setGameMode(RSPlayer.GAME_MODE_HARDCORE_IRONMAN);
            player.getGameEncoder().sendMessage("Success");
        } else if (action.equals("tonormal")) {
            var username = command.substring(9);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            }
            player2.setGameMode(RSPlayer.GAME_MODE_NORMAL);
            player.getGameEncoder().sendMessage("Success");
        } else if (action.equals("tohard")) {
            var username = command.substring(7);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            }
            player2.setGameMode(RSPlayer.GAME_MODE_HARD);
            player.getGameEncoder().sendMessage("Success");
        } else if (action.equals("rslayer")) {
            var username = command.substring(8);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            }
            player2.getSlayer().setTaskAmount(0);
            player.getGameEncoder().sendMessage("Success");
        } else if (action.equals("rwildslayer")) {
            var username = command.substring(12);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            }
            player2.getSlayer().setWildernessTaskAmount(0);
            player.getGameEncoder().sendMessage("Success");
        } else if (action.equals("groupiron")) {
            var username = command.substring(10);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            }
            player2.putAttribute("can_change_group", true);
            player.getGameEncoder().sendMessage("Success");
        } else if (action.equals("removepenalty")) {
            var username = command.substring(14);
            var player2 = player.getWorld().getPlayerByUsername(username);
            if (player2 == null) {
                player.getGameEncoder().sendMessage("Unable to find user " + username + ".");
                return;
            }
            for (var i = 0; i < player2.getSkills().getCombatLevelsAchieved().length; i++) {
                player2.getSkills().getCombatLevelsAchieved()[i] = player2.getSkills().getLevelForXP(i);
            }
            player.getGameEncoder().sendMessage("Success");
        } else if (action.equals("broadcast")) {
            var message = command.substring(10);
            var img = "";
            if (player.getRights() > 0 && player.getRights() < 3) {
                img = "<img=" + (player.getRights() - 1) + ">";
            }
            player.getWorld().sendBroadcast(img + player.getUsername() + ": " + message);
        } else if (action.equals("skull")) {
            player.getAppearance().setSkullIcon(Integer.parseInt(split[1]));
        } else if (action.equals("prayer")) {
            player.getAppearance().setPrayerIcon(Integer.parseInt(split[1]));
        } else if (action.equals("pnpc")) {
            var id = Integer.parseInt(split[1]);
            player.getAppearance().setNpcID(id);
            if (id != -1 && NPCDef.getNPCDef(id) != null) {
                var animations = NPCDef.getNPCDef(id).getStanceAnimations();
                player.getGameEncoder().sendMessage("Anim: " + animations[0]);
            }
        } else if (action.equals("tele")) {
            try {
                if (split.length == 2) {
                    var id = Integer.parseInt(split[1]);
                    player.getMovement().teleport(Tile.getAbsRegionX(id) + 32, Tile.getAbsRegionY(id) + 32);
                    return;
                }
                var x = Integer.parseInt(split[1]);
                var y = Integer.parseInt(split[2]);
                var z = 0;
                if (split.length == 4) {
                    z = Integer.parseInt(split[3]);
                }
                player.getMovement().teleport(x, y, z);
            } catch (e) { }
        } else if (action.equals("anim")) {
            var id = Integer.parseInt(split[1]);
            player.setAnimation(id);
        } else if (action.equals("animloop")) {
            var id = Integer.parseInt(split[1]);
            var reset = false;
            var event = new Event(1) {
                execute: function() {
                    if (reset) {
                        reset = false;
                        player.setAnimation(-1);
                        event.super$setTick(0);
                    } else {
                        reset = true;
                        player.getGameEncoder().sendMessage("Anim: " + id);
                        player.setAnimation(id++);
                        event.super$setTick(1);
                    }
                }
            };
            player.setAction(event);
        } else if (action.equals("objanim")) {
            var id = Integer.parseInt(split[1]);
            if (split.length == 3) {
                var type = 10;
                var direction = 0;
                var animationID = Integer.parseInt(split[2]);
            } else {
                var type = Integer.parseInt(split[2]);
                var direction = Integer.parseInt(split[3]);
                var animationID = Integer.parseInt(split[4]);
            }
            var mapObject = new MapObject(id, player.getX(), player.getY(), player.getHeight(), type, direction);
            player.getGameEncoder().sendMapObjectAnimation(mapObject, animationID);
        } else if (action.equals("objanimloop")) {
            var id = Integer.parseInt(split[1]);
            if (split.length == 3) {
                var type = 10;
                var direction = 0;
                var animationID = Integer.parseInt(split[2]);
            } else {
                var type = Integer.parseInt(split[2]);
                var direction = Integer.parseInt(split[3]);
                var animationID = Integer.parseInt(split[4]);
            }
            var mapObject = new MapObject(id, player.getX(), player.getY(), player.getHeight(), type, direction);
            var event = new Event(2) {
                execute: function() {
                    player.getGameEncoder().sendMessage("Anim: " + animationID);
                    player.getGameEncoder().sendMapObjectAnimation(mapObject, animationID++);
                }
            };
            player.setAction(event);
        } else if (action.equals("gfx")) {
            var id = Integer.parseInt(split[1]);
            var height = 0;
            if (split.length > 2) {
                height = Integer.parseInt(split[2]);
            }
            player.setGraphic(id, height);
        } else if (action.equals("gfxloop")) {
            var id = Integer.parseInt(split[1]);
            var reset = false;
            var event = new Event(1) {
                execute: function() {
                    if (reset) {
                        reset = false;
                        player.setGraphic(-1);
                        event.super$setTick(0);
                    } else {
                        reset = true;
                        player.getGameEncoder().sendMessage("GFX: " + id);
                        player.setGraphic(id++, 20);
                        event.super$setTick(1);
                    }
                }
            };
            player.setAction(event);
        } else if (action.equals("projloop")) {
            var id = Integer.parseInt(split[1]);
            var event = new Event(2) {
                execute: function() {
                    player.getGameEncoder().sendMessage("Projectile: " + id);
                    player.getController().sendMapGraphic(new Tile(player).moveY(-1), id, 20, 0);
                    player.getController().sendMapProjectile(null, new Tile(player).moveY(-2),
                            new Tile(player).moveY(-1), id++, 255, 1, 0, 70, 0, 0);
                }
            };
            player.setAction(event);
        } else if (action.equals("proj")) {
            var id = Integer.parseInt(split[1]);
            player.getController().sendMapProjectile(null, new Tile(player).moveY(1), player,
                    id, 128, 1, 0, 70, 0, 0);
        } else if (action.equals("raids")) {
            for each (var player2 in player.getWorld().getPlayers()) {
                if (player2.getController().getVariable("raid_instance") !== true) {
                    continue;
                }
                player.getGameEncoder().sendMessage(player2.getUsername() + ": "
                        + Time.ticksToDuration(player2.getController().getVariable("time")));
            }
        } else if (action.equals("restore")) {
            player.restore();
        } else if (action.equals("hp")) {
            player.setHitpoints(999999999);
        } else if (action.equals("super")) {
            player.getMovement().setEnergy(999999999);
            player.setHitpoints(999999999);
            player.getPrayer().setPoints(999999999);
            for (var i = 0; i <= 6; i++) {
                player.getSkills().setLevel(i, 255);
                player.getGameEncoder().sendSkillLevel(i);
            }
        } else if (action.equals("god")) {
            player.getMovement().setEnergy(999999999);
            player.setHitpoints(999999999);
            player.getPrayer().setPoints(999999999);
            for (var i = 0; i <= 6; i++) {
                player.getSkills().setLevel(i, 999999999);
                player.getGameEncoder().sendSkillLevel(i);
            }
        }
    }

    paliCommand = function(player, command) {
        var Boolean = Java.type("java.lang.Boolean");
        var split = command.split(" ");
        var action = split[0];
        if (action.equals("noclip")) {
            var value = Boolean.parseBoolean(split[1]);
            player.getMovement().setNoclip(value);
        } else if (action.equals("varbit")) {
            var id = Integer.parseInt(split[1]);
            var value = Integer.parseInt(split[2]);
            player.getGameEncoder().setVarbit(id, value);
        } else if (action.equals("config")) {
            var id = Integer.parseInt(split[1]);
            var value = Integer.parseInt(split[2]);
            player.getGameEncoder().setVarp(id, value);
        } else if (action.equals("configloop")) {
            var start = Integer.parseInt(split[1]);
            var end = Integer.parseInt(split[2]);
            var value = Integer.parseInt(split[3]);
            for (var i = start; i < end; i++) {
                player.getGameEncoder().setVarp(i, value);
            }
        } else if (action.equals("configloop2")) {
            var id = Integer.parseInt(split[1]);
            var value = Integer.parseInt(split[2]);
            var jump = Integer.parseInt(split[3]);
            var event = new Event(0) {
                execute: function() {
                    player.getGameEncoder().sendMessage("Config " + id + ": " + value);
                    player.getGameEncoder().setVarp(id, value += jump);
                }
            };
            player.setAction(event);
        } else if (action.equals("configloop3")) {
            var id = Integer.parseInt(split[1]);
            var value = 0;
            var event = new Event(0) {
                execute: function() {
                    player.getGameEncoder().sendMessage("Config " + id + ": " + value);
                    player.getGameEncoder().setVarp(id, value);
                    if (value < 2) {
                        value++;
                    } else {
                        value *= 2;
                    }
                }
            };
            player.setAction(event);
        } else if (action.equals("hidechild")) {
            var i = Integer.parseInt(split[1]);
            var c = Integer.parseInt(split[2]);
            var b = Boolean.parseBoolean(split[3]);
            player.getGameEncoder().sendHideWidget(i, c, b);
        } else if (action.equals("hidechildloop")) {
            var i = Integer.parseInt(split[1]);
            var start = Integer.parseInt(split[2]);
            var end = Integer.parseInt(split[3]);
            var b = Boolean.parseBoolean(split[4]);
            for (var c = start; c < end; c++) {
                player.getGameEncoder().sendHideWidget(i, c, b);
            }
        } else if (action.equals("stringloop")) {
            var id = Integer.parseInt(split[1]);
            var start = Integer.parseInt(split[2]);
            var end = Integer.parseInt(split[3]);
            for (var i = start; i < end; i++) {
                player.getGameEncoder().sendWidgetText(id, i, "(" + i + ")");
            }
        } else if (action.equals("substringloop")) {
            var id = Integer.parseInt(split[1]);
            var id2 = Integer.parseInt(split[2]);
            var start = Integer.parseInt(split[3]);
            var end = Integer.parseInt(split[4]);
            for (var i = start; i < end; i++) {
                player.getGameEncoder().sendWidgetText(id, id2, i, "(" + i + ")");
            }
        } else if (action.equals("interface")) {
            var id = Integer.parseInt(split[1]);
            player.getWidgetManager().sendInteractiveOverlay(id);
        } else if (action.equals("overlay")) {
            var id = Integer.parseInt(split[1]);
            player.getWidgetManager().sendOverlay(id);
        } else if (action.equals("overlayfull")) {
            var id = Integer.parseInt(split[1]);
            player.getWidgetManager().sendFullOverlay(id);
        } else if (action.equals("inventory")) {
            var id = Integer.parseInt(split[1]);
            player.getWidgetManager().sendInventoryOverlay(id);
        } else if (action.equals("quest")) {
            var id = Integer.parseInt(split[1]);
            player.getWidgetManager().sendWidget(WidgetChild.ViewportContainer.QUEST, id);
        } else if (action.equals("shop")) {
            player.openShop(split[1]);
        } else if (action.equals("objtype")) {
            var type = Integer.parseInt(split[1]);
            player.getGameEncoder().sendMessage("" + player.getController().getMapObjectByType(type, player));
        } else if (action.equals("objloop")) {
            var id = Integer.parseInt(split[1]);
            var type = Integer.parseInt(split[2]);
            var event = new Event(1) {
                execute: function() {
                    player.getGameEncoder().sendMessage("ID: " + id);
                    var object = new MapObject(id++, player.getX(), player.getY(), player.getHeight(), type, 0);
                    player.getGameEncoder().sendMapObject(object);
                }
            };
            player.setAction(event);
        } else if (action.equals("interfaceloop2")) {
            for (var i = 0; i < 629; i++) {
                if (i == WidgetID.FIXED_VIEWPORT || i == WidgetID.RESIZABLE_BOX_VIEWPORT
                        || i == WidgetID.RESIZABLE_LINE_VIEWPORT || i == WidgetID.VIEWPORT_CONTAINER
                        || i == WidgetID.CHATBOX || i == WidgetID.MINIMAP_ORBS) {
                    continue;
                }
                player.getWidgetManager().sendInteractiveOverlay(i);
            }
        } else if (action.equals("interfaceloop")) {
            var id = Integer.parseInt(split[1]);
            var event = new Event(0) {
                execute: function() {
                    if (id == WidgetID.FIXED_VIEWPORT || id == WidgetID.RESIZABLE_BOX_VIEWPORT
                            || id == WidgetID.RESIZABLE_LINE_VIEWPORT || id == WidgetID.VIEWPORT_CONTAINER
                            || id == WidgetID.CHATBOX || id == WidgetID.MINIMAP_ORBS
                            || id >= 629) {
                        id++;
                        return;
                    }
                    player.getGameEncoder().sendMessage("Interface: " + id);
                    player.getWidgetManager().sendInteractiveOverlay(id++);
                }
            };
            player.setAction(event);
        } else if (action.equals("dialogue")) {
            var name = split[1];
            var index = Integer.parseInt(split[2]);
            player.openDialogue(name, index);
        } else if (action.equals("npc")) {
            var id = Integer.parseInt(split[1]);
            var npc = new Npc(player.getController(), id, player.getX(), player.getY(), player.getHeight());
        } else if (action.equals("snpc")) {
            var id = -1;
            if (split.length == 1) {
                return;
            }
            if (split[1].matches("[0-9]+")) {
                id = Integer.parseInt(split[1]);
            } else {
                id = NpcID.valueOf(split[1].toUpperCase());
            }
            var distance = 0;
            if (split.length > 2) {
                distance = Integer.parseInt(split[2]);
            }
            var direction = Tile.SOUTH;
            if (split.length > 3) {
                var dirString = split[3];
                if (dirString.equals("north")) {
                    direction = Tile.NORTH;
                } else if (dirString.equals("south")) {
                    direction = Tile.SOUTH;
                } else if (dirString.equals("east")) {
                    direction = Tile.EAST;
                } else if (dirString.equals("west")) {
                    direction = Tile.WEST;
                } else if (dirString.equals("north-east")) {
                    direction = Tile.NORTH_EAST;
                } else if (dirString.equals("north-west")) {
                    direction = Tile.NORTH_WEST;
                } else if (dirString.equals("south-east")) {
                    direction = Tile.SOUTH_EAST;
                } else if (dirString.equals("south-west")) {
                    direction = Tile.SOUTH_WEST;
                }
            }
            var npc = new Npc(player.getController(), id, player.getX(), player.getY(), player.getHeight());
            var lines = new ArrayList();
            if (!FileManager.fileExists("./npcs.json")) {
                lines.add("[");
            }
            lines.add("  {");
            lines.add("    \"id\": \"NpcID." + NpcID.valueOf(id) + "\",");
            if (distance > 0) {
                lines.add("    \"moveDistance\": " + distance + ",");
            } else {
                lines.add("    \"direction\": " + direction + ",");
            }
            lines.add("    \"x\": " + player.getX() + ",");
            if (player.getHeight() > 0) {
                lines.add("    \"y\": " + player.getY() + ",");
                lines.add("    \"height\": " + player.getHeight());
            } else {
                lines.add("    \"y\": " + player.getY());
            }
            lines.add("  },");
            FileManager.appendTextFile("./npcs.json", Utils.toStringArray(lines));
            player.getGameEncoder().sendMessage("Spawned & saved " + npc.getDef().getName());
        } else if (action.equals("obj")) {
            var id = Integer.parseInt(split[1]);
            var type = Integer.parseInt(split[2]);
            var direction = Integer.parseInt(split[3]);
            var object = new MapObject(id, player.getX(), player.getY(), player.getHeight(), type, direction);
            player.getGameEncoder().sendMapObject(object);
        } else if (action.equals("addobj")) {
            var id = Integer.parseInt(split[1]);
            var type = Integer.parseInt(split[2]);
            var direction = Integer.parseInt(split[3]);
            var object = new MapObject(id, player.getX(), player.getY(), player.getHeight(), type, direction);
            player.getController().addMapObject(object);
        } else if (action.equals("jewel1")) {
            player.getGameEncoder().sendScript(917, -1, -1);
            player.getWidgetManager().sendInteractiveOverlay(WidgetID.JEWELRY_BOX);
            player.getGameEncoder().sendScript(1685, 2, "Ornate Jewellery Box", 3);
            player.getGameEncoder().sendWidgetSettings(WidgetID.JEWELRY_BOX, 0, 1, 0, 24);
        } else if (action.equals("script1")) {
            var id = Integer.parseInt(split[1]);
            var entry = Integer.parseInt(split[2]);
            player.getGameEncoder().sendScript(id, entry);
        } else if (action.equals("shoptest")) {
            var id = Integer.parseInt(split[1]);
            player.getWidgetManager().sendInteractiveOverlay(WidgetID.SHOP);
            player.getGameEncoder().sendScript(1074, 0, -1, "Test", id);
            var items = [
                new Item(4151, 1), new Item(4151, 1), new Item(4151, 1), new Item(4151, 1), new Item(4151, 1),
                new Item(4151, 1), new Item(4151, 1), new Item(4151, 1), new Item(4151, 1), new Item(4151, 1)
            ];
            player.getGameEncoder().sendItems(-1238, 4, items);
        } else if (action.equals("script3")) {
            var id = Integer.parseInt(split[1]);
            var entry = Integer.parseInt(split[2]);
            player.getGameEncoder().sendScript(id, entry, "test");
        } else if (action.equals("loadouts")) {
            player.getLoadout().openSelection();
        } else if (action.equals("scriptloop1")) {
            var start = Integer.parseInt(split[1]);
            var end = Integer.parseInt(split[2]);
            for (var i = start; i < end; i++) {
                player.getGameEncoder().sendScript(i, "" + i, "" + i);
            }
        } else if (action.equals("scriptloop2")) {
            var start = Integer.parseInt(split[1]);
            var end = Integer.parseInt(split[2]);
            for (var i = start; i < end; i++) {
                player.getGameEncoder().sendScript(i, "" + i, "" + i, "" + i);
            }
        } else if (action.equals("scriptloop3")) {
            var start = Integer.parseInt(split[1]);
            var end = Integer.parseInt(split[2]);
            for (var i = start; i < end; i++) {
                player.getGameEncoder().sendScript(i, 1, "" + i, "" + i);
            }
        } else if (action.equals("scriptloop4")) {
            var start = Integer.parseInt(split[1]);
            var end = Integer.parseInt(split[2]);
            for (var i = start; i < end; i++) {
                player.getGameEncoder().sendScript(i, "" + i, "" + i, 1);
            }
        } else if (action.equals("scriptloop5")) {
            var start = Integer.parseInt(split[1]);
            var end = Integer.parseInt(split[2]);
            for (var i = start; i < end; i++) {
                player.getGameEncoder().sendScript(i, 10, 10, 10, 10, 10, 10);
            }
        } else if (action.equals("scriptloop6")) {
            var start = Integer.parseInt(split[1]);
            var end = Integer.parseInt(split[2]);
            for (var i = start; i < end; i++) {
                player.getGameEncoder().sendScript(i, 10, 10);
            }
        } else if (action.equals("farm")) {
            player.getFarming().openGeomancy();
        } else if (action.equals("tt1")) {
            player.getGameEncoder().sendScript(417, 0, 0, 0, "Test");
        } else if (action.equals("tt2")) {
            player.getGameEncoder().sendScript(417, "Test", 0, 0, 0);
        } else if (action.equals("tt3")) {
            player.getGameEncoder().sendScript(417, 1, 1, 1, "Test");
        } else if (action.equals("tt4")) {
            player.getGameEncoder().sendScript(417, "Test", 1, 1, 1);
        } else if (action.equals("accessmask")) {
            var interfaceID = Integer.parseInt(split[1]);
            var childID = Integer.parseInt(split[2]);
            var type = Integer.parseInt(split[3]);
            player.getGameEncoder().sendWidgetSettings(interfaceID, childID, type, 0, 800);
        } else if (action.equals("accessmasks")) {
            var interfaceID = Integer.parseInt(split[1]);
            var type = Integer.parseInt(split[2]);
            for (var i = 0; i < 50; i++) {
                player.getGameEncoder().sendWidgetSettings(interfaceID, i, 0, 400, type);
            }
        } else if (action.equals("slayerreset")) {
            player.getSlayer().setTaskAmount(0);
        } else if (action.equals("slayerpoints")) {
            player.getSlayer().setPoints(10000);
        } else if (action.equals("reloadshops")) {
            Shop.init();
        } else if (action.equals("resetxp")) {
            var id = Integer.parseInt(split[1]);
            player.getSkills().setXP(id, 0);
            player.getGameEncoder().sendSkillLevel(id);
        } else if (action.equals("itemmodel")) {
            var interfaceID = Integer.parseInt(split[1]);
            var childID = Integer.parseInt(split[2]);
            var modelID = Integer.parseInt(split[3]);
            var zoom = Integer.parseInt(split[4]);
            player.getGameEncoder().sendWidgetItemModel(interfaceID, childID, modelID, zoom);
        } else if (action.equals("itemmodelloop")) {
            var interfaceID = Integer.parseInt(split[1]);
            var startID = Integer.parseInt(split[2]);
            var endID = Integer.parseInt(split[3]);
            for (var i = startID; i < endID; i++) {
                var itemID = i;
                if (ItemDef.getNoted(itemID)) {
                    itemID++;
                }
                player.getGameEncoder().sendWidgetItemModel(interfaceID, i, itemID, 100);
            }
        } else if (action.equals("senditem")) {
            var i = Integer.parseInt(split[1]);
            var i2 = Integer.parseInt(split[2]);
            var items = [ new Item(Utils.randomI(8000), Utils.randomI(8000)) ];
            player.getGameEncoder().sendItems(i, i2, items);
        } else if (action.equals("message")) { // 5 pm? 14 broadcast
            var id = Integer.parseInt(split[1]);
            var event = new Event(1) {
                execute: function() {
                    player.getGameEncoder().sendMessage("Test: " + id, id++, "test");
                }
            };
            player.setAction(event);
        } else if (action.equals("senditems")) {
            var i = Integer.parseInt(split[1]);
            var i2 = Integer.parseInt(split[2]);
            var i3 = Integer.parseInt(split[3]);
            for (var i4 = i2; i4 < i3; i4++) {
                for (var i5 = 0; i5 < 100; i5++) {
                    var items = [ new Item(i4, i5) ];
                    player.getGameEncoder().sendItems(i, i4, i5, items);
                }
            }
        } else if (action.equals("senditemshash")) {
            var hash = Integer.parseInt(split[1]);
            var event = new Event(0) {
                execute: function() {
                    for (var i = hash; i > hash - 25; i--) {
                        if ((event.getExecutions() % 6) == 0) {
                            for (var i2 = 400; i2 < 600; i2++) {
                                var items = [ new Item(i2, -hash) ];
                                player.getGameEncoder().sendItems(hash, i2, items);
                            }
                        } else if ((event.getExecutions() % 4) == 0) {
                            for (var i2 = 200; i2 < 400; i2++) {
                                var items = [ new Item(i2, -hash) ];
                                player.getGameEncoder().sendItems(hash, i2, items);
                            }
                        } else if ((event.getExecutions() % 2) == 0) {
                            for (var i2 = 0; i2 < 200; i2++) {
                                var items = [ new Item(i2, -hash) ];
                                player.getGameEncoder().sendItems(hash, i2, items);
                            }
                        }
                    }
                    if ((event.getExecutions() % 6) == 0) {
                        player.getGameEncoder().sendMessage("Hash: " + hash);
                        hash -= 25;
                    }
                }
            };
            player.setAction(event);
        } else if (action.equals("spec")) {
            player.getCombat().setSpecialAttackAmount(PCombat.MAX_SPECIAL_ATTACK);
        } else if (action.equals("cw")) {
            player.getClanWars().getTournament().resetMode();
        } else if (action.equals("test")) {
            player.getGameEncoder().sendScript(452, "LIBAMIEL");
            player.getGameEncoder().sendWidgetText(239, 6, "Welcome to the Theatre");
            player.getGameEncoder().sendWidgetText(239, 6, "Welcome to the Theatre");
            player.getGameEncoder().sendWidget(WidgetID.FIXED_VIEWPORT, 14,
                    WidgetID.THEATER_OF_BLOOD_OVERLAY, false);
            player.getWidgetManager().sendFullOverlay(WidgetID.THEATER_OF_BLOOD_OVERLAY);
            player.getGameEncoder().sendScript(2306, "", 0, 200);
            player.getGameEncoder().sendWidgetText(WidgetID.THEATER_OF_BLOOD_OVERLAY, 9, "-<br>-<br>-<br>-<br>-");
            player.getGameEncoder().sendScript(2524, -1, -1);
            player.getGameEncoder().sendScript(2340, "", 0);
            player.getGameEncoder().sendScript(2340, "", 1);
            player.getGameEncoder().sendScript(2340, "", 2);
            player.getGameEncoder().sendScript(2340, "", 3);
            player.getGameEncoder().sendScript(2340, "", 4);
            player.getGameEncoder().sendScript(2340, "", 5);
            player.getGameEncoder().sendScript(2340, "", 6);
            player.getGameEncoder().sendScript(2340, "", 7);
            player.getGameEncoder().sendScript(2340, "", 8);
            player.getGameEncoder().sendScript(2340, "", 9);
            player.getGameEncoder().sendScript(2340, "", 10);
            player.getGameEncoder().sendScript(2340, "", 11);
            player.getGameEncoder().sendScript(2340, "", 12);
            player.getGameEncoder().sendScript(2340, "", 13);
            player.getGameEncoder().sendScript(2340, "", 14);
            player.getGameEncoder().sendScript(2340, "", 15);
            player.getGameEncoder().sendScript(2340, "", 16);
            player.getGameEncoder().sendScript(2340, "", 17);
            player.getGameEncoder().sendScript(2340, "", 18);
            player.getGameEncoder().sendScript(2340, "", 19);
            player.getGameEncoder().sendScript(2340, "", 20);
            player.getGameEncoder().sendScript(2340, "", 21);
            player.getGameEncoder().sendScript(2340, "", 22);
            player.getGameEncoder().sendScript(2340, "", 23);
            player.getGameEncoder().sendScript(2340, "", 24);
            player.getGameEncoder().sendScript(2340, "", 25);
            player.getGameEncoder().sendScript(2340, "", 26);
            player.getGameEncoder().sendScript(2340, "", 27);
            player.getGameEncoder().sendScript(2340, "", 28);
            player.getGameEncoder().sendScript(2340, "", 29);
            player.getGameEncoder().sendScript(2340, "", 30);
            player.getGameEncoder().sendScript(2340, "", 31);
            player.getGameEncoder().sendScript(2340, "", 32);
            player.getGameEncoder().sendScript(2340, "", 33);
            player.getGameEncoder().sendScript(2340, "", 34);
            player.getGameEncoder().sendScript(2340, "", 35);
            player.getGameEncoder().sendScript(2340, "", 36);
            player.getGameEncoder().sendScript(2340, "", 37);
            player.getGameEncoder().sendScript(2340, "", 38);
            player.getGameEncoder().sendScript(2340, "", 39);
            player.getGameEncoder().sendScript(2340, "", 40);
            player.getGameEncoder().sendScript(2340, "", 41);
            player.getGameEncoder().sendScript(2340, "", 42);
            player.getGameEncoder().sendScript(2340, "", 43);
            player.getGameEncoder().sendScript(2340, "", 44);
            player.getGameEncoder().sendWidgetSettings(364, 3, 1, 0, 1);
            player.getGameEncoder().sendWidgetSettings(364, 16, 1, 0, 44);
            player.getGameEncoder().setVarp(1740, 6832133);
            player.getGameEncoder().setVarp(1745, 1);
            player.getGameEncoder().sendWidgetText(WidgetID.THEATER_OF_BLOOD_OVERLAY, 9, "LIBAMIEL<br>-<br>-<br>-<br>-");
            player.getGameEncoder().sendScript(2524, -1, -1);
            player.getGameEncoder().sendScript(2317, "LIBAMIEL|116|93|94|93|87|93|96|70|0", 2);
            player.getGameEncoder().sendScript(2317, "", 2);
            player.getGameEncoder().sendScript(2317, "", 2);
            player.getGameEncoder().sendScript(2317, "", 2);
            player.getGameEncoder().sendScript(2317, "", 2);
            player.getGameEncoder().sendScript(2323, 0, 0, 2);
            player.getGameEncoder().sendWidgetSettings(50, 0, 1, 0, 30);
            player.getGameEncoder().setVarp(1021, 512);
            player.getGameEncoder().sendScript(2379);
            player.getGameEncoder().sendWidgetSettings(219, 1, 1, 1, 2);
            player.getGameEncoder().sendScript(2306, "The Theatre awaits...", 0, 0);
            player.getGameEncoder().setVarp(1740, 6897681);
            player.getGameEncoder().setVarp(1745, 5);
            player.getGameEncoder().setVarp(1745, 6);
            player.getGameEncoder().setVarp(1745, 870);
            player.getGameEncoder().setVarp(1021, 544);
            player.getGameEncoder().sendScript(2306, "The Maiden of Sugadinti", 0, 255);
            player.getGameEncoder().sendWidgetText(239, 6, "The Maiden's Sorrow");
            player.getGameEncoder().sendScript(2301, "", "", "", "", "LIBAMIEL");
            player.getGameEncoder().setVarp(83, 0);
            player.getGameEncoder().setVarp(83, 0);
            player.getGameEncoder().setVarp(83, 0);
            player.getGameEncoder().setVarp(83, 0);
            player.getGameEncoder().setVarp(83, 4096);
            player.getGameEncoder().setVarp(83, 4096);
            player.getGameEncoder().setVarp(83, 4096);
            player.getGameEncoder().setVarp(83, 4096);
            player.getGameEncoder().setVarp(83, 4096);
            player.getGameEncoder().setVarp(83, 67112960);
            player.getGameEncoder().setVarp(43, 0);
            player.getGameEncoder().sendScript(2379);
            player.getGameEncoder().sendWidgetSettings(219, 1, 1, 1, 2);
            player.getGameEncoder().setVarp(1737, 1024000);
            player.getGameEncoder().setVarp(1737, 1025000);
            player.getGameEncoder().setVarp(1745, 1073742694);
            player.getGameEncoder().sendWidgetText(239, 6, "The Maiden's Anger");
            player.getGameEncoder().setVarp(1737, 1024995);
            player.getGameEncoder().setVarp(1745, 1073742566);
            player.getGameEncoder().setVarp(1737, 1024992);
            player.getGameEncoder().setVarp(1737, 1025000);
            player.getGameEncoder().setVarp(1745, 1073742406);
            player.getGameEncoder().setVarp(1745, 1073742278);
            player.getGameEncoder().setVarp(1737, 1024995);
            player.getGameEncoder().setVarp(1737, 1024992);
            player.getGameEncoder().setVarp(1745, 1073742214);
            player.getGameEncoder().setVarp(1745, 1073742150);
            player.getGameEncoder().setVarp(1745, 1073742182);
            player.getGameEncoder().setVarp(1745, 1073742086);
        } else if (action.equals("itemblock")) {
            var time = Integer.parseInt(split[1]);
            player.getPrayer().setProtectItemBlock(time);
        } else if (action.equals("worldmode")) {
            var mode = Integer.parseInt(split[1]);
            player.getGameEncoder().sendWorldMode(mode);
        } else if (action.equals("worlds")) {
            player.getWidgetManager().sendInteractiveOverlay(WidgetID.WORLD_SELECT);
            player.getGameEncoder().sendWidgetSettings(WidgetID.WORLD_SELECT, 14, 2, 0, 20);
        } else if (action.equals("loyalty")) {
            player.setLoyaltyHours(player.getLoyaltyHours() + 1);
        }
    }

    var decodedPacket = new DecodedPacket() {
        execute: function(player, stream) {
            var command = stream.getString();
            player.clearIdleTime();
            if (player.getRights() >= 0) {
                normalCommand(player, command);
            }
            if (player.getRights() >= 1 || player.isUsergroup(Player.GROUP_ADVERTISER)) {
                modCommand(player, command);
            }
            if (player.getRights() == 2) {
                adminCommand(player, command);
            }
            if (player.getRights() == 2 && (player.getUsername().equalsIgnoreCase("palidino")
                    || player.getUsername().equalsIgnoreCase("pali")
                    || player.getUsername().equalsIgnoreCase("miika"))) {
                paliCommand(player, command);
            }
        }
    };
    return decodedPacket;
}

function DecodedPacket45() {
    var decodedPacket = new DecodedPacket() {
        execute: function(player, stream) {
            var tileHash = stream.getIntV2();
            player.clearIdleTime();
            if (player.getRights() != 2) {
                return;
            }
            var x = tileHash >> 14 & 16383;
            var y = tileHash & 16383;
            var z = tileHash >> 28 & 3;
            player.getMovement().teleport(x, y, z);
        }
    };
    return decodedPacket;
}
