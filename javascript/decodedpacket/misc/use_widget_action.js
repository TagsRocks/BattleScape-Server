DecodedPacketWidgetOnEntity.prototype.doActionNPC = function(player, index, interfaceID, childID, slot, npc) {
    if (interfaceID == WidgetID.INVENTORY) {
        var item = player.getInventory().getItem(slot);
        if (item == null) {
            return;
        }
        var itemID = item.getID();
        switch (npc.getID()) {
        case 13: // Piles
            var inventoryCount = player.getInventory().getCount(itemID);
            player.openDialogue("piles", 0);
            Dialogue.setText(player, "Banknote " + inventoryCount + " x " + ItemDef.getName(itemID),
                    "Yes - " + Utils.formatNumber(inventoryCount * 50) + " gp", "Cancel");
            player.putAttribute("use_item_id", itemID);
            player.getWidgetManager().addChatboxCloseEvent(new WidgetManager.CloseEvent() {
                execute: function() {
                    player.removeAttribute("use_item_id");
                }
            });
            break;
        case 7995: // Elder Chaos druid
            if (!Prayer.isBone(ItemDef.getUnnotedID(itemID))) {
                break;
            }
            var exchangeCount = player.getInventory().getCount(itemID);
            exchangeCount = Math.min(exchangeCount, player.getInventory().getRemainingSlots());
            exchangeCount = Math.min(exchangeCount, Item.MAX_AMOUNT / 50);
            player.openDialogue("elderchaosdruid", 0);
            Dialogue.setText(player, null, "Exchange '" + ItemDef.getName(ItemDef.getUnnotedID(itemID))
                    + "': 50 coins", "Exchange 5: 250 coins", "Exchange All: "
                    + Utils.formatNumber(exchangeCount * 50) + " coins", "Exchange X", "Cancel");
            player.putAttribute("use_item_id", itemID);
            player.getWidgetManager().addChatboxCloseEvent(new WidgetManager.CloseEvent() {
                execute: function() {
                    player.removeAttribute("use_item_id");
                }
            });
            break;
        case 0: // Tool Leprechaun
            var notedID = ItemDef.getNotedID(itemID);
            if (!Farming.isCollectable(itemID) || notedID == -1) {
                break;
            }
            var exchangeCount = player.getInventory().getCount(itemID);
            player.getInventory().deleteItem(itemID, exchangeCount);
            player.getInventory().addItem(notedID, exchangeCount);
            break;
        }
    }
}

DecodedPacketWidgetOnEntity.prototype.doActionPlayer = function(player, index, interfaceID, childID, slot, player2) {
    if (interfaceID == WidgetID.INVENTORY) {
        var item = player.getInventory().getItem(slot);
        if (item == null) {
            return;
        }
        var itemID = item.getID();
        switch (itemID) { }
    }
}

