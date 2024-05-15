package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	/*
	 * Este test nos comprueba la creación de un producto
	 */
	@Test
	void testProducto() {
		Producto producto = new Producto("producto1",2f,4);
		
		//EXPECTED
		String expectedNombre = "producto1";
		float expectedPrecio = 2f;
		int expectedCantidad = 4;
		//ACTUAL
		String actualNombre = producto.getNombre();
		float actualPrecio = producto.getPrecio();
		int actualCantidad = producto.getCantidad();
		//ASSERT
		assertEquals(expectedNombre, actualNombre, "El nombre del producto no es el esperado");
		assertEquals(expectedPrecio, actualPrecio, "El precio del producto no es el esperado");
		assertEquals(expectedCantidad, actualCantidad, "La cantidad del producto no es el esperado");
	}
	/*
	 * Este test nos comprueba el precio total del producto
	 */
	@Test
	void testPrecioTotal() {
		Producto producto = new Producto("producto1",2,4);
		 //EXPECTED
		float expected = 8f;
		//ACTUAL
		float actual = producto.precioTotal();
		//ASSERTS
		assertEquals(expected, actual, "El precio total del producto no es el esperado");
	}

}
