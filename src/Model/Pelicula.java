/**
 * Class Pelicula
 */
package Model;

import java.util.*;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    
    //Relacion con Pelicula por asociacion
    private List<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<Actor>();
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + getEstudio());
        System.out.print("Actores: ");
        mostrarActores();
        System.out.println();
    }
    //metodo para agregar actores
    public void agregarActor(Actor actor) {
    	if (!actores.contains(actor)) {
    		actores.add(actor);
		}else
			System.out.println("El actor ya existe");
    	
    }
    //Metodo para mostrar la lista de actores de la pelicula
    public void mostrarActores() {
    	for (Actor actor: actores) {
    		System.out.println(actor.getNombre() + actor.getEdad());
			
		}
    }
}