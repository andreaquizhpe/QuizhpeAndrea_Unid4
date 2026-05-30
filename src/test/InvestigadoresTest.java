package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Investigador;

public class InvestigadoresTest {

    @Test
    void testCrearInvestigador() {

        Investigador investigador =
                new Investigador(
                        "Carl Sagan",
                        60,
                        30
                );

        assertEquals(
                "Carl Sagan",
                investigador.getNombre()
        );

        assertEquals(
                60,
                investigador.getEdad()
        );

        assertEquals(
                30,
                investigador.getAniosExperiencia()
        );
    }
}