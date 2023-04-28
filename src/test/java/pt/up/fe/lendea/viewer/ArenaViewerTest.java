package pt.up.fe.lendea.viewer;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.layout.arena.Arena;
import pt.up.fe.lendea.model.layout.elements.monsters.Boss;
import pt.up.fe.lendea.viewer.layout.GameViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pt.up.fe.lendea.model.layout.elements.*;

import java.io.IOException;
import java.util.Arrays;

class ArenaViewerTest {
    private GUI gui;
    private GameViewer viewer;
    private Arena arena;

    // Cria um novo ambiente para cada teste
    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10);
        gui = Mockito.mock(GUI.class);
        viewer = new GameViewer(arena);

        arena.setWalls(Arrays.asList(new Wall(1, 2), new Wall(2, 3), new Wall(3, 4)));
        arena.setMonsters(Arrays.asList(new Monster(4, 5), new Monster(5, 6)));
        arena.setBosses(Arrays.asList(new Boss(6, 5), new Boss(6, 4)));
        arena.setLendea(new Lendea(5, 8));
        arena.setExit(new Exit(10, 9));
        arena.setCoins(Arrays.asList(new Coin(6, 7), new Coin(9, 8)));
        arena.setShots(Arrays.asList());
        arena.setBossShots(Arrays.asList());
        arena.setTimer(new Timer());
    }

    // Testa se o ArenaViewer consegue desenhar as Walls
    @Test
    void drawWalls() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).drawWall(new Position(1, 2));
        Mockito.verify(gui, Mockito.times(1)).drawWall(new Position(2, 3));
        Mockito.verify(gui, Mockito.times(1)).drawWall(new Position(3, 4));
        Mockito.verify(gui, Mockito.times(3)).drawWall(Mockito.any(Position.class));
    }

    // Testa se o ArenaViewer consegue desenhar os Monsters
    @Test
    void drawMonsters() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).drawMonster(new Position(4, 5));
        Mockito.verify(gui, Mockito.times(1)).drawMonster(new Position(5, 6));
        Mockito.verify(gui, Mockito.times(2)).drawMonster(Mockito.any(Position.class));
    }

    // Testa se o ArenaViewer consegue desenhar os Bosses
    @Test
    void drawBosses() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).drawBoss(new Position(6, 5));
        Mockito.verify(gui, Mockito.times(1)).drawBoss(new Position(6, 4));
        Mockito.verify(gui, Mockito.times(2)).drawBoss(Mockito.any(Position.class));
    }

    // Testa se o ArenaViewer consegue desenhar as Coins
    @Test
    void drawCoins() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).drawCoin(new Position(6, 7));
        Mockito.verify(gui, Mockito.times(1)).drawCoin(new Position(9, 8));
        Mockito.verify(gui, Mockito.times(2)).drawCoin(Mockito.any(Position.class));
    }

    // Testa se o ArenaViewer consegue desenhar o Lendea
    @Test
    void drawLendea() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).drawLendea(new Position(5, 8));
        Mockito.verify(gui, Mockito.times(1)).drawLendea(Mockito.any(Position.class));
    }

    // Testa se o ArenaViewer consegue desenhar a Exit
    @Test
    void refreshAndClear() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).clear();
        Mockito.verify(gui, Mockito.times(1)).refresh();
    }
}
