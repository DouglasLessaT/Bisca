/*
 * Desenvolvido para a disciplina Programacao 1
 * Curso de Bacharelado em Ci�ncia da Computa��o
 * Departamento de Sistemas e Computa��o
 * Universidade Federal da Para�ba
 *
 * Copyright (C) 1999 Universidade Federal da Para�ba.
 * N�o redistribuir sem permiss�o.
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
 * @author Jacques Philippe Sauv�, jacques@dsc.ufpb.br
 * @version 1.1
 * <br>
 * Copyright (C) 1999 Universidade Federal da Para�ba.
 */
public class Baralho {
  /**
   * O baralho � armazenado aqui.
   * � protected porque alguns baralhos subclasses dessa classe
   * poder�o talvez ter que mexer diretamente aqui
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
      for(int naipe = primeiroNaipe(); naipe <= �ltimoNaipe(); naipe++) {
        // chama criaCarta e n�o "new" para poder fazer override
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
   * Recupera o valor da menor carta poss�vel deste baralho.
   * � poss�vel fazer um la�o de menorValor() at� maiorValor()
   * para varrer todos os valores poss�veis de cartas.
   * @return O menor valor.
   */
  public int menorValor() {
    return Carta.menorValor();
  }

  /**
   * Recupera o valor da maior carta poss�vel deste baralho.
   * � poss�vel fazer um la�o de menorValor() at� maiorValor()
   * para varrer todos os valores poss�veis de cartas.
   * @return O maior valor.
   */
  public int maiorValor() {
    return Carta.maiorValor();
  }

  /**
   * Recupera o "primeiro naipe" das cartas que podem estar
   * no baralho.
   * Ser "primeiro naipe" n�o significa muita coisa,
   * j� que naipes n�o tem valor
   * (um naipe n�o � menor ou maior que o outro).
   * Fala-se de "primeiro naipe" e "�ltimo naipe" para poder
   * fazer um la�o de primeiroNaipe() at� �ltimoNaipe() para varrer
   * todos os naipes poss�veis de cartas.
   * @return O primeiro naipe.
   */
  public int primeiroNaipe() {
    return Carta.primeiroNaipe();
  }

  /**
   * Recupera o "�ltimo naipe" das cartas que podem estar
   * no baralho.
   * Ser "�ltimo naipe" n�o significa muita coisa,
   * j� que naipes n�o tem valor
   * (um naipe n�o � menor ou maior que o outro).
   * Fala-se de "primeiro naipe" e "�ltimo naipe" para poder
   * fazer um la�o de primeiroNaipe() at� �ltimoNaipe() para varrer
   * todos os naipes poss�veis de cartas.
   * @return O primeiro naipe.
   */
  public int �ltimoNaipe() {
    return Carta.�ltimoNaipe();
  }

  /**
   * Recupera o n�mero de cartas atualmente no baralho.
   * @return O n�mero de cartas no baralho.
   */
  public int n�meroDeCartas() {
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
   * Baralha (tra�a) o baralho.
   */
  public void baralhar() {
    int posi��o;
    for(posi��o = 0; posi��o < n�meroDeCartas() - 1; posi��o++) {
      // escolhe uma posi��o aleat�ria entre posi��o e n�meroDeCartas()-1
      int posAleat�ria = posi��o +
                         (int)((n�meroDeCartas() - posi��o) *
                               Math.random());
      // troca as cartas em posi��o e posAleat�ria
      Carta temp = (Carta)baralho.get(posi��o);
      baralho.set(posi��o, baralho.get(posAleat�ria));
      baralho.set(posAleat�ria, temp);
    }
  }

    /**
     * Retira uma carta do topo do baralho e a retorna.
     * A carta � removida do baralho.
     * @return A carta retirada do baralho.
     */
  public Carta pegaCarta() {
    if(n�meroDeCartas() == 0) return null;
    return (Carta)baralho.remove(n�meroDeCartas()-1);
  }
}
