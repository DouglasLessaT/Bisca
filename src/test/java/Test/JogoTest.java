package Test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import entities.Jogo;

public class JogoTest {
    private Jogo jogo;
    
    @Before
    public void setUp() {
        jogo = new Jogo("Mario", "Browser", "Pit", "Luigi");
    }
    
    @Test
    public void testIniciarJogo() {
        jogo.iniciarJogo();
        
        assertNotNull(jogo.getJogadorVencedor());
    }
    
    @Test
    public void testMostrarResultados() {
        jogo.iniciarJogo();
        
        jogo.mostrarResultados();
    }
}