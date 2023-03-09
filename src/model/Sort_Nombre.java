package model;

import java.util.Comparator;

/**
 * <h2>Clase sort_Nombre, usada para comparar los nombres de las
 * agrupaciones</h2>
 * 
 * @author laura
 * @since 08/03/2023
 */
public class Sort_Nombre implements Comparator<Agrupacion> {

	/**
	 * metodo de comparacion, cuyo objetivo es comparar los nombres de las
	 * agrupaciones
	 * 
	 * @return
	 *         <ul>
	 *         <li>0: los nombres son iguales
	 *         <li>
	 *         <li>1: nombre del autor o1 es mayor que o2
	 *         <li>
	 *         <li>-1: nombre del autor o1 menor que o2
	 *         <li>
	 *         </ul>
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getNombre().compareTo(o2.getNombre());
		}
		return comp;
	}

}
