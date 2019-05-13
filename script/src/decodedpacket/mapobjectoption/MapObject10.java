package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.player.Player;

public class MapObject10 {
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
}

