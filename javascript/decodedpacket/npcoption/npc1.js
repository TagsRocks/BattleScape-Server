/* 256 - 511 */

// Town crier
DecodedPacketNpcOption.prototype.npc_276 = function(player, index, npc) { }

// Town crier
DecodedPacketNpcOption.prototype.npc_277 = function(player, index, npc) { }

// Town crier
DecodedPacketNpcOption.prototype.npc_278 = function(player, index, npc) { }

// Town crier
DecodedPacketNpcOption.prototype.npc_279 = function(player, index, npc) { }

// Town crier
DecodedPacketNpcOption.prototype.npc_280 = function(player, index, npc) { }

// Thordur
DecodedPacketNpcOption.prototype.npc_297 = function(player, index, npc) { }

// Thordur
DecodedPacketNpcOption.prototype.npc_298 = function(player, index, npc) { }

// Gunthor the brave
DecodedPacketNpcOption.prototype.npc_299 = function(player, index, npc) { }

// Black Heather
DecodedPacketNpcOption.prototype.npc_301 = function(player, index, npc) { }

// Donny the lad
DecodedPacketNpcOption.prototype.npc_302 = function(player, index, npc) { }

// Speedy Keith
DecodedPacketNpcOption.prototype.npc_303 = function(player, index, npc) { }

// Witch
DecodedPacketNpcOption.prototype.npc_305 = function(player, index, npc) { }

// Lumbridge Guide
DecodedPacketNpcOption.prototype.npc_306 = function(player, index, npc) {
    player.openDialogue("guidebook", 0);
}

// Dr Jekyll
DecodedPacketNpcOption.prototype.npc_307 = function(player, index, npc) { }

// Ayesha
DecodedPacketNpcOption.prototype.npc_310 = function(player, index, npc) { }

// Adam
DecodedPacketNpcOption.prototype.npc_311 = function(player, index, npc) {
    if (index == 0) {
        /*if (player.isGameModeIronman() || player.isGameModeGroupIronman()) {
            player.openDialogue("ironadam", 0);
        } else {
            player.getGameEncoder().sendMessage("Adam has no reason to talk to you btw.");
        }*/
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
DecodedPacketNpcOption.prototype.npc_312 = function(player, index, npc) { }

// Dr Jekyll
DecodedPacketNpcOption.prototype.npc_314 = function(player, index, npc) { }

// Emblem Trader
DecodedPacketNpcOption.prototype.npc_315 = function(player, index, npc) { }

// Emblem Trader
DecodedPacketNpcOption.prototype.npc_316 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("emblemtrader", 0);
    } else if (index == 2) {
        if (player.isGameModeNormal() || player.isGameModeHard()) {
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
DecodedPacketNpcOption.prototype.npc_317 = function(player, index, npc) { }

// Dark core
DecodedPacketNpcOption.prototype.npc_318 = function(player, index, npc) { }

// Drunken Dwarf
DecodedPacketNpcOption.prototype.npc_322 = function(player, index, npc) { }

// Strange plant
DecodedPacketNpcOption.prototype.npc_323 = function(player, index, npc) { }

// Genie
DecodedPacketNpcOption.prototype.npc_326 = function(player, index, npc) { }

// Genie
DecodedPacketNpcOption.prototype.npc_327 = function(player, index, npc) { }

// Sergeant Damien
DecodedPacketNpcOption.prototype.npc_337 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_342 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_343 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_344 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_345 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_346 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_347 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_349 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_350 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_351 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_352 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_354 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_355 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_356 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_357 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_358 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_359 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_361 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_362 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_363 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_364 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_365 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_366 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_367 = function(player, index, npc) { }

// Prison Pete
DecodedPacketNpcOption.prototype.npc_368 = function(player, index, npc) { }

// Balloon Animal
DecodedPacketNpcOption.prototype.npc_369 = function(player, index, npc) { }

// Balloon Animal
DecodedPacketNpcOption.prototype.npc_370 = function(player, index, npc) { }

// Balloon Animal
DecodedPacketNpcOption.prototype.npc_371 = function(player, index, npc) { }

// Freaky Forester
DecodedPacketNpcOption.prototype.npc_372 = function(player, index, npc) { }

// Rick Turpentine
DecodedPacketNpcOption.prototype.npc_375 = function(player, index, npc) { }

// Rick Turpentine
DecodedPacketNpcOption.prototype.npc_376 = function(player, index, npc) { }

// Bee keeper
DecodedPacketNpcOption.prototype.npc_377 = function(player, index, npc) { }

// Pillory Guard
DecodedPacketNpcOption.prototype.npc_380 = function(player, index, npc) { }

// Man
DecodedPacketNpcOption.prototype.npc_385 = function(player, index, npc) { }

// Avan
DecodedPacketNpcOption.prototype.npc_386 = function(player, index, npc) { }

// Avan
DecodedPacketNpcOption.prototype.npc_387 = function(player, index, npc) { }

// Dark Core
DecodedPacketNpcOption.prototype.npc_388 = function(player, index, npc) { }

// Evil Bob
DecodedPacketNpcOption.prototype.npc_390 = function(player, index, npc) { }

// Evil Bob
DecodedPacketNpcOption.prototype.npc_391 = function(player, index, npc) { }

// Servant
DecodedPacketNpcOption.prototype.npc_392 = function(player, index, npc) { }

// Servant
DecodedPacketNpcOption.prototype.npc_393 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_394 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("bank", 1);
    } else if (index == 2) {
        player.getBank().open();
    }
}

// Banker
DecodedPacketNpcOption.prototype.npc_395 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("bank", 1);
    } else if (index == 2) {
        player.getBank().open();
    }
}

