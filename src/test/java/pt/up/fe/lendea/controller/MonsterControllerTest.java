package pt.up.fe.lendea.controller;

import pt.up.fe.lendea.Game;
import pt.up.fe.lendea.controller.game.MonsterController;
import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.layout.arena.Arena;
import pt.up.fe.lendea.model.layout.elements.Lendea;
import pt.up.fe.lendea.model.layout.elements.Monster;
import pt.up.fe.lendea.model.layout.elements.Wall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MonsterControllerTest {
    private MonsterController controller;
    private Lendea lendea;
    private Arena arena;
    private Game game;

    // Cria um novo ambiente para cada teste
    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10);

        lendea = new Lendea(5, 5);
        arena.setLendea(lendea);

        arena.setWalls(Arrays.asList());
        arena.setMonsters(Arrays.asList());

        controller = new MonsterController(arena);

        game = Mockito.mock(Game.class);
    }

    // Testa se o monstro não está na mesma posicao apos o movimento
    @Test
    void moveMonsters() throws IOException {
        Monster monster = new Monster(5, 5);
        arena.setMonsters(Arrays.asList(monster));

        controller.step(game, GUI.ACTION.NONE, 1000);

        Assertions.assertNotEquals(new Position(5, 5), monster.getPosition());
    }

    // Testa se o mostro não passa paredes
    @Test
    void moveMonstersClosed() throws IOException {
        Monster monster = new Monster(5, 5);
        arena.setMonsters(Arrays.asList(monster));
        arena.setWalls(Arrays.asList(
                new Wall(4, 5),
                new Wall(6, 5),
                new Wall(5, 4),
                new Wall(5, 6)
        ));

        for (int i = 0; i < 10; i++)
            controller.step(game, GUI.ACTION.NONE, 1000);

        Assertions.assertEquals(new Position(5, 5), monster.getPosition());
    }

    // Testa se o mostro passa pelo unico caminho possivel
    @Test
    void moveMonstersGap() throws IOException {
        Monster monster = new Monster(5, 5);
        arena.setMonsters(Arrays.asList(monster));
        arena.setWalls(Arrays.asList(
                new Wall(4, 5),
                new Wall(6, 5),
                new Wall(5, 4)
        ));

        long time = 0;

        while (monster.getPosition().equals(new Position(5, 5))) {
            time += 500;
            controller.step(game, GUI.ACTION.NONE, time);
        }

        Assertions.assertEquals(new Position(5, 6), monster.getPosition());
    }
}