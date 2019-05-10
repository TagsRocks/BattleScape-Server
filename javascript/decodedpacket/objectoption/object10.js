/* 2560 - 2815 */

// Flour bin
DecodedPacketObjectOption.prototype.object_2574 = function(player, index, object) { }

// Marshy jungle vine
DecodedPacketObjectOption.prototype.object_2575 = function(player, index, object) { }

// Palm tree
DecodedPacketObjectOption.prototype.object_2577 = function(player, index, object) { }

// Scorched earth
DecodedPacketObjectOption.prototype.object_2579 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_2581 = function(player, index, object) { }

// Fungus covered Cavern wall
DecodedPacketObjectOption.prototype.object_2583 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_2584 = function(player, index, object) { }

// Hand holds
DecodedPacketObjectOption.prototype.object_2585 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2587 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2588 = function(player, index, object) { }

// Hole
DecodedPacketObjectOption.prototype.object_2589 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2590 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2591 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2592 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_2593 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_2594 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2595 = function(player, index, object) { }

// Red door
DecodedPacketObjectOption.prototype.object_2596 = function(player, index, object) { }

// Orange door
DecodedPacketObjectOption.prototype.object_2597 = function(player, index, object) { }

// Yellow door
DecodedPacketObjectOption.prototype.object_2598 = function(player, index, object) { }

// Blue door
DecodedPacketObjectOption.prototype.object_2599 = function(player, index, object) { }

// Magenta door
DecodedPacketObjectOption.prototype.object_2600 = function(player, index, object) { }

// Green door
DecodedPacketObjectOption.prototype.object_2601 = function(player, index, object) { }

// Exit door
DecodedPacketObjectOption.prototype.object_2602 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2603 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2604 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2605 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_2606 = function(player, index, object) { }

// Hopper controls
DecodedPacketObjectOption.prototype.object_2607 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_2608 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_2609 = function(player, index, object) { }

// Staircase
DecodedPacketObjectOption.prototype.object_2610 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_2612 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_2613 = function(player, index, object) { }

// Coffin
DecodedPacketObjectOption.prototype.object_2614 = function(player, index, object) { }

// Coffin
DecodedPacketObjectOption.prototype.object_2615 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_2616 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_2617 = function(player, index, object) { }

// Broken fence
DecodedPacketObjectOption.prototype.object_2618 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_2619 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_2620 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2621 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2622 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2623 = function(player, index, object) {
    // Taverley Dungeon blue dragons door
    if (player.getX() >= 2924) {
        player.getMovement().teleport(2923, player.getY(), 0);
    } else {
        player.getMovement().teleport(2924, player.getY(), 0);
    }
}

