/* 26624 - 26879 */

// An anonymous looking door
DecodedPacketObjectOption.prototype.object_26624 = function(player, index, object) { }

// An anonymous looking door
DecodedPacketObjectOption.prototype.object_26625 = function(player, index, object) { }

// Sarcophagus
DecodedPacketObjectOption.prototype.object_26626 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26628 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26629 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26630 = function(player, index, object) { }

// Urn
DecodedPacketObjectOption.prototype.object_26631 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_26632 = function(player, index, object) { }

// Stones
DecodedPacketObjectOption.prototype.object_26633 = function(player, index, object) { }

// Treasure Trail Statistics
DecodedPacketObjectOption.prototype.object_26634 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_26635 = function(player, index, object) { }

// Challenge portal
DecodedPacketObjectOption.prototype.object_26642 = function(player, index, object) {
    player.openDialogue("clanwars", 0);
}

// Challenge portal
DecodedPacketObjectOption.prototype.object_26643 = function(player, index, object) {
    player.openDialogue("clanwars", 0);
}

// Challenge portal
DecodedPacketObjectOption.prototype.object_26644 = function(player, index, object) {
    player.openDialogue("clanwars", 0);
}

// Free-for-all portal
DecodedPacketObjectOption.prototype.object_26645 = function(player, index, object) {
    //player.openDialogue("freeforall", 0);
    player.getMovement().teleport(3327, 4752, 0);
    player.setController(new ClanWarsFreeForAllPC());
}

// Portal
DecodedPacketObjectOption.prototype.object_26646 = function(player, index, object) { }

// Cave
DecodedPacketObjectOption.prototype.object_26654 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_26655 = function(player, index, object) { }

// Ore vein
DecodedPacketObjectOption.prototype.object_26661 = function(player, index, object) { }

// Ore vein
DecodedPacketObjectOption.prototype.object_26662 = function(player, index, object) { }

// Ore vein
DecodedPacketObjectOption.prototype.object_26663 = function(player, index, object) { }

// Ore vein
DecodedPacketObjectOption.prototype.object_26664 = function(player, index, object) { }

// Broken strut
DecodedPacketObjectOption.prototype.object_26670 = function(player, index, object) { }

// Hopper
DecodedPacketObjectOption.prototype.object_26674 = function(player, index, object) { }

// Empty sack
DecodedPacketObjectOption.prototype.object_26677 = function(player, index, object) { }

// Sack
DecodedPacketObjectOption.prototype.object_26678 = function(player, index, object) { }

// Rockfall
DecodedPacketObjectOption.prototype.object_26679 = function(player, index, object) { }

// Rockfall
DecodedPacketObjectOption.prototype.object_26680 = function(player, index, object) { }

// Empty sack
DecodedPacketObjectOption.prototype.object_26688 = function(player, index, object) { }

// Mystic symbol
DecodedPacketObjectOption.prototype.object_26692 = function(player, index, object) { }

// Mystic symbol
DecodedPacketObjectOption.prototype.object_26693 = function(player, index, object) { }

// Snow
DecodedPacketObjectOption.prototype.object_26703 = function(player, index, object) { }

// Snow
DecodedPacketObjectOption.prototype.object_26704 = function(player, index, object) { }

// Blighted vine
DecodedPacketObjectOption.prototype.object_26705 = function(player, index, object) { }

// Bank chest
DecodedPacketObjectOption.prototype.object_26707 = function(player, index, object) {
    player.getBank().open();
}

// Cave
DecodedPacketObjectOption.prototype.object_26709 = function(player, index, object) {
    player.getMovement().ladderDownTeleport(new Tile(2429, 9824));
}

// Crevice
DecodedPacketObjectOption.prototype.object_26710 = function(player, index, object) { }

// Crevice
DecodedPacketObjectOption.prototype.object_26711 = function(player, index, object) { }

// Crevice
DecodedPacketObjectOption.prototype.object_26712 = function(player, index, object) { }

// Stepping stone
DecodedPacketObjectOption.prototype.object_26713 = function(player, index, object) { }

// Root
DecodedPacketObjectOption.prototype.object_26720 = function(player, index, object) { }

// Root
DecodedPacketObjectOption.prototype.object_26721 = function(player, index, object) { }

