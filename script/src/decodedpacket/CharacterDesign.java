package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.model.player.IdentityKit;
import com.palidino.osrs.model.player.Player;

class CharacterDesign extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            12
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        int gender = stream.getUByte();
        if (gender > 1) {
            return;
        }
        int[] styles = new int[7];
        for (int i = 0; i < styles.length; i++) {
            int id = stream.getUByte();
            if (gender == 1 && i == 1) {
                styles[i] = -1;
                continue;
            }
            if (!IdentityKit.isValidStyle(id, i, gender)) {
                return;
            }
            styles[i] = id;
        }
        int[] colors = new int[5];
        for (int i = 0; i < colors.length; i++) {
            int id = stream.getUByte();
            colors[i] = id < IdentityKit.COLORS[i].length ? id : 0;
        }
        player.clearIdleTime();
        player.getAppearance().setGender(gender);
        player.getAppearance().setStyles(styles);
        player.getAppearance().setColors(colors);
        player.getAppearance().setUpdate(true);
        player.getWidgetManager().removeInteractiveOverlay();
    }
}
