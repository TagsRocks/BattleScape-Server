package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;

public class MapObject39 {
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

}


