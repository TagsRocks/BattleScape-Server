package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.ForceMovement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.TempMapObject;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import com.palidino.osrs.model.player.Slayer;
import com.palidino.osrs.model.player.controller.BossInstancePC;

public class MapObject123 {
    /* 31488 - 31743 */

    // obelisk
    public static void mapObject31554(Player player, int index, MapObject mapObject) {}

    // cavern
    public static void mapObject31555(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3073 && mapObject.getY() == 3654) {
            player.getMovement().teleport(3196, 10056);
            player.setObjectOptionDelay(2);
        }
    }

    // cavern
    public static void mapObject31556(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3124 && mapObject.getY() == 3831) {
            player.getMovement().teleport(3241, 10234);
            player.setObjectOptionDelay(2);
        }
    }

    // opening
    public static void mapObject31557(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3194 && mapObject.getY() == 10055) {
            player.getMovement().teleport(3075, 3653);
            player.setObjectOptionDelay(2);
        }
    }

    // opening
    public static void mapObject31558(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3240 && mapObject.getY() == 10235) {
            player.getMovement().teleport(3126, 3832);
            player.setObjectOptionDelay(2);
        }
    }

    // pillar
    public static void mapObject31561(Player player, int index, MapObject mapObject) {
        Tile tile = null;
        int direction = Tile.NORTH;
        int level = 1;
        if (mapObject.getX() == 3241 && mapObject.getY() == 10145) {
            tile = (player.getX() >= 3243) ? (new Tile(3239, 10145)) : (new Tile(3243, 10145));
            direction = (player.getX() >= 3243) ? Tile.WEST : Tile.EAST;
            level = 89;
        } else if (mapObject.getX() == 3200 && mapObject.getY() == 10136) {
            tile = (player.getX() >= 3202) ? (new Tile(3198, 10136)) : (new Tile(3202, 10136));
            direction = (player.getX() >= 3202) ? Tile.WEST : Tile.EAST;
            level = 75;
        } else if (mapObject.getX() == 3220 && mapObject.getY() == 10086) {
            tile = (player.getY() >= 10088) ? (new Tile(3220, 10084)) : (new Tile(3220, 10088));
            direction = (player.getY() >= 10088) ? Tile.SOUTH : Tile.NORTH;
            level = 65;
        } else if (mapObject.getX() == 3202 && mapObject.getY() == 10196) {
            tile = (player.getX() >= 3204) ? (new Tile(3200, 10196)) : (new Tile(3204, 10196));
            direction = (player.getX() >= 3204) ? Tile.WEST : Tile.EAST;
            level = 75;
        } else if (mapObject.getX() == 3180 && mapObject.getY() == 10209) {
            tile = (player.getY() <= 10207) ? (new Tile(3180, 10211)) : (new Tile(3180, 10207));
            direction = (player.getY() <= 10207) ? Tile.NORTH : Tile.SOUTH;
            level = 75;
        }
        if (tile == null) {
            return;
        } else if (player.getSkills().getLevel(Skills.AGILITY) < level) {
            player.getGameEncoder().sendMessage("You need an Agility level of " + level + " to jump this.");
            return;
        }
        player.setObjectOptionDelay(2);
        tile.setHeight(player.getHeight());
        ForceMovement forceMovement = new ForceMovement(new Tile(player), 1, tile, 2, direction);
        player.setForceMovementTeleport(forceMovement, 6132, 1, null);
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // deadman supply chest
    public static void mapObject31572(Player player, int index, MapObject mapObject) {}

    // deadman supply chest
    public static void mapObject31574(Player player, int index, MapObject mapObject) {}

    // deadman supply chest
    public static void mapObject31576(Player player, int index, MapObject mapObject) {}

    // deadman supply chest
    public static void mapObject31578(Player player, int index, MapObject mapObject) {}

    // deadman supply chest
    public static void mapObject31580(Player player, int index, MapObject mapObject) {}

    // deadman supply chest
    public static void mapObject31582(Player player, int index, MapObject mapObject) {}

    // <col=ff9040>tinderbox</col>
    public static void mapObject31634(Player player, int index, MapObject mapObject) {}

    // the cloister bell
    public static void mapObject31669(Player player, int index, MapObject mapObject) {
        if (!player.getSlayer().isAnyTask(7851) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
            player.getGameEncoder().sendMessage("This can only be killed on task.");
            return;
        } else if (player.getWorld().getNPC(7851, player) != null || player.getWorld().getNPC(7882, player) != null
                || player.getWorld().getNPC(7888, player) != null || player.getWorld().getNPC(7852, player) != null
                || player.getWorld().getNPC(7885, player) != null || player.getWorld().getNPC(7889, player) != null) {
            player.getGameEncoder().sendMessage("Nothing interesting happens.");
            return;
        }
        player.getGameEncoder().setVarp(1667, 3);
        player.getGameEncoder().sendMapObjectAnimation(mapObject, 7748);
        Npc dusk = new Npc(player.getController(), 7851, new Tile(1685, 4573));
        dusk.setLargeVisibility();
        Npc dawn = new Npc(player.getController(), 7852, new Tile(1705, 4573));
        dawn.setLargeVisibility();
    }

    // roof entrance
    public static void mapObject31672(Player player, int index, MapObject mapObject) {}

    // roof entrance
    public static void mapObject31673(Player player, int index, MapObject mapObject) {}

    // roof exit
    public static void mapObject31674(Player player, int index, MapObject mapObject) {
        player.getController().stopWithTeleport();
        player.getMovement().teleport(3426, 3540, 2);
    }

    // magical chest
    public static void mapObject31675(Player player, int index, MapObject mapObject) {}

    // energy sphere
    public static void mapObject31678(Player player, int index, MapObject mapObject) {
        if (mapObject.getAttachment() != null) {
            TempMapObject tmo = (TempMapObject) mapObject.getAttachment();
            tmo.setAttachment(2, player);
            tmo.stop();
        }
    }

    // energy sphere
    public static void mapObject31679(Player player, int index, MapObject mapObject) {
        if (mapObject.getAttachment() != null) {
            TempMapObject tmo = (TempMapObject) mapObject.getAttachment();
            tmo.setAttachment(2, player);
            tmo.stop();
        }
    }

    // energy sphere
    public static void mapObject31680(Player player, int index, MapObject mapObject) {
        if (mapObject.getAttachment() != null) {
            TempMapObject tmo = (TempMapObject) mapObject.getAttachment();
            tmo.setAttachment(2, player);
            tmo.stop();
        }
    }

    // roof entrance
    public static void mapObject31681(Player player, int index, MapObject mapObject) {
        if (!player.getSlayer().isUnlocked(Slayer.GROTESQUE_GUARDIANS)) {
            if (!player.getInventory().hasItem(21724)) {
                player.getGameEncoder().sendMessage("You need a Brittle key to unlock this.");
                return;
            }
            player.getInventory().deleteItem(21724, 1);
            player.getSlayer().unlock(Slayer.GROTESQUE_GUARDIANS);
            return;
        }
        if (!player.getSlayer().isAnyTask(7851) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
            player.getGameEncoder().sendMessage("This can only be attacked on an appropriate Slayer task.");
            return;
        }
        player.setController(new BossInstancePC());
        player.getController().instance();
        player.getMovement().teleport(1696, 4574);
        player.getController().getVariable("boss_instance_grotesque_guardians");
    }

    // the cloister bell
    public static void mapObject31684(Player player, int index, MapObject mapObject) {}

    // the cloister bell
    public static void mapObject31685(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject31686(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject31687(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject31688(Player player, int index, MapObject mapObject) {}

    // the grotesque guardians' display
    public static void mapObject31689(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject31690(Player player, int index, MapObject mapObject) {}

    // sand pile
    public static void mapObject31691(Player player, int index, MapObject mapObject) {}

    // tunnel entrance
    public static void mapObject31692(Player player, int index, MapObject mapObject) {}

    // rope
    public static void mapObject31693(Player player, int index, MapObject mapObject) {}

    // crevice
    public static void mapObject31695(Player player, int index, MapObject mapObject) {}

    // crevice
    public static void mapObject31696(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31697(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31698(Player player, int index, MapObject mapObject) {}

    // stepping stone
    public static void mapObject31699(Player player, int index, MapObject mapObject) {}

    // chest
    public static void mapObject31703(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject31704(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject31705(Player player, int index, MapObject mapObject) {}

    // manhole
    public static void mapObject31706(Player player, int index, MapObject mapObject) {}

    // manhole
    public static void mapObject31707(Player player, int index, MapObject mapObject) {}

    // ladder
    public static void mapObject31708(Player player, int index, MapObject mapObject) {}

    // doorway
    public static void mapObject31709(Player player, int index, MapObject mapObject) {}

    // chest
    public static void mapObject31710(Player player, int index, MapObject mapObject) {}

    // fish stall
    public static void mapObject31712(Player player, int index, MapObject mapObject) {}

    // old memorial
    public static void mapObject31714(Player player, int index, MapObject mapObject) {}

    // burning driftwood
    public static void mapObject31722(Player player, int index, MapObject mapObject) {}

    // driftwood
    public static void mapObject31724(Player player, int index, MapObject mapObject) {}

    // closed booth
    public static void mapObject31725(Player player, int index, MapObject mapObject) {}

    // bank deposit box
    public static void mapObject31726(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // stairs
    public static void mapObject31733(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject31734(Player player, int index, MapObject mapObject) {}

    // stairs
    public static void mapObject31735(Player player, int index, MapObject mapObject) {}

}


