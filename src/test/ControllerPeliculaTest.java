package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Controller.ControllerPelicula;
import Exception.ExceptionContenido;

public class ControllerPeliculaTest {

    @Test
    void testCrearPelicula() {

        ControllerPelicula controller =
                new ControllerPelicula();

        controller.crearPelicula(
                "Avatar",
                125,
                "Accion",
                "Fox"
        );

        assertEquals(
                1,
                controller.getPeliculas().size()
        );
    }

    @Test
    void testGetPeliculas() {

        ControllerPelicula controller =
                new ControllerPelicula();

        controller.crearPelicula(
                "Avatar",
                125,
                "Accion",
                "Fox"
        );

        controller.crearPelicula(
                "Titanic",
                180,
                "Drama",
                "Paramount"
        );

        assertEquals(
                2,
                controller.getPeliculas().size()
        );
    }
    @Test
    void testMostrarContenidosVacio() {

        ControllerPelicula controller =
                new ControllerPelicula();

        assertThrows(
                ExceptionContenido.class,
                () -> controller.mostrarContenidos()
        );
    }
    @Test
    void testDatosPeliculaCreada() {

        ControllerPelicula controller =
                new ControllerPelicula();

        controller.crearPelicula(
                "Avatar",
                125,
                "Accion",
                "Fox"
        );

        assertEquals(
                "Avatar",
                controller.getPeliculas()
                          .get(0)
                          .getTitulo()
        );

        assertEquals(
                "Fox",
                controller.getPeliculas()
                          .get(0)
                          .getEstudio()
        );
    }
}