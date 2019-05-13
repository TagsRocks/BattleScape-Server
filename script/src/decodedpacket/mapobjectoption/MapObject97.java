package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Runecrafting;
import com.palidino.util.event.Event;

public class MapObject97 {
    /* 24832 - 25087 */

    // Grimgnash
    public static void mapObject24839(Player player, int index, MapObject mapObject) {}

    // Grimgnash
    public static void mapObject24840(Player player, int index, MapObject mapObject) {}

    // Feathers
    public static void mapObject24841(Player player, int index, MapObject mapObject) {}

    // Manhole
    public static void mapObject24842(Player player, int index, MapObject mapObject) {}

    // Cheese
    public static void mapObject24874(Player player, int index, MapObject mapObject) {}

    // Coins
    public static void mapObject24875(Player player, int index, MapObject mapObject) {}

    // Bones
    public static void mapObject24876(Player player, int index, MapObject mapObject) {}

    // Crumbling wall
    public static void mapObject24880(Player player, int index, MapObject mapObject) {}

    // Piano
    public static void mapObject24881(Player player, int index, MapObject mapObject) {}

    // Gramophone
    public static void mapObject24882(Player player, int index, MapObject mapObject) {}

    // Music Stand
    public static void mapObject24883(Player player, int index, MapObject mapObject) {}

    // Earth Mound
    public static void mapObject24884(Player player, int index, MapObject mapObject) {}

    // Pendant
    public static void mapObject24886(Player player, int index, MapObject mapObject) {}

    // Information Scroll
    public static void mapObject24908(Player player, int index, MapObject mapObject) {}

    // Information Scroll
    public static void mapObject24909(Player player, int index, MapObject mapObject) {}

    // Barrel
    public static void mapObject24957(Player player, int index, MapObject mapObject) {}

    // Door
    public static void mapObject24958(Player player, int index, MapObject mapObject) {}

    // Hopper controls
    public static void mapObject24964(Player player, int index, MapObject mapObject) {}

    // Hopper controls
    public static void mapObject24965(Player player, int index, MapObject mapObject) {}

    // Hopper controls
    public static void mapObject24966(Player player, int index, MapObject mapObject) {}

