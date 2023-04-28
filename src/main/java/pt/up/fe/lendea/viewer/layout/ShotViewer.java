package pt.up.fe.lendea.viewer.layout;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.layout.elements.Shot;

public class ShotViewer implements ElementViewer<Shot> {
    @Override
    public void draw(Shot shot, GUI gui) {
        gui.drawShot(shot.getPosition());
    }
}
