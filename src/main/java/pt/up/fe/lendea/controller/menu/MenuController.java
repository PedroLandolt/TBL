package pt.up.fe.lendea.controller.menu;

import pt.up.fe.lendea.Game;
import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.menu.Help;
import pt.up.fe.lendea.model.menu.Levels;
import pt.up.fe.lendea.model.menu.Menu;
import pt.up.fe.lendea.states.HelpState;
import pt.up.fe.lendea.states.LevelsState;

import java.io.IOException;

public class MenuController extends Controller<Menu> {
    public MenuController(Menu menu) {
        super(menu);
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
                if (getModel().isSelectedExit()) game.setState(null);
                if (getModel().isSelectedHelp()) game.setState(new HelpState(new Help()));
                if (getModel().isSelectedPlay()) game.setState(new LevelsState(new Levels()));
        }
    }
}
