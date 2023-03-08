package model;

/**
 * <h2>Clase Agrupación, se utiliza para crear la agrupacion general</h2>
 * @author laura
 * @since 08/03/2023
 */

public abstract class Agrupacion implements Comparable <Agrupacion> {

	/**
	 * Atributo nombre de la agrupación
	 */
	private String nombre; 
	/**
	 * Atributo autor de la agrupación
	 */
	private String autor; 
	/**
	 * Atributo autor de la música de la agrupación
	 */
	private String autor_musica; 
	/**
	 * Atributo autor de las letras de la agrupación
	 */
	private String autor_letras; 
	/**
	 * Atributo tipo de disfraz de la agrupación
	 */
	private String disfraz; 
	/**
	 * constructor por defecto de la clase
	 */
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
	/**
	 * método abstracto, la implementacion se realizará en las clases hijas
	 * @see Chirigota
	 * @see Comparsa
	 * @see Cuarteto
	 * @see Romancero
	 */
	public abstract String cantarPresentacion();
	/**
	 * método abstracto, la implementación se realizará en las clases hijas
	 * @see Chirigota
	 * @see Comparsa
	 * @see Cuarteto
	 * @see Romancero
	 */
	public abstract String hacerTipo(); 
	
	/**
	 * Para devolver en una cadena de texto los objetos de la clase 
	 * @return objetos de la agrupación
	 */
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", Autor: " + getAutor() + ", Autor de Música: " + getAutor_musica()
				+ ", Autor de Letras: " + getAutor_letras() + ", Tipo: " + getDisfraz();
	}
	/**
	 * método para comparar los nombres de las agrupaciones
	 */
	@Override
	public int compareTo (Agrupacion a) {
		return this.getNombre().compareTo(a.getNombre());
	}
}
