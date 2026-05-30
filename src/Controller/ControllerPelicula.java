package Controller;

import java.util.ArrayList;

import Exception.ExceptionContenido;
import Interface.Persistencia;
import Model.Actor;
import Model.Pelicula;
import util.ArchivoManager;

public class ControllerPelicula implements Persistencia{

    private ArrayList<Pelicula> peliculas;
    private ArrayList<Actor> actores;


    public ControllerPelicula() {

        peliculas = new ArrayList<>();
        actores = new ArrayList<Actor>();

    }

    // ==========================
    // CREAR PELICULA
    // ==========================

    public void crearPelicula(String titulo, int duracion, String genero, String estudio) {

        Pelicula pelicula = new Pelicula(
                titulo,
                duracion,
                genero,
                estudio
        );

        // Actores quemados
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

        actores.add(a1);
        actores.add(a2);
        
        peliculas.add(pelicula);

        System.out.println(
                "Película creada correctamente."
        );
    }

  

    // MOSTRAR


    public void mostrarContenidos()
            throws ExceptionContenido {

        if (peliculas.isEmpty()){

            throw new ExceptionContenido(
                    "No existen contenidos registrados."
            );
        }

        for (Pelicula p : peliculas) {
            p.mostrarDetalles();
            System.out.println();
        }
    }


    // ARCHIVOS

    @Override
    public void guardarDatos() {

        ArchivoManager.guardarPeliculas("Archivos/peliculas.csv", peliculas);
        ArchivoManager.guardarActores("Archivos/actores.csv", actores);

        System.out.println(
                "Datos guardados."
        );
    }
    
    @Override
    public void cargarDatos() {

        peliculas = ArchivoManager.leerPeliculas("Archivos/peliculas.csv");
        
        actores = ArchivoManager.leerActores("Archivos/actores.csv");
        

        System.out.println(
                "Datos cargados."
        );
    }

    // GETTERS Y SETTERS

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(
            ArrayList<Pelicula> peliculas) {

        this.peliculas = peliculas;
    }

	public ArrayList<Actor> getActores() {
		return actores;
	}

	public void setActores(ArrayList<Actor> actores) {
		this.actores = actores;
	}

   
}