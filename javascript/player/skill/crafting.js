var LEATHER_COST = 100;
var HARD_LEATHER_COST = 300;
var SNAKESKIN_LEATHER_COST = 1500;
var GREEN_DRAGON_LEATHER_COST = 2000;
var BLUE_DRAGON_LEATHER_COST = 2000;
var RED_DRAGON_LEATHER_COST = 2000;
var BLACK_DRAGON_LEATHER_COST = 2000;

var ENTRIES = Utils.toList(
    new SkillContainer.Entry().setLevel(41).setXP(70).setAnimation(7386)
        .setTool(new Item(ItemID.HAMMER, 1))
        .setConsume(new RandomItem(ItemID.OAK_SHIELD, 1), new RandomItem(ItemID.HARD_LEATHER, 2),
            new RandomItem(ItemID.BRONZE_NAILS, 15))
        .setCreate(new RandomItem(ItemID.HARD_LEATHER_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(56).setXP(100).setAnimation(7387)
        .setTool(new Item(ItemID.HAMMER, 1))
        .setConsume(new RandomItem(ItemID.WILLOW_SHIELD, 1), new RandomItem(ItemID.SNAKESKIN, 2),
            new RandomItem(ItemID.IRON_NAILS, 15))
        .setCreate(new RandomItem(ItemID.SNAKESKIN_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(62).setXP(124).setAnimation(7831)
        .setTool(new Item(ItemID.HAMMER, 1))
        .setConsume(new RandomItem(ItemID.MAPLE_SHIELD, 1), new RandomItem(ItemID.GREEN_DRAGON_LEATHER, 2),
            new RandomItem(ItemID.STEEL_NAILS, 15))
        .setCreate(new RandomItem(ItemID.GREEN_DHIDE_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(69).setXP(140).setAnimation(7832)
        .setTool(new Item(ItemID.HAMMER, 1))
        .setConsume(new RandomItem(ItemID.YEW_SHIELD, 1), new RandomItem(ItemID.BLUE_DRAGON_LEATHER, 2),
            new RandomItem(ItemID.MITHRIL_NAILS, 15))
        .setCreate(new RandomItem(ItemID.BLUE_DHIDE_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(76).setXP(156).setAnimation(7833)
        .setTool(new Item(ItemID.HAMMER, 1))
        .setConsume(new RandomItem(ItemID.MAGIC_SHIELD, 1), new RandomItem(ItemID.RED_DRAGON_LEATHER, 2),
            new RandomItem(ItemID.ADAMANTITE_NAILS, 15))
        .setCreate(new RandomItem(ItemID.RED_DHIDE_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(83).setXP(172).setAnimation(7834)
        .setTool(new Item(ItemID.HAMMER, 1))
        .setConsume(new RandomItem(ItemID.REDWOOD_SHIELD, 1), new RandomItem(ItemID.BLACK_DRAGON_LEATHER, 2),
            new RandomItem(ItemID.RUNE_NAILS, 15))
        .setCreate(new RandomItem(ItemID.BLACK_DHIDE_SHIELD, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(14).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.LEATHER_GLOVES, 1)),
    new SkillContainer.Entry().setLevel(7).setXP(16).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.LEATHER_BOOTS, 1)),
    new SkillContainer.Entry().setLevel(9).setXP(19).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.LEATHER_COWL, 1)),
    new SkillContainer.Entry().setLevel(11).setXP(22).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.LEATHER_VAMBRACES, 1)),
    new SkillContainer.Entry().setLevel(14).setXP(25).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.LEATHER_BODY, 1)),
    new SkillContainer.Entry().setLevel(18).setXP(27).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.LEATHER_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(38).setXP(37).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.COIF, 1)),
    new SkillContainer.Entry().setLevel(28).setXP(35).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.HARD_LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.HARDLEATHER_BODY, 1)),
    new SkillContainer.Entry().setLevel(57).setXP(62).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.GREEN_DRAGON_LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.GREEN_DHIDE_VAMB, 1)),
    new SkillContainer.Entry().setLevel(60).setXP(124).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.GREEN_DRAGON_LEATHER, 2), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.GREEN_DHIDE_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(63).setXP(186).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.GREEN_DRAGON_LEATHER, 3), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.GREEN_DHIDE_BODY, 1)),
    new SkillContainer.Entry().setLevel(66).setXP(70).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.BLUE_DRAGON_LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.BLUE_DHIDE_VAMB, 1)),
    new SkillContainer.Entry().setLevel(68).setXP(140).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.BLUE_DRAGON_LEATHER, 2), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.BLUE_DHIDE_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(71).setXP(210).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.BLUE_DRAGON_LEATHER, 3), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.BLUE_DHIDE_BODY, 1)),
    new SkillContainer.Entry().setLevel(73).setXP(78).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.RED_DRAGON_LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.RED_DHIDE_VAMB, 1)),
    new SkillContainer.Entry().setLevel(75).setXP(156).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.RED_DRAGON_LEATHER, 2), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.RED_DHIDE_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(77).setXP(234).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.RED_DRAGON_LEATHER, 3), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.RED_DHIDE_BODY, 1)),
    new SkillContainer.Entry().setLevel(79).setXP(86).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.BLACK_DRAGON_LEATHER, 1), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.BLACK_DHIDE_VAMB, 1)),
    new SkillContainer.Entry().setLevel(82).setXP(172).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.BLACK_DRAGON_LEATHER, 2), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.BLACK_DHIDE_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(84).setXP(258).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.BLACK_DRAGON_LEATHER, 3), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.BLACK_DHIDE_BODY, 1)),
    new SkillContainer.Entry().setLevel(45).setXP(30).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.SNAKESKIN, 6), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.SNAKESKIN_BOOTS, 1)),
    new SkillContainer.Entry().setLevel(47).setXP(35).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.SNAKESKIN, 8), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.SNAKESKIN_VAMBRACES, 1)),
    new SkillContainer.Entry().setLevel(48).setXP(45).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.SNAKESKIN, 5), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.SNAKESKIN_BANDANA, 1)),
    new SkillContainer.Entry().setLevel(51).setXP(50).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.SNAKESKIN, 12), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.SNAKESKIN_CHAPS, 1)),
    new SkillContainer.Entry().setLevel(53).setXP(55).setAnimation(1249)
        .setTool(new Item(ItemID.NEEDLE, 1))
        .setConsume(new RandomItem(ItemID.SNAKESKIN, 15), new RandomItem(ItemID.THREAD, 1))
        .setCreate(new RandomItem(ItemID.SNAKESKIN_BODY, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(15).setAnimation(886)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.UNCUT_OPAL, 1))
        .setCreate(new RandomItem(ItemID.OPAL, 1)),
    new SkillContainer.Entry().setLevel(13).setXP(20).setAnimation(889)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.UNCUT_JADE, 1))
        .setCreate(new RandomItem(ItemID.JADE, 1)),
    new SkillContainer.Entry().setLevel(16).setXP(25).setAnimation(887)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.UNCUT_RED_TOPAZ, 1))
        .setCreate(new RandomItem(ItemID.RED_TOPAZ, 1)),
    new SkillContainer.Entry().setLevel(20).setXP(50).setAnimation(888)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.UNCUT_SAPPHIRE, 1))
        .setCreate(new RandomItem(ItemID.SAPPHIRE, 1)),
    new SkillContainer.Entry().setLevel(27).setXP(68).setAnimation(889)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.UNCUT_EMERALD, 1))
        .setCreate(new RandomItem(ItemID.EMERALD, 1)),
    new SkillContainer.Entry().setLevel(34).setXP(85).setAnimation(887)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.UNCUT_RUBY, 1))
        .setCreate(new RandomItem(ItemID.RUBY, 1)),
    new SkillContainer.Entry().setLevel(43).setXP(108).setAnimation(886)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.UNCUT_DIAMOND, 1))
        .setCreate(new RandomItem(ItemID.DIAMOND, 1)),
    new SkillContainer.Entry().setLevel(55).setXP(138).setAnimation(885)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.UNCUT_DRAGONSTONE, 1))
        .setCreate(new RandomItem(ItemID.DRAGONSTONE, 1)),
    new SkillContainer.Entry().setLevel(67).setXP(168).setAnimation(2717)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.UNCUT_ONYX, 1))
        .setCreate(new RandomItem(ItemID.ONYX, 1)),
    new SkillContainer.Entry().setLevel(89).setXP(200).setAnimation(2717)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.UNCUT_ZENYTE, 1))
        .setCreate(new RandomItem(ItemID.ZENYTE, 1)),
    new SkillContainer.Entry().setLevel(83).setXP(60).setAnimation(887)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(Mining.AMETHYST_ID, 1))
        .setCreate(new RandomItem(ItemID.AMETHYST_BOLT_TIPS, 15)),
    new SkillContainer.Entry().setLevel(85).setXP(60).setAnimation(887)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(Mining.AMETHYST_ID, 1))
        .setCreate(new RandomItem(ItemID.AMETHYST_ARROWTIPS, 15)),
    new SkillContainer.Entry().setLevel(87).setXP(60).setAnimation(887)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(Mining.AMETHYST_ID, 1))
        .setCreate(new RandomItem(ItemID.AMETHYST_JAVELIN_HEADS, 5)),
    new SkillContainer.Entry().setLevel(5).setXP(15).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1))
        .setCreate(new RandomItem(ItemID.GOLD_RING, 1)),
    new SkillContainer.Entry().setLevel(6).setXP(20).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1))
        .setCreate(new RandomItem(ItemID.GOLD_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(7).setXP(25).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1))
        .setCreate(new RandomItem(ItemID.GOLD_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(8).setXP(30).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1))
        .setCreate(new RandomItem(ItemID.GOLD_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(20).setXP(40).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.SAPPHIRE, 1))
        .setCreate(new RandomItem(ItemID.SAPPHIRE_RING, 1)),
    new SkillContainer.Entry().setLevel(22).setXP(55).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.SAPPHIRE, 1))
        .setCreate(new RandomItem(ItemID.SAPPHIRE_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(23).setXP(60).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.SAPPHIRE, 1))
        .setCreate(new RandomItem(ItemID.SAPPHIRE_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(24).setXP(65).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.SAPPHIRE, 1))
        .setCreate(new RandomItem(ItemID.SAPPHIRE_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(27).setXP(55).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.EMERALD, 1))
        .setCreate(new RandomItem(ItemID.EMERALD_RING, 1)),
    new SkillContainer.Entry().setLevel(29).setXP(60).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.EMERALD, 1))
        .setCreate(new RandomItem(ItemID.EMERALD_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(30).setXP(65).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.EMERALD, 1))
        .setCreate(new RandomItem(ItemID.EMERALD_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(31).setXP(70).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.EMERALD, 1))
        .setCreate(new RandomItem(ItemID.EMERALD_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(34).setXP(70).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.RUBY, 1))
        .setCreate(new RandomItem(ItemID.RUBY_RING, 1)),
    new SkillContainer.Entry().setLevel(40).setXP(75).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.RUBY, 1))
        .setCreate(new RandomItem(ItemID.RUBY_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(42).setXP(80).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.RUBY, 1))
        .setCreate(new RandomItem(ItemID.RUBY_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(50).setXP(85).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.RUBY, 1))
        .setCreate(new RandomItem(ItemID.RUBY_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(43).setXP(85).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.DIAMOND, 1))
        .setCreate(new RandomItem(ItemID.DIAMOND_RING, 1)),
    new SkillContainer.Entry().setLevel(56).setXP(90).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.DIAMOND, 1))
        .setCreate(new RandomItem(ItemID.DIAMOND_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(58).setXP(95).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.DIAMOND, 1))
        .setCreate(new RandomItem(ItemID.DIAMOND_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(70).setXP(100).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.DIAMOND, 1))
        .setCreate(new RandomItem(ItemID.DIAMOND_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(55).setXP(100).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.DRAGONSTONE, 1))
        .setCreate(new RandomItem(ItemID.DRAGONSTONE_RING, 1)),
    new SkillContainer.Entry().setLevel(72).setXP(105).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.DRAGONSTONE, 1))
        .setCreate(new RandomItem(ItemID.DRAGON_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(74).setXP(110).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.DRAGONSTONE, 1))
        .setCreate(new RandomItem(ItemID.DRAGONSTONE_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(80).setXP(150).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.DRAGONSTONE, 1))
        .setCreate(new RandomItem(ItemID.DRAGONSTONE_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(67).setXP(115).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.ONYX, 1))
        .setCreate(new RandomItem(ItemID.ONYX_RING, 1)),
    new SkillContainer.Entry().setLevel(82).setXP(120).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.ONYX, 1))
        .setCreate(new RandomItem(ItemID.ONYX_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(84).setXP(125).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.ONYX, 1))
        .setCreate(new RandomItem(ItemID.ONYX_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(90).setXP(165).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.ONYX, 1))
        .setCreate(new RandomItem(ItemID.ONYX_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(89).setXP(150).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.RING_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.ZENYTE, 1))
        .setCreate(new RandomItem(ItemID.ZENYTE_RING, 1)),
    new SkillContainer.Entry().setLevel(92).setXP(165).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.NECKLACE_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.ZENYTE, 1))
        .setCreate(new RandomItem(ItemID.ZENYTE_NECKLACE, 1)),
    new SkillContainer.Entry().setLevel(95).setXP(180).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.BRACELET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.ZENYTE, 1))
        .setCreate(new RandomItem(ItemID.ZENYTE_BRACELET, 1)),
    new SkillContainer.Entry().setLevel(98).setXP(200).setAnimation(899).setInterfaceID(WidgetID.MAKE_JEWELRY)
        .setTool(new Item(ItemID.AMULET_MOULD, 1))
        .setConsume(new RandomItem(ItemID.GOLD_BAR, 1), new RandomItem(ItemID.ZENYTE, 1))
        .setCreate(new RandomItem(ItemID.ZENYTE_AMULET_U, 1)),
    new SkillContainer.Entry().setLevel(8).setXP(4)
        .setConsume(new RandomItem(ItemID.BALL_OF_WOOL, 1), new RandomItem(ItemID.GOLD_AMULET_U, 1))
        .setCreate(new RandomItem(ItemID.GOLD_AMULET, 1)),
    new SkillContainer.Entry().setLevel(24).setXP(4)
        .setConsume(new RandomItem(ItemID.BALL_OF_WOOL, 1), new RandomItem(ItemID.SAPPHIRE_AMULET_U, 1))
        .setCreate(new RandomItem(ItemID.SAPPHIRE_AMULET, 1)),
    new SkillContainer.Entry().setLevel(31).setXP(4)
        .setConsume(new RandomItem(ItemID.BALL_OF_WOOL, 1), new RandomItem(ItemID.EMERALD_AMULET_U, 1))
        .setCreate(new RandomItem(ItemID.EMERALD_AMULET, 1)),
    new SkillContainer.Entry().setLevel(50).setXP(4)
        .setConsume(new RandomItem(ItemID.BALL_OF_WOOL, 1), new RandomItem(ItemID.RUBY_AMULET_U, 1))
        .setCreate(new RandomItem(ItemID.RUBY_AMULET, 1)),
    new SkillContainer.Entry().setLevel(70).setXP(4)
        .setConsume(new RandomItem(ItemID.BALL_OF_WOOL, 1), new RandomItem(ItemID.DIAMOND_AMULET_U, 1))
        .setCreate(new RandomItem(ItemID.DIAMOND_AMULET, 1)),
    new SkillContainer.Entry().setLevel(80).setXP(4)
        .setConsume(new RandomItem(ItemID.BALL_OF_WOOL, 1), new RandomItem(ItemID.DRAGONSTONE_AMULET_U, 1))
        .setCreate(new RandomItem(ItemID.DRAGONSTONE_AMULET, 1)),
    new SkillContainer.Entry().setLevel(90).setXP(4)
        .setConsume(new RandomItem(ItemID.BALL_OF_WOOL, 1), new RandomItem(ItemID.ONYX_AMULET_U, 1))
        .setCreate(new RandomItem(ItemID.ONYX_AMULET, 1)),
    new SkillContainer.Entry().setLevel(98).setXP(4)
        .setConsume(new RandomItem(ItemID.BALL_OF_WOOL, 1), new RandomItem(ItemID.ZENYTE_AMULET_U, 1))
        .setCreate(new RandomItem(ItemID.ZENYTE_AMULET, 1)),
    new SkillContainer.Entry().setLevel(35).setXP(4)
        .setConsume(new RandomItem(ItemID.BALL_OF_WOOL, 1), new RandomItem(ItemID.SALVE_SHARD, 1))
        .setCreate(new RandomItem(ItemID.SALVE_AMULET, 1)),
    new SkillContainer.Entry().setLevel(54).setXP(100)
        .setConsume(new RandomItem(ItemID.BATTLESTAFF, 1), new RandomItem(ItemID.WATER_ORB, 1))
        .setCreate(new RandomItem(ItemID.WATER_BATTLESTAFF, 1)),
    new SkillContainer.Entry().setLevel(58).setXP(113)
        .setConsume(new RandomItem(ItemID.BATTLESTAFF, 1), new RandomItem(ItemID.EARTH_ORB, 1))
        .setCreate(new RandomItem(ItemID.EARTH_BATTLESTAFF, 1)),
    new SkillContainer.Entry().setLevel(62).setXP(125)
        .setConsume(new RandomItem(ItemID.BATTLESTAFF, 1), new RandomItem(ItemID.FIRE_ORB, 1))
        .setCreate(new RandomItem(ItemID.FIRE_BATTLESTAFF, 1)),
    new SkillContainer.Entry().setLevel(66).setXP(138)
        .setConsume(new RandomItem(ItemID.BATTLESTAFF, 1), new RandomItem(ItemID.AIR_ORB, 1))
        .setCreate(new RandomItem(ItemID.AIR_BATTLESTAFF, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(17).setAnimation(884)
        .setTool(new Item(ItemID.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemID.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemID.BEER_GLASS, 1)),
    new SkillContainer.Entry().setLevel(4).setXP(19).setAnimation(884)
        .setTool(new Item(ItemID.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemID.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemID.EMPTY_CANDLE_LANTERN, 1)),
    new SkillContainer.Entry().setLevel(12).setXP(25).setAnimation(884)
        .setTool(new Item(ItemID.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemID.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemID.EMPTY_OIL_LAMP, 1)),
    new SkillContainer.Entry().setLevel(33).setXP(35).setAnimation(884)
        .setTool(new Item(ItemID.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemID.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemID.VIAL, 1)),
    new SkillContainer.Entry().setLevel(42).setXP(42).setAnimation(884)
        .setTool(new Item(ItemID.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemID.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemID.EMPTY_FISHBOWL, 1)),
    new SkillContainer.Entry().setLevel(46).setXP(52).setAnimation(884)
        .setTool(new Item(ItemID.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemID.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemID.UNPOWERED_ORB, 1)),
    new SkillContainer.Entry().setLevel(49).setXP(55).setAnimation(884)
        .setTool(new Item(ItemID.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemID.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemID.LANTERN_LENS, 1)),
    new SkillContainer.Entry().setLevel(87).setXP(70).setAnimation(884)
        .setTool(new Item(ItemID.GLASSBLOWING_PIPE, 1))
        .setConsume(new RandomItem(ItemID.MOLTEN_GLASS, 1))
        .setCreate(new RandomItem(ItemID.EMPTY_LIGHT_ORB, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(0)
        .setConsume(new RandomItem(ItemID.BULLSEYE_LANTERN_UNF, 1), new RandomItem(ItemID.LANTERN_LENS, 1))
        .setCreate(new RandomItem(ItemID.BULLSEYE_LANTERN_EMPTY, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(0)
        .setWidgetOnMapObject(4026)
        .setConsume(new RandomItem(ItemID.BULLSEYE_LANTERN_EMPTY, 1), new RandomItem(ItemID.SWAMP_TAR, 1))
        .setCreate(new RandomItem(ItemID.BULLSEYE_LANTERN, 1)),
    new SkillContainer.Entry().setLevel(52).setXP(120)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.SERPENTINE_VISAGE, 1))
        .setCreate(new RandomItem(ItemID.SERPENTINE_HELM_UNCHARGED, 1)),
    new SkillContainer.Entry().setLevel(59).setXP(0)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.MAGIC_FANG, 1), new RandomItem(ItemID.STAFF_OF_THE_DEAD, 1))
        .setCreate(new RandomItem(ItemID.TOXIC_STAFF_UNCHARGED, 1)),
    new SkillContainer.Entry().setLevel(59).setXP(0)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.MAGIC_FANG, 1), new RandomItem(ItemID.UNCHARGED_TRIDENT, 1))
        .setCreate(new RandomItem(ItemID.UNCHARGED_TOXIC_TRIDENT, 1)),
    new SkillContainer.Entry().setLevel(59).setXP(0)
        .setTool(new Item(ItemID.CHISEL, 1))
        .setConsume(new RandomItem(ItemID.MAGIC_FANG, 1), new RandomItem(ItemID.UNCHARGED_TRIDENT_E, 1))
        .setCreate(new RandomItem(ItemID.UNCHARGED_TOXIC_TRIDENT_E, 1)),
    new SkillContainer.Entry().setLevel(1).setXP(0)
        .setConsume(new RandomItem(ItemID.ONYX, 1), new RandomItem(ItemID.ZENYTE_SHARD, 1))
        .setCreate(new RandomItem(ItemID.UNCUT_ZENYTE, 1))
);

