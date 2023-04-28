package pt.up.fe.lendea.controller.menu;

import pt.up.fe.lendea.Game;
import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.layout.arena.LoaderArenaBuilder;
import pt.up.fe.lendea.model.menu.Levels;
import pt.up.fe.lendea.model.menu.Menu;
import pt.up.fe.lendea.states.GameState;
import pt.up.fe.lendea.states.MenuState;

import java.io.IOException;

public class LevelsController extends Controller<Levels> {
    public LevelsController(Levels levels) {
        super(levels);
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
                if (getModel().isSelectedLevel1()) {
                    game.setState(new GameState(new LoaderArenaBuilder(1).createArena()));
                }
                if (getModel().isSelectedLevel2()) {
                    game.setState(new GameState(new LoaderArenaBuilder(2).createArena()));
                }
                if (getModel().isSelectedLevel3()) {
                    game.setState(new GameState(new LoaderArenaBuilder(3).createArena()));
                }
                if (getModel().isSelectedFinalLevel()) {
                    game.setState(new GameState(new LoaderArenaBuilder(4).createArena()));
                }
                if (getModel().isSelectedGoBack()) game.setState(new MenuState(new Menu()));
        }
    }
}
