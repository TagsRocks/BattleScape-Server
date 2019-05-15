/* 5376 - 5631 */

// Greasycheeks
DecodedPacketNpcOption.prototype.npc_5378 = function(player, index, npc) { }

// Smellytoes
DecodedPacketNpcOption.prototype.npc_5379 = function(player, index, npc) { }

// Creakyknees
DecodedPacketNpcOption.prototype.npc_5380 = function(player, index, npc) { }

// Clothears
DecodedPacketNpcOption.prototype.npc_5381 = function(player, index, npc) { }

// Guard Captain
DecodedPacketNpcOption.prototype.npc_5383 = function(player, index, npc) { }

// Sandy
DecodedPacketNpcOption.prototype.npc_5384 = function(player, index, npc) { }

// Mazion
DecodedPacketNpcOption.prototype.npc_5386 = function(player, index, npc) { }

// Blaec
DecodedPacketNpcOption.prototype.npc_5387 = function(player, index, npc) { }

// Reeso
DecodedPacketNpcOption.prototype.npc_5388 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5389 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5390 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5391 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5392 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5393 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5394 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5395 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5396 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5397 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5398 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5399 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5400 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5401 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5402 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5403 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5404 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5405 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5406 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5407 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5408 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5409 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5410 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5412 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5413 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5414 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5415 = function(player, index, npc) { }

// Combat stone
DecodedPacketNpcOption.prototype.npc_5416 = function(player, index, npc) { }

// Chief servant
DecodedPacketNpcOption.prototype.npc_5417 = function(player, index, npc) { }

// Taxidermist
DecodedPacketNpcOption.prototype.npc_5418 = function(player, index, npc) { }

// Estate agent
DecodedPacketNpcOption.prototype.npc_5419 = function(player, index, npc) { }

// Stonemason
DecodedPacketNpcOption.prototype.npc_5420 = function(player, index, npc) { }

// Sir Renitee
DecodedPacketNpcOption.prototype.npc_5421 = function(player, index, npc) { }

// Sawmill operator
DecodedPacketNpcOption.prototype.npc_5422 = function(player, index, npc) { }

// Garden supplier
DecodedPacketNpcOption.prototype.npc_5423 = function(player, index, npc) { }

// null
DecodedPacketNpcOption.prototype.npc_5424 = function(player, index, npc) { }

// Capt' Arnav
DecodedPacketNpcOption.prototype.npc_5426 = function(player, index, npc) { }

// Flippa
DecodedPacketNpcOption.prototype.npc_5427 = function(player, index, npc) { }

// Tilt
DecodedPacketNpcOption.prototype.npc_5428 = function(player, index, npc) { }

// Frog
DecodedPacketNpcOption.prototype.npc_5429 = function(player, index, npc) { }

// Frog
DecodedPacketNpcOption.prototype.npc_5430 = function(player, index, npc) { }

// Frog
DecodedPacketNpcOption.prototype.npc_5431 = function(player, index, npc) { }

// Frog
DecodedPacketNpcOption.prototype.npc_5432 = function(player, index, npc) { }

// Caleb
DecodedPacketNpcOption.prototype.npc_5433 = function(player, index, npc) { }

// Niles
DecodedPacketNpcOption.prototype.npc_5436 = function(player, index, npc) { }

// Miles
DecodedPacketNpcOption.prototype.npc_5437 = function(player, index, npc) {
    for (var i = 0; i < player.getInventory().size(); i++) {
        var itemID = player.getInventory().getID(i);
        var notedID = ItemDef.getNotedID(itemID);
        if (itemID == -1 || notedID == -1 || ItemDef.getNoted(itemID) || ItemDef.getStackable(itemID)) {
            continue;
        }
        player.getInventory().deleteItem(itemID, 1, i);
        player.getInventory().addItem(notedID, 1, i);
    }
}

// Giles
DecodedPacketNpcOption.prototype.npc_5438 = function(player, index, npc) { }

// Niles
DecodedPacketNpcOption.prototype.npc_5439 = function(player, index, npc) { }

// Miles
DecodedPacketNpcOption.prototype.npc_5440 = function(player, index, npc) { }

