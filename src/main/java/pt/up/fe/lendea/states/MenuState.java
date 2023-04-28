package pt.up.fe.lendea.states;

import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.controller.menu.MenuController;
import pt.up.fe.lendea.model.menu.Menu;
import pt.up.fe.lendea.viewer.Viewer;
import pt.up.fe.lendea.viewer.menu.MenuViewer;

public class MenuState extends State<Menu> {
    public MenuState(Menu menu) {
        super(menu);
    }

    @Override
    protected Viewer<Menu> getViewer() {
        return new MenuViewer(getModel());
    }

    @Override
    protected Controller<Menu> getController() {
        return new MenuController(getModel());
    }
}
