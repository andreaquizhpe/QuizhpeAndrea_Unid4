package util;

import java.util.ArrayList;
import java.io.*;

import Model.Pelicula;

public class ArchivoManager {
	 public static void guardarPeliculas(
	            String ruta,
	            ArrayList<Pelicula> peliculas) {

	        try(PrintWriter pw =
	                    new PrintWriter(
	                            new FileWriter(ruta))) {

	            // encabezado
	            pw.println(
	                    "titulo,duracion,genero,estudio"
	            );

	            for(Pelicula p : peliculas) {

	                pw.println(
	                        p.getTitulo() + "," +
	                        p.getDuracionEnMinutos() + "," +
	                        p.getGenero() + "," +
	                        p.getEstudio()
	                );
	            }

	            System.out.println(
	                    "Peliculas guardadas correctamente."
	            );

	        } catch(IOException e) {

	            System.out.println(
	                    "Error al guardar archivo."
	            );
	        }
	    }
	 public static ArrayList<Pelicula>
	    leerPeliculas(String ruta) {

	        ArrayList<Pelicula> peliculas =
	                new ArrayList<>();

	        try(BufferedReader br =
	                    new BufferedReader(
	                            new FileReader(ruta))) {

	            String linea;

	            // saltar encabezado
	            br.readLine();

	            while((linea = br.readLine()) != null) {

	                String[] datos =
	                        linea.split(",");

	                String titulo = datos[0];

	                int duracion =
	                        Integer.parseInt(
	                                datos[1]);

	                String genero = datos[2];

	                String estudio = datos[3];

	                Pelicula pelicula =
	                        new Pelicula(
	                                titulo,
	                                duracion,
	                                genero,
	                                estudio
	                        );

	                peliculas.add(pelicula);
	            }

	        } catch(IOException e) {

	            System.out.println(
	                    "Error leyendo archivo."
	            );
	        }

	        return peliculas;
	    }

}
