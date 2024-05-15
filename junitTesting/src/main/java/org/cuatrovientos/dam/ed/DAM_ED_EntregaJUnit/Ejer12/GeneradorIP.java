package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer12;

import java.util.Random;

public class GeneradorIP {
	/*
	 * Devuelve un número entre min y max
	 */
	public static int generarNumero(int min, int max) {
		Random random = new Random();

		int numeroAleatorio = random.nextInt(max - min + 1) + min;

		return numeroAleatorio;
	}

	/*
	 * Devuelve una dirección IP, utilizando el método anterior
	 */
	public String generarIp() {
		int parte1 = GeneradorIP.generarNumero(0, 255);
		int parte2 = GeneradorIP.generarNumero(0, 255);
		int parte3 = GeneradorIP.generarNumero(0, 255);
		int parte4 = GeneradorIP.generarNumero(0, 255);

		String direccionIP = parte1 + "." + parte2 + "." + parte3 + "." + parte4;

		return direccionIP;
	}

}
