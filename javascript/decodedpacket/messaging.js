/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacketMessaging(index) {
    var decodedPacket = new DecodedPacket(index) {
        execute: function(player, stream) {
            if (decodedPacket.index() == 0) {
                var secondaryEffect = stream.getUByte();
                var effects = (stream.getUByte() << 8) | (stream.getUByte() & 255);
                var length = stream.getUByte();
                var message = CacheManager.getHuffman().readEncryptedMessage(stream, length);
                player.getMessaging().setMessage(message, effects, secondaryEffect);
                if (secondaryEffect != 1) {
                    player.clearIdleTime();
                }
            } else if (decodedPacket.index() == 1) {
                var publicChat = stream.getUByte();
                var privateChat = stream.getUByte();
                var trade = stream.getUByte();
                player.getMessaging().setPublicChatStatus(publicChat);
                player.getMessaging().setPrivateChatStatus(privateChat);
            } else if (decodedPacket.index() == 2) {
                player.getMessaging().addFriend(stream.getString());
            } else if (decodedPacket.index() == 3) {
                player.getMessaging().removeFriend(stream.getString());
            } else if (decodedPacket.index() == 4) {
                var username = stream.getString();
                var length = stream.getUByte();
                var message = CacheManager.getHuffman().readEncryptedMessage(stream, length);
                player.getMessaging().setPrivateMessage(username, message);
                player.clearIdleTime();
            } else if (decodedPacket.index() == 5) {
                player.getMessaging().addIgnore(stream.getString());
            } else if (decodedPacket.index() == 6) {
                player.getMessaging().removeIgnore(stream.getString());
            } else if (decodedPacket.index() == 7) {
                var username = stream.getString();
                if (username.length() == 0 || username.equals(Clan.LEAVE_CLAN)) {
                    player.getMessaging().leaveClan();
                } else {
                    player.getMessaging().joinClan(username);
                }
            } else if (decodedPacket.index() == 8) {
                var username = stream.getString();
                var rankID = stream.getUByte();
                var rank = 0;
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
            } else if (decodedPacket.index() == 9) {
                player.getMessaging().kickClanUser(stream.getString());
            } else if (decodedPacket.index() == 10) {
                ClanWarsTournament.teleportViewing(player, stream.getString());
            }
        }
    };
    return decodedPacket;
}

function DecodedPacket97() {
    return new DecodedPacketMessaging(0); // Public chat
}

function DecodedPacket15() {
    return new DecodedPacketMessaging(1); // Chat statuses
}

function DecodedPacket88() {
    return new DecodedPacketMessaging(2); // Add friend
}

function DecodedPacket54() {
    return new DecodedPacketMessaging(3); // Remove friend
}

function DecodedPacket25() {
    return new DecodedPacketMessaging(4); // Private message
}

function DecodedPacket90() {
    return new DecodedPacketMessaging(5); // Add ignore
}

function DecodedPacket28() {
    return new DecodedPacketMessaging(6); // Remove ignore
}

function DecodedPacket78() {
    return new DecodedPacketMessaging(7); // Join clan
}

function DecodedPacket77() {
    return new DecodedPacketMessaging(8); // Set clan rank
}

function DecodedPacket13() {
    return new DecodedPacketMessaging(9); // Kick clan user
}

function DecodedPacket95() {
    return new DecodedPacketMessaging(10); // Tournament viewer username
}
