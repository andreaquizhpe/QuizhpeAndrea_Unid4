package Controller;

import java.util.ArrayList;

import Exception.ExceptionContenido;
import Interface.Persistencia;
import Model.Documental;
import Model.Pelicula;
import Model.Podcast;
import Model.SerieDeTV;
import util.ArchivoManager;

public class ControllerPodcast implements Persistencia{
	
	
    private ArrayList<Podcast> podcasts;
    public ControllerPodcast() {
        podcasts = new ArrayList<>();
    }
 // CREAR PODCAST


    public void crearPodcast(
            String titulo,
            int duracion,
            String genero,
            String tema,
            String anfitrion,
            int episodios) {

        Podcast podcast =
                new Podcast(
                        titulo,
                        duracion,
                        genero,
                        tema,
                        anfitrion,
                        episodios
                );

        podcasts.add(podcast);

        System.out.println(
                "Podcast creado correctamente."
        );
    }
    public void mostrarContenidos()
            throws ExceptionContenido {

        if (podcasts.isEmpty()) {

            throw new ExceptionContenido(
                    "No existen contenidos registrados."
            );
        }

        for (Podcast p : podcasts) {
            p.mostrarDetalles();
            System.out.println();
        }
    }
    
	@Override
	public void guardarDatos() {
		// TODO Auto-generated method stub

        ArchivoManager.guardarPodcasts("Archivos/podcast.csv", podcasts);

        System.out.println(
                "Datos guardados."
        );
		
	}
	@Override
	public void cargarDatos() {
		// TODO Auto-generated method stub
		podcasts = ArchivoManager.leerPodcasts("Archivos/podcast.csv");

        

        System.out.println(
                "Datos cargados."
        );
		
	}
    
    
    public ArrayList<Podcast> getPodcasts() {
        return podcasts;
    }

    public void setPodcasts(
            ArrayList<Podcast> podcasts) {

        this.podcasts = podcasts;
    }
}
