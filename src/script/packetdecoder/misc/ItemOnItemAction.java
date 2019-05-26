package script.packetdecoder.misc;

import com.palidino.osrs.io.cache.ItemId;
import com.palidino.osrs.io.cache.WidgetId;
import com.palidino.osrs.model.dialogue.Dialogue;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.item.ItemDef;
import com.palidino.osrs.model.player.Cooking;
import com.palidino.osrs.model.player.Fletching;
import com.palidino.osrs.model.player.Herblore;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import com.palidino.osrs.model.player.Slayer;
import com.palidino.osrs.model.player.WidgetManager;

public class ItemOnItemAction {
    public static void doAction(Player player, int useInterfaceId, int useChildId, int onInterfaceId, int onChildId,
            int useSlot, int onSlot, int useItemId, int onItemId) {
        if (useInterfaceId == WidgetId.INVENTORY && onInterfaceId == WidgetId.INVENTORY) {
            player.clearAllActions(false, false);
            if (player.getInventory().getId(useSlot) != useItemId || player.getInventory().getId(onSlot) != onItemId) {
                return;
            }
            if (player.getSkills().decantPotion(useItemId, onItemId, useSlot, onSlot)) {
                return;
            } else if (player.getFarming().itemOnItem(useItemId, onItemId)) {
                return;
            }
            if (!player.inEdgeville() || player.getClientHeight() == player.getHeight()) {
                if (Herblore.openMix(player, useItemId, onItemId)) {
                    return;
                } else if (Fletching.openMake(player, useItemId, onItemId)) {
                    return;
                }
            }
            Item useItem = player.getInventory().getItem(useSlot);
            Item onItem = player.getInventory().getItem(onSlot);
            if (used(useItemId, onItemId, ItemId.DRAKES_TOOTH, ItemId.HOLY_SANDALS)) {
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.DEVOUT_BOOTS, 1, onSlot);
            } else if (used(useItemId, onItemId, ItemId.DRAKES_CLAW, ItemId.BOOTS_OF_STONE)) {
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.BOOTS_OF_BRIMSTONE, 1, onSlot);
            } else if (used(useItemId, onItemId, ItemId.ZAMORAKIAN_HASTA, ItemId.HYDRAS_CLAW)) {
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.DRAGON_HUNTER_LANCE, 1, onSlot);
            } else if (used(useItemId, onItemId, 4151, 12004)) {
                // Abyssal whip and Kraken tentacle
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12006, 1, onSlot).item.setAttachment(10000);
            } else if (useItemId == 12006 && onItemId == 12006) {
                // Abyssal tentacle and Abyssal tentacle
                if (onItem.getCharges() == onItem.getDef().getDegradeTime()) {
                    player.getGameEncoder().sendMessage("Your abyssal tentacle is already fully charged.");
                    return;
                }
                onItem.setAttachment(
                        Math.min(onItem.getDef().getDegradeTime(), onItem.getCharges() + useItem.getCharges()));
                player.getInventory().deleteItem(useItemId, 1, useSlot);
            } else if (used(useItemId, onItemId, 22486, 22446) || used(useItemId, onItemId, 22325, 22446)) {
                // Scythe of vitur/(uncharged) and Vial of blood
                int vialOfBloodCount = player.getInventory().getCount(22446);
                if (player.getInventory().getCount(565) < 300 * vialOfBloodCount) {
                    player.getGameEncoder().sendMessage("You need " + 300 * vialOfBloodCount + " blood runes to do ");
                    return;
                }
                int chargingSlot = useItemId == 22325 || useItemId == 22486 ? useSlot : onSlot;
                int charges = player.getCharges().chargeFromInventory(22325, chargingSlot, vialOfBloodCount,
                        new Item(22446, 1), 100);
                if (charges > 0) {
                    player.getInventory().deleteItem(565, 300 * charges);
                }
            } else if (used(useItemId, onItemId, 11908, 12004)) {
                if (player.getInventory().getCount(12004) < 10) {
                    player.getGameEncoder().sendMessage("You need 10 kraken tentacles to do ");
                    return;
                }
                int chargingSlot = useItemId == 11908 ? useSlot : onSlot;
                player.getInventory().deleteItem(11908, 1, chargingSlot);
                player.getInventory().deleteItem(12004, 10);
                player.getInventory().addItem(22290, 1, chargingSlot);
            } else if (used(useItemId, onItemId, 11908, 560) || used(useItemId, onItemId, 11907, 560)
                    || used(useItemId, onItemId, 11908, 562) || used(useItemId, onItemId, 11907, 562)
                    || used(useItemId, onItemId, 11908, 554) || used(useItemId, onItemId, 11907, 554)) {
                // Trident of the seas
                int deathRuneCount = player.getInventory().getCount(560);
                int chaosRuneCount = player.getInventory().getCount(562);
                int fireRuneCount = player.getInventory().getCount(554);
                int coinsCount = player.getInventory().getCount(ItemId.COINS);
                int maxCharges = Math.min(deathRuneCount, chaosRuneCount);
                maxCharges = Math.min(maxCharges, fireRuneCount / 5);
                maxCharges = Math.min(maxCharges, coinsCount / 10);
                if (maxCharges == 0) {
                    player.getGameEncoder()
                            .sendMessage("Each charge requires 1 death rune, 1 chaos rune, 5 fire runes and 10 coins.");
                    return;
                }
                int chargingSlot = useItemId == 11907 || useItemId == 11908 ? useSlot : onSlot;
                int charges =
                        player.getCharges().chargeFromInventory(11907, chargingSlot, maxCharges, new Item(560, 1), 1);
                if (charges > 0) {
                    player.getInventory().deleteItem(562, charges);
                    player.getInventory().deleteItem(554, charges * 5);
                    player.getInventory().deleteItem(ItemId.COINS, charges * 10);
                }
                Item chargedItem = player.getInventory().getItem(chargingSlot);
                if (chargedItem.getCharges() == chargedItem.getDef().getDegradeTime()) {
                    player.getInventory().deleteItem(chargedItem, chargingSlot);
                    player.getInventory().addItem(11905, 1, chargingSlot);
                }
            } else if (used(useItemId, onItemId, 22290, 560) || used(useItemId, onItemId, 22288, 560)
                    || used(useItemId, onItemId, 22290, 562) || used(useItemId, onItemId, 22288, 562)
                    || used(useItemId, onItemId, 22290, 554) || used(useItemId, onItemId, 22288, 554)) {
                // Trident of the seas (e)
                int deathRuneCount = player.getInventory().getCount(560);
                int chaosRuneCount = player.getInventory().getCount(562);
                int fireRuneCount = player.getInventory().getCount(554);
                int coinsCount = player.getInventory().getCount(ItemId.COINS);
                int maxCharges = Math.min(deathRuneCount, chaosRuneCount);
                maxCharges = Math.min(maxCharges, fireRuneCount / 5);
                maxCharges = Math.min(maxCharges, coinsCount / 10);
                if (maxCharges == 0) {
                    player.getGameEncoder()
                            .sendMessage("Each charge requires 1 death rune, 1 chaos rune, 5 fire runes and 10 coins.");
                    return;
                }
                int chargingSlot = useItemId == 22288 || useItemId == 22290 ? useSlot : onSlot;
                int charges =
                        player.getCharges().chargeFromInventory(22288, chargingSlot, maxCharges, new Item(560, 1), 1);
                if (charges > 0) {
                    player.getInventory().deleteItem(562, charges);
                    player.getInventory().deleteItem(554, charges * 5);
                    player.getInventory().deleteItem(ItemId.COINS, charges * 10);
                }
            } else if (used(useItemId, onItemId, 12900, 560) || used(useItemId, onItemId, 12899, 560)
                    || used(useItemId, onItemId, 12900, 562) || used(useItemId, onItemId, 12899, 562)
                    || used(useItemId, onItemId, 12900, 554) || used(useItemId, onItemId, 12899, 554)
                    || used(useItemId, onItemId, 12900, 12934) || used(useItemId, onItemId, 12899, 12934)) {
                // Trident of the swamp
                int deathRuneCount = player.getInventory().getCount(560);
                int chaosRuneCount = player.getInventory().getCount(562);
                int fireRuneCount = player.getInventory().getCount(554);
                int ZulrahScaleCount = player.getInventory().getCount(12934);
                int coinsCount = player.getInventory().getCount(ItemId.COINS);
                int maxCharges = Math.min(deathRuneCount, chaosRuneCount);
                maxCharges = Math.min(maxCharges, fireRuneCount / 5);
                maxCharges = Math.min(maxCharges, coinsCount / 10);
                maxCharges = Math.min(maxCharges, ZulrahScaleCount);
                if (maxCharges == 0) {
                    player.getGameEncoder().sendMessage(
                            "Each charge requires 1 death rune, 1 chaos rune, 5 fire runes, 10 coins and 1 Zulrah's scale.");
                    return;
                }
                int chargingSlot = useItemId == 12899 || useItemId == 12900 ? useSlot : onSlot;
                int charges =
                        player.getCharges().chargeFromInventory(12899, chargingSlot, maxCharges, new Item(560, 1), 1);
                if (charges > 0) {
                    player.getInventory().deleteItem(562, charges);
                    player.getInventory().deleteItem(554, charges * 5);
                    player.getInventory().deleteItem(ItemId.COINS, charges * 10);
                    player.getInventory().deleteItem(12934, charges);
                }
            } else if (used(useItemId, onItemId, 22294, 560) || used(useItemId, onItemId, 22292, 560)
                    || used(useItemId, onItemId, 22294, 562) || used(useItemId, onItemId, 22292, 562)
                    || used(useItemId, onItemId, 22294, 554) || used(useItemId, onItemId, 22292, 554)
                    || used(useItemId, onItemId, 22294, 12934) || used(useItemId, onItemId, 22292, 12934)) {
                // Trident of the swamp (e)
                int deathRuneCount = player.getInventory().getCount(560);
                int chaosRuneCount = player.getInventory().getCount(562);
                int fireRuneCount = player.getInventory().getCount(554);
                int ZulrahScaleCount = player.getInventory().getCount(12934);
                int coinsCount = player.getInventory().getCount(ItemId.COINS);
                int maxCharges = Math.min(deathRuneCount, chaosRuneCount);
                maxCharges = Math.min(maxCharges, fireRuneCount / 5);
                maxCharges = Math.min(maxCharges, coinsCount / 10);
                maxCharges = Math.min(maxCharges, ZulrahScaleCount);
                if (maxCharges == 0) {
                    player.getGameEncoder().sendMessage(
                            "Each charge requires 1 death rune, 1 chaos rune, 5 fire runes, 10 coins and 1 Zulrah's scale.");
                    return;
                }
                int chargingSlot = useItemId == 22292 || useItemId == 22294 ? useSlot : onSlot;
                int charges =
                        player.getCharges().chargeFromInventory(22292, chargingSlot, maxCharges, new Item(560, 1), 1);
                if (charges > 0) {
                    player.getInventory().deleteItem(562, charges);
                    player.getInventory().deleteItem(554, charges * 5);
                    player.getInventory().deleteItem(ItemId.COINS, charges * 10);
                    player.getInventory().deleteItem(12934, charges);
                }
            } else if (used(useItemId, onItemId, 22481, 565) || used(useItemId, onItemId, 22323, 565)) {
                // Sanguinesti staff/(uncharged) and Vial of blood
                int chargingSlot = useItemId == 22323 || useItemId == 22481 ? useSlot : onSlot;
                player.getCharges().chargeFromInventory(22323, chargingSlot, player.getInventory().getCount(565),
                        new Item(565, 3), 1);
            } else if (used(useItemId, onItemId, 12954, 22477)) {
                // Dragon defender and Avernic defender hilt
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(22322, 1, onSlot);
            } else if (used(useItemId, onItemId, 21907, 10499)) {
                // Vorkath's head and Ava's accumulator
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(22109, 1, onSlot);
            } else if (used(useItemId, onItemId, 2425, 10499)) {
                // Vorkath's head and Ava's accumulator
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(22109, 1, onSlot);
            } else if (used(useItemId, onItemId, 11791, 13256)) {
                // Staff of the dead and Saradomin's light
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(22296, 1, onSlot);
            } else if (used(useItemId, onItemId, 11838, 12804)) {
                // Saradomin sword and Saradomin's tear
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12808, 1, onSlot);
            } else if (used(useItemId, onItemId, 10587, 4081)) {
                // Tarn's diary and Salve amulet
                player.getInventory().deleteItem(4081, 1, onSlot);
                player.getInventory().addItem(10588, 1, onSlot);
            } else if (used(useItemId, onItemId, 11798, 11810)) {
                // Godsword blade and Armadyl hilt
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(11802, 1, onSlot);
            } else if (used(useItemId, onItemId, 11798, 11812)) {
                // Godsword blade and Bandos hilt
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(11804, 1, onSlot);
            } else if (used(useItemId, onItemId, 11798, 11814)) {
                // Godsword blade and Saradomin hilt
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(11806, 1, onSlot);
            } else if (used(useItemId, onItemId, 11798, 11816)) {
                // Godsword blade and Zamorak hilt
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(11808, 1, onSlot);
            } else if (used(useItemId, onItemId, 20716, 20718)) {
                // Tome of fire (empty) and Burnt page
                if (player.getInventory().getCount(20718) < 10) {
                    player.getGameEncoder().sendMessage("You need 10 burnt pages to do ");
                    return;
                }
                player.getInventory().deleteItem(20716, 1);
                player.getInventory().deleteItem(20718, 10);
                player.getInventory().addItem(20714, 1, onSlot);
            } else if (used(useItemId, onItemId, 1540, 11286)) {
                // Anti-dragon shield and Draconic visage
                if (player.getSkills().getLevel(Skills.SMITHING) < 90) {
                    player.getGameEncoder().sendMessage("You need a Smithing level of 90 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.SMITHING, 2000);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(11284, 1, onSlot);
            } else if (used(useItemId, onItemId, 2890, 21637)) {
                // Elemental shield and Wyvern visage
                if (player.getSkills().getLevel(Skills.SMITHING) < 66) {
                    player.getGameEncoder().sendMessage("You need a Smithing level of 66 to do ");
                    return;
                } else if (player.getSkills().getLevel(Skills.MAGIC) < 66) {
                    player.getGameEncoder().sendMessage("You need a Magic level of 66 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.SMITHING, 2000);
                player.getSkills().addXP(Skills.MAGIC, 2000);
                player.getSkills().changeStat(Skills.MAGIC, -1000);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(21634, 1, onSlot);
                player.getGameEncoder().sendMessage(
                        "At a great cost to your personal magical energies, you have crafted the wyvern visage and elemental shield into an ancient wyvern shield.");
            } else if (used(useItemId, onItemId, 1540, 22006)) {
                // Anti-dragon shield and Skeletal visage
                if (player.getSkills().getLevel(Skills.SMITHING) < 90) {
                    player.getGameEncoder().sendMessage("You need a Smithing level of 90 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.SMITHING, 2000);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(22003, 1, onSlot);
            } else if (used(useItemId, onItemId, 1187, 22100)) {
                // Dragon sq shield and Dragon metal slice
                if (player.getSkills().getLevel(Skills.SMITHING) < 75) {
                    player.getGameEncoder().sendMessage("You need a Smithing level of 75 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.SMITHING, 1000);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(21895, 1, onSlot);
            } else if (used(useItemId, onItemId, 3140, 22103)) {
                // Dragon chainbody and Dragon metal lump
                if (player.getSkills().getLevel(Skills.SMITHING) < 90) {
                    player.getGameEncoder().sendMessage("You need a Smithing level of 90 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.SMITHING, 2000);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(21892, 1, onSlot);
            } else if (used(useItemId, onItemId, 12829, 12833)) {
                // Spirit shield and Holy elixer
                if (player.getSkills().getLevel(Skills.PRAYER) < 85) {
                    player.getGameEncoder().sendMessage("You need a Prayer level of 85 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.SMITHING, 1800);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12831, 1, onSlot);
            } else if (used(useItemId, onItemId, 12831, 12819)) {
                // Blessed spirit shield and Elysian sigil
                if (player.getSkills().getLevel(Skills.SMITHING) < 85) {
                    player.getGameEncoder().sendMessage("You need a Smithing level of 85 to do ");
                    return;
                } else if (player.getSkills().getLevel(Skills.PRAYER) < 90) {
                    player.getGameEncoder().sendMessage("You need a Prayer level of 90 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.SMITHING, 1800);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12817, 1, onSlot);
            } else if (used(useItemId, onItemId, 12831, 12823)) {
                // Blessed spirit shield and Spectral sigil
                if (player.getSkills().getLevel(Skills.SMITHING) < 85) {
                    player.getGameEncoder().sendMessage("You need a Smithing level of 85 to do ");
                    return;
                } else if (player.getSkills().getLevel(Skills.PRAYER) < 90) {
                    player.getGameEncoder().sendMessage("You need a Prayer level of 90 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.SMITHING, 1800);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12821, 1, onSlot);
            } else if (used(useItemId, onItemId, 12831, 12827)) {
                // Blessed spirit shield and Arcane sigil
                if (player.getSkills().getLevel(Skills.SMITHING) < 85) {
                    player.getGameEncoder().sendMessage("You need a Smithing level of 85 to do ");
                    return;
                } else if (player.getSkills().getLevel(Skills.PRAYER) < 90) {
                    player.getGameEncoder().sendMessage("You need a Prayer level of 90 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.SMITHING, 1800);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12825, 1, onSlot);
            } else if (used(useItemId, onItemId, 11864, 7979)) {
                // Slayer helmet and Abyssal head
                if (!player.getSlayer().isUnlocked(Slayer.UNHOLY_HELMET)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19647, 1, onSlot);
            } else if (used(useItemId, onItemId, 11865, 7979)) {
                // Slayer helmet (i) and Abyssal head
                if (!player.getSlayer().isUnlocked(Slayer.UNHOLY_HELMET)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19649, 1, onSlot);
            } else if (used(useItemId, onItemId, 11864, 7981)) {
                // Slayer helmet and Kq head
                if (!player.getSlayer().isUnlocked(Slayer.KALPHITE_KHAT)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19643, 1, onSlot);
            } else if (used(useItemId, onItemId, 11865, 7981)) {
                // Slayer helmet (i) and Kq head
                if (!player.getSlayer().isUnlocked(Slayer.KALPHITE_KHAT)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19645, 1, onSlot);
            } else if (used(useItemId, onItemId, 11864, 7980)) {
                // Slayer helmet and Kbd heads
                if (!player.getSlayer().isUnlocked(Slayer.KING_BLACK_BONNET)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19639, 1, onSlot);
            } else if (used(useItemId, onItemId, 11865, 7980)) {
                // Slayer helmet (i) and Kbd heads
                if (!player.getSlayer().isUnlocked(Slayer.KING_BLACK_BONNET)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19641, 1, onSlot);
            } else if (used(useItemId, onItemId, 11864, 21275)) {
                // Slayer helmet and Dark claw
                if (!player.getSlayer().isUnlocked(Slayer.DARK_MANTLE)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(21264, 1, onSlot);
            } else if (used(useItemId, onItemId, 11865, 21275)) {
                // Slayer helmet (i) and Dark claw
                if (!player.getSlayer().isUnlocked(Slayer.DARK_MANTLE)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(21266, 1, onSlot);
            } else if (used(useItemId, onItemId, 11864, 21907)) {
                // Slayer helmet and Vorkath's head
                if (!player.getSlayer().isUnlocked(Slayer.UNDEAD_HEAD)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(21888, 1, onSlot);
            } else if (used(useItemId, onItemId, 11865, 21907)) {
                // Slayer helmet (i) and Vorkath's head
                if (!player.getSlayer().isUnlocked(Slayer.UNDEAD_HEAD)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(21890, 1, onSlot);
            } else if (used(useItemId, onItemId, ItemId.SLAYER_HELMET, ItemId.ALCHEMICAL_HYDRA_HEADS)) {
                if (!player.getSlayer().isUnlocked(Slayer.USE_MORE_HEAD)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.HYDRA_SLAYER_HELMET, 1, onSlot);
            } else if (used(useItemId, onItemId, ItemId.SLAYER_HELMET_I, ItemId.ALCHEMICAL_HYDRA_HEADS)) {
                if (!player.getSlayer().isUnlocked(Slayer.USE_MORE_HEAD)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.HYDRA_SLAYER_HELMET_I, 1, onSlot);
            } else if (used(useItemId, onItemId, 1755, 12922)) {
                // Chisel and Tanzanite fang
                if (player.getSkills().getLevel(Skills.FLETCHING) < 53) {
                    player.getGameEncoder().sendMessage("You need a Fletching level of 53 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.FLETCHING, 120);
                player.getInventory().deleteItem(12922, 1);
                player.getInventory().addItem(12924, 1, onSlot);
            } else if (used(useItemId, onItemId, 13200, 12929)) {
                // Tanzanite mutagen and Serpentine helm (uncharged)
                player.getInventory().deleteItem(13200, 1);
                if (useItemId == 12929) {
                    player.getInventory().setItem(useSlot, new Item(13196, useItem));
                } else if (onItemId == 12929) {
                    player.getInventory().setItem(onSlot, new Item(13196, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, 13200, 12931)) {
                // Tanzanite mutagen and Serpentine helm
                player.getInventory().deleteItem(13200, 1);
                if (useItemId == 12931) {
                    player.getInventory().setItem(useSlot, new Item(13197, useItem));
                } else if (onItemId == 12931) {
                    player.getInventory().setItem(onSlot, new Item(13197, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, 13201, 12929)) {
                // Magma mutagen and Serpentine helm (uncharged)
                player.getInventory().deleteItem(13201, 1);
                if (useItemId == 12929) {
                    player.getInventory().setItem(useSlot, new Item(13198, useItem));
                } else if (onItemId == 12929) {
                    player.getInventory().setItem(onSlot, new Item(13198, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, 13201, 12931)) {
                // Magma mutagen and Serpentine helm
                player.getInventory().deleteItem(13201, 1);
                if (useItemId == 12931) {
                    player.getInventory().setItem(useSlot, new Item(13199, useItem));
                } else if (onItemId == 12931) {
                    player.getInventory().setItem(onSlot, new Item(13199, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, ItemId.RUNE_DEFENDER, ItemId.RUNE_DEFENDER_ORNAMENT_KIT)) {
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.RUNE_DEFENDER_T, 1, onSlot);
            } else if (used(useItemId, onItemId, ItemId.TZHAAR_KET_OM, ItemId.TZHAAR_KET_OM_ORNAMENT_KIT)) {
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.TZHAAR_KET_OM_T, 1, onSlot);
            } else if (used(useItemId, onItemId, ItemId.BERSERKER_NECKLACE, ItemId.BERSERKER_NECKLACE_ORNAMENT_KIT)) {
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.BERSERKER_NECKLACE_OR, 1, onSlot);
            } else if (used(useItemId, onItemId, ItemId.RUNE_SCIMITAR, ItemId.RUNE_SCIMITAR_ORNAMENT_KIT_GUTHIX)) {
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.RUNE_SCIMITAR_23330, 1, onSlot);
            } else if (used(useItemId, onItemId, ItemId.RUNE_SCIMITAR, ItemId.RUNE_SCIMITAR_ORNAMENT_KIT_SARADOMIN)) {
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.RUNE_SCIMITAR_23332, 1, onSlot);
            } else if (used(useItemId, onItemId, ItemId.RUNE_SCIMITAR, ItemId.RUNE_SCIMITAR_ORNAMENT_KIT_ZAMORAK)) {
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.RUNE_SCIMITAR_23334, 1, onSlot);
            } else if (used(useItemId, onItemId, ItemId.TORMENTED_BRACELET, ItemId.TORMENTED_ORNAMENT_KIT)) {
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(ItemId.TORMENTED_BRACELET_OR, 1, onSlot);
            } else if (used(useItemId, onItemId, 12534, 3140)) {
                // Ornament kit and Dragon chainbody
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12414, 1, onSlot);
            } else if (used(useItemId, onItemId, 12536, 4087)) {
                // Ornament kit and Dragon platelegs
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12415, 1, onSlot);
            } else if (used(useItemId, onItemId, 12536, 4585)) {
                // Ornament kit and Dragon plateskirt
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12416, 1, onSlot);
            } else if (used(useItemId, onItemId, 12532, 1187)) {
                // Ornament kit and Dragon sq shield
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12418, 1, onSlot);
            } else if (used(useItemId, onItemId, 20002, 4587)) {
                // Ornament kit and Dragon scimitar
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(20000, 1, onSlot);
            } else if (used(useItemId, onItemId, 20143, 12954)) {
                // Ornament kit and Dragon defender
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19722, 1, onSlot);
            } else if (used(useItemId, onItemId, 12528, 6918)) {
                // Dark ornament kit and Infinity hat
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12457, 1, onSlot);
            } else if (used(useItemId, onItemId, 12528, 6916)) {
                // Dark ornament kit and Infinity top
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12458, 1, onSlot);
            } else if (used(useItemId, onItemId, 12528, 6924)) {
                // Dark ornament kit and Infinity bottoms
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12459, 1, onSlot);
            } else if (used(useItemId, onItemId, 12530, 6918)) {
                // Light ornament kit and Infinity hat
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12419, 1, onSlot);
            } else if (used(useItemId, onItemId, 12530, 6916)) {
                // Light ornament kit and Infinity top
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12420, 1, onSlot);
            } else if (used(useItemId, onItemId, 12530, 6924)) {
                // Light ornament kit and Infinity bottoms
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12421, 1, onSlot);
            } else if (used(useItemId, onItemId, 12526, 6585)) {
                // Ornament kit and Amulet of fury
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12436, 1, onSlot);
            } else if (used(useItemId, onItemId, 20062, 19553)) {
                // Ornament kit and Amulet of torture
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(20366, 1, onSlot);
            } else if (used(useItemId, onItemId, 12538, 11335)) {
                // Ornament kit and Dragon full helm
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12417, 1, onSlot);
            } else if (used(useItemId, onItemId, 20065, 12002)) {
                // Ornament kit and Occult necklace
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19720, 1, onSlot);
            } else if (used(useItemId, onItemId, 20068, 11802)) {
                // Ornament kit and Armadyl godsword
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(20368, 1, onSlot);
            } else if (used(useItemId, onItemId, 20071, 11804)) {
                // Ornament kit and Bandos godsword
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(20370, 1, onSlot);
            } else if (used(useItemId, onItemId, 20074, 11806)) {
                // Ornament kit and Saradomin godsword
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(20372, 1, onSlot);
            } else if (used(useItemId, onItemId, 20077, 11808)) {
                // Ornament kit and Zamorak godsword
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(20374, 1, onSlot);
            } else if (used(useItemId, onItemId, 22231, 11840)) {
                // Ornament kit and Dragon boots
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(22234, 1, onSlot);
            } else if (used(useItemId, onItemId, 22236, 21892)) {
                // Ornament kit and Dragon platebody
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(22242, 1, onSlot);
            } else if (used(useItemId, onItemId, 22239, 21895)) {
                // Ornament kit and Dragon kiteshield
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(22244, 1, onSlot);
            } else if (used(useItemId, onItemId, 22246, 19547)) {
                // Ornament kit and Necklace of anguish
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(22249, 1, onSlot);
            } else if (used(useItemId, onItemId, 12771, 4151)) {
                // Volcanic whip mix and Abyssal whip
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12773, 1, onSlot);
            } else if (used(useItemId, onItemId, 12769, 4151)) {
                // Frozen whip mix and Abyssal whip
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12774, 1, onSlot);
            } else if (used(useItemId, onItemId, 12849, 4153)) {
                // Granite clamp and Granite maul
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12848, 1, onSlot);
            } else if (used(useItemId, onItemId, 12802, 11926)) {
                // Ward upgrade kit and Odium ward
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12807, 1, onSlot);
            } else if (used(useItemId, onItemId, 12802, 11924)) {
                // Ward upgrade kit and Malediction ward
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12806, 1, onSlot);
            } else if (used(useItemId, onItemId, 12800, 11920)) {
                // Dragon pickaxe upgrade kit and Dragon pickaxe
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(12797, 1, onSlot);
            } else if (used(useItemId, onItemId, 19586, 19592) || used(useItemId, onItemId, 19586, 19601)) {
                // Light frame and Ballista limbs/spring
                if (!player.getInventory().hasItem(19592)) {
                    player.getGameEncoder().sendMessage("You need Ballista limbs to do ");
                    return;
                } else if (!player.getInventory().hasItem(19601)) {
                    player.getGameEncoder().sendMessage("You need a Ballista spring to do ");
                    return;
                } else if (player.getSkills().getLevel(Skills.FLETCHING) < 47) {
                    player.getGameEncoder().sendMessage("You need a Fletching level of 47 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.FLETCHING, 30);
                player.getInventory().deleteItem(19586, 1);
                player.getInventory().deleteItem(19592, 1);
                player.getInventory().deleteItem(19601, 1);
                player.getInventory().addItem(19604, 1);
            } else if (used(useItemId, onItemId, 19589, 19592) || used(useItemId, onItemId, 19589, 19601)) {
                // Heavy frame and Ballista limbs/spring
                if (!player.getInventory().hasItem(19592)) {
                    player.getGameEncoder().sendMessage("You need Ballista limbs to do ");
                    return;
                } else if (!player.getInventory().hasItem(19601)) {
                    player.getGameEncoder().sendMessage("You need a Ballista spring to do ");
                    return;
                } else if (player.getSkills().getLevel(Skills.FLETCHING) < 72) {
                    player.getGameEncoder().sendMessage("You need a Fletching level of 72 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.FLETCHING, 60);
                player.getInventory().deleteItem(19589, 1);
                player.getInventory().deleteItem(19592, 1);
                player.getInventory().deleteItem(19601, 1);
                player.getInventory().addItem(19607, 1);
            } else if (used(useItemId, onItemId, 19604, 19610)) {
                // Unstrung light ballista and Monkey tail
                if (player.getSkills().getLevel(Skills.FLETCHING) < 47) {
                    player.getGameEncoder().sendMessage("You need a Fletching level of 47 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.FLETCHING, 300);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19478, 1, onSlot);
            } else if (used(useItemId, onItemId, 19607, 19610)) {
                // Unstrung heavy ballista and Monkey tail
                if (player.getSkills().getLevel(Skills.FLETCHING) < 72) {
                    player.getGameEncoder().sendMessage("You need a Fletching level of 72 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.FLETCHING, 600);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19481, 1, onSlot);
            } else if (used(useItemId, onItemId, 19595, 19610)) {
                // Incomplete light ballista and Monkey tail
                if (player.getSkills().getLevel(Skills.FLETCHING) < 47) {
                    player.getGameEncoder().sendMessage("You need a Fletching level of 47 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.FLETCHING, 300);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19478, 1, onSlot);
            } else if (used(useItemId, onItemId, 19598, 19610)) {
                // Incomplete heavy ballista and Monkey tail
                if (player.getSkills().getLevel(Skills.FLETCHING) < 72) {
                    player.getGameEncoder().sendMessage("You need a Fletching level of 72 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.FLETCHING, 600);
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(19481, 1, onSlot);
            } else if (used(useItemId, onItemId, 13227, 6920)) {
                // Eternal crystal and Infinity boots
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(13235, 1, onSlot);
            } else if (used(useItemId, onItemId, 13229, 2577)) {
                // Pegasian crystal and Ranger boots
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(13237, 1, onSlot);
            } else if (used(useItemId, onItemId, 13231, 11840)) {
                // Primordial crystal and Dragon boots
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(13239, 1, onSlot);
            } else if (used(useItemId, onItemId, 21043, 6914)) {
                // Kodai insignia and Master wand
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(21006, 1, onSlot);
                player.getGameEncoder().sendMessage(
                        "Power shoots down the length of the wand, empowering it with the darkness of Xeric's Kodai wizards.");
            } else if (used(useItemId, onItemId, 985, 987)) {
                // Tooth half of key and Loop half of key
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(989, 1, onSlot);
            } else if (used(useItemId, onItemId, 269, 2436) || used(useItemId, onItemId, 269, 2440)
                    || used(useItemId, onItemId, 269, 2442)) {
                Herblore.openMix(player, 12695);
            } else if (used(useItemId, onItemId, 3024, 235) || used(useItemId, onItemId, 3024, 1526)
                    || used(useItemId, onItemId, 3024, 10937)) {
                Herblore.openMix(player, 10925);
            } else if (used(useItemId, onItemId, 13233, 6739) || used(useItemId, onItemId, 13233, 13242)
                    || used(useItemId, onItemId, 13233, 13241)) {
                // Smouldering stone and Dragon axe/Infernal axe
                if (player.getController().getLevelForXP(Skills.FIREMAKING) < 85) {
                    player.getGameEncoder().sendMessage("You need a Firemaking level of 85 to do ");
                    return;
                }
                int chargedItemId = 13241;
                int chargingSlot =
                        useItemId == 6739 || useItemId == 13242 || useItemId == chargedItemId ? useSlot : onSlot;
                int chargeWithItemId = 13233;
                if (player.getCharges().chargeFromInventory(chargedItemId, chargingSlot, 1,
                        new Item(chargeWithItemId, 1), ItemDef.getDegradeTime(chargedItemId)) > 0) {
                    player.setAnimation(4512);
                }
            } else if (used(useItemId, onItemId, 6739, 13241) || used(useItemId, onItemId, 6739, 13242)) {
                // Dragon axe and Infernal axe
                if (player.getController().getLevelForXP(Skills.FIREMAKING) < 85) {
                    player.getGameEncoder().sendMessage("You need a Firemaking level of 85 to do ");
                    return;
                }
                int chargedItemId = 13241;
                int chargingSlot = useItemId == 13242 || useItemId == chargedItemId ? useSlot : onSlot;
                int chargeWithItemId = 6739;
                if (player.getCharges().chargeFromInventory(chargedItemId, chargingSlot, 1,
                        new Item(chargeWithItemId, 1), ItemDef.getDegradeTime(chargedItemId)) > 0) {
                    player.setAnimation(4512);
                }
            } else if (used(useItemId, onItemId, 13233, 21028) || used(useItemId, onItemId, 13233, 21033)
                    || used(useItemId, onItemId, 13233, 21031)) {
                // Smouldering stone and Dragon harpoon/Infernal harpoon
                if (player.getController().getLevelForXP(Skills.COOKING) < 85) {
                    player.getGameEncoder().sendMessage("You need a Cooking level of 85 to do ");
                    return;
                }
                int chargedItemId = 21031;
                int chargingSlot =
                        useItemId == 21028 || useItemId == 21033 || useItemId == chargedItemId ? useSlot : onSlot;
                int chargeWithItemId = 13233;
                if (player.getCharges().chargeFromInventory(chargedItemId, chargingSlot, 1,
                        new Item(chargeWithItemId, 1), ItemDef.getDegradeTime(chargedItemId)) > 0) {
                    player.setAnimation(7406);
                }
            } else if (used(useItemId, onItemId, 21028, 21031) || used(useItemId, onItemId, 21028, 21033)) {
                // Dragon harpoon and Infernal harpoon
                if (player.getController().getLevelForXP(Skills.COOKING) < 85) {
                    player.getGameEncoder().sendMessage("You need a Cooking level of 85 to do ");
                    return;
                }
                int chargedItemId = 21031;
                int chargingSlot = useItemId == 21033 || useItemId == chargedItemId ? useSlot : onSlot;
                int chargeWithItemId = 21028;
                if (player.getCharges().chargeFromInventory(chargedItemId, chargingSlot, 1,
                        new Item(chargeWithItemId, 1), ItemDef.getDegradeTime(chargedItemId)) > 0) {
                    player.setAnimation(7406);
                }
            } else if (used(useItemId, onItemId, 13233, 11920) || used(useItemId, onItemId, 13233, 13244)
                    || used(useItemId, onItemId, 13233, 13243)) {
                // Smouldering stone and Dragon pickaxe/Infernal pickaxe
                if (player.getController().getLevelForXP(Skills.SMITHING) < 85) {
                    player.getGameEncoder().sendMessage("You need a Smithing level of 85 to do ");
                    return;
                }
                int chargedItemId = 13243;
                int chargingSlot =
                        useItemId == 11920 || useItemId == 13244 || useItemId == chargedItemId ? useSlot : onSlot;
                int chargeWithItemId = 13233;
                if (player.getCharges().chargeFromInventory(chargedItemId, chargingSlot, 1,
                        new Item(chargeWithItemId, 1), ItemDef.getDegradeTime(chargedItemId)) > 0) {
                    player.setAnimation(4514);
                }
            } else if (used(useItemId, onItemId, 11920, 13243) || used(useItemId, onItemId, 11920, 13244)) {
                // Dragon pickaxe and Infernal pickaxe
                if (player.getController().getLevelForXP(Skills.SMITHING) < 85) {
                    player.getGameEncoder().sendMessage("You need a Smithing level of 85 to do ");
                    return;
                }
                int chargedItemId = 13243;
                int chargingSlot = useItemId == 13244 || useItemId == chargedItemId ? useSlot : onSlot;
                int chargeWithItemId = 11920;
                if (player.getCharges().chargeFromInventory(chargedItemId, chargingSlot, 1,
                        new Item(chargeWithItemId, 1), ItemDef.getDegradeTime(chargedItemId)) > 0) {
                    player.setAnimation(4514);
                }
            } else if (used(useItemId, onItemId, 4170, 21257) || used(useItemId, onItemId, 21255, 21257)) {
                // Slayer's staff and Slayer's enchantment
                int chargedItemId = 21255;
                int chargingSlot = useItemId == 4170 || useItemId == 21255 ? useSlot : onSlot;
                int chargeWithItemId = 21257;
                player.getCharges().chargeFromInventory(chargedItemId, chargingSlot, 1, new Item(chargeWithItemId, 1),
                        ItemDef.getDegradeTime(chargedItemId));
            } else if (used(useItemId, onItemId, 21817, 21820) || used(useItemId, onItemId, 21816, 21820)) {
                // Bracelet of ethereum and Revenant ether
                int chargedItemId = 21816;
                int chargingSlot = useItemId == 21817 || useItemId == 21816 ? useSlot : onSlot;
                int chargeWithItemId = 21820;
                player.getCharges().chargeFromInventory(chargedItemId, chargingSlot,
                        player.getInventory().getCount(chargeWithItemId), new Item(chargeWithItemId, 1), 1);
            } else if (used(useItemId, onItemId, 22542, 21820) || used(useItemId, onItemId, 22545, 21820)) {
                // Viggora's chainmace and Revenant ether
                int chargedItemId = 22545;
                int chargingSlot = useItemId == 22542 || useItemId == 22545 ? useSlot : onSlot;
                int chargeWithItemId = 21820;
                player.getCharges().chargeFromInventory(chargedItemId, chargingSlot,
                        player.getInventory().getCount(chargeWithItemId), new Item(chargeWithItemId, 1), 1);
            } else if (used(useItemId, onItemId, 22547, 21820) || used(useItemId, onItemId, 22550, 21820)) {
                // Craw's bow and Revenant ether
                int chargedItemId = 22550;
                int chargingSlot = useItemId == 22547 || useItemId == 22550 ? useSlot : onSlot;
                int chargeWithItemId = 21820;
                player.getCharges().chargeFromInventory(chargedItemId, chargingSlot,
                        player.getInventory().getCount(chargeWithItemId), new Item(chargeWithItemId, 1), 1);
            } else if (used(useItemId, onItemId, 22552, 21820) || used(useItemId, onItemId, 22555, 21820)) {
                // Thammaron's sceptre and Revenant ether
                int chargedItemId = 22555;
                int chargingSlot = useItemId == 22552 || useItemId == 22555 ? useSlot : onSlot;
                int chargeWithItemId = 21820;
                player.getCharges().chargeFromInventory(chargedItemId, chargingSlot,
                        player.getInventory().getCount(chargeWithItemId), new Item(chargeWithItemId, 1), 1);
            } else if (used(useItemId, onItemId, 1937, 1987)) {
                // Jug of water and Grapes
                if (player.inEdgeville() && player.getClientHeight() != player.getHeight()) {
                    player.getGameEncoder().sendMessage("You can't do this here.");
                    return;
                }
                Cooking.open(player, 1987, null);
            } else if (used(useItemId, onItemId, 13280, 6570)) {
                // Max cape and Fire cape
                if (!player.getInventory().hasItem(13281)) {
                    player.getGameEncoder().sendMessage("You need a Max hood to do ");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().deleteItem(13281, 1);
                player.getInventory().addItem(13330, 1, onSlot);
                player.getInventory().addItem(13329, 1, useSlot);
            } else if (used(useItemId, onItemId, 13280, 21295)) {
                // Max cape and Infernal cape
                if (!player.getInventory().hasItem(13281)) {
                    player.getGameEncoder().sendMessage("You need a Max hood to do ");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().deleteItem(13281, 1);
                player.getInventory().addItem(21282, 1, onSlot);
                player.getInventory().addItem(21285, 1, useSlot);
            } else if (used(useItemId, onItemId, 13280, 10499)) {
                // Max cape and Ava's accumulator
                if (!player.getInventory().hasItem(13281)) {
                    player.getGameEncoder().sendMessage("You need a Max hood to do ");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().deleteItem(13281, 1);
                player.getInventory().addItem(13338, 1, onSlot);
                player.getInventory().addItem(13337, 1, useSlot);
            } else if (used(useItemId, onItemId, 13280, 2412)) {
                // Max cape and Saradomin cape
                if (!player.getInventory().hasItem(13281)) {
                    player.getGameEncoder().sendMessage("You need a Max hood to do ");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().deleteItem(13281, 1);
                player.getInventory().addItem(13332, 1, onSlot);
                player.getInventory().addItem(13331, 1, useSlot);
            } else if (used(useItemId, onItemId, 13280, 2414)) {
                // Max cape and Zamorak cape
                if (!player.getInventory().hasItem(13281)) {
                    player.getGameEncoder().sendMessage("You need a Max hood to do ");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().deleteItem(13281, 1);
                player.getInventory().addItem(13334, 1, onSlot);
                player.getInventory().addItem(13333, 1, useSlot);
            } else if (used(useItemId, onItemId, 13280, 2413)) {
                // Max cape and Guthix cape
                if (!player.getInventory().hasItem(13281)) {
                    player.getGameEncoder().sendMessage("You need a Max hood to do ");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().deleteItem(13281, 1);
                player.getInventory().addItem(13336, 1, onSlot);
                player.getInventory().addItem(13335, 1, useSlot);
            } else if (used(useItemId, onItemId, 13280, 21791)) {
                // Max cape and Imbued saradomin cape
                if (!player.getInventory().hasItem(13281)) {
                    player.getGameEncoder().sendMessage("You need a Max hood to do ");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().deleteItem(13281, 1);
                player.getInventory().addItem(21778, 1, onSlot);
                player.getInventory().addItem(21776, 1, useSlot);
            } else if (used(useItemId, onItemId, 13280, 21795)) {
                // Max cape and Imbued zamorak cape
                if (!player.getInventory().hasItem(13281)) {
                    player.getGameEncoder().sendMessage("You need a Max hood to do ");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().deleteItem(13281, 1);
                player.getInventory().addItem(21782, 1, onSlot);
                player.getInventory().addItem(21780, 1, useSlot);
            } else if (used(useItemId, onItemId, 13280, 21793)) {
                // Max cape and Imbued guthix cape
                if (!player.getInventory().hasItem(13281)) {
                    player.getGameEncoder().sendMessage("You need a Max hood to do ");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().deleteItem(13281, 1);
                player.getInventory().addItem(21786, 1, onSlot);
                player.getInventory().addItem(21784, 1, useSlot);
            } else if (used(useItemId, onItemId, 13280, 22109)) {
                // Max cape and Ava's assembler
                if (!player.getInventory().hasItem(13281)) {
                    player.getGameEncoder().sendMessage("You need a Max hood to do ");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().deleteItem(13281, 1);
                player.getInventory().addItem(21900, 1, onSlot);
                player.getInventory().addItem(21898, 1, useSlot);
            } else if (used(useItemId, onItemId, 21270, 11866)) {
                // Eternal gem and Slayer ring (8)
                player.getInventory().deleteItem(21270, 1);
                if (useItemId == 11866) {
                    player.getInventory().setItem(useSlot, new Item(21268, useItem));
                } else if (onItemId == 11866) {
                    player.getInventory().setItem(onSlot, new Item(21268, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, 21270, 11867)) {
                // Eternal gem and Slayer ring (7)
                player.getInventory().deleteItem(21270, 1);
                if (useItemId == 11867) {
                    player.getInventory().setItem(useSlot, new Item(21268, useItem));
                } else if (onItemId == 11867) {
                    player.getInventory().setItem(onSlot, new Item(21268, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, 21270, 11868)) {
                // Eternal gem and Slayer ring (6)
                player.getInventory().deleteItem(21270, 1);
                if (useItemId == 11868) {
                    player.getInventory().setItem(useSlot, new Item(21268, useItem));
                } else if (onItemId == 11868) {
                    player.getInventory().setItem(onSlot, new Item(21268, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, 21270, 11869)) {
                // Eternal gem and Slayer ring (5)
                player.getInventory().deleteItem(21270, 1);
                if (useItemId == 11869) {
                    player.getInventory().setItem(useSlot, new Item(21268, useItem));
                } else if (onItemId == 11869) {
                    player.getInventory().setItem(onSlot, new Item(21268, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, 21270, 11870)) {
                // Eternal gem and Slayer ring (4)
                player.getInventory().deleteItem(21270, 1);
                if (useItemId == 11870) {
                    player.getInventory().setItem(useSlot, new Item(21268, useItem));
                } else if (onItemId == 11870) {
                    player.getInventory().setItem(onSlot, new Item(21268, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, 21270, 11871)) {
                // Eternal gem and Slayer ring (3)
                player.getInventory().deleteItem(21270, 1);
                if (useItemId == 11871) {
                    player.getInventory().setItem(useSlot, new Item(21268, useItem));
                } else if (onItemId == 11871) {
                    player.getInventory().setItem(onSlot, new Item(21268, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, 21270, 11872)) {
                // Eternal gem and Slayer ring (2)
                player.getInventory().deleteItem(21270, 1);
                if (useItemId == 11872) {
                    player.getInventory().setItem(useSlot, new Item(21268, useItem));
                } else if (onItemId == 11872) {
                    player.getInventory().setItem(onSlot, new Item(21268, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, 21270, 11873)) {
                // Eternal gem and Slayer ring (1)
                player.getInventory().deleteItem(21270, 1);
                if (useItemId == 11873) {
                    player.getInventory().setItem(useSlot, new Item(21268, useItem));
                } else if (onItemId == 11873) {
                    player.getInventory().setItem(onSlot, new Item(21268, onItem));
                }
                player.getInventory().setUpdate(true);
            } else if (used(useItemId, onItemId, 13280, 13124)) {
                // Max cape and Ardougne cloak 4
                if (!player.getInventory().hasItem(13281)) {
                    player.getGameEncoder().sendMessage("You need a Max hood to do ");
                    return;
                }
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().deleteItem(13281, 1);
                player.getInventory().addItem(20764, 1, onSlot);
                player.getInventory().addItem(20760, 1, useSlot);
            } else if (used(useItemId, onItemId, 21730, 11836)) {
                // Black tourmaline core and Bandos boots
                player.getInventory().deleteItem(useItemId, 1, useSlot);
                player.getInventory().deleteItem(onItemId, 1, onSlot);
                player.getInventory().addItem(21733, 1, useSlot);
                player.getGameEncoder().sendMessage(
                        "The second you hold your tourmaline core by the Bandos boots, the core is absorbed rapidly. Perhaps there is some link between the metal in Bandos and tourmaline...");
            } else if (hasMatch(useItemId, onItemId, 11818, 11820, 11822)) {
                // Godsword shards
                if (!player.getInventory().hasItem(11818) || !player.getInventory().hasItem(11820)
                        || !player.getInventory().hasItem(11822)) {
                    player.getGameEncoder().sendMessage("You need all three godsword shards.");
                    return;
                }
                if (player.getSkills().getLevel(Skills.SMITHING) < 80) {
                    player.getGameEncoder().sendMessage("You need a Smithing level of 80 to do ");
                    return;
                }
                player.getSkills().addXP(Skills.SMITHING, 200);
                player.getInventory().deleteItem(11818, 1);
                player.getInventory().deleteItem(11820, 1);
                player.getInventory().deleteItem(11822, 1);
                player.getInventory().addItem(11798, 1, onSlot);
            } else if (hasMatch(useItemId, onItemId, 8901)) {
                // Slayer helmet
                if (!player.getSlayer().isUnlocked(Slayer.MALEVOLENT_MASQUERADE)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                } else if (!player.getInventory().hasItem(8901) || !player.getInventory().hasItem(4166)
                        || !player.getInventory().hasItem(4164) || !player.getInventory().hasItem(4168)
                        || !player.getInventory().hasItem(4551) || !player.getInventory().hasItem(4155)) {
                    player.getGameEncoder().sendMessage("You don't have all the required items to put these together.");
                    return;
                }
                player.getInventory().deleteItem(8901, 1);
                player.getInventory().deleteItem(4166, 1);
                player.getInventory().deleteItem(4164, 1);
                player.getInventory().deleteItem(4168, 1);
                player.getInventory().deleteItem(4551, 1);
                player.getInventory().deleteItem(4155, 1);
                player.getInventory().addItem(11864, 1, onSlot);
            } else if (hasMatch(useItemId, onItemId, 8921)) {
                // Slayer helmet
                if (!player.getSlayer().isUnlocked(Slayer.MALEVOLENT_MASQUERADE)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                } else if (!player.getInventory().hasItem(8921) || !player.getInventory().hasItem(4166)
                        || !player.getInventory().hasItem(4164) || !player.getInventory().hasItem(4168)
                        || !player.getInventory().hasItem(4551) || !player.getInventory().hasItem(4155)) {
                    player.getGameEncoder().sendMessage("You don't have all the required items to put these together.");
                    return;
                }
                player.getInventory().deleteItem(8921, 1);
                player.getInventory().deleteItem(4166, 1);
                player.getInventory().deleteItem(4164, 1);
                player.getInventory().deleteItem(4168, 1);
                player.getInventory().deleteItem(4551, 1);
                player.getInventory().deleteItem(4155, 1);
                player.getInventory().addItem(11864, 1, onSlot);
            } else if (hasMatch(useItemId, onItemId, 11774)) {
                // Slayer helmet (i)
                if (!player.getSlayer().isUnlocked(Slayer.MALEVOLENT_MASQUERADE)) {
                    player.getGameEncoder().sendMessage("You need to unlock this feature through Slayer.");
                    return;
                } else if (!player.getInventory().hasItem(11774) || !player.getInventory().hasItem(4166)
                        || !player.getInventory().hasItem(4164) || !player.getInventory().hasItem(4168)
                        || !player.getInventory().hasItem(4551) || !player.getInventory().hasItem(4155)) {
                    player.getGameEncoder().sendMessage("You don't have all the required items to put these together.");
                    return;
                }
                player.getInventory().deleteItem(11774, 1);
                player.getInventory().deleteItem(4166, 1);
                player.getInventory().deleteItem(4164, 1);
                player.getInventory().deleteItem(4168, 1);
                player.getInventory().deleteItem(4551, 1);
                player.getInventory().deleteItem(4155, 1);
                player.getInventory().addItem(11865, 1, onSlot);
            } else if (hasMatch(useItemId, onItemId, 12924, 12926)) {
                // Toxic blowpipe
                if (useItemId == 12924 || useItemId == 12926) {
                    player.getCharges().loadToxicBlowpipe(onSlot, player.getInventory().getAmount(onSlot));
                } else if (onItemId == 12924 || onItemId == 12926) {
                    player.getCharges().loadToxicBlowpipe(useSlot, player.getInventory().getAmount(useSlot));
                }
            } else if (hasMatch(useItemId, onItemId, 12929, 12931)) {
                // Serpentine helm
                if (useItemId == 12929 || useItemId == 12931) {
                    player.getCharges().loadSerpentineHelm(useSlot, player.getInventory().getAmount(onSlot));
                } else if (onItemId == 12929 || onItemId == 12931) {
                    player.getCharges().loadSerpentineHelm(onSlot, player.getInventory().getAmount(useSlot));
                }
            } else if (hasMatch(useItemId, onItemId, 13196, 13197)) {
                // Tanzanite helm
                if (useItemId == 13196 || useItemId == 13197) {
                    player.getCharges().loadSerpentineHelm(useSlot, player.getInventory().getAmount(onSlot));
                } else if (onItemId == 13196 || onItemId == 13197) {
                    player.getCharges().loadSerpentineHelm(onSlot, player.getInventory().getAmount(useSlot));
                }
            } else if (hasMatch(useItemId, onItemId, 13198, 13199)) {
                // Magma helm
                if (useItemId == 13198 || useItemId == 13199) {
                    player.getCharges().loadSerpentineHelm(useSlot, player.getInventory().getAmount(onSlot));
                } else if (onItemId == 13198 || onItemId == 13199) {
                    player.getCharges().loadSerpentineHelm(onSlot, player.getInventory().getAmount(useSlot));
                }
            } else if (hasMatch(useItemId, onItemId, 12902, 12904)) {
                // Toxic staff of the dead
                if (useItemId == 12902 || useItemId == 12904) {
                    player.getCharges().loadToxicStaff(player.getInventory().getAmount(onSlot));
                } else if (onItemId == 12902 || onItemId == 12904) {
                    player.getCharges().loadToxicStaff(player.getInventory().getAmount(useSlot));
                }
            } else if (hasMatch(useItemId, onItemId, 13274, 13275, 13276)) {
                // Bludgeon pieces
                if (!player.getInventory().hasItem(13274) || !player.getInventory().hasItem(13275)
                        || !player.getInventory().hasItem(13276)) {
                    player.getGameEncoder().sendMessage("You don't have all the pieces to do ");
                    return;
                }
                player.getInventory().deleteItem(13274, 1);
                player.getInventory().deleteItem(13275, 1);
                player.getInventory().deleteItem(13276, 1);
                player.getInventory().addItem(13263, 1); // Abyssal bludgeon
            } else if (hasMatch(useItemId, onItemId, 19679, 13275, 13276)) {
                // Dark totem pieces
                if (!player.getInventory().hasItem(19679) || !player.getInventory().hasItem(19681)
                        || !player.getInventory().hasItem(19683)) {
                    player.getGameEncoder().sendMessage("You don't have all the pieces to do ");
                    return;
                }
                player.getInventory().deleteItem(19679, 1);
                player.getInventory().deleteItem(19681, 1);
                player.getInventory().deleteItem(19683, 1);
                player.getInventory().addItem(19685, 1); // Dark totem
            } else if (hasMatch(useItemId, onItemId, 12791)) {
                // Rune pouch
                if (useItemId == 12791) {
                    player.getMagic().addRunesToPouch(onSlot, player.getInventory().getAmount(onSlot));
                } else if (onItemId == 12791) {
                    player.getMagic().addRunesToPouch(useSlot, player.getInventory().getAmount(useSlot));
                }
            } else if (hasMatch(useItemId, onItemId, 11941)) {
                // Looting bag
                int depositingSlot = useItemId != 11941 ? useSlot : onSlot;
                player.putAttribute("looting_bag_item_slot", depositingSlot);
                if (player.getWidgetManager().getLootingBagStoreType() == WidgetManager.LOOTING_BAG_ASK) {
                    player.openDialogue("lootingbag", 0);
                    player.getWidgetManager().addChatboxCloseEvent(new WidgetManager.CloseEvent() {
                        @Override
                        public void execute() {
                            player.removeAttribute("looting_bag_item_slot");
                        }
                    });
                    return;
                } else if (player.getWidgetManager().getLootingBagStoreType() == WidgetManager.LOOTING_BAG_STORE_1) {
                    Dialogue.executeScript(player, "lootingbag", 0, 0);
                } else if (player.getWidgetManager().getLootingBagStoreType() == WidgetManager.LOOTING_BAG_STORE_5) {
                    Dialogue.executeScript(player, "lootingbag", 0, 1);
                } else if (player.getWidgetManager().getLootingBagStoreType() == WidgetManager.LOOTING_BAG_STORE_ALL) {
                    Dialogue.executeScript(player, "lootingbag", 0, 2);
                } else if (player.getWidgetManager().getLootingBagStoreType() == WidgetManager.LOOTING_BAG_STORE_X) {
                    Dialogue.executeScript(player, "lootingbag", 0, 3);
                }
                player.removeAttribute("looting_bag_item_slot");
            } else if (hasMatch(useItemId, onItemId, ItemId.HYDRAS_HEART, ItemId.HYDRAS_EYE, ItemId.HYDRAS_FANG)) {
                if (!player.getInventory().hasItem(ItemId.HYDRAS_HEART)
                        || !player.getInventory().hasItem(ItemId.HYDRAS_EYE)
                        || !player.getInventory().hasItem(ItemId.HYDRAS_FANG)) {
                    player.getGameEncoder().sendMessage("You don't have all the pieces to do ");
                    return;
                }
                player.getInventory().deleteItem(ItemId.HYDRAS_HEART, 1);
                player.getInventory().deleteItem(ItemId.HYDRAS_EYE, 1);
                player.getInventory().deleteItem(ItemId.HYDRAS_FANG, 1);
                player.getInventory().addItem(ItemId.BRIMSTONE_RING, 1);
            }
        }
    }

    public static boolean used(int useItemId, int onItemId, int itemId1, int itemId2) {
        return useItemId == itemId1 && onItemId == itemId2 || useItemId == itemId2 && onItemId == itemId1;
    }

    public static boolean hasMatch(int useItemId, int onItemId, int... options) {
        for (int option : options) {
            if (useItemId == option || onItemId == option) {
                return true;
            }
        }
        return false;
    }
}