// Giles
DecodedPacketNpcOption.prototype.npc_5441 = function(player, index, npc) { }

// Security Guard
DecodedPacketNpcOption.prototype.npc_5442 = function(player, index, npc) {
    player.getInventory().addOrDropItem(9003, 1);
}

// Johnathon
DecodedPacketNpcOption.prototype.npc_5443 = function(player, index, npc) { }

// Cap'n Hand
DecodedPacketNpcOption.prototype.npc_5444 = function(player, index, npc) { }

// Johnathon
DecodedPacketNpcOption.prototype.npc_5445 = function(player, index, npc) { }

// Advisor Ghrim
DecodedPacketNpcOption.prototype.npc_5447 = function(player, index, npc) { }

// Advisor Ghrim
DecodedPacketNpcOption.prototype.npc_5448 = function(player, index, npc) { }

// Bob Barter (herbs)
DecodedPacketNpcOption.prototype.npc_5449 = function(player, index, npc) {
    if (index == 0) {
        player.openDialogue("bobbarter", 0);
    } else if (index == 2) {
        player.openShop("herb_exchange");
    } else if (index == 3) {
        player.getSkills().decantAllPotions();
    }
}

// Murky Matt (runes)
DecodedPacketNpcOption.prototype.npc_5450 = function(player, index, npc) { }

// Relobo Blinyo (logs)
DecodedPacketNpcOption.prototype.npc_5451 = function(player, index, npc) { }

// Hofuthand (weapons and armour)
DecodedPacketNpcOption.prototype.npc_5452 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_5453 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_5454 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_5455 = function(player, index, npc) { }

// Banker
DecodedPacketNpcOption.prototype.npc_5456 = function(player, index, npc) { }

// Druid
DecodedPacketNpcOption.prototype.npc_5457 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_5464 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_5465 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_5467 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_5468 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_5469 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_5470 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_5471 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_5474 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_5476 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_5478 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_5480 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_5482 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_5483 = function(player, index, npc) { }

// Suspect
DecodedPacketNpcOption.prototype.npc_5484 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_5485 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_5486 = function(player, index, npc) { }

// Molly
DecodedPacketNpcOption.prototype.npc_5487 = function(player, index, npc) { }

// Balloon Animal
DecodedPacketNpcOption.prototype.npc_5488 = function(player, index, npc) { }

// Balloon Animal
DecodedPacketNpcOption.prototype.npc_5489 = function(player, index, npc) { }

// Balloon Animal
DecodedPacketNpcOption.prototype.npc_5491 = function(player, index, npc) { }

// Balloon Animal
DecodedPacketNpcOption.prototype.npc_5492 = function(player, index, npc) { }

// Balloon Animal
DecodedPacketNpcOption.prototype.npc_5493 = function(player, index, npc) { }

// Mr. Mordaut
DecodedPacketNpcOption.prototype.npc_5504 = function(player, index, npc) { }

// Sandwich lady
DecodedPacketNpcOption.prototype.npc_5510 = function(player, index, npc) { }

// Guard Recruiter
DecodedPacketNpcOption.prototype.npc_5511 = function(player, index, npc) { }

// Gardener
DecodedPacketNpcOption.prototype.npc_5512 = function(player, index, npc) { }

// Elite Void Knight
DecodedPacketNpcOption.prototype.npc_5513 = function(player, index, npc) { }

// Lesser Fanatic
DecodedPacketNpcOption.prototype.npc_5514 = function(player, index, npc) { }

// TzHaar-Mej
DecodedPacketNpcOption.prototype.npc_5516 = function(player, index, npc) { }

// The 'Wedge'
DecodedPacketNpcOption.prototype.npc_5517 = function(player, index, npc) { }

// Elder Gnome child
DecodedPacketNpcOption.prototype.npc_5518 = function(player, index, npc) { }

// Two-pints
DecodedPacketNpcOption.prototype.npc_5519 = function(player, index, npc) { }

// Jarr
DecodedPacketNpcOption.prototype.npc_5520 = function(player, index, npc) { }

// Le-sabr￨
DecodedPacketNpcOption.prototype.npc_5521 = function(player, index, npc) { }

