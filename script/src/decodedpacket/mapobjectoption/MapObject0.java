package decodedpacket.mapobjectoption;

import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.ForceMovement;
import com.palidino.osrs.model.Movement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.item.RandomItem;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.map.TempMapObject;
import com.palidino.osrs.model.map.WildernessObelisk;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.AchievementDiaryTask;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Prayer;
import com.palidino.osrs.model.player.Runecrafting;
import com.palidino.osrs.model.player.Skills;
import com.palidino.osrs.model.player.Smithing;
import com.palidino.osrs.model.player.controller.PestControlPC;
import com.palidino.util.Time;
import com.palidino.util.Utils;
import com.palidino.util.event.Event;

public class MapObject0 {
   /* 0 - 255 */

    // Dwarf remains
    public static void mapObject0(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject1(Player player, int index, MapObject mapObject) {}

    // Cave Entrance
    public static void mapObject2(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4(Player player, int index, MapObject mapObject) {}

    // Broken multicannon
    public static void mapObject5(Player player, int index, MapObject mapObject) {}

    // Dwarf multicannon
    public static void mapObject6(Player player, int index, MapObject mapObject) {}

    // Cannon base
    public static void mapObject7(Player player, int index, MapObject mapObject) {}

    // Cannon stand
    public static void mapObject8(Player player, int index, MapObject mapObject) {}

    // Cannon barrels
    public static void mapObject9(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11(Player player, int index, MapObject mapObject) {}

    // Rock pile
    public static void mapObject12(Player player, int index, MapObject mapObject) {}

    // Mud pile
    public static void mapObject13(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject14(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject15(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject16(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject17(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject18(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject19(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject20(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22(Player player, int index, MapObject mapObject) {}

    // Sacks
    public static void mapObject23(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject33(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject34(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject35(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject36(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject37(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject38(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject39(Player player, int index, MapObject mapObject) {}

    // Wall Pipe
    public static void mapObject41(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject42(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject44(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject45(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject46(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject47(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject48(Player player, int index, MapObject mapObject) {}

    // Loose Railing
    public static void mapObject51(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject52(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Gate
    public static void mapObject53(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Stairs
    public static void mapObject54(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject55(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject56(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject57(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject58(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject59(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject60(Player player, int index, MapObject mapObject) {}

    // Chaos altar
    public static void mapObject61(Player player, int index, MapObject mapObject) {}

    // Giant crystal
    public static void mapObject62(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject63(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject64(Player player, int index, MapObject mapObject) {}

    // Crate wall
    public static void mapObject65(Player player, int index, MapObject mapObject) {}

    // Crate wall
    public static void mapObject66(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject67(Player player, int index, MapObject mapObject) {}

    // Beehive
    public static void mapObject68(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject69(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject70(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject71(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject72(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject73(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject74(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject75(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject76(Player player, int index, MapObject mapObject) {}

    // Prison Door
    public static void mapObject79(Player player, int index, MapObject mapObject) {}

    // Prison Door
    public static void mapObject80(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject81(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject82(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject87(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject89(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject90(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject91(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject92(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject93(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject94(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject95(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject96(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject98(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject99(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject100(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject101(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject102(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject103(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject104(Player player, int index, MapObject mapObject) {}

    // Party Balloon
    public static void mapObject115(Player player, int index, MapObject mapObject) {}

    // Party Balloon
    public static void mapObject116(Player player, int index, MapObject mapObject) {}

    // Party Balloon
    public static void mapObject117(Player player, int index, MapObject mapObject) {}

    // Party Balloon
    public static void mapObject118(Player player, int index, MapObject mapObject) {}

    // Party Balloon
    public static void mapObject119(Player player, int index, MapObject mapObject) {}

    // Party Balloon
    public static void mapObject120(Player player, int index, MapObject mapObject) {}

    // Party Balloon
    public static void mapObject121(Player player, int index, MapObject mapObject) {}

    // Party Balloon
    public static void mapObject122(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject131(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject132(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject133(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject134(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject135(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject136(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject137(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject138(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject139(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject140(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject141(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject142(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject143(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject144(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject145(Player player, int index, MapObject mapObject) {}

    // Lever A
    public static void mapObject146(Player player, int index, MapObject mapObject) {}

    // Lever B
    public static void mapObject147(Player player, int index, MapObject mapObject) {}

    // Lever C
    public static void mapObject148(Player player, int index, MapObject mapObject) {}

    // Lever D
    public static void mapObject149(Player player, int index, MapObject mapObject) {}

    // Lever E
    public static void mapObject150(Player player, int index, MapObject mapObject) {}

    // Lever F
    public static void mapObject151(Player player, int index, MapObject mapObject) {}

    // Compost heap
    public static void mapObject152(Player player, int index, MapObject mapObject) {}

    // Fountain
    public static void mapObject153(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject154(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2887 && mapObject.getY() == 9823) {
            // Taverley Dungeon
            player.getMovement().ladderUpTeleport(new Tile(2888, 9823, 1));
        }
    }

    // Bookcase
    public static void mapObject155(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject156(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject160(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject166(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject167(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject170(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject172(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(989)) {
            player.getGameEncoder().sendMessage("You need a Crystal key to open this.");
            return;
        }
        if (player.getInventory().getRemainingSlots() < 5) {
            player.getInventory().notEnoughSpace();
            return;
        }
        player.getInventory().deleteItem(989, 1);
        player.getInventory().addItem(1632, 1);
        RandomItem[] clueItems = new RandomItem[] {
            new RandomItem(2677, 1).setWeight(8) /* Clue scroll (easy) */,
            new RandomItem(2801, 1).setWeight(6) /* Clue scroll (medium) */,
            new RandomItem(2722, 1).setWeight(4) /* Clue scroll (hard) */,
            new RandomItem(12073, 1).setWeight(2) /* Clue scroll (elite) */,
            new RandomItem(19835, 1).setWeight(1) /* Clue scroll (master) */
        };
        if (Utils.randomE(4) == 0) {
            player.getInventory().addOrDropItem(RandomItem.getItem(clueItems));
        }
        RandomItem[] items = new RandomItem[] {
            new RandomItem(987, 1).setWeight(128) /* Loop half */, new RandomItem(985, 1).setWeight(128) /*
                                                                                                          * Tooth half
                                                                                                          */,

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
            Item item = RandomItem.getItem(items);
            player.getInventory().addOrDropItem(item.getNotedID(), item.getAmount());
        }
        player.getGameEncoder().sendMessage("You find some treasure in the chest!");
    }

    // Gate
    public static void mapObject190(Player player, int index, MapObject mapObject) {}

    // Hollowed rock
    public static void mapObject194(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject195(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject245(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3017 && mapObject.getY() == 3959) {
            player.getMovement().teleport(3017, 3961, player.getHeight() + 1);
        } else if (mapObject.getX() == 3019 && mapObject.getY() == 3959) {
            player.getMovement().teleport(3019, 3961, player.getHeight() + 1);
        }
    }

    // Ship's ladder
    public static void mapObject246(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3017 && mapObject.getY() == 3959) {
            player.getMovement().teleport(3017, 3958, player.getHeight() - 1);
        } else if (mapObject.getX() == 3019 && mapObject.getY() == 3959) {
            player.getMovement().teleport(3019, 3958, player.getHeight() - 1);
        }
    }

    // Winch
    public static void mapObject255(Player player, int index, MapObject mapObject) {}

   /* 256 - 511 */

    // Ship's ladder
    public static void mapObject272(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3018 && mapObject.getY() == 3957) {
            player.getMovement().ladderUpTeleport(new Tile(3018, 3956, player.getHeight() + 1));
        }
    }

    // Ship's ladder
    public static void mapObject273(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3018 && mapObject.getY() == 3957) {
            player.getMovement().ladderDownTeleport(new Tile(3018, 3958, player.getHeight() - 1));
        }
    }

    // Ladder
    public static void mapObject287(Player player, int index, MapObject mapObject) {}

    // Hay bales
    public static void mapObject298(Player player, int index, MapObject mapObject) {}

    // Hay bales
    public static void mapObject299(Player player, int index, MapObject mapObject) {}

    // Haystack
    public static void mapObject300(Player player, int index, MapObject mapObject) {}

    // Hay bale
    public static void mapObject304(Player player, int index, MapObject mapObject) {}

    // Potato
    public static void mapObject312(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject313(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject348(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject349(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject350(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject351(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject352(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject353(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject354(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject355(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject356(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject357(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject358(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject359(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject360(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject361(Player player, int index, MapObject mapObject) {}

    // Sacks
    public static void mapObject365(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject366(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject367(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject368(Player player, int index, MapObject mapObject) {}

    // Large cupboard
    public static void mapObject369(Player player, int index, MapObject mapObject) {}

    // Open Cupboard
    public static void mapObject370(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject371(Player player, int index, MapObject mapObject) {}

    // Large open cupboard
    public static void mapObject372(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject375(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject376(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject377(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject378(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject379(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject380(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject381(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject388(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject389(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject390(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject393(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject394(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject398(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject399(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject409(Player player, int index, MapObject mapObject) {}

    // Altar of Guthix
    public static void mapObject410(Player player, int index, MapObject mapObject) {}

    // Chaos altar
    public static void mapObject411(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Chaos altar
    public static void mapObject412(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject414(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject415(Player player, int index, MapObject mapObject) {}

    // Church organ
    public static void mapObject416(Player player, int index, MapObject mapObject) {}

   /* 512 - 767 */

    // Door
    public static void mapObject532(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject534(Player player, int index, MapObject mapObject) {
        // Smoke Devil Dungeon
        Tile tile = new Tile(2413, 3059, 0);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Crevice
    public static void mapObject535(Player player, int index, MapObject mapObject) {
        // Stronghold Slayer Cave
        if (!player.getSlayer().isAnyTask(499) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
            player.getGameEncoder().sendMessage("You need an appropriate Slayer task of Smoke Devils to enter.");
            return;
        }
        player.openDialogue("bossinstance", 5);
    }

    // Crevice
    public static void mapObject536(Player player, int index, MapObject mapObject) {
        // Stronghold Slayer Cave
        Tile tile = new Tile(2379, 9452, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Crevice
    public static void mapObject537(Player player, int index, MapObject mapObject) {
        player.openDialogue("bossinstance", 12);
    }

    // Crevice
    public static void mapObject538(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(2280, 10016, 0);
        player.getMovement().ladderUpTeleport(tile);
        player.getController().stopWithTeleport();
    }

    // Curtain
    public static void mapObject539(Player player, int index, MapObject mapObject) {}

    // Broken Fence
    public static void mapObject544(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject553(Player player, int index, MapObject mapObject) {}

    // Tea stall
    public static void mapObject635(Player player, int index, MapObject mapObject) {}

    // Buried skeleton
    public static void mapObject651(Player player, int index, MapObject mapObject) {}

    // Passage
    public static void mapObject677(Player player, int index, MapObject mapObject) {
        player.getCombat().setDamageInflicted(0);
        if (player.getX() <= 2970) {
            player.getMovement().teleport(2974, 4384, 2);
        } else {
            player.getMovement().teleport(2970, 4384, 2);
        }
        player.getController().stopWithTeleport();
    }

    // Cave
    public static void mapObject678(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (player.getMovement().getTeleportBlock() > 0) {
            player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                    + player.getMovement().getTeleportBlockRemaining() + ".");
            return;
        }
        Tile tile = new Tile(2964, 4382, 2);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Cave exit
    public static void mapObject679(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(3206, 3681, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Shaking box
    public static void mapObject721(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Buried skeleton
    public static void mapObject723(Player player, int index, MapObject mapObject) {}

    // Web
    public static void mapObject733(Player player, int index, MapObject mapObject) {
        if ((player.getEquipment().getWeaponDef().getWeaponType() == null
                || !player.getEquipment().getWeaponDef().getWeaponType().hasSlash())
                && !player.getInventory().hasItem(946)) {
            player.getGameEncoder().sendMessage("Only a sharp blade can cut through this sticky web.");
            return;
        }
        player.setAnimation(player.getCombat().getAttackAnimation());
        if (Utils.randomE(4) != 0) {
            player.getGameEncoder().sendMessage("You fail to cut through it.");
            return;
        }
        player.getGameEncoder().sendMessage("You slash the web apart.");
        MapObject newWeb = new MapObject(mapObject.getID() + 1, mapObject);
        player.getWorld().addEvent(new TempMapObject(100, player.getController(), newWeb));
    }

   /* 768 - 1023 */

    // Door
    public static void mapObject777(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject778(Player player, int index, MapObject mapObject) {}

    // Bamboo Door
    public static void mapObject779(Player player, int index, MapObject mapObject) {}

    // Loom
    public static void mapObject787(Player player, int index, MapObject mapObject) {}

    // City Gate
    public static void mapObject788(Player player, int index, MapObject mapObject) {}

    // City Gate
    public static void mapObject789(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject823(Player player, int index, MapObject mapObject) {}

    // Manhole
    public static void mapObject881(Player player, int index, MapObject mapObject) {}

    // Manhole
    public static void mapObject882(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject883(Player player, int index, MapObject mapObject) {}

    // Well
    public static void mapObject884(Player player, int index, MapObject mapObject) {
        player.openDialogue("wishingwell", 0);
    }

    // Door
    public static void mapObject954(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject970(Player player, int index, MapObject mapObject) {}

    // Stile
    public static void mapObject993(Player player, int index, MapObject mapObject) {}

   /* 1024 - 1279 */

    // Cabbage
    public static void mapObject1161(Player player, int index, MapObject mapObject) {}

    // Nettles
    public static void mapObject1181(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject1276(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject1277(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject1278(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject1279(Player player, int index, MapObject mapObject) {}

   /* 1280 - 1535 */

    // Tree
    public static void mapObject1280(Player player, int index, MapObject mapObject) {}

    // Cage door
    public static void mapObject1281(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1282(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1283(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1284(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1285(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1286(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1289(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1290(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1291(Player player, int index, MapObject mapObject) {}

    // Dramen tree
    public static void mapObject1292(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(" axe") && !player.getEquipment().hasItem(" axe")) {
            player.getGameEncoder().sendMessage("You need an axe to chop down this tree.");
            return;
        }
        if (player.getWorld().getTargetNPC(1163, player) != null) {
            return;
        }
        Npc treeSpiritNPC = new Npc(player.getController(), 1163, new Tile(2860, 9736, player.getHeight()));
        treeSpiritNPC.setForceMessage("You must defeat me before touching the tree!");
        treeSpiritNPC.getCombat().setTarget(player);
    }

    // Spirit tree
    public static void mapObject1293(Player player, int index, MapObject mapObject) {
        player.openDialogue("spirittree", 0);
    }

    // Spirit tree
    public static void mapObject1294(Player player, int index, MapObject mapObject) {
        player.openDialogue("spirittree", 0);
    }

    // Spirit tree
    public static void mapObject1295(Player player, int index, MapObject mapObject) {
        player.openDialogue("spirittree", 0);
    }

    // Evergreen
    public static void mapObject1318(Player player, int index, MapObject mapObject) {}

    // Evergreen
    public static void mapObject1319(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject1330(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject1331(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject1332(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1365(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1383(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject1384(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1408(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1409(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1410(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1411(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1412(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject1413(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1511(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Large door
    public static void mapObject1512(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1513(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Large door
    public static void mapObject1516(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1517(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1518(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1519(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1520(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1521(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Large door
    public static void mapObject1522(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject1524(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Large door
    public static void mapObject1525(Player player, int index, MapObject mapObject) {}

    // Curtain
    public static void mapObject1531(Player player, int index, MapObject mapObject) {}

    // Curtain
    public static void mapObject1533(Player player, int index, MapObject mapObject) {}

    // Curtain
    public static void mapObject1534(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1535(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

   /* 1536 - 1791 */

    // Door
    public static void mapObject1536(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1537(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1538(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1540(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // Door
    public static void mapObject1541(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1543(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1544(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1546(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // Door
    public static void mapObject1547(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1549(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1550(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1551(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1552(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1558(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1559(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1560(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1561(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1562(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1563(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1564(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1567(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1568(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Gate
    public static void mapObject1569(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Gate
    public static void mapObject1571(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1572(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject1579(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3097 && mapObject.getY() == 3468) {
            // Edgeville dungeon
            player.getMovement().ladderUpTeleport(new Tile(3096, 9867));
        }
    }

    // Trapdoor
    public static void mapObject1580(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject1581(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3097 && mapObject.getY() == 3487) {
            // Edgeville dungeon
            player.getMovement().ladderUpTeleport(new Tile(3096, 9867));
        }
    }

    // Trapdoor
    public static void mapObject1582(Player player, int index, MapObject mapObject) {}

    // Doors
    public static void mapObject1584(Player player, int index, MapObject mapObject) {}

    // Doors
    public static void mapObject1585(Player player, int index, MapObject mapObject) {}

    // Doors
    public static void mapObject1586(Player player, int index, MapObject mapObject) {}

    // Doors
    public static void mapObject1587(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject1594(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject1595(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject1597(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject1598(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1600(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1601(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1722(Player player, int index, MapObject mapObject) {}

    // Odd looking wall
    public static void mapObject1723(Player player, int index, MapObject mapObject) {}

    // Dungeon door
    public static void mapObject1725(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1726(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1727(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1728(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject1729(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1730(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject1731(Player player, int index, MapObject mapObject) {}

    // Magic guild door
    public static void mapObject1732(Player player, int index, MapObject mapObject) {}

    // Magic guild door
    public static void mapObject1733(Player player, int index, MapObject mapObject) {}

    // Odd looking wall
    public static void mapObject1734(Player player, int index, MapObject mapObject) {}

    // Odd looking wall
    public static void mapObject1736(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject1738(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3008 && mapObject.getY() == 3150) {
            // Asgarnian Ice Dungeon entrance
            Tile tile = new Tile(3007, 9550, 0);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Willow
    public static void mapObject1750(Player player, int index, MapObject mapObject) {}

    // Oak
    public static void mapObject1751(Player player, int index, MapObject mapObject) {}

    // Hollow tree
    public static void mapObject1752(Player player, int index, MapObject mapObject) {}

    // Yew
    public static void mapObject1753(Player player, int index, MapObject mapObject) {}

    // Yew
    public static void mapObject1754(Player player, int index, MapObject mapObject) {}

    // Yew
    public static void mapObject1755(Player player, int index, MapObject mapObject) {}

    // Willow
    public static void mapObject1756(Player player, int index, MapObject mapObject) {}

    // Hollow tree
    public static void mapObject1757(Player player, int index, MapObject mapObject) {}

    // Willow
    public static void mapObject1758(Player player, int index, MapObject mapObject) {}

    // Maple tree
    public static void mapObject1759(Player player, int index, MapObject mapObject) {}

    // Willow
    public static void mapObject1760(Player player, int index, MapObject mapObject) {}

    // Magic tree
    public static void mapObject1761(Player player, int index, MapObject mapObject) {}

    // Magic tree
    public static void mapObject1762(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject1764(Player player, int index, MapObject mapObject) {}

    // Flour bin
    public static void mapObject1781(Player player, int index, MapObject mapObject) {}

    // Flour bin
    public static void mapObject1782(Player player, int index, MapObject mapObject) {}

   /* 1792 - 2047 */

    // Door
    public static void mapObject1804(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1805(Player player, int index, MapObject mapObject) {}

    // Web
    public static void mapObject1810(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject1814(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject1815(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 3153 && mapObject.getY() == 3923) {
            // Deep wild lever
            if (player.getMovement().getTeleportBlock() > 0) {
                player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                        + player.getMovement().getTeleportBlockRemaining() + ".");
                return;
            }
            Tile tile = new Tile(3090, 3475, 0);
            if (player.getClientHeight() == tile.getHeight()) {
                tile.setHeight(player.getHeight());
            }
            player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
            player.clearHits();
        }
    }

    // Lever
    public static void mapObject1816(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 3067 && mapObject.getY() == 10253) {
            // KBD entrance lever
            if (player.getMovement().getTeleportBlock() > 0) {
                player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                        + player.getMovement().getTeleportBlockRemaining() + ".");
                return;
            }
            if (index == 0) {
                Tile tile = new Tile(2271, 4680, 0);
                player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                        Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
                player.clearHits();
            } else if (index == 4) {
                player.openDialogue("bossinstance", 3);
            }
        }
    }

    // Lever
    public static void mapObject1817(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 2271 && mapObject.getY() == 4680) {
            // KBD exit lever
            Tile tile = new Tile(3067, 10253, 0);
            player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
        }
    }

    // Crumbling wall
    public static void mapObject1947(Player player, int index, MapObject mapObject) {}

    // Crumbling wall
    public static void mapObject1948(Player player, int index, MapObject mapObject) {
        if (player.getY() != mapObject.getY() || player.getX() > mapObject.getX()) {
            return;
        }
        player.getGameEncoder().sendMessage("You climb the low wall...");
        player.setAnimation(840);
        Tile toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
        player.setForceMovement(new ForceMovement(player, 0, toTile, 2, Tile.EAST));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                int xp = 14;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 4) {
                    player.putAttribute("agility_stage", 5);
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                } else if (player.getAttributeInt("agility_stage") == 5) {
                    player.putAttribute("agility_stage", 6);
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                } else if (player.getAttributeInt("agility_stage") == 6) {
                    player.removeAttribute("agility_stage");
                    xp = 47;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    // 102 laps an hour
                    if (Utils.randomE(25) == 0) {
                        int amount = 4;
                        if (player.getGoldMember()) {
                            amount = 6;
                        }
                        player.getInventory().addOrDropItem(11849, amount);
                    }
                    if (Utils.randomE(2) == 0) {
                        int rewardType = Utils.randomE(3);
                        if (rewardType == 0) {
                            player.getInventory().addOrDropItem(3009, 1);
                        } else if (rewardType == 1) {
                            player.getInventory().addOrDropItem(3017, 1);
                        } else if (rewardType == 2) {
                            player.getInventory().addOrDropItem(12640, 4);
                        }
                    }
                    player.getFamiliar().rollSkillPet(Skills.AGILITY, 44376, 20659);
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tree Door
    public static void mapObject1967(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Tree Door
    public static void mapObject1968(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // null
    public static void mapObject1980(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject1981(Player player, int index, MapObject mapObject) {}

    // Root
    public static void mapObject1985(Player player, int index, MapObject mapObject) {}

    // Root
    public static void mapObject1986(Player player, int index, MapObject mapObject) {}

    // Log raft
    public static void mapObject1987(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject1989(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject1990(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1991(Player player, int index, MapObject mapObject) {}

    // Glarial's tombstone
    public static void mapObject1992(Player player, int index, MapObject mapObject) {}

    // Glarial's tomb
    public static void mapObject1993(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject1994(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject1995(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject1996(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject1997(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject1999(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2000(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2002(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject2010(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject2011(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject2012(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject2013(Player player, int index, MapObject mapObject) {}

    // Chalice of Eternity
    public static void mapObject2014(Player player, int index, MapObject mapObject) {}

    // Chalice of Eternity
    public static void mapObject2015(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject2020(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2022(Player player, int index, MapObject mapObject) {}

    // Achey Tree
    public static void mapObject2023(Player player, int index, MapObject mapObject) {}

    // Cauldron
    public static void mapObject2024(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject2030(Player player, int index, MapObject mapObject) {}

    // Anvil
    public static void mapObject2031(Player player, int index, MapObject mapObject) {
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
    public static void mapObject2032(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2034(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2036(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject2038(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2039(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2041(Player player, int index, MapObject mapObject) {}

   /* 2048 - 2303 */

    // Door
    public static void mapObject2048(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2049(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2050(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2051(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2054(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2056(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2057(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2058(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2060(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2062(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2063(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject2064(Player player, int index, MapObject mapObject) {}

    // Rope Ladder
    public static void mapObject2065(Player player, int index, MapObject mapObject) {}

    // Watchtower
    public static void mapObject2067(Player player, int index, MapObject mapObject) {}

    // Fence
    public static void mapObject2068(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2069(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject2071(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject2072(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2073(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2074(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2075(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2076(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2077(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject2078(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2079(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2081(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2082(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2083(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2084(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2085(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2086(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2087(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2088(Player player, int index, MapObject mapObject) {}

    // Evergreen
    public static void mapObject2091(Player player, int index, MapObject mapObject) {}

    // Evergreen
    public static void mapObject2092(Player player, int index, MapObject mapObject) {}

    // Anvil
    public static void mapObject2097(Player player, int index, MapObject mapObject) {
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

    // Door
    public static void mapObject2100(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject2101(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2102(Player player, int index, MapObject mapObject) {
        // Slayer Tower bloodvelds
        if (player.getY() >= 3556) {
            player.getMovement().teleport(player.getX(), 3555, 1);
        } else {
            player.getMovement().teleport(player.getX(), 3556, 1);
        }
    }

    // Door
    public static void mapObject2103(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2104(Player player, int index, MapObject mapObject) {
        // Slayer Tower bloodvelds
        if (player.getY() >= 3556) {
            player.getMovement().teleport(player.getX(), 3555, 1);
        } else {
            player.getMovement().teleport(player.getX(), 3556, 1);
        }
    }

    // Door
    public static void mapObject2105(Player player, int index, MapObject mapObject) {}

    // Danger sign
    public static void mapObject2107(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2108(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject2109(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject2110(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2111(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2112(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2113(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject2114(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(3433, 3537, 1);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Gate
    public static void mapObject2115(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Gate
    public static void mapObject2116(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Old wall
    public static void mapObject2117(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject2118(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(3438, 3537, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Staircase
    public static void mapObject2119(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(3417, 3540, 2);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Staircase
    public static void mapObject2120(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(3412, 3540, 1);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Staircase
    public static void mapObject2121(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject2122(Player player, int index, MapObject mapObject) {}

    // Cave Entrance
    public static void mapObject2123(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2135(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject2141(Player player, int index, MapObject mapObject) {}

    // Prison door
    public static void mapObject2143(Player player, int index, MapObject mapObject) {}

    // Prison door
    public static void mapObject2144(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject2145(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject2146(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2147(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2148(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2154(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2155(Player player, int index, MapObject mapObject) {}

    // Magic Portal
    public static void mapObject2156(Player player, int index, MapObject mapObject) {}

    // Magic Portal
    public static void mapObject2157(Player player, int index, MapObject mapObject) {}

    // Magic Portal
    public static void mapObject2158(Player player, int index, MapObject mapObject) {}

    // Ballista
    public static void mapObject2181(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject2182(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject2183(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2184(Player player, int index, MapObject mapObject) {}

    // Crumbled wall
    public static void mapObject2185(Player player, int index, MapObject mapObject) {}

    // Loose Railing
    public static void mapObject2186(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2515 && mapObject.getY() == 3161) {
            if (player.getY() >= 3161) {
                player.getMovement().teleport(2515, 3160);
            } else {
                player.getMovement().teleport(2515, 3161);
            }
        }
    }

    // Stairs
    public static void mapObject2187(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject2190(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2191(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2194(Player player, int index, MapObject mapObject) {}

    // Kitchen gate
    public static void mapObject2199(Player player, int index, MapObject mapObject) {}

    // Kitchen gate
    public static void mapObject2200(Player player, int index, MapObject mapObject) {}

    // Telescope
    public static void mapObject2210(Player player, int index, MapObject mapObject) {}

    // Grave of Scorpius
    public static void mapObject2211(Player player, int index, MapObject mapObject) {}

    // Broken cart
    public static void mapObject2216(Player player, int index, MapObject mapObject) {}

    // Mound of earth
    public static void mapObject2217(Player player, int index, MapObject mapObject) {}

    // Fissure
    public static void mapObject2218(Player player, int index, MapObject mapObject) {}

    // Fissure
    public static void mapObject2219(Player player, int index, MapObject mapObject) {}

    // Cave in
    public static void mapObject2220(Player player, int index, MapObject mapObject) {}

    // Strange looking stone
    public static void mapObject2221(Player player, int index, MapObject mapObject) {}

    // Loose rocks
    public static void mapObject2222(Player player, int index, MapObject mapObject) {}

    // Old sacks
    public static void mapObject2223(Player player, int index, MapObject mapObject) {}

    // Ancient gallows
    public static void mapObject2224(Player player, int index, MapObject mapObject) {}

    // Waterfall rocks
    public static void mapObject2225(Player player, int index, MapObject mapObject) {}

    // Smashed table
    public static void mapObject2226(Player player, int index, MapObject mapObject) {}

    // Crude raft
    public static void mapObject2227(Player player, int index, MapObject mapObject) {}

    // Tribal Statue
    public static void mapObject2229(Player player, int index, MapObject mapObject) {}

    // Travel cart
    public static void mapObject2230(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject2231(Player player, int index, MapObject mapObject) {}

    // Well stacked rocks
    public static void mapObject2234(Player player, int index, MapObject mapObject) {}

    // Tomb dolmen
    public static void mapObject2235(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject2236(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject2237(Player player, int index, MapObject mapObject) {}

    // Hillside entrance
    public static void mapObject2238(Player player, int index, MapObject mapObject) {}

    // Hillside entrance
    public static void mapObject2239(Player player, int index, MapObject mapObject) {}

    // Carved doors
    public static void mapObject2240(Player player, int index, MapObject mapObject) {}

    // Carved doors
    public static void mapObject2241(Player player, int index, MapObject mapObject) {}

    // Tomb exit
    public static void mapObject2242(Player player, int index, MapObject mapObject) {}

    // Tomb exit
    public static void mapObject2243(Player player, int index, MapObject mapObject) {}

    // Tomb doors
    public static void mapObject2246(Player player, int index, MapObject mapObject) {}

    // Tomb doors
    public static void mapObject2247(Player player, int index, MapObject mapObject) {}

    // Tomb doors
    public static void mapObject2248(Player player, int index, MapObject mapObject) {}

    // Tomb doors
    public static void mapObject2249(Player player, int index, MapObject mapObject) {}

    // Tomb doors
    public static void mapObject2250(Player player, int index, MapObject mapObject) {}

    // Tomb exit
    public static void mapObject2253(Player player, int index, MapObject mapObject) {}

    // Tomb exit
    public static void mapObject2254(Player player, int index, MapObject mapObject) {}

    // Ancient metal gate
    public static void mapObject2255(Player player, int index, MapObject mapObject) {}

    // Ancient metal gate
    public static void mapObject2256(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject2257(Player player, int index, MapObject mapObject) {}

    // Tomb dolmen
    public static void mapObject2258(Player player, int index, MapObject mapObject) {}

    // Metal gate
    public static void mapObject2259(Player player, int index, MapObject mapObject) {}

    // Metal gate
    public static void mapObject2260(Player player, int index, MapObject mapObject) {}

    // Wooden gate
    public static void mapObject2261(Player player, int index, MapObject mapObject) {}

    // Wooden gate
    public static void mapObject2262(Player player, int index, MapObject mapObject) {}

    // Travel cart
    public static void mapObject2265(Player player, int index, MapObject mapObject) {}

    // Blacksmith's door
    public static void mapObject2266(Player player, int index, MapObject mapObject) {}

    // Blacksmith's door
    public static void mapObject2267(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2268(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2269(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2271(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2272(Player player, int index, MapObject mapObject) {}

   /* 2304 - 2559 */

    // Sturdy door
    public static void mapObject2337(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2338(Player player, int index, MapObject mapObject) {}

    // Sturdy door
    public static void mapObject2339(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject2341(Player player, int index, MapObject mapObject) {}

    // Grill
    public static void mapObject2342(Player player, int index, MapObject mapObject) {}

    // Winch
    public static void mapObject2350(Player player, int index, MapObject mapObject) {}

    // Winch
    public static void mapObject2351(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject2352(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject2353(Player player, int index, MapObject mapObject) {}

    // Sacks
    public static void mapObject2354(Player player, int index, MapObject mapObject) {}

    // Sacks
    public static void mapObject2355(Player player, int index, MapObject mapObject) {}

    // Sacks
    public static void mapObject2356(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject2357(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject2358(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2359(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2360(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2361(Player player, int index, MapObject mapObject) {}

    // Brick
    public static void mapObject2362(Player player, int index, MapObject mapObject) {}

    // Panning point
    public static void mapObject2363(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject2366(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject2367(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject2368(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject2369(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject2370(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject2371(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject2372(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2373(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2374(Player player, int index, MapObject mapObject) {}

    // Specimen tray
    public static void mapObject2375(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2380(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2391(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2392(Player player, int index, MapObject mapObject) {}

    // Gnome goal
    public static void mapObject2393(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2394(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2397(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2398(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2399(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2400(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2401(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject2402(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2403(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2404(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2405(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2406(Player player, int index, MapObject mapObject) {}

    // Magic door
    public static void mapObject2407(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2408(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject2409(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2410(Player player, int index, MapObject mapObject) {}

    // Sturdy door
    public static void mapObject2411(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2412(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2413(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2414(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2415(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject2416(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject2417(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2418(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject2421(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject2422(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject2423(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject2424(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject2425(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject2426(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2427(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2428(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2429(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2430(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2431(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2432(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2433(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2434(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2435(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject2436(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2438(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2439(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject2444(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject2446(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject2447(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject2448(Player player, int index, MapObject mapObject) {}

    // Roots
    public static void mapObject2451(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2476(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2477(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2478(Player player, int index, MapObject mapObject) {}

    // Trawler net
    public static void mapObject2481(Player player, int index, MapObject mapObject) {}

    // Trawler net
    public static void mapObject2482(Player player, int index, MapObject mapObject) {}

    // Trawler net
    public static void mapObject2483(Player player, int index, MapObject mapObject) {}

    // Leak
    public static void mapObject2484(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2517(Player player, int index, MapObject mapObject) {}

    // Loose panel
    public static void mapObject2518(Player player, int index, MapObject mapObject) {}

    // Crane
    public static void mapObject2520(Player player, int index, MapObject mapObject) {}

    // Spooky stairs
    public static void mapObject2522(Player player, int index, MapObject mapObject) {}

    // Spooky stairs
    public static void mapObject2523(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2524(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2525(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2526(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2528(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2530(Player player, int index, MapObject mapObject) {}

    // Mud patch
    public static void mapObject2532(Player player, int index, MapObject mapObject) {}

    // Mud pile
    public static void mapObject2533(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2534(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2535(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2537(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject2539(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject2540(Player player, int index, MapObject mapObject) {}

    // Sewer pipe
    public static void mapObject2541(Player player, int index, MapObject mapObject) {}

    // Pipe
    public static void mapObject2542(Player player, int index, MapObject mapObject) {}

    // Manhole
    public static void mapObject2543(Player player, int index, MapObject mapObject) {}

    // Manhole
    public static void mapObject2544(Player player, int index, MapObject mapObject) {}

    // Manhole cover
    public static void mapObject2545(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2546(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2547(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2548(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2549(Player player, int index, MapObject mapObject) {}

    // Bronze pickaxe
    public static void mapObject2559(Player player, int index, MapObject mapObject) {}

   /* 2560 - 2815 */

    // Flour bin
    public static void mapObject2574(Player player, int index, MapObject mapObject) {}

    // Marshy jungle vine
    public static void mapObject2575(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject2577(Player player, int index, MapObject mapObject) {}

    // Scorched earth
    public static void mapObject2579(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject2581(Player player, int index, MapObject mapObject) {}

    // Fungus covered Cavern wall
    public static void mapObject2583(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject2584(Player player, int index, MapObject mapObject) {}

    // Hand holds
    public static void mapObject2585(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2587(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2588(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject2589(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2590(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2591(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2592(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2593(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject2594(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2595(Player player, int index, MapObject mapObject) {}

    // Red door
    public static void mapObject2596(Player player, int index, MapObject mapObject) {}

    // Orange door
    public static void mapObject2597(Player player, int index, MapObject mapObject) {}

    // Yellow door
    public static void mapObject2598(Player player, int index, MapObject mapObject) {}

    // Blue door
    public static void mapObject2599(Player player, int index, MapObject mapObject) {}

    // Magenta door
    public static void mapObject2600(Player player, int index, MapObject mapObject) {}

    // Green door
    public static void mapObject2601(Player player, int index, MapObject mapObject) {}

    // Exit door
    public static void mapObject2602(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2603(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2604(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2605(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject2606(Player player, int index, MapObject mapObject) {}

    // Hopper controls
    public static void mapObject2607(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject2608(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject2609(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject2610(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2612(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2613(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject2614(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject2615(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject2616(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject2617(Player player, int index, MapObject mapObject) {}

    // Broken fence
    public static void mapObject2618(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2619(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject2620(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2621(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2622(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2623(Player player, int index, MapObject mapObject) {
        // Taverley Dungeon blue dragons door
        if (player.getX() >= 2924) {
            player.getMovement().teleport(2923, player.getY(), 0);
        } else {
            player.getMovement().teleport(2924, player.getY(), 0);
        }
    }

    // Door
    public static void mapObject2624(Player player, int index, MapObject mapObject) {
        if (mapObject.getOriginal() != null || mapObject.getAttachment() != null) {
            return;
        }
        if (!player.getCombat().getDragonSlayer()) {
            player.getGameEncoder().sendMessage("You need to complete Dragon Slayer to enter.");
            return;
        } else if (!player.getCombat().getLostCity()) {
            player.getGameEncoder().sendMessage("You need to complete Lost City to enter.");
            return;
        }
        player.getMovement().clear();
        if (player.getX() >= 2902) {
            player.getMovement().addMovement(player.getX() - 1, player.getY());
        } else {
            player.getMovement().addMovement(player.getX() + 1, player.getY());
        }
        Region.openDoors(player, mapObject, 1, false);
    }

    // Door
    public static void mapObject2625(Player player, int index, MapObject mapObject) {
        if (mapObject.getOriginal() != null || mapObject.getAttachment() != null) {
            return;
        }
        if (!player.getCombat().getDragonSlayer()) {
            player.getGameEncoder().sendMessage("You need to complete Dragon Slayer to enter.");
            return;
        } else if (!player.getCombat().getLostCity()) {
            player.getGameEncoder().sendMessage("You need to complete Lost City to enter.");
            return;
        }
        player.getMovement().clear();
        if (player.getX() >= 2902) {
            player.getMovement().addMovement(player.getX() - 1, player.getY());
        } else {
            player.getMovement().addMovement(player.getX() + 1, player.getY());
        }
        Region.openDoors(player, mapObject, 1, false);
    }

    // Door
    public static void mapObject2626(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2627(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2628(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject2629(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject2630(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2631(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2632(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2633(Player player, int index, MapObject mapObject) {}

    // Rock slide
    public static void mapObject2634(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2635(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2636(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject2640(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2641(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject2650(Player player, int index, MapObject mapObject) {}

    // Sinclair mansion drain
    public static void mapObject2652(Player player, int index, MapObject mapObject) {}

    // Sinclair family fountain
    public static void mapObject2654(Player player, int index, MapObject mapObject) {}

    // Sinclair family crest
    public static void mapObject2655(Player player, int index, MapObject mapObject) {}

    // Anna's barrel
    public static void mapObject2656(Player player, int index, MapObject mapObject) {}

    // Bob's barrel
    public static void mapObject2657(Player player, int index, MapObject mapObject) {}

    // Carol's barrel
    public static void mapObject2658(Player player, int index, MapObject mapObject) {}

    // David's barrel
    public static void mapObject2659(Player player, int index, MapObject mapObject) {}

    // Elizabeth's barrel
    public static void mapObject2660(Player player, int index, MapObject mapObject) {}

    // Frank's barrel
    public static void mapObject2661(Player player, int index, MapObject mapObject) {}

    // Sacks
    public static void mapObject2663(Player player, int index, MapObject mapObject) {}

    // Sturdy wooden gate
    public static void mapObject2664(Player player, int index, MapObject mapObject) {}

    // Sturdy wooden gate
    public static void mapObject2665(Player player, int index, MapObject mapObject) {}

    // Winch
    public static void mapObject2667(Player player, int index, MapObject mapObject) {}

    // Winch bucket
    public static void mapObject2668(Player player, int index, MapObject mapObject) {}

    // Kharidian cactus (Healthy)
    public static void mapObject2670(Player player, int index, MapObject mapObject) {}

    // An experimental anvil
    public static void mapObject2672(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2673(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2674(Player player, int index, MapObject mapObject) {}

    // Mine door entrance
    public static void mapObject2675(Player player, int index, MapObject mapObject) {}

    // Mine door entrance
    public static void mapObject2676(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2677(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject2678(Player player, int index, MapObject mapObject) {}

    // Cell wall window
    public static void mapObject2679(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2680(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2681(Player player, int index, MapObject mapObject) {}

    // Wooden cart
    public static void mapObject2682(Player player, int index, MapObject mapObject) {}

    // Window
    public static void mapObject2683(Player player, int index, MapObject mapObject) {}

    // Mine Cart
    public static void mapObject2684(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2685(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2686(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2687(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2688(Player player, int index, MapObject mapObject) {}

    // Prison door
    public static void mapObject2689(Player player, int index, MapObject mapObject) {}

    // Mine door entrance
    public static void mapObject2690(Player player, int index, MapObject mapObject) {}

    // Mine door entrance
    public static void mapObject2691(Player player, int index, MapObject mapObject) {}

    // Prison door
    public static void mapObject2692(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject2693(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Rock
    public static void mapObject2694(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject2695(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject2696(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject2697(Player player, int index, MapObject mapObject) {}

    // Mine cave
    public static void mapObject2698(Player player, int index, MapObject mapObject) {}

    // Mine cave
    public static void mapObject2699(Player player, int index, MapObject mapObject) {}

    // Tent door
    public static void mapObject2700(Player player, int index, MapObject mapObject) {}

    // Tracks
    public static void mapObject2702(Player player, int index, MapObject mapObject) {}

    // Tracks
    public static void mapObject2703(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject2704(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2705(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2706(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject2707(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject2708(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2709(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2710(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject2711(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject2712(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject2713(Player player, int index, MapObject mapObject) {}

    // Study desk
    public static void mapObject2714(Player player, int index, MapObject mapObject) {}

    // Hellhound
    public static void mapObject2715(Player player, int index, MapObject mapObject) {}

    // City gate
    public static void mapObject2786(Player player, int index, MapObject mapObject) {}

    // City gate
    public static void mapObject2787(Player player, int index, MapObject mapObject) {}

    // City gate
    public static void mapObject2788(Player player, int index, MapObject mapObject) {}

    // City gate
    public static void mapObject2789(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2790(Player player, int index, MapObject mapObject) {}

    // Counter
    public static void mapObject2792(Player player, int index, MapObject mapObject) {}

    // Counter
    public static void mapObject2793(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject2794(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject2795(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2796(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2797(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject2798(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject2799(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject2800(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject2801(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject2802(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject2803(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2804(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2805(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2806(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2807(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2808(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2809(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2810(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2811(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2812(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2813(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2814(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2815(Player player, int index, MapObject mapObject) {}

   /* 2816 - 3071 */

    // Rock of Dalgroth
    public static void mapObject2816(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject2817(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject2818(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject2819(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject2820(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject2821(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject2822(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject2823(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject2825(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2826(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2827(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject2828(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject2829(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject2830(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject2831(Player player, int index, MapObject mapObject) {}

    // Battlement
    public static void mapObject2832(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2833(Player player, int index, MapObject mapObject) {}

    // Battlement
    public static void mapObject2834(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject2835(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject2836(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject2837(Player player, int index, MapObject mapObject) {}

    // Drain
    public static void mapObject2843(Player player, int index, MapObject mapObject) {}

    // Sewer valve
    public static void mapObject2844(Player player, int index, MapObject mapObject) {}

    // Sewer valve
    public static void mapObject2845(Player player, int index, MapObject mapObject) {}

    // Sewer valve
    public static void mapObject2846(Player player, int index, MapObject mapObject) {}

    // Sewer valve
    public static void mapObject2847(Player player, int index, MapObject mapObject) {}

    // Sewer valve
    public static void mapObject2848(Player player, int index, MapObject mapObject) {}

    // Raft
    public static void mapObject2849(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2850(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2851(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2852(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject2853(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject2854(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2856(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject2857(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject2858(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2861(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2862(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2863(Player player, int index, MapObject mapObject) {}

    // Fountain
    public static void mapObject2864(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2865(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2866(Player player, int index, MapObject mapObject) {}

    // Potted plant
    public static void mapObject2867(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2868(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2869(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2871(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2872(Player player, int index, MapObject mapObject) {}

    // Statue of Saradomin
    public static void mapObject2873(Player player, int index, MapObject mapObject) {}

    // Statue of Zamorak
    public static void mapObject2874(Player player, int index, MapObject mapObject) {}

    // Statue of Guthix
    public static void mapObject2875(Player player, int index, MapObject mapObject) {}

    // Sparkling pool
    public static void mapObject2878(Player player, int index, MapObject mapObject) {}

    // Sparkling pool
    public static void mapObject2879(Player player, int index, MapObject mapObject) {}

    // Mystic portal
    public static void mapObject2880(Player player, int index, MapObject mapObject) {}

    // Prison Door
    public static void mapObject2881(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2882(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2883(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject2884(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject2885(Player player, int index, MapObject mapObject) {}

    // Open Cupboard
    public static void mapObject2886(Player player, int index, MapObject mapObject) {}

    // Jungle Tree
    public static void mapObject2887(Player player, int index, MapObject mapObject) {}

    // Jungle Tree
    public static void mapObject2889(Player player, int index, MapObject mapObject) {}

    // Jungle Tree
    public static void mapObject2890(Player player, int index, MapObject mapObject) {}

    // Jungle Bush
    public static void mapObject2892(Player player, int index, MapObject mapObject) {}

    // Jungle Bush
    public static void mapObject2893(Player player, int index, MapObject mapObject) {}

    // Legends Guild door
    public static void mapObject2896(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Legends Guild door
    public static void mapObject2897(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Mossy rock
    public static void mapObject2900(Player player, int index, MapObject mapObject) {}

    // Mossy rock
    public static void mapObject2901(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject2902(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2903(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject2904(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject2905(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject2906(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject2907(Player player, int index, MapObject mapObject) {}

    // Fire Wall
    public static void mapObject2908(Player player, int index, MapObject mapObject) {
        if (!player.carryingItem(730)) {
            player.getGameEncoder().sendMessage("You need a Binding book to enter.");
            return;
        }
        player.getMovement().teleport(2792, 9328, 0);
    }

    // Fire Wall
    public static void mapObject2909(Player player, int index, MapObject mapObject) {
        if (!player.carryingItem(730)) {
            player.getGameEncoder().sendMessage("You need a Binding book to enter.");
            return;
        }
        player.getMovement().teleport(2792, 9328, 0);
    }

    // Desk
    public static void mapObject2910(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject2911(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 50) {
            player.getGameEncoder().sendMessage("You need an Agility level of 50 to do this.");
            return;
        }
        player.getMovement().ladderDownTeleport(new Tile(2800, 9340, 0));
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Ancient Gate
    public static void mapObject2912(Player player, int index, MapObject mapObject) {
        if (mapObject.getOriginal() != null || mapObject.getAttachment() != null) {
            return;
        }
        if (player.getY() >= 9332) {
            player.getGameEncoder().sendMessage("You attempt to pick the lock.");
            if (!player.getInventory().hasItem(1523)) {
                player.getGameEncoder().sendMessage("You need a lockpick for this lock.");
                return;
            } else if (Utils.randomE(4) != 0) {
                player.getGameEncoder().sendMessage("You fail to pick the lock.");
                return;
            }
            player.getGameEncoder().sendMessage("You manage to pick the lock.");
            player.getMovement().clear();
            player.getMovement().addMovement(player.getX(), player.getY() - 1);
            Region.openDoors(player, mapObject, 1, false);
        } else {
            player.getMovement().clear();
            player.getMovement().addMovement(player.getX(), player.getY() + 1);
            Region.openDoors(player, mapObject, 1, false);
        }
    }

    // Ancient Gate
    public static void mapObject2913(Player player, int index, MapObject mapObject) {
        if (mapObject.getOriginal() != null || mapObject.getAttachment() != null) {
            return;
        }
        if (player.getY() >= 9332) {
            player.getGameEncoder().sendMessage("You attempt to pick the lock.");
            if (!player.getInventory().hasItem(1523)) {
                player.getGameEncoder().sendMessage("You need a lockpick for this lock.");
                return;
            } else if (Utils.randomE(4) != 0) {
                player.getGameEncoder().sendMessage("You fail to pick the lock.");
                return;
            }
            player.getGameEncoder().sendMessage("You manage to pick the lock.");
            player.getMovement().clear();
            player.getMovement().addMovement(player.getX(), player.getY() - 1);
            Region.openDoors(player, mapObject, 1, false);
        } else {
            player.getMovement().clear();
            player.getMovement().addMovement(player.getX(), player.getY() + 1);
            Region.openDoors(player, mapObject, 1, false);
        }
    }

    // Crevice
    public static void mapObject2918(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(2795, 9338, 0));
    }

    // Boulder
    public static void mapObject2919(Player player, int index, MapObject mapObject) {
        if (player.getY() >= 9329) {
            player.getMovement().teleport(player.getX(), 9326, 0);
        } else {
            player.getMovement().teleport(player.getX(), 9329, 0);
        }
    }

    // Boulder
    public static void mapObject2920(Player player, int index, MapObject mapObject) {
        if (player.getY() >= 9325) {
            player.getMovement().teleport(player.getX(), 9322, 0);
        } else {
            player.getMovement().teleport(player.getX(), 9325, 0);
        }
    }

    // Boulder
    public static void mapObject2921(Player player, int index, MapObject mapObject) {
        if (player.getY() >= 9321) {
            player.getMovement().teleport(player.getX(), 9318, 0);
        } else {
            player.getMovement().teleport(player.getX(), 9321, 0);
        }
    }

    // Ancient Gate
    public static void mapObject2922(Player player, int index, MapObject mapObject) {
        if (mapObject.getOriginal() != null || mapObject.getAttachment() != null) {
            return;
        } else if (player.getSkills().getLevel(Skills.STRENGTH) < 50) {
            player.getGameEncoder().sendMessage("You need a Strength level of 50 to do this.");
            return;
        }
        player.getMovement().clear();
        if (player.getY() >= 9314) {
            player.getMovement().addMovement(player.getX(), player.getY() - 1);
        } else {
            player.getMovement().addMovement(player.getX(), player.getY() + 1);
        }
        Region.openDoors(player, mapObject, 1, false);
    }

    // Ancient Gate
    public static void mapObject2923(Player player, int index, MapObject mapObject) {
        if (mapObject.getOriginal() != null || mapObject.getAttachment() != null) {
            return;
        } else if (player.getSkills().getLevel(Skills.STRENGTH) < 50) {
            player.getGameEncoder().sendMessage("You need a Strength level of 50 to do this.");
            return;
        }
        player.getMovement().clear();
        if (player.getY() >= 9314) {
            player.getMovement().addMovement(player.getX(), player.getY() - 1);
        } else {
            player.getMovement().addMovement(player.getX(), player.getY() + 1);
        }
        Region.openDoors(player, mapObject, 1, false);
    }

    // Jagged wall
    public static void mapObject2926(Player player, int index, MapObject mapObject) {
        if (player.getX() == 2790 && player.getY() == 9295) {
            player.getMovement().teleport(2789, 9296, 0);
        } else if (player.getX() == 2789 && player.getY() == 9296) {
            player.getMovement().teleport(2790, 9295, 0);
        }
    }

    // Marked wall
    public static void mapObject2927(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2779 && mapObject.getY() == 9305) {
            if (player.getCombat().getLegendsQuest() == 0) {
                if (player.getInventory().getID(0) != 566 || player.getInventory().getID(1) != 558
                        || player.getInventory().getID(2) != 557 || player.getInventory().getID(3) != 563
                        || player.getInventory().getAmount(3) < 2) {
                    player.getGameEncoder().sendMessage("You need to carry the SMELL runes to pass.");
                    return;
                }
                player.getInventory().deleteItem(566, 1);
                player.getInventory().deleteItem(558, 1);
                player.getInventory().deleteItem(557, 1);
                player.getInventory().deleteItem(563, 2);
            }
            player.getController().addMapItem(new Item(730, 1), new Tile(2775, 9290, 0), player);
            player.getGameEncoder().sendMessage("You appear in a large cavern like room filled with pools of water.");
            player.getMovement().teleport(2773, 9301, 0);
        } else if (mapObject.getX() == 2776 && mapObject.getY() == 9303) {
            player.getMovement().teleport(2780, 9307, 0);
        }
    }

    // Carved rock
    public static void mapObject2928(Player player, int index, MapObject mapObject) {}

    // Buried skeleton
    public static void mapObject2929(Player player, int index, MapObject mapObject) {}

    // Ancient Gate
    public static void mapObject2930(Player player, int index, MapObject mapObject) {
        if (player.getCombat().getLegendsQuest() == 0) {
            player.getGameEncoder().sendMessage("I don't think I should go in there...");
            return;
        }
        player.getMovement().teleport(2762, 9320, 0);
    }

    // Barrel
    public static void mapObject2932(Player player, int index, MapObject mapObject) {}

    // Winch
    public static void mapObject2934(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("I need to find a way to climb down.");
    }

    // Winch
    public static void mapObject2935(Player player, int index, MapObject mapObject) {}

    // Totem Pole
    public static void mapObject2936(Player player, int index, MapObject mapObject) {}

    // Totem Pole
    public static void mapObject2937(Player player, int index, MapObject mapObject) {}

    // Totem Pole
    public static void mapObject2938(Player player, int index, MapObject mapObject) {}

    // Totem Pole
    public static void mapObject2939(Player player, int index, MapObject mapObject) {}

    // Sacred water
    public static void mapObject2941(Player player, int index, MapObject mapObject) {}

    // Water Pool
    public static void mapObject2942(Player player, int index, MapObject mapObject) {}

    // Polluted water
    public static void mapObject2943(Player player, int index, MapObject mapObject) {}

    // Tall Reeds
    public static void mapObject2944(Player player, int index, MapObject mapObject) {}

    // Totem pole
    public static void mapObject2954(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject2958(Player player, int index, MapObject mapObject) {}

    // Rocky Ledge
    public static void mapObject2959(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2377 && mapObject.getY() == 4717) {
            if (player.getX() != 2378 || player.getY() != 4717) {
                return;
            }
            player.setAnimation(840);
            Tile toTile = new Tile(2376, 4717, 0);
            player.setForceMovement(new ForceMovement(player, 0, toTile, 2, Tile.WEST));
            player.lock();
            player.getGameEncoder().sendMessage("You start to climb the precarious rocks.");
            Event event = new Event() {
                @Override
                public void execute() {
                    super.stop();
                    if (!player.isVisible()) {
                        return;
                    }
                    player.unlock();
                    player.getMovement().teleport(toTile);
                    player.getGameEncoder()
                            .sendMessage("You climb confidently over the rocks and hold your balance well.");
                }
            };
            player.getWorld().addEvent(event);
        }
    }

    // Rocky Ledge
    public static void mapObject2960(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2377 && mapObject.getY() == 4728) {
            if (player.getX() != 2377 || player.getY() != 4727) {
                return;
            }
            player.setAnimation(840);
            Tile toTile = new Tile(2378, 4729, 0);
            player.setForceMovement(new ForceMovement(player, 0, toTile, 2, Tile.NORTH));
            player.lock();
            player.getGameEncoder().sendMessage("You start to climb the precarious rocks.");
            Event event = new Event() {
                @Override
                public void execute() {
                    super.stop();
                    if (!player.isVisible()) {
                        return;
                    }
                    player.unlock();
                    player.getMovement().teleport(toTile);
                    player.getGameEncoder()
                            .sendMessage("You climb confidently over the rocks and hold your balance well.");
                }
            };
            player.getWorld().addEvent(event);
        }
    }

    // Rocky Ledge
    public static void mapObject2961(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2382 && mapObject.getY() == 4729) {
            if (player.getX() != 2382 || player.getY() != 4730) {
                return;
            }
            player.setAnimation(840);
            Tile toTile = new Tile(2382, 4728, 0);
            player.setForceMovement(new ForceMovement(player, 0, toTile, 2, Tile.SOUTH));
            player.lock();
            player.getGameEncoder().sendMessage("You start to climb the precarious rocks.");
            Event event = new Event() {
                @Override
                public void execute() {
                    super.stop();
                    if (!player.isVisible()) {
                        return;
                    }
                    player.unlock();
                    player.getMovement().teleport(toTile);
                    player.getGameEncoder()
                            .sendMessage("You climb confidently over the rocks and hold your balance well.");
                }
            };
            player.getWorld().addEvent(event);
        }
    }

    // Rocks
    public static void mapObject2962(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2387 && mapObject.getY() == 4728) {
            if (player.getX() != 2387 || player.getY() != 4727) {
                return;
            }
            player.setAnimation(840);
            Tile toTile = new Tile(2388, 4729, 0);
            player.setForceMovement(new ForceMovement(player, 0, toTile, 2, Tile.NORTH));
            player.lock();
            player.getGameEncoder().sendMessage("You start to climb the precarious rocks.");
            Event event = new Event() {
                @Override
                public void execute() {
                    super.stop();
                    if (!player.isVisible()) {
                        return;
                    }
                    player.unlock();
                    player.getMovement().teleport(toTile);
                    player.getGameEncoder()
                            .sendMessage("You climb confidently over the rocks and hold your balance well.");
                }
            };
            player.getWorld().addEvent(event);
        }
    }

    // Rocks
    public static void mapObject2963(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2390 && mapObject.getY() == 4724) {
            if (player.getX() != 2390 || player.getY() != 4725) {
                return;
            }
            player.setAnimation(840);
            Tile toTile = new Tile(2390, 4723, 0);
            player.setForceMovement(new ForceMovement(player, 0, toTile, 2, Tile.SOUTH));
            player.lock();
            player.getGameEncoder().sendMessage("You start to climb the precarious rocks.");
            Event event = new Event() {
                @Override
                public void execute() {
                    super.stop();
                    if (!player.isVisible()) {
                        return;
                    }
                    player.unlock();
                    player.getMovement().teleport(toTile);
                    player.getGameEncoder()
                            .sendMessage("You climb confidently over the rocks and hold your balance well.");
                }
            };
            player.getWorld().addEvent(event);
        }
    }

    // Rocks
    public static void mapObject2964(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2390 && mapObject.getY() == 4718) {
            if (player.getX() != 2390 || player.getY() != 4719) {
                return;
            }
            player.setAnimation(840);
            Tile toTile = new Tile(2390, 4717, 0);
            player.setForceMovement(new ForceMovement(player, 0, toTile, 2, Tile.SOUTH));
            player.lock();
            player.getGameEncoder().sendMessage("You start to climb the precarious rocks.");
            Event event = new Event() {
                @Override
                public void execute() {
                    super.stop();
                    if (!player.isVisible()) {
                        return;
                    }
                    player.unlock();
                    player.getMovement().teleport(toTile);
                    player.getGameEncoder()
                            .sendMessage("You climb confidently over the rocks and hold your balance well.");
                }
            };
            player.getWorld().addEvent(event);
        }
    }

    // Mossy rock
    public static void mapObject2965(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("These rocks look somehow manufactured.");
    }

    // Furnace
    public static void mapObject2966(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("Perhaps I should use this to forge something...");
    }

    // Recess
    public static void mapObject2969(Player player, int index, MapObject mapObject) {
        if (player.getCombat().getLegendsQuest() >= 2) {
            player.getGameEncoder().sendMessage("The wall appears to glow from the crystal.");
            return;
        } else if (player.getInventory().getCount(745) < 1) {
            player.getGameEncoder().sendMessage("It looks like something needs to be placed into the wall.");
            return;
        }
        player.getCombat().setLegendsQuest(2);
        player.getInventory().deleteItem(745, 1);
        player.getGameEncoder().sendMessage("You carefully place the crystal into the depression.");
    }

    // Filled Recess
    public static void mapObject2970(Player player, int index, MapObject mapObject) {}

    // Shimmering field
    public static void mapObject2971(Player player, int index, MapObject mapObject) {
        if (player.getCombat().getLegendsQuest() < 2) {
            player.getGameEncoder().sendMessage("You try to pass through the field, but something prevents you.");
            return;
        }
        if (player.getY() > mapObject.getY()) {
            player.getMovement().teleport(player.getX(), mapObject.getY());
        } else {
            player.getMovement().teleport(player.getX(), mapObject.getY() + 1);
        }
    }

    // Boulder
    public static void mapObject2972(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject2973(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject2974(Player player, int index, MapObject mapObject) {}

    // Leafy Palm Tree
    public static void mapObject2975(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject2989(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject2990(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject2991(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject2992(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject2993(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject2994(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject2995(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject2996(Player player, int index, MapObject mapObject) {}

    // Arctic Pine
    public static void mapObject3037(Player player, int index, MapObject mapObject) {}

   /* 3072 - 3327 */

    // Wall
    public static void mapObject3077(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject3078(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject3079(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject3082(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject3083(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject3108(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject3109(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject3111(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject3112(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject3113(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject3114(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject3190(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject3191(Player player, int index, MapObject mapObject) {}

    // Scoreboard
    public static void mapObject3192(Player player, int index, MapObject mapObject) {}

    // Juna
    public static void mapObject3193(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject3194(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Crate
    public static void mapObject3195(Player player, int index, MapObject mapObject) {}

    // Trawler net
    public static void mapObject3197(Player player, int index, MapObject mapObject) {}

    // Trawler net
    public static void mapObject3198(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject3203(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject3213(Player player, int index, MapObject mapObject) {}

    // Underground Pass Exit
    public static void mapObject3214(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject3217(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject3218(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject3219(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3220(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3221(Player player, int index, MapObject mapObject) {}

    // Cave Stairs
    public static void mapObject3222(Player player, int index, MapObject mapObject) {}

    // Cave Stairs
    public static void mapObject3223(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject3224(Player player, int index, MapObject mapObject) {}

    // Flat rock
    public static void mapObject3230(Player player, int index, MapObject mapObject) {}

    // Odd markings
    public static void mapObject3234(Player player, int index, MapObject mapObject) {}

    // Obstacle pipe
    public static void mapObject3235(Player player, int index, MapObject mapObject) {}

    // Obstacle pipe
    public static void mapObject3236(Player player, int index, MapObject mapObject) {}

    // Obstacle pipe
    public static void mapObject3237(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject3238(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject3241(Player player, int index, MapObject mapObject) {}

    // Bridge
    public static void mapObject3254(Player player, int index, MapObject mapObject) {}

    // Bridge
    public static void mapObject3255(Player player, int index, MapObject mapObject) {}

    // Swamp
    public static void mapObject3263(Player player, int index, MapObject mapObject) {}

    // Well
    public static void mapObject3264(Player player, int index, MapObject mapObject) {}

    // Pile of rocks
    public static void mapObject3265(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject3266(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject3267(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject3268(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3270(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3271(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject3272(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject3273(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject3274(Player player, int index, MapObject mapObject) {}

    // Stone bridge
    public static void mapObject3276(Player player, int index, MapObject mapObject) {}

    // Stone tablet
    public static void mapObject3295(Player player, int index, MapObject mapObject) {}

    // Stone tablet
    public static void mapObject3296(Player player, int index, MapObject mapObject) {}

    // Stone tablet
    public static void mapObject3297(Player player, int index, MapObject mapObject) {}

    // Stone tablet
    public static void mapObject3298(Player player, int index, MapObject mapObject) {}

    // Stone tablet
    public static void mapObject3299(Player player, int index, MapObject mapObject) {}

    // Stone tablet
    public static void mapObject3301(Player player, int index, MapObject mapObject) {}

    // Stone tablet
    public static void mapObject3302(Player player, int index, MapObject mapObject) {}

    // Well
    public static void mapObject3305(Player player, int index, MapObject mapObject) {}

    // Rockpile
    public static void mapObject3307(Player player, int index, MapObject mapObject) {}

    // Smashed cage
    public static void mapObject3308(Player player, int index, MapObject mapObject) {}

    // Rockslide
    public static void mapObject3309(Player player, int index, MapObject mapObject) {}

   /* 3328 - 3583 */

    // Door
    public static void mapObject3333(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3334(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject3337(Player player, int index, MapObject mapObject) {}

    // Flat rock
    public static void mapObject3339(Player player, int index, MapObject mapObject) {}

    // Guide rope
    public static void mapObject3340(Player player, int index, MapObject mapObject) {}

    // Rock pile
    public static void mapObject3343(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject3351(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject3352(Player player, int index, MapObject mapObject) {}

    // Tomb
    public static void mapObject3353(Player player, int index, MapObject mapObject) {}

    // Tomb
    public static void mapObject3354(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject3360(Player player, int index, MapObject mapObject) {}

    // Orb of Light
    public static void mapObject3361(Player player, int index, MapObject mapObject) {}

    // Window
    public static void mapObject3362(Player player, int index, MapObject mapObject) {}

    // Protruding rocks
    public static void mapObject3365(Player player, int index, MapObject mapObject) {}

    // Onion
    public static void mapObject3366(Player player, int index, MapObject mapObject) {}

    // Locked Ogre chest
    public static void mapObject3377(Player player, int index, MapObject mapObject) {}

    // Unlocked Ogre chest
    public static void mapObject3378(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject3379(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject3380(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject3381(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject3394(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject3395(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject3396(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject3397(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject3398(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject3399(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject3400(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject3401(Player player, int index, MapObject mapObject) {}

    // Water controls
    public static void mapObject3403(Player player, int index, MapObject mapObject) {}

    // Water controls
    public static void mapObject3404(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject3406(Player player, int index, MapObject mapObject) {}

    // Bellows
    public static void mapObject3407(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject3409(Player player, int index, MapObject mapObject) {}

    // Hatch
    public static void mapObject3413(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject3415(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject3416(Player player, int index, MapObject mapObject) {}

    // Pin
    public static void mapObject3429(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject3432(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject3433(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject3440(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject3441(Player player, int index, MapObject mapObject) {}

    // Holy barrier
    public static void mapObject3443(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3444(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3445(Player player, int index, MapObject mapObject) {}

    // Cell door
    public static void mapObject3463(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject3480(Player player, int index, MapObject mapObject) {}

    // Well
    public static void mapObject3485(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject3489(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject3490(Player player, int index, MapObject mapObject) {}

    // Monument
    public static void mapObject3493(Player player, int index, MapObject mapObject) {}

    // Monument
    public static void mapObject3494(Player player, int index, MapObject mapObject) {}

    // Monument
    public static void mapObject3495(Player player, int index, MapObject mapObject) {}

    // Monument
    public static void mapObject3496(Player player, int index, MapObject mapObject) {}

    // Monument
    public static void mapObject3497(Player player, int index, MapObject mapObject) {}

    // Monument
    public static void mapObject3498(Player player, int index, MapObject mapObject) {}

    // Monument
    public static void mapObject3499(Player player, int index, MapObject mapObject) {}

    // Church organ
    public static void mapObject3500(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3506(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3507(Player player, int index, MapObject mapObject) {}

    // Fungi on log
    public static void mapObject3509(Player player, int index, MapObject mapObject) {}

    // Budding branch
    public static void mapObject3511(Player player, int index, MapObject mapObject) {}

    // A golden pear bush
    public static void mapObject3513(Player player, int index, MapObject mapObject) {}

    // Grotto
    public static void mapObject3516(Player player, int index, MapObject mapObject) {}

    // Grotto tree
    public static void mapObject3517(Player player, int index, MapObject mapObject) {}

    // Grotto
    public static void mapObject3520(Player player, int index, MapObject mapObject) {}

    // Altar of nature
    public static void mapObject3521(Player player, int index, MapObject mapObject) {}

    // Bridge
    public static void mapObject3522(Player player, int index, MapObject mapObject) {}

    // Grotto
    public static void mapObject3525(Player player, int index, MapObject mapObject) {}

    // Grotto
    public static void mapObject3526(Player player, int index, MapObject mapObject) {}

    // Stone
    public static void mapObject3527(Player player, int index, MapObject mapObject) {}

    // Stone
    public static void mapObject3528(Player player, int index, MapObject mapObject) {}

    // Stone
    public static void mapObject3529(Player player, int index, MapObject mapObject) {}

    // Old well
    public static void mapObject3546(Player player, int index, MapObject mapObject) {}

    // Balancing rope
    public static void mapObject3551(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject3553(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject3555(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject3557(Player player, int index, MapObject mapObject) {}

    // Balancing ledge
    public static void mapObject3559(Player player, int index, MapObject mapObject) {}

    // Balancing ledge
    public static void mapObject3561(Player player, int index, MapObject mapObject) {}

    // Monkey bars
    public static void mapObject3564(Player player, int index, MapObject mapObject) {}

    // Low wall
    public static void mapObject3565(Player player, int index, MapObject mapObject) {}

    // Rope swing
    public static void mapObject3566(Player player, int index, MapObject mapObject) {}

    // Plank
    public static void mapObject3570(Player player, int index, MapObject mapObject) {}

    // Plank
    public static void mapObject3571(Player player, int index, MapObject mapObject) {}

    // Plank
    public static void mapObject3572(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject3578(Player player, int index, MapObject mapObject) {}

    // Ticket Dispenser
    public static void mapObject3581(Player player, int index, MapObject mapObject) {}

    // Hand holds
    public static void mapObject3583(Player player, int index, MapObject mapObject) {}

   /* 3584 - 3839 */

    // Ticket Dispenser
    public static void mapObject3608(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject3610(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject3617(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject3618(Player player, int index, MapObject mapObject) {}

    // Dying tree
    public static void mapObject3648(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject3650(Player player, int index, MapObject mapObject) {
        // Mos Le'Harmless Cave
        Tile tile = new Tile(3748, 9373, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Cooking pot
    public static void mapObject3662(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject3685(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject3686(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject3687(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3722(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3723(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3725(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3726(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3727(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject3728(Player player, int index, MapObject mapObject) {}

    // Stile
    public static void mapObject3730(Player player, int index, MapObject mapObject) {}

    // Cave Entrance
    public static void mapObject3735(Player player, int index, MapObject mapObject) {}

    // Cave Exit
    public static void mapObject3736(Player player, int index, MapObject mapObject) {}

    // Danger sign
    public static void mapObject3742(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject3743(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3745(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3746(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3747(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3748(Player player, int index, MapObject mapObject) {}

    // Cave Entrance
    public static void mapObject3757(Player player, int index, MapObject mapObject) {}

    // Cave Exit
    public static void mapObject3758(Player player, int index, MapObject mapObject) {}

    // Cave Entrance
    public static void mapObject3759(Player player, int index, MapObject mapObject) {}

    // Cave Exit
    public static void mapObject3760(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject3761(Player player, int index, MapObject mapObject) {}

    // Secret Door
    public static void mapObject3762(Player player, int index, MapObject mapObject) {}

    // Cell Door
    public static void mapObject3763(Player player, int index, MapObject mapObject) {}

    // Cell Door
    public static void mapObject3764(Player player, int index, MapObject mapObject) {}

    // Cell Door
    public static void mapObject3765(Player player, int index, MapObject mapObject) {}

    // Cell Door
    public static void mapObject3767(Player player, int index, MapObject mapObject) {}

    // Stronghold
    public static void mapObject3771(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject3772(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject3773(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject3774(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3776(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject3777(Player player, int index, MapObject mapObject) {}

    // Prison Door
    public static void mapObject3780(Player player, int index, MapObject mapObject) {}

    // Arena Entrance
    public static void mapObject3782(Player player, int index, MapObject mapObject) {}

    // Arena Entrance
    public static void mapObject3783(Player player, int index, MapObject mapObject) {}

    // Arena Exit
    public static void mapObject3785(Player player, int index, MapObject mapObject) {}

    // Arena Exit
    public static void mapObject3786(Player player, int index, MapObject mapObject) {}

    // Stone Staircase
    public static void mapObject3788(Player player, int index, MapObject mapObject) {}

    // Stone Staircase
    public static void mapObject3789(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3790(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3791(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3803(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject3804(Player player, int index, MapObject mapObject) {}

    // Storeroom Door
    public static void mapObject3810(Player player, int index, MapObject mapObject) {}

    // Kitchen Drawers
    public static void mapObject3816(Player player, int index, MapObject mapObject) {}

    // Kitchen Drawers
    public static void mapObject3817(Player player, int index, MapObject mapObject) {}

    // Rack
    public static void mapObject3821(Player player, int index, MapObject mapObject) {}

    // Goutweed Crate
    public static void mapObject3822(Player player, int index, MapObject mapObject) {}

    // Tunnel entrance
    public static void mapObject3827(Player player, int index, MapObject mapObject) {}

    // Tunnel entrance
    public static void mapObject3828(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject3829(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3830(Player player, int index, MapObject mapObject) {}

    // Tunnel entrance
    public static void mapObject3831(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject3832(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3508 && mapObject.getY() == 9494) {
            player.getMovement().ladderUpTeleport(new Tile(3509, 9496, 2));
            player.getController().stopWithTeleport();
        }
    }

    // Picnic table
    public static void mapObject3834(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3835(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3836(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3837(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3838(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3839(Player player, int index, MapObject mapObject) {}

   /* 3840 - 4095 */

    // Compost Bin
    public static void mapObject3840(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3841(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3842(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3843(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3844(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3845(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3846(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3847(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3848(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3849(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3850(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3851(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3852(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3853(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject3854(Player player, int index, MapObject mapObject) {}

    // Tribal Statue
    public static void mapObject3863(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject3879(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject3881(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject3882(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject3883(Player player, int index, MapObject mapObject) {}

    // Tripwire
    public static void mapObject3921(Player player, int index, MapObject mapObject) {}

    // Sticks
    public static void mapObject3922(Player player, int index, MapObject mapObject) {}

    // Leaves
    public static void mapObject3923(Player player, int index, MapObject mapObject) {}

    // Leaves
    public static void mapObject3924(Player player, int index, MapObject mapObject) {}

    // Leaves
    public static void mapObject3925(Player player, int index, MapObject mapObject) {}

    // Protruding rocks
    public static void mapObject3927(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject3931(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject3932(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject3933(Player player, int index, MapObject mapObject) {}

    // Dense forest
    public static void mapObject3937(Player player, int index, MapObject mapObject) {}

    // Dense forest
    public static void mapObject3938(Player player, int index, MapObject mapObject) {}

    // Dense forest
    public static void mapObject3939(Player player, int index, MapObject mapObject) {}

    // Tracks
    public static void mapObject3941(Player player, int index, MapObject mapObject) {}

    // Huge Gate
    public static void mapObject3944(Player player, int index, MapObject mapObject) {}

    // Huge Gate
    public static void mapObject3945(Player player, int index, MapObject mapObject) {}

    // Sulphur
    public static void mapObject3962(Player player, int index, MapObject mapObject) {}

    // Sulphur
    public static void mapObject3963(Player player, int index, MapObject mapObject) {}

    // Sulphur
    public static void mapObject3964(Player player, int index, MapObject mapObject) {}

    // Tar
    public static void mapObject3975(Player player, int index, MapObject mapObject) {}

    // Tent flap
    public static void mapObject3980(Player player, int index, MapObject mapObject) {}

    // Tent flap
    public static void mapObject3996(Player player, int index, MapObject mapObject) {}

    // Dense forest
    public static void mapObject3998(Player player, int index, MapObject mapObject) {}

    // Dense forest
    public static void mapObject3999(Player player, int index, MapObject mapObject) {}

    // Well
    public static void mapObject4004(Player player, int index, MapObject mapObject) {}

    // Well
    public static void mapObject4005(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject4006(Player player, int index, MapObject mapObject) {}

    // Cave Exit
    public static void mapObject4007(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject4008(Player player, int index, MapObject mapObject) {}

    // Fractionalizing still
    public static void mapObject4026(Player player, int index, MapObject mapObject) {}

    // Shantay pass
    public static void mapObject4031(Player player, int index, MapObject mapObject) {}

    // Laundry Basket
    public static void mapObject4039(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject4060(Player player, int index, MapObject mapObject) {}

    // Shelf
    public static void mapObject4062(Player player, int index, MapObject mapObject) {}

    // Smashed table
    public static void mapObject4064(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject4066(Player player, int index, MapObject mapObject) {}

    // Broken Wall
    public static void mapObject4068(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4069(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4070(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4071(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4072(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4073(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4074(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4075(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4076(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4077(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4078(Player player, int index, MapObject mapObject) {}

    // Broken Wall
    public static void mapObject4079(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4080(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4081(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4082(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4083(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4084(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4085(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4086(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4087(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4088(Player player, int index, MapObject mapObject) {}

    // Temple wall
    public static void mapObject4089(Player player, int index, MapObject mapObject) {}

    // Fire altar
    public static void mapObject4091(Player player, int index, MapObject mapObject) {}

    // Funeral Pyre
    public static void mapObject4093(Player player, int index, MapObject mapObject) {}

   /* 4096 - 4351 */

    // Funeral Pyre
    public static void mapObject4100(Player player, int index, MapObject mapObject) {}

    // Funeral Pyre
    public static void mapObject4101(Player player, int index, MapObject mapObject) {}

    // Funeral Pyre
    public static void mapObject4102(Player player, int index, MapObject mapObject) {}

    // Funeral Pyre
    public static void mapObject4103(Player player, int index, MapObject mapObject) {}

    // Funeral Pyre
    public static void mapObject4104(Player player, int index, MapObject mapObject) {}

    // Funeral Pyre
    public static void mapObject4105(Player player, int index, MapObject mapObject) {}

    // Solid bronze door
    public static void mapObject4106(Player player, int index, MapObject mapObject) {}

    // Solid steel door
    public static void mapObject4107(Player player, int index, MapObject mapObject) {}

    // Solid black door
    public static void mapObject4108(Player player, int index, MapObject mapObject) {}

    // Solid silver door
    public static void mapObject4109(Player player, int index, MapObject mapObject) {}

    // Bronze Chest
    public static void mapObject4111(Player player, int index, MapObject mapObject) {}

    // Bronze Chest
    public static void mapObject4112(Player player, int index, MapObject mapObject) {}

    // Bronze Chest
    public static void mapObject4113(Player player, int index, MapObject mapObject) {}

    // Bronze Chest
    public static void mapObject4114(Player player, int index, MapObject mapObject) {}

    // Bronze Chest
    public static void mapObject4115(Player player, int index, MapObject mapObject) {}

    // Steel Chest
    public static void mapObject4116(Player player, int index, MapObject mapObject) {}

    // Steel Chest
    public static void mapObject4117(Player player, int index, MapObject mapObject) {}

    // Steel Chest
    public static void mapObject4118(Player player, int index, MapObject mapObject) {}

    // Steel Chest
    public static void mapObject4119(Player player, int index, MapObject mapObject) {}

    // Steel Chest
    public static void mapObject4120(Player player, int index, MapObject mapObject) {}

    // Black Chest
    public static void mapObject4121(Player player, int index, MapObject mapObject) {}

    // Black Chest
    public static void mapObject4122(Player player, int index, MapObject mapObject) {}

    // Black Chest
    public static void mapObject4123(Player player, int index, MapObject mapObject) {}

    // Black Chest
    public static void mapObject4124(Player player, int index, MapObject mapObject) {}

    // Black Chest
    public static void mapObject4125(Player player, int index, MapObject mapObject) {}

    // Silver Chest
    public static void mapObject4126(Player player, int index, MapObject mapObject) {}

    // Silver Chest
    public static void mapObject4127(Player player, int index, MapObject mapObject) {}

    // Silver Chest
    public static void mapObject4128(Player player, int index, MapObject mapObject) {}

    // Silver Chest
    public static void mapObject4129(Player player, int index, MapObject mapObject) {}

    // Silver Chest
    public static void mapObject4130(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject4132(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject4133(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject4139(Player player, int index, MapObject mapObject) {}

    // Swaying tree
    public static void mapObject4142(Player player, int index, MapObject mapObject) {}

    // Danger sign
    public static void mapObject4143(Player player, int index, MapObject mapObject) {}

    // Cave Entrance
    public static void mapObject4147(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4148(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4150(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4151(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4152(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4153(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4154(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4155(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4156(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4157(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4158(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4159(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4160(Player player, int index, MapObject mapObject) {}

    // Escape rope
    public static void mapObject4161(Player player, int index, MapObject mapObject) {}

    // Pipe
    public static void mapObject4162(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4163(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4164(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4165(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4166(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject4167(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject4168(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject4170(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject4171(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4173(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4174(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject4177(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject4178(Player player, int index, MapObject mapObject) {}

    // Abstract mural
    public static void mapObject4179(Player player, int index, MapObject mapObject) {}

    // Abstract mural
    public static void mapObject4180(Player player, int index, MapObject mapObject) {}

    // Unicorn's head
    public static void mapObject4181(Player player, int index, MapObject mapObject) {}

    // Bull's head
    public static void mapObject4182(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject4183(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject4184(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4185(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4186(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4187(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4188(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4189(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4247(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // Door
    public static void mapObject4248(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4250(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4251(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject4252(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject4253(Player player, int index, MapObject mapObject) {}

    // Fish stall
    public static void mapObject4277(Player player, int index, MapObject mapObject) {}

    // Fur stall
    public static void mapObject4278(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4300(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4301(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject4304(Player player, int index, MapObject mapObject) {
        Smithing.openSmelt(player);
    }

    // Anvil
    public static void mapObject4306(Player player, int index, MapObject mapObject) {
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

    // Pottery Oven
    public static void mapObject4308(Player player, int index, MapObject mapObject) {}

    // Spinning wheel
    public static void mapObject4309(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject4311(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject4312(Player player, int index, MapObject mapObject) {}

   /* 4352 - 4607 */

    // Standard Stand
    public static void mapObject4377(Player player, int index, MapObject mapObject) {}

    // Standard Stand
    public static void mapObject4378(Player player, int index, MapObject mapObject) {}

    // Catapult
    public static void mapObject4381(Player player, int index, MapObject mapObject) {}

    // Catapult
    public static void mapObject4382(Player player, int index, MapObject mapObject) {}

    // Iron ladder
    public static void mapObject4383(Player player, int index, MapObject mapObject) {}

    // Catapult
    public static void mapObject4385(Player player, int index, MapObject mapObject) {}

    // Catapult
    public static void mapObject4386(Player player, int index, MapObject mapObject) {}

    // Saradomin Portal
    public static void mapObject4387(Player player, int index, MapObject mapObject) {}

    // Zamorak Portal
    public static void mapObject4388(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4389(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4390(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4406(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4407(Player player, int index, MapObject mapObject) {}

    // Guthix Portal
    public static void mapObject4408(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject4411(Player player, int index, MapObject mapObject) {}

    // Iron ladder
    public static void mapObject4412(Player player, int index, MapObject mapObject) {}

    // Iron ladder
    public static void mapObject4413(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(2515, 4629, player.getHeight()));
    }

    // Staircase
    public static void mapObject4415(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject4416(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject4417(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject4418(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject4419(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject4420(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4423(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4424(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4425(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4426(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4427(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4428(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4429(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4430(Player player, int index, MapObject mapObject) {}

    // Broken door
    public static void mapObject4431(Player player, int index, MapObject mapObject) {}

    // Broken door
    public static void mapObject4432(Player player, int index, MapObject mapObject) {}

    // Broken door
    public static void mapObject4433(Player player, int index, MapObject mapObject) {}

    // Broken door
    public static void mapObject4434(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject4437(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject4438(Player player, int index, MapObject mapObject) {}

    // Climbing Rope
    public static void mapObject4444(Player player, int index, MapObject mapObject) {}

    // Cave wall
    public static void mapObject4448(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject4458(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject4459(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject4460(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject4461(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject4462(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject4463(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject4464(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4465(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4466(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4467(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4468(Player player, int index, MapObject mapObject) {}

    // Energy Barrier
    public static void mapObject4469(Player player, int index, MapObject mapObject) {}

    // Energy Barrier
    public static void mapObject4470(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4471(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4472(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject4483(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Scoreboard
    public static void mapObject4484(Player player, int index, MapObject mapObject) {}

    // Iron ladder
    public static void mapObject4485(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(2515, 4632, player.getHeight()));
    }

    // Chair space
    public static void mapObject4515(Player player, int index, MapObject mapObject) {}

    // Chair space
    public static void mapObject4516(Player player, int index, MapObject mapObject) {}

    // Chair space
    public static void mapObject4517(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject4518(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject4519(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject4520(Player player, int index, MapObject mapObject) {}

    // Bookcase space
    public static void mapObject4521(Player player, int index, MapObject mapObject) {}

    // Bookcase space
    public static void mapObject4522(Player player, int index, MapObject mapObject) {}

    // Fireplace space
    public static void mapObject4523(Player player, int index, MapObject mapObject) {}

    // Curtain space
    public static void mapObject4524(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject4525(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject4526(Player player, int index, MapObject mapObject) {}

    // Pond
    public static void mapObject4527(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject4528(Player player, int index, MapObject mapObject) {}

    // Dungeon entrance
    public static void mapObject4529(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject4531(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject4532(Player player, int index, MapObject mapObject) {}

    // Oak tree
    public static void mapObject4533(Player player, int index, MapObject mapObject) {}

    // Willow tree
    public static void mapObject4534(Player player, int index, MapObject mapObject) {}

    // Maple tree
    public static void mapObject4535(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject4536(Player player, int index, MapObject mapObject) {}

    // Magic tree
    public static void mapObject4537(Player player, int index, MapObject mapObject) {}

    // Dead Tree
    public static void mapObject4538(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject4539(Player player, int index, MapObject mapObject) {}

    // Oak Tree
    public static void mapObject4540(Player player, int index, MapObject mapObject) {}

    // Willow Tree
    public static void mapObject4541(Player player, int index, MapObject mapObject) {}

    // Strange wall
    public static void mapObject4543(Player player, int index, MapObject mapObject) {}

    // Strange wall
    public static void mapObject4544(Player player, int index, MapObject mapObject) {}

    // Strange wall
    public static void mapObject4545(Player player, int index, MapObject mapObject) {}

    // Strange wall
    public static void mapObject4546(Player player, int index, MapObject mapObject) {}

    // Beach
    public static void mapObject4550(Player player, int index, MapObject mapObject) {}

    // Basalt rock
    public static void mapObject4551(Player player, int index, MapObject mapObject) {}

    // Basalt rock
    public static void mapObject4552(Player player, int index, MapObject mapObject) {}

    // Basalt rock
    public static void mapObject4553(Player player, int index, MapObject mapObject) {}

    // Basalt rock
    public static void mapObject4554(Player player, int index, MapObject mapObject) {}

    // Basalt rock
    public static void mapObject4555(Player player, int index, MapObject mapObject) {}

    // Basalt rock
    public static void mapObject4556(Player player, int index, MapObject mapObject) {}

    // Basalt rock
    public static void mapObject4557(Player player, int index, MapObject mapObject) {}

    // Basalt rock
    public static void mapObject4558(Player player, int index, MapObject mapObject) {}

    // Rocky shore
    public static void mapObject4559(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject4568(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject4569(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject4570(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject4577(Player player, int index, MapObject mapObject) {}

   /* 4608 - 4863 */

    // Broken bridge
    public static void mapObject4615(Player player, int index, MapObject mapObject) {}

    // Broken bridge
    public static void mapObject4616(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject4617(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4620(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4621(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4622(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4623(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4624(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4625(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4626(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4627(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4629(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4630(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4631(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4632(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4633(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject4634(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4636(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4637(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4638(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4639(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4640(Player player, int index, MapObject mapObject) {}

    // Noticeboard
    public static void mapObject4642(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4643(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4644(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4645(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4646(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4647(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4648(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject4652(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject4653(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject4671(Player player, int index, MapObject mapObject) {}

    // Throne Room Door
    public static void mapObject4672(Player player, int index, MapObject mapObject) {}

    // Maple tree
    public static void mapObject4674(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4675(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject4676(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4677(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4678(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4679(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4696(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject4697(Player player, int index, MapObject mapObject) {}

    // Fish stall
    public static void mapObject4705(Player player, int index, MapObject mapObject) {}

    // Veg stall
    public static void mapObject4706(Player player, int index, MapObject mapObject) {}

    // Fish stall
    public static void mapObject4707(Player player, int index, MapObject mapObject) {}

    // Veg stall
    public static void mapObject4708(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject4710(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4712(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4713(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4714(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4715(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4716(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4717(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4718(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4719(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4720(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4721(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4722(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4723(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4724(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4725(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4726(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4727(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject4728(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4743(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4744(Player player, int index, MapObject mapObject) {}

    // End of bridge
    public static void mapObject4745(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject4746(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject4749(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject4750(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject4751(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject4752(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject4753(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject4754(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4755(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4756(Player player, int index, MapObject mapObject) {}

    // Awowogei
    public static void mapObject4771(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4772(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4773(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4774(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4775(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4776(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4777(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4778(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4779(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4780(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject4781(Player player, int index, MapObject mapObject) {}

    // Bamboo Gate
    public static void mapObject4787(Player player, int index, MapObject mapObject) {}

    // Bamboo Gate
    public static void mapObject4788(Player player, int index, MapObject mapObject) {}

    // Bamboo Bookcase
    public static void mapObject4798(Player player, int index, MapObject mapObject) {}

    // Jail Door
    public static void mapObject4799(Player player, int index, MapObject mapObject) {}

    // Jail Door
    public static void mapObject4800(Player player, int index, MapObject mapObject) {}

    // Bamboo Door
    public static void mapObject4807(Player player, int index, MapObject mapObject) {}

    // Jungle Tree
    public static void mapObject4818(Player player, int index, MapObject mapObject) {}

    // Jungle Tree
    public static void mapObject4820(Player player, int index, MapObject mapObject) {}

    // Pineapple Plant
    public static void mapObject4827(Player player, int index, MapObject mapObject) {}

    // Gorilla Statue
    public static void mapObject4859(Player player, int index, MapObject mapObject) {}

   /* 4864 - 5119 */

    // Teleportation Device
    public static void mapObject4868(Player player, int index, MapObject mapObject) {}

    // Teleportation Device
    public static void mapObject4869(Player player, int index, MapObject mapObject) {}

    // Teleportation Device
    public static void mapObject4870(Player player, int index, MapObject mapObject) {}

    // Reinitialisation Panel
    public static void mapObject4871(Player player, int index, MapObject mapObject) {}

    // Crafting Stall
    public static void mapObject4874(Player player, int index, MapObject mapObject) {}

    // Food Stall
    public static void mapObject4875(Player player, int index, MapObject mapObject) {}

    // General Stall
    public static void mapObject4876(Player player, int index, MapObject mapObject) {}

    // Magic Stall
    public static void mapObject4877(Player player, int index, MapObject mapObject) {}

    // Scimitar Stall
    public static void mapObject4878(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4879(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4880(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject4881(Player player, int index, MapObject mapObject) {}

    // A rock
    public static void mapObject4883(Player player, int index, MapObject mapObject) {}

    // A rock
    public static void mapObject4887(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4888(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject4889(Player player, int index, MapObject mapObject) {}

    // Saradomin Standard
    public static void mapObject4900(Player player, int index, MapObject mapObject) {}

    // Zamorak Standard
    public static void mapObject4901(Player player, int index, MapObject mapObject) {}

    // Saradomin Standard
    public static void mapObject4902(Player player, int index, MapObject mapObject) {}

    // Zamorak Standard
    public static void mapObject4903(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4911(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4912(Player player, int index, MapObject mapObject) {}

    // Cart tunnel
    public static void mapObject4913(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3440 && mapObject.getY() == 3232) {
            player.getMovement().ladderDownTeleport(new Tile(3436, 9637));
        }
    }

    // Cart tunnel
    public static void mapObject4914(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3430 && mapObject.getY() == 3233) {
            player.getMovement().ladderDownTeleport(new Tile(3405, 9631));
        }
    }

    // Cart tunnel
    public static void mapObject4915(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3429 && mapObject.getY() == 3225) {
            player.getMovement().ladderDownTeleport(new Tile(3409, 9623));
        }
    }

    // Mine cart
    public static void mapObject4918(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport((player.getX() >= 3446) ? 3444 : 3446, 3236);
    }

    // Stairs
    public static void mapObject4919(Player player, int index, MapObject mapObject) {}

    // Cart tunnel
    public static void mapObject4920(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3437 && mapObject.getY() == 9637) {
            player.getMovement().ladderUpTeleport(new Tile(3441, 3232));
        }
    }

    // Cart tunnel
    public static void mapObject4921(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3404 && mapObject.getY() == 9631) {
            player.getMovement().ladderUpTeleport(new Tile(3429, 3233));
        }
    }

    // Cart tunnel
    public static void mapObject4922(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4923(Player player, int index, MapObject mapObject) {}

    // Water Valve
    public static void mapObject4924(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("This valve seems to already be open.");
    }

    // Crystal outcrop
    public static void mapObject4926(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(1755)) {
            player.getGameEncoder().sendMessage("You need a chisel to do this.");
            return;
        } else if (player.getSkills().getLevel(Skills.CRAFTING) < 35) {
            player.getGameEncoder().sendMessage("You need a Crafting level of 35 to cut this.");
            return;
        }
        player.getGameEncoder().sendMessage("You cut a shard from the crystal.");
        player.getInventory().addItem(4082, 1);
        if (player.getCombat().getHauntedMine() == 3) {
            player.getCombat().setHauntedMine(4);
            player.getGameEncoder().sendMessage("<col=ff0000>You have completed Haunted Mine!");
            player.getInventory().addOrDropItem(ItemID.COINS, 50000);
        }
    }

    // Crystal outcrop
    public static void mapObject4927(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(1755)) {
            player.getGameEncoder().sendMessage("You need a chisel to do this.");
            return;
        } else if (player.getSkills().getLevel(Skills.CRAFTING) < 35) {
            player.getGameEncoder().sendMessage("You need a Crafting level of 35 to cut this.");
            return;
        }
        player.getGameEncoder().sendMessage("You cut a shard from the crystal.");
        player.getInventory().addItem(4082, 1);
        if (player.getCombat().getHauntedMine() == 3) {
            player.getCombat().setHauntedMine(4);
            player.getGameEncoder().sendMessage("<col=ff0000>You have completed Haunted Mine!");
            player.getInventory().addOrDropItem(ItemID.COINS, 50000);
        }
    }

    // Crystal outcrop
    public static void mapObject4928(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(1755)) {
            player.getGameEncoder().sendMessage("You need a chisel to do this.");
            return;
        } else if (player.getSkills().getLevel(Skills.CRAFTING) < 35) {
            player.getGameEncoder().sendMessage("You need a Crafting level of 35 to cut this.");
            return;
        }
        player.getGameEncoder().sendMessage("You cut a shard from the crystal.");
        player.getInventory().addItem(4082, 1);
    }

    // Glowing fungus
    public static void mapObject4932(Player player, int index, MapObject mapObject) {
        player.getInventory().addItem(4075, 1);
        player.getGameEncoder().sendMessage("You pull the fungus from the water, it is very cold to the touch.");
    }

    // Glowing fungus
    public static void mapObject4933(Player player, int index, MapObject mapObject) {
        player.getInventory().addItem(4075, 1);
        player.getGameEncoder().sendMessage("You pull the fungus from the water, it is very cold to the touch.");
    }

    // Lift
    public static void mapObject4937(Player player, int index, MapObject mapObject) {
        if (player.getCombat().getHauntedMine() < 2 || !player.getInventory().hasItem(4075)) {
            player.getGameEncoder().sendMessage("You should take a glowing fungus with you before going down.");
            return;
        }
        player.getMovement().teleport(2725, 4452);
    }

    // Lift
    public static void mapObject4938(Player player, int index, MapObject mapObject) {
        if (player.getCombat().getHauntedMine() < 2 || !player.getInventory().hasItem(4075)) {
            player.getGameEncoder().sendMessage("You should take a glowing fungus with you before going down.");
            return;
        }
        player.getMovement().teleport(2725, 4452);
    }

    // Lift
    public static void mapObject4940(Player player, int index, MapObject mapObject) {
        if (player.getCombat().getHauntedMine() < 2 || !player.getInventory().hasItem(4075)) {
            player.getGameEncoder().sendMessage("You should take a glowing fungus with you before going down.");
            return;
        }
        player.getMovement().teleport(2725, 4452);
    }

    // Lift
    public static void mapObject4942(Player player, int index, MapObject mapObject) {}

    // Points settings
    public static void mapObject4949(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("Everything looks good here.");
    }

    // Lever
    public static void mapObject4950(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4951(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4952(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4953(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4954(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4955(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4956(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4957(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Door
    public static void mapObject4962(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2799 && mapObject.getY() == 4453) {
            if (mapObject.isBusy() || player.getY() != mapObject.getY()) {
                return;
            }
            player.getMovement().clear();
            if (player.getX() == mapObject.getX()) {
                player.getMovement().addMovement(mapObject.getX() - 1, mapObject.getY());
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
            Region.openDoor(player, mapObject, 1, false, false);
        }
    }

    // Large door
    public static void mapObject4963(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2773 && mapObject.getY() == 4450) {
            if (mapObject.getOriginal() != null || mapObject.getAttachment() != null
                    || player.getX() != mapObject.getX()) {
                player.getGameEncoder().sendMessage("There was an issue opening this door.");
                return;
            }
            player.getMovement().clear();
            if (player.getY() == mapObject.getY()) {
                if (!player.getInventory().hasItem(4077)) {
                    player.getGameEncoder().sendMessage("You need a key to open these doors.");
                    return;
                }
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY() - 1);
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
            Region.openGates(player, mapObject, 1, false, false);
        }
    }

    // Large door
    public static void mapObject4964(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2772 && mapObject.getY() == 4450) {
            if (mapObject.getOriginal() != null || mapObject.getAttachment() != null
                    || player.getX() != mapObject.getX()) {
                player.getGameEncoder().sendMessage("There was an issue opening this door.");
                return;
            }
            player.getMovement().clear();
            if (player.getY() == mapObject.getY()) {
                if (!player.getInventory().hasItem(4077)) {
                    player.getGameEncoder().sendMessage("You need a key to open these doors.");
                    return;
                }
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY() - 1);
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
            Region.openGates(player, mapObject, 1, false, false);
        }
    }

    // Ladder
    public static void mapObject4965(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3422 && mapObject.getY() == 9625) {
            player.getMovement().ladderDownTeleport(new Tile(2782, 4568));
        } else if (mapObject.getX() == 3413 && mapObject.getY() == 9633) {
            player.getMovement().ladderDownTeleport(new Tile(2773, 4576));
        }
    }

    // Ladder
    public static void mapObject4966(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2782 && mapObject.getY() == 4569) {
            player.getMovement().ladderUpTeleport(new Tile(3422, 9624));
        } else if (mapObject.getX() == 2773 && mapObject.getY() == 4577) {
            player.getMovement().ladderUpTeleport(new Tile(3413, 4576));
        }
    }

    // Ladder
    public static void mapObject4967(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2725 && mapObject.getY() == 4486) {
            player.getMovement().ladderDownTeleport(new Tile(2789, 4487));
        } else if (mapObject.getX() == 2710 && mapObject.getY() == 4540) {
            player.getMovement().ladderDownTeleport(new Tile(2775, 4540));
        } else if (mapObject.getX() == 2732 && mapObject.getY() == 4529) {
            player.getMovement().ladderDownTeleport(new Tile(2797, 4529));
        }
    }

    // Ladder
    public static void mapObject4968(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2789 && mapObject.getY() == 4486) {
            player.getMovement().ladderUpTeleport(new Tile(2725, 4487));
        } else if (mapObject.getX() == 2774 && mapObject.getY() == 4540) {
            player.getMovement().ladderUpTeleport(new Tile(2711, 4540));
        } else if (mapObject.getX() == 2796 && mapObject.getY() == 4529) {
            player.getMovement().ladderUpTeleport(new Tile(2732, 4528));
        }
    }

    // Ladder
    public static void mapObject4969(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2798 && mapObject.getY() == 4567) {
            player.getMovement().ladderDownTeleport(new Tile(2734, 4504));
        } else if (mapObject.getX() == 2797 && mapObject.getY() == 4599) {
            player.getMovement().ladderDownTeleport(new Tile(2734, 4535));
        }
    }

    // Ladder
    public static void mapObject4970(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2734 && mapObject.getY() == 4503) {
            player.getMovement().ladderUpTeleport(new Tile(2798, 4568));
        } else if (mapObject.getX() == 2733 && mapObject.getY() == 4535) {
            player.getMovement().ladderUpTeleport(new Tile(2798, 4599));
        }
    }

    // Stairs
    public static void mapObject4971(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2746 && mapObject.getY() == 4436) {
            player.getMovement().ladderDownTeleport(new Tile(2811, 4453));
        } else if (mapObject.getX() == 2692 && mapObject.getY() == 4436) {
            player.getMovement().ladderDownTeleport(new Tile(2758, 4453));
        }
    }

    // Stairs
    public static void mapObject4972(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4973(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2812 && mapObject.getY() == 4452) {
            player.getMovement().ladderUpTeleport(new Tile(2750, 4436));
        } else if (mapObject.getX() == 2755 && mapObject.getY() == 4452) {
            player.getMovement().ladderUpTeleport(new Tile(2691, 4438));
        }
    }

    // Mine cart
    public static void mapObject4974(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2778 && mapObject.getY() == 4506) {
            if (player.getCombat().getHauntedMine() == 0) {
                player.getGameEncoder().sendMessage("This cart looks like it could carry something.");
            } else {
                player.getGameEncoder().sendMessage("You have already pushed a mine cart deeper into the mine.");
            }
        } else if (mapObject.getX() == 2774 && mapObject.getY() == 4537) {
            if (player.getCombat().getHauntedMine() >= 1) {
                player.getInventory().addItem(4075, 1);
                player.getGameEncoder().sendMessage("You remove the glowing fungus from the mine cart.");
            }
            if (player.getCombat().getHauntedMine() == 1) {
                player.getCombat().setHauntedMine(2);
            }
        }
    }

    // Crate
    public static void mapObject4975(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject4977(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject4978(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4979(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4980(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4981(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4982(Player player, int index, MapObject mapObject) {}

    // Rope bridge
    public static void mapObject5002(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject5003(Player player, int index, MapObject mapObject) {}

    // Rare Flowers
    public static void mapObject5006(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject5007(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5008(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5009(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5010(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5011(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5012(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5013(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5014(Player player, int index, MapObject mapObject) {}

    // slope
    public static void mapObject5015(Player player, int index, MapObject mapObject) {}

    // slope
    public static void mapObject5016(Player player, int index, MapObject mapObject) {}

    // Crevasse
    public static void mapObject5025(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject5036(Player player, int index, MapObject mapObject) {}

    // Ice gate
    public static void mapObject5043(Player player, int index, MapObject mapObject) {}

    // Ice gate
    public static void mapObject5044(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject5046(Player player, int index, MapObject mapObject) {}

    // Stalagmite
    public static void mapObject5050(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject5052(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject5054(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5055(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5056(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5057(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5058(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5059(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5060(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5061(Player player, int index, MapObject mapObject) {}

    // Combat Scroll
    public static void mapObject5094(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject5106(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject5107(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject5108(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject5109(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject5110(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject5111(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject5113(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject5115(Player player, int index, MapObject mapObject) {}

   /* 5120 - 5375 */

    // Yew tree
    public static void mapObject5121(Player player, int index, MapObject mapObject) {}

    // Maple tree
    public static void mapObject5126(Player player, int index, MapObject mapObject) {}

    // Magic tree
    public static void mapObject5127(Player player, int index, MapObject mapObject) {}

    // Fern
    public static void mapObject5128(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject5129(Player player, int index, MapObject mapObject) {}

    // Tall Plant
    public static void mapObject5130(Player player, int index, MapObject mapObject) {}

    // Short Plant
    public static void mapObject5131(Player player, int index, MapObject mapObject) {}

    // Large-leaf Plant
    public static void mapObject5132(Player player, int index, MapObject mapObject) {}

    // Huge plant
    public static void mapObject5133(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject5134(Player player, int index, MapObject mapObject) {}

    // Small fern
    public static void mapObject5135(Player player, int index, MapObject mapObject) {}

    // Fern
    public static void mapObject5136(Player player, int index, MapObject mapObject) {}

    // Dock Leaf
    public static void mapObject5137(Player player, int index, MapObject mapObject) {}

    // Thistle
    public static void mapObject5138(Player player, int index, MapObject mapObject) {}

    // Reeds
    public static void mapObject5139(Player player, int index, MapObject mapObject) {}

    // Rosemary
    public static void mapObject5140(Player player, int index, MapObject mapObject) {}

    // Daffodils
    public static void mapObject5141(Player player, int index, MapObject mapObject) {}

    // Bluebells
    public static void mapObject5142(Player player, int index, MapObject mapObject) {}

    // Rosemary
    public static void mapObject5143(Player player, int index, MapObject mapObject) {}

    // Daffodils
    public static void mapObject5144(Player player, int index, MapObject mapObject) {}

    // Bluebells
    public static void mapObject5145(Player player, int index, MapObject mapObject) {}

    // Sunflower
    public static void mapObject5146(Player player, int index, MapObject mapObject) {}

    // Marigolds
    public static void mapObject5147(Player player, int index, MapObject mapObject) {}

    // Roses
    public static void mapObject5148(Player player, int index, MapObject mapObject) {}

    // Sunflowers
    public static void mapObject5149(Player player, int index, MapObject mapObject) {}

    // Marigolds
    public static void mapObject5150(Player player, int index, MapObject mapObject) {}

    // Roses
    public static void mapObject5151(Player player, int index, MapObject mapObject) {}

    // Boundary stones
    public static void mapObject5152(Player player, int index, MapObject mapObject) {}

    // Wooden fence
    public static void mapObject5153(Player player, int index, MapObject mapObject) {}

    // Stone wall
    public static void mapObject5154(Player player, int index, MapObject mapObject) {}

    // Iron railings
    public static void mapObject5155(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject5156(Player player, int index, MapObject mapObject) {}

    // Open Cupboard
    public static void mapObject5157(Player player, int index, MapObject mapObject) {}

    // Pile of canes
    public static void mapObject5158(Player player, int index, MapObject mapObject) {}

    // Bridge
    public static void mapObject5159(Player player, int index, MapObject mapObject) {}

    // Bridge
    public static void mapObject5160(Player player, int index, MapObject mapObject) {}

    // Clock
    public static void mapObject5161(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject5162(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject5163(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject5164(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject5166(Player player, int index, MapObject mapObject) {}

    // Memorial
    public static void mapObject5167(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject5168(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject5169(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject5170(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5172(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5174(Player player, int index, MapObject mapObject) {}

    // Lightning conductor
    public static void mapObject5176(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5183(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject5184(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject5185(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5186(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5187(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5188(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject5206(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject5207(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5244(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5245(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject5250(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject5251(Player player, int index, MapObject mapObject) {}

    // Fire remains
    public static void mapObject5252(Player player, int index, MapObject mapObject) {}

    // Nettles
    public static void mapObject5253(Player player, int index, MapObject mapObject) {}

    // Nettles
    public static void mapObject5254(Player player, int index, MapObject mapObject) {}

    // Nettles
    public static void mapObject5255(Player player, int index, MapObject mapObject) {}

    // Nettles
    public static void mapObject5256(Player player, int index, MapObject mapObject) {}

    // Nettles
    public static void mapObject5257(Player player, int index, MapObject mapObject) {}

    // Nettles
    public static void mapObject5258(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject5269(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject5270(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject5330(Player player, int index, MapObject mapObject) {}

   /* 5376 - 5631 */

    // Ship's ladder
    public static void mapObject5415(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject5416(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5453(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5454(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject5488(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5490(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5491(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5492(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject5493(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject5501(Player player, int index, MapObject mapObject) {}

    // Onion
    public static void mapObject5538(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject5553(Player player, int index, MapObject mapObject) {
        // Mos Le'Harmless Cave
        Tile tile = new Tile(3748, 9373, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Logs
    public static void mapObject5581(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject5583(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject5584(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject5585(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject5618(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject5619(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject5622(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject5623(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject5624(Player player, int index, MapObject mapObject) {}

    // Picket fence
    public static void mapObject5631(Player player, int index, MapObject mapObject) {}

   /* 5632 - 5887 */

    // Garden fence
    public static void mapObject5632(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject5667(Player player, int index, MapObject mapObject) {}

    // Crack
    public static void mapObject5793(Player player, int index, MapObject mapObject) {}

    // Crack
    public static void mapObject5794(Player player, int index, MapObject mapObject) {}

    // Crack
    public static void mapObject5795(Player player, int index, MapObject mapObject) {}

    // Crack
    public static void mapObject5796(Player player, int index, MapObject mapObject) {}

    // Crack
    public static void mapObject5797(Player player, int index, MapObject mapObject) {}

    // Crack
    public static void mapObject5798(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5799(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5800(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5801(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5802(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5803(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5804(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5805(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5806(Player player, int index, MapObject mapObject) {}

    // Sculpture
    public static void mapObject5808(Player player, int index, MapObject mapObject) {}

    // Weathervane
    public static void mapObject5809(Player player, int index, MapObject mapObject) {}

    // Weathervane
    public static void mapObject5811(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject5813(Player player, int index, MapObject mapObject) {}

    // Gnome landing light
    public static void mapObject5815(Player player, int index, MapObject mapObject) {}

    // Flashing landing light
    public static void mapObject5816(Player player, int index, MapObject mapObject) {}

    // Flashing landing light
    public static void mapObject5817(Player player, int index, MapObject mapObject) {}

    // Flashing landing light
    public static void mapObject5818(Player player, int index, MapObject mapObject) {}

    // Flashing landing light
    public static void mapObject5819(Player player, int index, MapObject mapObject) {}

    // Gnome landing light
    public static void mapObject5820(Player player, int index, MapObject mapObject) {}

    // Gnome landing light
    public static void mapObject5821(Player player, int index, MapObject mapObject) {}

    // Gnome landing light
    public static void mapObject5822(Player player, int index, MapObject mapObject) {}

    // Gnome landing light
    public static void mapObject5823(Player player, int index, MapObject mapObject) {}

    // Antiques Shop Stall
    public static void mapObject5831(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject5842(Player player, int index, MapObject mapObject) {}

    // Rockslide
    public static void mapObject5847(Player player, int index, MapObject mapObject) {}

    // Tall tree
    public static void mapObject5848(Player player, int index, MapObject mapObject) {}

    // Clump of rocks
    public static void mapObject5849(Player player, int index, MapObject mapObject) {}

    // Flat stone
    public static void mapObject5850(Player player, int index, MapObject mapObject) {}

    // Flat stone
    public static void mapObject5851(Player player, int index, MapObject mapObject) {}

    // Shining pool
    public static void mapObject5855(Player player, int index, MapObject mapObject) {}

    // Thorny bushes
    public static void mapObject5856(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject5857(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject5858(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject5859(Player player, int index, MapObject mapObject) {}

    // Mud
    public static void mapObject5883(Player player, int index, MapObject mapObject) {}

    // Roots
    public static void mapObject5885(Player player, int index, MapObject mapObject) {}

    // Roots
    public static void mapObject5886(Player player, int index, MapObject mapObject) {}

    // Tent door
    public static void mapObject5887(Player player, int index, MapObject mapObject) {}

   /* 5888 - 6143 */

    // Tent door
    public static void mapObject5888(Player player, int index, MapObject mapObject) {}

    // Tent door
    public static void mapObject5889(Player player, int index, MapObject mapObject) {}

    // Tent door
    public static void mapObject5890(Player player, int index, MapObject mapObject) {}

    // Tent door
    public static void mapObject5891(Player player, int index, MapObject mapObject) {}

    // Tent door
    public static void mapObject5893(Player player, int index, MapObject mapObject) {}

    // Shining pool
    public static void mapObject5897(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject5902(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject5903(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject5904(Player player, int index, MapObject mapObject) {}

    // Tree stump
    public static void mapObject5905(Player player, int index, MapObject mapObject) {}

    // Marble wall
    public static void mapObject5907(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject5946(Player player, int index, MapObject mapObject) {}

    // Dark hole
    public static void mapObject5947(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject5948(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject5949(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject5959(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 3090 && mapObject.getY() == 3956) {
            // Mage Arena to bank
            if (player.getMovement().getTeleportBlock() > 0) {
                player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                        + player.getMovement().getTeleportBlockRemaining() + ".");
                return;
            }
            Tile tile = new Tile(2539, 4712, 0);
            player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
            player.clearHits();
        }
    }

    // Lever
    public static void mapObject5960(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 2539 && mapObject.getY() == 4712) {
            // Mage Arena bank to outside
            Tile tile = new Tile(3090, 3956, 0);
            player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
            player.clearHits();
        }
    }

    // Cave entrance
    public static void mapObject5973(Player player, int index, MapObject mapObject) {}

    // Dwarf MultiCannon
    public static void mapObject5975(Player player, int index, MapObject mapObject) {}

    // Wall of flame
    public static void mapObject5977(Player player, int index, MapObject mapObject) {}

    // Wall of flame
    public static void mapObject5978(Player player, int index, MapObject mapObject) {}

    // Wall of flame
    public static void mapObject5979(Player player, int index, MapObject mapObject) {}

    // Wall of flame
    public static void mapObject5980(Player player, int index, MapObject mapObject) {}

    // Mineral vein
    public static void mapObject5989(Player player, int index, MapObject mapObject) {}

    // Mineral vein
    public static void mapObject5990(Player player, int index, MapObject mapObject) {}

    // Mineral vein
    public static void mapObject5991(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject5998(Player player, int index, MapObject mapObject) {}

    // Mine cart
    public static void mapObject6045(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject6084(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Stairs
    public static void mapObject6085(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6086(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6087(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6088(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6089(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6090(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject6091(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject6092(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6100(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6101(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6102(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6103(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6104(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6105(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6106(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6107(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6108(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6109(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6110(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6111(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6112(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6113(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6114(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6115(Player player, int index, MapObject mapObject) {}

   /* 6144 - 6399 */

    // Anvil
    public static void mapObject6150(Player player, int index, MapObject mapObject) {}

    // Gem Stall
    public static void mapObject6162(Player player, int index, MapObject mapObject) {}

    // Bakery stall
    public static void mapObject6163(Player player, int index, MapObject mapObject) {}

    // Silver stall
    public static void mapObject6164(Player player, int index, MapObject mapObject) {}

    // Clothes stall
    public static void mapObject6165(Player player, int index, MapObject mapObject) {}

    // Crafting stall
    public static void mapObject6166(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject6176(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject6189(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6238(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6240(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject6242(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject6243(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject6244(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject6245(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject6246(Player player, int index, MapObject mapObject) {}

    // Dung
    public static void mapObject6257(Player player, int index, MapObject mapObject) {}

    // Dung
    public static void mapObject6258(Player player, int index, MapObject mapObject) {}

    // Dung
    public static void mapObject6259(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6260(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6261(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6262(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject6274(Player player, int index, MapObject mapObject) {}

    // Study desk
    public static void mapObject6275(Player player, int index, MapObject mapObject) {}

    // Landscape
    public static void mapObject6276(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject6277(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject6278(Player player, int index, MapObject mapObject) {}

    // Smokey well
    public static void mapObject6279(Player player, int index, MapObject mapObject) {
        // Smoke Dungeon entrance
        Tile tile = new Tile(3205, 9378, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Ladder
    public static void mapObject6280(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6281(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject6282(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject6292(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject6293(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject6294(Player player, int index, MapObject mapObject) {}

    // Statuette in alcove
    public static void mapObject6303(Player player, int index, MapObject mapObject) {}

    // Statuette in alcove
    public static void mapObject6304(Player player, int index, MapObject mapObject) {}

    // Statuette in alcove
    public static void mapObject6305(Player player, int index, MapObject mapObject) {}

    // Alcove
    public static void mapObject6306(Player player, int index, MapObject mapObject) {}

    // Statuette in alcove
    public static void mapObject6307(Player player, int index, MapObject mapObject) {}

    // Statuette in alcove
    public static void mapObject6308(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6310(Player player, int index, MapObject mapObject) {}

    // Black mushrooms
    public static void mapObject6311(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject6312(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject6313(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6363(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6364(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject6372(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject6373(Player player, int index, MapObject mapObject) {}

   /* 6400 - 6655 */

    // Ladder
    public static void mapObject6418(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6419(Player player, int index, MapObject mapObject) {}

    // Burnt chest
    public static void mapObject6420(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject6422(Player player, int index, MapObject mapObject) {}

    // Mystical mirror
    public static void mapObject6423(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject6424(Player player, int index, MapObject mapObject) {}

    // Mystical mirror
    public static void mapObject6425(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject6426(Player player, int index, MapObject mapObject) {}

    // Mystical mirror
    public static void mapObject6427(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject6428(Player player, int index, MapObject mapObject) {}

    // Mystical mirror
    public static void mapObject6429(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject6430(Player player, int index, MapObject mapObject) {}

    // Mystical mirror
    public static void mapObject6431(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject6432(Player player, int index, MapObject mapObject) {}

    // Mystical mirror
    public static void mapObject6433(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject6434(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject6435(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6436(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject6439(Player player, int index, MapObject mapObject) {
        // Smoke Dungeon exit
        Tile tile = new Tile(3310, 2961, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Cave entrance
    public static void mapObject6440(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject6441(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject6442(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject6443(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject6444(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject6445(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject6446(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject6447(Player player, int index, MapObject mapObject) {}

    // Secure chest
    public static void mapObject6448(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6450(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject6451(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject6452(Player player, int index, MapObject mapObject) {}

    // Ice ledge
    public static void mapObject6455(Player player, int index, MapObject mapObject) {}

    // Ice ledge
    public static void mapObject6456(Player player, int index, MapObject mapObject) {}

    // Ice gate
    public static void mapObject6461(Player player, int index, MapObject mapObject) {}

    // Ice gate
    public static void mapObject6462(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject6481(Player player, int index, MapObject mapObject) {}

    // Mystical door
    public static void mapObject6494(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6497(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6498(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6499(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6500(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6501(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6502(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6503(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6504(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject6512(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject6513(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject6514(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject6515(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject6516(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject6517(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6523(Player player, int index, MapObject mapObject) {}

    // Pyramid entrance
    public static void mapObject6545(Player player, int index, MapObject mapObject) {}

    // Pyramid entrance
    public static void mapObject6547(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject6550(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject6551(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject6552(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject6553(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject6555(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6560(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6561(Player player, int index, MapObject mapObject) {}

    // Treasure Trail Statistics
    public static void mapObject6567(Player player, int index, MapObject mapObject) {}

    // Tea stall
    public static void mapObject6574(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject6578(Player player, int index, MapObject mapObject) {}

    // Banana Tree
    public static void mapObject6579(Player player, int index, MapObject mapObject) {}

    // Tent flap
    public static void mapObject6581(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject6588(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject6589(Player player, int index, MapObject mapObject) {}

    // Centre piece
    public static void mapObject6606(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6614(Player player, int index, MapObject mapObject) {}

    // Pinboard
    public static void mapObject6615(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject6616(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject6620(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject6621(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject6623(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6624(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6625(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6626(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6627(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject6630(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject6632(Player player, int index, MapObject mapObject) {}

    // Canopic Jar
    public static void mapObject6634(Player player, int index, MapObject mapObject) {}

    // Canopic Jar
    public static void mapObject6635(Player player, int index, MapObject mapObject) {}

    // Canopic Jar
    public static void mapObject6636(Player player, int index, MapObject mapObject) {}

    // Canopic Jar
    public static void mapObject6637(Player player, int index, MapObject mapObject) {}

    // Canopic Jar
    public static void mapObject6638(Player player, int index, MapObject mapObject) {}

    // Canopic Jar
    public static void mapObject6639(Player player, int index, MapObject mapObject) {}

    // Canopic Jar
    public static void mapObject6640(Player player, int index, MapObject mapObject) {}

    // Canopic Jar
    public static void mapObject6641(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject6643(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject6645(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject6646(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject6647(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject6648(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject6649(Player player, int index, MapObject mapObject) {}

   /* 6656 - 6911 */

    // Inconspicuous bush (easy)
    public static void mapObject6657(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject6658(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject6659(Player player, int index, MapObject mapObject) {}

    // Weeping wall
    public static void mapObject6660(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject6669(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject6670(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject6671(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject6672(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject6673(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject6702(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6727(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6728(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6729(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6730(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6731(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6732(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6733(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6734(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6735(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6736(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6737(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6738(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6739(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6740(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6741(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6742(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6743(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6744(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6745(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6746(Player player, int index, MapObject mapObject) {}

    // Hedge
    public static void mapObject6747(Player player, int index, MapObject mapObject) {}

    // Gazebo
    public static void mapObject6748(Player player, int index, MapObject mapObject) {}

    // Small fountain
    public static void mapObject6749(Player player, int index, MapObject mapObject) {}

    // Large fountain
    public static void mapObject6750(Player player, int index, MapObject mapObject) {}

    // Ornamental fountain
    public static void mapObject6751(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject6752(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject6753(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject6754(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject6755(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject6756(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject6757(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject6758(Player player, int index, MapObject mapObject) {}

    // Rug
    public static void mapObject6759(Player player, int index, MapObject mapObject) {}

    // Rug
    public static void mapObject6760(Player player, int index, MapObject mapObject) {}

    // Rug
    public static void mapObject6761(Player player, int index, MapObject mapObject) {}

    // Rug
    public static void mapObject6762(Player player, int index, MapObject mapObject) {}

    // Rug
    public static void mapObject6763(Player player, int index, MapObject mapObject) {}

    // Rug
    public static void mapObject6764(Player player, int index, MapObject mapObject) {}

    // Rug
    public static void mapObject6765(Player player, int index, MapObject mapObject) {}

    // Rug
    public static void mapObject6766(Player player, int index, MapObject mapObject) {}

    // Rug
    public static void mapObject6767(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject6768(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject6769(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject6770(Player player, int index, MapObject mapObject) {}

    // Scroll rack
    public static void mapObject6771(Player player, int index, MapObject mapObject) {}

    // Scroll rack
    public static void mapObject6772(Player player, int index, MapObject mapObject) {}

    // Scroll rack
    public static void mapObject6773(Player player, int index, MapObject mapObject) {}

    // Curtains
    public static void mapObject6774(Player player, int index, MapObject mapObject) {}

    // Curtains
    public static void mapObject6775(Player player, int index, MapObject mapObject) {}

    // Curtains
    public static void mapObject6776(Player player, int index, MapObject mapObject) {}

    // Wall decoration
    public static void mapObject6777(Player player, int index, MapObject mapObject) {}

    // Wall decoration
    public static void mapObject6778(Player player, int index, MapObject mapObject) {}

    // Wall decoration
    public static void mapObject6779(Player player, int index, MapObject mapObject) {}

    // Clay fireplace
    public static void mapObject6780(Player player, int index, MapObject mapObject) {}

    // Limestone fireplace
    public static void mapObject6782(Player player, int index, MapObject mapObject) {}

    // Marble fireplace
    public static void mapObject6784(Player player, int index, MapObject mapObject) {}

    // Tools
    public static void mapObject6786(Player player, int index, MapObject mapObject) {}

    // Tools
    public static void mapObject6787(Player player, int index, MapObject mapObject) {}

    // Tools
    public static void mapObject6788(Player player, int index, MapObject mapObject) {}

    // Tools
    public static void mapObject6789(Player player, int index, MapObject mapObject) {}

    // Tools
    public static void mapObject6790(Player player, int index, MapObject mapObject) {}

    // Workbench
    public static void mapObject6791(Player player, int index, MapObject mapObject) {}

    // Workbench
    public static void mapObject6792(Player player, int index, MapObject mapObject) {}

    // Workbench
    public static void mapObject6793(Player player, int index, MapObject mapObject) {}

    // Workbench
    public static void mapObject6794(Player player, int index, MapObject mapObject) {}

    // Workbench
    public static void mapObject6795(Player player, int index, MapObject mapObject) {}

    // Clockmaker's bench
    public static void mapObject6796(Player player, int index, MapObject mapObject) {}

    // Clockmaker's bench
    public static void mapObject6797(Player player, int index, MapObject mapObject) {}

    // Clockmaker's bench
    public static void mapObject6798(Player player, int index, MapObject mapObject) {}

    // Clockmaker's bench
    public static void mapObject6799(Player player, int index, MapObject mapObject) {}

    // Repair bench
    public static void mapObject6800(Player player, int index, MapObject mapObject) {}

    // Whetstone
    public static void mapObject6801(Player player, int index, MapObject mapObject) {}

    // Armour repair stand
    public static void mapObject6802(Player player, int index, MapObject mapObject) {}

    // Helmet pluming stand
    public static void mapObject6803(Player player, int index, MapObject mapObject) {}

    // Painting stand
    public static void mapObject6804(Player player, int index, MapObject mapObject) {}

    // Banner making stand
    public static void mapObject6805(Player player, int index, MapObject mapObject) {}

    // Fungus pattern
    public static void mapObject6840(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6841(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject6842(Player player, int index, MapObject mapObject) {}

    // Ogre Coffin
    public static void mapObject6843(Player player, int index, MapObject mapObject) {}

    // Ogre Coffin
    public static void mapObject6844(Player player, int index, MapObject mapObject) {}

    // Ogre Coffin
    public static void mapObject6845(Player player, int index, MapObject mapObject) {}

    // Broken Lecturn
    public static void mapObject6846(Player player, int index, MapObject mapObject) {}

    // Bell
    public static void mapObject6847(Player player, int index, MapObject mapObject) {}

    // Ogre Coffin
    public static void mapObject6848(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject6849(Player player, int index, MapObject mapObject) {}

    // Ogre Coffin
    public static void mapObject6850(Player player, int index, MapObject mapObject) {}

    // Ogre Coffin
    public static void mapObject6853(Player player, int index, MapObject mapObject) {}

    // Ogre stone door
    public static void mapObject6871(Player player, int index, MapObject mapObject) {}

    // Ogre stone door
    public static void mapObject6872(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject6875(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject6876(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject6877(Player player, int index, MapObject mapObject) {}

    // Ogre barricade
    public static void mapObject6878(Player player, int index, MapObject mapObject) {}

    // Ogre barricade
    public static void mapObject6879(Player player, int index, MapObject mapObject) {}

    // Crushed barricade
    public static void mapObject6881(Player player, int index, MapObject mapObject) {}

    // Crushed barricade
    public static void mapObject6882(Player player, int index, MapObject mapObject) {}

    // Ogre Coffin
    public static void mapObject6883(Player player, int index, MapObject mapObject) {}

    // Sithik Ints
    public static void mapObject6887(Player player, int index, MapObject mapObject) {}

    // Sithik Ints
    public static void mapObject6888(Player player, int index, MapObject mapObject) {}

    // Sithik Ints
    public static void mapObject6889(Player player, int index, MapObject mapObject) {}

    // Ogre Coffin
    public static void mapObject6890(Player player, int index, MapObject mapObject) {}

    // Ogre Coffin
    public static void mapObject6891(Player player, int index, MapObject mapObject) {}

    // Ogre Coffin
    public static void mapObject6892(Player player, int index, MapObject mapObject) {}

    // Skeleton
    public static void mapObject6893(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject6894(Player player, int index, MapObject mapObject) {}

    // Stand
    public static void mapObject6897(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject6898(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject6899(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject6905(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject6910(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject6911(Player player, int index, MapObject mapObject) {}

   /* 6912 - 7167 */

    // Hole
    public static void mapObject6912(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject6914(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject6916(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6919(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6920(Player player, int index, MapObject mapObject) {}

    // Symbol
    public static void mapObject6921(Player player, int index, MapObject mapObject) {}

    // Symbol
    public static void mapObject6922(Player player, int index, MapObject mapObject) {}

    // Symbol
    public static void mapObject6923(Player player, int index, MapObject mapObject) {}

    // Symbol
    public static void mapObject6924(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject6943(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject6944(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject6945(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank Deposit Box
    public static void mapObject6948(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Swamp Boaty
    public static void mapObject6969(Player player, int index, MapObject mapObject) {}

    // Swamp Boaty
    public static void mapObject6970(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6975(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6976(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject6977(Player player, int index, MapObject mapObject) {}

    // Train cart
    public static void mapObject7028(Player player, int index, MapObject mapObject) {}

    // Train cart
    public static void mapObject7029(Player player, int index, MapObject mapObject) {}

    // Train cart
    public static void mapObject7030(Player player, int index, MapObject mapObject) {}

    // Seed Stall
    public static void mapObject7053(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7058(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7059(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7060(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7061(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7062(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7063(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7064(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7065(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7066(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7067(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7068(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7069(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7070(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7071(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7072(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7073(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7074(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7075(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7076(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7077(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7078(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7079(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7080(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7081(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7082(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7083(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7084(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7085(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7086(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7087(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7088(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7089(Player player, int index, MapObject mapObject) {}

    // Telescope
    public static void mapObject7092(Player player, int index, MapObject mapObject) {}

    // Clan Cup Trophy
    public static void mapObject7127(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject7141(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject7142(Player player, int index, MapObject mapObject) {}

   /* 7168 - 7423 */

    // Shelf
    public static void mapObject7170(Player player, int index, MapObject mapObject) {}

    // Shelf
    public static void mapObject7171(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject7176(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject7177(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject7178(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject7179(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject7180(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject7181(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject7194(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject7195(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject7219(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject7220(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject7221(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7222(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject7227(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject7228(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject7229(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject7230(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7231(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7232(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7233(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7234(Player player, int index, MapObject mapObject) {}

    // Wall safe
    public static void mapObject7236(Player player, int index, MapObject mapObject) {}

    // Wall safe
    public static void mapObject7237(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject7239(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject7240(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject7245(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7246(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject7249(Player player, int index, MapObject mapObject) {}

    // Contortion Bars
    public static void mapObject7251(Player player, int index, MapObject mapObject) {}

    // Grill
    public static void mapObject7255(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject7256(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject7257(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject7258(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7259(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7260(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7272(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7273(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7274(Player player, int index, MapObject mapObject) {}

    // Fox
    public static void mapObject7275(Player player, int index, MapObject mapObject) {}

    // Fox
    public static void mapObject7276(Player player, int index, MapObject mapObject) {}

    // Fox
    public static void mapObject7277(Player player, int index, MapObject mapObject) {}

    // Fox
    public static void mapObject7278(Player player, int index, MapObject mapObject) {}

    // Chicken
    public static void mapObject7279(Player player, int index, MapObject mapObject) {}

    // Chicken
    public static void mapObject7280(Player player, int index, MapObject mapObject) {}

    // Chicken
    public static void mapObject7281(Player player, int index, MapObject mapObject) {}

    // Grain
    public static void mapObject7282(Player player, int index, MapObject mapObject) {}

    // Grain
    public static void mapObject7283(Player player, int index, MapObject mapObject) {}

    // Grain
    public static void mapObject7284(Player player, int index, MapObject mapObject) {}

    // Empty Sack
    public static void mapObject7285(Player player, int index, MapObject mapObject) {}

    // Precarious bridge
    public static void mapObject7286(Player player, int index, MapObject mapObject) {}

    // Precarious bridge
    public static void mapObject7287(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7288(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7289(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7290(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7291(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7292(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7293(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7294(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7295(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7296(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7297(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7298(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7299(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7300(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7301(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7302(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7303(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7304(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7305(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7306(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7307(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7308(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7309(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7310(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7311(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7312(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7313(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject7314(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7315(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7316(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7317(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7318(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7319(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7320(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7321(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7322(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7323(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7324(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7325(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7326(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7327(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7328(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7329(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject7330(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject7333(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject7334(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject7335(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject7336(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject7337(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject7338(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject7339(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject7340(Player player, int index, MapObject mapObject) {}

    // Stone Door
    public static void mapObject7342(Player player, int index, MapObject mapObject) {}

    // Stone Door
    public static void mapObject7343(Player player, int index, MapObject mapObject) {}

    // Stone Door
    public static void mapObject7344(Player player, int index, MapObject mapObject) {}

    // Open Door
    public static void mapObject7345(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject7347(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject7348(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject7349(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject7350(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject7351(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7352(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7353(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7354(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7373(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject7374(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject7409(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject7410(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bush
    public static void mapObject7411(Player player, int index, MapObject mapObject) {}

    // Stool
    public static void mapObject7412(Player player, int index, MapObject mapObject) {}

    // Stool
    public static void mapObject7413(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject7414(Player player, int index, MapObject mapObject) {}

   /* 7424 - 7679 */

    // Door
    public static void mapObject7426(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // Bookcase
    public static void mapObject7431(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject7442(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject7443(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject7451(Player player, int index, MapObject mapObject) {}

    // Coal Truck
    public static void mapObject7452(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7453(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7454(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7455(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7456(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7457(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7458(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7459(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7460(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7461(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7462(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7463(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7464(Player player, int index, MapObject mapObject) {}

    // Pile of Rock
    public static void mapObject7465(Player player, int index, MapObject mapObject) {}

    // Pile of Rock
    public static void mapObject7466(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7467(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7468(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7469(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7470(Player player, int index, MapObject mapObject) {}

    // Rune Essence
    public static void mapObject7471(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7472(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7473(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7474(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7475(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7476(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject7477(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject7478(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Portal
    public static void mapObject7479(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7484(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7485(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7486(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7487(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7488(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7489(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7490(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7491(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7492(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7493(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7494(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject7495(Player player, int index, MapObject mapObject) {}

    // Stile
    public static void mapObject7527(Player player, int index, MapObject mapObject) {}

    // Belladonna patch
    public static void mapObject7557(Player player, int index, MapObject mapObject) {}

    // Belladonna patch
    public static void mapObject7558(Player player, int index, MapObject mapObject) {}

    // Belladonna patch
    public static void mapObject7559(Player player, int index, MapObject mapObject) {}

    // Belladonna patch
    public static void mapObject7560(Player player, int index, MapObject mapObject) {}

    // Belladonna
    public static void mapObject7561(Player player, int index, MapObject mapObject) {}

    // Belladonna
    public static void mapObject7562(Player player, int index, MapObject mapObject) {}

    // Belladonna
    public static void mapObject7563(Player player, int index, MapObject mapObject) {}

    // Belladonna
    public static void mapObject7564(Player player, int index, MapObject mapObject) {}

    // Belladonna
    public static void mapObject7565(Player player, int index, MapObject mapObject) {}

    // Diseased Belladonna
    public static void mapObject7566(Player player, int index, MapObject mapObject) {}

    // Diseased Belladonna
    public static void mapObject7567(Player player, int index, MapObject mapObject) {}

    // Diseased Belladonna
    public static void mapObject7568(Player player, int index, MapObject mapObject) {}

    // Dead Belladonna
    public static void mapObject7569(Player player, int index, MapObject mapObject) {}

    // Dead Belladonna
    public static void mapObject7570(Player player, int index, MapObject mapObject) {}

    // Dead Belladonna
    public static void mapObject7571(Player player, int index, MapObject mapObject) {}

    // Belladonna patch
    public static void mapObject7572(Player player, int index, MapObject mapObject) {}

    // Bush Patch
    public static void mapObject7573(Player player, int index, MapObject mapObject) {}

    // Bush Patch
    public static void mapObject7574(Player player, int index, MapObject mapObject) {}

    // Bush Patch
    public static void mapObject7575(Player player, int index, MapObject mapObject) {}

    // Bush Patch
    public static void mapObject7576(Player player, int index, MapObject mapObject) {}

    // Bush Patch
    public static void mapObject7577(Player player, int index, MapObject mapObject) {}

    // Bush Patch
    public static void mapObject7578(Player player, int index, MapObject mapObject) {}

    // Bush Patch
    public static void mapObject7579(Player player, int index, MapObject mapObject) {}

    // Bush Patch
    public static void mapObject7580(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7581(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7582(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7583(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7584(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7585(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7586(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7587(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7588(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7589(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7590(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7591(Player player, int index, MapObject mapObject) {}

    // Cadavaberry bush
    public static void mapObject7592(Player player, int index, MapObject mapObject) {}

    // Diseased cadavaberry bush
    public static void mapObject7593(Player player, int index, MapObject mapObject) {}

    // Diseased cadavaberry bush
    public static void mapObject7594(Player player, int index, MapObject mapObject) {}

    // Diseased cadavaberry bush
    public static void mapObject7595(Player player, int index, MapObject mapObject) {}

    // Diseased cadavaberry bush
    public static void mapObject7596(Player player, int index, MapObject mapObject) {}

    // Diseased cadavaberry bush
    public static void mapObject7597(Player player, int index, MapObject mapObject) {}

    // Diseased cadavaberry bush
    public static void mapObject7598(Player player, int index, MapObject mapObject) {}

    // Dead cadavaberry bush
    public static void mapObject7599(Player player, int index, MapObject mapObject) {}

    // Dead cadavaberry bush
    public static void mapObject7600(Player player, int index, MapObject mapObject) {}

    // Dead cadavaberry bush
    public static void mapObject7601(Player player, int index, MapObject mapObject) {}

    // Dead cadavaberry bush
    public static void mapObject7602(Player player, int index, MapObject mapObject) {}

    // Dead cadavaberry bush
    public static void mapObject7603(Player player, int index, MapObject mapObject) {}

    // Dead cadavaberry bush
    public static void mapObject7604(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7605(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7606(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7607(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7608(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7609(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7610(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7611(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7612(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7613(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7614(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7615(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7616(Player player, int index, MapObject mapObject) {}

    // Dwellberry bush
    public static void mapObject7617(Player player, int index, MapObject mapObject) {}

    // Diseased dwellberry bush
    public static void mapObject7618(Player player, int index, MapObject mapObject) {}

    // Diseased dwellberry bush
    public static void mapObject7619(Player player, int index, MapObject mapObject) {}

    // Diseased dwellberry bush
    public static void mapObject7620(Player player, int index, MapObject mapObject) {}

    // Diseased dwellberry bush
    public static void mapObject7621(Player player, int index, MapObject mapObject) {}

    // Diseased dwellberry bush
    public static void mapObject7622(Player player, int index, MapObject mapObject) {}

    // Diseased dwellberry bush
    public static void mapObject7623(Player player, int index, MapObject mapObject) {}

    // Diseased dwellberry bush
    public static void mapObject7624(Player player, int index, MapObject mapObject) {}

    // Dead dwellberry bush
    public static void mapObject7625(Player player, int index, MapObject mapObject) {}

    // Dead dwellberry bush
    public static void mapObject7626(Player player, int index, MapObject mapObject) {}

    // Dead dwellberry bush
    public static void mapObject7627(Player player, int index, MapObject mapObject) {}

    // Dead dwellberry bush
    public static void mapObject7628(Player player, int index, MapObject mapObject) {}

    // Dead dwellberry bush
    public static void mapObject7629(Player player, int index, MapObject mapObject) {}

    // Dead dwellberry bush
    public static void mapObject7630(Player player, int index, MapObject mapObject) {}

    // Dead dwellberry bush
    public static void mapObject7631(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7632(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7633(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7634(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7635(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7636(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7637(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7638(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7639(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7640(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7641(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7642(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7643(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7644(Player player, int index, MapObject mapObject) {}

    // Jangerberry bush
    public static void mapObject7645(Player player, int index, MapObject mapObject) {}

    // Diseased jangerberry bush
    public static void mapObject7646(Player player, int index, MapObject mapObject) {}

    // Diseased jangerberry bush
    public static void mapObject7647(Player player, int index, MapObject mapObject) {}

    // Diseased jangerberry bush
    public static void mapObject7648(Player player, int index, MapObject mapObject) {}

    // Diseased jangerberry bush
    public static void mapObject7649(Player player, int index, MapObject mapObject) {}

    // Diseased jangerberry bush
    public static void mapObject7650(Player player, int index, MapObject mapObject) {}

    // Diseased jangerberry bush
    public static void mapObject7651(Player player, int index, MapObject mapObject) {}

    // Diseased jangerberry bush
    public static void mapObject7652(Player player, int index, MapObject mapObject) {}

    // Diseased jangerberry bush
    public static void mapObject7653(Player player, int index, MapObject mapObject) {}

    // Dead jangerberry bush
    public static void mapObject7654(Player player, int index, MapObject mapObject) {}

    // Dead jangerberry bush
    public static void mapObject7655(Player player, int index, MapObject mapObject) {}

    // Dead jangerberry bush
    public static void mapObject7656(Player player, int index, MapObject mapObject) {}

    // Dead jangerberry bush
    public static void mapObject7657(Player player, int index, MapObject mapObject) {}

    // Dead jangerberry bush
    public static void mapObject7658(Player player, int index, MapObject mapObject) {}

    // Dead jangerberry bush
    public static void mapObject7659(Player player, int index, MapObject mapObject) {}

    // Dead jangerberry bush
    public static void mapObject7660(Player player, int index, MapObject mapObject) {}

    // Dead jangerberry bush
    public static void mapObject7661(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7662(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7663(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7664(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7665(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7666(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7667(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7668(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7669(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7670(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7671(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7672(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7673(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7674(Player player, int index, MapObject mapObject) {}

    // Poison Ivy bush
    public static void mapObject7675(Player player, int index, MapObject mapObject) {}

    // Diseased Poison Ivy bush
    public static void mapObject7676(Player player, int index, MapObject mapObject) {}

    // Diseased Poison Ivy bush
    public static void mapObject7677(Player player, int index, MapObject mapObject) {}

    // Diseased Poison Ivy bush
    public static void mapObject7678(Player player, int index, MapObject mapObject) {}

    // Diseased Poison Ivy bush
    public static void mapObject7679(Player player, int index, MapObject mapObject) {}

   /* 7680 - 7935 */

    // Diseased Poison Ivy bush
    public static void mapObject7680(Player player, int index, MapObject mapObject) {}

    // Diseased Poison Ivy bush
    public static void mapObject7681(Player player, int index, MapObject mapObject) {}

    // Diseased Poison Ivy bush
    public static void mapObject7682(Player player, int index, MapObject mapObject) {}

    // Diseased Poison Ivy bush
    public static void mapObject7683(Player player, int index, MapObject mapObject) {}

    // Dead Poison Ivy bush
    public static void mapObject7684(Player player, int index, MapObject mapObject) {}

    // Dead Poison Ivy bush
    public static void mapObject7685(Player player, int index, MapObject mapObject) {}

    // Dead Poison Ivy bush
    public static void mapObject7686(Player player, int index, MapObject mapObject) {}

    // Dead Poison Ivy bush
    public static void mapObject7687(Player player, int index, MapObject mapObject) {}

    // Dead Poison Ivy bush
    public static void mapObject7688(Player player, int index, MapObject mapObject) {}

    // Dead Poison Ivy bush
    public static void mapObject7689(Player player, int index, MapObject mapObject) {}

    // Dead Poison Ivy bush
    public static void mapObject7690(Player player, int index, MapObject mapObject) {}

    // Dead Poison Ivy bush
    public static void mapObject7691(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject7692(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject7693(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject7694(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject7695(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject7696(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject7697(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject7698(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject7699(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject7700(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject7701(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject7702(Player player, int index, MapObject mapObject) {}

    // Diseased redberry bush
    public static void mapObject7703(Player player, int index, MapObject mapObject) {}

    // Diseased redberry bush
    public static void mapObject7704(Player player, int index, MapObject mapObject) {}

    // Diseased redberry bush
    public static void mapObject7705(Player player, int index, MapObject mapObject) {}

    // Diseased redberry bush
    public static void mapObject7706(Player player, int index, MapObject mapObject) {}

    // Diseased redberry bush
    public static void mapObject7707(Player player, int index, MapObject mapObject) {}

    // Dead redberry bush
    public static void mapObject7708(Player player, int index, MapObject mapObject) {}

    // Dead redberry bush
    public static void mapObject7709(Player player, int index, MapObject mapObject) {}

    // Dead redberry bush
    public static void mapObject7710(Player player, int index, MapObject mapObject) {}

    // Dead redberry bush
    public static void mapObject7711(Player player, int index, MapObject mapObject) {}

    // Dead redberry bush
    public static void mapObject7712(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7713(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7714(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7715(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7716(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7717(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7718(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7719(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7720(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7721(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7722(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7723(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7724(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7725(Player player, int index, MapObject mapObject) {}

    // Whiteberry bush
    public static void mapObject7726(Player player, int index, MapObject mapObject) {}

    // Diseased whiteberry bush
    public static void mapObject7727(Player player, int index, MapObject mapObject) {}

    // Diseased whiteberry bush
    public static void mapObject7728(Player player, int index, MapObject mapObject) {}

    // Diseased whiteberry bush
    public static void mapObject7729(Player player, int index, MapObject mapObject) {}

    // Diseased whiteberry bush
    public static void mapObject7730(Player player, int index, MapObject mapObject) {}

    // Diseased whiteberry bush
    public static void mapObject7731(Player player, int index, MapObject mapObject) {}

    // Diseased whiteberry bush
    public static void mapObject7732(Player player, int index, MapObject mapObject) {}

    // Diseased whiteberry bush
    public static void mapObject7733(Player player, int index, MapObject mapObject) {}

    // Diseased whiteberry bush
    public static void mapObject7734(Player player, int index, MapObject mapObject) {}

    // Dead whiteberry bush
    public static void mapObject7735(Player player, int index, MapObject mapObject) {}

    // Dead whiteberry bush
    public static void mapObject7736(Player player, int index, MapObject mapObject) {}

    // Dead whiteberry bush
    public static void mapObject7737(Player player, int index, MapObject mapObject) {}

    // Dead whiteberry bush
    public static void mapObject7738(Player player, int index, MapObject mapObject) {}

    // Dead whiteberry bush
    public static void mapObject7739(Player player, int index, MapObject mapObject) {}

    // Dead whiteberry bush
    public static void mapObject7740(Player player, int index, MapObject mapObject) {}

    // Dead whiteberry bush
    public static void mapObject7741(Player player, int index, MapObject mapObject) {}

    // Dead whiteberry bush
    public static void mapObject7742(Player player, int index, MapObject mapObject) {}

    // Cactus patch
    public static void mapObject7743(Player player, int index, MapObject mapObject) {}

    // Cactus patch
    public static void mapObject7744(Player player, int index, MapObject mapObject) {}

    // Cactus patch
    public static void mapObject7745(Player player, int index, MapObject mapObject) {}

    // Cactus patch
    public static void mapObject7746(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7747(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7748(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7749(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7750(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7751(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7752(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7753(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7754(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7755(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7756(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7757(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject7758(Player player, int index, MapObject mapObject) {}

    // Diseased cactus
    public static void mapObject7759(Player player, int index, MapObject mapObject) {}

    // Diseased cactus
    public static void mapObject7760(Player player, int index, MapObject mapObject) {}

    // Diseased cactus
    public static void mapObject7761(Player player, int index, MapObject mapObject) {}

    // Diseased cactus
    public static void mapObject7762(Player player, int index, MapObject mapObject) {}

    // Diseased cactus
    public static void mapObject7763(Player player, int index, MapObject mapObject) {}

    // Diseased cactus
    public static void mapObject7764(Player player, int index, MapObject mapObject) {}

    // Dead cactus
    public static void mapObject7765(Player player, int index, MapObject mapObject) {}

    // Dead cactus
    public static void mapObject7766(Player player, int index, MapObject mapObject) {}

    // Dead cactus
    public static void mapObject7767(Player player, int index, MapObject mapObject) {}

    // Dead cactus
    public static void mapObject7768(Player player, int index, MapObject mapObject) {}

    // Dead cactus
    public static void mapObject7769(Player player, int index, MapObject mapObject) {}

    // Dead cactus
    public static void mapObject7770(Player player, int index, MapObject mapObject) {}

    // Cactus patch
    public static void mapObject7771(Player player, int index, MapObject mapObject) {}

    // Calquat patch
    public static void mapObject7772(Player player, int index, MapObject mapObject) {}

    // Calquat patch
    public static void mapObject7773(Player player, int index, MapObject mapObject) {}

    // Calquat patch
    public static void mapObject7774(Player player, int index, MapObject mapObject) {}

    // Calquat patch
    public static void mapObject7775(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7776(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7777(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7778(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7779(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7780(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7781(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7782(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7783(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7784(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7785(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7786(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7787(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7788(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7789(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7790(Player player, int index, MapObject mapObject) {}

    // Calquat Tree
    public static void mapObject7791(Player player, int index, MapObject mapObject) {}

    // Diseased Calquat
    public static void mapObject7792(Player player, int index, MapObject mapObject) {}

    // Diseased Calquat
    public static void mapObject7793(Player player, int index, MapObject mapObject) {}

    // Diseased Calquat
    public static void mapObject7794(Player player, int index, MapObject mapObject) {}

    // Diseased Calquat
    public static void mapObject7795(Player player, int index, MapObject mapObject) {}

    // Diseased Calquat
    public static void mapObject7796(Player player, int index, MapObject mapObject) {}

    // Diseased Calquat
    public static void mapObject7797(Player player, int index, MapObject mapObject) {}

    // Diseased Calquat
    public static void mapObject7798(Player player, int index, MapObject mapObject) {}

    // Dead Calquat
    public static void mapObject7799(Player player, int index, MapObject mapObject) {}

    // Dead Calquat
    public static void mapObject7800(Player player, int index, MapObject mapObject) {}

    // Dead Calquat
    public static void mapObject7801(Player player, int index, MapObject mapObject) {}

    // Dead Calquat
    public static void mapObject7802(Player player, int index, MapObject mapObject) {}

    // Dead Calquat
    public static void mapObject7803(Player player, int index, MapObject mapObject) {}

    // Dead Calquat
    public static void mapObject7804(Player player, int index, MapObject mapObject) {}

    // Dead Calquat
    public static void mapObject7805(Player player, int index, MapObject mapObject) {}

    // Dead Calquat
    public static void mapObject7806(Player player, int index, MapObject mapObject) {}

    // Calquat patch
    public static void mapObject7807(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject7810(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Tournament supplies
    public static void mapObject7811(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject7812(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject7813(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject7814(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject7819(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject7820(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject7836(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject7837(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject7838(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject7839(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject7840(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject7841(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject7842(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject7843(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject7844(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject7845(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject7846(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject7847(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject7848(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject7849(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject7850(Player player, int index, MapObject mapObject) {}

    // Limpwurt plant
    public static void mapObject7851(Player player, int index, MapObject mapObject) {}

    // Limpwurt plant
    public static void mapObject7852(Player player, int index, MapObject mapObject) {}

    // Limpwurt plant
    public static void mapObject7853(Player player, int index, MapObject mapObject) {}

    // Limpwurt plant
    public static void mapObject7854(Player player, int index, MapObject mapObject) {}

    // Limpwurt plant
    public static void mapObject7855(Player player, int index, MapObject mapObject) {}

    // Limpwurt plant
    public static void mapObject7856(Player player, int index, MapObject mapObject) {}

    // Limpwurt plant
    public static void mapObject7857(Player player, int index, MapObject mapObject) {}

    // Limpwurt plant
    public static void mapObject7858(Player player, int index, MapObject mapObject) {}

    // Limpwurt plant
    public static void mapObject7859(Player player, int index, MapObject mapObject) {}

    // Diseased limpwurt plant
    public static void mapObject7860(Player player, int index, MapObject mapObject) {}

    // Diseased limpwurt plant
    public static void mapObject7861(Player player, int index, MapObject mapObject) {}

    // Diseased limpwurt plant
    public static void mapObject7862(Player player, int index, MapObject mapObject) {}

    // Dead limpwurt plant
    public static void mapObject7863(Player player, int index, MapObject mapObject) {}

    // Dead limpwurt plant
    public static void mapObject7864(Player player, int index, MapObject mapObject) {}

    // Dead limpwurt plant
    public static void mapObject7865(Player player, int index, MapObject mapObject) {}

    // Dead limpwurt plant
    public static void mapObject7866(Player player, int index, MapObject mapObject) {}

    // Marigold
    public static void mapObject7867(Player player, int index, MapObject mapObject) {}

    // Marigold
    public static void mapObject7868(Player player, int index, MapObject mapObject) {}

    // Marigold
    public static void mapObject7869(Player player, int index, MapObject mapObject) {}

    // Marigold
    public static void mapObject7870(Player player, int index, MapObject mapObject) {}

    // Marigold
    public static void mapObject7871(Player player, int index, MapObject mapObject) {}

    // Marigold
    public static void mapObject7872(Player player, int index, MapObject mapObject) {}

    // Marigold
    public static void mapObject7873(Player player, int index, MapObject mapObject) {}

    // Marigold
    public static void mapObject7874(Player player, int index, MapObject mapObject) {}

    // Marigold
    public static void mapObject7875(Player player, int index, MapObject mapObject) {}

    // Diseased marigold
    public static void mapObject7876(Player player, int index, MapObject mapObject) {}

    // Diseased marigold
    public static void mapObject7877(Player player, int index, MapObject mapObject) {}

    // Diseased marigold
    public static void mapObject7878(Player player, int index, MapObject mapObject) {}

    // Dead marigold
    public static void mapObject7879(Player player, int index, MapObject mapObject) {}

    // Dead marigold
    public static void mapObject7880(Player player, int index, MapObject mapObject) {}

    // Dead marigold
    public static void mapObject7881(Player player, int index, MapObject mapObject) {}

    // Dead marigold
    public static void mapObject7882(Player player, int index, MapObject mapObject) {}

    // Nasturtium
    public static void mapObject7883(Player player, int index, MapObject mapObject) {}

    // Nasturtium
    public static void mapObject7884(Player player, int index, MapObject mapObject) {}

    // Nasturtium
    public static void mapObject7885(Player player, int index, MapObject mapObject) {}

    // Nasturtium
    public static void mapObject7886(Player player, int index, MapObject mapObject) {}

    // Nasturtium
    public static void mapObject7887(Player player, int index, MapObject mapObject) {}

    // Nasturtium
    public static void mapObject7888(Player player, int index, MapObject mapObject) {}

    // Nasturtium
    public static void mapObject7889(Player player, int index, MapObject mapObject) {}

    // Nasturtium
    public static void mapObject7890(Player player, int index, MapObject mapObject) {}

    // Nasturtium
    public static void mapObject7891(Player player, int index, MapObject mapObject) {}

    // Diseased nasturtium
    public static void mapObject7892(Player player, int index, MapObject mapObject) {}

    // Diseased nasturtium
    public static void mapObject7893(Player player, int index, MapObject mapObject) {}

    // Diseased nasturtium
    public static void mapObject7894(Player player, int index, MapObject mapObject) {}

    // Dead nasturtium
    public static void mapObject7895(Player player, int index, MapObject mapObject) {}

    // Dead nasturtium
    public static void mapObject7896(Player player, int index, MapObject mapObject) {}

    // Dead nasturtium
    public static void mapObject7897(Player player, int index, MapObject mapObject) {}

    // Dead nasturtium
    public static void mapObject7898(Player player, int index, MapObject mapObject) {}

    // Rosemary
    public static void mapObject7899(Player player, int index, MapObject mapObject) {}

    // Rosemary
    public static void mapObject7900(Player player, int index, MapObject mapObject) {}

    // Rosemary
    public static void mapObject7901(Player player, int index, MapObject mapObject) {}

    // Rosemary
    public static void mapObject7902(Player player, int index, MapObject mapObject) {}

    // Rosemary
    public static void mapObject7903(Player player, int index, MapObject mapObject) {}

    // Rosemary
    public static void mapObject7904(Player player, int index, MapObject mapObject) {}

    // Rosemary
    public static void mapObject7905(Player player, int index, MapObject mapObject) {}

    // Rosemary
    public static void mapObject7906(Player player, int index, MapObject mapObject) {}

    // Rosemary
    public static void mapObject7907(Player player, int index, MapObject mapObject) {}

    // Diseased rosemary
    public static void mapObject7908(Player player, int index, MapObject mapObject) {}

    // Diseased rosemary
    public static void mapObject7909(Player player, int index, MapObject mapObject) {}

    // Diseased rosemary
    public static void mapObject7910(Player player, int index, MapObject mapObject) {}

    // Dead rosemary
    public static void mapObject7911(Player player, int index, MapObject mapObject) {}

    // Dead rosemary
    public static void mapObject7912(Player player, int index, MapObject mapObject) {}

    // Dead rosemary
    public static void mapObject7913(Player player, int index, MapObject mapObject) {}

    // Dead rosemary
    public static void mapObject7914(Player player, int index, MapObject mapObject) {}

    // Scarecrow
    public static void mapObject7915(Player player, int index, MapObject mapObject) {}

    // Scarecrow
    public static void mapObject7916(Player player, int index, MapObject mapObject) {}

    // Scarecrow
    public static void mapObject7917(Player player, int index, MapObject mapObject) {}

    // Scarecrow
    public static void mapObject7918(Player player, int index, MapObject mapObject) {}

    // Woad plant
    public static void mapObject7919(Player player, int index, MapObject mapObject) {}

    // Woad plant
    public static void mapObject7920(Player player, int index, MapObject mapObject) {}

    // Woad plant
    public static void mapObject7921(Player player, int index, MapObject mapObject) {}

    // Woad plant
    public static void mapObject7922(Player player, int index, MapObject mapObject) {}

    // Woad plant
    public static void mapObject7923(Player player, int index, MapObject mapObject) {}

    // Woad plant
    public static void mapObject7924(Player player, int index, MapObject mapObject) {}

    // Woad plant
    public static void mapObject7925(Player player, int index, MapObject mapObject) {}

    // Woad plant
    public static void mapObject7926(Player player, int index, MapObject mapObject) {}

    // Woad plant
    public static void mapObject7927(Player player, int index, MapObject mapObject) {}

    // Diseased woad plant
    public static void mapObject7928(Player player, int index, MapObject mapObject) {}

    // Diseased woad plant
    public static void mapObject7929(Player player, int index, MapObject mapObject) {}

    // Diseased woad plant
    public static void mapObject7930(Player player, int index, MapObject mapObject) {}

    // Dead woad plant
    public static void mapObject7931(Player player, int index, MapObject mapObject) {}

    // Dead woad plant
    public static void mapObject7932(Player player, int index, MapObject mapObject) {}

    // Dead woad plant
    public static void mapObject7933(Player player, int index, MapObject mapObject) {}

    // Dead woad plant
    public static void mapObject7934(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7935(Player player, int index, MapObject mapObject) {}

   /* 7936 - 8191 */

    // Apple tree
    public static void mapObject7936(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7937(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7938(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7939(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7940(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7941(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7942(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7943(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7944(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7945(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7946(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7947(Player player, int index, MapObject mapObject) {}

    // Apple tree
    public static void mapObject7948(Player player, int index, MapObject mapObject) {}

    // Diseased apple tree
    public static void mapObject7949(Player player, int index, MapObject mapObject) {}

    // Diseased apple tree
    public static void mapObject7950(Player player, int index, MapObject mapObject) {}

    // Diseased apple tree
    public static void mapObject7951(Player player, int index, MapObject mapObject) {}

    // Diseased apple tree
    public static void mapObject7952(Player player, int index, MapObject mapObject) {}

    // Diseased apple tree
    public static void mapObject7953(Player player, int index, MapObject mapObject) {}

    // Diseased apple tree
    public static void mapObject7954(Player player, int index, MapObject mapObject) {}

    // Dead apple tree
    public static void mapObject7955(Player player, int index, MapObject mapObject) {}

    // Dead apple tree
    public static void mapObject7956(Player player, int index, MapObject mapObject) {}

    // Dead apple tree
    public static void mapObject7957(Player player, int index, MapObject mapObject) {}

    // Dead apple tree
    public static void mapObject7958(Player player, int index, MapObject mapObject) {}

    // Dead apple tree
    public static void mapObject7959(Player player, int index, MapObject mapObject) {}

    // Dead apple tree
    public static void mapObject7960(Player player, int index, MapObject mapObject) {}

    // Apple tree stump
    public static void mapObject7961(Player player, int index, MapObject mapObject) {}

    // Fruit Tree Patch
    public static void mapObject7962(Player player, int index, MapObject mapObject) {}

    // Fruit Tree Patch
    public static void mapObject7963(Player player, int index, MapObject mapObject) {}

    // Fruit Tree Patch
    public static void mapObject7964(Player player, int index, MapObject mapObject) {}

    // Fruit Tree Patch
    public static void mapObject7965(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7966(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7967(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7968(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7969(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7970(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7971(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7972(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7973(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7974(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7975(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7976(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7977(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7978(Player player, int index, MapObject mapObject) {}

    // Pineapple plant
    public static void mapObject7979(Player player, int index, MapObject mapObject) {}

    // Diseased pineapple plant
    public static void mapObject7980(Player player, int index, MapObject mapObject) {}

    // Diseased pineapple plant
    public static void mapObject7981(Player player, int index, MapObject mapObject) {}

    // Diseased pineapple plant
    public static void mapObject7982(Player player, int index, MapObject mapObject) {}

    // Diseased pineapple plant
    public static void mapObject7983(Player player, int index, MapObject mapObject) {}

    // Diseased pineapple plant
    public static void mapObject7984(Player player, int index, MapObject mapObject) {}

    // Diseased pineapple plant
    public static void mapObject7985(Player player, int index, MapObject mapObject) {}

    // Dead pineapple plant
    public static void mapObject7986(Player player, int index, MapObject mapObject) {}

    // Dead pineapple plant
    public static void mapObject7987(Player player, int index, MapObject mapObject) {}

    // Dead pineapple plant
    public static void mapObject7988(Player player, int index, MapObject mapObject) {}

    // Dead pineapple plant
    public static void mapObject7989(Player player, int index, MapObject mapObject) {}

    // Dead pineapple plant
    public static void mapObject7990(Player player, int index, MapObject mapObject) {}

    // Dead pineapple plant
    public static void mapObject7991(Player player, int index, MapObject mapObject) {}

    // Pineapple plant stump
    public static void mapObject7992(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject7993(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject7994(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject7995(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject7996(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject7997(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject7998(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject7999(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject8000(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject8001(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject8002(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject8003(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject8004(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject8005(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject8006(Player player, int index, MapObject mapObject) {}

    // Diseased banana tree
    public static void mapObject8007(Player player, int index, MapObject mapObject) {}

    // Diseased banana tree
    public static void mapObject8008(Player player, int index, MapObject mapObject) {}

    // Diseased banana tree
    public static void mapObject8009(Player player, int index, MapObject mapObject) {}

    // Diseased banana tree
    public static void mapObject8010(Player player, int index, MapObject mapObject) {}

    // Diseased banana tree
    public static void mapObject8011(Player player, int index, MapObject mapObject) {}

    // Diseased banana tree
    public static void mapObject8012(Player player, int index, MapObject mapObject) {}

    // Dead banana tree
    public static void mapObject8013(Player player, int index, MapObject mapObject) {}

    // Dead banana tree
    public static void mapObject8014(Player player, int index, MapObject mapObject) {}

    // Dead banana tree
    public static void mapObject8015(Player player, int index, MapObject mapObject) {}

    // Dead banana tree
    public static void mapObject8016(Player player, int index, MapObject mapObject) {}

    // Dead banana tree
    public static void mapObject8017(Player player, int index, MapObject mapObject) {}

    // Dead banana tree
    public static void mapObject8018(Player player, int index, MapObject mapObject) {}

    // Banana tree stump
    public static void mapObject8019(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8020(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8021(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8022(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8023(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8024(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8025(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8026(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8027(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8028(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8029(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8030(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8031(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8032(Player player, int index, MapObject mapObject) {}

    // Curry tree
    public static void mapObject8033(Player player, int index, MapObject mapObject) {}

    // Diseased curry tree
    public static void mapObject8034(Player player, int index, MapObject mapObject) {}

    // Diseased curry tree
    public static void mapObject8035(Player player, int index, MapObject mapObject) {}

    // Diseased curry tree
    public static void mapObject8036(Player player, int index, MapObject mapObject) {}

    // Diseased curry tree
    public static void mapObject8037(Player player, int index, MapObject mapObject) {}

    // Diseased curry tree
    public static void mapObject8038(Player player, int index, MapObject mapObject) {}

    // Diseased curry tree
    public static void mapObject8039(Player player, int index, MapObject mapObject) {}

    // Dead curry tree
    public static void mapObject8040(Player player, int index, MapObject mapObject) {}

    // Dead curry tree
    public static void mapObject8041(Player player, int index, MapObject mapObject) {}

    // Dead curry tree
    public static void mapObject8042(Player player, int index, MapObject mapObject) {}

    // Dead curry tree
    public static void mapObject8043(Player player, int index, MapObject mapObject) {}

    // Dead curry tree
    public static void mapObject8044(Player player, int index, MapObject mapObject) {}

    // Dead curry tree
    public static void mapObject8045(Player player, int index, MapObject mapObject) {}

    // Curry tree stump
    public static void mapObject8046(Player player, int index, MapObject mapObject) {}

    // Fruit Tree Patch
    public static void mapObject8047(Player player, int index, MapObject mapObject) {}

    // Fruit Tree Patch
    public static void mapObject8048(Player player, int index, MapObject mapObject) {}

    // Fruit Tree Patch
    public static void mapObject8049(Player player, int index, MapObject mapObject) {}

    // Fruit Tree Patch
    public static void mapObject8050(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8051(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8052(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8053(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8054(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8055(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8056(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8057(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8058(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8059(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8060(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8061(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8062(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8063(Player player, int index, MapObject mapObject) {}

    // Orange tree
    public static void mapObject8064(Player player, int index, MapObject mapObject) {}

    // Diseased orange tree
    public static void mapObject8065(Player player, int index, MapObject mapObject) {}

    // Diseased orange tree
    public static void mapObject8066(Player player, int index, MapObject mapObject) {}

    // Diseased orange tree
    public static void mapObject8067(Player player, int index, MapObject mapObject) {}

    // Diseased orange tree
    public static void mapObject8068(Player player, int index, MapObject mapObject) {}

    // Diseased orange tree
    public static void mapObject8069(Player player, int index, MapObject mapObject) {}

    // Diseased orange tree
    public static void mapObject8070(Player player, int index, MapObject mapObject) {}

    // Dead orange tree
    public static void mapObject8071(Player player, int index, MapObject mapObject) {}

    // Dead orange tree
    public static void mapObject8072(Player player, int index, MapObject mapObject) {}

    // Dead orange tree
    public static void mapObject8073(Player player, int index, MapObject mapObject) {}

    // Dead orange tree
    public static void mapObject8074(Player player, int index, MapObject mapObject) {}

    // Dead orange tree
    public static void mapObject8075(Player player, int index, MapObject mapObject) {}

    // Dead orange tree
    public static void mapObject8076(Player player, int index, MapObject mapObject) {}

    // Orange tree stump
    public static void mapObject8077(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8078(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8079(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8080(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8081(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8082(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8083(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8084(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8085(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8086(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8087(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8088(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8089(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8090(Player player, int index, MapObject mapObject) {}

    // Palm tree
    public static void mapObject8091(Player player, int index, MapObject mapObject) {}

    // Diseased palm tree
    public static void mapObject8092(Player player, int index, MapObject mapObject) {}

    // Diseased palm tree
    public static void mapObject8093(Player player, int index, MapObject mapObject) {}

    // Diseased palm tree
    public static void mapObject8094(Player player, int index, MapObject mapObject) {}

    // Diseased palm tree
    public static void mapObject8095(Player player, int index, MapObject mapObject) {}

    // Diseased palm tree
    public static void mapObject8096(Player player, int index, MapObject mapObject) {}

    // Diseased palm tree
    public static void mapObject8097(Player player, int index, MapObject mapObject) {}

    // Dead palm tree
    public static void mapObject8098(Player player, int index, MapObject mapObject) {}

    // Dead palm tree
    public static void mapObject8099(Player player, int index, MapObject mapObject) {}

    // Dead palm tree
    public static void mapObject8100(Player player, int index, MapObject mapObject) {}

    // Dead palm tree
    public static void mapObject8101(Player player, int index, MapObject mapObject) {}

    // Dead palm tree
    public static void mapObject8102(Player player, int index, MapObject mapObject) {}

    // Dead palm tree
    public static void mapObject8103(Player player, int index, MapObject mapObject) {}

    // Palm tree stump
    public static void mapObject8104(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8105(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8106(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8107(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8108(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8109(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8110(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8111(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8112(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8113(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8114(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8115(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8116(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8117(Player player, int index, MapObject mapObject) {}

    // Papaya tree
    public static void mapObject8118(Player player, int index, MapObject mapObject) {}

    // Diseased papaya tree
    public static void mapObject8119(Player player, int index, MapObject mapObject) {}

    // Diseased papaya tree
    public static void mapObject8120(Player player, int index, MapObject mapObject) {}

    // Diseased papaya tree
    public static void mapObject8121(Player player, int index, MapObject mapObject) {}

    // Diseased papaya tree
    public static void mapObject8122(Player player, int index, MapObject mapObject) {}

    // Diseased papaya tree
    public static void mapObject8123(Player player, int index, MapObject mapObject) {}

    // Diseased papaya tree
    public static void mapObject8124(Player player, int index, MapObject mapObject) {}

    // Dead papaya tree
    public static void mapObject8125(Player player, int index, MapObject mapObject) {}

    // Dead papaya tree
    public static void mapObject8126(Player player, int index, MapObject mapObject) {}

    // Dead papaya tree
    public static void mapObject8127(Player player, int index, MapObject mapObject) {}

    // Dead papaya tree
    public static void mapObject8128(Player player, int index, MapObject mapObject) {}

    // Dead papaya tree
    public static void mapObject8129(Player player, int index, MapObject mapObject) {}

    // Dead papaya tree
    public static void mapObject8130(Player player, int index, MapObject mapObject) {}

    // Papaya tree stump
    public static void mapObject8131(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject8132(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject8133(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject8134(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject8135(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject8136(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject8137(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject8138(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject8139(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject8140(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject8141(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject8142(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject8143(Player player, int index, MapObject mapObject) {}

    // Diseased herbs
    public static void mapObject8144(Player player, int index, MapObject mapObject) {}

    // Diseased herbs
    public static void mapObject8145(Player player, int index, MapObject mapObject) {}

    // Diseased herbs
    public static void mapObject8146(Player player, int index, MapObject mapObject) {}

    // Dead herbs
    public static void mapObject8147(Player player, int index, MapObject mapObject) {}

    // Dead herbs
    public static void mapObject8148(Player player, int index, MapObject mapObject) {}

    // Dead herbs
    public static void mapObject8149(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject8150(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject8151(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject8152(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject8153(Player player, int index, MapObject mapObject) {}

    // Asgarnian Hops
    public static void mapObject8154(Player player, int index, MapObject mapObject) {}

    // Asgarnian Hops
    public static void mapObject8155(Player player, int index, MapObject mapObject) {}

    // Asgarnian Hops
    public static void mapObject8156(Player player, int index, MapObject mapObject) {}

    // Asgarnian Hops
    public static void mapObject8157(Player player, int index, MapObject mapObject) {}

    // Asgarnian Hops
    public static void mapObject8158(Player player, int index, MapObject mapObject) {}

    // Asgarnian Hops
    public static void mapObject8159(Player player, int index, MapObject mapObject) {}

    // Asgarnian Hops
    public static void mapObject8160(Player player, int index, MapObject mapObject) {}

    // Asgarnian Hops
    public static void mapObject8161(Player player, int index, MapObject mapObject) {}

    // Asgarnian Hops
    public static void mapObject8162(Player player, int index, MapObject mapObject) {}

    // Asgarnian Hops
    public static void mapObject8163(Player player, int index, MapObject mapObject) {}

    // Asgarnian Hops
    public static void mapObject8164(Player player, int index, MapObject mapObject) {}

    // Diseased Asgarnian Hops
    public static void mapObject8165(Player player, int index, MapObject mapObject) {}

    // Diseased Asgarnian Hops
    public static void mapObject8166(Player player, int index, MapObject mapObject) {}

    // Diseased Asgarnian Hops
    public static void mapObject8167(Player player, int index, MapObject mapObject) {}

    // Diseased Asgarnian Hops
    public static void mapObject8168(Player player, int index, MapObject mapObject) {}

    // Dead Asgarnian Hops
    public static void mapObject8169(Player player, int index, MapObject mapObject) {}

    // Dead Asgarnian Hops
    public static void mapObject8170(Player player, int index, MapObject mapObject) {}

    // Dead Asgarnian Hops
    public static void mapObject8171(Player player, int index, MapObject mapObject) {}

    // Dead Asgarnian Hops
    public static void mapObject8172(Player player, int index, MapObject mapObject) {}

    // Hops Patch
    public static void mapObject8173(Player player, int index, MapObject mapObject) {}

    // Hops Patch
    public static void mapObject8174(Player player, int index, MapObject mapObject) {}

    // Hops Patch
    public static void mapObject8175(Player player, int index, MapObject mapObject) {}

    // Hops Patch
    public static void mapObject8176(Player player, int index, MapObject mapObject) {}

    // Hammerstone Hops
    public static void mapObject8177(Player player, int index, MapObject mapObject) {}

    // Hammerstone Hops
    public static void mapObject8178(Player player, int index, MapObject mapObject) {}

    // Hammerstone Hops
    public static void mapObject8179(Player player, int index, MapObject mapObject) {}

    // Hammerstone Hops
    public static void mapObject8180(Player player, int index, MapObject mapObject) {}

    // Hammerstone Hops
    public static void mapObject8181(Player player, int index, MapObject mapObject) {}

    // Hammerstone Hops
    public static void mapObject8182(Player player, int index, MapObject mapObject) {}

    // Hammerstone Hops
    public static void mapObject8183(Player player, int index, MapObject mapObject) {}

    // Hammerstone Hops
    public static void mapObject8184(Player player, int index, MapObject mapObject) {}

    // Hammerstone Hops
    public static void mapObject8185(Player player, int index, MapObject mapObject) {}

    // Diseased Hammerstone Hops
    public static void mapObject8186(Player player, int index, MapObject mapObject) {}

    // Diseased Hammerstone Hops
    public static void mapObject8187(Player player, int index, MapObject mapObject) {}

    // Diseased Hammerstone Hops
    public static void mapObject8188(Player player, int index, MapObject mapObject) {}

    // Dead Hammerstone Hops
    public static void mapObject8189(Player player, int index, MapObject mapObject) {}

    // Dead Hammerstone Hops
    public static void mapObject8190(Player player, int index, MapObject mapObject) {}

    // Dead Hammerstone Hops
    public static void mapObject8191(Player player, int index, MapObject mapObject) {}

   /* 8192 - 8447 */

    // Barley
    public static void mapObject8192(Player player, int index, MapObject mapObject) {}

    // Barley
    public static void mapObject8193(Player player, int index, MapObject mapObject) {}

    // Barley
    public static void mapObject8194(Player player, int index, MapObject mapObject) {}

    // Barley
    public static void mapObject8195(Player player, int index, MapObject mapObject) {}

    // Barley
    public static void mapObject8196(Player player, int index, MapObject mapObject) {}

    // Barley
    public static void mapObject8197(Player player, int index, MapObject mapObject) {}

    // Barley
    public static void mapObject8198(Player player, int index, MapObject mapObject) {}

    // Barley
    public static void mapObject8199(Player player, int index, MapObject mapObject) {}

    // Barley
    public static void mapObject8200(Player player, int index, MapObject mapObject) {}

    // Diseased Barley
    public static void mapObject8201(Player player, int index, MapObject mapObject) {}

    // Diseased Barley
    public static void mapObject8202(Player player, int index, MapObject mapObject) {}

    // Diseased Barley
    public static void mapObject8203(Player player, int index, MapObject mapObject) {}

    // Dead Barley
    public static void mapObject8204(Player player, int index, MapObject mapObject) {}

    // Dead Barley
    public static void mapObject8205(Player player, int index, MapObject mapObject) {}

    // Dead Barley
    public static void mapObject8206(Player player, int index, MapObject mapObject) {}

    // Hops Patch
    public static void mapObject8207(Player player, int index, MapObject mapObject) {}

    // Hops Patch
    public static void mapObject8208(Player player, int index, MapObject mapObject) {}

    // Hops Patch
    public static void mapObject8209(Player player, int index, MapObject mapObject) {}

    // Hops Patch
    public static void mapObject8210(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8211(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8212(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8213(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8214(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8215(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8216(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8217(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8218(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8219(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8220(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8221(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8222(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8223(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8224(Player player, int index, MapObject mapObject) {}

    // Krandorian Hops
    public static void mapObject8225(Player player, int index, MapObject mapObject) {}

    // Diseased Krandorian Hops
    public static void mapObject8226(Player player, int index, MapObject mapObject) {}

    // Diseased Krandorian Hops
    public static void mapObject8227(Player player, int index, MapObject mapObject) {}

    // Diseased Krandorian Hops
    public static void mapObject8228(Player player, int index, MapObject mapObject) {}

    // Diseased Krandorian Hops
    public static void mapObject8229(Player player, int index, MapObject mapObject) {}

    // Diseased Krandorian Hops
    public static void mapObject8230(Player player, int index, MapObject mapObject) {}

    // Diseased Krandorian Hops
    public static void mapObject8231(Player player, int index, MapObject mapObject) {}

    // Dead Krandorian Hops
    public static void mapObject8232(Player player, int index, MapObject mapObject) {}

    // Dead Krandorian Hops
    public static void mapObject8233(Player player, int index, MapObject mapObject) {}

    // Dead Krandorian Hops
    public static void mapObject8234(Player player, int index, MapObject mapObject) {}

    // Dead Krandorian Hops
    public static void mapObject8235(Player player, int index, MapObject mapObject) {}

    // Dead Krandorian Hops
    public static void mapObject8236(Player player, int index, MapObject mapObject) {}

    // Dead Krandorian Hops
    public static void mapObject8237(Player player, int index, MapObject mapObject) {}

    // Jute
    public static void mapObject8238(Player player, int index, MapObject mapObject) {}

    // Jute
    public static void mapObject8239(Player player, int index, MapObject mapObject) {}

    // Jute
    public static void mapObject8240(Player player, int index, MapObject mapObject) {}

    // Jute
    public static void mapObject8241(Player player, int index, MapObject mapObject) {}

    // Jute
    public static void mapObject8242(Player player, int index, MapObject mapObject) {}

    // Jute
    public static void mapObject8243(Player player, int index, MapObject mapObject) {}

    // Jute
    public static void mapObject8244(Player player, int index, MapObject mapObject) {}

    // Jute
    public static void mapObject8245(Player player, int index, MapObject mapObject) {}

    // Jute
    public static void mapObject8246(Player player, int index, MapObject mapObject) {}

    // Jute
    public static void mapObject8247(Player player, int index, MapObject mapObject) {}

    // Jute
    public static void mapObject8248(Player player, int index, MapObject mapObject) {}

    // Diseased Jute
    public static void mapObject8249(Player player, int index, MapObject mapObject) {}

    // Diseased Jute
    public static void mapObject8250(Player player, int index, MapObject mapObject) {}

    // Diseased Jute
    public static void mapObject8251(Player player, int index, MapObject mapObject) {}

    // Diseased Jute
    public static void mapObject8252(Player player, int index, MapObject mapObject) {}

    // Dead Jute
    public static void mapObject8253(Player player, int index, MapObject mapObject) {}

    // Dead Jute
    public static void mapObject8254(Player player, int index, MapObject mapObject) {}

    // Dead Jute
    public static void mapObject8255(Player player, int index, MapObject mapObject) {}

    // Dead Jute
    public static void mapObject8256(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8257(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8258(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8259(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8260(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8261(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8262(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8263(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8264(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8265(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8266(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8267(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8268(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8269(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8270(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8271(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8272(Player player, int index, MapObject mapObject) {}

    // Wildblood Hops
    public static void mapObject8273(Player player, int index, MapObject mapObject) {}

    // Diseased Wildblood Hops
    public static void mapObject8274(Player player, int index, MapObject mapObject) {}

    // Diseased Wildblood Hops
    public static void mapObject8275(Player player, int index, MapObject mapObject) {}

    // Diseased Wildblood Hops
    public static void mapObject8276(Player player, int index, MapObject mapObject) {}

    // Diseased Wildblood Hops
    public static void mapObject8277(Player player, int index, MapObject mapObject) {}

    // Diseased Wildblood Hops
    public static void mapObject8278(Player player, int index, MapObject mapObject) {}

    // Diseased Wildblood Hops
    public static void mapObject8279(Player player, int index, MapObject mapObject) {}

    // Diseased Wildblood Hops
    public static void mapObject8280(Player player, int index, MapObject mapObject) {}

    // Dead Wildblood Hops
    public static void mapObject8281(Player player, int index, MapObject mapObject) {}

    // Dead Wildblood Hops
    public static void mapObject8282(Player player, int index, MapObject mapObject) {}

    // Dead Wildblood Hops
    public static void mapObject8283(Player player, int index, MapObject mapObject) {}

    // Dead Wildblood Hops
    public static void mapObject8284(Player player, int index, MapObject mapObject) {}

    // Dead Wildblood Hops
    public static void mapObject8285(Player player, int index, MapObject mapObject) {}

    // Dead Wildblood Hops
    public static void mapObject8286(Player player, int index, MapObject mapObject) {}

    // Dead Wildblood Hops
    public static void mapObject8287(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8288(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8289(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8290(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8291(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8292(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8293(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8294(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8295(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8296(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8297(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8298(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8299(Player player, int index, MapObject mapObject) {}

    // Yanillian Hops
    public static void mapObject8300(Player player, int index, MapObject mapObject) {}

    // Diseased Yanillian Hops
    public static void mapObject8301(Player player, int index, MapObject mapObject) {}

    // Diseased Yanillian Hops
    public static void mapObject8302(Player player, int index, MapObject mapObject) {}

    // Diseased Yanillian Hops
    public static void mapObject8303(Player player, int index, MapObject mapObject) {}

    // Diseased Yanillian Hops
    public static void mapObject8304(Player player, int index, MapObject mapObject) {}

    // Diseased Yanillian Hops
    public static void mapObject8305(Player player, int index, MapObject mapObject) {}

    // Dead Yanillian Hops
    public static void mapObject8306(Player player, int index, MapObject mapObject) {}

    // Dead Yanillian Hops
    public static void mapObject8307(Player player, int index, MapObject mapObject) {}

    // Dead Yanillian Hops
    public static void mapObject8308(Player player, int index, MapObject mapObject) {}

    // Dead Yanillian Hops
    public static void mapObject8309(Player player, int index, MapObject mapObject) {}

    // Dead Yanillian Hops
    public static void mapObject8310(Player player, int index, MapObject mapObject) {}

    // Mushroom patch
    public static void mapObject8311(Player player, int index, MapObject mapObject) {}

    // Mushroom patch
    public static void mapObject8312(Player player, int index, MapObject mapObject) {}

    // Mushroom patch
    public static void mapObject8313(Player player, int index, MapObject mapObject) {}

    // Mushroom patch
    public static void mapObject8314(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8315(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8316(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8317(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8318(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8319(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8320(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8321(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8322(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8323(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8324(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8325(Player player, int index, MapObject mapObject) {}

    // Bittercap Mushrooms
    public static void mapObject8326(Player player, int index, MapObject mapObject) {}

    // Diseased Bittercap Mushrooms
    public static void mapObject8327(Player player, int index, MapObject mapObject) {}

    // Diseased Bittercap Mushrooms
    public static void mapObject8328(Player player, int index, MapObject mapObject) {}

    // Diseased Bittercap Mushrooms
    public static void mapObject8329(Player player, int index, MapObject mapObject) {}

    // Diseased Bittercap Mushrooms
    public static void mapObject8330(Player player, int index, MapObject mapObject) {}

    // Diseased Bittercap Mushrooms
    public static void mapObject8331(Player player, int index, MapObject mapObject) {}

    // Dead Bittercap Mushrooms
    public static void mapObject8332(Player player, int index, MapObject mapObject) {}

    // Dead Bittercap Mushrooms
    public static void mapObject8333(Player player, int index, MapObject mapObject) {}

    // Dead Bittercap Mushrooms
    public static void mapObject8334(Player player, int index, MapObject mapObject) {}

    // Dead Bittercap Mushrooms
    public static void mapObject8335(Player player, int index, MapObject mapObject) {}

    // Dead Bittercap Mushrooms
    public static void mapObject8336(Player player, int index, MapObject mapObject) {}

    // Mushroom patch
    public static void mapObject8337(Player player, int index, MapObject mapObject) {}

    // Spirit Tree Patch
    public static void mapObject8338(Player player, int index, MapObject mapObject) {}

    // Spirit Tree Patch
    public static void mapObject8339(Player player, int index, MapObject mapObject) {}

    // Spirit Tree Patch
    public static void mapObject8340(Player player, int index, MapObject mapObject) {}

    // Spirit Tree Patch
    public static void mapObject8341(Player player, int index, MapObject mapObject) {}

    // Spirit Tree Patch
    public static void mapObject8342(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8343(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8344(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8345(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8346(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8347(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8348(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8349(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8350(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8351(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8352(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8353(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8354(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8355(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject8356(Player player, int index, MapObject mapObject) {}

    // Spirit Tree Stump
    public static void mapObject8357(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8358(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8359(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8360(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8361(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8362(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8363(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8364(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8365(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8366(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8367(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8368(Player player, int index, MapObject mapObject) {}

    // Diseased Spirit Tree
    public static void mapObject8369(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8370(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8371(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8372(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8373(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8374(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8375(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8376(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8377(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8378(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8379(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8380(Player player, int index, MapObject mapObject) {}

    // Dead Spirit Tree
    public static void mapObject8381(Player player, int index, MapObject mapObject) {}

    // Spirit Tree Patch
    public static void mapObject8382(Player player, int index, MapObject mapObject) {}

    // Spirit Tree Patch
    public static void mapObject8383(Player player, int index, MapObject mapObject) {}

    // Tree patch
    public static void mapObject8388(Player player, int index, MapObject mapObject) {}

    // Tree patch
    public static void mapObject8389(Player player, int index, MapObject mapObject) {}

    // Tree patch
    public static void mapObject8390(Player player, int index, MapObject mapObject) {}

    // Tree patch
    public static void mapObject8391(Player player, int index, MapObject mapObject) {}

    // Tree patch
    public static void mapObject8392(Player player, int index, MapObject mapObject) {}

    // Tree patch
    public static void mapObject8393(Player player, int index, MapObject mapObject) {}

    // Tree patch
    public static void mapObject8394(Player player, int index, MapObject mapObject) {}

    // Tree patch
    public static void mapObject8395(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8396(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8397(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8398(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8399(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8400(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8401(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8402(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8403(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8404(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8405(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8406(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8407(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8408(Player player, int index, MapObject mapObject) {}

    // Magic Tree
    public static void mapObject8409(Player player, int index, MapObject mapObject) {}

    // Magic Tree Stump
    public static void mapObject8410(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8411(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8412(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8413(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8414(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8415(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8416(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8417(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8418(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8419(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8420(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8421(Player player, int index, MapObject mapObject) {}

    // Diseased Magic Tree
    public static void mapObject8422(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8423(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8424(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8425(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8426(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8427(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8428(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8429(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8430(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8431(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8432(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8433(Player player, int index, MapObject mapObject) {}

    // Dead Magic Tree
    public static void mapObject8434(Player player, int index, MapObject mapObject) {}

    // Maple Tree
    public static void mapObject8435(Player player, int index, MapObject mapObject) {}

    // Maple Tree
    public static void mapObject8436(Player player, int index, MapObject mapObject) {}

    // Maple Tree
    public static void mapObject8437(Player player, int index, MapObject mapObject) {}

    // Maple Tree
    public static void mapObject8438(Player player, int index, MapObject mapObject) {}

    // Maple Tree
    public static void mapObject8439(Player player, int index, MapObject mapObject) {}

    // Maple Tree
    public static void mapObject8440(Player player, int index, MapObject mapObject) {}

    // Maple Tree
    public static void mapObject8441(Player player, int index, MapObject mapObject) {}

    // Maple Tree
    public static void mapObject8442(Player player, int index, MapObject mapObject) {}

    // Maple Tree
    public static void mapObject8443(Player player, int index, MapObject mapObject) {}

    // Maple Tree
    public static void mapObject8444(Player player, int index, MapObject mapObject) {}

    // Tree stump
    public static void mapObject8445(Player player, int index, MapObject mapObject) {}

    // Diseased Maple
    public static void mapObject8446(Player player, int index, MapObject mapObject) {}

    // Diseased Maple
    public static void mapObject8447(Player player, int index, MapObject mapObject) {}

   /* 8448 - 8703 */

    // Diseased Maple
    public static void mapObject8448(Player player, int index, MapObject mapObject) {}

    // Diseased Maple
    public static void mapObject8449(Player player, int index, MapObject mapObject) {}

    // Diseased Maple
    public static void mapObject8450(Player player, int index, MapObject mapObject) {}

    // Diseased Maple
    public static void mapObject8451(Player player, int index, MapObject mapObject) {}

    // Diseased Maple
    public static void mapObject8452(Player player, int index, MapObject mapObject) {}

    // Diseased Maple
    public static void mapObject8453(Player player, int index, MapObject mapObject) {}

    // Dead Maple
    public static void mapObject8454(Player player, int index, MapObject mapObject) {}

    // Dead Maple
    public static void mapObject8455(Player player, int index, MapObject mapObject) {}

    // Dead Maple
    public static void mapObject8456(Player player, int index, MapObject mapObject) {}

    // Dead Maple
    public static void mapObject8457(Player player, int index, MapObject mapObject) {}

    // Dead Maple
    public static void mapObject8458(Player player, int index, MapObject mapObject) {}

    // Dead Maple
    public static void mapObject8459(Player player, int index, MapObject mapObject) {}

    // Dead Maple
    public static void mapObject8460(Player player, int index, MapObject mapObject) {}

    // Dead Maple
    public static void mapObject8461(Player player, int index, MapObject mapObject) {}

    // Oak
    public static void mapObject8462(Player player, int index, MapObject mapObject) {}

    // Oak
    public static void mapObject8463(Player player, int index, MapObject mapObject) {}

    // Oak
    public static void mapObject8464(Player player, int index, MapObject mapObject) {}

    // Oak
    public static void mapObject8465(Player player, int index, MapObject mapObject) {}

    // Oak
    public static void mapObject8466(Player player, int index, MapObject mapObject) {}

    // Oak
    public static void mapObject8467(Player player, int index, MapObject mapObject) {}

    // Oak tree stump
    public static void mapObject8468(Player player, int index, MapObject mapObject) {}

    // Diseased Oak
    public static void mapObject8473(Player player, int index, MapObject mapObject) {}

    // Diseased Oak
    public static void mapObject8474(Player player, int index, MapObject mapObject) {}

    // Diseased Oak
    public static void mapObject8475(Player player, int index, MapObject mapObject) {}

    // Diseased Oak
    public static void mapObject8476(Player player, int index, MapObject mapObject) {}

    // Dead Oak
    public static void mapObject8477(Player player, int index, MapObject mapObject) {}

    // Dead Oak
    public static void mapObject8478(Player player, int index, MapObject mapObject) {}

    // Dead Oak
    public static void mapObject8479(Player player, int index, MapObject mapObject) {}

    // Dead Oak
    public static void mapObject8480(Player player, int index, MapObject mapObject) {}

    // Willow Tree
    public static void mapObject8481(Player player, int index, MapObject mapObject) {}

    // Willow Tree
    public static void mapObject8482(Player player, int index, MapObject mapObject) {}

    // Willow Tree
    public static void mapObject8483(Player player, int index, MapObject mapObject) {}

    // Willow Tree
    public static void mapObject8484(Player player, int index, MapObject mapObject) {}

    // Willow Tree
    public static void mapObject8485(Player player, int index, MapObject mapObject) {}

    // Willow Tree
    public static void mapObject8486(Player player, int index, MapObject mapObject) {}

    // Willow Tree
    public static void mapObject8487(Player player, int index, MapObject mapObject) {}

    // Willow Tree
    public static void mapObject8488(Player player, int index, MapObject mapObject) {}

    // Willow tree stump
    public static void mapObject8489(Player player, int index, MapObject mapObject) {}

    // Diseased Willow
    public static void mapObject8490(Player player, int index, MapObject mapObject) {}

    // Diseased Willow
    public static void mapObject8491(Player player, int index, MapObject mapObject) {}

    // Diseased Willow
    public static void mapObject8492(Player player, int index, MapObject mapObject) {}

    // Diseased Willow
    public static void mapObject8493(Player player, int index, MapObject mapObject) {}

    // Diseased Willow
    public static void mapObject8494(Player player, int index, MapObject mapObject) {}

    // Diseased Willow
    public static void mapObject8495(Player player, int index, MapObject mapObject) {}

    // Dead Willow
    public static void mapObject8496(Player player, int index, MapObject mapObject) {}

    // Dead Willow
    public static void mapObject8497(Player player, int index, MapObject mapObject) {}

    // Dead Willow
    public static void mapObject8498(Player player, int index, MapObject mapObject) {}

    // Dead Willow
    public static void mapObject8499(Player player, int index, MapObject mapObject) {}

    // Dead Willow
    public static void mapObject8500(Player player, int index, MapObject mapObject) {}

    // Dead Willow
    public static void mapObject8501(Player player, int index, MapObject mapObject) {}

    // Yew sapling
    public static void mapObject8502(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject8503(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject8504(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject8505(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject8506(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject8507(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject8508(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject8509(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject8510(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject8511(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject8512(Player player, int index, MapObject mapObject) {}

    // Yew tree
    public static void mapObject8513(Player player, int index, MapObject mapObject) {}

    // Yew tree stump
    public static void mapObject8514(Player player, int index, MapObject mapObject) {}

    // Diseased Yew
    public static void mapObject8515(Player player, int index, MapObject mapObject) {}

    // Diseased Yew
    public static void mapObject8516(Player player, int index, MapObject mapObject) {}

    // Diseased Yew
    public static void mapObject8517(Player player, int index, MapObject mapObject) {}

    // Diseased Yew
    public static void mapObject8518(Player player, int index, MapObject mapObject) {}

    // Diseased Yew
    public static void mapObject8519(Player player, int index, MapObject mapObject) {}

    // Diseased Yew
    public static void mapObject8520(Player player, int index, MapObject mapObject) {}

    // Diseased Yew
    public static void mapObject8521(Player player, int index, MapObject mapObject) {}

    // Diseased Yew
    public static void mapObject8522(Player player, int index, MapObject mapObject) {}

    // Diseased Yew
    public static void mapObject8523(Player player, int index, MapObject mapObject) {}

    // Diseased Yew
    public static void mapObject8524(Player player, int index, MapObject mapObject) {}

    // Dead Yew
    public static void mapObject8525(Player player, int index, MapObject mapObject) {}

    // Dead Yew
    public static void mapObject8526(Player player, int index, MapObject mapObject) {}

    // Dead Yew
    public static void mapObject8527(Player player, int index, MapObject mapObject) {}

    // Dead Yew
    public static void mapObject8528(Player player, int index, MapObject mapObject) {}

    // Dead Yew
    public static void mapObject8529(Player player, int index, MapObject mapObject) {}

    // Dead Yew
    public static void mapObject8530(Player player, int index, MapObject mapObject) {}

    // Dead Yew
    public static void mapObject8531(Player player, int index, MapObject mapObject) {}

    // Dead Yew
    public static void mapObject8532(Player player, int index, MapObject mapObject) {}

    // Dead Yew
    public static void mapObject8533(Player player, int index, MapObject mapObject) {}

    // Dead Yew
    public static void mapObject8534(Player player, int index, MapObject mapObject) {}

    // Cabbages
    public static void mapObject8535(Player player, int index, MapObject mapObject) {}

    // Cabbages
    public static void mapObject8536(Player player, int index, MapObject mapObject) {}

    // Cabbages
    public static void mapObject8537(Player player, int index, MapObject mapObject) {}

    // Cabbages
    public static void mapObject8538(Player player, int index, MapObject mapObject) {}

    // Cabbages
    public static void mapObject8539(Player player, int index, MapObject mapObject) {}

    // Cabbages
    public static void mapObject8540(Player player, int index, MapObject mapObject) {}

    // Cabbages
    public static void mapObject8541(Player player, int index, MapObject mapObject) {}

    // Cabbages
    public static void mapObject8542(Player player, int index, MapObject mapObject) {}

    // Cabbages
    public static void mapObject8543(Player player, int index, MapObject mapObject) {}

    // Diseased cabbages
    public static void mapObject8544(Player player, int index, MapObject mapObject) {}

    // Diseased cabbages
    public static void mapObject8545(Player player, int index, MapObject mapObject) {}

    // Diseased cabbages
    public static void mapObject8546(Player player, int index, MapObject mapObject) {}

    // Dead cabbages
    public static void mapObject8547(Player player, int index, MapObject mapObject) {}

    // Dead cabbages
    public static void mapObject8548(Player player, int index, MapObject mapObject) {}

    // Dead cabbages
    public static void mapObject8549(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8550(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8551(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8552(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8553(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8554(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8555(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8556(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8557(Player player, int index, MapObject mapObject) {}

    // Potato seed
    public static void mapObject8558(Player player, int index, MapObject mapObject) {}

    // Potato plant
    public static void mapObject8559(Player player, int index, MapObject mapObject) {}

    // Potato plant
    public static void mapObject8560(Player player, int index, MapObject mapObject) {}

    // Potato plant
    public static void mapObject8561(Player player, int index, MapObject mapObject) {}

    // Potato
    public static void mapObject8562(Player player, int index, MapObject mapObject) {}

    // Potato seed
    public static void mapObject8563(Player player, int index, MapObject mapObject) {}

    // Potato plant
    public static void mapObject8564(Player player, int index, MapObject mapObject) {}

    // Potato plant
    public static void mapObject8565(Player player, int index, MapObject mapObject) {}

    // Potato plant
    public static void mapObject8566(Player player, int index, MapObject mapObject) {}

    // Diseased potatoes
    public static void mapObject8567(Player player, int index, MapObject mapObject) {}

    // Diseased potatoes
    public static void mapObject8568(Player player, int index, MapObject mapObject) {}

    // Diseased potatoes
    public static void mapObject8569(Player player, int index, MapObject mapObject) {}

    // Dead potatoes
    public static void mapObject8570(Player player, int index, MapObject mapObject) {}

    // Dead potatoes
    public static void mapObject8571(Player player, int index, MapObject mapObject) {}

    // Dead potatoes
    public static void mapObject8572(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8573(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8574(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8575(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8576(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8577(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8578(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject8579(Player player, int index, MapObject mapObject) {}

    // Onion seeds
    public static void mapObject8580(Player player, int index, MapObject mapObject) {}

    // Onion plant
    public static void mapObject8581(Player player, int index, MapObject mapObject) {}

    // Onion plant
    public static void mapObject8582(Player player, int index, MapObject mapObject) {}

    // Onion plant
    public static void mapObject8583(Player player, int index, MapObject mapObject) {}

    // Onion
    public static void mapObject8584(Player player, int index, MapObject mapObject) {}

    // Onion seeds
    public static void mapObject8585(Player player, int index, MapObject mapObject) {}

    // Onion plant
    public static void mapObject8586(Player player, int index, MapObject mapObject) {}

    // Onion plant
    public static void mapObject8587(Player player, int index, MapObject mapObject) {}

    // Onion plant
    public static void mapObject8588(Player player, int index, MapObject mapObject) {}

    // Diseased onions
    public static void mapObject8589(Player player, int index, MapObject mapObject) {}

    // Diseased onions
    public static void mapObject8590(Player player, int index, MapObject mapObject) {}

    // Diseased onions
    public static void mapObject8591(Player player, int index, MapObject mapObject) {}

    // Dead onions
    public static void mapObject8592(Player player, int index, MapObject mapObject) {}

    // Dead onions
    public static void mapObject8593(Player player, int index, MapObject mapObject) {}

    // Dead onions
    public static void mapObject8594(Player player, int index, MapObject mapObject) {}

    // Strawberry seed
    public static void mapObject8595(Player player, int index, MapObject mapObject) {}

    // Strawberry plant
    public static void mapObject8596(Player player, int index, MapObject mapObject) {}

    // Strawberry plant
    public static void mapObject8597(Player player, int index, MapObject mapObject) {}

    // Strawberry plant
    public static void mapObject8598(Player player, int index, MapObject mapObject) {}

    // Strawberry plant
    public static void mapObject8599(Player player, int index, MapObject mapObject) {}

    // Strawberry plant
    public static void mapObject8600(Player player, int index, MapObject mapObject) {}

    // Strawberry
    public static void mapObject8601(Player player, int index, MapObject mapObject) {}

    // Strawberry seed
    public static void mapObject8602(Player player, int index, MapObject mapObject) {}

    // Strawberry plant
    public static void mapObject8603(Player player, int index, MapObject mapObject) {}

    // Strawberry plant
    public static void mapObject8604(Player player, int index, MapObject mapObject) {}

    // Strawberry plant
    public static void mapObject8605(Player player, int index, MapObject mapObject) {}

    // Strawberry plant
    public static void mapObject8606(Player player, int index, MapObject mapObject) {}

    // Strawberry plant
    public static void mapObject8607(Player player, int index, MapObject mapObject) {}

    // Diseased strawberry plant
    public static void mapObject8608(Player player, int index, MapObject mapObject) {}

    // Diseased strawberry plant
    public static void mapObject8609(Player player, int index, MapObject mapObject) {}

    // Diseased strawberry plant
    public static void mapObject8610(Player player, int index, MapObject mapObject) {}

    // Diseased strawberry plant
    public static void mapObject8611(Player player, int index, MapObject mapObject) {}

    // Diseased strawberry plant
    public static void mapObject8612(Player player, int index, MapObject mapObject) {}

    // Dead strawberry plant
    public static void mapObject8613(Player player, int index, MapObject mapObject) {}

    // Dead strawberry plant
    public static void mapObject8614(Player player, int index, MapObject mapObject) {}

    // Dead strawberry plant
    public static void mapObject8615(Player player, int index, MapObject mapObject) {}

    // Dead strawberry plant
    public static void mapObject8616(Player player, int index, MapObject mapObject) {}

    // Dead strawberry plant
    public static void mapObject8617(Player player, int index, MapObject mapObject) {}

    // Sweetcorn seed
    public static void mapObject8618(Player player, int index, MapObject mapObject) {}

    // Sweetcorn plant
    public static void mapObject8619(Player player, int index, MapObject mapObject) {}

    // Sweetcorn plant
    public static void mapObject8620(Player player, int index, MapObject mapObject) {}

    // Sweetcorn plant
    public static void mapObject8621(Player player, int index, MapObject mapObject) {}

    // Sweetcorn plant
    public static void mapObject8622(Player player, int index, MapObject mapObject) {}

    // Sweetcorn plant
    public static void mapObject8623(Player player, int index, MapObject mapObject) {}

    // Sweetcorn
    public static void mapObject8624(Player player, int index, MapObject mapObject) {}

    // Sweetcorn seed
    public static void mapObject8625(Player player, int index, MapObject mapObject) {}

    // Sweetcorn plant
    public static void mapObject8626(Player player, int index, MapObject mapObject) {}

    // Sweetcorn plant
    public static void mapObject8627(Player player, int index, MapObject mapObject) {}

    // Sweetcorn plant
    public static void mapObject8628(Player player, int index, MapObject mapObject) {}

    // Sweetcorn plant
    public static void mapObject8629(Player player, int index, MapObject mapObject) {}

    // Sweetcorn plant
    public static void mapObject8630(Player player, int index, MapObject mapObject) {}

    // Diseased sweetcorn plant
    public static void mapObject8631(Player player, int index, MapObject mapObject) {}

    // Diseased sweetcorn plant
    public static void mapObject8632(Player player, int index, MapObject mapObject) {}

    // Diseased sweetcorn plant
    public static void mapObject8633(Player player, int index, MapObject mapObject) {}

    // Diseased sweetcorn plant
    public static void mapObject8634(Player player, int index, MapObject mapObject) {}

    // Diseased sweetcorn plant
    public static void mapObject8635(Player player, int index, MapObject mapObject) {}

    // Dead sweetcorn plant
    public static void mapObject8636(Player player, int index, MapObject mapObject) {}

    // Dead sweetcorn plant
    public static void mapObject8637(Player player, int index, MapObject mapObject) {}

    // Dead sweetcorn plant
    public static void mapObject8638(Player player, int index, MapObject mapObject) {}

    // Dead sweetcorn plant
    public static void mapObject8639(Player player, int index, MapObject mapObject) {}

    // Dead sweetcorn plant
    public static void mapObject8640(Player player, int index, MapObject mapObject) {}

    // Tomato plant
    public static void mapObject8641(Player player, int index, MapObject mapObject) {}

    // Tomato plant
    public static void mapObject8642(Player player, int index, MapObject mapObject) {}

    // Tomato plant
    public static void mapObject8643(Player player, int index, MapObject mapObject) {}

    // Tomato plant
    public static void mapObject8644(Player player, int index, MapObject mapObject) {}

    // Tomato
    public static void mapObject8645(Player player, int index, MapObject mapObject) {}

    // Tomato plant
    public static void mapObject8646(Player player, int index, MapObject mapObject) {}

    // Tomato plant
    public static void mapObject8647(Player player, int index, MapObject mapObject) {}

    // Tomato plant
    public static void mapObject8648(Player player, int index, MapObject mapObject) {}

    // Tomato plant
    public static void mapObject8649(Player player, int index, MapObject mapObject) {}

    // Diseased tomato plant
    public static void mapObject8650(Player player, int index, MapObject mapObject) {}

    // Diseased tomato plant
    public static void mapObject8651(Player player, int index, MapObject mapObject) {}

    // Diseased tomato plant
    public static void mapObject8652(Player player, int index, MapObject mapObject) {}

    // Dead tomato plant
    public static void mapObject8653(Player player, int index, MapObject mapObject) {}

    // Dead tomato plant
    public static void mapObject8654(Player player, int index, MapObject mapObject) {}

    // Dead tomato plant
    public static void mapObject8655(Player player, int index, MapObject mapObject) {}

    // Watermelon seed
    public static void mapObject8656(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8657(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8658(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8659(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8660(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8661(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8662(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8663(Player player, int index, MapObject mapObject) {}

    // Watermelon
    public static void mapObject8664(Player player, int index, MapObject mapObject) {}

    // Watermelon seed
    public static void mapObject8665(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8666(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8667(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8668(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8669(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8670(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8671(Player player, int index, MapObject mapObject) {}

    // Watermelons
    public static void mapObject8672(Player player, int index, MapObject mapObject) {}

    // Diseased watermelons
    public static void mapObject8673(Player player, int index, MapObject mapObject) {}

    // Diseased watermelons
    public static void mapObject8674(Player player, int index, MapObject mapObject) {}

    // Diseased watermelons
    public static void mapObject8675(Player player, int index, MapObject mapObject) {}

    // Diseased watermelons
    public static void mapObject8676(Player player, int index, MapObject mapObject) {}

    // Diseased watermelons
    public static void mapObject8677(Player player, int index, MapObject mapObject) {}

    // Diseased watermelons
    public static void mapObject8678(Player player, int index, MapObject mapObject) {}

    // Diseased watermelons
    public static void mapObject8679(Player player, int index, MapObject mapObject) {}

    // Dead watermelons
    public static void mapObject8680(Player player, int index, MapObject mapObject) {}

    // Dead watermelons
    public static void mapObject8681(Player player, int index, MapObject mapObject) {}

    // Dead watermelons
    public static void mapObject8682(Player player, int index, MapObject mapObject) {}

    // Dead watermelons
    public static void mapObject8683(Player player, int index, MapObject mapObject) {}

    // Dead watermelons
    public static void mapObject8684(Player player, int index, MapObject mapObject) {}

    // Dead watermelons
    public static void mapObject8685(Player player, int index, MapObject mapObject) {}

    // Dead watermelons
    public static void mapObject8686(Player player, int index, MapObject mapObject) {}

    // Dairy cow
    public static void mapObject8689(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8695(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8696(Player player, int index, MapObject mapObject) {}

   /* 8704 - 8959 */

    // Loom
    public static void mapObject8717(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject8720(Player player, int index, MapObject mapObject) {
        player.openDialogue("vote", 0);
    }

    // Pile of Rock
    public static void mapObject8725(Player player, int index, MapObject mapObject) {}

    // Pile of Rock
    public static void mapObject8726(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject8727(Player player, int index, MapObject mapObject) {}

    // Steps
    public static void mapObject8729(Player player, int index, MapObject mapObject) {
        // Asgarnian Ice Dungeon
        if (player.getY() >= 9557) {
            Tile tile = new Tile(3060, 9555, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(3060, 9557, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Young tree
    public static void mapObject8730(Player player, int index, MapObject mapObject) {}

    // Net trap
    public static void mapObject8731(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Young tree
    public static void mapObject8732(Player player, int index, MapObject mapObject) {
        player.getHunter().layTrap(-1, mapObject);
    }

    // Net trap
    public static void mapObject8734(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Ardougne Wall Door
    public static void mapObject8738(Player player, int index, MapObject mapObject) {}

    // Ardougne Wall Door
    public static void mapObject8739(Player player, int index, MapObject mapObject) {}

    // Ardougne Wall Door
    public static void mapObject8740(Player player, int index, MapObject mapObject) {}

    // Ardougne Wall Door
    public static void mapObject8741(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject8742(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject8744(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport((new Tile(player)).setHeight(player.getHeight() + 1));
    }

    // ladder
    public static void mapObject8745(Player player, int index, MapObject mapObject) {
        player.openDialogue("climb", 0);
    }

    // ladder
    public static void mapObject8746(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport((new Tile(player)).setHeight(player.getHeight() - 1));
    }

    // Spinning wheel
    public static void mapObject8748(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject8749(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Bookcase
    public static void mapObject8752(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject8753(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject8754(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject8783(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject8785(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8786(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8787(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8788(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8789(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8791(Player player, int index, MapObject mapObject) {}

    // Gnome on a rack
    public static void mapObject8794(Player player, int index, MapObject mapObject) {}

    // Gnome on a rack
    public static void mapObject8795(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject8797(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject8798(Player player, int index, MapObject mapObject) {}

    // Desk
    public static void mapObject8799(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject8800(Player player, int index, MapObject mapObject) {}

    // Rotten Apple Pile
    public static void mapObject8809(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject8810(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject8811(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject8812(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject8813(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8818(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8819(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8820(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8821(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject8844(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject8845(Player player, int index, MapObject mapObject) {}

    // Kelda Hops Patch
    public static void mapObject8862(Player player, int index, MapObject mapObject) {}

    // Kelda Hops Patch
    public static void mapObject8863(Player player, int index, MapObject mapObject) {}

    // Kelda Hops Patch
    public static void mapObject8864(Player player, int index, MapObject mapObject) {}

    // Kelda Hops
    public static void mapObject8865(Player player, int index, MapObject mapObject) {}

    // Kelda Hops
    public static void mapObject8866(Player player, int index, MapObject mapObject) {}

    // Kelda Hops
    public static void mapObject8867(Player player, int index, MapObject mapObject) {}

    // Kelda Hops
    public static void mapObject8868(Player player, int index, MapObject mapObject) {}

    // Kelda Hops
    public static void mapObject8869(Player player, int index, MapObject mapObject) {}

    // Kelda Stout
    public static void mapObject8870(Player player, int index, MapObject mapObject) {}

    // Kelda Hops Patch
    public static void mapObject8877(Player player, int index, MapObject mapObject) {}

    // Dwarven machinery
    public static void mapObject8878(Player player, int index, MapObject mapObject) {}

    // Box
    public static void mapObject8879(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject8881(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject8883(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject8884(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject8910(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject8913(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject8914(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject8915(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject8916(Player player, int index, MapObject mapObject) {}

    // Train cart
    public static void mapObject8924(Player player, int index, MapObject mapObject) {}

    // Train cart
    public static void mapObject8925(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject8929(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon entrance
        Tile tile = new Tile(2443, 10146, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Cave entrance
    public static void mapObject8930(Player player, int index, MapObject mapObject) {}

    // Iron ladder
    public static void mapObject8956(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject8958(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon top
        if (player.getX() <= 2490) {
            Tile tile = new Tile(player.getX() + 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        } else {
            Tile tile = new Tile(player.getX() - 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        }
    }

    // Door
    public static void mapObject8959(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon middle
        if (player.getX() <= 2490) {
            Tile tile = new Tile(player.getX() + 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        } else {
            Tile tile = new Tile(player.getX() - 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        }
    }

   /* 8960 - 9215 */

    // Door
    public static void mapObject8960(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon bottom
        if (player.getX() <= 2490) {
            Tile tile = new Tile(player.getX() + 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        } else {
            Tile tile = new Tile(player.getX() - 2, player.getY(), 0);
            player.getMovement().teleport(tile);
        }
    }

    // Steps
    public static void mapObject8966(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon exit
        Tile tile = new Tile(2524, 3739, 0);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Net trap
    public static void mapObject8973(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Dense runestone
    public static void mapObject8975(Player player, int index, MapObject mapObject) {}

    // Depleted runestone
    public static void mapObject8976(Player player, int index, MapObject mapObject) {}

    // Dense runestone
    public static void mapObject8981(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject8982(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject8983(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject8984(Player player, int index, MapObject mapObject) {}

    // Net trap
    public static void mapObject8986(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Net trap
    public static void mapObject8988(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Young tree
    public static void mapObject8989(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Young tree
    public static void mapObject8990(Player player, int index, MapObject mapObject) {
        player.getHunter().layTrap(-1, mapObject);
    }

    // Net trap
    public static void mapObject8992(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Pinball Post
    public static void mapObject8994(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject8995(Player player, int index, MapObject mapObject) {}

    // Net trap
    public static void mapObject8996(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Net trap
    public static void mapObject8998(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Young tree
    public static void mapObject8999(Player player, int index, MapObject mapObject) {
        player.getHunter().layTrap(-1, mapObject);
    }

    // Young tree
    public static void mapObject9000(Player player, int index, MapObject mapObject) {
        player.getHunter().layTrap(-1, mapObject);
    }

    // Net trap
    public static void mapObject9002(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Net trap
    public static void mapObject9004(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Funeral Pyre
    public static void mapObject9008(Player player, int index, MapObject mapObject) {}

    // Funeral Pyre
    public static void mapObject9009(Player player, int index, MapObject mapObject) {}

    // Light Jungle
    public static void mapObject9010(Player player, int index, MapObject mapObject) {}

    // Light Jungle
    public static void mapObject9011(Player player, int index, MapObject mapObject) {}

    // Light Jungle
    public static void mapObject9012(Player player, int index, MapObject mapObject) {}

    // Light Jungle
    public static void mapObject9013(Player player, int index, MapObject mapObject) {}

    // Light Jungle
    public static void mapObject9014(Player player, int index, MapObject mapObject) {}

    // Medium Jungle
    public static void mapObject9015(Player player, int index, MapObject mapObject) {}

    // Medium Jungle
    public static void mapObject9016(Player player, int index, MapObject mapObject) {}

    // Medium Jungle
    public static void mapObject9017(Player player, int index, MapObject mapObject) {}

    // Medium Jungle
    public static void mapObject9018(Player player, int index, MapObject mapObject) {}

    // Medium Jungle
    public static void mapObject9019(Player player, int index, MapObject mapObject) {}

    // Dense Jungle
    public static void mapObject9020(Player player, int index, MapObject mapObject) {}

    // Dense Jungle
    public static void mapObject9021(Player player, int index, MapObject mapObject) {}

    // Dense Jungle
    public static void mapObject9022(Player player, int index, MapObject mapObject) {}

    // Dense Jungle
    public static void mapObject9023(Player player, int index, MapObject mapObject) {}

    // Dense Jungle
    public static void mapObject9024(Player player, int index, MapObject mapObject) {}

    // Rotten village fence
    public static void mapObject9025(Player player, int index, MapObject mapObject) {}

    // Partial fence
    public static void mapObject9026(Player player, int index, MapObject mapObject) {}

    // Short fence
    public static void mapObject9027(Player player, int index, MapObject mapObject) {}

    // Medium fence
    public static void mapObject9028(Player player, int index, MapObject mapObject) {}

    // Village fence
    public static void mapObject9029(Player player, int index, MapObject mapObject) {}

    // Gem Rock
    public static void mapObject9030(Player player, int index, MapObject mapObject) {}

    // Gem Rock
    public static void mapObject9031(Player player, int index, MapObject mapObject) {}

    // Gem Rock
    public static void mapObject9032(Player player, int index, MapObject mapObject) {}

    // Mahogany
    public static void mapObject9034(Player player, int index, MapObject mapObject) {}

    // Teak
    public static void mapObject9036(Player player, int index, MapObject mapObject) {}

    // Hardwood Grove Doors
    public static void mapObject9038(Player player, int index, MapObject mapObject) {}

    // Hardwood Grove Doors
    public static void mapObject9039(Player player, int index, MapObject mapObject) {}

    // Goutweed
    public static void mapObject9044(Player player, int index, MapObject mapObject) {}

    // Goutweed
    public static void mapObject9045(Player player, int index, MapObject mapObject) {}

    // Goutweed
    public static void mapObject9046(Player player, int index, MapObject mapObject) {}

    // Goutweed
    public static void mapObject9047(Player player, int index, MapObject mapObject) {}

    // Goutweed
    public static void mapObject9048(Player player, int index, MapObject mapObject) {}

    // Diseased goutweed
    public static void mapObject9049(Player player, int index, MapObject mapObject) {}

    // Diseased goutweed
    public static void mapObject9050(Player player, int index, MapObject mapObject) {}

    // Diseased goutweed
    public static void mapObject9051(Player player, int index, MapObject mapObject) {}

    // Dead goutweed
    public static void mapObject9052(Player player, int index, MapObject mapObject) {}

    // Dead goutweed
    public static void mapObject9053(Player player, int index, MapObject mapObject) {}

    // Dead goutweed
    public static void mapObject9054(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject9079(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject9080(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject9081(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject9084(Player player, int index, MapObject mapObject) {}

    // Stove
    public static void mapObject9085(Player player, int index, MapObject mapObject) {}

    // Stove
    public static void mapObject9086(Player player, int index, MapObject mapObject) {}

    // Stove
    public static void mapObject9087(Player player, int index, MapObject mapObject) {}

    // Coke
    public static void mapObject9088(Player player, int index, MapObject mapObject) {}

    // Temperature gauge
    public static void mapObject9089(Player player, int index, MapObject mapObject) {}

    // Pump
    public static void mapObject9090(Player player, int index, MapObject mapObject) {}

    // Bars
    public static void mapObject9091(Player player, int index, MapObject mapObject) {}

    // Bar dispenser
    public static void mapObject9092(Player player, int index, MapObject mapObject) {}

    // Bar dispenser
    public static void mapObject9093(Player player, int index, MapObject mapObject) {}

    // Bar dispenser
    public static void mapObject9095(Player player, int index, MapObject mapObject) {}

    // Bar dispenser
    public static void mapObject9096(Player player, int index, MapObject mapObject) {}

    // Pedals
    public static void mapObject9097(Player player, int index, MapObject mapObject) {}

    // Conveyor belt
    public static void mapObject9100(Player player, int index, MapObject mapObject) {}

    // Drive belt
    public static void mapObject9103(Player player, int index, MapObject mapObject) {}

    // Cogs
    public static void mapObject9105(Player player, int index, MapObject mapObject) {}

    // Pipes
    public static void mapObject9117(Player player, int index, MapObject mapObject) {}

    // Pipes
    public static void mapObject9121(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject9138(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9140(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9141(Player player, int index, MapObject mapObject) {}

    // Sink
    public static void mapObject9143(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject9146(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject9147(Player player, int index, MapObject mapObject) {}

    // Net trap
    public static void mapObject9158(Player player, int index, MapObject mapObject) {}

    // Delphinium patch
    public static void mapObject9165(Player player, int index, MapObject mapObject) {}

    // Delphinium patch
    public static void mapObject9166(Player player, int index, MapObject mapObject) {}

    // Delphinium patch
    public static void mapObject9167(Player player, int index, MapObject mapObject) {}

    // Delphinium patch
    public static void mapObject9168(Player player, int index, MapObject mapObject) {}

    // Delphinium patch
    public static void mapObject9169(Player player, int index, MapObject mapObject) {}

    // White rose bush patch
    public static void mapObject9174(Player player, int index, MapObject mapObject) {}

    // Red rose bush patch
    public static void mapObject9175(Player player, int index, MapObject mapObject) {}

    // Pink rose bush patch
    public static void mapObject9176(Player player, int index, MapObject mapObject) {}

    // Pink rose bush patch
    public static void mapObject9177(Player player, int index, MapObject mapObject) {}

    // Pink rose bush patch
    public static void mapObject9178(Player player, int index, MapObject mapObject) {}

    // Pink rose bush patch
    public static void mapObject9179(Player player, int index, MapObject mapObject) {}

    // Pink rose bush patch
    public static void mapObject9180(Player player, int index, MapObject mapObject) {}

    // White rose bush patch
    public static void mapObject9181(Player player, int index, MapObject mapObject) {}

    // White rose bush patch
    public static void mapObject9182(Player player, int index, MapObject mapObject) {}

    // White rose bush patch
    public static void mapObject9183(Player player, int index, MapObject mapObject) {}

    // White rose bush patch
    public static void mapObject9184(Player player, int index, MapObject mapObject) {}

    // Red rose bush patch
    public static void mapObject9185(Player player, int index, MapObject mapObject) {}

    // Red rose bush patch
    public static void mapObject9186(Player player, int index, MapObject mapObject) {}

    // Red rose bush patch
    public static void mapObject9187(Player player, int index, MapObject mapObject) {}

    // Red rose bush patch
    public static void mapObject9188(Player player, int index, MapObject mapObject) {}

    // Plantpot
    public static void mapObject9197(Player player, int index, MapObject mapObject) {}

    // Plantpot
    public static void mapObject9198(Player player, int index, MapObject mapObject) {}

    // Plantpot
    public static void mapObject9203(Player player, int index, MapObject mapObject) {}

    // Plantpot
    public static void mapObject9204(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9209(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9210(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9211(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9212(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9213(Player player, int index, MapObject mapObject) {}

   /* 9216 - 9471 */

    // White Tree patch
    public static void mapObject9219(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9220(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9221(Player player, int index, MapObject mapObject) {}

    // White Tree patch
    public static void mapObject9222(Player player, int index, MapObject mapObject) {}

    // Snowdrop patch
    public static void mapObject9223(Player player, int index, MapObject mapObject) {}

    // Snowdrop patch
    public static void mapObject9224(Player player, int index, MapObject mapObject) {}

    // Snowdrop patch
    public static void mapObject9225(Player player, int index, MapObject mapObject) {}

    // Snowdrop patch
    public static void mapObject9226(Player player, int index, MapObject mapObject) {}

    // Snowdrop patch
    public static void mapObject9227(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject9232(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject9233(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject9234(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject9235(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject9236(Player player, int index, MapObject mapObject) {}

    // Statue plinth
    public static void mapObject9246(Player player, int index, MapObject mapObject) {}

    // Statue plinth
    public static void mapObject9248(Player player, int index, MapObject mapObject) {}

    // Statue plinth
    public static void mapObject9252(Player player, int index, MapObject mapObject) {}

    // Statue plinth
    public static void mapObject9253(Player player, int index, MapObject mapObject) {}

    // Young tree
    public static void mapObject9257(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject9258(Player player, int index, MapObject mapObject) {}

    // Pinball Post
    public static void mapObject9259(Player player, int index, MapObject mapObject) {}

    // Roses
    public static void mapObject9260(Player player, int index, MapObject mapObject) {}

    // Roses
    public static void mapObject9261(Player player, int index, MapObject mapObject) {}

    // Roses
    public static void mapObject9262(Player player, int index, MapObject mapObject) {}

    // Cave Exit
    public static void mapObject9293(Player player, int index, MapObject mapObject) {}

    // Exercise mat
    public static void mapObject9313(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9316(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9317(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9318(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9319(Player player, int index, MapObject mapObject) {}

    // Scarecrow
    public static void mapObject9338(Player player, int index, MapObject mapObject) {}

    // Scarecrow
    public static void mapObject9339(Player player, int index, MapObject mapObject) {}

    // Scarecrow
    public static void mapObject9340(Player player, int index, MapObject mapObject) {}

    // Young tree
    public static void mapObject9341(Player player, int index, MapObject mapObject) {
        player.getHunter().layTrap(-1, mapObject);
    }

    // Net trap
    public static void mapObject9343(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Bird snare
    public static void mapObject9344(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Bird snare
    public static void mapObject9345(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Bird snare
    public static void mapObject9348(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Grave
    public static void mapObject9354(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject9355(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject9356(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject9357(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject9358(Player player, int index, MapObject mapObject) {}

    // Gravestone
    public static void mapObject9359(Player player, int index, MapObject mapObject) {}

    // Gravestone
    public static void mapObject9360(Player player, int index, MapObject mapObject) {}

    // Gravestone
    public static void mapObject9361(Player player, int index, MapObject mapObject) {}

    // Gravestone
    public static void mapObject9362(Player player, int index, MapObject mapObject) {}

    // Gravestone
    public static void mapObject9363(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject9364(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject9365(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject9366(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject9367(Player player, int index, MapObject mapObject) {}

    // Private portal
    public static void mapObject9368(Player player, int index, MapObject mapObject) {}

    // Private portal
    public static void mapObject9369(Player player, int index, MapObject mapObject) {}

    // Private portal
    public static void mapObject9370(Player player, int index, MapObject mapObject) {
        player.openDialogue("bossinstance", 1);
    }

    // Herb patch
    public static void mapObject9372(Player player, int index, MapObject mapObject) {}

    // Bird snare
    public static void mapObject9373(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Bird snare
    public static void mapObject9375(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Bird snare
    public static void mapObject9377(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Bird snare
    public static void mapObject9379(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Box trap
    public static void mapObject9380(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Shaking box
    public static void mapObject9382(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Shaking box
    public static void mapObject9383(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Shaking box
    public static void mapObject9384(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Box trap
    public static void mapObject9385(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Door
    public static void mapObject9398(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject9430(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject9431(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject9432(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject9433(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject9434(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject9435(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject9437(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject9438(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject9443(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9470(Player player, int index, MapObject mapObject) {}

    // Tree Stump
    public static void mapObject9471(Player player, int index, MapObject mapObject) {}

   /* 9472 - 9727 */

    // Lever
    public static void mapObject9472(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject9523(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject9533(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject9534(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject9535(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject9536(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject9558(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(player).setHeight(1));
    }

    // Ladder
    public static void mapObject9559(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(player).setHeight(0));
    }

    // Trapdoor
    public static void mapObject9560(Player player, int index, MapObject mapObject) {}

    // Cell door
    public static void mapObject9562(Player player, int index, MapObject mapObject) {}

    // Cell door
    public static void mapObject9563(Player player, int index, MapObject mapObject) {}

    // Cell door
    public static void mapObject9564(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9565(Player player, int index, MapObject mapObject) {}

    // Bucket
    public static void mapObject9568(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject9582(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject9584(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject9607(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject9608(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject9609(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject9611(Player player, int index, MapObject mapObject) {}

    // Wheelbarrow
    public static void mapObject9625(Player player, int index, MapObject mapObject) {}

    // Spade
    public static void mapObject9662(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject9706(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        // Mage Arena
        if (player.getMovement().getTeleportBlock() > 0) {
            player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                    + player.getMovement().getTeleportBlockRemaining() + ".");
            return;
        }
        Tile tile = new Tile(3105, 3951, 0);
        player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
    }

    // Lever
    public static void mapObject9707(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        // Mage Arena
        if (player.getMovement().getTeleportBlock() > 0) {
            player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                    + player.getMovement().getTeleportBlockRemaining() + ".");
            return;
        }
        Tile tile = new Tile(3105, 3956, 0);
        player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
    }

    // Gate
    public static void mapObject9708(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9709(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9710(Player player, int index, MapObject mapObject) {}

    // Tree Stump
    public static void mapObject9711(Player player, int index, MapObject mapObject) {}

    // Tree Stump
    public static void mapObject9712(Player player, int index, MapObject mapObject) {}

    // Tree Stump
    public static void mapObject9713(Player player, int index, MapObject mapObject) {}

    // Tree Stump
    public static void mapObject9714(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9716(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9717(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9718(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9719(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject9720(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9721(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9722(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9723(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject9724(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject9725(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject9726(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject9727(Player player, int index, MapObject mapObject) {}

   /* 9728 - 9983 */

    // Ladder
    public static void mapObject9728(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject9729(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject9730(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject9731(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject9732(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject9733(Player player, int index, MapObject mapObject) {}

    // Oak
    public static void mapObject9734(Player player, int index, MapObject mapObject) {}

    // Range
    public static void mapObject9736(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject9737(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject9738(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject9739(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject9740(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject9741(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject9742(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(2834, 3542, 0);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Ship's ladder
    public static void mapObject9744(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject9745(Player player, int index, MapObject mapObject) {}

    // Crystal collector
    public static void mapObject9748(Player player, int index, MapObject mapObject) {}

    // Crystal collector
    public static void mapObject9749(Player player, int index, MapObject mapObject) {}

    // Crystal
    public static void mapObject9750(Player player, int index, MapObject mapObject) {}

    // Crystal
    public static void mapObject9751(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject9753(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject9754(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject9755(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject9756(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject9757(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject9758(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject9759(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject9760(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject9761(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject9762(Player player, int index, MapObject mapObject) {}

    // Guard
    public static void mapObject9763(Player player, int index, MapObject mapObject) {}

    // Guard
    public static void mapObject9764(Player player, int index, MapObject mapObject) {}

    // Guard
    public static void mapObject9765(Player player, int index, MapObject mapObject) {}

    // Slave
    public static void mapObject9766(Player player, int index, MapObject mapObject) {}

    // Slave
    public static void mapObject9767(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9775(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9776(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9777(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9778(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9779(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9780(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9781(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9782(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9783(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9784(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9785(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9786(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9787(Player player, int index, MapObject mapObject) {}

    // Light door
    public static void mapObject9788(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9898(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9899(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9900(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9901(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9902(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9903(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9904(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9905(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9906(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9907(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9908(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9909(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9910(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9911(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9912(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9913(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9914(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9915(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9916(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9917(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9918(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9919(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9920(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9921(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9922(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9923(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9924(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9925(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9926(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9927(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9928(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9929(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9930(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9931(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9932(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9933(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9934(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9935(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9936(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9937(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9938(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9939(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9940(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9941(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9942(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9943(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9944(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9945(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9946(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9947(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9948(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9949(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9950(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9951(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9952(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9953(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9954(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9955(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9956(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9957(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9958(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9959(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9960(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9961(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9962(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9963(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9964(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9965(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9966(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9967(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9968(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9969(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9970(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9971(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9972(Player player, int index, MapObject mapObject) {}

    // Pillar of Light
    public static void mapObject9973(Player player, int index, MapObject mapObject) {}

    // Cave wall
    public static void mapObject9974(Player player, int index, MapObject mapObject) {}

    // Cave Stairs
    public static void mapObject9975(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject9977(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject9978(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject9979(Player player, int index, MapObject mapObject) {}


   /* 9984 - 10239 */

    // Staircase
    public static void mapObject10015(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject10016(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject10017(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject10018(Player player, int index, MapObject mapObject) {}

    // Wall support
    public static void mapObject10033(Player player, int index, MapObject mapObject) {}

    // Low wall
    public static void mapObject10035(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject10036(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject10038(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject10040(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject10041(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10042(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(2907, 9968, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Door
    public static void mapObject10043(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2911 && mapObject.getY() == 9968) {
            if (player.getX() >= 2912) {
                player.getMovement().teleport(2911, 9968, player.getHeight());
            } else {
                if (player.getInventory().getCount(8851) < 100
                        && !player.getEquipment().wearingAccomplishmentCape(Skills.ATTACK)) {
                    player.getGameEncoder().sendMessage("You need atleast 100 tokens to enter.");
                    return;
                } else if (!player.carryingItem(8850)) {
                    player.getGameEncoder().sendMessage("You need a Rune defender to enter.");
                    return;
                }
                player.getMovement().teleport(2912, 9968, player.getHeight());
            }
        }
    }

    // Door
    public static void mapObject10045(Player player, int index, MapObject mapObject) {}

    // Dark tunnel
    public static void mapObject10047(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject10048(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject10049(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject10053(Player player, int index, MapObject mapObject) {}

    // Grave
    public static void mapObject10054(Player player, int index, MapObject mapObject) {}

    // Mausoleum
    public static void mapObject10055(Player player, int index, MapObject mapObject) {}

    // Grand Exchange booth
    public static void mapObject10060(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Grand Exchange booth
    public static void mapObject10061(Player player, int index, MapObject mapObject) {
        if (player.getHeight() != 0) {
            player.getGameEncoder().sendMessage("You can't use this here.");
            return;
        }
        player.openDialogue("grandexchange", 0);
    }

    // Sacrificial boat
    public static void mapObject10068(Player player, int index, MapObject mapObject) {
        player.openDialogue("zulrah", 0);
    }

    // Rough wall
    public static void mapObject10073(Player player, int index, MapObject mapObject) {}

    // Tightrope
    public static void mapObject10074(Player player, int index, MapObject mapObject) {}

    // Tightrope
    public static void mapObject10075(Player player, int index, MapObject mapObject) {}

    // Narrow wall
    public static void mapObject10077(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject10078(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject10079(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject10080(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject10081(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject10082(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject10083(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Wall
    public static void mapObject10084(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10085(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject10086(Player player, int index, MapObject mapObject) {}

    // Ominous Fishing Spot
    public static void mapObject10087(Player player, int index, MapObject mapObject) {}

    // Ominous Fishing Spot
    public static void mapObject10088(Player player, int index, MapObject mapObject) {}

    // Ominous Fishing Spot
    public static void mapObject10089(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject10090(Player player, int index, MapObject mapObject) {}

    // Aquarium
    public static void mapObject10091(Player player, int index, MapObject mapObject) {}

    // Rough wall
    public static void mapObject10093(Player player, int index, MapObject mapObject) {}

    // Roof top beams
    public static void mapObject10094(Player player, int index, MapObject mapObject) {}

    // Blindweed Patch
    public static void mapObject10096(Player player, int index, MapObject mapObject) {}

    // Blindweed Patch
    public static void mapObject10097(Player player, int index, MapObject mapObject) {}

    // Blindweed Patch
    public static void mapObject10098(Player player, int index, MapObject mapObject) {}

    // Blindweed Patch
    public static void mapObject10099(Player player, int index, MapObject mapObject) {}

    // Blindweed Patch
    public static void mapObject10100(Player player, int index, MapObject mapObject) {}

    // Blindweed Patch
    public static void mapObject10101(Player player, int index, MapObject mapObject) {}

    // Blindweed Patch
    public static void mapObject10102(Player player, int index, MapObject mapObject) {}

    // Trashed Patch
    public static void mapObject10103(Player player, int index, MapObject mapObject) {}

    // Wooden Stair
    public static void mapObject10136(Player player, int index, MapObject mapObject) {}

    // Wooden Stair
    public static void mapObject10137(Player player, int index, MapObject mapObject) {}

    // Output Tap
    public static void mapObject10148(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject10162(Player player, int index, MapObject mapObject) {}

    // Open Cupboard
    public static void mapObject10163(Player player, int index, MapObject mapObject) {}

    // Pressure Lever
    public static void mapObject10164(Player player, int index, MapObject mapObject) {}

    // Pressure Lever
    public static void mapObject10165(Player player, int index, MapObject mapObject) {}

    // Pressure Lever
    public static void mapObject10166(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10167(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10168(Player player, int index, MapObject mapObject) {}

    // Pressure Barrel
    public static void mapObject10171(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject10172(Player player, int index, MapObject mapObject) {}

    // Iron ladder
    public static void mapObject10177(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon
        player.openDialogue("bossinstance", 2);
    }

    // Ladder
    public static void mapObject10193(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10194(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10195(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10196(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10197(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10198(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10199(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10200(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10201(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10202(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10203(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10204(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10205(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10206(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10207(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10208(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10209(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10210(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10211(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10212(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10213(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10214(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10215(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10216(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10217(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10218(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10219(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10220(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10221(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10222(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10223(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10224(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10225(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10226(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10227(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10228(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10229(Player player, int index, MapObject mapObject) {
        // Waterbirth Dungeon
        Tile tile = new Tile(2545, 10143, 0);
        player.getMovement().ladderUpTeleport(tile);
        player.getController().stopWithTeleport();
    }

    // Ladder
    public static void mapObject10230(Player player, int index, MapObject mapObject) {}


   /* 10240 - 10495 */

    // Broken kiln
    public static void mapObject10242(Player player, int index, MapObject mapObject) {}

    // Broken kiln
    public static void mapObject10243(Player player, int index, MapObject mapObject) {}

    // Broken kiln
    public static void mapObject10244(Player player, int index, MapObject mapObject) {}

    // Broken kiln
    public static void mapObject10245(Player player, int index, MapObject mapObject) {}

    // Broken kiln
    public static void mapObject10246(Player player, int index, MapObject mapObject) {}

    // Broken kiln
    public static void mapObject10247(Player player, int index, MapObject mapObject) {}

    // Broken kiln
    public static void mapObject10248(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject10251(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10260(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10261(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10262(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10263(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10264(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10265(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject10266(Player player, int index, MapObject mapObject) {}

    // Shield Display
    public static void mapObject10267(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject10268(Player player, int index, MapObject mapObject) {}

    // Large Display
    public static void mapObject10269(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject10270(Player player, int index, MapObject mapObject) {}

    // Large Display
    public static void mapObject10271(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject10272(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject10273(Player player, int index, MapObject mapObject) {}

    // River
    public static void mapObject10283(Player player, int index, MapObject mapObject) {}

    // Tightrope
    public static void mapObject10284(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10287(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10288(Player player, int index, MapObject mapObject) {}

    // Rat trap
    public static void mapObject10290(Player player, int index, MapObject mapObject) {}

    // Rat trap
    public static void mapObject10291(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10308(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10309(Player player, int index, MapObject mapObject) {}

    // Gates
    public static void mapObject10318(Player player, int index, MapObject mapObject) {}

    // Trellis top
    public static void mapObject10319(Player player, int index, MapObject mapObject) {}

    // Manhole
    public static void mapObject10321(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10322(Player player, int index, MapObject mapObject) {}

    // Trellis
    public static void mapObject10323(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10325(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10327(Player player, int index, MapObject mapObject) {}

    // Rat wall
    public static void mapObject10335(Player player, int index, MapObject mapObject) {}

    // Rat wall
    public static void mapObject10336(Player player, int index, MapObject mapObject) {}

    // Rat wall
    public static void mapObject10337(Player player, int index, MapObject mapObject) {}

    // Rat wall
    public static void mapObject10338(Player player, int index, MapObject mapObject) {}

    // Rat Wall
    public static void mapObject10342(Player player, int index, MapObject mapObject) {}

    // Rat Wall
    public static void mapObject10343(Player player, int index, MapObject mapObject) {}

    // Rat Wall
    public static void mapObject10344(Player player, int index, MapObject mapObject) {}

    // Rat Wall
    public static void mapObject10345(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10352(Player player, int index, MapObject mapObject) {}

    // Cable
    public static void mapObject10355(Player player, int index, MapObject mapObject) {}

    // Zip line
    public static void mapObject10356(Player player, int index, MapObject mapObject) {}

    // Tropical tree
    public static void mapObject10357(Player player, int index, MapObject mapObject) {}

    // Tools
    public static void mapObject10375(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject10378(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject10379(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject10380(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject10381(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject10382(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject10383(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject10384(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject10385(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject10386(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject10387(Player player, int index, MapObject mapObject) {}

    // Statuette Plinth
    public static void mapObject10389(Player player, int index, MapObject mapObject) {}

    // Water Channel
    public static void mapObject10396(Player player, int index, MapObject mapObject) {}

    // Water Channel
    public static void mapObject10399(Player player, int index, MapObject mapObject) {}

    // Water Channel
    public static void mapObject10405(Player player, int index, MapObject mapObject) {}

    // Water Channel
    public static void mapObject10407(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject10416(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject10417(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10418(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10419(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10420(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10421(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10423(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10425(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10427(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10429(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject10431(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject10434(Player player, int index, MapObject mapObject) {}

    // Elidinis Statuette
    public static void mapObject10439(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10493(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10494(Player player, int index, MapObject mapObject) {}


   /* 10496 - 10751 */

    // Bank booth
    public static void mapObject10517(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Staircase
    public static void mapObject10525(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject10526(Player player, int index, MapObject mapObject) {}

    // Portcullis
    public static void mapObject10553(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10554(Player player, int index, MapObject mapObject) {}

    // Champion Statue
    public static void mapObject10556(Player player, int index, MapObject mapObject) {}

    // Champion Statue
    public static void mapObject10557(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject10558(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject10559(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject10560(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3190 && mapObject.getY() == 9758) {
            player.getMovement().ladderUpTeleport(new Tile(2212, 4940));
        }
    }

    // Bank chest
    public static void mapObject10562(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Tightrope
    public static void mapObject10583(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject10585(Player player, int index, MapObject mapObject) {}

    // Rough wall
    public static void mapObject10586(Player player, int index, MapObject mapObject) {}

    // Clothes line
    public static void mapObject10587(Player player, int index, MapObject mapObject) {}

    // Icy Cavern
    public static void mapObject10595(Player player, int index, MapObject mapObject) {
        // Asgarnian Ice Dungeon
        Tile tile = new Tile(3056, 9562, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Icy Cavern
    public static void mapObject10596(Player player, int index, MapObject mapObject) {
        // Asgarnian Ice Dungeon
        Tile tile = new Tile(3056, 9555, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Altar
    public static void mapObject10638(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject10639(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject10640(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10642(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject10661(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Crate
    public static void mapObject10662(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject10663(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject10670(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject10672(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject10698(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject10721(Player player, int index, MapObject mapObject) {}

    // Bones
    public static void mapObject10725(Player player, int index, MapObject mapObject) {}

    // Bones
    public static void mapObject10726(Player player, int index, MapObject mapObject) {}

    // Bones
    public static void mapObject10727(Player player, int index, MapObject mapObject) {}

    // Bones
    public static void mapObject10728(Player player, int index, MapObject mapObject) {}

    // Coin Collector
    public static void mapObject10734(Player player, int index, MapObject mapObject) {}

    // Food chute
    public static void mapObject10735(Player player, int index, MapObject mapObject) {}


   /* 10752 - 11007 */

    // Stairs
    public static void mapObject10771(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10772(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10773(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10774(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10775(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10776(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject10777(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10778(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10779(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10780(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10781(Player player, int index, MapObject mapObject) {}

    // Dense runestone
    public static void mapObject10796(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject10804(Player player, int index, MapObject mapObject) {}

    // Sandy's Desk
    public static void mapObject10805(Player player, int index, MapObject mapObject) {}

    // Edge
    public static void mapObject10817(Player player, int index, MapObject mapObject) {}

    // Tall tree
    public static void mapObject10819(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 40) {
            player.getGameEncoder().sendMessage("You need an Agility level of 40 to use this course.");
            return;
        }
        Tile toTile = new Tile(3506, 3492, 2);
        player.getMovement().ladderUpTeleport(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 10;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10820(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3505 || player.getY() != 3497) {
            return;
        }
        int direction = Tile.NORTH;
        player.setAnimation(2588);
        Tile toTile = new Tile(3503, 3504, 2);
        player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                int xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10821(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3498 || player.getY() != 3504) {
            return;
        }
        int direction = Tile.WEST;
        player.setAnimation(2588);
        Tile toTile = new Tile(3492, 3504, 2);
        player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                int xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10822(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3478 || player.getY() != 3493) {
            return;
        }
        int direction = Tile.SOUTH;
        player.setAnimation(2588);
        Tile toTile = new Tile(3478, 3486, 2);
        player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                int xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10823(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3502 || player.getY() != 3476) {
            return;
        }
        int direction = Tile.EAST;
        player.setAnimation(2588);
        Tile toTile = new Tile(3510, 3476, 2);
        player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                int xp = 11;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10828(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3487 || player.getY() != 3499) {
            return;
        }
        int direction = Tile.WEST;
        player.setAnimation(2588);
        Tile toTile = new Tile(3479, 3499, 3);
        player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                int xp = 10;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tightrope
    public static void mapObject10829(Player player, int index, MapObject mapObject) {}

    // Pole-vault
    public static void mapObject10831(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3480 || player.getY() != 3484) {
            return;
        }
        player.setAnimation(7132);
        Tile toTile = new Tile(3489, 3476, 3);
        player.setForceMovement(new ForceMovement(player, 1, toTile, 4, Tile.EAST));
        player.lock();
        Event event = new Event(3) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setAnimation(-1);
                int xp = 10;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10832(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3510 || player.getY() != 3482) {
            return;
        }
        Tile toTile = new Tile(3510, 3485, 0);
        player.getMovement().animatedTeleport(toTile, 7133, null, 0);
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 175;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (Utils.randomE(10) == 0) {
                    int amount = 4;
                    if (player.getGoldMember()) {
                        amount = 6;
                    }
                    player.getInventory().addOrDropItem(11849, amount);
                }
                if (Utils.randomE(2) == 0) {
                    int rewardType = Utils.randomE(3);
                    if (rewardType == 0) {
                        player.getInventory().addOrDropItem(3009, 1);
                    } else if (rewardType == 1) {
                        player.getInventory().addOrDropItem(3017, 1);
                    } else if (rewardType == 2) {
                        player.getInventory().addOrDropItem(12640, 4);
                    }
                }
                player.getFamiliar().rollSkillPet(Skills.AGILITY, 36842, 20659);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Rough wall
    public static void mapObject10833(Player player, int index, MapObject mapObject) {}

    // Tightrope
    public static void mapObject10834(Player player, int index, MapObject mapObject) {}

    // Hand holds
    public static void mapObject10836(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject10851(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject10852(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject10855(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject10856(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10857(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10858(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10859(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10860(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10861(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10862(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10863(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10864(Player player, int index, MapObject mapObject) {}

    // Low wall
    public static void mapObject10865(Player player, int index, MapObject mapObject) {}

    // Plank
    public static void mapObject10867(Player player, int index, MapObject mapObject) {}

    // Plank
    public static void mapObject10868(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10882(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10883(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10884(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10885(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10886(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10887(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10888(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10889(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject10949(Player player, int index, MapObject mapObject) {}

    // Sand pile
    public static void mapObject10950(Player player, int index, MapObject mapObject) {}

    // Magic barrier
    public static void mapObject11005(Player player, int index, MapObject mapObject) {}


   /* 11008 - 11263 */

    // Furnace
    public static void mapObject11008(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject11010(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11011(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11012(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11013(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11014(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11015(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11016(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11017(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11018(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11019(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11020(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11021(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11022(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11023(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11024(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject11025(Player player, int index, MapObject mapObject) {}

    // Rubble
    public static void mapObject11040(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11041(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11042(Player player, int index, MapObject mapObject) {}

    // Stone Ladder
    public static void mapObject11043(Player player, int index, MapObject mapObject) {}

    // Stone Ladder
    public static void mapObject11044(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject11045(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject11046(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject11047(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject11048(Player player, int index, MapObject mapObject) {}

    // Secret entrance
    public static void mapObject11050(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11051(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11053(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11055(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11057(Player player, int index, MapObject mapObject) {}

    // Pedestal
    public static void mapObject11060(Player player, int index, MapObject mapObject) {}

    // Pedestal
    public static void mapObject11061(Player player, int index, MapObject mapObject) {}

    // Pedestal
    public static void mapObject11062(Player player, int index, MapObject mapObject) {}

    // Pedestal
    public static void mapObject11063(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11064(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11066(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11068(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11070(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject11097(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11151(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11152(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11161(Player player, int index, MapObject mapObject) {}

    // Treated patch
    public static void mapObject11164(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject11166(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject11168(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject11170(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject11172(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11196(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11197(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11198(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11199(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11200(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11201(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject11202(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject11203(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject11209(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject11210(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject11211(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject11212(Player player, int index, MapObject mapObject) {}

    // Cannon
    public static void mapObject11213(Player player, int index, MapObject mapObject) {}

    // Cannon
    public static void mapObject11214(Player player, int index, MapObject mapObject) {}

    // Broken Cannon
    public static void mapObject11215(Player player, int index, MapObject mapObject) {}

    // Broken Cannon
    public static void mapObject11216(Player player, int index, MapObject mapObject) {}

    // Cannon
    public static void mapObject11217(Player player, int index, MapObject mapObject) {}

    // Ship hull
    public static void mapObject11221(Player player, int index, MapObject mapObject) {}

    // Ship hull
    public static void mapObject11222(Player player, int index, MapObject mapObject) {}

    // Ship hull
    public static void mapObject11223(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject11224(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject11225(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject11226(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject11227(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject11228(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject11229(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject11230(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject11231(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject11232(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject11233(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject11234(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject11235(Player player, int index, MapObject mapObject) {}

    // Plunder Storage
    public static void mapObject11236(Player player, int index, MapObject mapObject) {}

    // Powder Barrel
    public static void mapObject11237(Player player, int index, MapObject mapObject) {}

    // Powder Barrel
    public static void mapObject11238(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject11239(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject11240(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject11243(Player player, int index, MapObject mapObject) {}

    // Climbing Net
    public static void mapObject11244(Player player, int index, MapObject mapObject) {}

    // Powder Barrel
    public static void mapObject11245(Player player, int index, MapObject mapObject) {}

    // Repair Locker
    public static void mapObject11246(Player player, int index, MapObject mapObject) {}

    // Repair Locker
    public static void mapObject11247(Player player, int index, MapObject mapObject) {}

    // Gun Locker
    public static void mapObject11248(Player player, int index, MapObject mapObject) {}

    // Gun Locker
    public static void mapObject11249(Player player, int index, MapObject mapObject) {}


   /* 11264 - 11519 */

    // Ship's ladder
    public static void mapObject11289(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject11290(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject11308(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject11309(Player player, int index, MapObject mapObject) {}

    // Climbing net
    public static void mapObject11310(Player player, int index, MapObject mapObject) {}

    // Ship hull
    public static void mapObject11317(Player player, int index, MapObject mapObject) {}

    // Ship hull
    public static void mapObject11318(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject11338(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Interdimensional rift
    public static void mapObject11354(Player player, int index, MapObject mapObject) {}

    // Interdimensional rift
    public static void mapObject11355(Player player, int index, MapObject mapObject) {}

    // Portal Home
    public static void mapObject11356(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11358(Player player, int index, MapObject mapObject) {}

    // Interdimensional rift
    public static void mapObject11359(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11360(Player player, int index, MapObject mapObject) {}

    // Tightrope
    public static void mapObject11361(Player player, int index, MapObject mapObject) {}

    // Tightrope
    public static void mapObject11364(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11365(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject11366(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject11367(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject11368(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject11369(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject11370(Player player, int index, MapObject mapObject) {}

    // Edge
    public static void mapObject11371(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject11373(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2729 || player.getY() != 3489) {
            return;
        }
        if (player.getSkills().getLevel(Skills.AGILITY) < 60) {
            player.getGameEncoder().sendMessage("You need an Agility level of 60 to use this course.");
            return;
        }
        Tile toTile1 = new Tile(2729, 3488, 1);
        Tile toTile2 = new Tile(2729, 3491, 3);
        player.setFaceTile(toTile2);
        player.getMovement().animatedTeleport(toTile1, 3063, null, 1);
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 1) {
                    player.getMovement().animatedTeleport(toTile2, 1120, null, 2);
                } else if (super.getExecutions() == 4) {
                    super.stop();
                    int xp = 45;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject11374(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2721 || player.getY() != 3494) {
            return;
        }
        Tile toTile1 = new Tile(2719, 3495, 2);
        Tile toTile2 = new Tile(2713, 3494, 2);
        int direction = Tile.WEST;
        player.setFaceTile(toTile2);
        player.setAnimation(2588);
        player.setForceMovement(new ForceMovement(player, 0, toTile1, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 0) {
                    player.getMovement().teleport(toTile1);
                    player.setForceMovement(new ForceMovement(direction));
                    player.setAnimation(-1);
                } else if (super.getExecutions() == 1) {
                    player.setAnimation(2588);
                    player.setForceMovement(new ForceMovement(player, 0, toTile2, 4, direction));
                } else if (super.getExecutions() == 2) {
                    player.unlock();
                    player.getMovement().teleport(toTile2);
                    player.setForceMovement(new ForceMovement(direction));
                    player.setAnimation(-1);
                    int xp = 20;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject11375(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2710 && player.getX() != 2711 || player.getY() != 3477) {
            return;
        }
        Tile toTile1 = new Tile(2710, 3474, 1);
        Tile toTile2 = new Tile(2710, 3472, 3);
        int direction = Tile.SOUTH;
        player.setFaceTile(toTile2);
        player.setAnimation(2588);
        player.setForceMovement(new ForceMovement(player, 0, toTile1, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 0) {
                    player.getMovement().teleport(toTile1);
                    player.setForceMovement(new ForceMovement(direction));
                    player.setAnimation(1120);
                } else if (super.getExecutions() == 2) {
                    player.unlock();
                    player.getMovement().teleport(toTile2);
                    player.setAnimation(-1);
                    int xp = 35;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject11376(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2702 || player.getY() != 3470) {
            return;
        }
        int direction = Tile.SOUTH;
        player.setAnimation(2588);
        Tile toTile = new Tile(2702, 3465, 2);
        player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                int xp = 15;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Edge
    public static void mapObject11377(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2702 || player.getY() != 3464) {
            return;
        }
        Tile toTile = new Tile(2704, 3464, 0);
        player.setFaceTile(toTile);
        player.getMovement().animatedTeleport(toTile, 7133, null, 0);
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 435;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (Utils.randomE(6) == 0) {
                    int amount = 4;
                    if (player.getGoldMember()) {
                        amount = 6;
                    }
                    player.getInventory().addOrDropItem(11849, amount);
                }
                if (Utils.randomE(2) == 0) {
                    int rewardType = Utils.randomE(3);
                    if (rewardType == 0) {
                        player.getInventory().addOrDropItem(3009, 1);
                    } else if (rewardType == 1) {
                        player.getInventory().addOrDropItem(3017, 1);
                    } else if (rewardType == 2) {
                        player.getInventory().addOrDropItem(12640, 4);
                    }
                }
                player.getFamiliar().rollSkillPet(Skills.AGILITY, 35205, 20659);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tightrope
    public static void mapObject11378(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2710) {
            return;
        }
        Tile toTile = new Tile(mapObject.getX(), 3480, mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(762);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 20;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Basket
    public static void mapObject11380(Player player, int index, MapObject mapObject) {}

    // Market stall
    public static void mapObject11381(Player player, int index, MapObject mapObject) {}

    // Banner
    public static void mapObject11382(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11383(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject11384(Player player, int index, MapObject mapObject) {}

    // Rough wall
    public static void mapObject11385(Player player, int index, MapObject mapObject) {}

    // Monkeybars
    public static void mapObject11386(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject11389(Player player, int index, MapObject mapObject) {}

    // Drying line
    public static void mapObject11390(Player player, int index, MapObject mapObject) {}

    // Rough wall
    public static void mapObject11391(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2625 || player.getY() != 3677) {
            return;
        }
        if (player.getSkills().getLevel(Skills.AGILITY) < 80) {
            player.getGameEncoder().sendMessage("You need an Agility level of 80 to use this course.");
            return;
        }
        Tile toTile = new Tile(2625, 3675, 3);
        player.getMovement().ladderUpTeleport(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 20;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject11392(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2622 || player.getY() != 3672) {
            return;
        }
        int direction = Tile.SOUTH;
        player.setAnimation(6132);
        Tile toTile = new Tile(2622, 3668, 3);
        player.setForceMovement(new ForceMovement(player, 1, toTile, 2, direction));
        player.lock();
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                int xp = 30;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tightrope
    public static void mapObject11393(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2622 || player.getY() != 3658) {
            return;
        }
        Tile toTile = new Tile(2627, 3654, mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(762);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 40;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject11395(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2629 || player.getY() != 3655) {
            return;
        }
        player.setAnimation(6132);
        Tile toTile1 = new Tile(2629, 3658, 3);
        Tile toTile2 = new Tile(2635, 3658, 3);
        Tile toTile3 = new Tile(2640, 3652, 3);
        player.setForceMovement(new ForceMovement(player, 1, toTile1, 2, Tile.NORTH));
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event() {
            boolean reachedRope = false;

            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 0) {
                    return;
                } else if (super.getExecutions() == 1) {
                    player.getMovement().teleport(toTile1);
                } else if (super.getExecutions() == 2) {
                    player.getMovement().clear();
                    player.getMovement().addMovement(toTile2);
                    player.getAppearance().setForceMoveAnimation(754);
                } else if (!reachedRope) {
                    if (player.getX() == toTile2.getX() && player.getY() == toTile2.getY()) {
                        reachedRope = true;
                        player.getMovement().clear();
                        player.getMovement().addMovement(toTile3);
                        player.getAppearance().setForceMoveAnimation(762);
                    }
                } else if (player.getX() == toTile3.getX() && player.getY() == toTile3.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 85;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject11396(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2643 || player.getY() != 3653) {
            return;
        }
        int direction = Tile.NORTH;
        player.setAnimation(6132);
        Tile toTile = new Tile(2643, 3657, 3);
        player.setForceMovement(new ForceMovement(player, 1, toTile, 2, direction));
        player.lock();
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                int xp = 25;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tightrope
    public static void mapObject11397(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2647 || player.getY() != 3662) {
            return;
        }
        Tile toTile = new Tile(2655, 3670, 3);
        player.getMovement().clear();
        player.getMovement().addMovement(2647, 3663);
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(762);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 105;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Our lives
    public static void mapObject11398(Player player, int index, MapObject mapObject) {
        if (index == 1) {
            player.getController().stop();
        }
    }

    // Cave entrance
    public static void mapObject11399(Player player, int index, MapObject mapObject) {}

    // Web
    public static void mapObject11400(Player player, int index, MapObject mapObject) {}

    // Pile of fish
    public static void mapObject11404(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2655 || player.getY() != 3676) {
            return;
        }
        Tile toTile = new Tile(2652, 3676, 0);
        player.getMovement().animatedTeleport(toTile, 7133, null, 0);
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 475;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (Utils.randomE(4) == 0) {
                    int amount = 4;
                    if (player.getGoldMember()) {
                        amount = 6;
                    }
                    player.getInventory().addOrDropItem(11849, amount);
                }
                if (Utils.randomE(2) == 0) {
                    int rewardType = Utils.randomE(3);
                    if (rewardType == 0) {
                        player.getInventory().addOrDropItem(3009, 1);
                    } else if (rewardType == 1) {
                        player.getInventory().addOrDropItem(3017, 1);
                    } else if (rewardType == 2) {
                        player.getInventory().addOrDropItem(12640, 4);
                    }
                }
                player.getFamiliar().rollSkillPet(Skills.AGILITY, 31063, 20659);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Wooden Beams
    public static void mapObject11405(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11406(Player player, int index, MapObject mapObject) {}

    // Dug hole
    public static void mapObject11417(Player player, int index, MapObject mapObject) {}

    // Grill
    public static void mapObject11422(Player player, int index, MapObject mapObject) {}

    // Grill
    public static void mapObject11423(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11429(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11430(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject11441(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11450(Player player, int index, MapObject mapObject) {}

    // Lever A
    public static void mapObject11451(Player player, int index, MapObject mapObject) {}

    // Lever A
    public static void mapObject11452(Player player, int index, MapObject mapObject) {}

    // Lever B
    public static void mapObject11453(Player player, int index, MapObject mapObject) {}

    // Lever B
    public static void mapObject11454(Player player, int index, MapObject mapObject) {}

    // Lever C
    public static void mapObject11455(Player player, int index, MapObject mapObject) {}

    // Lever C
    public static void mapObject11456(Player player, int index, MapObject mapObject) {}

    // Lever D
    public static void mapObject11457(Player player, int index, MapObject mapObject) {}

    // Lever D
    public static void mapObject11458(Player player, int index, MapObject mapObject) {}

    // Lever E
    public static void mapObject11459(Player player, int index, MapObject mapObject) {}

    // Lever E
    public static void mapObject11460(Player player, int index, MapObject mapObject) {}

    // Lever F
    public static void mapObject11461(Player player, int index, MapObject mapObject) {}

    // Lever F
    public static void mapObject11462(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11470(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11471(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11483(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject11485(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject11486(Player player, int index, MapObject mapObject) {}

    // Cabbage
    public static void mapObject11494(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11498(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11499(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11511(Player player, int index, MapObject mapObject) {}


   /* 11520 - 11775 */

    // Crates
    public static void mapObject11600(Player player, int index, MapObject mapObject) {}

    // Pottery Oven
    public static void mapObject11601(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11616(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11617(Player player, int index, MapObject mapObject) {}

    // Longhall door
    public static void mapObject11620(Player player, int index, MapObject mapObject) {}

    // Longhall door
    public static void mapObject11621(Player player, int index, MapObject mapObject) {}

    // Longhall door
    public static void mapObject11624(Player player, int index, MapObject mapObject) {}

    // Longhall door
    public static void mapObject11625(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject11629(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11630(Player player, int index, MapObject mapObject) {}

    // Plank
    public static void mapObject11631(Player player, int index, MapObject mapObject) {}

    // Steep roof
    public static void mapObject11633(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11634(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11635(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject11636(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject11637(Player player, int index, MapObject mapObject) {}

    // Hurdle
    public static void mapObject11638(Player player, int index, MapObject mapObject) {}

    // Hurdle
    public static void mapObject11639(Player player, int index, MapObject mapObject) {}

    // Hurdle
    public static void mapObject11640(Player player, int index, MapObject mapObject) {}

    // Skull slope
    public static void mapObject11641(Player player, int index, MapObject mapObject) {}

    // Zip line
    public static void mapObject11644(Player player, int index, MapObject mapObject) {}

    // Zip line
    public static void mapObject11645(Player player, int index, MapObject mapObject) {}

    // Zip line
    public static void mapObject11646(Player player, int index, MapObject mapObject) {}

    // Pipe
    public static void mapObject11657(Player player, int index, MapObject mapObject) {}

    // Tower ladder
    public static void mapObject11661(Player player, int index, MapObject mapObject) {}

    // Tower ladder
    public static void mapObject11662(Player player, int index, MapObject mapObject) {}

    // Target
    public static void mapObject11663(Player player, int index, MapObject mapObject) {}

    // Guild door
    public static void mapObject11665(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject11666(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject11667(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject11668(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject11672(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject11673(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject11674(Player player, int index, MapObject mapObject) {}

    // Dwarven Stout
    public static void mapObject11675(Player player, int index, MapObject mapObject) {}

    // Mature Dwarven Stout
    public static void mapObject11676(Player player, int index, MapObject mapObject) {}

    // Asgarnian Ale
    public static void mapObject11677(Player player, int index, MapObject mapObject) {}

    // Mature Asgarnian Ale
    public static void mapObject11678(Player player, int index, MapObject mapObject) {}

    // Greenmans Ale
    public static void mapObject11679(Player player, int index, MapObject mapObject) {}

    // Mature Greenmans Ale
    public static void mapObject11680(Player player, int index, MapObject mapObject) {}

    // Wizards Mind Bomb
    public static void mapObject11681(Player player, int index, MapObject mapObject) {}

    // Mature Wizards Mind Bomb
    public static void mapObject11682(Player player, int index, MapObject mapObject) {}

    // Dragon Bitter
    public static void mapObject11683(Player player, int index, MapObject mapObject) {}

    // Mature Dragon Bitter
    public static void mapObject11684(Player player, int index, MapObject mapObject) {}

    // Moonlight Mead
    public static void mapObject11685(Player player, int index, MapObject mapObject) {}

    // Mature Moonlight Mead
    public static void mapObject11686(Player player, int index, MapObject mapObject) {}

    // Axeman's Folly
    public static void mapObject11687(Player player, int index, MapObject mapObject) {}

    // Mature Axeman's Folly
    public static void mapObject11688(Player player, int index, MapObject mapObject) {}

    // Chef's Delight
    public static void mapObject11689(Player player, int index, MapObject mapObject) {}

    // Mature Chef's Delight
    public static void mapObject11690(Player player, int index, MapObject mapObject) {}

    // Slayer's Respite
    public static void mapObject11691(Player player, int index, MapObject mapObject) {}

    // Mature Slayer's Respite
    public static void mapObject11692(Player player, int index, MapObject mapObject) {}

    // Cider
    public static void mapObject11693(Player player, int index, MapObject mapObject) {}

    // Mature Cider
    public static void mapObject11694(Player player, int index, MapObject mapObject) {}

    // Dairy churn
    public static void mapObject11695(Player player, int index, MapObject mapObject) {}

    // Dairy churn
    public static void mapObject11696(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Zul-Andra teleport</col>
    public static void mapObject11701(Player player, int index, MapObject mapObject) {}

    // Telescope
    public static void mapObject11702(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject11703(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Door
    public static void mapObject11719(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11720(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject11721(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject11722(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11723(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11724(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11725(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11726(Player player, int index, MapObject mapObject) {
        if (mapObject.isBusy()) {
            return;
        }
        if ((mapObject.getDirection() == 0 || mapObject.getDirection() == 2) && player.getY() != mapObject.getY()) {
            return;
        } else if ((mapObject.getDirection() == 1 || mapObject.getDirection() == 3)
                && player.getX() != mapObject.getX()) {
            return;
        }
        if (index == 1) {
            player.getGameEncoder().sendMessage("You attempt to pick the lock.");
        }
        if (index == 1 && !player.getInventory().hasItem(1523)) {
            player.getGameEncoder().sendMessage("You need a lockpick for this lock.");
            return;
        }
        if (player.getX() != mapObject.getX() || player.getY() != mapObject.getY()) {
            if (index == 1) {
                player.getGameEncoder().sendMessage("The door is already unlocked.");
                return;
            }
        } else {
            if (index == 0) {
                player.getGameEncoder().sendMessage("The door is locked.");
                return;
            } else if (Utils.randomE(4) != 0) {
                player.getGameEncoder().sendMessage("You fail to pick the lock.");
                return;
            }
        }
        if (index == 0) {
            player.getGameEncoder().sendMessage("You go through the door.");
        } else if (index == 1) {
            player.getGameEncoder().sendMessage("You manage to pick the lock.");
        }
        player.getMovement().clear();
        if (mapObject.getDirection() == 0) {
            if (player.getX() == mapObject.getX()) {
                player.getMovement().addMovement(mapObject.getX() - 1, mapObject.getY());
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
        } else if (mapObject.getDirection() == 1) {
            if (player.getY() == mapObject.getY()) {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY() + 1);
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
        } else if (mapObject.getDirection() == 2) {
            if (player.getX() == mapObject.getX()) {
                player.getMovement().addMovement(mapObject.getX() + 1, mapObject.getY());
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
        } else if (mapObject.getDirection() == 3) {
            if (player.getY() == mapObject.getY()) {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY() - 1);
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
        }
        Region.openDoor(player, mapObject, 1, false, false);
    }

    // Door
    public static void mapObject11727(Player player, int index, MapObject mapObject) {
        if (mapObject.isBusy()) {
            return;
        }
        if ((mapObject.getDirection() == 0 || mapObject.getDirection() == 2) && player.getY() != mapObject.getY()) {
            return;
        } else if ((mapObject.getDirection() == 1 || mapObject.getDirection() == 3)
                && player.getX() != mapObject.getX()) {
            return;
        }
        if (index == 1) {
            player.getGameEncoder().sendMessage("You attempt to pick the lock.");
        }
        if (index == 1 && !player.getInventory().hasItem(1523)) {
            player.getGameEncoder().sendMessage("You need a lockpick for this lock.");
            return;
        }
        if (player.getX() == mapObject.getX() && player.getY() == mapObject.getY()) {
            if (index == 1) {
                player.getGameEncoder().sendMessage("The door is already unlocked.");
                return;
            }
        } else {
            if (index == 0) {
                player.getGameEncoder().sendMessage("The door is locked.");
                return;
            } else if (Utils.randomE(4) != 0) {
                player.getGameEncoder().sendMessage("You fail to pick the lock.");
                return;
            }
        }
        if (index == 0) {
            player.getGameEncoder().sendMessage("You go through the door.");
        } else if (index == 1) {
            player.getGameEncoder().sendMessage("You manage to pick the lock.");
        }
        player.getMovement().clear();
        if (mapObject.getDirection() == 0) {
            if (player.getX() == mapObject.getX()) {
                player.getMovement().addMovement(mapObject.getX() - 1, mapObject.getY());
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
        } else if (mapObject.getDirection() == 1) {
            if (player.getY() == mapObject.getY()) {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY() + 1);
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
        } else if (mapObject.getDirection() == 2) {
            if (player.getX() == mapObject.getX()) {
                player.getMovement().addMovement(mapObject.getX() + 1, mapObject.getY());
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
        } else if (mapObject.getDirection() == 3) {
            if (player.getY() == mapObject.getY()) {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY() - 1);
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
        }
        Region.openDoor(player, mapObject, 1, false, false);
    }

    // Door
    public static void mapObject11728(Player player, int index, MapObject mapObject) {}

    // Silk stall
    public static void mapObject11729(Player player, int index, MapObject mapObject) {}

    // Baker's stall
    public static void mapObject11730(Player player, int index, MapObject mapObject) {}

    // Gem stall
    public static void mapObject11731(Player player, int index, MapObject mapObject) {}

    // Fur stall
    public static void mapObject11732(Player player, int index, MapObject mapObject) {}

    // Spice stall
    public static void mapObject11733(Player player, int index, MapObject mapObject) {}

    // Silver stall
    public static void mapObject11734(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject11735(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject11736(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject11737(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject11738(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject11739(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject11740(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject11741(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject11742(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject11745(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject11747(Player player, int index, MapObject mapObject) {}

    // Grape vine
    public static void mapObject11748(Player player, int index, MapObject mapObject) {}

    // Grape vine
    public static void mapObject11750(Player player, int index, MapObject mapObject) {}

    // Grape vine
    public static void mapObject11752(Player player, int index, MapObject mapObject) {}

    // Grape vine
    public static void mapObject11754(Player player, int index, MapObject mapObject) {}

    // Grape vine
    public static void mapObject11756(Player player, int index, MapObject mapObject) {}

    // Grape vine
    public static void mapObject11758(Player player, int index, MapObject mapObject) {}

    // Dead vine
    public static void mapObject11760(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11763(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject11766(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject11767(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject11768(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject11770(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject11771(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11772(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11773(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11774(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11775(Player player, int index, MapObject mapObject) {}


   /* 11776 - 12031 */

    // Door
    public static void mapObject11776(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11777(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11778(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11780(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11782(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11783(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11788(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11789(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11790(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11791(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11792(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11793(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11794(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11795(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11796(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11797(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11798(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11799(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11800(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11801(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11802(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11803(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11804(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11805(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject11806(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11807(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject11810(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject11811(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject11812(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject11813(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject11814(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject11815(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject11816(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject11817(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject11833(Player player, int index, MapObject mapObject) {
        player.openDialogue("tzhaar", 0);
    }

    // Cave entrance
    public static void mapObject11834(Player player, int index, MapObject mapObject) {
        player.getCombat().getTzHaar().exitFightCave();
    }

    // Cave entrance
    public static void mapObject11835(Player player, int index, MapObject mapObject) {}

    // Cave exit
    public static void mapObject11836(Player player, int index, MapObject mapObject) {}

    // Hot vent door
    public static void mapObject11844(Player player, int index, MapObject mapObject) {}

    // Hot vent door
    public static void mapObject11845(Player player, int index, MapObject mapObject) {}

    // Hot vent door
    public static void mapObject11846(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject11867(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11888(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11889(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11890(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject11947(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject11948(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject11949(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject11951(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject11952(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject11953(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject11954(Player player, int index, MapObject mapObject) {}

    // Lava forge
    public static void mapObject11978(Player player, int index, MapObject mapObject) {}

    // Viewing orb
    public static void mapObject11979(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject11987(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject11999(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject12003(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // A gap through the wall
    public static void mapObject12004(Player player, int index, MapObject mapObject) {}


   /* 12032 - 12287 */

    // A gap through the wall
    public static void mapObject12041(Player player, int index, MapObject mapObject) {}

    // Magic door
    public static void mapObject12045(Player player, int index, MapObject mapObject) {}

    // Magic door
    public static void mapObject12046(Player player, int index, MapObject mapObject) {}

    // Magic door
    public static void mapObject12047(Player player, int index, MapObject mapObject) {}

    // Magic door
    public static void mapObject12048(Player player, int index, MapObject mapObject) {}

    // Healing certificate
    public static void mapObject12064(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject12094(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Fairy ring
    public static void mapObject12095(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Furnace
    public static void mapObject12100(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject12103(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject12104(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject12105(Player player, int index, MapObject mapObject) {}

    // Dairy Cow
    public static void mapObject12111(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12112(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12113(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject12120(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject12121(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject12128(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Display case
    public static void mapObject12137(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject12138(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject12139(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12144(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12146(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12147(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12148(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12149(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12150(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12151(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12152(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12153(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12154(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12155(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12156(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12157(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12158(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12163(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12164(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12165(Player player, int index, MapObject mapObject) {}

    // Canoe Station
    public static void mapObject12166(Player player, int index, MapObject mapObject) {}

    // Mole hill
    public static void mapObject12202(Player player, int index, MapObject mapObject) {
        player.openDialogue("bossinstance", 6);
    }

    // Rope
    public static void mapObject12230(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject12232(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject12233(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject12234(Player player, int index, MapObject mapObject) {}

    // Vanilla plant
    public static void mapObject12239(Player player, int index, MapObject mapObject) {}

    // Tunnel entrance
    public static void mapObject12254(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject12255(Player player, int index, MapObject mapObject) {}

    // Nest
    public static void mapObject12256(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject12260(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject12263(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject12264(Player player, int index, MapObject mapObject) {}

    // Cellar stairs
    public static void mapObject12265(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject12266(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject12267(Player player, int index, MapObject mapObject) {}

    // Open trapdoor
    public static void mapObject12268(Player player, int index, MapObject mapObject) {}


   /* 12288 - 12543 */

    // Chest
    public static void mapObject12308(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject12309(Player player, int index, MapObject mapObject) {
        player.openDialogue("recipefordisaster", 0);
    }

    // Chair
    public static void mapObject12329(Player player, int index, MapObject mapObject) {}

    // Dwarf
    public static void mapObject12330(Player player, int index, MapObject mapObject) {}

    // General Bentnoze
    public static void mapObject12331(Player player, int index, MapObject mapObject) {}

    // General Bentnoze
    public static void mapObject12332(Player player, int index, MapObject mapObject) {}

    // General Wartface
    public static void mapObject12333(Player player, int index, MapObject mapObject) {}

    // General Wartface
    public static void mapObject12334(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject12336(Player player, int index, MapObject mapObject) {}

    // Pirate Pete
    public static void mapObject12337(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject12338(Player player, int index, MapObject mapObject) {}

    // Lumbridge Guide
    public static void mapObject12339(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject12340(Player player, int index, MapObject mapObject) {}

    // Evil Dave
    public static void mapObject12341(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject12342(Player player, int index, MapObject mapObject) {}

    // Skrach Uglogwee
    public static void mapObject12343(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject12344(Player player, int index, MapObject mapObject) {}

    // Sir Amik Varze
    public static void mapObject12345(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject12346(Player player, int index, MapObject mapObject) {}

    // Awowogei
    public static void mapObject12347(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject12348(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject12349(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject12350(Player player, int index, MapObject mapObject) {}

    // Barrier
    public static void mapObject12351(Player player, int index, MapObject mapObject) {}

    // Barrier
    public static void mapObject12352(Player player, int index, MapObject mapObject) {}

    // Barrier
    public static void mapObject12353(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject12354(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject12355(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject12356(Player player, int index, MapObject mapObject) {
        player.getController().stop();
    }

    // Ladder
    public static void mapObject12389(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12390(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12391(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject12444(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject12445(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject12446(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject12447(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject12448(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject12449(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject12451(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject12452(Player player, int index, MapObject mapObject) {}

    // Underwater Cavern Entrance
    public static void mapObject12460(Player player, int index, MapObject mapObject) {}

    // Underwater Cavern Entrance
    public static void mapObject12461(Player player, int index, MapObject mapObject) {}

    // Underwater Cavern Entrance
    public static void mapObject12462(Player player, int index, MapObject mapObject) {}

    // Underwater Cavern Entrance
    public static void mapObject12463(Player player, int index, MapObject mapObject) {}

    // Pen Door
    public static void mapObject12467(Player player, int index, MapObject mapObject) {}

    // Pen Door
    public static void mapObject12468(Player player, int index, MapObject mapObject) {}

    // Anchor
    public static void mapObject12475(Player player, int index, MapObject mapObject) {}

    // Kelp
    public static void mapObject12478(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject12536(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject12537(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject12538(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject12539(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject12540(Player player, int index, MapObject mapObject) {}


   /* 12544 - 12799 */

    // Boxes
    public static void mapObject12545(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject12546(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject12547(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject12548(Player player, int index, MapObject mapObject) {}

    // Pile of Rock
    public static void mapObject12564(Player player, int index, MapObject mapObject) {}

    // Pile of Rock
    public static void mapObject12565(Player player, int index, MapObject mapObject) {}

    // Pile of Rock
    public static void mapObject12566(Player player, int index, MapObject mapObject) {}

    // Pile of Rock
    public static void mapObject12567(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject12598(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject12599(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject12600(Player player, int index, MapObject mapObject) {}

    // Bronze axe
    public static void mapObject12604(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject12617(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject12639(Player player, int index, MapObject mapObject) {}

    // Small furnace
    public static void mapObject12655(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject12656(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject12657(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject12658(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject12719(Player player, int index, MapObject mapObject) {}

    // Colony gate
    public static void mapObject12723(Player player, int index, MapObject mapObject) {}

    // Colony gate
    public static void mapObject12725(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject12734(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject12735(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject12736(Player player, int index, MapObject mapObject) {}

    // Broken down wall
    public static void mapObject12737(Player player, int index, MapObject mapObject) {}

    // Fallen Wall
    public static void mapObject12741(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject12743(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject12744(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject12745(Player player, int index, MapObject mapObject) {}

    // Rubble
    public static void mapObject12746(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12748(Player player, int index, MapObject mapObject) {}

    // Rubble Pile
    public static void mapObject12749(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject12750(Player player, int index, MapObject mapObject) {}

    // Broken Roof
    public static void mapObject12751(Player player, int index, MapObject mapObject) {}

    // Damaged wall
    public static void mapObject12752(Player player, int index, MapObject mapObject) {}

    // Bank Booth
    public static void mapObject12759(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Damaged wall
    public static void mapObject12760(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject12761(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject12762(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject12763(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12764(Player player, int index, MapObject mapObject) {}

    // Keyhole
    public static void mapObject12765(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject12766(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject12767(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject12768(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject12769(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject12770(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject12771(Player player, int index, MapObject mapObject) {}

    // Marius
    public static void mapObject12775(Player player, int index, MapObject mapObject) {}

    // Low fence
    public static void mapObject12776(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12779(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12780(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12781(Player player, int index, MapObject mapObject) {}

    // Broken Roof
    public static void mapObject12782(Player player, int index, MapObject mapObject) {}

    // Repaired roof
    public static void mapObject12783(Player player, int index, MapObject mapObject) {}

    // Damaged wall
    public static void mapObject12787(Player player, int index, MapObject mapObject) {}

    // Bank Booth
    public static void mapObject12798(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank Booth
    public static void mapObject12799(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }


   /* 12800 - 13055 */

    // Tomb
    public static void mapObject12802(Player player, int index, MapObject mapObject) {}

    // Broken furnace
    public static void mapObject12805(Player player, int index, MapObject mapObject) {}

    // Broken furnace
    public static void mapObject12806(Player player, int index, MapObject mapObject) {}

    // Repaired furnace
    public static void mapObject12807(Player player, int index, MapObject mapObject) {}

    // Repaired furnace
    public static void mapObject12808(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject12809(Player player, int index, MapObject mapObject) {}

    // Rubble
    public static void mapObject12812(Player player, int index, MapObject mapObject) {}

    // Rubble
    public static void mapObject12813(Player player, int index, MapObject mapObject) {}

    // Rubble
    public static void mapObject12814(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject12816(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject12817(Player player, int index, MapObject mapObject) {}

    // Exit path
    public static void mapObject12820(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12906(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12907(Player player, int index, MapObject mapObject) {}

    // Fountain
    public static void mapObject12941(Player player, int index, MapObject mapObject) {}

    // Sq'irk tree
    public static void mapObject12943(Player player, int index, MapObject mapObject) {}

    // Boat
    public static void mapObject12944(Player player, int index, MapObject mapObject) {}

    // Boat
    public static void mapObject12945(Player player, int index, MapObject mapObject) {}

    // Boat Chute
    public static void mapObject12947(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject12963(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12964(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12965(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject12966(Player player, int index, MapObject mapObject) {}

    // Stile
    public static void mapObject12982(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject12986(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject12987(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject12988(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject12989(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13001(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13002(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13006(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13007(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13008(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13009(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13015(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13016(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13017(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13018(Player player, int index, MapObject mapObject) {}


   /* 13056 - 13311 */

    // Large door
    public static void mapObject13094(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject13095(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject13096(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject13097(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13100(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13101(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13102(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13103(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13107(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13108(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13109(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13110(Player player, int index, MapObject mapObject) {}

    // Ornament
    public static void mapObject13114(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13118(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13119(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13120(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13121(Player player, int index, MapObject mapObject) {}

    // Boxing mat
    public static void mapObject13126(Player player, int index, MapObject mapObject) {}

    // Boxing mat
    public static void mapObject13127(Player player, int index, MapObject mapObject) {}

    // Boxing mat
    public static void mapObject13128(Player player, int index, MapObject mapObject) {}

    // Boxing ring
    public static void mapObject13129(Player player, int index, MapObject mapObject) {}

    // Boxing ring
    public static void mapObject13130(Player player, int index, MapObject mapObject) {}

    // Boxing ring
    public static void mapObject13131(Player player, int index, MapObject mapObject) {}

    // Boxing ring
    public static void mapObject13132(Player player, int index, MapObject mapObject) {}

    // Fencing ring
    public static void mapObject13133(Player player, int index, MapObject mapObject) {}

    // Fencing ring
    public static void mapObject13134(Player player, int index, MapObject mapObject) {}

    // Fencing ring
    public static void mapObject13135(Player player, int index, MapObject mapObject) {}

    // Fencing ring
    public static void mapObject13136(Player player, int index, MapObject mapObject) {}

    // Combat ring
    public static void mapObject13137(Player player, int index, MapObject mapObject) {}

    // Combat ring
    public static void mapObject13138(Player player, int index, MapObject mapObject) {}

    // Combat ring
    public static void mapObject13139(Player player, int index, MapObject mapObject) {}

    // Combat ring
    public static void mapObject13140(Player player, int index, MapObject mapObject) {}

    // Nothing
    public static void mapObject13141(Player player, int index, MapObject mapObject) {}

    // Balance beam
    public static void mapObject13142(Player player, int index, MapObject mapObject) {}

    // Balance beam
    public static void mapObject13143(Player player, int index, MapObject mapObject) {}

    // Balance beam
    public static void mapObject13144(Player player, int index, MapObject mapObject) {}

    // Magic barrier
    public static void mapObject13145(Player player, int index, MapObject mapObject) {}

    // Magic barrier
    public static void mapObject13146(Player player, int index, MapObject mapObject) {}

    // Ranging spot
    public static void mapObject13147(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject13148(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject13149(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject13150(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject13151(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject13152(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject13153(Player player, int index, MapObject mapObject) {}

    // Bed
    public static void mapObject13154(Player player, int index, MapObject mapObject) {}

    // Shoe box
    public static void mapObject13155(Player player, int index, MapObject mapObject) {}

    // Oak drawers
    public static void mapObject13156(Player player, int index, MapObject mapObject) {}

    // Oak wardrobe
    public static void mapObject13157(Player player, int index, MapObject mapObject) {}

    // Teak drawers
    public static void mapObject13158(Player player, int index, MapObject mapObject) {}

    // Teak wardrobe
    public static void mapObject13159(Player player, int index, MapObject mapObject) {}

    // Mahogany Wardrobe
    public static void mapObject13160(Player player, int index, MapObject mapObject) {}

    // Gilded wardrobe
    public static void mapObject13161(Player player, int index, MapObject mapObject) {}

    // Shaving stand
    public static void mapObject13162(Player player, int index, MapObject mapObject) {}

    // Shaving stand
    public static void mapObject13163(Player player, int index, MapObject mapObject) {}

    // Dresser
    public static void mapObject13164(Player player, int index, MapObject mapObject) {}

    // Dresser
    public static void mapObject13165(Player player, int index, MapObject mapObject) {}

    // Dresser
    public static void mapObject13166(Player player, int index, MapObject mapObject) {}

    // Dresser
    public static void mapObject13167(Player player, int index, MapObject mapObject) {}

    // Dresser
    public static void mapObject13168(Player player, int index, MapObject mapObject) {}

    // Clock
    public static void mapObject13169(Player player, int index, MapObject mapObject) {}

    // Clock
    public static void mapObject13170(Player player, int index, MapObject mapObject) {}

    // Clock
    public static void mapObject13171(Player player, int index, MapObject mapObject) {}

    // Symbol of Saradomin
    public static void mapObject13172(Player player, int index, MapObject mapObject) {}

    // Symbol of Zamorak
    public static void mapObject13173(Player player, int index, MapObject mapObject) {}

    // Symbol of Guthix
    public static void mapObject13174(Player player, int index, MapObject mapObject) {}

    // Icon of Saradomin
    public static void mapObject13175(Player player, int index, MapObject mapObject) {}

    // Icon of Zamorak
    public static void mapObject13176(Player player, int index, MapObject mapObject) {}

    // Icon of Guthix
    public static void mapObject13177(Player player, int index, MapObject mapObject) {}

    // Icon of Bob
    public static void mapObject13178(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject13179(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13180(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13181(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13182(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13183(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13184(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13185(Player player, int index, MapObject mapObject) {
        if (player.getController().inPvPWorldCombat()) {
            player.getGameEncoder().sendMessage("You can't use this here.");
            return;
        }
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13186(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13187(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13188(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13189(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13190(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13191(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13192(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13193(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13194(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13195(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13196(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13197(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13198(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Altar
    public static void mapObject13199(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Torch
    public static void mapObject13200(Player player, int index, MapObject mapObject) {}

    // Torch
    public static void mapObject13201(Player player, int index, MapObject mapObject) {}

    // Torch
    public static void mapObject13202(Player player, int index, MapObject mapObject) {}

    // Torch
    public static void mapObject13203(Player player, int index, MapObject mapObject) {}

    // Torch
    public static void mapObject13204(Player player, int index, MapObject mapObject) {}

    // Torch
    public static void mapObject13205(Player player, int index, MapObject mapObject) {}

    // Torch
    public static void mapObject13206(Player player, int index, MapObject mapObject) {}

    // Torch
    public static void mapObject13207(Player player, int index, MapObject mapObject) {}

    // Incense burner
    public static void mapObject13208(Player player, int index, MapObject mapObject) {}

    // Incense burner
    public static void mapObject13209(Player player, int index, MapObject mapObject) {}

    // Incense burner
    public static void mapObject13210(Player player, int index, MapObject mapObject) {}

    // Incense burner
    public static void mapObject13211(Player player, int index, MapObject mapObject) {}

    // Incense burner
    public static void mapObject13212(Player player, int index, MapObject mapObject) {}

    // Incense burner
    public static void mapObject13213(Player player, int index, MapObject mapObject) {}

    // Windchimes
    public static void mapObject13214(Player player, int index, MapObject mapObject) {}

    // Bells
    public static void mapObject13215(Player player, int index, MapObject mapObject) {}

    // Organ
    public static void mapObject13216(Player player, int index, MapObject mapObject) {}

    // Shuttered window
    public static void mapObject13217(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13218(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13219(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13220(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13221(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13222(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13223(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13224(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13225(Player player, int index, MapObject mapObject) {}

    // Shuttered window
    public static void mapObject13226(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13227(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13228(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13229(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13230(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13231(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13232(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13233(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13234(Player player, int index, MapObject mapObject) {}

    // Shuttered window
    public static void mapObject13235(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13236(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13237(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13238(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13239(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13240(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13241(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13242(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13243(Player player, int index, MapObject mapObject) {}

    // Shuttered window
    public static void mapObject13244(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13245(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13246(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13247(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13248(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13249(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13250(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13251(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13252(Player player, int index, MapObject mapObject) {}

    // Shuttered window
    public static void mapObject13253(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13254(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13255(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13256(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13257(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13258(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13259(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13260(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13261(Player player, int index, MapObject mapObject) {}

    // Shuttered window
    public static void mapObject13262(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13263(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13264(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13265(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13266(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13267(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13268(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject13269(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject13270(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13271(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13272(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13273(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13274(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13275(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13276(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13277(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13278(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13279(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13280(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13281(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject13282(Player player, int index, MapObject mapObject) {}

    // Wooden crate
    public static void mapObject13283(Player player, int index, MapObject mapObject) {}

    // Wooden crate
    public static void mapObject13284(Player player, int index, MapObject mapObject) {}

    // Oak chest
    public static void mapObject13285(Player player, int index, MapObject mapObject) {}

    // Oak chest
    public static void mapObject13286(Player player, int index, MapObject mapObject) {}

    // Teak chest
    public static void mapObject13287(Player player, int index, MapObject mapObject) {}

    // Teak chest
    public static void mapObject13288(Player player, int index, MapObject mapObject) {}

    // Mahogany chest
    public static void mapObject13289(Player player, int index, MapObject mapObject) {}

    // Mahogany chest
    public static void mapObject13290(Player player, int index, MapObject mapObject) {}

    // Magic chest
    public static void mapObject13291(Player player, int index, MapObject mapObject) {}

    // Magic chest
    public static void mapObject13292(Player player, int index, MapObject mapObject) {}

    // Wooden table
    public static void mapObject13293(Player player, int index, MapObject mapObject) {}

    // Oak table
    public static void mapObject13294(Player player, int index, MapObject mapObject) {}

    // Oak table
    public static void mapObject13295(Player player, int index, MapObject mapObject) {}

    // Teak table
    public static void mapObject13296(Player player, int index, MapObject mapObject) {}

    // Teak table
    public static void mapObject13297(Player player, int index, MapObject mapObject) {}

    // Mahogany table
    public static void mapObject13298(Player player, int index, MapObject mapObject) {}

    // Opulent table
    public static void mapObject13299(Player player, int index, MapObject mapObject) {}

    // Wooden bench
    public static void mapObject13300(Player player, int index, MapObject mapObject) {}

    // Oak bench
    public static void mapObject13301(Player player, int index, MapObject mapObject) {}

    // Carved oak bench
    public static void mapObject13302(Player player, int index, MapObject mapObject) {}

    // Teak bench
    public static void mapObject13303(Player player, int index, MapObject mapObject) {}

    // Carved teak bench
    public static void mapObject13304(Player player, int index, MapObject mapObject) {}

    // Mahogany bench
    public static void mapObject13305(Player player, int index, MapObject mapObject) {}

    // Gilded bench
    public static void mapObject13306(Player player, int index, MapObject mapObject) {}

    // Rope bell-pull
    public static void mapObject13307(Player player, int index, MapObject mapObject) {}

    // Bell-pull
    public static void mapObject13308(Player player, int index, MapObject mapObject) {}

    // Posh bell-pull
    public static void mapObject13309(Player player, int index, MapObject mapObject) {}

    // Skeleton
    public static void mapObject13310(Player player, int index, MapObject mapObject) {}

    // Pipe
    public static void mapObject13311(Player player, int index, MapObject mapObject) {}


   /* 13312 - 13567 */

    // Blood
    public static void mapObject13312(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject13313(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13314(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13315(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject13316(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13317(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13318(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject13319(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13320(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13321(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject13322(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13323(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13324(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject13325(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13326(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13327(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject13328(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject13329(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject13330(Player player, int index, MapObject mapObject) {}

    // Slimy water
    public static void mapObject13331(Player player, int index, MapObject mapObject) {}

    // Slimy water
    public static void mapObject13332(Player player, int index, MapObject mapObject) {}

    // Slimy water
    public static void mapObject13333(Player player, int index, MapObject mapObject) {}

    // Spikes
    public static void mapObject13334(Player player, int index, MapObject mapObject) {}

    // Spikes
    public static void mapObject13335(Player player, int index, MapObject mapObject) {}

    // Spikes
    public static void mapObject13336(Player player, int index, MapObject mapObject) {}

    // Fire
    public static void mapObject13337(Player player, int index, MapObject mapObject) {}

    // Torch
    public static void mapObject13341(Player player, int index, MapObject mapObject) {}

    // Candle
    public static void mapObject13342(Player player, int index, MapObject mapObject) {}

    // Skull
    public static void mapObject13343(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13344(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13345(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13346(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13347(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13348(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13349(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13350(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13351(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13352(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13353(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13354(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject13355(Player player, int index, MapObject mapObject) {}

    // Spike trap
    public static void mapObject13356(Player player, int index, MapObject mapObject) {}

    // Man trap
    public static void mapObject13357(Player player, int index, MapObject mapObject) {}

    // Tangle vine
    public static void mapObject13358(Player player, int index, MapObject mapObject) {}

    // Marble trap
    public static void mapObject13359(Player player, int index, MapObject mapObject) {}

    // Teleport trap
    public static void mapObject13360(Player player, int index, MapObject mapObject) {}

    // Spike hidden
    public static void mapObject13361(Player player, int index, MapObject mapObject) {}

    // Man hidden
    public static void mapObject13362(Player player, int index, MapObject mapObject) {}

    // Tangle hidden
    public static void mapObject13363(Player player, int index, MapObject mapObject) {}

    // Marble hidden
    public static void mapObject13364(Player player, int index, MapObject mapObject) {}

    // Teleport hidden
    public static void mapObject13365(Player player, int index, MapObject mapObject) {}

    // Bones
    public static void mapObject13366(Player player, int index, MapObject mapObject) {}

    // Guard dog
    public static void mapObject13367(Player player, int index, MapObject mapObject) {}

    // Hobgoblin
    public static void mapObject13368(Player player, int index, MapObject mapObject) {}

    // Troll
    public static void mapObject13369(Player player, int index, MapObject mapObject) {}

    // Huge Spider
    public static void mapObject13370(Player player, int index, MapObject mapObject) {}

    // Baby red dragon
    public static void mapObject13372(Player player, int index, MapObject mapObject) {}

    // Rocnar
    public static void mapObject13373(Player player, int index, MapObject mapObject) {}

    // Kalphite Soldier
    public static void mapObject13374(Player player, int index, MapObject mapObject) {}

    // Steel dragon
    public static void mapObject13375(Player player, int index, MapObject mapObject) {}

    // Dagannoth
    public static void mapObject13376(Player player, int index, MapObject mapObject) {}

    // Tok-Xil
    public static void mapObject13377(Player player, int index, MapObject mapObject) {}

    // Demon
    public static void mapObject13378(Player player, int index, MapObject mapObject) {}

    // Treasure Hunt Fairy House
    public static void mapObject13379(Player player, int index, MapObject mapObject) {}

    // Treasure Hunt Fairy House
    public static void mapObject13380(Player player, int index, MapObject mapObject) {}

    // Glove Rack
    public static void mapObject13381(Player player, int index, MapObject mapObject) {}

    // Weapons Rack
    public static void mapObject13382(Player player, int index, MapObject mapObject) {}

    // Weapons Rack
    public static void mapObject13383(Player player, int index, MapObject mapObject) {}

    // Oak prize chest
    public static void mapObject13384(Player player, int index, MapObject mapObject) {}

    // Oak prize chest
    public static void mapObject13385(Player player, int index, MapObject mapObject) {}

    // Teak prize chest
    public static void mapObject13386(Player player, int index, MapObject mapObject) {}

    // Teak prize chest
    public static void mapObject13387(Player player, int index, MapObject mapObject) {}

    // Mahogany prize chest
    public static void mapObject13388(Player player, int index, MapObject mapObject) {}

    // Mahogany prize chest
    public static void mapObject13389(Player player, int index, MapObject mapObject) {}

    // Jacky Jester
    public static void mapObject13390(Player player, int index, MapObject mapObject) {}

    // Jacky Jester
    public static void mapObject13391(Player player, int index, MapObject mapObject) {}

    // Attack stone
    public static void mapObject13392(Player player, int index, MapObject mapObject) {}

    // Attack stone
    public static void mapObject13393(Player player, int index, MapObject mapObject) {}

    // Attack stone
    public static void mapObject13394(Player player, int index, MapObject mapObject) {}

    // Elemental balance
    public static void mapObject13395(Player player, int index, MapObject mapObject) {}

    // Elemental balance
    public static void mapObject13396(Player player, int index, MapObject mapObject) {}

    // Elemental balance
    public static void mapObject13397(Player player, int index, MapObject mapObject) {}

    // Stick
    public static void mapObject13398(Player player, int index, MapObject mapObject) {}

    // Stick and hoop
    public static void mapObject13399(Player player, int index, MapObject mapObject) {}

    // Dartboard
    public static void mapObject13400(Player player, int index, MapObject mapObject) {}

    // Dartboard
    public static void mapObject13401(Player player, int index, MapObject mapObject) {}

    // Archery target
    public static void mapObject13402(Player player, int index, MapObject mapObject) {}

    // Archery target
    public static void mapObject13403(Player player, int index, MapObject mapObject) {}

    // Hangman game
    public static void mapObject13404(Player player, int index, MapObject mapObject) {}

    // Sq'irk tree
    public static void mapObject13405(Player player, int index, MapObject mapObject) {}

    // Sq'irk tree
    public static void mapObject13406(Player player, int index, MapObject mapObject) {}

    // Sq'irk tree
    public static void mapObject13407(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject13431(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Fishing spot
    public static void mapObject13476(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject13477(Player player, int index, MapObject mapObject) {}

    // Crawling hand
    public static void mapObject13481(Player player, int index, MapObject mapObject) {}

    // Cockatrice head
    public static void mapObject13482(Player player, int index, MapObject mapObject) {}

    // Basilisk head
    public static void mapObject13483(Player player, int index, MapObject mapObject) {}

    // Kurask head
    public static void mapObject13484(Player player, int index, MapObject mapObject) {}

    // Abyssal demon head
    public static void mapObject13485(Player player, int index, MapObject mapObject) {}

    // KBD heads
    public static void mapObject13486(Player player, int index, MapObject mapObject) {}

    // KQ head
    public static void mapObject13487(Player player, int index, MapObject mapObject) {}

    // Mounted sea bass
    public static void mapObject13488(Player player, int index, MapObject mapObject) {}

    // Mounted swordfish
    public static void mapObject13489(Player player, int index, MapObject mapObject) {}

    // Mounted shark
    public static void mapObject13490(Player player, int index, MapObject mapObject) {}

    // Mithril armour
    public static void mapObject13491(Player player, int index, MapObject mapObject) {}

    // Adamant armour
    public static void mapObject13492(Player player, int index, MapObject mapObject) {}

    // Rune armour
    public static void mapObject13493(Player player, int index, MapObject mapObject) {}

    // Red Castlewars armour
    public static void mapObject13494(Player player, int index, MapObject mapObject) {}

    // White Castlewars armour
    public static void mapObject13495(Player player, int index, MapObject mapObject) {}

    // Gold Castlewars armour
    public static void mapObject13496(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject13497(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject13498(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject13499(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject13500(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject13501(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject13502(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject13503(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject13504(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject13505(Player player, int index, MapObject mapObject) {}

    // Rune display case
    public static void mapObject13507(Player player, int index, MapObject mapObject) {}

    // Rune display case
    public static void mapObject13508(Player player, int index, MapObject mapObject) {}

    // Rune display case
    public static void mapObject13509(Player player, int index, MapObject mapObject) {}

    // Portrait
    public static void mapObject13510(Player player, int index, MapObject mapObject) {}

    // Portrait
    public static void mapObject13511(Player player, int index, MapObject mapObject) {}

    // Painting
    public static void mapObject13512(Player player, int index, MapObject mapObject) {}

    // Portrait
    public static void mapObject13513(Player player, int index, MapObject mapObject) {}

    // Desert painting
    public static void mapObject13514(Player player, int index, MapObject mapObject) {}

    // Isafdar painting
    public static void mapObject13515(Player player, int index, MapObject mapObject) {}

    // Karamja painting
    public static void mapObject13516(Player player, int index, MapObject mapObject) {}

    // Lumbridge painting
    public static void mapObject13517(Player player, int index, MapObject mapObject) {}

    // Morytania painting
    public static void mapObject13518(Player player, int index, MapObject mapObject) {}

    // Silverlight
    public static void mapObject13519(Player player, int index, MapObject mapObject) {}

    // Darklight
    public static void mapObject13520(Player player, int index, MapObject mapObject) {}

    // Excalibur
    public static void mapObject13521(Player player, int index, MapObject mapObject) {}

    // Anti-Dragon Breath Shield
    public static void mapObject13522(Player player, int index, MapObject mapObject) {}

    // Amulet of Glory
    public static void mapObject13523(Player player, int index, MapObject mapObject) {}

    // Cape of Legends
    public static void mapObject13524(Player player, int index, MapObject mapObject) {}

    // Map
    public static void mapObject13525(Player player, int index, MapObject mapObject) {}

    // Map
    public static void mapObject13526(Player player, int index, MapObject mapObject) {}

    // Map
    public static void mapObject13527(Player player, int index, MapObject mapObject) {}

    // Firepit
    public static void mapObject13528(Player player, int index, MapObject mapObject) {}

    // Firepit with hook
    public static void mapObject13529(Player player, int index, MapObject mapObject) {}

    // Firepit with hook
    public static void mapObject13530(Player player, int index, MapObject mapObject) {}

    // Firepit with pot
    public static void mapObject13531(Player player, int index, MapObject mapObject) {}

    // Firepit with pot
    public static void mapObject13532(Player player, int index, MapObject mapObject) {}

    // Small oven
    public static void mapObject13533(Player player, int index, MapObject mapObject) {}

    // Small Oven
    public static void mapObject13534(Player player, int index, MapObject mapObject) {}

    // Small oven
    public static void mapObject13535(Player player, int index, MapObject mapObject) {}

    // Large oven
    public static void mapObject13536(Player player, int index, MapObject mapObject) {}

    // Large oven
    public static void mapObject13537(Player player, int index, MapObject mapObject) {}

    // Large oven
    public static void mapObject13538(Player player, int index, MapObject mapObject) {}

    // Steel range
    public static void mapObject13539(Player player, int index, MapObject mapObject) {}

    // Steel range
    public static void mapObject13540(Player player, int index, MapObject mapObject) {}

    // Steel range
    public static void mapObject13541(Player player, int index, MapObject mapObject) {}

    // Fancy range
    public static void mapObject13542(Player player, int index, MapObject mapObject) {}

    // Fancy range
    public static void mapObject13543(Player player, int index, MapObject mapObject) {}

    // Fancy range
    public static void mapObject13544(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13545(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13546(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13547(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13548(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13549(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13550(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13551(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13552(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13553(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13554(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13555(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13556(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13557(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject13558(Player player, int index, MapObject mapObject) {}

    // Pump and drain
    public static void mapObject13559(Player player, int index, MapObject mapObject) {}

    // Pump and drain
    public static void mapObject13560(Player player, int index, MapObject mapObject) {}

    // Pump and tub
    public static void mapObject13561(Player player, int index, MapObject mapObject) {}

    // Pump and tub
    public static void mapObject13562(Player player, int index, MapObject mapObject) {}

    // Sink
    public static void mapObject13563(Player player, int index, MapObject mapObject) {}

    // Sink
    public static void mapObject13564(Player player, int index, MapObject mapObject) {}

    // Larder
    public static void mapObject13565(Player player, int index, MapObject mapObject) {}

    // Larder
    public static void mapObject13566(Player player, int index, MapObject mapObject) {}

    // Larder
    public static void mapObject13567(Player player, int index, MapObject mapObject) {}


   /* 13568 - 13823 */

    // Beer barrel
    public static void mapObject13568(Player player, int index, MapObject mapObject) {}

    // Cider barrel
    public static void mapObject13569(Player player, int index, MapObject mapObject) {}

    // Asgarnian ale
    public static void mapObject13570(Player player, int index, MapObject mapObject) {}

    // Greenman's ale
    public static void mapObject13571(Player player, int index, MapObject mapObject) {}

    // Dragon bitter
    public static void mapObject13572(Player player, int index, MapObject mapObject) {}

    // Chef's Delight
    public static void mapObject13573(Player player, int index, MapObject mapObject) {}

    // Pet blanket
    public static void mapObject13574(Player player, int index, MapObject mapObject) {}

    // Pet basket
    public static void mapObject13575(Player player, int index, MapObject mapObject) {}

    // Pet basket
    public static void mapObject13576(Player player, int index, MapObject mapObject) {}

    // Wooden table
    public static void mapObject13577(Player player, int index, MapObject mapObject) {}

    // Oak table
    public static void mapObject13578(Player player, int index, MapObject mapObject) {}

    // Teak table
    public static void mapObject13579(Player player, int index, MapObject mapObject) {}

    // Pet blanket
    public static void mapObject13580(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject13600(Player player, int index, MapObject mapObject) {}

    // Herman's desk
    public static void mapObject13607(Player player, int index, MapObject mapObject) {}

    // Net
    public static void mapObject13609(Player player, int index, MapObject mapObject) {}

    // Bronze pickaxe
    public static void mapObject13610(Player player, int index, MapObject mapObject) {}

    // Bronze axe
    public static void mapObject13611(Player player, int index, MapObject mapObject) {}

    // Varrock Portal
    public static void mapObject13615(Player player, int index, MapObject mapObject) {}

    // Lumbridge Portal
    public static void mapObject13616(Player player, int index, MapObject mapObject) {}

    // Falador Portal
    public static void mapObject13617(Player player, int index, MapObject mapObject) {}

    // Camelot Portal
    public static void mapObject13618(Player player, int index, MapObject mapObject) {}

    // Ardougne Portal
    public static void mapObject13619(Player player, int index, MapObject mapObject) {}

    // Yanille Portal
    public static void mapObject13620(Player player, int index, MapObject mapObject) {}

    // Kharyrll Portal
    public static void mapObject13621(Player player, int index, MapObject mapObject) {}

    // Varrock Portal
    public static void mapObject13622(Player player, int index, MapObject mapObject) {}

    // Lumbridge Portal
    public static void mapObject13623(Player player, int index, MapObject mapObject) {}

    // Falador Portal
    public static void mapObject13624(Player player, int index, MapObject mapObject) {}

    // Camelot Portal
    public static void mapObject13625(Player player, int index, MapObject mapObject) {}

    // Ardougne Portal
    public static void mapObject13626(Player player, int index, MapObject mapObject) {}

    // Yanille Portal
    public static void mapObject13627(Player player, int index, MapObject mapObject) {}

    // Kharyrll Portal
    public static void mapObject13628(Player player, int index, MapObject mapObject) {}

    // Varrock Portal
    public static void mapObject13629(Player player, int index, MapObject mapObject) {}

    // Lumbridge Portal
    public static void mapObject13630(Player player, int index, MapObject mapObject) {}

    // Falador Portal
    public static void mapObject13631(Player player, int index, MapObject mapObject) {}

    // Camelot Portal
    public static void mapObject13632(Player player, int index, MapObject mapObject) {}

    // Ardougne Portal
    public static void mapObject13633(Player player, int index, MapObject mapObject) {}

    // Yanille Portal
    public static void mapObject13634(Player player, int index, MapObject mapObject) {}

    // Kharyrll Portal
    public static void mapObject13635(Player player, int index, MapObject mapObject) {}

    // Portal frame
    public static void mapObject13636(Player player, int index, MapObject mapObject) {}

    // Portal frame
    public static void mapObject13637(Player player, int index, MapObject mapObject) {}

    // Portal frame
    public static void mapObject13638(Player player, int index, MapObject mapObject) {}

    // Scrying pool
    public static void mapObject13639(Player player, int index, MapObject mapObject) {}

    // Teleportation focus
    public static void mapObject13640(Player player, int index, MapObject mapObject) {}

    // Greater teleport focus
    public static void mapObject13641(Player player, int index, MapObject mapObject) {}

    // Lectern
    public static void mapObject13642(Player player, int index, MapObject mapObject) {}

    // Lectern
    public static void mapObject13643(Player player, int index, MapObject mapObject) {}

    // Lectern
    public static void mapObject13644(Player player, int index, MapObject mapObject) {}

    // Lectern
    public static void mapObject13645(Player player, int index, MapObject mapObject) {}

    // Lectern
    public static void mapObject13646(Player player, int index, MapObject mapObject) {}

    // Lectern
    public static void mapObject13647(Player player, int index, MapObject mapObject) {}

    // Lectern
    public static void mapObject13648(Player player, int index, MapObject mapObject) {}

    // Globe
    public static void mapObject13649(Player player, int index, MapObject mapObject) {}

    // Ornamental globe
    public static void mapObject13650(Player player, int index, MapObject mapObject) {}

    // Lunar globe
    public static void mapObject13651(Player player, int index, MapObject mapObject) {}

    // Celestial globe
    public static void mapObject13652(Player player, int index, MapObject mapObject) {}

    // Armillary sphere
    public static void mapObject13653(Player player, int index, MapObject mapObject) {}

    // Small orrery
    public static void mapObject13654(Player player, int index, MapObject mapObject) {}

    // Large orrery
    public static void mapObject13655(Player player, int index, MapObject mapObject) {}

    // Telescope
    public static void mapObject13656(Player player, int index, MapObject mapObject) {}

    // Telescope
    public static void mapObject13657(Player player, int index, MapObject mapObject) {}

    // Telescope
    public static void mapObject13658(Player player, int index, MapObject mapObject) {}

    // Crystal ball
    public static void mapObject13659(Player player, int index, MapObject mapObject) {}

    // Elemental sphere
    public static void mapObject13660(Player player, int index, MapObject mapObject) {}

    // Crystal of power
    public static void mapObject13661(Player player, int index, MapObject mapObject) {}

    // Alchemical chart
    public static void mapObject13662(Player player, int index, MapObject mapObject) {}

    // Astronomical chart
    public static void mapObject13663(Player player, int index, MapObject mapObject) {}

    // Infernal chart
    public static void mapObject13664(Player player, int index, MapObject mapObject) {}

    // Throne
    public static void mapObject13665(Player player, int index, MapObject mapObject) {}

    // Throne
    public static void mapObject13666(Player player, int index, MapObject mapObject) {}

    // Throne
    public static void mapObject13667(Player player, int index, MapObject mapObject) {}

    // Throne
    public static void mapObject13668(Player player, int index, MapObject mapObject) {}

    // Throne
    public static void mapObject13669(Player player, int index, MapObject mapObject) {}

    // Throne
    public static void mapObject13670(Player player, int index, MapObject mapObject) {}

    // Throne
    public static void mapObject13671(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject13672(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject13673(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject13674(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject13675(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject13676(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject13677(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject13678(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject13679(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject13680(Player player, int index, MapObject mapObject) {}

    // Steel cage
    public static void mapObject13681(Player player, int index, MapObject mapObject) {}

    // Magic circle
    public static void mapObject13682(Player player, int index, MapObject mapObject) {}

    // Greater magic circle
    public static void mapObject13683(Player player, int index, MapObject mapObject) {}

    // Floor decoration
    public static void mapObject13684(Player player, int index, MapObject mapObject) {}

    // Floor decoration
    public static void mapObject13685(Player player, int index, MapObject mapObject) {}

    // Floor decoration
    public static void mapObject13686(Player player, int index, MapObject mapObject) {}

    // Floor decoration
    public static void mapObject13687(Player player, int index, MapObject mapObject) {}

    // Floor decoration
    public static void mapObject13688(Player player, int index, MapObject mapObject) {}

    // Floor decoration
    public static void mapObject13689(Player player, int index, MapObject mapObject) {}

    // Hanging
    public static void mapObject13690(Player player, int index, MapObject mapObject) {}

    // Decoration
    public static void mapObject13691(Player player, int index, MapObject mapObject) {}

    // Decoration
    public static void mapObject13692(Player player, int index, MapObject mapObject) {}

    // Decoration
    public static void mapObject13693(Player player, int index, MapObject mapObject) {}

    // Teak bench
    public static void mapObject13694(Player player, int index, MapObject mapObject) {}

    // Mahogany bench
    public static void mapObject13695(Player player, int index, MapObject mapObject) {}

    // Gilded bench
    public static void mapObject13696(Player player, int index, MapObject mapObject) {}

    // Window space
    public static void mapObject13728(Player player, int index, MapObject mapObject) {}

    // Window space
    public static void mapObject13729(Player player, int index, MapObject mapObject) {}

    // Window space
    public static void mapObject13730(Player player, int index, MapObject mapObject) {}

    // Window space
    public static void mapObject13731(Player player, int index, MapObject mapObject) {}

    // Window space
    public static void mapObject13732(Player player, int index, MapObject mapObject) {}

    // Window space
    public static void mapObject13733(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13734(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13735(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13736(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13737(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13738(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13739(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13740(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13741(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13742(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13743(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13744(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13745(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13746(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13747(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13748(Player player, int index, MapObject mapObject) {}

    // Round shield
    public static void mapObject13749(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13750(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13751(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13752(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13753(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13754(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13755(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13756(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13757(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13758(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13759(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13760(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13761(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13762(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13763(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13764(Player player, int index, MapObject mapObject) {}

    // Kite shield
    public static void mapObject13765(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13766(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13767(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13768(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13769(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13770(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13771(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13772(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13773(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13774(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13775(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13776(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13777(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13778(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13779(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13780(Player player, int index, MapObject mapObject) {}

    // Square shield
    public static void mapObject13781(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13782(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13783(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13784(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13785(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13786(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13787(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13788(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13789(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13790(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13791(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13792(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13793(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13794(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13795(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13796(Player player, int index, MapObject mapObject) {}

    // Mahogany wall decoration
    public static void mapObject13797(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13798(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13799(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13800(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13801(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13802(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13803(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13804(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13805(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13806(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13807(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13808(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13809(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13810(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13811(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13812(Player player, int index, MapObject mapObject) {}

    // Oak wall decoration
    public static void mapObject13813(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13814(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13815(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13816(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13817(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13818(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13819(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13820(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13821(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13822(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13823(Player player, int index, MapObject mapObject) {}


   /* 13824 - 14079 */

    // Teak wall decoration
    public static void mapObject13824(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13825(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13826(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13827(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13828(Player player, int index, MapObject mapObject) {}

    // Teak wall decoration
    public static void mapObject13829(Player player, int index, MapObject mapObject) {}

    // Path
    public static void mapObject13831(Player player, int index, MapObject mapObject) {}

    // Path
    public static void mapObject13832(Player player, int index, MapObject mapObject) {}

    // Path
    public static void mapObject13833(Player player, int index, MapObject mapObject) {}

    // Broken bridge
    public static void mapObject13834(Player player, int index, MapObject mapObject) {}

    // Partially broken bridge
    public static void mapObject13835(Player player, int index, MapObject mapObject) {}

    // Slightly broken bridge
    public static void mapObject13836(Player player, int index, MapObject mapObject) {}

    // Fixed bridge
    public static void mapObject13837(Player player, int index, MapObject mapObject) {}

    // Bog
    public static void mapObject13838(Player player, int index, MapObject mapObject) {}

    // Bog
    public static void mapObject13839(Player player, int index, MapObject mapObject) {}

    // Vine hanging from branch
    public static void mapObject13846(Player player, int index, MapObject mapObject) {}

    // Boat
    public static void mapObject13864(Player player, int index, MapObject mapObject) {}

    // Path
    public static void mapObject13866(Player player, int index, MapObject mapObject) {}

    // Path
    public static void mapObject13867(Player player, int index, MapObject mapObject) {}

    // Path
    public static void mapObject13868(Player player, int index, MapObject mapObject) {}

    // Path
    public static void mapObject13869(Player player, int index, MapObject mapObject) {}

    // Path
    public static void mapObject13870(Player player, int index, MapObject mapObject) {}

    // Path
    public static void mapObject13871(Player player, int index, MapObject mapObject) {}

    // Backpack
    public static void mapObject13872(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject13873(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject13878(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject13879(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject13882(Player player, int index, MapObject mapObject) {}

    // Dark hole
    public static void mapObject13891(Player player, int index, MapObject mapObject) {}

    // Dark hole
    public static void mapObject13892(Player player, int index, MapObject mapObject) {}

    // Dark hole
    public static void mapObject13893(Player player, int index, MapObject mapObject) {}

    // Dark hole
    public static void mapObject13894(Player player, int index, MapObject mapObject) {}

    // Dark hole
    public static void mapObject13895(Player player, int index, MapObject mapObject) {}

    // Dark hole
    public static void mapObject13896(Player player, int index, MapObject mapObject) {}

    // Black hole
    public static void mapObject13898(Player player, int index, MapObject mapObject) {}

    // Black hole
    public static void mapObject13899(Player player, int index, MapObject mapObject) {}

    // Black hole
    public static void mapObject13900(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject13901(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject13904(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13907(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13908(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13909(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13910(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13911(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13912(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13913(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13914(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13915(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13916(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13917(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13918(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13919(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13920(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13921(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13922(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13923(Player player, int index, MapObject mapObject) {}

    // Confusing door
    public static void mapObject13924(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject13932(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject13933(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13967(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13968(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13969(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13970(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13971(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13972(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13973(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13974(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13975(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13976(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13977(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13978(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13979(Player player, int index, MapObject mapObject) {}

    // Rift
    public static void mapObject13980(Player player, int index, MapObject mapObject) {}

    // Weapon rack
    public static void mapObject13993(Player player, int index, MapObject mapObject) {}

    // Weapon rack
    public static void mapObject13994(Player player, int index, MapObject mapObject) {}

    // Weapon rack
    public static void mapObject13995(Player player, int index, MapObject mapObject) {}

    // Weapon rack
    public static void mapObject13996(Player player, int index, MapObject mapObject) {}

    // Weapon rack
    public static void mapObject13997(Player player, int index, MapObject mapObject) {}

    // Weapon rack
    public static void mapObject13998(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject13999(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject14000(Player player, int index, MapObject mapObject) {}

    // Grass
    public static void mapObject14001(Player player, int index, MapObject mapObject) {}

    // Warning sign
    public static void mapObject14002(Player player, int index, MapObject mapObject) {}

    // Pot-boiler
    public static void mapObject14004(Player player, int index, MapObject mapObject) {}

    // Pot-boiler
    public static void mapObject14007(Player player, int index, MapObject mapObject) {}

    // Pot-boiler
    public static void mapObject14009(Player player, int index, MapObject mapObject) {}

    // Wish-list
    public static void mapObject14010(Player player, int index, MapObject mapObject) {}

    // Market stall
    public static void mapObject14011(Player player, int index, MapObject mapObject) {}

    // Market stall
    public static void mapObject14012(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14058(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Fairy ring
    public static void mapObject14061(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Fairy ring
    public static void mapObject14064(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Fairy ring
    public static void mapObject14067(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Fairy ring
    public static void mapObject14070(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Fairy ring
    public static void mapObject14073(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Fairy ring
    public static void mapObject14076(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Fairy ring
    public static void mapObject14079(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }


   /* 14080 - 14335 */

    // Fairy ring
    public static void mapObject14082(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14085(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14088(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14091(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14094(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14097(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14100(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14103(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject14106(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2887 && mapObject.getY() == 9823) {
            // Taverley Dungeon
            player.getMovement().ladderUpTeleport(new Tile(2886, 9823, 0));
        }
    }

    // Fairy ring
    public static void mapObject14109(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14112(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14115(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14118(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14121(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14124(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14127(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14130(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14133(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14136(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14139(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14142(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14145(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14148(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14151(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14154(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14157(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject14160(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject14170(Player player, int index, MapObject mapObject) {}

    // Embers
    public static void mapObject14171(Player player, int index, MapObject mapObject) {}

    // Fire
    public static void mapObject14172(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject14197(Player player, int index, MapObject mapObject) {}

    // Final Ownage Elite Statue
    public static void mapObject14209(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14216(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14217(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14218(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14219(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14220(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14221(Player player, int index, MapObject mapObject) {}

    // Barricade
    public static void mapObject14224(Player player, int index, MapObject mapObject) {}

    // Barricade
    public static void mapObject14225(Player player, int index, MapObject mapObject) {}

    // Barricade
    public static void mapObject14226(Player player, int index, MapObject mapObject) {}

    // Barricade
    public static void mapObject14227(Player player, int index, MapObject mapObject) {}

    // Barricade
    public static void mapObject14228(Player player, int index, MapObject mapObject) {}

    // Barricade
    public static void mapObject14229(Player player, int index, MapObject mapObject) {}

    // Barricade
    public static void mapObject14230(Player player, int index, MapObject mapObject) {}

    // Barricade
    public static void mapObject14231(Player player, int index, MapObject mapObject) {}

    // Barricade
    public static void mapObject14232(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject14233(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14234(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14235(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14236(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14237(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14238(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14239(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14240(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14241(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14242(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14243(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14244(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14245(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14246(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14247(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject14248(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Ladder
    public static void mapObject14296(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2644 && mapObject.getY() == 2601) {
            if (player.getX() == 2645 && player.getY() == 2601) {
                player.getMovement().ladderUpTeleport(new Tile(2643, 2601, 0));
            } else if (player.getX() == 2643 && player.getY() == 2601) {
                player.getMovement().ladderDownTeleport(new Tile(2645, 2601, 0));
            }
        } else if (mapObject.getX() == 2647 && mapObject.getY() == 2586) {
            if (player.getX() == 2647 && player.getY() == 2587) {
                player.getMovement().ladderUpTeleport(new Tile(2647, 2585, 0));
            } else if (player.getX() == 2647 && player.getY() == 2585) {
                player.getMovement().ladderDownTeleport(new Tile(2647, 2587, 0));
            }
        } else if (mapObject.getX() == 2666 && mapObject.getY() == 2586) {
            if (player.getX() == 2666 && player.getY() == 2587) {
                player.getMovement().ladderUpTeleport(new Tile(2666, 2585, 0));
            } else if (player.getX() == 2666 && player.getY() == 2585) {
                player.getMovement().ladderDownTeleport(new Tile(2666, 2587, 0));
            }
        } else if (mapObject.getX() == 2669 && mapObject.getY() == 2601) {
            if (player.getX() == 2668 && player.getY() == 2601) {
                player.getMovement().ladderUpTeleport(new Tile(2670, 2601, 0));
            } else if (player.getX() == 2670 && player.getY() == 2601) {
                player.getMovement().ladderDownTeleport(new Tile(2668, 2601, 0));
            }
        }
    }

    // Gangplank
    public static void mapObject14304(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject14305(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject14306(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject14307(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject14308(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject14309(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject14314(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject14315(Player player, int index, MapObject mapObject) {
        player.setController(new PestControlPC());
    }


   /* 14336 - 14591 */

    // Bank booth
    public static void mapObject14367(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Mysterious ruins
    public static void mapObject14399(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14401(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14403(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14405(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14407(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14409(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14411(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14413(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject14428(Player player, int index, MapObject mapObject) {}


   /* 14592 - 14847 */

    // Staircase
    public static void mapObject14735(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Staircase
    public static void mapObject14736(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("climb", 0);
        } else if (index == 1) {
            Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
            player.getMovement().ladderUpTeleport(tile);
        } else if (index == 2) {
            Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Staircase
    public static void mapObject14737(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Sack
    public static void mapObject14743(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3093 && mapObject.getY() == 3956) {
            if (!player.getInventory().hasItem(946)) {
                player.getGameEncoder().sendMessage("You search the sack and find a knife.");
                player.getInventory().addItem(946, 1);
            } else {
                player.getGameEncoder().sendMessage("You search the sack but find nothing.");
            }
        }
    }

    // Ladder
    public static void mapObject14745(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject14746(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject14747(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject14749(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject14750(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject14751(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject14752(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject14753(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject14754(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Ladder
    public static void mapObject14758(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject14773(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject14774(Player player, int index, MapObject mapObject) {}

    // Obelisk
    public static void mapObject14826(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Obelisk
    public static void mapObject14827(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Obelisk
    public static void mapObject14828(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Obelisk
    public static void mapObject14829(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Obelisk
    public static void mapObject14830(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Obelisk
    public static void mapObject14831(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (index == 0) {
            WildernessObelisk.activateObelisk(player, mapObject);
        }
    }

    // Mysterious ruins
    public static void mapObject14832(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14834(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14836(Player player, int index, MapObject mapObject) {}

    // Charcoal furnace
    public static void mapObject14837(Player player, int index, MapObject mapObject) {}

    // Charcoal furnace
    public static void mapObject14838(Player player, int index, MapObject mapObject) {}

    // Dead mushroom ring
    public static void mapObject14839(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14841(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14842(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14843(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14844(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14845(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14846(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14847(Player player, int index, MapObject mapObject) {}


   /* 14848 - 15103 */

    // Portal
    public static void mapObject14848(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject14860(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Trapdoor
    public static void mapObject14880(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject14886(Player player, int index, MapObject mapObject) {
        if (!player.getWidgetManager().isDiaryComplete(AchievementDiary.Name.FALADOR,
                AchievementDiaryTask.Difficulty.HARD)) {
            player.getGameEncoder().sendMessage("You need to complete the hard Falador achievement diary.");
            return;
        }
        player.getBank().open();
    }

    // Pottery Oven
    public static void mapObject14888(Player player, int index, MapObject mapObject) {}

    // Spinning wheel
    public static void mapObject14889(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14892(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14893(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14894(Player player, int index, MapObject mapObject) {}

    // Flax
    public static void mapObject14896(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject14897(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.AIR);
    }

    // Altar
    public static void mapObject14898(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.MIND);
    }

    // Altar
    public static void mapObject14899(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.WATER);
    }

    // Altar
    public static void mapObject14900(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.EARTH);
    }

    // Altar
    public static void mapObject14901(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.FIRE);
    }

    // Altar
    public static void mapObject14902(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.BODY);
    }

    // Altar
    public static void mapObject14903(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.COSMIC);
    }

    // Altar
    public static void mapObject14904(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.LAW);
    }

    // Altar
    public static void mapObject14905(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.NATURE);
    }

    // Altar
    public static void mapObject14906(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.CHAOS);
    }

    // Altar
    public static void mapObject14907(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.DEATH);
    }

    // Flax
    public static void mapObject14909(Player player, int index, MapObject mapObject) {}

    // Guild Door
    public static void mapObject14910(Player player, int index, MapObject mapObject) {
        if (mapObject.getOriginal() != null || mapObject.getAttachment() != null) {
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
        Region.openDoors(player, mapObject, 1, false);
    }

    // Altar
    public static void mapObject14911(Player player, int index, MapObject mapObject) {}

    // Sand
    public static void mapObject14914(Player player, int index, MapObject mapObject) {}

    // Sand
    public static void mapObject14915(Player player, int index, MapObject mapObject) {}

    // Broken multicannon
    public static void mapObject14916(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject14917(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 82) {
            player.getGameEncoder().sendMessage("You need an Agility level of 82 to use this.");
            return;
        }
        if (player.getController().isMagicBound()) {
            player.getGameEncoder()
                    .sendMessage("A magical force stops you from moving for "
                            + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                            + " more seconds.");
            return;
        }
        if (player.getY() <= 3879) {
            player.getMovement().animatedTeleport(new Tile(3091, 3882, player.getHeight()), 7133, null, 0);
        } else {
            player.getMovement().animatedTeleport(new Tile(3093, 3879, player.getHeight()), 7133, null, 0);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Stepping stone
    public static void mapObject14918(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 74) {
            player.getGameEncoder().sendMessage("You need an Agility level of 74 to use this.");
            return;
        }
        if (player.getController().isMagicBound()) {
            player.getGameEncoder()
                    .sendMessage("A magical force stops you from moving for "
                            + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                            + " more seconds.");
            return;
        }
        if (player.getX() == 3201 && player.getY() == 3810) {
            player.getMovement().animatedTeleport(new Tile(3201, 3807, player.getHeight()), 7133, null, 0);
        } else if (player.getX() == 3201 && player.getY() == 3807) {
            player.getMovement().animatedTeleport(new Tile(3201, 3810, player.getHeight()), 7133, null, 0);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Sand
    public static void mapObject14948(Player player, int index, MapObject mapObject) {}

    // Mill
    public static void mapObject14960(Player player, int index, MapObject mapObject) {}

    // Bamboo Door
    public static void mapObject14974(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14977(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14979(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14980(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14981(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14982(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14983(Player player, int index, MapObject mapObject) {}

    // Strange shrine
    public static void mapObject14985(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject14986(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject14988(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14989(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14990(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14991(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14992(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14993(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14994(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject14995(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject14996(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15030(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15031(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject15032(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject15050(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject15051(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject15052(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject15053(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject15056(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject15061(Player player, int index, MapObject mapObject) {}

    // Teak
    public static void mapObject15062(Player player, int index, MapObject mapObject) {}

    // Weedy patch
    public static void mapObject15063(Player player, int index, MapObject mapObject) {}

    // Weedy patch
    public static void mapObject15064(Player player, int index, MapObject mapObject) {}

    // Weedy patch
    public static void mapObject15065(Player player, int index, MapObject mapObject) {}

    // Weedy patch
    public static void mapObject15067(Player player, int index, MapObject mapObject) {}

    // Flax
    public static void mapObject15075(Player player, int index, MapObject mapObject) {}

    // Flax
    public static void mapObject15076(Player player, int index, MapObject mapObject) {}

    // Flax
    public static void mapObject15077(Player player, int index, MapObject mapObject) {}

    // Flax
    public static void mapObject15079(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject15080(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject15081(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject15082(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject15084(Player player, int index, MapObject mapObject) {}


   /* 15104 - 15359 */

    // Ladder
    public static void mapObject15115(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject15116(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject15127(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject15186(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject15187(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject15188(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject15189(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject15191(Player player, int index, MapObject mapObject) {}

    // Light
    public static void mapObject15193(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject15194(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject15195(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject15196(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject15197(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject15202(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject15203(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject15204(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject15205(Player player, int index, MapObject mapObject) {}

    // Fire remains
    public static void mapObject15206(Player player, int index, MapObject mapObject) {}

    // Fire remains
    public static void mapObject15207(Player player, int index, MapObject mapObject) {}

    // Fire remains
    public static void mapObject15208(Player player, int index, MapObject mapObject) {}

    // Fire remains
    public static void mapObject15209(Player player, int index, MapObject mapObject) {}

    // Fire remains
    public static void mapObject15210(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject15213(Player player, int index, MapObject mapObject) {}

    // Ropeswing
    public static void mapObject15216(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject15225(Player player, int index, MapObject mapObject) {}

    // Lift Platform
    public static void mapObject15237(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject15239(Player player, int index, MapObject mapObject) {}

    // Lift Platform
    public static void mapObject15242(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15243(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15244(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15245(Player player, int index, MapObject mapObject) {}

    // Stalagmites
    public static void mapObject15250(Player player, int index, MapObject mapObject) {}

    // Stalagmite
    public static void mapObject15251(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject15252(Player player, int index, MapObject mapObject) {}

    // Treasure space
    public static void mapObject15256(Player player, int index, MapObject mapObject) {}

    // Monster space
    public static void mapObject15257(Player player, int index, MapObject mapObject) {}

    // Decoration space
    public static void mapObject15259(Player player, int index, MapObject mapObject) {}

    // Bed space
    public static void mapObject15260(Player player, int index, MapObject mapObject) {}

    // Wardrobe space
    public static void mapObject15261(Player player, int index, MapObject mapObject) {}

    // Dresser space
    public static void mapObject15262(Player player, int index, MapObject mapObject) {}

    // Curtain space
    public static void mapObject15263(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15264(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15265(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15266(Player player, int index, MapObject mapObject) {}

    // Fireplace space
    public static void mapObject15267(Player player, int index, MapObject mapObject) {}

    // Clock space
    public static void mapObject15268(Player player, int index, MapObject mapObject) {}

    // Icon space
    public static void mapObject15269(Player player, int index, MapObject mapObject) {}

    // Altar space
    public static void mapObject15270(Player player, int index, MapObject mapObject) {}

    // Lamp space
    public static void mapObject15271(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15272(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15273(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15274(Player player, int index, MapObject mapObject) {}

    // Statue space
    public static void mapObject15275(Player player, int index, MapObject mapObject) {}

    // Musical space
    public static void mapObject15276(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15277(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15278(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15279(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15280(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15281(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15282(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15283(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15284(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15285(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15286(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15287(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15288(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15289(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15290(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15291(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15292(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15293(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15294(Player player, int index, MapObject mapObject) {}

    // Combat ring space
    public static void mapObject15295(Player player, int index, MapObject mapObject) {}

    // Storage space
    public static void mapObject15296(Player player, int index, MapObject mapObject) {}

    // Decoration space
    public static void mapObject15297(Player player, int index, MapObject mapObject) {}

    // Table space
    public static void mapObject15298(Player player, int index, MapObject mapObject) {}

    // Seating space
    public static void mapObject15299(Player player, int index, MapObject mapObject) {}

    // Seating space
    public static void mapObject15300(Player player, int index, MapObject mapObject) {}

    // Fireplace space
    public static void mapObject15301(Player player, int index, MapObject mapObject) {}

    // Curtain space
    public static void mapObject15302(Player player, int index, MapObject mapObject) {}

    // Decoration space
    public static void mapObject15303(Player player, int index, MapObject mapObject) {}

    // Bell pull space
    public static void mapObject15304(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15305(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15306(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15307(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15308(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15309(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15310(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15311(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15312(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15313(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15314(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15315(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15316(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15317(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15318(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15319(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15320(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15321(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject15322(Player player, int index, MapObject mapObject) {}

    // Guard space
    public static void mapObject15323(Player player, int index, MapObject mapObject) {}

    // Trap space
    public static void mapObject15324(Player player, int index, MapObject mapObject) {}

    // Trap space
    public static void mapObject15325(Player player, int index, MapObject mapObject) {}

    // Door space
    public static void mapObject15326(Player player, int index, MapObject mapObject) {}

    // Door space
    public static void mapObject15327(Player player, int index, MapObject mapObject) {}

    // Door space
    public static void mapObject15328(Player player, int index, MapObject mapObject) {}

    // Door space
    public static void mapObject15329(Player player, int index, MapObject mapObject) {}

    // Lighting space
    public static void mapObject15330(Player player, int index, MapObject mapObject) {}

    // Decoration space
    public static void mapObject15331(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15332(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15333(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15334(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15335(Player player, int index, MapObject mapObject) {}

    // Guard space
    public static void mapObject15336(Player player, int index, MapObject mapObject) {}

    // Guard space
    public static void mapObject15337(Player player, int index, MapObject mapObject) {}

    // Door space
    public static void mapObject15338(Player player, int index, MapObject mapObject) {}

    // Door space
    public static void mapObject15339(Player player, int index, MapObject mapObject) {}

    // Lighting space
    public static void mapObject15340(Player player, int index, MapObject mapObject) {}

    // Decoration space
    public static void mapObject15341(Player player, int index, MapObject mapObject) {}

    // Game space
    public static void mapObject15342(Player player, int index, MapObject mapObject) {}

    // Prize chest space
    public static void mapObject15343(Player player, int index, MapObject mapObject) {}

    // Stone space
    public static void mapObject15344(Player player, int index, MapObject mapObject) {}

    // Elemental balance space
    public static void mapObject15345(Player player, int index, MapObject mapObject) {}

    // Ranging game space
    public static void mapObject15346(Player player, int index, MapObject mapObject) {}

    // Floor space mid
    public static void mapObject15347(Player player, int index, MapObject mapObject) {}

    // Floor space side
    public static void mapObject15348(Player player, int index, MapObject mapObject) {}

    // Floor space corner
    public static void mapObject15349(Player player, int index, MapObject mapObject) {}

    // Floor space
    public static void mapObject15350(Player player, int index, MapObject mapObject) {}

    // Floor space
    public static void mapObject15351(Player player, int index, MapObject mapObject) {}

    // Prison space
    public static void mapObject15352(Player player, int index, MapObject mapObject) {}

    // Prison space
    public static void mapObject15353(Player player, int index, MapObject mapObject) {}

    // Guard space
    public static void mapObject15354(Player player, int index, MapObject mapObject) {}

    // Lighting space
    public static void mapObject15355(Player player, int index, MapObject mapObject) {}

    // Ladder space
    public static void mapObject15356(Player player, int index, MapObject mapObject) {}

    // Door space
    public static void mapObject15357(Player player, int index, MapObject mapObject) {}

    // Door space
    public static void mapObject15358(Player player, int index, MapObject mapObject) {}

    // Door space
    public static void mapObject15359(Player player, int index, MapObject mapObject) {}


   /* 15360 - 15615 */

    // Door space
    public static void mapObject15360(Player player, int index, MapObject mapObject) {}

    // Centrepiece space
    public static void mapObject15361(Player player, int index, MapObject mapObject) {}

    // Big Tree space
    public static void mapObject15362(Player player, int index, MapObject mapObject) {}

    // Tree space
    public static void mapObject15363(Player player, int index, MapObject mapObject) {}

    // Big Plant space 1
    public static void mapObject15364(Player player, int index, MapObject mapObject) {}

    // Big Plant space 2
    public static void mapObject15365(Player player, int index, MapObject mapObject) {}

    // Small Plant space 1
    public static void mapObject15366(Player player, int index, MapObject mapObject) {}

    // Small Plant space 2
    public static void mapObject15367(Player player, int index, MapObject mapObject) {}

    // Centrepiece space
    public static void mapObject15368(Player player, int index, MapObject mapObject) {}

    // Fencing
    public static void mapObject15369(Player player, int index, MapObject mapObject) {}

    // Hedging
    public static void mapObject15370(Player player, int index, MapObject mapObject) {}

    // Hedging
    public static void mapObject15371(Player player, int index, MapObject mapObject) {}

    // Hedging
    public static void mapObject15372(Player player, int index, MapObject mapObject) {}

    // Big plant
    public static void mapObject15373(Player player, int index, MapObject mapObject) {}

    // Big plant 2
    public static void mapObject15374(Player player, int index, MapObject mapObject) {}

    // Small plant
    public static void mapObject15375(Player player, int index, MapObject mapObject) {}

    // Small plant 2
    public static void mapObject15376(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15377(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15378(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15379(Player player, int index, MapObject mapObject) {}

    // Stair Space
    public static void mapObject15380(Player player, int index, MapObject mapObject) {}

    // Stair Space
    public static void mapObject15381(Player player, int index, MapObject mapObject) {}

    // Head trophy space
    public static void mapObject15382(Player player, int index, MapObject mapObject) {}

    // Fishing trophy space
    public static void mapObject15383(Player player, int index, MapObject mapObject) {}

    // Armour space
    public static void mapObject15384(Player player, int index, MapObject mapObject) {}

    // Armour space
    public static void mapObject15385(Player player, int index, MapObject mapObject) {}

    // Rune case space
    public static void mapObject15386(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15387(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15388(Player player, int index, MapObject mapObject) {}

    // Rug space
    public static void mapObject15389(Player player, int index, MapObject mapObject) {}

    // Stair Space
    public static void mapObject15390(Player player, int index, MapObject mapObject) {}

    // Stair Space
    public static void mapObject15391(Player player, int index, MapObject mapObject) {}

    // Portrait space
    public static void mapObject15392(Player player, int index, MapObject mapObject) {}

    // Landscape space
    public static void mapObject15393(Player player, int index, MapObject mapObject) {}

    // Guild trophy space
    public static void mapObject15394(Player player, int index, MapObject mapObject) {}

    // Sword space
    public static void mapObject15395(Player player, int index, MapObject mapObject) {}

    // Map space
    public static void mapObject15396(Player player, int index, MapObject mapObject) {}

    // Bookcase space
    public static void mapObject15397(Player player, int index, MapObject mapObject) {}

    // Stove space
    public static void mapObject15398(Player player, int index, MapObject mapObject) {}

    // Shelf space
    public static void mapObject15399(Player player, int index, MapObject mapObject) {}

    // Shelf space
    public static void mapObject15400(Player player, int index, MapObject mapObject) {}

    // Barrel space
    public static void mapObject15401(Player player, int index, MapObject mapObject) {}

    // Cat basket space
    public static void mapObject15402(Player player, int index, MapObject mapObject) {}

    // Larder space
    public static void mapObject15403(Player player, int index, MapObject mapObject) {}

    // Sink space
    public static void mapObject15404(Player player, int index, MapObject mapObject) {}

    // Table space
    public static void mapObject15405(Player player, int index, MapObject mapObject) {}

    // Portal space
    public static void mapObject15406(Player player, int index, MapObject mapObject) {}

    // Portal space
    public static void mapObject15407(Player player, int index, MapObject mapObject) {}

    // Portal space
    public static void mapObject15408(Player player, int index, MapObject mapObject) {}

    // Centrepiece space
    public static void mapObject15409(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject15410(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject15412(Player player, int index, MapObject mapObject) {}

    // Temp Stone 4 Zip
    public static void mapObject15413(Player player, int index, MapObject mapObject) {}

    // Tropical tree
    public static void mapObject15414(Player player, int index, MapObject mapObject) {}

    // Monkeybars
    public static void mapObject15417(Player player, int index, MapObject mapObject) {}

    // Monkeybars
    public static void mapObject15419(Player player, int index, MapObject mapObject) {}

    // Lectern space
    public static void mapObject15420(Player player, int index, MapObject mapObject) {}

    // Globe space
    public static void mapObject15421(Player player, int index, MapObject mapObject) {}

    // Crystal ball space
    public static void mapObject15422(Player player, int index, MapObject mapObject) {}

    // Wall chart space
    public static void mapObject15423(Player player, int index, MapObject mapObject) {}

    // Telescope space
    public static void mapObject15424(Player player, int index, MapObject mapObject) {}

    // Bookcase space
    public static void mapObject15425(Player player, int index, MapObject mapObject) {}

    // Throne space
    public static void mapObject15426(Player player, int index, MapObject mapObject) {}

    // Floor space
    public static void mapObject15427(Player player, int index, MapObject mapObject) {}

    // Floor space
    public static void mapObject15428(Player player, int index, MapObject mapObject) {}

    // Floor space
    public static void mapObject15429(Player player, int index, MapObject mapObject) {}

    // Floor space
    public static void mapObject15430(Player player, int index, MapObject mapObject) {}

    // Floor space
    public static void mapObject15431(Player player, int index, MapObject mapObject) {}

    // Floor space
    public static void mapObject15432(Player player, int index, MapObject mapObject) {}

    // Decoration space
    public static void mapObject15433(Player player, int index, MapObject mapObject) {}

    // Decoration space
    public static void mapObject15434(Player player, int index, MapObject mapObject) {}

    // Lever space
    public static void mapObject15435(Player player, int index, MapObject mapObject) {}

    // Seating space
    public static void mapObject15436(Player player, int index, MapObject mapObject) {}

    // Seating space
    public static void mapObject15437(Player player, int index, MapObject mapObject) {}

    // Trapdoor space
    public static void mapObject15438(Player player, int index, MapObject mapObject) {}

    // Workbench space
    public static void mapObject15439(Player player, int index, MapObject mapObject) {}

    // Nothing
    public static void mapObject15440(Player player, int index, MapObject mapObject) {}

    // Clockmaking space
    public static void mapObject15441(Player player, int index, MapObject mapObject) {}

    // Nothing
    public static void mapObject15442(Player player, int index, MapObject mapObject) {}

    // Tool space
    public static void mapObject15443(Player player, int index, MapObject mapObject) {}

    // Tool space
    public static void mapObject15444(Player player, int index, MapObject mapObject) {}

    // Tool space
    public static void mapObject15445(Player player, int index, MapObject mapObject) {}

    // Tool space
    public static void mapObject15446(Player player, int index, MapObject mapObject) {}

    // Tool space
    public static void mapObject15447(Player player, int index, MapObject mapObject) {}

    // Repair space
    public static void mapObject15448(Player player, int index, MapObject mapObject) {}

    // Nothing
    public static void mapObject15449(Player player, int index, MapObject mapObject) {}

    // Heraldry space
    public static void mapObject15450(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject15477(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject15478(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject15479(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject15480(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject15481(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject15482(Player player, int index, MapObject mapObject) {}

    // Skull slope
    public static void mapObject15483(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject15484(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject15485(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject15487(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject15491(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject15506(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject15507(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject15508(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject15510(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject15511(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject15512(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject15513(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject15514(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject15515(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject15516(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject15517(Player player, int index, MapObject mapObject) {}

    // Piano stool
    public static void mapObject15521(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject15522(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject15523(Player player, int index, MapObject mapObject) {}

    // Warning sign
    public static void mapObject15566(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject15571(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject15572(Player player, int index, MapObject mapObject) {}

    // Tchiki Monkey Nut Bush
    public static void mapObject15573(Player player, int index, MapObject mapObject) {}

    // Strange Banana Tree
    public static void mapObject15574(Player player, int index, MapObject mapObject) {}

    // Light
    public static void mapObject15575(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject15576(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject15577(Player player, int index, MapObject mapObject) {}

    // Red Banana Tree
    public static void mapObject15579(Player player, int index, MapObject mapObject) {}

    // Banana tree
    public static void mapObject15580(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject15585(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject15586(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject15590(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject15591(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject15592(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject15593(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject15594(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject15595(Player player, int index, MapObject mapObject) {}

    // Dwarf remains
    public static void mapObject15596(Player player, int index, MapObject mapObject) {}

    // Broken multicannon
    public static void mapObject15597(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject15598(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15599(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject15600(Player player, int index, MapObject mapObject) {}

    // Railing
    public static void mapObject15601(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject15604(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject15605(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject15608(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject15609(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject15610(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject15611(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject15612(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject15615(Player player, int index, MapObject mapObject) {}


   /* 15616 - 15871 */

    // Snow
    public static void mapObject15616(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject15617(Player player, int index, MapObject mapObject) {}

    // Incubation chamber
    public static void mapObject15638(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15645(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15646(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15647(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15648(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15649(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15650(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15651(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15652(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15653(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15654(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15655(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15656(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject15657(Player player, int index, MapObject mapObject) {}

    // Heavy door
    public static void mapObject15658(Player player, int index, MapObject mapObject) {}

    // Heavy door
    public static void mapObject15660(Player player, int index, MapObject mapObject) {}

    // Shot
    public static void mapObject15664(Player player, int index, MapObject mapObject) {}

    // Shot
    public static void mapObject15665(Player player, int index, MapObject mapObject) {}

    // Keg
    public static void mapObject15668(Player player, int index, MapObject mapObject) {}

    // Keg
    public static void mapObject15669(Player player, int index, MapObject mapObject) {}

    // Keg
    public static void mapObject15670(Player player, int index, MapObject mapObject) {}

    // Keg
    public static void mapObject15671(Player player, int index, MapObject mapObject) {}

    // Keg
    public static void mapObject15672(Player player, int index, MapObject mapObject) {}

    // Keg
    public static void mapObject15673(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15695(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15696(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15701(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15704(Player player, int index, MapObject mapObject) {}

    // Zanik
    public static void mapObject15711(Player player, int index, MapObject mapObject) {}

    // Zanik
    public static void mapObject15712(Player player, int index, MapObject mapObject) {}

    // Drilling machine
    public static void mapObject15713(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15720(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15721(Player player, int index, MapObject mapObject) {}

    // Small chest
    public static void mapObject15722(Player player, int index, MapObject mapObject) {}

    // Small chest
    public static void mapObject15723(Player player, int index, MapObject mapObject) {}

    // Small chest
    public static void mapObject15724(Player player, int index, MapObject mapObject) {}

    // Small chest
    public static void mapObject15726(Player player, int index, MapObject mapObject) {}

    // Crack
    public static void mapObject15731(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject15746(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject15747(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject15748(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject15750(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject15751(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject15752(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject15753(Player player, int index, MapObject mapObject) {}

    // Hidden trapdoor
    public static void mapObject15755(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject15756(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject15757(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject15758(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject15759(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject15763(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject15764(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject15765(Player player, int index, MapObject mapObject) {}

    // Rubble
    public static void mapObject15766(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15768(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15769(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject15770(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject15771(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject15772(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject15773(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject15774(Player player, int index, MapObject mapObject) {}

    // Cart tunnel
    public static void mapObject15830(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3408 && mapObject.getY() == 9623) {
            player.getMovement().ladderUpTeleport(new Tile(3428, 3225));
        }
    }

    // Cart tunnel
    public static void mapObject15831(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject15833(Player player, int index, MapObject mapObject) {}

    // Red flowers
    public static void mapObject15846(Player player, int index, MapObject mapObject) {}


   /* 15872 - 16127 */

    // Blue flowers
    public static void mapObject15872(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject15890(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject15892(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject15893(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject15895(Player player, int index, MapObject mapObject) {}

    // Copper Ladder
    public static void mapObject15896(Player player, int index, MapObject mapObject) {}

    // Copper Ladder
    public static void mapObject15898(Player player, int index, MapObject mapObject) {}

    // Copper Ladder
    public static void mapObject15899(Player player, int index, MapObject mapObject) {}

    // Copper Ladder
    public static void mapObject15901(Player player, int index, MapObject mapObject) {}

    // Conveyor Belt
    public static void mapObject15926(Player player, int index, MapObject mapObject) {}

    // Steam Pump
    public static void mapObject15928(Player player, int index, MapObject mapObject) {}

    // Steam Pump
    public static void mapObject15929(Player player, int index, MapObject mapObject) {}

    // Steam_Pump
    public static void mapObject15930(Player player, int index, MapObject mapObject) {}

    // Log Store
    public static void mapObject15931(Player player, int index, MapObject mapObject) {}

    // Workbench
    public static void mapObject15934(Player player, int index, MapObject mapObject) {}

    // STASH (easy)
    public static void mapObject15943(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (easy)
    public static void mapObject15944(Player player, int index, MapObject mapObject) {}

    // STASH (easy)
    public static void mapObject15945(Player player, int index, MapObject mapObject) {}

    // Jungle Tree
    public static void mapObject15948(Player player, int index, MapObject mapObject) {}

    // Jungle Tree
    public static void mapObject15951(Player player, int index, MapObject mapObject) {}

    // Jungle Tree
    public static void mapObject15954(Player player, int index, MapObject mapObject) {}

    // Scrapey Tree
    public static void mapObject15970(Player player, int index, MapObject mapObject) {}

    // Waiting Room Door
    public static void mapObject15984(Player player, int index, MapObject mapObject) {}

    // Deposit Box
    public static void mapObject15985(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Portal
    public static void mapObject15996(Player player, int index, MapObject mapObject) {}

    // Stepping log
    public static void mapObject16005(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (easy)
    public static void mapObject16014(Player player, int index, MapObject mapObject) {}

    // STASH (easy)
    public static void mapObject16015(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (easy)
    public static void mapObject16016(Player player, int index, MapObject mapObject) {}

    // STASH (easy)
    public static void mapObject16017(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (medium)
    public static void mapObject16018(Player player, int index, MapObject mapObject) {}

    // STASH (medium)
    public static void mapObject16019(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (medium)
    public static void mapObject16020(Player player, int index, MapObject mapObject) {}

    // STASH (medium)
    public static void mapObject16021(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (medium)
    public static void mapObject16022(Player player, int index, MapObject mapObject) {}

    // STASH (medium)
    public static void mapObject16023(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (medium)
    public static void mapObject16024(Player player, int index, MapObject mapObject) {}

    // Conveyor Belt
    public static void mapObject16025(Player player, int index, MapObject mapObject) {}

    // Conveyor Belt
    public static void mapObject16026(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16031(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject16059(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject16060(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject16061(Player player, int index, MapObject mapObject) {}

    // Tropical tree
    public static void mapObject16062(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject16066(Player player, int index, MapObject mapObject) {}

    // Exit
    public static void mapObject16100(Player player, int index, MapObject mapObject) {}

    // Energy Barrier
    public static void mapObject16105(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16108(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16109(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16110(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject16111(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject16112(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject16113(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject16114(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject16115(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject16116(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject16118(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject16119(Player player, int index, MapObject mapObject) {}


   /* 16128 - 16383 */

    // Passageway
    public static void mapObject16129(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject16130(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject16131(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject16132(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject16133(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject16134(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject16168(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject16181(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Fairy ring
    public static void mapObject16184(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Cloud bank
    public static void mapObject16187(Player player, int index, MapObject mapObject) {}

    // Cloud bank
    public static void mapObject16189(Player player, int index, MapObject mapObject) {}

    // Healing certificate
    public static void mapObject16211(Player player, int index, MapObject mapObject) {}

    // A fairy workbench
    public static void mapObject16212(Player player, int index, MapObject mapObject) {}

    // Fairy workbench
    public static void mapObject16213(Player player, int index, MapObject mapObject) {}

    // A fairy workbench
    public static void mapObject16214(Player player, int index, MapObject mapObject) {}

    // Fairy workbench
    public static void mapObject16215(Player player, int index, MapObject mapObject) {}

    // Potion shelves
    public static void mapObject16216(Player player, int index, MapObject mapObject) {}

    // Potion shelves
    public static void mapObject16217(Player player, int index, MapObject mapObject) {}

    // Potion shelves
    public static void mapObject16218(Player player, int index, MapObject mapObject) {}

    // Potion shelves
    public static void mapObject16219(Player player, int index, MapObject mapObject) {}

    // Potion shelf
    public static void mapObject16220(Player player, int index, MapObject mapObject) {}

    // Potion shelf
    public static void mapObject16221(Player player, int index, MapObject mapObject) {}

    // Potion shelf
    public static void mapObject16222(Player player, int index, MapObject mapObject) {}

    // Potion shelf
    public static void mapObject16223(Player player, int index, MapObject mapObject) {}

    // Healing certificate
    public static void mapObject16224(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16250(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject16251(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16252(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject16264(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject16265(Player player, int index, MapObject mapObject) {}

    // Rune temple sign
    public static void mapObject16307(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject16308(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject16309(Player player, int index, MapObject mapObject) {}

    // Healing certificate
    public static void mapObject16315(Player player, int index, MapObject mapObject) {}

    // Healing certificate
    public static void mapObject16378(Player player, int index, MapObject mapObject) {}

    // Healing certificate
    public static void mapObject16379(Player player, int index, MapObject mapObject) {}



}