    // Fire rift
    public static void mapObject24971(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.FIRE);
    }

    // Earth rift
    public static void mapObject24972(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.EARTH);
    }

    // Body rift
    public static void mapObject24973(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.BODY);
    }

    // Cosmic rift
    public static void mapObject24974(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.COSMIC);
    }

    // Nature rift
    public static void mapObject24975(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.NATURE);
    }

    // Chaos rift
    public static void mapObject24976(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.CHAOS);
    }

    // Centre of crop circle
    public static void mapObject24988(Player player, int index, MapObject mapObject) {}

    // Centre of crop circle
    public static void mapObject24991(Player player, int index, MapObject mapObject) {}

    // Portal
    public static void mapObject25014(Player player, int index, MapObject mapObject) {}

    // Magical wheat
    public static void mapObject25016(Player player, int index, MapObject mapObject) {
        Tile toTile = null;
        if (mapObject.getDirection() == 0 || mapObject.getDirection() == 2) {
            if (player.getX() != mapObject.getX()) {
                return;
            }
            if (player.getY() > mapObject.getY()) {
                toTile = new Tile(mapObject.getX(), mapObject.getY() - 1, mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX(), mapObject.getY() + 1, mapObject.getHeight());
            }
        } else {
            if (player.getY() != mapObject.getY()) {
                return;
            }
            if (player.getX() > mapObject.getX()) {
                toTile = new Tile(mapObject.getX() - 1, mapObject.getY(), mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
            }
        }
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(6593);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        final Tile finalTile = toTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == finalTile.getX() && player.getY() == finalTile.getY()) {
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    player.unlock();
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Magical wheat
    public static void mapObject25019(Player player, int index, MapObject mapObject) {
        Tile toTile = null;
        if (mapObject.getDirection() == 1 || mapObject.getDirection() == 3) {
            if (player.getX() != mapObject.getX()) {
                return;
            }
            if (player.getY() > mapObject.getY()) {
                toTile = new Tile(mapObject.getX(), mapObject.getY() - 1, mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX(), mapObject.getY() + 1, mapObject.getHeight());
            }
        } else {
            if (player.getY() != mapObject.getY()) {
                return;
            }
            if (player.getX() > mapObject.getX()) {
                toTile = new Tile(mapObject.getX() - 1, mapObject.getY(), mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
            }
        }
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(6593);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        final Tile finalTile = toTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == finalTile.getX() && player.getY() == finalTile.getY()) {
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    player.unlock();
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Magical wheat
    public static void mapObject25020(Player player, int index, MapObject mapObject) {
        Tile toTile = null;
        if (mapObject.getDirection() == 1 || mapObject.getDirection() == 3) {
            if (player.getX() != mapObject.getX()) {
                return;
            }
            if (player.getY() > mapObject.getY()) {
                toTile = new Tile(mapObject.getX(), mapObject.getY() - 1, mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX(), mapObject.getY() + 1, mapObject.getHeight());
            }
        } else {
            if (player.getY() != mapObject.getY()) {
                return;
            }
            if (player.getX() > mapObject.getX()) {
                toTile = new Tile(mapObject.getX() - 1, mapObject.getY(), mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
            }
        }
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(6593);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        final Tile finalTile = toTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == finalTile.getX() && player.getY() == finalTile.getY()) {
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    player.unlock();
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Magical wheat
    public static void mapObject25021(Player player, int index, MapObject mapObject) {
        Tile toTile = null;
        if (mapObject.getDirection() == 1 || mapObject.getDirection() == 3) {
            if (player.getX() != mapObject.getX()) {
                return;
            }
            if (player.getY() > mapObject.getY()) {
                toTile = new Tile(mapObject.getX(), mapObject.getY() - 1, mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX(), mapObject.getY() + 1, mapObject.getHeight());
            }
        } else {
            if (player.getY() != mapObject.getY()) {
                return;
            }
            if (player.getX() > mapObject.getX()) {
                toTile = new Tile(mapObject.getX() - 1, mapObject.getY(), mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
            }
        }
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(6593);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        final Tile finalTile = toTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == finalTile.getX() && player.getY() == finalTile.getY()) {
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    player.unlock();
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Magical wheat
    public static void mapObject25029(Player player, int index, MapObject mapObject) {
        Tile toTile = null;
        if (player.getX() != mapObject.getX() && player.getY() != mapObject.getY()) {
            return;
        }
        if (player.getX() == mapObject.getX()) {
            if (player.getY() > mapObject.getY()) {
                toTile = new Tile(mapObject.getX(), mapObject.getY() - 1, mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX(), mapObject.getY() + 1, mapObject.getHeight());
            }
        } else if (player.getY() == mapObject.getY()) {
            if (player.getX() > mapObject.getX()) {
                toTile = new Tile(mapObject.getX() - 1, mapObject.getY(), mapObject.getHeight());
            } else {
                toTile = new Tile(mapObject.getX() + 1, mapObject.getY(), mapObject.getHeight());
            }
        } else {
            return;
        }
        player.getMovement().clear();
        player.getMovement().addMovement(toTile);
        player.getAppearance().setForceMoveAnimation(6593);
        boolean running = player.getMovement().getRunning();
        player.getMovement().setRunning(false);
        player.lock();
        final Tile finalTile = toTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.isVisible()) {
                    super.stop();
                    return;
                }
                if (player.getX() == finalTile.getX() && player.getY() == finalTile.getY()) {
                    player.getAppearance().setForceMoveAnimation(-1);
                    player.getMovement().setRunning(running);
                    player.unlock();
                    super.stop();
                }
            }
        };
        player.getWorld().addEvent(event);
    }

    // Law rift
    public static void mapObject25034(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.LAW);
    }

    // Death rift
    public static void mapObject25035(Player player, int index, MapObject mapObject) {
        Runecrafting.abyssTeleport(player, Runecrafting.Altar.DEATH);
    }

    // Hole
    public static void mapObject25036(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25038(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject25040(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject25041(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject25042(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject25043(Player player, int index, MapObject mapObject) {}

    // Wardrobe
    public static void mapObject25044(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject25045(Player player, int index, MapObject mapObject) {}

    // Bookshelves
    public static void mapObject25046(Player player, int index, MapObject mapObject) {}

}


