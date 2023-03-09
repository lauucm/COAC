package model;

/**
 * <h2>Clase Coro, un tipo de las agrupaciones oficiales</h2>
 * 
 * @author laura
 * @since 09/03/2023
 */

public class Coro extends AgrupacionOficial{

	/**
	 * atributo numero de bandurrias del coro
	 */
	private Integer num_bandurrias; 
	/**
	 * atributo numero de guitarras del coro
	 */
	private Integer num_guitarras; 
	/**
	 * metodo constructor por defecto
	 */
	public Coro () {
		
	}

	public Integer getNum_bandurrias() {
		return num_bandurrias;
	}

	public void setNum_bandurrias(Integer num_bandurrias) {
		this.num_bandurrias = num_bandurrias;
	}

	public Integer getNum_guitarras() {
		return num_guitarras;
	}

	public void setNum_guitarras(Integer num_guitarras) {
		this.num_guitarras = num_guitarras;
	}

	/**
	 * indica que se esta cantando la presentación del coro
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Coro " + super.getNombre();
	}

	/**
	 * indica que tipo de disfraz lleva el coro
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String hacerTipo() {
		return "El Coro " + super.getNombre() + " va de " + super.getDisfraz();
	}

	/**
	 * indica que el coro ya va caminito del falla
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String caminitoDelFalla() {
		return "El coro " + super.getNombre()+ " va caminito del falla.";
	}
	/**
	 * método para devolver una cadena de texto de los objetos de la clase coro
	 * y sus respectivas clases madres
	 * 
	 * @return objetos de esta clase y sus madres
	 */
	@Override
	public String toString() {
		return "Coro: numero de bandurrias= " + num_bandurrias + ", número de  guitarras= " + num_guitarras + super.toString();
	}
	
	
	
}
