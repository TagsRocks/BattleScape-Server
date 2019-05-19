package decodedpacket.mapobjectoption;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.ForceMovement;
import com.palidino.osrs.model.Movement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.dialogue.Dialogue;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.item.MysteryBox;
import com.palidino.osrs.model.item.RandomItem;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.map.TempMapObject;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Barrows;
import com.palidino.osrs.model.player.Equipment;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.PCombat;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Prayer;
import com.palidino.osrs.model.player.Runecrafting;
import com.palidino.osrs.model.player.Skills;
import com.palidino.osrs.model.player.Slayer;
import com.palidino.osrs.model.player.Smithing;
import com.palidino.osrs.model.player.controller.BossInstancePC;
import com.palidino.osrs.model.player.controller.ClanWarsFreeForAllPC;
import com.palidino.osrs.model.player.controller.GodWarsPC;
import com.palidino.osrs.util.RequestManager;
import com.palidino.osrs.world.ClanWarsTournament;
import com.palidino.util.Time;
import com.palidino.util.Utils;
import com.palidino.util.event.Event;

public class MapObject1 {
   /* 16384 - 16639 */

    // Ladder
    public static void mapObject16450(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16464(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject16465(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject16466(Player player, int index, MapObject mapObject) {}

    // Incubation chamber
    public static void mapObject16467(Player player, int index, MapObject mapObject) {}

    // Tight-gap
    public static void mapObject16468(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject16469(Player player, int index, MapObject mapObject) {}

    // Exercise mat
    public static void mapObject16508(Player player, int index, MapObject mapObject) {}

    // Obstacle pipe
    public static void mapObject16509(Player player, int index, MapObject mapObject) {
        // Taverley Dungeon
        if (player.getSkills().getLevel(Skills.AGILITY) < 70) {
            player.getGameEncoder().sendMessage("You need an Agility level of 70 to do this.");
            return;
        }
        if (player.getX() <= 2887) {
            Tile tile = new Tile(2892, 9799, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        } else {
            Tile tile = new Tile(2886, 9799, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Strange floor
    public static void mapObject16510(Player player, int index, MapObject mapObject) {
        // Taverley Dungeon
        if (player.getSkills().getLevel(Skills.AGILITY) < 80) {
            player.getGameEncoder().sendMessage("You need an Agility level of 80 to do this.");
            return;
        }
        if (player.getX() <= 2878) {
            Tile tile = new Tile(2880, 9813, 0);
            player.getMovement().animatedTeleport(tile, 3067, null, 1);
        } else {
            Tile tile = new Tile(2878, 9813, 0);
            player.getMovement().animatedTeleport(tile, 3067, null, 1);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Obstacle pipe
    public static void mapObject16511(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject16513(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16514(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16515(Player player, int index, MapObject mapObject) {}

    // Fence
    public static void mapObject16517(Player player, int index, MapObject mapObject) {}

    // Fence
    public static void mapObject16518(Player player, int index, MapObject mapObject) {}

    // Castle wall
    public static void mapObject16519(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject16520(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16521(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16522(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16523(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16524(Player player, int index, MapObject mapObject) {}

    // Weathered wall
    public static void mapObject16525(Player player, int index, MapObject mapObject) {}

    // Weathered wall
    public static void mapObject16526(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject16527(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject16528(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject16529(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject16530(Player player, int index, MapObject mapObject) {}

    // Jutting wall
    public static void mapObject16532(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject16533(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16534(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16535(Player player, int index, MapObject mapObject) {}

    // Spikey chain
    public static void mapObject16537(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
        player.getMovement().animatedTeleport(tile, 834, null, 1);
    }

    // Spikey chain
    public static void mapObject16538(Player player, int index, MapObject mapObject) {
        // Slayer Tower
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().animatedTeleport(tile, 834, null, 1);
    }

    // Crevice
    public static void mapObject16539(Player player, int index, MapObject mapObject) {
        // Fremennik Dungeon
        if (mapObject.getX() == 2734 && mapObject.getY() == 10008) {
            Tile tile = new Tile(2730, 10008, 0);
            player.getMovement().ladderDownTeleport(tile);
        } else if (mapObject.getX() == 2731 && mapObject.getY() == 10008) {
            Tile tile = new Tile(2735, 10008, 0);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Log balance
    public static void mapObject16540(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject16541(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject16542(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject16543(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 42) {
            player.getGameEncoder().sendMessage("You need an Agility level of 42 to do this.");
            return;
        }
        if (mapObject.getX() == 3029 && mapObject.getY() == 9806) {
            player.getMovement().teleport(3035, 9806);
        } else if (mapObject.getX() == 3034 && mapObject.getY() == 9806) {
            player.getMovement().teleport(3028, 9806);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Strange floor
    public static void mapObject16544(Player player, int index, MapObject mapObject) {
        // Fremennik Dungeon
        if (player.getX() >= mapObject.getX()) {
            Tile tile = new Tile(mapObject.getX() - 1, mapObject.getY(), 0);
            player.getMovement().animatedTeleport(tile, 3067, null, 1);
        } else {
            Tile tile = new Tile(mapObject.getX() + 1, mapObject.getY(), 0);
            player.getMovement().animatedTeleport(tile, 3067, null, 1);
        }
    }

    // Rocks
    public static void mapObject16545(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject16546(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject16547(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject16548(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16549(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16550(Player player, int index, MapObject mapObject) {}

    // Ornate railing
    public static void mapObject16552(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16556(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16559(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16560(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16561(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16564(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject16565(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16585(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16586(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16587(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16588(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16589(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16590(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16591(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16592(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16593(Player player, int index, MapObject mapObject) {}

    // Log pile
    public static void mapObject16594(Player player, int index, MapObject mapObject) {}

    // My life
    public static void mapObject16599(Player player, int index, MapObject mapObject) {}

    // Hurdle
    public static void mapObject16600(Player player, int index, MapObject mapObject) {}

    // Dream tree
    public static void mapObject16604(Player player, int index, MapObject mapObject) {}

    // Zero
    public static void mapObject16619(Player player, int index, MapObject mapObject) {}

    // One
    public static void mapObject16620(Player player, int index, MapObject mapObject) {}

    // Two
    public static void mapObject16621(Player player, int index, MapObject mapObject) {}

    // Three
    public static void mapObject16622(Player player, int index, MapObject mapObject) {}

    // Four
    public static void mapObject16623(Player player, int index, MapObject mapObject) {}

    // Five
    public static void mapObject16624(Player player, int index, MapObject mapObject) {}

    // Six
    public static void mapObject16625(Player player, int index, MapObject mapObject) {}

    // Seven
    public static void mapObject16626(Player player, int index, MapObject mapObject) {}

    // Eight
    public static void mapObject16627(Player player, int index, MapObject mapObject) {}

    // Nine
    public static void mapObject16628(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16632(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16633(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16634(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16635(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16636(Player player, int index, MapObject mapObject) {}

    // Platform
    public static void mapObject16637(Player player, int index, MapObject mapObject) {}

    // Dream puff
    public static void mapObject16638(Player player, int index, MapObject mapObject) {}


   /* 16640 - 16895 */

    // Mast
    public static void mapObject16640(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject16642(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Coffin
    public static void mapObject16644(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject16645(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16646(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16647(Player player, int index, MapObject mapObject) {}

    // Ectofuntus
    public static void mapObject16648(Player player, int index, MapObject mapObject) {}

    // Bone grinder
    public static void mapObject16650(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject16651(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject16652(Player player, int index, MapObject mapObject) {}

    // Pirate Captain
    public static void mapObject16653(Player player, int index, MapObject mapObject) {}

    // Bone grinder
    public static void mapObject16655(Player player, int index, MapObject mapObject) {}

    // Bin
    public static void mapObject16656(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject16657(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16661(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16662(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16663(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16664(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3044 && mapObject.getY() == 3924 && player.getHeight() == 0) {
            player.getMovement().teleport(3044, 10322);
        }
    }

    // Staircase
    public static void mapObject16665(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3044 && mapObject.getY() == 10324 && player.getHeight() == 0) {
            player.getMovement().teleport(3044, 3927);
        }
    }

    // Staircase
    public static void mapObject16667(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16668(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16669(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16670(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16671(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Staircase
    public static void mapObject16672(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("climb", 0);
        } else if (index == 1) {
            Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
            player.getMovement().ladderUpTeleport(tile);
        } else if (index == 2) {
            Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Staircase
    public static void mapObject16673(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16674(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16675(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2444 && mapObject.getY() == 3414) {
            player.getMovement().ladderUpTeleport(new Tile(2445, 3416, 1));
        } else if (mapObject.getX() == 2445 && mapObject.getY() == 3434) {
            player.getMovement().ladderUpTeleport(new Tile(2445, 3433, 1));
        }
    }

    // Staircase
    public static void mapObject16676(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject16677(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2445 && mapObject.getY() == 3415) {
            player.getMovement().ladderDownTeleport(new Tile(2445, 3416));
        } else if (mapObject.getX() == 2445 && mapObject.getY() == 3434) {
            player.getMovement().ladderDownTeleport(new Tile(2445, 3433));
        }
    }

    // Staircase
    public static void mapObject16678(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16679(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Ladder
    public static void mapObject16680(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2824 && mapObject.getY() == 3507) {
            // Ice Queen
            player.getMovement().ladderDownTeleport(new Tile(2823, 9907));
        } else if (mapObject.getX() == 2827 && mapObject.getY() == 3510) {
            // Ice Queen
            player.getMovement().ladderDownTeleport(new Tile(2826, 9910));
        } else if (mapObject.getX() == 2859 && mapObject.getY() == 3519) {
            // Ice Queen
            player.getMovement().ladderDownTeleport(new Tile(2858, 9919));
        } else if (mapObject.getX() == 2857 && mapObject.getY() == 3517) {
            // Ice Queen
            player.getMovement().ladderDownTeleport(new Tile(2858, 9917));
        } else if (mapObject.getX() == 3088 && mapObject.getY() == 3571) {
            // Air obelisk
            player.getMovement().ladderDownTeleport(new Tile(3087, 9971));
        } else if (mapObject.getX() == 2884 && mapObject.getY() == 3397) {
            // Taverley Dungeon entrance
            Tile tile = new Tile(2884, 9798, 0);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Ladder
    public static void mapObject16681(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16682(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Ladder
    public static void mapObject16683(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() + 1);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Ladder
    public static void mapObject16684(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16685(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject16686(Player player, int index, MapObject mapObject) {}

    // Rune essence
    public static void mapObject16687(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject16700(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Tall mirror
    public static void mapObject16708(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16732(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16733(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16734(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16735(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16736(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject16774(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject16776(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject16777(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject16778(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject16779(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16829(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16831(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16833(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16835(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16837(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16839(Player player, int index, MapObject mapObject) {}

    // Transport platform
    public static void mapObject16841(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16843(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16844(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16845(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16846(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16847(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject16848(Player player, int index, MapObject mapObject) {}

    // Platform edge
    public static void mapObject16858(Player player, int index, MapObject mapObject) {}

    // Tar barrel
    public static void mapObject16860(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject16884(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject16885(Player player, int index, MapObject mapObject) {}


   /* 16896 - 17151 */

    // Door
    public static void mapObject16902(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject16903(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16945(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16946(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16947(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject16948(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16959(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16960(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16961(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject16962(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16998(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject16999(Player player, int index, MapObject mapObject) {}

    // Ornate railing
    public static void mapObject17000(Player player, int index, MapObject mapObject) {}

    // Jutting wall
    public static void mapObject17002(Player player, int index, MapObject mapObject) {}

    // Rickety door
    public static void mapObject17009(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject17019(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject17020(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject17021(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject17022(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject17023(Player player, int index, MapObject mapObject) {}

    // Dice
    public static void mapObject17024(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17026(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17027(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17028(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("This ladder doesn't seem to reach the floor above it.");
    }

    // Crossbow stall
    public static void mapObject17031(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject17042(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject17043(Player player, int index, MapObject mapObject) {}

    // Strong Tree
    public static void mapObject17046(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject17047(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject17048(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject17049(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject17050(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject17051(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject17052(Player player, int index, MapObject mapObject) {}

    // Crossbow Tree
    public static void mapObject17062(Player player, int index, MapObject mapObject) {}

    // Broken Raft
    public static void mapObject17068(Player player, int index, MapObject mapObject) {}

    // Strong Tree
    public static void mapObject17074(Player player, int index, MapObject mapObject) {}

    // Strong Tree
    public static void mapObject17075(Player player, int index, MapObject mapObject) {}

    // Strong Tree
    public static void mapObject17076(Player player, int index, MapObject mapObject) {}

    // Strong Tree
    public static void mapObject17077(Player player, int index, MapObject mapObject) {}

    // Strong Tree
    public static void mapObject17080(Player player, int index, MapObject mapObject) {}

    // Strong Tree
    public static void mapObject17081(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject17089(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject17090(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject17091(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject17092(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject17093(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject17094(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject17098(Player player, int index, MapObject mapObject) {}

    // Rickety door
    public static void mapObject17100(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject17114(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject17115(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17120(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17121(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17122(Player player, int index, MapObject mapObject) {}

    // Kitchen cabinet
    public static void mapObject17132(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject17143(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject17144(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17148(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17149(Player player, int index, MapObject mapObject) {}


   /* 17152 - 17407 */

    // Staircase
    public static void mapObject17155(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17159(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17160(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject17209(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject17222(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject17223(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject17232(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject17235(Player player, int index, MapObject mapObject) {}

    // Aspidistra plant
    public static void mapObject17238(Player player, int index, MapObject mapObject) {}

    // Singing bowl
    public static void mapObject17239(Player player, int index, MapObject mapObject) {}

    // Oaknock's machine
    public static void mapObject17240(Player player, int index, MapObject mapObject) {}

    // Oaknock's Machine
    public static void mapObject17245(Player player, int index, MapObject mapObject) {}

    // Oaknock's Machine
    public static void mapObject17246(Player player, int index, MapObject mapObject) {}

    // Oaknock's Machine
    public static void mapObject17247(Player player, int index, MapObject mapObject) {}

    // Oaknock's exchanger
    public static void mapObject17248(Player player, int index, MapObject mapObject) {}

    // Oaknock's exchanger
    public static void mapObject17249(Player player, int index, MapObject mapObject) {}

    // Crystal bridge
    public static void mapObject17267(Player player, int index, MapObject mapObject) {}

    // A chasm
    public static void mapObject17269(Player player, int index, MapObject mapObject) {}

    // A chasm
    public static void mapObject17270(Player player, int index, MapObject mapObject) {}

    // Machine panel
    public static void mapObject17272(Player player, int index, MapObject mapObject) {}

    // Argento
    public static void mapObject17276(Player player, int index, MapObject mapObject) {}

    // Oaknock's machine
    public static void mapObject17280(Player player, int index, MapObject mapObject) {}

    // Oaknock's Machine
    public static void mapObject17282(Player player, int index, MapObject mapObject) {}

    // Oaknock's exchanger
    public static void mapObject17283(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject17296(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject17297(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject17300(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject17301(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject17302(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject17303(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject17316(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject17317(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject17319(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject17320(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject17321(Player player, int index, MapObject mapObject) {}

    // Stone Tablet
    public static void mapObject17367(Player player, int index, MapObject mapObject) {}

    // Stone Tablet
    public static void mapObject17369(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject17382(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17383(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17384(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2892 && mapObject.getY() == 3507) {
            // Heros' Guild entrance
            Tile tile = new Tile(2893, 9907);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Ladder
    public static void mapObject17385(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2884 && mapObject.getY() == 9797) {
            // Taverley Dungeon exit
            Tile tile = new Tile(2884, 3396, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else if (mapObject.getX() == 3008 && mapObject.getY() == 9550) {
            // Asgarnian Ice Dungeon exit
            Tile tile = new Tile(3009, 3150, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else if (mapObject.getX() == 2824 && mapObject.getY() == 9907) {
            // Ice Queen
            player.getMovement().ladderUpTeleport(new Tile(2823, 3507));
        } else if (mapObject.getX() == 2857 && mapObject.getY() == 9917) {
            // Ice Queen
            player.getMovement().ladderUpTeleport(new Tile(2857, 3516));
        } else if (mapObject.getX() == 2859 && mapObject.getY() == 9919) {
            // Ice Queen
            player.getMovement().ladderUpTeleport(new Tile(2858, 3519));
        } else if (mapObject.getX() == 2827 && mapObject.getY() == 9910) {
            // Ice Queen
            player.getMovement().ladderUpTeleport(new Tile(2826, 3510));
        } else if (mapObject.getX() == 3088 && mapObject.getY() == 9971) {
            // Air obelisk
            player.getMovement().ladderUpTeleport(new Tile(3087, 3571));
        }
    }

    // Ladder
    public static void mapObject17386(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17387(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17388(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17389(Player player, int index, MapObject mapObject) {}

    // Steps
    public static void mapObject17391(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17392(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17393(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17394(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17395(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17396(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17397(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17398(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17399(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17400(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17401(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17402(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17403(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17404(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17405(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17406(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17407(Player player, int index, MapObject mapObject) {}


   /* 17408 - 17663 */

    // Gangplank
    public static void mapObject17408(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject17409(Player player, int index, MapObject mapObject) {}

    // Drain
    public static void mapObject17423(Player player, int index, MapObject mapObject) {}

    // Drain
    public static void mapObject17424(Player player, int index, MapObject mapObject) {}

    // Rusty key
    public static void mapObject17429(Player player, int index, MapObject mapObject) {}

    // Mud
    public static void mapObject17431(Player player, int index, MapObject mapObject) {}

    // Sewer pipe
    public static void mapObject17432(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject17600(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject17601(Player player, int index, MapObject mapObject) {}


   /* 17664 - 17919 */

    // Rock
    public static void mapObject17679(Player player, int index, MapObject mapObject) {}


   /* 17920 - 18175 */

    // Boat
    public static void mapObject17953(Player player, int index, MapObject mapObject) {}

    // Boat
    public static void mapObject17954(Player player, int index, MapObject mapObject) {}

    // Boat
    public static void mapObject17955(Player player, int index, MapObject mapObject) {}

    // Boat Chute
    public static void mapObject17956(Player player, int index, MapObject mapObject) {}

    // Boat Chute
    public static void mapObject17957(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject17958(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject17959(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject17960(Player player, int index, MapObject mapObject) {}

    // Boat
    public static void mapObject17961(Player player, int index, MapObject mapObject) {}

    // Daeyalt rocks
    public static void mapObject17962(Player player, int index, MapObject mapObject) {}

    // Daeyalt rocks
    public static void mapObject17963(Player player, int index, MapObject mapObject) {}

    // Daeyalt rocks
    public static void mapObject17964(Player player, int index, MapObject mapObject) {}

    // Daeyalt rocks
    public static void mapObject17965(Player player, int index, MapObject mapObject) {}

    // Mine cart
    public static void mapObject17966(Player player, int index, MapObject mapObject) {}

    // Mine cart
    public static void mapObject17967(Player player, int index, MapObject mapObject) {}

    // Mine cart
    public static void mapObject17968(Player player, int index, MapObject mapObject) {}

    // Mine cart
    public static void mapObject17969(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject17970(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject17971(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject17972(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject17973(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17974(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17975(Player player, int index, MapObject mapObject) {}

    // Stairs up
    public static void mapObject17976(Player player, int index, MapObject mapObject) {}

    // Broken stairs
    public static void mapObject17977(Player player, int index, MapObject mapObject) {}

    // Stairs down
    public static void mapObject17978(Player player, int index, MapObject mapObject) {}

    // Broken stairs
    public static void mapObject17979(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject17980(Player player, int index, MapObject mapObject) {}

    // Decorated wall
    public static void mapObject17982(Player player, int index, MapObject mapObject) {}

    // Lumpy rug
    public static void mapObject17984(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject17985(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17986(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject17987(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject17989(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17995(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17996(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17997(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17998(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject17999(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18000(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18001(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18002(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject18031(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject18032(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18033(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18034(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18036(Player player, int index, MapObject mapObject) {}

    // Wall rubble
    public static void mapObject18037(Player player, int index, MapObject mapObject) {}

    // Wall rubble
    public static void mapObject18038(Player player, int index, MapObject mapObject) {}

    // Fireplace
    public static void mapObject18039(Player player, int index, MapObject mapObject) {}

    // Slashed tapestry
    public static void mapObject18041(Player player, int index, MapObject mapObject) {}

    // Portrait
    public static void mapObject18042(Player player, int index, MapObject mapObject) {}

    // Portrait
    public static void mapObject18043(Player player, int index, MapObject mapObject) {}

    // Portrait
    public static void mapObject18044(Player player, int index, MapObject mapObject) {}

    // Vampyre statue
    public static void mapObject18045(Player player, int index, MapObject mapObject) {}

    // Statue with key
    public static void mapObject18046(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject18047(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject18049(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject18050(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject18051(Player player, int index, MapObject mapObject) {}

    // Broken rune case
    public static void mapObject18052(Player player, int index, MapObject mapObject) {}

    // Barricade
    public static void mapObject18054(Player player, int index, MapObject mapObject) {}

    // Rocky surface
    public static void mapObject18056(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject18057(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject18059(Player player, int index, MapObject mapObject) {}

    // Trapdoor table
    public static void mapObject18060(Player player, int index, MapObject mapObject) {}

    // Trapdoor tunnel
    public static void mapObject18061(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject18062(Player player, int index, MapObject mapObject) {}

    // Trapdoor table
    public static void mapObject18063(Player player, int index, MapObject mapObject) {}

    // Pots
    public static void mapObject18065(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18066(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18067(Player player, int index, MapObject mapObject) {}

    // Broken ladder
    public static void mapObject18068(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18069(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18070(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18071(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18072(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18073(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18074(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18076(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18077(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18078(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18079(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18081(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18082(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject18083(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject18084(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject18085(Player player, int index, MapObject mapObject) {}

    // Shelf
    public static void mapObject18086(Player player, int index, MapObject mapObject) {}

    // Shelf
    public static void mapObject18087(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18088(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18089(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18090(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject18091(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject18092(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18093(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18094(Player player, int index, MapObject mapObject) {}

    // Shelf
    public static void mapObject18095(Player player, int index, MapObject mapObject) {}

    // Shelf
    public static void mapObject18096(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18097(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18098(Player player, int index, MapObject mapObject) {}

    // Washing line
    public static void mapObject18099(Player player, int index, MapObject mapObject) {}

    // Washing line
    public static void mapObject18100(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18101(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18103(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18104(Player player, int index, MapObject mapObject) {}

    // Shelf
    public static void mapObject18105(Player player, int index, MapObject mapObject) {}

    // Shelf
    public static void mapObject18106(Player player, int index, MapObject mapObject) {}

    // Shelf
    public static void mapObject18107(Player player, int index, MapObject mapObject) {}

    // Shelf
    public static void mapObject18108(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18109(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18110(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18111(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18112(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18113(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18114(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18115(Player player, int index, MapObject mapObject) {}

    // Broken ladder
    public static void mapObject18116(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18117(Player player, int index, MapObject mapObject) {}

    // Floorboards
    public static void mapObject18118(Player player, int index, MapObject mapObject) {}

    // Mine cart
    public static void mapObject18119(Player player, int index, MapObject mapObject) {}

    // Rug
    public static void mapObject18120(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject18121(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18122(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18124(Player player, int index, MapObject mapObject) {}

    // Tapestry
    public static void mapObject18125(Player player, int index, MapObject mapObject) {}

    // Portrait
    public static void mapObject18126(Player player, int index, MapObject mapObject) {}

    // Vampyre statue
    public static void mapObject18127(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18128(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18129(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18130(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18131(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18132(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18133(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18134(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18135(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject18136(Player player, int index, MapObject mapObject) {}

    // Windswept tree
    public static void mapObject18137(Player player, int index, MapObject mapObject) {}

    // Decorated wall
    public static void mapObject18144(Player player, int index, MapObject mapObject) {}

    // Decorated wall
    public static void mapObject18145(Player player, int index, MapObject mapObject) {}

    // Decorated wall
    public static void mapObject18146(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject18159(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject18168(Player player, int index, MapObject mapObject) {}


   /* 18176 - 18431 */

    // Crate
    public static void mapObject18204(Player player, int index, MapObject mapObject) {}

    // Study desk
    public static void mapObject18224(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18234(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18235(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18236(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18237(Player player, int index, MapObject mapObject) {}

    // Badly repaired wall
    public static void mapObject18251(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject18258(Player player, int index, MapObject mapObject) {}

    // Old ruin entrance
    public static void mapObject18270(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject18307(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject18308(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject18309(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject18310(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject18311(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18324(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18325(Player player, int index, MapObject mapObject) {}

    // Crane
    public static void mapObject18326(Player player, int index, MapObject mapObject) {}

    // Crane
    public static void mapObject18327(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject18352(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject18353(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject18359(Player player, int index, MapObject mapObject) {}

    // Wall opening
    public static void mapObject18360(Player player, int index, MapObject mapObject) {}

    // Badly repaired wall
    public static void mapObject18381(Player player, int index, MapObject mapObject) {}

    // Broken fence
    public static void mapObject18411(Player player, int index, MapObject mapObject) {}

    // Passage
    public static void mapObject18412(Player player, int index, MapObject mapObject) {}

    // Imposing Doors
    public static void mapObject18413(Player player, int index, MapObject mapObject) {}

    // Imposing Doors
    public static void mapObject18414(Player player, int index, MapObject mapObject) {}

    // Imposing Doors
    public static void mapObject18415(Player player, int index, MapObject mapObject) {}

    // Shortcut
    public static void mapObject18416(Player player, int index, MapObject mapObject) {}


   /* 18432 - 18687 */

    // Door
    public static void mapObject18489(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject18490(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject18491(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Signpost
    public static void mapObject18493(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject18495(Player player, int index, MapObject mapObject) {}

    // Odd looking wall
    public static void mapObject18505(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject18506(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject18507(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject18508(Player player, int index, MapObject mapObject) {}

    // Water controls
    public static void mapObject18509(Player player, int index, MapObject mapObject) {}

    // Water controls
    public static void mapObject18510(Player player, int index, MapObject mapObject) {}

    // Bellows
    public static void mapObject18516(Player player, int index, MapObject mapObject) {}

    // Machinery
    public static void mapObject18593(Player player, int index, MapObject mapObject) {}

    // Machinery
    public static void mapObject18594(Player player, int index, MapObject mapObject) {}

    // Hatch
    public static void mapObject18595(Player player, int index, MapObject mapObject) {}

    // Hatch
    public static void mapObject18596(Player player, int index, MapObject mapObject) {}

    // Stairwell
    public static void mapObject18597(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject18598(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject18599(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject18610(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject18611(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject18612(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject18613(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject18614(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject18615(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject18616(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject18617(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject18618(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject18619(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject18620(Player player, int index, MapObject mapObject) {}

    // An old lever
    public static void mapObject18621(Player player, int index, MapObject mapObject) {}

    // An old lever
    public static void mapObject18622(Player player, int index, MapObject mapObject) {}

    // An old lever
    public static void mapObject18640(Player player, int index, MapObject mapObject) {}

    // Junction box
    public static void mapObject18641(Player player, int index, MapObject mapObject) {}

    // Water valve
    public static void mapObject18646(Player player, int index, MapObject mapObject) {}

    // Water valve
    public static void mapObject18647(Player player, int index, MapObject mapObject) {}

    // An old lever
    public static void mapObject18648(Player player, int index, MapObject mapObject) {}

    // Corkscrew lever
    public static void mapObject18649(Player player, int index, MapObject mapObject) {}

    // An old lever
    public static void mapObject18663(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18667(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18668(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18669(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18670(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18671(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18672(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18673(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18674(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18675(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18676(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18677(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18678(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18679(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18680(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18681(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18682(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18683(Player player, int index, MapObject mapObject) {}

    // Cog
    public static void mapObject18684(Player player, int index, MapObject mapObject) {}


   /* 18688 - 18943 */

    // Extractor hat
    public static void mapObject18690(Player player, int index, MapObject mapObject) {}

    // Extractor hat
    public static void mapObject18691(Player player, int index, MapObject mapObject) {}

    // Extractor gun
    public static void mapObject18694(Player player, int index, MapObject mapObject) {}

    // Extractor gun
    public static void mapObject18695(Player player, int index, MapObject mapObject) {}

    // Mind Door
    public static void mapObject18698(Player player, int index, MapObject mapObject) {}

    // Mind Door
    public static void mapObject18699(Player player, int index, MapObject mapObject) {}

    // Mind Door
    public static void mapObject18700(Player player, int index, MapObject mapObject) {}

    // Mind Door
    public static void mapObject18701(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject18702(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject18703(Player player, int index, MapObject mapObject) {}

    // Schematic crate
    public static void mapObject18711(Player player, int index, MapObject mapObject) {}

    // Pin
    public static void mapObject18721(Player player, int index, MapObject mapObject) {}

    // Pin
    public static void mapObject18722(Player player, int index, MapObject mapObject) {}

    // Extractor gun
    public static void mapObject18725(Player player, int index, MapObject mapObject) {}

    // Oak cape rack
    public static void mapObject18766(Player player, int index, MapObject mapObject) {}

    // Teak cape rack
    public static void mapObject18767(Player player, int index, MapObject mapObject) {}

    // Mahogany cape rack
    public static void mapObject18768(Player player, int index, MapObject mapObject) {}

    // Gilded cape rack
    public static void mapObject18769(Player player, int index, MapObject mapObject) {}

    // Marble cape rack
    public static void mapObject18770(Player player, int index, MapObject mapObject) {}

    // Magic cape rack
    public static void mapObject18771(Player player, int index, MapObject mapObject) {}

    // Fancy dress box
    public static void mapObject18772(Player player, int index, MapObject mapObject) {}

    // Fancy dress box
    public static void mapObject18773(Player player, int index, MapObject mapObject) {}

    // Fancy dress box
    public static void mapObject18774(Player player, int index, MapObject mapObject) {}

    // Fancy dress box
    public static void mapObject18775(Player player, int index, MapObject mapObject) {}

    // Fancy dress box
    public static void mapObject18776(Player player, int index, MapObject mapObject) {}

    // Fancy dress box
    public static void mapObject18777(Player player, int index, MapObject mapObject) {}

    // Armour case
    public static void mapObject18778(Player player, int index, MapObject mapObject) {}

    // Armour case
    public static void mapObject18779(Player player, int index, MapObject mapObject) {}

    // Armour case
    public static void mapObject18780(Player player, int index, MapObject mapObject) {}

    // Armour case
    public static void mapObject18781(Player player, int index, MapObject mapObject) {}

    // Armour case
    public static void mapObject18782(Player player, int index, MapObject mapObject) {}

    // Armour case
    public static void mapObject18783(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18784(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18785(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18786(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18787(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18788(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18789(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18790(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18791(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18792(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18793(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18794(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18795(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18796(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe
    public static void mapObject18797(Player player, int index, MapObject mapObject) {}

    // Toy box
    public static void mapObject18798(Player player, int index, MapObject mapObject) {}

    // Toy box
    public static void mapObject18799(Player player, int index, MapObject mapObject) {}

    // Toy box
    public static void mapObject18800(Player player, int index, MapObject mapObject) {}

    // Toy box
    public static void mapObject18801(Player player, int index, MapObject mapObject) {}

    // Toy box
    public static void mapObject18802(Player player, int index, MapObject mapObject) {}

    // Toy box
    public static void mapObject18803(Player player, int index, MapObject mapObject) {}

    // Treasure chest
    public static void mapObject18804(Player player, int index, MapObject mapObject) {}

    // Treasure chest
    public static void mapObject18805(Player player, int index, MapObject mapObject) {}

    // Treasure chest
    public static void mapObject18806(Player player, int index, MapObject mapObject) {}

    // Treasure chest
    public static void mapObject18807(Player player, int index, MapObject mapObject) {}

    // Treasure chest
    public static void mapObject18808(Player player, int index, MapObject mapObject) {
        player.openDialogue("treasurechest", 0);
    }

    // Treasure chest
    public static void mapObject18809(Player player, int index, MapObject mapObject) {}

    // Cape rack space
    public static void mapObject18810(Player player, int index, MapObject mapObject) {}

    // Magic wardrobe space
    public static void mapObject18811(Player player, int index, MapObject mapObject) {}

    // Toy box space
    public static void mapObject18812(Player player, int index, MapObject mapObject) {}

    // Treasure chest space
    public static void mapObject18813(Player player, int index, MapObject mapObject) {}

    // Fancy dress box space
    public static void mapObject18814(Player player, int index, MapObject mapObject) {}

    // Armour case space
    public static void mapObject18815(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject18816(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject18818(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject18819(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject18820(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject18821(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject18822(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject18823(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject18824(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject18825(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject18826(Player player, int index, MapObject mapObject) {}

    // Diseased herbs
    public static void mapObject18827(Player player, int index, MapObject mapObject) {}

    // Diseased herbs
    public static void mapObject18828(Player player, int index, MapObject mapObject) {}

    // Diseased herbs
    public static void mapObject18829(Player player, int index, MapObject mapObject) {}

    // Dead herbs
    public static void mapObject18830(Player player, int index, MapObject mapObject) {}

    // Dead herbs
    public static void mapObject18831(Player player, int index, MapObject mapObject) {}

    // Dead herbs
    public static void mapObject18832(Player player, int index, MapObject mapObject) {}

    // Troll ladder
    public static void mapObject18833(Player player, int index, MapObject mapObject) {}

    // Troll ladder
    public static void mapObject18834(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18843(Player player, int index, MapObject mapObject) {}

    // Dung
    public static void mapObject18844(Player player, int index, MapObject mapObject) {}

    // Hardy goutweed
    public static void mapObject18855(Player player, int index, MapObject mapObject) {}

    // Soil patch
    public static void mapObject18867(Player player, int index, MapObject mapObject) {}

    // Cell wall window
    public static void mapObject18869(Player player, int index, MapObject mapObject) {}

    // Cell wall window
    public static void mapObject18870(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject18871(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject18872(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject18873(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject18875(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18877(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18878(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18879(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18880(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18881(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18882(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18883(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18884(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18885(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18886(Player player, int index, MapObject mapObject) {}

    // Winch
    public static void mapObject18888(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject18889(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18898(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18899(Player player, int index, MapObject mapObject) {}

    // Footprints
    public static void mapObject18900(Player player, int index, MapObject mapObject) {}

    // Table
    public static void mapObject18902(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18903(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18904(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject18907(Player player, int index, MapObject mapObject) {}

    // Cliff edge
    public static void mapObject18922(Player player, int index, MapObject mapObject) {}

    // Cliff
    public static void mapObject18923(Player player, int index, MapObject mapObject) {}

    // Cliff
    public static void mapObject18924(Player player, int index, MapObject mapObject) {}


   /* 18944 - 19199 */

    // Winch bucket
    public static void mapObject18951(Player player, int index, MapObject mapObject) {}

    // Wooden cart
    public static void mapObject18958(Player player, int index, MapObject mapObject) {}

    // Wooden cart
    public static void mapObject18959(Player player, int index, MapObject mapObject) {}

    // Cart Camel
    public static void mapObject18960(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject18961(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject18962(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject18963(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject18967(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject18969(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject18973(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject18982(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject18987(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3017 && mapObject.getY() == 3849) {
            if (player.getX() != 3017 || player.getY() != 3850) {
                return;
            }
            player.getMovement().teleport(3069, 10255);
        }
    }

    // Ladder
    public static void mapObject18988(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3069 && mapObject.getY() == 10256) {
            player.getMovement().teleport(3016, 3849);
        }
    }

    // Ladder
    public static void mapObject18989(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3069 && mapObject.getY() == 3856) {
            Tile tile = new Tile(3017, 10250, 0);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Ladder
    public static void mapObject18990(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3017 && mapObject.getY() == 10249) {
            Tile tile = new Tile(3069, 3857, 0);
            player.getMovement().ladderDownTeleport(tile);
        }
    }

    // Staircase
    public static void mapObject18991(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject18992(Player player, int index, MapObject mapObject) {}

    // Grain of Plenty
    public static void mapObject19000(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject19001(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject19002(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject19003(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject19004(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject19005(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19025(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19026(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19027(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19028(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19029(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject19030(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject19031(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject19032(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject19034(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject19035(Player player, int index, MapObject mapObject) {}

    // Underwall tunnel
    public static void mapObject19036(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19037(Player player, int index, MapObject mapObject) {}

    // Wintumber tree
    public static void mapObject19038(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19039(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject19040(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject19042(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject19043(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3046 && mapObject.getY() == 10327) {
            player.getMovement().teleport(3048, 10337);
        } else if (mapObject.getX() == 3048 && mapObject.getY() == 10335) {
            player.getMovement().teleport(3046, 10326);
        }
    }

    // Ladder
    public static void mapObject19044(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject19045(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject19047(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject19049(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject19051(Player player, int index, MapObject mapObject) {}

    // Tunnel entrance
    public static void mapObject19053(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19054(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19055(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19056(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19057(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19058(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19059(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19060(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19061(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19062(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19063(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19064(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19066(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19067(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19068(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19069(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19070(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19071(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19072(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19073(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19074(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19075(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19076(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19077(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19078(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19079(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19080(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19081(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19082(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19083(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19084(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19085(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19086(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19087(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19088(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19089(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19090(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19091(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19092(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19093(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19094(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19095(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19096(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19097(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19098(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19099(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19100(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19101(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19102(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19103(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19104(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19105(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19106(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19107(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19108(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19109(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19110(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject19111(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject19124(Player player, int index, MapObject mapObject) {}

    // Dirt
    public static void mapObject19125(Player player, int index, MapObject mapObject) {}

    // Plank
    public static void mapObject19126(Player player, int index, MapObject mapObject) {}

    // Candles
    public static void mapObject19127(Player player, int index, MapObject mapObject) {}

    // Basket
    public static void mapObject19128(Player player, int index, MapObject mapObject) {}

    // Basket
    public static void mapObject19129(Player player, int index, MapObject mapObject) {}

    // Basket
    public static void mapObject19133(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject19135(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject19137(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject19139(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject19141(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject19143(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject19145(Player player, int index, MapObject mapObject) {}

    // Tree patch
    public static void mapObject19147(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject19159(Player player, int index, MapObject mapObject) {}

    // Loose Railing
    public static void mapObject19171(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19174(Player player, int index, MapObject mapObject) {}


   /* 19200 - 19455 */

    // Stairs
    public static void mapObject19201(Player player, int index, MapObject mapObject) {}

    // Gate of War
    public static void mapObject19206(Player player, int index, MapObject mapObject) {}

    // Gate of War
    public static void mapObject19207(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject19215(Player player, int index, MapObject mapObject) {}

    // Deadfall
    public static void mapObject19217(Player player, int index, MapObject mapObject) {}

    // Perch
    public static void mapObject19220(Player player, int index, MapObject mapObject) {}

    // Occupied perch
    public static void mapObject19221(Player player, int index, MapObject mapObject) {}

    // Stile
    public static void mapObject19222(Player player, int index, MapObject mapObject) {}

    // Magic box
    public static void mapObject19223(Player player, int index, MapObject mapObject) {}

    // Magic box failed
    public static void mapObject19224(Player player, int index, MapObject mapObject) {}

    // Magic box
    public static void mapObject19226(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19227(Player player, int index, MapObject mapObject) {}

    // Spiked pit
    public static void mapObject19228(Player player, int index, MapObject mapObject) {}

    // Collapsed trap
    public static void mapObject19230(Player player, int index, MapObject mapObject) {}

    // Collapsed trap
    public static void mapObject19231(Player player, int index, MapObject mapObject) {}

    // Collapsed trap
    public static void mapObject19232(Player player, int index, MapObject mapObject) {}

    // Collapsed trap
    public static void mapObject19233(Player player, int index, MapObject mapObject) {}

    // Collapsed trap
    public static void mapObject19234(Player player, int index, MapObject mapObject) {}

    // Collapsed trap
    public static void mapObject19235(Player player, int index, MapObject mapObject) {}

    // Collapsed trap
    public static void mapObject19236(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19253(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19254(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19255(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19256(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19257(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19258(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19259(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19260(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19261(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19262(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19263(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19264(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19265(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19266(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19267(Player player, int index, MapObject mapObject) {}

    // Pit
    public static void mapObject19268(Player player, int index, MapObject mapObject) {}

    // Rabbit snare
    public static void mapObject19333(Player player, int index, MapObject mapObject) {}

    // Broken snare
    public static void mapObject19334(Player player, int index, MapObject mapObject) {}

    // Rabbit snare
    public static void mapObject19335(Player player, int index, MapObject mapObject) {}

    // Rabbit snare
    public static void mapObject19336(Player player, int index, MapObject mapObject) {}

    // Rabbit hole
    public static void mapObject19337(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19339(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19340(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19341(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19342(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19343(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19344(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19345(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19346(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19347(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19348(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19349(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19350(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19351(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19352(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19353(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19354(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19355(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19356(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19357(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19358(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19359(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19360(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19361(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19362(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19363(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19364(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19365(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19366(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19367(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19368(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19369(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19370(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19371(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19372(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19373(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19374(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19375(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19376(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19377(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19378(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19379(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19380(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19381(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19382(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19383(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19384(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19385(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19386(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject19387(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject19388(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject19389(Player player, int index, MapObject mapObject) {}

    // Rockslide
    public static void mapObject19390(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject19391(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject19392(Player player, int index, MapObject mapObject) {}

    // Rockslide
    public static void mapObject19393(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject19394(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject19395(Player player, int index, MapObject mapObject) {}

    // Rockslide
    public static void mapObject19396(Player player, int index, MapObject mapObject) {}

    // Rockslide
    public static void mapObject19397(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject19398(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject19399(Player player, int index, MapObject mapObject) {}

    // Rockslide
    public static void mapObject19400(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject19401(Player player, int index, MapObject mapObject) {}

    // Rockslide
    public static void mapObject19402(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19403(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19404(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19405(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19406(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19407(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19408(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19409(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19410(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19411(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19412(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19413(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19414(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19415(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19416(Player player, int index, MapObject mapObject) {}

    // Jungle plant
    public static void mapObject19417(Player player, int index, MapObject mapObject) {}

    // Hollow log
    public static void mapObject19418(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19419(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19420(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19421(Player player, int index, MapObject mapObject) {}

    // Hollow log
    public static void mapObject19422(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19423(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19424(Player player, int index, MapObject mapObject) {}

    // Hollow log
    public static void mapObject19425(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19426(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject19427(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject19428(Player player, int index, MapObject mapObject) {}

    // Bush
    public static void mapObject19429(Player player, int index, MapObject mapObject) {}

    // Disturbed sand
    public static void mapObject19430(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19434(Player player, int index, MapObject mapObject) {}

    // Snow drift
    public static void mapObject19435(Player player, int index, MapObject mapObject) {}

    // Burrow
    public static void mapObject19438(Player player, int index, MapObject mapObject) {}

    // Burrow
    public static void mapObject19439(Player player, int index, MapObject mapObject) {}

    // Burrow
    public static void mapObject19440(Player player, int index, MapObject mapObject) {}


   /* 19456 - 19711 */

    // Burrow
    public static void mapObject19492(Player player, int index, MapObject mapObject) {}

    // Burrow
    public static void mapObject19493(Player player, int index, MapObject mapObject) {}

    // Burrow
    public static void mapObject19494(Player player, int index, MapObject mapObject) {}

    // Burrow
    public static void mapObject19552(Player player, int index, MapObject mapObject) {}

    // Burrow
    public static void mapObject19553(Player player, int index, MapObject mapObject) {}

    // Burrow
    public static void mapObject19593(Player player, int index, MapObject mapObject) {}

    // Burrow
    public static void mapObject19594(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject19640(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject19641(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19680(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject19681(Player player, int index, MapObject mapObject) {}

    // Steps
    public static void mapObject19690(Player player, int index, MapObject mapObject) {}

    // Steps
    public static void mapObject19691(Player player, int index, MapObject mapObject) {}


   /* 19712 - 19967 */

    // Rockslide
    public static void mapObject19752(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19753(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19759(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19760(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19762(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19763(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19764(Player player, int index, MapObject mapObject) {}

    // Campfire
    public static void mapObject19785(Player player, int index, MapObject mapObject) {}

    // Books
    public static void mapObject19787(Player player, int index, MapObject mapObject) {}

    // Camping equipment
    public static void mapObject19788(Player player, int index, MapObject mapObject) {}

    // Rocky outcrop
    public static void mapObject19790(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19791(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19792(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19798(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19809(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19811(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject19812(Player player, int index, MapObject mapObject) {}

    // Stone door
    public static void mapObject19843(Player player, int index, MapObject mapObject) {}

    // Rocky handholds
    public static void mapObject19846(Player player, int index, MapObject mapObject) {}

    // Rocky handholds
    public static void mapObject19847(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject19849(Player player, int index, MapObject mapObject) {}

    // Eagle lever
    public static void mapObject19877(Player player, int index, MapObject mapObject) {}

    // Eagle lever
    public static void mapObject19878(Player player, int index, MapObject mapObject) {}

    // Campfire
    public static void mapObject19884(Player player, int index, MapObject mapObject) {}

    // Books
    public static void mapObject19886(Player player, int index, MapObject mapObject) {}

    // Camping equipment
    public static void mapObject19888(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject19891(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19894(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19897(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19900(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19903(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19906(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject19909(Player player, int index, MapObject mapObject) {}

    // Stone door
    public static void mapObject19914(Player player, int index, MapObject mapObject) {}

    // Stone door
    public static void mapObject19915(Player player, int index, MapObject mapObject) {}

    // Stone door
    public static void mapObject19916(Player player, int index, MapObject mapObject) {}

    // Stone door
    public static void mapObject19917(Player player, int index, MapObject mapObject) {}

    // Stone door
    public static void mapObject19918(Player player, int index, MapObject mapObject) {}

    // Birdseed holder
    public static void mapObject19919(Player player, int index, MapObject mapObject) {}

    // Giant feathers
    public static void mapObject19922(Player player, int index, MapObject mapObject) {}

    // Rocky outcrop
    public static void mapObject19923(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject19924(Player player, int index, MapObject mapObject) {}

    // Rocky outcrop
    public static void mapObject19925(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject19926(Player player, int index, MapObject mapObject) {}

    // Reset Lever
    public static void mapObject19945(Player player, int index, MapObject mapObject) {}

    // Eagle lever
    public static void mapObject19946(Player player, int index, MapObject mapObject) {}

    // Eagle lever
    public static void mapObject19947(Player player, int index, MapObject mapObject) {}

    // Eagle lever
    public static void mapObject19948(Player player, int index, MapObject mapObject) {}

    // Eagle lever
    public static void mapObject19949(Player player, int index, MapObject mapObject) {}

    // Stone pedestal
    public static void mapObject19950(Player player, int index, MapObject mapObject) {}

    // Opening
    public static void mapObject19967(Player player, int index, MapObject mapObject) {}


   /* 19968 - 20223 */

    // Rocks
    public static void mapObject19969(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject19970(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject19971(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject19972(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject19973(Player player, int index, MapObject mapObject) {}

    // Stone pedestal
    public static void mapObject19974(Player player, int index, MapObject mapObject) {}

    // Stone pedestal
    public static void mapObject19975(Player player, int index, MapObject mapObject) {}

    // Winch
    public static void mapObject19976(Player player, int index, MapObject mapObject) {}

    // Winch
    public static void mapObject19977(Player player, int index, MapObject mapObject) {}

    // Winch
    public static void mapObject19978(Player player, int index, MapObject mapObject) {}

    // Winch
    public static void mapObject19979(Player player, int index, MapObject mapObject) {}

    // Pedestal
    public static void mapObject19980(Player player, int index, MapObject mapObject) {}

    // Stone pedestal
    public static void mapObject19984(Player player, int index, MapObject mapObject) {}

    // Young vine
    public static void mapObject19985(Player player, int index, MapObject mapObject) {}

    // Young vine
    public static void mapObject19986(Player player, int index, MapObject mapObject) {}

    // Growing vine
    public static void mapObject19987(Player player, int index, MapObject mapObject) {}

    // Tall vine
    public static void mapObject19988(Player player, int index, MapObject mapObject) {}

    // Tall vine
    public static void mapObject19989(Player player, int index, MapObject mapObject) {}

    // Stone door
    public static void mapObject19990(Player player, int index, MapObject mapObject) {}

    // Stone door
    public static void mapObject19991(Player player, int index, MapObject mapObject) {}

    // Stone door
    public static void mapObject19992(Player player, int index, MapObject mapObject) {}

    // Young vine
    public static void mapObject19993(Player player, int index, MapObject mapObject) {}

    // Rocky outcrop
    public static void mapObject19994(Player player, int index, MapObject mapObject) {}

    // Buried skeleton
    public static void mapObject19996(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject20045(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject20046(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject20049(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject20050(Player player, int index, MapObject mapObject) {}

    // Trellis
    public static void mapObject20056(Player player, int index, MapObject mapObject) {}

    // Castle wall
    public static void mapObject20084(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject20085(Player player, int index, MapObject mapObject) {}

    // City gate
    public static void mapObject20087(Player player, int index, MapObject mapObject) {}

    // City gate
    public static void mapObject20088(Player player, int index, MapObject mapObject) {}

    // City gate
    public static void mapObject20089(Player player, int index, MapObject mapObject) {}

    // City gate
    public static void mapObject20090(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject20095(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20099(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20100(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20101(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20102(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20103(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20104(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20105(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20106(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20107(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20108(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20109(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20110(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20111(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20112(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20113(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20114(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20115(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20116(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject20118(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20119(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20120(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20121(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20122(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20123(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20124(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20125(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20126(Player player, int index, MapObject mapObject) {}

    // Bank counter
    public static void mapObject20127(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Egg launcher
    public static void mapObject20133(Player player, int index, MapObject mapObject) {}

    // Blackboard
    public static void mapObject20134(Player player, int index, MapObject mapObject) {}

    // Scroll table
    public static void mapObject20149(Player player, int index, MapObject mapObject) {}

    // Healer spring
    public static void mapObject20150(Player player, int index, MapObject mapObject) {}

    // Lure cave
    public static void mapObject20151(Player player, int index, MapObject mapObject) {}

    // Penance Fighter statue
    public static void mapObject20164(Player player, int index, MapObject mapObject) {}

    // Penance Healer statue
    public static void mapObject20165(Player player, int index, MapObject mapObject) {}

    // Penance Runner statue
    public static void mapObject20166(Player player, int index, MapObject mapObject) {}

    // Penance Ranger statue
    public static void mapObject20167(Player player, int index, MapObject mapObject) {}

    // Penance Queen spawn statue
    public static void mapObject20168(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20193(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20194(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20199(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20200(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20201(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20202(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20203(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20204(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20205(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20206(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20207(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20208(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20209(Player player, int index, MapObject mapObject) {}

    // Obstacle pipe
    public static void mapObject20210(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2552 && mapObject.getY() == 3559) {
            if (player.getY() >= 3560) {
                player.getMovement().teleport(2552, 3558);
            } else {
                player.getMovement().teleport(2552, 3561);
            }
        }
    }

    // Obstacle net
    public static void mapObject20211(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2539) {
            return;
        }
        player.getGameEncoder().sendMessage("You climb the netting.");
        Tile toTile = new Tile(mapObject.getX() - 1, player.getY(), 1);
        player.getMovement().ladderUpTeleport(toTile);
        player.setFaceTile(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 2) {
                    player.putAttribute("agility_stage", 3);
                }
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }


   /* 20224 - 20479 */

    // Ladder
    public static void mapObject20226(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20227(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20228(Player player, int index, MapObject mapObject) {}

    // Information scroll
    public static void mapObject20229(Player player, int index, MapObject mapObject) {}

    // Runner trap(1)
    public static void mapObject20230(Player player, int index, MapObject mapObject) {}

    // Broken trap(0)
    public static void mapObject20231(Player player, int index, MapObject mapObject) {}

    // Lava crater
    public static void mapObject20232(Player player, int index, MapObject mapObject) {}

    // Poison crater
    public static void mapObject20233(Player player, int index, MapObject mapObject) {}

    // Lava crater
    public static void mapObject20234(Player player, int index, MapObject mapObject) {}

    // Poison crater
    public static void mapObject20235(Player player, int index, MapObject mapObject) {}

    // Penance cave
    public static void mapObject20237(Player player, int index, MapObject mapObject) {}

    // Penance cave
    public static void mapObject20238(Player player, int index, MapObject mapObject) {}

    // Penance cave
    public static void mapObject20239(Player player, int index, MapObject mapObject) {}

    // Attacker item machine
    public static void mapObject20241(Player player, int index, MapObject mapObject) {}

    // Defender item machine
    public static void mapObject20242(Player player, int index, MapObject mapObject) {}

    // Healer item machine
    public static void mapObject20243(Player player, int index, MapObject mapObject) {}

    // Horn of glory
    public static void mapObject20247(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject20248(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Petrified mushroom
    public static void mapObject20250(Player player, int index, MapObject mapObject) {}

    // Egg hopper
    public static void mapObject20264(Player player, int index, MapObject mapObject) {}

    // Egg hopper
    public static void mapObject20265(Player player, int index, MapObject mapObject) {}

    // Egg hopper
    public static void mapObject20266(Player player, int index, MapObject mapObject) {}

    // Egg hopper
    public static void mapObject20267(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20271(Player player, int index, MapObject mapObject) {}

    // Odd markings
    public static void mapObject20272(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20275(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject20276(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20277(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20278(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20280(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20281(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject20282(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject20283(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20284(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20285(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20286(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20287(Player player, int index, MapObject mapObject) {}

    // Kaleef's body
    public static void mapObject20288(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject20325(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Trapdoor
    public static void mapObject20340(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject20341(Player player, int index, MapObject mapObject) {}

    // Spice stall
    public static void mapObject20348(Player player, int index, MapObject mapObject) {}

    // Tea stall
    public static void mapObject20350(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20353(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20354(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20356(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20357(Player player, int index, MapObject mapObject) {}

    // Spinning wheel
    public static void mapObject20365(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject20369(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject20377(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject20378(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject20391(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20407(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20408(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20409(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20410(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20411(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20412(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20413(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20414(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20415(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20416(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20417(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20418(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20419(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20420(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20421(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20422(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20423(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20424(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20425(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject20426(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject20435(Player player, int index, MapObject mapObject) {}

    // Depleted vein
    public static void mapObject20439(Player player, int index, MapObject mapObject) {}

    // Depleted vein
    public static void mapObject20440(Player player, int index, MapObject mapObject) {}

    // Depleted vein
    public static void mapObject20441(Player player, int index, MapObject mapObject) {}

    // Depleted vein
    public static void mapObject20442(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20443(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20444(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20445(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20446(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20447(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20448(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20449(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20450(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject20451(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20452(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20453(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20454(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20455(Player player, int index, MapObject mapObject) {}


   /* 20480 - 20735 */

    // Passageway
    public static void mapObject20482(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20483(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject20484(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20485(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject20486(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject20487(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20488(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20489(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20490(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20491(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20492(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20493(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject20494(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20495(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject20496(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20497(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20498(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20499(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20500(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20501(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20502(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20503(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20504(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20505(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20506(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20507(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject20508(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20509(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20510(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20511(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20512(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20513(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20514(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20515(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20516(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20517(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20518(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20519(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20520(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20521(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20522(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20523(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20524(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20525(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20526(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20527(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20528(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20529(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20530(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20531(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20532(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20533(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20534(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20535(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20536(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20537(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20538(Player player, int index, MapObject mapObject) {}

    // Passageway
    public static void mapObject20539(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20540(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20541(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20542(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20543(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20544(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20545(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20546(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20547(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20548(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20549(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20550(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20551(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20552(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20553(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20554(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20555(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20556(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject20557(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20558(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20559(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20560(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20561(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20562(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20563(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20564(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20565(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20566(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20567(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20568(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject20569(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20583(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20584(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20585(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20586(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject20588(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject20590(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject20592(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject20593(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject20594(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject20596(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject20598(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject20599(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20632(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20633(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20634(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20635(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20636(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20637(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20638(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject20639(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject20648(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject20649(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject20650(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject20651(Player player, int index, MapObject mapObject) {}

    // Gift of Peace
    public static void mapObject20656(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject20667(Player player, int index, MapObject mapObject) {
        player.getBarrows().exitCrypt(Barrows.AHRIM);
    }

    // Staircase
    public static void mapObject20668(Player player, int index, MapObject mapObject) {
        player.getBarrows().exitCrypt(Barrows.DHAROK);
    }

    // Staircase
    public static void mapObject20669(Player player, int index, MapObject mapObject) {
        player.getBarrows().exitCrypt(Barrows.GUTHAN);
    }

    // Staircase
    public static void mapObject20670(Player player, int index, MapObject mapObject) {
        player.getBarrows().exitCrypt(Barrows.KARIL);
    }

    // Staircase
    public static void mapObject20671(Player player, int index, MapObject mapObject) {
        player.getBarrows().exitCrypt(Barrows.TORAG);
    }

    // Staircase
    public static void mapObject20672(Player player, int index, MapObject mapObject) {
        player.getBarrows().exitCrypt(Barrows.VERAC);
    }

    // Ladder
    public static void mapObject20673(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20674(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20675(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20676(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20677(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20679(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20681(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20682(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20683(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20684(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20685(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20686(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20687(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20688(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20689(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20690(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20691(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20692(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20693(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20694(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20695(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20696(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20698(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20700(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20701(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20702(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20703(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20704(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20705(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20706(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20707(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20708(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20709(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20710(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20711(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20712(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20713(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20714(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20715(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject20720(Player player, int index, MapObject mapObject) {
        player.getBarrows().searchSarcophagus(Barrows.DHAROK);
    }

    // Sarcophagus
    public static void mapObject20721(Player player, int index, MapObject mapObject) {
        player.getBarrows().searchSarcophagus(Barrows.TORAG);
    }

    // Sarcophagus
    public static void mapObject20722(Player player, int index, MapObject mapObject) {
        player.getBarrows().searchSarcophagus(Barrows.GUTHAN);
    }

    // Chest
    public static void mapObject20723(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject20724(Player player, int index, MapObject mapObject) {}


   /* 20736 - 20991 */

    // Sarcophagus
    public static void mapObject20770(Player player, int index, MapObject mapObject) {
        player.getBarrows().searchSarcophagus(Barrows.AHRIM);
    }

    // Sarcophagus
    public static void mapObject20771(Player player, int index, MapObject mapObject) {
        player.getBarrows().searchSarcophagus(Barrows.KARIL);
    }

    // Sarcophagus
    public static void mapObject20772(Player player, int index, MapObject mapObject) {
        player.getBarrows().searchSarcophagus(Barrows.VERAC);
    }

    // Spikey chain
    public static void mapObject20782(Player player, int index, MapObject mapObject) {}

    // Spikey chain
    public static void mapObject20783(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20784(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject20785(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject20786(Player player, int index, MapObject mapObject) {}

    // Dead Explorer
    public static void mapObject20788(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject20790(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject20795(Player player, int index, MapObject mapObject) {}

    // Exercise mat
    public static void mapObject20801(Player player, int index, MapObject mapObject) {}

    // Exercise mat
    public static void mapObject20810(Player player, int index, MapObject mapObject) {}

    // Control panel
    public static void mapObject20813(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20817(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject20818(Player player, int index, MapObject mapObject) {}

    // Entrance
    public static void mapObject20822(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject20836(Player player, int index, MapObject mapObject) {}

    // Locked door
    public static void mapObject20837(Player player, int index, MapObject mapObject) {}

    // Locked door
    public static void mapObject20838(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject20843(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20870(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20871(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20872(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject20873(Player player, int index, MapObject mapObject) {
        player.getRandomEvent().sendWidget();
    }

    // Dungeon entrance
    public static void mapObject20876(Player player, int index, MapObject mapObject) {}

    // Dungeon entrance
    public static void mapObject20877(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon entrance
        Tile tile = new Tile(2712, 9564, 0);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Exit
    public static void mapObject20878(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon exit
        Tile tile = new Tile(2744, 3151, 0);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Log balance
    public static void mapObject20882(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2687, 9506, 0);
        player.getMovement().teleport(tile);
    }

    // Log balance
    public static void mapObject20884(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2682, 9506, 0);
        player.getMovement().teleport(tile);
    }

    // Crate
    public static void mapObject20885(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20886(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20887(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20888(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20889(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20890(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20891(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20892(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20893(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20894(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20895(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20896(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20897(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20898(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20899(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20900(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20901(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20902(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20903(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20904(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20905(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20906(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20907(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20908(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20909(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20910(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20911(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20912(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20913(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20914(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20915(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20916(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20917(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20918(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20919(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20920(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20921(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20922(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20923(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject20924(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject20925(Player player, int index, MapObject mapObject) {
        if (mapObject.getOriginal() != null || mapObject.getAttachment() != null) {
            return;
        }
        if (player.getY() >= 3394) {
            player.getMovement().clear();
            player.getMovement().addMovement(player.getX(), player.getY() - 1);
            Region.openDoor(player, mapObject, 1, false, false);
        } else {
            player.getMovement().clear();
            player.getMovement().addMovement(player.getX(), player.getY() + 1);
            Region.openDoor(player, mapObject, 1, false, false);
        }
    }

    // Fishing spot
    public static void mapObject20927(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject20928(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject20929(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject20930(Player player, int index, MapObject mapObject) {}

    // Tomb Door
    public static void mapObject20931(Player player, int index, MapObject mapObject) {}

    // Tomb Door
    public static void mapObject20932(Player player, int index, MapObject mapObject) {}

    // Grand Gold Chest
    public static void mapObject20946(Player player, int index, MapObject mapObject) {}

    // Tomb Door
    public static void mapObject20948(Player player, int index, MapObject mapObject) {}

    // Tomb Door
    public static void mapObject20949(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject20973(Player player, int index, MapObject mapObject) {
        player.getBarrows().openChest(mapObject.getX() != 3551 || mapObject.getY() != 9695);
    }

    // An anonymous looking door
    public static void mapObject20974(Player player, int index, MapObject mapObject) {}

    // An anonymous looking door
    public static void mapObject20975(Player player, int index, MapObject mapObject) {}

    // An anonymous looking door
    public static void mapObject20977(Player player, int index, MapObject mapObject) {}

    // An anonymous looking door
    public static void mapObject20978(Player player, int index, MapObject mapObject) {}

    // An anonymous looking door
    public static void mapObject20987(Player player, int index, MapObject mapObject) {}


   /* 20992 - 21247 */

    // Chasm
    public static void mapObject21035(Player player, int index, MapObject mapObject) {}

    // Control panel
    public static void mapObject21055(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21065(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21068(Player player, int index, MapObject mapObject) {}

    // Big Button
    public static void mapObject21086(Player player, int index, MapObject mapObject) {}

    // Ice steps
    public static void mapObject21095(Player player, int index, MapObject mapObject) {}

    // Stepping Stone
    public static void mapObject21120(Player player, int index, MapObject mapObject) {}

    // Stepping Stone
    public static void mapObject21126(Player player, int index, MapObject mapObject) {}

    // Stepping Stone
    public static void mapObject21127(Player player, int index, MapObject mapObject) {}

    // Stepping Stone
    public static void mapObject21128(Player player, int index, MapObject mapObject) {}

    // Stepping Stone
    public static void mapObject21129(Player player, int index, MapObject mapObject) {}

    // Stepping Stone
    public static void mapObject21130(Player player, int index, MapObject mapObject) {}

    // Stepping Stone
    public static void mapObject21131(Player player, int index, MapObject mapObject) {}

    // Stepping Stone
    public static void mapObject21132(Player player, int index, MapObject mapObject) {}

    // Stepping Stone
    public static void mapObject21133(Player player, int index, MapObject mapObject) {}

    // Icicles
    public static void mapObject21134(Player player, int index, MapObject mapObject) {}

    // Snow jump
    public static void mapObject21142(Player player, int index, MapObject mapObject) {}

    // Snow jump
    public static void mapObject21143(Player player, int index, MapObject mapObject) {}

    // Ice
    public static void mapObject21148(Player player, int index, MapObject mapObject) {}

    // Ice
    public static void mapObject21149(Player player, int index, MapObject mapObject) {}

    // Ice
    public static void mapObject21150(Player player, int index, MapObject mapObject) {}

    // Ice
    public static void mapObject21151(Player player, int index, MapObject mapObject) {}

    // Ice
    public static void mapObject21152(Player player, int index, MapObject mapObject) {}

    // Ice
    public static void mapObject21153(Player player, int index, MapObject mapObject) {}

    // Ice
    public static void mapObject21154(Player player, int index, MapObject mapObject) {}

    // Ice
    public static void mapObject21155(Player player, int index, MapObject mapObject) {}

    // Ice
    public static void mapObject21156(Player player, int index, MapObject mapObject) {}

    // A crack
    public static void mapObject21157(Player player, int index, MapObject mapObject) {}

    // Avalanche
    public static void mapObject21158(Player player, int index, MapObject mapObject) {}

    // Avalanche
    public static void mapObject21159(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21160(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21161(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21162(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21164(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21167(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21169(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21170(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21171(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject21172(Player player, int index, MapObject mapObject) {}

    // Boat
    public static void mapObject21175(Player player, int index, MapObject mapObject) {}

    // Boat
    public static void mapObject21176(Player player, int index, MapObject mapObject) {}

    // Boat
    public static void mapObject21177(Player player, int index, MapObject mapObject) {}

    // Firm snow patch
    public static void mapObject21179(Player player, int index, MapObject mapObject) {}

    // Bird hide structure
    public static void mapObject21180(Player player, int index, MapObject mapObject) {}

    // Snowy bird hide
    public static void mapObject21181(Player player, int index, MapObject mapObject) {}

    // Destroyed bird hide
    public static void mapObject21182(Player player, int index, MapObject mapObject) {}

    // Chasm
    public static void mapObject21187(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21243(Player player, int index, MapObject mapObject) {}

    // A crack
    public static void mapObject21245(Player player, int index, MapObject mapObject) {}

    // Firm snow patch
    public static void mapObject21246(Player player, int index, MapObject mapObject) {}


   /* 21248 - 21503 */

    // Collector Converter
    public static void mapObject21250(Player player, int index, MapObject mapObject) {}

    // An anonymous looking door
    public static void mapObject21251(Player player, int index, MapObject mapObject) {}

    // An anonymous looking door
    public static void mapObject21253(Player player, int index, MapObject mapObject) {}

    // An anonymous looking door
    public static void mapObject21254(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject21255(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject21256(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21261(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21262(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21263(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21265(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21266(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21267(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21269(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21270(Player player, int index, MapObject mapObject) {}

    // Funeral Pyre
    public static void mapObject21272(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21273(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21275(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21276(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21277(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21278(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject21279(Player player, int index, MapObject mapObject) {}

    // Speartrap
    public static void mapObject21280(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21281(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21282(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21283(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21284(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21285(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21286(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21287(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21288(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21289(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21290(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21291(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21292(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21293(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21294(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21295(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21296(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21297(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21298(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject21299(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject21300(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject21301(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Clay forge
    public static void mapObject21303(Player player, int index, MapObject mapObject) {
        Smithing.openSmelt(player);
    }

    // Spinning wheel
    public static void mapObject21304(Player player, int index, MapObject mapObject) {}

    // Woodcutting stump
    public static void mapObject21305(Player player, int index, MapObject mapObject) {}

    // Rope bridge
    public static void mapObject21306(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2317, 3831);
    }

    // Rope bridge
    public static void mapObject21307(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2317, 3824);
    }

    // Rope bridge
    public static void mapObject21308(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2343, 3828);
    }

    // Rope bridge
    public static void mapObject21309(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2343, 3821);
    }

    // Rope bridge
    public static void mapObject21310(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2314, 3847);
    }

    // Rope bridge
    public static void mapObject21311(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2343, 3840);
    }

    // Rope bridge
    public static void mapObject21312(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2355, 3847);
    }

    // Rope bridge
    public static void mapObject21313(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2355, 3840);
    }

    // Rope bridge
    public static void mapObject21314(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2378, 3847);
    }

    // Rope bridge
    public static void mapObject21315(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2378, 3840);
    }

    // Rope bridge
    public static void mapObject21316(Player player, int index, MapObject mapObject) {}

    // Rope bridge
    public static void mapObject21317(Player player, int index, MapObject mapObject) {}

    // Rope bridge
    public static void mapObject21318(Player player, int index, MapObject mapObject) {}

    // Rope bridge
    public static void mapObject21319(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21340(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21341(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21342(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21343(Player player, int index, MapObject mapObject) {}

    // Bell
    public static void mapObject21394(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject21395(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject21396(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject21397(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject21398(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject21399(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject21400(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject21401(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject21402(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject21403(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject21404(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject21405(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Gate
    public static void mapObject21406(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Staircase
    public static void mapObject21455(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2407, 10187);
    }

    // null
    public static void mapObject21502(Player player, int index, MapObject mapObject) {}


   /* 21504 - 21759 */

    // Door
    public static void mapObject21505(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject21506(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject21507(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Door
    public static void mapObject21508(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject21511(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject21512(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject21513(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject21514(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject21515(Player player, int index, MapObject mapObject) {}

    // Exit cavern
    public static void mapObject21560(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject21578(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2398, 3811);
    }

    // Cave
    public static void mapObject21581(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21583(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21584(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21585(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21586(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21587(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21588(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21589(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject21590(Player player, int index, MapObject mapObject) {}

    // Stone ladder
    public static void mapObject21592(Player player, int index, MapObject mapObject) {}

    // Stone ladder
    public static void mapObject21593(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21594(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21595(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21596(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21597(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21598(Player player, int index, MapObject mapObject) {}

    // Cave opening
    public static void mapObject21599(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject21600(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Gate
    public static void mapObject21601(Player player, int index, MapObject mapObject) {
        Region.openGates(player, mapObject);
    }

    // Ice Troll King
    public static void mapObject21622(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21668(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21669(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21670(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21671(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21672(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21673(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21674(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21675(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21676(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21677(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21678(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21679(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21680(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21681(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21682(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21683(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21684(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21685(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21686(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21687(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21688(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21689(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21690(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21691(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21692(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21693(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21694(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject21695(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject21722(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2643, 9594, 2);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Stairs
    public static void mapObject21724(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2649, 9591, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Stairs
    public static void mapObject21725(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2636, 9510, 2);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Stairs
    public static void mapObject21726(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2636, 9517, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Pipe
    public static void mapObject21727(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (mapObject.getX() == 2698 && mapObject.getY() == 9498) {
            Tile tile = new Tile(2698, 9492, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        } else if (mapObject.getX() == 2698 && mapObject.getY() == 9493) {
            Tile tile = new Tile(2698, 9500, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        }
    }

    // Pipe
    public static void mapObject21728(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (mapObject.getX() == 2655 && mapObject.getY() == 9567) {
            Tile tile = new Tile(2655, 9573, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        } else if (mapObject.getX() == 2655 && mapObject.getY() == 9571) {
            Tile tile = new Tile(2655, 9566, 0);
            player.getMovement().animatedTeleport(tile, 746, 748, null, null, 0);
        }
    }

    // Vines
    public static void mapObject21731(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (player.getX() >= 2691) {
            Tile tile = new Tile(2689, 9564, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2691, 9564, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Vines
    public static void mapObject21732(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (player.getY() <= 9568) {
            Tile tile = new Tile(2683, 9570, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2683, 9568, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Vines
    public static void mapObject21733(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (player.getX() <= 2672) {
            Tile tile = new Tile(2674, 9499, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2672, 9499, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Vines
    public static void mapObject21734(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (player.getX() <= 2674) {
            Tile tile = new Tile(2676, 9479, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2674, 9479, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Vines
    public static void mapObject21735(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        if (player.getX() <= 2693) {
            Tile tile = new Tile(2695, 9482, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2693, 9482, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Stepping stone
    public static void mapObject21738(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2647, 9557, 0);
        player.getMovement().animatedTeleport(tile, 3067, null, 1);
    }

    // Stepping stone
    public static void mapObject21739(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2649, 9562, 0);
        player.getMovement().animatedTeleport(tile, 3067, null, 1);
    }


   /* 21760 - 22015 */

    // Portcullis
    public static void mapObject21772(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1239 && mapObject.getY() == 1225) {
            player.getMovement().teleport(1290, 1252);
        } else if (mapObject.getX() == 1367 && mapObject.getY() == 1225) {
            player.getMovement().teleport(1332, 1252);
        } else if (mapObject.getX() == 1303 && mapObject.getY() == 1289) {
            player.getMovement().teleport(1310, 1273);
        }
        player.getController().stopWithTeleport();
    }

    // Ladder
    public static void mapObject21781(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject21782(Player player, int index, MapObject mapObject) {}

    // Shelves
    public static void mapObject21794(Player player, int index, MapObject mapObject) {}

    // Crack
    public static void mapObject21800(Player player, int index, MapObject mapObject) {}

    // Tower door
    public static void mapObject21814(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject21870(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject21871(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject21872(Player player, int index, MapObject mapObject) {}

    // Pressure machine
    public static void mapObject21873(Player player, int index, MapObject mapObject) {}

    // Pipe machine
    public static void mapObject21880(Player player, int index, MapObject mapObject) {}

    // Symbol of life
    public static void mapObject21893(Player player, int index, MapObject mapObject) {}

    // Symbol of life
    public static void mapObject21894(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject21908(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject21909(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject21910(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject21911(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject21912(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject21913(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject21914(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject21915(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject21916(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject21917(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject21921(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject21922(Player player, int index, MapObject mapObject) {}

    // Plant
    public static void mapObject21924(Player player, int index, MapObject mapObject) {}

    // Tower door
    public static void mapObject21929(Player player, int index, MapObject mapObject) {}

    // Cage
    public static void mapObject21941(Player player, int index, MapObject mapObject) {}

    // Pipe machine
    public static void mapObject21943(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject21944(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject21950(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22007(Player player, int index, MapObject mapObject) {}


   /* 22016 - 22271 */

    // Peephole
    public static void mapObject22097(Player player, int index, MapObject mapObject) {}

    // Peephole
    public static void mapObject22102(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22113(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22114(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22115(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22116(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22117(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22118(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22119(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22121(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22122(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22164(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22172(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22173(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22247(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22248(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22250(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22252(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22253(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22254(Player player, int index, MapObject mapObject) {}


   /* 22272 - 22527 */

    // Ladder
    public static void mapObject22274(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22275(Player player, int index, MapObject mapObject) {}

    // Locker
    public static void mapObject22298(Player player, int index, MapObject mapObject) {}

    // Locker
    public static void mapObject22299(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject22300(Player player, int index, MapObject mapObject) {}

    // Cabbage
    public static void mapObject22301(Player player, int index, MapObject mapObject) {}

    // Stile
    public static void mapObject22302(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject22353(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject22354(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject22355(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22365(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22366(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22367(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22368(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22369(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22370(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22371(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22372(Player player, int index, MapObject mapObject) {}

    // Flour bin
    public static void mapObject22421(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject22424(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject22427(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22432(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22433(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22434(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject22435(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject22436(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject22437(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject22438(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject22453(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject22454(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject22457(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject22473(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject22474(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject22475(Player player, int index, MapObject mapObject) {}

    // Wheat
    public static void mapObject22476(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject22489(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject22490(Player player, int index, MapObject mapObject) {}

    // Flour bin
    public static void mapObject22493(Player player, int index, MapObject mapObject) {}

    // Path
    public static void mapObject22496(Player player, int index, MapObject mapObject) {}

    // Marv (sick)
    public static void mapObject22497(Player player, int index, MapObject mapObject) {}

    // Marv (very sick)
    public static void mapObject22498(Player player, int index, MapObject mapObject) {}

    // Marv (ghastly!)
    public static void mapObject22499(Player player, int index, MapObject mapObject) {}

    // Marv (sick)
    public static void mapObject22500(Player player, int index, MapObject mapObject) {}

    // Marv (very sick)
    public static void mapObject22501(Player player, int index, MapObject mapObject) {}

    // Marv (ghastly!)
    public static void mapObject22502(Player player, int index, MapObject mapObject) {}

    // Marv (Well)
    public static void mapObject22503(Player player, int index, MapObject mapObject) {}

    // Hank (sick)
    public static void mapObject22504(Player player, int index, MapObject mapObject) {}

    // Hank (very sick)
    public static void mapObject22505(Player player, int index, MapObject mapObject) {}

    // Hank (ghastly!)
    public static void mapObject22506(Player player, int index, MapObject mapObject) {}

    // Hank (sick)
    public static void mapObject22507(Player player, int index, MapObject mapObject) {}

    // Hank (very sick)
    public static void mapObject22508(Player player, int index, MapObject mapObject) {}

    // Hank (ghastly!)
    public static void mapObject22509(Player player, int index, MapObject mapObject) {}

    // Hank (Well)
    public static void mapObject22510(Player player, int index, MapObject mapObject) {}

    // Wilf (sick)
    public static void mapObject22511(Player player, int index, MapObject mapObject) {}

    // Wilf (very sick)
    public static void mapObject22512(Player player, int index, MapObject mapObject) {}

    // Wilf (ghastly!)
    public static void mapObject22513(Player player, int index, MapObject mapObject) {}

    // Wilf (sick)
    public static void mapObject22514(Player player, int index, MapObject mapObject) {}

    // Wilf (very sick)
    public static void mapObject22515(Player player, int index, MapObject mapObject) {}

    // Wilf (ghastly!)
    public static void mapObject22516(Player player, int index, MapObject mapObject) {}

    // Wilf (Well)
    public static void mapObject22517(Player player, int index, MapObject mapObject) {}

    // Sarah (sick!)
    public static void mapObject22518(Player player, int index, MapObject mapObject) {}

    // Sarah (very sick!)
    public static void mapObject22519(Player player, int index, MapObject mapObject) {}

    // Sarah (ghastly!)
    public static void mapObject22520(Player player, int index, MapObject mapObject) {}

    // Sarah (sick!)
    public static void mapObject22521(Player player, int index, MapObject mapObject) {}

    // Sarah (very sick!)
    public static void mapObject22522(Player player, int index, MapObject mapObject) {}

    // Sarah (ghastly!)
    public static void mapObject22523(Player player, int index, MapObject mapObject) {}

    // Sarah (Well)
    public static void mapObject22524(Player player, int index, MapObject mapObject) {}

    // Rachel (sick)
    public static void mapObject22525(Player player, int index, MapObject mapObject) {}

    // Rachel (very sick)
    public static void mapObject22526(Player player, int index, MapObject mapObject) {}

    // Rachel (ghastly!)
    public static void mapObject22527(Player player, int index, MapObject mapObject) {}


   /* 22528 - 22783 */

    // Rachel (sick)
    public static void mapObject22528(Player player, int index, MapObject mapObject) {}

    // Rachel (very sick)
    public static void mapObject22529(Player player, int index, MapObject mapObject) {}

    // Rachel (ghastly!)
    public static void mapObject22530(Player player, int index, MapObject mapObject) {}

    // Rachel (Well)
    public static void mapObject22531(Player player, int index, MapObject mapObject) {}

    // Partially broken bridge
    public static void mapObject22533(Player player, int index, MapObject mapObject) {}

    // Slightly broken bridge
    public static void mapObject22534(Player player, int index, MapObject mapObject) {}

    // Fixed bridge
    public static void mapObject22535(Player player, int index, MapObject mapObject) {}

    // Jutting wall
    public static void mapObject22552(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject22556(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject22557(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22564(Player player, int index, MapObject mapObject) {}

    // Cable
    public static void mapObject22569(Player player, int index, MapObject mapObject) {}

    // Cable
    public static void mapObject22572(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22600(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22601(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22602(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22608(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22609(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22650(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22651(Player player, int index, MapObject mapObject) {}

    // Blocked tunnel
    public static void mapObject22656(Player player, int index, MapObject mapObject) {}

    // Blocked tunnel
    public static void mapObject22657(Player player, int index, MapObject mapObject) {}

    // Pylon
    public static void mapObject22664(Player player, int index, MapObject mapObject) {}

    // Ladder top
    public static void mapObject22666(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject22667(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject22681(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject22682(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject22697(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject22698(Player player, int index, MapObject mapObject) {}

    // Anvil
    public static void mapObject22725(Player player, int index, MapObject mapObject) {}

    // Wire
    public static void mapObject22730(Player player, int index, MapObject mapObject) {}

    // Zapper
    public static void mapObject22735(Player player, int index, MapObject mapObject) {}

    // Empty lamp
    public static void mapObject22763(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject22778(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject22779(Player player, int index, MapObject mapObject) {}


   /* 22784 - 23039 */

    // Bank booth
    public static void mapObject22819(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Door
    public static void mapObject22913(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22914(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22920(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject22921(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22931(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22932(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22933(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22934(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22935(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject22936(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22937(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22938(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22939(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22940(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22941(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject22942(Player player, int index, MapObject mapObject) {}

    // Bone door
    public static void mapObject22945(Player player, int index, MapObject mapObject) {
        int entryRequirement = 0;
        if (mapObject.getX() == 2652 && mapObject.getY() == 5449) {
            entryRequirement = 100000;
        } else if (mapObject.getX() == 2658 && mapObject.getY() == 5449) {
            entryRequirement = 500000;
        } else if (mapObject.getX() == 2652 && mapObject.getY() == 5463) {
            entryRequirement = 1000000;
        } else if (mapObject.getX() == 2658 && mapObject.getY() == 5463) {
            entryRequirement = 5000000;
        } else if (mapObject.getX() == 2652 && mapObject.getY() == 5478) {
            entryRequirement = 10000000;
        } else if (mapObject.getX() == 2658 && mapObject.getY() == 5478) {
            entryRequirement = 25000000;
        } else if (mapObject.getX() == 2652 && mapObject.getY() == 5493) {
            entryRequirement = 50000000;
        } else if (mapObject.getX() == 2658 && mapObject.getY() == 5493) {
            entryRequirement = 100000000;
        }
        if (entryRequirement == 0) {
            return;
        }
        if (player.getX() > mapObject.getX() && mapObject.getDirection() == 3
                || player.getX() < mapObject.getX() && mapObject.getDirection() == 1) {
            if (player.getCombat().getRiskedValue() < entryRequirement) {
                player.getGameEncoder().sendMessage(
                        "You need to risk at least " + Utils.formatNumber(entryRequirement) + " to enter.");
                return;
            } else if (player.getCombatDelay() > 0) {
                player.getGameEncoder().sendMessage("You can't use this yet.");
                return;
            }
            player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
            if (mapObject.getDirection() == 1) {
                player.getMovement().teleport(player.getX() + 2, player.getY());
            } else if (mapObject.getDirection() == 3) {
                player.getMovement().teleport(player.getX() - 2, player.getY());
            }
        } else {
            if (mapObject.getDirection() == 1) {
                player.getMovement().teleport(player.getX() - 2, player.getY());
            } else if (mapObject.getDirection() == 3) {
                player.getMovement().teleport(player.getX() + 2, player.getY());
            }
        }
    }


   /* 23040 - 23295 */

    // Tools
    public static void mapObject23042(Player player, int index, MapObject mapObject) {}

    // Tools
    public static void mapObject23043(Player player, int index, MapObject mapObject) {}

    // Tools
    public static void mapObject23045(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject23047(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Doorway
    public static void mapObject23052(Player player, int index, MapObject mapObject) {}

    // Broken cart
    public static void mapObject23055(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject23056(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject23057(Player player, int index, MapObject mapObject) {}

    // Open statue
    public static void mapObject23058(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject23073(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject23074(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject23091(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject23092(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject23093(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject23094(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject23095(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject23096(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject23098(Player player, int index, MapObject mapObject) {}

    // Soul boat
    public static void mapObject23101(Player player, int index, MapObject mapObject) {}

    // Iron Winch
    public static void mapObject23104(Player player, int index, MapObject mapObject) {
        if (!player.getSlayer().isAnyTask(5862) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
            player.getGameEncoder().sendMessage("You need an appropriate Slayer task of Cerberus to enter.");
            return;
        }
        if (mapObject.getX() == 1291 && mapObject.getY() == 1254) {
            player.getMovement().teleport(1240, 1227);
        } else if (mapObject.getX() == 1328 && mapObject.getY() == 1254) {
            player.getMovement().teleport(1368, 1227);
        } else if (mapObject.getX() == 1307 && mapObject.getY() == 1269) {
            player.openDialogue("bossinstance", 4);
        }
    }

    // Flames
    public static void mapObject23105(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject23114(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject23115(Player player, int index, MapObject mapObject) {}

    // Device
    public static void mapObject23117(Player player, int index, MapObject mapObject) {}

    // Rope swing
    public static void mapObject23122(Player player, int index, MapObject mapObject) {}

    // Rope swing
    public static void mapObject23123(Player player, int index, MapObject mapObject) {}

    // Ropeswing
    public static void mapObject23131(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 35) {
            player.getGameEncoder().sendMessage("You need an Agility level of 35 to use this course.");
            return;
        }
        if (player.getY() != 3554) {
            player.getGameEncoder().sendMessage("You'll need to get closer to make this jump.");
            return;
        }
        Tile startTile = new Tile(mapObject.getX(), 3554, mapObject.getHeight());
        Tile toTile = new Tile(mapObject.getX(), 3549, mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(startTile);
        player.lock();
        Event event = new Event() {
            boolean reachedStartTile = false;
            int reachedStartTileTries = 0;

            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (!reachedStartTile) {
                    if (player.getX() == startTile.getX() && player.getY() == startTile.getY()) {
                        reachedStartTile = true;
                        player.setAnimation(751);
                        player.setForceMovement(new ForceMovement(player, 1, toTile, 2, Tile.SOUTH));
                        super.setTick(1);
                    } else if (reachedStartTileTries++ > 32) {
                        player.unlock();
                        super.stop();
                    }
                } else {
                    super.stop();
                    player.getGameEncoder().sendMessage("You skillfully swing across.");
                    player.getMovement().teleport(toTile);
                    int xp = 22;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.putAttribute("agility_stage", 1);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Ropeswing
    public static void mapObject23132(Player player, int index, MapObject mapObject) {}

    // Obstacle net
    public static void mapObject23133(Player player, int index, MapObject mapObject) {}

    // Obstacle net
    public static void mapObject23134(Player player, int index, MapObject mapObject) {
        if (player.getY() != 3426) {
            return;
        }
        player.getGameEncoder().sendMessage("You climb the netting.");
        Tile toTile = new Tile(player.getX(), 3423, 1);
        player.getMovement().ladderUpTeleport(toTile);
        player.setFaceTile(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 1) {
                    player.putAttribute("agility_stage", 2);
                }
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Obstacle net
    public static void mapObject23135(Player player, int index, MapObject mapObject) {
        if (player.getY() != 3425) {
            return;
        }
        player.getGameEncoder().sendMessage("You climb the netting.");
        Tile currentTile = new Tile(player);
        Tile toTile = new Tile(player.getX(), player.getY() == 3425 ? 3427 : 3425, 0);
        player.setLock(5);
        player.getMovement().animatedTeleport(toTile, 3063, -2, null, null, 2);
        player.setFaceTile(toTile);
        Event event = new Event(Event.MILLIS_600) {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 2) {
                    player.setFaceTile(currentTile);
                } else if (super.getExecutions() == 5) {
                    super.stop();
                    int xp = 8;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    if (player.getAttributeInt("agility_stage") == 5) {
                        player.putAttribute("agility_stage", 6);
                    }
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Obstacle pipe
    public static void mapObject23136(Player player, int index, MapObject mapObject) {}

    // Obstacle pipe
    public static void mapObject23137(Player player, int index, MapObject mapObject) {}

    // Obstacle pipe
    public static void mapObject23138(Player player, int index, MapObject mapObject) {
        if (player.getX() != mapObject.getX()) {
            return;
        }
        Tile toTile = new Tile(mapObject.getX(), mapObject.getY() == 3431 ? 3437 : 3430, mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(749);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event(Event.MILLIS_600) {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 1) {
                    player.getAppearance().setForceMoveAnimation(747);
                }
                if (player.getDistance(toTile) == 1) {
                    player.getAppearance().setForceMoveAnimation(748);
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 8 + (player.getAttributeInt("agility_stage") == 6 ? 39 : 0);
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    if (player.getAttributeInt("agility_stage") == 6) {
                        player.removeAttribute("agility_stage");
                        // 102 laps an hour
                        if (Utils.randomE(50) == 0) {
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
                        player.getFamiliar().rollSkillPet(Skills.AGILITY, 35609, 20659);
                    }
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Obstacle pipe
    public static void mapObject23139(Player player, int index, MapObject mapObject) {
        if (player.getX() != mapObject.getX()) {
            return;
        }
        Tile toTile = new Tile(mapObject.getX(), mapObject.getY() == 3431 ? 3437 : 3430, mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(749);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event(Event.MILLIS_600) {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 1) {
                    player.getAppearance().setForceMoveAnimation(747);
                }
                if (player.getDistance(toTile) == 1) {
                    player.getAppearance().setForceMoveAnimation(748);
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 8;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    if (player.getAttributeInt("agility_stage") == 6) {
                        player.removeAttribute("agility_stage");
                        xp = 39;
                        if (player.getEquipment().wearingMinimumGraceful()) {
                            xp *= 1.1;
                        }
                        player.getSkills().addXP(Skills.AGILITY, xp);
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
                    }
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Obstacle pipe
    public static void mapObject23140(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject23144(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 35) {
            player.getGameEncoder().sendMessage("You need an Agility level of 35 to use this course.");
            return;
        }
        player.lock();
        Tile startTile = new Tile(2551, mapObject.getY(), mapObject.getHeight());
        Tile toTile = new Tile(2541, mapObject.getY(), mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(startTile);
        boolean running = player.getMovement().getRunning();
        final Tile finalTileStart = startTile;
        final Tile finalTileTo = toTile;
        Event event = new Event() {
            boolean reachedStartTile = false;

            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (!reachedStartTile) {
                    if (player.getX() == finalTileStart.getX() && player.getY() == finalTileStart.getY()) {
                        reachedStartTile = true;
                        player.getGameEncoder().sendMessage("You walk carefully across the slippery log...");
                        player.getAppearance().setForceMoveAnimation(762);
                        player.getMovement().setRunning(false);
                        player.getMovement().addMovement(toTile);
                        super.setTick(1);
                    }
                } else if (player.getX() == finalTileTo.getX() && player.getY() == finalTileTo.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 14;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.getGameEncoder().sendMessage("... and make it safely to the other side.");
                    player.putAttribute("agility_stage", 2);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Log balance
    public static void mapObject23145(Player player, int index, MapObject mapObject) {
        if (player.getX() != mapObject.getX()) {
            return;
        }
        player.getGameEncoder().sendMessage("You walk carefully across the slippery log...");
        Tile toTile = new Tile(mapObject.getX(), 3429, mapObject.getHeight());
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
                    int xp = 8;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.getGameEncoder().sendMessage("... and make it safely to the other side.");
                    player.putAttribute("agility_stage", 1);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Picture wall
    public static void mapObject23156(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject23157(Player player, int index, MapObject mapObject) {
        // Brine Rat Cavern exit
        Tile tile = new Tile(2729, 3734, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Cave
    public static void mapObject23158(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject23216(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject23217(Player player, int index, MapObject mapObject) {}

    // Wilderness Ditch
    public static void mapObject23271(Player player, int index, MapObject mapObject) {
        Tile tile;
        if (player.getY() < mapObject.getY()) {
            tile = new Tile(player.getX(), mapObject.getY() + 2, player.getHeight());
            Tile compareTile = new Tile(tile);
            compareTile.setY(compareTile.getY() + 8);
            if (!player.getController().canTeleport(compareTile, true)) {
                return;
            }
        } else {
            tile = new Tile(player.getX(), mapObject.getY() - 1, player.getHeight());
        }
        ForceMovement forceMovement = new ForceMovement(new Tile(player), 1, tile, 2,
                player.getY() < mapObject.getY() ? Tile.NORTH : Tile.SOUTH);
        player.setForceMovementTeleport(forceMovement, 6132, 1, null);
        player.clearHits();
        player.getMovement().setTeleportBlock(0);
    }

    // Log balance
    public static void mapObject23274(Player player, int index, MapObject mapObject) {}

    // Sign
    public static void mapObject23275(Player player, int index, MapObject mapObject) {}

    // Sign
    public static void mapObject23276(Player player, int index, MapObject mapObject) {}

    // Sign
    public static void mapObject23277(Player player, int index, MapObject mapObject) {}

    // Sign
    public static void mapObject23278(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23279(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject23282(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject23283(Player player, int index, MapObject mapObject) {}

    // Zanik
    public static void mapObject23284(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject23285(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject23286(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject23287(Player player, int index, MapObject mapObject) {}


   /* 23296 - 23551 */

    // Door
    public static void mapObject23338(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject23339(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject23340(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject23341(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject23342(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject23343(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23376(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23377(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject23378(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject23499(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23504(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject23530(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23531(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23532(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject23533(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject23542(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject23543(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject23544(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject23545(Player player, int index, MapObject mapObject) {}

    // Balancing ledge
    public static void mapObject23546(Player player, int index, MapObject mapObject) {}

    // Balancing ledge
    public static void mapObject23547(Player player, int index, MapObject mapObject) {
        if (player.getY() != mapObject.getY()) {
            return;
        }
        player.getGameEncoder().sendMessage("You put your foot on the ledge and try to edge across...");
        Tile toTile = new Tile(2532, mapObject.getY(), mapObject.getHeight());
        boolean running = player.getMovement().getRunning();
        player.setAnimation(753);
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 0) {
                    player.getMovement().clear();
                    player.getMovement().addMovement(toTile);
                    player.getMovement().setRunning(false);
                    player.getAppearance().setForceMoveAnimation(756);
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.setAnimation(759);
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 22;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.getGameEncoder().sendMessage("You skillfully edge across the gap.");
                    if (player.getAttributeInt("agility_stage") == 3) {
                        player.putAttribute("agility_stage", 4);
                    }
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Balancing ledge
    public static void mapObject23548(Player player, int index, MapObject mapObject) {}


   /* 23552 - 23807 */

    // Gate
    public static void mapObject23552(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject23553(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject23554(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject23555(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject23556(Player player, int index, MapObject mapObject) {}

    // Balancing rope
    public static void mapObject23557(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2477 || player.getY() != 3420) {
            return;
        }
        player.getGameEncoder().sendMessage("You walk carefully across the rope...");
        Tile toTile = new Tile(2483, mapObject.getY(), mapObject.getHeight());
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
                    int xp = 8;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.getGameEncoder().sendMessage("... and make it safely to the other side.");
                    if (player.getAttributeInt("agility_stage") == 3) {
                        player.putAttribute("agility_stage", 4);
                    }
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Balancing rope
    public static void mapObject23558(Player player, int index, MapObject mapObject) {}

    // Tree branch
    public static void mapObject23559(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("You climb the tree...");
        Tile toTile = new Tile(2473, 3420, 2);
        player.getMovement().ladderUpTeleport(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.getGameEncoder().sendMessage("... to the platform above.");
                int xp = 5;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 2) {
                    player.putAttribute("agility_stage", 3);
                }
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tree branch
    public static void mapObject23560(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("You climb down the tree...");
        Tile toTile = new Tile(2487, 3421, 0);
        player.getMovement().ladderUpTeleport(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.getGameEncoder().sendMessage("... and land on the ground.");
                int xp = 5;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 4) {
                    player.putAttribute("agility_stage", 5);
                }
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tree branch
    public static void mapObject23561(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("You climb down the tree...");
        Tile toTile = new Tile(2487, 3421, 0);
        player.getMovement().ladderUpTeleport(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.getGameEncoder().sendMessage("... and land on the ground.");
                int xp = 5;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 4) {
                    player.putAttribute("agility_stage", 5);
                }
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Staircase
    public static void mapObject23562(Player player, int index, MapObject mapObject) {}

    // Pile of rubble
    public static void mapObject23563(Player player, int index, MapObject mapObject) {}

    // Pile of rubble
    public static void mapObject23564(Player player, int index, MapObject mapObject) {}

    // Monkeybars
    public static void mapObject23566(Player player, int index, MapObject mapObject) {
        if (player.getController().isMagicBound()) {
            player.getGameEncoder()
                    .sendMessage("A magical force stops you from moving for "
                            + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                            + " more seconds.");
            return;
        }
        if (mapObject.getX() == 3120 && mapObject.getY() == 9964) {
            player.getMovement().teleport(3121, 9970);
        } else if (mapObject.getX() == 3120 && mapObject.getY() == 9969) {
            player.getMovement().teleport(3121, 9963);
        }
    }

    // Monkeybars
    public static void mapObject23567(Player player, int index, MapObject mapObject) {}

    // Ropeswing
    public static void mapObject23568(Player player, int index, MapObject mapObject) {}

    // Ropeswing
    public static void mapObject23569(Player player, int index, MapObject mapObject) {}

    // Ropeswing
    public static void mapObject23570(Player player, int index, MapObject mapObject) {}

    // Ropeswing
    public static void mapObject23571(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23584(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23585(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23586(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject23596(Player player, int index, MapObject mapObject) {}

    // Tunnel entrance
    public static void mapObject23609(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3509 && mapObject.getY() == 9497) {
            player.openDialogue("bossinstance", 13);
        }
    }

    // Cocoon
    public static void mapObject23611(Player player, int index, MapObject mapObject) {}

    // Cadava bush
    public static void mapObject23625(Player player, int index, MapObject mapObject) {}

    // Cadava bush
    public static void mapObject23626(Player player, int index, MapObject mapObject) {}

    // Cadava bush
    public static void mapObject23627(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject23628(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject23629(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject23630(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject23636(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject23640(Player player, int index, MapObject mapObject) {}

    // A wooden log
    public static void mapObject23644(Player player, int index, MapObject mapObject) {}

    // Stepping stones
    public static void mapObject23645(Player player, int index, MapObject mapObject) {}

    // Stepping stones
    public static void mapObject23646(Player player, int index, MapObject mapObject) {}

    // Stepping stones
    public static void mapObject23647(Player player, int index, MapObject mapObject) {}

    // Oozing barrier
    public static void mapObject23653(Player player, int index, MapObject mapObject) {}

    // Oozing barrier
    public static void mapObject23654(Player player, int index, MapObject mapObject) {}

    // Telekinetic Teleport
    public static void mapObject23673(Player player, int index, MapObject mapObject) {}

    // Enchanters Teleport
    public static void mapObject23674(Player player, int index, MapObject mapObject) {}

    // Alchemists Teleport
    public static void mapObject23675(Player player, int index, MapObject mapObject) {}

    // Graveyard Teleport
    public static void mapObject23676(Player player, int index, MapObject mapObject) {}

    // Exit Teleport
    public static void mapObject23677(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23678(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23679(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23680(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23681(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23682(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23683(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23684(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23685(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23686(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23687(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23688(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23689(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23690(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23691(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23692(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23693(Player player, int index, MapObject mapObject) {}

    // Cube Pile
    public static void mapObject23694(Player player, int index, MapObject mapObject) {}

    // Cylinder Pile
    public static void mapObject23695(Player player, int index, MapObject mapObject) {}

    // Icosahedron Pile
    public static void mapObject23696(Player player, int index, MapObject mapObject) {}

    // Pentamid Pile
    public static void mapObject23697(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject23698(Player player, int index, MapObject mapObject) {}

    // Goo covered vine
    public static void mapObject23703(Player player, int index, MapObject mapObject) {}

    // Goo covered vine
    public static void mapObject23704(Player player, int index, MapObject mapObject) {}

    // Dripping vine
    public static void mapObject23705(Player player, int index, MapObject mapObject) {}

    // Dripping vine
    public static void mapObject23706(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject23707(Player player, int index, MapObject mapObject) {}

    // Box of Health
    public static void mapObject23709(Player player, int index, MapObject mapObject) {
        if (player.getController().inPvPWorldCombat()) {
            player.getGameEncoder().sendMessage("You can't use this here.");
            return;
        }
        player.setGraphic(436);
        player.getGameEncoder().sendMessage("The pool restores you.");
        player.rejuvenate();
    }

    // Portal of Death
    public static void mapObject23727(Player player, int index, MapObject mapObject) {}

    // Portal of Death
    public static void mapObject23728(Player player, int index, MapObject mapObject) {}

    // Cradle of Life
    public static void mapObject23731(Player player, int index, MapObject mapObject) {}

    // Bone Chain
    public static void mapObject23732(Player player, int index, MapObject mapObject) {}


   /* 23808 - 24063 */

    // Gate
    public static void mapObject23917(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject23918(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject23919(Player player, int index, MapObject mapObject) {}

    // Bone Chain
    public static void mapObject23920(Player player, int index, MapObject mapObject) {}

    // Boney ladder
    public static void mapObject23921(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject23922(Player player, int index, MapObject mapObject) {}

    // Valve
    public static void mapObject23936(Player player, int index, MapObject mapObject) {}

    // Valve
    public static void mapObject23937(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject23958(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject23959(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject23960(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject23961(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject23962(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject23963(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject23964(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject23966(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject23967(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject23968(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject23969(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject23972(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject23973(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject24009(Player player, int index, MapObject mapObject) {
        Smithing.openSmelt(player);
    }

    // Old Bookshelf
    public static void mapObject24041(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24050(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24051(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24052(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24053(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24054(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24055(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24056(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24057(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // Door
    public static void mapObject24058(Player player, int index, MapObject mapObject) {}

    // Castle door
    public static void mapObject24059(Player player, int index, MapObject mapObject) {}

    // Castle door
    public static void mapObject24060(Player player, int index, MapObject mapObject) {}

    // Castle door
    public static void mapObject24061(Player player, int index, MapObject mapObject) {}

    // Castle door
    public static void mapObject24062(Player player, int index, MapObject mapObject) {}

    // Castle door
    public static void mapObject24063(Player player, int index, MapObject mapObject) {}


   /* 24064 - 24319 */

    // Castle door
    public static void mapObject24064(Player player, int index, MapObject mapObject) {}

    // Castle door
    public static void mapObject24065(Player player, int index, MapObject mapObject) {}

    // Castle door
    public static void mapObject24066(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24067(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2968 && mapObject.getY() == 3347) {
            player.getMovement().ladderUpTeleport(new Tile(2968, 3348, 1));
        }
    }

    // Staircase
    public static void mapObject24068(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2968 && mapObject.getY() == 3347) {
            player.getMovement().ladderDownTeleport(new Tile(2971, 3347));
        }
    }

    // Ladder
    public static void mapObject24070(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2996 && mapObject.getY() == 3341) {
            player.getMovement().ladderUpTeleport(new Tile(2995, 3341, 2));
        } else {
            player.getMovement().ladderUpTeleport(new Tile(player.getX(), player.getY(), player.getHeight() + 1));
        }
    }

    // Ladder
    public static void mapObject24071(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(player.getX(), player.getY(), player.getHeight() - 1));
    }

    // Staircase
    public static void mapObject24072(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2954 && mapObject.getY() == 3338) {
            player.getMovement().ladderUpTeleport(new Tile(2956, 3338, 1));
        } else if (mapObject.getX() == 2960 && mapObject.getY() == 3338) {
            player.getMovement().ladderUpTeleport(new Tile(2959, 3339, 2));
        }
    }

    // Staircase
    public static void mapObject24074(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2955 && mapObject.getY() == 3338) {
            player.getMovement().ladderDownTeleport(new Tile(2956, 3338));
        } else if (mapObject.getX() == 2960 && mapObject.getY() == 3339) {
            player.getMovement().ladderDownTeleport(new Tile(2959, 3339, 1));
        }
    }

    // Staircase
    public static void mapObject24075(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24076(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24077(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2984 && mapObject.getY() == 3337) {
            player.getMovement().ladderUpTeleport(new Tile(2984, 3340, 2));
        }
    }

    // Staircase
    public static void mapObject24078(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2984 && mapObject.getY() == 3338) {
            player.getMovement().ladderDownTeleport(new Tile(2984, 3336, 1));
        }
    }

    // Staircase
    public static void mapObject24079(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24080(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject24082(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject24083(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject24084(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject24085(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject24087(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject24088(Player player, int index, MapObject mapObject) {}

    // Notice board
    public static void mapObject24098(Player player, int index, MapObject mapObject) {}

    // Notice board
    public static void mapObject24099(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject24101(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bookcase
    public static void mapObject24110(Player player, int index, MapObject mapObject) {}

    // Crumbling wall
    public static void mapObject24222(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 5) {
            player.getGameEncoder().sendMessage("You need an Agility level of 5 to use this.");
            return;
        }
        if (player.getX() >= 2936) {
            player.getMovement().animatedTeleport(new Tile(2935, 3355), 3067, null, 1);
        } else {
            player.getMovement().animatedTeleport(new Tile(2936, 3355), 3067, null, 1);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Staircase
    public static void mapObject24248(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24249(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24250(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24251(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24252(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24253(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24254(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24255(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject24286(Player player, int index, MapObject mapObject) {}

    // Locked door
    public static void mapObject24293(Player player, int index, MapObject mapObject) {}

    // Locked door
    public static void mapObject24294(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject24296(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24303(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(player.getX(), player.getY(), player.getHeight() - 1);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Door
    public static void mapObject24306(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2847 && (mapObject.getY() == 3540 || mapObject.getY() == 3541)) {
            if (player.getX() >= 2847) {
                player.getMovement().teleport(2846, 3540, player.getHeight());
            } else {
                if (player.getInventory().getCount(8851) < 100
                        && !player.getEquipment().wearingAccomplishmentCape(Skills.ATTACK)) {
                    player.getGameEncoder().sendMessage("You need atleast 100 tokens to enter.");
                    return;
                }
                player.getMovement().teleport(2847, 3540, player.getHeight());
            }
        } else {
            Region.openDoors(player, mapObject);
        }
    }

    // Door
    public static void mapObject24307(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24309(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2847 && (mapObject.getY() == 3540 || mapObject.getY() == 3541)) {
            if (player.getX() >= 2847) {
                player.getMovement().teleport(2846, 3540, player.getHeight());
            } else {
                if (player.getInventory().getCount(8851) < 100
                        && !player.getEquipment().wearingAccomplishmentCape(Skills.ATTACK)) {
                    player.getGameEncoder().sendMessage("You need atleast 100 tokens to enter.");
                    return;
                }
                player.getMovement().teleport(2847, 3540, player.getHeight());
            }
        } else {
            Region.openDoors(player, mapObject);
        }
    }

    // Door
    public static void mapObject24310(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24312(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24313(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24315(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24316(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24318(Player player, int index, MapObject mapObject) {
        if (player.getController().getLevelForXP(Skills.ATTACK) == 99
                || player.getController().getLevelForXP(Skills.STRENGTH) == 99
                || player.getController().getLevelForXP(Skills.ATTACK)
                        + player.getController().getLevelForXP(Skills.STRENGTH) >= 130) {
            player.getMovement().teleport(2876, 3546, 0);
        } else {
            player.getGameEncoder().sendMessage("You do not meet the requirements to enter.");
        }
    }

    // Door
    public static void mapObject24319(Player player, int index, MapObject mapObject) {}


   /* 24320 - 24575 */

    // Old Bookshelf
    public static void mapObject24340(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject24341(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject24342(Player player, int index, MapObject mapObject) {}

    // Old Bookshelf
    public static void mapObject24343(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject24344(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject24347(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Ladder
    public static void mapObject24351(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject24352(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24358(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24359(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24363(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24364(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24365(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24366(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24368(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24369(Player player, int index, MapObject mapObject) {}

    // Map
    public static void mapObject24390(Player player, int index, MapObject mapObject) {}

    // Map
    public static void mapObject24391(Player player, int index, MapObject mapObject) {}

    // Map
    public static void mapObject24392(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject24427(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject24428(Player player, int index, MapObject mapObject) {}

    // Information booth
    public static void mapObject24452(Player player, int index, MapObject mapObject) {}

    // Tools
    public static void mapObject24535(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject24536(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24539(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24540(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24541(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24542(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24543(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24544(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24545(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24546(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24547(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24548(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24549(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24550(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24551(Player player, int index, MapObject mapObject) {}

    // Dig Site specimen rocks
    public static void mapObject24559(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject24560(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject24561(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject24563(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject24564(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24565(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24567(Player player, int index, MapObject mapObject) {}


   /* 24576 - 24831 */

    // Button
    public static void mapObject24590(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24591(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24592(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24593(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24594(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24595(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24596(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24597(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24598(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24599(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24600(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24601(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24602(Player player, int index, MapObject mapObject) {}

    // Button
    public static void mapObject24603(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24605(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24606(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24607(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24608(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24609(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24610(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24611(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24612(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24613(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24614(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24615(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24616(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24617(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject24618(Player player, int index, MapObject mapObject) {}

    // Painting
    public static void mapObject24620(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24621(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24622(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24623(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24624(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24625(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24626(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24627(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24628(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24629(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24630(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24631(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24632(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24633(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24634(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24635(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24636(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24637(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24638(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24639(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24640(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24641(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24642(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24643(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24644(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24645(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24646(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24647(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24648(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24649(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24650(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24651(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24652(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24653(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24654(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24655(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24656(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24657(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24658(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24659(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24660(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24661(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24662(Player player, int index, MapObject mapObject) {}

    // Display case
    public static void mapObject24663(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject24668(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject24669(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject24670(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject24671(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24672(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24673(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject24681(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject24682(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24685(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24686(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject24687(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject24692(Player player, int index, MapObject mapObject) {}

    // Sack
    public static void mapObject24710(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject24717(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject24718(Player player, int index, MapObject mapObject) {}

    // Piano
    public static void mapObject24721(Player player, int index, MapObject mapObject) {}

    // Piano
    public static void mapObject24722(Player player, int index, MapObject mapObject) {}

    // Drain Pipe
    public static void mapObject24723(Player player, int index, MapObject mapObject) {}

    // Gramophone
    public static void mapObject24724(Player player, int index, MapObject mapObject) {}

    // Gramophone
    public static void mapObject24725(Player player, int index, MapObject mapObject) {}

    // Gramophone
    public static void mapObject24726(Player player, int index, MapObject mapObject) {}

    // Music Stand
    public static void mapObject24728(Player player, int index, MapObject mapObject) {}

    // Beanstalk
    public static void mapObject24733(Player player, int index, MapObject mapObject) {}

    // Beanstalk
    public static void mapObject24735(Player player, int index, MapObject mapObject) {}

    // Crumbling wall
    public static void mapObject24749(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24759(Player player, int index, MapObject mapObject) {}

    // Beard
    public static void mapObject24767(Player player, int index, MapObject mapObject) {}

    // Rupert
    public static void mapObject24771(Player player, int index, MapObject mapObject) {}

    // Rupert
    public static void mapObject24772(Player player, int index, MapObject mapObject) {}

    // Window
    public static void mapObject24774(Player player, int index, MapObject mapObject) {}

    // Beard
    public static void mapObject24776(Player player, int index, MapObject mapObject) {}

    // Pendant
    public static void mapObject24780(Player player, int index, MapObject mapObject) {}

    // Nails
    public static void mapObject24795(Player player, int index, MapObject mapObject) {}

    // Nails
    public static void mapObject24796(Player player, int index, MapObject mapObject) {}

    // Mouse hole
    public static void mapObject24799(Player player, int index, MapObject mapObject) {}

    // Grate
    public static void mapObject24802(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24815(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24816(Player player, int index, MapObject mapObject) {}

    // Beanstalk
    public static void mapObject24819(Player player, int index, MapObject mapObject) {}


   /* 24832 - 25087 */

    // Grimgnash
    public static void mapObject24839(Player player, int index, MapObject mapObject) {}

    // Grimgnash
    public static void mapObject24840(Player player, int index, MapObject mapObject) {}

    // Feathers
    public static void mapObject24841(Player player, int index, MapObject mapObject) {}

    // Manhole
    public static void mapObject24842(Player player, int index, MapObject mapObject) {}

    // Cheese
    public static void mapObject24874(Player player, int index, MapObject mapObject) {}

    // Coins
    public static void mapObject24875(Player player, int index, MapObject mapObject) {}

    // Bones
    public static void mapObject24876(Player player, int index, MapObject mapObject) {}

    // Crumbling wall
    public static void mapObject24880(Player player, int index, MapObject mapObject) {}

    // Piano
    public static void mapObject24881(Player player, int index, MapObject mapObject) {}

    // Gramophone
    public static void mapObject24882(Player player, int index, MapObject mapObject) {}

    // Music Stand
    public static void mapObject24883(Player player, int index, MapObject mapObject) {}

    // Earth Mound
    public static void mapObject24884(Player player, int index, MapObject mapObject) {}

    // Pendant
    public static void mapObject24886(Player player, int index, MapObject mapObject) {}

    // Information Scroll
    public static void mapObject24908(Player player, int index, MapObject mapObject) {}

    // Information Scroll
    public static void mapObject24909(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject24957(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24958(Player player, int index, MapObject mapObject) {}

    // Hopper controls
    public static void mapObject24964(Player player, int index, MapObject mapObject) {}

    // Hopper controls
    public static void mapObject24965(Player player, int index, MapObject mapObject) {}

    // Hopper controls
    public static void mapObject24966(Player player, int index, MapObject mapObject) {}

    // Fire rift
    public static void mapObject24971(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.FIRE);
    }

    // Earth rift
    public static void mapObject24972(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.EARTH);
    }

    // Body rift
    public static void mapObject24973(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.BODY);
    }

    // Cosmic rift
    public static void mapObject24974(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.COSMIC);
    }

    // Nature rift
    public static void mapObject24975(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.NATURE);
    }

    // Chaos rift
    public static void mapObject24976(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.CHAOS);
    }

    // Centre of crop circle
    public static void mapObject24988(Player player, int index, MapObject mapObject) {}

    // Centre of crop circle
    public static void mapObject24991(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject25014(Player player, int index, MapObject mapObject) {}

    // Magical wheat
    public static void mapObject25016(Player player, int index, MapObject mapObject) {
        Tile toTile = null;
        if (mapObject.getDirection() == 0 || mapObject.getDirection() == 2) {
            if (player.getX() != mapObject.getX()) {
                return;
            }
            if (player.getY() > mapObject.getY()) {
                toTile = new Tile(mapObject.getX(), mapObject.getY() - 1, mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX(), mapObject.getY() + 1, mapObject.getHeight());
            }
        } else {
            if (player.getY() != mapObject.getY()) {
                return;
            }
            if (player.getX() > mapObject.getX()) {
                toTile = new Tile(mapObject.getX() - 1, mapObject.getY(), mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
            }
        }
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(6593);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        final Tile finalTile = toTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == finalTile.getX() && player.getY() == finalTile.getY()) {
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    player.unlock();
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Magical wheat
    public static void mapObject25019(Player player, int index, MapObject mapObject) {
        Tile toTile = null;
        if (mapObject.getDirection() == 1 || mapObject.getDirection() == 3) {
            if (player.getX() != mapObject.getX()) {
                return;
            }
            if (player.getY() > mapObject.getY()) {
                toTile = new Tile(mapObject.getX(), mapObject.getY() - 1, mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX(), mapObject.getY() + 1, mapObject.getHeight());
            }
        } else {
            if (player.getY() != mapObject.getY()) {
                return;
            }
            if (player.getX() > mapObject.getX()) {
                toTile = new Tile(mapObject.getX() - 1, mapObject.getY(), mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
            }
        }
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(6593);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        final Tile finalTile = toTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == finalTile.getX() && player.getY() == finalTile.getY()) {
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    player.unlock();
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Magical wheat
    public static void mapObject25020(Player player, int index, MapObject mapObject) {
        Tile toTile = null;
        if (mapObject.getDirection() == 1 || mapObject.getDirection() == 3) {
            if (player.getX() != mapObject.getX()) {
                return;
            }
            if (player.getY() > mapObject.getY()) {
                toTile = new Tile(mapObject.getX(), mapObject.getY() - 1, mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX(), mapObject.getY() + 1, mapObject.getHeight());
            }
        } else {
            if (player.getY() != mapObject.getY()) {
                return;
            }
            if (player.getX() > mapObject.getX()) {
                toTile = new Tile(mapObject.getX() - 1, mapObject.getY(), mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
            }
        }
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(6593);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        final Tile finalTile = toTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == finalTile.getX() && player.getY() == finalTile.getY()) {
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    player.unlock();
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Magical wheat
    public static void mapObject25021(Player player, int index, MapObject mapObject) {
        Tile toTile = null;
        if (mapObject.getDirection() == 1 || mapObject.getDirection() == 3) {
            if (player.getX() != mapObject.getX()) {
                return;
            }
            if (player.getY() > mapObject.getY()) {
                toTile = new Tile(mapObject.getX(), mapObject.getY() - 1, mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX(), mapObject.getY() + 1, mapObject.getHeight());
            }
        } else {
            if (player.getY() != mapObject.getY()) {
                return;
            }
            if (player.getX() > mapObject.getX()) {
                toTile = new Tile(mapObject.getX() - 1, mapObject.getY(), mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
            }
        }
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(6593);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        final Tile finalTile = toTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == finalTile.getX() && player.getY() == finalTile.getY()) {
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    player.unlock();
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Magical wheat
    public static void mapObject25029(Player player, int index, MapObject mapObject) {
        Tile toTile = null;
        if (player.getX() != mapObject.getX() && player.getY() != mapObject.getY()) {
            return;
        }
        if (player.getX() == mapObject.getX()) {
            if (player.getY() > mapObject.getY()) {
                toTile = new Tile(mapObject.getX(), mapObject.getY() - 1, mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX(), mapObject.getY() + 1, mapObject.getHeight());
            }
        } else if (player.getY() == mapObject.getY()) {
            if (player.getX() > mapObject.getX()) {
                toTile = new Tile(mapObject.getX() - 1, mapObject.getY(), mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
            }
        } else {
            return;
        }
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(6593);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        final Tile finalTile = toTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == finalTile.getX() && player.getY() == finalTile.getY()) {
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    player.unlock();
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Law rift
    public static void mapObject25034(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.LAW);
    }

    // Death rift
    public static void mapObject25035(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.DEATH);
    }

    // Hole
    public static void mapObject25036(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25038(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject25040(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject25041(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject25042(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject25043(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject25044(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25045(Player player, int index, MapObject mapObject) {}

    // Bookshelves
    public static void mapObject25046(Player player, int index, MapObject mapObject) {}


   /* 25088 - 25343 */

    // Magic door
    public static void mapObject25115(Player player, int index, MapObject mapObject) {}

    // Magic door
    public static void mapObject25118(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject25154(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject25161(Player player, int index, MapObject mapObject) {
        if (player.getX() <= 2845) {
            player.getMovement().teleport(2847, 9636);
        } else {
            player.getMovement().teleport(2845, 9636);
        }
    }

    // Climbing rope
    public static void mapObject25213(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject25214(Player player, int index, MapObject mapObject) {}

    // Aged log
    public static void mapObject25216(Player player, int index, MapObject mapObject) {}

    // Barbarian bed
    public static void mapObject25268(Player player, int index, MapObject mapObject) {}

    // Whirlpool
    public static void mapObject25274(Player player, int index, MapObject mapObject) {}

    // Whirlpool
    public static void mapObject25275(Player player, int index, MapObject mapObject) {}

    // Pyre site
    public static void mapObject25286(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(11338)) {
            player.getInventory().deleteItem(11338, 1);
            if (Utils.inRange(player.getCombat().getDropRate(11335, 0.8))) {
                player.getInventory().addItem(11335, 1);
                player.getGameEncoder()
                        .sendMessage("You burn the chewed bones... And find a dragon full helm in the ashes!");
            } else {
                player.getGameEncoder().sendMessage("You burn the chewed bones... All that remains is ash.");
            }
        }
    }

    // Stairs
    public static void mapObject25336(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(1768, 5366, 1));
    }

    // Stairs
    public static void mapObject25337(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject25338(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(1772, 5366, 0));
    }

    // Stairs
    public static void mapObject25339(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(1778, 5343, 1));
    }

    // Stairs
    public static void mapObject25340(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(1778, 5346, 0));
    }

    // Mithril door
    public static void mapObject25341(Player player, int index, MapObject mapObject) {}


   /* 25344 - 25599 */

    // Barbarian anvil
    public static void mapObject25349(Player player, int index, MapObject mapObject) {}

    // Skeleton
    public static void mapObject25362(Player player, int index, MapObject mapObject) {}

    // Holding area
    public static void mapObject25369(Player player, int index, MapObject mapObject) {}

    // Water rift
    public static void mapObject25376(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.WATER);
    }

    // Soul rift
    public static void mapObject25377(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.SOUL);
    }

    // Air rift
    public static void mapObject25378(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.AIR);
    }

    // Mind rift
    public static void mapObject25379(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.MIND);
    }

    // Blood rift
    public static void mapObject25380(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.BLOOD);
    }

    // Passage
    public static void mapObject25381(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject25384(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject25385(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject25386(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject25387(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject25388(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject25389(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject25390(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject25391(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject25392(Player player, int index, MapObject mapObject) {}

    // Signpost
    public static void mapObject25397(Player player, int index, MapObject mapObject) {}

    // Orrery
    public static void mapObject25401(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25417(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25418(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject25422(Player player, int index, MapObject mapObject) {}

    // Tendrils
    public static void mapObject25425(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject25428(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject25429(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject25431(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject25432(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject25434(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject25437(Player player, int index, MapObject mapObject) {}

    // Telescope
    public static void mapObject25438(Player player, int index, MapObject mapObject) {}

    // Telescope
    public static void mapObject25439(Player player, int index, MapObject mapObject) {}

    // Goblin stove
    public static void mapObject25440(Player player, int index, MapObject mapObject) {}

    // Goblin stove
    public static void mapObject25441(Player player, int index, MapObject mapObject) {}

    // Goblin stove
    public static void mapObject25442(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25526(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25527(Player player, int index, MapObject mapObject) {}

    // Star chart
    public static void mapObject25578(Player player, int index, MapObject mapObject) {}

    // Star chart
    public static void mapObject25579(Player player, int index, MapObject mapObject) {}

    // Star chart
    public static void mapObject25580(Player player, int index, MapObject mapObject) {}

    // Star chart
    public static void mapObject25581(Player player, int index, MapObject mapObject) {}

    // Star chart
    public static void mapObject25582(Player player, int index, MapObject mapObject) {}

    // Star chart
    public static void mapObject25583(Player player, int index, MapObject mapObject) {}

    // Boil
    public static void mapObject25590(Player player, int index, MapObject mapObject) {}

    // Telescope
    public static void mapObject25591(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject25592(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject25593(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25594(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25595(Player player, int index, MapObject mapObject) {}


   /* 25600 - 25855 */

    // Staircase
    public static void mapObject25604(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25606(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject25607(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25629(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25630(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject25631(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject25632(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25638(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25639(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25640(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25641(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25642(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25643(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject25647(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject25655(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25662(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25663(Player player, int index, MapObject mapObject) {}

    // Sir Lucan
    public static void mapObject25664(Player player, int index, MapObject mapObject) {}

    // Sir Palomedes
    public static void mapObject25665(Player player, int index, MapObject mapObject) {}

    // Sir Lancelot
    public static void mapObject25666(Player player, int index, MapObject mapObject) {}

    // Sir Bedivere
    public static void mapObject25667(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject25682(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject25683(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject25684(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject25685(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject25686(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25687(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25688(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject25689(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject25694(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject25695(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject25696(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject25697(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject25698(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25701(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25702(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25703(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25704(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25705(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25706(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25708(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25709(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25710(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25711(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25712(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25713(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25714(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25715(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25716(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25717(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25718(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25719(Player player, int index, MapObject mapObject) {}

    // Dairy churn
    public static void mapObject25720(Player player, int index, MapObject mapObject) {}

    // Barrel of flour
    public static void mapObject25722(Player player, int index, MapObject mapObject) {}

    // Anna's barrel
    public static void mapObject25723(Player player, int index, MapObject mapObject) {}

    // Bob's barrel
    public static void mapObject25724(Player player, int index, MapObject mapObject) {}

    // Carol's barrel
    public static void mapObject25725(Player player, int index, MapObject mapObject) {}

    // David's barrel
    public static void mapObject25726(Player player, int index, MapObject mapObject) {}

    // Elizabeth's barrel
    public static void mapObject25727(Player player, int index, MapObject mapObject) {}

    // Frank's barrel
    public static void mapObject25728(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25748(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject25749(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25750(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject25751(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25766(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject25767(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject25775(Player player, int index, MapObject mapObject) {}

    // Old bookshelf
    public static void mapObject25782(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject25786(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject25787(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25788(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25789(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25790(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25791(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject25793(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject25794(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25799(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25800(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject25801(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25804(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25805(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25806(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25807(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject25808(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Large door
    public static void mapObject25813(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25814(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25815(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject25816(Player player, int index, MapObject mapObject) {}

    // Church organ
    public static void mapObject25818(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25819(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25820(Player player, int index, MapObject mapObject) {}

    // Spinning wheel
    public static void mapObject25824(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25825(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25826(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25827(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject25828(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25843(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25844(Player player, int index, MapObject mapObject) {}


   /* 25856 - 26111 */

    // Metal door
    public static void mapObject25876(Player player, int index, MapObject mapObject) {}

    // Metal door
    public static void mapObject25877(Player player, int index, MapObject mapObject) {}

    // Vent
    public static void mapObject25880(Player player, int index, MapObject mapObject) {}

    // Sir Tristram
    public static void mapObject25889(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject25927(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject25935(Player player, int index, MapObject mapObject) {}

    // Bank deposit box
    public static void mapObject25937(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Ladder
    public static void mapObject25938(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25939(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25940(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25941(Player player, int index, MapObject mapObject) {}

    // King Arthur
    public static void mapObject25942(Player player, int index, MapObject mapObject) {}

    // King Arthur
    public static void mapObject25943(Player player, int index, MapObject mapObject) {}

    // Court judge
    public static void mapObject25956(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject26017(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject26042(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject26053(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject26073(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject26081(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3085 && mapObject.getY() == 3484
                || mapObject.getX() == 3086 && mapObject.getY() == 3484) {
            if (!player.getInventory().isEmpty() || !player.getEquipment().isEmpty()) {
                player.getGameEncoder().sendMessage("No items can be taken beyond this point.");
                return;
            }
            player.getClanWars().openJoinTournament();
        }
    }

    // Gate
    public static void mapObject26082(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3085 && mapObject.getY() == 3484
                || mapObject.getX() == 3086 && mapObject.getY() == 3484) {
            if (!player.getInventory().isEmpty() || !player.getEquipment().isEmpty()) {
                player.getGameEncoder().sendMessage("No items can be taken beyond this point.");
                return;
            }
            player.getClanWars().openJoinTournament();
        }
    }

    // null
    public static void mapObject26083(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject26084(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject26106(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject26107(Player player, int index, MapObject mapObject) {}

    // Spiders' nest
    public static void mapObject26109(Player player, int index, MapObject mapObject) {}

    // Smashed window
    public static void mapObject26110(Player player, int index, MapObject mapObject) {}

    // Smashed window
    public static void mapObject26111(Player player, int index, MapObject mapObject) {}


   /* 26112 - 26367 */

    // Window
    public static void mapObject26112(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject26113(Player player, int index, MapObject mapObject) {}

    // Odd looking wall
    public static void mapObject26114(Player player, int index, MapObject mapObject) {}

    // Odd looking wall
    public static void mapObject26115(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject26118(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject26119(Player player, int index, MapObject mapObject) {}

    // Sinclair family compost heap
    public static void mapObject26120(Player player, int index, MapObject mapObject) {}

    // Sinclair family beehive
    public static void mapObject26121(Player player, int index, MapObject mapObject) {}

    // Barrel of flour
    public static void mapObject26122(Player player, int index, MapObject mapObject) {}

    // Smashed window
    public static void mapObject26123(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject26130(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject26131(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject26132(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject26133(Player player, int index, MapObject mapObject) {}

    // Spinning wheel
    public static void mapObject26143(Player player, int index, MapObject mapObject) {}

    // Eyes
    public static void mapObject26146(Player player, int index, MapObject mapObject) {}

    // Blockage
    public static void mapObject26187(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject26188(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(" pickaxe")) {
            player.getGameEncoder().sendMessage("You need a pickaxe to do this.");
            return;
        } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.MINING) + 1)) {
            player.getGameEncoder().sendMessage("You fail to mine the rock.");
            return;
        }
        if (mapObject.getX() == 3026 && mapObject.getY() == 4813) {
            player.getMovement().teleport(3030, 4822);
        }
    }

    // Tendrils
    public static void mapObject26189(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(" axe")) {
            player.getGameEncoder().sendMessage("You need an axe to do this.");
            return;
        } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.WOODCUTTING) + 1)) {
            player.getGameEncoder().sendMessage("You fail to chop the tendrils.");
            return;
        }
        if (mapObject.getX() == 3018 && mapObject.getY() == 4821) {
            player.getMovement().teleport(3029, 4824);
        }
    }

    // Boil
    public static void mapObject26190(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(590)) {
            player.getGameEncoder().sendMessage("You need a tinderbox to do this.");
            return;
        } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.FIREMAKING) + 1)) {
            player.getGameEncoder().sendMessage("You fail to burn down the boil.");
            return;
        }
        if (mapObject.getX() == 3018 && mapObject.getY() == 4833) {
            player.getMovement().teleport(3025, 4833);
        }
    }

    // Eyes
    public static void mapObject26191(Player player, int index, MapObject mapObject) {
        if (!Utils.inRange(player.getController().getLevelForXP(Skills.THIEVING) + 1)) {
            player.getGameEncoder().sendMessage("You fail to distract the eyes.");
            return;
        }
        if (mapObject.getX() == 3021 && mapObject.getY() == 4842) {
            player.getMovement().teleport(3028, 4840);
        }
    }

    // Gap
    public static void mapObject26192(Player player, int index, MapObject mapObject) {
        if (!Utils.inRange(player.getController().getLevelForXP(Skills.AGILITY) + 1)) {
            player.getGameEncoder().sendMessage("You fail to squeeze through the gap.");
            return;
        }
        if (mapObject.getX() == 3028 && mapObject.getY() == 4849) {
            player.getMovement().teleport(3032, 4843);
        }
    }

    // Chest
    public static void mapObject26193(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject26194(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject26207(Player player, int index, MapObject mapObject) {}

    // Passage
    public static void mapObject26208(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3038 && mapObject.getY() == 4853) {
            player.getMovement().teleport(3039, 4845);
        }
    }

    // Trapdoor
    public static void mapObject26243(Player player, int index, MapObject mapObject) {}

    // Broken rope bridge
    public static void mapObject26244(Player player, int index, MapObject mapObject) {}

    // Broken rope bridge
    public static void mapObject26245(Player player, int index, MapObject mapObject) {}

    // Broken rope bridge
    public static void mapObject26246(Player player, int index, MapObject mapObject) {}

    // Broken rope bridge
    public static void mapObject26247(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject26248(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject26249(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject26250(Player player, int index, MapObject mapObject) {
        if (!Utils.inRange(player.getController().getLevelForXP(Skills.AGILITY) + 1)) {
            player.getGameEncoder().sendMessage("You fail to squeeze through the gap.");
            return;
        }
        if (mapObject.getX() == 3049 && mapObject.getY() == 4849) {
            player.getMovement().teleport(3047, 4843);
        }
    }

    // Eyes
    public static void mapObject26251(Player player, int index, MapObject mapObject) {
        if (!Utils.inRange(player.getController().getLevelForXP(Skills.THIEVING) + 1)) {
            player.getGameEncoder().sendMessage("You fail to distract the eyes.");
            return;
        }
        if (mapObject.getX() == 3058 && mapObject.getY() == 4839) {
            player.getMovement().teleport(3051, 4838);
        }
    }

    // Boil
    public static void mapObject26252(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(590)) {
            player.getGameEncoder().sendMessage("You need a tinderbox to do this.");
            return;
        } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.FIREMAKING) + 1)) {
            player.getGameEncoder().sendMessage("You fail to burn down the boil.");
            return;
        }
        if (mapObject.getX() == 3060 && mapObject.getY() == 4830) {
            player.getMovement().teleport(3053, 4831);
        }
    }

    // Tendrils
    public static void mapObject26253(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(" axe")) {
            player.getGameEncoder().sendMessage("You need an axe to do this.");
            return;
        } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.WOODCUTTING) + 1)) {
            player.getGameEncoder().sendMessage("You fail to chop the tendrils.");
            return;
        }
        if (mapObject.getX() == 3057 && mapObject.getY() == 4821) {
            player.getMovement().teleport(3050, 4823);
        }
    }

    // Bank deposit box
    public static void mapObject26254(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Sign
    public static void mapObject26255(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Zapper
    public static void mapObject26256(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject26257(Player player, int index, MapObject mapObject) {}

    // Chaos altar
    public static void mapObject26258(Player player, int index, MapObject mapObject) {}

    // Spirit tree
    public static void mapObject26259(Player player, int index, MapObject mapObject) {}

    // Spirit tree
    public static void mapObject26260(Player player, int index, MapObject mapObject) {}

    // Spirit tree
    public static void mapObject26261(Player player, int index, MapObject mapObject) {}

    // Spirit tree
    public static void mapObject26262(Player player, int index, MapObject mapObject) {}

    // Spirit tree
    public static void mapObject26263(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Power surge
    public static void mapObject26264(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Recurrent damage
    public static void mapObject26265(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Ultimate force
    public static void mapObject26266(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Empty vial
    public static void mapObject26268(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Potion
    public static void mapObject26269(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Spectator potion
    public static void mapObject26270(Player player, int index, MapObject mapObject) {}

    // Dominic's coffer
    public static void mapObject26271(Player player, int index, MapObject mapObject) {}

    // Dominic's coffer
    public static void mapObject26272(Player player, int index, MapObject mapObject) {}

    // Rewards chest
    public static void mapObject26273(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Potion
    public static void mapObject26276(Player player, int index, MapObject mapObject) {}

    // Super ranging potion
    public static void mapObject26277(Player player, int index, MapObject mapObject) {}

    // Super magic potion
    public static void mapObject26278(Player player, int index, MapObject mapObject) {}

    // Overload potion
    public static void mapObject26279(Player player, int index, MapObject mapObject) {}

    // Absorption potion
    public static void mapObject26280(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Anti-dragon shield
    public static void mapObject26281(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Magic secateurs
    public static void mapObject26282(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Chaos rune
    public static void mapObject26283(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Death rune
    public static void mapObject26284(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Blood rune
    public static void mapObject26285(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Air rune
    public static void mapObject26286(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Water rune
    public static void mapObject26287(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Earth rune
    public static void mapObject26288(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Fire rune
    public static void mapObject26289(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Pickaxe
    public static void mapObject26290(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Empty vial
    public static void mapObject26291(Player player, int index, MapObject mapObject) {}

    // Dominic's coffer
    public static void mapObject26292(Player player, int index, MapObject mapObject) {}

    // Pet house space
    public static void mapObject26296(Player player, int index, MapObject mapObject) {}

    // Oak house
    public static void mapObject26297(Player player, int index, MapObject mapObject) {}

    // Teak house
    public static void mapObject26298(Player player, int index, MapObject mapObject) {}

    // Mahogany house
    public static void mapObject26299(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject26300(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("Perhaps I should use this to forge something...");
    }

    // Zamorak altar
    public static void mapObject26363(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            if (player.getCombat().getGodWarsAltar() > 0) {
                long seconds = 600 - Time.tickToSec(player.getCombat().getGodWarsAltar());
                player.getGameEncoder()
                        .sendMessage("The gods blessed you recently. They will ignore your prayers for another "
                                + ((seconds > 60) ? (seconds / 60) + " minutes." : seconds + " seconds."));
                return;
            }
            player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
            player.setAnimation(Prayer.PRAY_ANIMATION);
            player.getGameEncoder().sendMessage("You recharge your Prayer.");
            player.getCombat().setGodWarsAltar((int) Time.minToTick(10));
        } else if (index == 1) {
            player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                    Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                    null, 2);
            player.getController().stopWithTeleport();
        }
    }

    // Saradomin altar
    public static void mapObject26364(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            if (player.getCombat().getGodWarsAltar() > 0) {
                long seconds = 600 - Time.tickToSec(player.getCombat().getGodWarsAltar());
                player.getGameEncoder()
                        .sendMessage("The gods blessed you recently. They will ignore your prayers for another "
                                + ((seconds > 60) ? (seconds / 60) + " minutes." : seconds + " seconds."));
                return;
            }
            player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
            player.setAnimation(Prayer.PRAY_ANIMATION);
            player.getGameEncoder().sendMessage("You recharge your Prayer.");
            player.getCombat().setGodWarsAltar((int) Time.minToTick(10));
        } else if (index == 1) {
            player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                    Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                    null, 2);
            player.getController().stopWithTeleport();
        }
    }

    // Armadyl altar
    public static void mapObject26365(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            if (player.getCombat().getGodWarsAltar() > 0) {
                long seconds = 600 - Time.tickToSec(player.getCombat().getGodWarsAltar());
                player.getGameEncoder()
                        .sendMessage("The gods blessed you recently. They will ignore your prayers for another "
                                + ((seconds > 60) ? (seconds / 60) + " minutes." : seconds + " seconds."));
                return;
            }
            player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
            player.setAnimation(Prayer.PRAY_ANIMATION);
            player.getGameEncoder().sendMessage("You recharge your Prayer.");
            player.getCombat().setGodWarsAltar((int) Time.minToTick(10));
        } else if (index == 1) {
            player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                    Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                    null, 2);
            player.getController().stopWithTeleport();
        }
    }

    // Bandos altar
    public static void mapObject26366(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            if (player.getCombat().getGodWarsAltar() > 0) {
                long seconds = 600 - Time.tickToSec(player.getCombat().getGodWarsAltar());
                player.getGameEncoder()
                        .sendMessage("The gods blessed you recently. They will ignore your prayers for another "
                                + ((seconds > 60) ? (seconds / 60) + " minutes." : seconds + " seconds."));
                return;
            }
            player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
            player.setAnimation(Prayer.PRAY_ANIMATION);
            player.getGameEncoder().sendMessage("You recharge your Prayer.");
            player.getCombat().setGodWarsAltar((int) Time.minToTick(10));
        } else if (index == 1) {
            player.getMovement().animatedTeleport(player.getWidgetManager().getHomeTile(),
                    Magic.NORMAL_MAGIC_ANIMATION_START, Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC,
                    null, 2);
            player.getController().stopWithTeleport();
        }
    }


   /* 26368 - 26623 */

    // Rope
    public static void mapObject26370(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject26371(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject26372(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject26373(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject26374(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject26375(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject26376(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject26377(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject26378(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject26380(Player player, int index, MapObject mapObject) {}

    // Little crack
    public static void mapObject26382(Player player, int index, MapObject mapObject) {}

    // Knight
    public static void mapObject26383(Player player, int index, MapObject mapObject) {}

    // Rocky handholds
    public static void mapObject26400(Player player, int index, MapObject mapObject) {}

    // Rocky handholds
    public static void mapObject26401(Player player, int index, MapObject mapObject) {}

    // Rocky handholds
    public static void mapObject26402(Player player, int index, MapObject mapObject) {}

    // Rocky handholds
    public static void mapObject26404(Player player, int index, MapObject mapObject) {}

    // Rocky handholds
    public static void mapObject26405(Player player, int index, MapObject mapObject) {}

    // Rocky handholds
    public static void mapObject26406(Player player, int index, MapObject mapObject) {}

    // Boulder
    public static void mapObject26415(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject26417(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject26418(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject26419(Player player, int index, MapObject mapObject) {
        // God Wars entrance
        player.setController(new GodWarsPC());
        player.getMovement().ladderDownTeleport(new Tile(2882, 5311, 2));
    }

    // Broken pillar
    public static void mapObject26420(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject26422(Player player, int index, MapObject mapObject) {}

    // Big door
    public static void mapObject26461(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26492(Player player, int index, MapObject mapObject) {}

    // Big door
    public static void mapObject26502(Player player, int index, MapObject mapObject) {
        if (player.getY() <= 5294) {
            // player.getMovement().teleport(new Tile(2839, 5296, 2));
            player.openDialogue("bossinstance", 7);
        } else {
            player.getGameEncoder().sendMessage("You must use the altar to leave.");
            // player.getMovement().teleport(new Tile(2839, 5294, 2));
        }
    }

    // Big door
    public static void mapObject26503(Player player, int index, MapObject mapObject) {
        if (player.getX() <= 2862) {
            // player.getMovement().teleport(new Tile(2864, 5354, 2));
            player.openDialogue("bossinstance", 8);
        } else {
            player.getGameEncoder().sendMessage("You must use the altar to leave.");
            // player.getMovement().teleport(new Tile(2862, 5354, 2));
        }
    }

    // Big door
    public static void mapObject26504(Player player, int index, MapObject mapObject) {
        if (player.getX() >= 2909) {
            // player.getMovement().teleport(new Tile(2907, 5265, 0));
            player.openDialogue("bossinstance", 10);
        } else {
            player.getGameEncoder().sendMessage("You must use the altar to leave.");
            // player.getMovement().teleport(new Tile(2909, 5265, 0));
        }
    }

    // Big door
    public static void mapObject26505(Player player, int index, MapObject mapObject) {
        if (player.getY() >= 5333) {
            // player.getMovement().teleport(new Tile(2925, 5331, 2));
            player.openDialogue("bossinstance", 9);
        } else {
            player.getGameEncoder().sendMessage("You must use the altar to leave.");
            // player.getMovement().teleport(new Tile(2925, 5333, 2));
        }
    }

    // Ice bridge
    public static void mapObject26518(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject26519(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject26561(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject26562(Player player, int index, MapObject mapObject) {}

    // Knight
    public static void mapObject26563(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject26564(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject26565(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject26566(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject26567(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject26568(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject26569(Player player, int index, MapObject mapObject) {}

    // Blighted vine
    public static void mapObject26572(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject26574(Player player, int index, MapObject mapObject) {
        if (!player.getInventory().hasItem(" pickaxe")) {
            player.getGameEncoder().sendMessage("You need a pickaxe to do this.");
            return;
        } else if (!Utils.inRange(player.getController().getLevelForXP(Skills.MINING) + 1)) {
            player.getGameEncoder().sendMessage("You fail to mine the rock.");
            return;
        }
        if (mapObject.getX() == 3049 && mapObject.getY() == 4813) {
            player.getMovement().teleport(3048, 4822);
        }
    }

    // Fruit Tree Patch
    public static void mapObject26579(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26580(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26600(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26601(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26602(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26603(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26604(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26605(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26606(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26607(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26608(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26609(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26610(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26611(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26612(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26613(Player player, int index, MapObject mapObject) {}

    // Grand Gold Chest
    public static void mapObject26614(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject26615(Player player, int index, MapObject mapObject) {}

    // Grand Gold Chest
    public static void mapObject26616(Player player, int index, MapObject mapObject) {}

    // Tomb Door
    public static void mapObject26617(Player player, int index, MapObject mapObject) {}

    // Tomb Door
    public static void mapObject26618(Player player, int index, MapObject mapObject) {}

    // Tomb Door
    public static void mapObject26619(Player player, int index, MapObject mapObject) {}

    // Tomb Door
    public static void mapObject26620(Player player, int index, MapObject mapObject) {}

    // Tomb Door
    public static void mapObject26621(Player player, int index, MapObject mapObject) {}

    // An anonymous looking door
    public static void mapObject26622(Player player, int index, MapObject mapObject) {}

    // An anonymous looking door
    public static void mapObject26623(Player player, int index, MapObject mapObject) {}


   /* 26624 - 26879 */

    // An anonymous looking door
    public static void mapObject26624(Player player, int index, MapObject mapObject) {}

    // An anonymous looking door
    public static void mapObject26625(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject26626(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26628(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26629(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26630(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26631(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject26632(Player player, int index, MapObject mapObject) {}

    // Stones
    public static void mapObject26633(Player player, int index, MapObject mapObject) {}

    // Treasure Trail Statistics
    public static void mapObject26634(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject26635(Player player, int index, MapObject mapObject) {}

    // Challenge portal
    public static void mapObject26642(Player player, int index, MapObject mapObject) {
        player.openDialogue("clanwars", 0);
    }

    // Challenge portal
    public static void mapObject26643(Player player, int index, MapObject mapObject) {
        player.openDialogue("clanwars", 0);
    }

    // Challenge portal
    public static void mapObject26644(Player player, int index, MapObject mapObject) {
        player.openDialogue("clanwars", 0);
    }

    // Free-for-all portal
    public static void mapObject26645(Player player, int index, MapObject mapObject) {
        // player.openDialogue("freeforall", 0);
        player.getMovement().teleport(3327, 4752, 0);
        player.setController(new ClanWarsFreeForAllPC());
    }

    // Portal
    public static void mapObject26646(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject26654(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject26655(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject26661(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject26662(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject26663(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject26664(Player player, int index, MapObject mapObject) {}

    // Broken strut
    public static void mapObject26670(Player player, int index, MapObject mapObject) {}

    // Hopper
    public static void mapObject26674(Player player, int index, MapObject mapObject) {}

    // Empty sack
    public static void mapObject26677(Player player, int index, MapObject mapObject) {}

    // Sack
    public static void mapObject26678(Player player, int index, MapObject mapObject) {}

    // Rockfall
    public static void mapObject26679(Player player, int index, MapObject mapObject) {}

    // Rockfall
    public static void mapObject26680(Player player, int index, MapObject mapObject) {}

    // Empty sack
    public static void mapObject26688(Player player, int index, MapObject mapObject) {}

    // Mystic symbol
    public static void mapObject26692(Player player, int index, MapObject mapObject) {}

    // Mystic symbol
    public static void mapObject26693(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject26703(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject26704(Player player, int index, MapObject mapObject) {}

    // Blighted vine
    public static void mapObject26705(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject26707(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Cave
    public static void mapObject26709(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(2429, 9824));
    }

    // Crevice
    public static void mapObject26710(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject26711(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject26712(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject26713(Player player, int index, MapObject mapObject) {}

    // Root
    public static void mapObject26720(Player player, int index, MapObject mapObject) {}

    // Root
    public static void mapObject26721(Player player, int index, MapObject mapObject) {}

    // Roots
    public static void mapObject26723(Player player, int index, MapObject mapObject) {
        // Stronghold Slayer Cave
        if (player.getX() >= 2393) {
            Tile tile = new Tile(2391, 9788, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2393, 9788, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Mud pile
    public static void mapObject26724(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26727(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26728(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26731(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26732(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26733(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26734(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26735(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26736(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26737(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject26738(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject26739(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject26740(Player player, int index, MapObject mapObject) {}

    // Viewing orb
    public static void mapObject26741(Player player, int index, MapObject mapObject) {}

    // Viewing orb
    public static void mapObject26743(Player player, int index, MapObject mapObject) {
        player.getClanWars().teleportViewing(0);
    }

    // Viewing orb
    public static void mapObject26745(Player player, int index, MapObject mapObject) {}

    // Viewing orb
    public static void mapObject26747(Player player, int index, MapObject mapObject) {}

    // Viewing orb
    public static void mapObject26749(Player player, int index, MapObject mapObject) {}

    // Wilderness Statistics
    public static void mapObject26756(Player player, int index, MapObject mapObject) {
        List<Player> players = new ArrayList<>(player.getWorld().getPlayers());
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                int i = Double.compare(p2.getCombat().getKDR(), p1.getCombat().getKDR());
                if (i != 0) {
                    return i;
                }
                i = Integer.compare(p2.getCombat().getKillingSpree(), p1.getCombat().getKillingSpree());
                if (i != 0) {
                    return i;
                }
                i = Integer.compare(p2.getCombat().getKills(), p1.getCombat().getKills());
                if (i != 0) {
                    return i;
                }
                return Integer.compare(p1.getCombat().getDeaths(), p2.getCombat().getDeaths());
            }
        });
        List<String> lines = new ArrayList<>();
        int rank = 1;
        for (int i = 0; i < players.size() && i < 50; i++) {
            Player p = players.get(i);
            if (p.getCombat().getKDR() == 0) {
                continue;
            }
            lines.add("[#" + rank + "] " + p.getUsername() + ": KDR: " + p.getCombat().getKDR() + "; Spree: "
                    + p.getCombat().getKillingSpree());
            rank++;
        }
        Dialogue.openScroll(player, "Top Online PKers", Utils.toStringArray(lines));
    }

    // Chest
    public static void mapObject26757(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject26760(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3184 && mapObject.getY() == 3944) {
            if (index == 0) {
                if (player.getY() == 3945) {
                    player.openDialogue("wilderness", 0);
                } else {
                    if (mapObject.isBusy() || player.getX() != mapObject.getX() || mapObject.getDirection() != 1) {
                        return;
                    }
                    player.getMovement().clear();
                    if (player.getY() == mapObject.getY()) {
                        player.getMovement().addMovement(mapObject.getX(), mapObject.getY() + 1);
                    } else {
                        player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
                    }
                    Region.openDoor(player, mapObject, 1, false, false);
                }
            } else if (index == 1) {
                int count = 0;
                for (Player player2 : player.getController().getPlayers()) {
                    if (player2.inWildernessResourceArea()) {
                        count++;
                    }
                }
                if (count == 1) {
                    player.getGameEncoder()
                            .sendMessage("You peek inside the gate and see " + count + " adventurer inside the arena.");
                } else {
                    player.getGameEncoder().sendMessage(
                            "You peek inside the gate and see " + count + " adventurers inside the arena.");
                }
            }
        }
    }

    // Lever
    public static void mapObject26761(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 3080 && mapObject.getY() == 3488) {
            // Edgeville
            if (player.getMovement().getTeleportBlock() > 0) {
                player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                        + player.getMovement().getTeleportBlockRemaining() + ".");
                return;
            }
            Tile tile = new Tile(3153, 3923, 0);
            if (player.getClientHeight() == tile.getHeight()) {
                tile.setHeight(player.getHeight());
            }
            if (!player.getController().canTeleport(tile, true)) {
                return;
            }
            player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
            player.clearHits();
        }
    }

    // Cavern
    public static void mapObject26762(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3231 && mapObject.getY() == 3951) {
            player.getMovement().teleport(3232, 10351);
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3241 && mapObject.getY() == 3949) {
            player.getMovement().teleport(3243, 10351);
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3231 && mapObject.getY() == 3936) {
            player.getMovement().teleport(3233, 10332);
            player.setObjectOptionDelay(4);
        }
    }

    // Crevice
    public static void mapObject26763(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3232 && mapObject.getY() == 10352) {
            player.getMovement().teleport(3232, 3950);
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3243 && mapObject.getY() == 10352) {
            player.getMovement().teleport(3242, 3948);
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3233 && mapObject.getY() == 10331) {
            player.getMovement().teleport(3232, 3938);
            player.setObjectOptionDelay(4);
        }
    }

    // Cave
    public static void mapObject26766(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3016 && mapObject.getY() == 3738) {
            player.getMovement().ladderDownTeleport(new Tile(3065, 10159, 3));
            player.setObjectOptionDelay(4);
        }
    }

    // Crevice
    public static void mapObject26767(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3065 && mapObject.getY() == 10160) {
            player.getMovement().ladderDownTeleport(new Tile(3017, 3740, 0));
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3049 && mapObject.getY() == 10165) {
            player.getMovement().ladderDownTeleport(new Tile(3034, 10158, 0));
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3066 && mapObject.getY() == 10142) {
            player.getMovement().ladderDownTeleport(new Tile(3062, 10130, 0));
            player.setObjectOptionDelay(4);
        }
    }

    // Jutting wall
    public static void mapObject26768(Player player, int index, MapObject mapObject) {
        if (player.getController().isMagicBound()) {
            player.getGameEncoder()
                    .sendMessage("A magical force stops you from moving for "
                            + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                            + " more seconds.");
            return;
        }
        if (mapObject.getX() == 3066 && mapObject.getY() == 10148) {
            if (player.getY() >= 10149) {
                player.getMovement().teleport(3066, 10147, 3);
            } else {
                player.getMovement().teleport(3066, 10149, 3);
            }
            player.setObjectOptionDelay(4);
        }
    }

    // Crevice
    public static void mapObject26769(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3035 && mapObject.getY() == 10158) {
            player.getMovement().ladderDownTeleport(new Tile(3050, 10165, 3));
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3062 && mapObject.getY() == 10131) {
            player.getMovement().ladderDownTeleport(new Tile(3066, 10143, 3));
            player.setObjectOptionDelay(4);
        }
    }

    // Poll booth
    public static void mapObject26796(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26797(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26798(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26799(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26800(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26801(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26802(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26803(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26804(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26805(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26806(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26807(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26808(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26809(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26810(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26811(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26812(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26813(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26814(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26815(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26816(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26817(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26818(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26819(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26820(Player player, int index, MapObject mapObject) {}

    // Ancient Fury Statue
    public static void mapObject26825(Player player, int index, MapObject mapObject) {}

    // Fatality Statue
    public static void mapObject26826(Player player, int index, MapObject mapObject) {}

    // Hexis Statue
    public static void mapObject26827(Player player, int index, MapObject mapObject) {}

    // Reign of Terror Statue
    public static void mapObject26828(Player player, int index, MapObject mapObject) {}

    // Stud Unit Statue
    public static void mapObject26829(Player player, int index, MapObject mapObject) {}

    // Consecrated house
    public static void mapObject26830(Player player, int index, MapObject mapObject) {}

    // Desecrated house
    public static void mapObject26831(Player player, int index, MapObject mapObject) {}

    // Nature house
    public static void mapObject26832(Player player, int index, MapObject mapObject) {}

    // Habitat space
    public static void mapObject26833(Player player, int index, MapObject mapObject) {}

    // Tree stump
    public static void mapObject26834(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject26835(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject26836(Player player, int index, MapObject mapObject) {}

    // Igloo
    public static void mapObject26837(Player player, int index, MapObject mapObject) {}

    // Crater
    public static void mapObject26838(Player player, int index, MapObject mapObject) {}

    // Habitat space
    public static void mapObject26839(Player player, int index, MapObject mapObject) {}

    // Grassland
    public static void mapObject26840(Player player, int index, MapObject mapObject) {}

    // Forest floor
    public static void mapObject26841(Player player, int index, MapObject mapObject) {}

    // Sand
    public static void mapObject26842(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject26843(Player player, int index, MapObject mapObject) {}

    // Burnt rock
    public static void mapObject26844(Player player, int index, MapObject mapObject) {}

    // Habitat space
    public static void mapObject26845(Player player, int index, MapObject mapObject) {}

    // Grassland
    public static void mapObject26846(Player player, int index, MapObject mapObject) {}

    // Forest floor
    public static void mapObject26847(Player player, int index, MapObject mapObject) {}

    // Sand
    public static void mapObject26848(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject26849(Player player, int index, MapObject mapObject) {}

    // Burnt rock
    public static void mapObject26850(Player player, int index, MapObject mapObject) {}

    // Habitat space
    public static void mapObject26851(Player player, int index, MapObject mapObject) {}

    // Grassland
    public static void mapObject26852(Player player, int index, MapObject mapObject) {}

    // Forest floor
    public static void mapObject26853(Player player, int index, MapObject mapObject) {}

    // Sand
    public static void mapObject26854(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject26855(Player player, int index, MapObject mapObject) {}

    // Burnt rock
    public static void mapObject26856(Player player, int index, MapObject mapObject) {}

    // Scratching post space
    public static void mapObject26857(Player player, int index, MapObject mapObject) {}

    // Oak scratching post
    public static void mapObject26858(Player player, int index, MapObject mapObject) {}

    // Teak scratching post
    public static void mapObject26859(Player player, int index, MapObject mapObject) {}

    // Mahogany scratching post
    public static void mapObject26860(Player player, int index, MapObject mapObject) {}

    // Arena space
    public static void mapObject26861(Player player, int index, MapObject mapObject) {}

    // Arena
    public static void mapObject26862(Player player, int index, MapObject mapObject) {}

    // Arena
    public static void mapObject26863(Player player, int index, MapObject mapObject) {}

    // Arena
    public static void mapObject26864(Player player, int index, MapObject mapObject) {}

    // Arena space
    public static void mapObject26865(Player player, int index, MapObject mapObject) {}

    // Arena
    public static void mapObject26866(Player player, int index, MapObject mapObject) {}

    // Pet list space
    public static void mapObject26867(Player player, int index, MapObject mapObject) {}

    // Pet list
    public static void mapObject26868(Player player, int index, MapObject mapObject) {}

    // Pet feeder space
    public static void mapObject26869(Player player, int index, MapObject mapObject) {}

    // Oak feeder
    public static void mapObject26870(Player player, int index, MapObject mapObject) {}

    // Teak feeder
    public static void mapObject26871(Player player, int index, MapObject mapObject) {}

    // Mahogany feeder
    public static void mapObject26872(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject26873(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject26874(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject26875(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject26877(Player player, int index, MapObject mapObject) {}


   /* 26880 - 27135 */

    // Vine
    public static void mapObject26880(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2670, 9583, 2);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Vine
    public static void mapObject26882(Player player, int index, MapObject mapObject) {
        // Brimhaven Dungeon
        Tile tile = new Tile(2673, 9583, 0);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Blighted vine
    public static void mapObject26884(Player player, int index, MapObject mapObject) {}

    // Blighted vine
    public static void mapObject26886(Player player, int index, MapObject mapObject) {}

    // Appendage
    public static void mapObject27027(Player player, int index, MapObject mapObject) {}

    // <col=ffff00>The Overseer</col>
    public static void mapObject27044(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>Overseer's book</col>
    public static void mapObject27047(Player player, int index, MapObject mapObject) {}

    // Passage
    public static void mapObject27054(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(3039, 4800);
    }

    // Passage
    public static void mapObject27055(Player player, int index, MapObject mapObject) {
        if (player.getEquipment().getHandID() == 11095 || player.getEquipment().getHandID() == 11097
                || player.getEquipment().getHandID() == 11099 || player.getEquipment().getHandID() == 11101
                || player.getEquipment().getHandID() == 11103) {
            player.getEquipment().setItem(Equipment.Slot.HAND, (player.getEquipment().getHandID() == 11103) ? null
                    : new Item(player.getEquipment().getHandID() + 2, 1));
            player.getAppearance().setUpdate(true);
        } else {
            player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
        }
        player.getMovement().teleport(3039, 4805);
    }

    // <col=ffff00>The Overseer</col>
    public static void mapObject27057(Player player, int index, MapObject mapObject) {
        player.openDialogue("bossinstance", 11);
    }

    // Boils
    public static void mapObject27058(Player player, int index, MapObject mapObject) {}

    // Evergreen
    public static void mapObject27060(Player player, int index, MapObject mapObject) {}

    // Tree stump
    public static void mapObject27061(Player player, int index, MapObject mapObject) {}

    // Rockslide
    public static void mapObject27062(Player player, int index, MapObject mapObject) {}

    // Rockslide
    public static void mapObject27063(Player player, int index, MapObject mapObject) {}

    // Old log
    public static void mapObject27064(Player player, int index, MapObject mapObject) {}

    // Log raft
    public static void mapObject27065(Player player, int index, MapObject mapObject) {}

    // Row boat
    public static void mapObject27066(Player player, int index, MapObject mapObject) {}

    // Old log
    public static void mapObject27067(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject27068(Player player, int index, MapObject mapObject) {}

    // Door hotspot
    public static void mapObject27069(Player player, int index, MapObject mapObject) {}

    // Window space
    public static void mapObject27070(Player player, int index, MapObject mapObject) {}

    // Floor space
    public static void mapObject27071(Player player, int index, MapObject mapObject) {}

    // Floor decoration
    public static void mapObject27072(Player player, int index, MapObject mapObject) {}

    // Shuttered window
    public static void mapObject27073(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject27074(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject27075(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject27076(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject27077(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject27078(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject27079(Player player, int index, MapObject mapObject) {}

    // Decorative window
    public static void mapObject27080(Player player, int index, MapObject mapObject) {}

    // Stained-glass window
    public static void mapObject27081(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject27084(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject27085(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject27086(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject27087(Player player, int index, MapObject mapObject) {}

    // Light
    public static void mapObject27093(Player player, int index, MapObject mapObject) {}

    // Clan Cup portal
    public static void mapObject27094(Player player, int index, MapObject mapObject) {}

    // Clan Cup portal
    public static void mapObject27095(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject27096(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject27100(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject27101(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject27102(Player player, int index, MapObject mapObject) {}

    // Charcoal furnace
    public static void mapObject27107(Player player, int index, MapObject mapObject) {}

    // Charcoal furnace
    public static void mapObject27108(Player player, int index, MapObject mapObject) {}

    // Charcoal furnace
    public static void mapObject27109(Player player, int index, MapObject mapObject) {}

    // Charcoal furnace
    public static void mapObject27110(Player player, int index, MapObject mapObject) {}

    // Flower Patch
    public static void mapObject27111(Player player, int index, MapObject mapObject) {}

    // Compost Bin
    public static void mapObject27112(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject27113(Player player, int index, MapObject mapObject) {}

    // Allotment
    public static void mapObject27114(Player player, int index, MapObject mapObject) {}

    // Herb patch
    public static void mapObject27115(Player player, int index, MapObject mapObject) {}

    // Spirit Tree Patch
    public static void mapObject27116(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject27121(Player player, int index, MapObject mapObject) {}

    // Dead mushroom ring
    public static void mapObject27123(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject27124(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }


   /* 27136 - 27391 */

    // Stairs
    public static void mapObject27199(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27200(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27201(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27202(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27203(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27204(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject27205(Player player, int index, MapObject mapObject) {}

    // Information
    public static void mapObject27230(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject27253(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27254(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Crate
    public static void mapObject27256(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject27257(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject27259(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27260(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27262(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27263(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27264(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27265(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27266(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27267(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Chair
    public static void mapObject27268(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27269(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY_32304)) {
            player.getInventory().deleteItem(ItemID.BLOODY_KEY_32304, 1);
            Item item = null;
            if (player.isGameModeNormal() || player.isGameModeHard()) {
                item = MysteryBox.getBoxItem();
            } else {
                item = RandomItem.getItem(MysteryBox.BARROWS_PIECES);
            }
            String itemName =
                    ("aeiouAEIOU".indexOf(item.getName().charAt(0)) != -1 ? "an" : "a") + " " + item.getName();
            player.getWorld().sendNews(player.getMessaging().getIconImage() + player.getUsername() + " has received "
                    + itemName + " from a bloody key!");
            player.getInventory().addOrDropItem(item);
            RequestManager.addPlayerLog(player, "lootbox",
                    player.getLogName() + " received " + item.getLogName() + " from a bloody key.");
        } else if (player.getInventory().hasItem(ItemID.BLOODIER_KEY_32305)) {
            player.getInventory().deleteItem(ItemID.BLOODIER_KEY_32305, 1);
            Item item1 = null;
            Item item2 = null;
            if (player.isGameModeNormal() || player.isGameModeHard()) {
                item1 = MysteryBox.getSuperBoxItem();
                item2 = MysteryBox.getSuperBoxItem();
                String itemNames =
                        ("aeiouAEIOU".indexOf(item1.getName().charAt(0)) != -1 ? "an" : "a") + " " + item1.getName();
                itemNames += " and " + ("aeiouAEIOU".indexOf(item2.getName().charAt(0)) != -1 ? "an" : "a") + " "
                        + item2.getName();
                player.getWorld().sendNews(player.getMessaging().getIconImage() + player.getUsername()
                        + " has received " + itemNames + " from a bloodier key!");
            } else {
                item1 = RandomItem.getItem(MysteryBox.BARROWS_SETS);
                String itemName =
                        ("aeiouAEIOU".indexOf(item1.getName().charAt(0)) != -1 ? "an" : "a") + " " + item1.getName();
                player.getWorld().sendNews(player.getMessaging().getIconImage() + player.getUsername()
                        + " has received " + itemName + " from a bloodier key!");
            }
            player.getInventory().addOrDropItem(item1);
            RequestManager.addPlayerLog(player, "lootbox",
                    player.getLogName() + " received " + item1.getLogName() + " from a bloodier key.");
            if (item2 != null) {
                player.getInventory().addOrDropItem(item2);
                RequestManager.addPlayerLog(player, "lootbox",
                        player.getLogName() + " received " + item2.getLogName() + " from a bloodier key.");
            }
        } else if (player.getInventory().hasItem(ItemID.SINISTER_KEY)) {
            player.getBarrows().openChest(mapObject.getX() != 3551 || mapObject.getY() != 9695);
        } else {
            player.getGameEncoder().sendMessage("You need a key to open this chest.");
        }
    }

    // Chair
    public static void mapObject27270(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27271(Player player, int index, MapObject mapObject) {}

    // Stool
    public static void mapObject27272(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject27273(Player player, int index, MapObject mapObject) {}

    // Potted plant
    public static void mapObject27274(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27275(Player player, int index, MapObject mapObject) {}

    // Chair
    public static void mapObject27276(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27277(Player player, int index, MapObject mapObject) {}

    // Potted flower
    public static void mapObject27278(Player player, int index, MapObject mapObject) {}

    // Potted plant
    public static void mapObject27279(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27280(Player player, int index, MapObject mapObject) {}

    // Smashed chair
    public static void mapObject27281(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27282(Player player, int index, MapObject mapObject) {}

    // Stool
    public static void mapObject27283(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27284(Player player, int index, MapObject mapObject) {}

    // Private bank booth
    public static void mapObject27285(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27286(Player player, int index, MapObject mapObject) {}

    // Boulders
    public static void mapObject27287(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27288(Player player, int index, MapObject mapObject) {}

    // Bank Table
    public static void mapObject27289(Player player, int index, MapObject mapObject) {}

    // Deadman chest
    public static void mapObject27290(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject27291(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27292(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Handholds
    public static void mapObject27362(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1459 && mapObject.getY() == 3690) {
            player.getMovement().ladderDownTeleport(new Tile(1454, 3690, 0));
        } else if (mapObject.getX() == 1455 && mapObject.getY() == 3690) {
            player.getMovement().ladderUpTeleport(new Tile(1460, 3690, 0));
        } else if (mapObject.getX() == 1471 && mapObject.getY() == 3687) {
            player.getMovement().ladderDownTeleport(new Tile(1476, 3687, 0));
        } else if (mapObject.getX() == 1475 && mapObject.getY() == 3687) {
            player.getMovement().ladderUpTeleport(new Tile(1470, 3687, 0));
        }
    }

    // Food cupboard
    public static void mapObject27375(Player player, int index, MapObject mapObject) {}

    // Utensil cupboard
    public static void mapObject27376(Player player, int index, MapObject mapObject) {}

    // Meat table
    public static void mapObject27377(Player player, int index, MapObject mapObject) {}

    // Buffet table
    public static void mapObject27378(Player player, int index, MapObject mapObject) {}

    // Blighted Golovanova seedling
    public static void mapObject27386(Player player, int index, MapObject mapObject) {}

    // Blighted Golovanova plant
    public static void mapObject27389(Player player, int index, MapObject mapObject) {}


   /* 27392 - 27647 */

    // Blighted Golovanova plant
    public static void mapObject27392(Player player, int index, MapObject mapObject) {}

    // Golovanova plant
    public static void mapObject27393(Player player, int index, MapObject mapObject) {}

    // Blighted Golovanova plant
    public static void mapObject27394(Player player, int index, MapObject mapObject) {}

    // Blighted Bologano seedling
    public static void mapObject27397(Player player, int index, MapObject mapObject) {}

    // Blighted Bologano plant
    public static void mapObject27400(Player player, int index, MapObject mapObject) {}

    // Blighted Bologano plant
    public static void mapObject27403(Player player, int index, MapObject mapObject) {}

    // Bologano plant
    public static void mapObject27404(Player player, int index, MapObject mapObject) {}

    // Blighted Bologano plant
    public static void mapObject27405(Player player, int index, MapObject mapObject) {}

    // Blighted Logavano seedling
    public static void mapObject27408(Player player, int index, MapObject mapObject) {}

    // Blighted Logavano plant
    public static void mapObject27411(Player player, int index, MapObject mapObject) {}

    // Blighted Logavano plant
    public static void mapObject27414(Player player, int index, MapObject mapObject) {}

    // Logavano plant
    public static void mapObject27415(Player player, int index, MapObject mapObject) {}

    // Blighted Logavano plant
    public static void mapObject27416(Player player, int index, MapObject mapObject) {}

    // Seed table
    public static void mapObject27430(Player player, int index, MapObject mapObject) {}

    // Sack
    public static void mapObject27431(Player player, int index, MapObject mapObject) {}

    // Sack
    public static void mapObject27432(Player player, int index, MapObject mapObject) {}

    // Saltpetre
    public static void mapObject27433(Player player, int index, MapObject mapObject) {}

    // Saltpetre
    public static void mapObject27434(Player player, int index, MapObject mapObject) {}

    // Saltpetre
    public static void mapObject27435(Player player, int index, MapObject mapObject) {}

    // Saltpetre
    public static void mapObject27436(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject27443(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject27444(Player player, int index, MapObject mapObject) {}

    // Farm door
    public static void mapObject27445(Player player, int index, MapObject mapObject) {}

    // Glass door
    public static void mapObject27485(Player player, int index, MapObject mapObject) {}

    // Glass door
    public static void mapObject27486(Player player, int index, MapObject mapObject) {}

    // Glass door
    public static void mapObject27487(Player player, int index, MapObject mapObject) {}

    // Glass door
    public static void mapObject27488(Player player, int index, MapObject mapObject) {}

    // Mature juniper tree
    public static void mapObject27499(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject27501(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject27532(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject27533(Player player, int index, MapObject mapObject) {}

    // Barrel of fish
    public static void mapObject27552(Player player, int index, MapObject mapObject) {}

    // Cooling chest
    public static void mapObject27554(Player player, int index, MapObject mapObject) {}

    // Fishing Crane
    public static void mapObject27555(Player player, int index, MapObject mapObject) {}

    // Sandworm castings
    public static void mapObject27557(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject27634(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject27635(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject27636(Player player, int index, MapObject mapObject) {}


   /* 27648 - 27903 */

    // Bank booth
    public static void mapObject27718(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27719(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27720(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject27721(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Drawers
    public static void mapObject27771(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject27772(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject27773(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject27774(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject27775(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject27776(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject27777(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject27778(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject27779(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject27780(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject27781(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject27782(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject27783(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject27784(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject27785(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27851(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27852(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27853(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27854(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27855(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject27856(Player player, int index, MapObject mapObject) {}


   /* 27904 - 28159 */

    // Blood Altar
    public static void mapObject27978(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.BLOOD);
    }

    // Dark Altar
    public static void mapObject27979(Player player, int index, MapObject mapObject) {}

    // Soul Altar
    public static void mapObject27980(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.SOUL);
    }

    // Rocks
    public static void mapObject27984(Player player, int index, MapObject mapObject) {
        Tile endTile = null;
        if (mapObject.getX() == 1743 && mapObject.getY() == 3854
                || mapObject.getX() == 1751 && mapObject.getY() == 3854) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
                player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
        } else if (mapObject.getX() == 1761 && mapObject.getY() == 3872
                || mapObject.getX() == 1761 && mapObject.getY() == 3873) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
                player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
                return;
            }
            endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
        } else if (mapObject.getX() == 1770 && mapObject.getY() == 3849
                || mapObject.getX() == 1773 && mapObject.getY() == 3849) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 52) {
                player.getGameEncoder().sendMessage("You need an Agility level of 52 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1769 ? 1774 : 1769, 3849);
        }
        if (endTile == null) {
            return;
        }
        player.lock();
        player.getAppearance().setForceMoveAnimation(844);
        player.getMovement().clear();
        player.getMovement().addMovement(endTile);
        player.getMovement().setForceRunning(false);
        final Tile finalTile = endTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.matchesTile(finalTile)) {
                    return;
                }
                super.stop();
                player.unlock();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setForceRunning(null);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Rocks
    public static void mapObject27985(Player player, int index, MapObject mapObject) {
        Tile endTile = null;
        if (mapObject.getX() == 1743 && mapObject.getY() == 3854
                || mapObject.getX() == 1751 && mapObject.getY() == 3854) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
                player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
        } else if (mapObject.getX() == 1761 && mapObject.getY() == 3872
                || mapObject.getX() == 1761 && mapObject.getY() == 3873) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
                player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
                return;
            }
            endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
        } else if (mapObject.getX() == 1770 && mapObject.getY() == 3849
                || mapObject.getX() == 1773 && mapObject.getY() == 3849) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 52) {
                player.getGameEncoder().sendMessage("You need an Agility level of 52 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1769 ? 1774 : 1769, 3849);
        }
        if (endTile == null) {
            return;
        }
        player.lock();
        player.getAppearance().setForceMoveAnimation(844);
        player.getMovement().clear();
        player.getMovement().addMovement(endTile);
        player.getMovement().setForceRunning(false);
        final Tile finalTile = endTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.matchesTile(finalTile)) {
                    return;
                }
                super.stop();
                player.unlock();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setForceRunning(null);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Rocks
    public static void mapObject27987(Player player, int index, MapObject mapObject) {
        Tile endTile = null;
        if (mapObject.getX() == 1743 && mapObject.getY() == 3854
                || mapObject.getX() == 1751 && mapObject.getY() == 3854) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
                player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
        } else if (mapObject.getX() == 1761 && mapObject.getY() == 3872
                || mapObject.getX() == 1761 && mapObject.getY() == 3873) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
                player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
                return;
            }
            endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
        } else if (mapObject.getX() == 1770 && mapObject.getY() == 3849
                || mapObject.getX() == 1773 && mapObject.getY() == 3849) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 52) {
                player.getGameEncoder().sendMessage("You need an Agility level of 52 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1769 ? 1774 : 1769, 3849);
        }
        if (endTile == null) {
            return;
        }
        player.lock();
        player.getAppearance().setForceMoveAnimation(844);
        player.getMovement().clear();
        player.getMovement().addMovement(endTile);
        player.getMovement().setForceRunning(false);
        final Tile finalTile = endTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.matchesTile(finalTile)) {
                    return;
                }
                super.stop();
                player.unlock();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setForceRunning(null);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Rocks
    public static void mapObject27988(Player player, int index, MapObject mapObject) {
        Tile endTile = null;
        if (mapObject.getX() == 1743 && mapObject.getY() == 3854
                || mapObject.getX() == 1751 && mapObject.getY() == 3854) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
                player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
        } else if (mapObject.getX() == 1761 && mapObject.getY() == 3872
                || mapObject.getX() == 1761 && mapObject.getY() == 3873) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
                player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
                return;
            }
            endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
        } else if (mapObject.getX() == 1770 && mapObject.getY() == 3849
                || mapObject.getX() == 1773 && mapObject.getY() == 3849) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 52) {
                player.getGameEncoder().sendMessage("You need an Agility level of 52 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1769 ? 1774 : 1769, 3849);
        }
        if (endTile == null) {
            return;
        }
        player.lock();
        player.getAppearance().setForceMoveAnimation(844);
        player.getMovement().clear();
        player.getMovement().addMovement(endTile);
        player.getMovement().setForceRunning(false);
        final Tile finalTile = endTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.matchesTile(finalTile)) {
                    return;
                }
                super.stop();
                player.unlock();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setForceRunning(null);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Boulder
    public static void mapObject27990(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27991(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27992(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27993(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27994(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27995(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27996(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27997(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27998(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27999(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28000(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28001(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28002(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28003(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28004(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28005(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28006(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28007(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28008(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28009(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28010(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28011(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28012(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28013(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28014(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28015(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28016(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28017(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28018(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28019(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28020(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28021(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28022(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28023(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28024(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28025(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28026(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28027(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28028(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28029(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28030(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28031(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28032(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28033(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28034(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28035(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28036(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28037(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28038(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28039(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28040(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28041(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28042(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28043(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28044(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28045(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28046(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28047(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28048(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28049(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28050(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28051(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28052(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28053(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28054(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28055(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28056(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28057(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28058(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28059(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28060(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28061(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28062(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28063(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28064(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28065(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28066(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28067(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28068(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28069(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28070(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28071(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28072(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28073(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28074(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28075(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28076(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28077(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28078(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28079(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28080(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28081(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28082(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28083(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28084(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28085(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28086(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28087(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28088(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28089(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28090(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28091(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28092(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28093(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28094(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28095(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28096(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28097(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28098(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28099(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28100(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28101(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28102(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28103(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28104(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28105(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28106(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28107(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28108(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28109(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28110(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28111(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28112(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28113(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28114(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28115(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28116(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28117(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28118(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28119(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28120(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28121(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28122(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28123(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28124(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28125(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28126(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28127(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28128(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28129(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28130(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28131(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28132(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28133(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28134(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28135(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28136(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28137(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28138(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28139(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28140(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28141(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28142(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28143(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28144(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28145(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28146(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28147(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28148(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28149(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28150(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28151(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28152(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28153(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28154(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28155(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28156(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28157(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28158(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28159(Player player, int index, MapObject mapObject) {}


   /* 28160 - 28415 */

    // Bookshelf
    public static void mapObject28160(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28161(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28162(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28163(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28164(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28165(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28166(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28167(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28168(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28169(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28170(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28171(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28172(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28173(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28174(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28175(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28176(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28177(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28178(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28179(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28180(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28181(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28182(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28183(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28184(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28185(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28186(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28187(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28188(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28189(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28190(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28191(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28192(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28193(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28194(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28195(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28196(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28197(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28198(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28199(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28200(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28201(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28202(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28203(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28204(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28205(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28206(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28207(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28208(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28209(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28210(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28211(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28212(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28213(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28214(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28215(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28216(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28217(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28218(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28219(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28220(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28221(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28222(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28223(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28224(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28225(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28226(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28227(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28228(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28229(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28230(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28231(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28232(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28233(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28234(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28235(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28236(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28237(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28238(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28239(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28240(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28241(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28242(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28243(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28244(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28245(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28246(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28247(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28248(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28249(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28250(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28251(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28252(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28253(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28254(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28255(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28256(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28257(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28258(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28259(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28260(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28261(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28262(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28263(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28264(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28265(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28266(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28267(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28268(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28269(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28270(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28271(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28272(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28273(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28274(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28275(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28276(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28277(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28278(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28279(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28280(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28281(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28282(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28283(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28284(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28285(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28286(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28287(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28288(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28289(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28290(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28291(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28292(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28293(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28294(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28295(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28296(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28297(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28298(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28299(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28300(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28301(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28302(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28303(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28304(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28305(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28306(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28307(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28308(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28309(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28310(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28311(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28312(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28313(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28314(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28315(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28316(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28317(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28318(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28319(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28320(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28321(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28322(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28323(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28324(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28325(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28326(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28327(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28328(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28329(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28330(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28331(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28332(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28333(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28334(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28335(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28336(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28337(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28338(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28339(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28340(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28341(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28342(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28343(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28344(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28345(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28346(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28347(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28348(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28349(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28350(Player player, int index, MapObject mapObject) {}


   /* 28416 - 28671 */

    // Bank booth
    public static void mapObject28430(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject28431(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject28432(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject28433(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Altar
    public static void mapObject28455(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28456(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28457(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28458(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28459(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28460(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28461(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28462(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28463(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28464(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28465(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28466(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28467(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28468(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28469(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28470(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28471(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28479(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28480(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28481(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28482(Player player, int index, MapObject mapObject) {}

    // Volcanic sulphur
    public static void mapObject28496(Player player, int index, MapObject mapObject) {}

    // Volcanic sulphur
    public static void mapObject28497(Player player, int index, MapObject mapObject) {}

    // Volcanic sulphur
    public static void mapObject28498(Player player, int index, MapObject mapObject) {}

    // Metal ladder
    public static void mapObject28539(Player player, int index, MapObject mapObject) {}

    // Metal ladder
    public static void mapObject28540(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject28546(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject28547(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject28548(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Bank booth
    public static void mapObject28549(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Drawers
    public static void mapObject28561(Player player, int index, MapObject mapObject) {}

    // Lovakite furnace
    public static void mapObject28562(Player player, int index, MapObject mapObject) {}

    // Anvil
    public static void mapObject28563(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject28565(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject28566(Player player, int index, MapObject mapObject) {}

    // Hard rock
    public static void mapObject28579(Player player, int index, MapObject mapObject) {}

    // Hard rock
    public static void mapObject28580(Player player, int index, MapObject mapObject) {}

    // Pot of dynamite
    public static void mapObject28583(Player player, int index, MapObject mapObject) {}

    // Pot of dynamite
    public static void mapObject28584(Player player, int index, MapObject mapObject) {}

    // Ore sack
    public static void mapObject28592(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject28594(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject28595(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Rocks
    public static void mapObject28596(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject28597(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject28618(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject28619(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject28620(Player player, int index, MapObject mapObject) {}

    // Compromised support
    public static void mapObject28621(Player player, int index, MapObject mapObject) {}

    // Compromised support
    public static void mapObject28622(Player player, int index, MapObject mapObject) {}

    // Compromised floorboards
    public static void mapObject28623(Player player, int index, MapObject mapObject) {}

    // Compromised floorboards
    public static void mapObject28624(Player player, int index, MapObject mapObject) {}

    // Gas cylinder
    public static void mapObject28625(Player player, int index, MapObject mapObject) {}

    // Gas cylinder
    public static void mapObject28626(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28651(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject28652(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject28653(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject28654(Player player, int index, MapObject mapObject) {}

    // Opening
    public static void mapObject28656(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject28657(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject28659(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject28660(Player player, int index, MapObject mapObject) {}

    // Fire remains
    public static void mapObject28661(Player player, int index, MapObject mapObject) {}

    // Fire remains
    public static void mapObject28662(Player player, int index, MapObject mapObject) {}

    // Fire remains
    public static void mapObject28663(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject28664(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject28665(Player player, int index, MapObject mapObject) {}

    // Gnome crates
    public static void mapObject28666(Player player, int index, MapObject mapObject) {}

    // Gnome barrels
    public static void mapObject28667(Player player, int index, MapObject mapObject) {}

    // Candles
    public static void mapObject28668(Player player, int index, MapObject mapObject) {}

    // Gnome table
    public static void mapObject28669(Player player, int index, MapObject mapObject) {}

    // Gnome statue
    public static void mapObject28670(Player player, int index, MapObject mapObject) {}

    // Tracks
    public static void mapObject28671(Player player, int index, MapObject mapObject) {}


   /* 28672 - 28927 */

    // Tracks
    public static void mapObject28672(Player player, int index, MapObject mapObject) {}

    // Jungle Grass
    public static void mapObject28673(Player player, int index, MapObject mapObject) {}

    // <col=ffff00>Kruk</col>
    public static void mapObject28675(Player player, int index, MapObject mapObject) {}

    // Bamboo Ladder
    public static void mapObject28676(Player player, int index, MapObject mapObject) {}

    // Rowboat
    public static void mapObject28679(Player player, int index, MapObject mapObject) {}

    // Passage
    public static void mapObject28682(Player player, int index, MapObject mapObject) {}

    // Passage
    public static void mapObject28683(Player player, int index, MapObject mapObject) {}

    // Cavern entrance
    public static void mapObject28684(Player player, int index, MapObject mapObject) {}

    // Cavern exit
    public static void mapObject28685(Player player, int index, MapObject mapObject) {}

    // Cavern entrance
    public static void mapObject28686(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject28687(Player player, int index, MapObject mapObject) {}

    // Mushrooms
    public static void mapObject28722(Player player, int index, MapObject mapObject) {}

    // Gravestone
    public static void mapObject28723(Player player, int index, MapObject mapObject) {}

    // Monkeybars
    public static void mapObject28724(Player player, int index, MapObject mapObject) {}

    // Monkeybars
    public static void mapObject28727(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject28752(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject28753(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject28754(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject28755(Player player, int index, MapObject mapObject) {}

    // Wall support
    public static void mapObject28756(Player player, int index, MapObject mapObject) {}

    // Rocky ledge
    public static void mapObject28757(Player player, int index, MapObject mapObject) {}

    // Pressure pad
    public static void mapObject28758(Player player, int index, MapObject mapObject) {}

    // Pillar
    public static void mapObject28759(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject28763(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject28764(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject28765(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject28766(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject28772(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject28775(Player player, int index, MapObject mapObject) {}

    // Tripwire
    public static void mapObject28776(Player player, int index, MapObject mapObject) {}

    // Floor spikes
    public static void mapObject28777(Player player, int index, MapObject mapObject) {}

    // Dart trap
    public static void mapObject28778(Player player, int index, MapObject mapObject) {}

    // Spinning blades
    public static void mapObject28782(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject28783(Player player, int index, MapObject mapObject) {}

    // Locked chest
    public static void mapObject28785(Player player, int index, MapObject mapObject) {}

    // Rockfall
    public static void mapObject28786(Player player, int index, MapObject mapObject) {}

    // Web
    public static void mapObject28789(Player player, int index, MapObject mapObject) {}

    // Sliced web
    public static void mapObject28790(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject28792(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject28793(Player player, int index, MapObject mapObject) {}

    // Bronze Door
    public static void mapObject28794(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject28796(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject28797(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject28798(Player player, int index, MapObject mapObject) {}

    // Passage
    public static void mapObject28799(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject28800(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject28801(Player player, int index, MapObject mapObject) {}

    // Lectern
    public static void mapObject28802(Player player, int index, MapObject mapObject) {}

    // Bamboo Desk
    public static void mapObject28803(Player player, int index, MapObject mapObject) {}

    // Incubation chamber
    public static void mapObject28805(Player player, int index, MapObject mapObject) {}

    // Fence
    public static void mapObject28807(Player player, int index, MapObject mapObject) {}

    // Tracks
    public static void mapObject28808(Player player, int index, MapObject mapObject) {}

    // Tracks
    public static void mapObject28809(Player player, int index, MapObject mapObject) {}

    // Jungle Grass
    public static void mapObject28810(Player player, int index, MapObject mapObject) {}

    // <col=ffff00>Kruk</col>
    public static void mapObject28811(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject28813(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject28814(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject28816(Player player, int index, MapObject mapObject) {}

    // Burning brazier
    public static void mapObject28818(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject28819(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject28822(Player player, int index, MapObject mapObject) {}

    // Fruit Stall
    public static void mapObject28823(Player player, int index, MapObject mapObject) {}

    // Large boulder
    public static void mapObject28824(Player player, int index, MapObject mapObject) {}

    // Monkey trap
    public static void mapObject28827(Player player, int index, MapObject mapObject) {}

    // Large boulder
    public static void mapObject28830(Player player, int index, MapObject mapObject) {}

    // Large boulder
    public static void mapObject28831(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject28848(Player player, int index, MapObject mapObject) {}

    // Boss portal
    public static void mapObject28849(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject28851(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject28852(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject28855(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject28856(Player player, int index, MapObject mapObject) {}

    // Rope ladder
    public static void mapObject28857(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1575 && mapObject.getY() == 3483) {
            player.getMovement().ladderUpTeleport(new Tile(1574, 3483, 1));
        } else if (mapObject.getX() == 1575 && mapObject.getY() == 3493) {
            player.getMovement().ladderUpTeleport(new Tile(1574, 3493, 1));
        } else if (mapObject.getX() == 1566 && mapObject.getY() == 3483) {
            player.getMovement().ladderUpTeleport(new Tile(1567, 3483, 1));
        } else if (mapObject.getX() == 1566 && mapObject.getY() == 3493) {
            player.getMovement().ladderUpTeleport(new Tile(1567, 3493, 1));
        }
    }

    // Rope ladder
    public static void mapObject28858(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1575 && mapObject.getY() == 3483) {
            player.getMovement().ladderDownTeleport(new Tile(1576, 3483, 0));
        } else if (mapObject.getX() == 1575 && mapObject.getY() == 3493) {
            player.getMovement().ladderDownTeleport(new Tile(1576, 3493, 0));
        } else if (mapObject.getX() == 1566 && mapObject.getY() == 3483) {
            player.getMovement().ladderDownTeleport(new Tile(1565, 3483, 0));
        } else if (mapObject.getX() == 1566 && mapObject.getY() == 3493) {
            player.getMovement().ladderDownTeleport(new Tile(1565, 3493, 0));
        }
    }

    // Redwood
    public static void mapObject28859(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject28861(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Funeral Pyre
    public static void mapObject28866(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject28890(Player player, int index, MapObject mapObject) {
        if (player.getY() >= 10040) {
            player.getMovement().teleport(1640, 10037);
        } else {
            player.getMovement().teleport(1640, 10040);
        }
    }

    // Crack
    public static void mapObject28892(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1706 && mapObject.getY() == 10077) {
            player.getMovement().teleport(1716, 10056);
        } else if (mapObject.getX() == 1716 && mapObject.getY() == 10057) {
            player.getMovement().teleport(1706, 10078);
        } else if (mapObject.getX() == 1648 && mapObject.getY() == 10008) {
            player.getMovement().teleport(1646, 10000);
        } else if (mapObject.getX() == 1646 && mapObject.getY() == 10001) {
            player.getMovement().teleport(1648, 10009);
        }
    }

    // Stone
    public static void mapObject28893(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1613 && mapObject.getY() == 10068) {
            player.getMovement().teleport(1610, 10062);
        } else if (mapObject.getX() == 1610 && mapObject.getY() == 10063) {
            player.getMovement().teleport(1613, 10069);
        }
    }

    // Rope ladder
    public static void mapObject28894(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject28895(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject28896(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject28897(Player player, int index, MapObject mapObject) {}

    // Rope
    public static void mapObject28898(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject28900(Player player, int index, MapObject mapObject) {
        player.openDialogue("catacombsofkourend", 0);
    }

    // Hole
    public static void mapObject28912(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject28915(Player player, int index, MapObject mapObject) {}

    // Grass
    public static void mapObject28918(Player player, int index, MapObject mapObject) {}

    // Grass
    public static void mapObject28919(Player player, int index, MapObject mapObject) {}

    // Soil
    public static void mapObject28920(Player player, int index, MapObject mapObject) {}

    // Soil
    public static void mapObject28921(Player player, int index, MapObject mapObject) {}

    // Inanimate Altar
    public static void mapObject28922(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject28925(Player player, int index, MapObject mapObject) {}


   /* 28928 - 29183 */

    // Juna
    public static void mapObject28928(Player player, int index, MapObject mapObject) {}

    // Juna
    public static void mapObject28929(Player player, int index, MapObject mapObject) {}

    // Broken cart
    public static void mapObject28930(Player player, int index, MapObject mapObject) {}

    // Broken cart
    public static void mapObject28931(Player player, int index, MapObject mapObject) {}

    // STASH (medium)
    public static void mapObject28933(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (hard)
    public static void mapObject28934(Player player, int index, MapObject mapObject) {}

    // STASH (hard)
    public static void mapObject28935(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (hard)
    public static void mapObject28936(Player player, int index, MapObject mapObject) {}

    // STASH (hard)
    public static void mapObject28937(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (hard)
    public static void mapObject28938(Player player, int index, MapObject mapObject) {}

    // STASH (hard)
    public static void mapObject28939(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (hard)
    public static void mapObject28940(Player player, int index, MapObject mapObject) {}

    // STASH (hard)
    public static void mapObject28941(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (elite)
    public static void mapObject28942(Player player, int index, MapObject mapObject) {}

    // STASH (elite)
    public static void mapObject28943(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (elite)
    public static void mapObject28944(Player player, int index, MapObject mapObject) {}

    // STASH (elite)
    public static void mapObject28945(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (elite)
    public static void mapObject28946(Player player, int index, MapObject mapObject) {}

    // STASH (elite)
    public static void mapObject28947(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (elite)
    public static void mapObject28948(Player player, int index, MapObject mapObject) {}

    // STASH (elite)
    public static void mapObject28949(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (master)
    public static void mapObject28950(Player player, int index, MapObject mapObject) {}

    // STASH (master)
    public static void mapObject28951(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject28952(Player player, int index, MapObject mapObject) {}

    // STASH (master)
    public static void mapObject28953(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (master)
    public static void mapObject28954(Player player, int index, MapObject mapObject) {}

    // STASH (master)
    public static void mapObject28955(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (master)
    public static void mapObject28956(Player player, int index, MapObject mapObject) {}

    // STASH (master)
    public static void mapObject28957(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (easy)
    public static void mapObject28958(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (easy)
    public static void mapObject28959(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (easy)
    public static void mapObject28960(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (easy)
    public static void mapObject28961(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (easy)
    public static void mapObject28962(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (easy)
    public static void mapObject28963(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (easy)
    public static void mapObject28964(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (easy)
    public static void mapObject28965(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (easy)
    public static void mapObject28966(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (easy)
    public static void mapObject28967(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (easy)
    public static void mapObject28968(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (easy)
    public static void mapObject28969(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (easy)
    public static void mapObject28970(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (easy)
    public static void mapObject28971(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (easy)
    public static void mapObject28972(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (easy)
    public static void mapObject28973(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (easy)
    public static void mapObject28974(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (easy)
    public static void mapObject28975(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (easy)
    public static void mapObject28976(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (easy)
    public static void mapObject28977(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (easy)
    public static void mapObject28978(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (easy)
    public static void mapObject28979(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (easy)
    public static void mapObject28980(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (easy)
    public static void mapObject28981(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (easy)
    public static void mapObject28982(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (easy)
    public static void mapObject28983(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (easy)
    public static void mapObject28984(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (easy)
    public static void mapObject28985(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (easy)
    public static void mapObject28986(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (medium)
    public static void mapObject28987(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (medium)
    public static void mapObject28988(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (medium)
    public static void mapObject28989(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (medium)
    public static void mapObject28990(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (medium)
    public static void mapObject28991(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (medium)
    public static void mapObject28992(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (medium)
    public static void mapObject28993(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (medium)
    public static void mapObject28994(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (medium)
    public static void mapObject28995(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (medium)
    public static void mapObject28996(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (medium)
    public static void mapObject28997(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (medium)
    public static void mapObject28998(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (medium)
    public static void mapObject28999(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (medium)
    public static void mapObject29000(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (medium)
    public static void mapObject29001(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (medium)
    public static void mapObject29002(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (medium)
    public static void mapObject29003(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (medium)
    public static void mapObject29004(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (medium)
    public static void mapObject29005(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (medium)
    public static void mapObject29006(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (medium)
    public static void mapObject29007(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (medium)
    public static void mapObject29008(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (hard)
    public static void mapObject29009(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (hard)
    public static void mapObject29010(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (hard)
    public static void mapObject29011(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (hard)
    public static void mapObject29012(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (hard)
    public static void mapObject29013(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (hard)
    public static void mapObject29014(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (hard)
    public static void mapObject29015(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (hard)
    public static void mapObject29016(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (hard)
    public static void mapObject29017(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (hard)
    public static void mapObject29018(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (hard)
    public static void mapObject29019(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (hard)
    public static void mapObject29020(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (hard)
    public static void mapObject29021(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (hard)
    public static void mapObject29022(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (hard)
    public static void mapObject29023(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (elite)
    public static void mapObject29024(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (elite)
    public static void mapObject29025(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (elite)
    public static void mapObject29026(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (elite)
    public static void mapObject29027(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (elite)
    public static void mapObject29028(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (elite)
    public static void mapObject29029(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (elite)
    public static void mapObject29030(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (elite)
    public static void mapObject29031(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (elite)
    public static void mapObject29032(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (elite)
    public static void mapObject29033(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (elite)
    public static void mapObject29034(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (elite)
    public static void mapObject29035(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (elite)
    public static void mapObject29036(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (elite)
    public static void mapObject29037(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (elite)
    public static void mapObject29038(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (elite)
    public static void mapObject29039(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject29040(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject29041(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject29042(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject29043(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (master)
    public static void mapObject29044(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject29045(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject29046(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (master)
    public static void mapObject29047(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (master)
    public static void mapObject29048(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject29049(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (master)
    public static void mapObject29050(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (master)
    public static void mapObject29051(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject29052(Player player, int index, MapObject mapObject) {}

    // Inconspicuous rocks (master)
    public static void mapObject29053(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject29054(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (master)
    public static void mapObject29055(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject29056(Player player, int index, MapObject mapObject) {}

    // Inconspicuous crate (master)
    public static void mapObject29057(Player player, int index, MapObject mapObject) {}

    // Inconspicuous hole (master)
    public static void mapObject29058(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (master)
    public static void mapObject29059(Player player, int index, MapObject mapObject) {}

    // Inconspicuous bush (master)
    public static void mapObject29060(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject29061(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject29062(Player player, int index, MapObject mapObject) {}

    // Reward chest
    public static void mapObject29063(Player player, int index, MapObject mapObject) {}

    // Scoreboard
    public static void mapObject29064(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject29066(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject29067(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject29068(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject29069(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject29070(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject29071(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject29072(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject29073(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject29074(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject29075(Player player, int index, MapObject mapObject) {}

    // Drawers
    public static void mapObject29076(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject29077(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject29078(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject29079(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject29080(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject29081(Player player, int index, MapObject mapObject) {}

    // Rowboat
    public static void mapObject29082(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject29083(Player player, int index, MapObject mapObject) {}

    // Coffer
    public static void mapObject29087(Player player, int index, MapObject mapObject) {
        if (player.getRights() == 2 || player.isUsergroup(Player.GROUP_ADVERTISER)) {
            player.openDialogue("clanwars", 6);
        } else {
            ClanWarsTournament.viewDonatedItems(player);
        }
    }

    // Shrine
    public static void mapObject29088(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject29089(Player player, int index, MapObject mapObject) {}

    // Bank Deposit Chest
    public static void mapObject29090(Player player, int index, MapObject mapObject) {}

    // Vending shrine
    public static void mapObject29091(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject29092(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject29102(Player player, int index, MapObject mapObject) {}

    // Bank Deposit Box
    public static void mapObject29103(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Bank Deposit Box
    public static void mapObject29104(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Bank deposit box
    public static void mapObject29105(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Bank deposit box
    public static void mapObject29106(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Bank Deposit Pot
    public static void mapObject29108(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Pot
    public static void mapObject29109(Player player, int index, MapObject mapObject) {}

    // Tip jar space
    public static void mapObject29119(Player player, int index, MapObject mapObject) {}

    // Natural teleport space
    public static void mapObject29120(Player player, int index, MapObject mapObject) {}

    // Topiary space
    public static void mapObject29121(Player player, int index, MapObject mapObject) {}

    // Pool space
    public static void mapObject29122(Player player, int index, MapObject mapObject) {}

    // Theme space
    public static void mapObject29130(Player player, int index, MapObject mapObject) {}

    // Fence space
    public static void mapObject29131(Player player, int index, MapObject mapObject) {}

    // Fence space
    public static void mapObject29132(Player player, int index, MapObject mapObject) {}

    // Fence space
    public static void mapObject29133(Player player, int index, MapObject mapObject) {}

    // Seating space
    public static void mapObject29136(Player player, int index, MapObject mapObject) {}

    // Seating space
    public static void mapObject29137(Player player, int index, MapObject mapObject) {}

    // Seating space
    public static void mapObject29138(Player player, int index, MapObject mapObject) {}

    // Seating space
    public static void mapObject29139(Player player, int index, MapObject mapObject) {}

    // Altar space
    public static void mapObject29140(Player player, int index, MapObject mapObject) {}

    // Adventure log space
    public static void mapObject29141(Player player, int index, MapObject mapObject) {}

    // Jewellery box space
    public static void mapObject29142(Player player, int index, MapObject mapObject) {}

    // Boss lair space
    public static void mapObject29143(Player player, int index, MapObject mapObject) {}

    // Display space
    public static void mapObject29144(Player player, int index, MapObject mapObject) {}

    // Quest list space
    public static void mapObject29145(Player player, int index, MapObject mapObject) {}

    // Tip jar
    public static void mapObject29146(Player player, int index, MapObject mapObject) {}

    // Ancient Altar
    public static void mapObject29147(Player player, int index, MapObject mapObject) {
        player.setAnimation(Prayer.PRAY_ANIMATION);
        if (player.getMagic().getSpellBook() == Magic.NORMAL_MAGIC) {
            player.getMagic().setSpellBook(Magic.ANCIENT_MAGIC);
            player.getGameEncoder().sendMessage("Your spellbook is now Ancients.");
        } else {
            player.getMagic().setSpellBook(Magic.NORMAL_MAGIC);
            player.getGameEncoder().sendMessage("Your spellbook is now normal.");
        }
    }

    // Lunar Altar
    public static void mapObject29148(Player player, int index, MapObject mapObject) {
        player.setAnimation(Prayer.PRAY_ANIMATION);
        if (player.getMagic().getSpellBook() == Magic.NORMAL_MAGIC) {
            player.getMagic().setSpellBook(Magic.LUNAR_MAGIC);
            player.getGameEncoder().sendMessage("Your spellbook is now Lunars.");
        } else {
            player.getMagic().setSpellBook(Magic.NORMAL_MAGIC);
            player.getGameEncoder().sendMessage("Your spellbook is now normal.");
        }
    }

    // Dark Altar
    public static void mapObject29149(Player player, int index, MapObject mapObject) {}

    // Altar of the Occult
    public static void mapObject29150(Player player, int index, MapObject mapObject) {
        if (player.getController().inPvPWorldCombat()) {
            player.getGameEncoder().sendMessage("You can't use this here.");
            return;
        }
        if (index == 0) {
            player.openDialogue("spellbooks", 0);
        } else if (index == 1) {
            if (player.getMagic().getSpellBook() == Magic.NORMAL_MAGIC) {
                player.getMagic().setSpellBook(Magic.ANCIENT_MAGIC);
            } else if (player.getMagic().getSpellBook() == Magic.ANCIENT_MAGIC
                    || player.getMagic().getSpellBook() == Magic.LUNAR_MAGIC) {
                player.getMagic().setSpellBook(Magic.NORMAL_MAGIC);
            }
        } else if (index == 2) {
            if (player.getMagic().getSpellBook() == Magic.NORMAL_MAGIC
                    || player.getMagic().getSpellBook() == Magic.ANCIENT_MAGIC) {
                player.getMagic().setSpellBook(Magic.LUNAR_MAGIC);
            } else if (player.getMagic().getSpellBook() == Magic.LUNAR_MAGIC) {
                player.getMagic().setSpellBook(Magic.ANCIENT_MAGIC);
            }
        }
    }

    // Mahogany Adventure Log
    public static void mapObject29151(Player player, int index, MapObject mapObject) {}

    // Gilded Adventure Log
    public static void mapObject29152(Player player, int index, MapObject mapObject) {}

    // Marble adventure log
    public static void mapObject29153(Player player, int index, MapObject mapObject) {}

    // Basic Jewellery Box
    public static void mapObject29154(Player player, int index, MapObject mapObject) {}

    // Fancy Jewellery Box
    public static void mapObject29155(Player player, int index, MapObject mapObject) {}

    // Ornate Jewellery Box
    public static void mapObject29156(Player player, int index, MapObject mapObject) {
        player.getWidgetManager().sendInteractiveOverlay(WidgetID.JEWELRY_BOX);
        player.getGameEncoder().sendScript(1685, 15, "Ornate Jewellery Box", 3);
        player.getGameEncoder().sendWidgetSettings(WidgetID.JEWELRY_BOX, 0, 0, 24, 1);
    }

    // Boss lair display
    public static void mapObject29157(Player player, int index, MapObject mapObject) {}

    // Kraken display
    public static void mapObject29158(Player player, int index, MapObject mapObject) {}

    // Zulrah display
    public static void mapObject29159(Player player, int index, MapObject mapObject) {}

    // Kalphite Queen display
    public static void mapObject29160(Player player, int index, MapObject mapObject) {}

    // Cerberus display
    public static void mapObject29161(Player player, int index, MapObject mapObject) {}

    // Abyssal Sire display
    public static void mapObject29162(Player player, int index, MapObject mapObject) {}

    // Skotizo display
    public static void mapObject29163(Player player, int index, MapObject mapObject) {}

    // Mounted Emblem
    public static void mapObject29164(Player player, int index, MapObject mapObject) {}

    // Mounted Coins
    public static void mapObject29165(Player player, int index, MapObject mapObject) {}

    // Cape hanger
    public static void mapObject29166(Player player, int index, MapObject mapObject) {}

    // Mounted Achievement Diary Cape
    public static void mapObject29167(Player player, int index, MapObject mapObject) {}

    // Mounted Achievement Diary Cape
    public static void mapObject29168(Player player, int index, MapObject mapObject) {}

    // Mounted Fire Cape
    public static void mapObject29169(Player player, int index, MapObject mapObject) {}

    // Mounted Max Cape
    public static void mapObject29170(Player player, int index, MapObject mapObject) {}

    // Mounted Max Cape
    public static void mapObject29171(Player player, int index, MapObject mapObject) {}

    // Mounted Max Cape
    public static void mapObject29172(Player player, int index, MapObject mapObject) {}

    // Mounted Max Cape
    public static void mapObject29173(Player player, int index, MapObject mapObject) {}

    // Mounted Max Cape
    public static void mapObject29174(Player player, int index, MapObject mapObject) {}

    // Mounted Max Cape
    public static void mapObject29175(Player player, int index, MapObject mapObject) {}

    // Mounted Music Cape
    public static void mapObject29176(Player player, int index, MapObject mapObject) {}

    // Mounted Music Cape
    public static void mapObject29177(Player player, int index, MapObject mapObject) {}

    // Mounted Quest Cape
    public static void mapObject29178(Player player, int index, MapObject mapObject) {}

    // Mounted Quest Cape
    public static void mapObject29179(Player player, int index, MapObject mapObject) {}

    // Mounted Agility Cape
    public static void mapObject29180(Player player, int index, MapObject mapObject) {}

    // Mounted Agility Cape (t)
    public static void mapObject29181(Player player, int index, MapObject mapObject) {}

    // Mounted Attack Cape
    public static void mapObject29182(Player player, int index, MapObject mapObject) {}

    // Mounted Attack Cape (t)
    public static void mapObject29183(Player player, int index, MapObject mapObject) {}


   /* 29184 - 29439 */

    // Mounted Construction Cape
    public static void mapObject29184(Player player, int index, MapObject mapObject) {}

    // Mounted Construction Cape (t)
    public static void mapObject29185(Player player, int index, MapObject mapObject) {}

    // Mounted Cooking Cape
    public static void mapObject29186(Player player, int index, MapObject mapObject) {}

    // Mounted Cooking Cape (t)
    public static void mapObject29187(Player player, int index, MapObject mapObject) {}

    // Mounted Crafting Cape
    public static void mapObject29188(Player player, int index, MapObject mapObject) {}

    // Mounted Crafting Cape (t)
    public static void mapObject29189(Player player, int index, MapObject mapObject) {}

    // Mounted Defence Cape
    public static void mapObject29190(Player player, int index, MapObject mapObject) {}

    // Mounted Defence Cape (t)
    public static void mapObject29191(Player player, int index, MapObject mapObject) {}

    // Mounted Farming Cape
    public static void mapObject29192(Player player, int index, MapObject mapObject) {}

    // Mounted Farming Cape (t)
    public static void mapObject29193(Player player, int index, MapObject mapObject) {}

    // Mounted Firemaking Cape
    public static void mapObject29194(Player player, int index, MapObject mapObject) {}

    // Mounted Firemaking Cape (t)
    public static void mapObject29195(Player player, int index, MapObject mapObject) {}

    // Mounted Fishing Cape
    public static void mapObject29196(Player player, int index, MapObject mapObject) {}

    // Mounted Fishing Cape (t)
    public static void mapObject29197(Player player, int index, MapObject mapObject) {}

    // Mounted Fletching Cape
    public static void mapObject29198(Player player, int index, MapObject mapObject) {}

    // Mounted Fletching Cape (t)
    public static void mapObject29199(Player player, int index, MapObject mapObject) {}

    // Mounted Herblore Cape
    public static void mapObject29200(Player player, int index, MapObject mapObject) {}

    // Mounted Herblore Cape (t)
    public static void mapObject29201(Player player, int index, MapObject mapObject) {}

    // Mounted Hitpoints Cape
    public static void mapObject29202(Player player, int index, MapObject mapObject) {}

    // Mounted Hitpoints Cape (t)
    public static void mapObject29203(Player player, int index, MapObject mapObject) {}

    // Mounted Hunting Cape
    public static void mapObject29204(Player player, int index, MapObject mapObject) {}

    // Mounted Hunting Cape (t)
    public static void mapObject29205(Player player, int index, MapObject mapObject) {}

    // Mounted Magic Cape
    public static void mapObject29206(Player player, int index, MapObject mapObject) {}

    // Mounted Magic Cape (t)
    public static void mapObject29207(Player player, int index, MapObject mapObject) {}

    // Mounted Mining Cape
    public static void mapObject29208(Player player, int index, MapObject mapObject) {}

    // Mounted Mining Cape (t)
    public static void mapObject29209(Player player, int index, MapObject mapObject) {}

    // Mounted Prayer Cape
    public static void mapObject29210(Player player, int index, MapObject mapObject) {}

    // Mounted Prayer Cape (t)
    public static void mapObject29211(Player player, int index, MapObject mapObject) {}

    // Mounted Ranged Cape
    public static void mapObject29212(Player player, int index, MapObject mapObject) {}

    // Mounted Ranged Cape (t)
    public static void mapObject29213(Player player, int index, MapObject mapObject) {}

    // Mounted Runecrafting Cape
    public static void mapObject29214(Player player, int index, MapObject mapObject) {}

    // Mounted Runecrafting Cape (t)
    public static void mapObject29215(Player player, int index, MapObject mapObject) {}

    // Mounted Slayer Cape
    public static void mapObject29216(Player player, int index, MapObject mapObject) {}

    // Mounted Slayer Cape (t)
    public static void mapObject29217(Player player, int index, MapObject mapObject) {}

    // Mounted Smithing Cape
    public static void mapObject29218(Player player, int index, MapObject mapObject) {}

    // Mounted Smithing Cape (t)
    public static void mapObject29219(Player player, int index, MapObject mapObject) {}

    // Mounted Strength Cape
    public static void mapObject29220(Player player, int index, MapObject mapObject) {}

    // Mounted Strength Cape (t)
    public static void mapObject29221(Player player, int index, MapObject mapObject) {}

    // Mounted Thieving Cape
    public static void mapObject29222(Player player, int index, MapObject mapObject) {}

    // Mounted Thieving Cape (t)
    public static void mapObject29223(Player player, int index, MapObject mapObject) {}

    // Mounted Woodcutting Cape
    public static void mapObject29224(Player player, int index, MapObject mapObject) {}

    // Mounted Woodcutting Cape (t)
    public static void mapObject29225(Player player, int index, MapObject mapObject) {}

    // Quest List
    public static void mapObject29226(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject29227(Player player, int index, MapObject mapObject) {}

    // Fairy Ring
    public static void mapObject29228(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Spiritual Fairy Tree
    public static void mapObject29229(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("spirittree", 0);
        } else if (index == 1) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Topiary bush
    public static void mapObject29230(Player player, int index, MapObject mapObject) {}

    // Kraken Topiary
    public static void mapObject29231(Player player, int index, MapObject mapObject) {}

    // Zulrah Topiary
    public static void mapObject29232(Player player, int index, MapObject mapObject) {}

    // Kalphite Queen Topiary
    public static void mapObject29233(Player player, int index, MapObject mapObject) {}

    // Cerberus Topiary
    public static void mapObject29234(Player player, int index, MapObject mapObject) {}

    // Abyssal Sire Topiary
    public static void mapObject29235(Player player, int index, MapObject mapObject) {}

    // Skotizo Topiary
    public static void mapObject29236(Player player, int index, MapObject mapObject) {}

    // Pool of Restoration
    public static void mapObject29237(Player player, int index, MapObject mapObject) {}

    // Pool of Revitalisation
    public static void mapObject29238(Player player, int index, MapObject mapObject) {}

    // Pool of Rejuvenation
    public static void mapObject29239(Player player, int index, MapObject mapObject) {}

    // Fancy rejuvenation pool
    public static void mapObject29240(Player player, int index, MapObject mapObject) {}

    // Ornate rejuvenation pool
    public static void mapObject29241(Player player, int index, MapObject mapObject) {
        if (player.getController().inPvPWorldCombat()) {
            player.getGameEncoder().sendMessage("You can't use this here.");
            return;
        }
        player.setGraphic(436);
        player.getGameEncoder().sendMessage("The pool restores you.");
        player.rejuvenate();
    }

    // Zen theme
    public static void mapObject29247(Player player, int index, MapObject mapObject) {}

    // Otherworldly theme
    public static void mapObject29253(Player player, int index, MapObject mapObject) {}

    // Volcanic theme
    public static void mapObject29261(Player player, int index, MapObject mapObject) {}

    // Redwood fence
    public static void mapObject29262(Player player, int index, MapObject mapObject) {}

    // Redwood fence post
    public static void mapObject29263(Player player, int index, MapObject mapObject) {}

    // Redwood fence post
    public static void mapObject29264(Player player, int index, MapObject mapObject) {}

    // Obsidian fence
    public static void mapObject29267(Player player, int index, MapObject mapObject) {}

    // Obsidian fence post
    public static void mapObject29268(Player player, int index, MapObject mapObject) {}

    // Obsidian fence post
    public static void mapObject29269(Player player, int index, MapObject mapObject) {}

    // Teak bench
    public static void mapObject29270(Player player, int index, MapObject mapObject) {}

    // Teak bench
    public static void mapObject29271(Player player, int index, MapObject mapObject) {}

    // Gnome bench
    public static void mapObject29272(Player player, int index, MapObject mapObject) {}

    // Gnome bench
    public static void mapObject29273(Player player, int index, MapObject mapObject) {}

    // Marble bench
    public static void mapObject29274(Player player, int index, MapObject mapObject) {}

    // Marble bench
    public static void mapObject29275(Player player, int index, MapObject mapObject) {}

    // Obsidian bench
    public static void mapObject29276(Player player, int index, MapObject mapObject) {}

    // Obsidian bench
    public static void mapObject29277(Player player, int index, MapObject mapObject) {}

    // Bruma roots
    public static void mapObject29311(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject29312(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject29313(Player player, int index, MapObject mapObject) {}

    // Burning brazier
    public static void mapObject29314(Player player, int index, MapObject mapObject) {}

    // Sprouting Roots
    public static void mapObject29315(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject29316(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject29317(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject29318(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject29319(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject29320(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject29321(Player player, int index, MapObject mapObject) {}

    // Doors of Dinh
    public static void mapObject29322(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject29326(Player player, int index, MapObject mapObject) {}

    // Bank Deposit Box
    public static void mapObject29327(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Coffer
    public static void mapObject29328(Player player, int index, MapObject mapObject) {}

    // Coffer
    public static void mapObject29329(Player player, int index, MapObject mapObject) {}

    // Coffer
    public static void mapObject29330(Player player, int index, MapObject mapObject) {}

    // Cart tunnel
    public static void mapObject29332(Player player, int index, MapObject mapObject) {}

    // Cart tunnel
    public static void mapObject29333(Player player, int index, MapObject mapObject) {}


   /* 29440 - 29695 */

    // spiritual fairy tree
    public static void mapObject29440(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29441(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29442(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29443(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29444(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29445(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29446(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29447(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29448(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29449(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29450(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29451(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29452(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29453(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29454(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29455(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29456(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29457(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29458(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29459(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29460(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29461(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29462(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29463(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29464(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29465(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29466(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29467(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29468(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29469(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29470(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29471(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29472(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29473(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29474(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29475(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29476(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29477(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29478(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29479(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29480(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29481(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29482(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29483(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29484(Player player, int index, MapObject mapObject) {}

    // spiritual fairy tree
    public static void mapObject29485(Player player, int index, MapObject mapObject) {}

    // gate
    public static void mapObject29486(Player player, int index, MapObject mapObject) {}

    // gate
    public static void mapObject29487(Player player, int index, MapObject mapObject) {}

    // gate
    public static void mapObject29488(Player player, int index, MapObject mapObject) {}

    // gate
    public static void mapObject29489(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject29491(Player player, int index, MapObject mapObject) {}

    // fairy ring
    public static void mapObject29495(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29496(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29497(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29498(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29499(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29500(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29501(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29502(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29503(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29504(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29505(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29506(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29507(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29508(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29509(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29510(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29511(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29512(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29513(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29514(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29515(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29516(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29517(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29518(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29519(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29520(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29521(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29522(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29523(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29524(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29525(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29526(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29527(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29528(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29529(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29530(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29531(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29532(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29533(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29534(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29535(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29536(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29537(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29538(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29539(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29540(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29541(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29542(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29543(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29544(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29545(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29546(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29547(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29548(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29549(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29550(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29551(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29552(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29553(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29554(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29555(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29556(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29557(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29558(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29559(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29560(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29561(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29562(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29563(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29564(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29565(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29566(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29567(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29568(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29569(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29570(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29571(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29572(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29573(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29574(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29575(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29576(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29577(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29578(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29579(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29580(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29581(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29582(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29583(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29584(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29585(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29586(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29587(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29588(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29589(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29590(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29591(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29592(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29593(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29594(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29595(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29596(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29597(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29598(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29599(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29600(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29601(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29602(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29603(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29604(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29605(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29606(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29607(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29608(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29609(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29610(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29611(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29612(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29613(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29614(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29615(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29616(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29617(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29618(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29619(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29620(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29621(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29622(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29623(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // fairy ring
    public static void mapObject29624(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // mounted max cape
    public static void mapObject29625(Player player, int index, MapObject mapObject) {}

    // crack
    public static void mapObject29626(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(3055, 5585);
    }

    // crack
    public static void mapObject29627(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(3052, 5587);
    }

    // runecrafting altar
    public static void mapObject29631(Player player, int index, MapObject mapObject) {
        Runecrafting.ouraniaCraft(player);
    }

    // ladder
    public static void mapObject29635(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2452 && mapObject.getY() == 3231) {
            player.getMovement().ladderDownTeleport(new Tile(3015, 5629));
        }
    }

    // ladder
    public static void mapObject29636(Player player, int index, MapObject mapObject) {}

    // note
    public static void mapObject29648(Player player, int index, MapObject mapObject) {}

    // a barrel of rainwater
    public static void mapObject29649(Player player, int index, MapObject mapObject) {}

    // painting
    public static void mapObject29650(Player player, int index, MapObject mapObject) {}

    // damaged wall
    public static void mapObject29657(Player player, int index, MapObject mapObject) {}

    // piano
    public static void mapObject29658(Player player, int index, MapObject mapObject) {}

    // fireplace
    public static void mapObject29659(Player player, int index, MapObject mapObject) {}

    // furnace
    public static void mapObject29662(Player player, int index, MapObject mapObject) {}

    // clan wars portal
    public static void mapObject29667(Player player, int index, MapObject mapObject) {}

    // redwood
    public static void mapObject29668(Player player, int index, MapObject mapObject) {}

    // redwood
    public static void mapObject29670(Player player, int index, MapObject mapObject) {}

    // carved redwood
    public static void mapObject29680(Player player, int index, MapObject mapObject) {}

    // carved redwood
    public static void mapObject29681(Player player, int index, MapObject mapObject) {}

    // carved redwood
    public static void mapObject29682(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject29683(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject29684(Player player, int index, MapObject mapObject) {}


   /* 29696 - 29951 */


   /* 29952 - 30207 */

    // Steps
    public static void mapObject29993(Player player, int index, MapObject mapObject) {
        if (player.getY() >= 9991) {
            player.getMovement().teleport(2703, 9987);
        } else {
            player.getMovement().teleport(2703, 9992);
        }
    }

    // Chambers of Xeric
    public static void mapObject29777(Player player, int index, MapObject mapObject) {
        player.openDialogue("raids", 0);
    }

    // Bank chest
    public static void mapObject30087(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Tunnel
    public static void mapObject30174(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 72) {
            player.getGameEncoder().sendMessage("You need an Agility level of 72 to use this.");
            return;
        }
        if (mapObject.getX() == 2430 && mapObject.getY() == 9806) {
            player.getMovement().ladderUpTeleport(new Tile(2435, 9806, 0));
        } else if (mapObject.getX() == 2434 && mapObject.getY() == 9806) {
            player.getMovement().ladderUpTeleport(new Tile(2429, 9806, 0));
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Tunnel
    public static void mapObject30175(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 72) {
            player.getGameEncoder().sendMessage("You need an Agility level of 72 to use this.");
            return;
        }
        if (mapObject.getX() == 2430 && mapObject.getY() == 9807) {
            player.getMovement().ladderUpTeleport(new Tile(2435, 9807, 0));
        } else if (mapObject.getX() == 2434 && mapObject.getY() == 9807) {
            player.getMovement().ladderUpTeleport(new Tile(2429, 9807, 0));
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Steps
    public static void mapObject30189(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2881 && mapObject.getY() == 9825) {
            // Taverley Dungeon
            player.getMovement().ladderUpTeleport(new Tile(2880, 9825, 1));
        } else if (mapObject.getX() == 2904 && mapObject.getY() == 9813) {
            // Taverley Dungeon
            player.getMovement().ladderUpTeleport(new Tile(2903, 9813, 1));
        }
    }

    // Steps
    public static void mapObject30190(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2881 && mapObject.getY() == 9825) {
            // Taverley Dungeon
            player.getMovement().ladderDownTeleport(new Tile(2883, 9825, 0));
        } else if (mapObject.getX() == 2904 && mapObject.getY() == 9813) {
            // Taverley Dungeon
            player.getMovement().ladderDownTeleport(new Tile(2906, 9813, 0));
        }
    }

    // Ladder
    public static void mapObject30191(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(3412, 9932, 3));
    }

    // Ladder
    public static void mapObject30192(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(3417, 3536, 0));
    }

    // Crevice
    public static void mapObject30198(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2696 && mapObject.getY() == 9436) {
            // Brimhaven Dungeon
            player.getMovement().ladderDownTeleport(new Tile(2684, 9436, 0));
        } else if (mapObject.getX() == 2685 && mapObject.getY() == 9436) {
            // Brimhaven Dungeon
            player.getMovement().ladderDownTeleport(new Tile(2697, 9436, 0));
        }
    }


   /* 30208 - 30463 */

    // rope
    public static void mapObject30234(Player player, int index, MapObject mapObject) {}

    // chasm
    public static void mapObject30236(Player player, int index, MapObject mapObject) {}

    // Lift
    public static void mapObject30258(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1437 && mapObject.getY() == 10094) {
            player.getMovement().ladderUpTeleport(new Tile(1437, 10093, 2));
        } else if (mapObject.getX() == 1452 && mapObject.getY() == 10068) {
            player.getMovement().ladderUpTeleport(new Tile(1451, 10069, 2));
        } else if (mapObject.getX() == 1458 && mapObject.getY() == 10095) {
            player.getMovement().ladderUpTeleport(new Tile(1457, 10095, 1));
        }
    }

    // Lift
    public static void mapObject30259(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1437 && mapObject.getY() == 10094) {
            player.getMovement().ladderUpTeleport(new Tile(1437, 10093, 3));
        } else if (mapObject.getX() == 1452 && mapObject.getY() == 10068) {
            player.getMovement().ladderUpTeleport(new Tile(1451, 10069, 3));
        } else if (mapObject.getX() == 1458 && mapObject.getY() == 10095) {
            player.getMovement().ladderUpTeleport(new Tile(1457, 10095, 2));
        }
    }

    // hot vent door
    public static void mapObject30266(Player player, int index, MapObject mapObject) {}

    // bank chest
    public static void mapObject30267(Player player, int index, MapObject mapObject) {}

    // bank deposit box
    public static void mapObject30268(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // shop counter
    public static void mapObject30279(Player player, int index, MapObject mapObject) {}

    // shop counter
    public static void mapObject30280(Player player, int index, MapObject mapObject) {}

    // the inferno
    public static void mapObject30282(Player player, int index, MapObject mapObject) {}

    // cave exit
    public static void mapObject30283(Player player, int index, MapObject mapObject) {
        player.getTzHaar().exitInferno();
    }

    // the inferno
    public static void mapObject30352(Player player, int index, MapObject mapObject) {
        if (player.getTzHaar().getInfernoSacrificedCape()) {
            player.openDialogue("tzhaar", 4);
        } else {
            player.openDialogue("tzhaar", 5);
        }
    }

    // barrel
    public static void mapObject30357(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject30364(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // door
    public static void mapObject30365(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // door
    public static void mapObject30366(Player player, int index, MapObject mapObject) {
        Region.openDoor(player, mapObject);
    }

    // ladder
    public static void mapObject30367(Player player, int index, MapObject mapObject) {}

    // crystals
    public static void mapObject30371(Player player, int index, MapObject mapObject) {}

    // crystals
    public static void mapObject30372(Player player, int index, MapObject mapObject) {}

    // empty wall
    public static void mapObject30373(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject30374(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject30375(Player player, int index, MapObject mapObject) {}

    // row boat
    public static void mapObject30376(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2614, 3440);
    }

    // row boat
    public static void mapObject30377(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(2600, 3425);
    }

    // lizardman lair
    public static void mapObject30380(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(1305, 9973, 0));
    }

    // crevice
    public static void mapObject30381(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderUpTeleport(new Tile(1309, 3574, 0));
    }

    // crevice
    public static void mapObject30382(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1305 && mapObject.getY() == 9954) {
            player.getMovement().teleport(1305, 9957);
        } else if (mapObject.getX() == 1318 && mapObject.getY() == 9957) {
            player.getMovement().teleport(1318, 9960);
        }
    }

    // crevice
    public static void mapObject30383(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1305 && mapObject.getY() == 9956) {
            player.getMovement().teleport(1305, 9953);
        } else if (mapObject.getX() == 1318 && mapObject.getY() == 9959) {
            player.getMovement().teleport(1318, 9956);
        }
    }

    // crevice
    public static void mapObject30384(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1296 && mapObject.getY() == 9959) {
            player.getMovement().teleport(1299, 9959);
        } else if (mapObject.getX() == 1320 && mapObject.getY() == 9966) {
            player.getMovement().teleport(1323, 9966);
        }
    }

    // crevice
    public static void mapObject30385(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 1298 && mapObject.getY() == 9959) {
            player.getMovement().teleport(1295, 9959);
        } else if (mapObject.getX() == 1322 && mapObject.getY() == 9966) {
            player.getMovement().teleport(1319, 9966);
        }
    }

    // castle wars portal
    public static void mapObject30386(Player player, int index, MapObject mapObject) {}

    // large door
    public static void mapObject30387(Player player, int index, MapObject mapObject) {}

    // large door
    public static void mapObject30388(Player player, int index, MapObject mapObject) {}

    // grand exchange booth
    public static void mapObject30389(Player player, int index, MapObject mapObject) {}

    // grand exchange booth
    public static void mapObject30390(Player player, int index, MapObject mapObject) {}

    // iron ladder
    public static void mapObject30391(Player player, int index, MapObject mapObject) {}

    // iron ladder
    public static void mapObject30392(Player player, int index, MapObject mapObject) {}

    // inactive portal
    public static void mapObject30395(Player player, int index, MapObject mapObject) {}

    // shimmering barrier
    public static void mapObject30396(Player player, int index, MapObject mapObject) {}

    // shimmering barrier
    public static void mapObject30397(Player player, int index, MapObject mapObject) {}

    // shimmering barrier
    public static void mapObject30398(Player player, int index, MapObject mapObject) {}

    // shimmering barrier
    public static void mapObject30399(Player player, int index, MapObject mapObject) {}

    // shimmering barrier
    public static void mapObject30400(Player player, int index, MapObject mapObject) {}

    // mounted champion's cape
    public static void mapObject30403(Player player, int index, MapObject mapObject) {}

    // mahogany sapling
    public static void mapObject30406(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30407(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30408(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30409(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30410(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30411(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30412(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30413(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30414(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30415(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30416(Player player, int index, MapObject mapObject) {}

    // mahogany tree
    public static void mapObject30417(Player player, int index, MapObject mapObject) {}

    // mahogany tree stump
    public static void mapObject30418(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30419(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30420(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30421(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30422(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30423(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30424(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30425(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30426(Player player, int index, MapObject mapObject) {}

    // diseased mahogany
    public static void mapObject30427(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30428(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30429(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30430(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30431(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30432(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30433(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30434(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30435(Player player, int index, MapObject mapObject) {}

    // dead mahogany
    public static void mapObject30436(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30437(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30438(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30439(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30440(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30441(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30442(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30443(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30444(Player player, int index, MapObject mapObject) {}

    // teak tree
    public static void mapObject30445(Player player, int index, MapObject mapObject) {}

    // tree stump
    public static void mapObject30446(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30447(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30448(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30449(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30450(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30451(Player player, int index, MapObject mapObject) {}

    // diseased teak
    public static void mapObject30452(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30453(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30454(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30455(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30456(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30457(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30458(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30459(Player player, int index, MapObject mapObject) {}


   /* 30464 - 30719 */

    // dead teak
    public static void mapObject30474(Player player, int index, MapObject mapObject) {}

    // dead teak
    public static void mapObject30475(Player player, int index, MapObject mapObject) {}

    // tree patch
    public static void mapObject30476(Player player, int index, MapObject mapObject) {}

    // tree patch
    public static void mapObject30477(Player player, int index, MapObject mapObject) {}

    // tree patch
    public static void mapObject30478(Player player, int index, MapObject mapObject) {}

    // tree patch
    public static void mapObject30479(Player player, int index, MapObject mapObject) {}

    // tree patch
    public static void mapObject30480(Player player, int index, MapObject mapObject) {}

    // tree patch
    public static void mapObject30481(Player player, int index, MapObject mapObject) {}

    // tree patch
    public static void mapObject30482(Player player, int index, MapObject mapObject) {}

    // seaweed patch
    public static void mapObject30483(Player player, int index, MapObject mapObject) {}

    // seaweed patch
    public static void mapObject30484(Player player, int index, MapObject mapObject) {}

    // seaweed patch
    public static void mapObject30485(Player player, int index, MapObject mapObject) {}

    // seaweed patch
    public static void mapObject30486(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30487(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30488(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30489(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30490(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30491(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30492(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30493(Player player, int index, MapObject mapObject) {}

    // diseased seaweed
    public static void mapObject30494(Player player, int index, MapObject mapObject) {}

    // diseased seaweed
    public static void mapObject30495(Player player, int index, MapObject mapObject) {}

    // diseased seaweed
    public static void mapObject30496(Player player, int index, MapObject mapObject) {}

    // dead seaweed
    public static void mapObject30497(Player player, int index, MapObject mapObject) {}

    // dead seaweed
    public static void mapObject30498(Player player, int index, MapObject mapObject) {}

    // dead seaweed
    public static void mapObject30499(Player player, int index, MapObject mapObject) {}

    // seaweed patch
    public static void mapObject30500(Player player, int index, MapObject mapObject) {}

    // seaweed patch
    public static void mapObject30501(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30502(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30503(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30504(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30505(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30506(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30507(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30508(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30509(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30510(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30511(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30512(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30513(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30514(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30515(Player player, int index, MapObject mapObject) {}

    // compost bin
    public static void mapObject30516(Player player, int index, MapObject mapObject) {}

    // rock
    public static void mapObject30519(Player player, int index, MapObject mapObject) {}

    // mushroom
    public static void mapObject30520(Player player, int index, MapObject mapObject) {}

    // rock
    public static void mapObject30521(Player player, int index, MapObject mapObject) {}

    // rock
    public static void mapObject30522(Player player, int index, MapObject mapObject) {}

    // driftwood
    public static void mapObject30523(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject30532(Player player, int index, MapObject mapObject) {}

    // muddy patch
    public static void mapObject30533(Player player, int index, MapObject mapObject) {}

    // mushroom
    public static void mapObject30534(Player player, int index, MapObject mapObject) {}

    // smelly mushroom
    public static void mapObject30535(Player player, int index, MapObject mapObject) {}

    // muddy patch
    public static void mapObject30536(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30537(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30538(Player player, int index, MapObject mapObject) {}

    // mushroom
    public static void mapObject30539(Player player, int index, MapObject mapObject) {}

    // smelly mushroom
    public static void mapObject30540(Player player, int index, MapObject mapObject) {}

    // smelly mushroom
    public static void mapObject30541(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30542(Player player, int index, MapObject mapObject) {}

    // muddy patch
    public static void mapObject30543(Player player, int index, MapObject mapObject) {}

    // muddy patch
    public static void mapObject30544(Player player, int index, MapObject mapObject) {}

    // smelly mushroom
    public static void mapObject30545(Player player, int index, MapObject mapObject) {}

    // muddy patch
    public static void mapObject30546(Player player, int index, MapObject mapObject) {}

    // muddy patch
    public static void mapObject30547(Player player, int index, MapObject mapObject) {}

    // mushroom
    public static void mapObject30548(Player player, int index, MapObject mapObject) {}

    // muddy patch
    public static void mapObject30549(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30550(Player player, int index, MapObject mapObject) {}

    // seaweed
    public static void mapObject30551(Player player, int index, MapObject mapObject) {}

    // birdhouse (empty)
    public static void mapObject30553(Player player, int index, MapObject mapObject) {}

    // birdhouse
    public static void mapObject30554(Player player, int index, MapObject mapObject) {}

    // birdhouse
    public static void mapObject30555(Player player, int index, MapObject mapObject) {}

    // birdhouse (empty)
    public static void mapObject30556(Player player, int index, MapObject mapObject) {}

    // birdhouse
    public static void mapObject30557(Player player, int index, MapObject mapObject) {}

    // birdhouse
    public static void mapObject30558(Player player, int index, MapObject mapObject) {}

    // birdhouse (empty)
    public static void mapObject30559(Player player, int index, MapObject mapObject) {}

    // birdhouse
    public static void mapObject30560(Player player, int index, MapObject mapObject) {}

    // birdhouse
    public static void mapObject30561(Player player, int index, MapObject mapObject) {}

    // birdhouse (empty)
    public static void mapObject30562(Player player, int index, MapObject mapObject) {}

    // birdhouse
    public static void mapObject30563(Player player, int index, MapObject mapObject) {}

    // birdhouse
    public static void mapObject30564(Player player, int index, MapObject mapObject) {}

    // space
    public static void mapObject30565(Player player, int index, MapObject mapObject) {}

    // space
    public static void mapObject30566(Player player, int index, MapObject mapObject) {}

    // space
    public static void mapObject30567(Player player, int index, MapObject mapObject) {}

    // space
    public static void mapObject30568(Player player, int index, MapObject mapObject) {}

    // barge controls
    public static void mapObject30569(Player player, int index, MapObject mapObject) {}

    // sulliuscep
    public static void mapObject30602(Player player, int index, MapObject mapObject) {}

    // mud pit
    public static void mapObject30604(Player player, int index, MapObject mapObject) {}

    // rubber cap mushroom
    public static void mapObject30606(Player player, int index, MapObject mapObject) {}

    // vines
    public static void mapObject30644(Player player, int index, MapObject mapObject) {}

    // tendrils
    public static void mapObject30645(Player player, int index, MapObject mapObject) {}

    // thick vine
    public static void mapObject30646(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3678 && mapObject.getY() == 3743) {
            if (player.getX() <= 3677) {
                player.getMovement().teleport(3680, 3743);
            } else {
                player.getMovement().teleport(3677, 3743);
            }
        }
    }

    // stump
    public static void mapObject30647(Player player, int index, MapObject mapObject) {}

    // thick vines
    public static void mapObject30648(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3669 && mapObject.getY() == 3746) {
            if (player.getY() >= 3748) {
                player.getMovement().teleport(3671, 3745);
            } else {
                player.getMovement().teleport(3669, 3748);
            }
        } else if (mapObject.getX() == 3671 && mapObject.getY() == 3760) {
            if (player.getY() <= 3760) {
                player.getMovement().teleport(3672, 3762);
            } else {
                player.getMovement().teleport(3670, 3760);
            }
        } else if (mapObject.getX() == 3672 && mapObject.getY() == 3764) {
            if (player.getY() <= 3763) {
                player.getMovement().teleport(3674, 3765);
            } else {
                player.getMovement().teleport(3672, 3763);
            }
        }
    }

    // stump
    public static void mapObject30649(Player player, int index, MapObject mapObject) {}

    // vines
    public static void mapObject30650(Player player, int index, MapObject mapObject) {}

    // bellshroom
    public static void mapObject30670(Player player, int index, MapObject mapObject) {}

    // bellshroom
    public static void mapObject30671(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject30681(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject30682(Player player, int index, MapObject mapObject) {}


   /* 30720 - 30975 */

    // stone chest
    public static void mapObject30720(Player player, int index, MapObject mapObject) {}

    // trapdoor
    public static void mapObject30725(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject30727(Player player, int index, MapObject mapObject) {}

    // obstacle
    public static void mapObject30766(Player player, int index, MapObject mapObject) {}

    // obstacle
    public static void mapObject30767(Player player, int index, MapObject mapObject) {}

    // bank chest-wreck
    public static void mapObject30796(Player player, int index, MapObject mapObject) {}

    // trap door
    public static void mapObject30842(Player player, int index, MapObject mapObject) {}

    // exit
    public static void mapObject30844(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject30845(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject30846(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject30847(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(3633, 10260);
    }

    // stairs
    public static void mapObject30849(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport(3633, 10264);
    }

    // stairs
    public static void mapObject30850(Player player, int index, MapObject mapObject) {}

    // burnt tree
    public static void mapObject30852(Player player, int index, MapObject mapObject) {}

    // burnt tree
    public static void mapObject30854(Player player, int index, MapObject mapObject) {}

    // cave entrance
    public static void mapObject30869(Player player, int index, MapObject mapObject) {}

    // cave exit
    public static void mapObject30878(Player player, int index, MapObject mapObject) {}

    // rowboat
    public static void mapObject30914(Player player, int index, MapObject mapObject) {}

    // rowboat
    public static void mapObject30915(Player player, int index, MapObject mapObject) {}

    // rope anchor
    public static void mapObject30916(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 64) {
            player.getGameEncoder().sendMessage("You need an Agility level of 64 to do this.");
            return;
        }
        player.getMovement().teleport(3784, 3821);
    }

    // rope anchor
    public static void mapObject30917(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 64) {
            player.getGameEncoder().sendMessage("You need an Agility level of 64 to do this.");
            return;
        }
        player.getMovement().teleport(3778, 3821);
    }

    // rowboat
    public static void mapObject30919(Player player, int index, MapObject mapObject) {}

    // magic mushtree
    public static void mapObject30920(Player player, int index, MapObject mapObject) {}

    // magic mushtree
    public static void mapObject30922(Player player, int index, MapObject mapObject) {}

    // magic mushtree
    public static void mapObject30924(Player player, int index, MapObject mapObject) {}

    // bank chest
    public static void mapObject30926(Player player, int index, MapObject mapObject) {}

    // chest pieces
    public static void mapObject30927(Player player, int index, MapObject mapObject) {}

    // fossil cleaning bench
    public static void mapObject30928(Player player, int index, MapObject mapObject) {}

    // table parts
    public static void mapObject30929(Player player, int index, MapObject mapObject) {}

    // ring of stones
    public static void mapObject30931(Player player, int index, MapObject mapObject) {}

    // fire pit
    public static void mapObject30933(Player player, int index, MapObject mapObject) {}

    // spinning wheel
    public static void mapObject30934(Player player, int index, MapObject mapObject) {}

    // broken spinning wheel
    public static void mapObject30935(Player player, int index, MapObject mapObject) {}

    // loom
    public static void mapObject30936(Player player, int index, MapObject mapObject) {}

    // half-built loom
    public static void mapObject30937(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject30938(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject30939(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject30940(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject30941(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject30942(Player player, int index, MapObject mapObject) {}

    // strange machine
    public static void mapObject30944(Player player, int index, MapObject mapObject) {}

    // pile of ancient books
    public static void mapObject30946(Player player, int index, MapObject mapObject) {}

    // anchor rope
    public static void mapObject30948(Player player, int index, MapObject mapObject) {}

    // drift net anchors
    public static void mapObject30952(Player player, int index, MapObject mapObject) {}

    // drift net anchors
    public static void mapObject30953(Player player, int index, MapObject mapObject) {}

    // drift net anchors
    public static void mapObject30954(Player player, int index, MapObject mapObject) {}

    // drift net (full)
    public static void mapObject30955(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject30958(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject30959(Player player, int index, MapObject mapObject) {}

    // plant door
    public static void mapObject30960(Player player, int index, MapObject mapObject) {}

    // plant door
    public static void mapObject30961(Player player, int index, MapObject mapObject) {}

    // obstacle
    public static void mapObject30962(Player player, int index, MapObject mapObject) {}

    // obstacle
    public static void mapObject30964(Player player, int index, MapObject mapObject) {}

    // hole
    public static void mapObject30966(Player player, int index, MapObject mapObject) {}

    // pile of fishbowls
    public static void mapObject30967(Player player, int index, MapObject mapObject) {}

    // pile of fishbowls
    public static void mapObject30968(Player player, int index, MapObject mapObject) {}

    // clam
    public static void mapObject30969(Player player, int index, MapObject mapObject) {}

    // chest
    public static void mapObject30971(Player player, int index, MapObject mapObject) {}

    // hopper
    public static void mapObject30973(Player player, int index, MapObject mapObject) {}

    // sluice gate
    public static void mapObject30975(Player player, int index, MapObject mapObject) {}


   /* 30976 - 31231 */

    // rinsing pool
    public static void mapObject30976(Player player, int index, MapObject mapObject) {}

    // rinsing pool
    public static void mapObject30977(Player player, int index, MapObject mapObject) {}

    // ash pile
    public static void mapObject30985(Player player, int index, MapObject mapObject) {}

    // empty ash pile
    public static void mapObject30986(Player player, int index, MapObject mapObject) {}

    // fossil storage
    public static void mapObject30987(Player player, int index, MapObject mapObject) {}

    // fossil storage
    public static void mapObject30988(Player player, int index, MapObject mapObject) {}

    // bank chest
    public static void mapObject30989(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject31029(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject31030(Player player, int index, MapObject mapObject) {}

    // volcano entrance
    public static void mapObject31031(Player player, int index, MapObject mapObject) {}

    // exit
    public static void mapObject31032(Player player, int index, MapObject mapObject) {}

    // giant boulder
    public static void mapObject31034(Player player, int index, MapObject mapObject) {}

    // giant boulder
    public static void mapObject31035(Player player, int index, MapObject mapObject) {}

    // large boulder
    public static void mapObject31036(Player player, int index, MapObject mapObject) {}

    // medium boulder
    public static void mapObject31037(Player player, int index, MapObject mapObject) {}

    // small boulder
    public static void mapObject31038(Player player, int index, MapObject mapObject) {}

    // volcanic vent
    public static void mapObject31040(Player player, int index, MapObject mapObject) {}

    // volcanic chamber
    public static void mapObject31043(Player player, int index, MapObject mapObject) {}

    // blocked volcanic chamber
    public static void mapObject31044(Player player, int index, MapObject mapObject) {}

    // large rock
    public static void mapObject31045(Player player, int index, MapObject mapObject) {}

    // gas hole
    public static void mapObject31047(Player player, int index, MapObject mapObject) {}

    // gas hole
    public static void mapObject31048(Player player, int index, MapObject mapObject) {}

    // gas hole
    public static void mapObject31049(Player player, int index, MapObject mapObject) {}

    // gas hole
    public static void mapObject31050(Player player, int index, MapObject mapObject) {}

    // gas hole
    public static void mapObject31051(Player player, int index, MapObject mapObject) {}

    // gas hole
    public static void mapObject31052(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31059(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31060(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31061(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31062(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31063(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31071(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31072(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31073(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31074(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31075(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31083(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31084(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31085(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31086(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31087(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31095(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31096(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31097(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31098(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31099(Player player, int index, MapObject mapObject) {}

    // large fossil display
    public static void mapObject31101(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31102(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31103(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31104(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31105(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31107(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31108(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31109(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31110(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31111(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31113(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31114(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31115(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31116(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31117(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31119(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31120(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31121(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31122(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31123(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31125(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31126(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31127(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31128(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31129(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31131(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31132(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31133(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31134(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31135(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31137(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31138(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31139(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31140(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31141(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31143(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31144(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31145(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31146(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31147(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31149(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31150(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31151(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31152(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31153(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31155(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31156(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31157(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31158(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31159(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31161(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31162(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31163(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31164(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31165(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31167(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31168(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31169(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31170(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31171(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31173(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31174(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31175(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31176(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31177(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31179(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31180(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31181(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31182(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31183(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31185(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31186(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31187(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31188(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31189(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31191(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31192(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31193(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31194(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31195(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31197(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31198(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31199(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31200(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31201(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31203(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31204(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31205(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31206(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31207(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31209(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31210(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31211(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31212(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31213(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31215(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31216(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31217(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31218(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31219(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31221(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31222(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31223(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31224(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31225(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31227(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31228(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31229(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31230(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31231(Player player, int index, MapObject mapObject) {}


   /* 31232 - 31487 */

    // medium fossil display
    public static void mapObject31233(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31234(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31235(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31236(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31237(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31239(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31240(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31241(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31242(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31243(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31245(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31246(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31247(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31248(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31249(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31251(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31252(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31253(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31254(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31255(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31257(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31258(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31259(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31260(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31261(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31263(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31264(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31265(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31266(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31267(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31269(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31270(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31271(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31272(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31273(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31275(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31276(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31277(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31278(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31279(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31281(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31282(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31283(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31284(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31285(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31287(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31288(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31289(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31290(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31291(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31293(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31294(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31295(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31296(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31297(Player player, int index, MapObject mapObject) {}

    // viewer
    public static void mapObject31299(Player player, int index, MapObject mapObject) {}

    // sulliuscep
    public static void mapObject31420(Player player, int index, MapObject mapObject) {}

    // sulliuscep sprout
    public static void mapObject31421(Player player, int index, MapObject mapObject) {}

    // sulliuscep sprout
    public static void mapObject31422(Player player, int index, MapObject mapObject) {}

    // sulliuscep sprout
    public static void mapObject31423(Player player, int index, MapObject mapObject) {}

    // sulliuscep sprout
    public static void mapObject31424(Player player, int index, MapObject mapObject) {}

    // sulliuscep sprout
    public static void mapObject31425(Player player, int index, MapObject mapObject) {}

    // mud pit
    public static void mapObject31426(Player player, int index, MapObject mapObject) {}

    // chest pieces
    public static void mapObject31427(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // table parts
    public static void mapObject31428(Player player, int index, MapObject mapObject) {}

    // ring of stones
    public static void mapObject31429(Player player, int index, MapObject mapObject) {}

    // fire pit
    public static void mapObject31430(Player player, int index, MapObject mapObject) {}

    // broken spinning wheel
    public static void mapObject31431(Player player, int index, MapObject mapObject) {}

    // half-built loom
    public static void mapObject31432(Player player, int index, MapObject mapObject) {}

    // drift net anchors
    public static void mapObject31433(Player player, int index, MapObject mapObject) {}

    // drift net anchors
    public static void mapObject31434(Player player, int index, MapObject mapObject) {}

    // pile of fishbowls
    public static void mapObject31435(Player player, int index, MapObject mapObject) {}

    // sluice gate
    public static void mapObject31436(Player player, int index, MapObject mapObject) {}

    // rinsing pool
    public static void mapObject31437(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31439(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31441(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31443(Player player, int index, MapObject mapObject) {}

    // large fossil support
    public static void mapObject31445(Player player, int index, MapObject mapObject) {}

    // large fossil display
    public static void mapObject31446(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31447(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31448(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31449(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31450(Player player, int index, MapObject mapObject) {}

    // plant fossil display
    public static void mapObject31451(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31452(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31453(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31454(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31455(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31456(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31457(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31458(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31459(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31460(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31461(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31462(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31463(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31464(Player player, int index, MapObject mapObject) {}

    // small fossil display
    public static void mapObject31465(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31466(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31467(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31468(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31469(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31470(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31471(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31472(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31473(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31474(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31475(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31476(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31477(Player player, int index, MapObject mapObject) {}

    // medium fossil display
    public static void mapObject31478(Player player, int index, MapObject mapObject) {}

    // muddy patch
    public static void mapObject31479(Player player, int index, MapObject mapObject) {}

    // muddy patch
    public static void mapObject31480(Player player, int index, MapObject mapObject) {}

    // hole
    public static void mapObject31481(Player player, int index, MapObject mapObject) {}

    // hole
    public static void mapObject31482(Player player, int index, MapObject mapObject) {}

    // stool
    public static void mapObject31483(Player player, int index, MapObject mapObject) {}

    // deadman chest
    public static void mapObject31484(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject31485(Player player, int index, MapObject mapObject) {}


   /* 31488 - 31743 */

    // obelisk
    public static void mapObject31554(Player player, int index, MapObject mapObject) {}

    // cavern
    public static void mapObject31555(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3073 && mapObject.getY() == 3654) {
            player.getMovement().teleport(3196, 10056);
            player.setObjectOptionDelay(2);
        }
    }

    // cavern
    public static void mapObject31556(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3124 && mapObject.getY() == 3831) {
            player.getMovement().teleport(3241, 10234);
            player.setObjectOptionDelay(2);
        }
    }

    // opening
    public static void mapObject31557(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3194 && mapObject.getY() == 10055) {
            player.getMovement().teleport(3075, 3653);
            player.setObjectOptionDelay(2);
        }
    }

    // opening
    public static void mapObject31558(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3240 && mapObject.getY() == 10235) {
            player.getMovement().teleport(3126, 3832);
            player.setObjectOptionDelay(2);
        }
    }

    // pillar
    public static void mapObject31561(Player player, int index, MapObject mapObject) {
        Tile tile = null;
        int direction = Tile.NORTH;
        int level = 1;
        if (mapObject.getX() == 3241 && mapObject.getY() == 10145) {
            tile = (player.getX() >= 3243) ? (new Tile(3239, 10145)) : (new Tile(3243, 10145));
            direction = (player.getX() >= 3243) ? Tile.WEST : Tile.EAST;
            level = 89;
        } else if (mapObject.getX() == 3200 && mapObject.getY() == 10136) {
            tile = (player.getX() >= 3202) ? (new Tile(3198, 10136)) : (new Tile(3202, 10136));
            direction = (player.getX() >= 3202) ? Tile.WEST : Tile.EAST;
            level = 75;
        } else if (mapObject.getX() == 3220 && mapObject.getY() == 10086) {
            tile = (player.getY() >= 10088) ? (new Tile(3220, 10084)) : (new Tile(3220, 10088));
            direction = (player.getY() >= 10088) ? Tile.SOUTH : Tile.NORTH;
            level = 65;
        } else if (mapObject.getX() == 3202 && mapObject.getY() == 10196) {
            tile = (player.getX() >= 3204) ? (new Tile(3200, 10196)) : (new Tile(3204, 10196));
            direction = (player.getX() >= 3204) ? Tile.WEST : Tile.EAST;
            level = 75;
        } else if (mapObject.getX() == 3180 && mapObject.getY() == 10209) {
            tile = (player.getY() <= 10207) ? (new Tile(3180, 10211)) : (new Tile(3180, 10207));
            direction = (player.getY() <= 10207) ? Tile.NORTH : Tile.SOUTH;
            level = 75;
        }
        if (tile == null) {
            return;
        } else if (player.getSkills().getLevel(Skills.AGILITY) < level) {
            player.getGameEncoder().sendMessage("You need an Agility level of " + level + " to jump this.");
            return;
        }
        player.setObjectOptionDelay(2);
        tile.setHeight(player.getHeight());
        ForceMovement forceMovement = new ForceMovement(new Tile(player), 1, tile, 2, direction);
        player.setForceMovementTeleport(forceMovement, 6132, 1, null);
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // deadman supply chest
    public static void mapObject31572(Player player, int index, MapObject mapObject) {}

    // deadman supply chest
    public static void mapObject31574(Player player, int index, MapObject mapObject) {}

    // deadman supply chest
    public static void mapObject31576(Player player, int index, MapObject mapObject) {}

    // deadman supply chest
    public static void mapObject31578(Player player, int index, MapObject mapObject) {}

    // deadman supply chest
    public static void mapObject31580(Player player, int index, MapObject mapObject) {}

    // deadman supply chest
    public static void mapObject31582(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>tinderbox</col>
    public static void mapObject31634(Player player, int index, MapObject mapObject) {}

    // the cloister bell
    public static void mapObject31669(Player player, int index, MapObject mapObject) {
        if (!player.getSlayer().isAnyTask(7851) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
            player.getGameEncoder().sendMessage("This can only be killed on task.");
            return;
        } else if (player.getWorld().getNPC(7851, player) != null || player.getWorld().getNPC(7882, player) != null
                || player.getWorld().getNPC(7888, player) != null || player.getWorld().getNPC(7852, player) != null
                || player.getWorld().getNPC(7885, player) != null || player.getWorld().getNPC(7889, player) != null) {
            player.getGameEncoder().sendMessage("Nothing interesting happens.");
            return;
        }
        player.getGameEncoder().setVarp(1667, 3);
        player.getGameEncoder().sendMapObjectAnimation(mapObject, 7748);
        Npc dusk = new Npc(player.getController(), 7851, new Tile(1685, 4573));
        dusk.setLargeVisibility();
        Npc dawn = new Npc(player.getController(), 7852, new Tile(1705, 4573));
        dawn.setLargeVisibility();
    }

    // roof entrance
    public static void mapObject31672(Player player, int index, MapObject mapObject) {}

    // roof entrance
    public static void mapObject31673(Player player, int index, MapObject mapObject) {}

    // roof exit
    public static void mapObject31674(Player player, int index, MapObject mapObject) {
        player.getController().stopWithTeleport();
        player.getMovement().teleport(3426, 3540, 2);
    }

    // magical chest
    public static void mapObject31675(Player player, int index, MapObject mapObject) {}

    // energy sphere
    public static void mapObject31678(Player player, int index, MapObject mapObject) {
        if (mapObject.getAttachment() != null) {
            TempMapObject tmo = (TempMapObject) mapObject.getAttachment();
            tmo.setAttachment(2, player);
            tmo.stop();
        }
    }

    // energy sphere
    public static void mapObject31679(Player player, int index, MapObject mapObject) {
        if (mapObject.getAttachment() != null) {
            TempMapObject tmo = (TempMapObject) mapObject.getAttachment();
            tmo.setAttachment(2, player);
            tmo.stop();
        }
    }

    // energy sphere
    public static void mapObject31680(Player player, int index, MapObject mapObject) {
        if (mapObject.getAttachment() != null) {
            TempMapObject tmo = (TempMapObject) mapObject.getAttachment();
            tmo.setAttachment(2, player);
            tmo.stop();
        }
    }

    // roof entrance
    public static void mapObject31681(Player player, int index, MapObject mapObject) {
        if (!player.getSlayer().isUnlocked(Slayer.GROTESQUE_GUARDIANS)) {
            if (!player.getInventory().hasItem(21724)) {
                player.getGameEncoder().sendMessage("You need a Brittle key to unlock this.");
                return;
            }
            player.getInventory().deleteItem(21724, 1);
            player.getSlayer().unlock(Slayer.GROTESQUE_GUARDIANS);
            return;
        }
        if (!player.getSlayer().isAnyTask(7851) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
            player.getGameEncoder().sendMessage("This can only be attacked on an appropriate Slayer task.");
            return;
        }
        player.setController(new BossInstancePC());
        player.getController().instance();
        player.getMovement().teleport(1696, 4574);
        player.getController().getVariable("boss_instance_grotesque_guardians");
    }

    // the cloister bell
    public static void mapObject31684(Player player, int index, MapObject mapObject) {}

    // the cloister bell
    public static void mapObject31685(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject31686(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject31687(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject31688(Player player, int index, MapObject mapObject) {}

    // the grotesque guardians' display
    public static void mapObject31689(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject31690(Player player, int index, MapObject mapObject) {}

    // sand pile
    public static void mapObject31691(Player player, int index, MapObject mapObject) {}

    // tunnel entrance
    public static void mapObject31692(Player player, int index, MapObject mapObject) {}

    // rope
    public static void mapObject31693(Player player, int index, MapObject mapObject) {}

    // crevice
    public static void mapObject31695(Player player, int index, MapObject mapObject) {}

    // crevice
    public static void mapObject31696(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31697(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31698(Player player, int index, MapObject mapObject) {}

    // stepping stone
    public static void mapObject31699(Player player, int index, MapObject mapObject) {}

    // chest
    public static void mapObject31703(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject31704(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject31705(Player player, int index, MapObject mapObject) {}

    // manhole
    public static void mapObject31706(Player player, int index, MapObject mapObject) {}

    // manhole
    public static void mapObject31707(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject31708(Player player, int index, MapObject mapObject) {}

    // doorway
    public static void mapObject31709(Player player, int index, MapObject mapObject) {}

    // chest
    public static void mapObject31710(Player player, int index, MapObject mapObject) {}

    // fish stall
    public static void mapObject31712(Player player, int index, MapObject mapObject) {}

    // old memorial
    public static void mapObject31714(Player player, int index, MapObject mapObject) {}

    // burning driftwood
    public static void mapObject31722(Player player, int index, MapObject mapObject) {}

    // driftwood
    public static void mapObject31724(Player player, int index, MapObject mapObject) {}

    // closed booth
    public static void mapObject31725(Player player, int index, MapObject mapObject) {}

    // bank deposit box
    public static void mapObject31726(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // stairs
    public static void mapObject31733(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject31734(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject31735(Player player, int index, MapObject mapObject) {}


   /* 31744 - 31999 */

    // gangplank
    public static void mapObject31756(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31757(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31758(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31759(Player player, int index, MapObject mapObject) {}

    // hole
    public static void mapObject31765(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject31766(Player player, int index, MapObject mapObject) {}

    // vine ladder
    public static void mapObject31790(Player player, int index, MapObject mapObject) {}

    // hole
    public static void mapObject31791(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject31806(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject31807(Player player, int index, MapObject mapObject) {}

    // magical barrier
    public static void mapObject31808(Player player, int index, MapObject mapObject) {}

    // pillar
    public static void mapObject31809(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31822(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31823(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31824(Player player, int index, MapObject mapObject) {}

    // pool of dreams
    public static void mapObject31825(Player player, int index, MapObject mapObject) {}

    // dream list
    public static void mapObject31826(Player player, int index, MapObject mapObject) {}

    // maple birdhouse (empty)
    public static void mapObject31827(Player player, int index, MapObject mapObject) {}

    // maple birdhouse
    public static void mapObject31828(Player player, int index, MapObject mapObject) {}

    // maple birdhouse
    public static void mapObject31829(Player player, int index, MapObject mapObject) {}

    // mahoganybirdhouse (empty)
    public static void mapObject31830(Player player, int index, MapObject mapObject) {}

    // mahogany birdhouse
    public static void mapObject31831(Player player, int index, MapObject mapObject) {}

    // mahogany birdhouse
    public static void mapObject31832(Player player, int index, MapObject mapObject) {}

    // yew birdhouse (empty)
    public static void mapObject31833(Player player, int index, MapObject mapObject) {}

    // yew birdhouse
    public static void mapObject31834(Player player, int index, MapObject mapObject) {}

    // yew birdhouse
    public static void mapObject31835(Player player, int index, MapObject mapObject) {}

    // magic birdhouse (empty)
    public static void mapObject31836(Player player, int index, MapObject mapObject) {}

    // magic birdhouse
    public static void mapObject31837(Player player, int index, MapObject mapObject) {}

    // magic birdhouse
    public static void mapObject31838(Player player, int index, MapObject mapObject) {}

    // redwood birdhouse (empty)
    public static void mapObject31839(Player player, int index, MapObject mapObject) {}

    // redwood birdhouse
    public static void mapObject31840(Player player, int index, MapObject mapObject) {}

    // redwood birdhouse
    public static void mapObject31841(Player player, int index, MapObject mapObject) {}

    // decaying trunk
    public static void mapObject31842(Player player, int index, MapObject mapObject) {}

    // <col=ffff00>annette</col>
    public static void mapObject31843(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject31844(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject31845(Player player, int index, MapObject mapObject) {}

    // notice board
    public static void mapObject31846(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31848(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31849(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31850(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31852(Player player, int index, MapObject mapObject) {}

    // rope
    public static void mapObject31853(Player player, int index, MapObject mapObject) {}

    // vorkath head
    public static void mapObject31977(Player player, int index, MapObject mapObject) {}

    // vorkath display
    public static void mapObject31978(Player player, int index, MapObject mapObject) {}

    // mounted max cape
    public static void mapObject31979(Player player, int index, MapObject mapObject) {}

    // mounted max cape
    public static void mapObject31980(Player player, int index, MapObject mapObject) {}

    // mounted max cape
    public static void mapObject31981(Player player, int index, MapObject mapObject) {}

    // mounted max cape
    public static void mapObject31982(Player player, int index, MapObject mapObject) {}

    // mounted mythical cape
    public static void mapObject31983(Player player, int index, MapObject mapObject) {}

    // rune dragon
    public static void mapObject31984(Player player, int index, MapObject mapObject) {}

    // vorkath topiary
    public static void mapObject31985(Player player, int index, MapObject mapObject) {}

    // mythical cape
    public static void mapObject31986(Player player, int index, MapObject mapObject) {}

    // closed chest
    public static void mapObject31987(Player player, int index, MapObject mapObject) {}

    // open chest
    public static void mapObject31988(Player player, int index, MapObject mapObject) {}

    // fremennik boat
    public static void mapObject31989(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31990(Player player, int index, MapObject mapObject) {
        if (player.getY() <= 4052) {
            player.setController(new BossInstancePC());
            player.getController().instance();
            player.getMovement().teleport(2272, 4054);
            player.getController().getVariable("boss_instance_vorkath");
        } else {
            player.getController().stop();
        }
    }

    // ice chunks
    public static void mapObject31992(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31994(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31996(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31998(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject31999(Player player, int index, MapObject mapObject) {}


   /* 32000 - 32255 */

    // cave entrance
    public static void mapObject32047(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject32052(Player player, int index, MapObject mapObject) {}

    // stone chest
    public static void mapObject32053(Player player, int index, MapObject mapObject) {}

    // lever
    public static void mapObject32056(Player player, int index, MapObject mapObject) {}

    // ancient machinery
    public static void mapObject32073(Player player, int index, MapObject mapObject) {}

    // ancient machinery
    public static void mapObject32074(Player player, int index, MapObject mapObject) {}

    // ancient equipment
    public static void mapObject32075(Player player, int index, MapObject mapObject) {}

    // ancient incubator
    public static void mapObject32076(Player player, int index, MapObject mapObject) {}

    // ancient equipment
    public static void mapObject32077(Player player, int index, MapObject mapObject) {}

    // ancient incubator
    public static void mapObject32078(Player player, int index, MapObject mapObject) {}

    // rowboat
    public static void mapObject32079(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject32080(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32081(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32082(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32083(Player player, int index, MapObject mapObject) {}

    // trapdoor
    public static void mapObject32084(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32089(Player player, int index, MapObject mapObject) {}

    // skeleton
    public static void mapObject32091(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject32112(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject32113(Player player, int index, MapObject mapObject) {}

    // grandiose doors
    public static void mapObject32114(Player player, int index, MapObject mapObject) {}

    // grandiose doors
    public static void mapObject32115(Player player, int index, MapObject mapObject) {}

    // grandiose doors
    public static void mapObject32116(Player player, int index, MapObject mapObject) {}

    // broken grandiose doors
    public static void mapObject32117(Player player, int index, MapObject mapObject) {}

    // broken grandiose doors
    public static void mapObject32132(Player player, int index, MapObject mapObject) {}

    // grandiose doors
    public static void mapObject32133(Player player, int index, MapObject mapObject) {}

    // mural
    public static void mapObject32144(Player player, int index, MapObject mapObject) {}

    // barrier
    public static void mapObject32153(Player player, int index, MapObject mapObject) {
        if (mapObject.getDirection() == 1) {
            if (player.getX() > mapObject.getX()) {
                player.openDialogue("lithkrenvault", 0);
            } else {
                player.getMovement().teleport(1562, 5074);
            }
        } else if (mapObject.getDirection() == 3) {
            if (player.getX() < mapObject.getX()) {
                player.openDialogue("lithkrenvault", 1);
            } else {
                player.getMovement().teleport(1573, 5074);
            }
        }
    }

    // machinery
    public static void mapObject32156(Player player, int index, MapObject mapObject) {}

    // machinery
    public static void mapObject32157(Player player, int index, MapObject mapObject) {}

    // ancient machinery
    public static void mapObject32158(Player player, int index, MapObject mapObject) {}

    // incubator
    public static void mapObject32159(Player player, int index, MapObject mapObject) {}

    // incubator
    public static void mapObject32160(Player player, int index, MapObject mapObject) {}

    // machinery
    public static void mapObject32161(Player player, int index, MapObject mapObject) {}

    // stone crate
    public static void mapObject32162(Player player, int index, MapObject mapObject) {}

    // blockage
    public static void mapObject32165(Player player, int index, MapObject mapObject) {}

    // blockage
    public static void mapObject32166(Player player, int index, MapObject mapObject) {}

    // blockage
    public static void mapObject32167(Player player, int index, MapObject mapObject) {}

    // blockage
    public static void mapObject32168(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject32169(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject32170(Player player, int index, MapObject mapObject) {}

    // ancient machinery
    public static void mapObject32185(Player player, int index, MapObject mapObject) {}

    // cave entrance
    public static void mapObject32198(Player player, int index, MapObject mapObject) {}

    // ancient mural
    public static void mapObject32203(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32205(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32206(Player player, int index, MapObject mapObject) {}

    // mithril door
    public static void mapObject32208(Player player, int index, MapObject mapObject) {}

    // rough hewn steps
    public static void mapObject32211(Player player, int index, MapObject mapObject) {}

    // rough hewn steps
    public static void mapObject32212(Player player, int index, MapObject mapObject) {}

    // anvil
    public static void mapObject32215(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject32235(Player player, int index, MapObject mapObject) {}


   /* 32256 - 32511 */

    // hammers
    public static void mapObject32293(Player player, int index, MapObject mapObject) {}

    // water containers
    public static void mapObject32294(Player player, int index, MapObject mapObject) {}

    // swamp paste
    public static void mapObject32295(Player player, int index, MapObject mapObject) {}

    // potions
    public static void mapObject32296(Player player, int index, MapObject mapObject) {}

    // fire
    public static void mapObject32297(Player player, int index, MapObject mapObject) {}

    // leak
    public static void mapObject32298(Player player, int index, MapObject mapObject) {}

    // <col=ffff00>fremennik warrior</col>
    public static void mapObject32300(Player player, int index, MapObject mapObject) {}

    // <col=ffff00>fremennik warrior</col>
    public static void mapObject32302(Player player, int index, MapObject mapObject) {}

    // damaged mast
    public static void mapObject32305(Player player, int index, MapObject mapObject) {}

    // gap
    public static void mapObject32312(Player player, int index, MapObject mapObject) {}

    // gap
    public static void mapObject32313(Player player, int index, MapObject mapObject) {}

    // ship
    public static void mapObject32314(Player player, int index, MapObject mapObject) {}

    // debris
    public static void mapObject32316(Player player, int index, MapObject mapObject) {}

    // debris
    public static void mapObject32317(Player player, int index, MapObject mapObject) {}

    // wreckage
    public static void mapObject32319(Player player, int index, MapObject mapObject) {}

    // ship
    public static void mapObject32320(Player player, int index, MapObject mapObject) {}

    // rope ladder
    public static void mapObject32321(Player player, int index, MapObject mapObject) {}

    // rope ladder
    public static void mapObject32322(Player player, int index, MapObject mapObject) {}

    // rope ladder
    public static void mapObject32323(Player player, int index, MapObject mapObject) {}

    // rope
    public static void mapObject32324(Player player, int index, MapObject mapObject) {}

    // ship
    public static void mapObject32325(Player player, int index, MapObject mapObject) {}

    // ship
    public static void mapObject32326(Player player, int index, MapObject mapObject) {}

    // bowsprit
    public static void mapObject32327(Player player, int index, MapObject mapObject) {}

    // debris
    public static void mapObject32374(Player player, int index, MapObject mapObject) {}

    // debris
    public static void mapObject32375(Player player, int index, MapObject mapObject) {}

    // debris
    public static void mapObject32377(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject32393(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject32394(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32395(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32396(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32397(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32398(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32399(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32400(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32401(Player player, int index, MapObject mapObject) {}

    // crypt entrance
    public static void mapObject32403(Player player, int index, MapObject mapObject) {}

    // large doors
    public static void mapObject32404(Player player, int index, MapObject mapObject) {}

    // large doors
    public static void mapObject32405(Player player, int index, MapObject mapObject) {}

    // large doors
    public static void mapObject32406(Player player, int index, MapObject mapObject) {}

    // large doors
    public static void mapObject32407(Player player, int index, MapObject mapObject) {}

    // tomb
    public static void mapObject32411(Player player, int index, MapObject mapObject) {}

    // tomb
    public static void mapObject32412(Player player, int index, MapObject mapObject) {}

    // bust
    public static void mapObject32414(Player player, int index, MapObject mapObject) {}

    // bust
    public static void mapObject32416(Player player, int index, MapObject mapObject) {}

    // bust
    public static void mapObject32418(Player player, int index, MapObject mapObject) {}

    // bust
    public static void mapObject32420(Player player, int index, MapObject mapObject) {}

    // plinth
    public static void mapObject32423(Player player, int index, MapObject mapObject) {}

    // plinth
    public static void mapObject32424(Player player, int index, MapObject mapObject) {}

    // plinth
    public static void mapObject32425(Player player, int index, MapObject mapObject) {}

    // plinth
    public static void mapObject32426(Player player, int index, MapObject mapObject) {}

    // bench
    public static void mapObject32439(Player player, int index, MapObject mapObject) {}

    // item chest
    public static void mapObject32440(Player player, int index, MapObject mapObject) {}

    // incomplete map
    public static void mapObject32443(Player player, int index, MapObject mapObject) {}

    // stone chest
    public static void mapObject32446(Player player, int index, MapObject mapObject) {}

    // stone chest
    public static void mapObject32448(Player player, int index, MapObject mapObject) {}

    // fungi
    public static void mapObject32450(Player player, int index, MapObject mapObject) {}

    // hook briar
    public static void mapObject32452(Player player, int index, MapObject mapObject) {}

    // mushtree
    public static void mapObject32454(Player player, int index, MapObject mapObject) {}

    // rowboat space
    public static void mapObject32455(Player player, int index, MapObject mapObject) {}

    // rowboat
    public static void mapObject32456(Player player, int index, MapObject mapObject) {}

    // energy barrier
    public static void mapObject32457(Player player, int index, MapObject mapObject) {}

    // history
    public static void mapObject32458(Player player, int index, MapObject mapObject) {}

    // fremennik boat
    public static void mapObject32461(Player player, int index, MapObject mapObject) {}

    // bookcase
    public static void mapObject32462(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject32464(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject32465(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject32479(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject32480(Player player, int index, MapObject mapObject) {}

    // trap
    public static void mapObject32481(Player player, int index, MapObject mapObject) {}

    // trap
    public static void mapObject32482(Player player, int index, MapObject mapObject) {}

    // trap
    public static void mapObject32483(Player player, int index, MapObject mapObject) {}

    // trap
    public static void mapObject32484(Player player, int index, MapObject mapObject) {}

    // plinth
    public static void mapObject32486(Player player, int index, MapObject mapObject) {}

    // plinth
    public static void mapObject32487(Player player, int index, MapObject mapObject) {}

    // skeleton
    public static void mapObject32488(Player player, int index, MapObject mapObject) {}

    // mysterious ruins
    public static void mapObject32490(Player player, int index, MapObject mapObject) {}

    // portal
    public static void mapObject32491(Player player, int index, MapObject mapObject) {}

    // altar
    public static void mapObject32492(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.WRATH);
    }

    // crevice
    public static void mapObject32502(Player player, int index, MapObject mapObject) {}

    // rockfall
    public static void mapObject32503(Player player, int index, MapObject mapObject) {}

    // boulder
    public static void mapObject32504(Player player, int index, MapObject mapObject) {}

    // magic gate
    public static void mapObject32507(Player player, int index, MapObject mapObject) {}

    // unstable altar
    public static void mapObject32508(Player player, int index, MapObject mapObject) {}


   /* 32512 - 32767 */

    // leaflet
    public static void mapObject32533(Player player, int index, MapObject mapObject) {}

    // gate
    public static void mapObject32534(Player player, int index, MapObject mapObject) {}

    // rock pile
    public static void mapObject32535(Player player, int index, MapObject mapObject) {}

    // logs
    public static void mapObject32536(Player player, int index, MapObject mapObject) {}

    // mounted xeric's guard
    public static void mapObject32537(Player player, int index, MapObject mapObject) {}

    // mounted xeric's warrior
    public static void mapObject32538(Player player, int index, MapObject mapObject) {}

    // mounted xeric's sentinel
    public static void mapObject32539(Player player, int index, MapObject mapObject) {}

    // mounted xeric's general
    public static void mapObject32540(Player player, int index, MapObject mapObject) {}

    // mounted xeric's champion
    public static void mapObject32541(Player player, int index, MapObject mapObject) {}

    // hole
    public static void mapObject32542(Player player, int index, MapObject mapObject) {}

    // rope
    public static void mapObject32543(Player player, int index, MapObject mapObject) {}

    // score board
    public static void mapObject32544(Player player, int index, MapObject mapObject) {}

    // poll booth
    public static void mapObject32546(Player player, int index, MapObject mapObject) {}

    // poll booth
    public static void mapObject32547(Player player, int index, MapObject mapObject) {}

    // window
    public static void mapObject32548(Player player, int index, MapObject mapObject) {}

    // rubble
    public static void mapObject32549(Player player, int index, MapObject mapObject) {}

    // vent
    public static void mapObject32551(Player player, int index, MapObject mapObject) {}

    // roof
    public static void mapObject32553(Player player, int index, MapObject mapObject) {}

    // roof
    public static void mapObject32554(Player player, int index, MapObject mapObject) {}

    // roof
    public static void mapObject32555(Player player, int index, MapObject mapObject) {}

    // broken fountain
    public static void mapObject32557(Player player, int index, MapObject mapObject) {}

    // bed
    public static void mapObject32559(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32560(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32561(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject32562(Player player, int index, MapObject mapObject) {}

    // barrel
    public static void mapObject32564(Player player, int index, MapObject mapObject) {}

    // barrel
    public static void mapObject32565(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject32566(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject32567(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject32568(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject32569(Player player, int index, MapObject mapObject) {}

    // crates
    public static void mapObject32570(Player player, int index, MapObject mapObject) {}

    // crates
    public static void mapObject32571(Player player, int index, MapObject mapObject) {}

    // chest
    public static void mapObject32572(Player player, int index, MapObject mapObject) {}

    // chest
    public static void mapObject32573(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject32575(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject32576(Player player, int index, MapObject mapObject) {}

    // trapdoor
    public static void mapObject32577(Player player, int index, MapObject mapObject) {}

    // trapdoor
    public static void mapObject32578(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32579(Player player, int index, MapObject mapObject) {}

    // <col=ffff00>meiyerditch citizen</col>
    public static void mapObject32589(Player player, int index, MapObject mapObject) {}

    // row boat
    public static void mapObject32601(Player player, int index, MapObject mapObject) {}

    // row boat
    public static void mapObject32602(Player player, int index, MapObject mapObject) {}

    // coffin
    public static void mapObject32625(Player player, int index, MapObject mapObject) {}

    // altar of zamorak
    public static void mapObject32630(Player player, int index, MapObject mapObject) {}

    // simple stove
    public static void mapObject32631(Player player, int index, MapObject mapObject) {}

    // crate
    public static void mapObject32636(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32637(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32638(Player player, int index, MapObject mapObject) {}

    // trapdoor
    public static void mapObject32641(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32642(Player player, int index, MapObject mapObject) {}

    // trapdoor
    public static void mapObject32643(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject32644(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject32645(Player player, int index, MapObject mapObject) {}

    // staircase
    public static void mapObject32646(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32647(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject32648(Player player, int index, MapObject mapObject) {}

    // poll booth
    public static void mapObject32649(Player player, int index, MapObject mapObject) {}

    // rubble
    public static void mapObject32650(Player player, int index, MapObject mapObject) {}

    // broken fountain
    public static void mapObject32651(Player player, int index, MapObject mapObject) {}

    // theatre of blood
    public static void mapObject32653(Player player, int index, MapObject mapObject) {}

    // vyre well
    public static void mapObject32654(Player player, int index, MapObject mapObject) {}

    // notice board
    public static void mapObject32655(Player player, int index, MapObject mapObject) {}

    // chest
    public static void mapObject32656(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject32659(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject32660(Player player, int index, MapObject mapObject) {}

    // bank deposit box
    public static void mapObject32665(Player player, int index, MapObject mapObject) {}

    // bank booth
    public static void mapObject32666(Player player, int index, MapObject mapObject) {}

    // treasure room
    public static void mapObject32738(Player player, int index, MapObject mapObject) {}

    // cooking range
    public static void mapObject32739(Player player, int index, MapObject mapObject) {}

    // skeleton
    public static void mapObject32741(Player player, int index, MapObject mapObject) {}

    // door
    public static void mapObject32751(Player player, int index, MapObject mapObject) {}

    // barrier
    public static void mapObject32755(Player player, int index, MapObject mapObject) {}

    // <col=ffff00>vyre orator</col>
    public static void mapObject32756(Player player, int index, MapObject mapObject) {}

    // <col=ffff00>vyre orator</col>
    public static void mapObject32757(Player player, int index, MapObject mapObject) {}

    // chest
    public static void mapObject32758(Player player, int index, MapObject mapObject) {}

    // chest
    public static void mapObject32759(Player player, int index, MapObject mapObject) {}



}
