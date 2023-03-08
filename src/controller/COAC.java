package controller;

import java.util.Arrays;
import java.util.Iterator;

import model.*;

public class COAC {

	private Agrupacion[] agrupaciones;
	private Integrante[] integrantes;

	private final static int AGRUPACIONESPORDEFECTO = 20;
	private final static int INTEGRANTESPORDEFECTO = 20;

	public COAC() {
		this(AGRUPACIONESPORDEFECTO);
	}

	public COAC(int tamaño) {
		agrupaciones = new Agrupacion[tamaño];
		integrantes = new Integrante[INTEGRANTESPORDEFECTO];
	}

	public Agrupacion[] getAgrupaciones() {
		return agrupaciones;
	}

	public void setAgrupaciones(Agrupacion[] agrupaciones) {
		this.agrupaciones = agrupaciones;
	}

	public Integrante[] getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(Integrante[] integrantes) {
		this.integrantes = integrantes;
	}

	public boolean inscribirAgrupacion(Agrupacion a) {
		boolean added = false;
		boolean isOk = false;
		// comprobamos que la agrupacion no esta ya incluida
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] != null && agrupaciones[i].equals(a)) {
				isOk = true;
				break;
			}
		}
		// añadimos en el primer hueco null
		if (!isOk) {
			for (int j = 0; j < agrupaciones.length; j++) {
				if (agrupaciones[j] == null) {
					agrupaciones[j] = a;
					added = true;
					break;
				}
			}
		}
		return added;
	}

	public boolean eliminarAgrupacion(Agrupacion a) {
		boolean deleted = false;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] != null && agrupaciones[i].equals(a)) {
				agrupaciones[i] = null;
				deleted = true;
				break;
			}
		}

		return deleted;
	}

	public boolean inscribirIntegrante(Integrante e) {
		boolean added = false;
		boolean isOk = false;
		// comprobamos que la agrupacion no esta ya incluida
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i] != null && integrantes[i].equals(e)) {
				isOk = true;
				break;
			}
		}
		// añadimos en el primer hueco null
		if (!isOk) {
			for (int j = 0; j < integrantes.length; j++) {
				if (integrantes[j] == null) {
					integrantes[j] = e;
					added = true;
					break;
				}
			}
		}
		return added;
	}

	public boolean eliminarIntegrante(Integrante e) {
		boolean deleted = false;
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i] != null && integrantes[i].equals(e)) {
				integrantes[i] = null;
				deleted = true;
				break;
			}
		}

		return deleted;
	}

	public void ordenar_por_nombre() {
		Arrays.sort(agrupaciones, new Sort_Nombre());
	}

	public void ordenar_por_puntos() {
		Arrays.sort(agrupaciones, new Sort_Puntos());
	}

	public void ordenar_por_autor() {
		Arrays.sort(agrupaciones, new Sort_Autor());
	}

	public void ordenar_por_autor_musica_letra() {
		Arrays.sort(agrupaciones, new Sort_Musica_Letra());
	}
	
	public static int numTotalAgrupacionOficial(Agrupacion[] agrupaciones) {
		int cont = 0; 
		for (int i = 0; i < agrupaciones.length; i++) {
			if(agrupaciones[i] instanceof AgrupacionOficial) {
				cont ++; 
			}
		}
		return cont;
	}
	
	public static int numTotalChirigota(Agrupacion[] agrupaciones) {
		int cont = 0; 
		for (int i = 0; i < agrupaciones.length; i++) {
			if(agrupaciones[i] instanceof Chirigota) {
				cont ++; 
			}
		}
		return cont;
	}
	
	public static int numTotalComparsa(Agrupacion[] agrupaciones) {
		int cont = 0; 
		for (int i = 0; i < agrupaciones.length; i++) {
			if(agrupaciones[i] instanceof Comparsa) {
				cont ++; 
			}
		}
		return cont;
	}
	
	public static int numTotalCoro(Agrupacion[] agrupaciones) {
		int cont = 0; 
		for (int i = 0; i < agrupaciones.length; i++) {
			if(agrupaciones[i] instanceof Coro) {
				cont ++; 
			}
		}
		return cont;
	}
	
	public static int numTotalCuarteto(Agrupacion[] agrupaciones) {
		int cont = 0; 
		for (int i = 0; i < agrupaciones.length; i++) {
			if(agrupaciones[i] instanceof Cuarteto) {
				cont ++; 
			}
		}
		return cont;
	}
	
	public static int numTotalRomancero(Agrupacion[] agrupaciones) {
		int cont = 0; 
		for (int i = 0; i < agrupaciones.length; i++) {
			if(agrupaciones[i] instanceof Romancero) {
				cont ++; 
			}
		}
		return cont;
	}

	@Override
	public String toString() {
		return "agrupaciones = " + Arrays.toString(agrupaciones) + ", integrantes= " + Arrays.toString(integrantes);
	}

}
