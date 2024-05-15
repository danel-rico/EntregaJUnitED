/**
 * 
 */
package org.cuatrovientos.dam1.junitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class CadenaTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.junitTesting.Cadena#longitud(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test
	void testLongitud() throws Exception {
		
	    Cadena nuestraCadena=new Cadena();
	    
	    //Expected
	    String cadenaTest="dam";
	    int expected=3;
	    String cadenaVacia=null;
	    Exception expectedException=new Exception("cadena vacia");
	    //Actual
	    int actual=nuestraCadena.longitud(cadenaTest);
	    Exception actualException = null;
	    try {
	        nuestraCadena.longitud(cadenaVacia);
	        } 
	    	catch (Exception e) {
	    		actualException=e;
	    	}

	    //Assert
	    assertEquals(expected,actual,"Longitud de cadena no calculada correctamente");
	    assertEquals(expectedException.getMessage(),actualException.getMessage(),"No hay control de nulos en la cadena");
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.junitTesting.Cadena#vocales(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test
	void testVocales() throws Exception {
		Cadena cadena = new Cadena();
		
		//Expected
		String cadenaTest = "hola";
		int expected = 2;
		String cadenaVacia = null;
		Exception expectedException = new Exception ("cadena vacia");
		//Actual
		int actual = cadena.vocales(cadenaTest);
		Exception actualException = null;
		try {
			cadena.vocales(cadenaVacia);
			}
			catch (Exception e) {
				actualException=e;
		}
		//Assert
		assertEquals(expected,actual,"Cantidad de vocales no calculada correctamente");
	    assertEquals(expectedException.getMessage(),actualException.getMessage(),"No hay control de nulos en la cadena");
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.junitTesting.Cadena#invertir(java.lang.String)}.
	 */
	@Test
	void testInvertir() {
		
		Cadena cadena = new Cadena();
		
		//Expected
		String cadenaEntradaCompleta = "hola";
		String cadenaEntradaVacia = "";
		String cadenaEntradaNula = null;
		String cadenaSalidaCompleta ="aloh";
		String cadenaSalidaVacia = "";
		//String cadenaSalidaNula = null;
		
		//Actual
		String actualCompleta = cadena.invertir(cadenaEntradaCompleta);
		String actualVacia = cadena.invertir(cadenaEntradaVacia);
		String actualNula = cadena.invertir(cadenaEntradaNula);
		
		//Asserts
		assertEquals(cadenaSalidaCompleta, actualCompleta, "Cadenas completas no invertidas correctamente");
		assertEquals(cadenaSalidaVacia, actualVacia,"No se ha tenido en cuenta las cadenas vacías");
		assertNull(actualNula);
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.junitTesting.Cadena#contarLetra(java.lang.String, char)}.
	 * @throws Exception 
	 */
	@Test
	void testContarLetra() throws Exception {
		Cadena cadena = new Cadena();
		
		//Expected
		String cadenaTest = "Buenos dias como estamos";
		char caracter = 'a';
		String cadenaVacia = null;
		int expected = 2;
		Exception expectedException = new Exception ("cadena vacia");
		//Actual
		int actual = cadena.contarLetra(cadenaTest, caracter);
		Exception actualException = null;
		try {
			cadena.contarLetra(cadenaVacia, caracter);
			}
			catch (Exception e) {
				actualException=e;
			}
	
	//Asserts
	assertEquals(expected, actual, "Cantidad de caracteres no calculada correctamente");
    assertEquals(expectedException.getMessage(),actualException.getMessage(),"No hay control de nulos en la cadena");
	}
}
