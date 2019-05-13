package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.ForceMovement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import com.palidino.util.Utils;
import com.palidino.util.event.Event;

public class MapObject44 {
    /* 11264 - 11519 */

    // Ship's ladder
    public static void mapObject11289(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject11290(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject11308(Player player, int index, MapObject mapObject) {}

    // Ship's ladder
    public static void mapObject11309(Player player, int index, MapObject mapObject) {}

    // Climbing net
    public static void mapObject11310(Player player, int index, MapObject mapObject) {}

    // Ship hull
    public static void mapObject11317(Player player, int index, MapObject mapObject) {}

    // Ship hull
    public static void mapObject11318(Player player, int index, MapObject mapObject) {}

    // Bank booth
    public static void mapObject11338(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Interdimensional rift
    public static void mapObject11354(Player player, int index, MapObject mapObject) {}

    // Interdimensional rift
    public static void mapObject11355(Player player, int index, MapObject mapObject) {}

    // Portal Home
    public static void mapObject11356(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11358(Player player, int index, MapObject mapObject) {}

    // Interdimensional rift
    public static void mapObject11359(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11360(Player player, int index, MapObject mapObject) {}

    // Tightrope
    public static void mapObject11361(Player player, int index, MapObject mapObject) {}

    // Tightrope
    public static void mapObject11364(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11365(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject11366(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject11367(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject11368(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject11369(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject11370(Player player, int index, MapObject mapObject) {}

    // Edge
    public static void mapObject11371(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject11373(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2729 || player.getY() != 3489) {
            return;
        }
        if (player.getSkills().getLevel(Skills.AGILITY) < 60) {
            player.getGameEncoder().sendMessage("You need an Agility level of 60 to use this course.");
            return;
        }
        Tile toTile1 = new Tile(2729, 3488, 1);
        Tile toTile2 = new Tile(2729, 3491, 3);
        player.setFaceTile(toTile2);
        player.getMovement().animatedTeleport(toTile1, 3063, null, 1);
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 1) {
                    player.getMovement().animatedTeleport(toTile2, 1120, null, 2);
                } else if (super.getExecutions() == 4) {
                    super.stop();
                    int xp = 45;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject11374(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2721 || player.getY() != 3494) {
            return;
        }
        Tile toTile1 = new Tile(2719, 3495, 2);
        Tile toTile2 = new Tile(2713, 3494, 2);
        int direction = Tile.WEST;
        player.setFaceTile(toTile2);
        player.setAnimation(2588);
        player.setForceMovement(new ForceMovement(player, 0, toTile1, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 0) {
                    player.getMovement().teleport(toTile1);
                    player.setForceMovement(new ForceMovement(direction));
                    player.setAnimation(-1);
                } else if (super.getExecutions() == 1) {
                    player.setAnimation(2588);
                    player.setForceMovement(new ForceMovement(player, 0, toTile2, 4, direction));
                } else if (super.getExecutions() == 2) {
                    player.unlock();
                    player.getMovement().teleport(toTile2);
                    player.setForceMovement(new ForceMovement(direction));
                    player.setAnimation(-1);
                    int xp = 20;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject11375(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2710 && player.getX() != 2711 || player.getY() != 3477) {
            return;
        }
        Tile toTile1 = new Tile(2710, 3474, 1);
        Tile toTile2 = new Tile(2710, 3472, 3);
        int direction = Tile.SOUTH;
        player.setFaceTile(toTile2);
        player.setAnimation(2588);
        player.setForceMovement(new ForceMovement(player, 0, toTile1, 4, direction));
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 0) {
                    player.getMovement().teleport(toTile1);
                    player.setForceMovement(new ForceMovement(direction));
                    player.setAnimation(1120);
                } else if (super.getExecutions() == 2) {
                    player.unlock();
                    player.getMovement().teleport(toTile2);
                    player.setAnimation(-1);
                    int xp = 35;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject11376(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2702 || player.getY() != 3470) {
            return;
        }
        int direction = Tile.SOUTH;
        player.setAnimation(2588);
        Tile toTile = new Tile(2702, 3465, 2);
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
                int xp = 15;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Edge
    public static void mapObject11377(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2702 || player.getY() != 3464) {
            return;
        }
        Tile toTile = new Tile(2704, 3464, 0);
        player.setFaceTile(toTile);
        player.getMovement().animatedTeleport(toTile, 7133, null, 0);
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 435;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (Utils.randomE(6) == 0) {
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
                player.getFamiliar().rollSkillPet(Skills.AGILITY, 35205, 20659);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tightrope
    public static void mapObject11378(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2710) {
            return;
        }
        Tile toTile = new Tile(mapObject.getX(), 3480, mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(762);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 20;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Basket
    public static void mapObject11380(Player player, int index, MapObject mapObject) {}

    // Market stall
    public static void mapObject11381(Player player, int index, MapObject mapObject) {}

    // Banner
    public static void mapObject11382(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11383(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject11384(Player player, int index, MapObject mapObject) {}

    // Rough wall
    public static void mapObject11385(Player player, int index, MapObject mapObject) {}

    // Monkeybars
    public static void mapObject11386(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject11389(Player player, int index, MapObject mapObject) {}

    // Drying line
    public static void mapObject11390(Player player, int index, MapObject mapObject) {}

    // Rough wall
    public static void mapObject11391(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2625 || player.getY() != 3677) {
            return;
        }
        if (player.getSkills().getLevel(Skills.AGILITY) < 80) {
            player.getGameEncoder().sendMessage("You need an Agility level of 80 to use this course.");
            return;
        }
        Tile toTile = new Tile(2625, 3675, 3);
        player.getMovement().ladderUpTeleport(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 20;
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
    public static void mapObject11392(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2622 || player.getY() != 3672) {
            return;
        }
        int direction = Tile.SOUTH;
        player.setAnimation(6132);
        Tile toTile = new Tile(2622, 3668, 3);
        player.setForceMovement(new ForceMovement(player, 1, toTile, 2, direction));
        player.lock();
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                int xp = 30;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tightrope
    public static void mapObject11393(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2622 || player.getY() != 3658) {
            return;
        }
        Tile toTile = new Tile(2627, 3654, mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(762);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 40;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject11395(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2629 || player.getY() != 3655) {
            return;
        }
        player.setAnimation(6132);
        Tile toTile1 = new Tile(2629, 3658, 3);
        Tile toTile2 = new Tile(2635, 3658, 3);
        Tile toTile3 = new Tile(2640, 3652, 3);
        player.setForceMovement(new ForceMovement(player, 1, toTile1, 2, Tile.NORTH));
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event() {
            boolean reachedRope = false;

            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 0) {
                    return;
                } else if (super.getExecutions() == 1) {
                    player.getMovement().teleport(toTile1);
                } else if (super.getExecutions() == 2) {
                    player.getMovement().clear();
                    player.getMovement().addMovement(toTile2);
                    player.getAppearance().setForceMoveAnimation(754);
                } else if (!reachedRope) {
                    if (player.getX() == toTile2.getX() && player.getY() == toTile2.getY()) {
                        reachedRope = true;
                        player.getMovement().clear();
                        player.getMovement().addMovement(toTile3);
                        player.getAppearance().setForceMoveAnimation(762);
                    }
                } else if (player.getX() == toTile3.getX() && player.getY() == toTile3.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 85;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Gap
    public static void mapObject11396(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2643 || player.getY() != 3653) {
            return;
        }
        int direction = Tile.NORTH;
        player.setAnimation(6132);
        Tile toTile = new Tile(2643, 3657, 3);
        player.setForceMovement(new ForceMovement(player, 1, toTile, 2, direction));
        player.lock();
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.unlock();
                player.getMovement().teleport(toTile);
                int xp = 25;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tightrope
    public static void mapObject11397(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2647 || player.getY() != 3662) {
            return;
        }
        Tile toTile = new Tile(2655, 3670, 3);
        player.getMovement().clear();
        player.getMovement().addMovement(2647, 3663);
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(762);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 105;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Our lives
    public static void mapObject11398(Player player, int index, MapObject mapObject) {
        if (index == 1) {
            player.getController().stop();
        }
    }

    // Cave entrance
    public static void mapObject11399(Player player, int index, MapObject mapObject) {}

    // Web
    public static void mapObject11400(Player player, int index, MapObject mapObject) {}

    // Pile of fish
    public static void mapObject11404(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2655 || player.getY() != 3676) {
            return;
        }
        Tile toTile = new Tile(2652, 3676, 0);
        player.getMovement().animatedTeleport(toTile, 7133, null, 0);
        Event event = new Event() {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 475;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (Utils.randomE(4) == 0) {
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
                player.getFamiliar().rollSkillPet(Skills.AGILITY, 31063, 20659);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Wooden Beams
    public static void mapObject11405(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11406(Player player, int index, MapObject mapObject) {}

    // Dug hole
    public static void mapObject11417(Player player, int index, MapObject mapObject) {}

    // Grill
    public static void mapObject11422(Player player, int index, MapObject mapObject) {}

    // Grill
    public static void mapObject11423(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11429(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject11430(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject11441(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11450(Player player, int index, MapObject mapObject) {}

    // Lever A
    public static void mapObject11451(Player player, int index, MapObject mapObject) {}

    // Lever A
    public static void mapObject11452(Player player, int index, MapObject mapObject) {}

    // Lever B
    public static void mapObject11453(Player player, int index, MapObject mapObject) {}

    // Lever B
    public static void mapObject11454(Player player, int index, MapObject mapObject) {}

    // Lever C
    public static void mapObject11455(Player player, int index, MapObject mapObject) {}

    // Lever C
    public static void mapObject11456(Player player, int index, MapObject mapObject) {}

    // Lever D
    public static void mapObject11457(Player player, int index, MapObject mapObject) {}

    // Lever D
    public static void mapObject11458(Player player, int index, MapObject mapObject) {}

    // Lever E
    public static void mapObject11459(Player player, int index, MapObject mapObject) {}

    // Lever E
    public static void mapObject11460(Player player, int index, MapObject mapObject) {}

    // Lever F
    public static void mapObject11461(Player player, int index, MapObject mapObject) {}

    // Lever F
    public static void mapObject11462(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11470(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11471(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject11483(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject11485(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject11486(Player player, int index, MapObject mapObject) {}

    // Cabbage
    public static void mapObject11494(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11498(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11499(Player player, int index, MapObject mapObject) {}

    // Staircase
    public static void mapObject11511(Player player, int index, MapObject mapObject) {}

}


