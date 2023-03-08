package view;

import java.util.Scanner;

public class Util {

	public static String LeerDato(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		System.out.print(pregunta);
		respuesta = (teclado.nextLine());
		return respuesta;
	}

	// Metodo para leer un dato double

	public static double LeerDouble(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		double respuesta;
		System.out.print(pregunta);
		respuesta = Double.parseDouble(teclado.nextLine());
		return respuesta;

	}

	// Metodo para leer Integer

	public static int LeerInteger(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		Integer respuesta;
		System.out.print(pregunta);
		respuesta = Integer.parseInt(teclado.nextLine());
		return respuesta;
	}

	// Metodo para leer un String

	static String LeerString(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		System.out.print(pregunta);
		respuesta = teclado.nextLine();
		return respuesta;
	}

	// Metodo para leer un String

	static String leerChar(char pregunta) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		System.out.print(pregunta);
		respuesta = teclado.nextLine();
		return respuesta;
	}

	// Metodo para escribir

	static void Escribir(String mensaje) {
		System.out.println(mensaje);

	}

	public static void leerArraysDouble(double[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i] = Util.LeerDouble("Indicame un numero " + (i + 1) + "-" + n.length + ": ");
		}

	}

	public static void mostrarArraysDouble(double[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

	public static void leerArraysInt(int[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i] = Util.LeerInteger("Indicame un numero " + (i + 1) + "-" + n.length + ": ");
		}
	}

	public static void leerArraysInteger(Integer[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i] = Util.LeerInteger("Indicame un numero " + (i + 1) + "-" + n.length + ": ");
		}
	}

	public static void mostrarArraysInt(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

	public static void mostrarArraysInteger(Integer[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

	public static void ordenarArray(int[] v) {
		int temp;
		for (int i = 0; i < v.length; i++) {
			for (int j = i + 1; j < v.length; j++) {
				if (v[i] < v[j]) {
					temp = v[i];
					v[i] = v[j];
					v[j] = temp;
				}
			}
		}
	}

	public static void combinarVectores(int[] a, int[] b, int[] c) {
		int posA = 0, posB = 0, posC = 0;

		while (posA < a.length && posB < b.length) {
			if (a[posA] < b[posB])
				c[posC++] = a[posA++];
			else
				c[posC++] = b[posB++];
		}

		while (posA < a.length) {
			c[posC++] = a[posA++];
		}

		while (posB < b.length) {
			c[posC++] = b[posB++];
		}
	}

	public static int aleatorio(int n1) {
		int aleatorio = (int) (Math.random() * n1 + 1);
		return aleatorio;
	}

}
