package decodedpacket;

import com.palidino.io.Stream;
import com.palidino.osrs.Main;
import com.palidino.osrs.io.DecodedPacket;
import com.palidino.osrs.io.GameDecoder;
import com.palidino.osrs.model.map.route.Route;
import com.palidino.osrs.model.player.ClanWars;
import com.palidino.osrs.model.player.Equipment;
import com.palidino.osrs.model.player.Messaging;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Logger;
import com.palidino.util.Utils;

class PlayerOption extends DecodedPacket {
    @Override
    public int[] getOpcodes() {
        return new int[] {
            47, 56, 62, 27, 83
        };
    }

    @Override
    public void execute(Player player, Stream stream) {
        int id = -1;
        int moveType = 0;
        if (super.index() == 0) {
            id = stream.getUShort();
            moveType = stream.getUReversedByte();
        } else if (super.index() == 1) {
            moveType = stream.getUByte128();
            id = stream.getUShort128();
        } else if (super.index() == 2) {
            id = stream.getUShort128();
            moveType = stream.getUByte();
        } else if (super.index() == 3) {
            id = stream.getUShortLE128();
            moveType = stream.getUReversedByte();
        } else if (super.index() == 4) {
            moveType = stream.getUByte128();
            id = stream.getUShort128();
        }
        Player player2 = player.getWorld().getPlayerByIndex(id);
        if (player2 == null) {
            return;
        }
        if (GameDecoder.printPacket(player.getUsername()) || player.getOptions().getPrintPackets()) {
            String message = "[PlayerOption(" + super.index() + ")] id=" + id + "; moveType=" + moveType
                    + "; Player Username=" + player2.getUsername();
            Logger.println(message);
            if (player.getOptions().getPrintPackets()) {
                player.getGameEncoder().sendMessage(message);
            }
        }
        if (player.isLocked() || player.getMovement().isViewing()) {
            return;
        }
        player.clearIdleTime();
        player.clearAllActions(false, true);
        player.setFaceEntity(player2);
        player.getMovement().setFollowing(player2);
        if (super.index() == 1) {
            if (player.getController().playerOptionHook(super.index(), player2)) {
                return;
            }
            player.setAttacking(true);
            player.setEngagingEntity(player2);
            player.getCombat().setFollowing(player2);
            player.getMovement().follow();
            if (player.getMagic().getAutoSpellID() != 0 && player.getHitDelay() <= 0) {
                player.setHitDelay(2);
            }
            return;
        } else if (super.index() == 2) {
            if (player.getController().playerOptionHook(super.index(), player2)) {
                return;
            }
            player.setFaceEntity(player2);
            player.getMovement().setFollowBack(player2);
            player.getMovement().follow();
            return;
        }
        player.getMovement().follow();
        player.putAttribute("decodedpacket_player_index", id);
        if (complete(player)) {
            stop(player);
        } else {
            player.putAttribute("decodedpacket", this);
        }
    }

    @Override
    public boolean complete(Player player) {
        int id = player.getAttributeInt("decodedpacket_player_index");
        Player player2 = player.getWorld().getPlayerByIndex(id);
        if (player2 == null) {
            return true;
        }
        int range = 1;
        if (player.getMovement().isRouting() && player2.getMovement().isRouting()) {
            range++;
        }
        if (player.isLocked() || !player.withinDistance(player2, range)) {
            return false;
        }
        if (!Route.canReachEntity(player, player2, false)) {
            return false;
        }
        player.setFaceEntity(null);
        player.getMovement().setFollowing(null);
        if (player.getX() == player2.getX() || player.getY() == player2.getY()) {
            player.getMovement().clear();
        }
        player.setFaceTile(player2);
        if (player.getController().playerOptionHook(super.index(), player2)) {
            return true;
        }
        doAction(player, super.index(), player2);
        return true;
    }

    @Override
    public void stop(Player player) {
        player.removeAttribute("decodedpacket_player_index");
    }

