package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import com.palidino.util.event.Event;

public class MapObject91 {
    /* 23296 - 23551 */

    // Door
    public static void mapObject23338(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject23339(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject23340(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject23341(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject23342(Player player, int index, MapObject mapObject) {}

    // Large door
    public static void mapObject23343(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23376(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23377(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject23378(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject23499(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23504(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject23530(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23531(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject23532(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject23533(Player player, int index, MapObject mapObject) {}

    // Log balance
    public static void mapObject23542(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject23543(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject23544(Player player, int index, MapObject mapObject) {}

    // Climbing rocks
    public static void mapObject23545(Player player, int index, MapObject mapObject) {}

    // Balancing ledge
    public static void mapObject23546(Player player, int index, MapObject mapObject) {}

    // Balancing ledge
    public static void mapObject23547(Player player, int index, MapObject mapObject) {
        if (player.getY() != mapObject.getY()) {
            return;
        }
        player.getGameEncoder().sendMessage("You put your foot on the ledge and try to edge across...");
        Tile toTile = new Tile(2532, mapObject.getY(), mapObject.getHeight());
        boolean running = player.getMovement().getRunning();
        player.setAnimation(753);
        player.lock();
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (super.getExecutions() == 0) {
                    player.getMovement().clear();
                    player.getMovement().addMovement(toTile);
                    player.getMovement().setRunning(false);
                    player.getAppearance().setForceMoveAnimation(756);
                }
                if (player.getX() == toTile.getX() && player.getY() == toTile.getY()) {
                    super.stop();
                    player.setAnimation(759);
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    int xp = 22;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    player.getGameEncoder().sendMessage("You skillfully edge across the gap.");
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

    // Balancing ledge
    public static void mapObject23548(Player player, int index, MapObject mapObject) {}

}


