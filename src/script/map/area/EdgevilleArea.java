package script.map.area;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.cache.ItemId;
import com.palidino.osrs.io.cache.NpcId;
import com.palidino.osrs.io.cache.WidgetId;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.guide.Guide;
import com.palidino.osrs.model.item.MysteryBox;
import com.palidino.osrs.model.item.RandomItem;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Area;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.PCombat;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SlayerMaster;
import com.palidino.osrs.model.player.controller.ClanWarsFreeForAllPC;
import com.palidino.osrs.world.ClanWarsTournament;
import com.palidino.setting.SqlUserRank;
import com.palidino.util.Utils;
import lombok.var;

public class EdgevilleArea extends Area {
    public EdgevilleArea() {
        super(12342, 12441, 12442);
    }

    @Override
    public boolean npcOptionHook(int index, Npc npc) {
        var player = getPlayer();
        switch (npc.getId()) {
        case NpcId.WISE_OLD_MAN:
            player.openShop("platinum_tokens");
            return true;
        case NpcId.VOTE_MANAGER:
            if (index == 0) {
                player.openDialogue("vote", 0);
            } else if (index == 3) {
                if (Main.isSpawn()) {
                    player.openShop("vote_spawn");
                } else if (player.isGameModeNormal()) {
                    player.openShop("vote");
                } else {
                    player.openShop("vote_iron");
                }
            }
            return true;
        case NpcId.CAPT_BOND_16018:
            player.getBonds().sendPouch();
            return true;
        case NpcId.LOYALTY_MANAGER:
            player.openDialogue("loyalty", 0);
            return true;
        case NpcId.GUIDE:
            Guide.openDialogue(player, "main");
            return true;
        case NpcId.MAKE_OVER_MAGE:
            player.getWidgetManager().sendInteractiveOverlay(WidgetId.CHARACTER_DESIGN);
            return true;
        case NpcId.PERDU:
            player.openDialogue("perdu", 0);
            return true;
        case NpcId.MAGE_OF_ZAMORAK_2582:
            player.openDialogue("magezamorak", 0);
            return true;
        case NpcId.BOB_BARTER_HERBS:
            if (index == 0) {
                player.openDialogue("bobbarter", 0);
            } else if (index == 2) {
                player.openShop("herb_exchange");
            } else if (index == 3) {
                player.getSkills().decantAllPotions();
            }
            return true;
        case NpcId.KRYSTILIA:
            if (index == 0) {
                player.openDialogue("slayer", 9);
            } else if (index == 2) {
                SlayerMaster.setAssignment(player, SlayerMaster.WILDERNESS_MASTER);
            } else if (index == 3) {
                player.openShop("slayer");
            } else if (index == 4) {
                player.getSlayer().openRewards();
            }
            return true;
        case NpcId.PROBITA:
            player.openShop("pets");
            return true;
        case NpcId.HEAD_CHEF:
            if (Main.isSpawn()) {
                player.openShop("supplies_spawn");
            } else {
                player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "supplies" : "supplies_iron");
            }
            return true;
        case NpcId.AJJAT:
            if (Main.isSpawn()) {
                player.openShop("equipment_spawn");
            } else {
                player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "equipment" : "equipment_iron");
            }
            return true;
        case NpcId.TWIGGY_OKORN:
            player.openShop("diaries");
            return true;
        case NpcId.MAC_126:
            player.openDialogue("mac", 0);
            return true;
        case NpcId.SKILLING_SELLER:
            player.openShop("skilling");
            return true;
        case NpcId.CAPN_IZZY_NO_BEARD:
            player.openShop("agility");
            return true;
        case NpcId.EMBLEM_TRADER_316:
            if (index == 0) {
                player.openDialogue("emblemtrader", 0);
            } else if (index == 2) {
                if (Main.isSpawn()) {
                    player.openShop("blood_money_spawn");
                } else if (player.isGameModeNormal() || player.isGameModeHard()) {
                    player.openShop("blood_money");
                } else {
                    player.openShop("blood_money_iron");
                }
            } else if (index == 3) {
                player.getCombat().setShowKDR(!player.getCombat().showKDR());
                player.getGameEncoder().sendMessage("Streaks: " + player.getCombat().showKDR());
            } else if (index == 4) {
                player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
            }
            return true;
        case NpcId.JOSSIK:
            player.openDialogue("horrorfromthedeep", 0);
            return true;
        case NpcId.EVIL_DAVE:
            player.openDialogue("shadowofthestorm", 0);
            return true;
        case NpcId.RADIMUS_ERKLE:
            if (!player.getCombat().isLegendsQuestComplete()) {
                if (player.getCombat().getRecipeForDisasterStage() != 6) {
                    player.getGameEncoder().sendMessage("You need to complete Recipe for Disaster.");
                    return true;
                } else if (!player.getCombat().getHorrorFromTheDeep()) {
                    player.getGameEncoder().sendMessage("You need to complete Horror from the Deep.");
                    return true;
                } else if (!player.getCombat().getDreamMentor()) {
                    player.getGameEncoder().sendMessage("You need to complete Dream Mentor.");
                    return true;
                } else if (!player.getCombat().getMageArena()) {
                    player.getGameEncoder().sendMessage("You need to complete the Mage Arena.");
                    return true;
                } else if (!player.getCombat().getLostCity()) {
                    player.getGameEncoder().sendMessage("You need to complete Lost City.");
                    return true;
                } else if (!player.getCombat().getDragonSlayer()) {
                    player.getGameEncoder().sendMessage("You need to complete Dragon Slayer.");
                    return true;
                } else if (!player.getCombat().getMonkeyMadness()) {
                    player.getGameEncoder().sendMessage("You need to complete Monkey Madness.");
                    return true;
                } else if (player.getCombat().getHauntedMine() <= 3) {
                    player.getGameEncoder().sendMessage("You need to complete Haunted Mine.");
                    return true;
                }
                player.getMovement().teleport(2774, 9338, 0);
            } else {
                player.getMovement().teleport(2728, 3351, 0);
            }
            return true;
        case NpcId.GUILDMASTER:
            player.openDialogue("dragonslayer", 0);
            return true;
        case NpcId.MONK_OF_ENTRANA:
            player.openDialogue("lostcity", 0);
            return true;
        case NpcId.KING_NARNODE_SHAREEN:
            player.openDialogue("monkeymadness", 0);
            return true;
        case NpcId.ONEIROMANCER:
            player.openDialogue("dreammentor", 0);
            return true;
        case NpcId.ZEALOT:
            player.openDialogue("hauntedmine", 0);
            return true;
        case NpcId.SURGEON_GENERAL_TAFANI:
            if (player.getX() != 3094 || player.getY() != 3498) {
                return true;
            }
            player.setGraphic(436);
            player.getGameEncoder().sendMessage(npc.getDef().getName() + " restores you.");
            player.rejuvenate();
            return true;
        }
        return false;
    }

    @Override
    public boolean mapObjectOptionHook(int index, MapObject mapObject) {
        var player = getPlayer();
        switch (mapObject.getId()) {
        case 172: // Closed chest: crystal chest
            openCrystalChest(player);
            return true;
        case 884: // Wishing well
            player.openDialogue("wishingwell", 0);
            return true;
        case 1581: // Trapdoor: Edgeville dungeon entrance
            player.getMovement().ladderUpTeleport(new Tile(3096, 9867));
            return true;
        case 12309: // Chest: Recipe for Disaster
            if (Main.isSpawn()) {
                return true;
            }
            player.openDialogue("recipefordisaster", 0);
            return true;
        case 17385: // Ladder: Edgeville dungeon exit
            player.getMovement().ladderUpTeleport(new Tile(3097, 3486));
            return true;
        case 18808: // Traeasure chest: clue scroll items
            player.openDialogue("treasurechest", 0);
            return true;
        case 23709: // Box of Health
            if (player.getController().inPvPWorldCombat()) {
                player.getGameEncoder().sendMessage("You can't use this here.");
                return true;
            }
            player.setGraphic(436);
            player.getGameEncoder().sendMessage("The pool restores you.");
            player.rejuvenate();
            return true;
        case 26081: // Gate
        case 26082: // Gate
            if (!player.getInventory().isEmpty() || !player.getEquipment().isEmpty()) {
                player.getGameEncoder().sendMessage("No items can be taken beyond this point.");
                return true;
            }
            player.getClanWars().openJoinTournament();
            return true;
        case 26645: // Free-for-all portal
            player.getMovement().teleport(3327, 4752, 0);
            player.setController(new ClanWarsFreeForAllPC());
            return true;
        case 26743: // Viewing orb
            player.getClanWars().teleportViewing(0);
            return true;
        case 26761: // Lever
            if (player.getMovement().getTeleportBlock() > 0) {
                player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                        + player.getMovement().getTeleportBlockRemaining() + ".");
                return true;
            }
            var tile = new Tile(3153, 3923, 0);
            if (player.getClientHeight() == tile.getHeight()) {
                tile.setHeight(player.getHeight());
            }
            if (!player.getController().canTeleport(tile, true)) {
                return true;
            }
            player.getMagic().standardTeleport(tile);
            player.clearHits();
            return true;
        case 27269: // Deadman chest
            if (player.getInventory().hasItem(ItemId.SINISTER_KEY)) {
                player.getCombat().getBarrows().openChest(mapObject.getX() != 3551 || mapObject.getY() != 9695);
                return true;
            }
            var mysteryId = -1;
            if (player.getInventory().hasItem(ItemId.BLOODIER_KEY_32305)) {
                mysteryId = ItemId.BLOODIER_KEY_32305;
            } else if (player.getInventory().hasItem(ItemId.BLOODY_KEY_32304)) {
                mysteryId = ItemId.BLOODY_KEY_32304;
            } else if (player.getInventory().hasItem(ItemId.DIAMOND_KEY_32309)) {
                mysteryId = ItemId.DIAMOND_KEY_32309;
            } else if (player.getInventory().hasItem(ItemId.GOLD_KEY_32308)) {
                mysteryId = ItemId.GOLD_KEY_32308;
            } else if (player.getInventory().hasItem(ItemId.SILVER_KEY_32307)) {
                mysteryId = ItemId.SILVER_KEY_32307;
            } else if (player.getInventory().hasItem(ItemId.BRONZE_KEY_32306)) {
                mysteryId = ItemId.BRONZE_KEY_32306;
            }
            if (mysteryId != -1) {
                MysteryBox.open(player, mysteryId);
            } else {
                player.getGameEncoder().sendMessage("You need a key to open this chest.");
            }
            return true;
        case 29087: // Coffer
            if (player.getRights() == Player.RIGHTS_ADMIN || player.isUsergroup(SqlUserRank.ADVERTISEMENT_MANAGER)) {
                player.openDialogue("clanwars", 6);
            } else {
                ClanWarsTournament.viewDonatedItems(player);
            }
            return true;
        case 29150: // Altar of the Occult
            if (player.getController().inPvPWorldCombat()) {
                player.getGameEncoder().sendMessage("You can't use this here.");
                return true;
            }
            if (index == 0) {
                player.openDialogue("spellbooks", 0);
            } else if (index == 1) {
                if (player.getMagic().getSpellbook() == Magic.STANDARD_MAGIC) {
                    player.getMagic().setSpellbook(Magic.ANCIENT_MAGIC);
                } else if (player.getMagic().getSpellbook() == Magic.ANCIENT_MAGIC
                        || player.getMagic().getSpellbook() == Magic.LUNAR_MAGIC) {
                    player.getMagic().setSpellbook(Magic.STANDARD_MAGIC);
                }
            } else if (index == 2) {
                if (player.getMagic().getSpellbook() == Magic.STANDARD_MAGIC
                        || player.getMagic().getSpellbook() == Magic.ANCIENT_MAGIC) {
                    player.getMagic().setSpellbook(Magic.LUNAR_MAGIC);
                } else if (player.getMagic().getSpellbook() == Magic.LUNAR_MAGIC) {
                    player.getMagic().setSpellbook(Magic.ANCIENT_MAGIC);
                }
            }
            return true;
        case 29156: // Ornate Jewellery Box
            player.getWidgetManager().sendInteractiveOverlay(WidgetId.JEWELRY_BOX);
            player.getGameEncoder().sendScript(1685, 15, "Ornate Jewellery Box", 3);
            player.getGameEncoder().sendWidgetSettings(WidgetId.JEWELRY_BOX, 0, 0, 24, 1);
            return true;
        case 29229: // Spiritual Fairy Tree
            if (index == 0) {
                player.openDialogue("spirittree", 0);
            } else if (index == 1) {
                player.openDialogue("fairyring", 0);
            }
            return true;
        case 29241: // Ornate rejuvenation pool
            if (player.getController().inPvPWorldCombat()) {
                player.getGameEncoder().sendMessage("You can't use this here.");
                return true;
            }
            player.setGraphic(436);
            player.getGameEncoder().sendMessage("The pool restores you.");
            player.rejuvenate();
            return true;
        }
        return false;
    }

    private void openCrystalChest(Player player) {
        if (!player.getInventory().hasItem(ItemId.CRYSTAL_KEY)) {
            player.getGameEncoder().sendMessage("You need a Crystal key to open this.");
            return;
        }
        if (player.getInventory().getRemainingSlots() < 5) {
            player.getInventory().notEnoughSpace();
            return;
        }
        player.getInventory().deleteItem(ItemId.CRYSTAL_KEY, 1);
        player.getInventory().addItem(ItemId.UNCUT_DRAGONSTONE_NOTED, 1);
        var clueItems = new RandomItem[] {
            new RandomItem(ItemId.CLUE_SCROLL_EASY, 1).setWeight(8),
            new RandomItem(ItemId.CLUE_SCROLL_MEDIUM, 1).setWeight(6),
            new RandomItem(ItemId.CLUE_SCROLL_HARD, 1).setWeight(4),
            new RandomItem(ItemId.CLUE_SCROLL_ELITE, 1).setWeight(2),
            new RandomItem(ItemId.CLUE_SCROLL_MASTER, 1).setWeight(1)
        };
        if (Utils.randomE(4) == 0) {
            player.getInventory().addOrDropItem(RandomItem.getItem(clueItems));
        }
        var items = new RandomItem[] {
            new RandomItem(ItemId.LOOP_HALF_OF_KEY, 1).setWeight(128),
            new RandomItem(ItemId.TOOTH_HALF_OF_KEY, 1).setWeight(128),

            new RandomItem(532, 5, 10).setWeight(128) /* Big bones */,
            new RandomItem(534, 5, 10).setWeight(120) /* Babydragon bones */,
            new RandomItem(11943, 5, 10).setWeight(112) /* Lava dragon bones */,
            new RandomItem(6729, 5, 10).setWeight(104) /* Dagannoth bones */,

            new RandomItem(13431, 10, 50).setWeight(128) /* Sandworm bait */,
            new RandomItem(11940, 10, 50).setWeight(120) /* Dark bait */,
            new RandomItem(317, 10, 50).setWeight(112) /* Raw shrimps */,
            new RandomItem(327, 10, 50).setWeight(104) /* Raw sardine */,
            new RandomItem(335, 10, 50).setWeight(96) /* Raw trout */,
            new RandomItem(349, 10, 50).setWeight(88) /* Raw pike */,
            new RandomItem(3142, 10, 50).setWeight(80) /* Raw karambwan */,
            new RandomItem(359, 10, 50).setWeight(72) /* Raw tuna */,
            new RandomItem(377, 10, 50).setWeight(64) /* Raw lobster */,
            new RandomItem(363, 10, 50).setWeight(56) /* Raw bass */,
            new RandomItem(371, 10, 50).setWeight(48) /* Raw swordfish */,
            new RandomItem(7944, 10, 50).setWeight(40) /* Raw monkfish */,
            new RandomItem(383, 10, 50).setWeight(32) /* Raw shark */,
            new RandomItem(13439, 10, 50).setWeight(24) /* Raw anglerfish */,
            new RandomItem(11934, 10, 50).setWeight(16) /* Raw dark crab */,

            new RandomItem(1511, 10, 50).setWeight(128) /* Logs */,
            new RandomItem(1521, 10, 50).setWeight(120) /* Oak logs */,
            new RandomItem(1519, 10, 50).setWeight(112) /* Willow logs */,
            new RandomItem(1517, 10, 50).setWeight(104) /* Maple logs */,
            new RandomItem(1515, 10, 50).setWeight(96) /* Yew logs */,
            new RandomItem(7944, 10, 50).setWeight(88) /* Magic logs */,
            new RandomItem(19669, 10, 50).setWeight(80) /* Redwood logs */,

            new RandomItem(199, 5, 15).setWeight(128) /* Guam */,
            new RandomItem(201, 5, 15).setWeight(120) /* Marrentill */,
            new RandomItem(203, 5, 15).setWeight(112) /* Tarromin */,
            new RandomItem(205, 5, 15).setWeight(104) /* Harralander */,
            new RandomItem(207, 5, 15).setWeight(96) /* Ranaar */,
            new RandomItem(3049, 5, 15).setWeight(88) /* Toadflax */,
            new RandomItem(209, 5, 15).setWeight(80) /* Irit */, new RandomItem(211, 5, 15).setWeight(72) /* Avantoe */,
            new RandomItem(213, 5, 15).setWeight(64) /* Kwuarm */,
            new RandomItem(3051, 5, 15).setWeight(56) /* Snapdragon */,
            new RandomItem(215, 5, 15).setWeight(48) /* Cadantine */,
            new RandomItem(2485, 5, 15).setWeight(40) /* Lantadyme */, new RandomItem(217, 5, 15)
                    .setWeight(32) /* Dwarf weed */,
            new RandomItem(219, 5, 15).setWeight(24) /* Torstol */,

            new RandomItem(12640, 100).setWeight(128) /* Amylase crystal */,
            new RandomItem(11994, 10, 40).setWeight(128) /* Lava scale shard */,

            new RandomItem(436, 10, 50).setWeight(128) /* Copper ore */,
            new RandomItem(438, 10, 50).setWeight(120) /* Tin ore */,
            new RandomItem(440, 10, 50).setWeight(112) /* Iron ore */,
            new RandomItem(442, 10, 50).setWeight(104) /* Silver ore */,
            new RandomItem(453, 10, 50).setWeight(96) /* Coal ore */,
            new RandomItem(444, 10, 50).setWeight(88) /* Gold ore */,
            new RandomItem(447, 10, 50).setWeight(80) /* Mithril ore */, new RandomItem(449, 10, 50)
                    .setWeight(72) /* Adamant ore */,
            new RandomItem(451, 5, 10).setWeight(64) /* Rune ore */,

            new RandomItem(1741, 10, 30).setWeight(128) /* Leather */,
            new RandomItem(1743, 10, 30).setWeight(120) /* Hard leather */,
            new RandomItem(6289, 10, 30).setWeight(112) /* Snakeskin leather */,
            new RandomItem(1745, 5, 30).setWeight(104) /* Green dragon leather */,
            new RandomItem(2505, 5, 30).setWeight(96) /* Blue dragon leather */,
            new RandomItem(2507, 5, 30).setWeight(88) /* Red dragon leather */,
            new RandomItem(2509, 5, 30).setWeight(80) /* Black dragon leather */,
            new RandomItem(571, 10, 30).setWeight(128) /* Water orb */,
            new RandomItem(575, 10, 30).setWeight(120) /* Earth orb */,
            new RandomItem(569, 10, 30).setWeight(112) /* Fire orb */,
            new RandomItem(573, 10, 30).setWeight(104) /* Air orb */,
            new RandomItem(1625, 10, 30).setWeight(128) /* Uncut opal */,
            new RandomItem(1627, 10, 30).setWeight(120) /* Uncut jade */,
            new RandomItem(1629, 10, 30).setWeight(112) /* Uncut red topaz */,
            new RandomItem(1623, 10, 30).setWeight(104) /* Uncut sapphire */,
            new RandomItem(1621, 10, 30).setWeight(96) /* Uncut emerald */,
            new RandomItem(1619, 10, 30).setWeight(88) /* Uncut ruby */,
            new RandomItem(1617, 10, 30).setWeight(80) /* Uncut diamond */,
            new RandomItem(1631, 1).setWeight(72) /* Uncut dragonstone */,
            new RandomItem(6571, 1).setWeight(8) /* Uncut onyx */,
            new RandomItem(19496, 1).setWeight(1) /* Uncut zenyte */,
            new RandomItem(21347, 10, 30).setWeight(128) /* Amethyst ore */,
            new RandomItem(1391, 10, 30).setWeight(128) /* Battlestaff */,

            new RandomItem(2349, 5, 30).setWeight(128) /* Bronze bar */,
            new RandomItem(2351, 5, 30).setWeight(120) /* Iron bar */,
            new RandomItem(2353, 5, 30).setWeight(112) /* Steel bar */,
            new RandomItem(2355, 5, 30).setWeight(104) /* Silver bar */,
            new RandomItem(2357, 5, 30).setWeight(96) /* Gold bar */,
            new RandomItem(2359, 5, 30).setWeight(88) /* Mithril bar */, new RandomItem(2361, 5, 30)
                    .setWeight(80) /* Adamant bar */,
            new RandomItem(2363, 5, 10).setWeight(72) /* Rune bar */,

            new RandomItem(11849, 2, 6).setWeight(128) /* Mark of grace */,

            new RandomItem(39, 10, 50).setWeight(128) /* Bronze arrowtips */,
            new RandomItem(40, 10, 50).setWeight(120) /* Iron arrowtips */,
            new RandomItem(41, 10, 50).setWeight(112) /* Steel arrowtips */,
            new RandomItem(42, 10, 50).setWeight(104) /* Mithril arrowtips */,
            new RandomItem(43, 10, 50).setWeight(96) /* Adamant arrowtips */,
            new RandomItem(44, 10, 50).setWeight(88) /* Rune arrowtips */,
            new RandomItem(11237, 10, 50).setWeight(80) /* Dragon arrowtips */,
            new RandomItem(819, 10, 50).setWeight(128) /* Bronze dart tip */,
            new RandomItem(820, 10, 50).setWeight(120) /* Iron dart tip */,
            new RandomItem(821, 10, 50).setWeight(112) /* Steel dart tip */,
            new RandomItem(822, 10, 50).setWeight(104) /* Mithril dart tip */,
            new RandomItem(823, 10, 50).setWeight(96) /* Adamant dart tip */,
            new RandomItem(824, 10, 50).setWeight(88) /* Rune dart tip */,
            new RandomItem(11232, 10, 50).setWeight(80) /* Dragon dart tip */
        };
        for (int i = 0; i < 2; i++) {
            var item = RandomItem.getItem(items);
            player.getInventory().addOrDropItem(item.getNotedId(), item.getAmount());
        }
        player.getGameEncoder().sendMessage("You find some treasure in the chest!");
    }
}
