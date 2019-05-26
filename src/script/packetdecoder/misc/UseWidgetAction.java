package script.packetdecoder.misc;

import com.palidino.osrs.io.cache.ItemId;
import com.palidino.osrs.io.cache.WidgetChild;
import com.palidino.osrs.io.cache.WidgetId;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.dialogue.Dialogue;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.item.ItemDef;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.TempMapObject;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Cooking;
import com.palidino.osrs.model.player.Farming;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Prayer;
import com.palidino.osrs.model.player.Skills;
import com.palidino.osrs.model.player.Smithing;
import com.palidino.osrs.model.player.WidgetManager;
import com.palidino.osrs.model.player.combat.WarriorsGuild;
import com.palidino.osrs.world.ClanWarsTournament;
import com.palidino.osrs.world.WishingWell;
import com.palidino.util.Utils;

public class UseWidgetAction {
    public static void doActionNpc(Player player, int index, int interfaceId, int childId, int slot, Npc npc) {
        if (interfaceId == WidgetId.INVENTORY) {
            Item item = player.getInventory().getItem(slot);
            if (item == null) {
                return;
            }
            int itemId = item.getId();
            switch (npc.getId()) {
            case 13: // Piles
                int inventoryCount = player.getInventory().getCount(itemId);
                player.openDialogue("piles", 0);
                Dialogue.setText(player, "Banknote " + inventoryCount + " x " + ItemDef.getName(itemId),
                        "Yes - " + Utils.formatNumber(inventoryCount * 50) + " gp", "Cancel");
                player.putAttribute("use_item_id", itemId);
                player.getWidgetManager().addChatboxCloseEvent(new WidgetManager.CloseEvent() {
                    @Override
                    public void execute() {
                        player.removeAttribute("use_item_id");
                    }
                });
                break;
            case 7995: // Elder Chaos druid
                if (!Prayer.isBone(ItemDef.getUnnotedId(itemId))) {
                    break;
                }
                int exchangeCount = player.getInventory().getCount(itemId);
                exchangeCount = Math.min(exchangeCount, player.getInventory().getRemainingSlots());
                exchangeCount = Math.min(exchangeCount, Item.MAX_AMOUNT / 50);
                player.openDialogue("elderchaosdruid", 0);
                Dialogue.setText(player, null,
                        "Exchange '" + ItemDef.getName(ItemDef.getUnnotedId(itemId)) + "': 50 coins",
                        "Exchange 5: 250 coins", "Exchange All: " + Utils.formatNumber(exchangeCount * 50) + " coins",
                        "Exchange X", "Cancel");
                player.putAttribute("use_item_id", itemId);
                player.getWidgetManager().addChatboxCloseEvent(new WidgetManager.CloseEvent() {
                    @Override
                    public void execute() {
                        player.removeAttribute("use_item_id");
                    }
                });
                break;
            case 0: // Tool Leprechaun
                int notedId = ItemDef.getNotedId(itemId);
                if (!Farming.isCollectable(itemId) || notedId == -1) {
                    break;
                }
                int exchangeCount2 = player.getInventory().getCount(itemId);
                player.getInventory().deleteItem(itemId, exchangeCount2);
                player.getInventory().addItem(notedId, exchangeCount2);
                break;
            }
        }
    }

    public static void doActionPlayer(Player player, int index, int interfaceId, int childId, int slot,
            Player player2) {
        if (interfaceId == WidgetId.INVENTORY) {
            Item item = player.getInventory().getItem(slot);
            if (item == null) {
                return;
            }
            int itemId = item.getId();
            switch (itemId) {
            }
        }
    }

