package pt.up.fe.lendea.viewer.layout;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.layout.elements.Lendea;

public class LendeaViewer implements ElementViewer<Lendea> {
    @Override
    public void draw(Lendea lendea, GUI gui) {
        gui.drawLendea(lendea.getPosition());
    }
}
