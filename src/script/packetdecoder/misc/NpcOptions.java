package script.packetdecoder.misc;

import com.palidino.osrs.Main;
import com.palidino.osrs.io.cache.ItemID;
import com.palidino.osrs.io.cache.WidgetID;
import com.palidino.osrs.model.Graphic;
import com.palidino.osrs.model.Movement;
import com.palidino.osrs.model.Tile;
import com.palidino.osrs.model.item.Item;
import com.palidino.osrs.model.item.ItemDef;
import com.palidino.osrs.model.npc.Npc;
import com.palidino.osrs.model.player.Equipment;
import com.palidino.osrs.model.player.Magic;
import com.palidino.osrs.model.player.PCombat;
import com.palidino.osrs.model.player.Player;
import com.palidino.osrs.model.player.SlayerMaster;
import com.palidino.osrs.model.player.Teleports;
import com.palidino.rs.GrandExchangeUser;
import com.palidino.util.Time;
import com.palidino.util.Utils;

public class NpcOptions {
    /* 0 - 255 */

    // Tool Leprechaun
    public static void npcOption0(Player player, int index, Npc npc) {}

    // Hudo
    public static void npcOption12(Player player, int index, Npc npc) {}

    // Piles
    public static void npcOption13(Player player, int index, Npc npc) {
        player.getGameEncoder().sendMessage("Use items on Piles to note them.");
    }

    // Rometti
    public static void npcOption14(Player player, int index, Npc npc) {}

    // Gulluck
    public static void npcOption15(Player player, int index, Npc npc) {}

    // Heckel Funch
    public static void npcOption16(Player player, int index, Npc npc) {}

    // Rug Merchant
    public static void npcOption17(Player player, int index, Npc npc) {}

    // Rug Merchant
    public static void npcOption18(Player player, int index, Npc npc) {}

    // Rug Merchant
    public static void npcOption19(Player player, int index, Npc npc) {}

    // Rug Merchant
    public static void npcOption20(Player player, int index, Npc npc) {}

    // null
    public static void npcOption21(Player player, int index, Npc npc) {}

    // Rug Merchant
    public static void npcOption22(Player player, int index, Npc npc) {}

    // Monkey
    public static void npcOption23(Player player, int index, Npc npc) {}

    // Ignatius Vulcan
    public static void npcOption118(Player player, int index, Npc npc) {}

    // Hangman game
    public static void npcOption144(Player player, int index, Npc npc) {}

    // Hangman game
    public static void npcOption145(Player player, int index, Npc npc) {}

    // Hangman game
    public static void npcOption146(Player player, int index, Npc npc) {}

    // Hangman game
    public static void npcOption147(Player player, int index, Npc npc) {}

    // Hangman game
    public static void npcOption148(Player player, int index, Npc npc) {}

    // Hangman game
    public static void npcOption149(Player player, int index, Npc npc) {}

    // Hangman game
    public static void npcOption150(Player player, int index, Npc npc) {}

    // Hangman game
    public static void npcOption151(Player player, int index, Npc npc) {}

    // Hangman game
    public static void npcOption152(Player player, int index, Npc npc) {}

    // Hangman game
    public static void npcOption153(Player player, int index, Npc npc) {}

    // Jacky Jester
    public static void npcOption155(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption157(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption158(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption159(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption160(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption161(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption162(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption163(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption164(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption165(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption166(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption167(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption168(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption169(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption170(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption171(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption172(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption173(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption174(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption175(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption176(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption177(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption178(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption179(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption180(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption181(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption182(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption183(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption184(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption185(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption186(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption187(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption188(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption189(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption190(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption191(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption192(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption193(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption194(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption195(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption196(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption197(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption198(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption199(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption200(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption201(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption202(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption203(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption204(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption205(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption206(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption207(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption208(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption209(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption210(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption211(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption212(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption213(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption214(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption215(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption216(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption217(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption218(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption219(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption220(Player player, int index, Npc npc) {}

    // Rick
    public static void npcOption221(Player player, int index, Npc npc) {}

    // Maid
    public static void npcOption223(Player player, int index, Npc npc) {}

    // Cook
    public static void npcOption225(Player player, int index, Npc npc) {}

    // Butler
    public static void npcOption227(Player player, int index, Npc npc) {}

    // Demon butler
    public static void npcOption229(Player player, int index, Npc npc) {}
    /* 256 - 511 */

    // Town crier
    public static void npcOption276(Player player, int index, Npc npc) {}

    // Town crier
    public static void npcOption277(Player player, int index, Npc npc) {}

    // Town crier
    public static void npcOption278(Player player, int index, Npc npc) {}

    // Town crier
    public static void npcOption279(Player player, int index, Npc npc) {}

    // Town crier
    public static void npcOption280(Player player, int index, Npc npc) {}

    // Thordur
    public static void npcOption297(Player player, int index, Npc npc) {}

    // Thordur
    public static void npcOption298(Player player, int index, Npc npc) {}

    // Gunthor the brave
    public static void npcOption299(Player player, int index, Npc npc) {}

    // Black Heather
    public static void npcOption301(Player player, int index, Npc npc) {}

    // Donny the lad
    public static void npcOption302(Player player, int index, Npc npc) {}

    // Speedy Keith
    public static void npcOption303(Player player, int index, Npc npc) {}

    // Witch
    public static void npcOption305(Player player, int index, Npc npc) {}

    // Lumbridge Guide
    public static void npcOption306(Player player, int index, Npc npc) {
        player.openDialogue("guidebook", 0);
    }

    // Dr Jekyll
    public static void npcOption307(Player player, int index, Npc npc) {}

    // Ayesha
    public static void npcOption310(Player player, int index, Npc npc) {}

    // Adam
    public static void npcOption311(Player player, int index, Npc npc) {
        if (index == 0) {
            /*
             * if (player.isGameModeIronman() || player.isGameModeGroupIronman()) {
             * player.openDialogue("ironadam", 0); } else {
             * player.getGameEncoder().sendMessage("Adam has no reason to talk to you btw."); }
             */
        } else if (index == 2) {
            if (player.isGameModeIronman() || player.isGameModeGroupIronman()) {
                player.openShop("ironman");
            } else if (player.isGameModeHardcoreIronman()) {
                player.openShop("hardcore_ironman");
            } else {
                player.getGameEncoder().sendMessage("Adam has no reason to trade you btw.");
            }
        }
    }

    // Frog
    public static void npcOption312(Player player, int index, Npc npc) {}

    // Dr Jekyll
    public static void npcOption314(Player player, int index, Npc npc) {}

    // Emblem Trader
    public static void npcOption315(Player player, int index, Npc npc) {}

    // Emblem Trader
    public static void npcOption316(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("emblemtrader", 0);
        } else if (index == 2) {
            if (Main.isSpawn()) {
                player.openShop("blood_money_spawn");
            } else if (player.isGameModeNormal() || player.isGameModeHard()) {
                player.openShop("blood_money");
            } else {
                player.openShop("blood_money_iron");
            }
        } else if (index == 3) {
            player.getCombat().setShowKDR(!player.getCombat().showKDR());
            player.getGameEncoder().sendMessage("Streaks: " + player.getCombat().showKDR());
        } else if (index == 4) {
            player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
        }
    }

    // Paul
    public static void npcOption317(Player player, int index, Npc npc) {}

    // Dark core
    public static void npcOption318(Player player, int index, Npc npc) {}

    // Drunken Dwarf
    public static void npcOption322(Player player, int index, Npc npc) {}

    // Strange plant
    public static void npcOption323(Player player, int index, Npc npc) {}

    // Genie
    public static void npcOption326(Player player, int index, Npc npc) {}

    // Genie
    public static void npcOption327(Player player, int index, Npc npc) {}

    // Sergeant Damien
    public static void npcOption337(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption342(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption343(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption344(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption345(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption346(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption347(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption349(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption350(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption351(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption352(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption354(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption355(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption356(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption357(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption358(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption359(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption361(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption362(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption363(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption364(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption365(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption366(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption367(Player player, int index, Npc npc) {}

    // Prison Pete
    public static void npcOption368(Player player, int index, Npc npc) {}

    // Balloon Animal
    public static void npcOption369(Player player, int index, Npc npc) {}

    // Balloon Animal
    public static void npcOption370(Player player, int index, Npc npc) {}

    // Balloon Animal
    public static void npcOption371(Player player, int index, Npc npc) {}

    // Freaky Forester
    public static void npcOption372(Player player, int index, Npc npc) {}

    // Rick Turpentine
    public static void npcOption375(Player player, int index, Npc npc) {}

    // Rick Turpentine
    public static void npcOption376(Player player, int index, Npc npc) {}

    // Bee keeper
    public static void npcOption377(Player player, int index, Npc npc) {}

    // Pillory Guard
    public static void npcOption380(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption385(Player player, int index, Npc npc) {}

    // Avan
    public static void npcOption386(Player player, int index, Npc npc) {}

    // Avan
    public static void npcOption387(Player player, int index, Npc npc) {}

    // Dark Core
    public static void npcOption388(Player player, int index, Npc npc) {}

    // Evil Bob
    public static void npcOption390(Player player, int index, Npc npc) {}

    // Evil Bob
    public static void npcOption391(Player player, int index, Npc npc) {}

    // Servant
    public static void npcOption392(Player player, int index, Npc npc) {}

    // Servant
    public static void npcOption393(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption394(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption395(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption396(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption397(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption398(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption399(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption400(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Turael
    public static void npcOption401(Player player, int index, Npc npc) {}

    // Mazchna
    public static void npcOption402(Player player, int index, Npc npc) {}

    // Vannaka
    public static void npcOption403(Player player, int index, Npc npc) {}

    // Chaeldar
    public static void npcOption404(Player player, int index, Npc npc) {}

    // Duradel
    public static void npcOption405(Player player, int index, Npc npc) {}

    // Fungi
    public static void npcOption471(Player player, int index, Npc npc) {}

    // Fungi
    public static void npcOption472(Player player, int index, Npc npc) {}

    // Zygomite
    public static void npcOption473(Player player, int index, Npc npc) {}

    // Zygomite
    public static void npcOption474(Player player, int index, Npc npc) {}

    // Entomologist
    public static void npcOption491(Player player, int index, Npc npc) {}

    // Whirlpool
    public static void npcOption493(Player player, int index, Npc npc) {}

    // Venenatis spiderling
    public static void npcOption495(Player player, int index, Npc npc) {}

    // Whirlpool
    public static void npcOption496(Player player, int index, Npc npc) {}

    // Callisto cub
    public static void npcOption497(Player player, int index, Npc npc) {}

    // Olivia
    public static void npcOption500(Player player, int index, Npc npc) {}

    // Sarah
    public static void npcOption501(Player player, int index, Npc npc) {
        player.openShop("skilling");
    }

    // Vanessa
    public static void npcOption502(Player player, int index, Npc npc) {}

    // Richard
    public static void npcOption503(Player player, int index, Npc npc) {}

    // Alice
    public static void npcOption504(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption505(Player player, int index, Npc npc) {}

    // Shop keeper
    public static void npcOption506(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("supplies_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "supplies" : "supplies_iron");
        }
    }

    // Shop assistant
    public static void npcOption507(Player player, int index, Npc npc) {}

    // Shop keeper
    public static void npcOption508(Player player, int index, Npc npc) {}

    // Shop assistant
    public static void npcOption509(Player player, int index, Npc npc) {}

    // Shop keeper
    public static void npcOption510(Player player, int index, Npc npc) {}

    // Shop assistant
    public static void npcOption511(Player player, int index, Npc npc) {}
    /* 512 - 767 */

    // Shop keeper
    public static void npcOption512(Player player, int index, Npc npc) {}

    // Shop assistant
    public static void npcOption513(Player player, int index, Npc npc) {}

    // Shop keeper
    public static void npcOption514(Player player, int index, Npc npc) {}

    // Shop assistant
    public static void npcOption515(Player player, int index, Npc npc) {}

    // Shop keeper
    public static void npcOption516(Player player, int index, Npc npc) {}

    // Shop assistant
    public static void npcOption517(Player player, int index, Npc npc) {}

    // Shop keeper
    public static void npcOption518(Player player, int index, Npc npc) {}

    // Shop assistant
    public static void npcOption519(Player player, int index, Npc npc) {}

    // Fairy shop keeper
    public static void npcOption520(Player player, int index, Npc npc) {}

    // Fairy shop assistant
    public static void npcOption521(Player player, int index, Npc npc) {}

    // Valaine
    public static void npcOption522(Player player, int index, Npc npc) {}

    // Scavvo
    public static void npcOption523(Player player, int index, Npc npc) {}

    // Peksa
    public static void npcOption524(Player player, int index, Npc npc) {}

    // Silk trader
    public static void npcOption525(Player player, int index, Npc npc) {}

    // Gem trader
    public static void npcOption526(Player player, int index, Npc npc) {}

    // Zeke
    public static void npcOption527(Player player, int index, Npc npc) {}

    // Louie Legs
    public static void npcOption528(Player player, int index, Npc npc) {}

    // Karim
    public static void npcOption529(Player player, int index, Npc npc) {}

    // Ranael
    public static void npcOption530(Player player, int index, Npc npc) {}

    // Dommik
    public static void npcOption531(Player player, int index, Npc npc) {}

    // Zaff
    public static void npcOption532(Player player, int index, Npc npc) {}

    // Baraek
    public static void npcOption533(Player player, int index, Npc npc) {}

    // Thessalia
    public static void npcOption534(Player player, int index, Npc npc) {}

    // Horvik
    public static void npcOption535(Player player, int index, Npc npc) {}

    // Lowe
    public static void npcOption536(Player player, int index, Npc npc) {}

    // Shop keeper
    public static void npcOption537(Player player, int index, Npc npc) {}

    // Shop assistant
    public static void npcOption538(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption542(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption543(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption544(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption545(Player player, int index, Npc npc) {}

    // Mi-Gor
    public static void npcOption547(Player player, int index, Npc npc) {}

    // Brother Tranquility
    public static void npcOption550(Player player, int index, Npc npc) {}

    // Brother Tranquility
    public static void npcOption551(Player player, int index, Npc npc) {}

    // Brother Tranquility
    public static void npcOption552(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption553(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption554(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption555(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption556(Player player, int index, Npc npc) {}

    // Zombie monk
    public static void npcOption557(Player player, int index, Npc npc) {}

    // Zombie monk
    public static void npcOption558(Player player, int index, Npc npc) {}

    // Zombie monk
    public static void npcOption559(Player player, int index, Npc npc) {}

    // Zombie monk
    public static void npcOption560(Player player, int index, Npc npc) {}

    // Pirate Pete
    public static void npcOption601(Player player, int index, Npc npc) {}

    // Pirate Pete
    public static void npcOption602(Player player, int index, Npc npc) {}

    // Captain Braindeath
    public static void npcOption603(Player player, int index, Npc npc) {}

    // 50% Luke
    public static void npcOption604(Player player, int index, Npc npc) {}

    // Davey
    public static void npcOption605(Player player, int index, Npc npc) {}

    // Captain Donnie
    public static void npcOption606(Player player, int index, Npc npc) {}

    // Zombie protester
    public static void npcOption607(Player player, int index, Npc npc) {}

    // Zombie protester
    public static void npcOption608(Player player, int index, Npc npc) {}

    // Zombie protester
    public static void npcOption609(Player player, int index, Npc npc) {}

    // Zombie protester
    public static void npcOption610(Player player, int index, Npc npc) {}

    // Zombie protester
    public static void npcOption611(Player player, int index, Npc npc) {}

    // Zombie protester
    public static void npcOption612(Player player, int index, Npc npc) {}

    // Zombie swab
    public static void npcOption619(Player player, int index, Npc npc) {}

    // Zombie swab
    public static void npcOption620(Player player, int index, Npc npc) {}

    // Zombie swab
    public static void npcOption621(Player player, int index, Npc npc) {}

    // Zombie swab
    public static void npcOption622(Player player, int index, Npc npc) {}

    // Zombie swab
    public static void npcOption623(Player player, int index, Npc npc) {}

    // Zombie swab
    public static void npcOption624(Player player, int index, Npc npc) {}

    // Brewer
    public static void npcOption627(Player player, int index, Npc npc) {}

    // Brewer
    public static void npcOption628(Player player, int index, Npc npc) {}

    // Brewer
    public static void npcOption629(Player player, int index, Npc npc) {}

    // Brewer
    public static void npcOption630(Player player, int index, Npc npc) {}

    // Brewer
    public static void npcOption631(Player player, int index, Npc npc) {}

    // Brewer
    public static void npcOption632(Player player, int index, Npc npc) {}

    // Brewer
    public static void npcOption633(Player player, int index, Npc npc) {}

    // Brewer
    public static void npcOption634(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption635(Player player, int index, Npc npc) {}

    // Aubury
    public static void npcOption637(Player player, int index, Npc npc) {}

    // Elf Tracker
    public static void npcOption638(Player player, int index, Npc npc) {}

    // Ug
    public static void npcOption640(Player player, int index, Npc npc) {}

    // Aga
    public static void npcOption641(Player player, int index, Npc npc) {}

    // Arrg
    public static void npcOption642(Player player, int index, Npc npc) {}

    // Ug
    public static void npcOption644(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption655(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption656(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption657(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption658(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption659(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption660(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption661(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption662(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption663(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption664(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption665(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption666(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption667(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption668(Player player, int index, Npc npc) {}

    // General Bentnoze
    public static void npcOption669(Player player, int index, Npc npc) {}

    // General Wartface
    public static void npcOption670(Player player, int index, Npc npc) {}

    // Grubfoot
    public static void npcOption671(Player player, int index, Npc npc) {}

    // Grubfoot
    public static void npcOption672(Player player, int index, Npc npc) {}

    // Grubfoot
    public static void npcOption673(Player player, int index, Npc npc) {}

    // General Bentnoze
    public static void npcOption675(Player player, int index, Npc npc) {}

    // General Wartface
    public static void npcOption676(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption677(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption678(Player player, int index, Npc npc) {}

    // Rasolo
    public static void npcOption679(Player player, int index, Npc npc) {}

    // Archaeologist
    public static void npcOption684(Player player, int index, Npc npc) {}

    // Malak
    public static void npcOption686(Player player, int index, Npc npc) {}

    // Bartender
    public static void npcOption687(Player player, int index, Npc npc) {}

    // Eblis
    public static void npcOption688(Player player, int index, Npc npc) {}

    // Eblis
    public static void npcOption689(Player player, int index, Npc npc) {}

    // Bandit
    public static void npcOption690(Player player, int index, Npc npc) {}

    // Bandit
    public static void npcOption691(Player player, int index, Npc npc) {}

    // Bandit
    public static void npcOption692(Player player, int index, Npc npc) {}

    // Bandit
    public static void npcOption693(Player player, int index, Npc npc) {}

    // Bandit
    public static void npcOption694(Player player, int index, Npc npc) {}

    // Bandit
    public static void npcOption695(Player player, int index, Npc npc) {}

    // Troll child
    public static void npcOption696(Player player, int index, Npc npc) {}

    // Troll child
    public static void npcOption697(Player player, int index, Npc npc) {}

    // Ice troll
    public static void npcOption698(Player player, int index, Npc npc) {}

    // Ice block
    public static void npcOption706(Player player, int index, Npc npc) {}

    // Ice block
    public static void npcOption707(Player player, int index, Npc npc) {}

    // Troll father
    public static void npcOption708(Player player, int index, Npc npc) {}

    // Troll mother
    public static void npcOption709(Player player, int index, Npc npc) {}

    // Azzanadra
    public static void npcOption730(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption731(Player player, int index, Npc npc) {}

    // Fred the Farmer
    public static void npcOption732(Player player, int index, Npc npc) {}

    // Bandit Leader
    public static void npcOption733(Player player, int index, Npc npc) {}

    // Bandit
    public static void npcOption734(Player player, int index, Npc npc) {}

    // Bandit
    public static void npcOption735(Player player, int index, Npc npc) {}

    // Bandit
    public static void npcOption736(Player player, int index, Npc npc) {}

    // Bandit
    public static void npcOption737(Player player, int index, Npc npc) {}

    // Cowardly Bandit
    public static void npcOption739(Player player, int index, Npc npc) {}

    // My Arm
    public static void npcOption740(Player player, int index, Npc npc) {}

    // My Arm
    public static void npcOption742(Player player, int index, Npc npc) {}

    // Captain Barnaby
    public static void npcOption754(Player player, int index, Npc npc) {}

    // Tool Leprechaun
    public static void npcOption757(Player player, int index, Npc npc) {}

    // Drunken dwarf's leg
    public static void npcOption760(Player player, int index, Npc npc) {}

    // Queen Sigrid
    public static void npcOption765(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption766(Player player, int index, Npc npc) {}

    // Arnor
    public static void npcOption767(Player player, int index, Npc npc) {}
    /* 768 - 1023 */

    // Haming
    public static void npcOption768(Player player, int index, Npc npc) {}

    // Moldof
    public static void npcOption769(Player player, int index, Npc npc) {}

    // Helga
    public static void npcOption770(Player player, int index, Npc npc) {}

    // Matilda
    public static void npcOption771(Player player, int index, Npc npc) {}

    // Ashild
    public static void npcOption772(Player player, int index, Npc npc) {}

    // Skraeling
    public static void npcOption773(Player player, int index, Npc npc) {}

    // Skraeling
    public static void npcOption774(Player player, int index, Npc npc) {}

    // Fishmonger
    public static void npcOption775(Player player, int index, Npc npc) {}

    // Greengrocer
    public static void npcOption776(Player player, int index, Npc npc) {}

    // Ethereal Man
    public static void npcOption777(Player player, int index, Npc npc) {}

    // Ethereal Lady
    public static void npcOption778(Player player, int index, Npc npc) {}

    // Ethereal Numerator
    public static void npcOption779(Player player, int index, Npc npc) {}

    // Ethereal Expert
    public static void npcOption780(Player player, int index, Npc npc) {}

    // Ethereal Perceptive
    public static void npcOption781(Player player, int index, Npc npc) {}

    // Ethereal Guide
    public static void npcOption782(Player player, int index, Npc npc) {}

    // Ethereal Fluke
    public static void npcOption783(Player player, int index, Npc npc) {}

    // Ethereal Mimic
    public static void npcOption784(Player player, int index, Npc npc) {}

    // Olaf the Bard
    public static void npcOption802(Player player, int index, Npc npc) {}

    // Lalli
    public static void npcOption803(Player player, int index, Npc npc) {}

    // Fossegrimen
    public static void npcOption808(Player player, int index, Npc npc) {}

    // Ospak
    public static void npcOption809(Player player, int index, Npc npc) {}

    // Styrmir
    public static void npcOption810(Player player, int index, Npc npc) {}

    // Torbrund
    public static void npcOption811(Player player, int index, Npc npc) {}

    // Fridgeir
    public static void npcOption812(Player player, int index, Npc npc) {}

    // Longhall Bouncer
    public static void npcOption813(Player player, int index, Npc npc) {}

    // Guildmaster
    public static void npcOption814(Player player, int index, Npc npc) {
        player.openDialogue("dragonslayer", 0);
    }

    // Duke Horacio
    public static void npcOption815(Player player, int index, Npc npc) {}

    // Klarense
    public static void npcOption819(Player player, int index, Npc npc) {}

    // Wormbrain
    public static void npcOption820(Player player, int index, Npc npc) {}

    // Oracle
    public static void npcOption821(Player player, int index, Npc npc) {}

    // Oziach
    public static void npcOption822(Player player, int index, Npc npc) {
        player.openShop("skill_exchange");
    }

    // Cabin boy Jenkins
    public static void npcOption825(Player player, int index, Npc npc) {}

    // Larry
    public static void npcOption827(Player player, int index, Npc npc) {}

    // Larry
    public static void npcOption828(Player player, int index, Npc npc) {}

    // Larry
    public static void npcOption829(Player player, int index, Npc npc) {}

    // Penguin
    public static void npcOption831(Player player, int index, Npc npc) {}

    // Ping
    public static void npcOption839(Player player, int index, Npc npc) {}

    // Pong
    public static void npcOption840(Player player, int index, Npc npc) {}

    // KGP Agent
    public static void npcOption841(Player player, int index, Npc npc) {}

    // KGP Agent
    public static void npcOption842(Player player, int index, Npc npc) {}

    // Noodle
    public static void npcOption844(Player player, int index, Npc npc) {}

    // Penguin
    public static void npcOption845(Player player, int index, Npc npc) {}

    // Penguin suit
    public static void npcOption846(Player player, int index, Npc npc) {}

    // Agility Instructor
    public static void npcOption847(Player player, int index, Npc npc) {}

    // Army Commander
    public static void npcOption848(Player player, int index, Npc npc) {}

    // Grish
    public static void npcOption860(Player player, int index, Npc npc) {}

    // Uglug Nar
    public static void npcOption861(Player player, int index, Npc npc) {}

    // Pilg
    public static void npcOption862(Player player, int index, Npc npc) {}

    // Grug
    public static void npcOption863(Player player, int index, Npc npc) {}

    // Ogre guard
    public static void npcOption864(Player player, int index, Npc npc) {}

    // Ogre guard
    public static void npcOption865(Player player, int index, Npc npc) {}

    // Zombie
    public static void npcOption880(Player player, int index, Npc npc) {}

    // Zavistic Rarve
    public static void npcOption881(Player player, int index, Npc npc) {}

    // Gargh
    public static void npcOption885(Player player, int index, Npc npc) {}

    // Scarg
    public static void npcOption886(Player player, int index, Npc npc) {}

    // Gruh
    public static void npcOption887(Player player, int index, Npc npc) {}

    // Irwin Feaselbaum
    public static void npcOption888(Player player, int index, Npc npc) {}

    // Eluned
    public static void npcOption889(Player player, int index, Npc npc) {}

    // Islwyn
    public static void npcOption890(Player player, int index, Npc npc) {}

    // Golrie
    public static void npcOption892(Player player, int index, Npc npc) {}

    // Father Reen
    public static void npcOption893(Player player, int index, Npc npc) {}

    // Father Reen
    public static void npcOption894(Player player, int index, Npc npc) {}

    // Father Badden
    public static void npcOption895(Player player, int index, Npc npc) {}

    // Father Badden
    public static void npcOption896(Player player, int index, Npc npc) {}

    // Denath
    public static void npcOption897(Player player, int index, Npc npc) {}

    // Denath
    public static void npcOption898(Player player, int index, Npc npc) {}

    // Eric
    public static void npcOption899(Player player, int index, Npc npc) {}

    // Eric
    public static void npcOption900(Player player, int index, Npc npc) {}

    // Evil Dave
    public static void npcOption901(Player player, int index, Npc npc) {}

    // Evil Dave
    public static void npcOption902(Player player, int index, Npc npc) {}

    // Matthew
    public static void npcOption903(Player player, int index, Npc npc) {}

    // Matthew
    public static void npcOption904(Player player, int index, Npc npc) {}

    // Jennifer
    public static void npcOption905(Player player, int index, Npc npc) {}

    // Jennifer
    public static void npcOption906(Player player, int index, Npc npc) {}

    // Tanya
    public static void npcOption907(Player player, int index, Npc npc) {}

    // Tanya
    public static void npcOption908(Player player, int index, Npc npc) {}

    // Patrick
    public static void npcOption909(Player player, int index, Npc npc) {}

    // Patrick
    public static void npcOption910(Player player, int index, Npc npc) {}

    // Clay golem
    public static void npcOption917(Player player, int index, Npc npc) {}

    // Clay golem
    public static void npcOption918(Player player, int index, Npc npc) {}

    // Father Aereck
    public static void npcOption921(Player player, int index, Npc npc) {}

    // Restless ghost
    public static void npcOption922(Player player, int index, Npc npc) {}

    // Father Urhney
    public static void npcOption923(Player player, int index, Npc npc) {}

    // Filliman Tarlock
    public static void npcOption943(Player player, int index, Npc npc) {}

    // Nature Spirit
    public static void npcOption944(Player player, int index, Npc npc) {}

    // Ulizius
    public static void npcOption947(Player player, int index, Npc npc) {}

    // Klenter
    public static void npcOption948(Player player, int index, Npc npc) {}

    // Weird Old Man
    public static void npcOption954(Player player, int index, Npc npc) {}

    // Hellpuppy
    public static void npcOption964(Player player, int index, Npc npc) {}

    // Anna
    public static void npcOption967(Player player, int index, Npc npc) {}

    // David
    public static void npcOption968(Player player, int index, Npc npc) {}

    // Anna
    public static void npcOption969(Player player, int index, Npc npc) {}

    // Veliaf Hurtz
    public static void npcOption989(Player player, int index, Npc npc) {}

    // Nardok
    public static void npcOption996(Player player, int index, Npc npc) {}

    // Dartog
    public static void npcOption997(Player player, int index, Npc npc) {}

    // Gertrude's cat
    public static void npcOption1010(Player player, int index, Npc npc) {}

    // Gambler
    public static void npcOption1011(Player player, int index, Npc npc) {}

    // Gambler
    public static void npcOption1012(Player player, int index, Npc npc) {}

    // Barman
    public static void npcOption1013(Player player, int index, Npc npc) {}

    // Gambler
    public static void npcOption1014(Player player, int index, Npc npc) {}

    // Gambler
    public static void npcOption1015(Player player, int index, Npc npc) {}

    // Gambler
    public static void npcOption1016(Player player, int index, Npc npc) {}

    // Gambler
    public static void npcOption1017(Player player, int index, Npc npc) {}

    // Gambler
    public static void npcOption1018(Player player, int index, Npc npc) {}

    // Gambler
    public static void npcOption1019(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption1020(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption1021(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption1022(Player player, int index, Npc npc) {}

    // Fancy dress shop owner
    public static void npcOption1023(Player player, int index, Npc npc) {}
    /* 1024 - 1279 */

    // Shop keeper
    public static void npcOption1024(Player player, int index, Npc npc) {}

    // Grum
    public static void npcOption1025(Player player, int index, Npc npc) {}

    // Wydin
    public static void npcOption1026(Player player, int index, Npc npc) {}

    // Gerrant
    public static void npcOption1027(Player player, int index, Npc npc) {}

    // Brian
    public static void npcOption1028(Player player, int index, Npc npc) {}

    // Jiminua
    public static void npcOption1029(Player player, int index, Npc npc) {}

    // Shop keeper
    public static void npcOption1030(Player player, int index, Npc npc) {}

    // Candle maker
    public static void npcOption1031(Player player, int index, Npc npc) {}

    // Arhein
    public static void npcOption1032(Player player, int index, Npc npc) {}

    // Jukat
    public static void npcOption1033(Player player, int index, Npc npc) {}

    // Lunderwin
    public static void npcOption1034(Player player, int index, Npc npc) {}

    // Irksol
    public static void npcOption1035(Player player, int index, Npc npc) {}

    // Fairy
    public static void npcOption1036(Player player, int index, Npc npc) {}

    // Zambo
    public static void npcOption1037(Player player, int index, Npc npc) {}

    // Silver merchant
    public static void npcOption1038(Player player, int index, Npc npc) {}

    // Gem merchant
    public static void npcOption1039(Player player, int index, Npc npc) {}

    // Baker
    public static void npcOption1040(Player player, int index, Npc npc) {}

    // Spice seller
    public static void npcOption1041(Player player, int index, Npc npc) {}

    // Fur trader
    public static void npcOption1042(Player player, int index, Npc npc) {}

    // Silk merchant
    public static void npcOption1043(Player player, int index, Npc npc) {}

    // Hickton
    public static void npcOption1044(Player player, int index, Npc npc) {}

    // Harry
    public static void npcOption1045(Player player, int index, Npc npc) {}

    // Cassie
    public static void npcOption1046(Player player, int index, Npc npc) {}

    // Frincos
    public static void npcOption1047(Player player, int index, Npc npc) {}

    // Drogo dwarf
    public static void npcOption1048(Player player, int index, Npc npc) {}

    // Flynn
    public static void npcOption1049(Player player, int index, Npc npc) {}

    // Wayne
    public static void npcOption1050(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption1051(Player player, int index, Npc npc) {}

    // Betty
    public static void npcOption1052(Player player, int index, Npc npc) {}

    // Herquin
    public static void npcOption1053(Player player, int index, Npc npc) {}

    // Launa
    public static void npcOption1054(Player player, int index, Npc npc) {}

    // Launa
    public static void npcOption1055(Player player, int index, Npc npc) {}

    // Brana
    public static void npcOption1056(Player player, int index, Npc npc) {}

    // Tolna
    public static void npcOption1057(Player player, int index, Npc npc) {}

    // Tolna
    public static void npcOption1058(Player player, int index, Npc npc) {}

    // Runa
    public static void npcOption1078(Player player, int index, Npc npc) {}

    // Halla
    public static void npcOption1079(Player player, int index, Npc npc) {}

    // Finn
    public static void npcOption1080(Player player, int index, Npc npc) {}

    // Osvald
    public static void npcOption1081(Player player, int index, Npc npc) {}

    // Runolf
    public static void npcOption1082(Player player, int index, Npc npc) {}

    // Tjorvi
    public static void npcOption1083(Player player, int index, Npc npc) {}

    // Ingrid
    public static void npcOption1084(Player player, int index, Npc npc) {}

    // Thora
    public static void npcOption1085(Player player, int index, Npc npc) {}

    // Signy
    public static void npcOption1086(Player player, int index, Npc npc) {}

    // Hild
    public static void npcOption1087(Player player, int index, Npc npc) {}

    // Armod
    public static void npcOption1088(Player player, int index, Npc npc) {}

    // Beigarth
    public static void npcOption1089(Player player, int index, Npc npc) {}

    // Reinn
    public static void npcOption1090(Player player, int index, Npc npc) {}

    // Alviss
    public static void npcOption1091(Player player, int index, Npc npc) {}

    // Fullangr
    public static void npcOption1092(Player player, int index, Npc npc) {}

    // Jari
    public static void npcOption1093(Player player, int index, Npc npc) {}

    // Thorodin
    public static void npcOption1094(Player player, int index, Npc npc) {}

    // Ferd
    public static void npcOption1095(Player player, int index, Npc npc) {}

    // Donal
    public static void npcOption1096(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1099(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1100(Player player, int index, Npc npc) {}

    // Elena
    public static void npcOption1102(Player player, int index, Npc npc) {}

    // Da Vinci
    public static void npcOption1103(Player player, int index, Npc npc) {}

    // Da Vinci
    public static void npcOption1104(Player player, int index, Npc npc) {}

    // Chancy
    public static void npcOption1105(Player player, int index, Npc npc) {}

    // Chancy
    public static void npcOption1106(Player player, int index, Npc npc) {}

    // Hops
    public static void npcOption1107(Player player, int index, Npc npc) {}

    // Hops
    public static void npcOption1108(Player player, int index, Npc npc) {}

    // Guidor's wife
    public static void npcOption1109(Player player, int index, Npc npc) {}

    // Guidor
    public static void npcOption1110(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1111(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1112(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1113(Player player, int index, Npc npc) {}

    // Mourner
    public static void npcOption1114(Player player, int index, Npc npc) {}

    // Mourner
    public static void npcOption1115(Player player, int index, Npc npc) {}

    // Kilron
    public static void npcOption1116(Player player, int index, Npc npc) {}

    // Omart
    public static void npcOption1117(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption1118(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption1119(Player player, int index, Npc npc) {}

    // Dominic Onion
    public static void npcOption1120(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption1130(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption1131(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption1132(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption1133(Player player, int index, Npc npc) {}

    // Priest
    public static void npcOption1137(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption1139(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption1140(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption1141(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption1142(Player player, int index, Npc npc) {}

    // King Lathas
    public static void npcOption1143(Player player, int index, Npc npc) {}

    // Jerico
    public static void npcOption1145(Player player, int index, Npc npc) {}

    // Chemist
    public static void npcOption1146(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1147(Player player, int index, Npc npc) {}

    // Mourner
    public static void npcOption1148(Player player, int index, Npc npc) {}

    // Mourner
    public static void npcOption1149(Player player, int index, Npc npc) {}

    // Mourner
    public static void npcOption1150(Player player, int index, Npc npc) {}

    // Mourner
    public static void npcOption1151(Player player, int index, Npc npc) {}

    // Nurse Sarah
    public static void npcOption1152(Player player, int index, Npc npc) {}

    // Archer
    public static void npcOption1157(Player player, int index, Npc npc) {}

    // Warrior
    public static void npcOption1158(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption1159(Player player, int index, Npc npc) {}

    // Wizard
    public static void npcOption1160(Player player, int index, Npc npc) {}

    // Fairy Queen
    public static void npcOption1161(Player player, int index, Npc npc) {}

    // Shamus
    public static void npcOption1162(Player player, int index, Npc npc) {}

    // Cave monk
    public static void npcOption1164(Player player, int index, Npc npc) {}

    // Monk of Entrana
    public static void npcOption1165(Player player, int index, Npc npc) {
        player.openDialogue("lostcity", 0);
    }

    // Monk of Entrana
    public static void npcOption1166(Player player, int index, Npc npc) {
        for (int i = 0; i < player.getInventory().size(); i++) {
            int itemID = player.getInventory().getID(i);
            if (itemID == -1 || ItemDef.getEquipSlot(itemID) == null) {
                continue;
            }
            boolean isAllowed = ItemDef.getName(itemID).contains("arrow") || itemID == 3840 || itemID == 3842
                    || itemID == 3844 || itemID == 12608 || itemID == 12610 || itemID == 12612;
            if (isAllowed) {
                continue;
            }
            player.getGameEncoder().sendMessage("You can't take " + ItemDef.getName(itemID) + " to Entrana.");
            return;
        }
        for (int i = 0; i < player.getEquipment().size(); i++) {
            int itemID = player.getEquipment().getID(i);
            if (itemID == -1 || ItemDef.getEquipSlot(itemID) == null) {
                continue;
            }
            boolean isAllowed = ItemDef.getName(itemID).contains("arrow") || itemID == 3840 || itemID == 3842
                    || itemID == 3844 || itemID == 12608 || itemID == 12610 || itemID == 12612;
            if (isAllowed) {
                continue;
            }
            player.getGameEncoder().sendMessage("You can't take " + ItemDef.getName(itemID) + " to Entrana.");
            return;
        }
        player.getMovement().teleport(2834, 3335);
    }

    // Monk of Entrana
    public static void npcOption1167(Player player, int index, Npc npc) {
        for (int i = 0; i < player.getInventory().size(); i++) {
            int itemID = player.getInventory().getID(i);
            if (itemID == -1 || ItemDef.getEquipSlot(itemID) == null) {
                continue;
            }
            boolean isAllowed = ItemDef.getName(itemID).contains("arrow") || itemID == 3840 || itemID == 3842
                    || itemID == 3844 || itemID == 12608 || itemID == 12610 || itemID == 12612;
            if (isAllowed) {
                continue;
            }
            player.getGameEncoder().sendMessage("You can't take " + ItemDef.getName(itemID) + " to Entrana.");
            return;
        }
        for (int i = 0; i < player.getEquipment().size(); i++) {
            int itemID = player.getEquipment().getID(i);
            if (itemID == -1 || ItemDef.getEquipSlot(itemID) == null) {
                continue;
            }
            boolean isAllowed = ItemDef.getName(itemID).contains("arrow") || itemID == 3840 || itemID == 3842
                    || itemID == 3844 || itemID == 12608 || itemID == 12610 || itemID == 12612;
            if (isAllowed) {
                continue;
            }
            player.getGameEncoder().sendMessage("You can't take " + ItemDef.getName(itemID) + " to Entrana.");
            return;
        }
        player.getMovement().teleport(2834, 3335);
    }

    // Monk of Entrana
    public static void npcOption1168(Player player, int index, Npc npc) {}

    // Monk of Entrana
    public static void npcOption1169(Player player, int index, Npc npc) {}

    // Monk of Entrana
    public static void npcOption1170(Player player, int index, Npc npc) {}

    // Rommik
    public static void npcOption1172(Player player, int index, Npc npc) {}

    // Gaius
    public static void npcOption1173(Player player, int index, Npc npc) {}

    // Jatix
    public static void npcOption1174(Player player, int index, Npc npc) {}

    // Davon
    public static void npcOption1175(Player player, int index, Npc npc) {}

    // Zenesha
    public static void npcOption1176(Player player, int index, Npc npc) {}

    // Aemad
    public static void npcOption1177(Player player, int index, Npc npc) {}

    // Kortan
    public static void npcOption1178(Player player, int index, Npc npc) {}

    // Lumbridge Guide
    public static void npcOption1179(Player player, int index, Npc npc) {}

    // Lumbridge Guide
    public static void npcOption1181(Player player, int index, Npc npc) {}

    // General Wartface
    public static void npcOption1192(Player player, int index, Npc npc) {}

    // General Bentnoze
    public static void npcOption1193(Player player, int index, Npc npc) {}

    // General Wartface
    public static void npcOption1195(Player player, int index, Npc npc) {}

    // General Bentnoze
    public static void npcOption1197(Player player, int index, Npc npc) {}

    // Ceril Carnillean
    public static void npcOption1198(Player player, int index, Npc npc) {}

    // Claus the chef
    public static void npcOption1199(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1200(Player player, int index, Npc npc) {}

    // Philipe Carnillean
    public static void npcOption1201(Player player, int index, Npc npc) {}

    // Henryeta Carnillean
    public static void npcOption1202(Player player, int index, Npc npc) {}

    // Butler Jones
    public static void npcOption1203(Player player, int index, Npc npc) {}

    // Alomone
    public static void npcOption1204(Player player, int index, Npc npc) {}

    // Hazeel
    public static void npcOption1205(Player player, int index, Npc npc) {}

    // Clivet
    public static void npcOption1206(Player player, int index, Npc npc) {}

    // Hazeel Cultist
    public static void npcOption1207(Player player, int index, Npc npc) {}

    // Khazard Guard
    public static void npcOption1208(Player player, int index, Npc npc) {}

    // Khazard Guard
    public static void npcOption1209(Player player, int index, Npc npc) {}

    // Khazard Guard
    public static void npcOption1210(Player player, int index, Npc npc) {}

    // Khazard Guard
    public static void npcOption1211(Player player, int index, Npc npc) {}

    // General Khazard
    public static void npcOption1213(Player player, int index, Npc npc) {}

    // Khazard barman
    public static void npcOption1214(Player player, int index, Npc npc) {}

    // Kelvin
    public static void npcOption1215(Player player, int index, Npc npc) {}

    // Joe
    public static void npcOption1216(Player player, int index, Npc npc) {}

    // Fightslave
    public static void npcOption1217(Player player, int index, Npc npc) {}

    // Hengrad
    public static void npcOption1218(Player player, int index, Npc npc) {}

    // Lady Servil
    public static void npcOption1219(Player player, int index, Npc npc) {}

    // Jeremy Servil
    public static void npcOption1220(Player player, int index, Npc npc) {}

    // Jeremy Servil
    public static void npcOption1221(Player player, int index, Npc npc) {}

    // Justin Servil
    public static void npcOption1222(Player player, int index, Npc npc) {}

    // Local
    public static void npcOption1223(Player player, int index, Npc npc) {}

    // Arzinian Being of Bordanzan
    public static void npcOption1236(Player player, int index, Npc npc) {}

    // Gnome shop keeper
    public static void npcOption1238(Player player, int index, Npc npc) {}

    // Odd Old Man
    public static void npcOption1259(Player player, int index, Npc npc) {}

    // Fortunato
    public static void npcOption1260(Player player, int index, Npc npc) {}

    // Dr Fenkenstrain
    public static void npcOption1269(Player player, int index, Npc npc) {}

    // Fenkenstrain's Monster
    public static void npcOption1270(Player player, int index, Npc npc) {}

    // Lord Rologarth
    public static void npcOption1271(Player player, int index, Npc npc) {}

    // Gardener Ghost
    public static void npcOption1272(Player player, int index, Npc npc) {}
    /* 1280 - 1535 */

    // Afflicted(Ulsquire)
    public static void npcOption1287(Player player, int index, Npc npc) {}

    // Ulsquire Shauncy
    public static void npcOption1288(Player player, int index, Npc npc) {}

    // Afflicted(Razmire)
    public static void npcOption1289(Player player, int index, Npc npc) {}

    // Razmire Keelgan
    public static void npcOption1290(Player player, int index, Npc npc) {}

    // Mort'ton Local
    public static void npcOption1291(Player player, int index, Npc npc) {}

    // Mort'ton Local
    public static void npcOption1292(Player player, int index, Npc npc) {}

    // Afflicted
    public static void npcOption1293(Player player, int index, Npc npc) {}

    // Afflicted
    public static void npcOption1294(Player player, int index, Npc npc) {}

    // Mort'ton local
    public static void npcOption1295(Player player, int index, Npc npc) {}

    // Mort'ton local
    public static void npcOption1296(Player player, int index, Npc npc) {}

    // Afflicted
    public static void npcOption1297(Player player, int index, Npc npc) {}

    // Afflicted
    public static void npcOption1298(Player player, int index, Npc npc) {}

    // Roachey
    public static void npcOption1299(Player player, int index, Npc npc) {}

    // Frenita
    public static void npcOption1300(Player player, int index, Npc npc) {}

    // Nurmof
    public static void npcOption1301(Player player, int index, Npc npc) {}

    // Tea seller
    public static void npcOption1302(Player player, int index, Npc npc) {}

    // Fat Tony
    public static void npcOption1303(Player player, int index, Npc npc) {}

    // Noterazzo
    public static void npcOption1304(Player player, int index, Npc npc) {}

    // Hairdresser
    public static void npcOption1305(Player player, int index, Npc npc) {}

    // Make-over mage
    public static void npcOption1306(Player player, int index, Npc npc) {
        player.getWidgetManager().sendInteractiveOverlay(WidgetID.CHARACTER_DESIGN);
    }

    // Make-over mage
    public static void npcOption1307(Player player, int index, Npc npc) {}

    // Diango
    public static void npcOption1308(Player player, int index, Npc npc) {}

    // Brian
    public static void npcOption1309(Player player, int index, Npc npc) {}

    // Bartender
    public static void npcOption1310(Player player, int index, Npc npc) {}

    // Bartender
    public static void npcOption1311(Player player, int index, Npc npc) {}

    // Bartender
    public static void npcOption1312(Player player, int index, Npc npc) {}

    // Bartender
    public static void npcOption1313(Player player, int index, Npc npc) {}

    // Bartender
    public static void npcOption1314(Player player, int index, Npc npc) {}

    // Emily
    public static void npcOption1315(Player player, int index, Npc npc) {}

    // Kaylee
    public static void npcOption1316(Player player, int index, Npc npc) {}

    // Tina
    public static void npcOption1317(Player player, int index, Npc npc) {}

    // Bartender
    public static void npcOption1318(Player player, int index, Npc npc) {}

    // Bartender
    public static void npcOption1319(Player player, int index, Npc npc) {}

    // Bartender
    public static void npcOption1320(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1321(Player player, int index, Npc npc) {}

    // Tarquin
    public static void npcOption1323(Player player, int index, Npc npc) {}

    // Sigurd
    public static void npcOption1324(Player player, int index, Npc npc) {}

    // Hari
    public static void npcOption1325(Player player, int index, Npc npc) {}

    // Barfy Bill
    public static void npcOption1326(Player player, int index, Npc npc) {}

    // Tyras guard
    public static void npcOption1327(Player player, int index, Npc npc) {}

    // Trader Stan
    public static void npcOption1328(Player player, int index, Npc npc) {}

    // Trader Crewmember
    public static void npcOption1329(Player player, int index, Npc npc) {}

    // Trader Crewmember
    public static void npcOption1330(Player player, int index, Npc npc) {}

    // Trader Crewmember
    public static void npcOption1331(Player player, int index, Npc npc) {}

    // Trader Crewmember
    public static void npcOption1332(Player player, int index, Npc npc) {}

    // Trader Crewmember
    public static void npcOption1333(Player player, int index, Npc npc) {}

    // Trader Crewmember
    public static void npcOption1334(Player player, int index, Npc npc) {}

    // Jack Seagull
    public static void npcOption1335(Player player, int index, Npc npc) {}

    // Longbow Ben
    public static void npcOption1336(Player player, int index, Npc npc) {}

    // Ahab
    public static void npcOption1337(Player player, int index, Npc npc) {}

    // Matthias
    public static void npcOption1340(Player player, int index, Npc npc) {}

    // Matthias
    public static void npcOption1341(Player player, int index, Npc npc) {}

    // Gyr Falcon
    public static void npcOption1342(Player player, int index, Npc npc) {}

    // Gyr Falcon
    public static void npcOption1343(Player player, int index, Npc npc) {}

    // Gyr Falcon
    public static void npcOption1344(Player player, int index, Npc npc) {}

    // Prickly kebbit
    public static void npcOption1346(Player player, int index, Npc npc) {}

    // Sabre-toothed kebbit
    public static void npcOption1347(Player player, int index, Npc npc) {}

    // Barb-tailed kebbit
    public static void npcOption1348(Player player, int index, Npc npc) {}

    // Wild kebbit
    public static void npcOption1349(Player player, int index, Npc npc) {}

    // Artimeus
    public static void npcOption1350(Player player, int index, Npc npc) {}

    // Seth Groats
    public static void npcOption1351(Player player, int index, Npc npc) {}

    // Tassie Slipcast
    public static void npcOption1352(Player player, int index, Npc npc) {}

    // Hammerspike Stoutbeard
    public static void npcOption1353(Player player, int index, Npc npc) {}

    // Dwarf gang member
    public static void npcOption1354(Player player, int index, Npc npc) {}

    // Dwarf gang member
    public static void npcOption1355(Player player, int index, Npc npc) {}

    // Dwarf gang member
    public static void npcOption1356(Player player, int index, Npc npc) {}

    // Phantuwti Fanstuwi Farsight
    public static void npcOption1357(Player player, int index, Npc npc) {}

    // Tindel Marchant
    public static void npcOption1358(Player player, int index, Npc npc) {}

    // Gnormadium Avlafrim
    public static void npcOption1359(Player player, int index, Npc npc) {}

    // Petra Fiyed
    public static void npcOption1360(Player player, int index, Npc npc) {}

    // Jimmy the Chisel
    public static void npcOption1361(Player player, int index, Npc npc) {}

    // Elemental rock
    public static void npcOption1368(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1371(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1372(Player player, int index, Npc npc) {}

    // Hamal the Chieftain
    public static void npcOption1373(Player player, int index, Npc npc) {}

    // Ragnar
    public static void npcOption1374(Player player, int index, Npc npc) {}

    // Svidi
    public static void npcOption1375(Player player, int index, Npc npc) {}

    // Jokul
    public static void npcOption1376(Player player, int index, Npc npc) {}

    // The Kendal
    public static void npcOption1377(Player player, int index, Npc npc) {}

    // Camp dweller
    public static void npcOption1379(Player player, int index, Npc npc) {}

    // Camp dweller
    public static void npcOption1380(Player player, int index, Npc npc) {}

    // Camp dweller
    public static void npcOption1381(Player player, int index, Npc npc) {}

    // Camp dweller
    public static void npcOption1382(Player player, int index, Npc npc) {}

    // Camp dweller
    public static void npcOption1383(Player player, int index, Npc npc) {}

    // Bernald
    public static void npcOption1389(Player player, int index, Npc npc) {}

    // Ellamaria
    public static void npcOption1390(Player player, int index, Npc npc) {}

    // Trolley
    public static void npcOption1391(Player player, int index, Npc npc) {}

    // Trolley
    public static void npcOption1392(Player player, int index, Npc npc) {}

    // Brother Althric
    public static void npcOption1397(Player player, int index, Npc npc) {}

    // Nulodion
    public static void npcOption1400(Player player, int index, Npc npc) {}

    // Hazelmere
    public static void npcOption1422(Player player, int index, Npc npc) {}

    // King Narnode Shareen
    public static void npcOption1423(Player player, int index, Npc npc) {
        player.openDialogue("monkeymadness", 0);
    }

    // null
    public static void npcOption1424(Player player, int index, Npc npc) {}

    // Glough
    public static void npcOption1425(Player player, int index, Npc npc) {}

    // Charlie
    public static void npcOption1428(Player player, int index, Npc npc) {}

    // Foreman
    public static void npcOption1429(Player player, int index, Npc npc) {}

    // Shipyard worker
    public static void npcOption1430(Player player, int index, Npc npc) {}

    // Femi
    public static void npcOption1431(Player player, int index, Npc npc) {}

    // Garkor
    public static void npcOption1434(Player player, int index, Npc npc) {}

    // Zooknock
    public static void npcOption1442(Player player, int index, Npc npc) {}

    // Daero
    public static void npcOption1444(Player player, int index, Npc npc) {}

    // Daero
    public static void npcOption1445(Player player, int index, Npc npc) {}

    // Waydar
    public static void npcOption1446(Player player, int index, Npc npc) {}

    // Lumdo
    public static void npcOption1453(Player player, int index, Npc npc) {}

    // Lumdo
    public static void npcOption1454(Player player, int index, Npc npc) {}

    // G.L.O. Caranock
    public static void npcOption1460(Player player, int index, Npc npc) {}

    // Rantz
    public static void npcOption1470(Player player, int index, Npc npc) {}

    // Fycie
    public static void npcOption1471(Player player, int index, Npc npc) {}

    // Bugs
    public static void npcOption1472(Player player, int index, Npc npc) {}

    // Chompy bird
    public static void npcOption1476(Player player, int index, Npc npc) {}

    // Eudav
    public static void npcOption1477(Player player, int index, Npc npc) {}

    // Oronwen
    public static void npcOption1478(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption1479(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption1480(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Dalldav
    public static void npcOption1481(Player player, int index, Npc npc) {}

    // Gethin
    public static void npcOption1482(Player player, int index, Npc npc) {}

    // Nickolaus
    public static void npcOption1484(Player player, int index, Npc npc) {}

    // Nickolaus
    public static void npcOption1485(Player player, int index, Npc npc) {}

    // Nickolaus
    public static void npcOption1486(Player player, int index, Npc npc) {}

    // Eagle
    public static void npcOption1490(Player player, int index, Npc npc) {}

    // Charlie
    public static void npcOption1495(Player player, int index, Npc npc) {}

    // Boulder
    public static void npcOption1496(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1497(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1498(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1499(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1500(Player player, int index, Npc npc) {}

    // Aleck
    public static void npcOption1501(Player player, int index, Npc npc) {}

    // Leon
    public static void npcOption1502(Player player, int index, Npc npc) {}

    // Hunting expert
    public static void npcOption1503(Player player, int index, Npc npc) {}

    // Hunting expert
    public static void npcOption1504(Player player, int index, Npc npc) {
        if (npc.getX() == 3508 && npc.getY() == 3479) {
            player.getMovement().animatedTeleport(new Tile(3530, 3444), Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
        } else if (npc.getX() == 2644 && npc.getY() == 3662) {
            player.getMovement().animatedTeleport(new Tile(2720, 3781), Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
        } else {
            player.openShop("skilling");
        }
    }

    // Fishing spot
    public static void npcOption1506(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1507(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1508(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1509(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1510(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1511(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1512(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1513(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1514(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1515(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1516(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1517(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1518(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1519(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1520(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1521(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1522(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1523(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1524(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1525(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1526(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1527(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1528(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1529(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1530(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1531(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1532(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1533(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1534(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1535(Player player, int index, Npc npc) {}
    /* 1536 - 1791 */

    // Fishing spot
    public static void npcOption1536(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1542(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption1544(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1546(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1547(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1548(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1549(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1550(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1551(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1552(Player player, int index, Npc npc) {}

    // Ordan
    public static void npcOption1560(Player player, int index, Npc npc) {}

    // Jorzik
    public static void npcOption1561(Player player, int index, Npc npc) {}

    // Smiddi Ryak (hard)
    public static void npcOption1562(Player player, int index, Npc npc) {}

    // Rolayne Twickit (hard)
    public static void npcOption1563(Player player, int index, Npc npc) {}

    // Jayene Kliyn (medium)
    public static void npcOption1564(Player player, int index, Npc npc) {}

    // Valantay Eppel (medium)
    public static void npcOption1565(Player player, int index, Npc npc) {}

    // Dalcian Fang (easy)
    public static void npcOption1566(Player player, int index, Npc npc) {}

    // Fyiona Fray (easy)
    public static void npcOption1567(Player player, int index, Npc npc) {}

    // Abidor Crank
    public static void npcOption1568(Player player, int index, Npc npc) {}

    // Benjamin
    public static void npcOption1569(Player player, int index, Npc npc) {}

    // Liam
    public static void npcOption1570(Player player, int index, Npc npc) {}

    // Miala
    public static void npcOption1571(Player player, int index, Npc npc) {}

    // Verak
    public static void npcOption1572(Player player, int index, Npc npc) {}

    // Forester (hard)
    public static void npcOption1573(Player player, int index, Npc npc) {}

    // Woman-at-arms (hard)
    public static void npcOption1574(Player player, int index, Npc npc) {}

    // Apprentice (medium)
    public static void npcOption1575(Player player, int index, Npc npc) {}

    // Ranger (medium)
    public static void npcOption1576(Player player, int index, Npc npc) {}

    // Adventurer (easy)
    public static void npcOption1577(Player player, int index, Npc npc) {}

    // Mage (easy)
    public static void npcOption1578(Player player, int index, Npc npc) {}

    // Hiylik Myna
    public static void npcOption1579(Player player, int index, Npc npc) {}

    // Gundai
    public static void npcOption1600(Player player, int index, Npc npc) {
        player.getBank().open();
    }

    // Lundail
    public static void npcOption1601(Player player, int index, Npc npc) {
        if (index == 2) {
            player.openShop("wild_runes");
        }
    }

    // Chamber guardian
    public static void npcOption1602(Player player, int index, Npc npc) {}

    // Kolodion
    public static void npcOption1603(Player player, int index, Npc npc) {
        player.openDialogue("kolodion", 0);
    }

    // Phials
    public static void npcOption1614(Player player, int index, Npc npc) {}

    // Banknote Exchange Merchant
    public static void npcOption1615(Player player, int index, Npc npc) {}

    // High Priestess Zul-Harcinqa
    public static void npcOption1616(Player player, int index, Npc npc) {}

    // Priestess Zul-Gwenwynig
    public static void npcOption1617(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption1619(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption1620(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption1621(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption1622(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption1623(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption1624(Player player, int index, Npc npc) {}

    // Hellcat
    public static void npcOption1625(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption1626(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption1627(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption1628(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption1629(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption1630(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption1631(Player player, int index, Npc npc) {}

    // Lazy hellcat
    public static void npcOption1632(Player player, int index, Npc npc) {}

    // Baby impling
    public static void npcOption1635(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Young impling
    public static void npcOption1636(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Gourmet impling
    public static void npcOption1637(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Earth impling
    public static void npcOption1638(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Essence impling
    public static void npcOption1639(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Eclectic impling
    public static void npcOption1640(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Nature impling
    public static void npcOption1641(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Magpie impling
    public static void npcOption1642(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Ninja impling
    public static void npcOption1643(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Dragon impling
    public static void npcOption1644(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Baby impling
    public static void npcOption1645(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Young impling
    public static void npcOption1646(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Gourmet impling
    public static void npcOption1647(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Earth impling
    public static void npcOption1648(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Essence impling
    public static void npcOption1649(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Eclectic impling
    public static void npcOption1650(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Nature impling
    public static void npcOption1651(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Magpie impling
    public static void npcOption1652(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Ninja impling
    public static void npcOption1653(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Dragon impling
    public static void npcOption1654(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Commander Connad
    public static void npcOption1656(Player player, int index, Npc npc) {}

    // Captain Cain
    public static void npcOption1657(Player player, int index, Npc npc) {}

    // Private Paldo
    public static void npcOption1658(Player player, int index, Npc npc) {}

    // Private Pendron
    public static void npcOption1659(Player player, int index, Npc npc) {}

    // Private Pierreb
    public static void npcOption1660(Player player, int index, Npc npc) {}

    // Private Paldon
    public static void npcOption1661(Player player, int index, Npc npc) {}

    // Sergeant Sambur
    public static void npcOption1666(Player player, int index, Npc npc) {}

    // Strange Old Man
    public static void npcOption1671(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1739(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1740(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1741(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1742(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1743(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1744(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1745(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1746(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1747(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1748(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1749(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1750(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1751(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1752(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1753(Player player, int index, Npc npc) {}

    // Portal
    public static void npcOption1754(Player player, int index, Npc npc) {}

    // Void Knight
    public static void npcOption1755(Player player, int index, Npc npc) {
        player.openShop("pest_control");
    }

    // Void Knight
    public static void npcOption1756(Player player, int index, Npc npc) {}

    // Void Knight
    public static void npcOption1757(Player player, int index, Npc npc) {}

    // Void Knight
    public static void npcOption1758(Player player, int index, Npc npc) {}

    // Squire
    public static void npcOption1759(Player player, int index, Npc npc) {}

    // Squire
    public static void npcOption1760(Player player, int index, Npc npc) {}

    // Squire
    public static void npcOption1761(Player player, int index, Npc npc) {}

    // Squire
    public static void npcOption1762(Player player, int index, Npc npc) {}

    // Squire
    public static void npcOption1763(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Squire
    public static void npcOption1764(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Squire
    public static void npcOption1765(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("equipment_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "equipment" : "equipment_iron");
        }
    }

    // Squire
    public static void npcOption1766(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("equipment_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "equipment" : "equipment_iron");
        }
    }

    // Squire
    public static void npcOption1767(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("equipment_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "equipment" : "equipment_iron");
        }
    }

    // Squire
    public static void npcOption1768(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("supplies_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "supplies" : "supplies_iron");
        }
    }

    // Squire
    public static void npcOption1769(Player player, int index, Npc npc) {
        if (player.getController().getExitTile() != null) {
            player.getController().stop();
        }
    }

    // Squire
    public static void npcOption1770(Player player, int index, Npc npc) {}

    // Squire (Novice)
    public static void npcOption1771(Player player, int index, Npc npc) {}

    // Squire (Intermediate)
    public static void npcOption1772(Player player, int index, Npc npc) {}

    // Squire (Veteran)
    public static void npcOption1773(Player player, int index, Npc npc) {}

    // Uri
    public static void npcOption1774(Player player, int index, Npc npc) {}

    // Uri
    public static void npcOption1775(Player player, int index, Npc npc) {}

    // Uri
    public static void npcOption1776(Player player, int index, Npc npc) {}

    // Guardian mummy
    public static void npcOption1779(Player player, int index, Npc npc) {}

    // Tarik
    public static void npcOption1781(Player player, int index, Npc npc) {}

    // Malignius Mortifer
    public static void npcOption1783(Player player, int index, Npc npc) {}

    // Betty
    public static void npcOption1788(Player player, int index, Npc npc) {}

    // Grum
    public static void npcOption1789(Player player, int index, Npc npc) {}

    // Gerrant
    public static void npcOption1790(Player player, int index, Npc npc) {}

    // Wydin
    public static void npcOption1791(Player player, int index, Npc npc) {}
    /* 1792 - 2047 */

    // Sorceress
    public static void npcOption1807(Player player, int index, Npc npc) {}

    // Apprentice
    public static void npcOption1808(Player player, int index, Npc npc) {}

    // Osman
    public static void npcOption1809(Player player, int index, Npc npc) {}

    // Osman
    public static void npcOption1810(Player player, int index, Npc npc) {}

    // Osman
    public static void npcOption1811(Player player, int index, Npc npc) {}

    // Del-Monty
    public static void npcOption1813(Player player, int index, Npc npc) {}

    // San Fan
    public static void npcOption1814(Player player, int index, Npc npc) {}

    // Fancy Dan
    public static void npcOption1815(Player player, int index, Npc npc) {}

    // Honest Jimmy
    public static void npcOption1816(Player player, int index, Npc npc) {}

    // Monkey
    public static void npcOption1817(Player player, int index, Npc npc) {}

    // Parrot
    public static void npcOption1827(Player player, int index, Npc npc) {}

    // Parrot
    public static void npcOption1828(Player player, int index, Npc npc) {}

    // Bandit shopkeeper
    public static void npcOption1833(Player player, int index, Npc npc) {}

    // Cosmic Being
    public static void npcOption1835(Player player, int index, Npc npc) {}

    // Fairy Godfather
    public static void npcOption1840(Player player, int index, Npc npc) {}

    // Fairy Nuff
    public static void npcOption1841(Player player, int index, Npc npc) {}

    // Fairy Queen
    public static void npcOption1842(Player player, int index, Npc npc) {}

    // Centaur
    public static void npcOption1843(Player player, int index, Npc npc) {}

    // Centaur
    public static void npcOption1844(Player player, int index, Npc npc) {}

    // Wood Dryad
    public static void npcOption1846(Player player, int index, Npc npc) {}

    // Fairy Very Wise
    public static void npcOption1847(Player player, int index, Npc npc) {}

    // Fairy
    public static void npcOption1848(Player player, int index, Npc npc) {}

    // Fairy
    public static void npcOption1849(Player player, int index, Npc npc) {}

    // Fairy
    public static void npcOption1850(Player player, int index, Npc npc) {}

    // Fairy
    public static void npcOption1851(Player player, int index, Npc npc) {}

    // Starflower
    public static void npcOption1857(Player player, int index, Npc npc) {}

    // Sir Amik Varze
    public static void npcOption1867(Player player, int index, Npc npc) {}

    // Sir Amik Varze
    public static void npcOption1869(Player player, int index, Npc npc) {}

    // Mawnis Burowgar
    public static void npcOption1878(Player player, int index, Npc npc) {}

    // Mawnis Burowgar
    public static void npcOption1879(Player player, int index, Npc npc) {}

    // Fridleif Shieldson
    public static void npcOption1880(Player player, int index, Npc npc) {}

    // Thakkrad Sigmundson
    public static void npcOption1881(Player player, int index, Npc npc) {}

    // Maria Gunnars
    public static void npcOption1882(Player player, int index, Npc npc) {}

    // Maria Gunnars
    public static void npcOption1883(Player player, int index, Npc npc) {}

    // Jofridr Mordstatter
    public static void npcOption1884(Player player, int index, Npc npc) {}

    // Morten Holdstrom
    public static void npcOption1885(Player player, int index, Npc npc) {}

    // Gunnar Holdstrom
    public static void npcOption1886(Player player, int index, Npc npc) {}

    // Anne Isaakson
    public static void npcOption1887(Player player, int index, Npc npc) {}

    // Lisse Isaakson
    public static void npcOption1888(Player player, int index, Npc npc) {}

    // Honour guard
    public static void npcOption1889(Player player, int index, Npc npc) {}

    // Honour guard
    public static void npcOption1890(Player player, int index, Npc npc) {}

    // Honour guard
    public static void npcOption1891(Player player, int index, Npc npc) {}

    // Kjedelig Uppsen
    public static void npcOption1893(Player player, int index, Npc npc) {}

    // Trogen Konungarde
    public static void npcOption1894(Player player, int index, Npc npc) {}

    // Slug Hemligssen
    public static void npcOption1895(Player player, int index, Npc npc) {}

    // Candle seller
    public static void npcOption1896(Player player, int index, Npc npc) {}

    // King Gjuki Sorvott IV
    public static void npcOption1897(Player player, int index, Npc npc) {}

    // HRH Hrafn
    public static void npcOption1898(Player player, int index, Npc npc) {}

    // Thorkel Silkbeard
    public static void npcOption1899(Player player, int index, Npc npc) {}

    // Mord Gunnars
    public static void npcOption1900(Player player, int index, Npc npc) {}

    // Art Critic Jacques
    public static void npcOption1901(Player player, int index, Npc npc) {}

    // Historian Minas
    public static void npcOption1902(Player player, int index, Npc npc) {}

    // Barnabus Hurma
    public static void npcOption1903(Player player, int index, Npc npc) {}

    // Marius Giste
    public static void npcOption1904(Player player, int index, Npc npc) {}

    // Caden Azro
    public static void npcOption1905(Player player, int index, Npc npc) {}

    // Thias Leacke
    public static void npcOption1906(Player player, int index, Npc npc) {}

    // Sinco Doar
    public static void npcOption1907(Player player, int index, Npc npc) {}

    // Tinse Torpe
    public static void npcOption1908(Player player, int index, Npc npc) {}

    // Information clerk
    public static void npcOption1909(Player player, int index, Npc npc) {}

    // Museum guard
    public static void npcOption1910(Player player, int index, Npc npc) {}

    // Museum guard
    public static void npcOption1911(Player player, int index, Npc npc) {}

    // Museum guard
    public static void npcOption1912(Player player, int index, Npc npc) {}

    // Teacher and pupil
    public static void npcOption1913(Player player, int index, Npc npc) {}

    // Schoolgirl
    public static void npcOption1914(Player player, int index, Npc npc) {}

    // Schoolgirl
    public static void npcOption1915(Player player, int index, Npc npc) {}

    // Schoolgirl
    public static void npcOption1916(Player player, int index, Npc npc) {}

    // Schoolgirl
    public static void npcOption1917(Player player, int index, Npc npc) {}

    // Schoolgirl
    public static void npcOption1918(Player player, int index, Npc npc) {}

    // Schoolboy
    public static void npcOption1919(Player player, int index, Npc npc) {}

    // Schoolboy
    public static void npcOption1920(Player player, int index, Npc npc) {}

    // Schoolgirl
    public static void npcOption1921(Player player, int index, Npc npc) {}

    // Teacher and pupil
    public static void npcOption1922(Player player, int index, Npc npc) {}

    // Barge workman
    public static void npcOption1934(Player player, int index, Npc npc) {}

    // Barge workman
    public static void npcOption1935(Player player, int index, Npc npc) {}

    // Barge workman
    public static void npcOption1936(Player player, int index, Npc npc) {}

    // Barge workman
    public static void npcOption1937(Player player, int index, Npc npc) {}

    // Barge foreman
    public static void npcOption1938(Player player, int index, Npc npc) {}

    // Ed Wood
    public static void npcOption1939(Player player, int index, Npc npc) {}

    // Mord Gunnars
    public static void npcOption1940(Player player, int index, Npc npc) {}

    // Hring Hring
    public static void npcOption1941(Player player, int index, Npc npc) {}

    // Flosi Dalksson
    public static void npcOption1942(Player player, int index, Npc npc) {}

    // Raum Urda-Stein
    public static void npcOption1943(Player player, int index, Npc npc) {}

    // Skuli Myrka
    public static void npcOption1944(Player player, int index, Npc npc) {}

    // Keepa Kettilon
    public static void npcOption1945(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1947(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1948(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1949(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption1950(Player player, int index, Npc npc) {}

    // Freygerd
    public static void npcOption1951(Player player, int index, Npc npc) {}

    // Lensa
    public static void npcOption1952(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1953(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1954(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1955(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1956(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1957(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1958(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1959(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1960(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1961(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1962(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1963(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1964(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1980(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1982(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1983(Player player, int index, Npc npc) {}

    // Vanligga Gastfrihet
    public static void npcOption1990(Player player, int index, Npc npc) {}

    // Sassilik
    public static void npcOption1991(Player player, int index, Npc npc) {}

    // Miner
    public static void npcOption1992(Player player, int index, Npc npc) {}

    // Miner
    public static void npcOption1993(Player player, int index, Npc npc) {}

    // null
    public static void npcOption1995(Player player, int index, Npc npc) {}

    // Eric
    public static void npcOption1997(Player player, int index, Npc npc) {}

    // Gruva Patrull
    public static void npcOption1998(Player player, int index, Npc npc) {}

    // Brendt
    public static void npcOption1999(Player player, int index, Npc npc) {}

    // Grundt
    public static void npcOption2000(Player player, int index, Npc npc) {}

    // null
    public static void npcOption2010(Player player, int index, Npc npc) {}

    // null
    public static void npcOption2019(Player player, int index, Npc npc) {}

    // Priestess Zul-Gwenwynig
    public static void npcOption2033(Player player, int index, Npc npc) {}

    // Zul-Urgish
    public static void npcOption2034(Player player, int index, Npc npc) {}

    // Zul-Cheray
    public static void npcOption2035(Player player, int index, Npc npc) {}

    // Zul-Gutusolly
    public static void npcOption2036(Player player, int index, Npc npc) {}

    // Sacrifice
    public static void npcOption2037(Player player, int index, Npc npc) {}

    // Zul-Onan
    public static void npcOption2038(Player player, int index, Npc npc) {}

    // Zul-Aniel
    public static void npcOption2039(Player player, int index, Npc npc) {}

    // Zul-Areth
    public static void npcOption2040(Player player, int index, Npc npc) {}

    // Broken Handz
    public static void npcOption2041(Player player, int index, Npc npc) {}
    /* 2048 - 2303 */

    // Fritz the Glassblower
    public static void npcOption2053(Player player, int index, Npc npc) {}

    // Chaos Elemental Jr.
    public static void npcOption2055(Player player, int index, Npc npc) {}

    // Dodgy Squire
    public static void npcOption2060(Player player, int index, Npc npc) {}

    // Glough
    public static void npcOption2061(Player player, int index, Npc npc) {}

    // Ork
    public static void npcOption2104(Player player, int index, Npc npc) {}

    // Ork
    public static void npcOption2105(Player player, int index, Npc npc) {}

    // Ork
    public static void npcOption2106(Player player, int index, Npc npc) {}

    // Ork
    public static void npcOption2107(Player player, int index, Npc npc) {}

    // Wise Old Man
    public static void npcOption2108(Player player, int index, Npc npc) {
        player.openShop("platinum_tokens");
    }

    // Wise Old Man
    public static void npcOption2110(Player player, int index, Npc npc) {}

    // Wise Old Man
    public static void npcOption2111(Player player, int index, Npc npc) {}

    // Wise Old Man
    public static void npcOption2112(Player player, int index, Npc npc) {}

    // Bed
    public static void npcOption2114(Player player, int index, Npc npc) {}

    // Miss Schism
    public static void npcOption2116(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption2117(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption2118(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption2119(Player player, int index, Npc npc) {}

    // Olivia
    public static void npcOption2121(Player player, int index, Npc npc) {}

    // Bank guard
    public static void npcOption2123(Player player, int index, Npc npc) {}

    // Snakeling
    public static void npcOption2127(Player player, int index, Npc npc) {}

    // Snakeling
    public static void npcOption2128(Player player, int index, Npc npc) {}

    // Snakeling
    public static void npcOption2129(Player player, int index, Npc npc) {}

    // Snakeling
    public static void npcOption2130(Player player, int index, Npc npc) {}

    // Snakeling
    public static void npcOption2131(Player player, int index, Npc npc) {}

    // Snakeling
    public static void npcOption2132(Player player, int index, Npc npc) {}

    // Tiles
    public static void npcOption2133(Player player, int index, Npc npc) {}

    // Aisles
    public static void npcOption2134(Player player, int index, Npc npc) {}

    // Lorelai
    public static void npcOption2135(Player player, int index, Npc npc) {}

    // Rory
    public static void npcOption2136(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption2146(Player player, int index, Npc npc) {}

    // Veos
    public static void npcOption2147(Player player, int index, Npc npc) {}

    // Grand Exchange Clerk
    public static void npcOption2148(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("grandexchange", 0);
        } else if (index == 2) {
            player.getGrandExchange().open();
        } else if (index == 3) {
            player.getGrandExchange().openHistory(GrandExchangeUser.HISTORY);
        } else if (index == 4) {
            player.getGrandExchange().exchangeItemSets();
        }
    }

    // Grand Exchange Clerk
    public static void npcOption2149(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("grandexchange", 0);
        } else if (index == 2) {
            player.getGrandExchange().open();
        } else if (index == 3) {
            player.getGrandExchange().openHistory(GrandExchangeUser.HISTORY);
        } else if (index == 4) {
            player.getGrandExchange().exchangeItemSets();
        }
    }

    // Grand Exchange Clerk
    public static void npcOption2150(Player player, int index, Npc npc) {}

    // Grand Exchange Clerk
    public static void npcOption2151(Player player, int index, Npc npc) {}

    // Brugsen Bursen
    public static void npcOption2152(Player player, int index, Npc npc) {}

    // Gunnjorn
    public static void npcOption2153(Player player, int index, Npc npc) {}

    // TzHaar-Mej-Jal
    public static void npcOption2180(Player player, int index, Npc npc) {
        player.openDialogue("tzhaar", 1);
    }

    // TzHaar-Mej-Kah
    public static void npcOption2181(Player player, int index, Npc npc) {}

    // TzHaar-Ket-Zuh
    public static void npcOption2182(Player player, int index, Npc npc) {
        player.getBank().open();
    }

    // TzHaar-Hur-Tel
    public static void npcOption2183(Player player, int index, Npc npc) {
        player.openShop("tzhaar_equipment");
    }

    // TzHaar-Hur-Lek
    public static void npcOption2184(Player player, int index, Npc npc) {
        player.openShop("tzhaar_rocks");
    }

    // TzHaar-Mej-Roh
    public static void npcOption2185(Player player, int index, Npc npc) {
        player.openShop("tzhaar_runes");
    }

    // TzHaar-Ket
    public static void npcOption2186(Player player, int index, Npc npc) {}

    // TzHaar-Ket
    public static void npcOption2187(Player player, int index, Npc npc) {}

    // William
    public static void npcOption2195(Player player, int index, Npc npc) {}

    // Ian
    public static void npcOption2196(Player player, int index, Npc npc) {}

    // Larry
    public static void npcOption2197(Player player, int index, Npc npc) {}

    // Darren
    public static void npcOption2198(Player player, int index, Npc npc) {}

    // Edward
    public static void npcOption2199(Player player, int index, Npc npc) {}

    // Richard
    public static void npcOption2200(Player player, int index, Npc npc) {
        player.openShop("teamcapes");
    }

    // Neil
    public static void npcOption2201(Player player, int index, Npc npc) {}

    // Edmond
    public static void npcOption2202(Player player, int index, Npc npc) {}

    // Simon
    public static void npcOption2203(Player player, int index, Npc npc) {}

    // Sam
    public static void npcOption2204(Player player, int index, Npc npc) {}

    // Door-support
    public static void npcOption2250(Player player, int index, Npc npc) {}

    // Door-support
    public static void npcOption2253(Player player, int index, Npc npc) {}

    // Door-support
    public static void npcOption2256(Player player, int index, Npc npc) {}

    // Askeladden
    public static void npcOption2260(Player player, int index, Npc npc) {}

    // Bardur
    public static void npcOption2263(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2268(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2269(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2270(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2271(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2272(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2273(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2274(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2275(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2276(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2277(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2278(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2279(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2280(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2281(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2282(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2283(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2284(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2285(Player player, int index, Npc npc) {}

    // Ur-zek
    public static void npcOption2286(Player player, int index, Npc npc) {}

    // Ur-vass
    public static void npcOption2287(Player player, int index, Npc npc) {}

    // Ur-taal
    public static void npcOption2288(Player player, int index, Npc npc) {}

    // Ur-meg
    public static void npcOption2289(Player player, int index, Npc npc) {}

    // Ur-lun
    public static void npcOption2290(Player player, int index, Npc npc) {}

    // Ur-pel
    public static void npcOption2291(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption2292(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption2293(Player player, int index, Npc npc) {}

    // Bartak
    public static void npcOption2294(Player player, int index, Npc npc) {}

    // Turgall
    public static void npcOption2295(Player player, int index, Npc npc) {}

    // Reldak
    public static void npcOption2296(Player player, int index, Npc npc) {}

    // Miltog
    public static void npcOption2297(Player player, int index, Npc npc) {}

    // Mernik
    public static void npcOption2298(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2299(Player player, int index, Npc npc) {}

    // Crate goblin
    public static void npcOption2300(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption2301(Player player, int index, Npc npc) {}

    // Goblin scribe
    public static void npcOption2302(Player player, int index, Npc npc) {}

    // Oldak
    public static void npcOption2303(Player player, int index, Npc npc) {}
    /* 2304 - 2559 */

    // Gourmet
    public static void npcOption2304(Player player, int index, Npc npc) {}

    // Gourmet
    public static void npcOption2305(Player player, int index, Npc npc) {}

    // Gourmet
    public static void npcOption2306(Player player, int index, Npc npc) {}

    // Gourmet
    public static void npcOption2307(Player player, int index, Npc npc) {}

    // Turgok
    public static void npcOption2308(Player player, int index, Npc npc) {}

    // Markog
    public static void npcOption2309(Player player, int index, Npc npc) {}

    // Durgok
    public static void npcOption2310(Player player, int index, Npc npc) {}

    // Tindar
    public static void npcOption2311(Player player, int index, Npc npc) {}

    // Gundik
    public static void npcOption2312(Player player, int index, Npc npc) {}

    // Zenkog
    public static void npcOption2313(Player player, int index, Npc npc) {}

    // Lurgon
    public static void npcOption2314(Player player, int index, Npc npc) {}

    // Ur-tag
    public static void npcOption2315(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption2316(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption2317(Player player, int index, Npc npc) {}

    // Zanik
    public static void npcOption2318(Player player, int index, Npc npc) {}

    // Young 'un
    public static void npcOption2319(Player player, int index, Npc npc) {}

    // Tyke
    public static void npcOption2320(Player player, int index, Npc npc) {}

    // Nipper
    public static void npcOption2321(Player player, int index, Npc npc) {}

    // Nipper
    public static void npcOption2322(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2323(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2324(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2325(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2326(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2327(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2328(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2329(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2330(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2331(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2332(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2333(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2334(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2335(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2336(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2337(Player player, int index, Npc npc) {}

    // Cave goblin child
    public static void npcOption2338(Player player, int index, Npc npc) {}

    // Spit goblin
    public static void npcOption2339(Player player, int index, Npc npc) {}

    // Movario
    public static void npcOption2341(Player player, int index, Npc npc) {}

    // Darve
    public static void npcOption2342(Player player, int index, Npc npc) {}

    // Barlak
    public static void npcOption2344(Player player, int index, Npc npc) {}

    // Saniboch
    public static void npcOption2345(Player player, int index, Npc npc) {}

    // Dromund's cat
    public static void npcOption2346(Player player, int index, Npc npc) {}

    // Blasidar the sculptor
    public static void npcOption2347(Player player, int index, Npc npc) {}

    // Riki the sculptor's model
    public static void npcOption2348(Player player, int index, Npc npc) {}

    // Riki the sculptor's model
    public static void npcOption2349(Player player, int index, Npc npc) {}

    // Riki the sculptor's model
    public static void npcOption2350(Player player, int index, Npc npc) {}

    // Riki the sculptor's model
    public static void npcOption2351(Player player, int index, Npc npc) {}

    // Riki the sculptor's model
    public static void npcOption2352(Player player, int index, Npc npc) {}

    // Riki the sculptor's model
    public static void npcOption2353(Player player, int index, Npc npc) {}

    // Riki the sculptor's model
    public static void npcOption2354(Player player, int index, Npc npc) {}

    // Riki the sculptor's model
    public static void npcOption2355(Player player, int index, Npc npc) {}

    // Vigr
    public static void npcOption2356(Player player, int index, Npc npc) {}

    // Santiri
    public static void npcOption2357(Player player, int index, Npc npc) {}

    // Saro
    public static void npcOption2358(Player player, int index, Npc npc) {}

    // Gunslik
    public static void npcOption2359(Player player, int index, Npc npc) {}

    // Wemund
    public static void npcOption2360(Player player, int index, Npc npc) {}

    // Randivor
    public static void npcOption2361(Player player, int index, Npc npc) {}

    // Hervi
    public static void npcOption2362(Player player, int index, Npc npc) {}

    // Nolar
    public static void npcOption2363(Player player, int index, Npc npc) {}

    // Gulldamar
    public static void npcOption2364(Player player, int index, Npc npc) {}

    // Tati
    public static void npcOption2365(Player player, int index, Npc npc) {}

    // Agmundi
    public static void npcOption2366(Player player, int index, Npc npc) {}

    // Vermundi
    public static void npcOption2367(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption2368(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption2369(Player player, int index, Npc npc) {}

    // Librarian
    public static void npcOption2370(Player player, int index, Npc npc) {}

    // Assistant
    public static void npcOption2371(Player player, int index, Npc npc) {}

    // Customer
    public static void npcOption2372(Player player, int index, Npc npc) {}

    // Customer
    public static void npcOption2373(Player player, int index, Npc npc) {}

    // Dromund
    public static void npcOption2374(Player player, int index, Npc npc) {}

    // Rind the gardener
    public static void npcOption2375(Player player, int index, Npc npc) {}

    // Factory Manager
    public static void npcOption2376(Player player, int index, Npc npc) {}

    // Factory Worker
    public static void npcOption2377(Player player, int index, Npc npc) {}

    // Factory Worker
    public static void npcOption2378(Player player, int index, Npc npc) {}

    // Factory Worker
    public static void npcOption2379(Player player, int index, Npc npc) {}

    // Factory Worker
    public static void npcOption2380(Player player, int index, Npc npc) {}

    // Inn Keeper
    public static void npcOption2381(Player player, int index, Npc npc) {}

    // Inn Keeper
    public static void npcOption2382(Player player, int index, Npc npc) {}

    // Barmaid
    public static void npcOption2383(Player player, int index, Npc npc) {}

    // Barman
    public static void npcOption2384(Player player, int index, Npc npc) {}

    // Cart conductor
    public static void npcOption2385(Player player, int index, Npc npc) {}

    // Cart conductor
    public static void npcOption2386(Player player, int index, Npc npc) {}

    // Cart conductor
    public static void npcOption2387(Player player, int index, Npc npc) {}

    // Cart conductor
    public static void npcOption2388(Player player, int index, Npc npc) {}

    // Cart conductor
    public static void npcOption2389(Player player, int index, Npc npc) {}

    // Cart conductor
    public static void npcOption2390(Player player, int index, Npc npc) {}

    // Cart conductor
    public static void npcOption2391(Player player, int index, Npc npc) {}

    // Cart conductor
    public static void npcOption2392(Player player, int index, Npc npc) {}

    // Rowdy dwarf
    public static void npcOption2393(Player player, int index, Npc npc) {}

    // Hegir
    public static void npcOption2394(Player player, int index, Npc npc) {}

    // Haera
    public static void npcOption2395(Player player, int index, Npc npc) {}

    // Runvastr
    public static void npcOption2396(Player player, int index, Npc npc) {}

    // Sune
    public static void npcOption2397(Player player, int index, Npc npc) {}

    // Bentamir
    public static void npcOption2398(Player player, int index, Npc npc) {}

    // Ulifed
    public static void npcOption2399(Player player, int index, Npc npc) {}

    // Reinald
    public static void npcOption2400(Player player, int index, Npc npc) {}

    // Karl
    public static void npcOption2401(Player player, int index, Npc npc) {}

    // Gauss
    public static void npcOption2402(Player player, int index, Npc npc) {}

    // Myndill
    public static void npcOption2403(Player player, int index, Npc npc) {}

    // Kjut
    public static void npcOption2404(Player player, int index, Npc npc) {}

    // Tombar
    public static void npcOption2405(Player player, int index, Npc npc) {}

    // Odmar
    public static void npcOption2406(Player player, int index, Npc npc) {}

    // Audmann
    public static void npcOption2407(Player player, int index, Npc npc) {}

    // Drunken Dwarf
    public static void npcOption2408(Player player, int index, Npc npc) {}

    // Drunken Dwarf
    public static void npcOption2409(Player player, int index, Npc npc) {}

    // Red Axe Director
    public static void npcOption2411(Player player, int index, Npc npc) {}

    // Red Axe Henchman
    public static void npcOption2413(Player player, int index, Npc npc) {}

    // Ogre shaman
    public static void npcOption2418(Player player, int index, Npc npc) {}

    // Ulifed
    public static void npcOption2431(Player player, int index, Npc npc) {}

    // Dwarven Boatman
    public static void npcOption2432(Player player, int index, Npc npc) {}

    // Dwarven Boatman
    public static void npcOption2433(Player player, int index, Npc npc) {}

    // Dwarven Miner
    public static void npcOption2435(Player player, int index, Npc npc) {}

    // Ghommal
    public static void npcOption2457(Player player, int index, Npc npc) {}

    // Harrallak Menarous
    public static void npcOption2458(Player player, int index, Npc npc) {}

    // Gamfred
    public static void npcOption2459(Player player, int index, Npc npc) {}

    // Ajjat
    public static void npcOption2460(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("equipment_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "equipment" : "equipment_iron");
        }
    }

    // Kamfreena
    public static void npcOption2461(Player player, int index, Npc npc) {}

    // Shanomi
    public static void npcOption2462(Player player, int index, Npc npc) {}

    // Lidio
    public static void npcOption2469(Player player, int index, Npc npc) {
        player.openShop("warriors_guild_food");
    }

    // Lilly
    public static void npcOption2470(Player player, int index, Npc npc) {
        player.openShop("warriors_guild_potions");
    }

    // Anton
    public static void npcOption2471(Player player, int index, Npc npc) {
        player.openShop("warriors_guild_armour");
    }

    // Jade
    public static void npcOption2472(Player player, int index, Npc npc) {}

    // Sloane
    public static void npcOption2473(Player player, int index, Npc npc) {}

    // Litara
    public static void npcOption2493(Player player, int index, Npc npc) {}

    // Gate of War
    public static void npcOption2494(Player player, int index, Npc npc) {}

    // Ricketty door
    public static void npcOption2495(Player player, int index, Npc npc) {}

    // Oozing barrier
    public static void npcOption2496(Player player, int index, Npc npc) {}

    // Portal of Death
    public static void npcOption2497(Player player, int index, Npc npc) {}

    // Johanhus Ulsbrecht
    public static void npcOption2535(Player player, int index, Npc npc) {}

    // H.A.M. Guard
    public static void npcOption2536(Player player, int index, Npc npc) {}

    // H.A.M. Guard
    public static void npcOption2537(Player player, int index, Npc npc) {}

    // H.A.M. Guard
    public static void npcOption2538(Player player, int index, Npc npc) {}

    // H.A.M. Member
    public static void npcOption2540(Player player, int index, Npc npc) {}

    // H.A.M. Member
    public static void npcOption2541(Player player, int index, Npc npc) {}

    // H.A.M. Member
    public static void npcOption2542(Player player, int index, Npc npc) {}

    // H.A.M. Member
    public static void npcOption2543(Player player, int index, Npc npc) {}

    // Mounted terrorchick gnome
    public static void npcOption2544(Player player, int index, Npc npc) {}

    // Captain Lamdoo
    public static void npcOption2545(Player player, int index, Npc npc) {}

    // Gianne jnr.
    public static void npcOption2547(Player player, int index, Npc npc) {}

    // Timble
    public static void npcOption2548(Player player, int index, Npc npc) {}

    // Tamble
    public static void npcOption2549(Player player, int index, Npc npc) {}

    // Spang
    public static void npcOption2550(Player player, int index, Npc npc) {}

    // Brambickle
    public static void npcOption2551(Player player, int index, Npc npc) {}

    // Wingstone
    public static void npcOption2552(Player player, int index, Npc npc) {}

    // Penwie
    public static void npcOption2553(Player player, int index, Npc npc) {}

    // Generic Diplomat
    public static void npcOption2554(Player player, int index, Npc npc) {}

    // Ambassador Gimblewap
    public static void npcOption2555(Player player, int index, Npc npc) {}

    // Ambassador Spanfipple
    public static void npcOption2556(Player player, int index, Npc npc) {}

    // Ambassador Ferrnook
    public static void npcOption2557(Player player, int index, Npc npc) {}

    // Professor Manglethorp
    public static void npcOption2558(Player player, int index, Npc npc) {}

    // Damwin
    public static void npcOption2559(Player player, int index, Npc npc) {}
    /* 2560 - 2815 */

    // Professor Onglewip
    public static void npcOption2560(Player player, int index, Npc npc) {}

    // Professor Imblewyn
    public static void npcOption2561(Player player, int index, Npc npc) {}

    // Perrdur
    public static void npcOption2562(Player player, int index, Npc npc) {}

    // Dalila
    public static void npcOption2563(Player player, int index, Npc npc) {}

    // Sorrn
    public static void npcOption2564(Player player, int index, Npc npc) {}

    // Mimm
    public static void npcOption2565(Player player, int index, Npc npc) {}

    // Eebel
    public static void npcOption2566(Player player, int index, Npc npc) {}

    // Ermin
    public static void npcOption2567(Player player, int index, Npc npc) {}

    // Portobello
    public static void npcOption2568(Player player, int index, Npc npc) {}

    // Captain Ninto
    public static void npcOption2569(Player player, int index, Npc npc) {}

    // Captain Daerkin
    public static void npcOption2570(Player player, int index, Npc npc) {}

    // Meegle
    public static void npcOption2571(Player player, int index, Npc npc) {}

    // Wurbel
    public static void npcOption2572(Player player, int index, Npc npc) {}

    // Sarble
    public static void npcOption2573(Player player, int index, Npc npc) {}

    // Guard Vemmeldo
    public static void npcOption2574(Player player, int index, Npc npc) {}

    // Burkor
    public static void npcOption2575(Player player, int index, Npc npc) {}

    // Froono
    public static void npcOption2576(Player player, int index, Npc npc) {}

    // Abbot Langley
    public static void npcOption2577(Player player, int index, Npc npc) {}

    // Brother Jered
    public static void npcOption2578(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption2579(Player player, int index, Npc npc) {}

    // Mage of Zamorak
    public static void npcOption2580(Player player, int index, Npc npc) {}

    // Mage of Zamorak
    public static void npcOption2581(Player player, int index, Npc npc) {
        if (index == 0 || index == 2) {
            player.openShop("wild_runes");
        } else if (index == 3) {
            if (!player.getController().canTeleport(true)) {
                return;
            }
            if (player.getEquipment().getHandID() == 11095 || player.getEquipment().getHandID() == 11097
                    || player.getEquipment().getHandID() == 11099 || player.getEquipment().getHandID() == 11101
                    || player.getEquipment().getHandID() == 11103) {
                player.getEquipment().setItem(Equipment.Slot.HAND, player.getEquipment().getHandID() == 11103 ? null
                        : new Item(player.getEquipment().getHandID() + 2, 1));
                player.getAppearance().setUpdate(true);
            } else {
                player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
            }
            npc.setForceMessage("Veniens! Sallakar! Rinnesset!");
            npc.setAnimation(1818);
            npc.setGraphic(343);
            Tile[] tiles = new Tile[] {
                new Tile(3045, 4810), new Tile(3059, 4818), new Tile(3062, 4835), new Tile(3054, 4850),
                new Tile(3043, 4854), new Tile(3027, 4851), new Tile(3017, 4840), new Tile(3015, 4826),
                new Tile(3021, 4813), new Tile(3035, 4809)
            };
            player.getMovement().animatedTeleport(Utils.arrayRandom(tiles), 1816, 715, new Graphic(342), null, 2);
            player.getController().stopWithTeleport();
            player.clearHits();
        }
    }

    // Mage of Zamorak
    public static void npcOption2582(Player player, int index, Npc npc) {
        player.openDialogue("magezamorak", 0);
    }

    // Dark mage
    public static void npcOption2583(Player player, int index, Npc npc) {}

    // Skippy
    public static void npcOption2587(Player player, int index, Npc npc) {}

    // Skippy
    public static void npcOption2588(Player player, int index, Npc npc) {}

    // Skippy
    public static void npcOption2589(Player player, int index, Npc npc) {}

    // Skippy
    public static void npcOption2590(Player player, int index, Npc npc) {}

    // Boris
    public static void npcOption2613(Player player, int index, Npc npc) {}

    // Imre
    public static void npcOption2614(Player player, int index, Npc npc) {}

    // Yuri
    public static void npcOption2615(Player player, int index, Npc npc) {}

    // Joseph
    public static void npcOption2616(Player player, int index, Npc npc) {}

    // Nikolai
    public static void npcOption2617(Player player, int index, Npc npc) {}

    // Eduard
    public static void npcOption2618(Player player, int index, Npc npc) {}

    // Lev
    public static void npcOption2619(Player player, int index, Npc npc) {}

    // Georgy
    public static void npcOption2620(Player player, int index, Npc npc) {}

    // Svetlana
    public static void npcOption2621(Player player, int index, Npc npc) {}

    // Irina
    public static void npcOption2622(Player player, int index, Npc npc) {}

    // Alexis
    public static void npcOption2623(Player player, int index, Npc npc) {}

    // Milla
    public static void npcOption2624(Player player, int index, Npc npc) {}

    // Galina
    public static void npcOption2625(Player player, int index, Npc npc) {}

    // Sofiya
    public static void npcOption2626(Player player, int index, Npc npc) {}

    // Ksenia
    public static void npcOption2627(Player player, int index, Npc npc) {}

    // Yadviga
    public static void npcOption2628(Player player, int index, Npc npc) {}

    // Nikita
    public static void npcOption2629(Player player, int index, Npc npc) {}

    // Vera
    public static void npcOption2630(Player player, int index, Npc npc) {}

    // Zoja
    public static void npcOption2631(Player player, int index, Npc npc) {}

    // Liliya
    public static void npcOption2632(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption2633(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption2635(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption2636(Player player, int index, Npc npc) {}

    // Sphinx
    public static void npcOption2637(Player player, int index, Npc npc) {}

    // Neite
    public static void npcOption2638(Player player, int index, Npc npc) {}

    // Robert the Strong
    public static void npcOption2639(Player player, int index, Npc npc) {}

    // Odysseus
    public static void npcOption2640(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption2653(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption2654(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption2655(Player player, int index, Npc npc) {}

    // Aluft Gianne snr.
    public static void npcOption2656(Player player, int index, Npc npc) {}

    // Gnome Waiter
    public static void npcOption2657(Player player, int index, Npc npc) {}

    // Head chef
    public static void npcOption2658(Player player, int index, Npc npc) {
        if (Main.isSpawn()) {
            player.openShop("supplies_spawn");
        } else {
            player.openShop(player.isGameModeNormal() || player.isGameModeHard() ? "supplies" : "supplies_iron");
        }
    }

    // Purepker895
    public static void npcOption2659(Player player, int index, Npc npc) {}

    // Qutiedoll
    public static void npcOption2660(Player player, int index, Npc npc) {}

    // 1337sp34kr
    public static void npcOption2661(Player player, int index, Npc npc) {}

    // Elfinlocks
    public static void npcOption2662(Player player, int index, Npc npc) {}

    // Elstan
    public static void npcOption2663(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Dantaera
    public static void npcOption2664(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Kragen
    public static void npcOption2665(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Lyra
    public static void npcOption2666(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Francis
    public static void npcOption2667(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // <col=00ffff>Combat dummy</col>
    public static void npcOption2668(Player player, int index, Npc npc) {}

    // Garth
    public static void npcOption2669(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Ellena
    public static void npcOption2670(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Selena
    public static void npcOption2671(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Vasquen
    public static void npcOption2672(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Rhonen
    public static void npcOption2673(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Dreven
    public static void npcOption2674(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Taria
    public static void npcOption2675(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Rhazien
    public static void npcOption2676(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Torrell
    public static void npcOption2677(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Alain
    public static void npcOption2678(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Heskel
    public static void npcOption2679(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Treznor
    public static void npcOption2680(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Fayeth
    public static void npcOption2681(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Bolongo
    public static void npcOption2682(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Gileth
    public static void npcOption2683(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Frizzy Skernip
    public static void npcOption2684(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Yulf Squecks
    public static void npcOption2685(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Praistan Ebola
    public static void npcOption2686(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Prissy Scilla
    public static void npcOption2687(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Imiago
    public static void npcOption2688(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Liliwen
    public static void npcOption2689(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Cool Mom227
    public static void npcOption2690(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2715(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2716(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2717(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2718(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2719(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2720(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2721(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2722(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2723(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2724(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2725(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2726(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2727(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2728(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2729(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2730(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2731(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2732(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2733(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2734(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2735(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2736(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2737(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2738(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2739(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2740(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2741(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2742(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2743(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2744(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2745(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2746(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2747(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2748(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2749(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2750(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2751(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2752(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2753(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2754(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2755(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2756(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2757(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2758(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2759(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2760(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2761(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2762(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2763(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2764(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2765(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2766(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2767(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2768(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2769(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2770(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2771(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2772(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2773(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2774(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2775(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2776(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2777(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption2778(Player player, int index, Npc npc) {}

    // Toy Soldier
    public static void npcOption2779(Player player, int index, Npc npc) {}

    // Toy Doll
    public static void npcOption2780(Player player, int index, Npc npc) {}

    // Toy Mouse
    public static void npcOption2781(Player player, int index, Npc npc) {}

    // Clockwork cat
    public static void npcOption2782(Player player, int index, Npc npc) {}

    // Hirko
    public static void npcOption2783(Player player, int index, Npc npc) {}

    // Holoy
    public static void npcOption2784(Player player, int index, Npc npc) {}

    // Hura
    public static void npcOption2785(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption2794(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption2795(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption2796(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption2797(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption2798(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption2799(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption2800(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption2801(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption2802(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption2803(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption2804(Player player, int index, Npc npc) {}
    /* 2816 - 3071 */

    // Fairy
    public static void npcOption2829(Player player, int index, Npc npc) {}

    // Orc
    public static void npcOption2832(Player player, int index, Npc npc) {}

    // Camel
    public static void npcOption2835(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption2879(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption2880(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption2882(Player player, int index, Npc npc) {}

    // Rogue
    public static void npcOption2884(Player player, int index, Npc npc) {}

    // Cook
    public static void npcOption2895(Player player, int index, Npc npc) {}

    // Cook
    public static void npcOption2896(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption2897(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Banker
    public static void npcOption2898(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // Iffie
    public static void npcOption2899(Player player, int index, Npc npc) {}

    // Elsie
    public static void npcOption2900(Player player, int index, Npc npc) {}

    // Stray dog
    public static void npcOption2902(Player player, int index, Npc npc) {}

    // Sabre-toothed kyatt
    public static void npcOption2907(Player player, int index, Npc npc) {}

    // Spined larupia
    public static void npcOption2908(Player player, int index, Npc npc) {}

    // Horned graahk
    public static void npcOption2909(Player player, int index, Npc npc) {}

    // Master fisher
    public static void npcOption2913(Player player, int index, Npc npc) {}

    // Otto Godblessed
    public static void npcOption2914(Player player, int index, Npc npc) {}

    // Stray dog
    public static void npcOption2922(Player player, int index, Npc npc) {}

    // Blast Furnace Foreman
    public static void npcOption2923(Player player, int index, Npc npc) {}

    // Squire
    public static void npcOption2949(Player player, int index, Npc npc) {}

    // Void Knight
    public static void npcOption2950(Player player, int index, Npc npc) {}

    // Void Knight
    public static void npcOption2951(Player player, int index, Npc npc) {}

    // Void Knight
    public static void npcOption2952(Player player, int index, Npc npc) {}

    // Void Knight
    public static void npcOption2953(Player player, int index, Npc npc) {}

    // King Awowogei
    public static void npcOption2972(Player player, int index, Npc npc) {}

    // King Awowogei
    public static void npcOption2974(Player player, int index, Npc npc) {}

    // Mizaru
    public static void npcOption2975(Player player, int index, Npc npc) {}

    // Kikazaru
    public static void npcOption2976(Player player, int index, Npc npc) {}

    // Iwazaru
    public static void npcOption2977(Player player, int index, Npc npc) {}

    // Velorina
    public static void npcOption2985(Player player, int index, Npc npc) {}

    // Necrovarus
    public static void npcOption2986(Player player, int index, Npc npc) {}

    // Gravingas
    public static void npcOption2987(Player player, int index, Npc npc) {}

    // Ghost disciple
    public static void npcOption2988(Player player, int index, Npc npc) {}

    // Ak-Haranu
    public static void npcOption2989(Player player, int index, Npc npc) {}

    // Robin
    public static void npcOption2995(Player player, int index, Npc npc) {}

    // Old crone
    public static void npcOption2996(Player player, int index, Npc npc) {}

    // Old man
    public static void npcOption2997(Player player, int index, Npc npc) {}

    // Ghost villager
    public static void npcOption2998(Player player, int index, Npc npc) {}

    // Ghost shopkeeper
    public static void npcOption3000(Player player, int index, Npc npc) {}

    // Ghost innkeeper
    public static void npcOption3001(Player player, int index, Npc npc) {}

    // Ghost farmer
    public static void npcOption3002(Player player, int index, Npc npc) {}

    // Ghost banker
    public static void npcOption3003(Player player, int index, Npc npc) {}

    // Ghost sailor
    public static void npcOption3004(Player player, int index, Npc npc) {}

    // Ghost captain
    public static void npcOption3005(Player player, int index, Npc npc) {}

    // Ghost captain
    public static void npcOption3006(Player player, int index, Npc npc) {}

    // Ghost guard
    public static void npcOption3007(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3010(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3011(Player player, int index, Npc npc) {}

    // Captain
    public static void npcOption3013(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3014(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption3015(Player player, int index, Npc npc) {}

    // Goblin
    public static void npcOption3047(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3055(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3056(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3057(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3058(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3059(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3060(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3061(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3062(Player player, int index, Npc npc) {}

    // Hunding
    public static void npcOption3063(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3064(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3065(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3066(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3067(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3068(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3069(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3070(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3071(Player player, int index, Npc npc) {}
    /* 3072 - 3327 */

    // Barbarian
    public static void npcOption3072(Player player, int index, Npc npc) {}

    // Hans
    public static void npcOption3077(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3078(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3079(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3080(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3081(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3082(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption3083(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption3084(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption3085(Player player, int index, Npc npc) {}

    // Farmer
    public static void npcOption3086(Player player, int index, Npc npc) {}

    // Farmer
    public static void npcOption3087(Player player, int index, Npc npc) {}

    // Farmer
    public static void npcOption3088(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3094(Player player, int index, Npc npc) {}

    // Tramp
    public static void npcOption3095(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3096(Player player, int index, Npc npc) {}

    // Hellpuppy
    public static void npcOption3099(Player player, int index, Npc npc) {}

    // Warrior woman
    public static void npcOption3100(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3101(Player player, int index, Npc npc) {}

    // Barbarian
    public static void npcOption3102(Player player, int index, Npc npc) {}

    // Paladin
    public static void npcOption3104(Player player, int index, Npc npc) {}

    // Paladin
    public static void npcOption3105(Player player, int index, Npc npc) {}

    // Hero
    public static void npcOption3106(Player player, int index, Npc npc) {}

    // Knight of Ardougne
    public static void npcOption3108(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3109(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption3110(Player player, int index, Npc npc) {}

    // Knight of Ardougne
    public static void npcOption3111(Player player, int index, Npc npc) {}

    // Zoo keeper
    public static void npcOption3113(Player player, int index, Npc npc) {}

    // Farid Morrisane (ores and bars)
    public static void npcOption3115(Player player, int index, Npc npc) {}

    // Gnome Coach
    public static void npcOption3142(Player player, int index, Npc npc) {}

    // Gnome baller
    public static void npcOption3143(Player player, int index, Npc npc) {}

    // Gnome baller
    public static void npcOption3144(Player player, int index, Npc npc) {}

    // Gnome baller
    public static void npcOption3147(Player player, int index, Npc npc) {}

    // Gnome baller
    public static void npcOption3148(Player player, int index, Npc npc) {}

    // Gnome baller
    public static void npcOption3151(Player player, int index, Npc npc) {}

    // Gnome baller
    public static void npcOption3152(Player player, int index, Npc npc) {}

    // Gnome winger
    public static void npcOption3155(Player player, int index, Npc npc) {}

    // Gnome winger
    public static void npcOption3156(Player player, int index, Npc npc) {}

    // Gnome ball referee
    public static void npcOption3157(Player player, int index, Npc npc) {}

    // Cheerleader
    public static void npcOption3158(Player player, int index, Npc npc) {}

    // Brian O'Richard
    public static void npcOption3189(Player player, int index, Npc npc) {}

    // Rogue Guard
    public static void npcOption3190(Player player, int index, Npc npc) {}

    // Rogue Guard
    public static void npcOption3191(Player player, int index, Npc npc) {}

    // Rogue Guard
    public static void npcOption3192(Player player, int index, Npc npc) {}

    // Martin Thwait
    public static void npcOption3193(Player player, int index, Npc npc) {
        player.openShop("thieving_stalls");
    }

    // Emerald Benedict
    public static void npcOption3194(Player player, int index, Npc npc) {}

    // Monkey
    public static void npcOption3200(Player player, int index, Npc npc) {}

    // Cavey Davey
    public static void npcOption3214(Player player, int index, Npc npc) {}

    // Patchy
    public static void npcOption3215(Player player, int index, Npc npc) {}

    // Melee combat tutor
    public static void npcOption3216(Player player, int index, Npc npc) {}

    // Ranged combat tutor
    public static void npcOption3217(Player player, int index, Npc npc) {}

    // Magic combat tutor
    public static void npcOption3218(Player player, int index, Npc npc) {}

    // Cooking tutor
    public static void npcOption3219(Player player, int index, Npc npc) {}

    // Crafting tutor
    public static void npcOption3220(Player player, int index, Npc npc) {}

    // Fishing tutor
    public static void npcOption3221(Player player, int index, Npc npc) {}

    // Mining tutor
    public static void npcOption3222(Player player, int index, Npc npc) {}

    // Prayer tutor
    public static void npcOption3223(Player player, int index, Npc npc) {}

    // Smithing apprentice
    public static void npcOption3224(Player player, int index, Npc npc) {}

    // Master smithing tutor
    public static void npcOption3225(Player player, int index, Npc npc) {}

    // Woodsman tutor
    public static void npcOption3226(Player player, int index, Npc npc) {}

    // Banker tutor
    public static void npcOption3227(Player player, int index, Npc npc) {}

    // Ellis
    public static void npcOption3231(Player player, int index, Npc npc) {}

    // Wizard
    public static void npcOption3232(Player player, int index, Npc npc) {}

    // Blandebir
    public static void npcOption3241(Player player, int index, Npc npc) {}

    // Metarialus
    public static void npcOption3242(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3245(Player player, int index, Npc npc) {}

    // Wizard Frumscone
    public static void npcOption3246(Player player, int index, Npc npc) {}

    // Magic Store owner
    public static void npcOption3247(Player player, int index, Npc npc) {}

    // Wizard Distentor
    public static void npcOption3248(Player player, int index, Npc npc) {}

    // Robe Store owner
    public static void npcOption3249(Player player, int index, Npc npc) {}

    // Door man
    public static void npcOption3250(Player player, int index, Npc npc) {}

    // Watchman
    public static void npcOption3251(Player player, int index, Npc npc) {}

    // Wyson the gardener
    public static void npcOption3253(Player player, int index, Npc npc) {
        int[] moleItemIDs = new int[] {
            7416, 7417, 7418, 7419
        };
        for (int itemID : moleItemIDs) {
            int count = Math.min(player.getInventory().getCount(itemID), player.getInventory().getRemainingSlots());
            player.getInventory().deleteItem(itemID, count);
            for (int i = 0; i < count; i++) {
                if (Utils.randomE(10) == 0) {
                    player.getInventory().addItem(5075, 1);
                } else if (Utils.randomE(5) == 0) {
                    player.getInventory().addItem(5074, 1);
                } else {
                    player.getInventory().addItem(7413, 1);
                }
            }
        }
    }

    // Sigbert the Adventurer
    public static void npcOption3254(Player player, int index, Npc npc) {}

    // Shipyard worker
    public static void npcOption3255(Player player, int index, Npc npc) {}

    // Shipyard worker
    public static void npcOption3256(Player player, int index, Npc npc) {}

    // Master Farmer
    public static void npcOption3257(Player player, int index, Npc npc) {}

    // Master Farmer
    public static void npcOption3258(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3260(Player player, int index, Npc npc) {}

    // Gee
    public static void npcOption3261(Player player, int index, Npc npc) {}

    // Donie
    public static void npcOption3262(Player player, int index, Npc npc) {}

    // Drunken man
    public static void npcOption3263(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3264(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3265(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3266(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption3267(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption3268(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3269(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3270(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3271(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3272(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3273(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3274(Player player, int index, Npc npc) {}

    // Gardener
    public static void npcOption3275(Player player, int index, Npc npc) {}

    // Gardener
    public static void npcOption3276(Player player, int index, Npc npc) {}

    // Apprentice workman
    public static void npcOption3277(Player player, int index, Npc npc) {}

    // Workman
    public static void npcOption3278(Player player, int index, Npc npc) {}

    // Cuffs
    public static void npcOption3279(Player player, int index, Npc npc) {}

    // Narf
    public static void npcOption3280(Player player, int index, Npc npc) {}

    // Rusty
    public static void npcOption3281(Player player, int index, Npc npc) {}

    // Jeff
    public static void npcOption3282(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3283(Player player, int index, Npc npc) {}

    // Hengel
    public static void npcOption3284(Player player, int index, Npc npc) {}

    // Anja
    public static void npcOption3285(Player player, int index, Npc npc) {}

    // Postie Pete
    public static void npcOption3291(Player player, int index, Npc npc) {}

    // null
    public static void npcOption3292(Player player, int index, Npc npc) {}

    // null
    public static void npcOption3294(Player player, int index, Npc npc) {}

    // null
    public static void npcOption3297(Player player, int index, Npc npc) {}

    // null
    public static void npcOption3301(Player player, int index, Npc npc) {}

    // null
    public static void npcOption3303(Player player, int index, Npc npc) {}

    // Master Chef
    public static void npcOption3305(Player player, int index, Npc npc) {}

    // Survival Expert
    public static void npcOption3306(Player player, int index, Npc npc) {}

    // Combat Instructor
    public static void npcOption3307(Player player, int index, Npc npc) {}

    // RuneScape Guide
    public static void npcOption3308(Player player, int index, Npc npc) {}

    // Magic Instructor
    public static void npcOption3309(Player player, int index, Npc npc) {}

    // Financial Advisor
    public static void npcOption3310(Player player, int index, Npc npc) {}

    // Mining Instructor
    public static void npcOption3311(Player player, int index, Npc npc) {}

    // Quest Guide
    public static void npcOption3312(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption3317(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption3318(Player player, int index, Npc npc) {}

    // Brother Brace
    public static void npcOption3319(Player player, int index, Npc npc) {}

    // Skippy
    public static void npcOption3320(Player player, int index, Npc npc) {}

    // Larxus
    public static void npcOption3321(Player player, int index, Npc npc) {}
    /* 3328 - 3583 */

    // Mubariz
    public static void npcOption3331(Player player, int index, Npc npc) {}

    // Fadli
    public static void npcOption3340(Player player, int index, Npc npc) {}

    // A'abla
    public static void npcOption3341(Player player, int index, Npc npc) {}

    // Sabreen
    public static void npcOption3342(Player player, int index, Npc npc) {}

    // Surgeon General Tafani
    public static void npcOption3343(Player player, int index, Npc npc) {
        player.setGraphic(436);
        player.getGameEncoder().sendMessage("Surgeon General Tafani restores you.");
        player.rejuvenate();
    }

    // Jaraah
    public static void npcOption3344(Player player, int index, Npc npc) {}

    // Zahwa
    public static void npcOption3345(Player player, int index, Npc npc) {}

    // Ima
    public static void npcOption3346(Player player, int index, Npc npc) {}

    // Sabeil
    public static void npcOption3347(Player player, int index, Npc npc) {}

    // Jadid
    public static void npcOption3348(Player player, int index, Npc npc) {}

    // Dalal
    public static void npcOption3349(Player player, int index, Npc npc) {}

    // Afrah
    public static void npcOption3350(Player player, int index, Npc npc) {}

    // Jeed
    public static void npcOption3351(Player player, int index, Npc npc) {}

    // Hamid
    public static void npcOption3352(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption3361(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption3362(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption3363(Player player, int index, Npc npc) {}

    // Stankers
    public static void npcOption3364(Player player, int index, Npc npc) {}

    // Juan
    public static void npcOption3369(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3370(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3371(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3372(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3373(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3374(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3375(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3376(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3377(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3378(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3379(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3380(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3381(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3382(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3383(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3384(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3385(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3386(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3387(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3401(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3402(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3403(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3404(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3405(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3406(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3407(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3408(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3409(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3410(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3411(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3412(Player player, int index, Npc npc) {}

    // Koftik
    public static void npcOption3413(Player player, int index, Npc npc) {}

    // Idris
    public static void npcOption3414(Player player, int index, Npc npc) {}

    // Essyllt
    public static void npcOption3415(Player player, int index, Npc npc) {}

    // Morvran
    public static void npcOption3416(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption3417(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption3418(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption3419(Player player, int index, Npc npc) {}

    // Lord Iorwerth
    public static void npcOption3427(Player player, int index, Npc npc) {}

    // Elven city guard
    public static void npcOption3430(Player player, int index, Npc npc) {}

    // Elf warrior
    public static void npcOption3431(Player player, int index, Npc npc) {}

    // Arianwyn
    public static void npcOption3432(Player player, int index, Npc npc) {}

    // Tyras guard
    public static void npcOption3433(Player player, int index, Npc npc) {}

    // Tyras guard
    public static void npcOption3434(Player player, int index, Npc npc) {}

    // Tyras guard
    public static void npcOption3435(Player player, int index, Npc npc) {}

    // Tyras guard
    public static void npcOption3436(Player player, int index, Npc npc) {}

    // General Hining
    public static void npcOption3437(Player player, int index, Npc npc) {}

    // Quartermaster
    public static void npcOption3438(Player player, int index, Npc npc) {}

    // Ali the dyer
    public static void npcOption3442(Player player, int index, Npc npc) {}

    // Lucien
    public static void npcOption3443(Player player, int index, Npc npc) {}

    // Lucien
    public static void npcOption3444(Player player, int index, Npc npc) {}

    // Guardian of Armadyl
    public static void npcOption3445(Player player, int index, Npc npc) {}

    // Guardian of Armadyl
    public static void npcOption3446(Player player, int index, Npc npc) {}

    // Winelda
    public static void npcOption3447(Player player, int index, Npc npc) {}

    // Fire Warrior of Lesarkus
    public static void npcOption3448(Player player, int index, Npc npc) {}

    // Mysterious ghost
    public static void npcOption3450(Player player, int index, Npc npc) {}

    // Mysterious ghost
    public static void npcOption3451(Player player, int index, Npc npc) {}

    // Mysterious ghost
    public static void npcOption3452(Player player, int index, Npc npc) {}

    // Mysterious ghost
    public static void npcOption3453(Player player, int index, Npc npc) {}

    // Mysterious ghost
    public static void npcOption3454(Player player, int index, Npc npc) {}

    // Mysterious ghost
    public static void npcOption3455(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3457(Player player, int index, Npc npc) {}

    // Ruantun
    public static void npcOption3461(Player player, int index, Npc npc) {}

    // Cyrisus
    public static void npcOption3462(Player player, int index, Npc npc) {}

    // Cyrisus
    public static void npcOption3463(Player player, int index, Npc npc) {}

    // Cyrisus
    public static void npcOption3464(Player player, int index, Npc npc) {}

    // Fallen Man
    public static void npcOption3465(Player player, int index, Npc npc) {}

    // Fallen Man
    public static void npcOption3466(Player player, int index, Npc npc) {}

    // Cyrisus
    public static void npcOption3467(Player player, int index, Npc npc) {}

    // Cyrisus
    public static void npcOption3468(Player player, int index, Npc npc) {}

    // Cyrisus
    public static void npcOption3469(Player player, int index, Npc npc) {}

    // Cyrisus
    public static void npcOption3470(Player player, int index, Npc npc) {}

    // Cyrisus
    public static void npcOption3471(Player player, int index, Npc npc) {}

    // 'Bird's-Eye' Jack
    public static void npcOption3472(Player player, int index, Npc npc) {}

    // Morgan
    public static void npcOption3479(Player player, int index, Npc npc) {}

    // Dr Harlow
    public static void npcOption3480(Player player, int index, Npc npc) {}

    // Drezel
    public static void npcOption3488(Player player, int index, Npc npc) {}

    // Drezel
    public static void npcOption3489(Player player, int index, Npc npc) {}

    // Jorral
    public static void npcOption3490(Player player, int index, Npc npc) {}

    // Melina
    public static void npcOption3492(Player player, int index, Npc npc) {}

    // Droalak
    public static void npcOption3494(Player player, int index, Npc npc) {}

    // Dron
    public static void npcOption3495(Player player, int index, Npc npc) {}

    // Blanin
    public static void npcOption3496(Player player, int index, Npc npc) {}

    // Gertrude's cat
    public static void npcOption3497(Player player, int index, Npc npc) {}

    // Crate
    public static void npcOption3499(Player player, int index, Npc npc) {}

    // Gertrude
    public static void npcOption3500(Player player, int index, Npc npc) {}

    // Shilop
    public static void npcOption3501(Player player, int index, Npc npc) {}

    // Philop
    public static void npcOption3502(Player player, int index, Npc npc) {}

    // Wilough
    public static void npcOption3503(Player player, int index, Npc npc) {}

    // Kanel
    public static void npcOption3504(Player player, int index, Npc npc) {}

    // Civilian
    public static void npcOption3505(Player player, int index, Npc npc) {}

    // Civilian
    public static void npcOption3506(Player player, int index, Npc npc) {}

    // Civilian
    public static void npcOption3507(Player player, int index, Npc npc) {}

    // General Khazard
    public static void npcOption3510(Player player, int index, Npc npc) {}

    // Scout
    public static void npcOption3511(Player player, int index, Npc npc) {}

    // Scout
    public static void npcOption3512(Player player, int index, Npc npc) {}

    // Scout
    public static void npcOption3513(Player player, int index, Npc npc) {}

    // Scout
    public static void npcOption3514(Player player, int index, Npc npc) {}

    // Sin Seer
    public static void npcOption3515(Player player, int index, Npc npc) {}

    // Ghost
    public static void npcOption3516(Player player, int index, Npc npc) {}

    // Sir Lancelot
    public static void npcOption3519(Player player, int index, Npc npc) {}

    // Sir Gawain
    public static void npcOption3520(Player player, int index, Npc npc) {}

    // Sir Kay
    public static void npcOption3521(Player player, int index, Npc npc) {}

    // Sir Bedivere
    public static void npcOption3522(Player player, int index, Npc npc) {}

    // Sir Tristram
    public static void npcOption3523(Player player, int index, Npc npc) {}

    // Sir Pelleas
    public static void npcOption3524(Player player, int index, Npc npc) {}

    // Sir Lucan
    public static void npcOption3525(Player player, int index, Npc npc) {}

    // Sir Palomedes
    public static void npcOption3526(Player player, int index, Npc npc) {}

    // Sir Mordred
    public static void npcOption3527(Player player, int index, Npc npc) {}

    // Morgan Le Faye
    public static void npcOption3528(Player player, int index, Npc npc) {}

    // Merlin
    public static void npcOption3529(Player player, int index, Npc npc) {}

    // The Lady of the Lake
    public static void npcOption3530(Player player, int index, Npc npc) {}

    // King Arthur
    public static void npcOption3531(Player player, int index, Npc npc) {}

    // Beggar
    public static void npcOption3532(Player player, int index, Npc npc) {}

    // Ali Morrisane
    public static void npcOption3533(Player player, int index, Npc npc) {}

    // Drunken Ali
    public static void npcOption3534(Player player, int index, Npc npc) {}

    // Ali The barman
    public static void npcOption3535(Player player, int index, Npc npc) {}

    // Ali the Kebab seller
    public static void npcOption3536(Player player, int index, Npc npc) {}

    // Market seller
    public static void npcOption3537(Player player, int index, Npc npc) {}

    // Ali the Camel Man
    public static void npcOption3538(Player player, int index, Npc npc) {}

    // Street urchin
    public static void npcOption3539(Player player, int index, Npc npc) {}

    // Ali the Mayor
    public static void npcOption3540(Player player, int index, Npc npc) {}

    // Ali the Hag
    public static void npcOption3541(Player player, int index, Npc npc) {}

    // Ali the Snake Charmer
    public static void npcOption3542(Player player, int index, Npc npc) {}

    // Ali the Camel
    public static void npcOption3543(Player player, int index, Npc npc) {}

    // Blackjack seller
    public static void npcOption3546(Player player, int index, Npc npc) {}

    // Menaphite Leader
    public static void npcOption3547(Player player, int index, Npc npc) {}

    // Ali the Operator
    public static void npcOption3548(Player player, int index, Npc npc) {}

    // Menaphite Thug
    public static void npcOption3549(Player player, int index, Npc npc) {}

    // Menaphite Thug
    public static void npcOption3550(Player player, int index, Npc npc) {}

    // Villager
    public static void npcOption3552(Player player, int index, Npc npc) {}

    // Villager
    public static void npcOption3553(Player player, int index, Npc npc) {}

    // Villager
    public static void npcOption3554(Player player, int index, Npc npc) {}

    // Villager
    public static void npcOption3555(Player player, int index, Npc npc) {}

    // Villager
    public static void npcOption3556(Player player, int index, Npc npc) {}

    // Villager
    public static void npcOption3557(Player player, int index, Npc npc) {}

    // Villager
    public static void npcOption3558(Player player, int index, Npc npc) {}

    // Villager
    public static void npcOption3559(Player player, int index, Npc npc) {}

    // Villager
    public static void npcOption3560(Player player, int index, Npc npc) {}

    // Veronica
    public static void npcOption3561(Player player, int index, Npc npc) {}

    // Professor Oddenstein
    public static void npcOption3562(Player player, int index, Npc npc) {}

    // Pentyn
    public static void npcOption3568(Player player, int index, Npc npc) {}

    // Aristarchus
    public static void npcOption3569(Player player, int index, Npc npc) {}

    // Boneguard
    public static void npcOption3570(Player player, int index, Npc npc) {}

    // Pile of bones
    public static void npcOption3571(Player player, int index, Npc npc) {}

    // Desert Spirit
    public static void npcOption3572(Player player, int index, Npc npc) {}

    // Crust of ice
    public static void npcOption3573(Player player, int index, Npc npc) {}

    // Furnace grate
    public static void npcOption3574(Player player, int index, Npc npc) {}

    // Enakhra
    public static void npcOption3575(Player player, int index, Npc npc) {}

    // Boneguard
    public static void npcOption3577(Player player, int index, Npc npc) {}

    // Akthanakos
    public static void npcOption3578(Player player, int index, Npc npc) {}

    // Akthanakos
    public static void npcOption3579(Player player, int index, Npc npc) {}

    // Lazim
    public static void npcOption3580(Player player, int index, Npc npc) {}
    /* 3584 - 3839 */

    // Effigy
    public static void npcOption3585(Player player, int index, Npc npc) {}

    // Bonafido
    public static void npcOption3587(Player player, int index, Npc npc) {}

    // Homunculus
    public static void npcOption3588(Player player, int index, Npc npc) {}

    // Homunculus
    public static void npcOption3589(Player player, int index, Npc npc) {}

    // Homunculus
    public static void npcOption3590(Player player, int index, Npc npc) {}

    // 'Transmute' The Alchemist
    public static void npcOption3592(Player player, int index, Npc npc) {}

    // 'Currency' The Alchemist
    public static void npcOption3594(Player player, int index, Npc npc) {}

    // 'Black-eye'
    public static void npcOption3596(Player player, int index, Npc npc) {}

    // 'No fingers'
    public static void npcOption3597(Player player, int index, Npc npc) {}

    // 'Gummy'
    public static void npcOption3598(Player player, int index, Npc npc) {}

    // 'The Guns'
    public static void npcOption3599(Player player, int index, Npc npc) {}

    // Brother Kojo
    public static void npcOption3606(Player player, int index, Npc npc) {}

    // Zealot
    public static void npcOption3611(Player player, int index, Npc npc) {
        player.openDialogue("hauntedmine", 0);
    }

    // Iron pickaxe
    public static void npcOption3613(Player player, int index, Npc npc) {}

    // Innocent-looking key
    public static void npcOption3619(Player player, int index, Npc npc) {
        if (player.getCombat().getHauntedMine() < 2 || player.getWorld().getTargetNPC(3616, player) != null) {
            player.getGameEncoder().sendMessage("Nothing interesting happens.");
            return;
        } else if (player.getCombat().getHauntedMine() == 2) {
            Npc treus = new Npc(player.getController(), 3616, new Tile(2788, 4457, player.getHeight()));
            treus.getCombat().setTarget(player);
        } else if (player.getCombat().getHauntedMine() >= 3) {
            player.getInventory().addItem(4077, 1);
        }
    }

    // Digsite workman
    public static void npcOption3628(Player player, int index, Npc npc) {}

    // Doug Deeping
    public static void npcOption3629(Player player, int index, Npc npc) {}

    // Digsite workman
    public static void npcOption3630(Player player, int index, Npc npc) {}

    // Digsite workman
    public static void npcOption3631(Player player, int index, Npc npc) {}

    // Student
    public static void npcOption3632(Player player, int index, Npc npc) {}

    // Student
    public static void npcOption3633(Player player, int index, Npc npc) {}

    // Student
    public static void npcOption3634(Player player, int index, Npc npc) {}

    // Examiner
    public static void npcOption3635(Player player, int index, Npc npc) {}

    // Examiner
    public static void npcOption3636(Player player, int index, Npc npc) {}

    // Examiner
    public static void npcOption3637(Player player, int index, Npc npc) {}

    // Researcher
    public static void npcOption3638(Player player, int index, Npc npc) {}

    // Archaeological expert
    public static void npcOption3639(Player player, int index, Npc npc) {}

    // Panning guide
    public static void npcOption3640(Player player, int index, Npc npc) {}

    // Redbeard Frank
    public static void npcOption3643(Player player, int index, Npc npc) {}

    // Captain Tobias
    public static void npcOption3644(Player player, int index, Npc npc) {}

    // Seaman Lorris
    public static void npcOption3645(Player player, int index, Npc npc) {}

    // Seaman Thresnor
    public static void npcOption3646(Player player, int index, Npc npc) {}

    // Luthas
    public static void npcOption3647(Player player, int index, Npc npc) {}

    // Customs officer
    public static void npcOption3648(Player player, int index, Npc npc) {}

    // Captain Barnaby
    public static void npcOption3649(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption3652(Player player, int index, Npc npc) {}

    // Lumberjack Leif
    public static void npcOption3653(Player player, int index, Npc npc) {}

    // Miner Magnus
    public static void npcOption3654(Player player, int index, Npc npc) {}

    // Fisherman Frodi
    public static void npcOption3655(Player player, int index, Npc npc) {}

    // Gardener Gunnhild
    public static void npcOption3656(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption3657(Player player, int index, Npc npc) {}

    // Carpenter Kjallak
    public static void npcOption3658(Player player, int index, Npc npc) {}

    // Farmer Fromund
    public static void npcOption3659(Player player, int index, Npc npc) {}

    // Prince Brand
    public static void npcOption3666(Player player, int index, Npc npc) {}

    // Princess Astrid
    public static void npcOption3667(Player player, int index, Npc npc) {}

    // King Vargas
    public static void npcOption3668(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption3669(Player player, int index, Npc npc) {}

    // Derrik
    public static void npcOption3671(Player player, int index, Npc npc) {}

    // Flower Girl
    public static void npcOption3673(Player player, int index, Npc npc) {}

    // Ragnar
    public static void npcOption3674(Player player, int index, Npc npc) {}

    // Einar
    public static void npcOption3675(Player player, int index, Npc npc) {}

    // Alrik
    public static void npcOption3676(Player player, int index, Npc npc) {}

    // Thorhild
    public static void npcOption3677(Player player, int index, Npc npc) {}

    // Halla
    public static void npcOption3678(Player player, int index, Npc npc) {}

    // Yrsa
    public static void npcOption3679(Player player, int index, Npc npc) {}

    // Sailor
    public static void npcOption3680(Player player, int index, Npc npc) {}

    // Rannveig
    public static void npcOption3681(Player player, int index, Npc npc) {}

    // Thora
    public static void npcOption3682(Player player, int index, Npc npc) {}

    // Valgerd
    public static void npcOption3683(Player player, int index, Npc npc) {}

    // Skraeling
    public static void npcOption3684(Player player, int index, Npc npc) {}

    // Broddi
    public static void npcOption3685(Player player, int index, Npc npc) {}

    // Skraeling
    public static void npcOption3686(Player player, int index, Npc npc) {}

    // Ragnvald
    public static void npcOption3687(Player player, int index, Npc npc) {}

    // Fishmonger
    public static void npcOption3688(Player player, int index, Npc npc) {}

    // Greengrocer
    public static void npcOption3689(Player player, int index, Npc npc) {}

    // Juvinate guard
    public static void npcOption3690(Player player, int index, Npc npc) {}

    // Juvinate guard
    public static void npcOption3691(Player player, int index, Npc npc) {}

    // Vampyre juvenile
    public static void npcOption3692(Player player, int index, Npc npc) {}

    // Vampyre juvenile
    public static void npcOption3693(Player player, int index, Npc npc) {}

    // Vampyre juvinate
    public static void npcOption3694(Player player, int index, Npc npc) {}

    // Vampyre juvinate
    public static void npcOption3695(Player player, int index, Npc npc) {}

    // Held vampyre juvenile
    public static void npcOption3696(Player player, int index, Npc npc) {}

    // Held vampyre juvenile
    public static void npcOption3697(Player player, int index, Npc npc) {}

    // Held vampyre juvinate
    public static void npcOption3698(Player player, int index, Npc npc) {}

    // Held vampyre juvinate
    public static void npcOption3699(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3709(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3710(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3711(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3712(Player player, int index, Npc npc) {}

    // Flying female vampire
    public static void npcOption3713(Player player, int index, Npc npc) {}

    // Flying female vampire
    public static void npcOption3714(Player player, int index, Npc npc) {}

    // Flying female vampire
    public static void npcOption3715(Player player, int index, Npc npc) {}

    // Flying female vampire
    public static void npcOption3716(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3717(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3718(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3719(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3720(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3721(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3722(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3723(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3724(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3725(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3726(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3727(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3728(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3729(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3730(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3731(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3732(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3748(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3749(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3750(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3751(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3752(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3753(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3754(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3755(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3756(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3757(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3758(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3759(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3760(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3761(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3762(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3763(Player player, int index, Npc npc) {}

    // Flying female vampire
    public static void npcOption3764(Player player, int index, Npc npc) {}

    // Flying female vampire
    public static void npcOption3765(Player player, int index, Npc npc) {}

    // Flying female vampire
    public static void npcOption3766(Player player, int index, Npc npc) {}

    // Flying female vampire
    public static void npcOption3767(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3768(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3769(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3770(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption3771(Player player, int index, Npc npc) {}

    // Old Man Ral
    public static void npcOption3772(Player player, int index, Npc npc) {}

    // Vertida Sefalatis
    public static void npcOption3773(Player player, int index, Npc npc) {}

    // Aeonisig Raispher
    public static void npcOption3774(Player player, int index, Npc npc) {}

    // Safalaan
    public static void npcOption3775(Player player, int index, Npc npc) {}

    // Sarius Guile
    public static void npcOption3776(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption3777(Player player, int index, Npc npc) {}

    // Trader Sven
    public static void npcOption3779(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3780(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3781(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3782(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3783(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3784(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3785(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3786(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3787(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3788(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3789(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3790(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3791(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3792(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3793(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3794(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3795(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3796(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3797(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3798(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3799(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3800(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3801(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3802(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3803(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3804(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3805(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3806(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3807(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption3808(Player player, int index, Npc npc) {}

    // A Meiyerditch child
    public static void npcOption3809(Player player, int index, Npc npc) {}

    // A Meiyerditch child
    public static void npcOption3810(Player player, int index, Npc npc) {}

    // A Meiyerditch child
    public static void npcOption3811(Player player, int index, Npc npc) {}

    // A Meiyerditch child
    public static void npcOption3812(Player player, int index, Npc npc) {}

    // A Meiyerditch child
    public static void npcOption3813(Player player, int index, Npc npc) {}

    // A Meiyerditch child
    public static void npcOption3814(Player player, int index, Npc npc) {}

    // A Meiyerditch child
    public static void npcOption3815(Player player, int index, Npc npc) {}

    // A Meiyerditch child
    public static void npcOption3816(Player player, int index, Npc npc) {}

    // A Meiyerditch child
    public static void npcOption3817(Player player, int index, Npc npc) {}

    // A Meiyerditch child
    public static void npcOption3818(Player player, int index, Npc npc) {}

    // Meiyerditch miner
    public static void npcOption3819(Player player, int index, Npc npc) {}

    // Meiyerditch miner
    public static void npcOption3820(Player player, int index, Npc npc) {}

    // Meiyerditch miner
    public static void npcOption3821(Player player, int index, Npc npc) {}

    // Meiyerditch miner
    public static void npcOption3822(Player player, int index, Npc npc) {}

    // Meiyerditch miner
    public static void npcOption3823(Player player, int index, Npc npc) {}

    // Meiyerditch miner
    public static void npcOption3824(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption3831(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption3832(Player player, int index, Npc npc) {}

    // Oneiromancer
    public static void npcOption3835(Player player, int index, Npc npc) {
        player.openDialogue("dreammentor", 0);
    }

    // House
    public static void npcOption3836(Player player, int index, Npc npc) {}

    // Baba Yaga
    public static void npcOption3837(Player player, int index, Npc npc) {}

    // Pauline Polaris
    public static void npcOption3838(Player player, int index, Npc npc) {}

    // Meteora
    public static void npcOption3839(Player player, int index, Npc npc) {}
    /* 3840 - 4095 */

    // Melana Moonlander
    public static void npcOption3840(Player player, int index, Npc npc) {}

    // Selene
    public static void npcOption3841(Player player, int index, Npc npc) {}

    // Rimae Sirsalis
    public static void npcOption3842(Player player, int index, Npc npc) {}

    // Sirsal Banker
    public static void npcOption3843(Player player, int index, Npc npc) {}

    // Bouquet Mac Hyacinth
    public static void npcOption3850(Player player, int index, Npc npc) {}

    // Parrot
    public static void npcOption3853(Player player, int index, Npc npc) {}

    // Lokar Searunner
    public static void npcOption3855(Player player, int index, Npc npc) {}

    // Cabin boy
    public static void npcOption3856(Player player, int index, Npc npc) {}

    // 'Beefy' Burns
    public static void npcOption3858(Player player, int index, Npc npc) {}

    // 'Eagle-eye' Shultz
    public static void npcOption3859(Player player, int index, Npc npc) {}

    // First mate 'Davey-boy'
    public static void npcOption3860(Player player, int index, Npc npc) {}

    // 'Birds-Eye' Jack
    public static void npcOption3861(Player player, int index, Npc npc) {}

    // 'Picarron' Pete
    public static void npcOption3862(Player player, int index, Npc npc) {}

    // Bedread the bold
    public static void npcOption3864(Player player, int index, Npc npc) {}

    // Tommy 2-times
    public static void npcOption3866(Player player, int index, Npc npc) {}

    // Murky Pat
    public static void npcOption3867(Player player, int index, Npc npc) {}

    // Jack Sails
    public static void npcOption3868(Player player, int index, Npc npc) {}

    // 'Betty' B.Boppin
    public static void npcOption3870(Player player, int index, Npc npc) {}

    // 'Beedy-eye' Jones
    public static void npcOption3871(Player player, int index, Npc npc) {}

    // Jenny Blade
    public static void npcOption3872(Player player, int index, Npc npc) {}

    // 'Lecherous' Lee
    public static void npcOption3873(Player player, int index, Npc npc) {}

    // 'Sticky' Sanders
    public static void npcOption3874(Player player, int index, Npc npc) {}

    // Jex
    public static void npcOption3875(Player player, int index, Npc npc) {}

    // Maisa
    public static void npcOption3876(Player player, int index, Npc npc) {}

    // Osman
    public static void npcOption3877(Player player, int index, Npc npc) {}

    // Osman
    public static void npcOption3878(Player player, int index, Npc npc) {}

    // Sophanem guard
    public static void npcOption3881(Player player, int index, Npc npc) {}

    // Sophanem guard
    public static void npcOption3882(Player player, int index, Npc npc) {}

    // Sophanem guard
    public static void npcOption3883(Player player, int index, Npc npc) {}

    // Sophanem guard
    public static void npcOption3884(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption3887(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption3888(Player player, int index, Npc npc) {}

    // Stone mason
    public static void npcOption3889(Player player, int index, Npc npc) {}

    // Nathifa
    public static void npcOption3890(Player player, int index, Npc npc) {}

    // Urbi
    public static void npcOption3891(Player player, int index, Npc npc) {}

    // Jamila
    public static void npcOption3892(Player player, int index, Npc npc) {}

    // Doric
    public static void npcOption3893(Player player, int index, Npc npc) {}

    // Sigmund The Merchant
    public static void npcOption3894(Player player, int index, Npc npc) {}

    // Peer the Seer
    public static void npcOption3895(Player player, int index, Npc npc) {}

    // Thorvald the Warrior
    public static void npcOption3896(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption3913(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption3914(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption3915(Player player, int index, Npc npc) {}

    // Bjorn
    public static void npcOption3916(Player player, int index, Npc npc) {}

    // Eldgrim
    public static void npcOption3917(Player player, int index, Npc npc) {}

    // Manni the Reveller
    public static void npcOption3920(Player player, int index, Npc npc) {}

    // Council workman
    public static void npcOption3921(Player player, int index, Npc npc) {}

    // Sigli the Huntsman
    public static void npcOption3924(Player player, int index, Npc npc) {}

    // Swensen the Navigator
    public static void npcOption3925(Player player, int index, Npc npc) {}

    // Brundt the Chieftain
    public static void npcOption3926(Player player, int index, Npc npc) {}

    // Askeladden
    public static void npcOption3927(Player player, int index, Npc npc) {}

    // Thora the Barkeep
    public static void npcOption3932(Player player, int index, Npc npc) {}

    // Yrsa
    public static void npcOption3933(Player player, int index, Npc npc) {}

    // Fisherman
    public static void npcOption3934(Player player, int index, Npc npc) {}

    // Skulgrimen
    public static void npcOption3935(Player player, int index, Npc npc) {}

    // Sailor
    public static void npcOption3936(Player player, int index, Npc npc) {}

    // Agnar
    public static void npcOption3937(Player player, int index, Npc npc) {}

    // Freidir
    public static void npcOption3938(Player player, int index, Npc npc) {}

    // Borrokar
    public static void npcOption3939(Player player, int index, Npc npc) {}

    // Lanzig
    public static void npcOption3940(Player player, int index, Npc npc) {}

    // Pontak
    public static void npcOption3941(Player player, int index, Npc npc) {}

    // Freygerd
    public static void npcOption3942(Player player, int index, Npc npc) {}

    // Lensa
    public static void npcOption3943(Player player, int index, Npc npc) {}

    // Jennella
    public static void npcOption3944(Player player, int index, Npc npc) {}

    // Sassilik
    public static void npcOption3945(Player player, int index, Npc npc) {}

    // Inga
    public static void npcOption3946(Player player, int index, Npc npc) {}

    // Fish monger
    public static void npcOption3947(Player player, int index, Npc npc) {}

    // Fur trader
    public static void npcOption3948(Player player, int index, Npc npc) {}

    // Legends guard
    public static void npcOption3951(Player player, int index, Npc npc) {}

    // Legends guard
    public static void npcOption3952(Player player, int index, Npc npc) {}

    // Radimus Erkle
    public static void npcOption3953(Player player, int index, Npc npc) {
        if (!player.getCombat().isLegendsQuestComplete()) {
            if (player.getCombat().getRecipeForDisasterStage() != 6) {
                player.getGameEncoder().sendMessage("You need to complete Recipe for Disaster.");
                return;
            } else if (!player.getCombat().getHorrorFromTheDeep()) {
                player.getGameEncoder().sendMessage("You need to complete Horror from the Deep.");
                return;
            } else if (!player.getCombat().getDreamMentor()) {
                player.getGameEncoder().sendMessage("You need to complete Dream Mentor.");
                return;
            } else if (!player.getCombat().getMageArena()) {
                player.getGameEncoder().sendMessage("You need to complete the Mage Arena.");
                return;
            } else if (!player.getCombat().getLostCity()) {
                player.getGameEncoder().sendMessage("You need to complete Lost City.");
                return;
            } else if (!player.getCombat().getDragonSlayer()) {
                player.getGameEncoder().sendMessage("You need to complete Dragon Slayer.");
                return;
            } else if (!player.getCombat().getMonkeyMadness()) {
                player.getGameEncoder().sendMessage("You need to complete Monkey Madness.");
                return;
            } else if (player.getCombat().getHauntedMine() <= 3) {
                player.getGameEncoder().sendMessage("You need to complete Haunted Mine.");
                return;
            }
            player.getMovement().teleport(2774, 9338, 0);
        } else {
            player.getMovement().teleport(2728, 3351, 0);
        }
    }

    // Jungle forester
    public static void npcOption3954(Player player, int index, Npc npc) {}

    // Jungle forester
    public static void npcOption3955(Player player, int index, Npc npc) {}

    // Gujuo
    public static void npcOption3956(Player player, int index, Npc npc) {}

    // Ungadulu
    public static void npcOption3957(Player player, int index, Npc npc) {
        if (player.getCombat().getLegendsQuest() == 0 && player.carryingItem(730)
                && player.getWorld().getTargetNPC(3962, player) == null) {
            player.getGameEncoder()
                    .sendMessage("You open the book and a light starts emanating, illuminating Ungadulu.");
            player.getPrayer().adjustPoints(-99);
            Npc nezikchened = new Npc(player.getController(), 3962, new Tile(2792, 9328, player.getHeight()));
            nezikchened.setForceMessage("Your faith will help you little here.");
            nezikchened.getCombat().setTarget(player);
        } else if (player.getCombat().getLegendsQuest() == 2 && player.carryingItem(746)) {
            player.getInventory().deleteItem(746, 1);
            player.getInventory().addItem(748, 1);
            player.getMovement().teleport(2792, 9337, 0);
            player.getGameEncoder()
                    .sendMessage("Ungadulu gives you a water purifying spell in exchange for the dagger.");
        } else {
            player.getGameEncoder().sendMessage("You try to speak to Ungadulu, but he ignores you.");
        }
    }

    // Ungadulu
    public static void npcOption3958(Player player, int index, Npc npc) {}

    // Fionella
    public static void npcOption3960(Player player, int index, Npc npc) {}

    // Siegfried Erkle
    public static void npcOption3961(Player player, int index, Npc npc) {
        if (player.isGameModeNormal() || player.isGameModeHard()) {
            player.openShop("legends");
        } else {
            player.openShop("legends_iron");
        }
    }

    // Viyeldi
    public static void npcOption3963(Player player, int index, Npc npc) {}

    // San Tojalon
    public static void npcOption3964(Player player, int index, Npc npc) {}

    // Irvig Senay
    public static void npcOption3965(Player player, int index, Npc npc) {}

    // Ranalph Devere
    public static void npcOption3966(Player player, int index, Npc npc) {}

    // Boulder
    public static void npcOption3967(Player player, int index, Npc npc) {
        if (player.getCombat().getLegendsQuest() == 2) {
            player.getGameEncoder().sendMessage("You search around the rock and discover a dagger on the ground.");
            player.getGameEncoder().sendMessage("Ungadulu might be able to do something with this.");
            player.getInventory().addOrDropItem(746, 1);
        }
    }

    // Echned Zekin
    public static void npcOption3968(Player player, int index, Npc npc) {}

    // Ghost
    public static void npcOption3975(Player player, int index, Npc npc) {}

    // Ghost
    public static void npcOption3976(Player player, int index, Npc npc) {}

    // Ghost
    public static void npcOption3977(Player player, int index, Npc npc) {}

    // Ghost
    public static void npcOption3978(Player player, int index, Npc npc) {}

    // Ghost
    public static void npcOption3979(Player player, int index, Npc npc) {}

    // Councillor Halgrive
    public static void npcOption3983(Player player, int index, Npc npc) {}

    // Doctor Orbon
    public static void npcOption3984(Player player, int index, Npc npc) {}

    // Farmer Brumty
    public static void npcOption3985(Player player, int index, Npc npc) {}

    // Sick-looking sheep (1)
    public static void npcOption3986(Player player, int index, Npc npc) {}

    // Sick-looking sheep (2)
    public static void npcOption3987(Player player, int index, Npc npc) {}

    // Sick-looking sheep (3)
    public static void npcOption3988(Player player, int index, Npc npc) {}

    // Sick-looking sheep (4)
    public static void npcOption3989(Player player, int index, Npc npc) {}

    // Boy
    public static void npcOption3994(Player player, int index, Npc npc) {}

    // Chompy chick
    public static void npcOption4001(Player player, int index, Npc npc) {}

    // Chompy chick
    public static void npcOption4002(Player player, int index, Npc npc) {}

    // Ilfeen
    public static void npcOption4003(Player player, int index, Npc npc) {
        player.openDialogue("elfseed", 0);
    }

    // Thorgel
    public static void npcOption4010(Player player, int index, Npc npc) {}

    // Bill Teach
    public static void npcOption4011(Player player, int index, Npc npc) {}

    // Bill Teach
    public static void npcOption4012(Player player, int index, Npc npc) {}

    // Bill Teach
    public static void npcOption4014(Player player, int index, Npc npc) {}

    // Bill Teach
    public static void npcOption4015(Player player, int index, Npc npc) {}

    // Bill Teach
    public static void npcOption4016(Player player, int index, Npc npc) {}

    // Charley
    public static void npcOption4017(Player player, int index, Npc npc) {}

    // Smith
    public static void npcOption4018(Player player, int index, Npc npc) {}

    // Joe
    public static void npcOption4019(Player player, int index, Npc npc) {}

    // Mama
    public static void npcOption4020(Player player, int index, Npc npc) {}

    // Mike
    public static void npcOption4022(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4023(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4024(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4025(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4026(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4027(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4028(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4029(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4030(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4031(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4032(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4033(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4034(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4035(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4036(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4037(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4038(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4039(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4040(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4041(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4042(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4043(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4044(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4045(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4046(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4047(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4048(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4049(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4050(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4051(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption4052(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption4054(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption4055(Player player, int index, Npc npc) {}

    // Grail Maiden
    public static void npcOption4056(Player player, int index, Npc npc) {}

    // Sir Percival
    public static void npcOption4057(Player player, int index, Npc npc) {}

    // King Percival
    public static void npcOption4058(Player player, int index, Npc npc) {}

    // Merlin
    public static void npcOption4059(Player player, int index, Npc npc) {}

    // Peasant
    public static void npcOption4060(Player player, int index, Npc npc) {}

    // Peasant
    public static void npcOption4061(Player player, int index, Npc npc) {}

    // High Priest
    public static void npcOption4062(Player player, int index, Npc npc) {}

    // Crone
    public static void npcOption4063(Player player, int index, Npc npc) {}

    // Galahad
    public static void npcOption4064(Player player, int index, Npc npc) {}

    // Fisherman
    public static void npcOption4065(Player player, int index, Npc npc) {
        player.openDialogue("fishnoter", 0);
    }

    // The Fisher King
    public static void npcOption4066(Player player, int index, Npc npc) {}

    // Black Knight Titan
    public static void npcOption4067(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption4068(Player player, int index, Npc npc) {}

    // Bonzo
    public static void npcOption4069(Player player, int index, Npc npc) {}

    // Sinister Stranger
    public static void npcOption4070(Player player, int index, Npc npc) {}

    // Sinister Stranger
    public static void npcOption4071(Player player, int index, Npc npc) {}

    // Morris
    public static void npcOption4072(Player player, int index, Npc npc) {}

    // Big Dave
    public static void npcOption4073(Player player, int index, Npc npc) {}

    // Joshua
    public static void npcOption4074(Player player, int index, Npc npc) {}

    // Grandpa Jack
    public static void npcOption4075(Player player, int index, Npc npc) {}

    // Forester
    public static void npcOption4076(Player player, int index, Npc npc) {}

    // Austri
    public static void npcOption4077(Player player, int index, Npc npc) {}

    // Vestri
    public static void npcOption4078(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4079(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4080(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4081(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4082(Player player, int index, Npc npc) {}

    // Denulth
    public static void npcOption4083(Player player, int index, Npc npc) {}

    // Sergeant
    public static void npcOption4084(Player player, int index, Npc npc) {}

    // Sergeant
    public static void npcOption4085(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption4086(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption4087(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption4088(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption4089(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption4090(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption4091(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption4092(Player player, int index, Npc npc) {}

    // Saba
    public static void npcOption4093(Player player, int index, Npc npc) {}

    // Tenzing
    public static void npcOption4094(Player player, int index, Npc npc) {}

    // Eadburg
    public static void npcOption4095(Player player, int index, Npc npc) {}
    /* 4096 - 4351 */

    // Archer
    public static void npcOption4096(Player player, int index, Npc npc) {}

    // Archer
    public static void npcOption4097(Player player, int index, Npc npc) {}

    // Archer
    public static void npcOption4098(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4099(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4100(Player player, int index, Npc npc) {}

    // Harold
    public static void npcOption4101(Player player, int index, Npc npc) {}

    // Tostig
    public static void npcOption4102(Player player, int index, Npc npc) {}

    // Eohric
    public static void npcOption4103(Player player, int index, Npc npc) {}

    // Servant
    public static void npcOption4104(Player player, int index, Npc npc) {}

    // Dunstan
    public static void npcOption4105(Player player, int index, Npc npc) {}

    // Wistan
    public static void npcOption4106(Player player, int index, Npc npc) {}

    // Breoca
    public static void npcOption4107(Player player, int index, Npc npc) {}

    // Ocga
    public static void npcOption4108(Player player, int index, Npc npc) {}

    // Penda
    public static void npcOption4109(Player player, int index, Npc npc) {}

    // Hygd
    public static void npcOption4110(Player player, int index, Npc npc) {}

    // Ceolburg
    public static void npcOption4111(Player player, int index, Npc npc) {}

    // Hild
    public static void npcOption4112(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption4113(Player player, int index, Npc npc) {}

    // White Knight
    public static void npcOption4114(Player player, int index, Npc npc) {}

    // Eadgar
    public static void npcOption4118(Player player, int index, Npc npc) {}

    // Godric
    public static void npcOption4119(Player player, int index, Npc npc) {}

    // Dad
    public static void npcOption4130(Player player, int index, Npc npc) {}

    // Twig
    public static void npcOption4133(Player player, int index, Npc npc) {}

    // Berry
    public static void npcOption4134(Player player, int index, Npc npc) {}

    // Burntmeat
    public static void npcOption4157(Player player, int index, Npc npc) {}

    // Rat Burgiss
    public static void npcOption4158(Player player, int index, Npc npc) {}

    // Surok Magis
    public static void npcOption4159(Player player, int index, Npc npc) {}

    // Surok Magis
    public static void npcOption4160(Player player, int index, Npc npc) {}

    // Anna Jones
    public static void npcOption4162(Player player, int index, Npc npc) {}

    // Mishkal'un Dorn
    public static void npcOption4164(Player player, int index, Npc npc) {}

    // Dakh'thoulan Aegis
    public static void npcOption4165(Player player, int index, Npc npc) {}

    // Sil'as Dahcsnu
    public static void npcOption4166(Player player, int index, Npc npc) {}

    // Hadley
    public static void npcOption4179(Player player, int index, Npc npc) {}

    // Gerald
    public static void npcOption4180(Player player, int index, Npc npc) {}

    // Almera
    public static void npcOption4181(Player player, int index, Npc npc) {}

    // Hudon
    public static void npcOption4182(Player player, int index, Npc npc) {}

    // Golrie
    public static void npcOption4183(Player player, int index, Npc npc) {}

    // <col=ff9040>Oddskull</col>
    public static void npcOption4187(Player player, int index, Npc npc) {}

    // Plague cow
    public static void npcOption4189(Player player, int index, Npc npc) {}

    // Plague cow
    public static void npcOption4190(Player player, int index, Npc npc) {}

    // Plague cow
    public static void npcOption4191(Player player, int index, Npc npc) {}

    // Wanderer
    public static void npcOption4193(Player player, int index, Npc npc) {}

    // Wanderer
    public static void npcOption4194(Player player, int index, Npc npc) {}

    // Icthlarin
    public static void npcOption4199(Player player, int index, Npc npc) {}

    // Slave
    public static void npcOption4200(Player player, int index, Npc npc) {}

    // Slave
    public static void npcOption4201(Player player, int index, Npc npc) {}

    // Embalmer
    public static void npcOption4202(Player player, int index, Npc npc) {}

    // Carpenter
    public static void npcOption4203(Player player, int index, Npc npc) {}

    // Raetul
    public static void npcOption4204(Player player, int index, Npc npc) {}

    // Siamun
    public static void npcOption4205(Player player, int index, Npc npc) {}

    // High Priest
    public static void npcOption4206(Player player, int index, Npc npc) {}

    // Priest
    public static void npcOption4207(Player player, int index, Npc npc) {}

    // Priest
    public static void npcOption4208(Player player, int index, Npc npc) {}

    // Sphinx
    public static void npcOption4209(Player player, int index, Npc npc) {}

    // Neite
    public static void npcOption4211(Player player, int index, Npc npc) {}

    // Donovan the Family Handyman
    public static void npcOption4212(Player player, int index, Npc npc) {}

    // Pierre
    public static void npcOption4213(Player player, int index, Npc npc) {}

    // Hobbes
    public static void npcOption4214(Player player, int index, Npc npc) {}

    // Louisa
    public static void npcOption4215(Player player, int index, Npc npc) {}

    // Mary
    public static void npcOption4216(Player player, int index, Npc npc) {}

    // Stanford
    public static void npcOption4217(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4218(Player player, int index, Npc npc) {}

    // Gossip
    public static void npcOption4219(Player player, int index, Npc npc) {}

    // Anna
    public static void npcOption4220(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption4221(Player player, int index, Npc npc) {}

    // Carol
    public static void npcOption4222(Player player, int index, Npc npc) {}

    // David
    public static void npcOption4223(Player player, int index, Npc npc) {}

    // Elizabeth
    public static void npcOption4224(Player player, int index, Npc npc) {}

    // Frank
    public static void npcOption4225(Player player, int index, Npc npc) {}

    // Poison Salesman
    public static void npcOption4227(Player player, int index, Npc npc) {}

    // Neite
    public static void npcOption4230(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption4231(Player player, int index, Npc npc) {}

    // Beite
    public static void npcOption4232(Player player, int index, Npc npc) {}

    // Gnome
    public static void npcOption4233(Player player, int index, Npc npc) {}

    // Gnome
    public static void npcOption4234(Player player, int index, Npc npc) {}

    // Odysseus
    public static void npcOption4235(Player player, int index, Npc npc) {}

    // Neite
    public static void npcOption4236(Player player, int index, Npc npc) {}

    // Unferth
    public static void npcOption4237(Player player, int index, Npc npc) {}

    // Unferth
    public static void npcOption4238(Player player, int index, Npc npc) {}

    // Unferth
    public static void npcOption4239(Player player, int index, Npc npc) {}

    // Unferth
    public static void npcOption4240(Player player, int index, Npc npc) {}

    // Unferth
    public static void npcOption4241(Player player, int index, Npc npc) {}

    // Reldo
    public static void npcOption4242(Player player, int index, Npc npc) {}

    // Reldo
    public static void npcOption4243(Player player, int index, Npc npc) {}

    // Brother Omad
    public static void npcOption4244(Player player, int index, Npc npc) {}

    // Brother Cedric
    public static void npcOption4245(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption4246(Player player, int index, Npc npc) {}

    // Alrena
    public static void npcOption4249(Player player, int index, Npc npc) {}

    // Alrena
    public static void npcOption4250(Player player, int index, Npc npc) {}

    // Alrena
    public static void npcOption4251(Player player, int index, Npc npc) {}

    // Bravek
    public static void npcOption4252(Player player, int index, Npc npc) {}

    // Bravek
    public static void npcOption4253(Player player, int index, Npc npc) {}

    // Carla
    public static void npcOption4254(Player player, int index, Npc npc) {}

    // Clerk
    public static void npcOption4255(Player player, int index, Npc npc) {}

    // Edmond
    public static void npcOption4256(Player player, int index, Npc npc) {}

    // Elena
    public static void npcOption4257(Player player, int index, Npc npc) {}

    // Head mourner
    public static void npcOption4258(Player player, int index, Npc npc) {}

    // Mourner
    public static void npcOption4259(Player player, int index, Npc npc) {}

    // Mourner
    public static void npcOption4260(Player player, int index, Npc npc) {}

    // Mourner
    public static void npcOption4261(Player player, int index, Npc npc) {}

    // Recruiter
    public static void npcOption4262(Player player, int index, Npc npc) {}

    // Ted Rehnison
    public static void npcOption4263(Player player, int index, Npc npc) {}

    // Martha Rehnison
    public static void npcOption4264(Player player, int index, Npc npc) {}

    // Billy Rehnison
    public static void npcOption4265(Player player, int index, Npc npc) {}

    // Milli Rehnison
    public static void npcOption4266(Player player, int index, Npc npc) {}

    // Jethick
    public static void npcOption4267(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption4268(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption4269(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption4270(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption4271(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption4272(Player player, int index, Npc npc) {}

    // Mourner
    public static void npcOption4273(Player player, int index, Npc npc) {}

    // Leela
    public static void npcOption4274(Player player, int index, Npc npc) {}

    // Joe
    public static void npcOption4275(Player player, int index, Npc npc) {}

    // Jail guard
    public static void npcOption4276(Player player, int index, Npc npc) {}

    // Jail guard
    public static void npcOption4277(Player player, int index, Npc npc) {}

    // Jail guard
    public static void npcOption4278(Player player, int index, Npc npc) {}

    // Jail guard
    public static void npcOption4279(Player player, int index, Npc npc) {}

    // Ned
    public static void npcOption4280(Player player, int index, Npc npc) {}

    // Lady Keli
    public static void npcOption4281(Player player, int index, Npc npc) {}

    // Prince Ali
    public static void npcOption4282(Player player, int index, Npc npc) {}

    // Aggie
    public static void npcOption4284(Player player, int index, Npc npc) {}

    // Osman
    public static void npcOption4286(Player player, int index, Npc npc) {}

    // Border Guard
    public static void npcOption4287(Player player, int index, Npc npc) {}

    // Border Guard
    public static void npcOption4288(Player player, int index, Npc npc) {}

    // Herman Caranos
    public static void npcOption4291(Player player, int index, Npc npc) {}

    // Franklin Caranos
    public static void npcOption4292(Player player, int index, Npc npc) {}

    // Arnold Lydspor
    public static void npcOption4293(Player player, int index, Npc npc) {}

    // Devin Mendelberg
    public static void npcOption4294(Player player, int index, Npc npc) {}

    // George Laxmeister
    public static void npcOption4295(Player player, int index, Npc npc) {}

    // Ramara du Croissant
    public static void npcOption4296(Player player, int index, Npc npc) {}

    // Kathy Corkat
    public static void npcOption4298(Player player, int index, Npc npc) {}

    // Kathy Corkat
    public static void npcOption4299(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4301(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4302(Player player, int index, Npc npc) {}

    // Drunken Dwarf
    public static void npcOption4305(Player player, int index, Npc npc) {}

    // Wise Old Man
    public static void npcOption4306(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4316(Player player, int index, Npc npc) {}

    // Caleb
    public static void npcOption4317(Player player, int index, Npc npc) {}

    // Morgan Le Faye
    public static void npcOption4320(Player player, int index, Npc npc) {}

    // Renegade knight
    public static void npcOption4321(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4335(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4336(Player player, int index, Npc npc) {}

    // Prosecutor
    public static void npcOption4337(Player player, int index, Npc npc) {}

    // null
    public static void npcOption4338(Player player, int index, Npc npc) {}

    // null
    public static void npcOption4339(Player player, int index, Npc npc) {}

    // Arthur
    public static void npcOption4340(Player player, int index, Npc npc) {}

    // null
    public static void npcOption4341(Player player, int index, Npc npc) {}

    // Sir Lucan
    public static void npcOption4342(Player player, int index, Npc npc) {}

    // Sir Palomedes
    public static void npcOption4343(Player player, int index, Npc npc) {}

    // Sir Lancelot
    public static void npcOption4344(Player player, int index, Npc npc) {}

    // Sir Bedivere
    public static void npcOption4345(Player player, int index, Npc npc) {}

    // Sir Tristram
    public static void npcOption4346(Player player, int index, Npc npc) {}

    // Sir Pelleas
    public static void npcOption4347(Player player, int index, Npc npc) {}

    // Sir Gawain
    public static void npcOption4348(Player player, int index, Npc npc) {}

    // Sir Kay
    public static void npcOption4349(Player player, int index, Npc npc) {}

    // Sir Pelleas
    public static void npcOption4350(Player player, int index, Npc npc) {}

    // Sir Gawain
    public static void npcOption4351(Player player, int index, Npc npc) {}
    /* 4352 - 4607 */

    // Sir Kay
    public static void npcOption4352(Player player, int index, Npc npc) {}

    // Squire
    public static void npcOption4353(Player player, int index, Npc npc) {}

    // Ogre chieftain
    public static void npcOption4362(Player player, int index, Npc npc) {}

    // Og
    public static void npcOption4364(Player player, int index, Npc npc) {}

    // Grew
    public static void npcOption4365(Player player, int index, Npc npc) {}

    // Toban
    public static void npcOption4366(Player player, int index, Npc npc) {}

    // Gorad
    public static void npcOption4367(Player player, int index, Npc npc) {}

    // Ogre guard
    public static void npcOption4368(Player player, int index, Npc npc) {}

    // Ogre guard
    public static void npcOption4369(Player player, int index, Npc npc) {}

    // Ogre guard
    public static void npcOption4370(Player player, int index, Npc npc) {}

    // Ogre guard
    public static void npcOption4371(Player player, int index, Npc npc) {}

    // Ogre guard
    public static void npcOption4372(Player player, int index, Npc npc) {}

    // City guard
    public static void npcOption4373(Player player, int index, Npc npc) {}

    // Scared skavid
    public static void npcOption4374(Player player, int index, Npc npc) {}

    // Mad skavid
    public static void npcOption4375(Player player, int index, Npc npc) {}

    // Skavid
    public static void npcOption4376(Player player, int index, Npc npc) {}

    // Skavid
    public static void npcOption4377(Player player, int index, Npc npc) {}

    // Skavid
    public static void npcOption4378(Player player, int index, Npc npc) {}

    // Skavid
    public static void npcOption4379(Player player, int index, Npc npc) {}

    // Skavid
    public static void npcOption4380(Player player, int index, Npc npc) {}

    // Enclave guard
    public static void npcOption4381(Player player, int index, Npc npc) {}

    // Ogre shaman
    public static void npcOption4382(Player player, int index, Npc npc) {}

    // Ogre shaman
    public static void npcOption4383(Player player, int index, Npc npc) {}

    // Ogre shaman
    public static void npcOption4387(Player player, int index, Npc npc) {}

    // Ogre shaman
    public static void npcOption4389(Player player, int index, Npc npc) {}

    // Ogre shaman
    public static void npcOption4391(Player player, int index, Npc npc) {}

    // Ogre shaman
    public static void npcOption4393(Player player, int index, Npc npc) {}

    // Ogre shaman
    public static void npcOption4395(Player player, int index, Npc npc) {}

    // Watchtower Wizard
    public static void npcOption4397(Player player, int index, Npc npc) {}

    // Wizard
    public static void npcOption4398(Player player, int index, Npc npc) {}

    // Wizard
    public static void npcOption4399(Player player, int index, Npc npc) {
        Teleports.open(player);
    }

    // Wizard
    public static void npcOption4400(Player player, int index, Npc npc) {}

    // Ogre trader
    public static void npcOption4401(Player player, int index, Npc npc) {}

    // Ogre merchant
    public static void npcOption4402(Player player, int index, Npc npc) {}

    // Ogre trader
    public static void npcOption4403(Player player, int index, Npc npc) {}

    // Ogre trader
    public static void npcOption4404(Player player, int index, Npc npc) {}

    // Tower guard
    public static void npcOption4405(Player player, int index, Npc npc) {}

    // Colonel Radick
    public static void npcOption4406(Player player, int index, Npc npc) {}

    // Ava
    public static void npcOption4407(Player player, int index, Npc npc) {}

    // Witch
    public static void npcOption4409(Player player, int index, Npc npc) {}

    // null
    public static void npcOption4410(Player player, int index, Npc npc) {}

    // Alice's husband
    public static void npcOption4411(Player player, int index, Npc npc) {}

    // Alice's husband
    public static void npcOption4412(Player player, int index, Npc npc) {}

    // null
    public static void npcOption4415(Player player, int index, Npc npc) {}

    // Undead tree
    public static void npcOption4417(Player player, int index, Npc npc) {}

    // Jossik
    public static void npcOption4423(Player player, int index, Npc npc) {
        player.openDialogue("horrorfromthedeep", 0);
    }

    // Jossik
    public static void npcOption4424(Player player, int index, Npc npc) {}

    // Larrissa
    public static void npcOption4425(Player player, int index, Npc npc) {}

    // Larrissa
    public static void npcOption4426(Player player, int index, Npc npc) {}

    // Ivan Strom
    public static void npcOption4440(Player player, int index, Npc npc) {}

    // Ivan Strom
    public static void npcOption4441(Player player, int index, Npc npc) {}

    // Elisabeta
    public static void npcOption4444(Player player, int index, Npc npc) {}

    // Aurel
    public static void npcOption4445(Player player, int index, Npc npc) {}

    // Sorin
    public static void npcOption4446(Player player, int index, Npc npc) {}

    // Luscion
    public static void npcOption4447(Player player, int index, Npc npc) {}

    // Sergiu
    public static void npcOption4448(Player player, int index, Npc npc) {}

    // Radu
    public static void npcOption4449(Player player, int index, Npc npc) {}

    // Grigore
    public static void npcOption4450(Player player, int index, Npc npc) {}

    // Ileana
    public static void npcOption4451(Player player, int index, Npc npc) {}

    // Valeria
    public static void npcOption4452(Player player, int index, Npc npc) {}

    // Emilia
    public static void npcOption4453(Player player, int index, Npc npc) {}

    // Florin
    public static void npcOption4454(Player player, int index, Npc npc) {}

    // Catalina
    public static void npcOption4455(Player player, int index, Npc npc) {}

    // Ivan
    public static void npcOption4456(Player player, int index, Npc npc) {}

    // Victor
    public static void npcOption4457(Player player, int index, Npc npc) {}

    // Helena
    public static void npcOption4458(Player player, int index, Npc npc) {}

    // Teodor
    public static void npcOption4459(Player player, int index, Npc npc) {}

    // Marius
    public static void npcOption4460(Player player, int index, Npc npc) {}

    // Gabriela
    public static void npcOption4461(Player player, int index, Npc npc) {}

    // Vladimir
    public static void npcOption4462(Player player, int index, Npc npc) {}

    // Calin
    public static void npcOption4463(Player player, int index, Npc npc) {}

    // Mihail
    public static void npcOption4464(Player player, int index, Npc npc) {}

    // Nicoleta
    public static void npcOption4465(Player player, int index, Npc npc) {}

    // Simona
    public static void npcOption4466(Player player, int index, Npc npc) {}

    // Vasile
    public static void npcOption4467(Player player, int index, Npc npc) {}

    // Razvan
    public static void npcOption4468(Player player, int index, Npc npc) {}

    // Luminata
    public static void npcOption4469(Player player, int index, Npc npc) {}

    // Cornelius
    public static void npcOption4470(Player player, int index, Npc npc) {}

    // Cornelius
    public static void npcOption4471(Player player, int index, Npc npc) {}

    // Benjamin
    public static void npcOption4472(Player player, int index, Npc npc) {}

    // Liam
    public static void npcOption4473(Player player, int index, Npc npc) {}

    // Miala
    public static void npcOption4474(Player player, int index, Npc npc) {}

    // Verak
    public static void npcOption4475(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4476(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4477(Player player, int index, Npc npc) {}

    // Sorin
    public static void npcOption4478(Player player, int index, Npc npc) {}

    // Wiskit
    public static void npcOption4480(Player player, int index, Npc npc) {}

    // Vampyre Juvinate
    public static void npcOption4481(Player player, int index, Npc npc) {}

    // Vampyre Juvinate
    public static void npcOption4482(Player player, int index, Npc npc) {}

    // Gadderanks
    public static void npcOption4483(Player player, int index, Npc npc) {}

    // Gadderanks
    public static void npcOption4484(Player player, int index, Npc npc) {}

    // Gadderanks
    public static void npcOption4485(Player player, int index, Npc npc) {}

    // Olaf Hradson
    public static void npcOption4488(Player player, int index, Npc npc) {}

    // Volf Olafson
    public static void npcOption4489(Player player, int index, Npc npc) {}

    // Ingrid Hradson
    public static void npcOption4490(Player player, int index, Npc npc) {}

    // Boulder
    public static void npcOption4502(Player player, int index, Npc npc) {}

    // Zanik
    public static void npcOption4506(Player player, int index, Npc npc) {}

    // Zanik
    public static void npcOption4508(Player player, int index, Npc npc) {}

    // Zanik
    public static void npcOption4509(Player player, int index, Npc npc) {}

    // Zanik
    public static void npcOption4510(Player player, int index, Npc npc) {}

    // Zanik
    public static void npcOption4511(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption4512(Player player, int index, Npc npc) {}

    // H.A.M. Member
    public static void npcOption4513(Player player, int index, Npc npc) {}

    // H.A.M. Member
    public static void npcOption4514(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4516(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4517(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4518(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4519(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4520(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4522(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4523(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4524(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4525(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4526(Player player, int index, Npc npc) {}

    // Skilling seller
    public static void npcOption4527(Player player, int index, Npc npc) {
        player.openShop("skilling");
    }

    // Koftik
    public static void npcOption4528(Player player, int index, Npc npc) {}

    // Koftik
    public static void npcOption4529(Player player, int index, Npc npc) {}

    // Koftik
    public static void npcOption4530(Player player, int index, Npc npc) {}

    // Koftik
    public static void npcOption4531(Player player, int index, Npc npc) {}

    // Koftik
    public static void npcOption4532(Player player, int index, Npc npc) {}

    // Slave
    public static void npcOption4536(Player player, int index, Npc npc) {}

    // Slave
    public static void npcOption4537(Player player, int index, Npc npc) {}

    // Slave
    public static void npcOption4538(Player player, int index, Npc npc) {}

    // Slave
    public static void npcOption4539(Player player, int index, Npc npc) {}

    // Slave
    public static void npcOption4540(Player player, int index, Npc npc) {}

    // Slave
    public static void npcOption4541(Player player, int index, Npc npc) {}

    // Slave
    public static void npcOption4542(Player player, int index, Npc npc) {}

    // Boulder
    public static void npcOption4543(Player player, int index, Npc npc) {}

    // Sir Jerro
    public static void npcOption4545(Player player, int index, Npc npc) {}

    // Sir Carl
    public static void npcOption4546(Player player, int index, Npc npc) {}

    // Sir Harry
    public static void npcOption4547(Player player, int index, Npc npc) {}

    // Kardia
    public static void npcOption4549(Player player, int index, Npc npc) {}

    // Witch's cat
    public static void npcOption4550(Player player, int index, Npc npc) {}

    // Niloof
    public static void npcOption4551(Player player, int index, Npc npc) {}

    // Klank
    public static void npcOption4552(Player player, int index, Npc npc) {}

    // Kamen
    public static void npcOption4553(Player player, int index, Npc npc) {}

    // Dark mage
    public static void npcOption4558(Player player, int index, Npc npc) {}

    // Disciple of Iban
    public static void npcOption4559(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption4563(Player player, int index, Npc npc) {}

    // Dead Monk
    public static void npcOption4564(Player player, int index, Npc npc) {}

    // Red Axe Henchman
    public static void npcOption4569(Player player, int index, Npc npc) {}

    // Red Axe Henchman
    public static void npcOption4570(Player player, int index, Npc npc) {}

    // Ogre shaman
    public static void npcOption4571(Player player, int index, Npc npc) {}

    // The Beast
    public static void npcOption4572(Player player, int index, Npc npc) {}

    // Bellemorde
    public static void npcOption4573(Player player, int index, Npc npc) {}

    // Pox
    public static void npcOption4574(Player player, int index, Npc npc) {}

    // Pox
    public static void npcOption4575(Player player, int index, Npc npc) {}

    // Bones
    public static void npcOption4576(Player player, int index, Npc npc) {}

    // Grimesquit
    public static void npcOption4586(Player player, int index, Npc npc) {}

    // Phingspet
    public static void npcOption4587(Player player, int index, Npc npc) {}

    // Hooknosed Jack
    public static void npcOption4588(Player player, int index, Npc npc) {}

    // Jimmy Dazzler
    public static void npcOption4589(Player player, int index, Npc npc) {}

    // The Face
    public static void npcOption4590(Player player, int index, Npc npc) {}

    // Felkrash
    public static void npcOption4591(Player player, int index, Npc npc) {}

    // Smokin' Joe
    public static void npcOption4592(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption4593(Player player, int index, Npc npc) {}

    // King rat
    public static void npcOption4595(Player player, int index, Npc npc) {}

    // Turbogroomer
    public static void npcOption4596(Player player, int index, Npc npc) {}

    // Pusskins
    public static void npcOption4597(Player player, int index, Npc npc) {}

    // Loki
    public static void npcOption4598(Player player, int index, Npc npc) {}

    // Captain Tom
    public static void npcOption4599(Player player, int index, Npc npc) {}

    // Treacle
    public static void npcOption4600(Player player, int index, Npc npc) {}

    // Mittens
    public static void npcOption4601(Player player, int index, Npc npc) {}

    // Claude
    public static void npcOption4602(Player player, int index, Npc npc) {}

    // Topsy
    public static void npcOption4603(Player player, int index, Npc npc) {}

    // Rauborn
    public static void npcOption4604(Player player, int index, Npc npc) {}

    // Vaeringk
    public static void npcOption4605(Player player, int index, Npc npc) {}

    // Oxi
    public static void npcOption4606(Player player, int index, Npc npc) {}

    // Fior
    public static void npcOption4607(Player player, int index, Npc npc) {}
    /* 4608 - 4863 */

    // Sagira
    public static void npcOption4608(Player player, int index, Npc npc) {}

    // Anleif
    public static void npcOption4609(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption4610(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption4611(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption4612(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption4613(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption4614(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption4615(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption4616(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption4617(Player player, int index, Npc npc) {}

    // Rat
    public static void npcOption4618(Player player, int index, Npc npc) {}

    // Hetty
    public static void npcOption4619(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4620(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4621(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4622(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4623(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4624(Player player, int index, Npc npc) {}

    // Trufitus
    public static void npcOption4625(Player player, int index, Npc npc) {}

    // Cook
    public static void npcOption4626(Player player, int index, Npc npc) {}

    // Millie Miller
    public static void npcOption4627(Player player, int index, Npc npc) {}

    // Gillie Groats
    public static void npcOption4628(Player player, int index, Npc npc) {}

    // Ana
    public static void npcOption4629(Player player, int index, Npc npc) {}

    // Ana
    public static void npcOption4630(Player player, int index, Npc npc) {}

    // Female slave
    public static void npcOption4631(Player player, int index, Npc npc) {}

    // Male slave
    public static void npcOption4632(Player player, int index, Npc npc) {}

    // Escaping slave
    public static void npcOption4633(Player player, int index, Npc npc) {}

    // Rowdy slave
    public static void npcOption4634(Player player, int index, Npc npc) {}

    // Mercenary Captain
    public static void npcOption4635(Player player, int index, Npc npc) {}

    // Captain Siad
    public static void npcOption4636(Player player, int index, Npc npc) {}

    // Al Shabim
    public static void npcOption4637(Player player, int index, Npc npc) {}

    // Bedabin Nomad
    public static void npcOption4638(Player player, int index, Npc npc) {}

    // Bedabin Nomad Guard
    public static void npcOption4639(Player player, int index, Npc npc) {}

    // Irena
    public static void npcOption4640(Player player, int index, Npc npc) {}

    // Irena
    public static void npcOption4641(Player player, int index, Npc npc) {}

    // Shantay
    public static void npcOption4642(Player player, int index, Npc npc) {}

    // Shantay Guard
    public static void npcOption4643(Player player, int index, Npc npc) {}

    // Shantay Guard
    public static void npcOption4648(Player player, int index, Npc npc) {}

    // Ugthanki
    public static void npcOption4652(Player player, int index, Npc npc) {}

    // Mine cart driver
    public static void npcOption4653(Player player, int index, Npc npc) {}

    // Rowdy Guard
    public static void npcOption4654(Player player, int index, Npc npc) {}

    // Bedabin Nomad Fighter
    public static void npcOption4655(Player player, int index, Npc npc) {}

    // Mercenary
    public static void npcOption4656(Player player, int index, Npc npc) {}

    // Mercenary
    public static void npcOption4657(Player player, int index, Npc npc) {}

    // Mercenary
    public static void npcOption4658(Player player, int index, Npc npc) {}

    // Mercenary
    public static void npcOption4659(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4660(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4661(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4662(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4663(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4664(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4665(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4666(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4667(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4668(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption4669(Player player, int index, Npc npc) {}

    // Male slave
    public static void npcOption4670(Player player, int index, Npc npc) {}

    // Male slave
    public static void npcOption4671(Player player, int index, Npc npc) {}

    // Female slave
    public static void npcOption4672(Player player, int index, Npc npc) {}

    // Female slave
    public static void npcOption4673(Player player, int index, Npc npc) {}

    // Cart Camel
    public static void npcOption4674(Player player, int index, Npc npc) {}

    // Ana
    public static void npcOption4677(Player player, int index, Npc npc) {}

    // Mercenary
    public static void npcOption4678(Player player, int index, Npc npc) {}

    // Sir Spishyus
    public static void npcOption4679(Player player, int index, Npc npc) {}

    // Lady Table
    public static void npcOption4680(Player player, int index, Npc npc) {}

    // Sir Kuam Ferentse
    public static void npcOption4681(Player player, int index, Npc npc) {}

    // Sir Leye
    public static void npcOption4682(Player player, int index, Npc npc) {}

    // Sir Tinley
    public static void npcOption4683(Player player, int index, Npc npc) {}

    // Sir Ren Itchood
    public static void npcOption4684(Player player, int index, Npc npc) {}

    // Miss Cheevers
    public static void npcOption4685(Player player, int index, Npc npc) {}

    // Ms. Hynn Terprett
    public static void npcOption4686(Player player, int index, Npc npc) {}

    // Sir Tiffy Cashien
    public static void npcOption4687(Player player, int index, Npc npc) {}

    // Timfraku
    public static void npcOption4698(Player player, int index, Npc npc) {}

    // Tiadeche
    public static void npcOption4699(Player player, int index, Npc npc) {}

    // Tiadeche
    public static void npcOption4700(Player player, int index, Npc npc) {}

    // Tinsay
    public static void npcOption4701(Player player, int index, Npc npc) {}

    // Tinsay
    public static void npcOption4702(Player player, int index, Npc npc) {}

    // Tamayu
    public static void npcOption4703(Player player, int index, Npc npc) {}

    // Tamayu
    public static void npcOption4704(Player player, int index, Npc npc) {}

    // Lubufu
    public static void npcOption4707(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4710(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4711(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4712(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4713(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4714(Player player, int index, Npc npc) {}

    // Auguste
    public static void npcOption4715(Player player, int index, Npc npc) {}

    // Auguste
    public static void npcOption4716(Player player, int index, Npc npc) {}

    // Auguste
    public static void npcOption4717(Player player, int index, Npc npc) {}

    // Auguste
    public static void npcOption4718(Player player, int index, Npc npc) {}

    // Assistant Serf
    public static void npcOption4719(Player player, int index, Npc npc) {}

    // Assistant Brock
    public static void npcOption4720(Player player, int index, Npc npc) {}

    // Assistant Marrow
    public static void npcOption4721(Player player, int index, Npc npc) {}

    // Assistant Le Smith
    public static void npcOption4722(Player player, int index, Npc npc) {}

    // Assistant Stan
    public static void npcOption4723(Player player, int index, Npc npc) {}

    // null
    public static void npcOption4728(Player player, int index, Npc npc) {}

    // null
    public static void npcOption4729(Player player, int index, Npc npc) {}

    // null
    public static void npcOption4730(Player player, int index, Npc npc) {}

    // null
    public static void npcOption4731(Player player, int index, Npc npc) {}

    // null
    public static void npcOption4732(Player player, int index, Npc npc) {}

    // Thurgo
    public static void npcOption4733(Player player, int index, Npc npc) {}

    // Sir Vyvin
    public static void npcOption4736(Player player, int index, Npc npc) {
        player.openShop("white_knight");
    }

    // Squire
    public static void npcOption4737(Player player, int index, Npc npc) {}

    // Genie
    public static void npcOption4738(Player player, int index, Npc npc) {}

    // Nirrie
    public static void npcOption4739(Player player, int index, Npc npc) {}

    // Tirrie
    public static void npcOption4740(Player player, int index, Npc npc) {}

    // Hallak
    public static void npcOption4741(Player player, int index, Npc npc) {}

    // Ghaslor the Elder
    public static void npcOption4745(Player player, int index, Npc npc) {}

    // Ali the Carter
    public static void npcOption4746(Player player, int index, Npc npc) {}

    // Usi
    public static void npcOption4747(Player player, int index, Npc npc) {}

    // Nkuku
    public static void npcOption4748(Player player, int index, Npc npc) {}

    // Garai
    public static void npcOption4749(Player player, int index, Npc npc) {}

    // Habibah
    public static void npcOption4750(Player player, int index, Npc npc) {}

    // Meskhenet
    public static void npcOption4751(Player player, int index, Npc npc) {}

    // Zahra
    public static void npcOption4752(Player player, int index, Npc npc) {}

    // Zahur
    public static void npcOption4753(Player player, int index, Npc npc) {}

    // Seddu
    public static void npcOption4754(Player player, int index, Npc npc) {}

    // Kazemde
    public static void npcOption4755(Player player, int index, Npc npc) {}

    // Awusah the Mayor
    public static void npcOption4756(Player player, int index, Npc npc) {}

    // Shiratti the Custodian
    public static void npcOption4760(Player player, int index, Npc npc) {}

    // Rokuh
    public static void npcOption4761(Player player, int index, Npc npc) {}

    // Nardah Banker
    public static void npcOption4762(Player player, int index, Npc npc) {}

    // Target
    public static void npcOption4763(Player player, int index, Npc npc) {}

    // Tegid
    public static void npcOption4766(Player player, int index, Npc npc) {}

    // Thistle
    public static void npcOption4767(Player player, int index, Npc npc) {}

    // Parroty Pete
    public static void npcOption4769(Player player, int index, Npc npc) {}

    // Sir Amik Varze
    public static void npcOption4771(Player player, int index, Npc npc) {}

    // Fortress Guard
    public static void npcOption4772(Player player, int index, Npc npc) {}

    // Fortress Guard
    public static void npcOption4773(Player player, int index, Npc npc) {}

    // Fortress Guard
    public static void npcOption4774(Player player, int index, Npc npc) {}

    // Fortress Guard
    public static void npcOption4775(Player player, int index, Npc npc) {}

    // Fortress Guard
    public static void npcOption4776(Player player, int index, Npc npc) {}

    // Black Knight Captain
    public static void npcOption4777(Player player, int index, Npc npc) {}

    // Col. O'Niall
    public static void npcOption4781(Player player, int index, Npc npc) {}

    // Col. O'Niall
    public static void npcOption4782(Player player, int index, Npc npc) {}

    // Mayor Hobb
    public static void npcOption4783(Player player, int index, Npc npc) {}

    // Mayor Hobb
    public static void npcOption4784(Player player, int index, Npc npc) {}

    // Brother Maledict
    public static void npcOption4787(Player player, int index, Npc npc) {}

    // Brother Maledict
    public static void npcOption4788(Player player, int index, Npc npc) {}

    // Ezekial Lovecraft
    public static void npcOption4789(Player player, int index, Npc npc) {}

    // Witchaven villager
    public static void npcOption4790(Player player, int index, Npc npc) {}

    // Witchaven villager
    public static void npcOption4791(Player player, int index, Npc npc) {}

    // Witchaven villager
    public static void npcOption4792(Player player, int index, Npc npc) {}

    // Witchaven villager
    public static void npcOption4793(Player player, int index, Npc npc) {}

    // Witchaven villager
    public static void npcOption4794(Player player, int index, Npc npc) {}

    // Witchaven villager
    public static void npcOption4795(Player player, int index, Npc npc) {}

    // Jeb
    public static void npcOption4802(Player player, int index, Npc npc) {}

    // Jeb
    public static void npcOption4803(Player player, int index, Npc npc) {}

    // Sir Tinley
    public static void npcOption4804(Player player, int index, Npc npc) {}

    // Evil Dave
    public static void npcOption4806(Player player, int index, Npc npc) {
        player.openDialogue("shadowofthestorm", 0);
    }

    // Evil Dave
    public static void npcOption4807(Player player, int index, Npc npc) {}

    // Doris
    public static void npcOption4808(Player player, int index, Npc npc) {}

    // An old Dwarf
    public static void npcOption4810(Player player, int index, Npc npc) {}

    // Rohak
    public static void npcOption4811(Player player, int index, Npc npc) {}

    // Rohak
    public static void npcOption4812(Player player, int index, Npc npc) {}

    // Pirate Pete
    public static void npcOption4814(Player player, int index, Npc npc) {}

    // Pirate Pete
    public static void npcOption4816(Player player, int index, Npc npc) {}

    // Mogre Guard
    public static void npcOption4817(Player player, int index, Npc npc) {}

    // Nung
    public static void npcOption4818(Player player, int index, Npc npc) {}

    // Gypsy
    public static void npcOption4847(Player player, int index, Npc npc) {}

    // Gypsy
    public static void npcOption4848(Player player, int index, Npc npc) {}

    // Goblin Cook
    public static void npcOption4850(Player player, int index, Npc npc) {}

    // Goblin Cook
    public static void npcOption4851(Player player, int index, Npc npc) {}

    // Skrach Uglogwee
    public static void npcOption4853(Player player, int index, Npc npc) {}

    // Skrach Uglogwee
    public static void npcOption4854(Player player, int index, Npc npc) {}

    // Rantz
    public static void npcOption4855(Player player, int index, Npc npc) {}

    // Rantz
    public static void npcOption4856(Player player, int index, Npc npc) {}

    // Rantz
    public static void npcOption4857(Player player, int index, Npc npc) {}

    // Ogre boat
    public static void npcOption4858(Player player, int index, Npc npc) {}

    // Ogre boat
    public static void npcOption4859(Player player, int index, Npc npc) {}
    /* 4864 - 5119 */

    // Jubbly bird
    public static void npcOption4864(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4865(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4866(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4867(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4868(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4869(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4870(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4871(Player player, int index, Npc npc) {}

    // Dondakan the Dwarf
    public static void npcOption4890(Player player, int index, Npc npc) {}

    // Dondakan the Dwarf
    public static void npcOption4891(Player player, int index, Npc npc) {}

    // Dwarven Engineer
    public static void npcOption4893(Player player, int index, Npc npc) {}

    // Rolad
    public static void npcOption4894(Player player, int index, Npc npc) {}

    // Khorvak, a dwarven engineer
    public static void npcOption4895(Player player, int index, Npc npc) {}

    // Dwarven Ferryman
    public static void npcOption4896(Player player, int index, Npc npc) {}

    // Dwarven Ferryman
    public static void npcOption4897(Player player, int index, Npc npc) {}

    // Dwarven Boatman
    public static void npcOption4898(Player player, int index, Npc npc) {}

    // Miodvetnir
    public static void npcOption4899(Player player, int index, Npc npc) {}

    // Dernu
    public static void npcOption4900(Player player, int index, Npc npc) {}

    // Derni
    public static void npcOption4901(Player player, int index, Npc npc) {}

    // Brimstail
    public static void npcOption4913(Player player, int index, Npc npc) {}

    // Garv
    public static void npcOption4915(Player player, int index, Npc npc) {}

    // Grubor
    public static void npcOption4916(Player player, int index, Npc npc) {}

    // Trobert
    public static void npcOption4917(Player player, int index, Npc npc) {}

    // Seth
    public static void npcOption4918(Player player, int index, Npc npc) {}

    // Grip
    public static void npcOption4919(Player player, int index, Npc npc) {}

    // Alfonse the waiter
    public static void npcOption4920(Player player, int index, Npc npc) {}

    // Charlie the cook
    public static void npcOption4921(Player player, int index, Npc npc) {}

    // Achietties
    public static void npcOption4923(Player player, int index, Npc npc) {}

    // Helemos
    public static void npcOption4924(Player player, int index, Npc npc) {}

    // Velrak the explorer
    public static void npcOption4925(Player player, int index, Npc npc) {}

    // Pirate Guard
    public static void npcOption4926(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption4928(Player player, int index, Npc npc) {}

    // Lord Daquarius
    public static void npcOption4929(Player player, int index, Npc npc) {}

    // Solus Dellagar
    public static void npcOption4930(Player player, int index, Npc npc) {}

    // Savant
    public static void npcOption4931(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption4958(Player player, int index, Npc npc) {}

    // King Bolren
    public static void npcOption4963(Player player, int index, Npc npc) {}

    // Commander Montai
    public static void npcOption4964(Player player, int index, Npc npc) {}

    // Bolkoy
    public static void npcOption4965(Player player, int index, Npc npc) {}

    // Remsai
    public static void npcOption4966(Player player, int index, Npc npc) {}

    // Elkoy
    public static void npcOption4967(Player player, int index, Npc npc) {}

    // Elkoy
    public static void npcOption4968(Player player, int index, Npc npc) {}

    // Gnome troop
    public static void npcOption4973(Player player, int index, Npc npc) {}

    // Gnome troop
    public static void npcOption4974(Player player, int index, Npc npc) {}

    // Tracker gnome 1
    public static void npcOption4975(Player player, int index, Npc npc) {}

    // Tracker gnome 2
    public static void npcOption4976(Player player, int index, Npc npc) {}

    // Tracker gnome 3
    public static void npcOption4977(Player player, int index, Npc npc) {}

    // Local Gnome
    public static void npcOption4978(Player player, int index, Npc npc) {}

    // Local Gnome
    public static void npcOption4979(Player player, int index, Npc npc) {}

    // Kalron
    public static void npcOption4980(Player player, int index, Npc npc) {}

    // Spirit tree
    public static void npcOption4981(Player player, int index, Npc npc) {}

    // Spirit tree
    public static void npcOption4982(Player player, int index, Npc npc) {}

    // Dimintheis
    public static void npcOption4984(Player player, int index, Npc npc) {}

    // Boot
    public static void npcOption4985(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4989(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4990(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4991(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4992(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4993(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4994(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4995(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4996(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4997(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4998(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption4999(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5000(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5001(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5002(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5003(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5004(Player player, int index, Npc npc) {}

    // Wizard Mizgog
    public static void npcOption5005(Player player, int index, Npc npc) {}

    // Wizard Grayzag
    public static void npcOption5006(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5009(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5010(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5011(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5012(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5013(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5014(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5015(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5016(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5017(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5018(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5019(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5020(Player player, int index, Npc npc) {}

    // Elemental balance
    public static void npcOption5021(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5023(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5024(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5025(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5026(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5027(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5028(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5029(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5030(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5031(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5032(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5033(Player player, int index, Npc npc) {}

    // Sedridor
    public static void npcOption5034(Player player, int index, Npc npc) {}

    // Juliet
    public static void npcOption5035(Player player, int index, Npc npc) {}

    // Apothecary
    public static void npcOption5036(Player player, int index, Npc npc) {}

    // Romeo
    public static void npcOption5037(Player player, int index, Npc npc) {}

    // Father Lawrence
    public static void npcOption5038(Player player, int index, Npc npc) {}

    // Draul Leptoc
    public static void npcOption5039(Player player, int index, Npc npc) {}

    // Phillipa
    public static void npcOption5040(Player player, int index, Npc npc) {}

    // Sanfew
    public static void npcOption5044(Player player, int index, Npc npc) {}

    // Kaqemeex
    public static void npcOption5045(Player player, int index, Npc npc) {}

    // Cyreg Paddlehorn
    public static void npcOption5046(Player player, int index, Npc npc) {}

    // Curpile Fyod
    public static void npcOption5047(Player player, int index, Npc npc) {}

    // Veliaf Hurtz
    public static void npcOption5048(Player player, int index, Npc npc) {}

    // Sani Piliu
    public static void npcOption5049(Player player, int index, Npc npc) {}

    // Harold Evans
    public static void npcOption5050(Player player, int index, Npc npc) {}

    // Radigad Ponfit
    public static void npcOption5051(Player player, int index, Npc npc) {}

    // Polmafi Ferdygris
    public static void npcOption5052(Player player, int index, Npc npc) {}

    // Ivan Strom
    public static void npcOption5053(Player player, int index, Npc npc) {}

    // Stranger
    public static void npcOption5055(Player player, int index, Npc npc) {}

    // Vanstrom Klause
    public static void npcOption5056(Player player, int index, Npc npc) {}

    // Vanstrom Klause
    public static void npcOption5058(Player player, int index, Npc npc) {}

    // Vanstrom Klause
    public static void npcOption5059(Player player, int index, Npc npc) {}

    // Vanstrom Klause
    public static void npcOption5060(Player player, int index, Npc npc) {}

    // Sea slug
    public static void npcOption5061(Player player, int index, Npc npc) {}

    // Kennith
    public static void npcOption5062(Player player, int index, Npc npc) {}

    // Kennith
    public static void npcOption5063(Player player, int index, Npc npc) {}

    // null
    public static void npcOption5065(Player player, int index, Npc npc) {}

    // Bailey
    public static void npcOption5066(Player player, int index, Npc npc) {}

    // Caroline
    public static void npcOption5067(Player player, int index, Npc npc) {}

    // Holgart
    public static void npcOption5068(Player player, int index, Npc npc) {}

    // Holgart
    public static void npcOption5069(Player player, int index, Npc npc) {}

    // Holgart
    public static void npcOption5070(Player player, int index, Npc npc) {}

    // Holgart
    public static void npcOption5071(Player player, int index, Npc npc) {}

    // Holgart
    public static void npcOption5072(Player player, int index, Npc npc) {}

    // Holgart
    public static void npcOption5073(Player player, int index, Npc npc) {}

    // Kent
    public static void npcOption5074(Player player, int index, Npc npc) {}

    // Fisherman
    public static void npcOption5075(Player player, int index, Npc npc) {}

    // Fisherman
    public static void npcOption5076(Player player, int index, Npc npc) {}

    // Fisherman
    public static void npcOption5077(Player player, int index, Npc npc) {}

    // Fisherman
    public static void npcOption5078(Player player, int index, Npc npc) {}

    // Weakened Delrith
    public static void npcOption5080(Player player, int index, Npc npc) {}

    // Traiborn
    public static void npcOption5081(Player player, int index, Npc npc) {}

    // Gypsy Aris
    public static void npcOption5082(Player player, int index, Npc npc) {}

    // Sir Prysin
    public static void npcOption5083(Player player, int index, Npc npc) {}

    // Sir Prysin
    public static void npcOption5084(Player player, int index, Npc npc) {}

    // Captain Rovin
    public static void npcOption5085(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5093(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5094(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5095(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5096(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5097(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5098(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5099(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5100(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5101(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5102(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5103(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5104(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5105(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5106(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5107(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5108(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5109(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5110(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5111(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5112(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5113(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5114(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5115(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5116(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5117(Player player, int index, Npc npc) {}

    // Sylas
    public static void npcOption5118(Player player, int index, Npc npc) {}

    // Grimgnash
    public static void npcOption5119(Player player, int index, Npc npc) {}
    /* 5120 - 5375 */

    // Rupert the Beard
    public static void npcOption5120(Player player, int index, Npc npc) {}

    // Drain pipe
    public static void npcOption5122(Player player, int index, Npc npc) {}

    // Rupert the Beard
    public static void npcOption5123(Player player, int index, Npc npc) {}

    // Miazrqa
    public static void npcOption5125(Player player, int index, Npc npc) {}

    // Gnome
    public static void npcOption5130(Player player, int index, Npc npc) {}

    // Winkin
    public static void npcOption5131(Player player, int index, Npc npc) {}

    // Gnome
    public static void npcOption5132(Player player, int index, Npc npc) {}

    // Broken clay golem
    public static void npcOption5134(Player player, int index, Npc npc) {}

    // Damaged clay golem
    public static void npcOption5135(Player player, int index, Npc npc) {}

    // Clay golem
    public static void npcOption5136(Player player, int index, Npc npc) {}

    // Desert Phoenix
    public static void npcOption5137(Player player, int index, Npc npc) {}

    // Elissa
    public static void npcOption5138(Player player, int index, Npc npc) {}

    // Zanik
    public static void npcOption5147(Player player, int index, Npc npc) {}

    // Zanik
    public static void npcOption5159(Player player, int index, Npc npc) {}

    // Sergeant Mossfists
    public static void npcOption5161(Player player, int index, Npc npc) {}

    // Sergeant Slimetoes
    public static void npcOption5162(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption5163(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption5164(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption5165(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption5166(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption5167(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption5168(Player player, int index, Npc npc) {}

    // Ticket goblin
    public static void npcOption5169(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption5170(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption5171(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption5172(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption5173(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption5174(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption5175(Player player, int index, Npc npc) {}

    // Ticket dwarf
    public static void npcOption5176(Player player, int index, Npc npc) {}

    // Ambassador Alvijar
    public static void npcOption5177(Player player, int index, Npc npc) {}

    // Builder
    public static void npcOption5178(Player player, int index, Npc npc) {}

    // Builder
    public static void npcOption5179(Player player, int index, Npc npc) {}

    // Builder
    public static void npcOption5180(Player player, int index, Npc npc) {}

    // Builder
    public static void npcOption5181(Player player, int index, Npc npc) {}

    // Tegdak
    public static void npcOption5182(Player player, int index, Npc npc) {}

    // Zanik
    public static void npcOption5184(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption5185(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption5186(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption5187(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption5188(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption5189(Player player, int index, Npc npc) {}

    // Lollk
    public static void npcOption5190(Player player, int index, Npc npc) {}

    // Captain Lawgof
    public static void npcOption5191(Player player, int index, Npc npc) {}

    // Charlie the Tramp
    public static void npcOption5209(Player player, int index, Npc npc) {}

    // Katrine
    public static void npcOption5210(Player player, int index, Npc npc) {}

    // Weaponsmaster
    public static void npcOption5211(Player player, int index, Npc npc) {}

    // Straven
    public static void npcOption5212(Player player, int index, Npc npc) {}

    // Jonny the beard
    public static void npcOption5213(Player player, int index, Npc npc) {}

    // Curator Haig Halen
    public static void npcOption5214(Player player, int index, Npc npc) {}

    // King Roald
    public static void npcOption5215(Player player, int index, Npc npc) {}

    // Benny
    public static void npcOption5216(Player player, int index, Npc npc) {}

    // Jig cart
    public static void npcOption5222(Player player, int index, Npc npc) {}

    // Jig cart
    public static void npcOption5223(Player player, int index, Npc npc) {}

    // Jig cart
    public static void npcOption5224(Player player, int index, Npc npc) {}

    // Jig cart
    public static void npcOption5225(Player player, int index, Npc npc) {}

    // Jig cart
    public static void npcOption5226(Player player, int index, Npc npc) {}

    // Barbarian guard
    public static void npcOption5227(Player player, int index, Npc npc) {}

    // Kharid Scorpion
    public static void npcOption5228(Player player, int index, Npc npc) {}

    // Kharid Scorpion
    public static void npcOption5229(Player player, int index, Npc npc) {}

    // Kharid Scorpion
    public static void npcOption5230(Player player, int index, Npc npc) {}

    // Seer
    public static void npcOption5231(Player player, int index, Npc npc) {}

    // Thormac
    public static void npcOption5232(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption5233(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption5234(Player player, int index, Npc npc) {}

    // Monkey minder
    public static void npcOption5235(Player player, int index, Npc npc) {}

    // null
    public static void npcOption5236(Player player, int index, Npc npc) {}

    // Dugopul
    public static void npcOption5245(Player player, int index, Npc npc) {}

    // Salenab
    public static void npcOption5246(Player player, int index, Npc npc) {}

    // Trefaji
    public static void npcOption5247(Player player, int index, Npc npc) {}

    // Aberab
    public static void npcOption5248(Player player, int index, Npc npc) {}

    // Solihib
    public static void npcOption5249(Player player, int index, Npc npc) {}

    // Daga
    public static void npcOption5250(Player player, int index, Npc npc) {}

    // Tutab
    public static void npcOption5251(Player player, int index, Npc npc) {}

    // Ifaba
    public static void npcOption5252(Player player, int index, Npc npc) {}

    // Hamab
    public static void npcOption5253(Player player, int index, Npc npc) {}

    // Hafuba
    public static void npcOption5254(Player player, int index, Npc npc) {}

    // Denadu
    public static void npcOption5255(Player player, int index, Npc npc) {}

    // Lofu
    public static void npcOption5256(Player player, int index, Npc npc) {}

    // Kruk
    public static void npcOption5257(Player player, int index, Npc npc) {}

    // Padulah
    public static void npcOption5263(Player player, int index, Npc npc) {}

    // Awowogei
    public static void npcOption5264(Player player, int index, Npc npc) {}

    // Uwogo
    public static void npcOption5265(Player player, int index, Npc npc) {}

    // Muruwoi
    public static void npcOption5266(Player player, int index, Npc npc) {}

    // Sleeping Monkey
    public static void npcOption5267(Player player, int index, Npc npc) {}

    // Monkey Child
    public static void npcOption5268(Player player, int index, Npc npc) {}

    // The Monkey's Uncle
    public static void npcOption5269(Player player, int index, Npc npc) {}

    // The Monkey's Aunt
    public static void npcOption5270(Player player, int index, Npc npc) {}

    // Elder Guard
    public static void npcOption5277(Player player, int index, Npc npc) {}

    // Elder Guard
    public static void npcOption5278(Player player, int index, Npc npc) {}

    // Monkey
    public static void npcOption5279(Player player, int index, Npc npc) {}

    // Monkey
    public static void npcOption5280(Player player, int index, Npc npc) {}

    // Bonzara
    public static void npcOption5284(Player player, int index, Npc npc) {}

    // Linen worker
    public static void npcOption5290(Player player, int index, Npc npc) {}

    // Arianwyn
    public static void npcOption5292(Player player, int index, Npc npc) {}

    // Goreu
    public static void npcOption5297(Player player, int index, Npc npc) {}

    // Ysgawyn
    public static void npcOption5298(Player player, int index, Npc npc) {}

    // Arvel
    public static void npcOption5299(Player player, int index, Npc npc) {}

    // Mawrth
    public static void npcOption5300(Player player, int index, Npc npc) {}

    // Kelyn
    public static void npcOption5301(Player player, int index, Npc npc) {}

    // Eoin
    public static void npcOption5302(Player player, int index, Npc npc) {}

    // Iona
    public static void npcOption5303(Player player, int index, Npc npc) {}

    // Eluned
    public static void npcOption5304(Player player, int index, Npc npc) {}

    // Gnome
    public static void npcOption5309(Player player, int index, Npc npc) {}

    // Head mourner
    public static void npcOption5310(Player player, int index, Npc npc) {}

    // RPDT employee
    public static void npcOption5313(Player player, int index, Npc npc) {}

    // Wizard Cromperty
    public static void npcOption5314(Player player, int index, Npc npc) {}

    // Horacio
    public static void npcOption5315(Player player, int index, Npc npc) {}

    // Kangai Mau
    public static void npcOption5316(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5321(Player player, int index, Npc npc) {}

    // Sigmund
    public static void npcOption5322(Player player, int index, Npc npc) {}

    // Sigmund
    public static void npcOption5323(Player player, int index, Npc npc) {}

    // Ur-tag
    public static void npcOption5326(Player player, int index, Npc npc) {}

    // Cave goblin miner
    public static void npcOption5330(Player player, int index, Npc npc) {}

    // Cave goblin miner
    public static void npcOption5331(Player player, int index, Npc npc) {}

    // Cave goblin miner
    public static void npcOption5332(Player player, int index, Npc npc) {}

    // Cave goblin miner
    public static void npcOption5333(Player player, int index, Npc npc) {}

    // Cave goblin guard
    public static void npcOption5334(Player player, int index, Npc npc) {}

    // Cave goblin guard
    public static void npcOption5335(Player player, int index, Npc npc) {}

    // Cave goblin miner
    public static void npcOption5336(Player player, int index, Npc npc) {}

    // Cave goblin miner
    public static void npcOption5337(Player player, int index, Npc npc) {}

    // Cave goblin miner
    public static void npcOption5338(Player player, int index, Npc npc) {}

    // Cave goblin miner
    public static void npcOption5339(Player player, int index, Npc npc) {}

    // Mosol Rei
    public static void npcOption5340(Player player, int index, Npc npc) {}

    // Spirit of Zadimus
    public static void npcOption5341(Player player, int index, Npc npc) {}

    // Rashiliyia
    public static void npcOption5352(Player player, int index, Npc npc) {}

    // Hajedy
    public static void npcOption5356(Player player, int index, Npc npc) {}

    // Vigroy
    public static void npcOption5357(Player player, int index, Npc npc) {}

    // Kaleb Paramaya
    public static void npcOption5358(Player player, int index, Npc npc) {}

    // Yohnus
    public static void npcOption5359(Player player, int index, Npc npc) {}

    // Seravel
    public static void npcOption5360(Player player, int index, Npc npc) {}

    // Yanni Salika
    public static void npcOption5361(Player player, int index, Npc npc) {}

    // Obli
    public static void npcOption5362(Player player, int index, Npc npc) {}

    // Fernahei
    public static void npcOption5363(Player player, int index, Npc npc) {}

    // Captain Shanks
    public static void npcOption5364(Player player, int index, Npc npc) {}

    // Observatory assistant
    public static void npcOption5365(Player player, int index, Npc npc) {}

    // Observatory professor
    public static void npcOption5366(Player player, int index, Npc npc) {}

    // Sleeping guard
    public static void npcOption5368(Player player, int index, Npc npc) {}

    // Ghost
    public static void npcOption5370(Player player, int index, Npc npc) {}

    // Spirit of Scorpius
    public static void npcOption5371(Player player, int index, Npc npc) {}
    /* 5376 - 5631 */

    // Greasycheeks
    public static void npcOption5378(Player player, int index, Npc npc) {}

    // Smellytoes
    public static void npcOption5379(Player player, int index, Npc npc) {}

    // Creakyknees
    public static void npcOption5380(Player player, int index, Npc npc) {}

    // Clothears
    public static void npcOption5381(Player player, int index, Npc npc) {}

    // Guard Captain
    public static void npcOption5383(Player player, int index, Npc npc) {}

    // Sandy
    public static void npcOption5384(Player player, int index, Npc npc) {}

    // Mazion
    public static void npcOption5386(Player player, int index, Npc npc) {}

    // Blaec
    public static void npcOption5387(Player player, int index, Npc npc) {}

    // Reeso
    public static void npcOption5388(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5389(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5390(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5391(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5392(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5393(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5394(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5395(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5396(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5397(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5398(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5399(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5400(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5401(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5402(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5403(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5404(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5405(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5406(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5407(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5408(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5409(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5410(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5412(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5413(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5414(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5415(Player player, int index, Npc npc) {}

    // Combat stone
    public static void npcOption5416(Player player, int index, Npc npc) {}

    // Chief servant
    public static void npcOption5417(Player player, int index, Npc npc) {}

    // Taxidermist
    public static void npcOption5418(Player player, int index, Npc npc) {}

    // Estate agent
    public static void npcOption5419(Player player, int index, Npc npc) {}

    // Stonemason
    public static void npcOption5420(Player player, int index, Npc npc) {}

    // Sir Renitee
    public static void npcOption5421(Player player, int index, Npc npc) {}

    // Sawmill operator
    public static void npcOption5422(Player player, int index, Npc npc) {}

    // Garden supplier
    public static void npcOption5423(Player player, int index, Npc npc) {}

    // null
    public static void npcOption5424(Player player, int index, Npc npc) {}

    // Capt' Arnav
    public static void npcOption5426(Player player, int index, Npc npc) {}

    // Flippa
    public static void npcOption5427(Player player, int index, Npc npc) {}

    // Tilt
    public static void npcOption5428(Player player, int index, Npc npc) {}

    // Frog
    public static void npcOption5429(Player player, int index, Npc npc) {}

    // Frog
    public static void npcOption5430(Player player, int index, Npc npc) {}

    // Frog
    public static void npcOption5431(Player player, int index, Npc npc) {}

    // Frog
    public static void npcOption5432(Player player, int index, Npc npc) {}

    // Caleb
    public static void npcOption5433(Player player, int index, Npc npc) {}

    // Niles
    public static void npcOption5436(Player player, int index, Npc npc) {}

    // Miles
    public static void npcOption5437(Player player, int index, Npc npc) {
        for (int i = 0; i < player.getInventory().size(); i++) {
            int itemID = player.getInventory().getID(i);
            int notedID = ItemDef.getNotedID(itemID);
            if (itemID == -1 || notedID == -1 || ItemDef.getNoted(itemID) || ItemDef.getStackable(itemID)) {
                continue;
            }
            player.getInventory().deleteItem(itemID, 1, i);
            player.getInventory().addItem(notedID, 1, i);
        }
    }

    // Giles
    public static void npcOption5438(Player player, int index, Npc npc) {}

    // Niles
    public static void npcOption5439(Player player, int index, Npc npc) {}

    // Miles
    public static void npcOption5440(Player player, int index, Npc npc) {}

    // Giles
    public static void npcOption5441(Player player, int index, Npc npc) {}

    // Security Guard
    public static void npcOption5442(Player player, int index, Npc npc) {
        player.getInventory().addOrDropItem(9003, 1);
    }

    // Johnathon
    public static void npcOption5443(Player player, int index, Npc npc) {}

    // Cap'n Hand
    public static void npcOption5444(Player player, int index, Npc npc) {}

    // Johnathon
    public static void npcOption5445(Player player, int index, Npc npc) {}

    // Advisor Ghrim
    public static void npcOption5447(Player player, int index, Npc npc) {}

    // Advisor Ghrim
    public static void npcOption5448(Player player, int index, Npc npc) {}

    // Bob Barter (herbs)
    public static void npcOption5449(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bobbarter", 0);
        } else if (index == 2) {
            player.openShop("herb_exchange");
        } else if (index == 3) {
            player.getSkills().decantAllPotions();
        }
    }

    // Murky Matt (runes)
    public static void npcOption5450(Player player, int index, Npc npc) {}

    // Relobo Blinyo (logs)
    public static void npcOption5451(Player player, int index, Npc npc) {}

    // Hofuthand (weapons and armour)
    public static void npcOption5452(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption5453(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption5454(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption5455(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption5456(Player player, int index, Npc npc) {}

    // Druid
    public static void npcOption5457(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption5464(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption5465(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption5467(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption5468(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption5469(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption5470(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption5471(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption5474(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption5476(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption5478(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption5480(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption5482(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption5483(Player player, int index, Npc npc) {}

    // Suspect
    public static void npcOption5484(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption5485(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption5486(Player player, int index, Npc npc) {}

    // Molly
    public static void npcOption5487(Player player, int index, Npc npc) {}

    // Balloon Animal
    public static void npcOption5488(Player player, int index, Npc npc) {}

    // Balloon Animal
    public static void npcOption5489(Player player, int index, Npc npc) {}

    // Balloon Animal
    public static void npcOption5491(Player player, int index, Npc npc) {}

    // Balloon Animal
    public static void npcOption5492(Player player, int index, Npc npc) {}

    // Balloon Animal
    public static void npcOption5493(Player player, int index, Npc npc) {}

    // Mr. Mordaut
    public static void npcOption5504(Player player, int index, Npc npc) {}

    // Sandwich lady
    public static void npcOption5510(Player player, int index, Npc npc) {}

    // Guard Recruiter
    public static void npcOption5511(Player player, int index, Npc npc) {}

    // Gardener
    public static void npcOption5512(Player player, int index, Npc npc) {}

    // Elite Void Knight
    public static void npcOption5513(Player player, int index, Npc npc) {}

    // Lesser Fanatic
    public static void npcOption5514(Player player, int index, Npc npc) {}

    // TzHaar-Mej
    public static void npcOption5516(Player player, int index, Npc npc) {}

    // The 'Wedge'
    public static void npcOption5517(Player player, int index, Npc npc) {}

    // Elder Gnome child
    public static void npcOption5518(Player player, int index, Npc npc) {}

    // Two-pints
    public static void npcOption5519(Player player, int index, Npc npc) {}

    // Jarr
    public static void npcOption5520(Player player, int index, Npc npc) {}

    // Le-sabr￨
    public static void npcOption5521(Player player, int index, Npc npc) {}

    // Flax keeper
    public static void npcOption5522(Player player, int index, Npc npc) {}

    // Hatius Cosaintus
    public static void npcOption5523(Player player, int index, Npc npc) {}

    // Sir Rebral
    public static void npcOption5524(Player player, int index, Npc npc) {}

    // Toby
    public static void npcOption5525(Player player, int index, Npc npc) {}

    // Thorodin
    public static void npcOption5526(Player player, int index, Npc npc) {}

    // Twiggy O'Korn
    public static void npcOption5527(Player player, int index, Npc npc) {
        player.openShop("diaries");
    }

    // Hunting expert
    public static void npcOption5529(Player player, int index, Npc npc) {}

    // Spotted kebbit
    public static void npcOption5531(Player player, int index, Npc npc) {}

    // Dark kebbit
    public static void npcOption5532(Player player, int index, Npc npc) {}

    // Dashing kebbit
    public static void npcOption5533(Player player, int index, Npc npc) {}

    // Whirlpool
    public static void npcOption5534(Player player, int index, Npc npc) {}

    // Vet'ion Jr.
    public static void npcOption5536(Player player, int index, Npc npc) {}

    // Vet'ion Jr.
    public static void npcOption5537(Player player, int index, Npc npc) {}

    // Jack
    public static void npcOption5544(Player player, int index, Npc npc) {}

    // Jill
    public static void npcOption5545(Player player, int index, Npc npc) {}

    // Jeff
    public static void npcOption5546(Player player, int index, Npc npc) {}

    // Scorpia's offspring
    public static void npcOption5547(Player player, int index, Npc npc) {}

    // Tropical wagtail
    public static void npcOption5548(Player player, int index, Npc npc) {}

    // Crimson swift
    public static void npcOption5549(Player player, int index, Npc npc) {}

    // Cerulean twitch
    public static void npcOption5550(Player player, int index, Npc npc) {}

    // Golden warbler
    public static void npcOption5551(Player player, int index, Npc npc) {}

    // Copper longtail
    public static void npcOption5552(Player player, int index, Npc npc) {}

    // Black warlock
    public static void npcOption5553(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Snowy knight
    public static void npcOption5554(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Sapphire glacialis
    public static void npcOption5555(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Ruby harvest
    public static void npcOption5556(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Venenatis spiderling
    public static void npcOption5557(Player player, int index, Npc npc) {}

    // Callisto cub
    public static void npcOption5558(Player player, int index, Npc npc) {}

    // Vet'ion Jr.
    public static void npcOption5559(Player player, int index, Npc npc) {}

    // Vet'ion Jr.
    public static void npcOption5560(Player player, int index, Npc npc) {}

    // Scorpia's offspring
    public static void npcOption5561(Player player, int index, Npc npc) {}

    // Mercy
    public static void npcOption5562(Player player, int index, Npc npc) {}

    // Zombie
    public static void npcOption5568(Player player, int index, Npc npc) {}

    // Most of a Zombie
    public static void npcOption5569(Player player, int index, Npc npc) {}

    // Most of a Zombie
    public static void npcOption5570(Player player, int index, Npc npc) {}

    // Zombie
    public static void npcOption5571(Player player, int index, Npc npc) {}

    // Most of a Zombie
    public static void npcOption5572(Player player, int index, Npc npc) {}

    // Zombie Head
    public static void npcOption5573(Player player, int index, Npc npc) {}

    // Zombie
    public static void npcOption5574(Player player, int index, Npc npc) {}

    // Half-Zombie
    public static void npcOption5575(Player player, int index, Npc npc) {}

    // Other Half-Zombie
    public static void npcOption5576(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption5577(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption5578(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption5579(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption5580(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption5581(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption5582(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption5584(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption5585(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption5586(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption5587(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption5588(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption5589(Player player, int index, Npc npc) {}

    // Wily hellcat
    public static void npcOption5590(Player player, int index, Npc npc) {}

    // Kitten
    public static void npcOption5591(Player player, int index, Npc npc) {}

    // Kitten
    public static void npcOption5592(Player player, int index, Npc npc) {}

    // Kitten
    public static void npcOption5593(Player player, int index, Npc npc) {}

    // Kitten
    public static void npcOption5594(Player player, int index, Npc npc) {}

    // Kitten
    public static void npcOption5595(Player player, int index, Npc npc) {}

    // Kitten
    public static void npcOption5596(Player player, int index, Npc npc) {}

    // Hell-kitten
    public static void npcOption5597(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption5598(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption5599(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption5600(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption5601(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption5602(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption5603(Player player, int index, Npc npc) {}

    // Overgrown hellcat
    public static void npcOption5604(Player player, int index, Npc npc) {}

    // Murphy
    public static void npcOption5607(Player player, int index, Npc npc) {}

    // Murphy
    public static void npcOption5608(Player player, int index, Npc npc) {}

    // Murphy
    public static void npcOption5609(Player player, int index, Npc npc) {}

    // Murphy
    public static void npcOption5610(Player player, int index, Npc npc) {}

    // Sam
    public static void npcOption5613(Player player, int index, Npc npc) {}

    // Rachael
    public static void npcOption5614(Player player, int index, Npc npc) {}

    // Swamp snake
    public static void npcOption5618(Player player, int index, Npc npc) {}
    /* 5632 - 5887 */

    // Vote manager
    public static void npcOption5721(Player player, int index, Npc npc) {
        if (Main.isBeta()) {
            player.getGameEncoder().sendMessage("You can't do this on beta worlds.");
            return;
        }
        if (index == 0) {
            player.openDialogue("vote", 0);
        } else if (index == 3) {
            if (player.isGameModeNormal()) {
                player.openShop("vote");
            } else {
                player.openShop("vote_iron");
            }
        }
    }

    // Barricade
    public static void npcOption5722(Player player, int index, Npc npc) {}

    // Barricade
    public static void npcOption5723(Player player, int index, Npc npc) {}

    // Barricade
    public static void npcOption5724(Player player, int index, Npc npc) {}

    // Barricade
    public static void npcOption5725(Player player, int index, Npc npc) {}

    // Elnock Inquisitor
    public static void npcOption5734(Player player, int index, Npc npc) {
        player.openShop("skilling");
    }

    // Impling
    public static void npcOption5735(Player player, int index, Npc npc) {}

    // Fairy Aeryka
    public static void npcOption5736(Player player, int index, Npc npc) {}

    // Wandering impling
    public static void npcOption5737(Player player, int index, Npc npc) {}

    // Simon Templeton
    public static void npcOption5786(Player player, int index, Npc npc) {}

    // Cap'n Izzy No-Beard
    public static void npcOption5789(Player player, int index, Npc npc) {
        player.openShop("agility");
    }

    // Pirate Jackie the Fruit
    public static void npcOption5790(Player player, int index, Npc npc) {}

    // Party Pete
    public static void npcOption5792(Player player, int index, Npc npc) {}

    // Knight
    public static void npcOption5793(Player player, int index, Npc npc) {}

    // Megan
    public static void npcOption5794(Player player, int index, Npc npc) {}

    // Lucy
    public static void npcOption5795(Player player, int index, Npc npc) {}

    // Tanner
    public static void npcOption5809(Player player, int index, Npc npc) {}

    // Master Crafter
    public static void npcOption5810(Player player, int index, Npc npc) {}

    // Master Crafter
    public static void npcOption5811(Player player, int index, Npc npc) {}

    // Master Crafter
    public static void npcOption5812(Player player, int index, Npc npc) {}

    // Bert
    public static void npcOption5815(Player player, int index, Npc npc) {}

    // Bert
    public static void npcOption5819(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption5820(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption5821(Player player, int index, Npc npc) {}

    // Bork Sigmundson
    public static void npcOption5827(Player player, int index, Npc npc) {}

    // Martin the Master Gardener
    public static void npcOption5832(Player player, int index, Npc npc) {}

    // Frog
    public static void npcOption5833(Player player, int index, Npc npc) {}

    // Co-ordinator
    public static void npcOption5835(Player player, int index, Npc npc) {}

    // Fairy Nuff
    public static void npcOption5836(Player player, int index, Npc npc) {}

    // Fairy Godfather
    public static void npcOption5837(Player player, int index, Npc npc) {}

    // Slim Louie
    public static void npcOption5838(Player player, int index, Npc npc) {}

    // Fat Rocco
    public static void npcOption5839(Player player, int index, Npc npc) {}

    // Gatekeeper
    public static void npcOption5840(Player player, int index, Npc npc) {}

    // Zandar Horfyre
    public static void npcOption5841(Player player, int index, Npc npc) {}

    // Cow
    public static void npcOption5842(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption5843(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption5844(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption5845(Player player, int index, Npc npc) {}

    // Sheep
    public static void npcOption5846(Player player, int index, Npc npc) {}

    // Zanaris choir
    public static void npcOption5847(Player player, int index, Npc npc) {}

    // Gatekeeper
    public static void npcOption5855(Player player, int index, Npc npc) {}

    // Fairy chef
    public static void npcOption5856(Player player, int index, Npc npc) {}

    // null
    public static void npcOption5857(Player player, int index, Npc npc) {}

    // null
    public static void npcOption5858(Player player, int index, Npc npc) {}

    // Captain Ned
    public static void npcOption5864(Player player, int index, Npc npc) {}

    // Key Master
    public static void npcOption5870(Player player, int index, Npc npc) {}

    // Abyssal orphan
    public static void npcOption5883(Player player, int index, Npc npc) {}

    // Abyssal orphan
    public static void npcOption5884(Player player, int index, Npc npc) {}

    // James
    public static void npcOption5885(Player player, int index, Npc npc) {}
    /* 5888 - 6143 */

    // TzRek-Jad
    public static void npcOption5892(Player player, int index, Npc npc) {}

    // TzRek-Jad
    public static void npcOption5893(Player player, int index, Npc npc) {}

    // <col=00ffff>Portal</col>
    public static void npcOption5895(Player player, int index, Npc npc) {}

    // <col=00efef>Portal</col>
    public static void npcOption5897(Player player, int index, Npc npc) {}

    // Probita
    public static void npcOption5906(Player player, int index, Npc npc) {
        player.openShop("pets");
    }

    // Chaos Elemental Jr.
    public static void npcOption5907(Player player, int index, Npc npc) {}

    // Grace
    public static void npcOption5919(Player player, int index, Npc npc) {}

    // Skullball
    public static void npcOption5922(Player player, int index, Npc npc) {}

    // Skullball Boss
    public static void npcOption5923(Player player, int index, Npc npc) {}

    // Agility Boss
    public static void npcOption5924(Player player, int index, Npc npc) {}

    // Skullball Trainer
    public static void npcOption5925(Player player, int index, Npc npc) {}

    // Agility Trainer
    public static void npcOption5927(Player player, int index, Npc npc) {}

    // Werewolf
    public static void npcOption5928(Player player, int index, Npc npc) {}

    // Knight
    public static void npcOption5929(Player player, int index, Npc npc) {}

    // Jarvald
    public static void npcOption5937(Player player, int index, Npc npc) {}

    // Al the Camel
    public static void npcOption5949(Player player, int index, Npc npc) {}

    // Elly the Camel
    public static void npcOption5950(Player player, int index, Npc npc) {}

    // Ollie the Camel
    public static void npcOption5951(Player player, int index, Npc npc) {}

    // Cam the Camel
    public static void npcOption5952(Player player, int index, Npc npc) {}

    // Alice the Camel
    public static void npcOption5954(Player player, int index, Npc npc) {}

    // Neferti the Camel
    public static void npcOption5955(Player player, int index, Npc npc) {}

    // Ali the Leaflet Dropper
    public static void npcOption5956(Player player, int index, Npc npc) {}

    // Ali the Smith
    public static void npcOption5957(Player player, int index, Npc npc) {}

    // Ali the Farmer
    public static void npcOption5958(Player player, int index, Npc npc) {}

    // Ali the Tailor
    public static void npcOption5959(Player player, int index, Npc npc) {}

    // Ali the Guard
    public static void npcOption5960(Player player, int index, Npc npc) {}

    // Pizzaz Hat
    public static void npcOption5977(Player player, int index, Npc npc) {}

    // Entrance Guardian
    public static void npcOption5978(Player player, int index, Npc npc) {}

    // Telekinetic Guardian
    public static void npcOption5979(Player player, int index, Npc npc) {}

    // Alchemy Guardian
    public static void npcOption5980(Player player, int index, Npc npc) {}

    // Enchantment Guardian
    public static void npcOption5981(Player player, int index, Npc npc) {}

    // Graveyard Guardian
    public static void npcOption5982(Player player, int index, Npc npc) {}

    // <col=ff9040>Pet rock</col>
    public static void npcOption5983(Player player, int index, Npc npc) {}

    // Rewards Guardian
    public static void npcOption5984(Player player, int index, Npc npc) {}

    // Charmed Warrior
    public static void npcOption5985(Player player, int index, Npc npc) {}

    // Charmed Warrior
    public static void npcOption5986(Player player, int index, Npc npc) {}

    // Charmed Warrior
    public static void npcOption5987(Player player, int index, Npc npc) {}

    // Charmed Warrior
    public static void npcOption5988(Player player, int index, Npc npc) {}

    // Secretary
    public static void npcOption5989(Player player, int index, Npc npc) {}

    // Purple Pewter Secretary
    public static void npcOption5990(Player player, int index, Npc npc) {}

    // Yellow Fortune Secretary
    public static void npcOption5991(Player player, int index, Npc npc) {}

    // Blue Opal Secretary
    public static void npcOption5992(Player player, int index, Npc npc) {}

    // Green Gemstone Secretary
    public static void npcOption5993(Player player, int index, Npc npc) {}

    // White Chisel Secretary
    public static void npcOption5994(Player player, int index, Npc npc) {}

    // Silver Cog Secretary
    public static void npcOption5995(Player player, int index, Npc npc) {}

    // Brown Engine Secretary
    public static void npcOption5996(Player player, int index, Npc npc) {}

    // Red Axe Secretary
    public static void npcOption5997(Player player, int index, Npc npc) {}

    // Purple Pewter Director
    public static void npcOption5998(Player player, int index, Npc npc) {}

    // Blue Opal Director
    public static void npcOption5999(Player player, int index, Npc npc) {}

    // Yellow Fortune Director
    public static void npcOption6000(Player player, int index, Npc npc) {}

    // Orlando Smith
    public static void npcOption6001(Player player, int index, Npc npc) {}

    // Natural historian
    public static void npcOption6002(Player player, int index, Npc npc) {}

    // Natural historian
    public static void npcOption6003(Player player, int index, Npc npc) {}

    // Natural historian
    public static void npcOption6004(Player player, int index, Npc npc) {}

    // Natural historian
    public static void npcOption6005(Player player, int index, Npc npc) {}

    // Torrcs
    public static void npcOption6019(Player player, int index, Npc npc) {}

    // Marfet
    public static void npcOption6020(Player player, int index, Npc npc) {}

    // Green Gemstone Director
    public static void npcOption6021(Player player, int index, Npc npc) {}

    // White Chisel Director
    public static void npcOption6022(Player player, int index, Npc npc) {}

    // Silver Cog Director
    public static void npcOption6023(Player player, int index, Npc npc) {}

    // Brown Engine Director
    public static void npcOption6024(Player player, int index, Npc npc) {}

    // Red Axe Director
    public static void npcOption6025(Player player, int index, Npc npc) {}

    // Red Axe Cat
    public static void npcOption6026(Player player, int index, Npc npc) {}

    // Trade Referee
    public static void npcOption6043(Player player, int index, Npc npc) {}

    // Supreme Commander
    public static void npcOption6044(Player player, int index, Npc npc) {}

    // Commander Veldaban
    public static void npcOption6045(Player player, int index, Npc npc) {}

    // Black Guard
    public static void npcOption6046(Player player, int index, Npc npc) {}

    // Black Guard
    public static void npcOption6047(Player player, int index, Npc npc) {}

    // Black Guard
    public static void npcOption6048(Player player, int index, Npc npc) {}

    // Black Guard
    public static void npcOption6049(Player player, int index, Npc npc) {}

    // Black Guard Berserker
    public static void npcOption6050(Player player, int index, Npc npc) {}

    // Black Guard Berserker
    public static void npcOption6051(Player player, int index, Npc npc) {}

    // Black Guard Berserker
    public static void npcOption6052(Player player, int index, Npc npc) {}

    // Gnome emissary
    public static void npcOption6053(Player player, int index, Npc npc) {}

    // Gnome traveller
    public static void npcOption6054(Player player, int index, Npc npc) {}

    // Gnome traveller
    public static void npcOption6055(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption6056(Player player, int index, Npc npc) {}

    // Ranging Guild Doorman
    public static void npcOption6057(Player player, int index, Npc npc) {}

    // Leatherworker
    public static void npcOption6058(Player player, int index, Npc npc) {}

    // Armour salesman
    public static void npcOption6059(Player player, int index, Npc npc) {}

    // Bow and Arrow salesman
    public static void npcOption6060(Player player, int index, Npc npc) {}

    // Tower Advisor
    public static void npcOption6061(Player player, int index, Npc npc) {}

    // Tower Advisor
    public static void npcOption6062(Player player, int index, Npc npc) {}

    // Tower Advisor
    public static void npcOption6063(Player player, int index, Npc npc) {}

    // Tower Advisor
    public static void npcOption6064(Player player, int index, Npc npc) {}

    // Tribal Weapon Salesman
    public static void npcOption6069(Player player, int index, Npc npc) {}

    // Competition Judge
    public static void npcOption6070(Player player, int index, Npc npc) {}

    // Ticket Merchant
    public static void npcOption6071(Player player, int index, Npc npc) {}

    // Jimmy
    public static void npcOption6072(Player player, int index, Npc npc) {}

    // Ref
    public static void npcOption6073(Player player, int index, Npc npc) {}

    // Ref
    public static void npcOption6074(Player player, int index, Npc npc) {}

    // Gnome child
    public static void npcOption6077(Player player, int index, Npc npc) {}

    // Gnome child
    public static void npcOption6078(Player player, int index, Npc npc) {}

    // Gnome child
    public static void npcOption6079(Player player, int index, Npc npc) {}

    // Gnome trainer
    public static void npcOption6080(Player player, int index, Npc npc) {}

    // Gnome banker
    public static void npcOption6084(Player player, int index, Npc npc) {}

    // Gnome woman
    public static void npcOption6086(Player player, int index, Npc npc) {}

    // Gnome woman
    public static void npcOption6087(Player player, int index, Npc npc) {}

    // Captain Errdo
    public static void npcOption6088(Player player, int index, Npc npc) {}

    // Captain Dalbur
    public static void npcOption6089(Player player, int index, Npc npc) {}

    // Captain Bleemadge
    public static void npcOption6090(Player player, int index, Npc npc) {}

    // Captain Errdo
    public static void npcOption6091(Player player, int index, Npc npc) {}

    // Captain Klemfoodle
    public static void npcOption6092(Player player, int index, Npc npc) {}

    // Nigel
    public static void npcOption6093(Player player, int index, Npc npc) {}

    // Gnome
    public static void npcOption6094(Player player, int index, Npc npc) {}

    // Gnome
    public static void npcOption6095(Player player, int index, Npc npc) {}

    // Gnome
    public static void npcOption6096(Player player, int index, Npc npc) {}

    // Lieutenant Schepbur
    public static void npcOption6100(Player player, int index, Npc npc) {}

    // Trainer Nacklepen
    public static void npcOption6101(Player player, int index, Npc npc) {}
    /* 6144 - 6399 */

    // null
    public static void npcOption6186(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6194(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6195(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6196(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6197(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6198(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6199(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6200(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6241(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6242(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6243(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6244(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6245(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6246(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6247(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6248(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6249(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6250(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6252(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6275(Player player, int index, Npc npc) {}

    // null
    public static void npcOption6276(Player player, int index, Npc npc) {}

    // Bloodhound
    public static void npcOption6296(Player player, int index, Npc npc) {}
    /* 6400 - 6655 */

    // Sharimika
    public static void npcOption6414(Player player, int index, Npc npc) {}

    // Sharimika
    public static void npcOption6415(Player player, int index, Npc npc) {}

    // Mamma Bufetta
    public static void npcOption6416(Player player, int index, Npc npc) {}

    // Mamma Bufetta
    public static void npcOption6417(Player player, int index, Npc npc) {}

    // Layleen
    public static void npcOption6418(Player player, int index, Npc npc) {}

    // Layleen
    public static void npcOption6419(Player player, int index, Npc npc) {}

    // Karaday
    public static void npcOption6420(Player player, int index, Npc npc) {}

    // Karaday
    public static void npcOption6421(Player player, int index, Npc npc) {}

    // Safta Doc
    public static void npcOption6422(Player player, int index, Npc npc) {}

    // Safta Doc
    public static void npcOption6423(Player player, int index, Npc npc) {}

    // Gabooty
    public static void npcOption6424(Player player, int index, Npc npc) {}

    // Gabooty
    public static void npcOption6425(Player player, int index, Npc npc) {}

    // Fanellaman
    public static void npcOption6426(Player player, int index, Npc npc) {}

    // Fanellaman
    public static void npcOption6427(Player player, int index, Npc npc) {}

    // Jagbakoba
    public static void npcOption6428(Player player, int index, Npc npc) {}

    // Jagbakoba
    public static void npcOption6429(Player player, int index, Npc npc) {}

    // Murcaily
    public static void npcOption6430(Player player, int index, Npc npc) {}

    // Murcaily
    public static void npcOption6431(Player player, int index, Npc npc) {}

    // Rionasta
    public static void npcOption6432(Player player, int index, Npc npc) {}

    // Rionasta
    public static void npcOption6433(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption6434(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption6435(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption6436(Player player, int index, Npc npc) {}

    // Cave goblin
    public static void npcOption6437(Player player, int index, Npc npc) {}

    // Odovacar
    public static void npcOption6439(Player player, int index, Npc npc) {}

    // Rufus
    public static void npcOption6478(Player player, int index, Npc npc) {}

    // <col=00ffff>Eye</col>
    public static void npcOption6479(Player player, int index, Npc npc) {}

    // <col=00ffff>Eye</col>
    public static void npcOption6480(Player player, int index, Npc npc) {}

    // Mac
    public static void npcOption6481(Player player, int index, Npc npc) {
        player.openDialogue("mac", 0);
    }

    // Boulder
    public static void npcOption6482(Player player, int index, Npc npc) {}

    // Gelin
    public static void npcOption6484(Player player, int index, Npc npc) {}

    // Financial Seer
    public static void npcOption6485(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption6488(Player player, int index, Npc npc) {}

    // Squire
    public static void npcOption6509(Player player, int index, Npc npc) {}

    // Financial Wizard
    public static void npcOption6510(Player player, int index, Npc npc) {}

    // Magnus Gram
    public static void npcOption6512(Player player, int index, Npc npc) {}

    // Magnus Gram
    public static void npcOption6513(Player player, int index, Npc npc) {}

    // Financial Wizard
    public static void npcOption6514(Player player, int index, Npc npc) {}

    // Financial Wizard
    public static void npcOption6515(Player player, int index, Npc npc) {}

    // Financial Wizard
    public static void npcOption6516(Player player, int index, Npc npc) {}

    // Financial Wizard
    public static void npcOption6517(Player player, int index, Npc npc) {}

    // Financial Wizard
    public static void npcOption6518(Player player, int index, Npc npc) {}

    // Financial Wizard
    public static void npcOption6519(Player player, int index, Npc npc) {}

    // Barker
    public static void npcOption6524(Player player, int index, Npc npc) {}

    // Fidelio
    public static void npcOption6525(Player player, int index, Npc npc) {}

    // Sbott
    public static void npcOption6526(Player player, int index, Npc npc) {}

    // Roavar
    public static void npcOption6527(Player player, int index, Npc npc) {}

    // Blurberry
    public static void npcOption6531(Player player, int index, Npc npc) {}

    // Barman
    public static void npcOption6532(Player player, int index, Npc npc) {}

    // Romily Weaklax
    public static void npcOption6533(Player player, int index, Npc npc) {}

    // Guard
    public static void npcOption6561(Player player, int index, Npc npc) {}

    // Prospector Percy
    public static void npcOption6562(Player player, int index, Npc npc) {}

    // Uri
    public static void npcOption6584(Player player, int index, Npc npc) {}

    // Sherlock
    public static void npcOption6586(Player player, int index, Npc npc) {}

    // Dr Ford
    public static void npcOption6589(Player player, int index, Npc npc) {}

    // Sister Scarophia
    public static void npcOption6590(Player player, int index, Npc npc) {}

    // <col=00ffff>Ent trunk</col>
    public static void npcOption6595(Player player, int index, Npc npc) {}

    // Mandrith
    public static void npcOption6599(Player player, int index, Npc npc) {}

    // <col=00ffff>Rocks</col>
    public static void npcOption6601(Player player, int index, Npc npc) {}

    // <col=00ffff>Boulder</col>
    public static void npcOption6621(Player player, int index, Npc npc) {
        if (player.getController().isMagicBound()) {
            player.getGameEncoder()
                    .sendMessage("A magical force stops you from moving for "
                            + Time.tickToSec(player.getMovement().getMagicBindDelay() - Movement.MAGIC_REBIND_DELAY)
                            + " more seconds.");
            return;
        }
        if (npc.getX() == 3053 && npc.getY() == 10165) {
            if (player.getX() >= 3055) {
                player.getMovement().teleport(3052, 10165, 3);
            } else {
                player.getMovement().teleport(3055, 10165, 3);
            }
        }
    }

    // Dagannoth Supreme Jr.
    public static void npcOption6626(Player player, int index, Npc npc) {}

    // Dagannoth Prime Jr.
    public static void npcOption6627(Player player, int index, Npc npc) {}

    // Dagannoth Supreme Jr.
    public static void npcOption6628(Player player, int index, Npc npc) {}

    // Dagannoth Prime Jr.
    public static void npcOption6629(Player player, int index, Npc npc) {}

    // Dagannoth Rex Jr.
    public static void npcOption6630(Player player, int index, Npc npc) {}

    // Kree'arra Jr.
    public static void npcOption6631(Player player, int index, Npc npc) {}

    // General Graardor Jr.
    public static void npcOption6632(Player player, int index, Npc npc) {}

    // Zilyana Jr.
    public static void npcOption6633(Player player, int index, Npc npc) {}

    // K'ril Tsutsaroth Jr.
    public static void npcOption6634(Player player, int index, Npc npc) {}

    // Baby Mole
    public static void npcOption6635(Player player, int index, Npc npc) {}

    // Prince Black Dragon
    public static void npcOption6636(Player player, int index, Npc npc) {}

    // Kalphite Princess
    public static void npcOption6637(Player player, int index, Npc npc) {}

    // Kalphite Princess
    public static void npcOption6638(Player player, int index, Npc npc) {}

    // Smoke Devil
    public static void npcOption6639(Player player, int index, Npc npc) {}

    // Kraken
    public static void npcOption6640(Player player, int index, Npc npc) {}

    // Dagannoth Rex Jr.
    public static void npcOption6641(Player player, int index, Npc npc) {}

    // Penance Pet
    public static void npcOption6642(Player player, int index, Npc npc) {}

    // Kree'arra Jr.
    public static void npcOption6643(Player player, int index, Npc npc) {}

    // General Graardor Jr.
    public static void npcOption6644(Player player, int index, Npc npc) {}

    // Zilyana Jr.
    public static void npcOption6646(Player player, int index, Npc npc) {}

    // K'ril Tsutsaroth Jr.
    public static void npcOption6647(Player player, int index, Npc npc) {}

    // Lokar Searunner
    public static void npcOption6648(Player player, int index, Npc npc) {}

    // Captain Bentley
    public static void npcOption6649(Player player, int index, Npc npc) {}

    // Captain Bentley
    public static void npcOption6650(Player player, int index, Npc npc) {}

    // Baby Mole
    public static void npcOption6651(Player player, int index, Npc npc) {}

    // Prince Black Dragon
    public static void npcOption6652(Player player, int index, Npc npc) {}

    // Kalphite Princess
    public static void npcOption6653(Player player, int index, Npc npc) {}

    // Kalphite Princess
    public static void npcOption6654(Player player, int index, Npc npc) {}

    // Smoke Devil
    public static void npcOption6655(Player player, int index, Npc npc) {}
    /* 6656 - 6911 */

    // Kraken
    public static void npcOption6656(Player player, int index, Npc npc) {}

    // Pet rock
    public static void npcOption6657(Player player, int index, Npc npc) {}

    // Fishbowl
    public static void npcOption6658(Player player, int index, Npc npc) {}

    // Fishbowl
    public static void npcOption6659(Player player, int index, Npc npc) {}

    // Fishbowl
    public static void npcOption6660(Player player, int index, Npc npc) {}

    // Clockwork cat
    public static void npcOption6661(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption6662(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption6663(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption6664(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption6665(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption6666(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption6667(Player player, int index, Npc npc) {}

    // Hellcat
    public static void npcOption6668(Player player, int index, Npc npc) {}

    // Penance Pet
    public static void npcOption6674(Player player, int index, Npc npc) {}

    // Waydar
    public static void npcOption6675(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption6676(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption6677(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption6678(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption6679(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption6680(Player player, int index, Npc npc) {}

    // Overgrown cat
    public static void npcOption6681(Player player, int index, Npc npc) {}

    // Overgrown hellcat
    public static void npcOption6682(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption6683(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption6684(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption6685(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption6686(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption6687(Player player, int index, Npc npc) {}

    // Lazy cat
    public static void npcOption6688(Player player, int index, Npc npc) {}

    // Lazy hellcat
    public static void npcOption6689(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption6690(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption6691(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption6692(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption6693(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption6694(Player player, int index, Npc npc) {}

    // Wily cat
    public static void npcOption6695(Player player, int index, Npc npc) {}

    // Wily hellcat
    public static void npcOption6696(Player player, int index, Npc npc) {}

    // Financial Wizard
    public static void npcOption6703(Player player, int index, Npc npc) {}

    // Heron
    public static void npcOption6715(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption6716(Player player, int index, Npc npc) {}

    // Beaver
    public static void npcOption6717(Player player, int index, Npc npc) {}

    // Baby Chinchompa
    public static void npcOption6718(Player player, int index, Npc npc) {}

    // Baby Chinchompa
    public static void npcOption6719(Player player, int index, Npc npc) {}

    // Baby Chinchompa
    public static void npcOption6720(Player player, int index, Npc npc) {}

    // Baby Chinchompa
    public static void npcOption6721(Player player, int index, Npc npc) {}

    // Heron
    public static void npcOption6722(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption6723(Player player, int index, Npc npc) {}

    // Beaver
    public static void npcOption6724(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption6731(Player player, int index, Npc npc) {}

    // Postie Pete
    public static void npcOption6738(Player player, int index, Npc npc) {}

    // Mysterious Old Man
    public static void npcOption6742(Player player, int index, Npc npc) {}

    // Sergeant Damien
    public static void npcOption6743(Player player, int index, Npc npc) {}

    // Flippa
    public static void npcOption6744(Player player, int index, Npc npc) {}

    // Leo
    public static void npcOption6745(Player player, int index, Npc npc) {}

    // Leo
    public static void npcOption6746(Player player, int index, Npc npc) {}

    // Bee keeper
    public static void npcOption6747(Player player, int index, Npc npc) {}

    // Freaky Forester
    public static void npcOption6748(Player player, int index, Npc npc) {}

    // Dunce
    public static void npcOption6749(Player player, int index, Npc npc) {}

    // Mysterious Old Man
    public static void npcOption6750(Player player, int index, Npc npc) {}

    // Mysterious Old Man
    public static void npcOption6751(Player player, int index, Npc npc) {}

    // Mysterious Old Man
    public static void npcOption6752(Player player, int index, Npc npc) {}

    // Mysterious Old Man
    public static void npcOption6753(Player player, int index, Npc npc) {}

    // Evil Bob
    public static void npcOption6754(Player player, int index, Npc npc) {}

    // Quiz Master
    public static void npcOption6755(Player player, int index, Npc npc) {}

    // Baby Chinchompa
    public static void npcOption6756(Player player, int index, Npc npc) {}

    // Baby Chinchompa
    public static void npcOption6757(Player player, int index, Npc npc) {}

    // Baby Chinchompa
    public static void npcOption6758(Player player, int index, Npc npc) {}

    // Baby Chinchompa
    public static void npcOption6759(Player player, int index, Npc npc) {}

    // Osten
    public static void npcOption6769(Player player, int index, Npc npc) {}

    // Loyalty manager
    public static void npcOption6770(Player player, int index, Npc npc) {
        player.openDialogue("loyalty", 0);
    }

    // Hosa
    public static void npcOption6771(Player player, int index, Npc npc) {}

    // Lovada
    public static void npcOption6772(Player player, int index, Npc npc) {}

    // Doomsayer
    public static void npcOption6773(Player player, int index, Npc npc) {}

    // Doomsayer
    public static void npcOption6774(Player player, int index, Npc npc) {}

    // Gallow
    public static void npcOption6775(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption6776(Player player, int index, Npc npc) {}

    // <col=ff9040>Maze Guardian</col>
    public static void npcOption6777(Player player, int index, Npc npc) {}

    // Maze Guardian
    public static void npcOption6779(Player player, int index, Npc npc) {}

    // Piliar
    public static void npcOption6780(Player player, int index, Npc npc) {}

    // Shayda
    public static void npcOption6781(Player player, int index, Npc npc) {}

    // Monkey Archer
    public static void npcOption6794(Player player, int index, Npc npc) {}

    // Nieve
    public static void npcOption6797(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("slayer", 0);
        } else if (index == 2) {
            SlayerMaster.setAssignment(player);
        } else if (index == 3) {
            player.openShop("slayer");
        } else if (index == 4) {
            player.openDialogue("slayer", 4);
        }
    }

    // Steve
    public static void npcOption6798(Player player, int index, Npc npc) {}

    // Steve
    public static void npcOption6799(Player player, int index, Npc npc) {}

    // Pieve
    public static void npcOption6801(Player player, int index, Npc npc) {}

    // Kruk
    public static void npcOption6804(Player player, int index, Npc npc) {}

    // Assistant Le Smith
    public static void npcOption6806(Player player, int index, Npc npc) {}

    // Monkey guard
    public static void npcOption6811(Player player, int index, Npc npc) {}

    // Awowogei
    public static void npcOption6812(Player player, int index, Npc npc) {}

    // Monkey Archer
    public static void npcOption6813(Player player, int index, Npc npc) {}

    // Lammy Langle
    public static void npcOption6814(Player player, int index, Npc npc) {}

    // Town crier
    public static void npcOption6823(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption6825(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6826(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6827(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6828(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6829(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6830(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6831(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6832(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6833(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6834(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6835(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6836(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6837(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6838(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6839(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6840(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6841(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6842(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6843(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6844(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6845(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6846(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6847(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6848(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6849(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6850(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6851(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6852(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6853(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6854(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6855(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6856(Player player, int index, Npc npc) {}

    // Wounded soldier
    public static void npcOption6857(Player player, int index, Npc npc) {}

    // Look-out
    public static void npcOption6858(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6859(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6860(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6861(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6862(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6863(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6864(Player player, int index, Npc npc) {}

    // Captain Salara
    public static void npcOption6865(Player player, int index, Npc npc) {}

    // Captain Babacus
    public static void npcOption6866(Player player, int index, Npc npc) {}

    // Captain Kilian
    public static void npcOption6867(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption6868(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption6869(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption6870(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption6871(Player player, int index, Npc npc) {}

    // New recruit Tony
    public static void npcOption6872(Player player, int index, Npc npc) {}

    // Nurse Wooned
    public static void npcOption6873(Player player, int index, Npc npc) {}

    // Nurse Inn'Juree
    public static void npcOption6874(Player player, int index, Npc npc) {}

    // Nurse Boubou
    public static void npcOption6875(Player player, int index, Npc npc) {}

    // Captain Rachelle
    public static void npcOption6876(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption6877(Player player, int index, Npc npc) {}

    // Captain Ginea
    public static void npcOption6895(Player player, int index, Npc npc) {}

    // Soldier (tier 1)
    public static void npcOption6904(Player player, int index, Npc npc) {}

    // Soldier (tier 2)
    public static void npcOption6906(Player player, int index, Npc npc) {}

    // Soldier (tier 3)
    public static void npcOption6908(Player player, int index, Npc npc) {}

    // Soldier (tier 4)
    public static void npcOption6910(Player player, int index, Npc npc) {}
    /* 6912 - 7167 */

    // Soldier (tier 5)
    public static void npcOption6912(Player player, int index, Npc npc) {}

    // Farmer Gricoller
    public static void npcOption6920(Player player, int index, Npc npc) {}

    // Marisi
    public static void npcOption6921(Player player, int index, Npc npc) {
        if (index == 0) {
            player.getGameEncoder().sendMessage("This gardener will protect your patches for a fee.");
        } else {
            player.getFarming().gardenerProtection(npc, index - 2);
        }
    }

    // Konoo
    public static void npcOption6922(Player player, int index, Npc npc) {}

    // Clerk
    public static void npcOption6923(Player player, int index, Npc npc) {}

    // <col=00ffff>Plough</col>
    public static void npcOption6924(Player player, int index, Npc npc) {}

    // <col=00ffff>Plough</col>
    public static void npcOption6925(Player player, int index, Npc npc) {}

    // Ewesey
    public static void npcOption6926(Player player, int index, Npc npc) {}

    // Ramocean
    public static void npcOption6937(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6939(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6940(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6941(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6942(Player player, int index, Npc npc) {}

    // Horace
    public static void npcOption6943(Player player, int index, Npc npc) {}

    // Vannah
    public static void npcOption6944(Player player, int index, Npc npc) {}

    // Logava
    public static void npcOption6945(Player player, int index, Npc npc) {}

    // Pandur Hosidius
    public static void npcOption6946(Player player, int index, Npc npc) {}

    // Farmer
    public static void npcOption6947(Player player, int index, Npc npc) {}

    // Farmer
    public static void npcOption6948(Player player, int index, Npc npc) {}

    // Farmer
    public static void npcOption6949(Player player, int index, Npc npc) {}

    // Farmer
    public static void npcOption6950(Player player, int index, Npc npc) {}

    // Farmer
    public static void npcOption6951(Player player, int index, Npc npc) {}

    // Farmer
    public static void npcOption6952(Player player, int index, Npc npc) {}

    // Golova
    public static void npcOption6953(Player player, int index, Npc npc) {}

    // Richard
    public static void npcOption6954(Player player, int index, Npc npc) {}

    // Father Jean
    public static void npcOption6955(Player player, int index, Npc npc) {}

    // Monk
    public static void npcOption6956(Player player, int index, Npc npc) {}

    // Chief Farmer
    public static void npcOption6957(Player player, int index, Npc npc) {}

    // Farmer's wife
    public static void npcOption6958(Player player, int index, Npc npc) {}

    // Farmer Hayfield
    public static void npcOption6962(Player player, int index, Npc npc) {}

    // Frankie
    public static void npcOption6963(Player player, int index, Npc npc) {}

    // Tynan
    public static void npcOption6964(Player player, int index, Npc npc) {
        player.openShop("skilling");
    }

    // Nicholas
    public static void npcOption6965(Player player, int index, Npc npc) {}

    // Dockmaster
    public static void npcOption6966(Player player, int index, Npc npc) {}

    // Dock worker
    public static void npcOption6967(Player player, int index, Npc npc) {}

    // Dock worker
    public static void npcOption6968(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6969(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption6970(Player player, int index, Npc npc) {}

    // Captain Khaled
    public static void npcOption6971(Player player, int index, Npc npc) {}

    // Captain Khaled
    public static void npcOption6972(Player player, int index, Npc npc) {}

    // Fisherman
    public static void npcOption6981(Player player, int index, Npc npc) {}

    // Poor looking man
    public static void npcOption6982(Player player, int index, Npc npc) {}

    // Poor looking man
    public static void npcOption6983(Player player, int index, Npc npc) {}

    // Poor looking woman
    public static void npcOption6984(Player player, int index, Npc npc) {}

    // Poor looking woman
    public static void npcOption6985(Player player, int index, Npc npc) {}

    // Leenz
    public static void npcOption6986(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption6987(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption6988(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption6989(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption6990(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption6991(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption6992(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption6993(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption6994(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption6995(Player player, int index, Npc npc) {}

    // Dark wizard
    public static void npcOption6997(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption6998(Player player, int index, Npc npc) {}

    // Port Official
    public static void npcOption6999(Player player, int index, Npc npc) {}

    // Captain Janaway
    public static void npcOption7000(Player player, int index, Npc npc) {}

    // Port worker
    public static void npcOption7001(Player player, int index, Npc npc) {}

    // Mark
    public static void npcOption7002(Player player, int index, Npc npc) {}

    // Cheryl
    public static void npcOption7003(Player player, int index, Npc npc) {}

    // Charles
    public static void npcOption7004(Player player, int index, Npc npc) {}

    // Sarah
    public static void npcOption7005(Player player, int index, Npc npc) {}

    // Darren
    public static void npcOption7006(Player player, int index, Npc npc) {}

    // Melvin
    public static void npcOption7007(Player player, int index, Npc npc) {}

    // Simon
    public static void npcOption7008(Player player, int index, Npc npc) {}

    // Andrea
    public static void npcOption7009(Player player, int index, Npc npc) {}

    // Elizabeth
    public static void npcOption7010(Player player, int index, Npc npc) {}

    // Lorraine
    public static void npcOption7011(Player player, int index, Npc npc) {}

    // Ross and Ben
    public static void npcOption7012(Player player, int index, Npc npc) {}

    // Dobwinkle
    public static void npcOption7013(Player player, int index, Npc npc) {}

    // Alexander
    public static void npcOption7014(Player player, int index, Npc npc) {}

    // Charlie Brown
    public static void npcOption7015(Player player, int index, Npc npc) {}

    // Kourend guard
    public static void npcOption7016(Player player, int index, Npc npc) {}

    // Kourend head guard
    public static void npcOption7017(Player player, int index, Npc npc) {}

    // Clerris
    public static void npcOption7040(Player player, int index, Npc npc) {}

    // Enoch
    public static void npcOption7041(Player player, int index, Npc npc) {}

    // Aretha
    public static void npcOption7042(Player player, int index, Npc npc) {}

    // Logosia
    public static void npcOption7044(Player player, int index, Npc npc) {}

    // Biblia
    public static void npcOption7045(Player player, int index, Npc npc) {}

    // Horphis
    public static void npcOption7046(Player player, int index, Npc npc) {}

    // Villia
    public static void npcOption7047(Player player, int index, Npc npc) {}

    // Professor Gracklebone
    public static void npcOption7048(Player player, int index, Npc npc) {}

    // Sam
    public static void npcOption7049(Player player, int index, Npc npc) {}

    // Tyss
    public static void npcOption7050(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("spellbooks", 0);
        } else if (index == 2) {
            player.getMagic().setVengeanceCast(false);
            if (player.getMagic().getSpellBook() == Magic.NORMAL_MAGIC) {
                player.getMagic().setSpellBook(Magic.ANCIENT_MAGIC);
            } else if (player.getMagic().getSpellBook() == Magic.ANCIENT_MAGIC) {
                player.getMagic().setSpellBook(Magic.LUNAR_MAGIC);
            } else {
                player.getMagic().setSpellBook(Magic.NORMAL_MAGIC);
            }
        }
    }

    // Trossa
    public static void npcOption7051(Player player, int index, Npc npc) {}

    // Rassain
    public static void npcOption7053(Player player, int index, Npc npc) {}

    // Mofina
    public static void npcOption7054(Player player, int index, Npc npc) {}

    // Regath
    public static void npcOption7056(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption7057(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption7058(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption7059(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption7060(Player player, int index, Npc npc) {}

    // Freald
    public static void npcOption7062(Player player, int index, Npc npc) {}

    // Dark wizard
    public static void npcOption7064(Player player, int index, Npc npc) {}

    // Wizard
    public static void npcOption7067(Player player, int index, Npc npc) {}

    // Ouditor
    public static void npcOption7068(Player player, int index, Npc npc) {}

    // Smoggy
    public static void npcOption7069(Player player, int index, Npc npc) {}

    // Toothy
    public static void npcOption7071(Player player, int index, Npc npc) {}

    // Operator
    public static void npcOption7072(Player player, int index, Npc npc) {}

    // Operator
    public static void npcOption7073(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption7077(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption7078(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption7079(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption7080(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption7081(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption7082(Player player, int index, Npc npc) {}

    // Armourer (tier 1)
    public static void npcOption7083(Player player, int index, Npc npc) {}

    // Armourer (tier 2)
    public static void npcOption7084(Player player, int index, Npc npc) {}

    // Armourer (tier 3)
    public static void npcOption7085(Player player, int index, Npc npc) {}

    // Armourer (tier 4)
    public static void npcOption7086(Player player, int index, Npc npc) {}

    // Armourer (tier 5)
    public static void npcOption7087(Player player, int index, Npc npc) {}

    // Munty
    public static void npcOption7088(Player player, int index, Npc npc) {}

    // Moggy
    public static void npcOption7089(Player player, int index, Npc npc) {}

    // Fuggy
    public static void npcOption7090(Player player, int index, Npc npc) {}

    // Miner
    public static void npcOption7091(Player player, int index, Npc npc) {}

    // Miner
    public static void npcOption7092(Player player, int index, Npc npc) {}

    // Miner
    public static void npcOption7093(Player player, int index, Npc npc) {}

    // Miner
    public static void npcOption7094(Player player, int index, Npc npc) {}

    // Stunted demonic gorilla
    public static void npcOption7098(Player player, int index, Npc npc) {}

    // Kruk
    public static void npcOption7099(Player player, int index, Npc npc) {}

    // Glough
    public static void npcOption7100(Player player, int index, Npc npc) {}

    // Keef
    public static void npcOption7104(Player player, int index, Npc npc) {}

    // Keef
    public static void npcOption7105(Player player, int index, Npc npc) {}

    // Kob
    public static void npcOption7106(Player player, int index, Npc npc) {}

    // Kob
    public static void npcOption7107(Player player, int index, Npc npc) {}

    // Nieve
    public static void npcOption7108(Player player, int index, Npc npc) {}

    // Nieve
    public static void npcOption7109(Player player, int index, Npc npc) {}

    // Nieve
    public static void npcOption7110(Player player, int index, Npc npc) {}

    // Garkor
    public static void npcOption7111(Player player, int index, Npc npc) {}

    // Lumo
    public static void npcOption7112(Player player, int index, Npc npc) {}

    // Zooknock
    public static void npcOption7113(Player player, int index, Npc npc) {}

    // Carado
    public static void npcOption7114(Player player, int index, Npc npc) {}

    // Glough
    public static void npcOption7115(Player player, int index, Npc npc) {}

    // Kineer
    public static void npcOption7117(Player player, int index, Npc npc) {}

    // Oobapohk
    public static void npcOption7120(Player player, int index, Npc npc) {}

    // Jumaane
    public static void npcOption7121(Player player, int index, Npc npc) {}

    // Assistant Lori
    public static void npcOption7154(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7155(Player player, int index, Npc npc) {}

    // Anita
    public static void npcOption7156(Player player, int index, Npc npc) {}

    // Anita
    public static void npcOption7157(Player player, int index, Npc npc) {}

    // Garkor
    public static void npcOption7158(Player player, int index, Npc npc) {}

    // Garkor
    public static void npcOption7159(Player player, int index, Npc npc) {}

    // Lumo
    public static void npcOption7160(Player player, int index, Npc npc) {}

    // Lumo
    public static void npcOption7161(Player player, int index, Npc npc) {}

    // Bunkdo
    public static void npcOption7162(Player player, int index, Npc npc) {}

    // Bunkdo
    public static void npcOption7163(Player player, int index, Npc npc) {}

    // Carado
    public static void npcOption7164(Player player, int index, Npc npc) {}

    // Carado
    public static void npcOption7165(Player player, int index, Npc npc) {}

    // Bunkwicket
    public static void npcOption7166(Player player, int index, Npc npc) {}

    // Bunkwicket
    public static void npcOption7167(Player player, int index, Npc npc) {}
    /* 7168 - 7423 */

    // Waymottin
    public static void npcOption7168(Player player, int index, Npc npc) {}

    // Waymottin
    public static void npcOption7169(Player player, int index, Npc npc) {}

    // Zooknock
    public static void npcOption7170(Player player, int index, Npc npc) {}

    // Zooknock
    public static void npcOption7171(Player player, int index, Npc npc) {}

    // Karam
    public static void npcOption7172(Player player, int index, Npc npc) {}

    // Karam
    public static void npcOption7173(Player player, int index, Npc npc) {}

    // Karam
    public static void npcOption7174(Player player, int index, Npc npc) {}

    // Duke
    public static void npcOption7176(Player player, int index, Npc npc) {}

    // Captain Shoracks
    public static void npcOption7178(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7199(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7200(Player player, int index, Npc npc) {}

    // Quartermaster Briget
    public static void npcOption7201(Player player, int index, Npc npc) {}

    // Kenelme
    public static void npcOption7202(Player player, int index, Npc npc) {}

    // Thyria
    public static void npcOption7203(Player player, int index, Npc npc) {}

    // Filamina
    public static void npcOption7204(Player player, int index, Npc npc) {}

    // Jarvald
    public static void npcOption7205(Player player, int index, Npc npc) {}

    // Thirus
    public static void npcOption7208(Player player, int index, Npc npc) {}

    // null
    public static void npcOption7210(Player player, int index, Npc npc) {}

    // Maniacal monkey
    public static void npcOption7212(Player player, int index, Npc npc) {}

    // Miriam
    public static void npcOption7217(Player player, int index, Npc npc) {}

    // Miriam
    public static void npcOption7218(Player player, int index, Npc npc) {}

    // Traxi
    public static void npcOption7219(Player player, int index, Npc npc) {}

    // Traxi
    public static void npcOption7220(Player player, int index, Npc npc) {}

    // Raeli
    public static void npcOption7221(Player player, int index, Npc npc) {}

    // Raeli
    public static void npcOption7222(Player player, int index, Npc npc) {}

    // Mogrim
    public static void npcOption7223(Player player, int index, Npc npc) {}

    // Mogrim
    public static void npcOption7224(Player player, int index, Npc npc) {}

    // Loinur
    public static void npcOption7225(Player player, int index, Npc npc) {}

    // Loinur
    public static void npcOption7226(Player player, int index, Npc npc) {}

    // Bloodhound
    public static void npcOption7232(Player player, int index, Npc npc) {}

    // Lucky impling
    public static void npcOption7233(Player player, int index, Npc npc) {
        player.getHunter().catchNPC(npc);
    }

    // Berry
    public static void npcOption7235(Player player, int index, Npc npc) {}

    // Guildmaster Lars
    public static void npcOption7236(Player player, int index, Npc npc) {}

    // Murfet
    public static void npcOption7237(Player player, int index, Npc npc) {}

    // Forester
    public static void npcOption7238(Player player, int index, Npc npc) {}

    // Kai
    public static void npcOption7239(Player player, int index, Npc npc) {}

    // Perry
    public static void npcOption7240(Player player, int index, Npc npc) {
        player.openShop("skilling");
    }

    // Kineer
    public static void npcOption7280(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption7281(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption7282(Player player, int index, Npc npc) {}

    // Lillia
    public static void npcOption7283(Player player, int index, Npc npc) {}

    // Hotpheex
    public static void npcOption7284(Player player, int index, Npc npc) {}

    // Druid
    public static void npcOption7285(Player player, int index, Npc npc) {}

    // Mistag
    public static void npcOption7297(Player player, int index, Npc npc) {}

    // Mistag
    public static void npcOption7298(Player player, int index, Npc npc) {}

    // Mistag
    public static void npcOption7299(Player player, int index, Npc npc) {}

    // Kazgar
    public static void npcOption7300(Player player, int index, Npc npc) {}

    // Kazgar
    public static void npcOption7301(Player player, int index, Npc npc) {}

    // Lucky impling
    public static void npcOption7302(Player player, int index, Npc npc) {}

    // Watson
    public static void npcOption7303(Player player, int index, Npc npc) {}

    // Watson
    public static void npcOption7304(Player player, int index, Npc npc) {}

    // Falo the Bard
    public static void npcOption7306(Player player, int index, Npc npc) {}

    // Uri
    public static void npcOption7311(Player player, int index, Npc npc) {}

    // Lisa
    public static void npcOption7316(Player player, int index, Npc npc) {
        player.openDialogue("clanwars", 5);
    }

    // Lisa
    public static void npcOption7317(Player player, int index, Npc npc) {
        player.openDialogue("clanwars", 2);
    }

    // Nesty
    public static void npcOption7321(Player player, int index, Npc npc) {}

    // Al-Kharid warrior
    public static void npcOption7323(Player player, int index, Npc npc) {}

    // Hassan
    public static void npcOption7324(Player player, int index, Npc npc) {}

    // Carol
    public static void npcOption7325(Player player, int index, Npc npc) {}

    // Holly
    public static void npcOption7326(Player player, int index, Npc npc) {}

    // Fairy Fixit
    public static void npcOption7332(Player player, int index, Npc npc) {}

    // Fairy Fixit
    public static void npcOption7333(Player player, int index, Npc npc) {}

    // Giant Squirrel
    public static void npcOption7334(Player player, int index, Npc npc) {}

    // Tangleroot
    public static void npcOption7335(Player player, int index, Npc npc) {}

    // Rocky
    public static void npcOption7336(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7337(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7338(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7339(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7340(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7341(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7342(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7343(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7344(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7345(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7346(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7347(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7348(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7349(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7350(Player player, int index, Npc npc) {}

    // Giant Squirrel
    public static void npcOption7351(Player player, int index, Npc npc) {}

    // Tangleroot
    public static void npcOption7352(Player player, int index, Npc npc) {}

    // Rocky
    public static void npcOption7353(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7354(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7355(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7356(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7357(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7358(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7359(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7360(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7361(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7362(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7363(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7364(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7365(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7366(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption7367(Player player, int index, Npc npc) {}

    // Phoenix
    public static void npcOption7368(Player player, int index, Npc npc) {}

    // Wesley
    public static void npcOption7369(Player player, int index, Npc npc) {}

    // Phoenix
    public static void npcOption7370(Player player, int index, Npc npc) {}

    // Incapacitated Pyromancer
    public static void npcOption7372(Player player, int index, Npc npc) {}

    // Ignisia
    public static void npcOption7374(Player player, int index, Npc npc) {}

    // Undor
    public static void npcOption7375(Player player, int index, Npc npc) {}

    // Esther
    public static void npcOption7376(Player player, int index, Npc npc) {}

    // Captain Kalt
    public static void npcOption7377(Player player, int index, Npc npc) {}

    // Ish the Navigator
    public static void npcOption7378(Player player, int index, Npc npc) {}

    // Winter Soldier
    public static void npcOption7379(Player player, int index, Npc npc) {}

    // Cat
    public static void npcOption7380(Player player, int index, Npc npc) {}

    // Ed
    public static void npcOption7382(Player player, int index, Npc npc) {}

    // Stumpy
    public static void npcOption7384(Player player, int index, Npc npc) {}

    // Pumpy
    public static void npcOption7385(Player player, int index, Npc npc) {}

    // Dumpy
    public static void npcOption7386(Player player, int index, Npc npc) {}

    // Dumpy
    public static void npcOption7387(Player player, int index, Npc npc) {}

    // <col=00ffff>Undead Combat dummy</col>
    public static void npcOption7413(Player player, int index, Npc npc) {}

    // Count Check
    public static void npcOption7414(Player player, int index, Npc npc) {}

    // Bologa
    public static void npcOption7415(Player player, int index, Npc npc) {}

    // Eniola
    public static void npcOption7417(Player player, int index, Npc npc) {
        player.getBank().open();
    }
    /* 7424 - 7679 */

    // Mage of Zamorak
    public static void npcOption7425(Player player, int index, Npc npc) {}

    // Perdu
    public static void npcOption7456(Player player, int index, Npc npc) {
        player.openDialogue("perdu", 0);
    }

    // Fishing spot
    public static void npcOption7459(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7460(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7461(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7462(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7463(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7464(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7465(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7466(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7467(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7468(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7469(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7470(Player player, int index, Npc npc) {}

    // Captain Magoro
    public static void npcOption7471(Player player, int index, Npc npc) {}

    // Reginald
    public static void npcOption7474(Player player, int index, Npc npc) {}

    // Roy jr.
    public static void npcOption7475(Player player, int index, Npc npc) {}

    // Robert Boss
    public static void npcOption7476(Player player, int index, Npc npc) {}

    // Knight of Varlamore
    public static void npcOption7477(Player player, int index, Npc npc) {}

    // Hugor
    public static void npcOption7478(Player player, int index, Npc npc) {}

    // Lan the Butcher
    public static void npcOption7479(Player player, int index, Npc npc) {}

    // Rakkar
    public static void npcOption7480(Player player, int index, Npc npc) {}

    // Hopleez
    public static void npcOption7481(Player player, int index, Npc npc) {}

    // Captain Sdiar
    public static void npcOption7482(Player player, int index, Npc npc) {}

    // Sandicrahb
    public static void npcOption7483(Player player, int index, Npc npc) {}

    // Sandicrahb
    public static void npcOption7484(Player player, int index, Npc npc) {}

    // Holly
    public static void npcOption7492(Player player, int index, Npc npc) {}

    // Holly
    public static void npcOption7493(Player player, int index, Npc npc) {}

    // Ivy
    public static void npcOption7494(Player player, int index, Npc npc) {}

    // Troll child
    public static void npcOption7495(Player player, int index, Npc npc) {}

    // Tom
    public static void npcOption7496(Player player, int index, Npc npc) {}

    // Dylan
    public static void npcOption7497(Player player, int index, Npc npc) {}

    // Sam
    public static void npcOption7498(Player player, int index, Npc npc) {}

    // Ulina
    public static void npcOption7499(Player player, int index, Npc npc) {}

    // Ulina
    public static void npcOption7500(Player player, int index, Npc npc) {}

    // Billam
    public static void npcOption7501(Player player, int index, Npc npc) {}

    // Tragacanth
    public static void npcOption7502(Player player, int index, Npc npc) {}

    // Cave goblin worker
    public static void npcOption7503(Player player, int index, Npc npc) {}

    // Palum
    public static void npcOption7504(Player player, int index, Npc npc) {}

    // Jelly
    public static void npcOption7518(Player player, int index, Npc npc) {}

    // Olmlet
    public static void npcOption7519(Player player, int index, Npc npc) {}

    // Olmlet
    public static void npcOption7520(Player player, int index, Npc npc) {}

    // Lux grub
    public static void npcOption7535(Player player, int index, Npc npc) {}

    // Lux grub
    public static void npcOption7536(Player player, int index, Npc npc) {}

    // <col=00ffff>Fire</col>
    public static void npcOption7558(Player player, int index, Npc npc) {}

    // <col=00ffff>Meat tree</col>
    public static void npcOption7564(Player player, int index, Npc npc) {}

    // Jewelled Crab
    public static void npcOption7576(Player player, int index, Npc npc) {}

    // Jewelled Crab (red)
    public static void npcOption7577(Player player, int index, Npc npc) {}

    // Jewelled Crab (green)
    public static void npcOption7578(Player player, int index, Npc npc) {}

    // Jewelled Crab (blue)
    public static void npcOption7579(Player player, int index, Npc npc) {}

    // Guanic bat
    public static void npcOption7587(Player player, int index, Npc npc) {}

    // Prael bat
    public static void npcOption7588(Player player, int index, Npc npc) {}

    // Giral bat
    public static void npcOption7589(Player player, int index, Npc npc) {}

    // Phluxia bat
    public static void npcOption7590(Player player, int index, Npc npc) {}

    // Kryket bat
    public static void npcOption7591(Player player, int index, Npc npc) {}

    // Murng bat
    public static void npcOption7592(Player player, int index, Npc npc) {}

    // Psykk bat
    public static void npcOption7593(Player player, int index, Npc npc) {}

    // Captain Rimor
    public static void npcOption7595(Player player, int index, Npc npc) {}

    // Gnosi
    public static void npcOption7596(Player player, int index, Npc npc) {}

    // Historian Duffy
    public static void npcOption7597(Player player, int index, Npc npc) {}

    // Natural Historian
    public static void npcOption7598(Player player, int index, Npc npc) {}

    // Mountain Guide
    public static void npcOption7599(Player player, int index, Npc npc) {}

    // Mountain Guide
    public static void npcOption7600(Player player, int index, Npc npc) {}

    // Swamp Priest
    public static void npcOption7601(Player player, int index, Npc npc) {}

    // Imerominia
    public static void npcOption7607(Player player, int index, Npc npc) {}

    // Pagida
    public static void npcOption7608(Player player, int index, Npc npc) {}

    // Istoria
    public static void npcOption7609(Player player, int index, Npc npc) {}

    // Logios
    public static void npcOption7610(Player player, int index, Npc npc) {}

    // Meleti
    public static void npcOption7611(Player player, int index, Npc npc) {}

    // Krato
    public static void npcOption7612(Player player, int index, Npc npc) {}

    // Ektheme
    public static void npcOption7613(Player player, int index, Npc npc) {}

    // Archeio
    public static void npcOption7614(Player player, int index, Npc npc) {}

    // Stuliette
    public static void npcOption7615(Player player, int index, Npc npc) {}

    // Stuliette
    public static void npcOption7616(Player player, int index, Npc npc) {}

    // Khazard warlord
    public static void npcOption7621(Player player, int index, Npc npc) {}

    // Abigale
    public static void npcOption7623(Player player, int index, Npc npc) {}

    // Hewey
    public static void npcOption7624(Player player, int index, Npc npc) {}

    // Mandy
    public static void npcOption7630(Player player, int index, Npc npc) {}

    // Mandy
    public static void npcOption7631(Player player, int index, Npc npc) {}

    // Killer
    public static void npcOption7632(Player player, int index, Npc npc) {}

    // Abigale
    public static void npcOption7633(Player player, int index, Npc npc) {}

    // Abigale
    public static void npcOption7635(Player player, int index, Npc npc) {}

    // Killer
    public static void npcOption7636(Player player, int index, Npc npc) {}

    // Hewey
    public static void npcOption7637(Player player, int index, Npc npc) {}

    // <col=00ffff>Mirror</col>
    public static void npcOption7641(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7642(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7643(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7644(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7645(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7646(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7647(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7648(Player player, int index, Npc npc) {}

    // Pirate Jackie the Fruit
    public static void npcOption7650(Player player, int index, Npc npc) {}

    // Pirate Jackie the Fruit
    public static void npcOption7651(Player player, int index, Npc npc) {}

    // TzHaar-Mej
    public static void npcOption7652(Player player, int index, Npc npc) {}

    // Slieve
    public static void npcOption7653(Player player, int index, Npc npc) {}

    // Breive
    public static void npcOption7654(Player player, int index, Npc npc) {}

    // Krystilia
    public static void npcOption7663(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("slayer", 9);
        } else if (index == 2) {
            SlayerMaster.setAssignment(player, SlayerMaster.WILDERNESS_MASTER);
        } else if (index == 3) {
            player.openShop("slayer");
        } else if (index == 4) {
            player.getSlayer().openRewards();
        }
    }

    // Banisoch
    public static void npcOption7665(Player player, int index, Npc npc) {}

    // Banisoch
    public static void npcOption7666(Player player, int index, Npc npc) {}

    // Hieve
    public static void npcOption7667(Player player, int index, Npc npc) {}

    // Voice of Yama
    public static void npcOption7668(Player player, int index, Npc npc) {}

    // Disciple of Yama
    public static void npcOption7669(Player player, int index, Npc npc) {}

    // Disciple of Yama
    public static void npcOption7670(Player player, int index, Npc npc) {}

    // Skotos
    public static void npcOption7671(Player player, int index, Npc npc) {}

    // Eve
    public static void npcOption7672(Player player, int index, Npc npc) {}

    // Solztun
    public static void npcOption7673(Player player, int index, Npc npc) {}

    // Jal-Nib-Rek
    public static void npcOption7674(Player player, int index, Npc npc) {}

    // Jal-Nib-Rek
    public static void npcOption7675(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7676(Player player, int index, Npc npc) {}

    // TzHaar-Ket-Zuh
    public static void npcOption7677(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("bank", 1);
        } else if (index == 2) {
            player.getBank().open();
        }
    }

    // TzHaar-Ket-Yil
    public static void npcOption7678(Player player, int index, Npc npc) {}

    // TzHaar-Ket
    public static void npcOption7679(Player player, int index, Npc npc) {}
    /* 7680 - 7935 */

    // TzHaar-Mej-Dir
    public static void npcOption7680(Player player, int index, Npc npc) {}

    // TzHaar-Mej-Bal
    public static void npcOption7681(Player player, int index, Npc npc) {}

    // TzHaar-Hur
    public static void npcOption7682(Player player, int index, Npc npc) {}

    // TzHaar-Hur
    public static void npcOption7683(Player player, int index, Npc npc) {}

    // TzHaar-Hur
    public static void npcOption7684(Player player, int index, Npc npc) {}

    // TzHaar-Hur
    public static void npcOption7685(Player player, int index, Npc npc) {}

    // TzHaar-Hur
    public static void npcOption7686(Player player, int index, Npc npc) {}

    // TzHaar-Hur
    public static void npcOption7687(Player player, int index, Npc npc) {}

    // TzHaar-Hur-Zal
    public static void npcOption7688(Player player, int index, Npc npc) {}

    // TzHaar-Hur-Rin
    public static void npcOption7689(Player player, int index, Npc npc) {}

    // TzHaar-Ket-Keh
    public static void npcOption7690(Player player, int index, Npc npc) {
        player.openDialogue("tzhaar", 6);
    }

    // Rock Golem
    public static void npcOption7711(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption7712(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption7713(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption7714(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption7715(Player player, int index, Npc npc) {}

    // Gadrin
    public static void npcOption7716(Player player, int index, Npc npc) {
        if (npc.getX() == 2446 && npc.getY() == 3426) {
            player.getMovement().animatedTeleport(new Tile(2467, 9905), Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
        } else if (npc.getX() == 3272 && npc.getY() == 3164) {
            player.getMovement().animatedTeleport(new Tile(3294, 3282), Magic.NORMAL_MAGIC_ANIMATION_START,
                    Magic.NORMAL_MAGIC_ANIMATION_END, Magic.NORMAL_MAGIC_GRAPHIC, null, 2);
        } else {
            player.openShop("skilling");
        }
    }

    // Hendor
    public static void npcOption7717(Player player, int index, Npc npc) {}

    // Yarsul
    public static void npcOption7718(Player player, int index, Npc npc) {}

    // Belona
    public static void npcOption7719(Player player, int index, Npc npc) {
        if (index == 3) {
            player.getSkills().setMiningMinerals(!player.getSkills().getMiningMinerals());
            player.getGameEncoder().sendMessage("Minerals while mining: " + player.getSkills().getMiningMinerals());
        } else {
            player.openShop("mining_minerals");
        }
    }

    // Utrec
    public static void npcOption7720(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption7721(Player player, int index, Npc npc) {}

    // Gertrude
    public static void npcOption7723(Player player, int index, Npc npc) {}

    // Barbarian guard
    public static void npcOption7724(Player player, int index, Npc npc) {}

    // Dwarven Boatman
    public static void npcOption7725(Player player, int index, Npc npc) {}

    // Dwarven Boatman
    public static void npcOption7726(Player player, int index, Npc npc) {}

    // Kylie Minnow
    public static void npcOption7727(Player player, int index, Npc npc) {}

    // Kylie Minnow
    public static void npcOption7728(Player player, int index, Npc npc) {
        player.openShop("minnows");
    }

    // Fishing spot
    public static void npcOption7730(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7731(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7732(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7733(Player player, int index, Npc npc) {}

    // Recruiter
    public static void npcOption7734(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7736(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7737(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7738(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7739(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7740(Player player, int index, Npc npc) {}

    // Rock Golem
    public static void npcOption7741(Player player, int index, Npc npc) {}

    // Captain Cleive
    public static void npcOption7742(Player player, int index, Npc npc) {}

    // Soldier
    public static void npcOption7743(Player player, int index, Npc npc) {}

    // Wizard Mizgog
    public static void npcOption7746(Player player, int index, Npc npc) {}

    // Wizard Mizgog
    public static void npcOption7747(Player player, int index, Npc npc) {}

    // Fairy
    public static void npcOption7748(Player player, int index, Npc npc) {}

    // Dark mage
    public static void npcOption7752(Player player, int index, Npc npc) {}

    // Dark mage
    public static void npcOption7753(Player player, int index, Npc npc) {}

    // Squirrel
    public static void npcOption7754(Player player, int index, Npc npc) {}

    // Squirrel
    public static void npcOption7755(Player player, int index, Npc npc) {}

    // Squirrel
    public static void npcOption7756(Player player, int index, Npc npc) {}

    // Tool Leprechaun
    public static void npcOption7757(Player player, int index, Npc npc) {}

    // Mernia
    public static void npcOption7758(Player player, int index, Npc npc) {}

    // Herbi
    public static void npcOption7759(Player player, int index, Npc npc) {}

    // Herbi
    public static void npcOption7760(Player player, int index, Npc npc) {}

    // Lead Navigator
    public static void npcOption7761(Player player, int index, Npc npc) {}

    // Lead Navigator
    public static void npcOption7762(Player player, int index, Npc npc) {}

    // Junior Navigator
    public static void npcOption7763(Player player, int index, Npc npc) {}

    // Junior Navigator
    public static void npcOption7764(Player player, int index, Npc npc) {}

    // John
    public static void npcOption7765(Player player, int index, Npc npc) {}

    // David
    public static void npcOption7766(Player player, int index, Npc npc) {}

    // Barge guard
    public static void npcOption7767(Player player, int index, Npc npc) {}

    // Barge guard
    public static void npcOption7768(Player player, int index, Npc npc) {}

    // Shop keeper
    public static void npcOption7769(Player player, int index, Npc npc) {}

    // Fossil Collector
    public static void npcOption7770(Player player, int index, Npc npc) {}

    // Peter
    public static void npcOption7772(Player player, int index, Npc npc) {}

    // Charles
    public static void npcOption7773(Player player, int index, Npc npc) {}

    // John
    public static void npcOption7774(Player player, int index, Npc npc) {}

    // Jardric
    public static void npcOption7775(Player player, int index, Npc npc) {}

    // Petrified Pete
    public static void npcOption7776(Player player, int index, Npc npc) {}

    // Weve
    public static void npcOption7777(Player player, int index, Npc npc) {}

    // Irene
    public static void npcOption7778(Player player, int index, Npc npc) {}

    // Bobbing fossil
    public static void npcOption7779(Player player, int index, Npc npc) {}

    // Puffer Fish
    public static void npcOption7780(Player player, int index, Npc npc) {}

    // Fish shoal
    public static void npcOption7782(Player player, int index, Npc npc) {}

    // Ceto
    public static void npcOption7783(Player player, int index, Npc npc) {}

    // Mairin
    public static void npcOption7784(Player player, int index, Npc npc) {}

    // Herbiboar
    public static void npcOption7785(Player player, int index, Npc npc) {}

    // Mattimeo
    public static void npcOption7787(Player player, int index, Npc npc) {}

    // Charles Charlington
    public static void npcOption7788(Player player, int index, Npc npc) {}

    // Holgart
    public static void npcOption7789(Player player, int index, Npc npc) {}

    // John
    public static void npcOption7790(Player player, int index, Npc npc) {}

    // David
    public static void npcOption7791(Player player, int index, Npc npc) {}

    // Ancient Zygomite
    public static void npcOption7797(Player player, int index, Npc npc) {}

    // Ancient Fungi
    public static void npcOption7798(Player player, int index, Npc npc) {}

    // Hoop Snake
    public static void npcOption7802(Player player, int index, Npc npc) {}

    // Stunned Hoop Snake
    public static void npcOption7803(Player player, int index, Npc npc) {}

    // David
    public static void npcOption7818(Player player, int index, Npc npc) {}

    // Grim Reaper
    public static void npcOption7856(Player player, int index, Npc npc) {}

    // null
    public static void npcOption7857(Player player, int index, Npc npc) {}

    // Jarvis
    public static void npcOption7858(Player player, int index, Npc npc) {}

    // null
    public static void npcOption7859(Player player, int index, Npc npc) {}

    // Jarvis
    public static void npcOption7860(Player player, int index, Npc npc) {}

    // Jarvis
    public static void npcOption7861(Player player, int index, Npc npc) {}

    // null
    public static void npcOption7862(Player player, int index, Npc npc) {}

    // Jarvis
    public static void npcOption7863(Player player, int index, Npc npc) {}

    // null
    public static void npcOption7870(Player player, int index, Npc npc) {}

    // Masked stranger
    public static void npcOption7871(Player player, int index, Npc npc) {}

    // null
    public static void npcOption7872(Player player, int index, Npc npc) {}

    // Masked stranger
    public static void npcOption7873(Player player, int index, Npc npc) {}

    // null
    public static void npcOption7874(Player player, int index, Npc npc) {}

    // Masked stranger
    public static void npcOption7875(Player player, int index, Npc npc) {}

    // null
    public static void npcOption7876(Player player, int index, Npc npc) {}

    // Masked stranger
    public static void npcOption7877(Player player, int index, Npc npc) {}

    // null
    public static void npcOption7878(Player player, int index, Npc npc) {}

    // Masked stranger
    public static void npcOption7879(Player player, int index, Npc npc) {}

    // null
    public static void npcOption7880(Player player, int index, Npc npc) {}

    // Masked stranger
    public static void npcOption7881(Player player, int index, Npc npc) {}

    // Midnight
    public static void npcOption7890(Player player, int index, Npc npc) {}

    // Noon
    public static void npcOption7891(Player player, int index, Npc npc) {}

    // Noon
    public static void npcOption7892(Player player, int index, Npc npc) {}

    // Midnight
    public static void npcOption7893(Player player, int index, Npc npc) {}

    // Lord Kandur Hosidius
    public static void npcOption7896(Player player, int index, Npc npc) {}

    // Elena Hosidius
    public static void npcOption7897(Player player, int index, Npc npc) {}

    // Artur Hosidius
    public static void npcOption7898(Player player, int index, Npc npc) {}

    // Artur Hosidius
    public static void npcOption7899(Player player, int index, Npc npc) {}

    // Butler Jarvis
    public static void npcOption7900(Player player, int index, Npc npc) {}

    // Chef Olivia
    public static void npcOption7901(Player player, int index, Npc npc) {}

    // Galana
    public static void npcOption7902(Player player, int index, Npc npc) {}

    // Tomas Lawry
    public static void npcOption7904(Player player, int index, Npc npc) {}

    // Robert O'Reilly
    public static void npcOption7905(Player player, int index, Npc npc) {}

    // Devan Rutter
    public static void npcOption7906(Player player, int index, Npc npc) {}

    // Conrad King
    public static void npcOption7907(Player player, int index, Npc npc) {}

    // The Queen of Thieves
    public static void npcOption7908(Player player, int index, Npc npc) {}

    // Lady Shauna Piscarilius
    public static void npcOption7909(Player player, int index, Npc npc) {}

    // Councillor Hughes
    public static void npcOption7910(Player player, int index, Npc npc) {}

    // Bartender
    public static void npcOption7911(Player player, int index, Npc npc) {}

    // Fish monger
    public static void npcOption7912(Player player, int index, Npc npc) {}

    // Shop keeper
    public static void npcOption7913(Player player, int index, Npc npc) {}

    // Thief
    public static void npcOption7914(Player player, int index, Npc npc) {}

    // Thief
    public static void npcOption7915(Player player, int index, Npc npc) {}

    // Thief
    public static void npcOption7916(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption7917(Player player, int index, Npc npc) {}

    // Pirate
    public static void npcOption7918(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption7919(Player player, int index, Npc npc) {}

    // Man
    public static void npcOption7920(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption7921(Player player, int index, Npc npc) {}

    // Woman
    public static void npcOption7922(Player player, int index, Npc npc) {}

    // Poor looking woman
    public static void npcOption7923(Player player, int index, Npc npc) {}

    // Councillor Andrews
    public static void npcOption7924(Player player, int index, Npc npc) {}
    /* 7936 - 8191 */

    // Emblem Trader
    public static void npcOption7941(Player player, int index, Npc npc) {}

    // Emblem Trader
    public static void npcOption7942(Player player, int index, Npc npc) {
        if (index == 0) {
            player.openDialogue("emblemtrader", 1);
        } else if (index == 2) {
            player.getGameEncoder().sendMessage("You can't trade him here.");
        } else if (index == 3) {
            boolean show = !player.getCombat().showKDR();
            player.getCombat().setShowKDR(show);
            if (show) {
                player.getGameEncoder().sendMessage("Now displaying KDR.");
            } else {
                player.getGameEncoder().sendMessage("Now hiding KDR.");
            }
        } else if (index == 4) {
            player.getCombat().setPKSkullDelay(PCombat.SKULL_DELAY);
        }
    }

    // Fishing spot
    public static void npcOption7946(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption7947(Player player, int index, Npc npc) {}

    // Alec Kincade
    public static void npcOption7950(Player player, int index, Npc npc) {}

    // Ponts the Bridgemaster
    public static void npcOption7951(Player player, int index, Npc npc) {}

    // Erdan
    public static void npcOption7952(Player player, int index, Npc npc) {}

    // Primula
    public static void npcOption7953(Player player, int index, Npc npc) {}

    // Mysterious Adventurer
    public static void npcOption7954(Player player, int index, Npc npc) {}

    // Captain Tock
    public static void npcOption7956(Player player, int index, Npc npc) {}

    // Captain Tock
    public static void npcOption7957(Player player, int index, Npc npc) {}

    // Captain Tock
    public static void npcOption7958(Player player, int index, Npc npc) {}

    // Ithoi the Navigator
    public static void npcOption7961(Player player, int index, Npc npc) {}

    // Cabin Boy Colin
    public static void npcOption7965(Player player, int index, Npc npc) {}

    // Cabin Boy Colin
    public static void npcOption7966(Player player, int index, Npc npc) {}

    // Cabin Boy Colin
    public static void npcOption7967(Player player, int index, Npc npc) {}

    // Gnocci the Cook
    public static void npcOption7970(Player player, int index, Npc npc) {}

    // Arsen the Thief
    public static void npcOption7976(Player player, int index, Npc npc) {}

    // Yusuf
    public static void npcOption7981(Player player, int index, Npc npc) {}

    // Yusuf
    public static void npcOption7982(Player player, int index, Npc npc) {}

    // Madame Caldarium
    public static void npcOption7984(Player player, int index, Npc npc) {}

    // Haris
    public static void npcOption7985(Player player, int index, Npc npc) {}

    // Altarkiz
    public static void npcOption7986(Player player, int index, Npc npc) {}

    // Lord Marshal Brogan
    public static void npcOption7987(Player player, int index, Npc npc) {}

    // Chief Tess
    public static void npcOption7988(Player player, int index, Npc npc) {}

    // Elder Chaos druid
    public static void npcOption7995(Player player, int index, Npc npc) {
        player.getGameEncoder().sendMessage("The elder chaos druid will unnote bones for a fee.");
    }

    // Rift guardian
    public static void npcOption8024(Player player, int index, Npc npc) {}

    // Vorki
    public static void npcOption8025(Player player, int index, Npc npc) {}

    // Rift guardian
    public static void npcOption8028(Player player, int index, Npc npc) {}

    // Vorki
    public static void npcOption8029(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption8034(Player player, int index, Npc npc) {}

    // Neite
    public static void npcOption8035(Player player, int index, Npc npc) {}

    // Diana
    public static void npcOption8036(Player player, int index, Npc npc) {}

    // Jack
    public static void npcOption8037(Player player, int index, Npc npc) {}

    // Ellen
    public static void npcOption8038(Player player, int index, Npc npc) {}

    // Freja
    public static void npcOption8039(Player player, int index, Npc npc) {}

    // Lutwidge
    public static void npcOption8040(Player player, int index, Npc npc) {}

    // King Roald
    public static void npcOption8042(Player player, int index, Npc npc) {}

    // Aeonisig Raispher
    public static void npcOption8043(Player player, int index, Npc npc) {}

    // Sir Amik Varze
    public static void npcOption8044(Player player, int index, Npc npc) {}

    // Sir Tiffy Cashien
    public static void npcOption8045(Player player, int index, Npc npc) {}

    // King Lathas
    public static void npcOption8046(Player player, int index, Npc npc) {}

    // King Arthur
    public static void npcOption8047(Player player, int index, Npc npc) {}

    // Brundt the Chieftain
    public static void npcOption8048(Player player, int index, Npc npc) {}

    // Oneiromancer
    public static void npcOption8049(Player player, int index, Npc npc) {}

    // Denulth
    public static void npcOption8050(Player player, int index, Npc npc) {}

    // Duke Horacio
    public static void npcOption8051(Player player, int index, Npc npc) {}

    // Wise Old Man
    public static void npcOption8052(Player player, int index, Npc npc) {}

    // Jardric
    public static void npcOption8053(Player player, int index, Npc npc) {}

    // Achietties
    public static void npcOption8054(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption8055(Player player, int index, Npc npc) {}

    // Vorkath
    public static void npcOption8059(Player player, int index, Npc npc) {
        if (npc.isLocked()) {
            return;
        }
        npc.setTransformationID(8061);
        npc.setAnimation(7950);
        npc.setLock(8);
    }

    // Dallas Jones
    public static void npcOption8100(Player player, int index, Npc npc) {}

    // Dallas Jones
    public static void npcOption8101(Player player, int index, Npc npc) {}

    // Dallas Jones
    public static void npcOption8102(Player player, int index, Npc npc) {}

    // Dallas Jones
    public static void npcOption8103(Player player, int index, Npc npc) {}

    // Jardric
    public static void npcOption8105(Player player, int index, Npc npc) {}

    // Jardric
    public static void npcOption8106(Player player, int index, Npc npc) {}

    // Jardric
    public static void npcOption8107(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption8111(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption8112(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption8113(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption8114(Player player, int index, Npc npc) {}

    // Not Bob
    public static void npcOption8116(Player player, int index, Npc npc) {}

    // Torfinn
    public static void npcOption8131(Player player, int index, Npc npc) {}

    // Torfinn
    public static void npcOption8132(Player player, int index, Npc npc) {}

    // Torfinn
    public static void npcOption8133(Player player, int index, Npc npc) {}

    // Sarah
    public static void npcOption8134(Player player, int index, Npc npc) {}

    // Zorgoth
    public static void npcOption8136(Player player, int index, Npc npc) {}

    // Brundt the Chieftain
    public static void npcOption8145(Player player, int index, Npc npc) {}

    // Koschei the Deathless
    public static void npcOption8152(Player player, int index, Npc npc) {}

    // Brundt the Chieftain
    public static void npcOption8153(Player player, int index, Npc npc) {}

    // Wise Old Man
    public static void npcOption8154(Player player, int index, Npc npc) {}

    // Jardric
    public static void npcOption8155(Player player, int index, Npc npc) {}

    // Achietties
    public static void npcOption8156(Player player, int index, Npc npc) {}

    // Sir Tiffy Cashien
    public static void npcOption8157(Player player, int index, Npc npc) {}

    // Oneiromancer
    public static void npcOption8158(Player player, int index, Npc npc) {}

    // Bob
    public static void npcOption8159(Player player, int index, Npc npc) {}

    // Amelia
    public static void npcOption8180(Player player, int index, Npc npc) {}

    // Jonathan
    public static void npcOption8181(Player player, int index, Npc npc) {}

    // Natural Historian
    public static void npcOption8182(Player player, int index, Npc npc) {}

    // Martin Holt
    public static void npcOption8183(Player player, int index, Npc npc) {}

    // Grave digger
    public static void npcOption8189(Player player, int index, Npc npc) {}
    /* 8192 - 8447 */

    // James
    public static void npcOption8193(Player player, int index, Npc npc) {}

    // Dogadile
    public static void npcOption8196(Player player, int index, Npc npc) {}

    // Tektonne
    public static void npcOption8197(Player player, int index, Npc npc) {}

    // Vanguard
    public static void npcOption8198(Player player, int index, Npc npc) {}

    // Mini Nistirio
    public static void npcOption8199(Player player, int index, Npc npc) {}

    // Vespina
    public static void npcOption8200(Player player, int index, Npc npc) {}

    // Puppadile
    public static void npcOption8201(Player player, int index, Npc npc) {}

    // Tektiny
    public static void npcOption8202(Player player, int index, Npc npc) {}

    // Vanguard
    public static void npcOption8203(Player player, int index, Npc npc) {}

    // Vasa Minirio
    public static void npcOption8204(Player player, int index, Npc npc) {}

    // Vespina
    public static void npcOption8205(Player player, int index, Npc npc) {}

    // Garth
    public static void npcOption8206(Player player, int index, Npc npc) {}

    // Harpert
    public static void npcOption8212(Player player, int index, Npc npc) {}

    // Mercenary
    public static void npcOption8213(Player player, int index, Npc npc) {}

    // Mercenary
    public static void npcOption8214(Player player, int index, Npc npc) {}

    // Mercenary
    public static void npcOption8215(Player player, int index, Npc npc) {}

    // Safalaan
    public static void npcOption8216(Player player, int index, Npc npc) {}

    // Safalaan
    public static void npcOption8219(Player player, int index, Npc npc) {}

    // Vertida Sefalatis
    public static void npcOption8220(Player player, int index, Npc npc) {}

    // Vertida Sefalatis
    public static void npcOption8222(Player player, int index, Npc npc) {}

    // Flaygian Screwte
    public static void npcOption8224(Player player, int index, Npc npc) {}

    // Mekritus A'hara
    public static void npcOption8226(Player player, int index, Npc npc) {}

    // Andiess Juip
    public static void npcOption8228(Player player, int index, Npc npc) {}

    // Kael Forshaw
    public static void npcOption8230(Player player, int index, Npc npc) {}

    // Kael Forshaw
    public static void npcOption8231(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption8251(Player player, int index, Npc npc) {}

    // Andras
    public static void npcOption8267(Player player, int index, Npc npc) {}

    // Andras
    public static void npcOption8268(Player player, int index, Npc npc) {}

    // Carl
    public static void npcOption8272(Player player, int index, Npc npc) {}

    // Lector Gura
    public static void npcOption8273(Player player, int index, Npc npc) {}

    // Sister Sevi
    public static void npcOption8274(Player player, int index, Npc npc) {}

    // Sister Toen
    public static void npcOption8275(Player player, int index, Npc npc) {}

    // Sister Yram
    public static void npcOption8276(Player player, int index, Npc npc) {}

    // Hameln the Jester
    public static void npcOption8277(Player player, int index, Npc npc) {}

    // Hanchen the Hound
    public static void npcOption8278(Player player, int index, Npc npc) {}

    // Kroy
    public static void npcOption8279(Player player, int index, Npc npc) {}

    // Damien Leucurte
    public static void npcOption8280(Player player, int index, Npc npc) {}

    // Lord Crombwick
    public static void npcOption8281(Player player, int index, Npc npc) {}

    // Christopher
    public static void npcOption8289(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption8290(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption8291(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption8292(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption8293(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption8294(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption8295(Player player, int index, Npc npc) {}

    // Child
    public static void npcOption8296(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption8300(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption8301(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption8302(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption8303(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption8304(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption8305(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption8306(Player player, int index, Npc npc) {}

    // Vyrewatch
    public static void npcOption8307(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption8321(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption8322(Player player, int index, Npc npc) {}

    // Mysterious Stranger
    public static void npcOption8325(Player player, int index, Npc npc) {}

    // Vampyre Juvenile
    public static void npcOption8326(Player player, int index, Npc npc) {}

    // Vampyre Juvenile
    public static void npcOption8327(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption8328(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption8329(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption8330(Player player, int index, Npc npc) {}

    // Meiyerditch citizen
    public static void npcOption8331(Player player, int index, Npc npc) {}

    // Vyrelord
    public static void npcOption8332(Player player, int index, Npc npc) {}

    // Vyrelady
    public static void npcOption8333(Player player, int index, Npc npc) {}

    // Vyrelord
    public static void npcOption8334(Player player, int index, Npc npc) {}

    // Vyrelady
    public static void npcOption8335(Player player, int index, Npc npc) {}

    // Lil' Zik
    public static void npcOption8336(Player player, int index, Npc npc) {}

    // Lil' Zik
    public static void npcOption8337(Player player, int index, Npc npc) {}

    // Abigaila
    public static void npcOption8368(Player player, int index, Npc npc) {}

    // Verzik Vitur
    public static void npcOption8369(Player player, int index, Npc npc) {}

    // Nigel
    public static void npcOption8390(Player player, int index, Npc npc) {}

    // Nigel
    public static void npcOption8391(Player player, int index, Npc npc) {}

    // Monk of Zamorak
    public static void npcOption8400(Player player, int index, Npc npc) {}

    // Monk of Zamorak
    public static void npcOption8401(Player player, int index, Npc npc) {}

    // Askeladden
    public static void npcOption8402(Player player, int index, Npc npc) {}

    // Askeladden
    public static void npcOption8403(Player player, int index, Npc npc) {}

    // Askeladden
    public static void npcOption8404(Player player, int index, Npc npc) {}

    // Askeladden
    public static void npcOption8405(Player player, int index, Npc npc) {}

    // Wise Old Man
    public static void npcOption8407(Player player, int index, Npc npc) {}

    // My Arm
    public static void npcOption8411(Player player, int index, Npc npc) {}

    // Wolfbone
    public static void npcOption8424(Player player, int index, Npc npc) {}

    // Mother
    public static void npcOption8425(Player player, int index, Npc npc) {}

    // Mother
    public static void npcOption8426(Player player, int index, Npc npc) {}

    // Mother
    public static void npcOption8428(Player player, int index, Npc npc) {}

    // Mother
    public static void npcOption8429(Player player, int index, Npc npc) {}

    // Mother
    public static void npcOption8430(Player player, int index, Npc npc) {}

    // Snowflake
    public static void npcOption8431(Player player, int index, Npc npc) {}

    // Odd Mushroom
    public static void npcOption8434(Player player, int index, Npc npc) {}

    // Odd Mushroom
    public static void npcOption8435(Player player, int index, Npc npc) {}

    // Don't Know What
    public static void npcOption8438(Player player, int index, Npc npc) {}

    // Don't Know What
    public static void npcOption8439(Player player, int index, Npc npc) {}

    // Boulder
    public static void npcOption8442(Player player, int index, Npc npc) {}

    // null
    public static void npcOption8443(Player player, int index, Npc npc) {}

    // Root
    public static void npcOption8444(Player player, int index, Npc npc) {}

    // Icicle
    public static void npcOption8446(Player player, int index, Npc npc) {}
    /* 8448 - 8703 */

    // Driftwood
    public static void npcOption8448(Player player, int index, Npc npc) {}

    // Pebble
    public static void npcOption8450(Player player, int index, Npc npc) {}

    // Goat Poo
    public static void npcOption8452(Player player, int index, Npc npc) {}

    // Yellow Snow
    public static void npcOption8454(Player player, int index, Npc npc) {}

    // Butterfly
    public static void npcOption8456(Player player, int index, Npc npc) {}

    // Odd Stone
    public static void npcOption8460(Player player, int index, Npc npc) {}

    // Squirrel
    public static void npcOption8464(Player player, int index, Npc npc) {}

    // null
    public static void npcOption8478(Player player, int index, Npc npc) {}

    // Combat Test (maxhit)
    public static void npcOption8479(Player player, int index, Npc npc) {}

    // Wizard Cromperty
    public static void npcOption8480(Player player, int index, Npc npc) {}

    // Wizard Cromperty
    public static void npcOption8481(Player player, int index, Npc npc) {}

    // Smoke Devil
    public static void npcOption8482(Player player, int index, Npc npc) {}

    // Smoke Devil
    public static void npcOption8483(Player player, int index, Npc npc) {}

    // Veos
    public static void npcOption8484(Player player, int index, Npc npc) {}

    // Make-over mage
    public static void npcOption8487(Player player, int index, Npc npc) {}

    // The Collector
    public static void npcOption8491(Player player, int index, Npc npc) {}

    // Ikkle Hydra
    public static void npcOption8492(Player player, int index, Npc npc) {}

    // Ikkle Hydra
    public static void npcOption8493(Player player, int index, Npc npc) {}

    // Ikkle Hydra
    public static void npcOption8494(Player player, int index, Npc npc) {}

    // Ikkle Hydra
    public static void npcOption8495(Player player, int index, Npc npc) {}

    // Dwarf
    public static void npcOption8496(Player player, int index, Npc npc) {}

    // Lady Vulcana Lovakengj
    public static void npcOption8497(Player player, int index, Npc npc) {}

    // Councillor Unkar
    public static void npcOption8498(Player player, int index, Npc npc) {}

    // Jorra
    public static void npcOption8499(Player player, int index, Npc npc) {}

    // Old dwarf
    public static void npcOption8500(Player player, int index, Npc npc) {}

    // Mori
    public static void npcOption8501(Player player, int index, Npc npc) {}

    // Mori
    public static void npcOption8502(Player player, int index, Npc npc) {}

    // Survival Expert
    public static void npcOption8503(Player player, int index, Npc npc) {}

    // Lord Trobin Arceuus
    public static void npcOption8504(Player player, int index, Npc npc) {}

    // Lord Trobin Arceuus
    public static void npcOption8505(Player player, int index, Npc npc) {}

    // Asteros Arceuus
    public static void npcOption8506(Player player, int index, Npc npc) {}

    // Tower Mage
    public static void npcOption8507(Player player, int index, Npc npc) {}

    // Tower Mage
    public static void npcOption8508(Player player, int index, Npc npc) {}

    // Tower Mage
    public static void npcOption8509(Player player, int index, Npc npc) {}

    // Tower Mage
    public static void npcOption8510(Player player, int index, Npc npc) {}

    // Tower Mage
    public static void npcOption8511(Player player, int index, Npc npc) {}

    // Tormented Soul
    public static void npcOption8512(Player player, int index, Npc npc) {}

    // Tormented Soul
    public static void npcOption8513(Player player, int index, Npc npc) {}

    // Trapped Soul
    public static void npcOption8514(Player player, int index, Npc npc) {}

    // Alyssa
    public static void npcOption8515(Player player, int index, Npc npc) {}

    // Garden supplier
    public static void npcOption8516(Player player, int index, Npc npc) {}

    // Ikkle Hydra
    public static void npcOption8517(Player player, int index, Npc npc) {}

    // Ikkle Hydra
    public static void npcOption8518(Player player, int index, Npc npc) {}

    // Ikkle Hydra
    public static void npcOption8519(Player player, int index, Npc npc) {}

    // Ikkle Hydra
    public static void npcOption8520(Player player, int index, Npc npc) {}

    // Alry the Angler
    public static void npcOption8521(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption8523(Player player, int index, Npc npc) {}

    // Rod Fishing spot
    public static void npcOption8524(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption8525(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption8526(Player player, int index, Npc npc) {}

    // Fishing spot
    public static void npcOption8527(Player player, int index, Npc npc) {}

    // Trapped Soul
    public static void npcOption8528(Player player, int index, Npc npc) {}

    // Trapped Soul (hard)
    public static void npcOption8529(Player player, int index, Npc npc) {}

    // Amelia
    public static void npcOption8530(Player player, int index, Npc npc) {}

    // Allanna
    public static void npcOption8531(Player player, int index, Npc npc) {}

    // Leke quo Keran
    public static void npcOption8532(Player player, int index, Npc npc) {}

    // Nikkie
    public static void npcOption8533(Player player, int index, Npc npc) {}

    // Rosie
    public static void npcOption8534(Player player, int index, Npc npc) {}

    // Alan
    public static void npcOption8535(Player player, int index, Npc npc) {}

    // Alexandra
    public static void npcOption8536(Player player, int index, Npc npc) {}

    // Latlink Fastbell
    public static void npcOption8537(Player player, int index, Npc npc) {}

    // Elise
    public static void npcOption8538(Player player, int index, Npc npc) {}

    // arc_test_01
    public static void npcOption8539(Player player, int index, Npc npc) {}

    // arc_test_02
    public static void npcOption8540(Player player, int index, Npc npc) {}

    // Commander Fullore
    public static void npcOption8541(Player player, int index, Npc npc) {}

    // Undor
    public static void npcOption8544(Player player, int index, Npc npc) {}

    // Undor
    public static void npcOption8545(Player player, int index, Npc npc) {}

    // Thirus
    public static void npcOption8546(Player player, int index, Npc npc) {}

    // Thirus
    public static void npcOption8547(Player player, int index, Npc npc) {}

    // Darcor quo Narga
    public static void npcOption8548(Player player, int index, Npc npc) {}

    // Uurrak quo Narga
    public static void npcOption8549(Player player, int index, Npc npc) {}

    // Gorhak quo Narga
    public static void npcOption8552(Player player, int index, Npc npc) {}

    // Fornek quo Maten
    public static void npcOption8553(Player player, int index, Npc npc) {}

    // Xorrah quo Sihar
    public static void npcOption8555(Player player, int index, Npc npc) {}

    // Corkat quo Sihar
    public static void npcOption8556(Player player, int index, Npc npc) {}

    // Lokraa quo Sihar
    public static void npcOption8557(Player player, int index, Npc npc) {}

    // Haldor quo Keran
    public static void npcOption8559(Player player, int index, Npc npc) {}

    // Vortas quo Keran
    public static void npcOption8560(Player player, int index, Npc npc) {}

    // Richard Flintmaul
    public static void npcOption8562(Player player, int index, Npc npc) {}

    // Lizardman
    public static void npcOption8563(Player player, int index, Npc npc) {}

    // Lizardman brute
    public static void npcOption8564(Player player, int index, Npc npc) {}

    // Lizardman shaman
    public static void npcOption8565(Player player, int index, Npc npc) {}

    // General Vir
    public static void npcOption8577(Player player, int index, Npc npc) {}

    // Swamp frog
    public static void npcOption8578(Player player, int index, Npc npc) {}

    // Shayzien Infiltrator
    public static void npcOption8579(Player player, int index, Npc npc) {}

    // Kaht B'alam
    public static void npcOption8580(Player player, int index, Npc npc) {}

    // Hespori
    public static void npcOption8583(Player player, int index, Npc npc) {}

    // Flower
    public static void npcOption8584(Player player, int index, Npc npc) {}

    // Guildmaster Jane
    public static void npcOption8586(Player player, int index, Npc npc) {}

    // Guildmaster Jane
    public static void npcOption8587(Player player, int index, Npc npc) {}

    // Arno
    public static void npcOption8588(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption8589(Player player, int index, Npc npc) {}

    // Banker
    public static void npcOption8590(Player player, int index, Npc npc) {}

    // Felfiz Yaryus
    public static void npcOption8595(Player player, int index, Npc npc) {}

    // Keith
    public static void npcOption8596(Player player, int index, Npc npc) {}

    // Gordon
    public static void npcOption8597(Player player, int index, Npc npc) {}

    // Mary
    public static void npcOption8598(Player player, int index, Npc npc) {}

    // Shayzien sergeant
    public static void npcOption8600(Player player, int index, Npc npc) {}

    // Kaal-Ket-Jor
    public static void npcOption8602(Player player, int index, Npc npc) {}

    // Kaal-Mej-San
    public static void npcOption8603(Player player, int index, Npc npc) {}

    // Kaal-Xil-Dar
    public static void npcOption8604(Player player, int index, Npc npc) {}

    // Tarfol quo Maten
    public static void npcOption8605(Player player, int index, Npc npc) {}

    // Kormar quo Maten
    public static void npcOption8606(Player player, int index, Npc npc) {}

    // Garbek quo Maten
    public static void npcOption8607(Player player, int index, Npc npc) {}

    // Orrvor quo Maten
    public static void npcOption8608(Player player, int index, Npc npc) {}

    // Hydra
    public static void npcOption8609(Player player, int index, Npc npc) {}

    // Wyrm
    public static void npcOption8610(Player player, int index, Npc npc) {}

    // Wyrm
    public static void npcOption8611(Player player, int index, Npc npc) {}

    // Drake
    public static void npcOption8612(Player player, int index, Npc npc) {}

    // Sulphur Lizard
    public static void npcOption8614(Player player, int index, Npc npc) {}

    // Alchemical Hydra
    public static void npcOption8615(Player player, int index, Npc npc) {}

    // Alchemical Hydra
    public static void npcOption8616(Player player, int index, Npc npc) {}

    // Alchemical Hydra
    public static void npcOption8617(Player player, int index, Npc npc) {}

    // Alchemical Hydra
    public static void npcOption8618(Player player, int index, Npc npc) {}

    // Alchemical Hydra
    public static void npcOption8619(Player player, int index, Npc npc) {}

    // Alchemical Hydra
    public static void npcOption8620(Player player, int index, Npc npc) {}

    // Alchemical Hydra
    public static void npcOption8621(Player player, int index, Npc npc) {}

    // Konar quo Maten
    public static void npcOption8623(Player player, int index, Npc npc) {}

    // Taylor
    public static void npcOption8629(Player player, int index, Npc npc) {}

    // Veos
    public static void npcOption8630(Player player, int index, Npc npc) {}

    // Seaman Morris
    public static void npcOption8631(Player player, int index, Npc npc) {}

    // Dodgy geezer
    public static void npcOption8644(Player player, int index, Npc npc) {}

    // Cursed jewelled crab (red)
    public static void npcOption16002(Player player, int index, Npc npc) {
        if (!player.getInventory().hasItem(ItemID.HAMMER)
                && player.getEquipment().getWeaponID() != ItemID.DRAGON_WARHAMMER
                && player.getEquipment().getWeaponID() != ItemID.ELDER_MAUL
                && player.getEquipment().getWeaponID() != ItemID.TORAGS_HAMMERS) {
            player.getGameEncoder().sendMessage("This crab can only be smashed by certain hammers.");
            return;
        }
        if (player.getInventory().hasItem(ItemID.HAMMER)) {
            player.setAnimation(1755);
        } else {
            player.setAnimation(player.getCombat().getAttackAnimation());
        }
        npc.getCombat().getCombatScript().getVariable("smash");
    }

    // Cursed jewelled crab (green)
    public static void npcOption16003(Player player, int index, Npc npc) {
        if (!player.getInventory().hasItem(ItemID.HAMMER)
                && player.getEquipment().getWeaponID() != ItemID.DRAGON_WARHAMMER
                && player.getEquipment().getWeaponID() != ItemID.ELDER_MAUL
                && player.getEquipment().getWeaponID() != ItemID.TORAGS_HAMMERS) {
            player.getGameEncoder().sendMessage("This crab can only be smashed by certain hammers.");
            return;
        }
        if (player.getInventory().hasItem(ItemID.HAMMER)) {
            player.setAnimation(1755);
        } else {
            player.setAnimation(player.getCombat().getAttackAnimation());
        }
        npc.getCombat().getCombatScript().getVariable("smash");
    }

    // Cursed jewelled crab (blue)
    public static void npcOption16004(Player player, int index, Npc npc) {
        if (!player.getInventory().hasItem(ItemID.HAMMER)
                && player.getEquipment().getWeaponID() != ItemID.DRAGON_WARHAMMER
                && player.getEquipment().getWeaponID() != ItemID.ELDER_MAUL
                && player.getEquipment().getWeaponID() != ItemID.TORAGS_HAMMERS) {
            player.getGameEncoder().sendMessage("This crab can only be smashed by certain hammers.");
            return;
        }
        if (player.getInventory().hasItem(ItemID.HAMMER)) {
            player.setAnimation(1755);
        } else {
            player.setAnimation(player.getCombat().getAttackAnimation());
        }
        npc.getCombat().getCombatScript().getVariable("smash");
    }

    // Cap't Bond
    public static void npcOption16018(Player player, int index, Npc npc) {
        player.getOptions().openBondsMenu();
    }
}
