/* 2560 - 2815 */

// Professor Onglewip
DecodedPacketNpcOption.prototype.npc_2560 = function(player, index, npc) { }

// Professor Imblewyn
DecodedPacketNpcOption.prototype.npc_2561 = function(player, index, npc) { }

// Perrdur
DecodedPacketNpcOption.prototype.npc_2562 = function(player, index, npc) { }

// Dalila
DecodedPacketNpcOption.prototype.npc_2563 = function(player, index, npc) { }

// Sorrn
DecodedPacketNpcOption.prototype.npc_2564 = function(player, index, npc) { }

// Mimm
DecodedPacketNpcOption.prototype.npc_2565 = function(player, index, npc) { }

// Eebel
DecodedPacketNpcOption.prototype.npc_2566 = function(player, index, npc) { }

// Ermin
DecodedPacketNpcOption.prototype.npc_2567 = function(player, index, npc) { }

// Portobello
DecodedPacketNpcOption.prototype.npc_2568 = function(player, index, npc) { }

// Captain Ninto
DecodedPacketNpcOption.prototype.npc_2569 = function(player, index, npc) { }

// Captain Daerkin
DecodedPacketNpcOption.prototype.npc_2570 = function(player, index, npc) { }

// Meegle
DecodedPacketNpcOption.prototype.npc_2571 = function(player, index, npc) { }

// Wurbel
DecodedPacketNpcOption.prototype.npc_2572 = function(player, index, npc) { }

// Sarble
DecodedPacketNpcOption.prototype.npc_2573 = function(player, index, npc) { }

// Guard Vemmeldo
DecodedPacketNpcOption.prototype.npc_2574 = function(player, index, npc) { }

// Burkor
DecodedPacketNpcOption.prototype.npc_2575 = function(player, index, npc) { }

// Froono
DecodedPacketNpcOption.prototype.npc_2576 = function(player, index, npc) { }

// Abbot Langley
DecodedPacketNpcOption.prototype.npc_2577 = function(player, index, npc) { }

// Brother Jered
DecodedPacketNpcOption.prototype.npc_2578 = function(player, index, npc) { }

// Monk
DecodedPacketNpcOption.prototype.npc_2579 = function(player, index, npc) { }

// Mage of Zamorak
DecodedPacketNpcOption.prototype.npc_2580 = function(player, index, npc) { }

// Mage of Zamorak
DecodedPacketNpcOption.prototype.npc_2581 = function(player, index, npc) {
    if (index == 0 || index == 2) {
        player.openShop("wild_runes");
    } else if (index == 3) {
        if (!player.getController().canTeleport(true)) {
            return;
        }
        if (player.getEquipment().getHandID() == 11095 || player.getEquipment().getHandID() == 11097
                || player.getEquipment().getHandID() == 11099 || player.getEquipment().getHandID() == 11101
                || player.getEquipment().getHandID() == 11103) {
            player.getEquipment().setItem(Equipment.Slot.HAND, (player.getEquipment().getHandID() == 11103)
                    ? null : new Item(player.getEquipment().getHandID() + 2, 1));
            player.getAppearance().setUpdate(true);
        } else {
            player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
        }
        npc.setForceMessage("Veniens! Sallakar! Rinnesset!");
        npc.setAnimation(1818);
        npc.setGraphic(343);
        var tiles = [
            new Tile(3045, 4810), new Tile(3059, 4818), new Tile(3062, 4835), new Tile(3054, 4850),
            new Tile(3043, 4854), new Tile(3027, 4851), new Tile(3017, 4840), new Tile(3015, 4826),
            new Tile(3021, 4813), new Tile(3035, 4809)
        ];
        player.getMovement().animatedTeleport(Utils.arrayRandom(tiles), 1816, 715, new Graphic(342), null, 2);
        player.getController().stopWithTeleport();
        player.clearHits();
    }
}

// Mage of Zamorak
DecodedPacketNpcOption.prototype.npc_2582 = function(player, index, npc) {
    player.openDialogue("magezamorak", 0);
}

// Dark mage
DecodedPacketNpcOption.prototype.npc_2583 = function(player, index, npc) { }

