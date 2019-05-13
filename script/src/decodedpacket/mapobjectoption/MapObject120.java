package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;

public class MapObject120 {
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

}