// Flax keeper
DecodedPacketNpcOption.prototype.npc_5522 = function(player, index, npc) { }

// Hatius Cosaintus
DecodedPacketNpcOption.prototype.npc_5523 = function(player, index, npc) { }

// Sir Rebral
DecodedPacketNpcOption.prototype.npc_5524 = function(player, index, npc) { }

// Toby
DecodedPacketNpcOption.prototype.npc_5525 = function(player, index, npc) { }

// Thorodin
DecodedPacketNpcOption.prototype.npc_5526 = function(player, index, npc) { }

// Twiggy O'Korn
DecodedPacketNpcOption.prototype.npc_5527 = function(player, index, npc) {
    player.openShop("diaries");
}

// Hunting expert
DecodedPacketNpcOption.prototype.npc_5529 = function(player, index, npc) { }

// Spotted kebbit
DecodedPacketNpcOption.prototype.npc_5531 = function(player, index, npc) { }

// Dark kebbit
DecodedPacketNpcOption.prototype.npc_5532 = function(player, index, npc) { }

// Dashing kebbit
DecodedPacketNpcOption.prototype.npc_5533 = function(player, index, npc) { }

// Whirlpool
DecodedPacketNpcOption.prototype.npc_5534 = function(player, index, npc) { }

// Vet'ion Jr.
DecodedPacketNpcOption.prototype.npc_5536 = function(player, index, npc) { }

// Vet'ion Jr.
DecodedPacketNpcOption.prototype.npc_5537 = function(player, index, npc) { }

// Jack
DecodedPacketNpcOption.prototype.npc_5544 = function(player, index, npc) { }

// Jill
DecodedPacketNpcOption.prototype.npc_5545 = function(player, index, npc) { }

// Jeff
DecodedPacketNpcOption.prototype.npc_5546 = function(player, index, npc) { }

// Scorpia's offspring
DecodedPacketNpcOption.prototype.npc_5547 = function(player, index, npc) { }

// Tropical wagtail
DecodedPacketNpcOption.prototype.npc_5548 = function(player, index, npc) { }

// Crimson swift
DecodedPacketNpcOption.prototype.npc_5549 = function(player, index, npc) { }

// Cerulean twitch
DecodedPacketNpcOption.prototype.npc_5550 = function(player, index, npc) { }

// Golden warbler
DecodedPacketNpcOption.prototype.npc_5551 = function(player, index, npc) { }

// Copper longtail
DecodedPacketNpcOption.prototype.npc_5552 = function(player, index, npc) { }

// Black warlock
DecodedPacketNpcOption.prototype.npc_5553 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Snowy knight
DecodedPacketNpcOption.prototype.npc_5554 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Sapphire glacialis
DecodedPacketNpcOption.prototype.npc_5555 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Ruby harvest
DecodedPacketNpcOption.prototype.npc_5556 = function(player, index, npc) {
    player.getHunter().catchNPC(npc);
}

// Venenatis spiderling
DecodedPacketNpcOption.prototype.npc_5557 = function(player, index, npc) { }

// Callisto cub
DecodedPacketNpcOption.prototype.npc_5558 = function(player, index, npc) { }

// Vet'ion Jr.
DecodedPacketNpcOption.prototype.npc_5559 = function(player, index, npc) { }

// Vet'ion Jr.
DecodedPacketNpcOption.prototype.npc_5560 = function(player, index, npc) { }

// Scorpia's offspring
DecodedPacketNpcOption.prototype.npc_5561 = function(player, index, npc) { }

// Mercy
DecodedPacketNpcOption.prototype.npc_5562 = function(player, index, npc) { }

// Zombie
DecodedPacketNpcOption.prototype.npc_5568 = function(player, index, npc) { }

// Most of a Zombie
DecodedPacketNpcOption.prototype.npc_5569 = function(player, index, npc) { }

// Most of a Zombie
DecodedPacketNpcOption.prototype.npc_5570 = function(player, index, npc) { }

// Zombie
DecodedPacketNpcOption.prototype.npc_5571 = function(player, index, npc) { }

// Most of a Zombie
DecodedPacketNpcOption.prototype.npc_5572 = function(player, index, npc) { }