    public static void doActionWidgetOnWidget(Player player, int fromInterfaceId, int fromChildId, int toInterfaceId,
            int toChildId, int useSlot, int useItemId, int onSlot, int onItemId) {
        if (fromInterfaceId == WidgetId.SPELLBOOK && toInterfaceId == WidgetId.INVENTORY) {
            if (onItemId != player.getInventory().getId(onSlot)) {
                return;
            }
            WidgetChild.SpellBook spellbookChild = WidgetChild.SpellBook.get(fromChildId);
            if (spellbookChild == null) {
                return;
            }
            switch (spellbookChild) {
            case LVL_1_ENCHANT:
                if (player.getSkills().getLevel(Skills.MAGIC) < 7) {
                    player.getGameEncoder().sendMessage("You need a Magic level of 7 to cast this spell.");
                    break;
                } else if (!player.getMagic().hasRunes(ItemId.WATER_RUNE, 1)
                        || !player.getMagic().hasRunes(ItemId.COSMIC_RUNE, 1)) {
                    player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                    break;
                } else if (onItemId != ItemId.SAPPHIRE_RING && onItemId != ItemId.SAPPHIRE_NECKLACE
                        && onItemId != ItemId.SAPPHIRE_AMULET && onItemId != ItemId.SAPPHIRE_BRACELET) {
                    player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                    break;
                }
                if (player.getHeight() != player.getClientHeight()) {
                    player.getGameEncoder().sendMessage("You can't do this here.");
                    break;
                }
                player.setAnimation(719);
                player.setGraphic(114, 92);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                if (onItemId == ItemId.SAPPHIRE_RING) {
                    player.getInventory().addItem(ItemId.RING_OF_RECOIL, 1, onSlot);
                } else if (onItemId == ItemId.SAPPHIRE_NECKLACE) {
                    player.getInventory().addItem(ItemId.GAMES_NECKLACE_8, 1, onSlot);
                } else if (onItemId == ItemId.SAPPHIRE_AMULET) {
                    player.getInventory().addItem(ItemId.AMULET_OF_MAGIC, 1, onSlot);
                } else if (onItemId == ItemId.SAPPHIRE_BRACELET) {
                    player.getInventory().addItem(ItemId.BRACELET_OF_CLAY, 1, onSlot);
                }
                player.getMagic().deleteRunes(ItemId.WATER_RUNE, 1);
                player.getMagic().deleteRunes(ItemId.COSMIC_RUNE, 1);
                player.getSkills().addXP(Skills.MAGIC, 18);
                player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
                break;
            case LVL_2_ENCHANT:
                if (player.getSkills().getLevel(Skills.MAGIC) < 27) {
                    player.getGameEncoder().sendMessage("You need a Magic level of 27 to cast this spell.");
                    break;
                } else if (!player.getMagic().hasRunes(ItemId.AIR_RUNE, 3)
                        || !player.getMagic().hasRunes(ItemId.COSMIC_RUNE, 1)) {
                    player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                    break;
                } else if (onItemId != ItemId.EMERALD_RING && onItemId != ItemId.EMERALD_NECKLACE
                        && onItemId != ItemId.EMERALD_AMULET && onItemId != ItemId.EMERALD_BRACELET) {
                    player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                    break;
                }
                if (player.getHeight() != player.getClientHeight()) {
                    player.getGameEncoder().sendMessage("You can't do this here.");
                    break;
                }
                player.setAnimation(719);
                player.setGraphic(114, 92);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                if (onItemId == ItemId.EMERALD_RING) {
                    player.getInventory().addItem(ItemId.RING_OF_DUELING_8, 1, onSlot);
                } else if (onItemId == ItemId.EMERALD_NECKLACE) {
                    player.getInventory().addItem(ItemId.BINDING_NECKLACE, 1, onSlot);
                } else if (onItemId == ItemId.EMERALD_AMULET) {
                    player.getInventory().addItem(ItemId.AMULET_OF_DEFENCE, 1, onSlot);
                } else if (onItemId == ItemId.EMERALD_BRACELET) {
                    player.getInventory().addItem(ItemId.CASTLE_WARS_BRACELET_3, 1, onSlot);
                }
                player.getMagic().deleteRunes(ItemId.AIR_RUNE, 3);
                player.getMagic().deleteRunes(ItemId.COSMIC_RUNE, 1);
                player.getSkills().addXP(Skills.MAGIC, 37);
                player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
                break;
            case SUPERHEAT_ITEM:
                if (player.getSkills().getLevel(Skills.MAGIC) < 43) {
                    player.getGameEncoder().sendMessage("You need a Magic level of 43 to cast this spell.");
                    break;
                } else if (!player.getMagic().hasRunes(ItemId.FIRE_RUNE, 4)
                        || !player.getMagic().hasRunes(ItemId.NATURE_RUNE, 1)) {
                    player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                    break;
                }
                int makeId = -1;
                if (onItemId == Smithing.COPPER_ORE_ID || onItemId == Smithing.TIN_ORE_ID) {
                    makeId = Smithing.BRONZE_BAR_ID;
                } else if (onItemId == Smithing.BLURITE_ORE_ID) {
                    makeId = Smithing.BLURITE_BAR_ID;
                } else if (onItemId == Smithing.IRON_ORE_ID && player.getInventory().getCount(Smithing.COAL_ID) >= 2) {
                    makeId = Smithing.STEEL_BAR_ID;
                } else if (onItemId == Smithing.IRON_ORE_ID) {
                    makeId = Smithing.IRON_BAR_ID;
                } else if (onItemId == Smithing.SILVER_ORE_ID) {
                    makeId = Smithing.SILVER_BAR_ID;
                } else if (onItemId == Smithing.GOLD_ORE_ID) {
                    makeId = Smithing.GOLD_BAR_ID;
                } else if (onItemId == Smithing.MITHRIL_ORE_ID) {
                    makeId = Smithing.MITHRIL_BAR_ID;
                } else if (onItemId == Smithing.ADAMANT_ORE_ID) {
                    makeId = Smithing.ADAMANT_BAR_ID;
                } else if (onItemId == Smithing.RUNE_ORE_ID) {
                    makeId = Smithing.RUNE_BAR_ID;
                } else {
                    player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                    break;
                }
                if (!Smithing.make1(player, makeId)) {
                    break;
                }
                player.setAnimation(725);
                player.setGraphic(148, 92);
                player.getMagic().deleteRunes(ItemId.FIRE_RUNE, 5);
                player.getMagic().deleteRunes(ItemId.NATURE_RUNE, 1);
                player.getSkills().addXP(Skills.MAGIC, 53);
                player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
                player.setUseWidgetOnWidgetDelay(2);
                break;
            case LVL_3_ENCHANT:
                if (player.getSkills().getLevel(Skills.MAGIC) < 49) {
                    player.getGameEncoder().sendMessage("You need a Magic level of 49 to cast this spell.");
                    break;
                } else if (!player.getMagic().hasRunes(ItemId.FIRE_RUNE, 5)
                        || !player.getMagic().hasRunes(ItemId.COSMIC_RUNE, 1)) {
                    player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                    break;
                } else if (onItemId != 1641 && onItemId != 1660 && onItemId != 1698 && onItemId != 11085) {
                    player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                    break;
                }
                if (player.getHeight() != player.getClientHeight()) {
                    player.getGameEncoder().sendMessage("You can't do this here.");
                    break;
                }
                player.setAnimation(720);
                player.setGraphic(115, 92);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                if (onItemId == 1641) {
                    player.getInventory().addItem(2568, 1, onSlot);
                } else if (onItemId == 1660) {
                    player.getInventory().addItem(11194, 1, onSlot);
                } else if (onItemId == 1698) {
                    player.getInventory().addItem(1725, 1, onSlot);
                } else if (onItemId == 11085) {
                    player.getInventory().addItem(11088, 1, onSlot);
                }
                player.getMagic().deleteRunes(ItemId.FIRE_RUNE, 5);
                player.getMagic().deleteRunes(ItemId.COSMIC_RUNE, 1);
                player.getSkills().addXP(Skills.MAGIC, 59);
                player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
                break;
            case HIGH_LEVEL_ALCHEMY:
                if (player.getSkills().getLevel(Skills.MAGIC) < 55) {
                    player.getGameEncoder().sendMessage("You need a Magic level of 55 to cast this spell.");
                    break;
                } else if (!player.getMagic().hasRunes(ItemId.NATURE_RUNE, 1)
                        || !player.getMagic().hasRunes(ItemId.FIRE_RUNE, 5)) {
                    player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                    break;
                } else if (onItemId == ItemId.COINS) {
                    player.getGameEncoder().sendMessage("You can't alch coins.");
                    break;
                } else if (onItemId == ItemId.BLOOD_MONEY) {
                    player.getGameEncoder().sendMessage("You can't alch blood money.");
                    break;
                } else if (onItemId == ItemId.OLD_SCHOOL_BOND || onItemId == ItemId.OLD_SCHOOL_BOND_UNTRADEABLE
                        || onItemId == ItemId._14_DAYS_GOLD_MEMBERSHIP_32303) {
                    player.getGameEncoder().sendMessage("You can't alch bonds.");
                    break;
                } else if (ItemDef.getUntradable(onItemId)) {
                    player.getGameEncoder().sendMessage("You can't alch this item.");
                    break;
                } else if (ItemDef.isFree(onItemId)) {
                    player.getGameEncoder().sendMessage("You can't alch this item.");
                    break;
                }
                if (player.getHeight() != player.getClientHeight()) {
                    player.getGameEncoder().sendMessage("You can't do this here.");
                    break;
                }
                int value = ItemDef.getHighAlch(onItemId);
                int inventoryCoinCount = player.getInventory().getCount(ItemId.COINS);
                int emptyInventoryIndex = player.getInventory().getEmptySlot();
                if (emptyInventoryIndex == -1 && (inventoryCoinCount == Item.MAX_AMOUNT
                        || inventoryCoinCount + value <= 0 || inventoryCoinCount + value > Item.MAX_AMOUNT)) {
                    player.getInventory().notEnoughSpace();
                    break;
                }
                if (player.getInventory().addItem(ItemId.COINS, value).item == null) {
                    break;
                }
                player.setAnimation(713);
                player.setGraphic(113, 92);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getMagic().deleteRunes(ItemId.NATURE_RUNE, 1);
                player.getMagic().deleteRunes(ItemId.FIRE_RUNE, 5);
                player.getSkills().addXP(Skills.MAGIC, 65);
                player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
                break;
            case LVL_4_ENCHANT:
                if (player.getSkills().getLevel(Skills.MAGIC) < 57) {
                    player.getGameEncoder().sendMessage("You need a Magic level of 57 to cast this spell.");
                    break;
                } else if (!player.getMagic().hasRunes(ItemId.EARTH_RUNE, 10)
                        || !player.getMagic().hasRunes(ItemId.COSMIC_RUNE, 1)) {
                    player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                    break;
                } else if (onItemId != 1643 && onItemId != 1662 && onItemId != 1700 && onItemId != 11092) {
                    player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                    break;
                }
                if (player.getHeight() != player.getClientHeight()) {
                    player.getGameEncoder().sendMessage("You can't do this here.");
                    break;
                }
                player.setAnimation(720);
                player.setGraphic(115, 92);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                if (onItemId == 1643) {
                    player.getInventory().addItem(2570, 1, onSlot);
                } else if (onItemId == 1662) {
                    player.getInventory().addItem(11090, 1, onSlot);
                } else if (onItemId == 1700) {
                    player.getInventory().addItem(1731, 1, onSlot);
                } else if (onItemId == 11092) {
                    player.getInventory().addItem(11095, 1, onSlot);
                }
                player.getMagic().deleteRunes(ItemId.EARTH_RUNE, 10);
                player.getMagic().deleteRunes(ItemId.COSMIC_RUNE, 1);
                player.getSkills().addXP(Skills.MAGIC, 67);
                player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
                break;
            case LVL_5_ENCHANT:
                if (player.getSkills().getLevel(Skills.MAGIC) < 68) {
                    player.getGameEncoder().sendMessage("You need a Magic level of 68 to cast this spell.");
                    break;
                } else if (!player.getMagic().hasRunes(ItemId.WATER_RUNE, 15)
                        || !player.getMagic().hasRunes(ItemId.EARTH_RUNE, 15)
                        || !player.getMagic().hasRunes(ItemId.COSMIC_RUNE, 1)) {
                    player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                    break;
                } else if (onItemId != 1664 && onItemId != 1702 && onItemId != 11115) {
                    player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                    break;
                }
                if (player.getHeight() != player.getClientHeight()) {
                    player.getGameEncoder().sendMessage("You can't do this here.");
                    break;
                }
                player.setAnimation(721);
                player.setGraphic(116, 92);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                if (onItemId == 1664) {
                    player.getInventory().addItem(11105, 1, onSlot);
                } else if (onItemId == 1702) {
                    player.getInventory().addItem(1712, 1, onSlot);
                } else if (onItemId == 11115) {
                    player.getInventory().addItem(11118, 1, onSlot);
                }
                player.getMagic().deleteRunes(ItemId.WATER_RUNE, 15);
                player.getMagic().deleteRunes(ItemId.EARTH_RUNE, 15);
                player.getMagic().deleteRunes(ItemId.COSMIC_RUNE, 1);
                player.getSkills().addXP(Skills.MAGIC, 78);
                player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
                break;
            case LVL_6_ENCHANT:
                if (player.getSkills().getLevel(Skills.MAGIC) < 87) {
                    player.getGameEncoder().sendMessage("You need a Magic level of 87 to cast this spell.");
                    break;
                } else if (!player.getMagic().hasRunes(ItemId.EARTH_RUNE, 20)
                        || !player.getMagic().hasRunes(ItemId.FIRE_RUNE, 20)
                        || !player.getMagic().hasRunes(ItemId.COSMIC_RUNE, 1)) {
                    player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                    break;
                } else if (onItemId != 6575 && onItemId != 6577 && onItemId != 6581 && onItemId != 11130) {
                    player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                    break;
                }
                if (player.getHeight() != player.getClientHeight()) {
                    player.getGameEncoder().sendMessage("You can't do this here.");
                    break;
                }
                player.setAnimation(721);
                player.setGraphic(452, 92);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                if (onItemId == 6575) {
                    player.getInventory().addItem(6583, 1, onSlot);
                } else if (onItemId == 6577) {
                    player.getInventory().addItem(11128, 1, onSlot);
                } else if (onItemId == 6581) {
                    player.getInventory().addItem(6585, 1, onSlot);
                } else if (onItemId == 11130) {
                    player.getInventory().addItem(11133, 1, onSlot);
                }
                player.getMagic().deleteRunes(ItemId.EARTH_RUNE, 20);
                player.getMagic().deleteRunes(ItemId.FIRE_RUNE, 20);
                player.getMagic().deleteRunes(ItemId.COSMIC_RUNE, 1);
                player.getSkills().addXP(Skills.MAGIC, 97);
                player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
                break;
            case LVL_7_ENCHANT:
                if (player.getSkills().getLevel(Skills.MAGIC) < 93) {
                    player.getGameEncoder().sendMessage("You need a Magic level of 93 to cast this spell.");
                    break;
                } else if (!player.getMagic().hasRunes(ItemId.BLOOD_RUNE, 20) || !player.getMagic().hasRunes(566, 20)
                        || !player.getMagic().hasRunes(ItemId.COSMIC_RUNE, 1)) {
                    player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                    break;
                } else if (onItemId != 19538 && onItemId != 19535 && onItemId != 19541 && onItemId != 19532) {
                    player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                    break;
                }
                if (player.getHeight() != player.getClientHeight()) {
                    player.getGameEncoder().sendMessage("You can't do this here.");
                    break;
                }
                player.setAnimation(721);
                player.setGraphic(452, 92);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                if (onItemId == 19538) {
                    player.getInventory().addItem(19550, 1, onSlot);
                } else if (onItemId == 19535) {
                    player.getInventory().addItem(19547, 1, onSlot);
                } else if (onItemId == 19541) {
                    player.getInventory().addItem(19553, 1, onSlot);
                } else if (onItemId == 19532) {
                    player.getInventory().addItem(19544, 1, onSlot);
                }
                player.getMagic().deleteRunes(ItemId.BLOOD_RUNE, 20);
                player.getMagic().deleteRunes(566, 20);
                player.getMagic().deleteRunes(ItemId.COSMIC_RUNE, 1);
                player.getSkills().addXP(Skills.MAGIC, 110);
                player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
                break;
            default:
                break;
            }
        }
    }

