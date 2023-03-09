package model;

import java.util.Comparator;

/**
 * <h2>Clase sort_autor, usada para comparar los nombres de autor de las
 * agrupaciones</h2>
 * 
 * @author laura
 * @since 08/03/2023
 */

public class Sort_Autor implements Comparator<Agrupacion> {

	/**
	 * metodo de comparacion, cuyo objetivo es comparar los nombres de autor
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
			comp = o1.getAutor().compareTo(o2.getAutor());
		}
		return comp;
	}

}
