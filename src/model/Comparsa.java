package model;

/**
 * <h2>Clase Comparsa, un tipo de las agrupaciones oficiales</h2>
 * 
 * @author laura
 * @since 08/03/2023
 */

public class Comparsa extends AgrupacionOficial implements Callejera{

	/**
	 * atributo empresa atrezzo de la comparsa
	 */
	private String empresaAtrezzo; 
	/**
	 * método constructor por defecto
	 */
	public Comparsa () {
		
	}

	public String getEmpresaAtrezzo() {
		return empresaAtrezzo;
	}

	public void setEmpresaAtrezzo(String empresaAtrezzo) {
		this.empresaAtrezzo = empresaAtrezzo;
	}
	/**
	 * indica que se esta cantando la presentación de la comparsa
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Comparsa" + super.getNombre();
	}
	/**
	 * indica que tipo de disfraz lleva la comparsa
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String hacerTipo() {
		return "La comparsa " + super.getNombre() + " va de " + super.getDisfraz();
	}
	/**
	 * indica que la comparsa ya va caminito del falla
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String caminitoDelFalla() {
		return "La comparsa " + super.getNombre()+ " va caminito del falla.";
	}
	/**
	 * indica que comparsa se va a escuchar
	 * 
	 * @return mensaje de especificación
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escucha la comparsa" + super.getNombre();
	}
	

}
