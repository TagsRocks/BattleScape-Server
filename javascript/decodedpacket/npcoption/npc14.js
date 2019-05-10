/* 3584 - 3839 */

// Effigy
DecodedPacketNpcOption.prototype.npc_3585 = function(player, index, npc) { }

// Bonafido
DecodedPacketNpcOption.prototype.npc_3587 = function(player, index, npc) { }

// Homunculus
DecodedPacketNpcOption.prototype.npc_3588 = function(player, index, npc) { }

// Homunculus
DecodedPacketNpcOption.prototype.npc_3589 = function(player, index, npc) { }

// Homunculus
DecodedPacketNpcOption.prototype.npc_3590 = function(player, index, npc) { }

// 'Transmute' The Alchemist
DecodedPacketNpcOption.prototype.npc_3592 = function(player, index, npc) { }

// 'Currency' The Alchemist
DecodedPacketNpcOption.prototype.npc_3594 = function(player, index, npc) { }

// 'Black-eye'
DecodedPacketNpcOption.prototype.npc_3596 = function(player, index, npc) { }

// 'No fingers'
DecodedPacketNpcOption.prototype.npc_3597 = function(player, index, npc) { }

// 'Gummy'
DecodedPacketNpcOption.prototype.npc_3598 = function(player, index, npc) { }

// 'The Guns'
DecodedPacketNpcOption.prototype.npc_3599 = function(player, index, npc) { }

// Brother Kojo
DecodedPacketNpcOption.prototype.npc_3606 = function(player, index, npc) { }

// Zealot
DecodedPacketNpcOption.prototype.npc_3611 = function(player, index, npc) {
    player.openDialogue("hauntedmine", 0);
}

// Iron pickaxe
DecodedPacketNpcOption.prototype.npc_3613 = function(player, index, npc) { }

// Innocent-looking key
DecodedPacketNpcOption.prototype.npc_3619 = function(player, index, npc) {
    if (player.getCombat().getHauntedMine() < 2 || player.getWorld().getTargetNPC(3616, player) != null) {
        player.getGameEncoder().sendMessage("Nothing interesting happens.");
        return;
    } else if (player.getCombat().getHauntedMine() == 2) {
        var treus = new Npc(player.getController(), 3616, new Tile(2788, 4457, player.getHeight()));
        treus.getCombat().setTarget(player);
    } else if (player.getCombat().getHauntedMine() >= 3) {
        player.getInventory().addItem(4077, 1);
    }
}

// Digsite workman
DecodedPacketNpcOption.prototype.npc_3628 = function(player, index, npc) { }

// Doug Deeping
DecodedPacketNpcOption.prototype.npc_3629 = function(player, index, npc) { }

// Digsite workman
DecodedPacketNpcOption.prototype.npc_3630 = function(player, index, npc) { }

// Digsite workman
DecodedPacketNpcOption.prototype.npc_3631 = function(player, index, npc) { }

// Student
DecodedPacketNpcOption.prototype.npc_3632 = function(player, index, npc) { }

// Student
DecodedPacketNpcOption.prototype.npc_3633 = function(player, index, npc) { }

// Student
DecodedPacketNpcOption.prototype.npc_3634 = function(player, index, npc) { }

// Examiner
DecodedPacketNpcOption.prototype.npc_3635 = function(player, index, npc) { }

// Examiner
DecodedPacketNpcOption.prototype.npc_3636 = function(player, index, npc) { }

// Examiner
DecodedPacketNpcOption.prototype.npc_3637 = function(player, index, npc) { }

// Researcher
DecodedPacketNpcOption.prototype.npc_3638 = function(player, index, npc) { }

// Archaeological expert
DecodedPacketNpcOption.prototype.npc_3639 = function(player, index, npc) { }

// Panning guide
DecodedPacketNpcOption.prototype.npc_3640 = function(player, index, npc) { }

// Redbeard Frank
DecodedPacketNpcOption.prototype.npc_3643 = function(player, index, npc) { }

// Captain Tobias
DecodedPacketNpcOption.prototype.npc_3644 = function(player, index, npc) { }

// Seaman Lorris
DecodedPacketNpcOption.prototype.npc_3645 = function(player, index, npc) { }

// Seaman Thresnor
DecodedPacketNpcOption.prototype.npc_3646 = function(player, index, npc) { }

// Luthas
DecodedPacketNpcOption.prototype.npc_3647 = function(player, index, npc) { }

// Customs officer
DecodedPacketNpcOption.prototype.npc_3648 = function(player, index, npc) { }

// Captain Barnaby
DecodedPacketNpcOption.prototype.npc_3649 = function(player, index, npc) { }

// Man
DecodedPacketNpcOption.prototype.npc_3652 = function(player, index, npc) { }

