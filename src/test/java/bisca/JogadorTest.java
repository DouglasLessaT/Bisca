import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class JogadorTest {

    private Jogador jogador;

    @Before
    public void setup() {
        jogador = new Jogador("Jogador 1");
    }

    @Test
    public void testGetNome() {
        Assert.assertEquals("Jogador 1", jogador.getNome());
    }

    @Test
    public void testGetMao() {
        List<Carta> mao = jogador.getMao();
        Assert.assertNotNull(mao);
        Assert.assertTrue(mao.isEmpty());
    }

    @Test
    public void testAdicionarCarta() {
        Carta carta = new Carta("Ás", "Copas");
        jogador.adicionarCarta(carta);
        List<Carta> mao = jogador.getMao();
        Assert.assertEquals(1, mao.size());
        Assert.assertEquals(carta, mao.get(0));
    }

    @Test
    public void testRemoverCarta() {
        Carta carta = new Carta("Rei", "Espadas");
        jogador.adicionarCarta(carta);
        jogador.removerCarta(carta);
        List<Carta> mao = jogador.getMao();
        Assert.assertTrue(mao.isEmpty());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Jogador 1", jogador.toString());
    }