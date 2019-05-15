package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.GameDecoder;
import com.palidino.osrs.model.map.MapObject;
import com.palidino.osrs.model.player.AchievementDiary;
import com.palidino.osrs.model.player.Mining;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SkillContainer;
import com.palidino.util.Logger;

class MapObjectOption extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            10, 79, 89, 3, 94
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        int id = -1;
        int x = -1;
        int y = -1;
        int moveType = 0;
        if (super.index() == 0) {
            y = stream.getUShort();
            moveType = stream.getU128Byte();
            id = stream.getUShort128();
            x = stream.getUShortLE128();
        } else if (super.index() == 1) {
            moveType = stream.getUByte128();
            id = stream.getUShort();
            y = stream.getUShort();
            x = stream.getUShort();
        } else if (super.index() == 2) {
            x = stream.getUShortLE128();
            id = stream.getUShort128();
            y = stream.getUShortLE128();
            moveType = stream.getUByte128();
        } else if (super.index() == 3) {
            moveType = stream.getUByte128();
            y = stream.getUShort128();
            x = stream.getUShort128();
            id = stream.getUShortLE();
        } else if (super.index() == 4) {
            id = stream.getUShort();
            moveType = stream.getUByte128();
            x = stream.getUShort128();
            y = stream.getUShortLE128();
        }
        MapObject mapObject = player.getController().getMapObject(id, x, y, player.getClientHeight());
        if (mapObject == null || !mapObject.getDef().hasOptions()) {
            return;
        }
        if (player.getHeight() != player.getClientHeight()) {
            if (mapObject.getDef().hasOption("open") || mapObject.getDef().hasOption("close")) {
                return;
            }
        }
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message = "[ObjectOption(" + super.index() + ")] id=" + id + "; x=" + x + "; y=" + y + "; moveType="
                    + moveType + ", object type=" + mapObject.getType() + ", object direction="
                    + mapObject.getDirection();
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
        if (complete(player)) {
            stop(player);
        } else {
            player.putAttribute("decodedpacket", this);
        }
    }

    @Override
    public boolean complete(Player player) {
        MapObject mapObject = (MapObject) player.getAttribute("decodedpacket_mapobject");
        if (mapObject == null || !mapObject.isVisible()) {
            return true;
        }
        int range = 1;
        if (mapObject.getType() >= 4 && mapObject.getType() <= 8) {
            range = 0;
        }
        if (mapObject.getID() == 30352) { // The Inferno
            range = 5;
        } else if (mapObject.getID() == 31561) { // Pillar
            range = 2;
        }
        boolean standardDoor = (mapObject.getDef().hasOption("open") || mapObject.getDef().hasOption("close"))
                && !mapObject.getDef().hasOption("pick-lock");
        if (player.isLocked()
                || player.getMovement().isRouting() && mapObject.getOriginal() == null
                        && (player.getX() != mapObject.getX() || player.getY() != mapObject.getY())
                || !player.withinDistanceC(mapObject, range)) {
            return false;
        }
        player.getMovement().clear();
        if (!player.matchesTile(mapObject)) {
            player.setFaceTile(mapObject);
        }
        AchievementDiary.mapObjectOptionHooks(player, super.index(), mapObject);
        if (player.getController().mapObjectOptionHook(super.index(), mapObject)) {
            return true;
        }
        if (SkillContainer.mapObjectOptionHooks(player, super.index(), mapObject)) {
            return true;
        }
        if (super.index() == 0 && Mining.start(player, mapObject)) {
            return true;
        }
        if (player.getFarming().mapObjectOptionHook(super.index(), mapObject)) {
            return true;
        }
        String scriptName = "object_" + mapObject.getID();
        /*
         * if (invalid.contains(scriptName) ||
         * !DecodedPacketObjectOption.prototype.hasOwnProperty(scriptName)) {
         * player.getGameEncoder().sendMessage("Nothing interesting happens."); return true; } try {
         * DecodedPacketObjectOption.prototype[scriptName](player, decodedPacket.index(), mapObject); }
         * catch (Exception e) { invalid.add(scriptName); throw e; }
         */
        return true;
    }

    @Override
    public void stop(Player player) {
        player.removeAttribute("decodedpacket_mapobject");
    }
}
