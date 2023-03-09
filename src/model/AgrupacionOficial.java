package model;

import java.util.Arrays;
import java.util.Iterator;

/**
 * <h2>Clase Agrupación oficial, heredera de la clase agrupación</h2>
 * <h2>Se utiliza para las agrupaciones oficiales</h2>
 * 
 * @author laura
 * @since 08/03/2023
 */

public abstract class AgrupacionOficial extends Agrupacion {

	/**
	 * atributo puntos de la agrupación oficial
	 */
	private Integer puntos;
	/**
	 * Atributo participante de la agrupación oficial
	 */
	private Integrante[] participante;

	/**
	 * constructor por defecto
	 */
	public AgrupacionOficial() {
		super();
		participante = new Integrante[10];
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	/**
	 * método para insertar un nuevo integrante, primero se comprueba que el
	 * integrante no esta ya incluido, para posteriormente añadirlo
	 * 
	 * @param i <i>objerto del integrante</i>
	 * @return
	 *         <ul>
	 *         <li>true: se añade el integrante</li>
	 *         <li>false: no se añade el integrante</li>
	 *         </ul>
	 */
	public boolean insertarIntegrante(Integrante i) {
		boolean added = false;
		boolean isOk = false;

		// Comprobamos que el integrante no esta ya incluido
		for (int x = 0; x < participante.length; x++) {
			if (participante[x] != null && participante[x].equals(i)) {
				isOk = true;
				break;
			}
		}

		// Lo añadimos en el primer hueco null
		if (!isOk) {
			for (int j = 0; j < participante.length; j++) {
				if (participante[j] == null) {
					participante[j] = i;
					break;
				}
			}
		}

		return added;
	}

	/**
	 * método para eliminar un integrante
	 * 
	 * @param i <i>objeto del integrante</i>
	 * @return
	 *         <ul>
	 *         <li>true: se elimina el integrante</li>
	 *         <li>false: no se elimina el integrante</li>
	 *         </ul>
	 */

	public boolean eliminatIntegrante(Integrante i) {
		boolean deleted = false;

		for (int j = 0; j < participante.length; j++) {
			if (participante[j] != null && participante[j].equals(i)) {
				participante[j] = null;
				deleted = true;
				break;

			}
		}

		return deleted;
	}

	/**
	 * método abstracto, la implementación se realizara en las clases hijas
	 * 
	 * @see Coro
	 * @see Cuarteto
	 * @see Chirigota
	 * @see Comparsa
	 */
	public abstract String caminitoDelFalla();

	

	/**
	 * metodo para devolver una cadena de texto de de los objetos de la clase
	 * agrupación oficial y su clase madre
	 * 
	 * @return objetos de la agrupación y la agrupación oficial
	 */
	@Override
	public String toString() {
		return "AgrupacionOficial: puntos= " + puntos + ", participante= " + Arrays.toString(participante) + super.toString();
	}

}
