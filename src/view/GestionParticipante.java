package view;

import model.Integrante;

public class GestionParticipante {

	public static void mostrarMenuParticipantes() {
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
	
	public static Object editarIntegrante() {
		int opc;
		do {
			listarIntegrantes();
			opc = Util.LeerInteger("¿Que integrante quieres editar?: ");
			opc --;
			datosIntegrantes((Principal.coac.getIntegrantes()[opc]));
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
		return null;
	}

	public static Object delIntegrante() {
		int opc;
		do {
			listarIntegrantes();
			opc = Util.LeerInteger("¿cuál quieres borrar?: ");
			opc --;
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
		return null;
	}

	public static void listarIntegrantes() {
		Integrante [] aux = Principal.coac.getIntegrantes();
		System.out.println(aux);		
	}

	public static void addIntegrante() {
		int opc = 1;
		do {
			Integrante i = new Integrante();
			datosIntegrantes(i);
			datosIntegrantes((Principal.coac.getIntegrantes()[opc]));
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}

	public static void datosIntegrantes(Integrante i) {
		String pregunta; 
		String respuesta; 
		int resultado; 
		pregunta = "Nombre" + ( (i.getNombre() == null) ? ": " : "[" + i.getNombre() + "]: ");
		respuesta = Util.LeerString(pregunta);
		if(respuesta.length()>0) i.setNombre(respuesta);
		
		pregunta = "Edad" + ( (i.getEdad() == null) ? ": " : "[" + i.getEdad() + "]: ");
		resultado = Util.LeerInteger(pregunta);
		if(respuesta.length() != 0) i.setEdad(resultado);
		
		pregunta = "Localidad" + ( (i.getLocalidad() == null) ? ": " : "[" + i.getLocalidad() + "]: ");
		respuesta = Util.LeerString(pregunta);
		if(respuesta.length()>0) i.setLocalidad(respuesta);
		
	}
}
