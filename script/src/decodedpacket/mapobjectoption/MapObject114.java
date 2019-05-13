package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;

public class MapObject114 {
    /* 29184 - 29439 */

    // Mounted Construction Cape
    public static void mapObject29184(Player player, int index, MapObject mapObject) {}

    // Mounted Construction Cape (t)
    public static void mapObject29185(Player player, int index, MapObject mapObject) {}

    // Mounted Cooking Cape
    public static void mapObject29186(Player player, int index, MapObject mapObject) {}

    // Mounted Cooking Cape (t)
    public static void mapObject29187(Player player, int index, MapObject mapObject) {}

    // Mounted Crafting Cape
    public static void mapObject29188(Player player, int index, MapObject mapObject) {}

    // Mounted Crafting Cape (t)
    public static void mapObject29189(Player player, int index, MapObject mapObject) {}

    // Mounted Defence Cape
    public static void mapObject29190(Player player, int index, MapObject mapObject) {}

    // Mounted Defence Cape (t)
    public static void mapObject29191(Player player, int index, MapObject mapObject) {}

    // Mounted Farming Cape
    public static void mapObject29192(Player player, int index, MapObject mapObject) {}

    // Mounted Farming Cape (t)
    public static void mapObject29193(Player player, int index, MapObject mapObject) {}

    // Mounted Firemaking Cape
    public static void mapObject29194(Player player, int index, MapObject mapObject) {}

    // Mounted Firemaking Cape (t)
    public static void mapObject29195(Player player, int index, MapObject mapObject) {}

    // Mounted Fishing Cape
    public static void mapObject29196(Player player, int index, MapObject mapObject) {}

    // Mounted Fishing Cape (t)
    public static void mapObject29197(Player player, int index, MapObject mapObject) {}

    // Mounted Fletching Cape
    public static void mapObject29198(Player player, int index, MapObject mapObject) {}

    // Mounted Fletching Cape (t)
    public static void mapObject29199(Player player, int index, MapObject mapObject) {}

    // Mounted Herblore Cape
    public static void mapObject29200(Player player, int index, MapObject mapObject) {}

    // Mounted Herblore Cape (t)
    public static void mapObject29201(Player player, int index, MapObject mapObject) {}

    // Mounted Hitpoints Cape
    public static void mapObject29202(Player player, int index, MapObject mapObject) {}

    // Mounted Hitpoints Cape (t)
    public static void mapObject29203(Player player, int index, MapObject mapObject) {}

    // Mounted Hunting Cape
    public static void mapObject29204(Player player, int index, MapObject mapObject) {}

    // Mounted Hunting Cape (t)
    public static void mapObject29205(Player player, int index, MapObject mapObject) {}

    // Mounted Magic Cape
    public static void mapObject29206(Player player, int index, MapObject mapObject) {}

    // Mounted Magic Cape (t)
    public static void mapObject29207(Player player, int index, MapObject mapObject) {}

    // Mounted Mining Cape
    public static void mapObject29208(Player player, int index, MapObject mapObject) {}

    // Mounted Mining Cape (t)
    public static void mapObject29209(Player player, int index, MapObject mapObject) {}

    // Mounted Prayer Cape
    public static void mapObject29210(Player player, int index, MapObject mapObject) {}

    // Mounted Prayer Cape (t)
    public static void mapObject29211(Player player, int index, MapObject mapObject) {}

    // Mounted Ranged Cape
    public static void mapObject29212(Player player, int index, MapObject mapObject) {}

    // Mounted Ranged Cape (t)
    public static void mapObject29213(Player player, int index, MapObject mapObject) {}

    // Mounted Runecrafting Cape
    public static void mapObject29214(Player player, int index, MapObject mapObject) {}

    // Mounted Runecrafting Cape (t)
    public static void mapObject29215(Player player, int index, MapObject mapObject) {}

    // Mounted Slayer Cape
    public static void mapObject29216(Player player, int index, MapObject mapObject) {}

    // Mounted Slayer Cape (t)
    public static void mapObject29217(Player player, int index, MapObject mapObject) {}

    // Mounted Smithing Cape
    public static void mapObject29218(Player player, int index, MapObject mapObject) {}

    // Mounted Smithing Cape (t)
    public static void mapObject29219(Player player, int index, MapObject mapObject) {}

    // Mounted Strength Cape
    public static void mapObject29220(Player player, int index, MapObject mapObject) {}

    // Mounted Strength Cape (t)
    public static void mapObject29221(Player player, int index, MapObject mapObject) {}

    // Mounted Thieving Cape
    public static void mapObject29222(Player player, int index, MapObject mapObject) {}

    // Mounted Thieving Cape (t)
    public static void mapObject29223(Player player, int index, MapObject mapObject) {}

    // Mounted Woodcutting Cape
    public static void mapObject29224(Player player, int index, MapObject mapObject) {}

    // Mounted Woodcutting Cape (t)
    public static void mapObject29225(Player player, int index, MapObject mapObject) {}

