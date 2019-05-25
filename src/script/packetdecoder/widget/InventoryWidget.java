package script.packetdecoder.widget;

import java.util.ArrayList;
import java.util.List;
import com.palidino.osrs.Main;
import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.io.cache.NpcID;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.Graphic;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.dialogue.Dialogue;
import com.palidino.osrs.model.guide.Guide;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.item.ItemDef;
import com.palidino.osrs.model.item.MysteryBox;
import com.palidino.osrs.model.item.RandomItem;
import com.palidino.osrs.model.map.MapItem;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.Familiar;
import com.palidino.osrs.model.player.Farming;
import com.palidino.osrs.model.player.Herblore;
import com.palidino.osrs.model.player.Hunter;
import com.palidino.osrs.model.player.ItemCharges;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Runecrafting;
import com.palidino.osrs.model.player.Skills;
import com.palidino.osrs.model.player.Slayer;
import com.palidino.osrs.model.player.combat.BountyHunter;
import com.palidino.osrs.util.RequestManager;
import com.palidino.osrs.world.WildernessEvent;
import com.palidino.osrs.world.World;
import com.palidino.util.Utils;
import com.palidino.util.event.Event;

// No longer JS woohoo! Need a better solution than a 2K line file and growing.
// One file per item id sucks, that's a hard no.
// Option #1: group ids by relevance and then split those into sub classes. 

