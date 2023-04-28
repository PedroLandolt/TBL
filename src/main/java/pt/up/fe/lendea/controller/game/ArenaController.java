package pt.up.fe.lendea.controller.game;

import pt.up.fe.lendea.Game;
import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.menu.GameOver;
import pt.up.fe.lendea.model.layout.arena.Arena;
import pt.up.fe.lendea.model.menu.Win;
import pt.up.fe.lendea.states.GameOverState;
import pt.up.fe.lendea.states.WinState;

import java.io.IOException;

public class ArenaController extends GameController {
    private final LendeaController lendeaController;
    private final TimerController timerController;
    private final MonsterController monsterController;
    private final BossController bossController;
    private final ShotController shotController;

    public ArenaController(Arena arena) {
        super(arena);

        this.lendeaController = new LendeaController(arena);
        this.monsterController = new MonsterController(arena);
        this.bossController = new BossController(arena);
        this.shotController = new ShotController(arena);
        this.timerController = new TimerController(arena);
    }

    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT || getModel().getLendea().getHealth() == 0)
            game.setState(new GameOverState(new GameOver()));
        if (getModel().getLendea().getWin()) {
            game.setState(new WinState(new Win()));
        }
        else {
            lendeaController.step(game, action, time);
            monsterController.step(game, action, time);
            bossController.step(game, action, time);
            shotController.step(game, action, time);
            timerController.step(game, action, time);
        }
    }
}