    // Quest List
    public static void mapObject29226(Player player, int index, MapObject mapObject) {}

    // Spirit Tree
    public static void mapObject29227(Player player, int index, MapObject mapObject) {}

    // Fairy Ring
    public static void mapObject29228(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Spiritual Fairy Tree
    public static void mapObject29229(Player player, int index, MapObject mapObject) {
        if (index == 0) {
            player.openDialogue("spirittree", 0);
        } else if (index == 1) {
            player.openDialogue("fairyring", 0);
        }
    }

    // Topiary bush
    public static void mapObject29230(Player player, int index, MapObject mapObject) {}

    // Kraken Topiary
    public static void mapObject29231(Player player, int index, MapObject mapObject) {}

    // Zulrah Topiary
    public static void mapObject29232(Player player, int index, MapObject mapObject) {}

    // Kalphite Queen Topiary
    public static void mapObject29233(Player player, int index, MapObject mapObject) {}

    // Cerberus Topiary
    public static void mapObject29234(Player player, int index, MapObject mapObject) {}

    // Abyssal Sire Topiary
    public static void mapObject29235(Player player, int index, MapObject mapObject) {}

    // Skotizo Topiary
    public static void mapObject29236(Player player, int index, MapObject mapObject) {}

    // Pool of Restoration
    public static void mapObject29237(Player player, int index, MapObject mapObject) {}

    // Pool of Revitalisation
    public static void mapObject29238(Player player, int index, MapObject mapObject) {}

    // Pool of Rejuvenation
    public static void mapObject29239(Player player, int index, MapObject mapObject) {}

    // Fancy rejuvenation pool
    public static void mapObject29240(Player player, int index, MapObject mapObject) {}

    // Ornate rejuvenation pool
    public static void mapObject29241(Player player, int index, MapObject mapObject) {
        if (player.inPvPWorld()) {
            player.getGameEncoder().sendMessage("You can't use this here.");
            return;
        }
        player.setGraphic(436);
        player.getGameEncoder().sendMessage("The pool restores you.");
        player.rejuvenate();
    }

    // Zen theme
    public static void mapObject29247(Player player, int index, MapObject mapObject) {}

    // Otherworldly theme
    public static void mapObject29253(Player player, int index, MapObject mapObject) {}

    // Volcanic theme
    public static void mapObject29261(Player player, int index, MapObject mapObject) {}

    // Redwood fence
    public static void mapObject29262(Player player, int index, MapObject mapObject) {}

    // Redwood fence post
    public static void mapObject29263(Player player, int index, MapObject mapObject) {}

    // Redwood fence post
    public static void mapObject29264(Player player, int index, MapObject mapObject) {}

    // Obsidian fence
    public static void mapObject29267(Player player, int index, MapObject mapObject) {}

    // Obsidian fence post
    public static void mapObject29268(Player player, int index, MapObject mapObject) {}

    // Obsidian fence post
    public static void mapObject29269(Player player, int index, MapObject mapObject) {}

    // Teak bench
    public static void mapObject29270(Player player, int index, MapObject mapObject) {}

    // Teak bench
    public static void mapObject29271(Player player, int index, MapObject mapObject) {}

    // Gnome bench
    public static void mapObject29272(Player player, int index, MapObject mapObject) {}

    // Gnome bench
    public static void mapObject29273(Player player, int index, MapObject mapObject) {}

    // Marble bench
    public static void mapObject29274(Player player, int index, MapObject mapObject) {}

    // Marble bench
    public static void mapObject29275(Player player, int index, MapObject mapObject) {}

    // Obsidian bench
    public static void mapObject29276(Player player, int index, MapObject mapObject) {}

    // Obsidian bench
    public static void mapObject29277(Player player, int index, MapObject mapObject) {}

    // Bruma roots
    public static void mapObject29311(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject29312(Player player, int index, MapObject mapObject) {}

    // Brazier
    public static void mapObject29313(Player player, int index, MapObject mapObject) {}

    // Burning brazier
    public static void mapObject29314(Player player, int index, MapObject mapObject) {}

    // Sprouting Roots
    public static void mapObject29315(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject29316(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject29317(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject29318(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject29319(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject29320(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject29321(Player player, int index, MapObject mapObject) {}

    // Doors of Dinh
    public static void mapObject29322(Player player, int index, MapObject mapObject) {}

    // Gap
    public static void mapObject29326(Player player, int index, MapObject mapObject) {}

    // Bank Deposit Box
    public static void mapObject29327(Player player, int index, MapObject mapObject) {
        player.getBank().openDepositBox();
    }

    // Coffer
    public static void mapObject29328(Player player, int index, MapObject mapObject) {}

    // Coffer
    public static void mapObject29329(Player player, int index, MapObject mapObject) {}

    // Coffer
    public static void mapObject29330(Player player, int index, MapObject mapObject) {}

    // Cart tunnel
    public static void mapObject29332(Player player, int index, MapObject mapObject) {}

    // Cart tunnel
    public static void mapObject29333(Player player, int index, MapObject mapObject) {}

}


