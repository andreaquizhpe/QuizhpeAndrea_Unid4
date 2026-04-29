package uni1a;

public class VideoYoutube extends ContenidoAudiovisual {
	private String tema;
	private String anfitrion;
	private int numeroSuscriptores;
	
	
	public VideoYoutube(String titulo, int duracionEnMinutos, String genero, String tema, String anfitrion, int numeroSuscritores) {
		super(titulo, duracionEnMinutos, genero);
		this.anfitrion = anfitrion;
		this.tema = tema;
		this.numeroSuscriptores = numeroSuscritores;
		// TODO Auto-generated constructor stub
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


	public int getNumeroSuscriptores() {
		return numeroSuscriptores;
	}


	public void setNumeroSuscriptores(int numeroSuscriptores) {
		this.numeroSuscriptores = numeroSuscriptores;
	}
	
	//Añadir el metodo mostrarDetalles
	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del Video de Youtube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println();
		
	}
	public void aumentarSuscriptores(int cantidad) {
	    numeroSuscriptores += cantidad;
	}


		
	

}
