package View;

import java.util.Scanner;

import Controller.ContenidoController;
import Exception.ExceptionContenido;

public class ViewMenu {
	 private Scanner sc = new Scanner(System.in);
	 private ContenidoController controlador = new ContenidoController();



	    public void iniciar() {

	        int opcion;

	        do {

	            System.out.println("===== MENU =====");
	            System.out.println("1. Crear contenidos");
	            System.out.println("2. Mostrar contenidos");
	            System.out.println("3. Salir");

	            opcion = sc.nextInt();

	            switch(opcion) {

	                case 1:

	                    controlador.cargarDatos();
	                    break;

	                case 2:

	                    try {

	                        controlador.mostrarContenidos();

	                    } catch(ExceptionContenido e) {

	                        System.out.println(e.getMessage());
	                    }

	                    break;
	            }

	        } while(opcion != 3);
	    }

}
