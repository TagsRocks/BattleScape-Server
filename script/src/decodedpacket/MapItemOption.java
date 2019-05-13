package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.GameDecoder;
import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.dialogue.Dialogue;
import com.palidino.osrs.model.item.ItemContainer;
import com.palidino.osrs.model.item.ItemDef;
import com.palidino.osrs.model.map.route.Route;
import com.palidino.osrs.model.player.PCombat;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Logger;

class MapItemOption extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            -1, -1, 6
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        int id = -1;
        int x = -1;
        int y = -1;
        int moveType = 0;
        if (super.index() == 2) {
            y = stream.getUShortLE();
            moveType = stream.getU128Byte();
            x = stream.getUShortLE();
            id = stream.getUShortLE();
        }
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message = "[MapItemOption(" + super.index() + ")] id=" + id + "; x=" + x + "; y=" + y + "; moveType="
                    + moveType;
            Logger.println(message);
            if (player.getOptions().getPrintPackets()) {
                player.getGameEncoder().sendMessage(message);
            }
        }
        if (player.isLocked() || player.getMovement().isViewing()) {
            return;
        }
        player.clearIdleTime();
        player.getMovement().fullRoute(x, y, moveType);
        player.putAttribute("decodedpacket_item_id", id);
        player.putAttribute("decodedpacket_item_x", x);
        player.putAttribute("decodedpacket_item_y", y);
        if (complete(player)) {
            stop(player);
        } else {
            player.putAttribute("decodedpacket", this);
        }
    }

    @Override
    public boolean complete(Player player) {
        int id = player.getAttributeInt("decodedpacket_item_id");
        int x = player.getAttributeInt("decodedpacket_item_x");
        int y = player.getAttributeInt("decodedpacket_item_y");
        int reach = 0;
        Tile t = new Tile(x, y, player.getHeight());
        if (!player.getMovement().isRouting() && player.withinDistance(t, 1) && Route.canReachTile(player, t, true)) {
            reach = 1;
        }
        if (player.isLocked() || !player.withinDistance(t, reach)) {
            return false;
        }
        if (reach == 1 && !player.withinDistance(t, 0)) {
            player.setAnimation(827);
        }
        player.getMovement().clear();
        if (super.index() == 2) {
            boolean isStackableAndCarrying = ItemDef.getStackable(id) && player.getInventory().hasItem(id);
            ItemContainer.ChangeResult result = player.getWorld().pickupMapItem(player, id, x, y);
            if (result.partialSuccess() && (id == ItemID.BLOODY_KEY || id == ItemID.BLOODIER_KEY)
                    && player.inWilderness()) {
                player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
                player.getMovement().setEnergy(0);
                player.getGameEncoder().sendMessage("<col=ff0000>Carrying the key prevents you from teleporting.");
                if (id == ItemID.BLOODIER_KEY) {
                    player.getWorld().sendNews("A " + ItemDef.getName(id) + " has been picked up by "
                            + player.getUsername() + " at level " + player.getWildernessLevel() + " wilderness!");
                }
            } else if (result.partialSuccess() && result.getSlot() != -1 && !isStackableAndCarrying
                    && player.getInventory().hasItem(ItemID.LOOTING_BAG_22586)) {
                player.putAttribute("looting_bag_item_slot", result.getSlot());
                Dialogue.executeScript(player, "lootingbag", 0, 4);
                player.removeAttribute("looting_bag_item_slot");
            }
        }
        return true;
    }

    @Override
    public void stop(Player player) {
        player.removeAttribute("decodedpacket_item_id");
        player.removeAttribute("decodedpacket_item_x");
        player.removeAttribute("decodedpacket_item_y");
    }
}
