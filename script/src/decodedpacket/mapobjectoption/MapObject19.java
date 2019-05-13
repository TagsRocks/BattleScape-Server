package decodedpacket.mapobjectoption;

import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.map.Region;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.Skills;

public class MapObject19 {
    /* 4864 - 5119 */

    // Teleportation Device
    public static void mapObject4868(Player player, int index, MapObject mapObject) {}

    // Teleportation Device
    public static void mapObject4869(Player player, int index, MapObject mapObject) {}

    // Teleportation Device
    public static void mapObject4870(Player player, int index, MapObject mapObject) {}

    // Reinitialisation Panel
    public static void mapObject4871(Player player, int index, MapObject mapObject) {}

    // Crafting Stall
    public static void mapObject4874(Player player, int index, MapObject mapObject) {}

    // Food Stall
    public static void mapObject4875(Player player, int index, MapObject mapObject) {}

    // General Stall
    public static void mapObject4876(Player player, int index, MapObject mapObject) {}

    // Magic Stall
    public static void mapObject4877(Player player, int index, MapObject mapObject) {}

    // Scimitar Stall
    public static void mapObject4878(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4879(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4880(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject4881(Player player, int index, MapObject mapObject) {}

    // A rock
    public static void mapObject4883(Player player, int index, MapObject mapObject) {}

    // A rock
    public static void mapObject4887(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject4888(Player player, int index, MapObject mapObject) {}

    // Climbing rope
    public static void mapObject4889(Player player, int index, MapObject mapObject) {}

    // Saradomin Standard
    public static void mapObject4900(Player player, int index, MapObject mapObject) {}

    // Zamorak Standard
    public static void mapObject4901(Player player, int index, MapObject mapObject) {}

    // Saradomin Standard
    public static void mapObject4902(Player player, int index, MapObject mapObject) {}

    // Zamorak Standard
    public static void mapObject4903(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4911(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject4912(Player player, int index, MapObject mapObject) {}

    // Cart tunnel
    public static void mapObject4913(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3440 && mapObject.getY() == 3232) {
            player.getMovement().ladderDownTeleport(new Tile(3436, 9637));
        }
    }

    // Cart tunnel
    public static void mapObject4914(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3430 && mapObject.getY() == 3233) {
            player.getMovement().ladderDownTeleport(new Tile(3405, 9631));
        }
    }

    // Cart tunnel
    public static void mapObject4915(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3429 && mapObject.getY() == 3225) {
            player.getMovement().ladderDownTeleport(new Tile(3409, 9623));
        }
    }

    // Mine cart
    public static void mapObject4918(Player player, int index, MapObject mapObject) {
        player.getMovement().teleport((player.getX() >= 3446) ? 3444 : 3446, 3236);
    }

    // Stairs
    public static void mapObject4919(Player player, int index, MapObject mapObject) {}

    // Cart tunnel
    public static void mapObject4920(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3437 && mapObject.getY() == 9637) {
            player.getMovement().ladderUpTeleport(new Tile(3441, 3232));
        }
    }

    // Cart tunnel
    public static void mapObject4921(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3404 && mapObject.getY() == 9631) {
            player.getMovement().ladderUpTeleport(new Tile(3429, 3233));
        }
    }

    // Cart tunnel
    public static void mapObject4922(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4923(Player player, int index, MapObject mapObject) {}

    // Water Valve
    public static void mapObject4924(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("This valve seems to already be open.");
    }

    // Crystal outcrop
    public static void mapObject4926(Player player, int index, MapObject mapObject) {
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
    public static void mapObject4927(Player player, int index, MapObject mapObject) {
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
    public static void mapObject4928(Player player, int index, MapObject mapObject) {
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
    public static void mapObject4932(Player player, int index, MapObject mapObject) {
        player.getInventory().addItem(4075, 1);
        player.getGameEncoder().sendMessage("You pull the fungus from the water, it is very cold to the touch.");
    }

    // Glowing fungus
    public static void mapObject4933(Player player, int index, MapObject mapObject) {
        player.getInventory().addItem(4075, 1);
        player.getGameEncoder().sendMessage("You pull the fungus from the water, it is very cold to the touch.");
    }

    // Lift
    public static void mapObject4937(Player player, int index, MapObject mapObject) {
        if (player.getCombat().getHauntedMine() < 2 || !player.getInventory().hasItem(4075)) {
            player.getGameEncoder().sendMessage("You should take a glowing fungus with you before going down.");
            return;
        }
        player.getMovement().teleport(2725, 4452);
    }

    // Lift
    public static void mapObject4938(Player player, int index, MapObject mapObject) {
        if (player.getCombat().getHauntedMine() < 2 || !player.getInventory().hasItem(4075)) {
            player.getGameEncoder().sendMessage("You should take a glowing fungus with you before going down.");
            return;
        }
        player.getMovement().teleport(2725, 4452);
    }

    // Lift
    public static void mapObject4940(Player player, int index, MapObject mapObject) {
        if (player.getCombat().getHauntedMine() < 2 || !player.getInventory().hasItem(4075)) {
            player.getGameEncoder().sendMessage("You should take a glowing fungus with you before going down.");
            return;
        }
        player.getMovement().teleport(2725, 4452);
    }

    // Lift
    public static void mapObject4942(Player player, int index, MapObject mapObject) {}

    // Points settings
    public static void mapObject4949(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("Everything looks good here.");
    }

    // Lever
    public static void mapObject4950(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4951(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4952(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4953(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4954(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4955(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4956(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Lever
    public static void mapObject4957(Player player, int index, MapObject mapObject) {
        player.getGameEncoder().sendMessage("There is no reason to do that.");
    }

    // Door
    public static void mapObject4962(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2799 && mapObject.getY() == 4453) {
            if (mapObject.isBusy() || player.getY() != mapObject.getY()) {
                return;
            }
            player.getMovement().clear();
            if (player.getX() == mapObject.getX()) {
                player.getMovement().addMovement(mapObject.getX() - 1, mapObject.getY());
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
            Region.openDoor(player, mapObject, 1, false, false);
        }
    }

    // Large door
    public static void mapObject4963(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2773 && mapObject.getY() == 4450) {
            if (mapObject.getOriginal() != null || mapObject.getAttachment() != null
                    || player.getX() != mapObject.getX()) {
                player.getGameEncoder().sendMessage("There was an issue opening this door.");
                return;
            }
            player.getMovement().clear();
            if (player.getY() == mapObject.getY()) {
                if (!player.getInventory().hasItem(4077)) {
                    player.getGameEncoder().sendMessage("You need a key to open these doors.");
                    return;
                }
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY() - 1);
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
            Region.openGates(player, mapObject, 1, false, false);
        }
    }

    // Large door
    public static void mapObject4964(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2772 && mapObject.getY() == 4450) {
            if (mapObject.getOriginal() != null || mapObject.getAttachment() != null
                    || player.getX() != mapObject.getX()) {
                player.getGameEncoder().sendMessage("There was an issue opening this door.");
                return;
            }
            player.getMovement().clear();
            if (player.getY() == mapObject.getY()) {
                if (!player.getInventory().hasItem(4077)) {
                    player.getGameEncoder().sendMessage("You need a key to open these doors.");
                    return;
                }
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY() - 1);
            } else {
                player.getMovement().addMovement(mapObject.getX(), mapObject.getY());
            }
            Region.openGates(player, mapObject, 1, false, false);
        }
    }

    // Ladder
    public static void mapObject4965(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 3422 && mapObject.getY() == 9625) {
            player.getMovement().ladderDownTeleport(new Tile(2782, 4568));
        } else if (mapObject.getX() == 3413 && mapObject.getY() == 9633) {
            player.getMovement().ladderDownTeleport(new Tile(2773, 4576));
        }
    }

    // Ladder
    public static void mapObject4966(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2782 && mapObject.getY() == 4569) {
            player.getMovement().ladderUpTeleport(new Tile(3422, 9624));
        } else if (mapObject.getX() == 2773 && mapObject.getY() == 4577) {
            player.getMovement().ladderUpTeleport(new Tile(3413, 4576));
        }
    }

    // Ladder
    public static void mapObject4967(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2725 && mapObject.getY() == 4486) {
            player.getMovement().ladderDownTeleport(new Tile(2789, 4487));
        } else if (mapObject.getX() == 2710 && mapObject.getY() == 4540) {
            player.getMovement().ladderDownTeleport(new Tile(2775, 4540));
        } else if (mapObject.getX() == 2732 && mapObject.getY() == 4529) {
            player.getMovement().ladderDownTeleport(new Tile(2797, 4529));
        }
    }

    // Ladder
    public static void mapObject4968(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2789 && mapObject.getY() == 4486) {
            player.getMovement().ladderUpTeleport(new Tile(2725, 4487));
        } else if (mapObject.getX() == 2774 && mapObject.getY() == 4540) {
            player.getMovement().ladderUpTeleport(new Tile(2711, 4540));
        } else if (mapObject.getX() == 2796 && mapObject.getY() == 4529) {
            player.getMovement().ladderUpTeleport(new Tile(2732, 4528));
        }
    }

    // Ladder
    public static void mapObject4969(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2798 && mapObject.getY() == 4567) {
            player.getMovement().ladderDownTeleport(new Tile(2734, 4504));
        } else if (mapObject.getX() == 2797 && mapObject.getY() == 4599) {
            player.getMovement().ladderDownTeleport(new Tile(2734, 4535));
        }
    }

    // Ladder
    public static void mapObject4970(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2734 && mapObject.getY() == 4503) {
            player.getMovement().ladderUpTeleport(new Tile(2798, 4568));
        } else if (mapObject.getX() == 2733 && mapObject.getY() == 4535) {
            player.getMovement().ladderUpTeleport(new Tile(2798, 4599));
        }
    }

    // Stairs
    public static void mapObject4971(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2746 && mapObject.getY() == 4436) {
            player.getMovement().ladderDownTeleport(new Tile(2811, 4453));
        } else if (mapObject.getX() == 2692 && mapObject.getY() == 4436) {
            player.getMovement().ladderDownTeleport(new Tile(2758, 4453));
        }
    }

    // Stairs
    public static void mapObject4972(Player player, int index, MapObject mapObject) {}

    // Stairs
    public static void mapObject4973(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2812 && mapObject.getY() == 4452) {
            player.getMovement().ladderUpTeleport(new Tile(2750, 4436));
        } else if (mapObject.getX() == 2755 && mapObject.getY() == 4452) {
            player.getMovement().ladderUpTeleport(new Tile(2691, 4438));
        }
    }

    // Mine cart
    public static void mapObject4974(Player player, int index, MapObject mapObject) {
        if (mapObject.getX() == 2778 && mapObject.getY() == 4506) {
            if (player.getCombat().getHauntedMine() == 0) {
                player.getGameEncoder().sendMessage("This cart looks like it could carry something.");
            } else {
                player.getGameEncoder().sendMessage("You have already pushed a mine cart deeper into the mine.");
            }
        } else if (mapObject.getX() == 2774 && mapObject.getY() == 4537) {
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
    public static void mapObject4975(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject4977(Player player, int index, MapObject mapObject) {}

    // Gangplank
    public static void mapObject4978(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4979(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4980(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4981(Player player, int index, MapObject mapObject) {}

    // Herbs
    public static void mapObject4982(Player player, int index, MapObject mapObject) {}

    // Rope bridge
    public static void mapObject5002(Player player, int index, MapObject mapObject) {}

    // Tree
    public static void mapObject5003(Player player, int index, MapObject mapObject) {}

    // Rare Flowers
    public static void mapObject5006(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject5007(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5008(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5009(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5010(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5011(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5012(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5013(Player player, int index, MapObject mapObject) {}

    // Tunnel
    public static void mapObject5014(Player player, int index, MapObject mapObject) {}

    // slope
    public static void mapObject5015(Player player, int index, MapObject mapObject) {}

    // slope
    public static void mapObject5016(Player player, int index, MapObject mapObject) {}

    // Crevasse
    public static void mapObject5025(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject5036(Player player, int index, MapObject mapObject) {}

    // Ice gate
    public static void mapObject5043(Player player, int index, MapObject mapObject) {}

    // Ice gate
    public static void mapObject5044(Player player, int index, MapObject mapObject) {}

    // Cave entrance
    public static void mapObject5046(Player player, int index, MapObject mapObject) {}

    // Stalagmite
    public static void mapObject5050(Player player, int index, MapObject mapObject) {}

    // Wall
    public static void mapObject5052(Player player, int index, MapObject mapObject) {}

    // Ladder
    public static void mapObject5054(Player player, int index, MapObject mapObject) {}

    // Trapdoor
    public static void mapObject5055(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5056(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5057(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5058(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5059(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5060(Player player, int index, MapObject mapObject) {}

    // Wooden doors
    public static void mapObject5061(Player player, int index, MapObject mapObject) {}

    // Combat Scroll
    public static void mapObject5094(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject5106(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject5107(Player player, int index, MapObject mapObject) {}

    // Closed chest
    public static void mapObject5108(Player player, int index, MapObject mapObject) {}

    // Open chest
    public static void mapObject5109(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject5110(Player player, int index, MapObject mapObject) {}

    // Boxes
    public static void mapObject5111(Player player, int index, MapObject mapObject) {}

    // Crate
    public static void mapObject5113(Player player, int index, MapObject mapObject) {}

    // null
    public static void mapObject5115(Player player, int index, MapObject mapObject) {}
}

