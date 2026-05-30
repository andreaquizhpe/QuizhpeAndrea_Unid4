/**
 * Class SerieDeTV
 */
package Model;

import java.util.ArrayList;
import java.util.List;

import Interface.ExportableCSV;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual implements ExportableCSV{
	//relacion con temporada por composicion
    public List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas= new ArrayList<Temporada>();

    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie De TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: ");
        mostrarTemporada();
        System.out.println();
    }
    
    @Override
    public String convertirCSV() {

        return getTitulo() + "," +
               getDuracionEnMinutos() + "," +
               getGenero();
    }
    
    
    public void agregarTemporada(String nombre, int numero, int episodios) {
        temporadas.add(new Temporada(nombre, numero, episodios));
    }

    
    public List<Temporada> getTemporadas() {
		return temporadas;
	}


	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}


	public int totalTemporadas() {
    	return temporadas.size();
    }
    public void mostrarTemporada() {
    	for (Temporada temp : temporadas) {
            System.out.println("Temporada " + temp.getNumero());
        }
    }
}