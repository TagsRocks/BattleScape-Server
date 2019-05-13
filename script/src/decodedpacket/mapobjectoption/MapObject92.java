package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Movement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import com.palidino.util.Time;
import com.palidino.util.event.Event;

public class MapObject92 {
    /* 23552 - 23807 */

    // Gate
    public static void mapObject23552(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject23553(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject23554(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject23555(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject23556(Player player, int index, MapObject mapObject) {}

    // Balancing rope
    public static void mapObject23557(Player player, int index, MapObject mapObject) {
        if (player.getX() != 2477 || player.getY() != 3420) {
            return;
        }
        player.getGameEncoder().sendMessage("You walk carefully across the rope...");
        Tile toTile = new Tile(2483, mapObject.getY(), mapObject.getHeight());
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
                    if (player.getAttributeInt("agility_stage") == 3) {
                        player.putAttribute("agility_stage", 4);
                    }
                    player.unlock();
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Balancing rope
    public static void mapObject23558(Player player, int index, MapObject mapObject) {}

    // Tree branch
    public static void mapObject23559(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("You climb the tree...");
        Tile toTile = new Tile(2473, 3420, 2);
        player.getMovement().ladderUpTeleport(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.getGameEncoder().sendMessage("... to the platform above.");
                int xp = 5;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 2) {
                    player.putAttribute("agility_stage", 3);
                }
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tree branch
    public static void mapObject23560(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("You climb down the tree...");
        Tile toTile = new Tile(2487, 3421, 0);
        player.getMovement().ladderUpTeleport(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.getGameEncoder().sendMessage("... and land on the ground.");
                int xp = 5;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 4) {
                    player.putAttribute("agility_stage", 5);
                }
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tree branch
    public static void mapObject23561(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("You climb down the tree...");
        Tile toTile = new Tile(2487, 3421, 0);
        player.getMovement().ladderUpTeleport(toTile);
        Event event = new Event(1) {
            @Override
            public void execute() {
                super.stop();
                if (!player.isVisible()) {
                    return;
                }
                player.getGameEncoder().sendMessage("... and land on the ground.");
                int xp = 5;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 4) {
                    player.putAttribute("agility_stage", 5);
                }
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Staircase
    public static void mapObject23562(Player player, int index, MapObject mapObject) {}

    // Pile of rubble
    public static void mapObject23563(Player player, int index, MapObject mapObject) {}

    // Pile of rubble
    public static void mapObject23564(Player player, int index, MapObject mapObject) {}

    // Monkeybars
    public static void mapObject23566(Player player, int index, MapObject mapObject) {
        if (player.getController().isMagicBound()) {
            player.getGameEncoder()
                    .sendMessage("A magical force stops you from moving for "
                            + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                            + " more seconds.");
            return;
        }
        if (mapObject.getX() == 3120 && mapObject.getY() == 9964) {
            player.getMovement().teleport(3121, 9970);
        } else if (mapObject.getX() == 3120 && mapObject.getY() == 9969) {
            player.getMovement().teleport(3121, 9963);
        }
    }

    // Monkeybars
    public static void mapObject23567(Player player, int index, MapObject mapObject) {}

    // Ropeswing
    public static void mapObject23568(Player player, int index, MapObject mapObject) {}

    // Ropeswing
    public static void mapObject23569(Player player, int index, MapObject mapObject) {}

    // Ropeswing
    public static void mapObject23570(Player player, int index, MapObject mapObject) {}

    // Ropeswing
    public static void mapObject23571(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23584(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23585(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23586(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject23596(Player player, int index, MapObject mapObject) {}

    // Tunnel entrance
    public static void mapObject23609(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3509 && mapObject.getY() == 9497) {
            player.openDialogue("bossinstance", 13);
        }
    }

    // Cocoon
    public static void mapObject23611(Player player, int index, MapObject mapObject) {}

    // Cadava bush
    public static void mapObject23625(Player player, int index, MapObject mapObject) {}

    // Cadava bush
    public static void mapObject23626(Player player, int index, MapObject mapObject) {}

    // Cadava bush
    public static void mapObject23627(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject23628(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject23629(Player player, int index, MapObject mapObject) {}

    // Redberry bush
    public static void mapObject23630(Player player, int index, MapObject mapObject) {}

    // Plaque
    public static void mapObject23636(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject23640(Player player, int index, MapObject mapObject) {}

    // A wooden log
    public static void mapObject23644(Player player, int index, MapObject mapObject) {}

    // Stepping stones
    public static void mapObject23645(Player player, int index, MapObject mapObject) {}

    // Stepping stones
    public static void mapObject23646(Player player, int index, MapObject mapObject) {}

    // Stepping stones
    public static void mapObject23647(Player player, int index, MapObject mapObject) {}

    // Oozing barrier
    public static void mapObject23653(Player player, int index, MapObject mapObject) {}

    // Oozing barrier
    public static void mapObject23654(Player player, int index, MapObject mapObject) {}

    // Telekinetic Teleport
    public static void mapObject23673(Player player, int index, MapObject mapObject) {}

    // Enchanters Teleport
    public static void mapObject23674(Player player, int index, MapObject mapObject) {}

    // Alchemists Teleport
    public static void mapObject23675(Player player, int index, MapObject mapObject) {}

    // Graveyard Teleport
    public static void mapObject23676(Player player, int index, MapObject mapObject) {}

    // Exit Teleport
    public static void mapObject23677(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23678(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23679(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23680(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23681(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23682(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23683(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23684(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23685(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23686(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23687(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23688(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23689(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23690(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23691(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23692(Player player, int index, MapObject mapObject) {}

    // Cupboard
    public static void mapObject23693(Player player, int index, MapObject mapObject) {}

    // Cube Pile
    public static void mapObject23694(Player player, int index, MapObject mapObject) {}

    // Cylinder Pile
    public static void mapObject23695(Player player, int index, MapObject mapObject) {}

    // Icosahedron Pile
    public static void mapObject23696(Player player, int index, MapObject mapObject) {}

    // Pentamid Pile
    public static void mapObject23697(Player player, int index, MapObject mapObject) {}

    // Hole
    public static void mapObject23698(Player player, int index, MapObject mapObject) {}

    // Goo covered vine
    public static void mapObject23703(Player player, int index, MapObject mapObject) {}

    // Goo covered vine
    public static void mapObject23704(Player player, int index, MapObject mapObject) {}

    // Dripping vine
    public static void mapObject23705(Player player, int index, MapObject mapObject) {}

    // Dripping vine
    public static void mapObject23706(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject23707(Player player, int index, MapObject mapObject) {}

    // Box of Health
    public static void mapObject23709(Player player, int index, MapObject mapObject) {
        if (player.inPvPWorld()) {
            player.getGameEncoder().sendMessage("You can't use this here.");
            return;
        }
        player.setGraphic(436);
        player.getGameEncoder().sendMessage("The pool restores you.");
        player.rejuvenate();
    }

    // Portal of Death
    public static void mapObject23727(Player player, int index, MapObject mapObject) {}

    // Portal of Death
    public static void mapObject23728(Player player, int index, MapObject mapObject) {}

    // Cradle of Life
    public static void mapObject23731(Player player, int index, MapObject mapObject) {}

    // Bone Chain
    public static void mapObject23732(Player player, int index, MapObject mapObject) {}

}


