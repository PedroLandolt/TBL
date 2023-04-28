package pt.up.fe.lendea.viewer.menu;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.menu.GameOver;
import pt.up.fe.lendea.viewer.Viewer;

public class GameOverViewer extends Viewer<GameOver> {
    public GameOverViewer(GameOver gameover) {
        super(gameover);
    }

    @Override
    public void drawElements(GUI gui) {


        // Game Over Screen Text
        gui.drawText(new Position(3, 8), "  ####                                      ####                            " , "#FFA212");
        gui.drawText(new Position(3, 9), " #######                                   #######                          " , "#FFA212");
        gui.drawText(new Position(3, 10), "####      ######    ##### ###    ###      ###  ###  ##  ###   ###    ####   " , "#FFA212");
        gui.drawText(new Position(3, 11), "###      ######    ##########  ######     ###   ##  ## ###  ######  ######  " , "#FFA212");
        gui.drawText(new Position(3, 12), "##  ###  ### ##    ### ### ##  ##  ##     ##    ##  ## ##   ##  ##  ###     " , "#FFA212");
        gui.drawText(new Position(3, 13), "## ####  ##  ##    ##  ##  ##  ######     ##   ###  #####   ######  ##      " , "#FFA212");
        gui.drawText(new Position(3, 14), "##   ##  ## ###    ##  ##  ##  ###        ### ###   ####    ###     ##      " , "#FFA212");
        gui.drawText(new Position(3, 15), "#######  #######  ### ### ###  #####      #######   ####    #####  ###      " , "#FFA212");
        gui.drawText(new Position(3, 16), " #####   ##### ## ### ### ###   ####       ####     ###      ####  ###      " , "#FFA212");



        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(27, 35 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
    }
}
