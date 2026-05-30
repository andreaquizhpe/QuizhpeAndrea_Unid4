package Controller;

import java.util.ArrayList;

import Exception.ExceptionContenido;
import Interface.Persistencia;
import Model.Documental;
import Model.Investigador;
import util.ArchivoManager;


public class ControllerDocumental implements Persistencia {
   
	private ArrayList<Documental> documentales;
	private ArrayList<Investigador> investigadores;

    public ControllerDocumental() {

        documentales = new ArrayList<>();
        investigadores = new ArrayList<>();

    }
 // CREAR DOCUMENTAL


    public void crearDocumental(String titulo, int duracion,String genero,String tema) {

        Documental documental =
                new Documental(
                        titulo,
                        duracion,
                        genero,
                        tema
                );

        Investigador investigador =
                new Investigador(
                        "Carl Sagan",
                        60,
                        30
                );

        documental.agregarInvestigador(
                investigador
        );

        investigadores.add(
                investigador
        );

        documentales.add(
                documental
        );

        System.out.println(
                "Documental creado correctamente."
        );
    }
    public void mostrarContenidos()
            throws ExceptionContenido {

        if (documentales.isEmpty()) {

            throw new ExceptionContenido(
                    "No existen contenidos registrados."
            );
        }

        for (Documental d : documentales) {
            d.mostrarDetalles();
            System.out.println();
        }

    }
    
    public ArrayList<Documental> getDocumentales() {
        return documentales;
    }

    public void setDocumentales(
            ArrayList<Documental> documentales) {

        this.documentales = documentales;
    }


	public ArrayList<Investigador> getInvestigador() {
		return investigadores;
	}


	public void setInvestigador(ArrayList<Investigador> investigador) {
		this.investigadores = investigador;
	}
	@Override
	public void guardarDatos() {
		// TODO Auto-generated method stub

        ArchivoManager.guardarDocumentales("Archivos/documentales.csv", documentales);
        ArchivoManager.guardarInvestigadores("Archivos/investigadores.csv", investigadores);

        System.out.println(
                "Datos guardados."
        );
		
	}
	@Override
	public void cargarDatos() {
		// TODO Auto-generated method stub
		documentales = ArchivoManager.leerDocumentales("Archivos/documentales.csv");
        
        investigadores = ArchivoManager.leerInvestigadores("Archivos/investigadores.csv");
        

        System.out.println(
                "Datos cargados."
        );
		
	}
    
}
