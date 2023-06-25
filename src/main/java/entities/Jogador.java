
package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class Jogador {
	
        private String nome;
        private List<Carta> cartasMao = new ArrayList<>() ;
        private int pontos;
        
        public Jogador(String nome) {
            this.nome = nome;
            this.pontos = 0;
        }
        
        public List<Carta> getCartasMao() {
            return cartasMao;
        }
        
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public int getPontos() {
            return pontos;
        }
    
        public void setPontos(int pontos) {
            this.pontos = pontos;
        }
    
        public void setCartasMao(List<Carta> cartasMao) {
            this.cartasMao = cartasMao;
        }
        
        public void comprarCarta(Baralho baralho) {
            Carta carta = baralho.comprarCarta();
            cartasMao.add(carta);
            System.out.println("Jogador " + nome + " comprou uma carta: " + carta);
        }
        public void receberCarta(Baralho baralho) {
            Carta carta = baralho.comprarCarta();
            cartasMao.add(carta);
        }
        
        public Carta jogarCarta() {
            Random random = new Random();
            int index = random.nextInt(cartasMao.size());
            return cartasMao.remove(index);
        }
        
        public int contarPontos() {
            int totalPontos = 0;
            for (Carta carta : cartasMao) {
                totalPontos += carta.getPonto();
            }
            pontos = totalPontos;
            return pontos;
        }
        
        public void mostrarPontuacao() {
            System.out.println("Pontuação do jogador " + nome + ": " + pontos + " pontos");
        }
    
        public String toString() {
            StringBuilder sb = new StringBuilder(nome);
            sb.append(" (");
            if (!cartasMao.isEmpty()) {
                for (int i = 0; i < cartasMao.size(); i++) {
                    sb.append(cartasMao.get(i));
                    if (i != cartasMao.size() - 1) {
                        sb.append(", ");
                    }
                }
            }
            sb.append(")");
            return sb.toString();
        }

    }
