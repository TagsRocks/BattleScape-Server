// Cursed jewelled crab (red)
DecodedPacketNpcOption.prototype.npc_16002 = function(player, index, npc) {
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
DecodedPacketNpcOption.prototype.npc_16003 = function(player, index, npc) {
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
DecodedPacketNpcOption.prototype.npc_16004 = function(player, index, npc) {
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
DecodedPacketNpcOption.prototype.npc_16018 = function(player, index, npc) {
    player.getOptions().openBondsMenu();
}
