package entities;

import entities.Jogo;

public class Program {
    public static void main(String[] args) {
       
        Jogo jogo = new Jogo("Mario", "Browser", "Pit", "Luigi");
        jogo.iniciarJogo();

        
        jogo.mostrarResultados();
    }
}
