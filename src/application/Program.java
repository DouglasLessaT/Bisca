package application;

public class Program {

	public static void main(String[] args) {
		import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JogoTest {

    @Test
    public void testJogar() {
        List<String> nomesJogadores = Arrays.asList("Jogador1", "Jogador2", "Jogador3", "Jogador4");
        Jogo jogo = new Jogo(nomesJogadores);
        jogo.jogar();
        assertNotNull(jogo);
    }

    @Test
    public void testClassificarCartas() {
        Carta carta1 = new Carta("2", "Copas");
        Carta carta2 = new Carta("3", "Paus");
        Carta carta3 = new Carta("5", "Espadas");
        Carta carta4 = new Carta("5", "Ouros");

        List<Carta> cartas = Arrays.asList(carta1, carta2, carta3, carta4);
        cartas.sort(new Jogo.NaipeComparator());

        assertEquals(carta2, cartas.get(0));
        assertEquals(carta1, cartas.get(1));
        assertEquals(carta3, cartas.get(2));
        assertEquals(carta4, cartas.get(3));
    }

    @Test
    public void testSelecionarVencedorRodada() {
        List<Jogador> jogadores = Arrays.asList(
                new Jogador("Jogador1"),
                new Jogador("Jogador2"),
                new Jogador("Jogador3"),
                new Jogador("Jogador4")
        );
        Jogador jogador1 = jogadores.get(0);
        Jogador jogador2 = jogadores.get(1);
        Jogador jogador3 = jogadores.get(2);
        Jogador jogador4 = jogadores.get(3);

        Baralho baralho = new Baralho();
        baralho.embaralhar();

        jogador1.receberCarta(baralho.comprarCarta());
        jogador2.receberCarta(baralho.comprarCarta());
        jogador3.receberCarta(baralho.comprarCarta());
        jogador4.receberCarta(baralho.comprarCarta());

        jogador1.receberCarta(baralho.comprarCarta());
        jogador2.receberCarta(baralho.comprarCarta());
        jogador3.receberCarta(baralho.comprarCarta());
        jogador4.receberCarta(baralho.comprarCarta());

        List<Carta> cartasRodada = Arrays.asList(
                jogador1.jogarCarta(0),
                jogador2.jogarCarta(0),
                jogador3.jogarCarta(0),
                jogador4.jogarCarta(0)
        );

        cartasRodada.sort(new Jogo.NaipeComparator());
        Carta cartaVencedora = cartasRodada.get(3);

        Jogador vencedor = null;
        for (Jogador jogador : jogadores) {

	}

}