    public static void doActionMapObject(Player player, int interfaceId, int childId, int itemSlot, MapObject object) {
        if (interfaceId == WidgetId.INVENTORY) {
            Item item = player.getInventory().getItem(itemSlot);
            if (item == null) {
                return;
            }
            int itemId = player.getInventory().getId(itemSlot);
            switch (object.getId()) {
            case 18808: // Treasure chest
                player.getClueChest().addItem(itemId);
                break;
            case 34628: // Machinery
                if (!player.getInventory().hasItem(ItemId.HAMMER)) {
                    player.getGameEncoder().sendMessage("You need a hammer to use this machinery.");
                    break;
                }
                if (itemId == ItemId.HYDRA_LEATHER) {
                    player.getInventory().deleteItem(itemId, 1, itemSlot);
                    player.getInventory().addItem(ItemId.FEROCIOUS_GLOVES, 1, itemSlot);
                    player.getGameEncoder().sendMessage(
                            "By feeding the tough to work leather through the machine, you manage to form a pair of gloves.");
                } else if (itemId == ItemId.FEROCIOUS_GLOVES) {
                    player.getInventory().deleteItem(itemId, 1, itemSlot);
                    player.getInventory().addItem(ItemId.HYDRA_LEATHER, 1, itemSlot);
                    player.getGameEncoder().sendMessage(
                            "By feeding the gloves through the machine, you manage to revert them into leather.");
                }
                break;
            case 24004: // Waterpump
                if (itemId == 1925) {
                    player.getInventory().deleteItem(itemId, 1, itemSlot);
                    player.getInventory().addItem(1929, 1, itemSlot);
                    AchievementDiary.makeItemHooks(player, -1, new Item(1929, 1), null, null);
                }
                break;
            case 733: // Web
                if ((ItemDef.getWeaponType(itemId) == null || !ItemDef.getWeaponType(itemId).hasSlash())
                        && itemId != 946) {
                    player.getGameEncoder().sendMessage("Only a sharp blade can cut through this sticky web.");
                    return;
                }
                player.setAnimation(player.getCombat().getAttackAnimation());
                if (Utils.randomE(4) != 0) {
                    player.getGameEncoder().sendMessage("You fail to cut through it.");
                    return;
                }
                player.getGameEncoder().sendMessage("You slash the web apart.");
                MapObject newWeb = new MapObject(object.getId() + 1, object);
                player.getWorld().addEvent(new TempMapObject(100, player.getController(), newWeb));
                break;
            case 4974: // Mine cart
                if (object.getX() == 2778 && object.getY() == 4506) {
                    if (player.getCombat().getHauntedMine() == 0) {
                        if (!player.getInventory().hasItem(4075)) {
                            player.getGameEncoder().sendMessage("You don't see a reason to add this to the mine cart.");
                            break;
                        }
                        player.getCombat().setHauntedMine(1);
                        player.getInventory().deleteItem(4075, 1);
                        player.getGameEncoder().sendMessage("You place the glowing fungus in the mine cart.");
                        player.getGameEncoder()
                                .sendMessage("You push the mine cart and it travels deeper into the mine.");
                        player.setAnimation(4343);
                        player.getGameEncoder().sendRemoveMapObject(object);
                    } else {
                        player.getGameEncoder()
                                .sendMessage("You have already pushed a mine cart deeper into the mine.");
                    }
                } else {
                    player.getGameEncoder().sendMessage("Nothing interesting happens.");
                }
                break;
            case 2638: // Fountain of Heroes
                if (itemId != 1704 && itemId != 1705) {
                    player.getGameEncoder().sendMessage("Nothing interesting happens.");
                    break;
                }
                int gloryCount = player.getInventory().getCount(itemId);
                player.getInventory().deleteItem(itemId, gloryCount);
                player.getInventory().addItem(ItemDef.getNoted(itemId) ? 1713 : 1712, gloryCount);
                break;
            case 884: // Wishing well
                if (itemId == ItemId.COINS) {
                    player.openDialogue("wishingwell", 2);
                    return;
                } else if (!WishingWell.canDonateItem(itemId)) {
                    player.getGameEncoder().sendMessage("The well won't take this item.");
                    break;
                }
                player.openDialogue("wishingwell", 4);
                if (itemId == ItemId.OLD_SCHOOL_BOND) {
                    Dialogue.setText(player,
                            item.getName() + " x" + Utils.formatNumber(item.getAmount()) + ": " + Utils.formatNumber(
                                    Utils.multiplyInt(WishingWell.BOND_VALUE, item.getAmount(), Item.MAX_AMOUNT)),
                            (String[]) null);
                } else {
                    Dialogue.setText(player,
                            item.getName() + " x" + Utils.formatNumber(item.getAmount()) + ": "
                                    + Utils.formatNumber(Utils.multiplyInt(item.getDef().getConfiguredExchangePrice(),
                                            item.getAmount(), Item.MAX_AMOUNT)),
                            (String[]) null);
                }
                player.putAttribute("wishing_well_item_id", itemId);
                player.getWidgetManager().addChatboxCloseEvent(new WidgetManager.CloseEvent() {
                    @Override
                    public void execute() {
                        player.removeAttribute("wishing_well_item_id");
                    }
                });
                break;
            case 29087: // Coffer
                if (!ClanWarsTournament.canDonateItem(itemId)) {
                    player.getGameEncoder().sendMessage("The coffer won't take this item.");
                    break;
                }
                player.openDialogue("clanwars", 3);
                Dialogue.setText(player, item.getName() + " x" + Utils.formatNumber(item.getAmount()), (String[]) null);
                player.putAttribute("clan_wars_coffer_item_id", itemId);
                player.getWidgetManager().addChatboxCloseEvent(new WidgetManager.CloseEvent() {
                    @Override
                    public void execute() {
                        player.removeAttribute("clan_wars_coffer_item_id");
                    }
                });
                break;
            case 28900: // Catacombs of Kourend Altar
                if (itemId == 6746 || itemId == 19675) {
                    player.getCharges().chargeFromInventory(19675, itemSlot, 1, new Item(19677, 3), 1000);
                } else if (itemId == 19685) {
                    player.openDialogue("catacombsofkourend", 1);
                }
                break;
            case 2965: // Legends Quest Mossy rock
                if (itemId == 744) {
                    player.getInventory().deleteItem(744, 1, itemSlot);
                    player.getInventory().addItem(745, 1, itemSlot);
                    player.getGameEncoder().sendMessage("The rocks vibrate and hum and the crystal starts to glow.");
                } else {
                    player.getGameEncoder()
                            .sendMessage("Nothing interesting happens. Maybe I should try something else...");
                }
                break;
            case 2966: // Legends Quest Furnace
                if (itemId == 741 || itemId == 742 || itemId == 743) {
                    if (player.getInventory().getCount(741) < 1 || player.getInventory().getCount(742) < 1
                            || player.getInventory().getCount(743) < 1) {
                        player.getGameEncoder().sendMessage("Nothing interesting happens.");
                        player.getGameEncoder().sendMessage("Maybe there is more to this crystal....");
                        break;
                    }
                    player.getInventory().deleteItem(741, 1);
                    player.getInventory().deleteItem(742, 1);
                    player.getInventory().deleteItem(743, 1);
                    player.getInventory().addItem(744, 1, itemSlot);
                    player.getGameEncoder().sendMessage("The heat in the furnace rises and fuses the parts together.");
                } else {
                    player.getGameEncoder().sendMessage("Perhaps I should use this to forge something...");
                }
                break;
            case 2934: // Legends Quest Winch
                if (itemId == 954) {
                    player.getGameEncoder().sendMessage("You shimmy down the rope into the darkness.");
                    player.getMovement().ladderUpTeleport(new Tile(2377, 4712, 0));
                } else {
                    player.getGameEncoder().sendMessage("Nothing interesting happens.");
                }
                break;
            case 5249:
            case 10660:
            case 12269:
            case 26185:
            case 9682:
            case 26181:
            case 21032:
                if (Cooking.canCook(itemId)) {
                    Cooking.open(player, itemId, object);
                } else {
                    player.getGameEncoder().sendMessage("Nothing interesting happens.");
                }
                break;
            case 23955: // Magical animator
                switch (itemId) {
                case 1155:
                case 1117:
                case 1075:
                    player.getCombat().getWarriorsGuild().spawnArmour(object, WarriorsGuild.BRONZE_ARMOUR);
                    break;
                case 1153:
                case 1115:
                case 1067:
                    player.getCombat().getWarriorsGuild().spawnArmour(object, WarriorsGuild.IRON_ARMOUR);
                    break;
                case 1157:
                case 1119:
                case 1069:
                    player.getCombat().getWarriorsGuild().spawnArmour(object, WarriorsGuild.STEEL_ARMOUR);
                    break;
                case 1165:
                case 1125:
                case 1077:
                    player.getCombat().getWarriorsGuild().spawnArmour(object, WarriorsGuild.BLACK_ARMOUR);
                    break;
                case 1159:
                case 1121:
                case 1071:
                    player.getCombat().getWarriorsGuild().spawnArmour(object, WarriorsGuild.MITHRIL_ARMOUR);
                    break;
                case 1161:
                case 1123:
                case 1073:
                    player.getCombat().getWarriorsGuild().spawnArmour(object, WarriorsGuild.ADAMANT_ARMOUR);
                    break;
                case 1163:
                case 1127:
                case 1079:
                    player.getCombat().getWarriorsGuild().spawnArmour(object, WarriorsGuild.RUNE_ARMOUR);
                    break;
                }
                break;
            case 13179:
            case 13180:
            case 13181:
            case 13182:
            case 13183:
            case 13184:
            case 13185:
            case 13186:
            case 13187:
            case 13188:
            case 13189:
            case 13190:
            case 13191:
            case 13192:
            case 13193:
            case 13194:
            case 13195:
            case 13196:
            case 13197:
            case 13198:
            case 13199:
            case 14860:
            case 411: // Altar
                if (!Prayer.isBone(itemId)) {
                    break;
                }
                player.openDialogue("prayer", 0);
                player.getWidgetManager().sendChatboxOverlay(WidgetId.MAKE_X, new WidgetManager.CloseEvent() {
                    @Override
                    public void execute() {
                        player.removeAttribute("map_object");
                        player.removeAttribute("item_id");
                    }
                });
                player.getGameEncoder().sendMakeX("How many would you like to use?", 14,
                        player.getInventory().getCount(itemId), itemId);
                player.putAttribute("item_id", itemId);
                player.putAttribute("map_object", object);
                break;
            case 16469:
            case 26300:
            case 21303:
            case 4304:
            case 24009: // Furnace
                if (itemId == Smithing.COPPER_ORE_ID || itemId == Smithing.TIN_ORE_ID || itemId == Smithing.IRON_ORE_ID
                        || itemId == Smithing.SILVER_ORE_ID || itemId == Smithing.GOLD_ORE_ID
                        || itemId == Smithing.MITHRIL_ORE_ID || itemId == Smithing.ADAMANT_ORE_ID
                        || itemId == Smithing.RUNE_ORE_ID || itemId == Smithing.COAL_ID
                        || itemId == ItemId.BLURITE_ORE) {
                    Smithing.openSmelt(player);
                }
                break;
            case 2031:
            case 2097:
            case 4306: // Anvil
                if (itemId == Smithing.BRONZE_BAR_ID || itemId == Smithing.IRON_BAR_ID
                        || itemId == Smithing.STEEL_BAR_ID || itemId == Smithing.MITHRIL_BAR_ID
                        || itemId == Smithing.ADAMANT_BAR_ID || itemId == Smithing.RUNE_BAR_ID
                        || itemId == Smithing.BLURITE_BAR_ID) {
                    Smithing.openSmith(player, itemId);
                }
                break;
            case 27029:
                if (itemId != 13273) {
                    player.getGameEncoder().sendMessage("Nothing interesting happens.");
                    break;
                }
                player.setAnimation(Prayer.PRAY_ANIMATION);
                player.getWorld().sendMapGraphic(player.getController(), new Tile(3039, 4774), 1276, 0, 0);
                int droppedId = -1;
                if (Utils.randomE(128) < 5) {
                    droppedId = 13262; // Abyssal orphan
                } else if (Utils.randomE(128) < 10) {
                    droppedId = 7979; // Abyssal head
                } else if (Utils.randomE(128) < 12) {
                    droppedId = 4151; // Abyssal whip
                } else if (Utils.randomE(128) < 13) {
                    droppedId = 13277; // Jar of miasma
                } else if (Utils.randomE(128) < 26) {
                    droppedId = 13265; // Abyssal dagger
                } else {
                    if (!player.hasItem(13274)) {
                        droppedId = 13274; // Bludgeon spine
                    } else if (!player.hasItem(13275)) {
                        droppedId = 13275; // Bludgeon claw
                    } else if (!player.hasItem(13276)) {
                        droppedId = 13276; // Bludgeon axon
                    } else {
                        droppedId = 13274 + Utils.randomI(2);
                    }
                }
                int unsiredKillCount = player.getInventory().getAttachment(itemSlot) != null
                        ? (int) player.getInventory().getAttachment(itemSlot) : 0;
                if (unsiredKillCount > 0) {
                    player.getCombat().logNPCItem("Abyssal Sire", droppedId, 1, unsiredKillCount);
                } else {
                    player.getCombat().logNPCItem("Abyssal Sire", droppedId, 1);
                }
                if (droppedId == 13262 || droppedId == 13265 || droppedId >= 13274 && droppedId <= 13276) {
                    player.getWorld().sendItemDropNews(player, droppedId);
                }
                player.getInventory().deleteItem(itemId, 1, itemSlot);
                player.getInventory().addItem(droppedId, 1, itemSlot);
                break;
            default:
                player.getGameEncoder().sendMessage("Nothing interesting happens.");
                break;
            }
        }
    }
}
