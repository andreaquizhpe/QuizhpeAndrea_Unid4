package Model;

import Interface.ExportableCSV;

public class Podcast extends ContenidoAudiovisual implements ExportableCSV {
	
	private String tema;
	private String anfitrion;
	private int numeroEpisodios;

	public Podcast(String titulo, int duracionEnMinutos, String genero, String tema, String anfitrion, int numeroEpisodios) {
		super(titulo, duracionEnMinutos, genero);
		// TODO Auto-generated constructor stub
		this.anfitrion = anfitrion;
		this.numeroEpisodios = numeroEpisodios;
		this.tema = tema;
	}
	@Override
	public String convertirCSV() {

	    return getTitulo() + "," +
	           getDuracionEnMinutos() + "," +
	           getGenero() + "," +
	           getTema() + "," +
	           getAnfitrion() + "," +
	           getNumeroEpisodios();
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getAnfitrion() {
		return anfitrion;
	}

	public void setAnfitrion(String anfitrion) {
		this.anfitrion = anfitrion;
	}

	public int getNumeroEpisodios() {
		return numeroEpisodios;
	}

	public void setNumeroEpisodios(int numeroEpisodios) {
		this.numeroEpisodios = numeroEpisodios;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Anfitrion: " + getAnfitrion());
        System.out.println("Tema: " + getTema());
        System.out.println("Episodios: " + getNumeroEpisodios());
        System.out.println();
		
	}
	public void cambiarTema(String nuevoTema) {
	    this.tema = nuevoTema;
	    System.out.println("El tema del podcast fue actualizado.");
	}

	public void mostrarTema() {
	    System.out.println("Tema del podcast: " + tema);
	}
}
