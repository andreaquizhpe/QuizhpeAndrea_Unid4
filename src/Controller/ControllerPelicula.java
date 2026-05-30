
package Controller;

import java.util.ArrayList;

import Exception.ExceptionContenido;
import Model.Actor;
import Model.Documental;
import Model.Investigador;
import Model.Pelicula;
import Model.Podcast;
import Model.SerieDeTV;
import util.ArchivoManager;

public class ContenidoController {

    private ArrayList<Pelicula> peliculas;
    private ArrayList<SerieDeTV> series;
    private ArrayList<Documental> documentales;
    private ArrayList<Podcast> podcasts;

    public ContenidoController() {

        peliculas = new ArrayList<>();
        series = new ArrayList<>();
        documentales = new ArrayList<>();
        podcasts = new ArrayList<>();
    }

    public void iniciar() {

        // Crear contenidos
        Pelicula pelicula = new Pelicula(
                "Avatar",
                125,
                "Accion",
                "20th Century Studios"
        );

        SerieDeTV serie = new SerieDeTV(
                "Game of Thrones",
                60,
                "Fantasy"
        );

        Documental documental = new Documental(
                "Cosmos",
                45,
                "Science",
                "Astronomy"
        );

        Podcast podcast = new Podcast(
                "Tech Talk",
                30,
                "Tecnologia",
                "Innovacion",
                "Juan Perez",
                20
        );

        // Asociación Actor - Pelicula
        Actor a1 = new Actor(
                "Sam Worthington",
                45
        );

        Actor a2 = new Actor(
                "Zoe Saldana",
                40
        );

        pelicula.agregarActor(a1);
        pelicula.agregarActor(a2);

        // Composición Serie - Temporada
        serie.agregarTemporada(
                "Temporada 1",
                1,
                10
        );

        serie.agregarTemporada(
                "Temporada 2",
                2,
                8
        );

        // Agregación Documental - Investigador
        Investigador i1 = new Investigador(
                "Carl Sagan",
                60,
                30
        );

        documental.agregarInvestigador(i1);

        // Guardar en listas
        peliculas.add(pelicula);
        series.add(serie);
        documentales.add(documental);
        podcasts.add(podcast);

        System.out.println("Contenidos creados.");
    }

    public void mostrarContenidos()
            throws ExceptionContenido {

        if(peliculas.isEmpty() &&
           series.isEmpty() &&
           documentales.isEmpty() &&
           podcasts.isEmpty()) {

            throw new ExceptionContenido(
                    "No existen contenidos registrados."
            );
        }

        for(Pelicula p : peliculas) {
            p.mostrarDetalles();
        }

        for(SerieDeTV s : series) {
            s.mostrarDetalles();
        }

        for(Documental d : documentales) {
            d.mostrarDetalles();
        }

        for(Podcast p : podcasts) {
            p.mostrarDetalles();
        }
    }

    public void guardarDatos() {

        ArchivoManager.guardarPeliculas(
                "peliculas.csv",
                peliculas
        );
    }

    public void cargarDatos() {

        peliculas =
                ArchivoManager.leerPeliculas(
                        "peliculas.csv"
                );
    }
}
