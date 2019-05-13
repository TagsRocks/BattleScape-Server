package decodedpacket.mapobjectoption;

import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Runecrafting;
import com.palidino.osrs.model.player.Skills;
import com.palidino.util.event.Event;

public class MapObject109 {
    /* 27904 - 28159 */

    // Blood Altar
    public static void mapObject27978(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.BLOOD);
    }

    // Dark Altar
    public static void mapObject27979(Player player, int index, MapObject mapObject) {}

    // Soul Altar
    public static void mapObject27980(Player player, int index, MapObject mapObject) {
        Runecrafting.craftRunes(player, Runecrafting.Altar.SOUL);
    }

    // Rocks
    public static void mapObject27984(Player player, int index, MapObject mapObject) {
        Tile endTile = null;
        if (mapObject.getX() == 1743 && mapObject.getY() == 3854
                || mapObject.getX() == 1751 && mapObject.getY() == 3854) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
                player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
        } else if (mapObject.getX() == 1761 && mapObject.getY() == 3872
                || mapObject.getX() == 1761 && mapObject.getY() == 3873) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
                player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
                return;
            }
            endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
        } else if (mapObject.getX() == 1770 && mapObject.getY() == 3849
                || mapObject.getX() == 1773 && mapObject.getY() == 3849) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 52) {
                player.getGameEncoder().sendMessage("You need an Agility level of 52 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1769 ? 1774 : 1769, 3849);
        }
        if (endTile == null) {
            return;
        }
        player.lock();
        player.getAppearance().setForceMoveAnimation(844);
        player.getMovement().clear();
        player.getMovement().addMovement(endTile);
        player.getMovement().setForceRunning(false);
        final Tile finalTile = endTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.matchesTile(finalTile)) {
                    return;
                }
                super.stop();
                player.unlock();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setForceRunning(null);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Rocks
    public static void mapObject27985(Player player, int index, MapObject mapObject) {
        Tile endTile = null;
        if (mapObject.getX() == 1743 && mapObject.getY() == 3854
                || mapObject.getX() == 1751 && mapObject.getY() == 3854) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
                player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
        } else if (mapObject.getX() == 1761 && mapObject.getY() == 3872
                || mapObject.getX() == 1761 && mapObject.getY() == 3873) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
                player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
                return;
            }
            endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
        } else if (mapObject.getX() == 1770 && mapObject.getY() == 3849
                || mapObject.getX() == 1773 && mapObject.getY() == 3849) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 52) {
                player.getGameEncoder().sendMessage("You need an Agility level of 52 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1769 ? 1774 : 1769, 3849);
        }
        if (endTile == null) {
            return;
        }
        player.lock();
        player.getAppearance().setForceMoveAnimation(844);
        player.getMovement().clear();
        player.getMovement().addMovement(endTile);
        player.getMovement().setForceRunning(false);
        final Tile finalTile = endTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.matchesTile(finalTile)) {
                    return;
                }
                super.stop();
                player.unlock();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setForceRunning(null);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Rocks
    public static void mapObject27987(Player player, int index, MapObject mapObject) {
        Tile endTile = null;
        if (mapObject.getX() == 1743 && mapObject.getY() == 3854
                || mapObject.getX() == 1751 && mapObject.getY() == 3854) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
                player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
        } else if (mapObject.getX() == 1761 && mapObject.getY() == 3872
                || mapObject.getX() == 1761 && mapObject.getY() == 3873) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
                player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
                return;
            }
            endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
        } else if (mapObject.getX() == 1770 && mapObject.getY() == 3849
                || mapObject.getX() == 1773 && mapObject.getY() == 3849) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 52) {
                player.getGameEncoder().sendMessage("You need an Agility level of 52 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1769 ? 1774 : 1769, 3849);
        }
        if (endTile == null) {
            return;
        }
        player.lock();
        player.getAppearance().setForceMoveAnimation(844);
        player.getMovement().clear();
        player.getMovement().addMovement(endTile);
        player.getMovement().setForceRunning(false);
        final Tile finalTile = endTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.matchesTile(finalTile)) {
                    return;
                }
                super.stop();
                player.unlock();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setForceRunning(null);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Rocks
    public static void mapObject27988(Player player, int index, MapObject mapObject) {
        Tile endTile = null;
        if (mapObject.getX() == 1743 && mapObject.getY() == 3854
                || mapObject.getX() == 1751 && mapObject.getY() == 3854) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
                player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
        } else if (mapObject.getX() == 1761 && mapObject.getY() == 3872
                || mapObject.getX() == 1761 && mapObject.getY() == 3873) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
                player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
                return;
            }
            endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
        } else if (mapObject.getX() == 1770 && mapObject.getY() == 3849
                || mapObject.getX() == 1773 && mapObject.getY() == 3849) {
            if (player.getSkills().getLevel(Skills.AGILITY) < 52) {
                player.getGameEncoder().sendMessage("You need an Agility level of 52 to do this.");
                return;
            }
            endTile = new Tile(player.getX() == 1769 ? 1774 : 1769, 3849);
        }
        if (endTile == null) {
            return;
        }
        player.lock();
        player.getAppearance().setForceMoveAnimation(844);
        player.getMovement().clear();
        player.getMovement().addMovement(endTile);
        player.getMovement().setForceRunning(false);
        final Tile finalTile = endTile;
        Event event = new Event() {
            @Override
            public void execute() {
                if (!player.matchesTile(finalTile)) {
                    return;
                }
                super.stop();
                player.unlock();
                player.getAppearance().setForceMoveAnimation(-1);
                player.getMovement().setForceRunning(null);
                AchievementDiary.agilityObstacleHooks(player, mapObject);
            }
        };
        player.getWorld().addEvent(event);
    }

    // Boulder
    public static void mapObject27990(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27991(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27992(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27993(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27994(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27995(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27996(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27997(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27998(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject27999(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28000(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28001(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28002(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28003(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28004(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28005(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28006(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28007(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28008(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28009(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28010(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28011(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28012(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28013(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28014(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28015(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28016(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28017(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28018(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28019(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28020(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28021(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28022(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28023(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28024(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28025(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28026(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28027(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28028(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28029(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28030(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28031(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28032(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28033(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28034(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28035(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28036(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28037(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28038(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28039(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28040(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28041(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28042(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28043(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28044(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28045(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28046(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28047(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28048(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28049(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28050(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28051(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28052(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28053(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28054(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28055(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28056(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28057(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28058(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28059(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28060(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28061(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28062(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28063(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28064(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28065(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28066(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28067(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28068(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28069(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28070(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28071(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28072(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28073(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28074(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28075(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28076(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28077(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28078(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28079(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28080(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28081(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28082(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28083(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28084(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28085(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28086(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28087(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28088(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28089(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28090(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28091(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28092(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28093(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28094(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28095(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28096(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28097(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28098(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28099(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28100(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28101(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28102(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28103(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28104(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28105(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28106(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28107(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28108(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28109(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28110(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28111(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28112(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28113(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28114(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28115(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28116(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28117(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28118(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28119(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28120(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28121(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28122(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28123(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28124(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28125(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28126(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28127(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28128(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28129(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28130(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28131(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28132(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28133(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28134(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28135(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28136(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28137(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28138(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28139(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28140(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28141(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28142(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28143(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28144(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28145(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28146(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28147(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28148(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28149(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28150(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28151(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28152(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28153(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28154(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28155(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28156(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28157(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28158(Player player, int index, MapObject mapObject) {}

    // Bookshelf
    public static void mapObject28159(Player player, int index, MapObject mapObject) {}

}


