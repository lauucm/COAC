package view;

import model.Agrupacion;
import model.AgrupacionOficial;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;

/**
 * <h2>Clase gestión del concurso, se muestra el menu del concusro y sus
 * correspondidos métodos</h2>
 * 
 * @author laura
 * @since 09/03/2023
 */
public class GestionConcurso {

	/**
	 * método donde se muestra el menú del concurso
	 */
	public static void mostrarMenuConcurso() {
		Util.Escribir("\n");
		Util.Escribir("┌──────────────────────┐");
		Util.Escribir("│ GESTION DEL CONCURSO │");
		Util.Escribir("└──────────────────────┘");
		Util.Escribir("Concurso:");
		Util.Escribir("  1. Va camino del Falla.");
		Util.Escribir("  2. Hacen el Tipo.");
		Util.Escribir("  3. Canta la Presentación.");
		Util.Escribir("  4. Asignar puntos.");
		Util.Escribir("Listado de agrupaciones participantes:");
		Util.Escribir("  5. Listar todos.");
		Util.Escribir("  6. Listar Chirigotas.");
		Util.Escribir("  7. Listar Coros.");
		Util.Escribir("  8. Listar Cuartetos.");
		Util.Escribir("  9. Listar Comparsas.");
		Util.Escribir("Ordenación del listado:");
		Util.Escribir(" 10. Ordenar por puntos.");
		Util.Escribir(" 11. Ordenar por el nombre.");
		Util.Escribir(" 12. Ordenar por el autor.");
		Util.Escribir(" 13. Ordenar por autor de música/letra.");
	}

	/**
	 * método que lista las agrupaciones oficiales
	 */

	public static void listarOficiales() {
		Agrupacion[] aux = Principal.coac.getAgrupaciones();
		System.out.println(aux);
	}

	/**
	 * método para escoger el tipo de agrupación y se muestra por pantalla el método
	 * hacerTipo de este
	 */
	public static void hacerTipo() {
		int opc;
		String txt;
		Agrupacion[] aux = Principal.coac.getAgrupaciones();
		do {
			listarOficiales();
			opc = Util.LeerInteger("\n¿Cuál quieres?: ");
			opc--;

			switch (aux[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> txt = ((Chirigota) aux[opc]).hacerTipo();
			case "Comparsa" -> txt = ((Comparsa) aux[opc]).hacerTipo();
			case "Coro" -> txt = ((Coro) aux[opc]).hacerTipo();
			case "Cuarteto" -> txt = ((Cuarteto) aux[opc]).hacerTipo();
			default -> txt = "";
			}

			System.out.println("\n" + txt);
			if (!Principal.preguntarMas()) {
				opc = 0;
			}
		} while (opc != 0);
	}

	/**
	 * método para escoger el tipo de agrupación y se muestra por pantalla el método
	 * cantaPresentacion de este
	 */
	public static void cantaPresentacion() {
		int opc;
		String txt;
		Agrupacion[] aux = Principal.coac.getAgrupaciones();
		do {
			listarOficiales();
			opc = Util.LeerInteger("\n¿Cuál quieres?: ");
			opc--;

			switch (aux[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> txt = ((Chirigota) aux[opc]).cantarPresentacion();
			case "Comparsa" -> txt = ((Comparsa) aux[opc]).cantarPresentacion();
			case "Coro" -> txt = ((Coro) aux[opc]).cantarPresentacion();
			case "Cuarteto" -> txt = ((Cuarteto) aux[opc]).cantarPresentacion();
			default -> txt = "";
			}

			System.out.println("\n" + txt);
			if (!Principal.preguntarMas()) {
				opc = 0;
			}
		} while (opc != 0);
	}

	/**
	 * método para escoger una agrupación y se muestra por pantalla sus puntos
	 */
	public static void editarPuntos() {
		int opc;
		Agrupacion[] aux = Principal.coac.getAgrupaciones();
		do {
			System.out.println();
			listarOficiales();
			opc = Util.LeerInteger("¿Cuál editas?: ");
			datoOficial((AgrupacionOficial) (aux[opc - 1]));
			if (!Principal.preguntarMas()) {
				opc = 0;
			}
		} while (opc != 0);
	}

	/**
	 * método para editar los puntos de una agrupación oficial
	 * 
	 * @param a <i>objeto de la agrupación oficial</i>
	 */
	public static void datoOficial(AgrupacionOficial a) {
		String pregunta;
		int respuesta;

		pregunta = "Puntos obtenidos" + ((a.getPuntos() == null) ? ": " : "[" + a.getPuntos() + "]: ");
		respuesta = Util.LeerInteger(pregunta);
		if (respuesta != 0)
			a.setPuntos(respuesta);
	}

	/**
	 * método para ordenar por puntos y listarlo
	 */
	public static void ordernarPunto() {
		Principal.coac.ordenar_por_puntos();
		listarOficiales();
	}

	/**
	 * método para ordenar por nombre de la agrupación y listarlo
	 */
	public static void ordenarNombre() {
		Principal.coac.ordenar_por_nombre();
		listarOficiales();
	}

	/**
	 * método para ordenar por el autor de la agrupación y listarlo
	 */
	public static void ordenarAutor() {
		Principal.coac.ordenar_por_autor();
		listarOficiales();
	}

	/**
	 * método para ordenar por el autor de la música o de la letra y listarlo
	 */
	public static void ordenarMusicaLetra() {
		Principal.coac.ordenar_por_autor_musica_letra();
		listarOficiales();
	}

}
