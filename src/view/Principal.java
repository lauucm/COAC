package view;

import controller.COAC;
import model.*;

public class Principal {
	
	static final int TOTAL = 20; 
	public static COAC coac = new COAC(TOTAL);

	public static void main(String[] args) {

		Chirigota c1 = new Chirigota();
		c1.setNombre("Los Viñanos");
		c1.setAutor_letras("José Manuel Gomez");
		c1.setAutor_musica("Juan Romero ");
		c1.setAutor("Selu");
		coac.inscribirAgrupacion(c1);
		
		Comparsa c2 = new Comparsa();
		c2.setNombre("Los esclavos");
		c2.setAutor_letras("Paco Alba");
		c2.setAutor_musica("Julio Pardo");
		c2.setAutor("Antonio Martín");
		coac.inscribirAgrupacion(c2);
		
		Coro o5 = new Coro();
		o5.setNombre("Los garabatos");
		o5.setAutor_letras("Manolo y Laura");
		o5.setAutor_musica("Manolo y Laura");
		o5.setAutor("Mónica Moreno");
		coac.inscribirAgrupacion(o5);
		
		
		Cuarteto o7 = new Cuarteto();
		o7.setNombre("Los canijos");
		o7.setAutor_letras("Ivan Romero");
		o7.setAutor_musica("Ivan Romero");
		o7.setAutor("El Cubelo");
		coac.inscribirAgrupacion(o7);
		
		Romancero o9 = new Romancero();
		o9.setNombre("Jose blas");
		o9.setAutor_letras("Jose blas");
		o9.setAutor_musica("Manuel Gomez");
		o9.setAutor("Javier");
		coac.inscribirAgrupacion(o9);
		
		Integrante i1 = new Integrante();
		i1.setEdad(45);
		i1.setLocalidad("Cadiz");
		i1.setNombre("Antonio");
		coac.inscribirIntegrante(i1);
		
		Integrante i2 = new Integrante();
		i2.setEdad(25);
		i2.setLocalidad("Cadiz");
		i2.setNombre("Lolo");
		coac.inscribirIntegrante(i2);
		
		gestionPrograma();
	}
	
	private static void mostrarMenuPrincipal() {
		Util.Escribir("\n");
		Util.Escribir("╔═══════════════════════════════════╗");
		Util.Escribir("║      GESTION DE AGRUPACIONES      ║");
		Util.Escribir("╚═══════════════════════════════════╝");
		Util.Escribir("  1. Gestión de Participantes.");
		Util.Escribir("  2. Añadir una agrupación.");
		Util.Escribir("  3. Eliminar una agrupación.");
		Util.Escribir("  4. Editar datos de una agrupación.");
		Util.Escribir("  5. Gestión del Concurso.");
		Util.Escribir("Listado de agrupaciones:");
		Util.Escribir("  6. Listar todas.");
		Util.Escribir("  7. Listar Chirigotas.");
		Util.Escribir("  8. Listar Coros.");
		Util.Escribir("  9. Listar Cuartetos.");
		Util.Escribir(" 10. Listar Comparsas.");
		Util.Escribir(" 11. Listar Romanceros.");
		Util.Escribir("Ordenar el listado:");
		Util.Escribir(" 12. Ordenar por el nombre.");
		Util.Escribir(" 13. Ordenar por el autor.");
		Util.Escribir(" 14. Ordenar por el autor de música/letra.");
	}
	static void mostrarMenuParticipantes() {
		Util.Escribir("\n");
		Util.Escribir("┌──────────────────────────┐");
		Util.Escribir("│ GESTION DE PARTICIPANTES │");
		Util.Escribir("└──────────────────────────┘");
		Util.Escribir("  1. Añadir un participante.");
		Util.Escribir("  2. Eliminar un participante.");
		Util.Escribir("  3. Editar un participante.");
		Util.Escribir("  4. Listar todos los particpantes.");
		Util.Escribir("  5. Ordenar por nombre.");
	}
	
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
	
	private static void mostrarmenuTipoAgrupaciones() {
		Util.Escribir("\n");
		Util.Escribir("┌───────────────────────┐");
		Util.Escribir("│ TIPOS DE AGRUPACIONES │");
		Util.Escribir("└───────────────────────┘");
		Util.Escribir("  1. Coro.");
		Util.Escribir("  2. Comparsa.");
		Util.Escribir("  3. Chirigota.");
		Util.Escribir("  4. Cuarteto.");
		Util.Escribir("  5. Romancero.");
	}
	

	private static void gestionPrograma() {
		int opc;
		do {
			mostrarMenuPrincipal();
			opc = Util.LeerInteger("Opción [0 - Salir] : ");
			switch (opc) {
			case 1 -> opcionParticipantes();
			case 2 -> addAgrupacion();
			case 3 -> delAgrupacion();
			case 4 -> opcionConcurso();
			case 5 -> listarTodo();
			case 6 -> ordenarNombre();
			case 7 -> ordenarAutor();
			case 8-> ordenarMusicaLetra();
			}
		} while (opc != 0);
		finDelPrograma();
	}


