package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO
		setUp2();
		assertEquals("No tiene el tamaño esperado", 100, modelo.darTamano());
		
	}

	@Test
	public void testAgregar() 
	{
			// TODO Completar la prueba
			setUp2();
			assertEquals("No tiene el numero de elementos esperados", 100,modelo.darTamano());
			modelo.agregar("prueba");
			assertEquals("No tiene el numero de elementos esperados", 101,modelo.darTamano());
			
	}

	@Test
	public void testBuscar()
	{
		setUp2();
		// TODO Completar la prueba
		assertEquals("No se encontro el objeto esperado","2",modelo.buscar("2") );
		assertEquals("No se encontro el objeto esperado","99",modelo.buscar("99") );
		assertNotNull("El objeto deberia ser distinto de null",modelo.buscar("50"));
	}
	@Test
	public void testEliminar() {
		setUp2();
		// TODO Completar la prueba
		modelo.eliminar(modelo.dardatos().darElemento(0));
		assertNull("el elemento no debería existir", modelo.dardatos().darElemento(0));	
		
		
		
	}

}
