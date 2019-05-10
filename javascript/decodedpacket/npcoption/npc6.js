/* 1536 - 1791 */

// Fishing spot
DecodedPacketNpcOption.prototype.npc_1536 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_1542 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_1544 = function(player, index, npc) { }

// Guard
DecodedPacketNpcOption.prototype.npc_1546 = function(player, index, npc) { }

// Guard
DecodedPacketNpcOption.prototype.npc_1547 = function(player, index, npc) { }

// Guard
DecodedPacketNpcOption.prototype.npc_1548 = function(player, index, npc) { }

// Guard
DecodedPacketNpcOption.prototype.npc_1549 = function(player, index, npc) { }

// Guard
DecodedPacketNpcOption.prototype.npc_1550 = function(player, index, npc) { }

// Guard
DecodedPacketNpcOption.prototype.npc_1551 = function(player, index, npc) { }

// Guard
DecodedPacketNpcOption.prototype.npc_1552 = function(player, index, npc) { }

// Ordan
DecodedPacketNpcOption.prototype.npc_1560 = function(player, index, npc) { }

// Jorzik
DecodedPacketNpcOption.prototype.npc_1561 = function(player, index, npc) { }

// Smiddi Ryak (hard)
DecodedPacketNpcOption.prototype.npc_1562 = function(player, index, npc) { }

// Rolayne Twickit (hard)
DecodedPacketNpcOption.prototype.npc_1563 = function(player, index, npc) { }

// Jayene Kliyn (medium)
DecodedPacketNpcOption.prototype.npc_1564 = function(player, index, npc) { }

// Valantay Eppel (medium)
DecodedPacketNpcOption.prototype.npc_1565 = function(player, index, npc) { }

// Dalcian Fang (easy)
DecodedPacketNpcOption.prototype.npc_1566 = function(player, index, npc) { }

// Fyiona Fray (easy)
DecodedPacketNpcOption.prototype.npc_1567 = function(player, index, npc) { }

// Abidor Crank
DecodedPacketNpcOption.prototype.npc_1568 = function(player, index, npc) { }

// Benjamin
DecodedPacketNpcOption.prototype.npc_1569 = function(player, index, npc) { }

// Liam
DecodedPacketNpcOption.prototype.npc_1570 = function(player, index, npc) { }

// Miala
DecodedPacketNpcOption.prototype.npc_1571 = function(player, index, npc) { }

// Verak
DecodedPacketNpcOption.prototype.npc_1572 = function(player, index, npc) { }

// Forester (hard)
DecodedPacketNpcOption.prototype.npc_1573 = function(player, index, npc) { }

// Woman-at-arms (hard)
DecodedPacketNpcOption.prototype.npc_1574 = function(player, index, npc) { }

// Apprentice (medium)
DecodedPacketNpcOption.prototype.npc_1575 = function(player, index, npc) { }

// Ranger (medium)
DecodedPacketNpcOption.prototype.npc_1576 = function(player, index, npc) { }

// Adventurer (easy)
DecodedPacketNpcOption.prototype.npc_1577 = function(player, index, npc) { }

// Mage (easy)
DecodedPacketNpcOption.prototype.npc_1578 = function(player, index, npc) { }

// Hiylik Myna
DecodedPacketNpcOption.prototype.npc_1579 = function(player, index, npc) { }

// Gundai
DecodedPacketNpcOption.prototype.npc_1600 = function(player, index, npc) {
    player.getBank().open();
}

// Lundail
DecodedPacketNpcOption.prototype.npc_1601 = function(player, index, npc) {
    if (index == 2) {
        player.openShop("wild_runes");
    }
}

// Chamber guardian
DecodedPacketNpcOption.prototype.npc_1602 = function(player, index, npc) { }

// Kolodion
DecodedPacketNpcOption.prototype.npc_1603 = function(player, index, npc) {
    player.openDialogue("kolodion", 0);
}

// Phials
DecodedPacketNpcOption.prototype.npc_1614 = function(player, index, npc) { }

// Banknote Exchange Merchant
DecodedPacketNpcOption.prototype.npc_1615 = function(player, index, npc) { }