// Zombie Head
DecodedPacketNpcOption.prototype.npc_5573 = function(player, index, npc) { }

// Zombie
DecodedPacketNpcOption.prototype.npc_5574 = function(player, index, npc) { }

// Half-Zombie
DecodedPacketNpcOption.prototype.npc_5575 = function(player, index, npc) { }

// Other Half-Zombie
DecodedPacketNpcOption.prototype.npc_5576 = function(player, index, npc) { }

// Child
DecodedPacketNpcOption.prototype.npc_5577 = function(player, index, npc) { }

// Child
DecodedPacketNpcOption.prototype.npc_5578 = function(player, index, npc) { }

// Child
DecodedPacketNpcOption.prototype.npc_5579 = function(player, index, npc) { }

// Child
DecodedPacketNpcOption.prototype.npc_5580 = function(player, index, npc) { }

// Child
DecodedPacketNpcOption.prototype.npc_5581 = function(player, index, npc) { }

// Child
DecodedPacketNpcOption.prototype.npc_5582 = function(player, index, npc) { }

// Wily cat
DecodedPacketNpcOption.prototype.npc_5584 = function(player, index, npc) { }

// Wily cat
DecodedPacketNpcOption.prototype.npc_5585 = function(player, index, npc) { }

// Wily cat
DecodedPacketNpcOption.prototype.npc_5586 = function(player, index, npc) { }

// Wily cat
DecodedPacketNpcOption.prototype.npc_5587 = function(player, index, npc) { }

// Wily cat
DecodedPacketNpcOption.prototype.npc_5588 = function(player, index, npc) { }

// Wily cat
DecodedPacketNpcOption.prototype.npc_5589 = function(player, index, npc) { }

// Wily hellcat
DecodedPacketNpcOption.prototype.npc_5590 = function(player, index, npc) { }

// Kitten
DecodedPacketNpcOption.prototype.npc_5591 = function(player, index, npc) { }

// Kitten
DecodedPacketNpcOption.prototype.npc_5592 = function(player, index, npc) { }

// Kitten
DecodedPacketNpcOption.prototype.npc_5593 = function(player, index, npc) { }

// Kitten
DecodedPacketNpcOption.prototype.npc_5594 = function(player, index, npc) { }

// Kitten
DecodedPacketNpcOption.prototype.npc_5595 = function(player, index, npc) { }

// Kitten
DecodedPacketNpcOption.prototype.npc_5596 = function(player, index, npc) { }

// Hell-kitten
DecodedPacketNpcOption.prototype.npc_5597 = function(player, index, npc) { }

// Overgrown cat
DecodedPacketNpcOption.prototype.npc_5598 = function(player, index, npc) { }

// Overgrown cat
DecodedPacketNpcOption.prototype.npc_5599 = function(player, index, npc) { }

// Overgrown cat
DecodedPacketNpcOption.prototype.npc_5600 = function(player, index, npc) { }

// Overgrown cat
DecodedPacketNpcOption.prototype.npc_5601 = function(player, index, npc) { }

// Overgrown cat
DecodedPacketNpcOption.prototype.npc_5602 = function(player, index, npc) { }

// Overgrown cat
DecodedPacketNpcOption.prototype.npc_5603 = function(player, index, npc) { }

// Overgrown hellcat
DecodedPacketNpcOption.prototype.npc_5604 = function(player, index, npc) { }

// Murphy
DecodedPacketNpcOption.prototype.npc_5607 = function(player, index, npc) { }

// Murphy
DecodedPacketNpcOption.prototype.npc_5608 = function(player, index, npc) { }

// Murphy
DecodedPacketNpcOption.prototype.npc_5609 = function(player, index, npc) { }

// Murphy
DecodedPacketNpcOption.prototype.npc_5610 = function(player, index, npc) { }

// Sam
DecodedPacketNpcOption.prototype.npc_5613 = function(player, index, npc) { }

// Rachael
DecodedPacketNpcOption.prototype.npc_5614 = function(player, index, npc) { }

// Swamp snake
DecodedPacketNpcOption.prototype.npc_5618 = function(player, index, npc) { }
