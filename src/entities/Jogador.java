package entities;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
	
	private String nome;
    private List<Carta> cartasMao;
    
    
    public Jogador(String nome, List<Carta> cartaMao) {
        this.nome = nome;
        cartasMao = new ArrayList<>(3);
    }
    
    
    public void setCartasMao(List<Carta> cartasMao) {
		this.cartasMao = cartasMao;
	}
    
    
    public void receberCarta(Carta carta) {
    	for (int i = 0;i<=3;i++) {
        	this.cartasMao.add(baralho.removerCarta());
        }
    }
    
}
