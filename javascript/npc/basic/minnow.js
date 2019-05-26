var npc = null;

var moveDelay = 25;

instance = new NScript() {
    setNPC: function(n) {
        npc = n;
        if (npc.getId() == 7731) {
            moveDelay += 3;
        }
    },

    getVariable: function(name) {
        return null;
    },

    restore: function() { },

    tick: function() {
        if (moveDelay > 0) {
            moveDelay--;
        }
        if (moveDelay != 0) {
            return;
        }
        moveDelay = 25;
        npc.getMovement().clear();
        if (npc.getY() == 3443) {
            if (npc.getX() == 2609 || npc.getX() == 2617) {
                npc.getMovement().addMovement(npc.getX(), npc.getY() + 1);
            } else {
                npc.getMovement().addMovement(npc.getX() - 1, npc.getY());
            }
        } else if (npc.getY() == 3444) {
            if (npc.getX() == 2612 || npc.getX() == 2620) {
                npc.getMovement().addMovement(npc.getX(), npc.getY() - 1);
            } else {
                npc.getMovement().addMovement(npc.getX() + 1, npc.getY());
            }
        }
    }
};
