package model;

/**
 * <h2>Clase Cuarteto, un tipo de las agrupaciones oficiales</h2>
 * 
 * @author laura
 * @since 09/03/2023
 */
public class Integrante {
	/**
	 * atributo estático numero de participantes de integrantes
	 */
	private static Integer numeroParticipante;
	/**
	 * atributo nombre del integrante
	 */
	private String nombre;
	/**
	 * atributo edad del integrante
	 */
	private Integer edad;
	/**
	 * atributo localidad del integrante
	 */
	private String localidad;

	/**
	 * metodo constructor por defecto
	 */
	public Integrante() {

	}

	public static Integer getNumeroParticipante() {
		return numeroParticipante;
	}

	public static void setNumeroParticipante(Integer numeroParticipante) {
		Integrante.numeroParticipante = numeroParticipante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * método para devolver una cadena de texto de los objetos de la clase
	 * integrante
	 * 
	 * @return objetos de esta clase
	 */
	@Override
	public String toString() {
		return "Integrante: Nombre= " + getNombre() + ", Edad= " + getEdad() + ", Localidad= " + getLocalidad();
	}

}