DecodedPacketWidgetOnWidget.prototype.doAction = function(player, fromInterfaceID, fromChildID, toInterfaceID,
        toChildID, useSlot, useItemID, onSlot, onItemID) {
    if (fromInterfaceID == WidgetID.SPELLBOOK && toInterfaceID == WidgetID.INVENTORY) {
        if (onItemID != player.getInventory().getID(onSlot)) {
            return;
        }
        var spellBookChild = WidgetChild.SpellBook.get(fromChildID);
        if (spellBookChild == null) {
            return;
        }
        switch (spellBookChild) {
        case WidgetChild.SpellBook.LVL_1_ENCHANT:
            if (player.getSkills().getLevel(Skills.MAGIC) < 7) {
                player.getGameEncoder().sendMessage("You need a Magic level of 7 to cast this spell.");
                break;
            } else if (!player.getMagic().hasRunes(ItemID.WATER_RUNE, 1)
                    || !player.getMagic().hasRunes(ItemID.COSMIC_RUNE, 1)) {
                player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                break;
            } else if (onItemID != ItemID.SAPPHIRE_RING && onItemID != ItemID.SAPPHIRE_NECKLACE
                    && onItemID != ItemID.SAPPHIRE_AMULET && onItemID != ItemID.SAPPHIRE_BRACELET) {
                player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                break;
            }
            if (player.getHeight() != player.getClientHeight()) {
                player.getGameEncoder().sendMessage("You can't do this here.");
                break;
            }
            player.setAnimation(719);
            player.setGraphic(114, 92);
            player.getInventory().deleteItem(onItemID, 1, onSlot);
            if (onItemID == ItemID.SAPPHIRE_RING) {
                player.getInventory().addItem(ItemID.RING_OF_RECOIL, 1, onSlot);
            } else if (onItemID == ItemID.SAPPHIRE_NECKLACE) {
                player.getInventory().addItem(ItemID.GAMES_NECKLACE_8, 1, onSlot);
            } else if (onItemID == ItemID.SAPPHIRE_AMULET) {
                player.getInventory().addItem(ItemID.AMULET_OF_MAGIC, 1, onSlot);
            } else if (onItemID == ItemID.SAPPHIRE_BRACELET) {
                player.getInventory().addItem(ItemID.BRACELET_OF_CLAY, 1, onSlot);
            }
            player.getMagic().deleteRunes(ItemID.WATER_RUNE, 1);
            player.getMagic().deleteRunes(ItemID.COSMIC_RUNE, 1);
            player.getSkills().addXP(Skills.MAGIC, 18);
            player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
            break;
        case WidgetChild.SpellBook.LVL_2_ENCHANT:
            if (player.getSkills().getLevel(Skills.MAGIC) < 27) {
                player.getGameEncoder().sendMessage("You need a Magic level of 27 to cast this spell.");
                break;
            } else if (!player.getMagic().hasRunes(ItemID.AIR_RUNE, 3)
                    || !player.getMagic().hasRunes(ItemID.COSMIC_RUNE, 1)) {
                player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                break;
            } else if (onItemID != ItemID.EMERALD_RING && onItemID != ItemID.EMERALD_NECKLACE
                    && onItemID != ItemID.EMERALD_AMULET && onItemID != ItemID.EMERALD_BRACELET) {
                player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                break;
            }
            if (player.getHeight() != player.getClientHeight()) {
                player.getGameEncoder().sendMessage("You can't do this here.");
                break;
            }
            player.setAnimation(719);
            player.setGraphic(114, 92);
            player.getInventory().deleteItem(onItemID, 1, onSlot);
            if (onItemID == ItemID.EMERALD_RING) {
                player.getInventory().addItem(ItemID.RING_OF_DUELING_8, 1, onSlot);
            } else if (onItemID == ItemID.EMERALD_NECKLACE) {
                player.getInventory().addItem(ItemID.BINDING_NECKLACE, 1, onSlot);
            } else if (onItemID == ItemID.EMERALD_AMULET) {
                player.getInventory().addItem(ItemID.AMULET_OF_DEFENCE, 1, onSlot);
            } else if (onItemID == ItemID.EMERALD_BRACELET) {
                player.getInventory().addItem(ItemID.CASTLE_WARS_BRACELET_3, 1, onSlot);
            }
            player.getMagic().deleteRunes(ItemID.AIR_RUNE, 3);
            player.getMagic().deleteRunes(ItemID.COSMIC_RUNE, 1);
            player.getSkills().addXP(Skills.MAGIC, 37);
            player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
            break;
        case WidgetChild.SpellBook.SUPERHEAT_ITEM:
            if (player.getSkills().getLevel(Skills.MAGIC) < 43) {
                player.getGameEncoder().sendMessage("You need a Magic level of 43 to cast this spell.");
                break;
            } else if (!player.getMagic().hasRunes(ItemID.FIRE_RUNE, 4)
                    || !player.getMagic().hasRunes(ItemID.NATURE_RUNE, 1)) {
                player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                break;
            }
            var makeID = -1;
            if (onItemID == Smithing.COPPER_ORE_ID || onItemID == Smithing.TIN_ORE_ID) {
                makeID = Smithing.BRONZE_BAR_ID;
            } else if (onItemID == Smithing.BLURITE_ORE_ID) {
                makeID = Smithing.BLURITE_BAR_ID;
            } else if (onItemID == Smithing.IRON_ORE_ID && player.getInventory().getCount(Smithing.COAL_ID) >= 2) {
                makeID = Smithing.STEEL_BAR_ID;
            } else if (onItemID == Smithing.IRON_ORE_ID) {
                makeID = Smithing.IRON_BAR_ID;
            } else if (onItemID == Smithing.SILVER_ORE_ID) {
                makeID = Smithing.SILVER_BAR_ID;
            } else if (onItemID == Smithing.GOLD_ORE_ID) {
                makeID = Smithing.GOLD_BAR_ID;
            } else if (onItemID == Smithing.MITHRIL_ORE_ID) {
                makeID = Smithing.MITHRIL_BAR_ID;
            } else if (onItemID == Smithing.ADAMANT_ORE_ID) {
                makeID = Smithing.ADAMANT_BAR_ID;
            } else if (onItemID == Smithing.RUNE_ORE_ID) {
                makeID = Smithing.RUNE_BAR_ID;
            } else {
                player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                break;
            }
            if (!Smithing.make1(player, makeID)) {
                break;
            }
            player.setAnimation(725);
            player.setGraphic(148, 92);
            player.getMagic().deleteRunes(ItemID.FIRE_RUNE, 5);
            player.getMagic().deleteRunes(ItemID.NATURE_RUNE, 1);
            player.getSkills().addXP(Skills.MAGIC, 53);
            player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
            player.setUseWidgetOnWidgetDelay(2);
            break;
        case WidgetChild.SpellBook.LVL_3_ENCHANT:
            if (player.getSkills().getLevel(Skills.MAGIC) < 49) {
                player.getGameEncoder().sendMessage("You need a Magic level of 49 to cast this spell.");
                break;
            } else if (!player.getMagic().hasRunes(ItemID.FIRE_RUNE, 5)
                    || !player.getMagic().hasRunes(ItemID.COSMIC_RUNE, 1)) {
                player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                break;
            } else if (onItemID != 1641 && onItemID != 1660 && onItemID != 1698 && onItemID != 11085) {
                player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                break;
            }
            if (player.getHeight() != player.getClientHeight()) {
                player.getGameEncoder().sendMessage("You can't do this here.");
                break;
            }
            player.setAnimation(720);
            player.setGraphic(115, 92);
            player.getInventory().deleteItem(onItemID, 1, onSlot);
            if (onItemID == 1641) {
                player.getInventory().addItem(2568, 1, onSlot);
            } else if (onItemID == 1660) {
                player.getInventory().addItem(11194, 1, onSlot);
            } else if (onItemID == 1698) {
                player.getInventory().addItem(1725, 1, onSlot);
            } else if (onItemID == 11085) {
                player.getInventory().addItem(11088, 1, onSlot);
            }
            player.getMagic().deleteRunes(ItemID.FIRE_RUNE, 5);
            player.getMagic().deleteRunes(ItemID.COSMIC_RUNE, 1);
            player.getSkills().addXP(Skills.MAGIC, 59);
            player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
            break;
        case WidgetChild.SpellBook.HIGH_LEVEL_ALCHEMY:
            if (player.getSkills().getLevel(Skills.MAGIC) < 55) {
                player.getGameEncoder().sendMessage("You need a Magic level of 55 to cast this spell.");
                break;
            } else if (!player.getMagic().hasRunes(ItemID.NATURE_RUNE, 1)
                    || !player.getMagic().hasRunes(ItemID.FIRE_RUNE, 5)) {
                player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                break;
            } else if (onItemID == ItemID.COINS) {
                player.getGameEncoder().sendMessage("You can't alch coins.");
                break;
            } else if (onItemID == ItemID.BLOOD_MONEY) {
                player.getGameEncoder().sendMessage("You can't alch blood money.");
                break;
            } else if (onItemID == ItemID.OLD_SCHOOL_BOND || onItemID == ItemID.OLD_SCHOOL_BOND_UNTRADEABLE
                    || onItemID == ItemID._14_DAYS_GOLD_MEMBERSHIP_32303) {
                player.getGameEncoder().sendMessage("You can't alch bonds.");
                break;
            } else if (ItemDef.getUntradable(onItemID)) {
                player.getGameEncoder().sendMessage("You can't alch this item.");
                break;
            } else if (ItemDef.isFree(onItemID)) {
                player.getGameEncoder().sendMessage("You can't alch this item.");
                break;
            }
            if (player.getHeight() != player.getClientHeight()) {
                player.getGameEncoder().sendMessage("You can't do this here.");
                break;
            }
            var value = ItemDef.getHighAlch(onItemID);
            var inventoryCoinCount = player.getInventory().getCount(ItemID.COINS);
            var emptyInventoryIndex = player.getInventory().getEmptySlot();
            if (emptyInventoryIndex == -1 && (inventoryCoinCount == Item.MAX_AMOUNT
                    || inventoryCoinCount + value <= 0
                    || inventoryCoinCount + value > Item.MAX_AMOUNT)) {
                player.getInventory().notEnoughSpace();
                break;
            }
            if (player.getInventory().addItem(ItemID.COINS, value).item == null) {
                break;
            }
            player.setAnimation(713);
            player.setGraphic(113, 92);
            player.getInventory().deleteItem(onItemID, 1, onSlot);
            player.getMagic().deleteRunes(ItemID.NATURE_RUNE, 1);
            player.getMagic().deleteRunes(ItemID.FIRE_RUNE, 5);
            player.getSkills().addXP(Skills.MAGIC, 65);
            player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
            break;
        case WidgetChild.SpellBook.LVL_4_ENCHANT:
            if (player.getSkills().getLevel(Skills.MAGIC) < 57) {
                player.getGameEncoder().sendMessage("You need a Magic level of 57 to cast this spell.");
                break;
            } else if (!player.getMagic().hasRunes(ItemID.EARTH_RUNE, 10)
                    || !player.getMagic().hasRunes(ItemID.COSMIC_RUNE, 1)) {
                player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                break;
            } else if (onItemID != 1643 && onItemID != 1662 && onItemID != 1700 && onItemID != 11092) {
                player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                break;
            }
            if (player.getHeight() != player.getClientHeight()) {
                player.getGameEncoder().sendMessage("You can't do this here.");
                break;
            }
            player.setAnimation(720);
            player.setGraphic(115, 92);
            player.getInventory().deleteItem(onItemID, 1, onSlot);
            if (onItemID == 1643) {
                player.getInventory().addItem(2570, 1, onSlot);
            } else if (onItemID == 1662) {
                player.getInventory().addItem(11090, 1, onSlot);
            } else if (onItemID == 1700) {
                player.getInventory().addItem(1731, 1, onSlot);
            } else if (onItemID == 11092) {
                player.getInventory().addItem(11095, 1, onSlot);
            }
            player.getMagic().deleteRunes(ItemID.EARTH_RUNE, 10);
            player.getMagic().deleteRunes(ItemID.COSMIC_RUNE, 1);
            player.getSkills().addXP(Skills.MAGIC, 67);
            player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
            break;
        case WidgetChild.SpellBook.LVL_5_ENCHANT:
            if (player.getSkills().getLevel(Skills.MAGIC) < 68) {
                player.getGameEncoder().sendMessage("You need a Magic level of 68 to cast this spell.");
                break;
            } else if (!player.getMagic().hasRunes(ItemID.WATER_RUNE, 15)
                    || !player.getMagic().hasRunes(ItemID.EARTH_RUNE, 15)
                    || !player.getMagic().hasRunes(ItemID.COSMIC_RUNE, 1)) {
                player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                break;
            } else if (onItemID != 1664 && onItemID != 1702 && onItemID != 11115) {
                player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                break;
            }
            if (player.getHeight() != player.getClientHeight()) {
                player.getGameEncoder().sendMessage("You can't do this here.");
                break;
                }
            }
            player.setAnimation(721);
            player.setGraphic(116, 92);
            player.getInventory().deleteItem(onItemID, 1, onSlot);
            if (onItemID == 1664) {
                player.getInventory().addItem(11105, 1, onSlot);
            } else if (onItemID == 1702) {
                player.getInventory().addItem(1712, 1, onSlot);
            } else if (onItemID == 11115) {
                player.getInventory().addItem(11118, 1, onSlot);
            }
            player.getMagic().deleteRunes(ItemID.WATER_RUNE, 15);
            player.getMagic().deleteRunes(ItemID.EARTH_RUNE, 15);
            player.getMagic().deleteRunes(ItemID.COSMIC_RUNE, 1);
            player.getSkills().addXP(Skills.MAGIC, 78);
            player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
            break;
        case WidgetChild.SpellBook.LVL_6_ENCHANT:
            if (player.getSkills().getLevel(Skills.MAGIC) < 87) {
                player.getGameEncoder().sendMessage("You need a Magic level of 87 to cast this spell.");
                break;
            } else if (!player.getMagic().hasRunes(ItemID.EARTH_RUNE, 20)
                    || !player.getMagic().hasRunes(ItemID.FIRE_RUNE, 20)
                    || !player.getMagic().hasRunes(ItemID.COSMIC_RUNE, 1)) {
                player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                break;
            } else if (onItemID != 6575 && onItemID != 6577 && onItemID != 6581 && onItemID != 11130) {
                player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                break;
            }
            if (player.getHeight() != player.getClientHeight()) {
                player.getGameEncoder().sendMessage("You can't do this here.");
                break;
            }
            player.setAnimation(721);
            player.setGraphic(452, 92);
            player.getInventory().deleteItem(onItemID, 1, onSlot);
            if (onItemID == 6575) {
                player.getInventory().addItem(6583, 1, onSlot);
            } else if (onItemID == 6577) {
                player.getInventory().addItem(11128, 1, onSlot);
            } else if (onItemID == 6581) {
                player.getInventory().addItem(6585, 1, onSlot);
            } else if (onItemID == 11130) {
                player.getInventory().addItem(11133, 1, onSlot);
            }
            player.getMagic().deleteRunes(ItemID.EARTH_RUNE, 20);
            player.getMagic().deleteRunes(ItemID.FIRE_RUNE, 20);
            player.getMagic().deleteRunes(ItemID.COSMIC_RUNE, 1);
            player.getSkills().addXP(Skills.MAGIC, 97);
            player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
            break;
        case WidgetChild.SpellBook.LVL_7_ENCHANT:
            if (player.getSkills().getLevel(Skills.MAGIC) < 93) {
                player.getGameEncoder().sendMessage("You need a Magic level of 93 to cast this spell.");
                break;
            } else if (!player.getMagic().hasRunes(ItemID.BLOOD_RUNE, 20)
                    || !player.getMagic().hasRunes(566, 20)
                    || !player.getMagic().hasRunes(ItemID.COSMIC_RUNE, 1)) {
                player.getGameEncoder().sendMessage("You do not have enough runes to cast this spell.");
                break;
            } else if (onItemID != 19538 && onItemID != 19535 && onItemID != 19541 && onItemID != 19532) {
                player.getGameEncoder().sendMessage("You can't use this spell on this item.");
                break;
            }
            if (player.getHeight() != player.getClientHeight()) {
                player.getGameEncoder().sendMessage("You can't do this here.");
                break;
            }
            player.setAnimation(721);
            player.setGraphic(452, 92);
            player.getInventory().deleteItem(onItemID, 1, onSlot);
            if (onItemID == 19538) {
                player.getInventory().addItem(19550, 1, onSlot);
            } else if (onItemID == 19535) {
                player.getInventory().addItem(19547, 1, onSlot);
            } else if (onItemID == 19541) {
                player.getInventory().addItem(19553, 1, onSlot);
            } else if (onItemID == 19532) {
                player.getInventory().addItem(19544, 1, onSlot);
            }
            player.getMagic().deleteRunes(ItemID.BLOOD_RUNE, 20);
            player.getMagic().deleteRunes(566, 20);
            player.getMagic().deleteRunes(ItemID.COSMIC_RUNE, 1);
            player.getSkills().addXP(Skills.MAGIC, 110);
            player.getGameEncoder().sendViewingIcon(WidgetChild.ViewportIcon.MAGIC);
            break;
        }
    }
}