	public static void ordenarNombre() {
		Principal.coac.ordenar_por_nombre();
		listarTodo();
	}
	
	public static void ordenarAutor() {
		Principal.coac.ordenar_por_autor();;
		listarTodo();
	}
	
	public static void ordenarMusicaLetra() {
		Principal.coac.ordenar_por_autor_musica_letra();
		listarTodo();
	}

	public static void opcionConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.LeerInteger("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> GestionConcurso.hacerTipo();
			case 2 -> GestionConcurso.cantaPresentacion();
			case 3 -> GestionConcurso.editarPuntos();
			case 4 -> GestionConcurso.listarOficiales();
			case 5 -> GestionConcurso.ordernarPunto();
			case 6 -> GestionConcurso.ordenarNombre();
			case 7 -> GestionConcurso.ordenarAutor();
			case 8 -> GestionConcurso.ordenarMusicaLetra();
			}
		} while (opc != 0);
	}

	private static Object listarTodo() {
		Agrupacion [] aux = Principal.coac.getAgrupaciones();
		return aux;
	}

	private static Object delAgrupacion() {
		int opc;
		do {
			listarTodo();
			opc = Util.LeerInteger("¿cuál quieres borrar?: ");
			delAgrupacion();
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
		return opc;
	}

	
		static void addAgrupacion() {
			int opc;
			do {
				mostrarmenuTipoAgrupaciones();
				opc = Util.LeerInteger("Opción: ");
				switch (opc) {
				case 1 -> addCoro();
				case 2 -> addComparsa();
				case 3 -> addChirigota();
				case 4 -> addcuarteto();
				case 5 -> addRomancero();
				}
				if(!Principal.preguntarMas()) {opc = 0;};
			} while (opc != 0);
		}
	

	private static void addRomancero() {
			Romancero r = new Romancero (); 
			datosAgrupaciones(r); 
		}

	private static void addcuarteto() {
			Cuarteto cuar = new Cuarteto(); 
			datosAgrupaciones(cuar);
		}

	private static void addChirigota() {
		Chirigota ch = new Chirigota();
		datosAgrupaciones(ch);
		}

	private static void addComparsa() {
			Comparsa comp = new Comparsa (); 
			datosAgrupaciones(comp); 
		}

	private static void addCoro() {
			Coro coro = new Coro (); 
			datosAgrupaciones(coro); 
		}
	
	private static void datosAgrupaciones(Agrupacion a) {
		String pregunta;
		String respuesta;
		
		pregunta = "Nombre" + ( (a.getNombre() == null) ? ": " : "[" + a.getNombre() + "]: ");
		respuesta = Util.LeerString(pregunta);
		if(respuesta.length()>0) a.setNombre(respuesta);
		
		pregunta = "Autor" + ( (a.getAutor() == null) ? ": " : "[" + a.getAutor() + "]: ");
		respuesta = Util.LeerString(pregunta);
		if(respuesta.length()>0) a.setAutor(respuesta);
		
		pregunta = "Autor de la Música" + ( (a.getAutor_musica() == null) ? ": " : "[" + a.getAutor_musica() + "]: ");
		respuesta = Util.LeerString(pregunta);
		if(respuesta.length()>0) a.setAutor_musica(respuesta);
		
		pregunta = "Autor de la Letra" + ( (a.getAutor_letras() == null) ? ": " : "[" + a.getAutor_letras() + "]: ");
		respuesta = Util.LeerString(pregunta);
		if(respuesta.length()>0) a.setAutor_letras(respuesta);
		
		pregunta = "Tipo" + ( (a.getDisfraz() == null) ? ": " : "[" + a.getDisfraz() + "]: ");
		respuesta = Util.LeerString(pregunta);
		if(respuesta.length()>0) a.setDisfraz(respuesta);

	}

	private static Object opcionParticipantes() {
		int opc ; 
		do {
			mostrarMenuParticipantes();
			opc = Util.LeerInteger("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> GestionParticipante.addIntegrante();
			case 2 -> GestionParticipante.delIntegrante();
			case 3 -> GestionParticipante.editarIntegrante();
			case 4 -> GestionParticipante.listarIntegrantes();
			}
		} while (opc != 0);
	
		return null;
	}
	

	private static void finDelPrograma() {
		Util.Escribir("Fin del programa");
	}
	public static boolean preguntarMas() {
		boolean isOk = true;
		String resp = Util.LeerString("\n¿Desea continuar? (S/N): ");
		isOk = (resp.equalsIgnoreCase("s")) ? true : false;
		return isOk;
	}
	
	}


