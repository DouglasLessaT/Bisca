
package entities;
import java.util.ArrayList;
import java.util.List;


public class Jogo {

	    private List<Jogador> jogadores;
	    private Baralho baralho;

	    public Jogo() {
	        jogadores = new ArrayList<>();
	        baralho = new Baralho();
	    }

	    public void adicionarJogador(Jogador jogador) {
	        jogadores.add(jogador);
	    }

	    public void iniciar() {
	        if (jogadores.size() < 2) {
	            System.out.println("O jogo precisa ter pelo menos 2 jogadores.");
	            return;
	        }

	        baralho.embaralhar();
	        distribuirCartas();

	        while (!verificarVencedor()) {
	            for (Jogador jogador : jogadores) {
	                System.out.println("Mão de " + jogador.getNome() + ":");
	                exibirMao(jogador);
	            }

	            jogarRodada();
	        }
	    }

	    private void distribuirCartas() {
	        int numCartas = 6; // Número de cartas para cada jogador

	        for (int i = 0; i < numCartas; i++) {
	            for (Jogador jogador : jogadores) {
	                Carta carta = baralho.distribuirCarta();
	                jogador.adicionarCarta(carta);
	            }
	        }
	    }

	    private void exibirMao(Jogador jogador) {
	        List<Carta> mao = jogador.getMao();

	        for (Carta carta : mao) {
	            System.out.println(carta);
	        }
	    }
	    
	    
	  
	        public void jogarRodada() {
	            List<Carta> cartasJogadas = new ArrayList<>();

	            for (Jogador jogador : jogadores) {
	                Carta carta = jogador.getMao().get(0); // Pega a primeira carta da mão do jogador
	                cartasJogadas.add(carta);
	                System.out.println(jogador.getNome() + " jogou " + carta);
	            }

	            // Lógica para determinar a carta vencedora
	            Carta cartaVencedora = cartasJogadas.get(0);
	            Jogador jogadorVencedor = jogadores.get(0);

	            for (int i = 1; i < cartasJogadas.size(); i++) {
	                Carta carta = cartasJogadas.get(i);
	                if (carta.getValor().ordinal() > cartaVencedora.getValor().ordinal()) {
	                    cartaVencedora = carta;
	                    jogadorVencedor = jogadores.get(i);
	                }
	            }

	            System.out.println("A carta vencedora é: " + cartaVencedora);
	            System.out.println("O jogador vencedor é: " + jogadorVencedor);

	            // Remover a carta vencedora da mão do jogador vencedor
	            jogadorVencedor.removerCarta(cartaVencedora);
	        }

	       
	            // ...

	            public boolean verificarVencedor() {
	                for (Jogador jogador : jogadores) {
	                    if (jogador.getMao().isEmpty()) {
	                        System.out.println(jogador.getNome() + " venceu o jogo!");
	                        return true;
	                    }
	                }
	                return false;
	            }

	            // ...
	      
	    }

