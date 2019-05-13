package decodedpacket.mapobjectoption;

import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.ForceMovement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;
import com.palidino.osrs.model.player.Smithing;
import com.palidino.util.Utils;
import com.palidino.util.event.Event;

public class MapObject7 {
    /* 1792 - 2047 */

    // Door
    public static void mapObject1804(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1805(Player player, int index, MapObject mapObject) {}

    // Web
    public static void mapObject1810(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject1814(Player player, int index, MapObject mapObject) {}

    // Lever
    public static void mapObject1815(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 3153 && mapObject.getY() == 3923) {
            // Deep wild lever
            if (player.getMovement().getTeleportBlock() > 0) {
                player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                        + player.getMovement().getTeleportBlockRemaining() + ".");
                return;
            }
            Tile tile = new Tile(3090, 3475, 0);
            if (player.getClientHeight() == tile.getHeight()) {
                tile.setHeight(player.getHeight());
            }
            player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
            player.clearHits();
        }
    }

    // Lever
    public static void mapObject1816(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 3067 && mapObject.getY() == 10253) {
            // KBD entrance lever
            if (player.getMovement().getTeleportBlock() > 0) {
                player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                        + player.getMovement().getTeleportBlockRemaining() + ".");
                return;
            }
            if (index == 0) {
                Tile tile = new Tile(2271, 4680, 0);
                player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                        Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
                player.clearHits();
            } else if (index == 4) {
                player.openDialogue("bossinstance", 3);
            }
        }
    }

    // Lever
    public static void mapObject1817(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
            player.getGameEncoder().sendMessage("You can't use this right now.");
            return;
        }
        if (mapObject.getX() == 2271 && mapObject.getY() == 4680) {
            // KBD exit lever
            Tile tile = new Tile(3067, 10253, 0);
            player.getMovement().animatedTeleport(tile, 2140, Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, null, Magic.NORMAL_MAGIC_GRAPHIC, null, 1, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
        }
    }

    // Crumbling wall
    public static void mapObject1947(Player player, int index, MapObject mapObject) {}

    // Crumbling wall
    public static void mapObject1948(Player player, int index, MapObject mapObject) {
        if (player.getY() != mapObject.getY() || player.getX() > mapObject.getX()) {
            return;
        }
        player.getGameEncoder().sendMessage("You climb the low wall...");
        player.setAnimation(840);
        Tile toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
        player.setForceMovement(new ForceMovement(player, 0, toTile, 2, Tile.EAST));
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
                int xp = 14;
                if (player.getEquipment().wearingMinimumGraceful()) {
                    xp *= 1.1;
                }
                player.getSkills().addXP(Skills.AGILITY, xp);
                if (player.getAttributeInt("agility_stage") == 4) {
                    player.putAttribute("agility_stage", 5);
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                } else if (player.getAttributeInt("agility_stage") == 5) {
                    player.putAttribute("agility_stage", 6);
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                } else if (player.getAttributeInt("agility_stage") == 6) {
                    player.removeAttribute("agility_stage");
                    xp = 47;
                    if (player.getEquipment().wearingMinimumGraceful()) {
                        xp *= 1.1;
                    }
                    player.getSkills().addXP(Skills.AGILITY, xp);
                    // 102 laps an hour
                    if (Utils.randomE(25) == 0) {
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
                    player.getFamiliar().rollSkillPet(Skills.AGILITY, 44376, 20659);
                    AchievementDiary.agilityObstacleHooks(player, mapObject);
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Tree Door
    public static void mapObject1967(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // Tree Door
    public static void mapObject1968(Player player, int index, MapObject mapObject) {
        Region.openDoors(player, mapObject);
    }

    // null
    public static void mapObject1980(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject1981(Player player, int index, MapObject mapObject) {}

    // Root
    public static void mapObject1985(Player player, int index, MapObject mapObject) {}

    // Root
    public static void mapObject1986(Player player, int index, MapObject mapObject) {}

    // Log raft
    public static void mapObject1987(Player player, int index, MapObject mapObject) {}

    // Bookcase
    public static void mapObject1989(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject1990(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject1991(Player player, int index, MapObject mapObject) {}

    // Glarial's tombstone
    public static void mapObject1992(Player player, int index, MapObject mapObject) {}

    // Glarial's tomb
    public static void mapObject1993(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject1994(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject1995(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject1996(Player player, int index, MapObject mapObject) {}

    // Rock
    public static void mapObject1997(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject1999(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2000(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2002(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject2010(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject2011(Player player, int index, MapObject mapObject) {}

    // Ledge
    public static void mapObject2012(Player player, int index, MapObject mapObject) {}

    // Vine
    public static void mapObject2013(Player player, int index, MapObject mapObject) {}

    // Chalice of Eternity
    public static void mapObject2014(Player player, int index, MapObject mapObject) {}

    // Chalice of Eternity
    public static void mapObject2015(Player player, int index, MapObject mapObject) {}

    // Dead tree
    public static void mapObject2020(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject2022(Player player, int index, MapObject mapObject) {}

    // Achey Tree
    public static void mapObject2023(Player player, int index, MapObject mapObject) {}

    // Cauldron
    public static void mapObject2024(Player player, int index, MapObject mapObject) {}

    // Furnace
    public static void mapObject2030(Player player, int index, MapObject mapObject) {}

    // Anvil
    public static void mapObject2031(Player player, int index, MapObject mapObject) {
        if (player.getInventory().hasItem(Smithing.BRONZE_BAR_ID)) {
            Smithing.openSmith(player, Smithing.BRONZE_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.IRON_BAR_ID)) {
            Smithing.openSmith(player, Smithing.IRON_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.STEEL_BAR_ID)) {
            Smithing.openSmith(player, Smithing.STEEL_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.MITHRIL_BAR_ID)) {
            Smithing.openSmith(player, Smithing.MITHRIL_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.ADAMANT_BAR_ID)) {
            Smithing.openSmith(player, Smithing.ADAMANT_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.RUNE_BAR_ID)) {
            Smithing.openSmith(player, Smithing.RUNE_BAR_ID);
        } else if (player.getInventory().hasItem(Smithing.BLURITE_BAR_ID)) {
            Smithing.openSmith(player, Smithing.BLURITE_BAR_ID);
        }
    }

    // Bedroom door
    public static void mapObject2032(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2034(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject2036(Player player, int index, MapObject mapObject) {}

    // Dummy
    public static void mapObject2038(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2039(Player player, int index, MapObject mapObject) {}

    // Gate
    public static void mapObject2041(Player player, int index, MapObject mapObject) {}
}

