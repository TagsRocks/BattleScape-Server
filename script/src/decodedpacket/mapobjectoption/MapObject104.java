package decodedpacket.mapobjectoption;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.Movement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.controller.ClanWarsFreeForAllPC;
import com.palidino.util.Time;
import com.palidino.util.Utils;
import bin.com.palidino.osrs.model.dialogue.Dialogue;

public class MapObject104 {
    /* 26624 - 26879 */

    // An anonymous looking door
    public static void mapObject26624(Player player, int index, MapObject mapObject) {}

    // An anonymous looking door
    public static void mapObject26625(Player player, int index, MapObject mapObject) {}

    // Sarcophagus
    public static void mapObject26626(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26628(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26629(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26630(Player player, int index, MapObject mapObject) {}

    // Urn
    public static void mapObject26631(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject26632(Player player, int index, MapObject mapObject) {}

    // Stones
    public static void mapObject26633(Player player, int index, MapObject mapObject) {}

    // Treasure Trail Statistics
    public static void mapObject26634(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject26635(Player player, int index, MapObject mapObject) {}

    // Challenge portal
    public static void mapObject26642(Player player, int index, MapObject mapObject) {
        player.openDialogue("clanwars", 0);
    }

    // Challenge portal
    public static void mapObject26643(Player player, int index, MapObject mapObject) {
        player.openDialogue("clanwars", 0);
    }

    // Challenge portal
    public static void mapObject26644(Player player, int index, MapObject mapObject) {
        player.openDialogue("clanwars", 0);
    }

    // Free-for-all portal
    public static void mapObject26645(Player player, int index, MapObject mapObject) {
        // player.openDialogue("freeforall", 0);
        player.getMovement().teleport(3327, 4752, 0);
        player.setController(new ClanWarsFreeForAllPC());
    }

    // Portal
    public static void mapObject26646(Player player, int index, MapObject mapObject) {}

    // Cave
    public static void mapObject26654(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject26655(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject26661(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject26662(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject26663(Player player, int index, MapObject mapObject) {}

    // Ore vein
    public static void mapObject26664(Player player, int index, MapObject mapObject) {}

    // Broken strut
    public static void mapObject26670(Player player, int index, MapObject mapObject) {}

    // Hopper
    public static void mapObject26674(Player player, int index, MapObject mapObject) {}

    // Empty sack
    public static void mapObject26677(Player player, int index, MapObject mapObject) {}

    // Sack
    public static void mapObject26678(Player player, int index, MapObject mapObject) {}

    // Rockfall
    public static void mapObject26679(Player player, int index, MapObject mapObject) {}

    // Rockfall
    public static void mapObject26680(Player player, int index, MapObject mapObject) {}

    // Empty sack
    public static void mapObject26688(Player player, int index, MapObject mapObject) {}

    // Mystic symbol
    public static void mapObject26692(Player player, int index, MapObject mapObject) {}

    // Mystic symbol
    public static void mapObject26693(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject26703(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject26704(Player player, int index, MapObject mapObject) {}

    // Blighted vine
    public static void mapObject26705(Player player, int index, MapObject mapObject) {}

    // Bank chest
    public static void mapObject26707(Player player, int index, MapObject mapObject) {
        player.getBank().open();
    }

    // Cave
    public static void mapObject26709(Player player, int index, MapObject mapObject) {
        player.getMovement().ladderDownTeleport(new Tile(2429, 9824));
    }

    // Crevice
    public static void mapObject26710(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject26711(Player player, int index, MapObject mapObject) {}

    // Crevice
    public static void mapObject26712(Player player, int index, MapObject mapObject) {}

    // Stepping stone
    public static void mapObject26713(Player player, int index, MapObject mapObject) {}

    // Root
    public static void mapObject26720(Player player, int index, MapObject mapObject) {}

    // Root
    public static void mapObject26721(Player player, int index, MapObject mapObject) {}

    // Roots
    public static void mapObject26723(Player player, int index, MapObject mapObject) {
        // Stronghold Slayer Cave
        if (player.getX() >= 2393) {
            Tile tile = new Tile(2391, 9788, 0);
            player.getMovement().ladderUpTeleport(tile);
        } else {
            Tile tile = new Tile(2393, 9788, 0);
            player.getMovement().ladderUpTeleport(tile);
        }
    }

    // Mud pile
    public static void mapObject26724(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26727(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26728(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26731(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26732(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26733(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26734(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26735(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26736(Player player, int index, MapObject mapObject) {}

    // Exit portal
    public static void mapObject26737(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject26738(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject26739(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject26740(Player player, int index, MapObject mapObject) {}

    // Viewing orb
    public static void mapObject26741(Player player, int index, MapObject mapObject) {}

    // Viewing orb
    public static void mapObject26743(Player player, int index, MapObject mapObject) {
        player.getClanWars().teleportViewing(0);
    }

    // Viewing orb
    public static void mapObject26745(Player player, int index, MapObject mapObject) {}

    // Viewing orb
    public static void mapObject26747(Player player, int index, MapObject mapObject) {}

    // Viewing orb
    public static void mapObject26749(Player player, int index, MapObject mapObject) {}

    // Wilderness Statistics
    public static void mapObject26756(Player player, int index, MapObject mapObject) {
        List<Player> players = new ArrayList<>(player.getWorld().getPlayers());
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                int i = Double.compare(p2.getCombat().getKDR(), p1.getCombat().getKDR());
                if (i != 0) {
                    return i;
                }
                i = Integer.compare(p2.getCombat().getKillingSpree(), p1.getCombat().getKillingSpree());
                if (i != 0) {
                    return i;
                }
                i = Integer.compare(p2.getCombat().getKills(), p1.getCombat().getKills());
                if (i != 0) {
                    return i;
                }
                return Integer.compare(p1.getCombat().getDeaths(), p2.getCombat().getDeaths());
            }
        });
        List<String> lines = new ArrayList<>();
        int rank = 1;
        for (int i = 0; i < players.size() && i < 50; i++) {
            Player p = players.get(i);
            if (p.getCombat().getKDR() == 0) {
                continue;
            }
            lines.add("[#" + rank + "] " + p.getUsername() + ": KDR: " + p.getCombat().getKDR() + "; Spree: "
                    + p.getCombat().getKillingSpree());
            rank++;
        }
        Dialogue.openScroll(player, "Top Online PKers", Utils.toStringArray(lines));
    }

    // Chest
    public static void mapObject26757(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject26760(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3184 && mapObject.getY() == 3944) {
            if (index == 0) {
                if (player.getY() == 3945) {
                    player.openDialogue("wilderness", 0);
                } else {
                    if (mapObject.isBusy() || player.getX() != mapObject.getX() || mapObject.getDirection() != 1) {
                        return;
                    }
                    player.getMovement().clear();
                    if (player.getY() == mapObject.getY()) {
                        player.getMovement().addMovement(mapObject.getX(), mapObject.getY() + 1);
                    } else {
                        player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
                    }
                    Region.openDoor(player, mapObject, 1, false, false);
                }
            } else if (index == 1) {
                int count = 0;
                for (Player player2 : player.getController().getPlayers()) {
                    if (player2.inWildernessResourceArea()) {
                        count++;
                    }
                }
                if (count == 1) {
                    player.getGameEncoder()
                            .sendMessage("You peek inside the gate and see " + count + " adventurer inside the arena.");
                } else {
                    player.getGameEncoder().sendMessage(
                            "You peek inside the gate and see " + count + " adventurers inside the arena.");
                }
            }
        }
    }

    // Lever
    public static void mapObject26761(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 3080 && mapObject.getY() == 3488) {
            // Edgeville
            if (player.getMovement().getTeleportBlock() > 0) {
                player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                        + player.getMovement().getTeleportBlockRemaining() + ".");
                return;
            }
            Tile tile = new Tile(3153, 3923, 0);
            if (player.getClientHeight() == tile.getHeight()) {
                tile.setHeight(player.getHeight());
            }
            if (!player.getController().canTeleport(tile, true)) {
                return;
            }
            player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
            player.clearHits();
        }
    }

    // Cavern
    public static void mapObject26762(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3231 && mapObject.getY() == 3951) {
            player.getMovement().teleport(3232, 10351);
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3241 && mapObject.getY() == 3949) {
            player.getMovement().teleport(3243, 10351);
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3231 && mapObject.getY() == 3936) {
            player.getMovement().teleport(3233, 10332);
            player.setObjectOptionDelay(4);
        }
    }

    // Crevice
    public static void mapObject26763(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3232 && mapObject.getY() == 10352) {
            player.getMovement().teleport(3232, 3950);
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3243 && mapObject.getY() == 10352) {
            player.getMovement().teleport(3242, 3948);
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3233 && mapObject.getY() == 10331) {
            player.getMovement().teleport(3232, 3938);
            player.setObjectOptionDelay(4);
        }
    }

    // Cave
    public static void mapObject26766(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3016 && mapObject.getY() == 3738) {
            player.getMovement().ladderDownTeleport(new Tile(3065, 10159, 3));
            player.setObjectOptionDelay(4);
        }
    }

    // Crevice
    public static void mapObject26767(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3065 && mapObject.getY() == 10160) {
            player.getMovement().ladderDownTeleport(new Tile(3017, 3740, 0));
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3049 && mapObject.getY() == 10165) {
            player.getMovement().ladderDownTeleport(new Tile(3034, 10158, 0));
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3066 && mapObject.getY() == 10142) {
            player.getMovement().ladderDownTeleport(new Tile(3062, 10130, 0));
            player.setObjectOptionDelay(4);
        }
    }

    // Jutting wall
    public static void mapObject26768(Player player, int index, MapObject mapObject) {
        if (player.getController().isMagicBound()) {
            player.getGameEncoder()
                    .sendMessage("A magical force stops you from moving for "
                            + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                            + " more seconds.");
            return;
        }
        if (mapObject.getX() == 3066 && mapObject.getY() == 10148) {
            if (player.getY() >= 10149) {
                player.getMovement().teleport(3066, 10147, 3);
            } else {
                player.getMovement().teleport(3066, 10149, 3);
            }
            player.setObjectOptionDelay(4);
        }
    }

    // Crevice
    public static void mapObject26769(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3035 && mapObject.getY() == 10158) {
            player.getMovement().ladderDownTeleport(new Tile(3050, 10165, 3));
            player.setObjectOptionDelay(4);
        } else if (mapObject.getX() == 3062 && mapObject.getY() == 10131) {
            player.getMovement().ladderDownTeleport(new Tile(3066, 10143, 3));
            player.setObjectOptionDelay(4);
        }
    }

    // Poll booth
    public static void mapObject26796(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26797(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26798(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26799(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26800(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26801(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26802(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26803(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26804(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26805(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26806(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26807(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26808(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26809(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26810(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26811(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26812(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26813(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26814(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26815(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26816(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26817(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26818(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26819(Player player, int index, MapObject mapObject) {}

    // Poll booth
    public static void mapObject26820(Player player, int index, MapObject mapObject) {}

    // Ancient Fury Statue
    public static void mapObject26825(Player player, int index, MapObject mapObject) {}

    // Fatality Statue
    public static void mapObject26826(Player player, int index, MapObject mapObject) {}

    // Hexis Statue
    public static void mapObject26827(Player player, int index, MapObject mapObject) {}

    // Reign of Terror Statue
    public static void mapObject26828(Player player, int index, MapObject mapObject) {}

    // Stud Unit Statue
    public static void mapObject26829(Player player, int index, MapObject mapObject) {}

    // Consecrated house
    public static void mapObject26830(Player player, int index, MapObject mapObject) {}

    // Desecrated house
    public static void mapObject26831(Player player, int index, MapObject mapObject) {}

    // Nature house
    public static void mapObject26832(Player player, int index, MapObject mapObject) {}

    // Habitat space
    public static void mapObject26833(Player player, int index, MapObject mapObject) {}

    // Tree stump
    public static void mapObject26834(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject26835(Player player, int index, MapObject mapObject) {}

    // Cactus
    public static void mapObject26836(Player player, int index, MapObject mapObject) {}

    // Igloo
    public static void mapObject26837(Player player, int index, MapObject mapObject) {}

    // Crater
    public static void mapObject26838(Player player, int index, MapObject mapObject) {}

    // Habitat space
    public static void mapObject26839(Player player, int index, MapObject mapObject) {}

    // Grassland
    public static void mapObject26840(Player player, int index, MapObject mapObject) {}

    // Forest floor
    public static void mapObject26841(Player player, int index, MapObject mapObject) {}

    // Sand
    public static void mapObject26842(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject26843(Player player, int index, MapObject mapObject) {}

    // Burnt rock
    public static void mapObject26844(Player player, int index, MapObject mapObject) {}

    // Habitat space
    public static void mapObject26845(Player player, int index, MapObject mapObject) {}

    // Grassland
    public static void mapObject26846(Player player, int index, MapObject mapObject) {}

    // Forest floor
    public static void mapObject26847(Player player, int index, MapObject mapObject) {}

    // Sand
    public static void mapObject26848(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject26849(Player player, int index, MapObject mapObject) {}

    // Burnt rock
    public static void mapObject26850(Player player, int index, MapObject mapObject) {}

    // Habitat space
    public static void mapObject26851(Player player, int index, MapObject mapObject) {}

    // Grassland
    public static void mapObject26852(Player player, int index, MapObject mapObject) {}

    // Forest floor
    public static void mapObject26853(Player player, int index, MapObject mapObject) {}

    // Sand
    public static void mapObject26854(Player player, int index, MapObject mapObject) {}

    // Snow
    public static void mapObject26855(Player player, int index, MapObject mapObject) {}

    // Burnt rock
    public static void mapObject26856(Player player, int index, MapObject mapObject) {}

    // Scratching post space
    public static void mapObject26857(Player player, int index, MapObject mapObject) {}

    // Oak scratching post
    public static void mapObject26858(Player player, int index, MapObject mapObject) {}

    // Teak scratching post
    public static void mapObject26859(Player player, int index, MapObject mapObject) {}

    // Mahogany scratching post
    public static void mapObject26860(Player player, int index, MapObject mapObject) {}

    // Arena space
    public static void mapObject26861(Player player, int index, MapObject mapObject) {}

    // Arena
    public static void mapObject26862(Player player, int index, MapObject mapObject) {}

    // Arena
    public static void mapObject26863(Player player, int index, MapObject mapObject) {}

    // Arena
    public static void mapObject26864(Player player, int index, MapObject mapObject) {}

    // Arena space
    public static void mapObject26865(Player player, int index, MapObject mapObject) {}

    // Arena
    public static void mapObject26866(Player player, int index, MapObject mapObject) {}

    // Pet list space
    public static void mapObject26867(Player player, int index, MapObject mapObject) {}

    // Pet list
    public static void mapObject26868(Player player, int index, MapObject mapObject) {}

    // Pet feeder space
    public static void mapObject26869(Player player, int index, MapObject mapObject) {}

    // Oak feeder
    public static void mapObject26870(Player player, int index, MapObject mapObject) {}

    // Teak feeder
    public static void mapObject26871(Player player, int index, MapObject mapObject) {}

    // Mahogany feeder
    public static void mapObject26872(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject26873(Player player, int index, MapObject mapObject) {}

    // Rocks
    public static void mapObject26874(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject26875(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject26877(Player player, int index, MapObject mapObject) {}

}


