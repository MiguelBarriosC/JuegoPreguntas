package clases;

public class Opcion {
	
	private String text;
	private boolean valid;
	
	public Opcion(String text, boolean valid) {
		this.text = text;
		this.valid = valid;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
}
