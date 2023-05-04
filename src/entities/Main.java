package entities;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomesJogadores = Arrays.asList("Jogador 1", "Jogador 2", "Jogador 3", "Jogador 4");
        Jogo jogo = new Jogo(nomesJogadores);
        jogo.jogar();
    }
}

   
