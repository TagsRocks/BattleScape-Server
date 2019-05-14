DecodedPacketWidget.prototype.widget_629 = function(player, index, childID, slot, itemID) {
    if (childID == 3) {
        player.getWidgetManager().sendQuestOverlay(WidgetID.QUEST);
    } else if (childID == 4) {
        player.getWidgetManager().sendQuestOverlay(WidgetID.ACHIEVEMENT_DIARY);
    }
}

DecodedPacketWidget.prototype.widget_399 = function(player, index, childID, slot, itemID) {
    if (player.isLocked()) {
        return;
    }
    if (childID == 6 || childID == 7) {
        //player.getWidgetManager().questAction(childID, slot);
    }
    if (childID == 6 && slot == 6 && player.getRights() > 0) {
        var normals = 0;
        var ironmans = 0;
        var hards = 0;
        var hardcores = 0;
        var groups = 0;
        var idleTime = 0;
        for each (var player2 in player.getWorld().getPlayers()) {
            if (player2.isGameModeNormal()) {
                normals++;
            } else if (player2.isGameModeIronman()) {
                ironmans++;
            } else if (player2.isGameModeHard()) {
                hards++;
            } else if (player2.isGameModeHardcoreIronman()) {
                hardcores++;
            } else if (player2.isGameModeGroupIronman()) {
                groups++;
            }
            if (player2.getIdleTime() > idleTime) {
                idleTime = player2.getIdleTime();
            }
        }
        var lines = new ArrayList();
        lines.add("Normals: " + normals);
        lines.add("Hards: " + hards);
        lines.add("Ironmans: " + ironmans);
        lines.add("Hardcore Ironmans: " + hardcores);
        lines.add("Group Ironmans: " + groups);
        lines.add("Highest Idle: " + Time.ticksToLongDuration(idleTime));
        var players = new ArrayList(player.getWorld().getPlayers());
        Collections.sort(players, new Comparator() {
            compare: function(p1, p2) {
                return Integer.compare(p1.getIdleTime(), p2.getIdleTime());
            }
        });
        //Mapping region ids -> location name would be so much better, to do
        for each (var player2 in players) {
            var title = player2.getMessaging().getIconImage();
            var username = player2.getUsername();
            if (player.getRights() == 0) {
                username = "Hidden";
            }
            var location = "Dungeon";
            if (player2.getX() >= 1562 && player2.getY() >= 3471 && player2.getX() <= 1658
                    && player2.getY() <= 3519) {
                location = "Woodcutting Guild";
            } else if (player2.getX() >= 1710 && player2.getY() >= 3435 && player2.getX() <= 1875
                    && player2.getY() <= 3473) {
                location = "Sand Crabs";
            } else if (player2.getX() >= 1808 && player2.getY() >= 3480 && player2.getX() <= 1821
                    && player2.getY() <= 3493) {
                location = "Hosidius Farm";
            } else if (player2.getX() >= 1740 && player2.getY() >= 3670 && player2.getX() <= 1865
                    && player2.getY() <= 3804) {
                location = "Piscarilius House";
            } else if (player2.getX() >= 1143 && player2.getY() >= 3311 && player2.getX() <= 2001
                    && player2.getY() <= 4099) {
                location = "Great Kourend";
            } else if (player2.getX() >= 2045 && player2.getY() >= 3837 && player2.getX() <= 2186
                    && player2.getY() <= 3969) {
                location = "Lunar Isle";
            } else if (player2.getX() >= 2171 && player2.getY() >= 3781 && player2.getX() <= 2238
                    && player2.getY() <= 3842) {
                location = "Pirate's Cove";
            } else if (player2.getX() >= 2303 && player2.getY() >= 3776 && player2.getX() <= 2367
                    && player2.getY() <= 3821) {
                location = "Neitiznot";
            } else if (player2.getX() >= 2368 && player2.getY() >= 3776 && player2.getX() <= 2435
                    && player2.getY() <= 3827) {
                location = "Jatizso";
            } else if (player2.getX() >= 2368 && player2.getY() >= 3844 && player2.getX() <= 2381
                    && player2.getY() <= 3858) {
                location = "Fremennik Isles Small Mine";
            } else if (player2.getX() >= 2297 && player2.getY() >= 3772 && player2.getX() <= 2439
                    && player2.getY() <= 3906) {
                location = "Fremennik Isles";
            } else if (player2.getX() >= 2490 && player2.getY() >= 3710 && player2.getX() <= 2565
                    && player2.getY() <= 3772) {
                location = "Waterbirth Island";
            } else if (player2.getX() >= 2483 && player2.getY() >= 3811 && player2.getX() <= 2636
                    && player2.getY() <= 3928) {
                location = "Miscellania";
            } else if (player2.getX() >= 2602 && player2.getY() >= 2552 && player2.getX() <= 2710
                    && player2.getY() <= 2683) {
                location = "Pest Control";
            } else if (player2.getX() >= 2688 && player2.getY() >= 2686 && player2.getX() <= 2824
                    && player2.getY() <= 2816) {
                location = "Ape Atoll";
            } else if (player2.getX() >= 2882 && player2.getY() >= 2694 && player2.getX() <= 2943
                    && player2.getY() <= 2747) {
                location = "Crash Island";
            } else if (player2.getX() >= 3770 && player2.getY() >= 2812 && player2.getX() <= 3844
                    && player2.getY() <= 2879) {
                location = "Harmony Island";
            } else if (player2.getX() >= 3635 && player2.getY() >= 2920 && player2.getX() <= 3866
                    && player2.getY() <= 3077) {
                location = "Mos Le'Harmless";
            } else if (player2.getX() >= 2807 && player2.getY() >= 3218 && player2.getX() <= 2874
                    && player2.getY() <= 3312) {
                location = "Crandor";
            } else if (player2.getX() >= 2756 && player2.getY() >= 3268 && player2.getX() <= 2800
                    && player2.getY() <= 3295) {
                location = "Fishing Platform";
            } else if (player2.getX() >= 2800 && player2.getY() >= 3327 && player2.getX() <= 2877
                    && player2.getY() <= 3394) {
                location = "Entrana";
            } else if (player2.getX() >= 3043 && player2.getY() >= 3060 && player2.getX() <= 3157
                    && player2.getY() <= 3134) {
                location = "Tutorial Island";
            } else if (player2.getX() >= 2426 && player2.getY() >= 2812 && player2.getX() <= 2478
                    && player2.getY() <= 2875) {
                location = "Myth's Guild";
            } else if (player2.getX() >= 2426 && player2.getY() >= 2812 && player2.getX() <= 2478
                    && player2.getY() <= 2875) {
                location = "Myth's Guild";
            } else if (player2.getX() >= 2537 && player2.getY() >= 2837 && player2.getX() <= 2607
                    && player2.getY() <= 2876) {
                location = "Corsair Cove";
            } else if (player2.getX() >= 2489 && player2.getY() >= 2877 && player2.getX() <= 2626
                    && player2.getY() <= 2948) {
                location = "Feldip Hills Hunter";
            } else if (player2.getX() >= 2363 && player2.getY() >= 3066 && player2.getX() <= 2476
                    && player2.getY() <= 3141) {
                location = "Castle Wars";
            } else if (player2.getX() >= 2312 && player2.getY() >= 3144 && player2.getX() <= 2362
                    && player2.getY() <= 3199) {
                location = "Lleyta";
            } else if (player2.getX() >= 2178 && player2.getY() >= 3037 && player2.getX() <= 2223
                    && player2.getY() <= 3074) {
                location = "Zul-Andra";
            } else if (player2.getX() >= 2256 && player2.getY() >= 3063 && player2.getX() <= 2280
                    && player2.getY() <= 3084) {
                location = "Zulrah's Shrine";
            } else if (player2.getX() >= 2139 && player2.getY() >= 3100 && player2.getX() <= 2226
                    && player2.getY() <= 3164) {
                location = "Tyras Camp";
            } else if (player2.getX() >= 2173 && player2.getY() >= 3230 && player2.getX() <= 2218
                    && player2.getY() <= 3265) {
                location = "Elf Camp";
            } else if (player2.getX() >= 2174 && player2.getY() >= 3268 && player2.getX() <= 2300
                    && player2.getY() <= 3390) {
                location = "Prifddinas";
            } else if (player2.getX() >= 2104 && player2.getY() >= 3113 && player2.getX() <= 2359
                    && player2.getY() <= 3458) {
                location = "Elven Land";
            } else if (player2.getX() >= 2467 && player2.getY() >= 3411 && player2.getX() <= 2492
                    && player2.getY() <= 3442) {
                location = "Gnome Agility";
            } else if (player2.getX() >= 2467 && player2.getY() >= 3411 && player2.getX() <= 2492
                    && player2.getY() <= 3442) {
                location = "Gnome Agility";
            } else if (player2.getX() >= 2371 && player2.getY() >= 3387 && player2.getX() <= 2504
                    && player2.getY() <= 3523) {
                location = "Tree Gnome Stronghold";
            } else if (player2.getX() >= 2527 && player2.getY() >= 3541 && player2.getX() <= 2554
                    && player2.getY() <= 3557) {
                location = "Barbarian Agility";
            } else if (player2.getX() >= 2496 && player2.getY() >= 3531 && player2.getX() <= 2563
                    && player2.getY() <= 3592) {
                location = "Barbarian Outpost";
            } else if (player2.getX() >= 2494 && player2.getY() >= 3462 && player2.getX() <= 2540
                    && player2.getY() <= 3535) {
                location = "Pyre Ship/Grotto";
            } else if (player2.getX() >= 2488 && player2.getY() >= 3596 && player2.getX() <= 2591
                    && player2.getY() <= 3653) {
                location = "Lighthouse";
            } else if (player2.getX() >= 2531 && player2.getY() >= 3070 && player2.getX() <= 2624
                    && player2.getY() <= 3111) {
                location = "Yanille";
            } else if (player2.getX() >= 2577 && player2.getY() >= 3393 && player2.getX() <= 2624
                    && player2.getY() <= 3428) {
                location = "Fishing Guild";
            } else if (player2.getX() >= 2605 && player2.getY() >= 3439 && player2.getX() <= 2624
                    && player2.getY() <= 3448) {
                location = "Fishing Guild Platform";
            } else if (player2.getX() >= 2681 && player2.getY() >= 3450 && player2.getX() <= 2742
                    && player2.getY() <= 3517) {
                location = "Seers' Village";
            } else if (player2.getX() >= 2597 && player2.getY() >= 3642 && player2.getX() <= 2695
                    && player2.getY() <= 3744) {
                location = "Rellekka";
            } else if (player2.getX() >= 2686 && player2.getY() >= 3746 && player2.getX() <= 2749
                    && player2.getY() <= 3809) {
                location = "Fremennik Hunter";
            } else if (player2.getX() >= 3286 && player2.getY() >= 3273 && player2.getX() <= 3313
                    && player2.getY() <= 3319) {
                location = "Al Kharid Mine";
            } else if (player2.getX() >= 3310 && player2.getY() >= 3197 && player2.getX() <= 3402
                    && player2.getY() <= 3287) {
                location = "Duel Arena";
            } else if (player2.getX() >= 3341 && player2.getY() >= 3122 && player2.getX() <= 3395
                    && player2.getY() <= 3181) {
                location = "Clan Wars";
            } else if (player2.getX() >= 3293 && player2.getY() >= 3105 && player2.getX() <= 3326
                    && player2.getY() <= 3135) {
                location = "Shantay Pass";
            } else if (player2.getX() >= 3190 && player2.getY() >= 3228 && player2.getX() <= 3196
                    && player2.getY() <= 3234) {
                location = "Lumbridge Farm";
            } else if (player2.getX() >= 3188 && player2.getY() >= 3188 && player2.getX() <= 3254
                    && player2.getY() <= 3260) {
                location = "Lumbridge";
            } else if (player2.getX() >= 3135 && player2.getY() >= 3135 && player2.getX() <= 3252
                    && player2.getY() <= 3213) {
                location = "Lumbridge Swamp";
            } else if (player2.getX() >= 3253 && player2.getY() >= 3135 && player2.getX() <= 3340
                    && player2.getY() <= 3222) {
                location = "Al Kharid";
            } else if (player2.getX() >= 3351 && player2.getY() >= 3289 && player2.getX() <= 3375
                    && player2.getY() <= 3325) {
                location = "Mage Training Arena";
            } else if (player2.getX() >= 3091 && player2.getY() >= 3143 && player2.getX() <= 3125
                    && player2.getY() <= 3209) {
                location = "Wizards' Tower";
            } else if (player2.getX() >= 2977 && player2.getY() >= 3102 && player2.getX() <= 3042
                    && player2.getY() <= 3190) {
                location = "Mudskipper Point";
            } else if (player2.getX() >= 2911 && player2.getY() >= 3192 && player2.getX() <= 2997
                    && player2.getY() <= 3263) {
                location = "Rimmington";
            } else if (player2.getX() >= 2900 && player2.getY() >= 3266 && player2.getX() <= 2944
                    && player2.getY() <= 3299) {
                location = "Crafting Guild";
            } else if (player2.getX() >= 3004 && player2.getY() >= 3191 && player2.getX() <= 3072
                    && player2.getY() <= 3263) {
                location = "Port Sarim";
            } else if (player2.getX() >= 3069 && player2.getY() >= 3229 && player2.getX() <= 3134
                    && player2.getY() <= 3299) {
                location = "Draynor Village";
            } else if (player2.getX() >= 2933 && player2.getY() >= 3307 && player2.getX() <= 3066
                    && player2.getY() <= 3396) {
                location = "Falador";
            } else if (player2.getX() >= 3012 && player2.getY() >= 3280 && player2.getX() <= 3069
                    && player2.getY() <= 3314) {
                location = "Falador Farm";
            } else if (player2.getX() >= 2788 && player2.getY() >= 3406 && player2.getX() <= 2865
                    && player2.getY() <= 3470) {
                location = "Catherby";
            } else if (player2.getX() >= 2831 && player2.getY() >= 3533 && player2.getX() <= 2879
                    && player2.getY() <= 3556) {
                location = "Warriors' Guild";
            } else if (player2.getX() >= 3006 && player2.getY() >= 3438 && player2.getX() <= 3026
                    && player2.getY() <= 3455) {
                location = "Dwarven Mine";
            } else if (player2.getX() >= 3070 && player2.getY() >= 3404 && player2.getX() <= 3105
                    && player2.getY() <= 3449) {
                location = "Barbarian Village";
            } else if (player2.getX() >= 3135 && player2.getY() >= 3442 && player2.getX() <= 3149
                    && player2.getY() <= 3454) {
                location = "Cooks' Guild";
            } else if (player2.getX() >= 3136 && player2.getY() >= 3466 && player2.getX() <= 3197
                    && player2.getY() <= 3518) {
                location = "Grand Exchange";
            } else if (player2.getX() >= 3040 && player2.getY() >= 3471 && player2.getX() <= 3064
                    && player2.getY() <= 3510) {
                location = "Edgeville Monastery";
            } else if (player2.getX() >= 3065 && player2.getY() >= 3461 && player2.getX() <= 3135
                    && player2.getY() <= 3520) {
                location = "Edgeville";
            } else if (player2.getX() >= 3226 && player2.getY() >= 3456 && player2.getX() <= 3232
                    && player2.getY() <= 3462) {
                location = "Varrock Farm";
            } else if (player2.getX() >= 3170 && player2.getY() >= 3359 && player2.getX() <= 3185
                    && player2.getY() <= 3380) {
                location = "Varrock South West Mine";
            } else if (player2.getX() >= 3276 && player2.getY() >= 3354 && player2.getX() <= 3296
                    && player2.getY() <= 3371) {
                location = "Varrock South East Mine";
            } else if (player2.getX() >= 3173 && player2.getY() >= 3373 && player2.getX() <= 3291
                    && player2.getY() <= 3508) {
                location = "Varrock";
            } else if (player2.getX() >= 3401 && player2.getY() >= 3527 && player2.getX() <= 3454
                    && player2.getY() <= 3582) {
                location = "Slayer Tower";
            } else if (player2.getX() >= 3466 && player2.getY() >= 3459 && player2.getX() <= 3521
                    && player2.getY() <= 3515) {
                location = "Canifis";
            } else if (player2.getX() >= 3544 && player2.getY() >= 3266 && player2.getX() <= 3585
                    && player2.getY() <= 3317) {
                location = "Barrows";
            } else if (player2.getX() >= 3423 && player2.getY() >= 3202 && player2.getX() <= 3469
                    && player2.getY() <= 3258) {
                location = "Abandoned Mine";
            } else if (player2.getX() >= 2487 && player2.getY() >= 3177 && player2.getX() <= 2492
                    && player2.getY() <= 3182) {
                location = "Tree Gnome Village Farm";
            } else if (player2.getX() >= 2485 && player2.getY() >= 3132 && player2.getX() <= 2560
                    && player2.getY() <= 3205) {
                location = "Tree Gnome Village";
            } else if (player2.getX() >= 2561 && player2.getY() >= 3136 && player2.getX() <= 2620
                    && player2.getY() <= 3199) {
                location = "Fight Arena";
            } else if (player2.getX() >= 2590 && player2.getY() >= 3202 && player2.getX() <= 2622
                    && player2.getY() <= 3219) {
                location = "Ardougne Monastery";
            } else if (player2.getX() >= 2626 && player2.getY() >= 3138 && player2.getX() <= 2689
                    && player2.getY() <= 3192) {
                location = "Port Khazard";
            } else if (player2.getX() >= 2635 && player2.getY() >= 3359 && player2.getX() <= 2640
                    && player2.getY() <= 3368) {
                location = "Ardougne Master Farmer";
            } else if (player2.getX() >= 2615 && player2.getY() >= 3340 && player2.getX() <= 2678
                    && player2.getY() <= 3392) {
                location = "Ardougne Farm";
            } else if (player2.getX() >= 2431 && player2.getY() >= 3262 && player2.getX() <= 2559
                    && player2.getY() <= 3336) {
                location = "West Ardougne";
            } else if (player2.getX() >= 2560 && player2.getY() >= 3254 && player2.getX() <= 2688
                    && player2.getY() <= 3391) {
                location = "East Ardougne";
            } else if (player2.getX() >= 2750 && player2.getY() >= 2879 && player2.getX() <= 2988
                    && player2.getY() <= 2942) {
                location = "Kharazi Jungle";
            } else if (player2.getX() >= 2815 && player2.getY() >= 2941 && player2.getX() <= 2881
                    && player2.getY() <= 3008) {
                location = "Shilo Village";
            } else if (player2.getX() >= 2815 && player2.getY() >= 2941 && player2.getX() <= 2881
                    && player2.getY() <= 3008) {
                location = "Shilo Village";
            } else if (player2.getX() >= 2945 && player2.getY() >= 3014 && player2.getX() <= 3005
                    && player2.getY() <= 3070) {
                location = "Karamja Ship Yard";
            } else if (player2.getX() >= 2752 && player2.getY() >= 2961 && player2.getX() <= 2779
                    && player2.getY() <= 2991) {
                location = "Cairn Isle";
            } else if (player2.getX() >= 2770 && player2.getY() >= 3050 && player2.getX() <= 2820
                    && player2.getY() <= 3079) {
                location = "Tai Bwo Wannai";
            } else if (player2.getX() >= 2818 && player2.getY() >= 3136 && player2.getX() <= 2964
                    && player2.getY() <= 3207) {
                location = "Musa Point";
            } else if (player2.getX() >= 2639 && player2.getY() >= 3210 && player2.getX() <= 2659
                    && player2.getY() <= 3226) {
                location = "Tower of Life";
            } else if (player2.getX() >= 2685 && player2.getY() >= 3256 && player2.getX() <= 2637
                    && player2.getY() <= 3204) {
                location = "Ardougne Necromancer";
            } else if (player2.getX() >= 2697 && player2.getY() >= 3134 && player2.getX() <= 2817
                    && player2.getY() <= 3248) {
                location = "Brimhaven";
            } else if (player2.getX() >= 2746 && player2.getY() >= 2880 && player2.getX() <= 2991
                    && player2.getY() <= 3137) {
                location = "Karamja";
            } else if (player2.getX() >= 2915 && player2.getY() >= 3473 && player2.getX() <= 2935
                    && player2.getY() <= 3492) {
                location = "Druids' Circle";
            } else if (player2.getX() >= 2927 && player2.getY() >= 3508 && player2.getX() <= 2945
                    && player2.getY() <= 3523) {
                location = "Chaos Temple";
            } else if (player2.getX() >= 2882 && player2.getY() >= 3503 && player2.getX() <= 2903
                    && player2.getY() <= 3519) {
                location = "Heroes' Guild";
            } else if (player2.getX() >= 2942 && player2.getY() >= 3479 && player2.getX() <= 2971
                    && player2.getY() <= 3519) {
                location = "Goblin Village";
            } else if (player2.getX() >= 2933 && player2.getY() >= 3435 && player2.getX() <= 2939
                    && player2.getY() <= 3441) {
                location = "Taverley Farm";
            } else if (player2.getX() >= 2874 && player2.getY() >= 3407 && player2.getX() <= 2942
                    && player2.getY() <= 3455) {
                location = "Taverley";
            } else if (player2.getX() >= 3080 && player2.getY() >= 3328 && player2.getX() <= 3130
                    && player2.getY() <= 3389) {
                location = "Draynor Manor";
            } else if (player2.getX() >= 2471 && player2.getY() >= 2949 && player2.getX() <= 2654
                    && player2.getY() <= 3012) {
                location = "Feldip Hills";
            } else if (player2.getX() >= 2446 && player2.getY() >= 3013 && player2.getX() <= 2589
                    && player2.getY() <= 3069) {
                location = "Gu'Tunoth";
            } else if (player2.getX() >= 2440 && player2.getY() >= 3212 && player2.getX() <= 2484
                    && player2.getY() <= 3260) {
                location = "Red Salamanders";
            } else if (player2.getX() >= 2305 && player2.getY() >= 3661 && player2.getX() <= 2364
                    && player2.getY() <= 3705) {
                location = "Piscatoris Fishing Colony";
            } else if (player2.getX() >= 2364 && player2.getY() >= 3573 && player2.getX() <= 2394
                    && player2.getY() <= 3620) {
                location = "Piscatoris Falconer";
            } else if (player2.getX() >= 2302 && player2.getY() >= 3458 && player2.getX() <= 2367
                    && player2.getY() <= 3513) {
                location = "Eagles' Peak";
            } else if (player2.getX() >= 2259 && player2.getY() >= 3460 && player2.getX() <= 2405
                    && player2.getY() <= 3665) {
                location = "Piscatoris";
            } else if (player2.getX() >= 2717 && player2.getY() >= 3350 && player2.getX() <= 2739
                    && player2.getY() <= 3387) {
                location = "Legends' Guild";
            } else if (player2.getX() >= 2840 && player2.getY() >= 3573 && player2.getX() <= 2886
                    && player2.getY() <= 3610) {
                location = "Death Plateau";
            } else if (player2.getX() >= 2906 && player2.getY() >= 3733 && player2.getX() <= 2933
                    && player2.getY() <= 3758) {
                location = "God Wars";
            } else if (player2.getX() >= 3182 && player2.getY() >= 3351 && player2.getX() <= 3199
                    && player2.getY() <= 3365) {
                location = "Champions' Guild";
            } else if (player2.getX() >= 3460 && player2.getY() >= 3257 && player2.getX() <= 3525
                    && player2.getY() <= 3313) {
                location = "Mort'ton";
            } else if (player2.getX() >= 3473 && player2.getY() >= 3161 && player2.getX() <= 3538
                    && player2.getY() <= 3245) {
                location = "Burgh de Rott";
            } else if (player2.getX() >= 3530 && player2.getY() >= 3426 && player2.getX() <= 3580
                    && player2.getY() <= 3453) {
                location = "Swamp Lizards";
            } else if (player2.getX() >= 3650 && player2.getY() >= 3509 && player2.getX() <= 3669
                    && player2.getY() <= 3528) {
                location = "Ectofuntus";
            } else if (player2.getX() >= 3582 && player2.getY() >= 3513 && player2.getX() <= 3637
                    && player2.getY() <= 3546) {
                location = "Phasmatys Farm";
            } else if (player2.getX() >= 3648 && player2.getY() >= 3452 && player2.getX() <= 3712
                    && player2.getY() <= 3547) {
                location = "Port Phasmatys";
            } else if (player2.getX() >= 3140 && player2.getY() >= 2956 && player2.getX() <= 3198
                    && player2.getY() <= 3000) {
                location = "Bandit Camp";
            } else if (player2.getX() >= 3143 && player2.getY() >= 3016 && player2.getX() <= 3196
                    && player2.getY() <= 3060) {
                location = "Bedabin Camp";
            } else if (player2.getX() >= 3390 && player2.getY() >= 3073 && player2.getX() <= 3419
                    && player2.getY() <= 3131) {
                location = "Desert Hunter";
            } else if (player2.getX() >= 3768 && player2.getY() >= 3514 && player2.getX() <= 3846
                    && player2.getY() <= 3581) {
                location = "Dragontooth Island";
            } else if (player2.getX() >= 3628 && player2.getY() >= 3690 && player2.getX() <= 3858
                    && player2.getY() <= 3913) {
                location = "Fossil Island";
            } else if (player2.getX() >= 2753 && player2.getY() >= 3648 && player2.getX() <= 2863
                    && player2.getY() <= 3706) {
                location = "Troll Stronghold";
            } else if (player2.getX() >= 2864 && player2.getY() >= 3648 && player2.getX() <= 2921
                    && player2.getY() <= 3706) {
                location = "Trollheim";
            } else if (player2.getController().inWilderness()) {
                location = "Wilderness";
            } else if (player2.getController().inPvPWorld()) {
                location = "PvP World";
            } else if (player2.getX() >= 1137 && player2.getY() >= 2491 && player2.getX() <= 3905
                    && player2.getY() <= 4163) {
                location = "Mainland";
            } else if (player2.getX() >= 2368 && player2.getY() >= 5055 && player2.getX() <= 2429
                    && player2.getY() <= 5119) {
                location = "Fight Cave";
            } else if (player2.getX() >= 2373 && player2.getY() >= 5127 && player2.getX() <= 2422
                    && player2.getY() <= 5175) {
                location = "Fight Pit";
            } else if (player2.getX() >= 2368 && player2.getY() >= 5058 && player2.getX() <= 2557
                    && player2.getY() <= 5183) {
                location = "TzHaar";
            } else if (player2.getX() >= 1721 && player2.getY() >= 5122 && player2.getX() <= 1799
                    && player2.getY() <= 5254) {
                location = "Mole Lair";
            } else if (player2.getX() >= 1602 && player2.getY() >= 5311 && player2.getX() <= 1801
                    && player2.getY() <= 5382) {
                location = "Ancient Cavern";
            } else if (player2.getX() >= 2245 && player2.getY() >= 5315 && player2.getX() <= 2298
                    && player2.getY() <= 5374) {
                location = "The Inferno";
            } else if (player2.getX() >= 3006 && player2.getY() >= 5565 && player2.getX() <= 3074
                    && player2.getY() <= 5636) {
                location = "Ourania Cave";
            } else if (player2.getX() >= 2823 && player2.getY() >= 9541 && player2.getX() <= 2870
                    && player2.getY() <= 9601) {
                location = "Karamja Dungeon";
            } else if (player2.getX() >= 2825 && player2.getY() >= 9602 && player2.getX() <= 2868
                    && player2.getY() <= 9662) {
                location = "Crandor Dungeon";
            } else if (player2.getX() >= 2981 && player2.getY() >= 9535 && player2.getX() <= 3084
                    && player2.getY() <= 9606) {
                location = "Asgarnian Ice Dungeon";
            } else if (player2.getX() >= 2528 && player2.getY() >= 9860 && player2.getX() <= 2614
                    && player2.getY() <= 9923) {
                location = "Waterfall Dungeon";
            } else if (player2.getX() >= 2233 && player2.getY() >= 9978 && player2.getX() <= 2311
                    && player2.getY() <= 10052) {
                location = "Kraken Cove";
            } else if (player2.getX() >= 2883 && player2.getY() >= 9880 && player2.getX() <= 2945
                    && player2.getY() <= 9920) {
                location = "Heroes' Guild Dungeon";
            } else if (player2.getX() >= 2812 && player2.getY() >= 9896 && player2.getX() <= 2897
                    && player2.getY() <= 9980) {
                location = "Ice Queen's Dungeon";
            } else if (player2.getX() >= 2689 && player2.getY() >= 9951 && player2.getX() <= 2813
                    && player2.getY() <= 10045) {
                location = "Fremennik Slayer Dungeon";
            } else if (player2.getX() >= 2431 && player2.getY() >= 10109 && player2.getX() <= 2561
                    && player2.getY() <= 10179) {
                location = "Waterbirth Dungeon";
            } else if (player2.getX() >= 2812 && player2.getY() >= 9670 && player2.getX() <= 2970
                    && player2.getY() <= 9855) {
                location = "Taverley Dungeon";
            } else if (player2.getX() >= 3200 && player2.getY() >= 9344 && player2.getX() <= 3330
                    && player2.getY() <= 9407) {
                location = "Smoke Dungeon";
            } else if (player2.getX() >= 3523 && player2.getY() >= 9665 && player2.getX() <= 3580
                    && player2.getY() <= 9727) {
                location = "Barrows Dungeon";
            } else if (player2.getX() >= 2625 && player2.getY() >= 9409 && player2.getX() <= 2753
                    && player2.getY() <= 9599) {
                location = "Brimhaven Dungeon";
            } else if (player2.getX() >= 2495 && player2.getY() >= 9981 && player2.getX() <= 2546
                    && player2.getY() <= 10045) {
                location = "Lighthouse Dungeon";
            } else if (player2.getX() >= 1588 && player2.getY() >= 9973 && player2.getX() <= 1749
                    && player2.getY() <= 10117) {
                location = "Catacombs of Kourend";
            } else if (player2.getX() >= 1401 && player2.getY() >= 10047 && player2.getX() <= 1475
                    && player2.getY() <= 10111) {
                location = "Chasm of Fire";
            } else if (player2.getX() >= 3579 && player2.getY() >= 10174 && player2.getX() <= 3655
                    && player2.getY() <= 10310) {
                location = "Fossil Island Wyverns";
            } else if (player2.getX() >= 3254 && player2.getY() >= 5120 && player2.getX() <= 3374
                    && player2.getY() <= 5482) {
                location = "Chambers of Xeric";
            } else if (player2.getX() >= 3010 && player2.getY() >= 9697 && player2.getX() <= 3057
                    && player2.getY() <= 9756) {
                location = "Mining Guild";
            } else if (player2.getX() >= 2971 && player2.getY() >= 9757 && player2.getX() <= 3061
                    && player2.getY() <= 9854) {
                location = "Dwarvern Mine Dungeon";
            } else if (player2.getX() >= 2881 && player2.getY() >= 4802 && player2.getX() <= 2940
                    && player2.getY() <= 4862) {
                location = "Rune Essence Mine";
            }
            lines.add(title + username + ": on: " + Time.ticksToLongDuration(player2.getTotalTicks())
                    + ", map: " + Time.ticksToLongDuration(player2.getLastMapUpdate())
                    + ", idle: " + Time.ticksToLongDuration(player2.getIdleTime()) + ", loc: " + location);
        }
        Dialogue.openScroll(player, "Game Modes Online", Utils.toStringArray(lines));
    }
}

DecodedPacketWidget.prototype.widget_259 = function(player, index, childID, slot, itemID) {
    if (player.isLocked()) {
        return;
    }
    if (childID == 2) {
        if (slot == 2) {
            AchievementDiary.getDiary(AchievementDiary.Name.FALADOR).sendTaskList(player);
        } else {
            player.getGameEncoder().sendMessage("This diary is currently unavailable.");
        }
    }
}