// Door
DecodedPacketObjectOption.prototype.object_2624 = function(player, index, object) {
    if (object.getOriginal() != null || object.getAttachment() != null) {
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
    Region.openDoors(player, object, 1, false);
}

// Door
DecodedPacketObjectOption.prototype.object_2625 = function(player, index, object) {
    if (object.getOriginal() != null || object.getAttachment() != null) {
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
    Region.openDoors(player, object, 1, false);
}

// Door
DecodedPacketObjectOption.prototype.object_2626 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2627 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2628 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_2629 = function(player, index, object) { }

// Fishing spot
DecodedPacketObjectOption.prototype.object_2630 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2631 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2632 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2633 = function(player, index, object) { }

// Rock slide
DecodedPacketObjectOption.prototype.object_2634 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_2635 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_2636 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_2640 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2641 = function(player, index, object) { }

// Table
DecodedPacketObjectOption.prototype.object_2650 = function(player, index, object) { }

// Sinclair mansion drain
DecodedPacketObjectOption.prototype.object_2652 = function(player, index, object) { }

// Sinclair family fountain
DecodedPacketObjectOption.prototype.object_2654 = function(player, index, object) { }

// Sinclair family crest
DecodedPacketObjectOption.prototype.object_2655 = function(player, index, object) { }

// Anna's barrel
DecodedPacketObjectOption.prototype.object_2656 = function(player, index, object) { }

// Bob's barrel
DecodedPacketObjectOption.prototype.object_2657 = function(player, index, object) { }

// Carol's barrel
DecodedPacketObjectOption.prototype.object_2658 = function(player, index, object) { }

// David's barrel
DecodedPacketObjectOption.prototype.object_2659 = function(player, index, object) { }

// Elizabeth's barrel
DecodedPacketObjectOption.prototype.object_2660 = function(player, index, object) { }

// Frank's barrel
DecodedPacketObjectOption.prototype.object_2661 = function(player, index, object) { }

// Sacks
DecodedPacketObjectOption.prototype.object_2663 = function(player, index, object) { }

// Sturdy wooden gate
DecodedPacketObjectOption.prototype.object_2664 = function(player, index, object) { }

// Sturdy wooden gate
DecodedPacketObjectOption.prototype.object_2665 = function(player, index, object) { }

// Winch
DecodedPacketObjectOption.prototype.object_2667 = function(player, index, object) { }

// Winch bucket
DecodedPacketObjectOption.prototype.object_2668 = function(player, index, object) { }

// Kharidian cactus (Healthy)
DecodedPacketObjectOption.prototype.object_2670 = function(player, index, object) { }

// An experimental anvil
DecodedPacketObjectOption.prototype.object_2672 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2673 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2674 = function(player, index, object) { }

// Mine door entrance
DecodedPacketObjectOption.prototype.object_2675 = function(player, index, object) { }

// Mine door entrance
DecodedPacketObjectOption.prototype.object_2676 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2677 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_2678 = function(player, index, object) { }

// Cell wall window
DecodedPacketObjectOption.prototype.object_2679 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_2680 = function(player, index, object) { }

// Barrel
DecodedPacketObjectOption.prototype.object_2681 = function(player, index, object) { }

// Wooden cart
DecodedPacketObjectOption.prototype.object_2682 = function(player, index, object) { }

// Window
DecodedPacketObjectOption.prototype.object_2683 = function(player, index, object) { }

// Mine Cart
DecodedPacketObjectOption.prototype.object_2684 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2685 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2686 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2687 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2688 = function(player, index, object) { }

// Prison door
DecodedPacketObjectOption.prototype.object_2689 = function(player, index, object) { }

// Mine door entrance
DecodedPacketObjectOption.prototype.object_2690 = function(player, index, object) { }

// Mine door entrance
DecodedPacketObjectOption.prototype.object_2691 = function(player, index, object) { }

// Prison door
DecodedPacketObjectOption.prototype.object_2692 = function(player, index, object) { }

// Bank chest
DecodedPacketObjectOption.prototype.object_2693 = function(player, index, object) {
    player.getBank().open();
}

// Rock
DecodedPacketObjectOption.prototype.object_2694 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_2695 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_2696 = function(player, index, object) { }

// Rock
DecodedPacketObjectOption.prototype.object_2697 = function(player, index, object) { }

// Mine cave
DecodedPacketObjectOption.prototype.object_2698 = function(player, index, object) { }

// Mine cave
DecodedPacketObjectOption.prototype.object_2699 = function(player, index, object) { }

// Tent door
DecodedPacketObjectOption.prototype.object_2700 = function(player, index, object) { }

// Tracks
DecodedPacketObjectOption.prototype.object_2702 = function(player, index, object) { }

// Tracks
DecodedPacketObjectOption.prototype.object_2703 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_2704 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2705 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_2706 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_2707 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_2708 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2709 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2710 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_2711 = function(player, index, object) { }

// Shelves
DecodedPacketObjectOption.prototype.object_2712 = function(player, index, object) { }

// Shelves
DecodedPacketObjectOption.prototype.object_2713 = function(player, index, object) { }

// Study desk
DecodedPacketObjectOption.prototype.object_2714 = function(player, index, object) { }

// Hellhound
DecodedPacketObjectOption.prototype.object_2715 = function(player, index, object) { }

// City gate
DecodedPacketObjectOption.prototype.object_2786 = function(player, index, object) { }

// City gate
DecodedPacketObjectOption.prototype.object_2787 = function(player, index, object) { }

// City gate
DecodedPacketObjectOption.prototype.object_2788 = function(player, index, object) { }

// City gate
DecodedPacketObjectOption.prototype.object_2789 = function(player, index, object) { }

// Chest
DecodedPacketObjectOption.prototype.object_2790 = function(player, index, object) { }

// Counter
DecodedPacketObjectOption.prototype.object_2792 = function(player, index, object) { }

// Counter
DecodedPacketObjectOption.prototype.object_2793 = function(player, index, object) { }

// Lever
DecodedPacketObjectOption.prototype.object_2794 = function(player, index, object) { }

// Lever
DecodedPacketObjectOption.prototype.object_2795 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2796 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2797 = function(player, index, object) { }

// Bush
DecodedPacketObjectOption.prototype.object_2798 = function(player, index, object) { }

// Bush
DecodedPacketObjectOption.prototype.object_2799 = function(player, index, object) { }

// Bush
DecodedPacketObjectOption.prototype.object_2800 = function(player, index, object) { }

// Bush
DecodedPacketObjectOption.prototype.object_2801 = function(player, index, object) { }

// Bush
DecodedPacketObjectOption.prototype.object_2802 = function(player, index, object) { }

// Bush
DecodedPacketObjectOption.prototype.object_2803 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_2804 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_2805 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_2806 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_2807 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_2808 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_2809 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_2810 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_2811 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_2812 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_2813 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2814 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_2815 = function(player, index, object) { }
