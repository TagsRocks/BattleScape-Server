/* 27904 - 28159 */

// Blood Altar
DecodedPacketObjectOption.prototype.object_27978 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.BLOOD);
}

// Dark Altar
DecodedPacketObjectOption.prototype.object_27979 = function(player, index, object) { }

// Soul Altar
DecodedPacketObjectOption.prototype.object_27980 = function(player, index, object) {
    Runecrafting.craftRunes(player, Runecrafting.Altar.SOUL);
}

// Rocks
DecodedPacketObjectOption.prototype.object_27984 = function(player, index, object) {
    var endTile = null;
    if (object.getX() == 1743 && object.getY() == 3854 || object.getX() == 1751 && object.getY() == 3854) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
            player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
            return;
        }
        endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
    } else if (object.getX() == 1761 && object.getY() == 3872 || object.getX() == 1761 && object.getY() == 3873) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
            player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
            return;
        }
        endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
    } else if (object.getX() == 1770 && object.getY() == 3849 || object.getX() == 1773 && object.getY() == 3849) {
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
    var event = new Event() {
        execute: function() {
            if (!player.matchesTile(endTile)) {
                return;
            }
            event.stop();
            player.unlock();
            player.getAppearance().setForceMoveAnimation(-1);
            player.getMovement().setForceRunning(null);
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    }
    player.getWorld().addEvent(event);
}

// Rocks
DecodedPacketObjectOption.prototype.object_27985 = function(player, index, object) {
    var endTile = null;
    if (object.getX() == 1743 && object.getY() == 3854 || object.getX() == 1751 && object.getY() == 3854) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
            player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
            return;
        }
        endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
    } else if (object.getX() == 1761 && object.getY() == 3872 || object.getX() == 1761 && object.getY() == 3873) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
            player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
            return;
        }
        endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
    } else if (object.getX() == 1770 && object.getY() == 3849 || object.getX() == 1773 && object.getY() == 3849) {
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
    var event = new Event() {
        execute: function() {
            if (!player.matchesTile(endTile)) {
                return;
            }
            event.stop();
            player.unlock();
            player.getAppearance().setForceMoveAnimation(-1);
            player.getMovement().setForceRunning(null);
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    }
    player.getWorld().addEvent(event);
}

// Rocks
DecodedPacketObjectOption.prototype.object_27987 = function(player, index, object) {
    var endTile = null;
    if (object.getX() == 1743 && object.getY() == 3854 || object.getX() == 1751 && object.getY() == 3854) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
            player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
            return;
        }
        endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
    } else if (object.getX() == 1761 && object.getY() == 3872 || object.getX() == 1761 && object.getY() == 3873) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
            player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
            return;
        }
        endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
    } else if (object.getX() == 1770 && object.getY() == 3849 || object.getX() == 1773 && object.getY() == 3849) {
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
    var event = new Event() {
        execute: function() {
            if (!player.matchesTile(endTile)) {
                return;
            }
            event.stop();
            player.unlock();
            player.getAppearance().setForceMoveAnimation(-1);
            player.getMovement().setForceRunning(null);
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    }
    player.getWorld().addEvent(event);
}

// Rocks
DecodedPacketObjectOption.prototype.object_27988 = function(player, index, object) {
    var endTile = null;
    if (object.getX() == 1743 && object.getY() == 3854 || object.getX() == 1751 && object.getY() == 3854) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 73) {
            player.getGameEncoder().sendMessage("You need an Agility level of 73 to do this.");
            return;
        }
        endTile = new Tile(player.getX() == 1752 ? 1742 : 1752, 3854);
    } else if (object.getX() == 1761 && object.getY() == 3872 || object.getX() == 1761 && object.getY() == 3873) {
        if (player.getSkills().getLevel(Skills.AGILITY) < 69) {
            player.getGameEncoder().sendMessage("You need an Agility level of 69 to do this.");
            return;
        }
        endTile = new Tile(1761, player.getY() == 3871 ? 3874 : 3871);
    } else if (object.getX() == 1770 && object.getY() == 3849 || object.getX() == 1773 && object.getY() == 3849) {
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
    var event = new Event() {
        execute: function() {
            if (!player.matchesTile(endTile)) {
                return;
            }
            event.stop();
            player.unlock();
            player.getAppearance().setForceMoveAnimation(-1);
            player.getMovement().setForceRunning(null);
            AchievementDiary.agilityObstacleHooks(player, object);
        }
    }
    player.getWorld().addEvent(event);
}

// Boulder
DecodedPacketObjectOption.prototype.object_27990 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_27991 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_27992 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_27993 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_27994 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_27995 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_27996 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_27997 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_27998 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_27999 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28000 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28001 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28002 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28003 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28004 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28005 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28006 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28007 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28008 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28009 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28010 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28011 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28012 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28013 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28014 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28015 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28016 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28017 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28018 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28019 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28020 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28021 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28022 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28023 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28024 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28025 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28026 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28027 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28028 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28029 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28030 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28031 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28032 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28033 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28034 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28035 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28036 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28037 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28038 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28039 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28040 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28041 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28042 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28043 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28044 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28045 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28046 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28047 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28048 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28049 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28050 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28051 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28052 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28053 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28054 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28055 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28056 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28057 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28058 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28059 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28060 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28061 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28062 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28063 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28064 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28065 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28066 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28067 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28068 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28069 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28070 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28071 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28072 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28073 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28074 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28075 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28076 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28077 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28078 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28079 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28080 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28081 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28082 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28083 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28084 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28085 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28086 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28087 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28088 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28089 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28090 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28091 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28092 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28093 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28094 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28095 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28096 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28097 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28098 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28099 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28100 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28101 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28102 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28103 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28104 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28105 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28106 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28107 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28108 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28109 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28110 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28111 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28112 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28113 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28114 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28115 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28116 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28117 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28118 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28119 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28120 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28121 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28122 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28123 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28124 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28125 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28126 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28127 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28128 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28129 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28130 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28131 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28132 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28133 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28134 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28135 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28136 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28137 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28138 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28139 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28140 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28141 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28142 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28143 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28144 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28145 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28146 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28147 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28148 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28149 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28150 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28151 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28152 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28153 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28154 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28155 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28156 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28157 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28158 = function(player, index, object) { }

// Bookshelf
DecodedPacketObjectOption.prototype.object_28159 = function(player, index, object) { }
