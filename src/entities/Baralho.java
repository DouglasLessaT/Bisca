package entities;

import java.util.Random;
import java.util.ArrayList;

public class Baralho {
    private ArrayList<Carta> cartas;
    private int indice;
    
    public Baralho() {
        cartas = new ArrayList<>();
        String[] valores = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String[] naipes = {"Paus", "Copas", "Espadas", "Ouros"};
        
        for (String valor : valores) {
            for (String naipe : naipes) {
                Carta carta = new Carta(valor, naipe);
                cartas.add(carta);
            }
        }
        
        indice = 0;
    }
public void embaralhar() {

        Random random = new Random();

        for (int i = cartas.size() - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

            Carta temp = cartas.get(i);

            cartas.set(i, cartas.get(j));

            cartas.set(j, temp);

        }

        indice = 0;

    }
    
    public Carta comprarCarta() {
        if (indice < cartas.size()) {
            Carta carta = cartas.get(indice);
            indice++;
            return carta;
        } else {
            return null;
        }
    }
}

    
