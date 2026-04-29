package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
		// Crear contenidos
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy");
        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");

        Podcast podcast = new Podcast("Tech Talk", 30, "Tecnologia", "Innovacion", "Juan Perez", 20);
      


        VideoYoutube canal = new VideoYoutube("MiCanal", 10, "Educativo", "Tutoriales", "Luis", 1000);
    
        


        //Asociación (Actor - Pelicula)
        Actor a1 = new Actor("Sam Worthington: ", 45);
        Actor a2 = new Actor("Zoe Saldana: ", 40);
        pelicula.agregarActor(a1);
        pelicula.agregarActor(a2);

        //Composición (Serie - Temporada)
        serie.agregarTemporada("Temporada 1", 1, 10);
        serie.agregarTemporada("Temporada 2", 2, 8);

        //Agregación (Documental - Investigador)
        Investigador i1 = new Investigador("Carl Sagan", 60, 30);
        documental.agregarInvestigador(i1);

        
        //Uso de CanalYouTube
       // canal.aumentarSuscriptores(500);
        //Uso del metodo cambiar tema en Podcast
        //podcast.cambiarTema("Ciencia");
      

        //Mostrar todo, uso de metodos de mostrarDetalles de todas las subclases
        pelicula.mostrarDetalles();
        serie.mostrarDetalles();
        documental.mostrarDetalles();
        podcast.mostrarDetalles();
        canal.mostrarDetalles();
    }
}