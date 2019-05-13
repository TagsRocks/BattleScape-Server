package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.ForceMovement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import com.palidino.util.Utils;
import com.palidino.util.event.Event;

public class MapObject90 {
    /* 23040 - 23295 */

    // Tools
    public static void mapObject23042(Player player, int index, MapObject mapObject) {}

    // Tools
    public static void mapObject23043(Player player, int index, MapObject mapObject) {}

    // Tools
    public static void mapObject23045(Player player, int index, MapObject mapObject) {}

    // Fairy ring
    public static void mapObject23047(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Doorway
    public static void mapObject23052(Player player, int index, MapObject mapObject) {}

    // Broken cart
    public static void mapObject23055(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject23056(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject23057(Player player, int index, MapObject mapObject) {}

    // Open statue
    public static void mapObject23058(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject23073(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject23074(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject23091(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject23092(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject23093(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject23094(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject23095(Player player, int index, MapObject mapObject) {}

    // Statue
    public static void mapObject23096(Player player, int index, MapObject mapObject) {}

    // Floor
    public static void mapObject23098(Player player, int index, MapObject mapObject) {}

    // Soul boat
    public static void mapObject23101(Player player, int index, MapObject mapObject) {}

    // Iron Winch
    public static void mapObject23104(Player player, int index, MapObject mapObject) {
        if (!player.getSlayer().isAnyTask(5862) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
            player.getGameEncoder().sendMessage("You need an appropriate Slayer task of Cerberus to enter.");
            return;
        }
        if (mapObject.getX() == 1291 && mapObject.getY() == 1254) {
            player.getMovement().teleport(1240, 1227);
        } else if (mapObject.getX() == 1328 && mapObject.getY() == 1254) {
            player.getMovement().teleport(1368, 1227);
        } else if (mapObject.getX() == 1307 && mapObject.getY() == 1269) {
            player.openDialogue("bossinstance", 4);
        }
    }

    // Flames
    public static void mapObject23105(Player player, int index, MapObject mapObject) {}

    // Fishing spot
    public static void mapObject23114(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject23115(Player player, int index, MapObject mapObject) {}

    // Device
    public static void mapObject23117(Player player, int index, MapObject mapObject) {}

    // Rope swing
    public static void mapObject23122(Player player, int index, MapObject mapObject) {}

    // Rope swing
    public static void mapObject23123(Player player, int index, MapObject mapObject) {}

    // Ropeswing
    public static void mapObject23131(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 35) {
            player.getGameEncoder().sendMessage("You need an Agility level of 35 to use this course.");
            return;
        }
        if (player.getY() != 3554) {
            player.getGameEncoder().sendMessage("You'll need to get closer to make this jump.");
            return;
        }
        Tile startTile = new Tile(mapObject.getX(), 3554, mapObject.getHeight());
        Tile toTile = new Tile(mapObject.getX(), 3549, mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(startTile);
        player.lock();
        Event event = new Event() {
            boolean reachedStartTile = false;
            int reachedStartTileTries = 0;

            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (!reachedStartTile) {
                    if (player.getX() == startTile.getX() && player.getY() == startTile.getY()) {
                        reachedStartTile = true;
                        player.setAnimation(751);
                        player.setForceMovement(new ForceMovement(player, 1, toTile, 2, Tile.SOUTH));
                        super.setTick(1);
                    } else if (reachedStartTileTries++ > 32) {
                        player.unlock();
                        super.stop();
                    }
                } else {
                    super.stop();
                    player.getGameEncoder().sendMessage("You skillfully swing across.");
                    player.getMovement().teleport(toTile);
                    int xp = 22;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.putAttribute("agility_stage", 1);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Ropeswing
    public static void mapObject23132(Player player, int index, MapObject mapObject) {}

    // Obstacle net
    public static void mapObject23133(Player player, int index, MapObject mapObject) {}

    // Obstacle net
    public static void mapObject23134(Player player, int index, MapObject mapObject) {
        if (player.getY() != 3426) {
            return;
        }
        player.getGameEncoder().sendMessage("You climb the netting.");
        Tile toTile = new Tile(player.getX(), 3423, 1);
        player.getMovement().ladderUpTeleport(toTile);
        player.setFaceTile(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                int xp = 8;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 1) {
                    player.putAttribute("agility_stage", 2);
                }
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Obstacle net
    public static void mapObject23135(Player player, int index, MapObject mapObject) {
        if (player.getY() != 3425) {
            return;
        }
        player.getGameEncoder().sendMessage("You climb the netting.");
        Tile currentTile = new Tile(player);
        Tile toTile = new Tile(player.getX(), player.getY() == 3425 ? 3427 : 3425, 0);
        player.setLock(5);
        player.getMovement().animatedTeleport(toTile, 3063, -2, null, null, 2);
        player.setFaceTile(toTile);
        Event event = new Event(Event.MILLIS_600) {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 2) {
                    player.setFaceTile(currentTile);
                } else if (super.getExecutions() == 5) {
                    super.stop();
                    int xp = 8;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    if (player.getAttributeInt("agility_stage") == 5) {
                        player.putAttribute("agility_stage", 6);
                    }
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Obstacle pipe
    public static void mapObject23136(Player player, int index, MapObject mapObject) {}

    // Obstacle pipe
    public static void mapObject23137(Player player, int index, MapObject mapObject) {}

    // Obstacle pipe
    public static void mapObject23138(Player player, int index, MapObject mapObject) {
        if (player.getX() != mapObject.getX()) {
            return;
        }
        Tile toTile = new Tile(mapObject.getX(), mapObject.getY() == 3431 ? 3437 : 3430, mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(749);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event(Event.MILLIS_600) {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 1) {
                    player.getAppearance().setForceMoveAnimation(747);
                }
                if (player.getDistance(toTile) == 1) {
                    player.getAppearance().setForceMoveAnimation(748);
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 8 + (player.getAttributeInt("agility_stage") == 6 ? 39 : 0);
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    if (player.getAttributeInt("agility_stage") == 6) {
                        player.removeAttribute("agility_stage");
                        // 102 laps an hour
                        if (Utils.randomE(50) == 0) {
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
                        player.getFamiliar().rollSkillPet(Skills.AGILITY, 35609, 20659);
                    }
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Obstacle pipe
    public static void mapObject23139(Player player, int index, MapObject mapObject) {
        if (player.getX() != mapObject.getX()) {
            return;
        }
        Tile toTile = new Tile(mapObject.getX(), mapObject.getY() == 3431 ? 3437 : 3430, mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(749);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        Event event = new Event(Event.MILLIS_600) {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 1) {
                    player.getAppearance().setForceMoveAnimation(747);
                }
                if (player.getDistance(toTile) == 1) {
                    player.getAppearance().setForceMoveAnimation(748);
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 8;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    if (player.getAttributeInt("agility_stage") == 6) {
                        player.removeAttribute("agility_stage");
                        xp = 39;
                        if (player.getEquipment().wearingMinimumGraceful()) {
                            xp *= 1.1;
                        }
                        player.getSkills().addXP(Skills.AGILITY, xp);
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
                    }
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Obstacle pipe
    public static void mapObject23140(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject23144(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 35) {
            player.getGameEncoder().sendMessage("You need an Agility level of 35 to use this course.");
            return;
        }
        player.lock();
        Tile startTile = new Tile(2551, mapObject.getY(), mapObject.getHeight());
        Tile toTile = new Tile(2541, mapObject.getY(), mapObject.getHeight());
        player.getMovement().clear();
        player.getMovement().addMovement(startTile);
        boolean running = player.getMovement().getRunning();
        final Tile finalTileStart = startTile;
        final Tile finalTileTo = toTile;
        Event event = new Event() {
            boolean reachedStartTile = false;

            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (!reachedStartTile) {
                    if (player.getX() == finalTileStart.getX() && player.getY() == finalTileStart.getY()) {
                        reachedStartTile = true;
                        player.getGameEncoder().sendMessage("You walk carefully across the slippery log...");
                        player.getAppearance().setForceMoveAnimation(762);
                        player.getMovement().setRunning(false);
                        player.getMovement().addMovement(toTile);
                        super.setTick(1);
                    }
                } else if (player.getX() == finalTileTo.getX() && player.getY() == finalTileTo.getY()) {
                    super.stop();
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 14;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.getGameEncoder().sendMessage("... and make it safely to the other side.");
                    player.putAttribute("agility_stage", 2);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Log balance
    public static void mapObject23145(Player player, int index, MapObject mapObject) {
        if (player.getX() != mapObject.getX()) {
            return;
        }
        player.getGameEncoder().sendMessage("You walk carefully across the slippery log...");
        Tile toTile = new Tile(mapObject.getX(), 3429, mapObject.getHeight());
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
                    int xp = 8;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.getGameEncoder().sendMessage("... and make it safely to the other side.");
                    player.putAttribute("agility_stage", 1);
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Picture wall
    public static void mapObject23156(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject23157(Player player, int index, MapObject mapObject) {
        // Brine Rat Cavern exit
        Tile tile = new Tile(2729, 3734, 0);
        player.getMovement().ladderDownTeleport(tile);
    }

    // Cave
    public static void mapObject23158(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject23216(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject23217(Player player, int index, MapObject mapObject) {}

    // Wilderness Ditch
    public static void mapObject23271(Player player, int index, MapObject mapObject) {
        Tile tile;
        if (player.getY() < mapObject.getY()) {
            tile = new Tile(player.getX(), mapObject.getY() + 2, player.getHeight());
            Tile compareTile = new Tile(tile);
            compareTile.setY(compareTile.getY() + 8);
            if (!player.getController().canTeleport(compareTile, true)) {
                return;
            }
        } else {
            tile = new Tile(player.getX(), mapObject.getY() - 1, player.getHeight());
        }
        ForceMovement forceMovement = new ForceMovement(new Tile(player), 1, tile, 2,
                player.getY() < mapObject.getY() ? Tile.NORTH : Tile.SOUTH);
        player.setForceMovementTeleport(forceMovement, 6132, 1, null);
        player.clearHits();
        player.getMovement().setTeleportBlock(0);
    }

    // Log balance
    public static void mapObject23274(Player player, int index, MapObject mapObject) {}

    // Sign
    public static void mapObject23275(Player player, int index, MapObject mapObject) {}

    // Sign
    public static void mapObject23276(Player player, int index, MapObject mapObject) {}

    // Sign
    public static void mapObject23277(Player player, int index, MapObject mapObject) {}

    // Sign
    public static void mapObject23278(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23279(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject23282(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject23283(Player player, int index, MapObject mapObject) {}

    // Zanik
    public static void mapObject23284(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject23285(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject23286(Player player, int index, MapObject mapObject) {}

    // Doorway
    public static void mapObject23287(Player player, int index, MapObject mapObject) {}

}


