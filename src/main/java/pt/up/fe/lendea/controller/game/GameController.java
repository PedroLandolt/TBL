package pt.up.fe.lendea.controller.game;

import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.model.layout.arena.Arena;

public abstract class GameController extends Controller<Arena> {
    public GameController(Arena arena) {
        super(arena);
    }
}
