package util;

import java.util.ArrayList;

import Controller.ControllerDocumental;
import Controller.ControllerPelicula;
import Controller.ControllerPodcast;
import Controller.ControllerSerie;

import java.io.*;

import Model.*;

public class ArchivoManager {

	private static PrintWriter crearArchivo(String ruta, String encabezado) throws IOException {

		PrintWriter pw = new PrintWriter(new FileWriter(ruta));

		pw.println(encabezado);

		return pw;
	}

	public static void guardarPeliculas(String ruta, ArrayList<Pelicula> peliculas) {

		try (PrintWriter pw = crearArchivo(ruta, "titulo,duracion,genero,estudio")) {

			for (Pelicula p : peliculas) {

				pw.println( p.convertirCSV());
			}

		} catch (IOException e) {

			System.out.println("Error al guardar archivo");
		}
	}

	public static void guardarSeries(String ruta, ArrayList<SerieDeTV> serie) {

		try (PrintWriter pw = crearArchivo(ruta, "titulo,duracion,genero,estudio, temporada")) {
			
			for (SerieDeTV s : serie) {

				pw.println(s.convertirCSV());
			}

			System.out.println("SerieDeTv guardada correctamente.");

		} catch (IOException e) {

			System.out.println("Error al guardar archivo.");
		}
	}

	public static void guardarTemporadas(String ruta, ArrayList<Temporada> temporadas) {

		try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {

			pw.println("nombreTemporada,numero,episodios");

			for (Temporada t : temporadas) {

				pw.println(t.getNombreTemporada() + "," + t.getNumero() + "," + t.getEpisodios());
			}

		} catch (IOException e) {

			System.out.println("Error guardando temporadas");
		}
	}

	public static void guardarActores(String ruta, ArrayList<Actor> actores) {

		try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {

			pw.println("nombre,edad");

			for (Actor a : actores) {

				pw.println(a.getNombre() + "," + a.getEdad());
			}

		} catch (IOException e) {

			System.out.println("Error guardando actores");
		}
	}

	public static void guardarDocumentales(String ruta, ArrayList<Documental> documentales) {

		try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {

			pw.println("titulo,duracion,genero,tema");

			for (Documental d : documentales) {

				pw.println(d.convertirCSV());
			}

		} catch (IOException e) {

			System.out.println("Error guardando documentales");
		}
	}

	public static void guardarInvestigadores(String ruta, ArrayList<Investigador> investigadores) {

		try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {

			pw.println("nombre,edad,aniosExperiencia");

			for (Investigador i : investigadores) {

				pw.println(i.getNombre() + "," + i.getEdad() + "," + i.getAniosExperiencia());
			}

		} catch (IOException e) {

			System.out.println("Error guardando investigadores");
		}
	}

	public static void guardarPodcasts(String ruta, ArrayList<Podcast> podcasts) {

		try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {

			pw.println("titulo,duracion,genero,tema,anfitrion,numeroEpisodios");

			for (Podcast pod : podcasts) {

				pw.println(pod.convertirCSV());
			}

		} catch (IOException e) {

			System.out.println("Error guardando podcasts");
		}
	}

	public static ArrayList<Pelicula> leerPeliculas(String ruta) {

		ArrayList<Pelicula> peliculas = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

			String linea;

			// saltar encabezado
			br.readLine();

			while ((linea = br.readLine()) != null) {

				String[] datos = linea.split(",");

				String titulo = datos[0];

				int duracion = Integer.parseInt(datos[1]);

				String genero = datos[2];

				String estudio = datos[3];

				Pelicula pelicula = new Pelicula(titulo, duracion, genero, estudio);

				peliculas.add(pelicula);
			}

		} catch (IOException e) {

			System.out.println("Error leyendo archivo: " + e.getMessage());
		}

