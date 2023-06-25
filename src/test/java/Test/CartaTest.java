package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entities.Carta;
import entities.Naipe;
import entities.Valor;

public class CartaTest {
    
    @Test
    public void testGetNaipe() {
        Carta carta = new Carta(Naipe.PAUS, Valor.DOIS);
        assertEquals(Naipe.PAUS, carta.getNaipe());
    }
    
    @Test
    public void testSetNaipe() {
        Carta carta = new Carta(Naipe.PAUS, Valor.DOIS);
        carta.setNaipe(Naipe.COPAS);
        assertEquals(Naipe.COPAS, carta.getNaipe());
    }
    
    @Test
    public void testGetValor() {
        Carta carta = new Carta(Naipe.PAUS, Valor.DOIS);
        assertEquals(Valor.DOIS, carta.getValor());
    }
    
    @Test
    public void testSetValor() {
        Carta carta = new Carta(Naipe.PAUS, Valor.DOIS);
        carta.setValor(Valor.TRES);
        assertEquals(Valor.TRES, carta.getValor());
    }
    
    @Test
    public void testGetPonto() {
        Carta carta = new Carta(Naipe.PAUS, Valor.SETE);
        assertEquals(10, carta.getPonto());
    }
    
    @Test
    public void testToString() {
        Carta carta = new Carta(Naipe.PAUS, Valor.DOIS);
        assertEquals("DOIS de PAUS", carta.toString());
    }
}