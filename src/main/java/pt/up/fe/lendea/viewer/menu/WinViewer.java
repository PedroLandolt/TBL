package pt.up.fe.lendea.viewer.menu;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.menu.Win;
import pt.up.fe.lendea.viewer.Viewer;

public class WinViewer extends Viewer<Win> {
    public WinViewer(Win gameover) {
        super(gameover);
    }

    @Override
    public void drawElements(GUI gui) {

        gui.drawText(new Position(2, 8), "#####                             #      ####        ####                  #" , "#FFA212");
        gui.drawText(new Position(2, 9), " ###                             ##      ####        ####                 ##" , "#FFA212");
        gui.drawText(new Position(2, 10), " ##        ###  ##  ###   ###   ##        ##          ##   ####    #####  ##" , "#FFA212");
        gui.drawText(new Position(2, 11), " ##      ###### ## ###  ######  ##        ##    ##    ##  ######  ######  ##" , "#FFA212");
        gui.drawText(new Position(2, 12), " ##      ##  ## ## ##   ##  ##  ##        ###   ##   ###  ### ##  ### ## ## " , "#FFA212");
        gui.drawText(new Position(2, 13), " ##      ###### #####   ######  ##        ###  ####  ###  ##  ##  ##  ## ## " , "#FFA212");
        gui.drawText(new Position(2, 14), " ###     ###    ####    ###     ##         ### #### ###   ## ###  ##  ##    " , "#FFA212");
        gui.drawText(new Position(2, 15), " ######  #####  ####    #####  ###         ############   ###### ### ### ## " , "#FFA212");
        gui.drawText(new Position(2, 16), "########  ####  ###      ####  ###          ####  ####     ####  ### ### ## " , "#FFA212");

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(19, 35 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
    }
}
