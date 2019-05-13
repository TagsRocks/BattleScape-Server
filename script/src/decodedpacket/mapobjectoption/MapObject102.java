package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Prayer;
import com.palidino.osrs.model.player.Skills;
import com.palidino.util.Time;
import com.palidino.util.Utils;

public class MapObject102 {
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

}


