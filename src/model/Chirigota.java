package model;

/**
 * <h2>Clase Chirigota, un tipo de las agrupaciones oficiales</h2>
 * 
 * @author laura
 * @since 08/03/2023
 */

public class Chirigota extends AgrupacionOficial implements Callejera {

	/**
	 * atributo numero de cuplés de la chirigota
	 */
	private Integer numCuples;

	/**
	 * contructor por defecto
	 */
	public Chirigota() {
		super();
	}

	public Integer getNumCuples() {
		return numCuples;
	}

	public void setNumCuples(Integer numCuples) {
		this.numCuples = numCuples;
	}

	/**
	 * indica que se esta cantando la presentación de la chirigota
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Chirigota " + super.getNombre();
	}

	/**
	 * indica que tipo de disfraz lleva la chirigota
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String hacerTipo() {
		return "La chirigota " + super.getNombre() + " va de " + super.getDisfraz();
	}

	/**
	 * indica que la chirigota ya va caminito del falla
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String caminitoDelFalla() {
		return "La chirigota " + super.getNombre() + " va caminito del falla.";
	}

	/**
	 * indica que chirigota se va a escuchar
	 * 
	 * @return mensaje de especificación
	 */

	@Override
	public String amoAescucha() {
		return "Amo a escucha la chirigota" + super.getNombre();
	}

	/**
	 * método para devolver una cadena de texto de los objetos de la clase chirigora
	 * y respectivas clases madres
	 * 
	 * @return objetos de esta clase y sus madres
	 */
	@Override
	public String toString() {
		return "Chirigota: numero de cuplés= " + numCuples + super.toString();
	}

}
