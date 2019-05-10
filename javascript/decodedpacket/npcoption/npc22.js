/* 5632 - 5887 */

// Vote manager
DecodedPacketNpcOption.prototype.npc_5721 = function(player, index, npc) {
    if (Main.isBeta()) {
        player.getGameEncoder().sendMessage("You can't do this on beta worlds.");
        return;
    }
    if (index == 0) {
        player.openDialogue("vote", 0);
    } else if (index == 3) {
        if (player.isGameModeNormal()) {
            player.openShop("vote");
        } else {
            player.openShop("vote_iron");
        }
    }
}

// Barricade
DecodedPacketNpcOption.prototype.npc_5722 = function(player, index, npc) { }

// Barricade
DecodedPacketNpcOption.prototype.npc_5723 = function(player, index, npc) { }

// Barricade
DecodedPacketNpcOption.prototype.npc_5724 = function(player, index, npc) { }

// Barricade
DecodedPacketNpcOption.prototype.npc_5725 = function(player, index, npc) { }

// Elnock Inquisitor
DecodedPacketNpcOption.prototype.npc_5734 = function(player, index, npc) {
    player.openShop("skilling");
}

// Impling
DecodedPacketNpcOption.prototype.npc_5735 = function(player, index, npc) { }

// Fairy Aeryka
DecodedPacketNpcOption.prototype.npc_5736 = function(player, index, npc) { }

// Wandering impling
DecodedPacketNpcOption.prototype.npc_5737 = function(player, index, npc) { }

// Simon Templeton
DecodedPacketNpcOption.prototype.npc_5786 = function(player, index, npc) { }

// Cap'n Izzy No-Beard
DecodedPacketNpcOption.prototype.npc_5789 = function(player, index, npc) {
    player.openShop("agility");
}

// Pirate Jackie the Fruit
DecodedPacketNpcOption.prototype.npc_5790 = function(player, index, npc) { }

// Party Pete
DecodedPacketNpcOption.prototype.npc_5792 = function(player, index, npc) { }

// Knight
DecodedPacketNpcOption.prototype.npc_5793 = function(player, index, npc) { }

// Megan
DecodedPacketNpcOption.prototype.npc_5794 = function(player, index, npc) { }

// Lucy
DecodedPacketNpcOption.prototype.npc_5795 = function(player, index, npc) { }

// Tanner
DecodedPacketNpcOption.prototype.npc_5809 = function(player, index, npc) { }

// Master Crafter
DecodedPacketNpcOption.prototype.npc_5810 = function(player, index, npc) { }

// Master Crafter
DecodedPacketNpcOption.prototype.npc_5811 = function(player, index, npc) { }

// Master Crafter
DecodedPacketNpcOption.prototype.npc_5812 = function(player, index, npc) { }

// Bert
DecodedPacketNpcOption.prototype.npc_5815 = function(player, index, npc) { }

// Bert
DecodedPacketNpcOption.prototype.npc_5819 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_5820 = function(player, index, npc) { }

// Fishing spot
DecodedPacketNpcOption.prototype.npc_5821 = function(player, index, npc) { }

// Bork Sigmundson
DecodedPacketNpcOption.prototype.npc_5827 = function(player, index, npc) { }

// Martin the Master Gardener
DecodedPacketNpcOption.prototype.npc_5832 = function(player, index, npc) { }

// Frog
DecodedPacketNpcOption.prototype.npc_5833 = function(player, index, npc) { }

// Co-ordinator
DecodedPacketNpcOption.prototype.npc_5835 = function(player, index, npc) { }

// Fairy Nuff
DecodedPacketNpcOption.prototype.npc_5836 = function(player, index, npc) { }

// Fairy Godfather
DecodedPacketNpcOption.prototype.npc_5837 = function(player, index, npc) { }

// Slim Louie
DecodedPacketNpcOption.prototype.npc_5838 = function(player, index, npc) { }

// Fat Rocco
DecodedPacketNpcOption.prototype.npc_5839 = function(player, index, npc) { }

// Gatekeeper
DecodedPacketNpcOption.prototype.npc_5840 = function(player, index, npc) { }

// Zandar Horfyre
DecodedPacketNpcOption.prototype.npc_5841 = function(player, index, npc) { }

// Cow
DecodedPacketNpcOption.prototype.npc_5842 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_5843 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_5844 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_5845 = function(player, index, npc) { }

// Sheep
DecodedPacketNpcOption.prototype.npc_5846 = function(player, index, npc) { }

// Zanaris choir
DecodedPacketNpcOption.prototype.npc_5847 = function(player, index, npc) { }

// Gatekeeper
DecodedPacketNpcOption.prototype.npc_5855 = function(player, index, npc) { }

// Fairy chef
DecodedPacketNpcOption.prototype.npc_5856 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_5857 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_5858 = function(player, index, npc) { }

// Captain Ned
DecodedPacketNpcOption.prototype.npc_5864 = function(player, index, npc) { }

// Key Master
DecodedPacketNpcOption.prototype.npc_5870 = function(player, index, npc) { }

// Abyssal orphan
DecodedPacketNpcOption.prototype.npc_5883 = function(player, index, npc) { }

// Abyssal orphan
DecodedPacketNpcOption.prototype.npc_5884 = function(player, index, npc) { }

// James
DecodedPacketNpcOption.prototype.npc_5885 = function(player, index, npc) { }