// Lumberjack Leif
DecodedPacketNpcOption.prototype.npc_3653 = function(player, index, npc) { }

// Miner Magnus
DecodedPacketNpcOption.prototype.npc_3654 = function(player, index, npc) { }

// Fisherman Frodi
DecodedPacketNpcOption.prototype.npc_3655 = function(player, index, npc) { }

// Gardener Gunnhild
DecodedPacketNpcOption.prototype.npc_3656 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_3657 = function(player, index, npc) { }

// Carpenter Kjallak
DecodedPacketNpcOption.prototype.npc_3658 = function(player, index, npc) { }

// Farmer Fromund
DecodedPacketNpcOption.prototype.npc_3659 = function(player, index, npc) { }

// Prince Brand
DecodedPacketNpcOption.prototype.npc_3666 = function(player, index, npc) { }

// Princess Astrid
DecodedPacketNpcOption.prototype.npc_3667 = function(player, index, npc) { }

// King Vargas
DecodedPacketNpcOption.prototype.npc_3668 = function(player, index, npc) { }

// Guard
DecodedPacketNpcOption.prototype.npc_3669 = function(player, index, npc) { }

// Derrik
DecodedPacketNpcOption.prototype.npc_3671 = function(player, index, npc) { }

// Flower Girl
DecodedPacketNpcOption.prototype.npc_3673 = function(player, index, npc) { }

// Ragnar
DecodedPacketNpcOption.prototype.npc_3674 = function(player, index, npc) { }

// Einar
DecodedPacketNpcOption.prototype.npc_3675 = function(player, index, npc) { }

// Alrik
DecodedPacketNpcOption.prototype.npc_3676 = function(player, index, npc) { }

// Thorhild
DecodedPacketNpcOption.prototype.npc_3677 = function(player, index, npc) { }

// Halla
DecodedPacketNpcOption.prototype.npc_3678 = function(player, index, npc) { }

// Yrsa
DecodedPacketNpcOption.prototype.npc_3679 = function(player, index, npc) { }

// Sailor
DecodedPacketNpcOption.prototype.npc_3680 = function(player, index, npc) { }

// Rannveig
DecodedPacketNpcOption.prototype.npc_3681 = function(player, index, npc) { }

// Thora
DecodedPacketNpcOption.prototype.npc_3682 = function(player, index, npc) { }

// Valgerd
DecodedPacketNpcOption.prototype.npc_3683 = function(player, index, npc) { }

// Skraeling
DecodedPacketNpcOption.prototype.npc_3684 = function(player, index, npc) { }

// Broddi
DecodedPacketNpcOption.prototype.npc_3685 = function(player, index, npc) { }

// Skraeling
DecodedPacketNpcOption.prototype.npc_3686 = function(player, index, npc) { }

// Ragnvald
DecodedPacketNpcOption.prototype.npc_3687 = function(player, index, npc) { }

// Fishmonger
DecodedPacketNpcOption.prototype.npc_3688 = function(player, index, npc) { }

// Greengrocer
DecodedPacketNpcOption.prototype.npc_3689 = function(player, index, npc) { }

// Juvinate guard
DecodedPacketNpcOption.prototype.npc_3690 = function(player, index, npc) { }

// Juvinate guard
DecodedPacketNpcOption.prototype.npc_3691 = function(player, index, npc) { }

// Vampyre juvenile
DecodedPacketNpcOption.prototype.npc_3692 = function(player, index, npc) { }

// Vampyre juvenile
DecodedPacketNpcOption.prototype.npc_3693 = function(player, index, npc) { }

// Vampyre juvinate
DecodedPacketNpcOption.prototype.npc_3694 = function(player, index, npc) { }

// Vampyre juvinate
DecodedPacketNpcOption.prototype.npc_3695 = function(player, index, npc) { }

// Held vampyre juvenile
DecodedPacketNpcOption.prototype.npc_3696 = function(player, index, npc) { }

// Held vampyre juvenile
DecodedPacketNpcOption.prototype.npc_3697 = function(player, index, npc) { }

// Held vampyre juvinate
DecodedPacketNpcOption.prototype.npc_3698 = function(player, index, npc) { }

// Held vampyre juvinate
DecodedPacketNpcOption.prototype.npc_3699 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3709 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3710 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3711 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3712 = function(player, index, npc) { }

// Flying female vampire
DecodedPacketNpcOption.prototype.npc_3713 = function(player, index, npc) { }

// Flying female vampire
DecodedPacketNpcOption.prototype.npc_3714 = function(player, index, npc) { }

// Flying female vampire
DecodedPacketNpcOption.prototype.npc_3715 = function(player, index, npc) { }

