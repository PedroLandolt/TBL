package pt.up.fe.lendea.viewer.layout;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.layout.elements.Shot;

public class BossShotViewer implements ElementViewer<Shot> {
    @Override
    public void draw(Shot shot, GUI gui) {
        gui.drawBossShot(shot.getPosition());
    }
}
