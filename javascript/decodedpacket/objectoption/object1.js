/* 256 - 511 */

// Ship's ladder
DecodedPacketObjectOption.prototype.object_272 = function(player, index, object) {
    if (object.getX() == 3018 && object.getY() == 3957) {
        player.getMovement().ladderUpTeleport(new Tile(3018, 3956, player.getHeight() + 1));
    }
}

// Ship's ladder
DecodedPacketObjectOption.prototype.object_273 = function(player, index, object) {
    if (object.getX() == 3018 && object.getY() == 3957) {
        player.getMovement().ladderDownTeleport(new Tile(3018, 3958, player.getHeight() - 1));
    }
}

// Ladder
DecodedPacketObjectOption.prototype.object_287 = function(player, index, object) { }

// Hay bales
DecodedPacketObjectOption.prototype.object_298 = function(player, index, object) { }

// Hay bales
DecodedPacketObjectOption.prototype.object_299 = function(player, index, object) { }

// Haystack
DecodedPacketObjectOption.prototype.object_300 = function(player, index, object) { }

// Hay bale
DecodedPacketObjectOption.prototype.object_304 = function(player, index, object) { }

// Potato
DecodedPacketObjectOption.prototype.object_312 = function(player, index, object) { }

// Wheat
DecodedPacketObjectOption.prototype.object_313 = function(player, index, object) { }

// Drawers
DecodedPacketObjectOption.prototype.object_348 = function(player, index, object) { }

// Drawers
DecodedPacketObjectOption.prototype.object_349 = function(player, index, object) { }

// Drawers
DecodedPacketObjectOption.prototype.object_350 = function(player, index, object) { }

// Drawers
DecodedPacketObjectOption.prototype.object_351 = function(player, index, object) { }

// Drawers
DecodedPacketObjectOption.prototype.object_352 = function(player, index, object) { }

// Drawers
DecodedPacketObjectOption.prototype.object_353 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_354 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_355 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_356 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_357 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_358 = function(player, index, object) { }

// Boxes
DecodedPacketObjectOption.prototype.object_359 = function(player, index, object) { }

// Boxes
DecodedPacketObjectOption.prototype.object_360 = function(player, index, object) { }

// Boxes
DecodedPacketObjectOption.prototype.object_361 = function(player, index, object) { }

// Sacks
DecodedPacketObjectOption.prototype.object_365 = function(player, index, object) { }

// Crate
DecodedPacketObjectOption.prototype.object_366 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_367 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_368 = function(player, index, object) { }

// Large cupboard
DecodedPacketObjectOption.prototype.object_369 = function(player, index, object) { }

// Open Cupboard
DecodedPacketObjectOption.prototype.object_370 = function(player, index, object) { }

// Cupboard
DecodedPacketObjectOption.prototype.object_371 = function(player, index, object) { }

// Large open cupboard
DecodedPacketObjectOption.prototype.object_372 = function(player, index, object) { }

// Closed chest
DecodedPacketObjectOption.prototype.object_375 = function(player, index, object) { }

// Closed chest
DecodedPacketObjectOption.prototype.object_376 = function(player, index, object) { }

// Closed chest
DecodedPacketObjectOption.prototype.object_377 = function(player, index, object) { }

// Open chest
DecodedPacketObjectOption.prototype.object_378 = function(player, index, object) { }

// Open chest
DecodedPacketObjectOption.prototype.object_379 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_380 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_381 = function(player, index, object) { }

// Wardrobe
DecodedPacketObjectOption.prototype.object_388 = function(player, index, object) { }

// Wardrobe
DecodedPacketObjectOption.prototype.object_389 = function(player, index, object) { }

// Wardrobe
DecodedPacketObjectOption.prototype.object_390 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_393 = function(player, index, object) { }

// Bookcase
DecodedPacketObjectOption.prototype.object_394 = function(player, index, object) { }

// Coffin
DecodedPacketObjectOption.prototype.object_398 = function(player, index, object) { }

// Coffin
DecodedPacketObjectOption.prototype.object_399 = function(player, index, object) { }

// Altar
DecodedPacketObjectOption.prototype.object_409 = function(player, index, object) { }

// Altar of Guthix
DecodedPacketObjectOption.prototype.object_410 = function(player, index, object) { }

// Chaos altar
DecodedPacketObjectOption.prototype.object_411 = function(player, index, object) {
    player.getPrayer().adjustPoints(player.getController().getLevelForXP(Skills.PRAYER));
    player.setAnimation(Prayer.PRAY_ANIMATION);
}

// Chaos altar
DecodedPacketObjectOption.prototype.object_412 = function(player, index, object) { }

// Coffin
DecodedPacketObjectOption.prototype.object_414 = function(player, index, object) { }

// Coffin
DecodedPacketObjectOption.prototype.object_415 = function(player, index, object) { }

// Church organ
DecodedPacketObjectOption.prototype.object_416 = function(player, index, object) { }
