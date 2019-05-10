/* 27136 - 27391 */

// Stairs
DecodedPacketObjectOption.prototype.object_27199 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_27200 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_27201 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_27202 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_27203 = function(player, index, object) { }

// Stairs
DecodedPacketObjectOption.prototype.object_27204 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_27205 = function(player, index, object) { }

// Information
DecodedPacketObjectOption.prototype.object_27230 = function(player, index, object) { }

// Bank booth
DecodedPacketObjectOption.prototype.object_27253 = function(player, index, object) {
    player.getBank().open();
}

// Bank booth
DecodedPacketObjectOption.prototype.object_27254 = function(player, index, object) {
    player.getBank().open();
}

// Crate
DecodedPacketObjectOption.prototype.object_27256 = function(player, index, object) { }

// Portal
DecodedPacketObjectOption.prototype.object_27257 = function(player, index, object) { }

// Bank booth
DecodedPacketObjectOption.prototype.object_27259 = function(player, index, object) {
    player.getBank().open();
}

// Bank booth
DecodedPacketObjectOption.prototype.object_27260 = function(player, index, object) {
    player.getBank().open();
}

// Bank booth
DecodedPacketObjectOption.prototype.object_27262 = function(player, index, object) {
    player.getBank().open();
}

// Bank booth
DecodedPacketObjectOption.prototype.object_27263 = function(player, index, object) {
    player.getBank().open();
}

// Bank booth
DecodedPacketObjectOption.prototype.object_27264 = function(player, index, object) {
    player.getBank().open();
}

// Bank booth
DecodedPacketObjectOption.prototype.object_27265 = function(player, index, object) {
    player.getBank().open();
}

// Bank booth
DecodedPacketObjectOption.prototype.object_27266 = function(player, index, object) {
    player.getBank().open();
}

// Bank booth
DecodedPacketObjectOption.prototype.object_27267 = function(player, index, object) {
    player.getBank().open();
}

// Chair
DecodedPacketObjectOption.prototype.object_27268 = function(player, index, object) { }

// Deadman chest
DecodedPacketObjectOption.prototype.object_27269 = function(player, index, object) {
    if (player.getInventory().hasItem(ItemID.BLOODY_KEY_32304)) {
        player.getInventory().deleteItem(ItemID.BLOODY_KEY_32304, 1);
        var item = null;
        if (player.isGameModeNormal() || player.isGameModeHard()) {
            item = MysteryBox.getBoxItem();
        } else {
            item = RandomItem.getItem(MysteryBox.BARROWS_PIECES);
        }
        var itemName = ("aeiouAEIOU".indexOf(item.getName().charAt(0)) != -1 ? "an" : "a") + " " + item.getName();
        player.getWorld().sendNews(player.getMessaging().getIconImage() + player.getUsername() + " has received "
                + itemName + " from a bloody key!");
        player.getInventory().addOrDropItem(item);
        RequestManager.addPlayerLog(player, "lootbox", player.getLogName() + " received " + item.getLogName()
                + " from a bloody key.");
    } else if (player.getInventory().hasItem(ItemID.BLOODIER_KEY_32305)) {
        player.getInventory().deleteItem(ItemID.BLOODIER_KEY_32305, 1);
        var item1 = null;
        var item2 = null;
        if (player.isGameModeNormal() || player.isGameModeHard()) {
            item1 = MysteryBox.getSuperBoxItem();
            item2 = MysteryBox.getSuperBoxItem();
            var itemNames = ("aeiouAEIOU".indexOf(item1.getName().charAt(0)) != -1 ? "an" : "a")
                    + " " + item1.getName();
            itemNames += " and " + ("aeiouAEIOU".indexOf(item2.getName().charAt(0)) != -1 ? "an" : "a")
                    + " " + item2.getName();
            player.getWorld().sendNews(player.getMessaging().getIconImage() + player.getUsername() + " has received "
                    + itemNames + " from a bloodier key!");
        } else {
            item1 = RandomItem.getItem(MysteryBox.BARROWS_SETS);
            var itemName = ("aeiouAEIOU".indexOf(item1.getName().charAt(0)) != -1 ? "an" : "a")
                    + " " + item1.getName();
            player.getWorld().sendNews(player.getMessaging().getIconImage() + player.getUsername() + " has received "
                    + itemName + " from a bloodier key!");
        }
        player.getInventory().addOrDropItem(item1);
        RequestManager.addPlayerLog(player, "lootbox", player.getLogName() + " received " + item1.getLogName()
                + " from a bloodier key.");
        if (item2 != null) {
            player.getInventory().addOrDropItem(item2);
            RequestManager.addPlayerLog(player, "lootbox", player.getLogName() + " received " + item2.getLogName()
                    + " from a bloodier key.");
        }
    } else if (player.getInventory().hasItem(ItemID.SINISTER_KEY)) {
        player.getBarrows().openChest(object.getX() != 3551 || object.getY() != 9695);
    } else {
        player.getGameEncoder().sendMessage("You need a key to open this chest.");
    }
}

