package script.packetdecoder.misc;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.cache.ItemId;
import com.palidino.osrs.io.cache.WidgetId;
import com.palidino.osrs.model.Graphic;
import com.palidino.osrs.model.Movement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.item.ItemDef;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.Equipment;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.PCombat;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SlayerMaster;
import com.palidino.osrs.model.player.Teleports;
import com.palidino.rs.GrandExchangeUser;
import com.palidino.util.Time;
import com.palidino.util.Utils;

public class NpcOptions {
    /* 0 - 255 */

    // Piles
    public static void npcOption13(Player player, int index, Npc npc) {
        player.getGameEncoder().sendMessage("Use items on Piles to note them.");
    }
    /* 256 - 511 */

    // Lumbridge Guide
    public static void npcOption306(Player player, int index, Npc npc) {
        player.openDialogue("guidebook", 0);
    }

    // Adam
    public static void npcOption311(Player player, int index, Npc npc) {
        if (index == 0) {
            /*
             * if (player.isGameModeIronman() || player.isGameModeGroupIronman()) {
             * player.openDialogue("ironadam", 0); } else {
             * player.getGameEncoder().sendMessage("Adam has no reason to talk to you btw."); }
             */
        } else if (index == 2) {
            if (player.isGameModeIronman() || player.isGameModeGroupIronman()) {
                player.openShop("ironman");
            } else if (player.isGameModeHardcoreIronman()) {
                player.openShop("hardcore_ironman");
            } else {
                player.getGameEncoder().sendMessage("Adam has no reason to trade you btw.");
            }
        }
    }

    // Emblem Trader
    public static void npcOption316(Player player, int index, Npc npc) {
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
    }