// Roots
DecodedPacketObjectOption.prototype.object_26723 = function(player, index, object) {
    // Stronghold Slayer Cave
    if (player.getX() >= 2393) {
        var tile = new Tile(2391, 9788, 0);
        player.getMovement().ladderUpTeleport(tile);
    } else {
        var tile = new Tile(2393, 9788, 0);
        player.getMovement().ladderUpTeleport(tile);
    }
}

// Mud pile
DecodedPacketObjectOption.prototype.object_26724 = function(player, index, object) { }

// Exit portal
DecodedPacketObjectOption.prototype.object_26727 = function(player, index, object) { }

// Exit portal
DecodedPacketObjectOption.prototype.object_26728 = function(player, index, object) { }

// Exit portal
DecodedPacketObjectOption.prototype.object_26731 = function(player, index, object) { }

// Exit portal
DecodedPacketObjectOption.prototype.object_26732 = function(player, index, object) { }

// Exit portal
DecodedPacketObjectOption.prototype.object_26733 = function(player, index, object) { }

// Exit portal
DecodedPacketObjectOption.prototype.object_26734 = function(player, index, object) { }

// Exit portal
DecodedPacketObjectOption.prototype.object_26735 = function(player, index, object) { }

// Exit portal
DecodedPacketObjectOption.prototype.object_26736 = function(player, index, object) { }

// Exit portal
DecodedPacketObjectOption.prototype.object_26737 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_26738 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_26739 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_26740 = function(player, index, object) { }

// Viewing orb
DecodedPacketObjectOption.prototype.object_26741 = function(player, index, object) { }

// Viewing orb
DecodedPacketObjectOption.prototype.object_26743 = function(player, index, object) {
    player.getClanWars().teleportViewing(0);
}

// Viewing orb
DecodedPacketObjectOption.prototype.object_26745 = function(player, index, object) { }

// Viewing orb
DecodedPacketObjectOption.prototype.object_26747 = function(player, index, object) { }

// Viewing orb
DecodedPacketObjectOption.prototype.object_26749 = function(player, index, object) { }