// High Priestess Zul-Harcinqa
DecodedPacketNpcOption.prototype.npc_1616 = function(player, index, npc) { }

// Priestess Zul-Gwenwynig
DecodedPacketNpcOption.prototype.npc_1617 = function(player, index, npc) { }

// Cat
DecodedPacketNpcOption.prototype.npc_1619 = function(player, index, npc) { }

// Cat
DecodedPacketNpcOption.prototype.npc_1620 = function(player, index, npc) { }

// Cat
DecodedPacketNpcOption.prototype.npc_1621 = function(player, index, npc) { }

// Cat
DecodedPacketNpcOption.prototype.npc_1622 = function(player, index, npc) { }

// Cat
DecodedPacketNpcOption.prototype.npc_1623 = function(player, index, npc) { }

// Cat
DecodedPacketNpcOption.prototype.npc_1624 = function(player, index, npc) { }

// Hellcat
DecodedPacketNpcOption.prototype.npc_1625 = function(player, index, npc) { }

// Lazy cat
DecodedPacketNpcOption.prototype.npc_1626 = function(player, index, npc) { }

// Lazy cat
DecodedPacketNpcOption.prototype.npc_1627 = function(player, index, npc) { }

// Lazy cat
DecodedPacketNpcOption.prototype.npc_1628 = function(player, index, npc) { }

// Lazy cat
DecodedPacketNpcOption.prototype.npc_1629 = function(player, index, npc) { }

// Lazy cat
DecodedPacketNpcOption.prototype.npc_1630 = function(player, index, npc) { }

// Lazy cat
DecodedPacketNpcOption.prototype.npc_1631 = function(player, index, npc) { }

// Lazy hellcat
DecodedPacketNpcOption.prototype.npc_1632 = function(player, index, npc) { }

// Baby impling
DecodedPacketNpcOption.prototype.npc_1635 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Young impling
DecodedPacketNpcOption.prototype.npc_1636 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Gourmet impling
DecodedPacketNpcOption.prototype.npc_1637 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Earth impling
DecodedPacketNpcOption.prototype.npc_1638 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Essence impling
DecodedPacketNpcOption.prototype.npc_1639 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Eclectic impling
DecodedPacketNpcOption.prototype.npc_1640 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Nature impling
DecodedPacketNpcOption.prototype.npc_1641 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Magpie impling
DecodedPacketNpcOption.prototype.npc_1642 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Ninja impling
DecodedPacketNpcOption.prototype.npc_1643 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Dragon impling
DecodedPacketNpcOption.prototype.npc_1644 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Baby impling
DecodedPacketNpcOption.prototype.npc_1645 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Young impling
DecodedPacketNpcOption.prototype.npc_1646 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Gourmet impling
DecodedPacketNpcOption.prototype.npc_1647 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Earth impling
DecodedPacketNpcOption.prototype.npc_1648 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Essence impling
DecodedPacketNpcOption.prototype.npc_1649 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Eclectic impling
DecodedPacketNpcOption.prototype.npc_1650 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Nature impling
DecodedPacketNpcOption.prototype.npc_1651 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Magpie impling
DecodedPacketNpcOption.prototype.npc_1652 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Ninja impling
DecodedPacketNpcOption.prototype.npc_1653 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Dragon impling
DecodedPacketNpcOption.prototype.npc_1654 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Commander Connad
DecodedPacketNpcOption.prototype.npc_1656 = function(player, index, npc) { }

// Captain Cain
DecodedPacketNpcOption.prototype.npc_1657 = function(player, index, npc) { }

// Private Paldo
DecodedPacketNpcOption.prototype.npc_1658 = function(player, index, npc) { }

// Private Pendron
DecodedPacketNpcOption.prototype.npc_1659 = function(player, index, npc) { }

// Private Pierreb
DecodedPacketNpcOption.prototype.npc_1660 = function(player, index, npc) { }

// Private Paldon
DecodedPacketNpcOption.prototype.npc_1661 = function(player, index, npc) { }

// Sergeant Sambur
DecodedPacketNpcOption.prototype.npc_1666 = function(player, index, npc) { }

// Strange Old Man
DecodedPacketNpcOption.prototype.npc_1671 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1739 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1740 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1741 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1742 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1743 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1744 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1745 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1746 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1747 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1748 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1749 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1750 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1751 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1752 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1753 = function(player, index, npc) { }

