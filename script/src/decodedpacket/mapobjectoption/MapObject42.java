package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.ForceMovement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import com.palidino.util.Utils;
import com.palidino.util.event.Event;

public class MapObject42 {
    /* 10752 - 11007 */

    // Stairs
    public static void mapObject10771(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10772(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10773(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10774(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10775(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10776(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject10777(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10778(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10779(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10780(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10781(Player player, int index, MapObject mapObject) {}

    // Dense runestone
    public static void mapObject10796(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject10804(Player player, int index, MapObject mapObject) {}

    // Sandy's Desk
    public static void mapObject10805(Player player, int index, MapObject mapObject) {}

    // Edge
    public static void mapObject10817(Player player, int index, MapObject mapObject) {}

    // Tall tree
    public static void mapObject10819(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 40) {
            player.getGameEncoder().sendMessage("You need an Agility level of 40 to use this course.");
            return;
        }
        Tile toTile = new Tile(3506, 3492, 2);
        player.getMovement().ladderUpTeleport(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 10;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10820(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3505 || player.getY() != 3497) {
            return;
        }
        int direction = Tile.NORTH;
        player.setAnimation(2588);
        Tile toTile = new Tile(3503, 3504, 2);
        player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                int xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10821(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3498 || player.getY() != 3504) {
            return;
        }
        int direction = Tile.WEST;
        player.setAnimation(2588);
        Tile toTile = new Tile(3492, 3504, 2);
        player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                int xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10822(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3478 || player.getY() != 3493) {
            return;
        }
        int direction = Tile.SOUTH;
        player.setAnimation(2588);
        Tile toTile = new Tile(3478, 3486, 2);
        player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                int xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10823(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3502 || player.getY() != 3476) {
            return;
        }
        int direction = Tile.EAST;
        player.setAnimation(2588);
        Tile toTile = new Tile(3510, 3476, 2);
        player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                int xp = 11;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10828(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3487 || player.getY() != 3499) {
            return;
        }
        int direction = Tile.WEST;
        player.setAnimation(2588);
        Tile toTile = new Tile(3479, 3499, 3);
        player.setForceMovement(new ForceMovement(player, 0, toTile, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setForceMovement(new ForceMovement(direction));
                player.setAnimation(-1);
                int xp = 10;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tightrope
    public static void mapObject10829(Player player, int index, MapObject mapObject) {}

    // Pole-vault
    public static void mapObject10831(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3480 || player.getY() != 3484) {
            return;
        }
        player.setAnimation(7132);
        Tile toTile = new Tile(3489, 3476, 3);
        player.setForceMovement(new ForceMovement(player, 1, toTile, 4, Tile.EAST));
        player.lock();
        Event event = new Event(3) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                player.setAnimation(-1);
                int xp = 10;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject10832(Player player, int index, MapObject mapObject) {
        if (player.getX() != 3510 || player.getY() != 3482) {
            return;
        }
        Tile toTile = new Tile(3510, 3485, 0);
        player.getMovement().animatedTeleport(toTile, 7133, null, 0);
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 175;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (Utils.randomE(10) == 0) {
                    int amount = 4;
                    if (player.getGoldMember()) {
                        amount = 6;
                    }
                    player.getInventory().addOrDropItem(11849, amount);
                }
                if (Utils.randomE(2) == 0) {
                    int rewardType = Utils.randomE(3);
                    if (rewardType == 0) {
                        player.getInventory().addOrDropItem(3009, 1);
                    } else if (rewardType == 1) {
                        player.getInventory().addOrDropItem(3017, 1);
                    } else if (rewardType == 2) {
                        player.getInventory().addOrDropItem(12640, 4);
                    }
                }
                player.getFamiliar().rollSkillPet(Skills.AGILITY, 36842, 20659);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Rough wall
    public static void mapObject10833(Player player, int index, MapObject mapObject) {}

    // Tightrope
    public static void mapObject10834(Player player, int index, MapObject mapObject) {}

    // Hand holds
    public static void mapObject10836(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject10851(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject10852(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject10855(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject10856(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10857(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject10858(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10859(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10860(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10861(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10862(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10863(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10864(Player player, int index, MapObject mapObject) {}

    // Low wall
    public static void mapObject10865(Player player, int index, MapObject mapObject) {}

    // Plank
    public static void mapObject10867(Player player, int index, MapObject mapObject) {}

    // Plank
    public static void mapObject10868(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10882(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10883(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10884(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject10885(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10886(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10887(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10888(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject10889(Player player, int index, MapObject mapObject) {}

    // Vine patch
    public static void mapObject10949(Player player, int index, MapObject mapObject) {}

    // Sand pile
    public static void mapObject10950(Player player, int index, MapObject mapObject) {}

    // Magic barrier
    public static void mapObject11005(Player player, int index, MapObject mapObject) {}

}