public class InventoryWidget {
    public static void widget149(Player player, int index, int childID, int slot, int itemID) {
        player.clearAllActions(false, false);
        if (itemID != player.getInventory().getID(slot)) {
            return;
        }
        Item item = player.getInventory().getItem(slot);
        if (index == 0 && player.getController().isFood(itemID)) {
            player.getWidgetManager().removeInteractiveWidgets();
            player.getSkills().eatFood(slot);
            return;
        }
        if (index == 0 && player.getController().isDrink(itemID)) {
            player.getWidgetManager().removeInteractiveWidgets();
            player.getSkills().drink(slot);
            return;
        }
        if (index == 0 && player.getPrayer().buryBones(slot) >= 0) {
            player.getWidgetManager().removeInteractiveWidgets();
            return;
        }
        if (index == 0 && Herblore.cleanHerb(player, itemID, slot)) {
            return;
        }
        if (item.getDef().getEquipSlot() != null && (item.getDef().isOption(index, "wear")
                || item.getDef().isOption(index, "wield") || item.getDef().isOption(index, "equip"))) {
            player.getEquipment().equip(itemID, slot);
            return;
        }
        if (index == 4 && (item.getDef().getOption(index) == null || item.getDef().isOption(index, "drop")
                || item.getDef().isOption(index, "destroy") || item.getDef().isOption(index, "release"))) {
            player.getWidgetManager().removeInteractiveWidgets();
            if (Familiar.isPetItem(itemID)) {
                player.getFamiliar().summonPet(itemID);
                return;
            }
            if (player.inNoDroppingItemsArea()) {
                player.getGameEncoder().sendMessage("Items can't be dropped here.");
                return;
            }
            if ((itemID == ItemID.BLOOD_MONEY || BountyHunter.MysteriousEmblem.isEmblem(itemID))
                    && player.getController().inWilderness()) {
                player.getGameEncoder().sendMessage("You can't drop this here.");
                return;
            }
            if (ItemDef.getUntradable(itemID) && player.getController().inWilderness()) {
                player.getGameEncoder().sendMessage("You can't drop this right now.");
                return;
            }
            if (itemID == ItemID.BLOODY_KEY || itemID == ItemID.BLOODIER_KEY) {
                WildernessEvent.bloodyKeyToMap(item, player, MapItem.NORMAL_TIME, MapItem.ALWAYS_APPEAR);
            } else if (player.isUsergroup(Player.GROUP_YOUTUBER)) {
                player.getController().addMapItem(item, player, MapItem.NORMAL_TIME, MapItem.NEVER_APPEAR);
            } else if (player.getController().inWilderness() && !player.getController().isInstanced()
                    && !ItemDef.getUntradable(itemID)) {
                if (player.getController().isFood(itemID) || player.getController().isDrink(itemID)) {
                    player.getController().addMapItem(item, player, MapItem.NORMAL_TIME, MapItem.NEVER_APPEAR);
                } else {
                    player.getController().addMapItem(item, player, MapItem.NORMAL_TIME, MapItem.ALWAYS_APPEAR);
                }
            } else if (player.getController().isInstanced()) {
                player.getController().addMapItem(item, player, MapItem.LONG_TIME, MapItem.NORMAL_APPEAR);
            } else if (!item.getDef().isOption(index, "release")) {
                player.getController().addMapItem(item, player, player);
            }
            player.getInventory().deleteItem(itemID, item.getAmount(), slot);
            RequestManager.addPlayerLog(player, "mapitem",
                    player.getLogName() + " dropped " + item.getLogName() + " located at " + player + ".");
            return;
        }
        int height = 0;
        Tile tile = null;
        int[] items = null;
        RandomItem[] randomItems = null;
        RandomItem randomItem = null;
        Event event = null;
        Item anItem = null;
        int[] ttLoot = null;
        switch (itemID) {
        case ItemID.VOID_KNIGHT_SET_32289:
            if (player.getInventory().getRemainingSlots() < 9 - 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.VOID_KNIGHT_TOP);
            player.getInventory().addItem(ItemID.VOID_KNIGHT_ROBE);
            player.getInventory().addItem(ItemID.VOID_KNIGHT_MACE);
            player.getInventory().addItem(ItemID.VOID_KNIGHT_GLOVES);
            player.getInventory().addItem(ItemID.VOID_MAGE_HELM);
            player.getInventory().addItem(ItemID.VOID_RANGER_HELM);
            player.getInventory().addItem(ItemID.VOID_MELEE_HELM);
            player.getInventory().addItem(ItemID.ELITE_VOID_TOP);
            player.getInventory().addItem(ItemID.ELITE_VOID_ROBE);
            break;
        case ItemID.LUMBERJACK_OUTFIT_WOODCUTTING_32291:
            if (player.getInventory().getRemainingSlots() < 4 - 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.LUMBERJACK_HAT);
            player.getInventory().addItem(ItemID.LUMBERJACK_TOP);
            player.getInventory().addItem(ItemID.LUMBERJACK_LEGS);
            player.getInventory().addItem(ItemID.LUMBERJACK_BOOTS);
            break;
        case ItemID.PROSPECTOR_OUTFIT_MINING_32292:
            if (player.getInventory().getRemainingSlots() < 4 - 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.PROSPECTOR_HELMET);
            player.getInventory().addItem(ItemID.PROSPECTOR_JACKET);
            player.getInventory().addItem(ItemID.PROSPECTOR_LEGS);
            player.getInventory().addItem(ItemID.PROSPECTOR_BOOTS);
            break;
        case ItemID.ANGLER_OUTFIT_FISHING_32293:
            if (player.getInventory().getRemainingSlots() < 4 - 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.ANGLER_HAT);
            player.getInventory().addItem(ItemID.ANGLER_TOP);
            player.getInventory().addItem(ItemID.ANGLER_WADERS);
            player.getInventory().addItem(ItemID.ANGLER_BOOTS);
            break;
        case ItemID.PYROMANCER_OUTFIT_FIREMAKING_32294:
            if (player.getInventory().getRemainingSlots() < 5 - 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.PYROMANCER_HOOD);
            player.getInventory().addItem(ItemID.PYROMANCER_GARB);
            player.getInventory().addItem(ItemID.PYROMANCER_ROBE);
            player.getInventory().addItem(ItemID.PYROMANCER_BOOTS);
            player.getInventory().addItem(ItemID.WARM_GLOVES);
            break;
        case ItemID.ROGUE_OUTFIT_THIEVING_32295:
            if (player.getInventory().getRemainingSlots() < 5 - 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.ROGUE_MASK);
            player.getInventory().addItem(ItemID.ROGUE_TOP);
            player.getInventory().addItem(ItemID.ROGUE_TROUSERS);
            player.getInventory().addItem(ItemID.ROGUE_BOOTS);
            player.getInventory().addItem(ItemID.ROGUE_GLOVES);
            break;
        case ItemID.LARUPIA_OUTFIT_HUNTER_32296:
            if (player.getInventory().getRemainingSlots() < 3 - 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.LARUPIA_HAT);
            player.getInventory().addItem(ItemID.LARUPIA_TOP);
            player.getInventory().addItem(ItemID.LARUPIA_LEGS);
            break;
        case ItemID.FARMERS_OUTFIT_FARMING_32297:
            if (player.getInventory().getRemainingSlots() < 4 - 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.FARMERS_STRAWHAT);
            player.getInventory().addItem(ItemID.FARMERS_JACKET);
            player.getInventory().addItem(ItemID.FARMERS_BORO_TROUSERS);
            player.getInventory().addItem(ItemID.FARMERS_BOOTS);
            break;
        case ItemID.GRACEFUL_OUTFIT_AGILITY_32298:
            if (player.getInventory().getRemainingSlots() < 6 - 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.GRACEFUL_HOOD);
            player.getInventory().addItem(ItemID.GRACEFUL_TOP);
            player.getInventory().addItem(ItemID.GRACEFUL_LEGS);
            player.getInventory().addItem(ItemID.GRACEFUL_GLOVES);
            player.getInventory().addItem(ItemID.GRACEFUL_BOOTS);
            player.getInventory().addItem(ItemID.GRACEFUL_CAPE);
            break;
        case ItemID.ELIDINIS_OUTFIT_RUNECRAFTING_32299:
            if (player.getInventory().getRemainingSlots() < 2 - 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.ROBE_OF_ELIDINIS);
            player.getInventory().addItem(ItemID.ROBE_OF_ELIDINIS_6787);
            break;
        case ItemID.STARTER_PACK_32288:
            if (!player.hasVoted()) {
                player.getGameEncoder().sendMessage("To open this, you first need to vote on the main websites.");
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            if (player.isGameModeNormal()) {
                player.getInventory().addOrDropItem(ItemID.DRAGON_SCIMITAR, 1);
                player.getInventory().addOrDropItem(ItemID.RUNE_FULL_HELM, 1);
                player.getInventory().addOrDropItem(ItemID.RUNE_PLATEBODY, 1);
                player.getInventory().addOrDropItem(ItemID.RUNE_PLATELEGS, 1);
                player.getInventory().addOrDropItem(ItemID.RUNE_KITESHIELD, 1);
                player.getInventory().addOrDropItem(ItemID.RUNE_BOOTS, 1);
                player.getInventory().addOrDropItem(ItemID.RUNE_CROSSBOW, 1);
                player.getInventory().addOrDropItem(ItemID.DIAMOND_BOLTS_E, 100);
                player.getInventory().addOrDropItem(ItemID.BLACK_DHIDE_BODY, 1);
                player.getInventory().addOrDropItem(ItemID.BLACK_DHIDE_CHAPS, 1);
                player.getInventory().addOrDropItem(ItemID.BLACK_DHIDE_VAMB, 1);
                player.getInventory().addOrDropItem(ItemID.BLACK_DHIDE_SHIELD, 1);
                player.getInventory().addOrDropItem(ItemID.MYSTIC_AIR_STAFF, 1);
                player.getInventory().addOrDropItem(ItemID.DEATH_RUNE, 100);
                player.getInventory().addOrDropItem(ItemID.BLOOD_RUNE, 100);
                player.getInventory().addOrDropItem(ItemID.MYSTIC_HAT, 1);
                player.getInventory().addOrDropItem(ItemID.MYSTIC_ROBE_TOP, 1);
                player.getInventory().addOrDropItem(ItemID.MYSTIC_ROBE_BOTTOM, 1);
                player.getInventory().addOrDropItem(ItemID.MYSTIC_GLOVES, 1);
                player.getInventory().addOrDropItem(ItemID.MYSTIC_BOOTS, 1);
            }
            player.getInventory().addOrDropItem(ItemID.COINS, 400000);
            player.getInventory().addOrDropItem(ItemID.MONKFISH_NOTED, 150);
            player.getInventory().addOrDropItem(ItemID.SUPER_ATTACK_4_NOTED, 15);
            player.getInventory().addOrDropItem(ItemID.SUPER_STRENGTH_4_NOTED, 15);
            player.getInventory().addOrDropItem(ItemID.SUPER_DEFENCE_4_NOTED, 15);
            player.getInventory().addOrDropItem(ItemID.PRAYER_POTION_4_NOTED, 60);
            break;
        case ItemID.PERMANENT_TZHAAR_WAVE_BOOST_32300:
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getCombat().getTzHaar().setPermanentWaveBoost(true);
            player.getGameEncoder().sendMessage("The effects of the scroll have been activated.");
            break;
        case ItemID.BIRD_NEST:
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.BIRD_NEST_5075, 1, slot);
            player.getInventory().addOrDropItem(ItemID.BIRDS_EGG, 1);
            break;
        case ItemID.BIRD_NEST_5071:
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.BIRD_NEST_5075, 1, slot);
            player.getInventory().addOrDropItem(ItemID.BIRDS_EGG_5078, 1);
            break;
        case ItemID.BIRD_NEST_5072:
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.BIRD_NEST_5075, 1, slot);
            player.getInventory().addOrDropItem(ItemID.BIRDS_EGG_5077, 1);
            break;
        case ItemID.MAGIC_CAPE:
        case ItemID.MAGIC_CAPE_T:
            player.openDialogue("spellbooks", 1);
            break;
        case ItemID.HYDRA_LEATHER:
            if (Main.isSpawn()) {
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(ItemID.FEROCIOUS_GLOVES, 1, slot);
            } else {
                player.getGameEncoder()
                        .sendMessage("This leather looks pretty tough to work with... Maybe the dragonkin had a way.");
            }
            break;
        case ItemID.RANDOM_PVP_WEAPON_32290:
            items = new int[] {
                ItemID.VESTAS_LONGSWORD_32254, ItemID.STATIUSS_WARHAMMER_32256, ItemID.VESTAS_SPEAR_32258,
                ItemID.MORRIGANS_JAVELIN_32260, ItemID.MORRIGANS_THROWING_AXE_32261, ItemID.ZURIELS_STAFF_32262
            };
            player.getInventory().deleteItem(itemID, 1, slot);
            anItem = new Item(items[Utils.randomE(items.length)], 1);
            if (anItem.getID() == ItemID.MORRIGANS_JAVELIN_32260
                    || anItem.getID() == ItemID.MORRIGANS_THROWING_AXE_32261) {
                anItem.setAmount(50);
            }
            player.getInventory().addOrDropItem(randomItem);
            RequestManager.addPlayerLog(player, "lootbox",
                    player.getLogName() + " received " + anItem.getLogName() + " from a random pvp weapon box.");
            break;
        case ItemID.DARK_RELIC:
            int[] raidsSkills = new int[] {
                Skills.ATTACK, Skills.DEFENCE, Skills.STRENGTH, Skills.HITPOINTS, Skills.RANGED, Skills.PRAYER,
                Skills.MAGIC, Skills.MINING, Skills.WOODCUTTING, Skills.HERBLORE, Skills.FARMING, Skills.HUNTER,
                Skills.COOKING, Skills.FISHING, Skills.THIEVING, Skills.FIREMAKING, Skills.AGILITY
            };
            player.getWidgetManager().sendChooseAdvanceSkill(itemID, 0, 0.5, 0);
            player.getWidgetManager().setChooseAdvanceSkillLevelMultiplier(50);
            for (int raidsSkill : raidsSkills) {
                player.getWidgetManager().setChooseAdvanceSkillLevelMultiplier(raidsSkill, 150);
            }
            break;
        case ItemID.ANTIQUE_LAMP_13145:
            player.getWidgetManager().sendChooseAdvanceSkill(itemID, 2500, 0.5, 30);
            break;
        case ItemID.ANTIQUE_LAMP_13146:
            player.getWidgetManager().sendChooseAdvanceSkill(itemID, 7500, 0.5, 40);
            break;
        case ItemID.ANTIQUE_LAMP_13147:
            player.getWidgetManager().sendChooseAdvanceSkill(itemID, 15000, 0.5, 50);
            break;
        case ItemID.ANTIQUE_LAMP_13148:
            player.getWidgetManager().sendChooseAdvanceSkill(itemID, 50000, 0.5, 70);
            break;
        case 5073: // Bird nest
            randomItems = new RandomItem[] {
                new RandomItem(5312, 1).setWeight(200), // Acorn
                new RandomItem(5283, 1).setWeight(150), // Apple tree seed
                new RandomItem(5313, 1).setWeight(150), // Willow seed
                new RandomItem(5284, 1).setWeight(100), // Banana tree seed
                new RandomItem(5285, 1).setWeight(80), // Orange tree seed
                new RandomItem(5286, 1).setWeight(70), // Curry tree seed
                new RandomItem(5314, 1).setWeight(60), // Maple seed
                new RandomItem(5287, 1).setWeight(50), // Pineapple seed
                new RandomItem(5288, 1).setWeight(40), // Papaya tree seed
                new RandomItem(5289, 1).setWeight(30), // Palm tree seed
                new RandomItem(5315, 1).setWeight(20), // Yew seed
                new RandomItem(5290, 1).setWeight(20), // Calquat tree seed
                new RandomItem(5316, 1).setWeight(10), // Magic seed
                new RandomItem(5317, 1).setWeight(5) // Spirit seed
            };
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(5075, 1, slot);
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 7413: // Bird nest
            randomItems = new RandomItem[] {
                new RandomItem(5323, 6).setWeight(125), // Strawberry
                new RandomItem(5320, 6).setWeight(125), // Sweetcorn
                new RandomItem(5312, 1).setWeight(100), // Acorn
                new RandomItem(5100, 2).setWeight(100), // Limpwurt
                new RandomItem(5321, 2).setWeight(50), // Watermelon
                new RandomItem(5302, 1).setWeight(40), // Lantadyme
                new RandomItem(5303, 1).setWeight(40), // Dwarf weed
                new RandomItem(5301, 1).setWeight(30), // Cadantine
                new RandomItem(5313, 1).setWeight(20), // Willow
                new RandomItem(5287, 1).setWeight(20), // Pineapple
                new RandomItem(5288, 1).setWeight(15), // Papaya
                new RandomItem(5290, 1).setWeight(15), // Calquat
                new RandomItem(5304, 1).setWeight(5), // Torstol
                new RandomItem(5317, 1).setWeight(5), // Spirit seed
                new RandomItem(5314, 1).setWeight(5), // Maple
                new RandomItem(5295, 1).setWeight(5), // Ranarr
                new RandomItem(5300, 1).setWeight(3), // Snapdragon
                new RandomItem(5315, 1).setWeight(3), // Yew seed
                new RandomItem(5289, 1).setWeight(2), // Palm
                new RandomItem(5316, 1).setWeight(2) // Magic
            };
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(5075, 1, slot);
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 13226: // Herb sack
            if (index == 0) {
                for (int i = player.getInventory().size(); i >= 0; i--) {
                    int addingID = player.getInventory().getID(i);
                    if (!Herblore.isHerb(addingID)) {
                        continue;
                    }
                    int addingAmount = player.getInventory().getAmount(i);
                    addingAmount = player.getWidgetManager().getHerbSack().canAddAmount(addingID, addingAmount);
                    player.getWidgetManager().getHerbSack().addItem(addingID, addingAmount);
                    player.getInventory().deleteItem(addingID, addingAmount, i);
                }
            } else if (index == 2) {
                for (int i = player.getWidgetManager().getHerbSack().size(); i >= 0; i--) {
                    int addingID = player.getWidgetManager().getHerbSack().getID(i);
                    int addingAmount = player.getWidgetManager().getHerbSack().getAmount(i);
                    addingAmount = player.getInventory().canAddAmount(addingID, addingAmount);
                    player.getInventory().addItem(addingID, addingAmount);
                    player.getWidgetManager().getHerbSack().deleteItem(addingID, addingAmount);
                }
            } else if (index == 3) {
                player.getWidgetManager().getHerbSack().displayItemList();
            }
            break;
        case 13639: // Seed box
            if (index == 0) {
                for (int i = player.getInventory().size(); i >= 0; i--) {
                    int addingID = player.getInventory().getID(i);
                    if (!Farming.isSeed(addingID)) {
                        continue;
                    }
                    int addingAmount = player.getInventory().getAmount(i);
                    addingAmount = player.getWidgetManager().getSeedBox().canAddAmount(addingID, addingAmount);
                    player.getWidgetManager().getSeedBox().addItem(addingID, addingAmount);
                    player.getInventory().deleteItem(addingID, addingAmount, i);
                }
            } else if (index == 1) {
                for (int i = player.getWidgetManager().getSeedBox().size(); i >= 0; i--) {
                    int addingID = player.getWidgetManager().getSeedBox().getID(i);
                    int addingAmount = player.getWidgetManager().getSeedBox().getAmount(i);
                    addingAmount = player.getInventory().canAddAmount(addingID, addingAmount);
                    player.getInventory().addItem(addingID, addingAmount);
                    player.getWidgetManager().getSeedBox().deleteItem(addingID, addingAmount);
                }
            } else if (index == 2) {
                player.getWidgetManager().getSeedBox().displayItemList();
            }
            break;
        case 20703: // Supply crate
            if (player.getInventory().getRemainingSlots() < 3) {
                player.getInventory().notEnoughSpace();
                break;
            }
            randomItems = new RandomItem[] {
                new RandomItem(1522, 13, 148), new RandomItem(1520, 13, 20), new RandomItem(1518, 10, 16),
                new RandomItem(6334, 14, 59), new RandomItem(8836, 10, 48), new RandomItem(1516, 10, 49),
                new RandomItem(1514, 10, 23), new RandomItem(1624, 1, 5), new RandomItem(1622, 1, 5),
                new RandomItem(1618, 1, 5), new RandomItem(1620, 1, 5), new RandomItem(454, 3, 12),
                new RandomItem(441, 3, 15), new RandomItem(443, 3, 12), new RandomItem(445, 3, 70),
                new RandomItem(447, 2, 7), new RandomItem(450, 2, 15), new RandomItem(452, 1, 2),
                new RandomItem(200, 3, 6), new RandomItem(202, 3, 6), new RandomItem(206, 7), new RandomItem(208, 1, 3),
                new RandomItem(212, 2, 3), new RandomItem(214, 1, 4), new RandomItem(216, 2, 3),
                new RandomItem(220, 1, 3), new RandomItem(5321, 1, 7), new RandomItem(5293, 1, 3),
                new RandomItem(5294, 1, 3), new RandomItem(5295, 1, 3), new RandomItem(5296, 1, 3),
                new RandomItem(5298, 1, 3), new RandomItem(5300, 1, 4), new RandomItem(5303, 1, 3),
                new RandomItem(5312, 1), new RandomItem(5313, 1, 2), new RandomItem(5284, 1, 3),
                new RandomItem(21486, 1, 3), new RandomItem(5314, 1, 3), new RandomItem(21488, 1, 3),
                new RandomItem(5304, 1, 3), new RandomItem(5315, 1, 3), new RandomItem(5316, 1, 3),
                new RandomItem(5317, 1), new RandomItem(322, 5, 12), new RandomItem(336, 5, 12),
                new RandomItem(332, 5, 12), new RandomItem(378, 5, 11), new RandomItem(360, 5, 12),
                new RandomItem(372, 5, 21), new RandomItem(384, 5, 21), new RandomItem(ItemID.COINS, 2030, 9048),
                new RandomItem(13422, 3, 24), new RandomItem(3212, 4, 7), new RandomItem(7937, 29, 391),
                new RandomItem(13574, 3, 19)
            };
            player.getInventory().deleteItem(itemID, 1, slot);
            int supplyCount = 2 + Utils.randomI(2);
            for (int i = 0; i < supplyCount; i++) {
                if (Utils.inRange(player.getCombat().getDropRate(6739, 0.01))) {
                    player.getInventory().addItem(6739, 1, slot);
                } else if (Utils.inRange(player.getCombat().getDropRate(20693, 0.02))) {
                    player.getInventory().addItem(20693, 1, slot);
                    player.getWorld().sendItemDropNews(player, 20693);
                } else if (Utils.inRange(player.getCombat().getDropRate(20716, 0.1))) {
                    player.getInventory().addItem(20716, 1, slot);
                } else if (Utils.inRange(player.getCombat().getDropRate(20720, 0.66))) {
                    player.getInventory().addItem(20720, 1, slot);
                } else if (Utils.inRange(player.getCombat().getDropRate(20718, 2.2))) {
                    player.getInventory().addItem(20718, 5 + Utils.randomE(26), slot);
                } else {
                    player.getInventory().addItem(RandomItem.getItem(randomItems), slot);
                }
            }
            break;
        case 20791: // Extra supply crate
            player.getInventory().deleteItem(itemID, 1, slot);
            if (Utils.inRange(player.getCombat().getDropRate(6739, 0.01))) {
                player.getInventory().addItem(6739, 1, slot);
            } else if (Utils.inRange(player.getCombat().getDropRate(20693, 0.02))) {
                player.getInventory().addItem(20693, 1, slot);
                player.getWorld().sendItemDropNews(player, 20693);
            } else if (Utils.inRange(player.getCombat().getDropRate(20716, 0.1))) {
                player.getInventory().addItem(20716, 1, slot);
            } else if (Utils.inRange(player.getCombat().getDropRate(20720, 0.66))) {
                player.getInventory().addItem(20720, 1, slot);
            } else if (Utils.inRange(player.getCombat().getDropRate(20718, 2.2))) {
                player.getInventory().addItem(20718, 5 + Utils.randomE(26), slot);
            } else {
                randomItems = new RandomItem[] {
                    new RandomItem(1522, 13, 148), new RandomItem(1520, 13, 20), new RandomItem(1518, 10, 16),
                    new RandomItem(6334, 14, 59), new RandomItem(8836, 10, 48), new RandomItem(1516, 10, 49),
                    new RandomItem(1514, 10, 23), new RandomItem(1624, 1, 5), new RandomItem(1622, 1, 5),
                    new RandomItem(1618, 1, 5), new RandomItem(1620, 1, 5), new RandomItem(454, 3, 12),
                    new RandomItem(441, 3, 15), new RandomItem(443, 3, 12), new RandomItem(445, 3, 70),
                    new RandomItem(447, 2, 7), new RandomItem(450, 2, 15), new RandomItem(452, 1, 2),
                    new RandomItem(200, 3, 6), new RandomItem(202, 3, 6), new RandomItem(206, 7),
                    new RandomItem(208, 1, 3), new RandomItem(212, 2, 3), new RandomItem(214, 1, 4),
                    new RandomItem(216, 2, 3), new RandomItem(220, 1, 3), new RandomItem(5321, 1, 7),
                    new RandomItem(5293, 1, 3), new RandomItem(5294, 1, 3), new RandomItem(5295, 1, 3),
                    new RandomItem(5296, 1, 3), new RandomItem(5298, 1, 3), new RandomItem(5300, 1, 4),
                    new RandomItem(5303, 1, 3), new RandomItem(5312, 1), new RandomItem(5313, 1, 2),
                    new RandomItem(5284, 1, 3), new RandomItem(21486, 1, 3), new RandomItem(5314, 1, 3),
                    new RandomItem(21488, 1, 3), new RandomItem(5304, 1, 3), new RandomItem(5315, 1, 3),
                    new RandomItem(5316, 1, 3), new RandomItem(5317, 1), new RandomItem(322, 5, 12),
                    new RandomItem(336, 5, 12), new RandomItem(332, 5, 12), new RandomItem(378, 5, 11),
                    new RandomItem(360, 5, 12), new RandomItem(372, 5, 21), new RandomItem(384, 5, 21),
                    new RandomItem(ItemID.COINS, 2030, 9048), new RandomItem(13422, 3, 24), new RandomItem(3212, 4, 7),
                    new RandomItem(7937, 29, 391), new RandomItem(13574, 3, 19)
                };
                player.getInventory().addItem(RandomItem.getItem(randomItems), slot);
            }
            break;
        case ItemID.MYSTERY_BOX:
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getWidgetManager().sendInteractiveOverlay(WidgetID.MYSTERY);
            player.getGameEncoder().sendClearItems(WidgetID.MYSTERY, 48, 1);
            final List<Item> mysteryBoxItems = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                mysteryBoxItems.add(null);
            }
            event = new Event(0) {
                private Item boxItem;

                @Override
                public void execute() {
                    if (!player.isVisible()) {
                        stop();
                        return;
                    }
                    mysteryBoxItems.remove(0);
                    if (getExecutions() < 5) {
                        boxItem = MysteryBox.getBoxItem();
                        mysteryBoxItems.add(boxItem);
                    }
                    player.getGameEncoder().sendItems(WidgetID.MYSTERY, 48, 1, mysteryBoxItems);
                    player.getSession().write();
                    if (getExecutions() == 8) {
                        stop();
                        player.getInventory().addOrDropItem(new Item(boxItem.getID(), boxItem.getAmount()));
                        RequestManager.addPlayerLog(player, "mysterybox",
                                player.getLogName() + " received " + boxItem.getLogName() + " from a mystery box.");
                    }
                }
            };
            player.getWorld().addEvent(event);
            break;
        case ItemID.SUPER_MYSTERY_BOX_32286:
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getWidgetManager().sendInteractiveOverlay(WidgetID.MYSTERY);
            player.getGameEncoder().sendClearItems(WidgetID.MYSTERY, 48, 1);
            final List<Item> superMysteryBoxItems = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                superMysteryBoxItems.add(null);
            }
            event = new Event(0) {
                private Item boxItem;

                @Override
                public void execute() {
                    if (!player.isVisible()) {
                        stop();
                        return;
                    }
                    superMysteryBoxItems.remove(0);
                    if (getExecutions() < 5) {
                        boxItem = MysteryBox.getSuperBoxItem();
                        superMysteryBoxItems.add(boxItem);
                    }
                    player.getGameEncoder().sendItems(WidgetID.MYSTERY, 48, 1, superMysteryBoxItems);
                    player.getSession().write();
                    if (getExecutions() == 8) {
                        stop();
                        player.getInventory().addOrDropItem(new Item(boxItem.getID(), boxItem.getAmount()));
                        RequestManager.addPlayerLog(player, "mysterybox", player.getLogName() + " received "
                                + boxItem.getLogName() + " from a super mystery box.");
                    }
                }
            };
            player.getWorld().addEvent(event);
            break;
        case 19564: // Royal seed pod
            if (!player.getController().canTeleport(30, true)) {
                break;
            }
            player.getMovement().animatedTeleport(new Tile(2465, 3495), 4544, 4546, new Graphic(767), new Graphic(769),
                    2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 5509: // Small pouch
        case 5510: // Medium pouch
        case 5511: // Medium pouch
        case 5512: // Large pouch
        case 5513: // Large pouch
        case 5514: // Giant pouch
        case 5515: // Giant pouch
            if (index == 0) {
                int pureEssenceCount = player.getInventory().getCount(7936);
                int addingAmount = player.getWidgetManager().getRCPouch(itemID).canAddAmount(7936, pureEssenceCount);
                if (pureEssenceCount == 0) {
                    player.getGameEncoder().sendMessage("You have no pure essence.");
                    break;
                } else if (addingAmount == 0) {
                    player.getGameEncoder().sendMessage(
                            "Your " + player.getWidgetManager().getRCPouch(itemID).getName() + " is full.");
                    break;
                }
                player.getInventory().deleteItem(7936, addingAmount);
                player.getWidgetManager().getRCPouch(itemID).addItem(7936, addingAmount);
            } else if (index == 1) {
                int pureEssenceCount = player.getWidgetManager().getRCPouch(itemID).getCount(7936);
                int addingAmount = player.getInventory().canAddAmount(7936, pureEssenceCount);
                player.getWidgetManager().getRCPouch(itemID).deleteItem(7936, addingAmount);
                player.getInventory().addItem(7936, addingAmount);
            } else if (index == 2) {
                int pureEssenceCount = player.getWidgetManager().getRCPouch(itemID).getCount(7936);
                player.getGameEncoder().sendMessage("Your " + player.getWidgetManager().getRCPouch(itemID).getName()
                        + " contains " + Utils.formatNumber(pureEssenceCount) + " pure essence.");
            }
            break;
        case ItemID.PURPLE_SWEETS_4561:
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.PURPLE_SWEETS, 1, slot);
            break;
        case ItemID.CLUE_SCROLL_EASY_2713:
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.CORPOREAL_BEAST_TASKS_32301, 1, slot);
            break;
        case ItemID.CORPOREAL_BEAST_TASKS_32301:
            if (player.getSlayer().isUnlocked(Slayer.CORPOREAL_BEAST)) {
                player.getSlayer().lock(Slayer.CORPOREAL_BEAST);
                player.getGameEncoder().sendMessage("You can no longer be assigned Corporeal Beast boss tasks.");
            } else {
                player.getSlayer().unlock(Slayer.CORPOREAL_BEAST);
                player.getGameEncoder().sendMessage("You can now be assigned Corporeal Beast boss tasks.");
            }
            break;
        case ItemID.LOOTING_BAG:
        case ItemID.LOOTING_BAG_22586:
            if (index == 0) {
                player.getInventory().deleteItem(itemID, 1, slot);
                if (itemID == ItemID.LOOTING_BAG) {
                    player.getInventory().addItem(ItemID.LOOTING_BAG_22586, 1, slot);
                } else {
                    player.getInventory().addItem(ItemID.LOOTING_BAG, 1, slot);
                }
            } else if (index == 1) {
                player.getWidgetManager().initLootingBag();
                player.getWidgetManager().getLootingBag().displayItemList();
            } else if (index == 2) {
                player.getWidgetManager().initLootingBag();
                if (!player.getController().inWilderness() && !player.getController().inPvPWorld()) {
                    player.getGameEncoder()
                            .sendMessage("You can't put items in the bag unless you're in the Wilderness.");
                    break;
                }
                player.getWidgetManager().sendInventoryOverlay(WidgetID.LOOTING_BAG_DEPOSIT);
                player.getGameEncoder().sendScript(495, 1, "Looting bag");
                player.getGameEncoder().sendWidgetSettings(WidgetID.LOOTING_BAG_DEPOSIT, 5, 0,
                        player.getInventory().capacity() - 1, 1086);
                player.getInventory().setUpdate(true);
            } else if (index == 3) {
                player.openDialogue("lootingbag", 1);
            }
            break;
        case 12789: // Clue box
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(2677, 1).setWeight(8) /* Clue scroll (easy) */,
                new RandomItem(2801, 1).setWeight(6) /* Clue scroll (medium) */,
                new RandomItem(2722, 1).setWeight(4) /* Clue scroll (hard) */,
                new RandomItem(12073, 1).setWeight(2) /* Clue scroll (elite) */,
                new RandomItem(19835, 1).setWeight(1) /* Clue scroll (master) */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            if (Utils.randomE(4) == 0) {
                player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            }
            break;
        case 21730: // Black tourmaline core
            player.getGameEncoder().sendMessage(
                    "Fallen from the centre of a Grotesque Guardian. This could be attached to a pair of Bandos boots...");
            break;
        case 13256: // Saradomin's light
            if (player.getCombat().getSaradominsLight()) {
                player.getGameEncoder().sendMessage("There is no reason to consume this.");
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getCombat().setSaradominsLight(true);
            player.getGameEncoder().sendMessage("You consume Saradomin's light.");
            player.getController().getVariable("saradomins_light");
            break;
        case 8015: // Bones to peaches
            int bonesCount = player.getInventory().getCount(526);
            int bigBonesCount = player.getInventory().getCount(532);
            if (bonesCount == 0 && bigBonesCount == 0) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().deleteItem(526, bonesCount);
            player.getInventory().deleteItem(532, bigBonesCount);
            player.getInventory().addItem(6883, bonesCount + bigBonesCount);
            break;
        case 12846: // Bounty teleport scroll
            if (player.getCombat().getBountyHunter().getTeleportUnlocked()) {
                player.getGameEncoder().sendMessage("You already have this spell unlocked.");
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getCombat().getBountyHunter().setTeleportUnlocked(true);
            player.getGameEncoder().sendMessage("You have unlocked the Teleport to Bounty Target spell.");
            break;
        case Hunter.BIRD_SNARE_ITEM:
        case Hunter.BOX_TRAP_ITEM:
            player.getHunter().layTrap(itemID, null);
            break;
        case 748: // Legends Quest Holy force
            if (player.getCombat().getLegendsQuest() == 2 && player.getX() >= 2387 && player.getX() <= 2397
                    && player.getY() >= 4673 && player.getY() <= 4689
                    && player.getWorld().getTargetNPC(3962, player) == null) {
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getGameEncoder().sendMessage("You cast the spell, clensing the water.");
                player.getPrayer().adjustPoints(-99);
                Npc nezikchened = new Npc(player.getController(), 3962, new Tile(2396, 4678, player.getHeight()));
                nezikchened.setForceMessage("Now I am revealed to you, so shall ye perish.");
                nezikchened.getCombat().setTarget(player);
            } else {
                player.getGameEncoder().sendMessage("Nothing interesting happens.");
            }
            break;
        case 12641: // Amylase pack
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(12640, 100, slot);
            break;
        case 11738: // Herb box
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(199, 1) /* Guam */, new RandomItem(201, 1) /* Marrentill */,
                new RandomItem(203, 1) /* Tarromin */, new RandomItem(205, 1) /* Harralander */,
                new RandomItem(207, 1) /* Ranaar */, new RandomItem(3049, 1) /* Toadflax */,
                new RandomItem(209, 1) /* Irit */, new RandomItem(211, 1) /* Avantoe */,
                new RandomItem(213, 1) /* Kwuarm */, new RandomItem(3051, 1) /* Snapdragon */,
                new RandomItem(215, 1) /* Cadantine */, new RandomItem(2485, 1) /* Lantadyme */,
                new RandomItem(217, 1) /* Dwarf weed */, new RandomItem(219, 1) /* Torstol */
            };
            for (int i = 0; i < 30; i++) {
                Item herbItem = RandomItem.getItem(randomItems);
                player.getInventory().addOrDropItem(herbItem.getNotedID(), herbItem.getAmount());
            }
            break;
        case ItemID.BAR_BOX_32302:
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(2364, 1) /* Runite bar */, new RandomItem(2362, 1) /* Adamantite bar */,
                new RandomItem(2360, 1) /* Mithril bar */, new RandomItem(2354, 1) /* Steel bar */,
                new RandomItem(2352, 1) /* Iron bar */, new RandomItem(2350, 1) /* Bronze bar */
            };
            for (int i = 0; i < 15; i++) {
                Item barItem = RandomItem.getItem(randomItems);
                player.getInventory().addOrDropItem(barItem.getNotedID(), barItem.getAmount());
            }
            break;
        case ItemID.BAG_FULL_OF_GEMS:
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(ItemID.UNCUT_OPAL, 1, 4).setWeight(1024),
                new RandomItem(ItemID.UNCUT_JADE, 1, 4).setWeight(1024),
                new RandomItem(ItemID.UNCUT_RED_TOPAZ, 1, 4).setWeight(1024),
                new RandomItem(ItemID.UNCUT_SAPPHIRE, 1, 4).setWeight(1024),
                new RandomItem(ItemID.UNCUT_EMERALD, 1, 4).setWeight(1024),
                new RandomItem(ItemID.UNCUT_RUBY, 1, 4).setWeight(1024),
                new RandomItem(ItemID.UNCUT_DIAMOND, 1, 4).setWeight(1024),
                new RandomItem(ItemID.UNCUT_DRAGONSTONE, 1).setWeight(32),
                new RandomItem(ItemID.UNCUT_ONYX, 1).setWeight(8), new RandomItem(ItemID.UNCUT_ZENYTE, 1).setWeight(1)
            };
            for (int i = 0; i < 20; i++) {
                Item gemItem = RandomItem.getItem(randomItems);
                player.getInventory().addOrDropItem(gemItem.getNotedID(), gemItem.getAmount());
            }
            break;
        case 21047: // Torn prayer scroll
            if (player.getPrayer().getPreserveUnlocked()) {
                player.getGameEncoder().sendMessage("You have already unlocked the prayer Preserve.");
                break;
            }
            player.getPrayer().setPreserveUnlocked(true);
            player.getInventory().deleteItem(itemID, 1, slot);
            break;
        case 21034: // Dexterous prayer scroll
            if (player.getPrayer().getRigourUnlocked()) {
                player.getGameEncoder().sendMessage("You have already unlocked the prayer Rigour.");
                break;
            }
            player.getPrayer().setRigourUnlocked(true);
            player.getInventory().deleteItem(itemID, 1, slot);
            break;
        case 21079: // Arcane prayer scroll
            if (player.getPrayer().getAuguryUnlocked()) {
                player.getGameEncoder().sendMessage("You have already unlocked the prayer Augury.");
                break;
            }
            player.getPrayer().setAuguryUnlocked(true);
            player.getInventory().deleteItem(itemID, 1, slot);
            break;
        case 21043: // Kodai insignia
            player.getGameEncoder().sendMessage("Insert buttplug meme.");
            break;
        case 1856: // Guide book
            player.openDialogue("guidebook", 0);
            break;
        case 13249: // Key master teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(1310, 1250), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 8007: // Varrock teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(3213, 3423), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 8008: // Lumbridge teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(3221, 3218), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 8009: // Falador teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(2965, 3379), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 8010: // Camelot teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(2725, 3485), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 8011: // Ardougne teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(2664, 3306), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 11742: // Taverley teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(2894, 3465), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 19625: // Harmony island teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(3797, 2866), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 11744: // Rellekka teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(2670, 3632), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 11747: // Trollheim teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(2829, 3685), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 6099: // Teleport crystal (4)
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(6100, 1, slot);
            player.getMovement().animatedTeleport(new Tile(2352, 3162), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 6100: // Teleport crystal (3)
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(6101, 1, slot);
            player.getMovement().animatedTeleport(new Tile(2352, 3162), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 6101: // Teleport crystal (2)
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(6102, 1, slot);
            player.getMovement().animatedTeleport(new Tile(2352, 3162), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 6102: // Teleport crystal (1)
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(6103, 1, slot);
            player.getMovement().animatedTeleport(new Tile(2352, 3162), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 8013: // Teleport to house
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            if ((player.inEdgeville() || player.getController().inWilderness()) && player.getClientHeight() == 0) {
                height = player.getHeight();
            }
            Tile homeTile = player.getWidgetManager().getHomeTile();
            if (height != 0) {
                homeTile = new Tile(World.DEFAULT_TILE).randomize(2);
                homeTile.setHeight(height);
            }
            if (player.getController().inPvPWorld()) {
                homeTile = new Tile(3093, 3495, height);
            }
            player.getMovement().animatedTeleport(homeTile, Magic.TABLET_ANIMATION_START, Magic.TABLET_ANIMATION_END,
                    -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 12781: // Paddewwa teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            if ((player.inEdgeville() || player.getController().inWilderness()) && player.getClientHeight() == 0) {
                height = player.getHeight();
            }
            player.getMovement().animatedTeleport(new Tile(3094, 3470, height), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 12779: // Kharyrll teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            if ((player.inEdgeville() || player.getController().inWilderness()) && player.getClientHeight() == 0) {
                height = player.getHeight();
            }
            player.getMovement().animatedTeleport(new Tile(3510, 3480, height), Magic.TABLET_ANIMATION_START,
                    Magic.TABLET_ANIMATION_END, -1, null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 12938: // Zul-andra teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(2212, 3056, 0), 3864, new Graphic(1039), 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 952: // Spade
            if (player.getCombat().getBarrows().ahrimMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.AHRIM_THE_BLIGHTED_98);
            } else if (player.getCombat().getBarrows().dharokMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.DHAROK_THE_WRETCHED_115);
            } else if (player.getCombat().getBarrows().guthanMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.GUTHAN_THE_INFESTED_115);
            } else if (player.getCombat().getBarrows().karilMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.KARIL_THE_TAINTED_98);
            } else if (player.getCombat().getBarrows().toragMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.TORAG_THE_CORRUPTED_115);
            } else if (player.getCombat().getBarrows().veracMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.VERAC_THE_DEFILED_115);
            }
            break;
        case 6543: // Antique lamp
            if (!player.isGameModeNormal()) {
                player.getGameEncoder().sendMessage("You can't use this.");
                break;
            }
            player.openDialogue("bloodylamp", 0);
            int herbloreXP = (int) (12.5 * (player.getController().getLevelForXP(Skills.HERBLORE)
                    * player.getController().getLevelForXP(Skills.HERBLORE)
                    - player.getController().getLevelForXP(Skills.HERBLORE) * 2 + 100) * 2);
            int miningXP = (int) (12.5 * (player.getController().getLevelForXP(Skills.MINING)
                    * player.getController().getLevelForXP(Skills.MINING)
                    - player.getController().getLevelForXP(Skills.MINING) * 2 + 100) * 2);
            int smithingXP = (int) (12.5 * (player.getController().getLevelForXP(Skills.SMITHING)
                    * player.getController().getLevelForXP(Skills.SMITHING)
                    - player.getController().getLevelForXP(Skills.SMITHING) * 2 + 100) * 2);
            Dialogue.setText(player, null, Utils.formatNumber(herbloreXP) + " Herblore XP",
                    Utils.formatNumber(miningXP) + " Mining XP", Utils.formatNumber(smithingXP) + " Smithing XP");
            break;
        case 4447: // Antique lamp
            if (!player.isGameModeNormal()) {
                player.getGameEncoder().sendMessage("You can't use this.");
                break;
            }
            player.openDialogue("combatlamp", 4);
            break;
        case 10586: // Combat lamp
            if (!player.isGameModeNormal()) {
                player.getGameEncoder().sendMessage("You can't use this.");
                break;
            }
            player.openDialogue("combatlamp", 0);
            break;
        case 10889: // Blessed lamp
            if (!player.isGameModeNormal()) {
                player.getGameEncoder().sendMessage("You can't use this.");
                break;
            }
            player.openDialogue("combatlamp", 3);
            break;
        case 9656: // Tome of xp (3)
        case 9657: // Tome of xp (2)
        case 9658: // Tome of xp (1)
            if (!player.isGameModeNormal()) {
                player.getGameEncoder().sendMessage("You can't use this.");
                break;
            }
            player.openDialogue("combatlamp", 1);
            break;
        case ItemID.OLD_SCHOOL_BOND:
            if (index == 0) {
                Guide.openEntry(player, "main", "bonds");
                player.getGameEncoder().sendMessage("Deposit this bond in your pouch to use it.");
            } else if (index == 2) {
                player.getInventory().deleteItem(itemID, 1, slot);
                player.setBondPouch(Utils.addInt(player.getBondPouch(), 1, Item.MAX_AMOUNT));
                player.getGameEncoder().sendMessage("1 bond has been added to your pouch.");
            }
            break;
        case ItemID.OLD_SCHOOL_BOND_UNTRADEABLE:
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID._14_DAYS_GOLD_MEMBERSHIP_32303, 1, slot);
            break;
        case ItemID._14_DAYS_GOLD_MEMBERSHIP_32303:
            player.openDialogue("bond", 0);
            break;
        case 12791: // Rune pouch
            if (index == 0) {
                player.getMagic().openRunePouch();
            } else if (index == 3) {
                player.getMagic().removeRunesFromPouch(0, Magic.MAX_RUNE_POUCH_AMOUNT);
                player.getMagic().removeRunesFromPouch(1, Magic.MAX_RUNE_POUCH_AMOUNT);
                player.getMagic().removeRunesFromPouch(2, Magic.MAX_RUNE_POUCH_AMOUNT);
            }
            break;
        case 20164: // Large spade
            if (player.getCombat().getBarrows().ahrimMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.AHRIM_THE_BLIGHTED_98);
            } else if (player.getCombat().getBarrows().dharokMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.DHAROK_THE_WRETCHED_115);
            } else if (player.getCombat().getBarrows().guthanMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.GUTHAN_THE_INFESTED_115);
            } else if (player.getCombat().getBarrows().karilMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.KARIL_THE_TAINTED_98);
            } else if (player.getCombat().getBarrows().toragMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.TORAG_THE_CORRUPTED_115);
            } else if (player.getCombat().getBarrows().veracMound()) {
                player.getCombat().getBarrows().enterCrypt(NpcID.VERAC_THE_DEFILED_115);
            }
            break;
        case 4566: // Rubber chicken
            player.setAnimation(1835);
            break;
        case 11908: // Uncharged trident
        case 11905: // Trident of the seas (full)
        case 22290: // Uncharged trident (e)
            player.getGameEncoder()
                    .sendMessage("Each charge requires 1 death rune, 1 chaos rune, 5 fire runes and 10 coins.");
            break;
        case 12900: // Uncharged toxic trident
            if (index == 2) {
                player.getGameEncoder().sendMessage(
                        "Each charge requires 1 death rune, 1 chaos rune, 5 fire runes, 10 coins and 1 Zulrah's scale.");
            } else if (index == 3) {
                if (player.getInventory().getRemainingSlots() < 1) {
                    player.getInventory().notEnoughSpace();
                    break;
                }
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(11908, 1);
                player.getInventory().addItem(12932, 1);
            }
            break;
        case 22294: // Uncharged toxic trident (e)
            if (index == 2) {
                player.getGameEncoder().sendMessage(
                        "Each charge requires 1 death rune, 1 chaos rune, 5 fire runes, 10 coins and 1 Zulrah's scale.");
            } else if (index == 3) {
                if (player.getInventory().getRemainingSlots() < 1) {
                    player.getInventory().notEnoughSpace();
                    break;
                }
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(22290, 1);
                player.getInventory().addItem(12932, 1);
            }
            break;
        case 11864: // Slayer helmet
        case 11865: // Slayer helmet (i)
        case 19639: // Black slayer helmet
        case 19641: // Black slayer helmet (i)
        case 19643: // Green slayer helmet
        case 19645: // Green slayer helmet (i)
        case 19647: // Red slayer helmet
        case 19649: // Red slayer helmet (i)
        case 21264: // Purple slayer helmet
        case 21266: // Purple slayer helmet (i)
        case 21888: // Turquoise slayer helmet
        case 21890: // Turquoise slayer helmet (i)
        case ItemID.HYDRA_SLAYER_HELMET:
        case ItemID.HYDRA_SLAYER_HELMET_I:
            player.getSlayer().sendTask();
            break;
        case 9753: // Defence cape
        case 9754: // Defence cape (t)
            player.getEquipment().setDefenceCapeEffect(!player.getEquipment().getDefenceCapeEffect());
            player.getGameEncoder().sendMessage("Ring of life: " + player.getEquipment().getDefenceCapeEffect());
            break;
        case 5521: // Binding necklace
            player.getGameEncoder().sendMessage(
                    "Your Binding Necklace has " + player.getSkills().getBindingNecklace() + " charges remaining.");
            break;
        case 11866: // Slayer ring (8)
        case 11867: // Slayer ring (7)
        case 11868: // Slayer ring (6)
        case 11869: // Slayer ring (5)
        case 11870: // Slayer ring (4)
        case 11871: // Slayer ring (3)
        case 11872: // Slayer ring (2)
        case 11873: // Slayer ring (1)
        case 21268: // Slayer ring (eternal)
            if (index == 2) {
                player.putAttribute("slayer_ring_slot", slot);
                player.openDialogue("slayer", 5);
            } else if (index == 3) {
                player.getCharges().checkCharges(slot);
            }
            break;
        case 11238: // Baby impling jar
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(1755, 1) /* Chisel */, new RandomItem(1734, 1) /* Thread */,
                new RandomItem(946, 1) /* Knife */, new RandomItem(1985, 1) /* Cheese */,
                new RandomItem(2347, 1) /* Hammer */, new RandomItem(1759, 1) /* Ball of wool */,
                new RandomItem(1927, 1) /* Bucket of milk */, new RandomItem(319, 1) /* Anchovies */,
                new RandomItem(2007, 1) /* Spice */, new RandomItem(1779, 1) /* Flax */,
                new RandomItem(7170, 1) /* Mud pie */, new RandomItem(401, 1) /* Seaweed */,
                new RandomItem(1438, 1) /* Air talisman */, new RandomItem(2355, 1) /* Silver bar */,
                new RandomItem(1607, 1) /* Sapphire */, new RandomItem(1743, 1) /* Hard leather */,
                new RandomItem(379, 1) /* Lobster */, new RandomItem(1761, 1) /* Soft clay */,
                new RandomItem(2677, 1, 1).setWeight(4) /* Clue scroll (easy) */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 11240: // Young impling jar
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(1539, 5) /* Steel nails */, new RandomItem(1901, 1) /* Chocolate slice */,
                new RandomItem(7936, 1) /* Pure essence */, new RandomItem(1523, 1) /* Lockpick */,
                new RandomItem(361, 1) /* Tuna */, new RandomItem(453, 1) /* Coal */,
                new RandomItem(1777, 1) /* Bow string */, new RandomItem(1353, 1) /* Steel axe */,
                new RandomItem(1157, 1) /* Steel full helm */, new RandomItem(1097, 1) /* Studded chaps */,
                new RandomItem(2293, 1) /* Meat pizza */, new RandomItem(247, 1) /* Jangerberries */,
                new RandomItem(2677, 1, 1).setWeight(4) /* Clue scroll (easy) */,
                new RandomItem(2359, 1) /* Mithril bar */, new RandomItem(231, 1) /* Snape grass */,
                new RandomItem(2432, 1) /* Defence potion(4) */, new RandomItem(855, 1) /* Yew longbow */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 11242: // Gourmet impling jar
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(365, 1) /* Bass */, new RandomItem(361, 1) /* Tuna */,
                new RandomItem(2011, 1) /* Curry */, new RandomItem(2327, 1) /* Meat pie */,
                new RandomItem(1897, 1) /* Chocolate cake */, new RandomItem(5004, 1) /* Frog spawn */,
                new RandomItem(2007, 1) /* Spice */, new RandomItem(5970, 1) /* Curry leaf */,
                new RandomItem(2677, 1, 1).setWeight(4) /* Clue scroll (easy) */,
                new RandomItem(1883, 1) /* Ugthanki kebab */, new RandomItem(380, 4) /* Lobster (noted) */,
                new RandomItem(386, 3) /* Shark (noted) */, new RandomItem(7188, 1) /* Fish pie */,
                new RandomItem(7754, 1) /* Chef's delight */, new RandomItem(10137, 5) /* Rainbow fish (noted) */,
                new RandomItem(7179, 6) /* Garden pie (noted) */, new RandomItem(374, 3) /* Swordfish (noted) */,
                new RandomItem(5406, 1) /* Strawberries(5) */, new RandomItem(3145, 2) /* Cooked karambwan (noted) */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 11244: // Earth impling jar
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(1442, 1) /* Fire talisman */, new RandomItem(1440, 1) /* Earth talisman */,
                new RandomItem(5535, 1) /* Earth tiara */, new RandomItem(557, 32) /* Earth rune */,
                new RandomItem(448, 1, 3) /* Mithril ore (noted) */, new RandomItem(237, 1) /* Unicorn horn */,
                new RandomItem(2353, 1) /* Steel bar */, new RandomItem(1273, 1) /* Mithril pickaxe */,
                new RandomItem(5311, 2) /* Wildblood seed */, new RandomItem(5104, 2) /* Jangerberry seed */,
                new RandomItem(6033, 6) /* Compost (noted) */, new RandomItem(6035, 2) /* Supercompost (noted) */,
                new RandomItem(1784, 4) /* Bucket of sand (noted) */, new RandomItem(5294, 2) /* Harralander seed */,
                new RandomItem(454, 2) /* Coal (noted) */, new RandomItem(444, 1) /* Gold ore */,
                new RandomItem(1622, 2) /* Uncut emerald (noted) */, new RandomItem(1606, 2) /* Emerald (noted) */,
                new RandomItem(1603, 1) /* Ruby */, new RandomItem(2801, 1, 1).setWeight(4) /* Clue scroll (medium) */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 11246: // Essence impling jar
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(7937, 20, 35) /* Pure essence (noted) */, new RandomItem(555, 30) /* Water rune */,
                new RandomItem(556, 30) /* Air rune */, new RandomItem(554, 50) /* Fire rune */,
                new RandomItem(558, 25) /* Mind rune */, new RandomItem(559, 28) /* Body rune */,
                new RandomItem(562, 4) /* Chaos rune */, new RandomItem(1448, 1) /* Mind talisman */,
                new RandomItem(4699, 4) /* Lava rune */, new RandomItem(4698, 4) /* Mud rune */,
                new RandomItem(4697, 4) /* Smoke rune */, new RandomItem(4694, 4) /* Steam rune */,
                new RandomItem(564, 4) /* Cosmic rune */, new RandomItem(560, 13) /* Death rune */,
                new RandomItem(563, 13) /* Law rune */, new RandomItem(565, 7) /* Blood rune */,
                new RandomItem(566, 11) /* Soul rune */, new RandomItem(561, 13) /* Nature rune */,
                new RandomItem(2801, 1, 1).setWeight(4) /* Clue scroll (medium) */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 11248: // Eclectic impling jar
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(1273, 1) /* Mithril pickaxe */, new RandomItem(1199, 1) /* Adamant kiteshield */,
                new RandomItem(2493, 1) /* Blue d'hide chaps */, new RandomItem(10083, 1) /* Red spiky vambs */,
                new RandomItem(1213, 1) /* Rune dagger */, new RandomItem(1391, 1) /* Battlestaff */,
                new RandomItem(5970, 1) /* Curry leaf */, new RandomItem(231, 1) /* Snape grass */,
                new RandomItem(556, 30, 57) /* Air rune */, new RandomItem(8779, 4) /* Oak plank (noted) */,
                new RandomItem(4529, 1) /* Candle lantern (empty) */, new RandomItem(444, 1) /* Gold ore */,
                new RandomItem(2358, 5) /* Gold bar (noted) */, new RandomItem(237, 1) /* Unicorn horn */,
                new RandomItem(450, 5) /* Adamantite ore (noted) */,
                new RandomItem(5760, 2) /* Slayer's respite (noted) */, new RandomItem(7208, 1) /* Wild pie */,
                new RandomItem(5321, 3) /* Watermelon seed */,
                new RandomItem(2801, 1, 1).setWeight(4) /* Clue scroll (medium) */,
                new RandomItem(1601, 1) /* Diamond */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 11250: // Nature impling jar
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(5100, 1) /* Limpwurt seed */, new RandomItem(5104, 1) /* Jangerberry seed */,
                new RandomItem(5281, 1) /* Belladonna seed */, new RandomItem(5294, 1) /* Harralander seed */,
                new RandomItem(6016, 1) /* Cactus spine */, new RandomItem(1513, 1) /* Magic logs */,
                new RandomItem(204, 4) /* Grimy tarromin (noted) */, new RandomItem(5286, 1) /* Curry tree seed */,
                new RandomItem(5285, 1) /* Orange tree seed */, new RandomItem(3051, 1) /* Grimy snapdragon */,
                new RandomItem(5974, 1) /* Coconut */, new RandomItem(5297, 1) /* Irit seed */,
                new RandomItem(5299, 1) /* Kwuarm seed */, new RandomItem(5298, 5) /* Avantoe seed */,
                new RandomItem(5313, 1) /* Willow seed */, new RandomItem(5304, 1) /* Torstol seed */,
                new RandomItem(5295, 1) /* Ranarr seed */,
                new RandomItem(2722, 1, 1).setWeight(4) /* Clue scroll (hard) */,
                new RandomItem(220, 2) /* Grimy Torstol (noted) */, new RandomItem(5303, 1) /* Dwarf weed seed */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 11252: // Magpie impling jar
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(1701, 3) /* Diamond amulet (noted) */,
                new RandomItem(1732, 3) /* Amulet of power (noted) */,
                new RandomItem(2569, 3) /* Ring of forging (noted) */,
                new RandomItem(3391, 1) /* Splitbark gauntlets */, new RandomItem(4097, 1) /* Mystic boots */,
                new RandomItem(4095, 1) /* Mystic gloves */, new RandomItem(1347, 1) /* Rune warhammer */,
                new RandomItem(2571, 4) /* Ring of life (noted) */, new RandomItem(1185, 1) /* Rune sq shield */,
                new RandomItem(1215, 1) /* Dragon dagger */, new RandomItem(5541, 1) /* Nature tiara */,
                new RandomItem(1748, 6) /* Black dragonhide (noted) */,
                new RandomItem(2722, 1, 1).setWeight(4) /* Clue scroll (hard) */,
                new RandomItem(2364, 2) /* Runite bar (noted) */, new RandomItem(1602, 4) /* Diamond (noted) */,
                new RandomItem(5287, 1) /* Pineapple seed */, new RandomItem(987, 1) /* Loop half of key */,
                new RandomItem(985, 1) /* Tooth half of key */, new RandomItem(993, 1) /* Sinister key */,
                new RandomItem(5300, 1) /* Snapdragon seed */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 11254: // Ninja impling jar
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(6328, 1) /* Snakeskin boots */, new RandomItem(3391, 1) /* Splitbark gauntlets */,
                new RandomItem(4097, 1) /* Mystic boots */, new RandomItem(3385, 1) /* Splitbark helm */,
                new RandomItem(1113, 1) /* Rune chainbody */, new RandomItem(6313, 1) /* Opal machete */,
                new RandomItem(3101, 1) /* Rune claws */, new RandomItem(1333, 1) /* Rune scimitar */,
                new RandomItem(1347, 1) /* Rune warhammer */, new RandomItem(1215, 1) /* Dragon dagger */,
                new RandomItem(892, 70) /* Rune arrow */, new RandomItem(811, 70) /* Rune dart */,
                new RandomItem(868, 40) /* Rune knife */, new RandomItem(805, 50) /* Rune thrownaxe */,
                new RandomItem(9245, 2) /* Onyx bolts (e) */,
                new RandomItem(1748, 10, 16) /* Black dragonhide (noted) */,
                new RandomItem(140, 4) /* Prayer potion(3) (noted) */,
                new RandomItem(5941, 4) /* Weapon poison(++) (noted) */,
                new RandomItem(6156, 3) /* Dagannoth hide (noted) */,
                new RandomItem(2722, 1, 1).setWeight(4) /* Clue scroll (hard) */,
                new RandomItem(2364, 4) /* Runite bar (noted) */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 11256: // Dragon impling jar
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(11232, 100, 350) /* Dragon dart tip */,
                new RandomItem(11237, 100, 500) /* Dragon arrowtips */,
                new RandomItem(9193, 10, 49) /* Dragon bolt tips */,
                new RandomItem(19582, 25, 35) /* Dragon javelin heads */,
                new RandomItem(11212, 100, 500).setWeight(4) /* Dragon arrow */,
                new RandomItem(9244, 3, 40).setWeight(4) /* Dragon bolts (e) */,
                new RandomItem(11230, 100, 350).setWeight(4) /* Dragon dart */,
                new RandomItem(4093, 1, 1).setWeight(2) /* Mystic robe bottom */,
                new RandomItem(1713, 2, 3).setWeight(2) /* Amulet of glory(4) (noted) */,
                new RandomItem(1703, 2, 3).setWeight(2) /* Dragonstone amulet (noted) */,
                new RandomItem(1305, 1, 1).setWeight(2) /* Dragon longsword */,
                new RandomItem(5699, 3, 3).setWeight(2) /* Dragon dagger(p++) (noted) */,
                new RandomItem(535, 100, 300).setWeight(2) /* Babydragon bones (noted) */,
                new RandomItem(5316, 1, 1).setWeight(2) /* Magic seed */,
                new RandomItem(537, 50, 100).setWeight(2) /* Dragon bones (noted) */,
                new RandomItem(1616, 3, 6).setWeight(2) /* Dragonstone (noted) */,
                new RandomItem(5300, 5, 5).setWeight(2) /* Snapdragon seed */,
                new RandomItem(7219, 15, 15).setWeight(2) /* Summer pie (noted) */,
                new RandomItem(12073, 1, 1).setWeight(2) /* Clue scroll (elite) */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 19732: // Lucky impling jar
            player.getInventory().deleteItem(itemID, 1, slot);
            randomItems = new RandomItem[] {
                new RandomItem(2677, 1, 1).setWeight(8) /* Clue scroll (easy) */,
                new RandomItem(2801, 1, 1).setWeight(6) /* Clue scroll (medium) */,
                new RandomItem(2722, 1, 1).setWeight(4) /* Clue scroll (hard) */,
                new RandomItem(12073, 1, 1).setWeight(2) /* Clue scroll (elite) */,
                new RandomItem(19835, 1, 1).setWeight(1) /* Clue scroll (master) */
            };
            player.getInventory().addOrDropItem(RandomItem.getItem(randomItems));
            break;
        case 19675: // Arclight
        case 13241: // Infernal axe
        case 21031: // Infernal harpoon
        case 13243: // Infernal pickaxe
        case 21255: // Slayer's staff (e)
        case 32254: // Vesta's longsword
        case 32256: // Statius's warhammer
        case 32258: // Vesta's spear
        case 32262: // Zuriel's staff
        case 32264: // Vesta's longsword (deg)
        case 32265: // Statius's warhammer (deg)
        case 32266: // Vesta's spear (deg)
        case 32269: // Zuriel's staff (deg)
        case 32270: // Corrupt vesta's longsword
        case 32272: // Corrupt statius's warhammer
        case 32274: // Corrupt vesta's spear
        case 32278: // Corrupt zuriel's staff
        case 32280: // C. vesta's longsword (deg)
        case 32281: // C. statius's warhammer (deg)
        case 32282: // C. vesta's spear (deg)
        case 32285: // C. zuriel's staff (deg)
            player.getCharges().checkCharges(slot);
            break;
        case 22545: // Viggora's chainmace
            if (index == 2) {
                player.getCharges().checkCharges(slot);
            } else if (index == 4) {
                if (player.getInventory().getRemainingSlots() < 1) {
                    player.getInventory().notEnoughSpace();
                    break;
                }
                player.getInventory().addItem(21820, item.getCharges());
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(22542, 1, slot);
            }
            break;
        case 22550: // Craw's bow
            if (index == 2) {
                player.getCharges().checkCharges(slot);
            } else if (index == 4) {
                if (player.getInventory().getRemainingSlots() < 1) {
                    player.getInventory().notEnoughSpace();
                    break;
                }
                player.getInventory().addItem(21820, item.getCharges());
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(22547, 1, slot);
            }
            break;
        case 22555: // Thammaron's sceptre
            if (index == 2) {
                player.getCharges().checkCharges(slot);
            } else if (index == 4) {
                if (player.getInventory().getRemainingSlots() < 1) {
                    player.getInventory().notEnoughSpace();
                    break;
                }
                player.getInventory().addItem(21820, item.getCharges());
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(22552, 1, slot);
            }
            break;
        case 12899: // Trident of the swamp
        case 22292: // Trident of the swamp (e)
            if (index == 2) {
                player.getCharges().checkCharges(slot);
            } else if (index == 3) {
                player.getCharges().unloadToxicTrident(slot);
            }
            break;
        case 22323: // Sanguinesti staff
            if (index == 2) {
                player.getCharges().checkCharges(slot);
            } else if (index == 3) {
                player.getGameEncoder().sendMessage("This is charged with blood runes.");
            } else if (index == 4) {
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(22481, 1, slot);
            }
            break;
        case 11907: // Trident of the seas
            if (index == 2) {
                player.getCharges().checkCharges(slot);
            } else if (index == 3) {
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(11908, 1, slot);
            }
            break;
        case 22288: // Trident of the seas (e)
            if (index == 2) {
                player.getCharges().checkCharges(slot);
            } else if (index == 3) {
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(22290, 1, slot);
            }
            break;
        case 22325: // Scythe of vitur
            if (index == 2) {
                player.getCharges().checkCharges(slot);
            } else if (index == 3) {
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(22486, 1, slot);
            }
            break;
        case 21816: // Bracelet of ethereum
            if (index == 2) {
                player.getCharges().checkCharges(slot);
            } else if (index == 3) {
                player.getCharges().setEthereumAutoAbsorb(!player.getCharges().getEthereumAutoAbsorb());
                player.getGameEncoder()
                        .sendMessage("Ether automatic absorption: " + player.getCharges().getEthereumAutoAbsorb());
            } else if (index == 4) {
                if (player.getInventory().getRemainingSlots() < 1) {
                    player.getInventory().notEnoughSpace();
                    break;
                }
                player.getInventory().addItem(21820, item.getCharges());
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(21817, 1, slot);
            }
            break;
        case 21817: // Bracelet of ethereum (uncharged)
            if (index == 2) {
                player.getCharges().setEthereumAutoAbsorb(!player.getCharges().getEthereumAutoAbsorb());
                player.getGameEncoder()
                        .sendMessage("Ether automatic absorption: " + player.getCharges().getEthereumAutoAbsorb());
            } else if (index == 3) {
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(21820, 250, slot);
            }
            break;
        case 20714: // Tome of fire
            if (index == 2) {
                player.getGameEncoder().sendMessage("This book has unlimited charges.");
            } else if (index == 3) {
                if (player.getInventory().getRemainingSlots() < 1) {
                    player.getInventory().notEnoughSpace();
                    break;
                }
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(20716, 1, slot);
                player.getInventory().addItem(20718, 10);
            }
            break;
        case 7510: // Dwarven rock cake
            player.putAttribute("guzzle_dwarven_rock_cake", true);
            player.getWidgetManager().removeInteractiveWidgets();
            player.getSkills().eatFood(slot);
            break;
        case 12904: // Toxic staff of the dead
            if (index == 2) {
                player.getCharges().checkToxicStaff(slot);
            } else if (index == 4) {
                player.getCharges().unloadToxicStaff(slot);
            }
            break;
        case 12926: // Toxic blowpipe
            if (index == 2) {
                player.getCharges().checkToxicBlowpipe(slot);
            } else if (index == 3) {
                player.getCharges().unloadToxicBlowpipe(slot, false);
            } else if (index == 4) {
                player.getCharges().unloadToxicBlowpipe(slot, true);
            }
            break;
        case 12931: // Serpentine helm
        case 13197: // Tanzanite helm
        case 13199: // Magma helm
            if (index == 2) {
                player.getCharges().checkSerpentineHelm(slot);
            } else if (index == 4) {
                player.getCharges().unloadSerpentineHelm(slot);
            }
            break;
        case 12785: // Ring of wealth (i)
            if (index == 2) {
                Guide.openEntry(player, "main", "bonds");
            } else if (index == 3) {
                player.openDialogue("ringwealth", 0);
            }
            break;
        case 22481: // Sanguinesti staff (uncharged)
            player.getGameEncoder().sendMessage("This is charged with blood runes.");
            break;
        case 22486: // Scythe of vitur (uncharged)
            player.getGameEncoder().sendMessage("This is charged with vials of blood and blood runes.");
            break;
        case ItemID.TOXIC_STAFF_UNCHARGED:
            if (player.getInventory().getRemainingSlots() < 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(ItemID.STAFF_OF_THE_DEAD, 1, slot);
            player.getInventory().addItem(ItemID.MAGIC_FANG, 1);
            break;
        case ItemID.RING_OF_SUFFERING_I:
        case ItemID.SEERS_RING_I:
        case ItemID.ARCHERS_RING_I:
        case ItemID.WARRIOR_RING_I:
        case ItemID.BERSERKER_RING_I:
        case ItemID.TYRANNICAL_RING_I:
        case ItemID.TREASONOUS_RING_I:
        case ItemID.RING_OF_THE_GODS_I:
        case ItemID.BLACK_MASK_10_I:
        case ItemID.DRAGON_CHAINBODY_G:
        case ItemID.DRAGON_PLATELEGS_G:
        case ItemID.DRAGON_PLATESKIRT_G:
        case ItemID.DRAGON_SQ_SHIELD_G:
        case ItemID.DRAGON_SCIMITAR_OR:
        case ItemID.DRAGON_DEFENDER_T:
        case ItemID.DARK_INFINITY_HAT:
        case ItemID.DARK_INFINITY_TOP:
        case ItemID.DARK_INFINITY_BOTTOMS:
        case ItemID.LIGHT_INFINITY_HAT:
        case ItemID.LIGHT_INFINITY_TOP:
        case ItemID.LIGHT_INFINITY_BOTTOMS:
        case ItemID.AMULET_OF_FURY_OR:
        case ItemID.AMULET_OF_TORTURE_OR:
        case ItemID.OCCULT_NECKLACE_OR:
        case ItemID.DRAGON_FULL_HELM_G:
        case ItemID.ARMADYL_GODSWORD_OR:
        case ItemID.BANDOS_GODSWORD_OR:
        case ItemID.SARADOMIN_GODSWORD_OR:
        case ItemID.ZAMORAK_GODSWORD_OR:
        case ItemID.DRAGON_BOOTS_G:
        case ItemID.DRAGON_PLATEBODY_G:
        case ItemID.DRAGON_KITESHIELD_G:
        case ItemID.NECKLACE_OF_ANGUISH_OR:
        case ItemID.ODIUM_WARD_12807:
        case ItemID.MALEDICTION_WARD_12806:
        case ItemID.RUNE_DEFENDER_T:
        case ItemID.TZHAAR_KET_OM_T:
        case ItemID.BERSERKER_NECKLACE_OR:
        case ItemID.RUNE_SCIMITAR_23330:
        case ItemID.RUNE_SCIMITAR_23332:
        case ItemID.RUNE_SCIMITAR_23334:
        case ItemID.TORMENTED_BRACELET_OR:
            if (item.getDef().getExchangeIDs() == null) {
                break;
            } else if (player.getInventory().getRemainingSlots() < item.getDef().getExchangeIDs().length - 1) {
                player.getInventory().notEnoughSpace();
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            for (int exchangeID : item.getDef().getExchangeIDs()) {
                player.getInventory().addItem(exchangeID, 1, slot);
            }
            break;
        case ItemID.AIR_TALISMAN:
        case ItemID.EARTH_TALISMAN:
        case ItemID.FIRE_TALISMAN:
        case ItemID.WATER_TALISMAN:
        case ItemID.BODY_TALISMAN:
        case ItemID.MIND_TALISMAN:
        case ItemID.CHAOS_TALISMAN:
        case ItemID.COSMIC_TALISMAN:
        case ItemID.DEATH_TALISMAN:
        case ItemID.NATURE_TALISMAN:
        case ItemID.WRATH_TALISMAN:
            Runecrafting.talismanTeleport(player, Runecrafting.Altar.getByTalisman(itemID));
            break;
        case 5516: // Elemental talisman
            player.openDialogue("runecrafting", 0);
            break;
        case 21802: // Revenant cave teleport
            if (!player.getController().canTeleport(true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(new Tile(3128, 3832, 0), 3864, new Graphic(1039), 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 10014: // Black warlock
        case 10016: // Snowy knight
        case 10018: // Sapphire glacialis
        case 10020: // Ruby harvest
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(10012, 1, slot);
            break;
        case 2550: // Ring of recoil
            player.getCharges().setRingOfRecoil(ItemCharges.RING_OF_RECOIL);
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getGameEncoder().sendMessage("Your Ring of Recoil has shattered.");
            break;
        case 13119: // Falador shield 3
        case 13120: // Falador shield 4
            if (!player.inMoleLair()) {
                player.getGameEncoder().sendMessage("You need to be in the Mole Lair to do this.");
                break;
            }
            Npc mole = player.getWorld().getNPC(5779, player);
            if (mole == null) {
                player.getGameEncoder().sendMessage("Unable to locate the Giant mole.");
                break;
            }
            player.getGameEncoder().sendHintIconTile(mole);
            event = new Event(16) {
                @Override
                public void execute() {
                    stop();
                    if (!player.isVisible()) {
                        return;
                    }
                    player.getGameEncoder().sendHintIconReset();
                }
            };
            player.getWorld().addEvent(event);
            break;
        case 12776: // Carrallangar teleport
            if ((player.inEdgeville() || player.getController().inWilderness()) && player.getClientHeight() == 0) {
                height = player.getHeight();
            }
            tile = new Tile(3175, 3669, height);
            if (!player.getController().canTeleport(tile, true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(tile, Magic.TABLET_ANIMATION_START, Magic.TABLET_ANIMATION_END, -1,
                    null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 12777: // Dareeyak teleport
            if ((player.inEdgeville() || player.getController().inWilderness()) && player.getClientHeight() == 0) {
                height = player.getHeight();
            }
            tile = new Tile(2968, 3695, height);
            if (!player.getController().canTeleport(tile, true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(tile, Magic.TABLET_ANIMATION_START, Magic.TABLET_ANIMATION_END, -1,
                    null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 12775: // Annakarl teleport
            if ((player.inEdgeville() || player.getController().inWilderness()) && player.getClientHeight() == 0) {
                height = player.getHeight();
            }
            tile = new Tile(3290, 3886, height);
            if (!player.getController().canTeleport(tile, true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(tile, Magic.TABLET_ANIMATION_START, Magic.TABLET_ANIMATION_END, -1,
                    null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 12778: // Ghorrock teleport
            if ((player.inEdgeville() || player.getController().inWilderness()) && player.getClientHeight() == 0) {
                height = player.getHeight();
            }
            tile = new Tile(2974, 3873, height);
            if (!player.getController().canTeleport(tile, true)) {
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getMovement().animatedTeleport(tile, Magic.TABLET_ANIMATION_START, Magic.TABLET_ANIMATION_END, -1,
                    null, Magic.TABLET_GRAPHIC, null, 0, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
            break;
        case 1704: // Amulet of glory
        case 1706: // Amulet of glory(1)
        case 1708: // Amulet of glory(2)
        case 1710: // Amulet of glory(3)
        case 1712: // Amulet of glory(4)
        case 10362: // Amulet of glory (t)
        case 10360: // Amulet of glory (t1)
        case 10358: // Amulet of glory (t2)
        case 10356: // Amulet of glory (t3)
        case 10354: // Amulet of glory (t4)
        case 19707: // Amulet of eternal glory
            player.openDialogue("amuletofglory", 0);
            break;
        case 3853: // Games necklace
            player.openDialogue("gamesnecklace", 0);
            break;
        case 20716: // Tome of fire (empty)
            if (player.getInventory().getCount(20718) < 10) {
                player.getGameEncoder().sendMessage("You need 10 burnt pages to do this.");
                break;
            }
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().deleteItem(20718, 10);
            player.getInventory().addItem(20714, 1, slot);
            break;
        case ItemID.ABYSSAL_TENTACLE:
            if (index == 3) {
                player.getCharges().checkCharges(slot);
            } else if (index == 4) {
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(ItemID.KRAKEN_TENTACLE, 1, slot);
            }
            break;
        case ItemID.SARAS_BLESSED_SWORD_FULL:
        case ItemID.SARADOMINS_BLESSED_SWORD:
            if (index == 2) {
                player.getCharges().checkCharges(slot);
            } else if (index == 4) {
                player.getInventory().deleteItem(itemID, 1, slot);
                player.getInventory().addItem(ItemID.SARADOMINS_TEAR, 1, slot);
                if (itemID == ItemID.SARAS_BLESSED_SWORD_FULL) {
                    player.getInventory().addOrDropItem(ItemID.SARADOMIN_SWORD, 1);
                }
            }
            break;
        case 12922: // Tanzanite fang
        case 12932: // Magic fang
        case 12927: // Serpentine visage
        case 12929: // Serpentine helm (uncharged)
        case 12924: // Toxic blowpipe (empty)
            player.getInventory().deleteItem(itemID, 1, slot);
            player.getInventory().addItem(12934, 20000);
            break;
        case 10146: // Orange salamander
        case 10147: // Red salamander
        case 10148: // Black salamander
        case 10149: // Swamp lizard
            player.getInventory().deleteItem(itemID, 1, slot);
            break;
        case ItemID.CLUE_SCROLL_EASY:
        case ItemID.CLUE_BOTTLE_EASY:
        case ItemID.CLUE_GEODE_EASY:
        case ItemID.CLUE_NEST_EASY:
            ttLoot = new int[] {
                ItemID.HOLY_BLESSING, ItemID.UNHOLY_BLESSING, ItemID.PEACEFUL_BLESSING, ItemID.HONOURABLE_BLESSING,
                ItemID.WAR_BLESSING, ItemID.ANCIENT_BLESSING, ItemID.WILLOW_COMP_BOW, ItemID.YEW_COMP_BOW,
                ItemID.MAGIC_COMP_BOW, ItemID.BEAR_FEET, ItemID.MOLE_SLIPPERS, ItemID.FROG_SLIPPERS, ItemID.DEMON_FEET,
                ItemID.SANDWICH_LADY_HAT, ItemID.SANDWICH_LADY_TOP, ItemID.SANDWICH_LADY_BOTTOM,
                ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_GUTHIX, ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_SARADOMIN,
                ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_ZAMORAK, ItemID.MONKS_ROBE_TOP_T, ItemID.MONKS_ROBE_T,
                ItemID.AMULET_OF_DEFENCE_T, ItemID.JESTER_CAPE, ItemID.SHOULDER_PARROT, ItemID.PURPLE_SWEETS
            };
            int[] ttEasy = new int[] {
                ItemID.BRONZE_FULL_HELM_T, ItemID.BRONZE_PLATEBODY_T, ItemID.BRONZE_PLATELEGS_T,
                ItemID.BRONZE_PLATESKIRT_T, ItemID.BRONZE_KITESHIELD_T, ItemID.BRONZE_FULL_HELM_G,
                ItemID.BRONZE_PLATEBODY_G, ItemID.BRONZE_PLATELEGS_G, ItemID.BRONZE_PLATESKIRT_G,
                ItemID.BRONZE_KITESHIELD_G, ItemID.IRON_FULL_HELM_T, ItemID.IRON_PLATEBODY_T, ItemID.IRON_PLATELEGS_T,
                ItemID.IRON_PLATESKIRT_T, ItemID.IRON_KITESHIELD_T, ItemID.IRON_FULL_HELM_G, ItemID.IRON_PLATEBODY_G,
                ItemID.IRON_PLATELEGS_G, ItemID.IRON_PLATESKIRT_G, ItemID.IRON_KITESHIELD_G, ItemID.STEEL_FULL_HELM_T,
                ItemID.STEEL_PLATEBODY_T, ItemID.STEEL_PLATELEGS_T, ItemID.STEEL_PLATESKIRT_T,
                ItemID.STEEL_KITESHIELD_T, ItemID.STEEL_FULL_HELM_G, ItemID.STEEL_PLATEBODY_G, ItemID.STEEL_PLATELEGS_G,
                ItemID.STEEL_PLATESKIRT_G, ItemID.STEEL_KITESHIELD_G, ItemID.BLACK_FULL_HELM_T,
                ItemID.BLACK_PLATEBODY_T, ItemID.BLACK_PLATELEGS_T, ItemID.BLACK_PLATESKIRT_T,
                ItemID.BLACK_KITESHIELD_T, ItemID.BLACK_FULL_HELM_G, ItemID.BLACK_PLATEBODY_G, ItemID.BLACK_PLATELEGS_G,
                ItemID.BLACK_PLATESKIRT_G, ItemID.BLACK_KITESHIELD_G, ItemID.BLACK_BERET, ItemID.BLUE_BERET,
                ItemID.WHITE_BERET, ItemID.RED_BERET, ItemID.HIGHWAYMAN_MASK, ItemID.BEANIE, ItemID.BLUE_WIZARD_HAT_T,
                ItemID.BLUE_WIZARD_ROBE_T, ItemID.BLUE_SKIRT_T, ItemID.BLUE_WIZARD_HAT_G, ItemID.BLUE_WIZARD_ROBE_G,
                ItemID.BLUE_SKIRT_G, ItemID.BLACK_WIZARD_HAT_T, ItemID.BLACK_WIZARD_ROBE_T, ItemID.BLACK_SKIRT_T,
                ItemID.BLACK_WIZARD_HAT_G, ItemID.BLACK_WIZARD_ROBE_G, ItemID.BLACK_SKIRT_G, ItemID.STUDDED_BODY_T,
                ItemID.STUDDED_CHAPS_T, ItemID.STUDDED_BODY_G, ItemID.STUDDED_CHAPS_G, ItemID.BLACK_HELM_H1,
                ItemID.BLACK_HELM_H2, ItemID.BLACK_HELM_H3, ItemID.BLACK_HELM_H4, ItemID.BLACK_HELM_H5,
                ItemID.BLACK_PLATEBODY_H1, ItemID.BLACK_PLATEBODY_H2, ItemID.BLACK_PLATEBODY_H3,
                ItemID.BLACK_PLATEBODY_H4, ItemID.BLACK_PLATEBODY_H5, ItemID.BLACK_SHIELD_H1, ItemID.BLACK_SHIELD_H2,
                ItemID.BLACK_SHIELD_H3, ItemID.BLACK_SHIELD_H4, ItemID.BLACK_SHIELD_H5, ItemID.BLUE_ELEGANT_SHIRT,
                ItemID.BLUE_ELEGANT_LEGS, ItemID.BLUE_ELEGANT_BLOUSE, ItemID.BLUE_ELEGANT_SKIRT,
                ItemID.GREEN_ELEGANT_SHIRT, ItemID.GREEN_ELEGANT_LEGS, ItemID.GREEN_ELEGANT_BLOUSE,
                ItemID.GREEN_ELEGANT_SKIRT, ItemID.RED_ELEGANT_SHIRT, ItemID.RED_ELEGANT_LEGS,
                ItemID.RED_ELEGANT_BLOUSE, ItemID.RED_ELEGANT_SKIRT, ItemID.BOBS_RED_SHIRT, ItemID.BOBS_BLUE_SHIRT,
                ItemID.BOBS_GREEN_SHIRT, ItemID.BOBS_BLACK_SHIRT, ItemID.BOBS_PURPLE_SHIRT, ItemID.STAFF_OF_BOB_THE_CAT,
                ItemID.A_POWDERED_WIG, ItemID.FLARED_TROUSERS, ItemID.PANTALOONS, ItemID.SLEEPING_CAP,
                ItemID.AMULET_OF_MAGIC_T, ItemID.AMULET_OF_POWER_T, ItemID.RAIN_BOW, ItemID.HAM_JOINT,
                ItemID.BLACK_CANE, ItemID.BLACK_PICKAXE, ItemID.GUTHIX_ROBE_TOP, ItemID.GUTHIX_ROBE_LEGS,
                ItemID.SARADOMIN_ROBE_TOP, ItemID.SARADOMIN_ROBE_LEGS, ItemID.ZAMORAK_ROBE_TOP,
                ItemID.ZAMORAK_ROBE_LEGS, ItemID.ANCIENT_ROBE_TOP, ItemID.BANDOS_ROBE_LEGS, ItemID.ARMADYL_ROBE_TOP,
                ItemID.ARMADYL_ROBE_LEGS, ItemID.IMP_MASK, ItemID.GOBLIN_MASK, ItemID.TEAM_CAPE_I, ItemID.TEAM_CAPE_X,
                ItemID.TEAM_CAPE_ZERO, ItemID.CAPE_OF_SKULLS, ItemID.WOODEN_SHIELD_G, ItemID.GOLDEN_CHEFS_HAT,
                ItemID.GOLDEN_APRON, ItemID.MONKS_ROBE_TOP_G, ItemID.MONKS_ROBE_G, ItemID.LARGE_SPADE
            };
            player.getInventory().deleteItem(itemID, 1, slot);
            int easyItemID = ttEasy[Utils.randomE(ttEasy.length)];
            player.getInventory().addItem(easyItemID, 1, slot);
            if (Utils.randomE(5) == 0) {
                int extraItemID = ttLoot[Utils.randomE(ttLoot.length)];
                if (extraItemID == ItemID.PURPLE_SWEETS) {
                    player.getInventory().addOrDropItem(extraItemID, 8 + Utils.randomI(24));
                } else {
                    player.getInventory().addOrDropItem(extraItemID, 1);
                }
            }
            player.getSkills().increaseClueScrollCount(Skills.CLUE_SCROLL_EASY);
            break;
        case ItemID.CLUE_SCROLL_MEDIUM:
        case ItemID.CLUE_BOTTLE_MEDIUM:
        case ItemID.CLUE_GEODE_MEDIUM:
        case ItemID.CLUE_NEST_MEDIUM:
            ttLoot = new int[] {
                ItemID.HOLY_BLESSING, ItemID.UNHOLY_BLESSING, ItemID.PEACEFUL_BLESSING, ItemID.HONOURABLE_BLESSING,
                ItemID.WAR_BLESSING, ItemID.ANCIENT_BLESSING, ItemID.WILLOW_COMP_BOW, ItemID.YEW_COMP_BOW,
                ItemID.MAGIC_COMP_BOW, ItemID.BEAR_FEET, ItemID.MOLE_SLIPPERS, ItemID.FROG_SLIPPERS, ItemID.DEMON_FEET,
                ItemID.SANDWICH_LADY_HAT, ItemID.SANDWICH_LADY_TOP, ItemID.SANDWICH_LADY_BOTTOM,
                ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_GUTHIX, ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_SARADOMIN,
                ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_ZAMORAK, ItemID.MONKS_ROBE_TOP_T, ItemID.MONKS_ROBE_T,
                ItemID.AMULET_OF_DEFENCE_T, ItemID.JESTER_CAPE, ItemID.SHOULDER_PARROT, ItemID.PURPLE_SWEETS
            };
            int[] ttMedium = new int[] {
                ItemID.MITHRIL_FULL_HELM_T, ItemID.MITHRIL_PLATEBODY_T, ItemID.MITHRIL_PLATELEGS_T,
                ItemID.MITHRIL_PLATESKIRT_T, ItemID.MITHRIL_KITESHIELD_T, ItemID.MITHRIL_FULL_HELM_G,
                ItemID.MITHRIL_PLATEBODY_G, ItemID.MITHRIL_PLATELEGS_G, ItemID.MITHRIL_PLATESKIRT_G,
                ItemID.MITHRIL_KITESHIELD_G, ItemID.ADAMANT_FULL_HELM_T, ItemID.ADAMANT_PLATEBODY_T,
                ItemID.ADAMANT_PLATELEGS_T, ItemID.ADAMANT_PLATESKIRT_T, ItemID.ADAMANT_KITESHIELD_T,
                ItemID.ADAMANT_FULL_HELM_G, ItemID.ADAMANT_PLATEBODY_G, ItemID.ADAMANT_PLATELEGS_G,
                ItemID.ADAMANT_PLATESKIRT_G, ItemID.ADAMANT_KITESHIELD_G, ItemID.CLIMBING_BOOTS_G,
                ItemID.SPIKED_MANACLES, ItemID.RANGER_BOOTS, ItemID.HOLY_SANDALS, ItemID.WIZARD_BOOTS,
                ItemID.BLACK_HEADBAND, ItemID.RED_HEADBAND, ItemID.BROWN_HEADBAND, ItemID.PINK_HEADBAND,
                ItemID.GREEN_HEADBAND, ItemID.BLUE_HEADBAND, ItemID.WHITE_HEADBAND, ItemID.GOLD_HEADBAND,
                ItemID.RED_BOATER, ItemID.ORANGE_BOATER, ItemID.GREEN_BOATER, ItemID.BLUE_BOATER, ItemID.BLACK_BOATER,
                ItemID.PINK_BOATER, ItemID.PURPLE_BOATER, ItemID.WHITE_BOATER, ItemID.GREEN_DHIDE_BODY_T,
                ItemID.GREEN_DHIDE_CHAPS_T, ItemID.GREEN_DHIDE_BODY_G, ItemID.GREEN_DHIDE_CHAPS_G,
                ItemID.ADAMANT_HELM_H1, ItemID.ADAMANT_HELM_H2, ItemID.ADAMANT_HELM_H3, ItemID.ADAMANT_HELM_H4,
                ItemID.ADAMANT_HELM_H5, ItemID.ADAMANT_PLATEBODY_H1, ItemID.ADAMANT_PLATEBODY_H2,
                ItemID.ADAMANT_PLATEBODY_H3, ItemID.ADAMANT_PLATEBODY_H4, ItemID.ADAMANT_PLATEBODY_H5,
                ItemID.ADAMANT_SHIELD_H1, ItemID.ADAMANT_SHIELD_H2, ItemID.ADAMANT_SHIELD_H3, ItemID.ADAMANT_SHIELD_H4,
                ItemID.ADAMANT_SHIELD_H5, ItemID.BLACK_ELEGANT_SHIRT, ItemID.BLACK_ELEGANT_LEGS,
                ItemID.WHITE_ELEGANT_BLOUSE, ItemID.WHITE_ELEGANT_SKIRT, ItemID.PURPLE_ELEGANT_SHIRT,
                ItemID.PURPLE_ELEGANT_LEGS, ItemID.PURPLE_ELEGANT_BLOUSE, ItemID.PURPLE_ELEGANT_SKIRT,
                ItemID.PINK_ELEGANT_SHIRT, ItemID.PINK_ELEGANT_LEGS, ItemID.PINK_ELEGANT_BLOUSE,
                ItemID.PINK_ELEGANT_SKIRT, ItemID.GOLD_ELEGANT_SHIRT, ItemID.GOLD_ELEGANT_LEGS,
                ItemID.GOLD_ELEGANT_BLOUSE, ItemID.GOLD_ELEGANT_SKIRT, ItemID.WOLF_MASK, ItemID.WOLF_CLOAK,
                ItemID.STRENGTH_AMULET_T, ItemID.ADAMANT_CANE, ItemID.GUTHIX_MITRE, ItemID.SARADOMIN_MITRE,
                ItemID.ZAMORAK_MITRE, ItemID.ANCIENT_MITRE, ItemID.BANDOS_MITRE, ItemID.ARMADYL_MITRE,
                ItemID.GUTHIX_CLOAK, ItemID.SARADOMIN_CLOAK, ItemID.ZAMORAK_CLOAK, ItemID.ANCIENT_CLOAK,
                ItemID.BANDOS_CLOAK, ItemID.ARMADYL_CLOAK, ItemID.ANCIENT_STOLE, ItemID.ARMADYL_STOLE,
                ItemID.BANDOS_STOLE, ItemID.ANCIENT_CROZIER, ItemID.ARMADYL_CROZIER, ItemID.BANDOS_CROZIER,
                ItemID.CAT_MASK, ItemID.PENGUIN_MASK, ItemID.GNOMISH_FIRELIGHTER, ItemID.CRIER_HAT, ItemID.CRIER_BELL,
                ItemID.CRIER_COAT, ItemID.LEPRECHAUN_HAT, ItemID.BLACK_LEPRECHAUN_HAT, ItemID.BLACK_UNICORN_MASK,
                ItemID.WHITE_UNICORN_MASK, ItemID.ARCEUUS_BANNER, ItemID.HOSIDIUS_BANNER, ItemID.LOVAKENGJ_BANNER,
                ItemID.PISCARILIUS_BANNER, ItemID.SHAYZIEN_BANNER, ItemID.CABBAGE_ROUND_SHIELD, ItemID.CLUELESS_SCROLL
            };
            player.getInventory().deleteItem(itemID, 1, slot);
            int mediumClueSlot = Utils.randomE(ttMedium.length);
            int mediumItemID = ttMedium[mediumClueSlot];
            player.getInventory().addItem(mediumItemID, 1, slot);
            if (Utils.randomE(5) == 0) {
                int extraItemID = ttLoot[Utils.randomE(ttLoot.length)];
                if (extraItemID == ItemID.PURPLE_SWEETS) {
                    player.getInventory().addOrDropItem(extraItemID, 8 + Utils.randomI(24));
                } else {
                    player.getInventory().addOrDropItem(extraItemID, 1);
                }
            }
            player.getSkills().increaseClueScrollCount(Skills.CLUE_SCROLL_MEDIUM);
            break;
        case ItemID.CLUE_SCROLL_HARD:
        case ItemID.CLUE_BOTTLE_HARD:
        case ItemID.CLUE_GEODE_HARD:
        case ItemID.CLUE_NEST_HARD:
            ttLoot = new int[] {
                ItemID.HOLY_BLESSING, ItemID.UNHOLY_BLESSING, ItemID.PEACEFUL_BLESSING, ItemID.HONOURABLE_BLESSING,
                ItemID.WAR_BLESSING, ItemID.ANCIENT_BLESSING, ItemID.WILLOW_COMP_BOW, ItemID.YEW_COMP_BOW,
                ItemID.MAGIC_COMP_BOW, ItemID.BEAR_FEET, ItemID.MOLE_SLIPPERS, ItemID.FROG_SLIPPERS, ItemID.DEMON_FEET,
                ItemID.SANDWICH_LADY_HAT, ItemID.SANDWICH_LADY_TOP, ItemID.SANDWICH_LADY_BOTTOM,
                ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_GUTHIX, ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_SARADOMIN,
                ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_ZAMORAK, ItemID.MONKS_ROBE_TOP_T, ItemID.MONKS_ROBE_T,
                ItemID.AMULET_OF_DEFENCE_T, ItemID.JESTER_CAPE, ItemID.SHOULDER_PARROT, ItemID.PURPLE_SWEETS
            };
            int[] ttHard = new int[] {
                ItemID.RUNE_FULL_HELM_T, ItemID.RUNE_PLATEBODY_T, ItemID.RUNE_PLATELEGS_T, ItemID.RUNE_PLATESKIRT_T,
                ItemID.RUNE_KITESHIELD_T, ItemID.RUNE_FULL_HELM_G, ItemID.RUNE_PLATEBODY_G, ItemID.RUNE_PLATELEGS_G,
                ItemID.RUNE_PLATESKIRT_G, ItemID.RUNE_KITESHIELD_G, ItemID.GUTHIX_FULL_HELM, ItemID.GUTHIX_PLATEBODY,
                ItemID.GUTHIX_PLATELEGS, ItemID.GUTHIX_PLATESKIRT, ItemID.GUTHIX_KITESHIELD, ItemID.SARADOMIN_FULL_HELM,
                ItemID.SARADOMIN_PLATEBODY, ItemID.SARADOMIN_PLATELEGS, ItemID.SARADOMIN_PLATESKIRT,
                ItemID.SARADOMIN_KITESHIELD, ItemID.ZAMORAK_FULL_HELM, ItemID.ZAMORAK_PLATEBODY,
                ItemID.ZAMORAK_PLATELEGS, ItemID.ZAMORAK_PLATESKIRT, ItemID.ZAMORAK_KITESHIELD,
                ItemID.ANCIENT_FULL_HELM, ItemID.ANCIENT_PLATEBODY, ItemID.ANCIENT_PLATELEGS, ItemID.ANCIENT_PLATESKIRT,
                ItemID.ANCIENT_KITESHIELD, ItemID.BANDOS_FULL_HELM, ItemID.BANDOS_PLATEBODY, ItemID.BANDOS_PLATELEGS,
                ItemID.BANDOS_PLATESKIRT, ItemID.BANDOS_KITESHIELD, ItemID.ARMADYL_FULL_HELM, ItemID.ARMADYL_PLATEBODY,
                ItemID.ARMADYL_PLATELEGS, ItemID.ARMADYL_PLATESKIRT, ItemID.ARMADYL_KITESHIELD, ItemID.RUNE_HELM_H1,
                ItemID.RUNE_HELM_H2, ItemID.RUNE_HELM_H3, ItemID.RUNE_HELM_H4, ItemID.RUNE_HELM_H5,
                ItemID.RUNE_PLATEBODY_H1, ItemID.RUNE_PLATEBODY_H2, ItemID.RUNE_PLATEBODY_H3, ItemID.RUNE_PLATEBODY_H4,
                ItemID.RUNE_PLATEBODY_H5, ItemID.BLUE_DHIDE_BODY_T, ItemID.BLUE_DHIDE_CHAPS_T, ItemID.BLUE_DHIDE_BODY_G,
                ItemID.BLUE_DHIDE_CHAPS_G, ItemID.RED_DHIDE_BODY_T, ItemID.RED_DHIDE_CHAPS_T, ItemID.RED_DHIDE_BODY_G,
                ItemID.RED_DHIDE_CHAPS_G, ItemID.ENCHANTED_HAT, ItemID.ENCHANTED_TOP, ItemID.ENCHANTED_ROBE,
                ItemID.ROBIN_HOOD_HAT, ItemID.TAN_CAVALIER, ItemID.DARK_CAVALIER, ItemID.BLACK_CAVALIER,
                ItemID.WHITE_CAVALIER, ItemID.RED_CAVALIER, ItemID.NAVY_CAVALIER, ItemID.PIRATES_HAT,
                ItemID.AMULET_OF_GLORY_T4, ItemID.GUTHIX_COIF, ItemID.GUTHIX_DHIDE, ItemID.GUTHIX_CHAPS,
                ItemID.GUTHIX_BRACERS, ItemID.GUTHIX_DHIDE_BOOTS, ItemID.GUTHIX_DHIDE_SHIELD, ItemID.SARADOMIN_COIF,
                ItemID.SARADOMIN_DHIDE, ItemID.SARADOMIN_CHAPS, ItemID.SARADOMIN_BRACERS, ItemID.SARADOMIN_DHIDE_BOOTS,
                ItemID.SARADOMIN_DHIDE_SHIELD, ItemID.ZAMORAK_COIF, ItemID.ZAMORAK_DHIDE, ItemID.ZAMORAK_CHAPS,
                ItemID.ZAMORAK_BRACERS, ItemID.ZAMORAK_DHIDE_BOOTS, ItemID.ZAMORAK_DHIDE_SHIELD, ItemID.ARMADYL_COIF,
                ItemID.ARMADYL_DHIDE, ItemID.ARMADYL_CHAPS, ItemID.ARMADYL_BRACERS, ItemID.ARMADYL_DHIDE_BOOTS,
                ItemID.ARMADYL_DHIDE_SHIELD, ItemID.ANCIENT_COIF, ItemID.ANCIENT_DHIDE, ItemID.ANCIENT_CHAPS,
                ItemID.ANCIENT_BRACERS, ItemID.ANCIENT_DHIDE_BOOTS, ItemID.ANCIENT_DHIDE_SHIELD, ItemID.BANDOS_COIF,
                ItemID.BANDOS_DHIDE, ItemID.BANDOS_CHAPS, ItemID.BANDOS_BRACERS, ItemID.BANDOS_DHIDE_BOOTS,
                ItemID.BANDOS_DHIDE_SHIELD, ItemID.GUTHIX_STOLE, ItemID.SARADOMIN_STOLE, ItemID.ZAMORAK_STOLE,
                ItemID.GUTHIX_CROZIER, ItemID.SARADOMIN_CROZIER, ItemID.ZAMORAK_CROZIER, ItemID.GREEN_DRAGON_MASK,
                ItemID.BLUE_DRAGON_MASK, ItemID.RED_DRAGON_MASK, ItemID.BLACK_DRAGON_MASK, ItemID.PITH_HELMET,
                ItemID.EXPLORER_BACKPACK, ItemID.RUNE_CANE, ItemID.ZOMBIE_HEAD_19912, ItemID.CYCLOPS_HEAD,
                ItemID.NUNCHAKU, ItemID.DUAL_SAI, ItemID.THIEVING_BAG, ItemID.DRAGON_BOOTS_ORNAMENT_KIT,
                ItemID.RUNE_DEFENDER_ORNAMENT_KIT, ItemID.TZHAAR_KET_OM_ORNAMENT_KIT,
                ItemID.BERSERKER_NECKLACE_ORNAMENT_KIT
            };
            int[] gildedHard = new int[] {
                ItemID.GILDED_FULL_HELM, ItemID.GILDED_PLATEBODY, ItemID.GILDED_PLATELEGS, ItemID.GILDED_PLATESKIRT,
                ItemID.GILDED_KITESHIELD, ItemID.GILDED_MED_HELM, ItemID.GILDED_CHAINBODY, ItemID.GILDED_SQ_SHIELD,
                ItemID.GILDED_2H_SWORD, ItemID.GILDED_SPEAR, ItemID.GILDED_HASTA
            };
            int[] thirdageHard = new int[] {
                ItemID._3RD_AGE_FULL_HELMET, ItemID._3RD_AGE_PLATEBODY, ItemID._3RD_AGE_PLATELEGS,
                ItemID._3RD_AGE_KITESHIELD, ItemID._3RD_AGE_RANGE_COIF, ItemID._3RD_AGE_RANGE_TOP,
                ItemID._3RD_AGE_RANGE_LEGS, ItemID._3RD_AGE_VAMBRACES, ItemID._3RD_AGE_MAGE_HAT,
                ItemID._3RD_AGE_ROBE_TOP, ItemID._3RD_AGE_ROBE, ItemID._3RD_AGE_AMULET
            };
            player.getInventory().deleteItem(itemID, 1, slot);
            if (Utils.inRange(0.1)) {
                int thirdAgeID = thirdageHard[Utils.randomE(thirdageHard.length)];
                player.getInventory().addItem(thirdAgeID, 1, slot);
                player.getWorld().sendItemDropNews(player, thirdAgeID);
            } else if (Utils.inRange(0.5)) {
                int gildedID = gildedHard[Utils.randomE(gildedHard.length)];
                player.getInventory().addItem(gildedID, 1, slot);
                player.getWorld().sendItemDropNews(player, gildedID);
            } else {
                int hardItemID = ttHard[Utils.randomE(ttHard.length)];
                player.getInventory().addItem(hardItemID, 1, slot);
            }
            if (Utils.randomE(5) == 0) {
                int extraItemID = ttLoot[Utils.randomE(ttLoot.length)];
                if (extraItemID == ItemID.PURPLE_SWEETS) {
                    player.getInventory().addOrDropItem(extraItemID, 8 + Utils.randomI(24));
                } else {
                    player.getInventory().addOrDropItem(extraItemID, 1);
                }
            }
            player.getSkills().increaseClueScrollCount(Skills.CLUE_SCROLL_HARD);
            break;
        case ItemID.CLUE_SCROLL_ELITE:
        case ItemID.CLUE_BOTTLE_ELITE:
        case ItemID.CLUE_GEODE_ELITE:
        case ItemID.CLUE_NEST_ELITE:
            ttLoot = new int[] {
                ItemID.HOLY_BLESSING, ItemID.UNHOLY_BLESSING, ItemID.PEACEFUL_BLESSING, ItemID.HONOURABLE_BLESSING,
                ItemID.WAR_BLESSING, ItemID.ANCIENT_BLESSING, ItemID.WILLOW_COMP_BOW, ItemID.YEW_COMP_BOW,
                ItemID.MAGIC_COMP_BOW, ItemID.BEAR_FEET, ItemID.MOLE_SLIPPERS, ItemID.FROG_SLIPPERS, ItemID.DEMON_FEET,
                ItemID.SANDWICH_LADY_HAT, ItemID.SANDWICH_LADY_TOP, ItemID.SANDWICH_LADY_BOTTOM,
                ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_GUTHIX, ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_SARADOMIN,
                ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_ZAMORAK, ItemID.MONKS_ROBE_TOP_T, ItemID.MONKS_ROBE_T,
                ItemID.AMULET_OF_DEFENCE_T, ItemID.JESTER_CAPE, ItemID.SHOULDER_PARROT, ItemID.PURPLE_SWEETS
            };
            int[] ttElite = new int[] {
                ItemID.DRAGON_FULL_HELM_ORNAMENT_KIT, ItemID.DRAGON_CHAINBODY_ORNAMENT_KIT,
                ItemID.DRAGON_LEGS_SKIRT_ORNAMENT_KIT, ItemID.DRAGON_SQ_SHIELD_ORNAMENT_KIT,
                ItemID.DRAGON_SCIMITAR_ORNAMENT_KIT, ItemID.LIGHT_INFINITY_COLOUR_KIT, ItemID.DARK_INFINITY_COLOUR_KIT,
                ItemID.FURY_ORNAMENT_KIT, ItemID.MUSKETEER_HAT, ItemID.MUSKETEER_TABARD, ItemID.MUSKETEER_PANTS,
                ItemID.DRAGON_CANE, ItemID.BRIEFCASE, ItemID.SAGACIOUS_SPECTACLES, ItemID.TOP_HAT, ItemID.MONOCLE,
                ItemID.BIG_PIRATE_HAT, ItemID.DEERSTALKER, ItemID.BRONZE_DRAGON_MASK, ItemID.IRON_DRAGON_MASK,
                ItemID.STEEL_DRAGON_MASK, ItemID.MITHRIL_DRAGON_MASK, ItemID.ADAMANT_DRAGON_MASK,
                ItemID.RUNE_DRAGON_MASK, ItemID.LAVA_DRAGON_MASK, ItemID.BLACK_DHIDE_BODY_T, ItemID.BLACK_DHIDE_CHAPS_T,
                ItemID.BLACK_DHIDE_BODY_G, ItemID.BLACK_DHIDE_CHAPS_G, ItemID.RANGERS_TUNIC, ItemID.AFRO, ItemID.KATANA,
                ItemID.ROYAL_CROWN, ItemID.ROYAL_GOWN_TOP, ItemID.ROYAL_GOWN_BOTTOM, ItemID.ROYAL_SCEPTRE,
                ItemID.ARCEUUS_SCARF, ItemID.HOSIDIUS_SCARF, ItemID.LOVAKENGJ_SCARF, ItemID.PISCARILIUS_SCARF,
                ItemID.SHAYZIEN_SCARF, ItemID.BLACKSMITHS_HELM, ItemID.BUCKET_HELM, ItemID.RANGER_GLOVES,
                ItemID.HOLY_WRAPS, ItemID.RING_OF_NATURE, ItemID.DARK_BOW_TIE, ItemID.DARK_TUXEDO_JACKET,
                ItemID.DARK_TROUSERS, ItemID.DARK_TUXEDO_CUFFS, ItemID.DARK_TUXEDO_SHOES, ItemID.LIGHT_BOW_TIE,
                ItemID.LIGHT_TUXEDO_JACKET, ItemID.LIGHT_TROUSERS, ItemID.LIGHT_TUXEDO_CUFFS, ItemID.LIGHT_TUXEDO_SHOES,
                ItemID.RANGERS_TIGHTS, ItemID.URIS_HAT, ItemID.FREMENNIK_KILT, ItemID.HEAVY_CASKET, ItemID.GIANT_BOOT
            };
            int[] gildedElite = new int[] {
                ItemID.GILDED_BOOTS, ItemID.GILDED_SCIMITAR, ItemID.GILDED_DHIDE_VAMBS, ItemID.GILDED_DHIDE_BODY,
                ItemID.GILDED_DHIDE_CHAPS, ItemID.GILDED_COIF, ItemID.GILDED_AXE, ItemID.GILDED_PICKAXE,
                ItemID.GILDED_SPADE
            };
            int[] thirdageElite = new int[] {
                ItemID._3RD_AGE_FULL_HELMET, ItemID._3RD_AGE_PLATEBODY, ItemID._3RD_AGE_PLATELEGS,
                ItemID._3RD_AGE_KITESHIELD, ItemID._3RD_AGE_RANGE_COIF, ItemID._3RD_AGE_RANGE_TOP,
                ItemID._3RD_AGE_RANGE_LEGS, ItemID._3RD_AGE_VAMBRACES, ItemID._3RD_AGE_MAGE_HAT,
                ItemID._3RD_AGE_ROBE_TOP, ItemID._3RD_AGE_ROBE, ItemID._3RD_AGE_AMULET, ItemID._3RD_AGE_CLOAK,
                ItemID._3RD_AGE_WAND, ItemID._3RD_AGE_BOW, ItemID._3RD_AGE_LONGSWORD, ItemID.RING_OF_3RD_AGE
            };
            player.getInventory().deleteItem(itemID, 1, slot);
            if (Utils.inRange(0.1)) {
                int thirdAgeID = thirdageElite[Utils.randomE(thirdageElite.length)];
                player.getInventory().addItem(thirdAgeID, 1, slot);
                player.getWorld().sendItemDropNews(player, thirdAgeID);
            } else if (Utils.inRange(0.5)) {
                int gildedID = gildedElite[Utils.randomE(gildedElite.length)];
                player.getInventory().addItem(gildedID, 1, slot);
                player.getWorld().sendItemDropNews(player, gildedID);
            } else {
                int eliteItemID = ttElite[Utils.randomE(ttElite.length)];
                player.getInventory().addItem(eliteItemID, 1, slot);
            }
            if (Utils.randomE(5) == 0) {
                int extraItemID = ttLoot[Utils.randomE(ttLoot.length)];
                if (extraItemID == ItemID.PURPLE_SWEETS) {
                    player.getInventory().addOrDropItem(extraItemID, 8 + Utils.randomI(24));
                } else {
                    player.getInventory().addOrDropItem(extraItemID, 1);
                }
            }
            player.getSkills().increaseClueScrollCount(Skills.CLUE_SCROLL_ELITE);
            break;
        case ItemID.CLUE_SCROLL_MASTER:
            ttLoot = new int[] {
                ItemID.HOLY_BLESSING, ItemID.UNHOLY_BLESSING, ItemID.PEACEFUL_BLESSING, ItemID.HONOURABLE_BLESSING,
                ItemID.WAR_BLESSING, ItemID.ANCIENT_BLESSING, ItemID.WILLOW_COMP_BOW, ItemID.YEW_COMP_BOW,
                ItemID.MAGIC_COMP_BOW, ItemID.BEAR_FEET, ItemID.MOLE_SLIPPERS, ItemID.FROG_SLIPPERS, ItemID.DEMON_FEET,
                ItemID.SANDWICH_LADY_HAT, ItemID.SANDWICH_LADY_TOP, ItemID.SANDWICH_LADY_BOTTOM,
                ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_GUTHIX, ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_SARADOMIN,
                ItemID.RUNE_SCIMITAR_ORNAMENT_KIT_ZAMORAK, ItemID.MONKS_ROBE_TOP_T, ItemID.MONKS_ROBE_T,
                ItemID.AMULET_OF_DEFENCE_T, ItemID.JESTER_CAPE, ItemID.SHOULDER_PARROT, ItemID.PURPLE_SWEETS
            };
            int[] ttMaster = new int[] {
                ItemID.DRAGON_PLATEBODY_ORNAMENT_KIT, ItemID.DRAGON_KITESHIELD_ORNAMENT_KIT,
                ItemID.DRAGON_DEFENDER_ORNAMENT_KIT, ItemID.ANGUISH_ORNAMENT_KIT, ItemID.TORTURE_ORNAMENT_KIT,
                ItemID.OCCULT_ORNAMENT_KIT, ItemID.ARMADYL_GODSWORD_ORNAMENT_KIT, ItemID.BANDOS_GODSWORD_ORNAMENT_KIT,
                ItemID.SARADOMIN_GODSWORD_ORNAMENT_KIT, ItemID.ZAMORAK_GODSWORD_ORNAMENT_KIT,
                ItemID.TORMENTED_ORNAMENT_KIT, ItemID.LESSER_DEMON_MASK, ItemID.GREATER_DEMON_MASK,
                ItemID.BLACK_DEMON_MASK, ItemID.JUNGLE_DEMON_MASK, ItemID.OLD_DEMON_MASK, ItemID.ARCEUUS_HOOD,
                ItemID.HOSIDIUS_HOOD, ItemID.LOVAKENGJ_HOOD, ItemID.PISCARILIUS_HOOD, ItemID.SHAYZIEN_HOOD,
                ItemID.SAMURAI_KASA, ItemID.SAMURAI_SHIRT, ItemID.SAMURAI_GLOVES, ItemID.SAMURAI_GREAVES,
                ItemID.SAMURAI_BOOTS, ItemID.MUMMYS_HEAD, ItemID.MUMMYS_BODY, ItemID.MUMMYS_HANDS, ItemID.MUMMYS_LEGS,
                ItemID.MUMMYS_FEET, ItemID.ANKOU_MASK, ItemID.ANKOU_TOP, ItemID.ANKOU_GLOVES, ItemID.ANKOUS_LEGGINGS,
                ItemID.ANKOU_SOCKS, ItemID.HOOD_OF_DARKNESS, ItemID.ROBE_TOP_OF_DARKNESS, ItemID.GLOVES_OF_DARKNESS,
                ItemID.ROBE_BOTTOM_OF_DARKNESS, ItemID.BOOTS_OF_DARKNESS, ItemID.RING_OF_COINS, ItemID.LEFT_EYE_PATCH,
                ItemID.OBSIDIAN_CAPE_R, ItemID.FANCY_TIARA, ItemID.HALF_MOON_SPECTACLES, ItemID.ALE_OF_THE_GODS,
                ItemID.BUCKET_HELM_G, ItemID.BOWL_WIG, ItemID.SCROLL_SACK
            };
            int[] gildedMaster = new int[] {
                ItemID.GILDED_FULL_HELM, ItemID.GILDED_PLATEBODY, ItemID.GILDED_PLATELEGS, ItemID.GILDED_PLATESKIRT,
                ItemID.GILDED_KITESHIELD, ItemID.GILDED_MED_HELM, ItemID.GILDED_CHAINBODY, ItemID.GILDED_SQ_SHIELD,
                ItemID.GILDED_2H_SWORD, ItemID.GILDED_SPEAR, ItemID.GILDED_HASTA, ItemID.GILDED_BOOTS,
                ItemID.GILDED_SCIMITAR, ItemID.GILDED_DHIDE_VAMBS, ItemID.GILDED_DHIDE_BODY, ItemID.GILDED_DHIDE_CHAPS,
                ItemID.GILDED_COIF, ItemID.GILDED_AXE, ItemID.GILDED_PICKAXE, ItemID.GILDED_SPADE
            };
            int[] thirdageMaster = new int[] {
                ItemID._3RD_AGE_FULL_HELMET, ItemID._3RD_AGE_PLATEBODY, ItemID._3RD_AGE_PLATELEGS,
                ItemID._3RD_AGE_KITESHIELD, ItemID._3RD_AGE_RANGE_COIF, ItemID._3RD_AGE_RANGE_TOP,
                ItemID._3RD_AGE_RANGE_LEGS, ItemID._3RD_AGE_VAMBRACES, ItemID._3RD_AGE_MAGE_HAT,
                ItemID._3RD_AGE_ROBE_TOP, ItemID._3RD_AGE_ROBE, ItemID._3RD_AGE_AMULET, ItemID._3RD_AGE_CLOAK,
                ItemID._3RD_AGE_WAND, ItemID._3RD_AGE_BOW, ItemID._3RD_AGE_LONGSWORD, ItemID._3RD_AGE_AXE,
                ItemID._3RD_AGE_PICKAXE, ItemID._3RD_AGE_DRUIDIC_ROBE_TOP, ItemID._3RD_AGE_DRUIDIC_ROBE_BOTTOMS,
                ItemID._3RD_AGE_DRUIDIC_CLOAK, ItemID._3RD_AGE_DRUIDIC_STAFF, ItemID.RING_OF_3RD_AGE
            };
            player.getInventory().deleteItem(itemID, 1, slot);
            if (Utils.inRange(0.1)) {
                int thirdAgeID = thirdageMaster[Utils.randomE(thirdageMaster.length)];
                player.getInventory().addItem(thirdAgeID, 1, slot);
                player.getWorld().sendItemDropNews(player, thirdAgeID);
            } else if (Utils.inRange(0.5)) {
                int gildedID = gildedMaster[Utils.randomE(gildedMaster.length)];
                player.getInventory().addItem(gildedID, 1, slot);
                player.getWorld().sendItemDropNews(player, gildedID);
            } else {
                int masterItemID = ttMaster[Utils.randomE(ttMaster.length)];
                player.getInventory().addItem(masterItemID, 1, slot);
            }
            if (Utils.randomE(5) == 0) {
                int extraItemID = ttLoot[Utils.randomE(ttLoot.length)];
                if (extraItemID == ItemID.PURPLE_SWEETS) {
                    player.getInventory().addOrDropItem(extraItemID, 8 + Utils.randomI(24));
                } else {
                    player.getInventory().addOrDropItem(extraItemID, 1);
                }
            }
            player.getFamiliar().rollPet(ItemID.BLOODHOUND, 0.1);
            player.getSkills().increaseClueScrollCount(Skills.CLUE_SCROLL_MASTER);
            break;
        }
    }
}

