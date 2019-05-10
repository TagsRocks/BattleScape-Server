/* 512 - 767 */

// Door
DecodedPacketObjectOption.prototype.object_532 = function(player, index, object) { }

// Crevice
DecodedPacketObjectOption.prototype.object_534 = function(player, index, object) {
    // Smoke Devil Dungeon
    var tile = new Tile(2413, 3059, 0);
    player.getMovement().ladderUpTeleport(tile);
}

// Crevice
DecodedPacketObjectOption.prototype.object_535 = function(player, index, object) {
    // Stronghold Slayer Cave
    if (!player.getSlayer().isAnyTask(499) && !player.isUsergroup(Player.GROUP_YOUTUBER)) {
        player.getGameEncoder().sendMessage("You need an appropriate Slayer task of Smoke Devils to enter.");
        return;
    }
    player.openDialogue("bossinstance", 5);
}

// Crevice
DecodedPacketObjectOption.prototype.object_536 = function(player, index, object) {
    // Stronghold Slayer Cave
    var tile = new Tile(2379, 9452, 0);
    player.getMovement().ladderDownTeleport(tile);
}

// Crevice
DecodedPacketObjectOption.prototype.object_537 = function(player, index, object) {
    player.openDialogue("bossinstance", 12);
}

// Crevice
DecodedPacketObjectOption.prototype.object_538 = function(player, index, object) {
    var tile = new Tile(2280, 10016, 0);
    player.getMovement().ladderUpTeleport(tile);
    player.getController().stopWithTeleport();
}

// Curtain
DecodedPacketObjectOption.prototype.object_539 = function(player, index, object) { }

// Broken Fence
DecodedPacketObjectOption.prototype.object_544 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_553 = function(player, index, object) { }

// Tea stall
DecodedPacketObjectOption.prototype.object_635 = function(player, index, object) { }

// Buried skeleton
DecodedPacketObjectOption.prototype.object_651 = function(player, index, object) { }

// Passage
DecodedPacketObjectOption.prototype.object_677 = function(player, index, object) {
    player.getCombat().setDamageInflicted(0);
    if (player.getX() <= 2970) {
        player.getMovement().teleport(2974, 4384, 2);
    } else {
        player.getMovement().teleport(2970, 4384, 2);
    }
    player.getController().stopWithTeleport();
}

// Cave
DecodedPacketObjectOption.prototype.object_678 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY) || player.getInventory().hasItem(ItemID.BLOODIER_KEY)) {
        player.getGameEncoder().sendMessage("You can't use this right now.");
        return;
    }
    if (player.getMovement().getTeleportBlock() > 0) {
        player.getGameEncoder().sendMessage("A teleport block has been cast on you. It should wear off in "
                + player.getMovement().getTeleportBlockRemaining() + ".");
        return;
    }
    var tile = new Tile(2964, 4382, 2);
    player.getMovement().ladderUpTeleport(tile);
}

// Cave exit
DecodedPacketObjectOption.prototype.object_679 = function(player, index, object) {
    var tile = new Tile(3206, 3681, 0);
    player.getMovement().ladderDownTeleport(tile);
}

// Shaking box
DecodedPacketObjectOption.prototype.object_721 = function(player, index, object) {
    player.getHunter().pickupTrap(object);
}

// Buried skeleton
DecodedPacketObjectOption.prototype.object_723 = function(player, index, object) { }

// Web
DecodedPacketObjectOption.prototype.object_733 = function(player, index, object) {
    if ((player.getEquipment().getWeaponDef().getWeaponType() == null
            || !player.getEquipment().getWeaponDef().getWeaponType().hasSlash())
            && !player.getInventory().hasItem(946)) {
        player.getGameEncoder().sendMessage("Only a sharp blade can cut through this sticky web.");
        return;
    }
    player.setAnimation(player.getCombat().getAttackAnimation());
    if (Utils.randomE(4) != 0) {
        player.getGameEncoder().sendMessage("You fail to cut through it.");
        return;
    }
    player.getGameEncoder().sendMessage("You slash the web apart.");
    var newWeb = new MapObject(object.getID() + 1, object);
    player.getWorld().addEvent(new TempMapObject(100, player.getController(), newWeb));
}
