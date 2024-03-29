package script.packetdecoder.widget;

import com.palidino.osrs.io.ValueEnteredEvent;
import com.palidino.osrs.model.item.ItemDef;
import com.palidino.osrs.model.npc.NKillLog;
import com.palidino.osrs.model.player.Loadout;
import com.palidino.osrs.model.player.Player;

public class ShopWidget {
    public static void widget100(Player player, int index, int childId, int slot, int itemId) {
        // Tourament supplies
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 4:
            if (player.getShop() == null) {
                break;
            }
            if (index == 0) {
                player.getShop().sendShopPrice(player, itemId, slot);
            } else if (index == 1) {
                player.getShop().buyShopItem(player, itemId, slot, 1);
            } else if (index == 2) {
                player.getShop().buyShopItem(player, itemId, slot, 5);
            } else if (index == 3) {
                player.getShop().buyShopItem(player, itemId, slot, 10);
            } else if (index == 4) {
                player.getShop().buyShopItem(player, itemId, slot, 50);
            } else if (index == 5) {
                player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                    @Override
                    public void execute(int value) {
                        player.getShop().buyShopItem(player, itemId, slot, value);
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

    public static void widget300(Player player, int index, int childId, int slot, int itemId) {
        // Shop
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 16:
            if (player.getGrandExchange().getViewingUserId() != -1) {
                if (index == 0) {
                    player.getGrandExchange().sendShopPrice(itemId, slot - 1);
                } else if (index == 1) {
                    player.getGrandExchange().buyShopItem(itemId, slot - 1, 1);
                } else if (index == 2) {
                    player.getGrandExchange().buyShopItem(itemId, slot - 1, 5);
                } else if (index == 3) {
                    player.getGrandExchange().buyShopItem(itemId, slot - 1, 10);
                } else if (index == 4) {
                    player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                        @Override
                        public void execute(int value) {
                            player.getGrandExchange().buyShopItem(itemId, slot - 1, value);
                        }
                    });
                }
            } else if (player.getShop() == null) {
                NKillLog nKillLog = player.getCombat().getNPCKillLog();
                if (nKillLog == null || nKillLog.getItems() == null) {
                    return;
                }
                player.getGameEncoder().sendMessage(ItemDef.getName(itemId) + ": " + nKillLog.getItemOnCounts(itemId));
                return;
            }
            break;
        }
    }

    public static void widget301(Player player, int index, int childId, int slot, int itemId) {
        // Inventory
        if (player.isLocked()) {
            return;
        }
        switch (childId) {
        case 0:
            if (player.getShop() != null) {
                if (index == 0) {
                    player.getShop().sendInventoryPrice(player, itemId, slot);
                } else if (index == 1) {
                    player.getShop().sellInventoryItem(player, itemId, slot, 1);
                } else if (index == 2) {
                    player.getShop().sellInventoryItem(player, itemId, slot, 5);
                } else if (index == 3) {
                    player.getShop().sellInventoryItem(player, itemId, slot, 10);
                } else if (index == 4) {
                    player.getShop().sellInventoryItem(player, itemId, slot, 50);
                } else if (index == 5) {
                    player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                        @Override
                        public void execute(int value) {
                            player.getShop().sellInventoryItem(player, itemId, slot, value);
                        }
                    });
                }
            } else if (player.getGrandExchange().getViewingUserId() != -1) {
                if (index == 0) {
                    player.getGrandExchange().sendInventoryPrice(itemId, slot);
                } else if (index == 1) {
                    player.getGrandExchange().sellInventoryItem(itemId, slot, 1);
                } else if (index == 2) {
                    player.getGrandExchange().sellInventoryItem(itemId, slot, 5);
                } else if (index == 3) {
                    player.getGrandExchange().sellInventoryItem(itemId, slot, 10);
                } else if (index == 4) {
                    player.getGrandExchange().sellInventoryItem(itemId, slot, 50);
                } else if (index == 5) {
                    player.getGameEncoder().sendEnterAmount(new ValueEnteredEvent.IntegerEvent() {
                        @Override
                        public void execute(int value) {
                            player.getGrandExchange().sellInventoryItem(itemId, slot, value);
                        }
                    });
                }
            }
            break;
        }
    }
}