// Wilderness Statistics
DecodedPacketObjectOption.prototype.object_26756 = function(player, index, object) {
    var players = new ArrayList(player.getWorld().getPlayers());
    var Integer = Java.type("java.lang.Integer");
    Collections.sort(players, new Comparator() {
        compare: function(p1, p2) {
            var i = Integer.compare(p2.getCombat().getKDR(), p1.getCombat().getKDR());
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
    var lines = new ArrayList();
    var rank = 1;
    for (var i = 0; i < players.size() && i < 50; i++) {
        var p = players.get(i);
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
DecodedPacketObjectOption.prototype.object_26757 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_26760 = function(player, index, object) {
    if (object.getX() == 3184 && object.getY() == 3944) {
        if (index == 0) {
            if (player.getY() == 3945) {
                player.openDialogue("wilderness", 0);
            } else {
                if (object.isBusy() || player.getX() != object.getX() || object.getDirection() != 1) {
                    return;
                }
                player.getMovement().clear();
                if (player.getY() == object.getY()) {
                    player.getMovement().addMovement(object.getX(), object.getY() + 1);
                } else {
                    player.getMovement().addMovement(object.getX(), object.getY());
                }
                Region.openDoor(player, object, 1, false, false);
            }
        } else if (index == 1) {
            var count = 0;
            for each (var player2 in player.getController().getPlayers()) {
                if (player2.inWildernessResourceArea()) {
                    count++;
                }
            }
            if (count == 1) {
                player.getGameEncoder().sendMessage("You peek inside the gate and see " + count
                        + " adventurer inside the arena.");
            } else {
                player.getGameEncoder().sendMessage("You peek inside the gate and see " + count
                        + " adventurers inside the arena.");
            }
        }
    }
}

// Lever
DecodedPacketObjectOption.prototype.object_26761 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (object.getX() == 3080 && object.getY() == 3488) {
        // Edgeville
        if (player.getMovement().getTeleportBlock() > 0) {
            player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                    + player.getMovement().getTeleportBlockRemaining() + ".");
            return;
        }
        var tile = new Tile(3153, 3923, 0);
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
DecodedPacketObjectOption.prototype.object_26762 = function(player, index, object) {
    if (object.getX() == 3231 && object.getY() == 3951) {
        player.getMovement().teleport(3232, 10351);
        player.setObjectOptionDelay(4);
    } else if (object.getX() == 3241 && object.getY() == 3949) {
        player.getMovement().teleport(3243, 10351);
        player.setObjectOptionDelay(4);
    } else if (object.getX() == 3231 && object.getY() == 3936) {
        player.getMovement().teleport(3233, 10332);
        player.setObjectOptionDelay(4);
    }
}

// Crevice
DecodedPacketObjectOption.prototype.object_26763 = function(player, index, object) {
    if (object.getX() == 3232 && object.getY() == 10352) {
        player.getMovement().teleport(3232, 3950);
        player.setObjectOptionDelay(4);
    } else if (object.getX() == 3243 && object.getY() == 10352) {
        player.getMovement().teleport(3242, 3948);
        player.setObjectOptionDelay(4);
    } else if (object.getX() == 3233 && object.getY() == 10331) {
        player.getMovement().teleport(3232, 3938);
        player.setObjectOptionDelay(4);
    }
}

// Cave
DecodedPacketObjectOption.prototype.object_26766 = function(player, index, object) {
    if (object.getX() == 3016 && object.getY() == 3738) {
        player.getMovement().ladderDownTeleport(new Tile(3065, 10159, 3));
        player.setObjectOptionDelay(4);
    }
}

// Crevice
DecodedPacketObjectOption.prototype.object_26767 = function(player, index, object) {
    if (object.getX() == 3065 && object.getY() == 10160) {
        player.getMovement().ladderDownTeleport(new Tile(3017, 3740, 0));
        player.setObjectOptionDelay(4);
    } else if (object.getX() == 3049 && object.getY() == 10165) {
        player.getMovement().ladderDownTeleport(new Tile(3034, 10158, 0));
        player.setObjectOptionDelay(4);
    } else if (object.getX() == 3066 && object.getY() == 10142) {
        player.getMovement().ladderDownTeleport(new Tile(3062, 10130, 0));
        player.setObjectOptionDelay(4);
    }
}

// Jutting wall
DecodedPacketObjectOption.prototype.object_26768 = function(player, index, object) {
    if (player.getController().isMagicBound()) {
        player.getGameEncoder().sendMessage("A magical force stops you from moving for "
                + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                + " more seconds.");
        return;
    }
    if (object.getX() == 3066 && object.getY() == 10148) {
        if (player.getY() >= 10149) {
            player.getMovement().teleport(3066, 10147, 3);
        } else {
            player.getMovement().teleport(3066, 10149, 3);
        }
        player.setObjectOptionDelay(4);
    }
}

// Crevice
DecodedPacketObjectOption.prototype.object_26769 = function(player, index, object) {
    if (object.getX() == 3035 && object.getY() == 10158) {
        player.getMovement().ladderDownTeleport(new Tile(3050, 10165, 3));
        player.setObjectOptionDelay(4);
    } else if (object.getX() == 3062 && object.getY() == 10131) {
        player.getMovement().ladderDownTeleport(new Tile(3066, 10143, 3));
        player.setObjectOptionDelay(4);
    }
}

// Poll booth
DecodedPacketObjectOption.prototype.object_26796 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26797 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26798 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26799 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26800 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26801 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26802 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26803 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26804 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26805 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26806 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26807 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26808 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26809 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26810 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26811 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26812 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26813 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26814 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26815 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26816 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26817 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26818 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26819 = function(player, index, object) { }

// Poll booth
DecodedPacketObjectOption.prototype.object_26820 = function(player, index, object) { }

// Ancient Fury Statue
DecodedPacketObjectOption.prototype.object_26825 = function(player, index, object) { }

// Fatality Statue
DecodedPacketObjectOption.prototype.object_26826 = function(player, index, object) { }

// Hexis Statue
DecodedPacketObjectOption.prototype.object_26827 = function(player, index, object) { }

// Reign of Terror Statue
DecodedPacketObjectOption.prototype.object_26828 = function(player, index, object) { }

// Stud Unit Statue
DecodedPacketObjectOption.prototype.object_26829 = function(player, index, object) { }

// Consecrated house
DecodedPacketObjectOption.prototype.object_26830 = function(player, index, object) { }

// Desecrated house
DecodedPacketObjectOption.prototype.object_26831 = function(player, index, object) { }

// Nature house
DecodedPacketObjectOption.prototype.object_26832 = function(player, index, object) { }

// Habitat space
DecodedPacketObjectOption.prototype.object_26833 = function(player, index, object) { }

// Tree stump
DecodedPacketObjectOption.prototype.object_26834 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_26835 = function(player, index, object) { }

// Cactus
DecodedPacketObjectOption.prototype.object_26836 = function(player, index, object) { }

// Igloo
DecodedPacketObjectOption.prototype.object_26837 = function(player, index, object) { }

// Crater
DecodedPacketObjectOption.prototype.object_26838 = function(player, index, object) { }

// Habitat space
DecodedPacketObjectOption.prototype.object_26839 = function(player, index, object) { }

// Grassland
DecodedPacketObjectOption.prototype.object_26840 = function(player, index, object) { }

// Forest floor
DecodedPacketObjectOption.prototype.object_26841 = function(player, index, object) { }

// Sand
DecodedPacketObjectOption.prototype.object_26842 = function(player, index, object) { }

// Snow
DecodedPacketObjectOption.prototype.object_26843 = function(player, index, object) { }

// Burnt rock
DecodedPacketObjectOption.prototype.object_26844 = function(player, index, object) { }

// Habitat space
DecodedPacketObjectOption.prototype.object_26845 = function(player, index, object) { }

// Grassland
DecodedPacketObjectOption.prototype.object_26846 = function(player, index, object) { }

// Forest floor
DecodedPacketObjectOption.prototype.object_26847 = function(player, index, object) { }

// Sand
DecodedPacketObjectOption.prototype.object_26848 = function(player, index, object) { }

// Snow
DecodedPacketObjectOption.prototype.object_26849 = function(player, index, object) { }

// Burnt rock
DecodedPacketObjectOption.prototype.object_26850 = function(player, index, object) { }

// Habitat space
DecodedPacketObjectOption.prototype.object_26851 = function(player, index, object) { }

// Grassland
DecodedPacketObjectOption.prototype.object_26852 = function(player, index, object) { }

// Forest floor
DecodedPacketObjectOption.prototype.object_26853 = function(player, index, object) { }

// Sand
DecodedPacketObjectOption.prototype.object_26854 = function(player, index, object) { }

// Snow
DecodedPacketObjectOption.prototype.object_26855 = function(player, index, object) { }

// Burnt rock
DecodedPacketObjectOption.prototype.object_26856 = function(player, index, object) { }

// Scratching post space
DecodedPacketObjectOption.prototype.object_26857 = function(player, index, object) { }

// Oak scratching post
DecodedPacketObjectOption.prototype.object_26858 = function(player, index, object) { }

// Teak scratching post
DecodedPacketObjectOption.prototype.object_26859 = function(player, index, object) { }

// Mahogany scratching post
DecodedPacketObjectOption.prototype.object_26860 = function(player, index, object) { }

// Arena space
DecodedPacketObjectOption.prototype.object_26861 = function(player, index, object) { }

// Arena
DecodedPacketObjectOption.prototype.object_26862 = function(player, index, object) { }

// Arena
DecodedPacketObjectOption.prototype.object_26863 = function(player, index, object) { }

// Arena
DecodedPacketObjectOption.prototype.object_26864 = function(player, index, object) { }

// Arena space
DecodedPacketObjectOption.prototype.object_26865 = function(player, index, object) { }

// Arena
DecodedPacketObjectOption.prototype.object_26866 = function(player, index, object) { }

// Pet list space
DecodedPacketObjectOption.prototype.object_26867 = function(player, index, object) { }

// Pet list
DecodedPacketObjectOption.prototype.object_26868 = function(player, index, object) { }

// Pet feeder space
DecodedPacketObjectOption.prototype.object_26869 = function(player, index, object) { }

// Oak feeder
DecodedPacketObjectOption.prototype.object_26870 = function(player, index, object) { }

// Teak feeder
DecodedPacketObjectOption.prototype.object_26871 = function(player, index, object) { }

// Mahogany feeder
DecodedPacketObjectOption.prototype.object_26872 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_26873 = function(player, index, object) { }

// Rocks
DecodedPacketObjectOption.prototype.object_26874 = function(player, index, object) { }

// Vine
DecodedPacketObjectOption.prototype.object_26875 = function(player, index, object) { }

// Vine
DecodedPacketObjectOption.prototype.object_26877 = function(player, index, object) { }
