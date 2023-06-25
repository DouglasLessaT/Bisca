package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;
    
    public Baralho() {
        cartas = new ArrayList<>();
        
        // Adicionar todas as cartas ao baralho
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                Carta carta = new Carta(naipe, valor);
                cartas.add(carta);
            }
        }
    }
    
    public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}

	public void embaralhar() {
        Collections.shuffle(cartas);
    }
    
    public Carta comprarCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        } else {
            return null;
        }
    }
}