// Portal
DecodedPacketNpcOption.prototype.npc_1754 = function(player, index, npc) { }

// Void Knight
DecodedPacketNpcOption.prototype.npc_1755 = function(player, index, npc) {
    player.openShop("pest_control");
}

// Void Knight
DecodedPacketNpcOption.prototype.npc_1756 = function(player, index, npc) { }

// Void Knight
DecodedPacketNpcOption.prototype.npc_1757 = function(player, index, npc) { }

// Void Knight
DecodedPacketNpcOption.prototype.npc_1758 = function(player, index, npc) { }

// Squire
DecodedPacketNpcOption.prototype.npc_1759 = function(player, index, npc) { }

// Squire
DecodedPacketNpcOption.prototype.npc_1760 = function(player, index, npc) { }

// Squire
DecodedPacketNpcOption.prototype.npc_1761 = function(player, index, npc) { }

// Squire
DecodedPacketNpcOption.prototype.npc_1762 = function(player, index, npc) { }

// Squire
DecodedPacketNpcOption.prototype.npc_1763 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("bank", 1);
    } else if (index == 2) {
        player.getBank().open();
    }
}

// Squire
DecodedPacketNpcOption.prototype.npc_1764 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("bank", 1);
    } else if (index == 2) {
        player.getBank().open();
    }
}

// Squire
DecodedPacketNpcOption.prototype.npc_1765 = function(player, index, npc) {
    if (player.isGameModeNormal() || player.isGameModeHard()) {
        player.openShop("equipment");
    } else {
        player.openShop("equipment_iron");
    }
}

// Squire
DecodedPacketNpcOption.prototype.npc_1766 = function(player, index, npc) {
    if (player.isGameModeNormal() || player.isGameModeHard()) {
        player.openShop("equipment");
    } else {
        player.openShop("equipment_iron");
    }
}

// Squire
DecodedPacketNpcOption.prototype.npc_1767 = function(player, index, npc) {
    if (player.isGameModeNormal() || player.isGameModeHard()) {
        player.openShop("equipment");
    } else {
        player.openShop("equipment_iron");
    }
}

// Squire
DecodedPacketNpcOption.prototype.npc_1768 = function(player, index, npc) {
    if (player.isGameModeNormal()) {
        player.openShop("supplies");
    } else {
        player.openShop("supplies_iron");
    }
}

// Squire
DecodedPacketNpcOption.prototype.npc_1769 = function(player, index, npc) {
    if (player.getController().getExitTile() != null) {
        player.getController().stop();
    }
}

// Squire
DecodedPacketNpcOption.prototype.npc_1770 = function(player, index, npc) { }

// Squire (Novice)
DecodedPacketNpcOption.prototype.npc_1771 = function(player, index, npc) { }

// Squire (Intermediate)
DecodedPacketNpcOption.prototype.npc_1772 = function(player, index, npc) { }

// Squire (Veteran)
DecodedPacketNpcOption.prototype.npc_1773 = function(player, index, npc) { }

// Uri
DecodedPacketNpcOption.prototype.npc_1774 = function(player, index, npc) { }

// Uri
DecodedPacketNpcOption.prototype.npc_1775 = function(player, index, npc) { }

// Uri
DecodedPacketNpcOption.prototype.npc_1776 = function(player, index, npc) { }

// Guardian mummy
DecodedPacketNpcOption.prototype.npc_1779 = function(player, index, npc) { }

// Tarik
DecodedPacketNpcOption.prototype.npc_1781 = function(player, index, npc) { }

// Malignius Mortifer
DecodedPacketNpcOption.prototype.npc_1783 = function(player, index, npc) { }

// Betty
DecodedPacketNpcOption.prototype.npc_1788 = function(player, index, npc) { }

// Grum
DecodedPacketNpcOption.prototype.npc_1789 = function(player, index, npc) { }

// Gerrant
DecodedPacketNpcOption.prototype.npc_1790 = function(player, index, npc) { }

// Wydin
DecodedPacketNpcOption.prototype.npc_1791 = function(player, index, npc) { }
