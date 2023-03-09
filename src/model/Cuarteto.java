package model;

/**
 * <h2>Clase Cuarteto, un tipo de las agrupaciones oficiales</h2>
 * 
 * @author laura
 * @since 09/03/2023
 */
public class Cuarteto extends AgrupacionOficial implements Callejera {

	/**
	 * atributo numero de los miembros del cuarteto
	 */
	private Integer num_miembros;

	/**
	 * metodo contructor por defecto
	 */
	public Cuarteto() {

	}

	public Integer getNum_miembros() {
		return num_miembros;
	}

	public void setNum_miembros(Integer num_miembros) {
		this.num_miembros = num_miembros;
	}

	/**
	 * indica que se esta cantando la presentación del cuarteto
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Cuarteto " + super.getNombre();
	}

	/**
	 * indica que tipo de disfraz lleva el cuarteto
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String hacerTipo() {
		return "El cuarteto " + super.getNombre() + " va de " + super.getDisfraz();
	}

	/**
	 * indica que el cuarteto ya va caminito del falla
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String caminitoDelFalla() {
		return "El cuarteto " + super.getNombre() + " va caminito del falla.";
	}

	/**
	 * indica que cuarteto se va a escuchar
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escucha el cuarteto " + super.getNombre();
	}

	/**
	 * método para devolver una cadena de texto de los objetos de la clase cuarteto
	 * y sus respectivas clases madres
	 * 
	 * @return objetos de esta clase y sus madres
	 */
	@Override
	public String toString() {
		return "Cuarteto: numero de miembros= " + num_miembros + super.toString();
	}

}
