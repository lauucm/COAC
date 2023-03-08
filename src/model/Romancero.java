package model;

/**
 * <h2>Clase Romancero, un tipo de las agrupaciones</h2>
 * 
 * @author laura
 * @since 08/03/2023
 */

public class Romancero extends Agrupacion implements Callejera {

	/**
	 * atributo temática del romancero
	 */
	private String tematica;

	/**
	 * metodo constructor por defecto
	 */
	public Romancero() {

	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	/**
	 * indica que se esta cantando la presentación de el romancero
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Romancero " + super.getNombre();
	}
	/**
	 * indica que tipo de disfraz lleva el romancero
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String hacerTipo() {
		return "El romancer " + super.getNombre() + " va de " + super.getDisfraz();
	}
	/**
	 * indica que Romancero se va a escuchar
	 * 
	 * @return mensaje de especificación
	 */

	@Override
	public String amoAescucha() {
		return "Amo a escucha el romancero " + super.getNombre();
	}

	/**
	 * método para devolver una cadena de texto de los objetos de la clase romancero
	 * y sus respectivas clases madres
	 * 
	 * @return objetos de esta clase y sus madres
	 */
	@Override
	public String toString() {
		return "Romancero: tematica= " + tematica + super.toString();
	}
	
	

}
