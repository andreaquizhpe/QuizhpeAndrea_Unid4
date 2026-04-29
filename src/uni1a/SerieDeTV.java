/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
	//relacion con temporada por composicion
    private List<Temporada> temporadas;

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
    
    public void agregarTemporada(String nombre, int numero, int episodios) {
        temporadas.add(new Temporada(nombre, numero, episodios));
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