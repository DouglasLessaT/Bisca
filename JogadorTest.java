import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class Jogador {

    @Test
    public void testReceberCartas() {
        Jogador jogador = new Jogador("João", new ArrayList<>());
        Carta carta = new Carta("Ás", "Ouros", 11);
        jogador.receberCartas(carta);
        assertEquals(1, jogador.getCartasMao().size());
        assertEquals(carta, jogador.getCartasMao().get(0));
    }

    @Test
    public void testJogarCartas() {
        Jogador jogador = new Jogador("Maria", new ArrayList<>());
        Carta carta1 = new Carta("Rei", "Copas", 4);
        Carta carta2 = new Carta("Dama", "Espadas", 3);
        jogador.receberCartas(carta1);
        jogador.receberCartas(carta2);
        List<Carta> cartasMesa = new ArrayList<>();
        Carta cartaJogada = jogador.jogarCartas(cartasMesa, "Ouros");
        assertTrue(jogador.getCartasMao().contains(cartaJogada));
        assertFalse(cartasMesa.contains(cartaJogada));
    }

    @Test
    public void testContarPontos() {
        Jogador jogador = new Jogador("Pedro", new ArrayList<>());
        Carta carta1 = new Carta("Valete", "Paus", 2);
        Carta carta2 = new Carta("Sete", "Ouros", 7);
        jogador.receberCartas(carta1);
        jogador.receberCartas(carta2);
        assertEquals(9, jogador.contarPontos());
    }

    @Test
    public void testToString() {
        Jogador jogador = new Jogador("Ana", new ArrayList<>());
        Carta carta1 = new Carta("Quatro", "Copas", 4);
        Carta carta2 = new Carta("Dez", "Espadas", 10);
        jogador.receberCartas(carta1);
        jogador.receberCartas(carta2);
        String expected = "Jogador: Ana\n" +
                "Cartas na mão: \n" +
                "Quatro de Copas\n" +
                "Dez de Espadas\n";
        assertEquals(expected, jogador.toString());
    }
}
