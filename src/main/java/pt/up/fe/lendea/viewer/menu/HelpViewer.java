package pt.up.fe.lendea.viewer.menu;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.menu.Help;
import pt.up.fe.lendea.viewer.Viewer;

public class HelpViewer extends Viewer<Help> {
    public HelpViewer(Help help) {
        super(help);
    }

    @Override
    public void drawElements(GUI gui) {
        // Title
        gui.drawText(new Position(28, 3), "##  ## ##### ##    #####", "#FFA212");
        gui.drawText(new Position(28, 4), "##  ## ##    ##    ## ##", "#FFA212");
        gui.drawText(new Position(28, 5), "###### ####  ##    #####", "#FFA212");
        gui.drawText(new Position(28, 6), "##  ## ##    ##    ##   ", "#FFA212");
        gui.drawText(new Position(28, 7), "##  ## ##### ##### ##   ", "#FFA212");

        // Commands
        gui.drawText(new Position(5, 11), "COMMANDS:", "#FFA212");
        gui.drawText(new Position(5, 14), "  WASD       - MOVE    ", "#FFFFFF");
        gui.drawText(new Position(5, 15), "  ARROW KEYS - SHOOT   ", "#FFFFFF");
        gui.drawText(new Position(5, 16), "  Q          - GIVE UP ", "#FFFFFF");



        gui.drawText(new Position(40, 10), "|", "#FFFFFF");
        gui.drawText(new Position(40, 11), "|", "#FFFFFF");
        gui.drawText(new Position(40, 12), "|", "#FFFFFF");
        gui.drawText(new Position(40, 13), "|", "#FFFFFF");
        gui.drawText(new Position(40, 14), "|", "#FFFFFF");
        gui.drawText(new Position(40, 15), "|", "#FFFFFF");
        gui.drawText(new Position(40, 16), "|", "#FFFFFF");
        gui.drawText(new Position(40, 17), "|", "#FFFFFF");

        // Elements
        gui.drawText(new Position(43, 11), "ELEMENTS:", "#FFA212");
        gui.drawText(new Position(43, 14), "  PLAYER  - *      | SHOTS - { / }", "#FFFFFF");
        gui.drawText(new Position(43, 15), "  ENEMIES - @      | WALLS - #", "#FFFFFF");
        gui.drawText(new Position(43, 16), "  COIN    - $      | BOSS  - [", "#FFFFFF");



        gui.drawText(new Position(5, 18), "________________________________________________________________________", "#FFFFFF");

        // Info
        gui.drawText(new Position(5, 21), "INFO:", "#FFA212");
        gui.drawText(new Position(5, 24), "YOU ARE A LENDEA, A MYTHICAL CREATURE", "#FFFFFF");
        gui.drawText(new Position(5, 25), "THAT RIDES A PAO DE FORMA", "#FFFFFF");
        gui.drawText(new Position(5, 26), "AND SHOOTS BREAD TO DEFEND ITSELF", "#FFFFFF");
        gui.drawText(new Position(5, 27), "FROM THE EVIL FORCES OF THE WORLD.", "#FFFFFF");
        gui.drawText(new Position(5, 28), "YOU MUST SLAY EVERY ENEMY", "#FFFFFF");
        gui.drawText(new Position(5, 29), "DON'T FORGET TO FILL YOUR POCKETS ALONG THE WAY!", "#FFFFFF");
        gui.drawText(new Position(5, 30), "DEFEAT THE EVIL TOASTER TO FINISH YOUR QUEST,", "#FFFFFF");
        gui.drawText(new Position(5, 31), "AND CLAIM YOUR PRIZE!", "#FFFFFF");
        gui.drawText(new Position(5, 33), "GOOD LUCK LENDEA, YOU WILL NEED IT!", "#FFFFFF");


        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(55, 40 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
    }
}
