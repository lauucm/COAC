package view;

import controller.COAC;
import model.Agrupacion;
import model.AgrupacionOficial;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;

public class GestionConcurso {

	static void mostrarMenuConcurso() {
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
	
	static void caminitoFalla() {
		int opc; 
		String txt; 
		Agrupacion [] aux = Principal.coac.getAgrupaciones();
		do {
			listarOficiales();
			opc = Util.LeerInteger("\n¿Cuál quieres?: ");
			opc--;

			switch(aux[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> txt =  ((Chirigota) aux[opc]).caminitoDelFalla();
			case "Comparsa" -> txt = ((Comparsa) aux[opc]).caminitoDelFalla();
			case "Coro" -> txt = ((Coro) aux[opc]).caminitoDelFalla();
			case "Cuarteto" -> txt= ((Cuarteto) aux[opc]).caminitoDelFalla();
			default -> txt = "";
			}
			
			System.out.println("\n" + txt);
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}

	public static void listarOficiales() {
		Agrupacion [] aux = Principal.coac.getAgrupaciones();
		System.out.println(aux);
	}

	public static void hacerTipo() {
		int opc;
		String txt;
		Agrupacion [] aux = Principal.coac.getAgrupaciones();
		do {
			listarOficiales();
			opc = Util.LeerInteger("\n¿Cuál quieres?: ");
			opc--;
			
			switch(aux[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> txt =((Chirigota) aux[opc]).hacerTipo();
			case "Comparsa" -> txt = ((Comparsa) aux[opc]).hacerTipo();
			case "Coro" -> txt = ((Coro) aux[opc]).hacerTipo();
			case "Cuarteto" -> txt = ((Cuarteto) aux[opc]).hacerTipo();
			default -> txt = "";
			}
			
			System.out.println("\n" + txt);
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}

	public static void cantaPresentacion() {
		int opc;
		String txt;
		Agrupacion [] aux = Principal.coac.getAgrupaciones();
		do {
			listarOficiales();
			opc = Util.LeerInteger("\n¿Cuál quieres?: ");
			opc--;
			
			switch(aux[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> txt = ((Chirigota) aux[opc]).cantarPresentacion();
			case "Comparsa" -> txt = ((Comparsa) aux[opc]).cantarPresentacion();
			case "Coro" -> txt = ((Coro) aux[opc]).cantarPresentacion();
			case "Cuarteto" -> txt = ((Cuarteto) aux[opc]).cantarPresentacion();
			default -> txt = "";
			}
		
			System.out.println("\n" + txt);
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}

	public static void  editarPuntos() {
		int opc;
		Agrupacion [] aux = Principal.coac.getAgrupaciones();
		do {
			System.out.println();
			listarOficiales();
			opc = Util.LeerInteger("¿Cuál editas?: ");
			datoOficial((AgrupacionOficial)(aux[opc - 1]));
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	static void datoOficial(AgrupacionOficial a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Puntos obtenidos" + ( (a.getPuntos() == null) ? ": " : "[" + a.getPuntos() + "]: ");
		respuesta = Util.LeerInteger(pregunta);
		if(respuesta != 0) a.setPuntos(respuesta);
	}

	public static void ordernarPunto() {
		Principal.coac.ordenar_por_puntos();
		listarOficiales();
	}

	public static void ordenarNombre() {
		Principal.coac.ordenar_por_nombre();
		listarOficiales();
	}

	public static void ordenarAutor() {
		Principal.coac.ordenar_por_autor();
		listarOficiales();
	}

	public static void ordenarMusicaLetra() {
		Principal.coac.ordenar_por_autor_musica_letra();
		listarOficiales();
	}

	
}
