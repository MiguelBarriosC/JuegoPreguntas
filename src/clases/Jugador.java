package clases;

public class Jugador {

	private String nombre;
	private int edad;
	private String pais;
	private int premioAcomulado;
	
	public Jugador(String nombre, int edad, String pais) {
		this.nombre = nombre;
		this.edad = edad;
		this.pais = pais;
		this.premioAcomulado = 0;
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getPremioAcomulado() {
		return premioAcomulado;
	}

	public void setPremioAcomulado(int premioAcomulado) {
		this.premioAcomulado += premioAcomulado;
	}
}
