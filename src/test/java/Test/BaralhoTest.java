package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import entities.Baralho;
import entities.Carta;

public class BaralhoTest {
    private Baralho baralho;
    
    @Before
    public void setUp() {
        baralho = new Baralho();
    }
    
    @Test
    public void testEmbaralhar() {
        List<Carta> cartasAntes = baralho.getCartas();
        
        baralho.embaralhar();
        
        List<Carta> cartasDepois = baralho.getCartas();
        
        assertEquals(cartasAntes.size(), cartasDepois.size());
        for (int i = 0; i < cartasAntes.size(); i++) {
            Carta cartaAntes = cartasAntes.get(i);
            Carta cartaDepois = cartasDepois.get(i);
            
            assertEquals(cartaAntes.getNaipe(), cartaDepois.getNaipe());
            assertEquals(cartaAntes.getValor(), cartaDepois.getValor());
        }
    }
    
    @Test
    public void testComprarCarta() {
        Carta carta = baralho.comprarCarta();
        
        assertNotNull(carta);
    }
}