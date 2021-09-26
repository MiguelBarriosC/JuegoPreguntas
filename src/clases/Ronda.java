package clases;

public class Ronda {
	
	private Categoria categoria;
	private Premio premio;
	
	public Ronda(Categoria categoria, Premio premio) {
		this.categoria = categoria;
		this.premio = premio;
	}
	
	public Categoria getCategoria () {
		return this.categoria;
	}
	
	public Premio getPremio () {
		return this.premio;
	}
}
