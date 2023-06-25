package application;

import entities.Jogo;

public class Program {
    public static void main(String[] args) {
        // Criação do jogo com os nomes dos jogadores
        Jogo jogo = new Jogo("Mario", "Browser", "Pit", "Luigi");

        // Iniciar o jogo
        jogo.iniciarJogo();

        // Mostrar os resultados
        jogo.mostrarResultados();
    }
}