// Chair
DecodedPacketObjectOption.prototype.object_27270 = function(player, index, object) { }

// Deadman chest
DecodedPacketObjectOption.prototype.object_27271 = function(player, index, object) { }

// Stool
DecodedPacketObjectOption.prototype.object_27272 = function(player, index, object) { }

// Chair
DecodedPacketObjectOption.prototype.object_27273 = function(player, index, object) { }

// Potted plant
DecodedPacketObjectOption.prototype.object_27274 = function(player, index, object) { }

// Deadman chest
DecodedPacketObjectOption.prototype.object_27275 = function(player, index, object) { }

// Chair
DecodedPacketObjectOption.prototype.object_27276 = function(player, index, object) { }

// Deadman chest
DecodedPacketObjectOption.prototype.object_27277 = function(player, index, object) { }

// Potted flower
DecodedPacketObjectOption.prototype.object_27278 = function(player, index, object) { }

// Potted plant
DecodedPacketObjectOption.prototype.object_27279 = function(player, index, object) { }

// Deadman chest
DecodedPacketObjectOption.prototype.object_27280 = function(player, index, object) { }

// Smashed chair
DecodedPacketObjectOption.prototype.object_27281 = function(player, index, object) { }

// Deadman chest
DecodedPacketObjectOption.prototype.object_27282 = function(player, index, object) { }

// Stool
DecodedPacketObjectOption.prototype.object_27283 = function(player, index, object) { }

// Deadman chest
DecodedPacketObjectOption.prototype.object_27284 = function(player, index, object) { }

// Private bank booth
DecodedPacketObjectOption.prototype.object_27285 = function(player, index, object) { }

// Deadman chest
DecodedPacketObjectOption.prototype.object_27286 = function(player, index, object) { }

// Boulders
DecodedPacketObjectOption.prototype.object_27287 = function(player, index, object) { }

// Deadman chest
DecodedPacketObjectOption.prototype.object_27288 = function(player, index, object) { }

// Bank Table
DecodedPacketObjectOption.prototype.object_27289 = function(player, index, object) { }

// Deadman chest
DecodedPacketObjectOption.prototype.object_27290 = function(player, index, object) { }

// Bank booth
DecodedPacketObjectOption.prototype.object_27291 = function(player, index, object) {
    player.getBank().open();
}

// Bank booth
DecodedPacketObjectOption.prototype.object_27292 = function(player, index, object) {
    player.getBank().open();
}

// Handholds
DecodedPacketObjectOption.prototype.object_27362 = function(player, index, object) {
    if (object.getX() == 1459 && object.getY() == 3690) {
        player.getMovement().ladderDownTeleport(new Tile(1454, 3690, 0));
    } else if (object.getX() == 1455 && object.getY() == 3690) {
        player.getMovement().ladderUpTeleport(new Tile(1460, 3690, 0));
    } else if (object.getX() == 1471 && object.getY() == 3687) {
        player.getMovement().ladderDownTeleport(new Tile(1476, 3687, 0));
    } else if (object.getX() == 1475 && object.getY() == 3687) {
        player.getMovement().ladderUpTeleport(new Tile(1470, 3687, 0));
    }
}

// Food cupboard
DecodedPacketObjectOption.prototype.object_27375 = function(player, index, object) { }

// Utensil cupboard
DecodedPacketObjectOption.prototype.object_27376 = function(player, index, object) { }

// Meat table
DecodedPacketObjectOption.prototype.object_27377 = function(player, index, object) { }

// Buffet table
DecodedPacketObjectOption.prototype.object_27378 = function(player, index, object) { }

// Blighted Golovanova seedling
DecodedPacketObjectOption.prototype.object_27386 = function(player, index, object) { }

// Blighted Golovanova plant
DecodedPacketObjectOption.prototype.object_27389 = function(player, index, object) { }
