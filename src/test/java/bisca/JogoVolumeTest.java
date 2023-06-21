import org.junit.jupiter.api.Test;
import org.junit.jupiter.api

import java.util.ArrayList;
import java.util.List;

public class JogoVolumeTest {

    @Test
    public void testJogarRodadaVolume() {
        // Criação de um grande número de jogadores
        int numeroJogadores = 1000;
        List<Jogador> jogadores = new ArrayList<>();
        for (int i = 1; i <= numeroJogadores; i++) {
            Jogador jogador = new Jogador("Jogador " + i);
            jogadores.add(jogador);
        }

        // Adição de um grande número de cartas às mãos dos jogadores
        int numeroCartas = 10000;
        for (Jogador jogador : jogadores) {
            List<Carta> mao = new ArrayList<>();
            for (int i = 1; i <= numeroCartas; i++) {
                mao.add(new Carta(Valor.AS));
            }
            jogador.setMao(mao);
        }

        // Criação do jogo
        Jogo jogo = new Jogo();
        jogo.adicionarJogadores(jogadores);

        // Execução da rodada
        jogo.jogarRodada();

        // Verificação de resultados
        // (Adicione aqui asserções para verificar os resultados esperados, se aplicável)
    }
}
