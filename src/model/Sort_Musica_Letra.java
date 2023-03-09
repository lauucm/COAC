package model;

import java.util.Comparator;

/**
 * <h2>Clase Sort_Musica_Letra, usada para comparar los nombres del autor de la
 * música y la letra de las agrupaciones</h2>
 * 
 * @author laura
 * @since 08/03/2023
 */

public class Sort_Musica_Letra implements Comparator<Agrupacion> {

	/**
	 * metodo de comparacion, cuyo objetivo es comparar los nombres de autor
	 * 
	 * @return
	 *         <ul>
	 *         <li>0: los nombres de los autores de la música son iguales o autor de
	 *         las letras
	 *         <li>
	 *         <li>1: nombre del autor de la música o1 es mayor que o2, en caso de
	 *         igualdad, el autor de las letras o1 es mayor que o2
	 *         <li>
	 *         <li>-1: nombre del autor de la música o1 menor que o2, en caso de
	 *         igualdad, el autor de las letras o1 menor que o2
	 *         <li>
	 *         </ul>
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getAutor_musica().compareTo(o2.getAutor_musica());
		}
		if (comp == 0) {
			comp = o1.getAutor_letras().compareTo(o2.getAutor_letras());
		}
		return 0;
	}

}