// Banker
DecodedPacketNpcOption.prototype.npc_396 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("bank", 1);
    } else if (index == 2) {
        player.getBank().open();
    }
}

// Banker
DecodedPacketNpcOption.prototype.npc_397 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("bank", 1);
    } else if (index == 2) {
        player.getBank().open();
    }
}

// Banker
DecodedPacketNpcOption.prototype.npc_398 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("bank", 1);
    } else if (index == 2) {
        player.getBank().open();
    }
}

// Banker
DecodedPacketNpcOption.prototype.npc_399 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("bank", 1);
    } else if (index == 2) {
        player.getBank().open();
    }
}

// Banker
DecodedPacketNpcOption.prototype.npc_400 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("bank", 1);
    } else if (index == 2) {
        player.getBank().open();
    }
}

// Turael
DecodedPacketNpcOption.prototype.npc_401 = function(player, index, npc) { }

// Mazchna
DecodedPacketNpcOption.prototype.npc_402 = function(player, index, npc) { }

// Vannaka
DecodedPacketNpcOption.prototype.npc_403 = function(player, index, npc) { }

// Chaeldar
DecodedPacketNpcOption.prototype.npc_404 = function(player, index, npc) { }

// Duradel
DecodedPacketNpcOption.prototype.npc_405 = function(player, index, npc) { }

// Fungi
DecodedPacketNpcOption.prototype.npc_471 = function(player, index, npc) { }

// Fungi
DecodedPacketNpcOption.prototype.npc_472 = function(player, index, npc) { }

// Zygomite
DecodedPacketNpcOption.prototype.npc_473 = function(player, index, npc) { }

// Zygomite
DecodedPacketNpcOption.prototype.npc_474 = function(player, index, npc) { }

// Entomologist
DecodedPacketNpcOption.prototype.npc_491 = function(player, index, npc) { }

// Whirlpool
DecodedPacketNpcOption.prototype.npc_493 = function(player, index, npc) { }

// Venenatis spiderling
DecodedPacketNpcOption.prototype.npc_495 = function(player, index, npc) { }

// Whirlpool
DecodedPacketNpcOption.prototype.npc_496 = function(player, index, npc) { }

// Callisto cub
DecodedPacketNpcOption.prototype.npc_497 = function(player, index, npc) { }

// Olivia
DecodedPacketNpcOption.prototype.npc_500 = function(player, index, npc) { }

// Sarah
DecodedPacketNpcOption.prototype.npc_501 = function(player, index, npc) {
    player.openShop("skilling");
}

// Vanessa
DecodedPacketNpcOption.prototype.npc_502 = function(player, index, npc) { }

// Richard
DecodedPacketNpcOption.prototype.npc_503 = function(player, index, npc) { }

// Alice
DecodedPacketNpcOption.prototype.npc_504 = function(player, index, npc) { }

// Bob
DecodedPacketNpcOption.prototype.npc_505 = function(player, index, npc) { }

// Shop keeper
DecodedPacketNpcOption.prototype.npc_506 = function(player, index, npc) {
    if (Main.isSpawn()) {
        player.openShop("supplies_spawn");
    } else {
        player.openShop((player.isGameModeNormal() || player.isGameModeHard()) ? "supplies" : "supplies_iron");
    }
}

// Shop assistant
DecodedPacketNpcOption.prototype.npc_507 = function(player, index, npc) { }

// Shop keeper
DecodedPacketNpcOption.prototype.npc_508 = function(player, index, npc) { }

// Shop assistant
DecodedPacketNpcOption.prototype.npc_509 = function(player, index, npc) { }

// Shop keeper
DecodedPacketNpcOption.prototype.npc_510 = function(player, index, npc) { }

// Shop assistant
DecodedPacketNpcOption.prototype.npc_511 = function(player, index, npc) { }
