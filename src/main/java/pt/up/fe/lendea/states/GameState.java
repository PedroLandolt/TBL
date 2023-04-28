package pt.up.fe.lendea.states;

import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.controller.game.ArenaController;
import pt.up.fe.lendea.model.layout.arena.Arena;
import pt.up.fe.lendea.viewer.Viewer;
import pt.up.fe.lendea.viewer.layout.GameViewer;

public class GameState extends State<Arena> {
    public GameState(Arena arena) {
        super(arena);
    }

    @Override
    protected Viewer<Arena> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<Arena> getController() {
        return new ArenaController(getModel());
    }
}
