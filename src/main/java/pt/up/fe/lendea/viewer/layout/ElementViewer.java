package pt.up.fe.lendea.viewer.layout;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.layout.elements.Element;

public interface ElementViewer<T extends Element> {
    void draw(T element, GUI gui);
}
