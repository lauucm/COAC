package model;

public abstract class Agrupacion implements Comparable <Agrupacion> {

	
	private String nombre; 
	private String autor; 
	private String autor_musica; 
	private String autor_letras; 
	private String disfraz; 
	
	public Agrupacion() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutor_musica() {
		return autor_musica;
	}

	public void setAutor_musica(String autor_musica) {
		this.autor_musica = autor_musica;
	}

	public String getAutor_letras() {
		return autor_letras;
	}

	public void setAutor_letras(String autor_letras) {
		this.autor_letras = autor_letras;
	}

	public String getDisfraz() {
		return disfraz;
	}

	public void setDisfraz(String disfraz) {
		this.disfraz = disfraz;
	}
	
	public abstract String cantarPresentacion();
	
	public abstract String hacerTipo(); 
	
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", Autor: " + getAutor() + ", Autor de Música: " + getAutor_musica()
				+ ", Autor de Letras: " + getAutor_letras() + ", Tipo: " + getDisfraz();
	}
	
	@Override
	public int compareTo (Agrupacion a) {
		return this.getNombre().compareTo(a.getNombre());
	}
}
