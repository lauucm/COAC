package view;

import model.Integrante;

public class GestionParticipante {

	
	static Object editarIntegrante() {
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

	static Object delIntegrante() {
		int opc;
		do {
			listarIntegrantes();
			opc = Util.LeerInteger("¿cuál quieres borrar?: ");
			opc --;
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
		return null;
	}

	static void listarIntegrantes() {
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

	private static void datosIntegrantes(Integrante i) {
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