    // Banker
    public static void npcOption394(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption395(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption396(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption397(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption398(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption399(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption400(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Sarah
    public static void npcOption501(Player player, int index, Npc npc) {
        player.openShop("skilling");
    }

    // Shop keeper
    public static void npcOption506(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("supplies_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "supplies" : "supplies_iron");
        }
    }
    /* 512 - 767 */

    // 50% Luke
    public static void npcOption604(Player player, int index, Npc npc) {}
    /* 768 - 1023 */

    // Guildmaster
    public static void npcOption814(Player player, int index, Npc npc) {
        player.openDialogue("dragonslayer", 0);
    }

    // Oziach
    public static void npcOption822(Player player, int index, Npc npc) {
        player.openShop("skill_exchange");
    }
    /* 1024 - 1279 */

    // Monk of Entrana
    public static void npcOption1165(Player player, int index, Npc npc) {
        player.openDialogue("lostcity", 0);
    }

    // Monk of Entrana
    public static void npcOption1166(Player player, int index, Npc npc) {
        for (int i = 0; i < player.getInventory().size(); i++) {
            int itemId = player.getInventory().getId(i);
            if (itemId == -1 || ItemDef.getEquipSlot(itemId) == null) {
                continue;
            }
            boolean isAllowed = ItemDef.getName(itemId).contains("arrow") || itemId == 3840 || itemId == 3842
                    || itemId == 3844 || itemId == 12608 || itemId == 12610 || itemId == 12612;
            if (isAllowed) {
                continue;
            }
            player.getGameEncoder().sendMessage("You can't take " + ItemDef.getName(itemId) + " to Entrana.");
            return;
        }
        for (int i = 0; i < player.getEquipment().size(); i++) {
            int itemId = player.getEquipment().getId(i);
            if (itemId == -1 || ItemDef.getEquipSlot(itemId) == null) {
                continue;
            }
            boolean isAllowed = ItemDef.getName(itemId).contains("arrow") || itemId == 3840 || itemId == 3842
                    || itemId == 3844 || itemId == 12608 || itemId == 12610 || itemId == 12612;
            if (isAllowed) {
                continue;
            }
            player.getGameEncoder().sendMessage("You can't take " + ItemDef.getName(itemId) + " to Entrana.");
            return;
        }
        player.getMovement().teleport(2834, 3335);
    }

    // Monk of Entrana
    public static void npcOption1167(Player player, int index, Npc npc) {
        for (int i = 0; i < player.getInventory().size(); i++) {
            int itemId = player.getInventory().getId(i);
            if (itemId == -1 || ItemDef.getEquipSlot(itemId) == null) {
                continue;
            }
            boolean isAllowed = ItemDef.getName(itemId).contains("arrow") || itemId == 3840 || itemId == 3842
                    || itemId == 3844 || itemId == 12608 || itemId == 12610 || itemId == 12612;
            if (isAllowed) {
                continue;
            }
            player.getGameEncoder().sendMessage("You can't take " + ItemDef.getName(itemId) + " to Entrana.");
            return;
        }
        for (int i = 0; i < player.getEquipment().size(); i++) {
            int itemId = player.getEquipment().getId(i);
            if (itemId == -1 || ItemDef.getEquipSlot(itemId) == null) {
                continue;
            }
            boolean isAllowed = ItemDef.getName(itemId).contains("arrow") || itemId == 3840 || itemId == 3842
                    || itemId == 3844 || itemId == 12608 || itemId == 12610 || itemId == 12612;
            if (isAllowed) {
                continue;
            }
            player.getGameEncoder().sendMessage("You can't take " + ItemDef.getName(itemId) + " to Entrana.");
            return;
        }
        player.getMovement().teleport(2834, 3335);
    }
    /* 1280 - 1535 */

    // Make-over mage
    public static void npcOption1306(Player player, int index, Npc npc) {
        player.getWidgetManager().sendInteractiveOverlay(WidgetId.CHARACTER_DESIGN);
    }

    // King Narnode Shareen
    public static void npcOption1423(Player player, int index, Npc npc) {
        player.openDialogue("monkeymadness", 0);
    }

    // Banker
    public static void npcOption1479(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption1480(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Hunting expert
    public static void npcOption1504(Player player, int index, Npc npc) {
        if (npc.getX() == 3508 && npc.getY() == 3479) {
            player.getMovement().animatedTeleport(new Tile(3530, 3444), Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
        } else if (npc.getX() == 2644 && npc.getY() == 3662) {
            player.getMovement().animatedTeleport(new Tile(2720, 3781), Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
        } else {
            player.openShop("skilling");
        }
    }
    /* 1536 - 1791 */

    // Gundai
    public static void npcOption1600(Player player, int index, Npc npc) {
        player.getBank().open();
    }

    // Lundail
    public static void npcOption1601(Player player, int index, Npc npc) {
        if (index == 2) {
            player.openShop("wild_runes");
        }
    }

    // Kolodion
    public static void npcOption1603(Player player, int index, Npc npc) {
        player.openDialogue("kolodion", 0);
    }

    // Baby impling
    public static void npcOption1635(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Young impling
    public static void npcOption1636(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Gourmet impling
    public static void npcOption1637(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Earth impling
    public static void npcOption1638(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Essence impling
    public static void npcOption1639(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Eclectic impling
    public static void npcOption1640(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Nature impling
    public static void npcOption1641(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Magpie impling
    public static void npcOption1642(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Ninja impling
    public static void npcOption1643(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Dragon impling
    public static void npcOption1644(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Baby impling
    public static void npcOption1645(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Young impling
    public static void npcOption1646(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Gourmet impling
    public static void npcOption1647(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Earth impling
    public static void npcOption1648(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Essence impling
    public static void npcOption1649(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Eclectic impling
    public static void npcOption1650(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Nature impling
    public static void npcOption1651(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Magpie impling
    public static void npcOption1652(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Ninja impling
    public static void npcOption1653(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Dragon impling
    public static void npcOption1654(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Void Knight
    public static void npcOption1755(Player player, int index, Npc npc) {
        player.openShop("pest_control");
    }

    // Squire
    public static void npcOption1763(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Squire
    public static void npcOption1764(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Squire
    public static void npcOption1765(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("equipment_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "equipment" : "equipment_iron");
        }
    }

    // Squire
    public static void npcOption1766(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("equipment_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "equipment" : "equipment_iron");
        }
    }

    // Squire
    public static void npcOption1767(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("equipment_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "equipment" : "equipment_iron");
        }
    }

    // Squire
    public static void npcOption1768(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("supplies_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "supplies" : "supplies_iron");
        }
    }

    // Squire
    public static void npcOption1769(Player player, int index, Npc npc) {
        if (player.getController().getExitTile() != null) {
            player.getController().stop();
        }
    }
    /* 1792 - 2047 */
    /* 2048 - 2303 */

    // Wise Old Man
    public static void npcOption2108(Player player, int index, Npc npc) {
        player.openShop("platinum_tokens");
    }

    // Grand Exchange Clerk
    public static void npcOption2148(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("grandexchange", 0);
        } else if (index == 2) {
            player.getGrandExchange().open();
        } else if (index == 3) {
            player.getGrandExchange().openHistory(GrandExchangeUser.HISTORY);
        } else if (index == 4) {
            player.getGrandExchange().exchangeItemSets();
        }
    }

    // Grand Exchange Clerk
    public static void npcOption2149(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("grandexchange", 0);
        } else if (index == 2) {
            player.getGrandExchange().open();
        } else if (index == 3) {
            player.getGrandExchange().openHistory(GrandExchangeUser.HISTORY);
        } else if (index == 4) {
            player.getGrandExchange().exchangeItemSets();
        }
    }

    // TzHaar-Mej-Jal
    public static void npcOption2180(Player player, int index, Npc npc) {
        player.openDialogue("tzhaar", 1);
    }

    // TzHaar-Ket-Zuh
    public static void npcOption2182(Player player, int index, Npc npc) {
        player.getBank().open();
    }

    // TzHaar-Hur-Tel
    public static void npcOption2183(Player player, int index, Npc npc) {
        player.openShop("tzhaar_equipment");
    }

    // TzHaar-Hur-Lek
    public static void npcOption2184(Player player, int index, Npc npc) {
        player.openShop("tzhaar_rocks");
    }

    // TzHaar-Mej-Roh
    public static void npcOption2185(Player player, int index, Npc npc) {
        player.openShop("tzhaar_runes");
    }

    // Richard
    public static void npcOption2200(Player player, int index, Npc npc) {
        player.openShop("teamcapes");
    }
    /* 2304 - 2559 */

    // Ajjat
    public static void npcOption2460(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("equipment_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "equipment" : "equipment_iron");
        }
    }

    // Lidio
    public static void npcOption2469(Player player, int index, Npc npc) {
        player.openShop("warriors_guild_food");
    }

    // Lilly
    public static void npcOption2470(Player player, int index, Npc npc) {
        player.openShop("warriors_guild_potions");
    }

    // Anton
    public static void npcOption2471(Player player, int index, Npc npc) {
        player.openShop("warriors_guild_armour");
    }
    /* 2560 - 2815 */

    // Mage of Zamorak
    public static void npcOption2581(Player player, int index, Npc npc) {
        if (index == 0 || index == 2) {
            player.openShop("wild_runes");
        } else if (index == 3) {
            if (!player.getController().canTeleport(true)) {
                return;
            }
            if (player.getEquipment().getHandId() == 11095 || player.getEquipment().getHandId() == 11097
                    || player.getEquipment().getHandId() == 11099 || player.getEquipment().getHandId() == 11101
                    || player.getEquipment().getHandId() == 11103) {
                player.getEquipment().setItem(Equipment.Slot.HAND, player.getEquipment().getHandId() == 11103 ? null
                        : new Item(player.getEquipment().getHandId() + 2, 1));
                player.getAppearance().setUpdate(true);
            } else {
                player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
            }
            npc.setForceMessage("Veniens! Sallakar! Rinnesset!");
            npc.setAnimation(1818);
            npc.setGraphic(343);
            Tile[] tiles = new Tile[] {
                new Tile(3045, 4810), new Tile(3059, 4818), new Tile(3062, 4835), new Tile(3054, 4850),
                new Tile(3043, 4854), new Tile(3027, 4851), new Tile(3017, 4840), new Tile(3015, 4826),
                new Tile(3021, 4813), new Tile(3035, 4809)
            };
            player.getMovement().animatedTeleport(Utils.arrayRandom(tiles), 1816, 715, new Graphic(342), null, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
        }
    }

    // Mage of Zamorak
    public static void npcOption2582(Player player, int index, Npc npc) {
        player.openDialogue("magezamorak", 0);
    }

    // Head chef
    public static void npcOption2658(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("supplies_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "supplies" : "supplies_iron");
        }
    }

    // Elstan
    public static void npcOption2663(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Dantaera
    public static void npcOption2664(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Kragen
    public static void npcOption2665(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Lyra
    public static void npcOption2666(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Francis
    public static void npcOption2667(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Garth
    public static void npcOption2669(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Ellena
    public static void npcOption2670(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Selena
    public static void npcOption2671(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Vasquen
    public static void npcOption2672(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Rhonen
    public static void npcOption2673(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Dreven
    public static void npcOption2674(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Taria
    public static void npcOption2675(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Rhazien
    public static void npcOption2676(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Torrell
    public static void npcOption2677(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Alain
    public static void npcOption2678(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Heskel
    public static void npcOption2679(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Treznor
    public static void npcOption2680(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Fayeth
    public static void npcOption2681(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Bolongo
    public static void npcOption2682(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Gileth
    public static void npcOption2683(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Frizzy Skernip
    public static void npcOption2684(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Yulf Squecks
    public static void npcOption2685(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Praistan Ebola
    public static void npcOption2686(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Prissy Scilla
    public static void npcOption2687(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Imiago
    public static void npcOption2688(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Liliwen
    public static void npcOption2689(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }
    /* 2816 - 3071 */

    // Banker
    public static void npcOption2897(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption2898(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }
    /* 3072 - 3327 */

    // Martin Thwait
    public static void npcOption3193(Player player, int index, Npc npc) {
        player.openShop("thieving_stalls");
    }

    // Wyson the gardener
    public static void npcOption3253(Player player, int index, Npc npc) {
        int[] moleItemIds = new int[] {
            7416, 7417, 7418, 7419
        };
        for (int itemId : moleItemIds) {
            int count = Math.min(player.getInventory().getCount(itemId), player.getInventory().getRemainingSlots());
            player.getInventory().deleteItem(itemId, count);
            for (int i = 0; i < count; i++) {
                if (Utils.randomE(10) == 0) {
                    player.getInventory().addItem(5075, 1);
                } else if (Utils.randomE(5) == 0) {
                    player.getInventory().addItem(5074, 1);
                } else {
                    player.getInventory().addItem(7413, 1);
                }
            }
        }
    }
    /* 3328 - 3583 */

    // Surgeon General Tafani
    public static void npcOption3343(Player player, int index, Npc npc) {
        player.setGraphic(436);
        player.getGameEncoder().sendMessage("Surgeon General Tafani restores you.");
        player.rejuvenate();
    }
    /* 3584 - 3839 */

    // Zealot
    public static void npcOption3611(Player player, int index, Npc npc) {
        player.openDialogue("hauntedmine", 0);
    }

    // Innocent-looking key
    public static void npcOption3619(Player player, int index, Npc npc) {
        if (player.getCombat().getHauntedMine() < 2 || player.getWorld().getTargetNPC(3616, player) != null) {
            player.getGameEncoder().sendMessage("Nothing interesting happens.");
            return;
        } else if (player.getCombat().getHauntedMine() == 2) {
            Npc treus = new Npc(player.getController(), 3616, new Tile(2788, 4457, player.getHeight()));
            treus.getCombat().setTarget(player);
        } else if (player.getCombat().getHauntedMine() >= 3) {
            player.getInventory().addItem(4077, 1);
        }
    }

    // Oneiromancer
    public static void npcOption3835(Player player, int index, Npc npc) {
        player.openDialogue("dreammentor", 0);
    }
    /* 3840 - 4095 */

    // Radimus Erkle
    public static void npcOption3953(Player player, int index, Npc npc) {
        if (!player.getCombat().isLegendsQuestComplete()) {
            if (player.getCombat().getRecipeForDisasterStage() != 6) {
                player.getGameEncoder().sendMessage("You need to complete Recipe for Disaster.");
                return;
            } else if (!player.getCombat().getHorrorFromTheDeep()) {
                player.getGameEncoder().sendMessage("You need to complete Horror from the Deep.");
                return;
            } else if (!player.getCombat().getDreamMentor()) {
                player.getGameEncoder().sendMessage("You need to complete Dream Mentor.");
                return;
            } else if (!player.getCombat().getMageArena()) {
                player.getGameEncoder().sendMessage("You need to complete the Mage Arena.");
                return;
            } else if (!player.getCombat().getLostCity()) {
                player.getGameEncoder().sendMessage("You need to complete Lost City.");
                return;
            } else if (!player.getCombat().getDragonSlayer()) {
                player.getGameEncoder().sendMessage("You need to complete Dragon Slayer.");
                return;
            } else if (!player.getCombat().getMonkeyMadness()) {
                player.getGameEncoder().sendMessage("You need to complete Monkey Madness.");
                return;
            } else if (player.getCombat().getHauntedMine() <= 3) {
                player.getGameEncoder().sendMessage("You need to complete Haunted Mine.");
                return;
            }
            player.getMovement().teleport(2774, 9338, 0);
        } else {
            player.getMovement().teleport(2728, 3351, 0);
        }
    }

    // Ungadulu
    public static void npcOption3957(Player player, int index, Npc npc) {
        if (player.getCombat().getLegendsQuest() == 0 && player.carryingItem(730)
                && player.getWorld().getTargetNPC(3962, player) == null) {
            player.getGameEncoder()
                    .sendMessage("You open the book and a light starts emanating, illuminating Ungadulu.");
            player.getPrayer().adjustPoints(-99);
            Npc nezikchened = new Npc(player.getController(), 3962, new Tile(2792, 9328, player.getHeight()));
            nezikchened.setForceMessage("Your faith will help you little here.");
            nezikchened.getCombat().setTarget(player);
        } else if (player.getCombat().getLegendsQuest() == 2 && player.carryingItem(746)) {
            player.getInventory().deleteItem(746, 1);
            player.getInventory().addItem(748, 1);
            player.getMovement().teleport(2792, 9337, 0);
            player.getGameEncoder()
                    .sendMessage("Ungadulu gives you a water purifying spell in exchange for the dagger.");
        } else {
            player.getGameEncoder().sendMessage("You try to speak to Ungadulu, but he ignores you.");
        }
    }

    // Siegfried Erkle
    public static void npcOption3961(Player player, int index, Npc npc) {
        if (player.isGameModeNormal() || player.isGameModeHard()) {
            player.openShop("legends");
        } else {
            player.openShop("legends_iron");
        }
    }

    // Boulder
    public static void npcOption3967(Player player, int index, Npc npc) {
        if (player.getCombat().getLegendsQuest() == 2) {
            player.getGameEncoder().sendMessage("You search around the rock and discover a dagger on the ground.");
            player.getGameEncoder().sendMessage("Ungadulu might be able to do something with this.");
            player.getInventory().addOrDropItem(746, 1);
        }
    }

    // Ilfeen
    public static void npcOption4003(Player player, int index, Npc npc) {
        player.openDialogue("elfseed", 0);
    }

    // Fisherman
    public static void npcOption4065(Player player, int index, Npc npc) {
        player.openDialogue("fishnoter", 0);
    }
    /* 4096 - 4351 */
    /* 4352 - 4607 */

    // Wizard
    public static void npcOption4399(Player player, int index, Npc npc) {
        Teleports.open(player);
    }

    // Jossik
    public static void npcOption4423(Player player, int index, Npc npc) {
        player.openDialogue("horrorfromthedeep", 0);
    }

    // Skilling seller
    public static void npcOption4527(Player player, int index, Npc npc) {
        player.openShop("skilling");
    }
    /* 4608 - 4863 */

    // Sir Vyvin
    public static void npcOption4736(Player player, int index, Npc npc) {
        player.openShop("white_knight");
    }

    // Evil Dave
    public static void npcOption4806(Player player, int index, Npc npc) {
        player.openDialogue("shadowofthestorm", 0);
    }
    /* 4864 - 5119 */
    /* 5120 - 5375 */
    /* 5376 - 5631 */

    // Miles
    public static void npcOption5437(Player player, int index, Npc npc) {
        for (int i = 0; i < player.getInventory().size(); i++) {
            int itemId = player.getInventory().getId(i);
            int notedId = ItemDef.getNotedId(itemId);
            if (itemId == -1 || notedId == -1 || ItemDef.getNoted(itemId) || ItemDef.getStackable(itemId)) {
                continue;
            }
            player.getInventory().deleteItem(itemId, 1, i);
            player.getInventory().addItem(notedId, 1, i);
        }
    }

    // Security Guard
    public static void npcOption5442(Player player, int index, Npc npc) {
        player.getInventory().addOrDropItem(9003, 1);
    }

    // Bob Barter (herbs)
    public static void npcOption5449(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bobbarter", 0);
        } else if (index == 2) {
            player.openShop("herb_exchange");
        } else if (index == 3) {
            player.getSkills().decantAllPotions();
        }
    }

    // Le-sabr￨
    public static void npcOption5521(Player player, int index, Npc npc) {}

    // Twiggy O'Korn
    public static void npcOption5527(Player player, int index, Npc npc) {
        player.openShop("diaries");
    }

    // Black warlock
    public static void npcOption5553(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Snowy knight
    public static void npcOption5554(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Sapphire glacialis
    public static void npcOption5555(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Ruby harvest
    public static void npcOption5556(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }
    /* 5632 - 5887 */

    // Vote manager
    public static void npcOption5721(Player player, int index, Npc npc) {
        if (Main.isBeta()) {
            player.getGameEncoder().sendMessage("You can't do this on beta worlds.");
            return;
        }
        if (index == 0) {
            player.openDialogue("vote", 0);
        } else if (index == 3) {
            if (player.isGameModeNormal()) {
                player.openShop("vote");
            } else {
                player.openShop("vote_iron");
            }
        }
    }

    // Elnock Inquisitor
    public static void npcOption5734(Player player, int index, Npc npc) {
        player.openShop("skilling");
    }

    // Cap'n Izzy No-Beard
    public static void npcOption5789(Player player, int index, Npc npc) {
        player.openShop("agility");
    }
    /* 5888 - 6143 */

    // Probita
    public static void npcOption5906(Player player, int index, Npc npc) {
        player.openShop("pets");
    }
    /* 6144 - 6399 */
    /* 6400 - 6655 */

    // Mac
    public static void npcOption6481(Player player, int index, Npc npc) {
        player.openDialogue("mac", 0);
    }

    // <col=00ffff>Boulder</col>
    public static void npcOption6621(Player player, int index, Npc npc) {
        if (player.getController().isMagicBound()) {
            player.getGameEncoder()
                    .sendMessage("A magical force stops you from moving for "
                            + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                            + " more seconds.");
            return;
        }
        if (npc.getX() == 3053 && npc.getY() == 10165) {
            if (player.getX() >= 3055) {
                player.getMovement().teleport(3052, 10165, 3);
            } else {
                player.getMovement().teleport(3055, 10165, 3);
            }
        }
    }
    /* 6656 - 6911 */

    // Loyalty manager
    public static void npcOption6770(Player player, int index, Npc npc) {
        player.openDialogue("loyalty", 0);
    }

    // Nieve
    public static void npcOption6797(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("slayer", 0);
        } else if (index == 2) {
            SlayerMaster.setAssignment(player);
        } else if (index == 3) {
            player.openShop("slayer");
        } else if (index == 4) {
            player.openDialogue("slayer", 4);
        }
    }
    /* 6912 - 7167 */

    // Marisi
    public static void npcOption6921(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Tynan
    public static void npcOption6964(Player player, int index, Npc npc) {
        player.openShop("skilling");
    }

    // Tyss
    public static void npcOption7050(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("spellbooks", 0);
        } else if (index == 2) {
            player.getMagic().setVengeanceCast(false);
            if (player.getMagic().getSpellbook() == Magic.STANDARD_MAGIC) {
                player.getMagic().setSpellbook(Magic.ANCIENT_MAGIC);
            } else if (player.getMagic().getSpellbook() == Magic.ANCIENT_MAGIC) {
                player.getMagic().setSpellbook(Magic.LUNAR_MAGIC);
            } else {
                player.getMagic().setSpellbook(Magic.STANDARD_MAGIC);
            }
        }
    }
    /* 7168 - 7423 */

    // Lucky impling
    public static void npcOption7233(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Perry
    public static void npcOption7240(Player player, int index, Npc npc) {
        player.openShop("skilling");
    }

    // Lisa
    public static void npcOption7316(Player player, int index, Npc npc) {
        player.openDialogue("clanwars", 5);
    }

    // Lisa
    public static void npcOption7317(Player player, int index, Npc npc) {
        player.openDialogue("clanwars", 2);
    }

    // Eniola
    public static void npcOption7417(Player player, int index, Npc npc) {
        player.getBank().open();
    }
    /* 7424 - 7679 */

    // Perdu
    public static void npcOption7456(Player player, int index, Npc npc) {
        player.openDialogue("perdu", 0);
    }

    // Krystilia
    public static void npcOption7663(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("slayer", 9);
        } else if (index == 2) {
            SlayerMaster.setAssignment(player, SlayerMaster.WILDERNESS_MASTER);
        } else if (index == 3) {
            player.openShop("slayer");
        } else if (index == 4) {
            player.getSlayer().openRewards();
        }
    }

    // TzHaar-Ket-Zuh
    public static void npcOption7677(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }
    /* 7680 - 7935 */

    // TzHaar-Ket-Keh
    public static void npcOption7690(Player player, int index, Npc npc) {
        player.openDialogue("tzhaar", 6);
    }

    // Gadrin
    public static void npcOption7716(Player player, int index, Npc npc) {
        if (npc.getX() == 2446 && npc.getY() == 3426) {
            player.getMovement().animatedTeleport(new Tile(2467, 9905), Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
        } else if (npc.getX() == 3272 && npc.getY() == 3164) {
            player.getMovement().animatedTeleport(new Tile(3294, 3282), Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
        } else {
            player.openShop("skilling");
        }
    }

    // Belona
    public static void npcOption7719(Player player, int index, Npc npc) {
        if (index == 3) {
            player.getSkills().setMiningMinerals(!player.getSkills().getMiningMinerals());
            player.getGameEncoder().sendMessage("Minerals while mining: " + player.getSkills().getMiningMinerals());
        } else {
            player.openShop("mining_minerals");
        }
    }

    // Kylie Minnow
    public static void npcOption7728(Player player, int index, Npc npc) {
        player.openShop("minnows");
    }
    /* 7936 - 8191 */

    // Emblem Trader
    public static void npcOption7942(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("emblemtrader", 1);
        } else if (index == 2) {
            player.getGameEncoder().sendMessage("You can't trade him here.");
        } else if (index == 3) {
            boolean show = !player.getCombat().showKDR();
            player.getCombat().setShowKDR(show);
            if (show) {
                player.getGameEncoder().sendMessage("Now displaying KDR.");
            } else {
                player.getGameEncoder().sendMessage("Now hiding KDR.");
            }
        } else if (index == 4) {
            player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
        }
    }

    // Elder Chaos druid
    public static void npcOption7995(Player player, int index, Npc npc) {
        player.getGameEncoder().sendMessage("The elder chaos druid will unnote bones for a fee.");
    }

    // Vorkath
    public static void npcOption8059(Player player, int index, Npc npc) {
        if (npc.isLocked()) {
            return;
        }
        npc.setTransformationId(8061);
        npc.setAnimation(7950);
        npc.setLock(8);
    }
    /* 8192 - 8447 */
    /* 8448 - 8703 */

    // Cursed jewelled crab (red)
    public static void npcOption16002(Player player, int index, Npc npc) {
        if (!player.getInventory().hasItem(ItemId.HAMMER)
                && player.getEquipment().getWeaponId() != ItemId.DRAGON_WARHAMMER
                && player.getEquipment().getWeaponId() != ItemId.ELDER_MAUL
                && player.getEquipment().getWeaponId() != ItemId.TORAGS_HAMMERS) {
            player.getGameEncoder().sendMessage("This crab can only be smashed by certain hammers.");
            return;
        }
        if (player.getInventory().hasItem(ItemId.HAMMER)) {
            player.setAnimation(1755);
        } else {
            player.setAnimation(player.getCombat().getAttackAnimation());
        }
        npc.getCombat().getCombatScript().getVariable("smash");
    }

    // Cursed jewelled crab (green)
    public static void npcOption16003(Player player, int index, Npc npc) {
        if (!player.getInventory().hasItem(ItemId.HAMMER)
                && player.getEquipment().getWeaponId() != ItemId.DRAGON_WARHAMMER
                && player.getEquipment().getWeaponId() != ItemId.ELDER_MAUL
                && player.getEquipment().getWeaponId() != ItemId.TORAGS_HAMMERS) {
            player.getGameEncoder().sendMessage("This crab can only be smashed by certain hammers.");
            return;
        }
        if (player.getInventory().hasItem(ItemId.HAMMER)) {
            player.setAnimation(1755);
        } else {
            player.setAnimation(player.getCombat().getAttackAnimation());
        }
        npc.getCombat().getCombatScript().getVariable("smash");
    }

    // Cursed jewelled crab (blue)
    public static void npcOption16004(Player player, int index, Npc npc) {
        if (!player.getInventory().hasItem(ItemId.HAMMER)
                && player.getEquipment().getWeaponId() != ItemId.DRAGON_WARHAMMER
                && player.getEquipment().getWeaponId() != ItemId.ELDER_MAUL
                && player.getEquipment().getWeaponId() != ItemId.TORAGS_HAMMERS) {
            player.getGameEncoder().sendMessage("This crab can only be smashed by certain hammers.");
            return;
        }
        if (player.getInventory().hasItem(ItemId.HAMMER)) {
            player.setAnimation(1755);
        } else {
            player.setAnimation(player.getCombat().getAttackAnimation());
        }
        npc.getCombat().getCombatScript().getVariable("smash");
    }

    // Cap't Bond
    public static void npcOption16018(Player player, int index, Npc npc) {
        player.getOptions().openBondsMenu();
    }
}
