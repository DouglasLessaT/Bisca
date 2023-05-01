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
    
    
    public void receberCartas (Carta carta) {
		cartasMao.add(carta);
    }
    
    public Carta jogarCartas(List<Carta> cartasmesa, String Trunfo) {
    	return cartasMao.remove((int)(Math.random()*cartasMao.size()));
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
		sb.append("Jogador: ").append(nome).append("\n");
        sb.append("Cartas na mão: \n");
        for (Carta carta : cartasMao) {
            sb.append(carta.toString()).append("\n");
        }
        return sb.toString();
    }
}
    

