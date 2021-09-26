package clases;

public class Pregunta {
	
	private String text;
	private Opcion[] opciones;
	
	public Pregunta(String text, Opcion[] opciones) {
		this.text = text;
		this.opciones = opciones;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public Opcion[] getOpciones() {
		return this.opciones;
	}
}
