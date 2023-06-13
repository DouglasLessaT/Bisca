package bisca;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Baralho {
	 private List<Carta> cartas;

	    public Baralho() {
	        cartas = new ArrayList<>();

	        for (Naipe naipe : Naipe.values()) {
	            for (Valor valor : Valor.values()) {
	                cartas.add(new Carta(naipe, valor));
	            }
	        }
	    }

	    public void embaralhar() {
	        Random random = new Random();

	        for (int i = cartas.size() - 1; i > 0; i--) {
	            int j = random.nextInt(i + 1);
	            Carta temp = cartas.get(i);
	            cartas.set(i, cartas.get(j));
	            cartas.set(j, temp);
	        }
	    }

	    public Carta distribuirCarta() {
	        return cartas.remove(cartas.size() - 1);
	    }

	    public boolean isEmpty() {
	        return cartas.isEmpty();
	    }
	}


