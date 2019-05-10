/**
 * AUTO-GENERATED: DO NOT EDIT
 */

function DecodedPacket17() {
    var decodedPacket = new DecodedPacket() {
        execute: function(player, stream) {
            var value = stream.getInt();
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[ValueEnteredInt] value=" + value;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            var event = player.removeAttribute("entered_integer_event");
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
        }
    };
    return decodedPacket;
}

function DecodedPacket8() {
    var decodedPacket = new DecodedPacket() {
        execute: function(player, stream) {
            var value = stream.getString();
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[ValueEnteredString] value=" + value;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            var event = player.removeAttribute("entered_string_event");
            if (event == null) {
                return;
            }
            if (player.isLocked()) {
                event.close();
                return;
            }
            event.execute(value);
            event.close();
        }
    };
    return decodedPacket;
}

function DecodedPacket42() {
    var decodedPacket = new DecodedPacket() {
        execute: function(player, stream) {
            var id = stream.getUShort();
            if (id == 65535) {
                id = -1;
            }
            if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
                var message = "[ItemEntered] id=" + id;
                Logger.println(message);
                if (player.getOptions().getPrintPackets()) {
                    player.getGameEncoder().sendMessage(message);
                }
            }
            var event = player.removeAttribute("entered_integer_event");
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
    };
    return decodedPacket;
}
