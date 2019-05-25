package script.packetdecoder.widget;

import com.palidino.osrs.io.ValueEnteredEvent;
import com.palidino.osrs.model.item.ItemDef;
import com.palidino.osrs.model.npc.NKillLog;
import com.palidino.osrs.model.player.Loadout;
import com.palidino.osrs.model.player.Player;

public class ShopWidget {
    public static void widget100(Player player, int index, int childID, int slot, int itemID) {
        // Tourament supplies
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 4:
            if (player.getShop() == null) {
                break;
            }
            if (index == 0) {
                player.getShop().sendShopPrice(player, itemID, slot);
            } else if (index == 1) {
                player.getShop().buyShopItem(player, itemID, slot, 1);
            } else if (index == 2) {
                player.getShop().buyShopItem(player, itemID, slot, 5);
            } else if (index == 3) {
                player.getShop().buyShopItem(player, itemID, slot, 10);
            } else if (index == 4) {
                player.getShop().buyShopItem(player, itemID, slot, 50);
            } else if (index == 5) {
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        player.getShop().buyShopItem(player, itemID, slot, value);
                    }
                });
            }
            break;
        case 31:
            if (index == 0) {
                player.getLoadout().preview(slot);
            } else if (index == 1) {
                player.getLoadout().setAsQuick(slot - Loadout.OFFSET);
            } else if (index == 2) {
                player.getLoadout().rename(slot - Loadout.OFFSET);
            } else if (index == 3) {
                player.getLoadout().replace(slot - Loadout.OFFSET);
            } else if (index == 4) {
                player.getLoadout().insertNew(slot - Loadout.OFFSET);
            } else if (index == 5) {
                player.getLoadout().remove(slot - Loadout.OFFSET);
            }
            break;
        case 33:
            player.getLoadout().apply();
            break;
        }
    }

    public static void widget300(Player player, int index, int childID, int slot, int itemID) {
        // Shop
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 16:
            if (player.getGrandExchange().getViewingUserID() != -1) {
                if (index == 0) {
                    player.getGrandExchange().sendShopPrice(itemID, slot - 1);
                } else if (index == 1) {
                    player.getGrandExchange().buyShopItem(itemID, slot - 1, 1);
                } else if (index == 2) {
                    player.getGrandExchange().buyShopItem(itemID, slot - 1, 5);
                } else if (index == 3) {
                    player.getGrandExchange().buyShopItem(itemID, slot - 1, 10);
                } else if (index == 4) {
                    player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                        @Override
                        public void execute(int value) {
                            player.getGrandExchange().buyShopItem(itemID, slot - 1, value);
                        }
                    });
                }
            } else if (player.getShop() == null) {
                NKillLog nKillLog = player.getCombat().getNPCKillLog();
                if (nKillLog == null || nKillLog.getItems() == null) {
                    return;
                }
                player.getGameEncoder().sendMessage(ItemDef.getName(itemID) + ": " + nKillLog.getItemOnCounts(itemID));
                return;
            }
            break;
        }
    }

    public static void widget301(Player player, int index, int childID, int slot, int itemID) {
        // Inventory
        if (player.isLocked()) {
            return;
        }
        switch (childID) {
        case 0:
            if (player.getShop() != null) {
                if (index == 0) {
                    player.getShop().sendInventoryPrice(player, itemID, slot);
                } else if (index == 1) {
                    player.getShop().sellInventoryItem(player, itemID, slot, 1);
                } else if (index == 2) {
                    player.getShop().sellInventoryItem(player, itemID, slot, 5);
                } else if (index == 3) {
                    player.getShop().sellInventoryItem(player, itemID, slot, 10);
                } else if (index == 4) {
                    player.getShop().sellInventoryItem(player, itemID, slot, 50);
                } else if (index == 5) {
                    player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                        @Override
                        public void execute(int value) {
                            player.getShop().sellInventoryItem(player, itemID, slot, value);
                        }
                    });
                }
            } else if (player.getGrandExchange().getViewingUserID() != -1) {
                if (index == 0) {
                    player.getGrandExchange().sendInventoryPrice(itemID, slot);
                } else if (index == 1) {
                    player.getGrandExchange().sellInventoryItem(itemID, slot, 1);
                } else if (index == 2) {
                    player.getGrandExchange().sellInventoryItem(itemID, slot, 5);
                } else if (index == 3) {
                    player.getGrandExchange().sellInventoryItem(itemID, slot, 10);
                } else if (index == 4) {
                    player.getGrandExchange().sellInventoryItem(itemID, slot, 50);
                } else if (index == 5) {
                    player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                        @Override
                        public void execute(int value) {
                            player.getGrandExchange().sellInventoryItem(itemID, slot, value);
                        }
                    });
                }
            }
            break;
        }
    }
}

