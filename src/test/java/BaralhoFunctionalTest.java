package entities;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;


public class BaralhoFunctionalTest {

    private Baralho baralho;

    @Before
    public void setUp() {
        baralho = new Baralho();
    }

    @Test
    public void testInicializacao() {
        Assert.assertFalse(baralho.isEmpty());
        Assert.assertEquals(52, baralho.getCartas().size());
    }

    @Test
    public void testEmbaralhar() {
        Set<Carta> cartasAntesEmbaralhar = new HashSet<>(baralho.getCartas());
        baralho.embaralhar();
        Set<Carta> cartasAposEmbaralhar = new HashSet<>(baralho.getCartas());

        Assert.assertNotEquals(cartasAntesEmbaralhar, cartasAposEmbaralhar);
    }

    @Test
    public void testDistribuirCarta() {
        int cartasIniciais = baralho.getCartas().size();
        Carta carta = baralho.distribuirCarta();
        int cartasFinais = baralho.getCartas().size();

        Assert.assertEquals(cartasIniciais - 1, cartasFinais);
        Assert.assertNotNull(carta);
    }

    @Test
    public void testIsEmpty() {
        Assert.assertFalse(baralho.isEmpty());
        baralho.getCartas().clear();
        Assert.assertTrue(baralho.isEmpty());
    }
}
