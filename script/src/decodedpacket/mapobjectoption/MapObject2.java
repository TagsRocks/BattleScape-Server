package decodedpacket.mapobjectoption;

import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.TempMapObject;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Utils;

public class MapObject2 {
    /* 512 - 767 */

    // Door
    public static void mapObject532(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject534(Player player, int index, MapObject mapObject) {
        // Smoke Devil Dungeon
        Tile tile = new Tile(2413, 3059, 0);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Crevice
    public static void mapObject535(Player player, int index, MapObject mapObject) {
        // Stronghold Slayer Cave
        if (!player.getSlayer().isAnyTask(499) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
            player.getGameEncoder().sendMessage("You need an appropriate Slayer task of Smoke Devils to enter.");
            return;
        }
        player.openDialogue("bossinstance", 5);
    }

    // Crevice
    public static void mapObject536(Player player, int index, MapObject mapObject) {
        // Stronghold Slayer Cave
        Tile tile = new Tile(2379, 9452, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Crevice
    public static void mapObject537(Player player, int index, MapObject mapObject) {
        player.openDialogue("bossinstance", 12);
    }

    // Crevice
    public static void mapObject538(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(2280, 10016, 0);
        player.getMovement().ladderUpTeleport(tile);
        player.getController().stopWithTeleport();
    }

    // Curtain
    public static void mapObject539(Player player, int index, MapObject mapObject) {}

    // Broken Fence
    public static void mapObject544(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject553(Player player, int index, MapObject mapObject) {}

    // Tea stall
    public static void mapObject635(Player player, int index, MapObject mapObject) {}

    // Buried skeleton
    public static void mapObject651(Player player, int index, MapObject mapObject) {}

    // Passage
    public static void mapObject677(Player player, int index, MapObject mapObject) {
        player.getCombat().setDamageInflicted(0);
        if (player.getX() <= 2970) {
            player.getMovement().teleport(2974, 4384, 2);
        } else {
            player.getMovement().teleport(2970, 4384, 2);
        }
        player.getController().stopWithTeleport();
    }

    // Cave
    public static void mapObject678(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (player.getMovement().getTeleportBlock() > 0) {
            player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                    + player.getMovement().getTeleportBlockRemaining() + ".");
            return;
        }
        Tile tile = new Tile(2964, 4382, 2);
        player.getMovement().ladderUpTeleport(tile);
    }

    // Cave exit
    public static void mapObject679(Player player, int index, MapObject mapObject) {
        Tile tile = new Tile(3206, 3681, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Shaking box
    public static void mapObject721(Player player, int index, MapObject mapObject) {
        player.getHunter().pickupTrap(mapObject);
    }

    // Buried skeleton
    public static void mapObject723(Player player, int index, MapObject mapObject) {}

    // Web
    public static void mapObject733(Player player, int index, MapObject mapObject) {
        if ((player.getEquipment().getWeaponDef().getWeaponType() == null
                || !player.getEquipment().getWeaponDef().getWeaponType().hasSlash())
                && !player.getInventory().hasItem(946)) {
            player.getGameEncoder().sendMessage("Only a sharp blade can cut through this sticky web.");
            return;
        }
        player.setAnimation(player.getCombat().getAttackAnimation());
        if (Utils.randomE(4) != 0) {
            player.getGameEncoder().sendMessage("You fail to cut through it.");
            return;
        }
        player.getGameEncoder().sendMessage("You slash the web apart.");
        MapObject newWeb = new MapObject(mapObject.getID() + 1, mapObject);
        player.getWorld().addEvent(new TempMapObject(100, player.getController(), newWeb));
    }
}

