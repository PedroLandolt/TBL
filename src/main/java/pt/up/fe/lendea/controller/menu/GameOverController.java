package pt.up.fe.lendea.controller.menu;

import pt.up.fe.lendea.Game;
import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.menu.GameOver;
import pt.up.fe.lendea.model.menu.Menu;
import pt.up.fe.lendea.states.MenuState;

import java.io.IOException;

public class GameOverController extends Controller<GameOver> {
    public GameOverController(GameOver gameover) {
        super(gameover);
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
                if (getModel().isSelectedGoBack()) game.setState(new MenuState(new Menu()));
        }
    }
}
