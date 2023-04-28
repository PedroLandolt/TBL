package pt.up.fe.lendea.states;

import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.controller.menu.WinController;
import pt.up.fe.lendea.model.menu.Win;
import pt.up.fe.lendea.viewer.Viewer;
import pt.up.fe.lendea.viewer.menu.WinViewer;

public class WinState extends State<Win> {
    public WinState(Win win) {
        super(win);
    }

    @Override
    protected Viewer<Win> getViewer() {return new WinViewer(getModel());}

    @Override
    protected Controller<Win> getController() {
        return new WinController(getModel());
    }
}
