
//JOSE ANTONIO FUENTES ORTEGA

package tarea73;

import grafo.Grafo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

	Grafo grafo = new Grafo();
	

	@Test
	@DisplayName ("Camino 1")
	
	public void testCamino1() {
		assertEquals (grafo.aMethod(true, true, true),1, "Error aMethod - el resultado ha devuelto 1" );
	}
	
	
	@Test
	@DisplayName ("Camino 2")
	
	public void testCamino2() {
		assertEquals (grafo.aMethod(true, false, true),2, "Error aMethod - el resultado ha devuelto 2" );
	}
	

	@Test
	@DisplayName ("Camino 3")
	
	public void testCamino3() {
		assertEquals (grafo.aMethod(false, true, true),2, "Error aMethod - el resultado ha devuelto 2" );
	}
	
	
	@Test
	@DisplayName ("Camino 4")
	
	public void testCamino4 () {
		assertEquals (grafo.aMethod(true, true, false),1, "Error aMethod - el resultado ha devuelto 1" );
	}
	

	@Test
	@DisplayName ("Camino 5")
	
	public void testCamino4 () {
		assertEquals (grafo.aMethod(false, true, false),0, "Error aMethod - el resultado ha devuelto 0" );
	}


	@Test
	@DisplayName ("Camino 6")
	
	public void testCamino4 () {
		assertEquals (grafo.aMethod(false, false, false),0, "Error aMethod - el resultado ha devuelto 0" );
	}
}
