package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransporteTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	/*
	 * Este test nos comprueba el peso total de la camioneta si no es el esperado fallará
	 */
	@Test
	void testPesoTotal() {
		Camioneta camioneta = new Camioneta();
		Paquete paquete1 = new Paquete("Pamplona", 200);
		Paquete paquete2 = new Paquete("Portugalete", 100);

		camioneta.incluirPaquete(paquete1);
		camioneta.incluirPaquete(paquete2);
		// EXPECTED
		float expectedPesoTotal = 300f;
		// ACTUAL
		float actualPesoTotal = camioneta.pesoTotal();

		// ASSERTS
		assertEquals(expectedPesoTotal, actualPesoTotal, "El peso total de la camioneta no coincide");
	}
	/*
	 * Este test nos compara la distancia de la camioneta con la minima y maxima permitida
	 */
	@Test
	void testRecorrerDistancia() {
		Camioneta camioneta = new Camioneta();
		Paquete paquete1 = new Paquete("Pamplona", 200);
		Paquete paquete2 = new Paquete("Portugalete", 100);

		camioneta.incluirPaquete(paquete1);
		camioneta.incluirPaquete(paquete2);
		// EXPECTED
		int expectedDistanciaMinima = 70;
		int expectedDistanciaMaxima = 100;
		// ACTUAL
		int actualDistancia = camioneta.recorrerDistancia();
		// ASSERT
		assertEquals(true, actualDistancia >= expectedDistanciaMinima && actualDistancia <= expectedDistanciaMaxima,
				"La distancia de la camioneta no coincide");
	}

}
