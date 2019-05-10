/* 31744 - 31999 */

// gangplank
DecodedPacketObjectOption.prototype.object_31756 = function(player, index, object) { }

// rocks
DecodedPacketObjectOption.prototype.object_31757 = function(player, index, object) { }

// rocks
DecodedPacketObjectOption.prototype.object_31758 = function(player, index, object) { }

// rocks
DecodedPacketObjectOption.prototype.object_31759 = function(player, index, object) { }

// hole
DecodedPacketObjectOption.prototype.object_31765 = function(player, index, object) { }

// cave
DecodedPacketObjectOption.prototype.object_31766 = function(player, index, object) { }

// vine ladder
DecodedPacketObjectOption.prototype.object_31790 = function(player, index, object) { }

// hole
DecodedPacketObjectOption.prototype.object_31791 = function(player, index, object) { }

// cave
DecodedPacketObjectOption.prototype.object_31806 = function(player, index, object) { }

// cave
DecodedPacketObjectOption.prototype.object_31807 = function(player, index, object) { }

// magical barrier
DecodedPacketObjectOption.prototype.object_31808 = function(player, index, object) { }

// pillar
DecodedPacketObjectOption.prototype.object_31809 = function(player, index, object) { }

// ice chunks
DecodedPacketObjectOption.prototype.object_31822 = function(player, index, object) { }

// ice chunks
DecodedPacketObjectOption.prototype.object_31823 = function(player, index, object) { }

// ice chunks
DecodedPacketObjectOption.prototype.object_31824 = function(player, index, object) { }

// pool of dreams
DecodedPacketObjectOption.prototype.object_31825 = function(player, index, object) { }

// dream list
DecodedPacketObjectOption.prototype.object_31826 = function(player, index, object) { }

// maple birdhouse (empty)
DecodedPacketObjectOption.prototype.object_31827 = function(player, index, object) { }

// maple birdhouse
DecodedPacketObjectOption.prototype.object_31828 = function(player, index, object) { }

// maple birdhouse
DecodedPacketObjectOption.prototype.object_31829 = function(player, index, object) { }

// mahogany birdhouse (empty)
DecodedPacketObjectOption.prototype.object_31830 = function(player, index, object) { }

// mahogany birdhouse
DecodedPacketObjectOption.prototype.object_31831 = function(player, index, object) { }

// mahogany birdhouse
DecodedPacketObjectOption.prototype.object_31832 = function(player, index, object) { }

// yew birdhouse (empty)
DecodedPacketObjectOption.prototype.object_31833 = function(player, index, object) { }

// yew birdhouse
DecodedPacketObjectOption.prototype.object_31834 = function(player, index, object) { }

// yew birdhouse
DecodedPacketObjectOption.prototype.object_31835 = function(player, index, object) { }

// magic birdhouse (empty)
DecodedPacketObjectOption.prototype.object_31836 = function(player, index, object) { }

// magic birdhouse
DecodedPacketObjectOption.prototype.object_31837 = function(player, index, object) { }

// magic birdhouse
DecodedPacketObjectOption.prototype.object_31838 = function(player, index, object) { }

// redwood birdhouse (empty)
DecodedPacketObjectOption.prototype.object_31839 = function(player, index, object) { }

// redwood birdhouse
DecodedPacketObjectOption.prototype.object_31840 = function(player, index, object) { }

// redwood birdhouse
DecodedPacketObjectOption.prototype.object_31841 = function(player, index, object) { }

// decaying trunk
DecodedPacketObjectOption.prototype.object_31842 = function(player, index, object) { }

// <col=ffff00>annette</col>
DecodedPacketObjectOption.prototype.object_31843 = function(player, index, object) { }

// tunnel
DecodedPacketObjectOption.prototype.object_31844 = function(player, index, object) { }

// tunnel
DecodedPacketObjectOption.prototype.object_31845 = function(player, index, object) { }

// notice board
DecodedPacketObjectOption.prototype.object_31846 = function(player, index, object) { }

// rocks
DecodedPacketObjectOption.prototype.object_31848 = function(player, index, object) { }

// rocks
DecodedPacketObjectOption.prototype.object_31849 = function(player, index, object) { }

// rocks
DecodedPacketObjectOption.prototype.object_31850 = function(player, index, object) { }

// rocks
DecodedPacketObjectOption.prototype.object_31852 = function(player, index, object) { }

// rope
DecodedPacketObjectOption.prototype.object_31853 = function(player, index, object) { }

// vorkath head
DecodedPacketObjectOption.prototype.object_31977 = function(player, index, object) { }

// vorkath display
DecodedPacketObjectOption.prototype.object_31978 = function(player, index, object) { }

// mounted max cape
DecodedPacketObjectOption.prototype.object_31979 = function(player, index, object) { }

// mounted max cape
DecodedPacketObjectOption.prototype.object_31980 = function(player, index, object) { }

// mounted max cape
DecodedPacketObjectOption.prototype.object_31981 = function(player, index, object) { }

// mounted max cape
DecodedPacketObjectOption.prototype.object_31982 = function(player, index, object) { }

// mounted mythical cape
DecodedPacketObjectOption.prototype.object_31983 = function(player, index, object) { }

// rune dragon
DecodedPacketObjectOption.prototype.object_31984 = function(player, index, object) { }

// vorkath topiary
DecodedPacketObjectOption.prototype.object_31985 = function(player, index, object) { }

// mythical cape
DecodedPacketObjectOption.prototype.object_31986 = function(player, index, object) { }

// closed chest
DecodedPacketObjectOption.prototype.object_31987 = function(player, index, object) { }

// open chest
DecodedPacketObjectOption.prototype.object_31988 = function(player, index, object) { }

// fremennik boat
DecodedPacketObjectOption.prototype.object_31989 = function(player, index, object) { }

// ice chunks
DecodedPacketObjectOption.prototype.object_31990 = function(player, index, object) {
    if (player.getY() <= 4052) {
        player.setController(new BossInstancePC());
        player.getController().instance();
        player.getMovement().teleport(2272, 4054);
        player.getController().getVariable("boss_instance_vorkath");
    } else {
        player.getController().stop();
    }
}

// ice chunks
DecodedPacketObjectOption.prototype.object_31992 = function(player, index, object) { }

// ice chunks
DecodedPacketObjectOption.prototype.object_31994 = function(player, index, object) { }

// ice chunks
DecodedPacketObjectOption.prototype.object_31996 = function(player, index, object) { }

// ice chunks
DecodedPacketObjectOption.prototype.object_31998 = function(player, index, object) { }

// cave
DecodedPacketObjectOption.prototype.object_31999 = function(player, index, object) { }
