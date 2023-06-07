package entities;

import entities.Carta;
import entities.Naipe;
import entities.Valor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartaTest {

    @Test
    public void testGetNaipe() {
        Carta carta = new Carta(Naipe.COPAS, Valor.AS);
        Assertions.assertEquals(Naipe.COPAS, carta.getNaipe());
    }

    @Test
    public void testGetValor() {
        Carta carta = new Carta(Naipe.ESPADAS, Valor.VALETE);
        Assertions.assertEquals(Valor.VALETE, carta.getValor());
    }

    @Test
    public void testToString() {
        Carta carta = new Carta(Naipe.OUROS, Valor.DAMA);
        Assertions.assertEquals("DAMA de OUROS", carta.toString());
    }
}
