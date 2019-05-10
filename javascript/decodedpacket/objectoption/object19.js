/* 4864 - 5119 */

// Teleportation Device
DecodedPacketObjectOption.prototype.object_4868 = function(player, index, object) { }

// Teleportation Device
DecodedPacketObjectOption.prototype.object_4869 = function(player, index, object) { }

// Teleportation Device
DecodedPacketObjectOption.prototype.object_4870 = function(player, index, object) { }

// Reinitialisation Panel
DecodedPacketObjectOption.prototype.object_4871 = function(player, index, object) { }

// Crafting Stall
DecodedPacketObjectOption.prototype.object_4874 = function(player, index, object) { }

// Food Stall
DecodedPacketObjectOption.prototype.object_4875 = function(player, index, object) { }

// General Stall
DecodedPacketObjectOption.prototype.object_4876 = function(player, index, object) { }

// Magic Stall
DecodedPacketObjectOption.prototype.object_4877 = function(player, index, object) { }

// Scimitar Stall
DecodedPacketObjectOption.prototype.object_4878 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_4879 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_4880 = function(player, index, object) { }

// Climbing rope
DecodedPacketObjectOption.prototype.object_4881 = function(player, index, object) { }

// A rock
DecodedPacketObjectOption.prototype.object_4883 = function(player, index, object) { }

// A rock
DecodedPacketObjectOption.prototype.object_4887 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_4888 = function(player, index, object) { }

// Climbing rope
DecodedPacketObjectOption.prototype.object_4889 = function(player, index, object) { }

// Saradomin Standard
DecodedPacketObjectOption.prototype.object_4900 = function(player, index, object) { }

// Zamorak Standard
DecodedPacketObjectOption.prototype.object_4901 = function(player, index, object) { }

// Saradomin Standard
DecodedPacketObjectOption.prototype.object_4902 = function(player, index, object) { }

// Zamorak Standard
DecodedPacketObjectOption.prototype.object_4903 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_4911 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_4912 = function(player, index, object) { }

// Cart tunnel
DecodedPacketObjectOption.prototype.object_4913 = function(player, index, object) {
    if (object.getX() == 3440 && object.getY() == 3232) {
        player.getMovement().ladderDownTeleport(new Tile(3436, 9637));
    }
}

// Cart tunnel
DecodedPacketObjectOption.prototype.object_4914 = function(player, index, object) {
    if (object.getX() == 3430 && object.getY() == 3233) {
        player.getMovement().ladderDownTeleport(new Tile(3405, 9631));
    }
}

// Cart tunnel
DecodedPacketObjectOption.prototype.object_4915 = function(player, index, object) {
    if (object.getX() == 3429 && object.getY() == 3225) {
        player.getMovement().ladderDownTeleport(new Tile(3409, 9623));
    }
}

// Mine cart
DecodedPacketObjectOption.prototype.object_4918 = function(player, index, object) {
    player.getMovement().teleport((player.getX() >= 3446) ? 3444 : 3446, 3236);
}

// Stairs
DecodedPacketObjectOption.prototype.object_4919 = function(player, index, object) { }

// Cart tunnel
DecodedPacketObjectOption.prototype.object_4920 = function(player, index, object) {
    if (object.getX() == 3437 && object.getY() == 9637) {
        player.getMovement().ladderUpTeleport(new Tile(3441, 3232));
    }
}

// Cart tunnel
DecodedPacketObjectOption.prototype.object_4921 = function(player, index, object) {
    if (object.getX() == 3404 && object.getY() == 9631) {
        player.getMovement().ladderUpTeleport(new Tile(3429, 3233));
    }
}

// Cart tunnel
DecodedPacketObjectOption.prototype.object_4922 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_4923 = function(player, index, object) { }

// Water Valve
DecodedPacketObjectOption.prototype.object_4924 = function(player, index, object) {
    player.getGameEncoder().sendMessage("This valve seems to already be open.");
}

// Crystal outcrop
DecodedPacketObjectOption.prototype.object_4926 = function(player, index, object) {
    if (!player.getInventory().hasItem(1755)) {
        player.getGameEncoder().sendMessage("You need a chisel to do this.");
        return;
    } else if (player.getSkills().getLevel(Skills.CRAFTING) < 35) {
        player.getGameEncoder().sendMessage("You need a Crafting level of 35 to cut this.");
        return;
    }
    player.getGameEncoder().sendMessage("You cut a shard from the crystal.");
    player.getInventory().addItem(4082, 1);
    if (player.getCombat().getHauntedMine() == 3) {
        player.getCombat().setHauntedMine(4);
        player.getGameEncoder().sendMessage("<col=ff0000>You have completed Haunted Mine!");
        player.getInventory().addOrDropItem(ItemID.COINS, 50000);
    }
}

