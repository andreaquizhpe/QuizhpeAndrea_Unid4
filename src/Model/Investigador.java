package Model;

public class Investigador {
	private String nombre;
	private int edad;
	private double aniosExperiencia;
	
	public Investigador(String nombre, int edad, double aniosExperiencia) {
		this.nombre = nombre;
		this.edad = edad;
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(double aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	

}
