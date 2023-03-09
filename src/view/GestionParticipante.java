package view;

import model.Integrante;

/**
 * <h2>Clase gestión del participante, se muestra el menu del participante y sus
 * correspondidos métodos</h2>
 * 
 * @author laura
 * @since 09/03/2023
 */
public class GestionParticipante {

	/**
	 * método donde se muestra el menu de los participantes
	 */
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

	/**
	 * método para editar a un integrante, primeramente se muestra el listado para
	 * posteriormente editarlo
	 */
	public static void editarIntegrante() {
		int opc;
		do {
			listarIntegrantes();
			opc = Util.LeerInteger("¿Que integrante quieres editar?: ");
			opc--;
			datosIntegrantes((Principal.coac.getIntegrantes()[opc]));
			if (!Principal.preguntarMas()) {
				opc = 0;
			}
		} while (opc != 0);

	}

	/**
	 * método para eliminar a un integrante, primeramente se muestra el listado para
	 * posteriormente eliminar al deseado
	 */
	public static void delIntegrante() {
		int opc;
		do {
			listarIntegrantes();
			opc = Util.LeerInteger("¿cuál quieres borrar?: ");
			opc--;
			if (!Principal.preguntarMas()) {
				opc = 0;
			}
		} while (opc != 0);
	}

	/**
	 * método para listar a los integrantes
	 */
	public static void listarIntegrantes() {
		Integrante[] aux = Principal.coac.getIntegrantes();
		System.out.println(aux);
	}

	/**
	 * método para añadir a un integrante, primeramente se muestran los datos y
	 * despues se añade lo deseado
	 */
	public static void addIntegrante() {
		int opc = 1;
		do {
			Integrante i = new Integrante();
			datosIntegrantes(i);
			datosIntegrantes((Principal.coac.getIntegrantes()[opc]));
			if (!Principal.preguntarMas()) {
				opc = 0;
			}
		} while (opc != 0);
	}

	/**
	 * método para modificar los datros de un integrante
	 * 
	 * @param i <i>objeto del integrante</i>
	 */
	public static void datosIntegrantes(Integrante i) {
		String pregunta;
		String respuesta;
		int resultado;
		pregunta = "Nombre" + ((i.getNombre() == null) ? ": " : "[" + i.getNombre() + "]: ");
		respuesta = Util.LeerString(pregunta);
		if (respuesta.length() > 0)
			i.setNombre(respuesta);

		pregunta = "Edad" + ((i.getEdad() == null) ? ": " : "[" + i.getEdad() + "]: ");
		resultado = Util.LeerInteger(pregunta);
		if (respuesta.length() != 0)
			i.setEdad(resultado);

		pregunta = "Localidad" + ((i.getLocalidad() == null) ? ": " : "[" + i.getLocalidad() + "]: ");
		respuesta = Util.LeerString(pregunta);
		if (respuesta.length() > 0)
			i.setLocalidad(respuesta);

	}
}
