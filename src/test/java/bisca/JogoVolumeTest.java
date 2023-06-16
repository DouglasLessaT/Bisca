package bisca;

import src.main.bisca.Jogador;
import src.main.bisca.Jogo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JogoVolumeTest {

    @Test
    public void testJogarRodadaVolume() {
        
        int numeroJogadores = 1000;
        List<Jogador> jogadores = new ArrayList<>();
        for (int i = 1; i <= numeroJogadores; i++) {
            Jogador jogador = new Jogador("Jogador " + i);
            jogadores.add(jogador);
        }

    
        int numeroCartas = 10000;
        for (Jogador jogador : jogadores) {
            List<Carta> mao = new ArrayList<>();
            for (int i = 1; i <= numeroCartas; i++) {
                mao.add(new Carta(Valor.AS));
            }
            jogador.setMao(mao);
        }

        
        Jogo jogo = new Jogo();
        jogo.adicionarJogadores(jogadores);


        jogo.jogarRodada();

        
    }
}
