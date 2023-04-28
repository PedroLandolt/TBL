package pt.up.fe.lendea.controller;

import pt.up.fe.lendea.controller.game.LendeaController;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.layout.arena.Arena;
import pt.up.fe.lendea.model.layout.elements.Exit;
import pt.up.fe.lendea.model.layout.elements.Lendea;
import pt.up.fe.lendea.model.layout.elements.Wall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LendeaControllerTest {
    private LendeaController controller;
    private Lendea lendea;
    private Arena arena;


    // Cria um novo ambiente para cada teste
    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10);

        lendea = new Lendea(5, 5);
        arena.setLendea(lendea);

        arena.setWalls(Arrays.asList());
        arena.setMonsters(Arrays.asList());
        arena.setCoins(Arrays.asList());
        arena.setShots(Arrays.asList());
        arena.setBosses(Arrays.asList());
        arena.setBossShots(Arrays.asList());
        arena.setExit(new Exit(10, 9));

        controller = new LendeaController(arena);
    }

    // Testa se o Lendea consegue se mover para a direita
    @Test
    void moveLendeaRightEmpty() {
        controller.moveLendeaRight();
        Assertions.assertEquals(new Position(6, 5), lendea.getPosition());
    }

    // Testa se o Lendea consegue se mover para a esquerda
    @Test
    void moveLendeaRightNotEmpty() {
        arena.setWalls(Arrays.asList(new Wall(6, 5)));
        controller.moveLendeaRight();
        assertEquals(new Position(5, 5), lendea.getPosition());
    }

    // Testa se o Lendea consegue se mover para a cima
    @Test
    void moveLendeaUpEmpty(){
        controller.moveLendeaUp();
        assertEquals(new Position(5, 4), lendea.getPosition());
    }

    // Testa se o Lendea consegue se mover para a baixo
    @Test
    void moveLendeaDownEmpty(){
        controller.moveLendeaDown();
        assertEquals(new Position(5, 6), lendea.getPosition());
    }
}