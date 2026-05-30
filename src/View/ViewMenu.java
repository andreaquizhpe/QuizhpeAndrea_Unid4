package View;

import java.util.Scanner;

import Controller.ControllerDocumental;
import Controller.ControllerPelicula;
import Controller.ControllerPodcast;
import Controller.ControllerSerie;
import Exception.ExceptionContenido;

public class ViewMenu {

    private Scanner sc = new Scanner(System.in);

    private ControllerPelicula controladorPelicula =
            new ControllerPelicula();

    private ControllerSerie controladorSerie =
            new ControllerSerie();

    private ControllerDocumental controladorDocumental =
            new ControllerDocumental();

    private ControllerPodcast controladorPodcast =
            new ControllerPodcast();

    public void iniciar() {

        int opcion;

        do {

            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Crear película");
            System.out.println("2. Crear serie");
            System.out.println("3. Crear documental");
            System.out.println("4. Crear podcast");
            System.out.println("5. Mostrar películas");
            System.out.println("6. Mostrar series");
            System.out.println("7. Mostrar documentales");
            System.out.println("8. Mostrar podcasts");
            System.out.println("9. Guardar datos");
            System.out.println("10. Cargar datos");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

            case 1:
                crearPelicula();
                break;

            case 2:
                crearSerie();
                break;

            case 3:
                crearDocumental();
                break;

            case 4:
                crearPodcast();
                break;

            case 5:
                mostrarPeliculas();
                break;

            case 6:
                mostrarSeries();
                break;

            case 7:
                mostrarDocumentales();
                break;

            case 8:
                mostrarPodcasts();
                break;

            case 9:
                guardarDatos();
                break;

            case 10:
                cargarDatos();
                break;

            case 11:
                System.out.println("Programa finalizado.");
                break;

            default:
                System.out.println("Opción inválida.");
            }

        } while (opcion != 11);

        sc.close();
    }

    private void crearPelicula() {

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Duración: ");
        int duracion = sc.nextInt();
        sc.nextLine();

        System.out.print("Género: ");
        String genero = sc.nextLine();

        System.out.print("Estudio: ");
        String estudio = sc.nextLine();

        controladorPelicula.crearPelicula(
                titulo,
                duracion,
                genero,
                estudio);
    }

    private void crearSerie() {

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Duración: ");
        int duracion = sc.nextInt();
        sc.nextLine();

        System.out.print("Género: ");
        String genero = sc.nextLine();

        controladorSerie.crearSerie(
                titulo,
                duracion,
                genero);
    }

    private void crearDocumental() {

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Duración: ");
        int duracion = sc.nextInt();
        sc.nextLine();

        System.out.print("Género: ");
        String genero = sc.nextLine();

        System.out.print("Tema: ");
        String tema = sc.nextLine();

        controladorDocumental.crearDocumental(
                titulo,
                duracion,
                genero,
                tema);
    }

    private void crearPodcast() {

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Duración: ");
        int duracion = sc.nextInt();
        sc.nextLine();

        System.out.print("Género: ");
        String genero = sc.nextLine();

        System.out.print("Tema: ");
        String tema = sc.nextLine();

        System.out.print("Anfitrión: ");
        String anfitrion = sc.nextLine();

        System.out.print("Número de episodios: ");
        int episodios = sc.nextInt();
        sc.nextLine();

        controladorPodcast.crearPodcast(
                titulo,
                duracion,
                genero,
                tema,
                anfitrion,
                episodios);
    }

    private void mostrarPeliculas() {

        try {
            controladorPelicula.mostrarContenidos();
        } catch (ExceptionContenido e) {
            System.out.println(e.getMessage());
        }
    }

    private void mostrarSeries() {

        try {
            controladorSerie.mostrarContenidos();
        } catch (ExceptionContenido e) {
            System.out.println(e.getMessage());
        }
    }

    private void mostrarDocumentales() {

        try {
            controladorDocumental.mostrarContenidos();
        } catch (ExceptionContenido e) {
            System.out.println(e.getMessage());
        }
    }

    private void mostrarPodcasts() {

        try {
            controladorPodcast.mostrarContenidos();
        } catch (ExceptionContenido e) {
            System.out.println(e.getMessage());
        }
    }

    private void guardarDatos() {

        controladorPelicula.guardarDatos();
        controladorSerie.guardarDatos();
        controladorDocumental.guardarDatos();
        controladorPodcast.guardarDatos();

        System.out.println("Todos los datos fueron guardados.");
    }

    private void cargarDatos() {

        controladorPelicula.cargarDatos();
        controladorSerie.cargarDatos();
        controladorDocumental.cargarDatos();
        controladorPodcast.cargarDatos();

        System.out.println("Todos los datos fueron cargados.");
    }
}