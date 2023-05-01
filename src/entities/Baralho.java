/*
 * Desenvolvido para a disciplina Programacao 1
 * Curso de Bacharelado em Ciência da Computação
 * Departamento de Sistemas e Computação
 * Universidade Federal da Paraíba
 *
 * Copyright (C) 1999 Universidade Federal da Paraíba.
 * Não redistribuir sem permissão.
 */

package p1.aplic.cartas;

import java.util.*;
import java.lang.Math.*;

/**
 * Um baralho comum de cartas.
 * Num baralho comum, tem 52 cartas:
 * 13 valores (AS, 2, 3, ..., 10, valete, dama, rei)
 * de 4 naipes (ouros, espadas, copas, paus).
 *
 * @author Jacques Philippe Sauvé, jacques@dsc.ufpb.br
 * @version 1.1
 * <br>
 * Copyright (C) 1999 Universidade Federal da Paraíba.
 */
public class Baralho {
  /**
   * O baralho é armazenado aqui.
   * É protected porque alguns baralhos subclasses dessa classe
   * poderão talvez ter que mexer diretamente aqui
   * para construir baralhos especiais.
   */
  protected Vector baralho;

  /**
   * Construtor de um baralho comum.
   */
  public Baralho() {
    // Usa um Vector para ter um iterador facilmente
    baralho = new Vector();
    // enche o baralho
    for(int valor = menorValor(); valor <= maiorValor(); valor++) {
      for(int naipe = primeiroNaipe(); naipe <= últimoNaipe(); naipe++) {
        // chama criaCarta e não "new" para poder fazer override
        // de criaCarta em baralhos de subclasses e
        // criar classes diferentes.
        baralho.add(criaCarta(valor, naipe));
      }
    }
  }

  /**
   * Cria uma carta para este baralho.
   * @param valor O valor da carta a criar.
   * @param naipe O naipe da carta a criar.
   * @return A carta criada.
   */
  protected Carta criaCarta(int valor, int naipe) {
    return new Carta(valor, naipe);
  }

  /**
   * Recupera o valor da menor carta possível deste baralho.
   * É possível fazer um laço de menorValor() até maiorValor()
   * para varrer todos os valores possíveis de cartas.
   * @return O menor valor.
   */
  public int menorValor() {
    return Carta.menorValor();
  }

  /**
   * Recupera o valor da maior carta possível deste baralho.
   * É possível fazer um laço de menorValor() até maiorValor()
   * para varrer todos os valores possíveis de cartas.
   * @return O maior valor.
   */
  public int maiorValor() {
    return Carta.maiorValor();
  }

  /**
   * Recupera o "primeiro naipe" das cartas que podem estar
   * no baralho.
   * Ser "primeiro naipe" não significa muita coisa,
   * já que naipes não tem valor
   * (um naipe não é menor ou maior que o outro).
   * Fala-se de "primeiro naipe" e "último naipe" para poder
   * fazer um laço de primeiroNaipe() até últimoNaipe() para varrer
   * todos os naipes possíveis de cartas.
   * @return O primeiro naipe.
   */
  public int primeiroNaipe() {
    return Carta.primeiroNaipe();
  }

  /**
   * Recupera o "último naipe" das cartas que podem estar
   * no baralho.
   * Ser "último naipe" não significa muita coisa,
   * já que naipes não tem valor
   * (um naipe não é menor ou maior que o outro).
   * Fala-se de "primeiro naipe" e "último naipe" para poder
   * fazer um laço de primeiroNaipe() até últimoNaipe() para varrer
   * todos os naipes possíveis de cartas.
   * @return O primeiro naipe.
   */
  public int últimoNaipe() {
    return Carta.últimoNaipe();
  }

  /**
   * Recupera o número de cartas atualmente no baralho.
   * @return O número de cartas no baralho.
   */
  public int númeroDeCartas() {
    return baralho.size();
  }
  
  /**
   * Recupera um iterador para poder varrer todas
   * as cartas do baralho.
   * @return Um iterador do baralho.
   */
  public Iterator iterator() {
    return baralho.iterator();
  }

  /**
   * Baralha (traça) o baralho.
   */
  public void baralhar() {
    int posição;
    for(posição = 0; posição < númeroDeCartas() - 1; posição++) {
      // escolhe uma posição aleatória entre posição e númeroDeCartas()-1
      int posAleatória = posição +
                         (int)((númeroDeCartas() - posição) *
                               Math.random());
      // troca as cartas em posição e posAleatória
      Carta temp = (Carta)baralho.get(posição);
      baralho.set(posição, baralho.get(posAleatória));
      baralho.set(posAleatória, temp);
    }
  }

    /**
     * Retira uma carta do topo do baralho e a retorna.
     * A carta é removida do baralho.
     * @return A carta retirada do baralho.
     */
  public Carta pegaCarta() {
    if(númeroDeCartas() == 0) return null;
    return (Carta)baralho.remove(númeroDeCartas()-1);
  }
}
