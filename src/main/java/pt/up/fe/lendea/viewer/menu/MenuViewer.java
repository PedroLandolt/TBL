package pt.up.fe.lendea.viewer.menu;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.menu.Menu;
import pt.up.fe.lendea.viewer.Viewer;

public class MenuViewer extends Viewer<Menu> {
    public MenuViewer(Menu menu) {
        super(menu);
    }

    @Override
    public void drawElements(GUI gui) {


        //Title

        //The
        gui.drawText(new Position(3, 14), "### # # ###", "#FFA212");
        gui.drawText(new Position(3, 15), " #  # # #", "#FFA212");
        gui.drawText(new Position(3, 16), " #  ### ##", "#FFA212");
        gui.drawText(new Position(3, 17), " #  # # #", "#FFA212");
        gui.drawText(new Position(3, 18), " #  # # ###", "#FFA212");

        //Binding
        gui.drawText(new Position(3, 21), "##  # #   # ##  # #   #  ##  ", "#FFA212");
        gui.drawText(new Position(3, 22), "# # # ##  # # # # ##  # #    ", "#FFA212");
        gui.drawText(new Position(3, 23), "##  # # # # # # # # # # # ###", "#FFA212");
        gui.drawText(new Position(3, 24), "# # # #  ## # # # #  ## #  # ", "#FFA212");
        gui.drawText(new Position(3, 25), "##  # #   # ##  # #   #  ##  ", "#FFA212");

        //Of
        gui.drawText(new Position(3, 28), "### ###", "#FFA212");
        gui.drawText(new Position(3, 29), "# # #  ", "#FFA212");
        gui.drawText(new Position(3, 30), "# # ## ", "#FFA212");
        gui.drawText(new Position(3, 31), "# # #  ", "#FFA212");
        gui.drawText(new Position(3, 32), "### #  ", "#FFA212");

        //Lendea
        gui.drawText(new Position(3, 35), "#   ### #   # ##  ### ###", "#FFA212");
        gui.drawText(new Position(3, 36), "#   #   ##  # # # #   # #", "#FFA212");
        gui.drawText(new Position(3, 37), "#   ##  # # # # # ##  ###", "#FFA212");
        gui.drawText(new Position(3, 38), "#   #   #  ## # # #   # #", "#FFA212");
        gui.drawText(new Position(3, 39), "### ### #   # ##  ### # #", "#FFA212");







        //Pão de forma
        gui.drawText(new Position(40, 3),  "           ###############           ", "#FFC96A");
        gui.drawText(new Position(40, 4),  "    #######               #######    ", "#FFC96A");
        gui.drawText(new Position(40, 5),  "  ##                             ##  ", "#FFC96A");
        gui.drawText(new Position(40, 6),  " #                                 # ", "#FFC96A");
        gui.drawText(new Position(40, 7),  "#          ##           ##          #", "#FFC96A");
        gui.drawText(new Position(40, 8),  "#         ####         ####         #", "#FFC96A");
        gui.drawText(new Position(40, 9),  "#         # ##         # ##         #", "#FFC96A");
        gui.drawText(new Position(40, 10), "#         # ##         # ##         #", "#FFC96A");
        gui.drawText(new Position(40, 11), "#          ##           ##          #", "#FFC96A");
        gui.drawText(new Position(40, 12), "#                                   #", "#FFC96A");
        gui.drawText(new Position(40, 13), " #                                 # ", "#FFC96A");
        gui.drawText(new Position(40, 14), "  #                               #  ", "#FFC96A");
        gui.drawText(new Position(40, 15), "   ###   ##               ##   ###   ", "#FFC96A");
        gui.drawText(new Position(40, 16), "      # #  #             #  # #      ", "#FFC96A");
        gui.drawText(new Position(40, 17), "      # ##     ### ###     ## #      ", "#FFC96A");
        gui.drawText(new Position(40, 18), "      #  ### ##### ##### ###  #      ", "#FFC96A");
        gui.drawText(new Position(40, 19), "      #   #######   #######   #      ", "#FFC96A");
        gui.drawText(new Position(40, 20), "      #                       #      ", "#FFC96A");
        gui.drawText(new Position(40, 21), "      #                       #      ", "#FFC96A");
        gui.drawText(new Position(40, 22), "      #                       #      ", "#FFC96A");
        gui.drawText(new Position(40, 23), "      #                       #      ", "#FFC96A");
        gui.drawText(new Position(40, 24), "      #########################      ", "#FFC96A");


        //Menu
        for (int i = 0; i < getModel().getNumberEntries()-1; i++) {
            gui.drawText(
                    new Position(72, 33 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
        }
        int lastEntry = getModel().getNumberEntries() - 1;
        gui.drawText( new Position(72, 33 + lastEntry + 4),
                getModel().getEntry(lastEntry),
                getModel().isSelected(lastEntry) ? "#FFA212" : "#FFFFFF");
    }
}
