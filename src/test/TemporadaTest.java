package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Temporada;

public class TemporadaTest {

    @Test
    void testCrearTemporada() {

        Temporada temporada =
                new Temporada(
                        "Temporada 1",
                        1,
                        10
                );

        assertEquals(
                "Temporada 1",
                temporada.getNombreTemporada()
        );

        assertEquals(
                1,
                temporada.getNumero()
        );

        assertEquals(
                10,
                temporada.getEpisodios()
        );
    }
}