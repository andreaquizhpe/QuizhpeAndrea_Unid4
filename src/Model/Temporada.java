package Model;

public class Temporada {
	private String nombreTemporada;
	private int numero;
	private int episodios;
	
	Temporada(String nombreTemporada, int numero, int episodio) {
		this.nombreTemporada = nombreTemporada;
		this.numero = numero;
		this.episodios= episodio;
	}

	public String getNombreTemporada() {
		return nombreTemporada;
	}

	public void setNombreTemporada(String nombreTemporada) {
		this.nombreTemporada = nombreTemporada;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	

}
