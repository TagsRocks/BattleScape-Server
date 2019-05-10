/* 1536 - 1791 */

// Door
DecodedPacketObjectOption.prototype.object_1536 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1537 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1538 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1540 = function(player, index, object) {
    Region.openDoor(player, object);
}

// Door
DecodedPacketObjectOption.prototype.object_1541 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1543 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1544 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1546 = function(player, index, object) {
    Region.openDoor(player, object);
}

// Door
DecodedPacketObjectOption.prototype.object_1547 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1549 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1550 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1551 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1552 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_1558 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Gate
DecodedPacketObjectOption.prototype.object_1559 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_1560 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Gate
DecodedPacketObjectOption.prototype.object_1561 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Gate
DecodedPacketObjectOption.prototype.object_1562 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Gate
DecodedPacketObjectOption.prototype.object_1563 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_1564 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_1567 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_1568 = function(player, index, object) {
    Region.openGates(player, object);
}

// Gate
DecodedPacketObjectOption.prototype.object_1569 = function(player, index, object) {
    Region.openGates(player, object);
}

// Gate
DecodedPacketObjectOption.prototype.object_1571 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_1572 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_1579 = function(player, index, object) {
    if (object.getX() == 3097 && object.getY() == 3468) {
        // Edgeville dungeon
        player.getMovement().ladderUpTeleport(new Tile(3096, 9867));
    }
}

// Trapdoor
DecodedPacketObjectOption.prototype.object_1580 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_1581 = function(player, index, object) {
    if (object.getX() == 3097 && object.getY() == 3487) {
        // Edgeville dungeon
        player.getMovement().ladderUpTeleport(new Tile(3096, 9867));
    }
}

// Trapdoor
DecodedPacketObjectOption.prototype.object_1582 = function(player, index, object) { }

// Doors
DecodedPacketObjectOption.prototype.object_1584 = function(player, index, object) { }

// Doors
DecodedPacketObjectOption.prototype.object_1585 = function(player, index, object) { }

// Doors
DecodedPacketObjectOption.prototype.object_1586 = function(player, index, object) { }

// Doors
DecodedPacketObjectOption.prototype.object_1587 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_1594 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_1595 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_1597 = function(player, index, object) { }

// Wall
DecodedPacketObjectOption.prototype.object_1598 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_1600 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_1601 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1722 = function(player, index, object) { }

// Odd looking wall
DecodedPacketObjectOption.prototype.object_1723 = function(player, index, object) { }

// Dungeon door
DecodedPacketObjectOption.prototype.object_1725 = function(player, index, object) { }

// Door
DecodedPacketObjectOption.prototype.object_1726 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_1727 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Gate
DecodedPacketObjectOption.prototype.object_1728 = function(player, index, object) {
    Region.openDoors(player, object);
}

// Gate
DecodedPacketObjectOption.prototype.object_1729 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_1730 = function(player, index, object) { }

// Gate
DecodedPacketObjectOption.prototype.object_1731 = function(player, index, object) { }

// Magic guild door
DecodedPacketObjectOption.prototype.object_1732 = function(player, index, object) { }

// Magic guild door
DecodedPacketObjectOption.prototype.object_1733 = function(player, index, object) { }

// Odd looking wall
DecodedPacketObjectOption.prototype.object_1734 = function(player, index, object) { }

// Odd looking wall
DecodedPacketObjectOption.prototype.object_1736 = function(player, index, object) { }

// Trapdoor
DecodedPacketObjectOption.prototype.object_1738 = function(player, index, object) {
    if (object.getX() == 3008 && object.getY() == 3150) {
        // Asgarnian Ice Dungeon entrance
        var tile = new Tile(3007, 9550, 0);
        player.getMovement().ladderDownTeleport(tile);
    }
}

// Willow
DecodedPacketObjectOption.prototype.object_1750 = function(player, index, object) { }

// Oak
DecodedPacketObjectOption.prototype.object_1751 = function(player, index, object) { }

// Hollow tree
DecodedPacketObjectOption.prototype.object_1752 = function(player, index, object) { }

// Yew
DecodedPacketObjectOption.prototype.object_1753 = function(player, index, object) { }

// Yew
DecodedPacketObjectOption.prototype.object_1754 = function(player, index, object) { }

// Yew
DecodedPacketObjectOption.prototype.object_1755 = function(player, index, object) { }

// Willow
DecodedPacketObjectOption.prototype.object_1756 = function(player, index, object) { }

// Hollow tree
DecodedPacketObjectOption.prototype.object_1757 = function(player, index, object) { }

// Willow
DecodedPacketObjectOption.prototype.object_1758 = function(player, index, object) { }

// Maple tree
DecodedPacketObjectOption.prototype.object_1759 = function(player, index, object) { }

// Willow
DecodedPacketObjectOption.prototype.object_1760 = function(player, index, object) { }

// Magic tree
DecodedPacketObjectOption.prototype.object_1761 = function(player, index, object) { }

// Magic tree
DecodedPacketObjectOption.prototype.object_1762 = function(player, index, object) { }

// Dummy
DecodedPacketObjectOption.prototype.object_1764 = function(player, index, object) { }

// Flour bin
DecodedPacketObjectOption.prototype.object_1781 = function(player, index, object) { }

// Flour bin
DecodedPacketObjectOption.prototype.object_1782 = function(player, index, object) { }
