package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import com.palidino.osrs.model.player.controller.GodWarsPC;
import com.palidino.util.Utils;

public class MapObject103 {
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

}


