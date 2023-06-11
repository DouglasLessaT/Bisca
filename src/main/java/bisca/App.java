package bisca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
	        Jogo  jogo  = new Jogo();

	        Jogador jogador1 = new Jogador("Jogador 1");
	        Jogador jogador2 = new Jogador("Jogador 2");
	        Jogador jogador3 = new Jogador("Jogador 3");
	        Jogador jogador4 = new Jogador("Jogador 4");


	        jogo.adicionarJogador(jogador1);
	        jogo.adicionarJogador(jogador2);
	        jogo.adicionarJogador(jogador3);
	        jogo.adicionarJogador(jogador4);

	        jogo.iniciar();
	    }


	}

