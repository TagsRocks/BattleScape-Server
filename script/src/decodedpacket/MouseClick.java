package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.model.player.Player;

class MouseClick extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            41
        };
    }

    @Override
    public void execute(Player player, Stream stream) {}
}
