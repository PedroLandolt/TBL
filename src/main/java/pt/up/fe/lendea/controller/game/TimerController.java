package pt.up.fe.lendea.controller.game;

import pt.up.fe.lendea.Game;
import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.layout.arena.Arena;

public class TimerController extends GameController{

    public TimerController(Arena arena) {
        super(arena);
    }

    public void increaseTimer() {
        getModel().getTimer().increaseMilliseconds();
    }
    public void checkSeconds() {
        if(getModel().getTimer().getMilliseconds() == 23) {
            getModel().getTimer().increaseSeconds();
            getModel().getTimer().resetMilliseconds();
        }
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        checkSeconds();
        increaseTimer();
    }
}
