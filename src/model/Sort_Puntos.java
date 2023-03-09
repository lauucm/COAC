package model;

import java.util.Comparator;

/**
 * <h2>Clase sort_puntos, usada para comparar los puntos de las agrupaciones
 * oficiales</h2>
 * 
 * @author laura
 * @since 08/03/2023
 */
public class Sort_Puntos implements Comparator<Agrupacion> {
	/**
	 * metodo de comparacion, cuyo objetivo es comparar los nombres de las
	 * agrupaciones
	 * 
	 * @return
	 *         <ul>
	 *         <li>0: los puntos son iguales
	 *         <li>
	 *         <li>1: puntos o1 es mayor que o2
	 *         <li>
	 *         <li>-1: puntos o1 menor que o2
	 *         <li>
	 *         </ul>
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			if (o1 instanceof AgrupacionOficial && o2 instanceof AgrupacionOficial) {
				comp = ((AgrupacionOficial) o1).getPuntos().compareTo(((AgrupacionOficial) o2).getPuntos());
			}
		}
		return comp;
	}

}
