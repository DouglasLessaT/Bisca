package entities;

public class Jogo {
    public Baralho baralho;
    public Jogador jogador1;
    public Jogador jogador2;
    public Jogador jogador3;
    public Jogador jogador4;
    public Jogador jogadorVencedor;

    public Jogo(String mario, String brauser, String pit, String luigi) {
        baralho = new Baralho();
        baralho.embaralhar();

        jogador1 = new Jogador(mario);
        for (int i = 0; i < 3; i++) {
            jogador1.receberCarta(baralho);
        }

        jogador2 = new Jogador(brauser);
        for (int i = 0; i < 3; i++) {
            jogador2.receberCarta(baralho);
        }

        jogador3 = new Jogador(pit);
        for (int i = 0; i < 3; i++) {
            jogador3.receberCarta(baralho);
        }

        jogador4 = new Jogador(luigi);
        for (int i = 0; i < 3; i++) {
            jogador4.receberCarta(baralho);
        }
    }

    public Jogador getJogadorVencedor() {
        return jogadorVencedor;
    }

    public void setJogadorVencedor(Jogador jogadorVencedor) {
        this.jogadorVencedor = jogadorVencedor;
    }

    public void iniciarJogo() {
        jogadorVencedor = null;

        int rodada = 1;
        while (rodada <= 7) {
            System.out.println("----- Rodada " + rodada + " -----");

            System.out.println("Jogador: " + jogador1.getNome());
            jogador1.contarPontos();
            jogador1.mostrarPontuacao();

            System.out.println("Jogador: " + jogador2.getNome());
            jogador2.contarPontos();
            jogador2.mostrarPontuacao();
            

            System.out.println("Jogador: " + jogador3.getNome());
            jogador3.contarPontos();
            jogador3.mostrarPontuacao();

            System.out.println("Jogador: " + jogador4.getNome());
            jogador4.contarPontos();
            jogador4.mostrarPontuacao();
            
            System.out.println();
            // Comprar carta para cada jogador
            jogador1.comprarCarta(baralho);
            jogador2.comprarCarta(baralho);
            jogador3.comprarCarta(baralho);
            jogador4.comprarCarta(baralho);

            System.out.println("-------------------");

            rodada++;
        }

        // Verificar jogador com maior pontuação
        int maiorPontuacao = 0;
        Jogador jogadorAtual = null;

        if (jogador1.getPontos() > maiorPontuacao) {
            maiorPontuacao = jogador1.getPontos();
            jogadorAtual = jogador1;
        }

        if (jogador2.getPontos() > maiorPontuacao) {
            maiorPontuacao = jogador2.getPontos();
            jogadorAtual = jogador2;
        }

        if (jogador3.getPontos() > maiorPontuacao) {
            maiorPontuacao = jogador3.getPontos();
            jogadorAtual = jogador3;
        }

        if (jogador4.getPontos() > maiorPontuacao) {
            maiorPontuacao = jogador4.getPontos();
            jogadorAtual = jogador4;
        }

        // Definir o jogador vencedor
        jogadorVencedor = jogadorAtual;
    }

    public void mostrarResultados() {
        System.out.println("Pontuação final:");
        System.out.println(jogador1.getNome() + ": " + jogador1.getPontos() + " pontos");
        System.out.println(jogador2.getNome() + ": " + jogador2.getPontos() + " pontos");
        System.out.println(jogador3.getNome() + ": " + jogador3.getPontos() + " pontos");
        System.out.println(jogador4.getNome() + ": " + jogador4.getPontos() + " pontos");

        if (jogadorVencedor != null) {
            System.out.println("O jogador vencedor é: " + jogadorVencedor.getNome() + " com " + jogadorVencedor.getPontos() + " pontos!");
        } else {
            System.out.println("Não há um jogador vencedor.");
        }
    }
}