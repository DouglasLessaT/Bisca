package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entities.Baralho;
import entities.Jogador;
import entities.Carta;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class JogadorTest {

    @Test
    public void testGetNome() {
        Jogador jogador = new Jogador("João");
        assertEquals("João", jogador.getNome());
