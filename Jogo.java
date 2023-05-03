import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Jogo {
	    private List<Jogador> jogadores;
	    private Baralho baralho;

	    public Jogo(List<String> nomesJogadores) {
	        jogadores = new ArrayList<>();
	        for (String nome : nomesJogadores) {
	            jogadores.add(new Jogador(nome));
	        }
	        
	        baralho = new Baralho();
	    }
	   
	    public void jogar() {
	        baralho.embaralhar();

	        for (Jogador jogador : jogadores) {
	            jogador.receberCarta(baralho.comprarCarta());
	        }

	        for (int i = 0; i < 4; i++) {
	            List<Carta> cartasRodada = new ArrayList<>();
	            for (Jogador jogador : jogadores) {
	                Carta carta = jogador.jogarCarta(i);
	                if (carta != null) {
	                    cartasRodada.add(carta);
	                }
	            }
	        }
	       
	          