skill = new SkillContainer() {
    getSkillID: function() {
        return Skills.CRAFTING;
    },

    getEntries: function() {
        return ENTRIES;
    },

    widgetHook: function(player, index, interfaceID, childID, slot, itemID) {
        if (interfaceID == WidgetID.TANNING) {
            var amount = 1;
            if (childID >= 124 && childID <= 130) {
                amount = -1;
            } else if (childID >= 132 && childID <= 138) {
                amount = -2;
            } else if (childID >= 140 && childID <= 146) {
                amount = 5;
            }
            var itemID = -1;
            if (childID == 124 || childID == 132 || childID == 140 || childID == 148) {
                itemID = ItemID.LEATHER;
            } else if (childID == 125 || childID == 133 || childID == 141 || childID == 149) {
                itemID = ItemID.HARD_LEATHER;
            } else if (childID == 126 || childID == 134 || childID == 142 || childID == 150) {
                itemID = ItemID.GREEN_DRAGON_LEATHER;
            } else if (childID == 127 || childID == 135 || childID == 143 || childID == 151) {
                itemID = ItemID.BLUE_DRAGON_LEATHER;
            } else if (childID == 128 || childID == 136 || childID == 144 || childID == 152) {
                itemID = ItemID.RED_DRAGON_LEATHER;
            } else if (childID == 129 || childID == 137 || childID == 145 || childID == 153) {
                itemID = ItemID.BLACK_DRAGON_LEATHER;
            } else if (childID == 130 || childID == 138 || childID == 146 || childID == 154) {
                itemID = ItemID.SNAKESKIN;
            }
            if (itemID == -1) {
                return true;
            }
            if (amount == -2) {
                var js = this;
                player.getGameEncoder().sendEnterAmount(new ValueEntered.IntegerEvent() {
                    execute: function(value) {
                        js.tanHide(player, itemID, value);
                    }
                });
            } else {
                this.tanHide(player, itemID, amount);
            }
            return true;
        } else if (interfaceID == WidgetID.MAKE_JEWELRY) {
            if (itemID == ItemID.GOLD_BRACELET_11068) {
                itemID = ItemID.GOLD_BRACELET
            } else if (itemID == ItemID.SAPPHIRE_BRACELET_11071) {
                itemID = ItemID.SAPPHIRE_BRACELET;
            } else if (itemID == ItemID.EMERALD_BRACELET_11078) {
                itemID = ItemID.EMERALD_BRACELET;
            } else if (itemID == ItemID.RUBY_BRACELET_11087) {
                itemID = ItemID.RUBY_BRACELET;
            } else if (itemID == ItemID.DIAMOND_BRACELET_11094) {
                itemID = ItemID.DIAMOND_BRACELET;
            } else if (itemID == ItemID.DRAGON_BRACELET) {
                itemID = ItemID.DRAGONSTONE_BRACELET;
            } else if (itemID == ItemID.ONYX_BRACELET_11132) {
                itemID = ItemID.ONYX_BRACELET;
            } else if (itemID == ItemID.ZENYTE_BRACELET_19492) {
                itemID = ItemID.ZENYTE_BRACELET;
            }
            var entry = skill.findEntryFromCreate(itemID);
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
                player.getGameEncoder().sendEnterAmount(new ValueEntered.IntegerEvent() {
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

    widgetOnMapObjectHook: function(player, interfaceID, childID, slot, mapObject) {
        if (interfaceID == WidgetID.INVENTORY && mapObject.getDef().hasOption("smelt")) {
            var itemID = player.getInventory().getID(slot);
            if (itemID == ItemID.RING_MOULD || itemID == ItemID.NECKLACE_MOULD || itemID == ItemID.BRACELET_MOULD
                    || itemID == ItemID.AMULET_MOULD || itemID == ItemID.GOLD_BAR || itemID == ItemID.SAPPHIRE
                    || itemID == ItemID.EMERALD || itemID == ItemID.RUBY || itemID == ItemID.DIAMOND
                    || itemID == ItemID.DRAGONSTONE || itemID == ItemID.ONYX || itemID == ItemID.ZENYTE) {
                player.getWidgetManager().sendInteractiveOverlay(WidgetID.MAKE_JEWELRY);
                return true;
            }
        }
        return false;
    },

    npcOptionHook: function(player, index, npc) {
        if (npc.getID() == NpcID.TANNER) {
            this.openTanning(player);
            return true;
        }
        return false;
    },

    tanHide: function(player, craftItemID, amount) {
        var baseItemID = -1;
        var cost = -1;
        if (craftItemID == ItemID.LEATHER) {
            baseItemID = ItemID.COWHIDE;
            cost = LEATHER_COST;
        } else if (craftItemID == ItemID.HARD_LEATHER) {
            baseItemID = ItemID.COWHIDE;
            cost = HARD_LEATHER_COST;
        } else if (craftItemID == ItemID.GREEN_DRAGON_LEATHER) {
            baseItemID = ItemID.GREEN_DRAGONHIDE;
            cost = GREEN_DRAGON_LEATHER_COST;
        } else if (craftItemID == ItemID.BLUE_DRAGON_LEATHER) {
            baseItemID = ItemID.BLUE_DRAGONHIDE;
            cost = BLUE_DRAGON_LEATHER_COST;
        } else if (craftItemID == ItemID.RED_DRAGON_LEATHER) {
            baseItemID = ItemID.RED_DRAGONHIDE;
            cost = RED_DRAGON_LEATHER_COST;
        } else if (craftItemID == ItemID.BLACK_DRAGON_LEATHER) {
            baseItemID = ItemID.BLACK_DRAGONHIDE;
            cost = BLACK_DRAGON_LEATHER_COST;
        } else if (craftItemID == ItemID.SNAKESKIN) {
            baseItemID = ItemID.SNAKE_HIDE;
            cost = SNAKESKIN_LEATHER_COST;
        }
        if (baseItemID == -1 || cost == -1) {
            return;
        }
        if (player.getInventory().getCount(baseItemID) == 0) {
            baseItemID = ItemDef.getNotedID(baseItemID);
            craftItemID = ItemDef.getNotedID(craftItemID);
        }
        if (amount == -1) {
            amount = player.getInventory().getCount(baseItemID);
        }
        if (amount > player.getInventory().getCount(baseItemID)) {
            amount = player.getInventory().getCount(baseItemID);
        }
        if (baseItemID == -1 || craftItemID == -1 || amount == 0) {
            player.getGameEncoder().sendMessage("You don't have raw hide to do this.");
            return;
        }
        if (player.getInventory().getCount(ItemID.COINS) < amount * cost) {
            player.getGameEncoder().sendMessage("You don't have enough coins to do this.");
            return;
        }
        player.getInventory().deleteItem(ItemID.COINS, amount * cost);
        player.getInventory().deleteItem(baseItemID, amount);
        player.getInventory().addItem(craftItemID, amount);
        AchievementDiary.makeItemHooks(player, skill.getSkillID(), new RandomItem(craftItemID, amount), null, null);
    },

    openTanning: function(player) {
        player.getWidgetManager().sendInteractiveOverlay(WidgetID.TANNING);
        player.getGameEncoder().sendWidgetItemModel(WidgetID.TANNING, 100, ItemID.LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetID.TANNING, 101, ItemID.HARD_LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetID.TANNING, 102, ItemID.GREEN_DRAGON_LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetID.TANNING, 103, ItemID.BLUE_DRAGON_LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetID.TANNING, 104, ItemID.RED_DRAGON_LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetID.TANNING, 105, ItemID.BLACK_DRAGON_LEATHER, 200);
        player.getGameEncoder().sendWidgetItemModel(WidgetID.TANNING, 106, ItemID.SNAKESKIN, 200);
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 108, "Leather");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 116, Utils.formatNumber(LEATHER_COST) + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 109, "Hard Leather");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 117, Utils.formatNumber(HARD_LEATHER_COST)
                + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 110, "Green Leather");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 118, Utils.formatNumber(GREEN_DRAGON_LEATHER_COST)
                + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 111, "Blue Leather");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 119, Utils.formatNumber(BLUE_DRAGON_LEATHER_COST)
                + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 112, "Red Leather");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 120, Utils.formatNumber(RED_DRAGON_LEATHER_COST)
                + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 113, "Black Leather");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 121, Utils.formatNumber(BLACK_DRAGON_LEATHER_COST)
                + " Coins");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 114, "Snakeskin");
        player.getGameEncoder().sendWidgetText(WidgetID.TANNING, 122, Utils.formatNumber(SNAKESKIN_LEATHER_COST)
                + " Coins");
    }
}
