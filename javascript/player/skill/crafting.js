var LEATHER_COST = 100;
var HARD_LEATHER_COST = 300;
var SNAKESKIN_LEATHER_COST = 1500;
var GREEN_DRAGON_LEATHER_COST = 2000;
var BLUE_DRAGON_LEATHER_COST = 2000;
var RED_DRAGON_LEATHER_COST = 2000;
var BLACK_DRAGON_LEATHER_COST = 2000;

var ENTRIES = Utils.toList(
    new SkillContainer.Entry().setLevel(41).setXP(70).setAnimation(7386)
        .setTool(new Item(ItemId.HAMMER, 1))
        .setConsume(new RandomItem(ItemId.OAK_SHIELD, 1), new RandomItem(ItemId.HARD_LEATHER, 2),
            new RandomItem(ItemId.BRONZE_NAILS, 15))
        .setCreate(new RandomItem(ItemId.HARD_LEATHER_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(56).setXP(100).setAnimation(7387)
        .setTool(new Item(ItemId.HAMMER, 1))
        .setConsume(new RandomItem(ItemId.WILLOW_SHIELD, 1), new RandomItem(ItemId.SNAKESKIN, 2),
            new RandomItem(ItemId.IRON_NAILS, 15))
        .setCreate(new RandomItem(ItemId.SNAKESKIN_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(62).setXP(124).setAnimation(7831)
        .setTool(new Item(ItemId.HAMMER, 1))
        .setConsume(new RandomItem(ItemId.MAPLE_SHIELD, 1), new RandomItem(ItemId.GREEN_DRAGON_LEATHER, 2),
            new RandomItem(ItemId.STEEL_NAILS, 15))
        .setCreate(new RandomItem(ItemId.GREEN_DHIDE_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(69).setXP(140).setAnimation(7832)
        .setTool(new Item(ItemId.HAMMER, 1))
        .setConsume(new RandomItem(ItemId.YEW_SHIELD, 1), new RandomItem(ItemId.BLUE_DRAGON_LEATHER, 2),
            new RandomItem(ItemId.MITHRIL_NAILS, 15))
        .setCreate(new RandomItem(ItemId.BLUE_DHIDE_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(76).setXP(156).setAnimation(7833)
        .setTool(new Item(ItemId.HAMMER, 1))
        .setConsume(new RandomItem(ItemId.MAGIC_SHIELD, 1), new RandomItem(ItemId.RED_DRAGON_LEATHER, 2),
            new RandomItem(ItemId.ADAMANTITE_NAILS, 15))
        .setCreate(new RandomItem(ItemId.RED_DHIDE_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(83).setXP(172).setAnimation(7834)
        .setTool(new Item(ItemId.HAMMER, 1))
        .setConsume(new RandomItem(ItemId.REDWOOD_SHIELD, 1), new RandomItem(ItemId.BLACK_DRAGON_LEATHER, 2),
            new RandomItem(ItemId.RUNE_NAILS, 15))
        .setCreate(new RandomItem(ItemId.BLACK_DHIDE_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(14).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.LEATHER_GLOVES, 1)),
    new SkillContainer.Entry().setLevel(7).setXP(16).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.LEATHER_BOOTS, 1)),
    new SkillContainer.Entry().setLevel(9).setXP(19).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.LEATHER_COWL, 1)),
    new SkillContainer.Entry().setLevel(11).setXP(22).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.LEATHER_VAMBRACES, 1)),
    new SkillContainer.Entry().setLevel(14).setXP(25).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.LEATHER_BODY, 1)),
    new SkillContainer.Entry().setLevel(18).setXP(27).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.LEATHER_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(38).setXP(37).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.COIF, 1)),
    new SkillContainer.Entry().setLevel(28).setXP(35).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.HARD_LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.HARDLEATHER_BODY, 1)),
    new SkillContainer.Entry().setLevel(57).setXP(62).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.GREEN_DRAGON_LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.GREEN_DHIDE_VAMB, 1)),
    new SkillContainer.Entry().setLevel(60).setXP(124).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.GREEN_DRAGON_LEATHER, 2), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.GREEN_DHIDE_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(63).setXP(186).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.GREEN_DRAGON_LEATHER, 3), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.GREEN_DHIDE_BODY, 1)),
    new SkillContainer.Entry().setLevel(66).setXP(70).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.BLUE_DRAGON_LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.BLUE_DHIDE_VAMB, 1)),
    new SkillContainer.Entry().setLevel(68).setXP(140).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.BLUE_DRAGON_LEATHER, 2), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.BLUE_DHIDE_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(71).setXP(210).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.BLUE_DRAGON_LEATHER, 3), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.BLUE_DHIDE_BODY, 1)),
    new SkillContainer.Entry().setLevel(73).setXP(78).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.RED_DRAGON_LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.RED_DHIDE_VAMB, 1)),
    new SkillContainer.Entry().setLevel(75).setXP(156).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.RED_DRAGON_LEATHER, 2), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.RED_DHIDE_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(77).setXP(234).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.RED_DRAGON_LEATHER, 3), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.RED_DHIDE_BODY, 1)),
    new SkillContainer.Entry().setLevel(79).setXP(86).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.BLACK_DRAGON_LEATHER, 1), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.BLACK_DHIDE_VAMB, 1)),
    new SkillContainer.Entry().setLevel(82).setXP(172).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.BLACK_DRAGON_LEATHER, 2), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.BLACK_DHIDE_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(84).setXP(258).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.BLACK_DRAGON_LEATHER, 3), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.BLACK_DHIDE_BODY, 1)),
    new SkillContainer.Entry().setLevel(45).setXP(30).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.SNAKESKIN, 6), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.SNAKESKIN_BOOTS, 1)),
    new SkillContainer.Entry().setLevel(47).setXP(35).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.SNAKESKIN, 8), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.SNAKESKIN_VAMBRACES, 1)),
    new SkillContainer.Entry().setLevel(48).setXP(45).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.SNAKESKIN, 5), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.SNAKESKIN_BANDANA, 1)),
    new SkillContainer.Entry().setLevel(51).setXP(50).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.SNAKESKIN, 12), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.SNAKESKIN_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(53).setXP(55).setAnimation(1249)
        .setTool(new Item(ItemId.NEEDLE, 1))
        .setConsume(new RandomItem(ItemId.SNAKESKIN, 15), new RandomItem(ItemId.THREAD, 1))
        .setCreate(new RandomItem(ItemId.SNAKESKIN_BODY, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(15).setAnimation(886)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.UNCUT_OPAL, 1))
        .setCreate(new RandomItem(ItemId.OPAL, 1)),
    new SkillContainer.Entry().setLevel(13).setXP(20).setAnimation(889)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.UNCUT_JADE, 1))
        .setCreate(new RandomItem(ItemId.JADE, 1)),
    new SkillContainer.Entry().setLevel(16).setXP(25).setAnimation(887)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.UNCUT_RED_TOPAZ, 1))
        .setCreate(new RandomItem(ItemId.RED_TOPAZ, 1)),
    new SkillContainer.Entry().setLevel(20).setXP(50).setAnimation(888)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.UNCUT_SAPPHIRE, 1))
        .setCreate(new RandomItem(ItemId.SAPPHIRE, 1)),
    new SkillContainer.Entry().setLevel(27).setXP(68).setAnimation(889)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.UNCUT_EMERALD, 1))
        .setCreate(new RandomItem(ItemId.EMERALD, 1)),
    new SkillContainer.Entry().setLevel(34).setXP(85).setAnimation(887)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.UNCUT_RUBY, 1))
        .setCreate(new RandomItem(ItemId.RUBY, 1)),
    new SkillContainer.Entry().setLevel(43).setXP(108).setAnimation(886)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.UNCUT_DIAMOND, 1))
        .setCreate(new RandomItem(ItemId.DIAMOND, 1)),
    new SkillContainer.Entry().setLevel(55).setXP(138).setAnimation(885)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.UNCUT_DRAGONSTONE, 1))
        .setCreate(new RandomItem(ItemId.DRAGONSTONE, 1)),
    new SkillContainer.Entry().setLevel(67).setXP(168).setAnimation(2717)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.UNCUT_ONYX, 1))
        .setCreate(new RandomItem(ItemId.ONYX, 1)),
    new SkillContainer.Entry().setLevel(89).setXP(200).setAnimation(2717)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.UNCUT_ZENYTE, 1))
        .setCreate(new RandomItem(ItemId.ZENYTE, 1)),
    new SkillContainer.Entry().setLevel(83).setXP(60).setAnimation(887)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(Mining.AMETHYST_ID, 1))
        .setCreate(new RandomItem(ItemId.AMETHYST_BOLT_TIPS, 15)),
    new SkillContainer.Entry().setLevel(85).setXP(60).setAnimation(887)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(Mining.AMETHYST_ID, 1))
        .setCreate(new RandomItem(ItemId.AMETHYST_ARROWTIPS, 15)),
    new SkillContainer.Entry().setLevel(87).setXP(60).setAnimation(887)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(Mining.AMETHYST_ID, 1))
        .setCreate(new RandomItem(ItemId.AMETHYST_JAVELIN_HEADS, 5)),
    new SkillContainer.Entry().setLevel(5).setXP(15).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1))
        .setCreate(new RandomItem(ItemId.GOLD_RING, 1)),
    new SkillContainer.Entry().setLevel(6).setXP(20).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1))
        .setCreate(new RandomItem(ItemId.GOLD_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(7).setXP(25).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1))
        .setCreate(new RandomItem(ItemId.GOLD_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(8).setXP(30).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1))
        .setCreate(new RandomItem(ItemId.GOLD_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(20).setXP(40).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.SAPPHIRE, 1))
        .setCreate(new RandomItem(ItemId.SAPPHIRE_RING, 1)),
    new SkillContainer.Entry().setLevel(22).setXP(55).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.SAPPHIRE, 1))
        .setCreate(new RandomItem(ItemId.SAPPHIRE_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(23).setXP(60).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.SAPPHIRE, 1))
        .setCreate(new RandomItem(ItemId.SAPPHIRE_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(24).setXP(65).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.SAPPHIRE, 1))
        .setCreate(new RandomItem(ItemId.SAPPHIRE_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(27).setXP(55).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.EMERALD, 1))
        .setCreate(new RandomItem(ItemId.EMERALD_RING, 1)),
    new SkillContainer.Entry().setLevel(29).setXP(60).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.EMERALD, 1))
        .setCreate(new RandomItem(ItemId.EMERALD_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(30).setXP(65).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.EMERALD, 1))
        .setCreate(new RandomItem(ItemId.EMERALD_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(31).setXP(70).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.EMERALD, 1))
        .setCreate(new RandomItem(ItemId.EMERALD_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(34).setXP(70).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.RUBY, 1))
        .setCreate(new RandomItem(ItemId.RUBY_RING, 1)),
    new SkillContainer.Entry().setLevel(40).setXP(75).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.RUBY, 1))
        .setCreate(new RandomItem(ItemId.RUBY_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(42).setXP(80).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.RUBY, 1))
        .setCreate(new RandomItem(ItemId.RUBY_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(50).setXP(85).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.RUBY, 1))
        .setCreate(new RandomItem(ItemId.RUBY_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(43).setXP(85).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.DIAMOND, 1))
        .setCreate(new RandomItem(ItemId.DIAMOND_RING, 1)),
    new SkillContainer.Entry().setLevel(56).setXP(90).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.DIAMOND, 1))
        .setCreate(new RandomItem(ItemId.DIAMOND_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(58).setXP(95).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.DIAMOND, 1))
        .setCreate(new RandomItem(ItemId.DIAMOND_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(70).setXP(100).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.DIAMOND, 1))
        .setCreate(new RandomItem(ItemId.DIAMOND_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(55).setXP(100).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.DRAGONSTONE, 1))
        .setCreate(new RandomItem(ItemId.DRAGONSTONE_RING, 1)),
    new SkillContainer.Entry().setLevel(72).setXP(105).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.DRAGONSTONE, 1))
        .setCreate(new RandomItem(ItemId.DRAGON_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(74).setXP(110).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.DRAGONSTONE, 1))
        .setCreate(new RandomItem(ItemId.DRAGONSTONE_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(80).setXP(150).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.DRAGONSTONE, 1))
        .setCreate(new RandomItem(ItemId.DRAGONSTONE_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(67).setXP(115).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.ONYX, 1))
        .setCreate(new RandomItem(ItemId.ONYX_RING, 1)),
    new SkillContainer.Entry().setLevel(82).setXP(120).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.ONYX, 1))
        .setCreate(new RandomItem(ItemId.ONYX_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(84).setXP(125).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.ONYX, 1))
        .setCreate(new RandomItem(ItemId.ONYX_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(90).setXP(165).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.ONYX, 1))
        .setCreate(new RandomItem(ItemId.ONYX_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(89).setXP(150).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.ZENYTE, 1))
        .setCreate(new RandomItem(ItemId.ZENYTE_RING, 1)),
    new SkillContainer.Entry().setLevel(92).setXP(165).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.ZENYTE, 1))
        .setCreate(new RandomItem(ItemId.ZENYTE_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(95).setXP(180).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.ZENYTE, 1))
        .setCreate(new RandomItem(ItemId.ZENYTE_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(98).setXP(200).setAnimation(899).setInterfaceId(WidgetId.MAKE_JEWELRY)
        .setTool(new Item(ItemId.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemId.GOLD_BAR, 1), new RandomItem(ItemId.ZENYTE, 1))
        .setCreate(new RandomItem(ItemId.ZENYTE_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(8).setXP(4)
        .setConsume(new RandomItem(ItemId.BALL_OF_WOOL, 1), new RandomItem(ItemId.GOLD_AMULET_U, 1))
        .setCreate(new RandomItem(ItemId.GOLD_AMULET, 1)),
    new SkillContainer.Entry().setLevel(24).setXP(4)
        .setConsume(new RandomItem(ItemId.BALL_OF_WOOL, 1), new RandomItem(ItemId.SAPPHIRE_AMULET_U, 1))
        .setCreate(new RandomItem(ItemId.SAPPHIRE_AMULET, 1)),
    new SkillContainer.Entry().setLevel(31).setXP(4)
        .setConsume(new RandomItem(ItemId.BALL_OF_WOOL, 1), new RandomItem(ItemId.EMERALD_AMULET_U, 1))
        .setCreate(new RandomItem(ItemId.EMERALD_AMULET, 1)),
    new SkillContainer.Entry().setLevel(50).setXP(4)
        .setConsume(new RandomItem(ItemId.BALL_OF_WOOL, 1), new RandomItem(ItemId.RUBY_AMULET_U, 1))
        .setCreate(new RandomItem(ItemId.RUBY_AMULET, 1)),
    new SkillContainer.Entry().setLevel(70).setXP(4)
        .setConsume(new RandomItem(ItemId.BALL_OF_WOOL, 1), new RandomItem(ItemId.DIAMOND_AMULET_U, 1))
        .setCreate(new RandomItem(ItemId.DIAMOND_AMULET, 1)),
    new SkillContainer.Entry().setLevel(80).setXP(4)
        .setConsume(new RandomItem(ItemId.BALL_OF_WOOL, 1), new RandomItem(ItemId.DRAGONSTONE_AMULET_U, 1))
        .setCreate(new RandomItem(ItemId.DRAGONSTONE_AMULET, 1)),
    new SkillContainer.Entry().setLevel(90).setXP(4)
        .setConsume(new RandomItem(ItemId.BALL_OF_WOOL, 1), new RandomItem(ItemId.ONYX_AMULET_U, 1))
        .setCreate(new RandomItem(ItemId.ONYX_AMULET, 1)),
    new SkillContainer.Entry().setLevel(98).setXP(4)
        .setConsume(new RandomItem(ItemId.BALL_OF_WOOL, 1), new RandomItem(ItemId.ZENYTE_AMULET_U, 1))
        .setCreate(new RandomItem(ItemId.ZENYTE_AMULET, 1)),
    new SkillContainer.Entry().setLevel(35).setXP(4)
        .setConsume(new RandomItem(ItemId.BALL_OF_WOOL, 1), new RandomItem(ItemId.SALVE_SHARD, 1))
        .setCreate(new RandomItem(ItemId.SALVE_AMULET, 1)),
    new SkillContainer.Entry().setLevel(54).setXP(100)
        .setConsume(new RandomItem(ItemId.BATTLESTAFF, 1), new RandomItem(ItemId.WATER_ORB, 1))
        .setCreate(new RandomItem(ItemId.WATER_BATTLESTAFF, 1)),
    new SkillContainer.Entry().setLevel(58).setXP(113)
        .setConsume(new RandomItem(ItemId.BATTLESTAFF, 1), new RandomItem(ItemId.EARTH_ORB, 1))
        .setCreate(new RandomItem(ItemId.EARTH_BATTLESTAFF, 1)),
    new SkillContainer.Entry().setLevel(62).setXP(125)
        .setConsume(new RandomItem(ItemId.BATTLESTAFF, 1), new RandomItem(ItemId.FIRE_ORB, 1))
        .setCreate(new RandomItem(ItemId.FIRE_BATTLESTAFF, 1)),
    new SkillContainer.Entry().setLevel(66).setXP(138)
        .setConsume(new RandomItem(ItemId.BATTLESTAFF, 1), new RandomItem(ItemId.AIR_ORB, 1))
        .setCreate(new RandomItem(ItemId.AIR_BATTLESTAFF, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(17).setAnimation(884)
        .setTool(new Item(ItemId.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemId.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemId.BEER_GLASS, 1)),
    new SkillContainer.Entry().setLevel(4).setXP(19).setAnimation(884)
        .setTool(new Item(ItemId.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemId.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemId.EMPTY_CANDLE_LANTERN, 1)),
    new SkillContainer.Entry().setLevel(12).setXP(25).setAnimation(884)
        .setTool(new Item(ItemId.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemId.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemId.EMPTY_OIL_LAMP, 1)),
    new SkillContainer.Entry().setLevel(33).setXP(35).setAnimation(884)
        .setTool(new Item(ItemId.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemId.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemId.VIAL, 1)),
    new SkillContainer.Entry().setLevel(42).setXP(42).setAnimation(884)
        .setTool(new Item(ItemId.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemId.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemId.EMPTY_FISHBOWL, 1)),
    new SkillContainer.Entry().setLevel(46).setXP(52).setAnimation(884)
        .setTool(new Item(ItemId.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemId.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemId.UNPOWERED_ORB, 1)),
    new SkillContainer.Entry().setLevel(49).setXP(55).setAnimation(884)
        .setTool(new Item(ItemId.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemId.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemId.LANTERN_LENS, 1)),
    new SkillContainer.Entry().setLevel(87).setXP(70).setAnimation(884)
        .setTool(new Item(ItemId.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemId.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemId.EMPTY_LIGHT_ORB, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(0)
        .setConsume(new RandomItem(ItemId.BULLSEYE_LANTERN_UNF, 1), new RandomItem(ItemId.LANTERN_LENS, 1))
        .setCreate(new RandomItem(ItemId.BULLSEYE_LANTERN_EMPTY, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(0)
        .setWidgetOnMapObject(4026)
        .setConsume(new RandomItem(ItemId.BULLSEYE_LANTERN_EMPTY, 1), new RandomItem(ItemId.SWAMP_TAR, 1))
        .setCreate(new RandomItem(ItemId.BULLSEYE_LANTERN, 1)),
    new SkillContainer.Entry().setLevel(52).setXP(120)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.SERPENTINE_VISAGE, 1))
        .setCreate(new RandomItem(ItemId.SERPENTINE_HELM_UNCHARGED, 1)),
    new SkillContainer.Entry().setLevel(59).setXP(0)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.MAGIC_FANG, 1), new RandomItem(ItemId.STAFF_OF_THE_DEAD, 1))
        .setCreate(new RandomItem(ItemId.TOXIC_STAFF_UNCHARGED, 1)),
    new SkillContainer.Entry().setLevel(59).setXP(0)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.MAGIC_FANG, 1), new RandomItem(ItemId.UNCHARGED_TRIDENT, 1))
        .setCreate(new RandomItem(ItemId.UNCHARGED_TOXIC_TRIDENT, 1)),
    new SkillContainer.Entry().setLevel(59).setXP(0)
        .setTool(new Item(ItemId.CHISEL, 1))
        .setConsume(new RandomItem(ItemId.MAGIC_FANG, 1), new RandomItem(ItemId.UNCHARGED_TRIDENT_E, 1))
        .setCreate(new RandomItem(ItemId.UNCHARGED_TOXIC_TRIDENT_E, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(0)
        .setConsume(new RandomItem(ItemId.ONYX, 1), new RandomItem(ItemId.ZENYTE_SHARD, 1))
        .setCreate(new RandomItem(ItemId.UNCUT_ZENYTE, 1))
);

skill = new SkillContainer() {
    getSkillId: function() {
        return Skills.CRAFTING;
    },

    getEntries: function() {
        return ENTRIES;
    },

    widgetHook: function(player, index, interfaceId, childId, slot, itemId) {
        if (interfaceId == WidgetId.TANNING) {
            var amount = 1;
            if (childId >= 124 && childId <= 130) {
                amount = -1;
            } else if (childId >= 132 && childId <= 138) {
                amount = -2;
            } else if (childId >= 140 && childId <= 146) {
                amount = 5;
            }
            var itemId = -1;
            if (childId == 124 || childId == 132 || childId == 140 || childId == 148) {
                itemId = ItemId.LEATHER;
            } else if (childId == 125 || childId == 133 || childId == 141 || childId == 149) {
                itemId = ItemId.HARD_LEATHER;
            } else if (childId == 126 || childId == 134 || childId == 142 || childId == 150) {
                itemId = ItemId.GREEN_DRAGON_LEATHER;
            } else if (childId == 127 || childId == 135 || childId == 143 || childId == 151) {
                itemId = ItemId.BLUE_DRAGON_LEATHER;
            } else if (childId == 128 || childId == 136 || childId == 144 || childId == 152) {
                itemId = ItemId.RED_DRAGON_LEATHER;
            } else if (childId == 129 || childId == 137 || childId == 145 || childId == 153) {
                itemId = ItemId.BLACK_DRAGON_LEATHER;
            } else if (childId == 130 || childId == 138 || childId == 146 || childId == 154) {
                itemId = ItemId.SNAKESKIN;
            }
            if (itemId == -1) {
                return true;
            }
            if (amount == -2) {
                var js = this;
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    execute: function(value) {
                        js.tanHide(player, itemId, value);
                    }
                });
            } else {
                this.tanHide(player, itemId, amount);
            }
            return true;
        } else if (interfaceId == WidgetId.MAKE_JEWELRY) {
            if (itemId == ItemId.GOLD_BRACELET_11068) {
                itemId = ItemId.GOLD_BRACELET
            } else if (itemId == ItemId.SAPPHIRE_BRACELET_11071) {
                itemId = ItemId.SAPPHIRE_BRACELET;
            } else if (itemId == ItemId.EMERALD_BRACELET_11078) {
                itemId = ItemId.EMERALD_BRACELET;
            } else if (itemId == ItemId.RUBY_BRACELET_11087) {
                itemId = ItemId.RUBY_BRACELET;
            } else if (itemId == ItemId.DIAMOND_BRACELET_11094) {
                itemId = ItemId.DIAMOND_BRACELET;
            } else if (itemId == ItemId.DRAGON_BRACELET) {
                itemId = ItemId.DRAGONSTONE_BRACELET;
            } else if (itemId == ItemId.ONYX_BRACELET_11132) {
                itemId = ItemId.ONYX_BRACELET;
            } else if (itemId == ItemId.ZENYTE_BRACELET_19492) {
                itemId = ItemId.ZENYTE_BRACELET;
            }
            var entry = skill.findEntryFromCreate(itemId);
            if (entry == null) {
                return true;
            }
            if (index == 0) {
                skill.startEvent(player, entry, 1);
            } else if (index == 1) {
                skill.startEvent(player, entry, 5);
            } else if (index == 2) {
                skill.startEvent(player, entry, 10);
            } else if (index == 3) {
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    execute: function(value) {
                        skill.startEvent(player, entry, value);
                    }
                });
            } else if (index == 4) {
                skill.startEvent(player, entry, 28);
            }
            return true;
        }
        return false;
    },

    widgetOnMapObjectHook: function(player, interfaceId, childId, slot, mapObject) {
        if (interfaceId == WidgetId.INVENTORY && mapObject.getDef().hasOption("smelt")) {
            var itemId = player.getInventory().getId(slot);
            if (itemId == ItemId.RING_MOULD || itemId == ItemId.NECKLACE_MOULD || itemId == ItemId.BRACELET_MOULD
                    || itemId == ItemId.AMULET_MOULD || itemId == ItemId.GOLD_BAR || itemId == ItemId.SAPPHIRE
                    || itemId == ItemId.EMERALD || itemId == ItemId.RUBY || itemId == ItemId.DIAMOND
                    || itemId == ItemId.DRAGONSTONE || itemId == ItemId.ONYX || itemId == ItemId.ZENYTE) {
                player.getWidgetManager().sendInteractiveOverlay(WidgetId.MAKE_JEWELRY);
                return true;
            }
        }
        return false;
    },

    npcOptionHook: function(player, index, npc) {
        if (npc.getId() == NpcId.TANNER) {
            this.openTanning(player);
            return true;
        }
        return false;
    },

    tanHide: function(player, craftItemId, amount) {
        var baseItemId = -1;
        var cost = -1;
        if (craftItemId == ItemId.LEATHER) {
            baseItemId = ItemId.COWHIDE;
            cost = LEATHER_COST;
        } else if (craftItemId == ItemId.HARD_LEATHER) {
            baseItemId = ItemId.COWHIDE;
            cost = HARD_LEATHER_COST;
        } else if (craftItemId == ItemId.GREEN_DRAGON_LEATHER) {
            baseItemId = ItemId.GREEN_DRAGONHIDE;
            cost = GREEN_DRAGON_LEATHER_COST;
        } else if (craftItemId == ItemId.BLUE_DRAGON_LEATHER) {
            baseItemId = ItemId.BLUE_DRAGONHIDE;
            cost = BLUE_DRAGON_LEATHER_COST;
        } else if (craftItemId == ItemId.RED_DRAGON_LEATHER) {
            baseItemId = ItemId.RED_DRAGONHIDE;
            cost = RED_DRAGON_LEATHER_COST;
        } else if (craftItemId == ItemId.BLACK_DRAGON_LEATHER) {
            baseItemId = ItemId.BLACK_DRAGONHIDE;
            cost = BLACK_DRAGON_LEATHER_COST;
        } else if (craftItemId == ItemId.SNAKESKIN) {
            baseItemId = ItemId.SNAKE_HIDE;
            cost = SNAKESKIN_LEATHER_COST;
        }
        if (baseItemId == -1 || cost == -1) {
            return;
        }
        if (player.getInventory().getCount(baseItemId) == 0) {
            baseItemId = ItemDef.getNotedId(baseItemId);
            craftItemId = ItemDef.getNotedId(craftItemId);
        }
        if (amount == -1) {
            amount = player.getInventory().getCount(baseItemId);
        }
        if (amount > player.getInventory().getCount(baseItemId)) {
            amount = player.getInventory().getCount(baseItemId);
        }
        if (baseItemId == -1 || craftItemId == -1 || amount == 0) {
            player.getGameEncoder().sendMessage("You don't have raw hide to do this.");
            return;
        }
        if (player.getInventory().getCount(ItemId.COINS) < amount * cost) {
            player.getGameEncoder().sendMessage("You don't have enough coins to do this.");
            return;
        }
        player.getInventory().deleteItem(ItemId.COINS, amount * cost);
        player.getInventory().deleteItem(baseItemId, amount);
        player.getInventory().addItem(craftItemId, amount);
        AchievementDiary.makeItemHooks(player, skill.getSkillId(), new RandomItem(craftItemId, amount), null, null);
    },

    openTanning: function(player) {
        player.getWidgetManager().sendInteractiveOverlay(WidgetId.TANNING);
        player.getGameEncoder().sendWidgetItemModel(WidgetId.TANNING, 100, ItemId.LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetId.TANNING, 101, ItemId.HARD_LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetId.TANNING, 102, ItemId.GREEN_DRAGON_LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetId.TANNING, 103, ItemId.BLUE_DRAGON_LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetId.TANNING, 104, ItemId.RED_DRAGON_LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetId.TANNING, 105, ItemId.BLACK_DRAGON_LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetId.TANNING, 106, ItemId.SNAKESKIN, 200);
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 108, "Leather");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 116, Utils.formatNumber(LEATHER_COST) + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 109, "Hard Leather");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 117, Utils.formatNumber(HARD_LEATHER_COST)
                + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 110, "Green Leather");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 118, Utils.formatNumber(GREEN_DRAGON_LEATHER_COST)
                + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 111, "Blue Leather");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 119, Utils.formatNumber(BLUE_DRAGON_LEATHER_COST)
                + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 112, "Red Leather");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 120, Utils.formatNumber(RED_DRAGON_LEATHER_COST)
                + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 113, "Black Leather");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 121, Utils.formatNumber(BLACK_DRAGON_LEATHER_COST)
                + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 114, "Snakeskin");
        player.getGameEncoder().sendWidgetText(WidgetId.TANNING, 122, Utils.formatNumber(SNAKESKIN_LEATHER_COST)
                + " Coins");
    }
}
