package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTotalFactura() {
		Factura factura = new Factura();
		Producto prod1 = new Producto("Producto1",2,1);
		Producto prod2 = new Producto("Producto2",3,1);
		factura.meterProducto(prod1);
		factura.meterProducto(prod2);
		
		//EXPECTED
		float esperado = 5;
		//ACTUAL
		float actual = factura.totalFactura();
		
		//ASSERTS
		assertEquals(esperado, actual,"El total de la factura no es el esperado");
		
	}

	@Test
	void testAplicarIva() {
		Factura factura = new Factura();
		Producto prod1 = new Producto("Producto1",2,1);
		Producto prod2 = new Producto("Producto2",3,1);
		factura.meterProducto(prod1);
		factura.meterProducto(prod2);
		float iva = 0.21f;
		//EXPECTED
		float totalConIVAEsperado = 6.05f;
		//ACTUAL
		float totalConIVAActual = factura.aplicarIva(iva);
		
		//ASSERT
		assertEquals(totalConIVAEsperado,totalConIVAActual,"El total de la factura con IVA no es el esperado");
	}

}