// Crystal outcrop
DecodedPacketObjectOption.prototype.object_4927 = function(player, index, object) {
    if (!player.getInventory().hasItem(1755)) {
        player.getGameEncoder().sendMessage("You need a chisel to do this.");
        return;
    } else if (player.getSkills().getLevel(Skills.CRAFTING) < 35) {
        player.getGameEncoder().sendMessage("You need a Crafting level of 35 to cut this.");
        return;
    }
    player.getGameEncoder().sendMessage("You cut a shard from the crystal.");
    player.getInventory().addItem(4082, 1);
    if (player.getCombat().getHauntedMine() == 3) {
        player.getCombat().setHauntedMine(4);
        player.getGameEncoder().sendMessage("<col=ff0000>You have completed Haunted Mine!");
        player.getInventory().addOrDropItem(ItemID.COINS, 50000);
    }
}

// Crystal outcrop
DecodedPacketObjectOption.prototype.object_4928 = function(player, index, object) {
    if (!player.getInventory().hasItem(1755)) {
        player.getGameEncoder().sendMessage("You need a chisel to do this.");
        return;
    } else if (player.getSkills().getLevel(Skills.CRAFTING) < 35) {
        player.getGameEncoder().sendMessage("You need a Crafting level of 35 to cut this.");
        return;
    }
    player.getGameEncoder().sendMessage("You cut a shard from the crystal.");
    player.getInventory().addItem(4082, 1);
}

// Glowing fungus
DecodedPacketObjectOption.prototype.object_4932 = function(player, index, object) {
    player.getInventory().addItem(4075, 1);
    player.getGameEncoder().sendMessage("You pull the fungus from the water, it is very cold to the touch.");
}

// Glowing fungus
DecodedPacketObjectOption.prototype.object_4933 = function(player, index, object) {
    player.getInventory().addItem(4075, 1);
    player.getGameEncoder().sendMessage("You pull the fungus from the water, it is very cold to the touch.");
}

// Lift
DecodedPacketObjectOption.prototype.object_4937 = function(player, index, object) {
    if (player.getCombat().getHauntedMine() < 2 || !player.getInventory().hasItem(4075)) {
        player.getGameEncoder().sendMessage("You should take a glowing fungus with you before going down.");
        return;
    }
    player.getMovement().teleport(2725, 4452);
}

// Lift
DecodedPacketObjectOption.prototype.object_4938 = function(player, index, object) {
    if (player.getCombat().getHauntedMine() < 2 || !player.getInventory().hasItem(4075)) {
        player.getGameEncoder().sendMessage("You should take a glowing fungus with you before going down.");
        return;
    }
    player.getMovement().teleport(2725, 4452);
}

// Lift
DecodedPacketObjectOption.prototype.object_4940 = function(player, index, object) {
    if (player.getCombat().getHauntedMine() < 2 || !player.getInventory().hasItem(4075)) {
        player.getGameEncoder().sendMessage("You should take a glowing fungus with you before going down.");
        return;
    }
    player.getMovement().teleport(2725, 4452);
}

// Lift
DecodedPacketObjectOption.prototype.object_4942 = function(player, index, object) { }

// Points settings
DecodedPacketObjectOption.prototype.object_4949 = function(player, index, object) {
    player.getGameEncoder().sendMessage("Everything looks good here.");
}

// Lever
DecodedPacketObjectOption.prototype.object_4950 = function(player, index, object) {
    player.getGameEncoder().sendMessage("There is no reason to do that.");
}

// Lever
DecodedPacketObjectOption.prototype.object_4951 = function(player, index, object) {
    player.getGameEncoder().sendMessage("There is no reason to do that.");
}

// Lever
DecodedPacketObjectOption.prototype.object_4952 = function(player, index, object) {
    player.getGameEncoder().sendMessage("There is no reason to do that.");
}

// Lever
DecodedPacketObjectOption.prototype.object_4953 = function(player, index, object) {
    player.getGameEncoder().sendMessage("There is no reason to do that.");
}

// Lever
DecodedPacketObjectOption.prototype.object_4954 = function(player, index, object) {
    player.getGameEncoder().sendMessage("There is no reason to do that.");
}

// Lever
DecodedPacketObjectOption.prototype.object_4955 = function(player, index, object) {
    player.getGameEncoder().sendMessage("There is no reason to do that.");
}

// Lever
DecodedPacketObjectOption.prototype.object_4956 = function(player, index, object) {
    player.getGameEncoder().sendMessage("There is no reason to do that.");
}