		return peliculas;
	}

	public static ArrayList<SerieDeTV> leerSeries(String ruta) {

		ArrayList<SerieDeTV> series = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

			String linea;

			br.readLine();

			while ((linea = br.readLine()) != null) {

				String[] datos = linea.split(",");

				String titulo = datos[0];
				int duracion = Integer.parseInt(datos[1]);
				String genero = datos[2];

				SerieDeTV serie = new SerieDeTV(titulo, duracion, genero);

				series.add(serie);
			}

		} catch (IOException e) {

			System.out.println("Error leyendo archivo: " + e.getMessage());
		}

		return series;
	}

	public static ArrayList<Temporada> leerTemporadas(String ruta) {

		ArrayList<Temporada> temporadas = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

			String linea;

			br.readLine();

			while ((linea = br.readLine()) != null) {

				String[] datos = linea.split(",");

				String nombre = datos[0];

				int numero = Integer.parseInt(datos[1]);

				int episodios = Integer.parseInt(datos[2]);

				temporadas.add(new Temporada(nombre, numero, episodios));
			}

		} catch (IOException e) {

			System.out.println("Error leyendo temporadas");
		}

		return temporadas;
	}

	public static ArrayList<Actor> leerActores(String ruta) {

		ArrayList<Actor> actores = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

			String linea;

			br.readLine();

			while ((linea = br.readLine()) != null) {

				String[] datos = linea.split(",");

				String nombre = datos[0];
				int edad = Integer.parseInt(datos[1]);

				actores.add(new Actor(nombre, edad));
			}

		} catch (IOException e) {

			System.out.println("Error leyendo actores");
		}

		return actores;
	}

	public static ArrayList<Documental> leerDocumentales(String ruta) {

		ArrayList<Documental> documentales = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

			String linea;

			br.readLine();

			while ((linea = br.readLine()) != null) {

				String[] datos = linea.split(",");

				String titulo = datos[0];

				int duracion = Integer.parseInt(datos[1]);

				String genero = datos[2];

				String tema = datos[3];

				documentales.add(new Documental(titulo, duracion, genero, tema));
			}

		} catch (IOException e) {

			System.out.println("Error leyendo documentales");
		}

		return documentales;
	}

	public static ArrayList<Investigador> leerInvestigadores(String ruta) {

		ArrayList<Investigador> investigadores = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

			String linea;

			br.readLine();

			while ((linea = br.readLine()) != null) {

				String[] datos = linea.split(",");

				String nombre = datos[0];

				int edad = Integer.parseInt(datos[1]);

				double experiencia = Double.parseDouble(datos[2]);

				investigadores.add(new Investigador(nombre, edad, experiencia));
			}

		} catch (IOException e) {

			System.out.println("Error leyendo investigadores");
		}

		return investigadores;
	}

	public static ArrayList<Podcast> leerPodcasts(String ruta) {

		ArrayList<Podcast> podcasts = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

			String linea;

			br.readLine();

			while ((linea = br.readLine()) != null) {

			    System.out.println("LINEA LEIDA: [" + linea + "]");

			    String[] datos = linea.split(",");

			    System.out.println("Campos encontrados: " + datos.length);

			    for (int i = 0; i < datos.length; i++) {
			        System.out.println(i + ": " + datos[i]);
			    }

			    podcasts.add(
			        new Podcast(
			            datos[0],
			            Integer.parseInt(datos[1]),
			            datos[2],
			            datos[3],
			            datos[4],
			            Integer.parseInt(datos[5])
			        )
			    );
			}
		} catch (IOException e) {

			System.out.println("Error leyendo podcasts");
		}

		return podcasts;
	}

	public void cargarDatos(ControllerPelicula contrPel, ControllerSerie contrSer, ControllerDocumental contrDoc,
			ControllerPodcast contrPod) {

		contrPel.setPeliculas(leerPeliculas("Archivos/peliculas.csv"));

		contrSer.setSeries(leerSeries("Archivos/series.csv"));

		contrDoc.setDocumentales(leerDocumentales("Archivos/documentales.csv"));

		contrPod.setPodcasts(leerPodcasts("Archivos/podcast.csv"));

		contrPel.setActores(leerActores("Archivos/actores.csv"));

		contrDoc.setInvestigador(leerInvestigadores("Archivos/investigadores.csv"));

		contrSer.setTemporada(leerTemporadas("Archivos/temporadas.csv"));

	}

	public void guardarDatos(ControllerPelicula contrPel, ControllerSerie contrSer, ControllerDocumental contrDoc,
			ControllerPodcast contrPod) {
		File carpeta = new File("Archivos");
		
		if (!carpeta.exists()) {
	        carpeta.mkdir();
	    }

		guardarPeliculas("Archivos/peliculas.csv", contrPel.getPeliculas());

		guardarSeries("Archivos/series.csv", contrSer.getSeries());

		guardarDocumentales("Archivos/documentales.csv", contrDoc.getDocumentales());

		guardarPodcasts("Archivos/podcast.csv", contrPod.getPodcasts());

		guardarActores("Archivos/actores.csv", contrPel.getActores());

		guardarInvestigadores("Archivos/investigadores.csv", contrDoc.getInvestigador());

		guardarTemporadas("Archivos/temporadas.csv", contrSer.getTemporada());

	}

}
