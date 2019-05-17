/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacketObjectOption(index) {
    var invalid = new ArrayList();
    var decodedPacket = new DecodedPacket(index) {
        execute: function(player, stream) {
            var id = -1;
            var x = -1;
            var y = -1;
            var moveType = 0;
            if (decodedPacket.index() == 0) {
                y = stream.getUShort();
                moveType = stream.getU128Byte();
                id = stream.getUShort128();
                x = stream.getUShortLE128();
            } else if (decodedPacket.index() == 1) {
                moveType = stream.getUByte128();
                id = stream.getUShort();
                y = stream.getUShort();
                x = stream.getUShort();
            } else if (decodedPacket.index() == 2) {
                x = stream.getUShortLE128();
                id = stream.getUShort128();
                y = stream.getUShortLE128();
                moveType = stream.getUByte128();
            } else if (decodedPacket.index() == 3) {
                moveType = stream.getUByte128();
                y = stream.getUShort128();
                x = stream.getUShort128();
                id = stream.getUShortLE();
            } else if (decodedPacket.index() == 4) {
                id = stream.getUShort();
                moveType = stream.getUByte128();
                x = stream.getUShort128();
                y = stream.getUShortLE128();
            }
            var mapObject = player.getController().getMapObject(id, x, y, player.getClientHeight());
            if (mapObject == null || !mapObject.getDef().hasOptions()) {
                return;
            }
            if (player.getHeight() != player.getClientHeight()) {
                if (mapObject.getDef().hasOption("open") || mapObject.getDef().hasOption("close")) {
                    return;
                }
            }
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[ObjectOption(" + decodedPacket.index() + ")] id=" + id
                        + "; x=" + x + "; y=" + y + "; moveType=" + moveType + ", object type=" + mapObject.getType()
                        + ", object direction=" + mapObject.getDirection();
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            if (player.isLocked() || player.getMovement().isViewing() || player.getObjectOptionDelay() > 0) {
                return;
            }
            player.clearIdleTime();
            player.getMovement().fullRoute(mapObject, moveType);
            player.putAttribute("decodedpacket_mapobject", mapObject);
            if (decodedPacket.complete(player)) {
                decodedPacket.stop(player);
            } else {
                player.putAttribute("decodedpacket", decodedPacket);
            }
        },

        complete: function(player) {
            var mapObject = player.getAttribute("decodedpacket_mapobject");
            if (mapObject == null || !mapObject.isVisible()) {
                return true;
            }
            var range = 1;
            if (mapObject.getType() >= 4 && mapObject.getType() <= 8) {
                range = 0;
            }
            if (mapObject.getID() == 30352) { // The Inferno
                range = 5;
            } else if (mapObject.getID() == 31561) { // Pillar
                range = 2;
            }
            var standardDoor = (mapObject.getDef().hasOption("open") || mapObject.getDef().hasOption("close"))
                    && !mapObject.getDef().hasOption("pick-lock");
            if (player.isLocked() || player.getMovement().isRouting() && mapObject.getOriginal() == null
                    && (player.getX() != mapObject.getX() || player.getY() != mapObject.getY())
                    || !player.withinDistanceC(mapObject, range)) {
                return false;
            }
            player.getMovement().clear();
            if (!player.matchesTile(mapObject)) {
                player.setFaceTile(mapObject);
            }
            AchievementDiary.mapObjectOptionHooks(player, decodedPacket.index(), mapObject);
            if (player.getController().mapObjectOptionHook(decodedPacket.index(), mapObject)) {
                return true;
            }
            if (SkillContainer.mapObjectOptionHooks(player, decodedPacket.index(), mapObject)) {
                return true;
            }
            if (decodedPacket.index() == 0 && Mining.start(player, mapObject)) {
                return true;
            }
            if (player.getFarming().mapObjectOptionHook(decodedPacket.index(), mapObject)) {
                return true;
            }
            /*var scriptName = "object_" + mapObject.getID();
            if (invalid.contains(scriptName)
                    || !DecodedPacketObjectOption.prototype.hasOwnProperty(scriptName)) {
                player.getGameEncoder().sendMessage("Nothing interesting happens.");
                return true;
            }
            try {
                DecodedPacketObjectOption.prototype[scriptName](player, decodedPacket.index(), mapObject);
            } catch (e) {
                invalid.add(scriptName);
                throw e;
            }*/
            try {
                var className = "decodedpacket.mapobjectoption.MapObject" + Math.floor(mapObject.getID() / 16384);
                var classObj = Java.type("java.lang.Class").forName(className);
                var methodName = "mapObject" + mapObject.getID();
                var methodObj = classObj.getMethod(methodName, Player.class, Integer.TYPE, MapObject.class);
                methodObj.invoke(null, player, decodedPacket.index(), mapObject);
            } catch (e) {
                //invalid.add(scriptName);
                throw e;
            }
            return true;
        },

        stop: function(player) {
            player.removeAttribute("decodedpacket_mapobject");
        }
    };
    return decodedPacket;
}

function DecodedPacket10() {
    return new DecodedPacketObjectOption(0);
}

function DecodedPacket79() {
    return new DecodedPacketObjectOption(1);
}

function DecodedPacket89() {
    return new DecodedPacketObjectOption(2);
}

function DecodedPacket3() {
    return new DecodedPacketObjectOption(3);
}

function DecodedPacket94() {
    return new DecodedPacketObjectOption(4);
}
