package Controller;

import java.util.ArrayList;

import Exception.ExceptionContenido;
import Interface.Persistencia;
import Model.Documental;
import Model.Pelicula;
import Model.Podcast;
import Model.SerieDeTV;
import Model.Temporada;
import util.ArchivoManager;

public class ControllerSerie implements Persistencia {
	
    private ArrayList<SerieDeTV> series;
    private ArrayList<Temporada> temporadas;

    public ControllerSerie() {
        series = new ArrayList<>();
        temporadas = new ArrayList<>();
    }
    
    // CREAR SERIE
    public void crearSerie(
            String titulo,
            int duracion,
            String genero) {

        SerieDeTV serie = new SerieDeTV(
                titulo,
                duracion,
                genero
        );

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
        Temporada t1 = new Temporada(
                "Temporada 1",
                1,
                10
        );

        Temporada t2 = new Temporada(
                "Temporada 2",
                2,
                8
        );

        serie.getTemporadas().add(t1);
        serie.getTemporadas().add(t2);

        temporadas.add(t1);
        temporadas.add(t2);

        series.add(serie);

        System.out.println(
                "Serie creada correctamente."
        );
    }
    public void mostrarContenidos()
            throws ExceptionContenido {

        if (series.isEmpty()) {
            throw new ExceptionContenido(
                    "No existen contenidos registrados."
            );
        }

       
        for (SerieDeTV s : series) {
            s.mostrarDetalles();
            System.out.println();
        }

 
    }
	@Override
	public void guardarDatos() {
		// TODO Auto-generated method stub

        ArchivoManager.guardarSeries("Archivos/series.csv", series);
        ArchivoManager.guardarTemporadas("Archivos/temporadas.csv", temporadas);

        System.out.println(
                "Datos guardados."
        );
		
	}
	@Override
	public void cargarDatos() {
		// TODO Auto-generated method stub
		series = ArchivoManager.leerSeries("Archivos/series.csv");
        
        temporadas = ArchivoManager.leerTemporadas("Archivos/temporadas.csv");
        

        System.out.println(
                "Datos cargados."
        );
		
	}
    
    
    
    public ArrayList<Temporada> getTemporada() {
		return temporadas;
	}


	public void setTemporada(ArrayList<Temporada> temporada) {
		this.temporadas = temporada;
	}


	public ArrayList<SerieDeTV> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<SerieDeTV> setSeries) {

        this.series = series;
    }

}
