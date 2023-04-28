package pt.up.fe.lendea.viewer.menu;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.menu.Levels;
import pt.up.fe.lendea.viewer.Viewer;

public class LevelsViewer extends Viewer<Levels> {
    public LevelsViewer(Levels levels) {
        super(levels);
    }

    @Override
    public void drawElements(GUI gui) {

        //Levels
        gui.drawText(new Position(45, 3), "#   ### #   # ### #    ### ", "#FFA212");
        gui.drawText(new Position(45, 4), "#   #   #   # #   #   #     #", "#FFA212");
        gui.drawText(new Position(45, 5), "#   ##   # #  ##  #    ##  ", "#FFA212");
        gui.drawText(new Position(45, 6), "#   #    # #  #   #      #  #", "#FFA212");
        gui.drawText(new Position(45, 7), "### ###   #   ### ### ###  ", "#FFA212");
        gui.drawText(new Position(45, 8), "__________________________", "#FFA212");

        //Pão de forma
        gui.drawText(new Position(2, 17), "           ###############           ", "#FFC96A");
        gui.drawText(new Position(2, 18), "    #######               #######    ", "#FFC96A");
        gui.drawText(new Position(2, 19), "  ##                             ##  ", "#FFC96A");
        gui.drawText(new Position(2, 20), " #                                 # ", "#FFC96A");
        gui.drawText(new Position(2, 21), "#          ##           ##          #", "#FFC96A");
        gui.drawText(new Position(2, 22), "#         ####         ####         #", "#FFC96A");
        gui.drawText(new Position(2, 23), "#         ## #         ## #         #", "#FFC96A");
        gui.drawText(new Position(2, 24), "#         ## #         ## #         #", "#FFC96A");
        gui.drawText(new Position(2, 25), "#          ##           ##          #", "#FFC96A");
        gui.drawText(new Position(2, 26), "#                                   #", "#FFC96A");
        gui.drawText(new Position(2, 27), " #                                 # ", "#FFC96A");
        gui.drawText(new Position(2, 28), "  #                               #  ", "#FFC96A");
        gui.drawText(new Position(2, 29), "   ###   ##               ##   ###   ", "#FFC96A");
        gui.drawText(new Position(2, 30), "      # #  #             #  # #      ", "#FFC96A");
        gui.drawText(new Position(2, 31), "      # ##     ### ###     ## #      ", "#FFC96A");
        gui.drawText(new Position(2, 32), "      #  ### ##### ##### ###  #      ", "#FFC96A");
        gui.drawText(new Position(2, 33), "      #   #######   #######   #      ", "#FFC96A");
        gui.drawText(new Position(2, 34), "      #                       #      ", "#FFC96A");
        gui.drawText(new Position(2, 35), "      #                       #      ", "#FFC96A");
        gui.drawText(new Position(2, 36), "      #                       #      ", "#FFC96A");
        gui.drawText(new Position(2, 37), "      #                       #      ", "#FFC96A");
        gui.drawText(new Position(2, 38), "      #########################      ", "#FFC96A");


        for (int i = 0; i < getModel().getNumberEntries() - 1; i++) {
            gui.drawText(
                    new Position(66, 31 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
        }
        int lastEntry = getModel().getNumberEntries() - 1;
        gui.drawText( new Position(66, 31 + lastEntry + 4),
        getModel().getEntry(lastEntry),
        getModel().isSelected(lastEntry) ? "#FFA212" : "#FFFFFF");
    }
}