// Flying female vampire
DecodedPacketNpcOption.prototype.npc_3716 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3717 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3718 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3719 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3720 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3721 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3722 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3723 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3724 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3725 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3726 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3727 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3728 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3729 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3730 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3731 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3732 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3748 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3749 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3750 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3751 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3752 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3753 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3754 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3755 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3756 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3757 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3758 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3759 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3760 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3761 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3762 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3763 = function(player, index, npc) { }

// Flying female vampire
DecodedPacketNpcOption.prototype.npc_3764 = function(player, index, npc) { }

// Flying female vampire
DecodedPacketNpcOption.prototype.npc_3765 = function(player, index, npc) { }

// Flying female vampire
DecodedPacketNpcOption.prototype.npc_3766 = function(player, index, npc) { }

// Flying female vampire
DecodedPacketNpcOption.prototype.npc_3767 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3768 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3769 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3770 = function(player, index, npc) { }

// Vyrewatch
DecodedPacketNpcOption.prototype.npc_3771 = function(player, index, npc) { }

// Old Man Ral
DecodedPacketNpcOption.prototype.npc_3772 = function(player, index, npc) { }

// Vertida Sefalatis
DecodedPacketNpcOption.prototype.npc_3773 = function(player, index, npc) { }

// Aeonisig Raispher
DecodedPacketNpcOption.prototype.npc_3774 = function(player, index, npc) { }

// Safalaan
DecodedPacketNpcOption.prototype.npc_3775 = function(player, index, npc) { }

// Sarius Guile
DecodedPacketNpcOption.prototype.npc_3776 = function(player, index, npc) { }

// Elemental balance
DecodedPacketNpcOption.prototype.npc_3777 = function(player, index, npc) { }

// Trader Sven
DecodedPacketNpcOption.prototype.npc_3779 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3780 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3781 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3782 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3783 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3784 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3785 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3786 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3787 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3788 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3789 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3790 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3791 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3792 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3793 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3794 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3795 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3796 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3797 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3798 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3799 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3800 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3801 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3802 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3803 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3804 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3805 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3806 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3807 = function(player, index, npc) { }

// Meiyerditch citizen
DecodedPacketNpcOption.prototype.npc_3808 = function(player, index, npc) { }

// A Meiyerditch child
DecodedPacketNpcOption.prototype.npc_3809 = function(player, index, npc) { }

// A Meiyerditch child
DecodedPacketNpcOption.prototype.npc_3810 = function(player, index, npc) { }

// A Meiyerditch child
DecodedPacketNpcOption.prototype.npc_3811 = function(player, index, npc) { }

// A Meiyerditch child
DecodedPacketNpcOption.prototype.npc_3812 = function(player, index, npc) { }

// A Meiyerditch child
DecodedPacketNpcOption.prototype.npc_3813 = function(player, index, npc) { }

// A Meiyerditch child
DecodedPacketNpcOption.prototype.npc_3814 = function(player, index, npc) { }

// A Meiyerditch child
DecodedPacketNpcOption.prototype.npc_3815 = function(player, index, npc) { }

// A Meiyerditch child
DecodedPacketNpcOption.prototype.npc_3816 = function(player, index, npc) { }

// A Meiyerditch child
DecodedPacketNpcOption.prototype.npc_3817 = function(player, index, npc) { }

// A Meiyerditch child
DecodedPacketNpcOption.prototype.npc_3818 = function(player, index, npc) { }

// Meiyerditch miner
DecodedPacketNpcOption.prototype.npc_3819 = function(player, index, npc) { }

// Meiyerditch miner
DecodedPacketNpcOption.prototype.npc_3820 = function(player, index, npc) { }

// Meiyerditch miner
DecodedPacketNpcOption.prototype.npc_3821 = function(player, index, npc) { }

// Meiyerditch miner
DecodedPacketNpcOption.prototype.npc_3822 = function(player, index, npc) { }

// Meiyerditch miner
DecodedPacketNpcOption.prototype.npc_3823 = function(player, index, npc) { }

// Meiyerditch miner
DecodedPacketNpcOption.prototype.npc_3824 = function(player, index, npc) { }

// Cat
DecodedPacketNpcOption.prototype.npc_3831 = function(player, index, npc) { }

// Cat
DecodedPacketNpcOption.prototype.npc_3832 = function(player, index, npc) { }

// Oneiromancer
DecodedPacketNpcOption.prototype.npc_3835 = function(player, index, npc) {
    player.openDialogue("dreammentor", 0);
}

// House
DecodedPacketNpcOption.prototype.npc_3836 = function(player, index, npc) { }

// Baba Yaga
DecodedPacketNpcOption.prototype.npc_3837 = function(player, index, npc) { }

// Pauline Polaris
DecodedPacketNpcOption.prototype.npc_3838 = function(player, index, npc) { }

// Meteora
DecodedPacketNpcOption.prototype.npc_3839 = function(player, index, npc) { }
