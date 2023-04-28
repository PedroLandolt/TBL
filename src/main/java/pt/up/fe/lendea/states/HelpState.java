package pt.up.fe.lendea.states;

import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.controller.menu.HelpController;
import pt.up.fe.lendea.model.menu.Help;
import pt.up.fe.lendea.viewer.Viewer;
import pt.up.fe.lendea.viewer.menu.HelpViewer;

public class HelpState extends State<Help> {
    public HelpState(Help help) {
        super(help);
    }

    @Override
    protected Viewer<Help> getViewer() {return new HelpViewer(getModel());}

    @Override
    protected Controller<Help> getController() {
        return new HelpController(getModel());
    }
}
