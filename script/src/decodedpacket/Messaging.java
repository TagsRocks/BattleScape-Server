package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.cache.CacheManager;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.world.ClanWarsTournament;
import com.palidino.rs.Clan;

class Messaging extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            97, 15, 88, 54, 25, 90, 28, 78, 77, 13, 95
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        if (super.index() == 0) {
            int secondaryEffect = stream.getUByte();
            int effects = (stream.getUByte() << 8) | (stream.getUByte() & 255);
            int length = stream.getUByte();
            String message = CacheManager.getHuffman().readEncryptedMessage(stream, length);
            player.getMessaging().setMessage(message, effects, secondaryEffect);
            if (secondaryEffect != 1) {
                player.clearIdleTime();
            }
        } else if (super.index() == 1) {
            int publicChat = stream.getUByte();
            int privateChat = stream.getUByte();
            @SuppressWarnings("unused")
            int trade = stream.getUByte();
            player.getMessaging().setPublicChatStatus(publicChat);
            player.getMessaging().setPrivateChatStatus(privateChat);
        } else if (super.index() == 2) {
            player.getMessaging().addFriend(stream.getString());
        } else if (super.index() == 3) {
            player.getMessaging().removeFriend(stream.getString());
        } else if (super.index() == 4) {
            String username = stream.getString();
            int length = stream.getUByte();
            String message = CacheManager.getHuffman().readEncryptedMessage(stream, length);
            player.getMessaging().setPrivateMessage(username, message);
            player.clearIdleTime();
        } else if (super.index() == 5) {
            player.getMessaging().addIgnore(stream.getString());
        } else if (super.index() == 6) {
            player.getMessaging().removeIgnore(stream.getString());
        } else if (super.index() == 7) {
            String username = stream.getString();
            if (username.length() == 0 || username.equals(Clan.LEAVE_CLAN)) {
                player.getMessaging().leaveClan();
            } else {
                player.getMessaging().joinClan(username);
            }
        } else if (super.index() == 8) {
            String username = stream.getString();
            int rankID = stream.getUByte();
            int rank = 0;
            switch (rankID) {
                case 0:
                    rank = Clan.NOT_IN_CLAN;
                    break;
                case 1:
                    rank = Clan.RECRUIT;
                    break;
                case 2:
                    rank = Clan.CORPORAL;
                    break;
                case 3:
                    rank = Clan.SERGEANT;
                    break;
                case 4:
                    rank = Clan.LIEUTENANT;
                    break;
                case 5:
                    rank = Clan.CAPTAIN;
                    break;
                case 6:
                    rank = Clan.GENERAL;
                    break;
            }
            player.getMessaging().setFriendClanRank(username, rank);
        } else if (super.index() == 9) {
            player.getMessaging().kickClanUser(stream.getString());
        } else if (super.index() == 10) {
            ClanWarsTournament.teleportViewing(player, stream.getString());
        }
    }
}
