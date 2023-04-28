package pt.up.fe.lendea.states;

import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.controller.menu.LevelsController;
import pt.up.fe.lendea.model.menu.Levels;
import pt.up.fe.lendea.viewer.Viewer;
import pt.up.fe.lendea.viewer.menu.LevelsViewer;

public class LevelsState extends State<Levels> {
    public LevelsState(Levels menu) {
        super(menu);
    }

    @Override
    protected Viewer<Levels> getViewer() {
        return new LevelsViewer(getModel());
    }

    @Override
    protected Controller<Levels> getController() {
        return new LevelsController(getModel());
    }
}
