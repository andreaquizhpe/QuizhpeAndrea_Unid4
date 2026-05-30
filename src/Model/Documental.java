/**
 * Class Documental
 */
package Model;

import java.util.ArrayList;
import java.util.List;

import Interface.ExportableCSV;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual implements ExportableCSV {
    private String tema;
    
  //relacion con temporada por agregacion
    private List<Investigador> investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador = new ArrayList<Investigador>();
    }
    @Override
    public String convertirCSV() {

        return getTitulo() + "," +
               getDuracionEnMinutos() + "," +
               getGenero() + "," +
               getTema();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + getTema());
        System.out.println("Investigador: ");
        mostrarInvestigadores();
        System.out.println();
    }
    
    public void agregarInvestigador(Investigador i) {
    	investigador.add(i);
    }
    public void mostrarInvestigadores() {
        for (Investigador i : investigador) {
            System.out.print("Nombre: "+i.getNombre());
            System.out.print("Edad: "+i.getEdad());
            System.out.print(" Experiencia: "+i.getAniosExperiencia());
        }
    }
	public List<Investigador> getInvestigador() {
		return investigador;
	}
	public void setInvestigador(List<Investigador> investigador) {
		this.investigador = investigador;
	}

}