package pt.up.fe.lendea.viewer;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.layout.elements.Lendea;
import pt.up.fe.lendea.viewer.layout.LendeaViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LendeaViewerTest {
    private Lendea lendea;
    private LendeaViewer viewer;
    private GUI gui;

    // Cria um novo ambiente para cada teste
    @BeforeEach
    void setUp() {
        lendea = new Lendea(10, 10);
        viewer = new LendeaViewer();
        gui = Mockito.mock(GUI.class);
    }

    // Testa se o LendeaViewer consegue desenhar a Lendea
    @Test
    void drawElement() {
        viewer.draw(lendea, gui);
        Mockito.verify(gui, Mockito.times(1)).drawLendea(lendea.getPosition());
    }
}