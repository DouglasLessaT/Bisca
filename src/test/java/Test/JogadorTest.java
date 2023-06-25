package Test;
import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;

import org.junit.experimental.categories.Category;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

import org.junit.jupiter.api.Tag;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import entities.Baralho;
import entities.Carta;
import entities.Jogador;

public class JogadorTest {
    private Jogador jogador;
    
    @Before
    public void setUp() {
        jogador = new Jogador("Mario");
    }
    
    @Test
    @Category(SlowTests.class)
    public void testComprarCarta() {
        Baralho baralho = null;
        
        jogador.comprarCarta(baralho);
        
        assertEquals(1, jogador.getCartasMao().size());
    }
    
    @Test
    public void testReceberCarta() {
        Baralho baralho = new Baralho();
        
        jogador.receberCarta(baralho);
        
        assertEquals(1, jogador.getCartasMao().size());
    }
    
    @Test
    public void testJogarCarta() {
        Baralho baralho = new Baralho();
        jogador.receberCarta(baralho);
        
        Carta carta = jogador.jogarCarta();
        
        assertNotNull(carta);
        assertEquals(0, jogador.getCartasMao().size());
    }
    
    
//    @Test
//    public void testContarPontos() {
//        Baralho baralho = new Baralho();
//        jogador.receberCarta(baralho);
//        jogador.receberCarta(baralho);
//        
//        int pontos = jogador.contarPontos();
//        
//        assertEquals(0, pontos);
//        assertEquals(2, jogador.getPontos());
//    }
//    
    
    @Test
    public void testMostrarPontuacao() {
        jogador.mostrarPontuacao();
    }
    
    @Test
    public void testToString() {
        String jogadorString = jogador.toString();
        
        assertNotNull(jogadorString);
    }
}
