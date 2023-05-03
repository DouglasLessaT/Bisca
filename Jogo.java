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
	            if (!cartasRodada.isEmpty()) {
	                cartasRodada.sort(new Comparator<Carta>() {
	                    public int compare(Carta c1, Carta c2) {
	                        if (c1.getNaipe() != c2.getNaipe()) {
	                            return c1.getNaipe().compareTo(c2.getNaipe());
	                        } else {
	                            return -Integer.compare(Carta.VALORES.indexOf(c1.getValor()), Carta.VALORES.indexOf(c2.getValor()));
	                        }
	                    }
	                });
	                Jogador vencedor = null;
	                for (Jogador jogador : jogadores) {
	                    if (jogador.getMao().contains(cartasRodada.get(cartasRodada.size() - 1))) {
	                        vencedor = jogador;
	                        break;
	                    }
	                }
	                if (vencedor == null) {
	                    throw new RuntimeException("Não encontrou o vencedor da rodada");
	                }

	       
	          
