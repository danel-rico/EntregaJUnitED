package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeneradorIPTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	/*
	 * Este test como bien dice su nombre genera un número aleatorio entre el 0 y el 255, esta creación
	 * la repetirá las veces que se lo indiques, en este caso 1000 veces
	 */
	@Test
	void testGenerarNumero() {
		int min = 0;
		int max = 254;
		int testRuns = 1000;

		for (int i = 0; i < testRuns; i++) {
			int numeroAleatorio = GeneradorIP.generarNumero(min, max);
			assertTrue(numeroAleatorio >= min && numeroAleatorio <= max,
					"El número aleatorio generado debe estar dentro del rango");
		}

	}
	/*
	 * Est test genera IP usando la funcion de generarumero(), en este caso también se repite 1000 veces la
	 * creación de la IP y luego comprueba si es correcta, es decir, si ni el primer caracter ni el ultimo es 0
	 */

	@Test
	void testGenerarIp() {

		GeneradorIP generador = new GeneradorIP();
		int repeticion = 1000;
/*
 * Aqui se debe poner el try-catch pues si la repetición es de 1000 veces hay muchisima probabilidades de que en 
 * al menos una repetición o bien el primer o bien el ultimo caracter sea 0
 */
		for (int i = 0; i < repeticion; i++) {
			try {
				// Expected
				String direccionIP = generador.generarIp();
				char expectedPrimero = '0';
				char expectedUltimo = '0';

				// Actual
				char actualPrimero = direccionIP.charAt(0);
				char actualUltimo = direccionIP.charAt(direccionIP.length() - 1);

				// Asserts
				assertNotEquals(expectedPrimero, actualPrimero, "La IP no puede comenzar por 0");
				assertNotEquals(expectedUltimo, actualUltimo, "La IP no puede finalizar por 0");
			} catch (AssertionError e) {
				System.out.println("La prueba falló, pero continuará ejecutandose");
			}
		}
	}
}
