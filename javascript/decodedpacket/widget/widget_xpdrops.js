DecodedPacketWidget.prototype.widget_137 = function(player, index, childID, slot, itemID) {
    if (player.isLocked()) {
        return;
    }
    switch (childID) {
    case 16:
        if (slot >= XPDrops.START_POINTS.length) {
            break;
        }
        player.putAttribute("xp_drops_index", slot);
        player.removeAttribute("xp_drops_start");
        player.removeAttribute("xp_drops_end");
        break;
    case 20:
    case 44:
        player.getWidgetManager().closeKeyboardScript();
        player.getXPDrops().setStartPoint(0);
        player.getXPDrops().setEndPoint(0);
        break;
    case 24:
    case 32:
        player.getWidgetManager().closeKeyboardScript();
        player.getXPDrops().setStartPointToCurrentXP();
        if (childID == 32) {
            player.getXPDrops().setEndPointToNextLevel();
        } else {
            player.getXPDrops().setEndPoint(-1);
        }
        break;
    case 29:
    case 37:
        var typeName = "tracker";
        if (childID == 37) {
            typeName = "goal";
        }
        if (index == 5) {
            player.getGameEncoder().sendEnterAmount("Set " + typeName + " start point: (skill level)",
                    new ValueEntered.IntegerEvent() {
                execute: function(value) {
                    var index = player.getAttributeInt("xp_drops_index");
                    if (XPDrops.POINTS_TO_SKILLS[index] != -1 && value > 0 && value < Skills.XP_TABLE.length) {
                        player.getXPDrops().setStartPoint(Skills.XP_TABLE[value]);
                    }
                }
            });
        } else if (index == 6) {
            var message = "Set " + typeName + " start point: (XP value)";
            if (XPDrops.POINTS_TO_SKILLS[player.getAttributeInt("xp_drops_index")] == -1) {
                message = "Set " + typeName + " start point in THOUSANDS of XP:";
            }
            player.getGameEncoder().sendEnterAmount(message, new ValueEntered.IntegerEvent() {
                execute: function(value) {
                    var index = player.getAttributeInt("xp_drops_index");
                    if (value >= 0 && value < Skills.MAX_XP) {
                        player.getXPDrops().setStartPoint(value);
                    }
                }
            });
        } else if (index == 9) {
            player.getXPDrops().setStartPointToCurrentXP();
        }
        break;
    case 41:
        if (index == 5) {
            player.getGameEncoder().sendEnterAmount("Set goal end point: (skill level)",
                    new ValueEntered.IntegerEvent() {
                execute: function(value) {
                    var index = player.getAttributeInt("xp_drops_index");
                    if (XPDrops.POINTS_TO_SKILLS[index] != -1 && value > 0 && value < Skills.XP_TABLE.length) {
                        player.getXPDrops().setEndPoint(Skills.XP_TABLE[value]);
                    }
                }
            });
        } else if (index == 6) {
            var message = "Set goal end point: (XP value)";
            if (XPDrops.POINTS_TO_SKILLS[player.getAttributeInt("xp_drops_index")] == -1) {
                message = "Set goal start end in THOUSANDS of XP:";
            }
            player.getGameEncoder().sendEnterAmount(message, new ValueEntered.IntegerEvent() {
                execute: function(value) {
                    var index = player.getAttributeInt("xp_drops_index");
                    if (value >= 0 && value < Skills.MAX_XP) {
                        player.getXPDrops().setEndPoint(value);
                    }
                }
            });
        }
        break;
    case 45:
        player.getXPDrops().saveSkill();
        break;
    case 50:
        player.getXPDrops().setPosition(slot - 1);
        break;
    case 51:
        player.getXPDrops().setSize(slot - 1);
        break;
    case 52:
        player.getXPDrops().setDuration(slot - 1);
        break;
    case 53:
        player.getXPDrops().setCounter(slot - 1);
        break;
    case 54:
        player.getXPDrops().setProgressBar(slot - 1);
        break;
    case 55:
        player.getXPDrops().setColor(slot - 1);
        break;
    case 56:
        player.getXPDrops().setGroup(slot - 1);
        break;
    case 57:
        player.getXPDrops().setSpeed(slot - 1);
        break;
    }
}
