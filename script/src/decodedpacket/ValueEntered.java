package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.GameDecoder;
import com.palidino.osrs.io.ValueEnteredEvent;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Logger;

class ValueEntered extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            17, 8, 42
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        if (super.index() == 0) {
            int value = stream.getInt();
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                String message = "[ValueEnteredInt] value=" + value;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            ValueEnteredEvent.IntegerEvent event =
                    (ValueEnteredEvent.IntegerEvent) player.removeAttribute("entered_integer_event");
            if (event == null) {
                return;
            }
            if (player.isLocked()) {
                event.close();
                return;
            }
            player.clearIdleTime();
            event.execute(value);
            event.close();
        } else if (super.index() == 1) {
            String value = stream.getString();
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                String message = "[ValueEnteredString] value=" + value;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            ValueEnteredEvent.StringEvent event =
                    (ValueEnteredEvent.StringEvent) player.removeAttribute("entered_string_event");
            if (event == null) {
                return;
            }
            if (player.isLocked()) {
                event.close();
                return;
            }
            event.execute(value);
            event.close();
        } else if (super.index() == 2) {
            int id = stream.getUShort();
            if (id == 65535) {
                id = -1;
            }
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                String message = "[ItemEntered] id=" + id;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            ValueEnteredEvent.IntegerEvent event =
                    (ValueEnteredEvent.IntegerEvent) player.removeAttribute("entered_integer_event");
            if (event == null) {
                return;
            }
            if (player.isLocked()) {
                event.close();
                return;
            }
            event.execute(id);
            event.close();
        }
    }
}