// Skippy
DecodedPacketNpcOption.prototype.npc_2587 = function(player, index, npc) { }

// Skippy
DecodedPacketNpcOption.prototype.npc_2588 = function(player, index, npc) { }

// Skippy
DecodedPacketNpcOption.prototype.npc_2589 = function(player, index, npc) { }

// Skippy
DecodedPacketNpcOption.prototype.npc_2590 = function(player, index, npc) { }

// Boris
DecodedPacketNpcOption.prototype.npc_2613 = function(player, index, npc) { }

// Imre
DecodedPacketNpcOption.prototype.npc_2614 = function(player, index, npc) { }

// Yuri
DecodedPacketNpcOption.prototype.npc_2615 = function(player, index, npc) { }

// Joseph
DecodedPacketNpcOption.prototype.npc_2616 = function(player, index, npc) { }

// Nikolai
DecodedPacketNpcOption.prototype.npc_2617 = function(player, index, npc) { }

// Eduard
DecodedPacketNpcOption.prototype.npc_2618 = function(player, index, npc) { }

// Lev
DecodedPacketNpcOption.prototype.npc_2619 = function(player, index, npc) { }

// Georgy
DecodedPacketNpcOption.prototype.npc_2620 = function(player, index, npc) { }

// Svetlana
DecodedPacketNpcOption.prototype.npc_2621 = function(player, index, npc) { }

// Irina
DecodedPacketNpcOption.prototype.npc_2622 = function(player, index, npc) { }

// Alexis
DecodedPacketNpcOption.prototype.npc_2623 = function(player, index, npc) { }

// Milla
DecodedPacketNpcOption.prototype.npc_2624 = function(player, index, npc) { }

// Galina
DecodedPacketNpcOption.prototype.npc_2625 = function(player, index, npc) { }

// Sofiya
DecodedPacketNpcOption.prototype.npc_2626 = function(player, index, npc) { }

// Ksenia
DecodedPacketNpcOption.prototype.npc_2627 = function(player, index, npc) { }

// Yadviga
DecodedPacketNpcOption.prototype.npc_2628 = function(player, index, npc) { }

// Nikita
DecodedPacketNpcOption.prototype.npc_2629 = function(player, index, npc) { }

// Vera
DecodedPacketNpcOption.prototype.npc_2630 = function(player, index, npc) { }

// Zoja
DecodedPacketNpcOption.prototype.npc_2631 = function(player, index, npc) { }

// Liliya
DecodedPacketNpcOption.prototype.npc_2632 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_2633 = function(player, index, npc) { }

// Bob
DecodedPacketNpcOption.prototype.npc_2635 = function(player, index, npc) { }

// Bob
DecodedPacketNpcOption.prototype.npc_2636 = function(player, index, npc) { }

// Sphinx
DecodedPacketNpcOption.prototype.npc_2637 = function(player, index, npc) { }

// Neite
DecodedPacketNpcOption.prototype.npc_2638 = function(player, index, npc) { }

// Robert the Strong
DecodedPacketNpcOption.prototype.npc_2639 = function(player, index, npc) { }

// Odysseus
DecodedPacketNpcOption.prototype.npc_2640 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_2653 = function(player, index, npc) {
    Fishing.start(player, npc, index);
}

// Fishing spot
DecodedPacketNpcOption.prototype.npc_2654 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_2655 = function(player, index, npc) { }

// Aluft Gianne snr.
DecodedPacketNpcOption.prototype.npc_2656 = function(player, index, npc) { }

// Gnome Waiter
DecodedPacketNpcOption.prototype.npc_2657 = function(player, index, npc) { }

// Head chef
DecodedPacketNpcOption.prototype.npc_2658 = function(player, index, npc) {
    if (player.isGameModeNormal()) {
        player.openShop("supplies");
    } else {
        player.openShop("supplies_iron");
    }
}

// Purepker895
DecodedPacketNpcOption.prototype.npc_2659 = function(player, index, npc) { }

// Qutiedoll
DecodedPacketNpcOption.prototype.npc_2660 = function(player, index, npc) { }

