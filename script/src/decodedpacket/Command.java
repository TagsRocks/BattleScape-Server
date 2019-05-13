package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.model.player.Player;

class Command extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            60, 45
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        if (super.index() == 0) {
            String command = stream.getString();
            player.clearIdleTime();
        } else if (super.index() == 1) {
            int tileHash = stream.getIntV2();
            player.clearIdleTime();
            if (player.getRights() != 2) {
                return;
            }
            int x = tileHash >> 14 & 16383;
            int y = tileHash & 16383;
            int z = tileHash >> 28 & 3;
            player.getMovement().teleport(x, y, z);
        }
    }
}
