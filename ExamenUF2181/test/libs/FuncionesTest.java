package libs;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libs.Funciones;

class FuncionesTest {

	private static Funciones funciones;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		funciones = new Funciones();
	}
	
	@BeforeEach
	void setUp() throws Exception {
	System.out.println("Iniciando test ...");
	}


	@Test
	void devuelveCentral() {
		assertEquals(5, funciones.devuelveCentral(1, 5, 9));
		assertEquals(5, funciones.devuelveCentral(5, 1, 9));
		assertEquals(5, funciones.devuelveCentral(9, 1, 5));

	}
	
	@Test
	void esBisiesto() {
		assertTrue(funciones.esBisiesto(2024));
		assertFalse(funciones.esBisiesto(2019));
		
	}

	@Test 
	void esCapicua() {
		int array[]= {3,5,6,5,3};
		int array2[]= {2,3,4,5,1};
		assertEquals(true,funciones.esCapicua(array));
		assertEquals(false,funciones.esCapicua(array2));

	}
	
	@Test
	void sumaVectores() {
		int array[]= {1,2,3};
		int array2[]= {4,6,8};
		int suma[]= {5,8,11};
		assertArrayEquals(suma, funciones.suma_vectores(array, array2));
		
		int arrayMalo[] = {1,2,3,4};
		assertThrows(ArithmeticException.class, ()-> funciones.suma_vectores(array, arrayMalo));
	}
}
