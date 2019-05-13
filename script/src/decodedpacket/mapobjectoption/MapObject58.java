package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Movement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.AchievementDiaryTask;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Prayer;
import com.palidino.osrs.model.player.Runecrafting;
import com.palidino.osrs.model.player.Skills;
import com.palidino.util.Time;

public class MapObject58 {
    /* 14848 - 15103 */

    // Portal
    public static void mapObject14848(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject14860(Player player, int index, MapObject mapObject) {
        player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
        player.setAnimation(Prayer.PRAY_ANIMATION);
    }

    // Trapdoor
    public static void mapObject14880(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject14886(Player player, int index, MapObject mapObject) {
        if (!player.getWidgetManager().isDiaryComplete(AchievementDiary.Name.FALADOR,
                AchievementDiaryTask.Difficulty.HARD)) {
            player.getGameEncoder().sendMessage("You need to complete the hard Falador achievement diary.");
            return;
        }
        player.getBank().open();
    }

    // Pottery Oven
    public static void mapObject14888(Player player, int index, MapObject mapObject) {}

    // Spinning wheel
    public static void mapObject14889(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14892(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14893(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject14894(Player player, int index, MapObject mapObject) {}

    // Flax
    public static void mapObject14896(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject14897(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.AIR);
    }

    // Altar
    public static void mapObject14898(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.MIND);
    }

    // Altar
    public static void mapObject14899(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.WATER);
    }

    // Altar
    public static void mapObject14900(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.EARTH);
    }

    // Altar
    public static void mapObject14901(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.FIRE);
    }

    // Altar
    public static void mapObject14902(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.BODY);
    }

    // Altar
    public static void mapObject14903(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.COSMIC);
    }

    // Altar
    public static void mapObject14904(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.LAW);
    }

    // Altar
    public static void mapObject14905(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.NATURE);
    }

    // Altar
    public static void mapObject14906(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.CHAOS);
    }

    // Altar
    public static void mapObject14907(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.DEATH);
    }

    // Flax
    public static void mapObject14909(Player player, int index, MapObject mapObject) {}

    // Guild Door
    public static void mapObject14910(Player player, int index, MapObject mapObject) {
        if (mapObject.getOriginal() != null || mapObject.getAttachment() != null) {
            return;
        }
        if (player.getSkills().getLevel(Skills.CRAFTING) < 40) {
            player.getGameEncoder().sendMessage("You need a Crafting level of 40 to enter.");
            return;
        }
        player.getMovement().clear();
        if (player.getY() >= 3289) {
            player.getMovement().addMovement(player.getX(), player.getY() - 1);
        } else {
            player.getMovement().addMovement(player.getX(), player.getY() + 1);
        }
        Region.openDoors(player, mapObject, 1, false);
    }

    // Altar
    public static void mapObject14911(Player player, int index, MapObject mapObject) {}

    // Sand
    public static void mapObject14914(Player player, int index, MapObject mapObject) {}

    // Sand
    public static void mapObject14915(Player player, int index, MapObject mapObject) {}

    // Broken multicannon
    public static void mapObject14916(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject14917(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 82) {
            player.getGameEncoder().sendMessage("You need an Agility level of 82 to use this.");
            return;
        }
        if (player.getController().isMagicBound()) {
            player.getGameEncoder()
                    .sendMessage("A magical force stops you from moving for "
                            + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                            + " more seconds.");
            return;
        }
        if (player.getY() <= 3879) {
            player.getMovement().animatedTeleport(new Tile(3091, 3882, player.getHeight()), 7133, null, 0);
        } else {
            player.getMovement().animatedTeleport(new Tile(3093, 3879, player.getHeight()), 7133, null, 0);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Stepping stone
    public static void mapObject14918(Player player, int index, MapObject mapObject) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 74) {
            player.getGameEncoder().sendMessage("You need an Agility level of 74 to use this.");
            return;
        }
        if (player.getController().isMagicBound()) {
            player.getGameEncoder()
                    .sendMessage("A magical force stops you from moving for "
                            + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                            + " more seconds.");
            return;
        }
        if (player.getX() == 3201 && player.getY() == 3810) {
            player.getMovement().animatedTeleport(new Tile(3201, 3807, player.getHeight()), 7133, null, 0);
        } else if (player.getX() == 3201 && player.getY() == 3807) {
            player.getMovement().animatedTeleport(new Tile(3201, 3810, player.getHeight()), 7133, null, 0);
        }
        AchievementDiary.agilityObstacleHooks(player, mapObject);
    }

    // Sand
    public static void mapObject14948(Player player, int index, MapObject mapObject) {}

    // Mill
    public static void mapObject14960(Player player, int index, MapObject mapObject) {}

    // Bamboo Door
    public static void mapObject14974(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14977(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14979(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14980(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14981(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14982(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject14983(Player player, int index, MapObject mapObject) {}

    // Strange shrine
    public static void mapObject14985(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject14986(Player player, int index, MapObject mapObject) {}

    // Chest
    public static void mapObject14988(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14989(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14990(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14991(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14992(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14993(Player player, int index, MapObject mapObject) {}

    // Mysterious ruins
    public static void mapObject14994(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject14995(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject14996(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15030(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject15031(Player player, int index, MapObject mapObject) {}

    // Crates
    public static void mapObject15032(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject15050(Player player, int index, MapObject mapObject) {}

    // Altar
    public static void mapObject15051(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject15052(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject15053(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject15056(Player player, int index, MapObject mapObject) {}

    // Coffin
    public static void mapObject15061(Player player, int index, MapObject mapObject) {}

    // Teak
    public static void mapObject15062(Player player, int index, MapObject mapObject) {}

    // Weedy patch
    public static void mapObject15063(Player player, int index, MapObject mapObject) {}

    // Weedy patch
    public static void mapObject15064(Player player, int index, MapObject mapObject) {}

    // Weedy patch
    public static void mapObject15065(Player player, int index, MapObject mapObject) {}

    // Weedy patch
    public static void mapObject15067(Player player, int index, MapObject mapObject) {}

    // Flax
    public static void mapObject15075(Player player, int index, MapObject mapObject) {}

    // Flax
    public static void mapObject15076(Player player, int index, MapObject mapObject) {}

    // Flax
    public static void mapObject15077(Player player, int index, MapObject mapObject) {}

    // Flax
    public static void mapObject15079(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject15080(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject15081(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject15082(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject15084(Player player, int index, MapObject mapObject) {}

}


