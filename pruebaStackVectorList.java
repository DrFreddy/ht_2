import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Clase pruebaStackVectorList:
 * Es la encargada de ejecutar todas las pruebas de los métodos
 * generados en StackVectorList
 * Verifica que el funcionamiento de isEmpty sea el correcto
 */
public class pruebaStackVectorList {
	private StackVectorList<Double> pila = new StackVectorList<>();
	private Double val;
/*	
	@Test
	public void testEmpty() {
		
	}*/

	/**
	 * Método testIsEmpty:
	 * Verifica que el funcionamiento de isEmpty sea el correcto
	 */
	@Test
	public void testIsEmpty() {
		assertEquals(true, pila.isEmpty());
	}

	/**
	 * Método testPushPop:
	 * Verifica que el funcionamiento de testPushPop sea el correcto
	 */
	@Test
	public void testPushPop() throws Exception {
		val=1.0;
		pila.push(val);
	    assertEquals(val, pila.pop());
	}
	/**
	 * Método testIsEmpty:
	 * Verifica que el funcionamiento de testSize sea el correcto
	 */
	@Test
	public void testSize() {
		val=1.0;
		pila.push(val);
		pila.push(val);
		assertEquals(2, pila.size());
	}
	/**
	 * Método testIsEmpty:
	 * Verifica que el funcionamiento de testPeek sea el correcto
	 */
	@Test
	public void testPeek() throws Exception {
		val= 8.0;
		pila.push(3.0);
		pila.push(8.0);
		assertEquals(val, pila.peek());
	}
}
