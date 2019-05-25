package script.packetdecoder.widget;

import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.model.Graphic;
import com.palidino.osrs.model.player.Player;
import com.palidino.util.Utils;

public class EmotesWidget {
    public static void widget216(Player player, int index, int childID, int slot, int itemID) {
        if (player.isLocked()) {
            return;
        }
        if (player.getCombatDelay() > 0 || player.getAttacking()) {
            return;
        }
        int animationID = -1;
        Graphic graphic = null;
        int lock = 0;
        switch (slot) {
        case 0: // Yes
            animationID = 855;
            break;
        case 1: // No
            animationID = 856;
            break;
        case 2: // Bow
            if (player.getEquipment().getLegID() == ItemID.PANTALOONS) {
                animationID = 5312;
            } else {
                animationID = 858;
            }
            break;
        case 3: // Angry
            if (player.getEquipment().getHeadID() == ItemID.A_POWDERED_WIG) {
                animationID = 5315;
            } else {
                animationID = 859;
            }
            break;
        case 4: // Think
            animationID = 857;
            break;
        case 5: // Wave
            animationID = 863;
            break;
        case 6: // Shrug
            animationID = 2113;
            break;
        case 7: // Cheer
            animationID = 862;
            break;
        case 8: // Beckon
            animationID = 864;
            break;
        case 9: // Laugh
            animationID = 861;
            break;
        case 10: // Jump for Joy
            animationID = 2109;
            break;
        case 11: // Yawn
            if (player.getEquipment().getHeadID() == ItemID.SLEEPING_CAP) {
                animationID = 5313;
            } else {
                animationID = 2111;
            }
            graphic = new Graphic(277);
            break;
        case 12: // Dance
            if (player.getEquipment().getLegID() == ItemID.FLARED_TROUSERS) {
                animationID = 5316;
            } else {
                animationID = 866;
            }
            break;
        case 13: // Jig
            animationID = 2106;
            break;
        case 14: // Spin
            animationID = 2107;
            break;
        case 15: // Headbang
            animationID = 2108;
            break;
        case 16: // Cry
            animationID = 860;
            break;
        case 17: // Blow Kiss
            animationID = 1374;
            break;
        case 18: // Panic
            animationID = 2105;
            break;
        case 19: // Raspberry
            animationID = 2110;
            break;
        case 20: // Clap
            animationID = 865;
            break;
        case 21: // Salute
            animationID = 2112;
            break;
        case 22: // Goblin Bow
            animationID = 2127;
            break;
        case 23: // Goblin Salute
            animationID = 2128;
            break;
        case 24: // Glass Box
            animationID = 1131;
            break;
        case 25: // Climb Rope
            animationID = 1130;
            break;
        case 26: // Lean
            animationID = 1129;
            break;
        case 27: // Glass Wall
            animationID = 1128;
            break;
        case 28: // Idea
            animationID = 4276;
            graphic = new Graphic(712);
            break;
        case 29: // Stamp
            animationID = 4278;
            break;
        case 30: // Flap
            animationID = 4280;
            break;
        case 31: // Slap Head
            animationID = 4275;
            break;
        case 32: // Zombie Walk
            animationID = 3544;
            break;
        case 33: // Zombie Dance
            animationID = 3543;
            break;
        case 34: // Scared
            animationID = 2836;
            break;
        case 35: // Rabbit Hop
            animationID = 6111;
            break;
        case 36: // Sit Up
            animationID = 2763;
            break;
        case 37: // Push Up
            animationID = 2762;
            break;
        case 38: // Star Jump
            animationID = 2761;
            break;
        case 39: // Jog
            animationID = 2764;
            break;
        case 40: // Zombie Hand
            animationID = 1708;
            graphic = new Graphic(320);
            break;
        case 41: // Hypermobile Drinker
            animationID = 7131;
            break;
        case 42: // Skill Cape
            switch (player.getEquipment().getCapeID()) {
            case ItemID.ATTACK_CAPE:
            case ItemID.ATTACK_CAPE_T:
                animationID = 4959;
                graphic = new Graphic(823);
                lock = 7;
                break;
            case ItemID.DEFENCE_CAPE:
            case ItemID.DEFENCE_CAPE_T:
                animationID = 4961;
                graphic = new Graphic(824);
                lock = 11;
                break;
            case ItemID.STRENGTH_CAPE:
            case ItemID.STRENGTH_CAPE_T:
                animationID = 4981;
                graphic = new Graphic(828);
                lock = 17;
                break;
            case ItemID.HITPOINTS_CAPE:
            case ItemID.HITPOINTS_CAPE_T:
                animationID = 4971;
                graphic = new Graphic(833);
                lock = 7;
                break;
            case ItemID.RANGING_CAPE:
            case ItemID.RANGING_CAPE_T:
                animationID = 4973;
                graphic = new Graphic(832);
                lock = 10;
                break;
            case ItemID.PRAYER_CAPE:
            case ItemID.PRAYER_CAPE_T:
                animationID = 4979;
                graphic = new Graphic(829);
                lock = 11;
                break;
            case ItemID.MAGIC_CAPE:
            case ItemID.MAGIC_CAPE_T:
                animationID = 4939;
                graphic = new Graphic(813);
                lock = 6;
                break;
            case ItemID.COOKING_CAPE:
            case ItemID.COOKING_CAPE_T:
                animationID = 4955;
                graphic = new Graphic(821);
                lock = 26;
                break;
            case ItemID.WOODCUTTING_CAPE:
            case ItemID.WOODCUT_CAPE_T:
                animationID = 4957;
                graphic = new Graphic(822);
                lock = 22;
                break;
            case ItemID.FLETCHING_CAPE:
            case ItemID.FLETCHING_CAPE_T:
                animationID = 4937;
                graphic = new Graphic(812);
                lock = 14;
                break;
            case ItemID.FISHING_CAPE:
            case ItemID.FISHING_CAPE_T:
                animationID = 4951;
                graphic = new Graphic(819);
                lock = 14;
                break;
            case ItemID.FIREMAKING_CAPE:
            case ItemID.FIREMAKING_CAPE_T:
                animationID = 4975;
                graphic = new Graphic(831);
                lock = 8;
                break;
            case ItemID.CRAFTING_CAPE:
            case ItemID.CRAFTING_CAPE_T:
                animationID = 4949;
                graphic = new Graphic(818);
                lock = 15;
                break;
            case ItemID.SMITHING_CAPE:
            case ItemID.SMITHING_CAPE_T:
                animationID = 4943;
                graphic = new Graphic(815);
                lock = 20;
                break;
            case ItemID.MINING_CAPE:
            case ItemID.MINING_CAPE_T:
                animationID = 4941;
                graphic = new Graphic(814);
                lock = 9;
                break;
            case ItemID.HERBLORE_CAPE:
            case ItemID.HERBLORE_CAPE_T:
                animationID = 4969;
                graphic = new Graphic(835);
                lock = 15;
                break;
            case ItemID.AGILITY_CAPE:
            case ItemID.AGILITY_CAPE_T:
                animationID = 4977;
                graphic = new Graphic(830);
                lock = 8;
                break;
            case ItemID.THIEVING_CAPE:
            case ItemID.THIEVING_CAPE_T:
                animationID = 4965;
                graphic = new Graphic(826);
                lock = 6;
                break;
            case ItemID.SLAYER_CAPE:
            case ItemID.SLAYER_CAPE_T:
                animationID = 4967;
                graphic = new Graphic(827);
                lock = 6;
                break;
            case ItemID.FARMING_CAPE:
            case ItemID.FARMING_CAPE_T:
                animationID = 4963;
                graphic = new Graphic(825);
                lock = 13;
                break;
            case ItemID.RUNECRAFT_CAPE:
            case ItemID.RUNECRAFT_CAPE_T:
                animationID = 4947;
                graphic = new Graphic(817);
                lock = 10;
                break;
            case ItemID.HUNTER_CAPE:
            case ItemID.HUNTER_CAPE_T:
                animationID = 5158;
                graphic = new Graphic(907);
                lock = 13;
                break;
            case ItemID.CONSTRUCT_CAPE:
            case ItemID.CONSTRUCT_CAPE_T:
                animationID = 4953;
                graphic = new Graphic(820);
                lock = 14;
                break;
            case ItemID.MAX_CAPE:
            case ItemID.FIRE_MAX_CAPE:
            case ItemID.SARADOMIN_MAX_CAPE:
            case ItemID.ZAMORAK_MAX_CAPE:
            case ItemID.GUTHIX_MAX_CAPE:
            case ItemID.ACCUMULATOR_MAX_CAPE:
            case ItemID.ARDOUGNE_MAX_CAPE:
            case ItemID.INFERNAL_MAX_CAPE:
            case ItemID.IMBUED_SARADOMIN_MAX_CAPE:
            case ItemID.IMBUED_ZAMORAK_MAX_CAPE:
            case ItemID.IMBUED_GUTHIX_MAX_CAPE:
            case ItemID.ASSEMBLER_MAX_CAPE:
                animationID = 7121;
                graphic = new Graphic(1286);
                lock = 9;
                break;
            default:
                player.getGameEncoder().sendMessage("You need to be wearing a skill cape to do this emote.");
                break;
            }
            lock += 1;
            break;
        case 43: // Air Guitar
            animationID = 4751;
            graphic = new Graphic(1239);
            break;
        case 45: // Smooth Dance
            animationID = 7533;
            break;
        case 46: // Crazy Dance
            animationID = Utils.randomE(2) == 1 ? 7537 : 7536;
            break;
        }
        if (animationID != -1) {
            player.setAnimation(animationID);
            if (graphic != null) {
                player.setGraphic(graphic);
            }
            if (lock > 0) {
                player.setLock(lock);
                player.getMovement().clear();
            }
        }
    }
}

