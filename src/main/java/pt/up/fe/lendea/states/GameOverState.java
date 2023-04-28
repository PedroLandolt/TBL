package pt.up.fe.lendea.states;

import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.controller.menu.GameOverController;
import pt.up.fe.lendea.model.menu.GameOver;
import pt.up.fe.lendea.viewer.Viewer;
import pt.up.fe.lendea.viewer.menu.GameOverViewer;

public class GameOverState extends State<GameOver> {
    public GameOverState(GameOver gameover) {
        super(gameover);
    }

    @Override
    protected Viewer<GameOver> getViewer() {return new GameOverViewer(getModel());}

    @Override
    protected Controller<GameOver> getController() {
        return new GameOverController(getModel());
    }
}
