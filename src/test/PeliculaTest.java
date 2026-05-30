package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Pelicula;

public class PeliculaTest {

    @Test
    void testCrearPelicula() {

        Pelicula pelicula = new Pelicula(
                "Avatar",
                125,
                "Accion",
                "20th Century Studios"
        );

        assertEquals(
                "Avatar",
                pelicula.getTitulo()
        );

        assertEquals(
                125,
                pelicula.getDuracionEnMinutos()
        );

        assertEquals(
                "Accion",
                pelicula.getGenero()
        );

        assertEquals(
                "20th Century Studios",
                pelicula.getEstudio()
        );
    }
}