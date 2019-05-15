package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.WidgetManager;

class WindowSize extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            35
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        WidgetManager.ViewportType viewportType = WidgetManager.ViewportType.get(stream.getUByte());
        int width = stream.getUShort();
        int height = stream.getUShort();
        WidgetManager.ViewportType currentViewportType = player.getWidgetManager().getViewportType();
        if (viewportType == null || viewportType == currentViewportType) {
            return;
        }
        player.clearIdleTime();
        player.getWidgetManager().setViewportType(viewportType);
        player.getWidgetManager().sendGameViewport();
    }
}