    void doAction(Player player, int index, Player player2) {
        if (index == 0) {
            if (player.inDuelArena() && player2.inDuelArena()) {
                if (!player.getDuel().isStateNone() || !player2.getDuel().isStateNone()) {
                    return;
                }
                player.getDuel().setOpponent(player2);
                if (player == player2.getDuel().getOpponent()) {
                    player.getDuel().sendOptions();
                    player2.getDuel().sendOptions();
                } else {
                    player.getGameEncoder().sendMessage("Challenging " + player2.getUsername() + "...");
                    player2.getGameEncoder().sendMessage(player.getUsername() + " wishes to duel with you.",
                            Messaging.CHAT_TYPE_DUEL, player.getUsername());
                }
            } else if (player.inClanWarsChallengeArea() && player2.inClanWarsChallengeArea()) {
                if (player.getClanWars().getStatus() != ClanWars.Status.NONE
                        || player2.getClanWars().getStatus() != ClanWars.Status.NONE) {
                    return;
                }
                if (!player.getMessaging().canClanChatEvent()) {
                    player.getGameEncoder().sendMessage("Your Clan Chat privledges aren't high enough to do that.");
                    return;
                } else if (!player2.getMessaging().canClanChatEvent()) {
                    player.getGameEncoder().sendMessage("Their Clan Chat privledges aren't high enough to do that.");
                    return;
                }
                player.getClanWars().setWarring(player2);
                if (player == player2.getClanWars().getWarring()) {
                    player.getClanWars().openRuleSelection();
                    player2.getClanWars().openRuleSelection();
                } else {
                    player.getGameEncoder().sendMessage("Sending Clan Wars challenge...");
                    player2.getGameEncoder().sendMessage(
                            player.getUsername() + " wishes to challenge your clan to a Clan War.",
                            Messaging.CHAT_TYPE_DUEL, player.getUsername());
                }
            }
        } else if (index == 3) {
            if (!player2.getOptions().getAcceptAid()) {
                player.getGameEncoder().sendMessage("This player is not accepting aid.");
                return;
            } else if (player2.getWidgetManager().hasInteractiveWidgets()) {
                player.getGameEncoder().sendMessage("This player is currently busy.");
                return;
            } else if (player.getIP().equals(player2.getIP())
                    && !Utils.getBaseIPMatch(player.getMySQL().get("ipaddress"), player2.getMySQL().get("ipaddress"))
                    && !Main.adminPrivledges(player) && !Main.adminPrivledges(player2)) {
                if (!Utils.getBaseIPMatch(player.getIP(), player.getMySQL().get("ipaddress"))) {
                    player.getGameEncoder().sendMessage("Your IP doesn't match your registration IP to do this.");
                    player.getGameEncoder().sendMessage("For security precautions, you can't trade this player.");
                    return;
                } else if (!Utils.getBaseIPMatch(player2.getIP(), player2.getMySQL().get("ipaddress"))) {
                    player.getGameEncoder().sendMessage("Their IP doesn't match their registration IP to do this.");
                    player.getGameEncoder().sendMessage("For security precautions, you can't trade this player.");
                    return;
                }
            } else if (!player.getController().canTradeHook(player2) || !player2.getController().canTradeHook(player)) {
                return;
            }
            player.getTrade().setTrading(player2);
            if (player == player2.getTrade().getTrading()) {
                player.getTrade().open1();
                player2.getTrade().open1();
            } else {
                player.getGameEncoder().sendMessage("Sending trade offer...");
                player2.getGameEncoder().sendMessage(player.getUsername() + " wishes to trade with you.",
                        Messaging.CHAT_TYPE_TRADE, player.getUsername());
            }
        } else if (index == 4) {
            if (Equipment.isWhackID(player.getEquipment().getWeaponID())) {
                player.setAnimation(1833);
            }
        }
    }
}
