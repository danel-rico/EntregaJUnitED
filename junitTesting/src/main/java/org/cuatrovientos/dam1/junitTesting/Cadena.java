package org.cuatrovientos.dam1.junitTesting;

/**
 * CLASE QUE DA UTILIDADES SOBRE UNA CADENA
 */

public class Cadena {

	/**
	 * Devuelve la longitud de la cadena que se le pasa
	 * 
	 * @param cadena
	 * @return
	 * @throws Exception
	 */
	public int longitud(String cadena) throws Exception {
		if (cadena == null) {
			throw new Exception("cadena vacia");
		}
		return cadena.length();
	}

	/**
	 * Devuelve el número de vocales mínusculas que tiene la cadena
	 * 
	 * @param cadena
	 * @return
	 * @throws Exception
	 */
	public int vocales(String cadena) throws Exception {
		if (cadena == null) {
			throw new Exception("cadena vacia");
		}
		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
				contador++;
			}
		}
		return contador;
	}

	/**
	 * Devuelve la cadena en orden inverso
	 * 
	 * @param cadena
	 * @return
	 */
	public String invertir(String cadena) {
		// TODO
		if (cadena == null) {
			return cadena;
		}
		String reverseString = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {

			reverseString = reverseString + cadena.charAt(i);
		}
		return reverseString;
	}

	/**
	 * Cuenta el número de veces que aparece el caracter que hemos pasado
	 * 
	 * @param cadena
	 * @param caracter
	 * @return
	 * @throws Exception
	 */
	public int contarLetra(String cadena, char caracter) throws Exception {
		if (cadena == null) {
			throw new Exception("cadena vacia");
		}
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				contador++;
			}
		}
		return contador;
	}
}
