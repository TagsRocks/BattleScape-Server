package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.controller.BossInstancePC;

public class MapObject124 {
    /* 31744 - 31999 */

    // gangplank
    public static void mapObject31756(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31757(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31758(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31759(Player player, int index, MapObject mapObject) {}

    // hole
    public static void mapObject31765(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject31766(Player player, int index, MapObject mapObject) {}

    // vine ladder
    public static void mapObject31790(Player player, int index, MapObject mapObject) {}

    // hole
    public static void mapObject31791(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject31806(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject31807(Player player, int index, MapObject mapObject) {}

    // magical barrier
    public static void mapObject31808(Player player, int index, MapObject mapObject) {}

    // pillar
    public static void mapObject31809(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31822(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31823(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31824(Player player, int index, MapObject mapObject) {}

    // pool of dreams
    public static void mapObject31825(Player player, int index, MapObject mapObject) {}

    // dream list
    public static void mapObject31826(Player player, int index, MapObject mapObject) {}

    // maple birdhouse (empty)
    public static void mapObject31827(Player player, int index, MapObject mapObject) {}

    // maple birdhouse
    public static void mapObject31828(Player player, int index, MapObject mapObject) {}

    // maple birdhouse
    public static void mapObject31829(Player player, int index, MapObject mapObject) {}

    // mahoganybirdhouse (empty)
    public static void mapObject31830(Player player, int index, MapObject mapObject) {}

    // mahogany birdhouse
    public static void mapObject31831(Player player, int index, MapObject mapObject) {}

    // mahogany birdhouse
    public static void mapObject31832(Player player, int index, MapObject mapObject) {}

    // yew birdhouse (empty)
    public static void mapObject31833(Player player, int index, MapObject mapObject) {}

    // yew birdhouse
    public static void mapObject31834(Player player, int index, MapObject mapObject) {}

    // yew birdhouse
    public static void mapObject31835(Player player, int index, MapObject mapObject) {}

    // magic birdhouse (empty)
    public static void mapObject31836(Player player, int index, MapObject mapObject) {}

    // magic birdhouse
    public static void mapObject31837(Player player, int index, MapObject mapObject) {}

    // magic birdhouse
    public static void mapObject31838(Player player, int index, MapObject mapObject) {}

    // redwood birdhouse (empty)
    public static void mapObject31839(Player player, int index, MapObject mapObject) {}

    // redwood birdhouse
    public static void mapObject31840(Player player, int index, MapObject mapObject) {}

    // redwood birdhouse
    public static void mapObject31841(Player player, int index, MapObject mapObject) {}

    // decaying trunk
    public static void mapObject31842(Player player, int index, MapObject mapObject) {}

    // <col=ffff00>annette</col>
    public static void mapObject31843(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject31844(Player player, int index, MapObject mapObject) {}

    // tunnel
    public static void mapObject31845(Player player, int index, MapObject mapObject) {}

    // notice board
    public static void mapObject31846(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31848(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31849(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31850(Player player, int index, MapObject mapObject) {}

    // rocks
    public static void mapObject31852(Player player, int index, MapObject mapObject) {}

    // rope
    public static void mapObject31853(Player player, int index, MapObject mapObject) {}

    // vorkath head
    public static void mapObject31977(Player player, int index, MapObject mapObject) {}

    // vorkath display
    public static void mapObject31978(Player player, int index, MapObject mapObject) {}

    // mounted max cape
    public static void mapObject31979(Player player, int index, MapObject mapObject) {}

    // mounted max cape
    public static void mapObject31980(Player player, int index, MapObject mapObject) {}

    // mounted max cape
    public static void mapObject31981(Player player, int index, MapObject mapObject) {}

    // mounted max cape
    public static void mapObject31982(Player player, int index, MapObject mapObject) {}

    // mounted mythical cape
    public static void mapObject31983(Player player, int index, MapObject mapObject) {}

    // rune dragon
    public static void mapObject31984(Player player, int index, MapObject mapObject) {}

    // vorkath topiary
    public static void mapObject31985(Player player, int index, MapObject mapObject) {}

    // mythical cape
    public static void mapObject31986(Player player, int index, MapObject mapObject) {}

    // closed chest
    public static void mapObject31987(Player player, int index, MapObject mapObject) {}

    // open chest
    public static void mapObject31988(Player player, int index, MapObject mapObject) {}

    // fremennik boat
    public static void mapObject31989(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31990(Player player, int index, MapObject mapObject) {
        if (player.getY() <= 4052) {
            player.setController(new BossInstancePC());
            player.getController().instance();
            player.getMovement().teleport(2272, 4054);
            player.getController().getVariable("boss_instance_vorkath");
        } else {
            player.getController().stop();
        }
    }

    // ice chunks
    public static void mapObject31992(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31994(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31996(Player player, int index, MapObject mapObject) {}

    // ice chunks
    public static void mapObject31998(Player player, int index, MapObject mapObject) {}

    // cave
    public static void mapObject31999(Player player, int index, MapObject mapObject) {}

}


