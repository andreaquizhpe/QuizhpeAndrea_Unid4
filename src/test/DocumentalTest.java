package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Documental;
import Model.Investigador;

public class DocumentalTest {

    @Test
    void testAgregarInvestigador() {

        Documental documental =
                new Documental(
                        "Cosmos",
                        45,
                        "Science",
                        "Astronomy"
                );

        Investigador investigador =
                new Investigador(
                        "Carl Sagan",
                        60,
                        30
                );

        documental.agregarInvestigador(
                investigador
        );

        assertEquals(
                1,
                documental.getInvestigador().size()
        );
    }

    @Test
    void testTemaDocumental() {

        Documental documental =
                new Documental(
                        "Cosmos",
                        45,
                        "Science",
                        "Astronomy"
                );

        assertEquals(
                "Astronomy",
                documental.getTema()
        );
    }
}