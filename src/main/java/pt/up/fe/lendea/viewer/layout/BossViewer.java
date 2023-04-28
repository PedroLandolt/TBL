package pt.up.fe.lendea.viewer.layout;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.layout.elements.monsters.Boss;

public class BossViewer implements ElementViewer<Boss> {
    @Override
    public void draw(Boss boss, GUI gui) {
        gui.drawBoss(boss.getPosition());
    }
}
