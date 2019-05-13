package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Equipment;
import com.palidino.osrs.model.player.PCombat;
import com.palidino.osrs.model.player.Player;

public class MapObject105 {
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

}