// Lever
DecodedPacketObjectOption.prototype.object_4957 = function(player, index, object) {
    player.getGameEncoder().sendMessage("There is no reason to do that.");
}

// Door
DecodedPacketObjectOption.prototype.object_4962 = function(player, index, object) {
    if (object.getX() == 2799 && object.getY() == 4453) {
        if (object.isBusy() || player.getY() != object.getY()) {
            return;
        }
        player.getMovement().clear();
        if (player.getX() == object.getX()) {
            player.getMovement().addMovement(object.getX() - 1, object.getY());
        } else {
            player.getMovement().addMovement(object.getX(), object.getY());
        }
        Region.openDoor(player, object, 1, false, false);
    }
}

// Large door
DecodedPacketObjectOption.prototype.object_4963 = function(player, index, object) {
    if (object.getX() == 2773 && object.getY() == 4450) {
        if (object.getOriginal() != null || object.getAttachment() != null || player.getX() != object.getX()) {
            player.getGameEncoder().sendMessage("There was an issue opening this door.");
            return;
        }
        player.getMovement().clear();
        if (player.getY() == object.getY()) {
            if (!player.getInventory().hasItem(4077)) {
                player.getGameEncoder().sendMessage("You need a key to open these doors.");
                return;
            }
            player.getMovement().addMovement(object.getX(), object.getY() - 1);
        } else {
            player.getMovement().addMovement(object.getX(), object.getY());
        }
        Region.openGates(player, object, 1, false, false);
    }
}

