package pt.up.fe.lendea.viewer.layout;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.layout.arena.Arena;
import pt.up.fe.lendea.model.layout.elements.Element;
import pt.up.fe.lendea.viewer.Viewer;

import java.util.List;

public class GameViewer extends Viewer<Arena> {
    public GameViewer(Arena arena) {
        super(arena);
    }

    @Override
    public void drawElements(GUI gui) {
        drawElements(gui, getModel().getWalls(), new WallViewer());
        drawElements(gui, getModel().getMonsters(), new MonsterViewer());
        drawElements(gui, getModel().getBosses(), new BossViewer());
        drawElements(gui, getModel().getCoins(), new CoinViewer());
        drawElement(gui, getModel().getLendea(), new LendeaViewer());
        drawElements(gui, getModel().getShots(), new ShotViewer());
        drawElements(gui, getModel().getBossShots(), new BossShotViewer());


        gui.drawText(new Position(66, 14), "HP: " + getModel().getLendea().getHealth() + " &", "#FA1616");
        gui.drawText(new Position(66, 16), "COINS: " + getModel().getLendea().getCoins() + " $", "#F6C345");
        gui.drawText(new Position(66, 39), "TIMER: " + getModel().getTimer().getSeconds(), "#FFFFFF");
    }

    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }

    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
}
