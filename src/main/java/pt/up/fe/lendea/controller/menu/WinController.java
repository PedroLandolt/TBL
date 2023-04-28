package pt.up.fe.lendea.controller.menu;

import pt.up.fe.lendea.Game;
import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.menu.Levels;
import pt.up.fe.lendea.model.menu.Win;
import pt.up.fe.lendea.states.LevelsState;

import java.io.IOException;

public class WinController extends Controller<Win> {
    public WinController(Win win) {
        super(win);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedGoBackToLevels()) {
                    game.setState(new LevelsState(new Levels()));
                }
        }
    }
}