// Large door
DecodedPacketObjectOption.prototype.object_4964 = function(player, index, object) {
    if (object.getX() == 2772 && object.getY() == 4450) {
        if (object.getOriginal() != null || object.getAttachment() != null || player.getX() != object.getX()) {
            player.getGameEncoder().sendMessage("There was an issue opening this door.");
            return;
        }
        player.getMovement().clear();
        if (player.getY() == object.getY()) {
            if (!player.getInventory().hasItem(4077)) {
                player.getGameEncoder().sendMessage("You need a key to open these doors.");
                return;
            }
            player.getMovement().addMovement(object.getX(), object.getY() - 1);
        } else {
            player.getMovement().addMovement(object.getX(), object.getY());
        }
        Region.openGates(player, object, 1, false, false);
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_4965 = function(player, index, object) {
    if (object.getX() == 3422 && object.getY() == 9625) {
        player.getMovement().ladderDownTeleport(new Tile(2782, 4568));
    } else if (object.getX() == 3413 && object.getY() == 9633) {
        player.getMovement().ladderDownTeleport(new Tile(2773, 4576));
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_4966 = function(player, index, object) {
    if (object.getX() == 2782 && object.getY() == 4569) {
        player.getMovement().ladderUpTeleport(new Tile(3422, 9624));
    } else if (object.getX() == 2773 && object.getY() == 4577) {
        player.getMovement().ladderUpTeleport(new Tile(3413, 4576));
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_4967 = function(player, index, object) {
    if (object.getX() == 2725 && object.getY() == 4486) {
        player.getMovement().ladderDownTeleport(new Tile(2789, 4487));
    } else if (object.getX() == 2710 && object.getY() == 4540) {
        player.getMovement().ladderDownTeleport(new Tile(2775, 4540));
    } else if (object.getX() == 2732 && object.getY() == 4529) {
        player.getMovement().ladderDownTeleport(new Tile(2797, 4529));
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_4968 = function(player, index, object) {
    if (object.getX() == 2789 && object.getY() == 4486) {
        player.getMovement().ladderUpTeleport(new Tile(2725, 4487));
    } else if (object.getX() == 2774 && object.getY() == 4540) {
        player.getMovement().ladderUpTeleport(new Tile(2711, 4540));
    } else if (object.getX() == 2796 && object.getY() == 4529) {
        player.getMovement().ladderUpTeleport(new Tile(2732, 4528));
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_4969 = function(player, index, object) {
    if (object.getX() == 2798 && object.getY() == 4567) {
        player.getMovement().ladderDownTeleport(new Tile(2734, 4504));
    } else if (object.getX() == 2797 && object.getY() == 4599) {
        player.getMovement().ladderDownTeleport(new Tile(2734, 4535));
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_4970 = function(player, index, object) {
    if (object.getX() == 2734 && object.getY() == 4503) {
        player.getMovement().ladderUpTeleport(new Tile(2798, 4568));
    } else if (object.getX() == 2733 && object.getY() == 4535) {
        player.getMovement().ladderUpTeleport(new Tile(2798, 4599));
    }
}

// Stairs
DecodedPacketObjectOption.prototype.object_4971 = function(player, index, object) {
    if (object.getX() == 2746 && object.getY() == 4436) {
        player.getMovement().ladderDownTeleport(new Tile(2811, 4453));
    } else if (object.getX() == 2692 && object.getY() == 4436) {
        player.getMovement().ladderDownTeleport(new Tile(2758, 4453));
    }
}

// Stairs
DecodedPacketObjectOption.prototype.object_4972 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_4973 = function(player, index, object) {
    if (object.getX() == 2812 && object.getY() == 4452) {
        player.getMovement().ladderUpTeleport(new Tile(2750, 4436));
    } else if (object.getX() == 2755 && object.getY() == 4452) {
        player.getMovement().ladderUpTeleport(new Tile(2691, 4438));
    }
}

// Mine cart
DecodedPacketObjectOption.prototype.object_4974 = function(player, index, object) {
    if (object.getX() == 2778 && object.getY() == 4506) {
        if (player.getCombat().getHauntedMine() == 0) {
            player.getGameEncoder().sendMessage("This cart looks like it could carry something.");
        } else {
            player.getGameEncoder().sendMessage("You have already pushed a mine cart deeper into the mine.");
        }
    } else if (object.getX() == 2774 && object.getY() == 4537) {
        if (player.getCombat().getHauntedMine() >= 1) {
            player.getInventory().addItem(4075, 1);
            player.getGameEncoder().sendMessage("You remove the glowing fungus from the mine cart.");
        }
        if (player.getCombat().getHauntedMine() == 1) {
            player.getCombat().setHauntedMine(2);
        }
    }
}

// Crate
DecodedPacketObjectOption.prototype.object_4975 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_4977 = function(player, index, object) { }

// Gangplank
DecodedPacketObjectOption.prototype.object_4978 = function(player, index, object) { }

// Herbs
DecodedPacketObjectOption.prototype.object_4979 = function(player, index, object) { }

// Herbs
DecodedPacketObjectOption.prototype.object_4980 = function(player, index, object) { }

// Herbs
DecodedPacketObjectOption.prototype.object_4981 = function(player, index, object) { }

// Herbs
DecodedPacketObjectOption.prototype.object_4982 = function(player, index, object) { }

// Rope bridge
DecodedPacketObjectOption.prototype.object_5002 = function(player, index, object) { }

// Tree
DecodedPacketObjectOption.prototype.object_5003 = function(player, index, object) { }

// Rare Flowers
DecodedPacketObjectOption.prototype.object_5006 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_5007 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_5008 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_5009 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_5010 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_5011 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_5012 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_5013 = function(player, index, object) { }

// Tunnel
DecodedPacketObjectOption.prototype.object_5014 = function(player, index, object) { }

// slope
DecodedPacketObjectOption.prototype.object_5015 = function(player, index, object) { }

// slope
DecodedPacketObjectOption.prototype.object_5016 = function(player, index, object) { }

// Crevasse
DecodedPacketObjectOption.prototype.object_5025 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_5036 = function(player, index, object) { }

// Ice gate
DecodedPacketObjectOption.prototype.object_5043 = function(player, index, object) { }

// Ice gate
DecodedPacketObjectOption.prototype.object_5044 = function(player, index, object) { }

// Cave entrance
DecodedPacketObjectOption.prototype.object_5046 = function(player, index, object) { }

// Stalagmite
DecodedPacketObjectOption.prototype.object_5050 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_5052 = function(player, index, object) { }

// Ladder
DecodedPacketObjectOption.prototype.object_5054 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_5055 = function(player, index, object) { }

// Wooden doors
DecodedPacketObjectOption.prototype.object_5056 = function(player, index, object) { }

// Wooden doors
DecodedPacketObjectOption.prototype.object_5057 = function(player, index, object) { }

// Wooden doors
DecodedPacketObjectOption.prototype.object_5058 = function(player, index, object) { }

// Wooden doors
DecodedPacketObjectOption.prototype.object_5059 = function(player, index, object) { }

// Wooden doors
DecodedPacketObjectOption.prototype.object_5060 = function(player, index, object) { }

// Wooden doors
DecodedPacketObjectOption.prototype.object_5061 = function(player, index, object) { }

// Combat Scroll
DecodedPacketObjectOption.prototype.object_5094 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_5106 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_5107 = function(player, index, object) { }

// Closed chest
DecodedPacketObjectOption.prototype.object_5108 = function(player, index, object) { }

// Open chest
DecodedPacketObjectOption.prototype.object_5109 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_5110 = function(player, index, object) { }

// Boxes
DecodedPacketObjectOption.prototype.object_5111 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_5113 = function(player, index, object) { }

// null
DecodedPacketObjectOption.prototype.object_5115 = function(player, index, object) { }