DecodedPacketWidgetOnMapObject.prototype.doAction = function(player, interfaceID, childID, itemSlot, object) {
    if (interfaceID == WidgetID.INVENTORY) {
        var item = player.getInventory().getItem(itemSlot);
        if (item == null) {
            return;
        }
        var itemID = player.getInventory().getID(itemSlot);
        switch (object.getID()) {
        case 18808: // Treasure chest
            player.getClueChest().addItem(itemID);
            break;
        case 34628: // Machinery
            if (!player.getInventory().hasItem(ItemID.HAMMER)) {
                player.getGameEncoder().sendMessage("You need a hammer to use this machinery.");
                break;
            }
            if (itemID == ItemID.HYDRA_LEATHER) {
                player.getInventory().deleteItem(itemID, 1, itemSlot);
                player.getInventory().addItem(ItemID.FEROCIOUS_GLOVES, 1, itemSlot);
                player.getGameEncoder().sendMessage("By feeding the tough to work leather through the machine, you manage to form a pair of gloves.");
            } else if (itemID == ItemID.FEROCIOUS_GLOVES) {
                player.getInventory().deleteItem(itemID, 1, itemSlot);
                player.getInventory().addItem(ItemID.HYDRA_LEATHER, 1, itemSlot);
                player.getGameEncoder().sendMessage("By feeding the gloves through the machine, you manage to revert them into leather.");
            }
            break;
        case 24004: // Waterpump
            if (itemID == 1925) {
                player.getInventory().deleteItem(itemID, 1, itemSlot);
                player.getInventory().addItem(1929, 1, itemSlot);
                AchievementDiary.makeItemHooks(player, -1, new Item(1929, 1), null, null);
            }
            break;
        case 733: // Web
            if ((ItemDef.getWeaponType(itemID) == null || !ItemDef.getWeaponType(itemID).hasSlash())
                    && itemID != 946) {
                player.getGameEncoder().sendMessage("Only a sharp blade can cut through this sticky web.");
                return;
            }
            player.setAnimation(player.getCombat().getAttackAnimation());
            if (Utils.randomE(4) != 0) {
                player.getGameEncoder().sendMessage("You fail to cut through it.");
                return;
            }
            player.getGameEncoder().sendMessage("You slash the web apart.");
            var newWeb = new MapObject(object.getID() + 1, object);
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
                    player.getGameEncoder().sendMessage("You push the mine cart and it travels deeper into the mine.");
                    player.setAnimation(4343);
                    player.getGameEncoder().sendRemoveMapObject(object);
                } else {
                    player.getGameEncoder().sendMessage("You have already pushed a mine cart deeper into the mine.");
                }
            } else {
                player.getGameEncoder().sendMessage("Nothing interesting happens.");
            }
            break;
        case 2638: // Fountain of Heroes
            if (itemID != 1704 && itemID != 1705) {
                player.getGameEncoder().sendMessage("Nothing interesting happens.");
                break;
            }
            var gloryCount = player.getInventory().getCount(itemID);
            player.getInventory().deleteItem(itemID, gloryCount);
            player.getInventory().addItem(ItemDef.getNoted(itemID) ? 1713 : 1712, gloryCount);
            break;
        case 884: // Wishing well
            if (itemID == ItemID.COINS) {
                player.openDialogue("wishingwell", 2);
                return;
            } else if (!WishingWell.canDonateItem(itemID)) {
                player.getGameEncoder().sendMessage("The well won't take this item.");
                break;
            }
            player.openDialogue("wishingwell", 4);
            if (itemID == ItemID.OLD_SCHOOL_BOND) {
                Dialogue.setText(player, item.getName() + " x" + Utils.formatNumber(item.getAmount()) + ": "
                        + Utils.formatNumber(Utils.multiplyInt(WishingWell.BOND_VALUE, item.getAmount(),
                        Item.MAX_AMOUNT)), null);
            } else {
                Dialogue.setText(player, item.getName() + " x" + Utils.formatNumber(item.getAmount()) + ": "
                        + Utils.formatNumber(Utils.multiplyInt(item.getDef().getConfiguredExchangePrice(),
                        item.getAmount(), Item.MAX_AMOUNT)), null);
            }
            player.putAttribute("wishing_well_item_id", itemID);
            player.getWidgetManager().addChatboxCloseEvent(new WidgetManager.CloseEvent() {
                execute: function() {
                    player.removeAttribute("wishing_well_item_id");
                }
            });
            break;
        case 29087: // Coffer
            if (!ClanWarsTournament.canDonateItem(itemID)) {
                player.getGameEncoder().sendMessage("The coffer won't take this item.");
                break;
            }
            player.openDialogue("clanwars", 3);
            Dialogue.setText(player, item.getName() + " x" + Utils.formatNumber(item.getAmount()), null);
            player.putAttribute("clan_wars_coffer_item_id", itemID);
            player.getWidgetManager().addChatboxCloseEvent(new WidgetManager.CloseEvent() {
                execute: function() {
                    player.removeAttribute("clan_wars_coffer_item_id");
                }
            });
            break;
        case 28900: // Catacombs of Kourend Altar
            if (itemID == 6746 || itemID == 19675) {
                player.getCharges().chargeFromInventory(19675, itemSlot, 1, new Item(19677, 3), 1000);
            } else if (itemID == 19685) {
                player.openDialogue("catacombsofkourend", 1);
            }
            break;
        case 2965: // Legends Quest Mossy rock
            if (itemID == 744) {
                player.getInventory().deleteItem(744, 1, itemSlot);
                player.getInventory().addItem(745, 1, itemSlot);
                player.getGameEncoder().sendMessage("The rocks vibrate and hum and the crystal starts to glow.");
            } else {
                player.getGameEncoder().sendMessage("Nothing interesting happens. Maybe I should try something else...");
            }
            break;
        case 2966: // Legends Quest Furnace
            if (itemID == 741 || itemID == 742 || itemID == 743) {
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
            if (itemID == 954) {
                player.getGameEncoder().sendMessage("You shimmy down the rope into the darkness.");
                player.getMovement().ladderUpTeleport(new Tile(2377, 4712, 0));
            } else {
                player.getGameEncoder().sendMessage("Nothing interesting happens.");
            }
            break;
        case 5249:
        case 9682:
        case 10660:
        case 12269:
        case 26185: // Range / Fire
            if (Cooking.canCook(itemID)) {
                Cooking.open(player, itemID, object);
                break;
            }
        case 23955: // Magical animator
            switch (itemID) {
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
            if (!Prayer.isBone(itemID)) {
                break;
            }
            player.openDialogue("prayer", 0);
            player.getWidgetManager().sendChatboxOverlay(WidgetID.MAKE_X, new WidgetManager.CloseEvent() {
                execute: function(value) {
                    player.removeAttribute("map_object");
                    player.removeAttribute("item_id");
                }
            });
            player.getGameEncoder().sendMakeX("How many would you like to use?", 14,
                    player.getInventory().getCount(itemID), itemID);
            player.putAttribute("item_id", itemID);
            player.putAttribute("map_object", object);
            break;
        case 16469:
        case 26300:
        case 21303:
        case 4304:
        case 24009: // Furnace
            if (itemID == Smithing.COPPER_ORE_ID || itemID == Smithing.TIN_ORE_ID
                    || itemID == Smithing.IRON_ORE_ID || itemID == Smithing.SILVER_ORE_ID
                    || itemID == Smithing.GOLD_ORE_ID || itemID == Smithing.MITHRIL_ORE_ID
                    || itemID == Smithing.ADAMANT_ORE_ID || itemID == Smithing.RUNE_ORE_ID
                    || itemID == Smithing.COAL_ID || itemID == ItemID.BLURITE_ORE) {
                Smithing.openSmelt(player);
            }
            break;
        case 2031:
        case 2097:
        case 4306: // Anvil
            if (itemID == Smithing.BRONZE_BAR_ID || itemID == Smithing.IRON_BAR_ID
                    || itemID == Smithing.STEEL_BAR_ID || itemID == Smithing.MITHRIL_BAR_ID
                    || itemID == Smithing.ADAMANT_BAR_ID || itemID == Smithing.RUNE_BAR_ID
                    || itemID == Smithing.BLURITE_IDS) {
                Smithing.openSmith(player, itemID);
            }
            break;
        case 9682:
        case 26181:
        case 21032:
            if (Cooking.canCook(itemID)) {
                Cooking.open(player, itemID, object);
            } else {
                player.getGameEncoder().sendMessage("Nothing interesting happens.");
            }
            break;
        case 27029:
            if (itemID != 13273) {
                player.getGameEncoder().sendMessage("Nothing interesting happens.");
                break;
            }
            player.setAnimation(Prayer.PRAY_ANIMATION);
            player.getWorld().sendMapGraphic(player.getController(), new Tile(3039, 4774), 1276, 0, 0);
            var droppedID = -1;
            if (Utils.randomE(128) < 5) {
                droppedID = 13262; // Abyssal orphan
            } else if (Utils.randomE(128) < 10) {
                droppedID = 7979; // Abyssal head
            } else if (Utils.randomE(128) < 12) {
                droppedID = 4151; // Abyssal whip
            } else if (Utils.randomE(128) < 13) {
                droppedID = 13277; // Jar of miasma
            } else if (Utils.randomE(128) < 26) {
                droppedID = 13265; // Abyssal dagger
            } else {
                if (!player.hasItem(13274)) {
                    droppedID = 13274; // Bludgeon spine
                } else if (!player.hasItem(13275)) {
                    droppedID = 13275; // Bludgeon claw
                } else if (!player.hasItem(13276)) {
                    droppedID = 13276; // Bludgeon axon
                } else {
                    droppedID = 13274 + Utils.randomI(2);
                }
            }
            var unsiredKillCount = (player.getInventory().getAttachment(itemSlot) != null)
                    ? player.getInventory().getAttachment(itemSlot) : 0;
            if (unsiredKillCount > 0) {
                player.getCombat().logNPCItem("Abyssal Sire", droppedID, 1, unsiredKillCount);
            } else {
                player.getCombat().logNPCItem("Abyssal Sire", droppedID, 1);
            }
            if (droppedID == 13262 || droppedID == 13265 || droppedID >= 13274 && droppedID <= 13276) {
                player.getWorld().sendItemDropNews(player, droppedID);
            }
            player.getInventory().deleteItem(itemID, 1, itemSlot);
            player.getInventory().addItem(droppedID, 1, itemSlot);
            break;
        default:
            player.getGameEncoder().sendMessage("Nothing interesting happens.");
            break;
        }
    }
}
