package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.SerieDeTV;

public class SerieDeTVTest {

    @Test
    void testAgregarTemporada() {

        SerieDeTV serie =
                new SerieDeTV(
                        "Dark",
                        50,
                        "Ciencia Ficcion"
                );

        serie.agregarTemporada(
                "Temporada 1",
                1,
                10
        );

        assertEquals(
                1,
                serie.totalTemporadas()
        );
    }

    @Test
    void testSerieSinTemporadas() {

        SerieDeTV serie =
                new SerieDeTV(
                        "Dark",
                        50,
                        "Ciencia Ficcion"
                );

        assertEquals(
                0,
                serie.totalTemporadas()
        );
    }
}