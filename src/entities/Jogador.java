package entities;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
	
	private String nome;
    private List<Carta> cartasMao;
    
    public Jogador(String nome, List<Carta> cartaMao) {
        this.nome = nome;
        this.cartasMao = new ArrayList<>(3);
    }
}
