package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.model.player.Player;

class Idle extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            49
        };
    }

    @Override
    public void execute(Player player, Stream stream) {}
}
