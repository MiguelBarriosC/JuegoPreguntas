package clases;

public class Categoria {
	private String nombre;
	private int nivelDificultad;
	private Pregunta[] preguntas;
	
	public Categoria(String nombre, int nivelDificultad, Pregunta[] preguntas) {
		this.nombre = nombre;
		this.nivelDificultad = nivelDificultad;
		this.preguntas = preguntas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivelDificultad() {
		return nivelDificultad;
	}

	public void setNivelDificultad(int nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}
	
	public Pregunta[] getPreguntas() {
		return this.preguntas;
	}
}
