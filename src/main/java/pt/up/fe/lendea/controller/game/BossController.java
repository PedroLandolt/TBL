package pt.up.fe.lendea.controller.game;

import pt.up.fe.lendea.Game;
import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.layout.arena.Arena;
import pt.up.fe.lendea.model.layout.elements.monsters.Boss;
import pt.up.fe.lendea.model.layout.elements.monsters.BossShot;

import java.io.IOException;

public class BossController extends GameController {
    private long lastMovement;

    private boolean flag = false;

    public BossController(Arena arena) {
        super(arena);

        this.lastMovement = 0;
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (time - lastMovement > 1000) {
            for (Boss boss : getModel().getBosses()) {
                if(boss.getHealth() <= 0) {
                    getModel().removeBoss(boss);
                    flag = true;
                }
                moveBoss(boss, boss.getPosition().moveSide());
                fire(boss);
                if(flag) {flag = false; break;}
            }
            this.lastMovement = time;
        }
    }

    private void moveBoss(Boss boss, Position position) {
        if (getModel().isNotWall(position)) {
            boss.setPosition(position);
            if (getModel().getLendea().getPosition().equals(position))
                getModel().getLendea().decreaseHealth();
        }
    }

    private void fire(Boss boss) {
            getModel().updateBoss(new BossShot(boss.getPosition().getX(), boss.getPosition().getY() + 1, false, false, true, false));
    }
}