// 1337sp34kr
DecodedPacketNpcOption.prototype.npc_2661 = function(player, index, npc) { }

// Elfinlocks
DecodedPacketNpcOption.prototype.npc_2662 = function(player, index, npc) { }

// Elstan
DecodedPacketNpcOption.prototype.npc_2663 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Dantaera
DecodedPacketNpcOption.prototype.npc_2664 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Kragen
DecodedPacketNpcOption.prototype.npc_2665 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Lyra
DecodedPacketNpcOption.prototype.npc_2666 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Francis
DecodedPacketNpcOption.prototype.npc_2667 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// <col=00ffff>Combat dummy</col>
DecodedPacketNpcOption.prototype.npc_2668 = function(player, index, npc) { }

// Garth
DecodedPacketNpcOption.prototype.npc_2669 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Ellena
DecodedPacketNpcOption.prototype.npc_2670 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Selena
DecodedPacketNpcOption.prototype.npc_2671 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Vasquen
DecodedPacketNpcOption.prototype.npc_2672 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Rhonen
DecodedPacketNpcOption.prototype.npc_2673 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Dreven
DecodedPacketNpcOption.prototype.npc_2674 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Taria
DecodedPacketNpcOption.prototype.npc_2675 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Rhazien
DecodedPacketNpcOption.prototype.npc_2676 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Torrell
DecodedPacketNpcOption.prototype.npc_2677 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Alain
DecodedPacketNpcOption.prototype.npc_2678 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Heskel
DecodedPacketNpcOption.prototype.npc_2679 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Treznor
DecodedPacketNpcOption.prototype.npc_2680 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Fayeth
DecodedPacketNpcOption.prototype.npc_2681 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Bolongo
DecodedPacketNpcOption.prototype.npc_2682 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Gileth
DecodedPacketNpcOption.prototype.npc_2683 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Frizzy Skernip
DecodedPacketNpcOption.prototype.npc_2684 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Yulf Squecks
DecodedPacketNpcOption.prototype.npc_2685 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Praistan Ebola
DecodedPacketNpcOption.prototype.npc_2686 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Prissy Scilla
DecodedPacketNpcOption.prototype.npc_2687 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Imiago
DecodedPacketNpcOption.prototype.npc_2688 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Liliwen
DecodedPacketNpcOption.prototype.npc_2689 = function(player, index, npc) {
    if (index == 0) {
        player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
    } else {
        player.getFarming().gardenerProtection(npc, index - 2);
    }
}

// Cool Mom227
DecodedPacketNpcOption.prototype.npc_2690 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2715 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2716 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2717 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2718 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2719 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2720 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2721 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2722 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2723 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2724 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2725 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2726 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2727 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2728 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2729 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2730 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2731 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2732 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2733 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2734 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2735 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2736 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2737 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2738 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2739 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2740 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2741 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2742 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2743 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2744 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2745 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2746 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2747 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2748 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2749 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2750 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2751 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2752 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2753 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2754 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2755 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2756 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2757 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2758 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2759 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2760 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2761 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2762 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2763 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2764 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2765 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2766 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2767 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2768 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2769 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2770 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2771 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2772 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2773 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2774 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2775 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2776 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2777 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_2778 = function(player, index, npc) { }

// Toy Soldier
DecodedPacketNpcOption.prototype.npc_2779 = function(player, index, npc) { }

// Toy Doll
DecodedPacketNpcOption.prototype.npc_2780 = function(player, index, npc) { }

// Toy Mouse
DecodedPacketNpcOption.prototype.npc_2781 = function(player, index, npc) { }

// Clockwork cat
DecodedPacketNpcOption.prototype.npc_2782 = function(player, index, npc) { }

// Hirko
DecodedPacketNpcOption.prototype.npc_2783 = function(player, index, npc) { }

// Holoy
DecodedPacketNpcOption.prototype.npc_2784 = function(player, index, npc) { }

// Hura
DecodedPacketNpcOption.prototype.npc_2785 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_2794 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_2795 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_2796 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_2797 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_2798 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_2799 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_2800 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_2801 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_2802 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_2803 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_2804 = function(player, index, npc) { }
