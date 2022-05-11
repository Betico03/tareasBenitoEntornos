//JOSE ANTONIO FUENTES

package tarea75;

import main.Coche;
import main.Combustible;
import main.Etiqueta;
import main.Oficina;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestContaminacion {

	Oficina oficina = new Oficina();
	
	@Nested
	class CochesElectricos{
		
		@Test
		@DisplayName("cochesElectricos")
		public void TestCocheElectrico() {
			Coche cocheElectrico = new Coche(Combustible.ELECTRICO);
			Assertions.assertEquals(Etiqueta.VERDE,oficina.asignaEtiqueta(cocheElectrico));
		}
		
		@Test
		@DisplayName("cochesElectricos con menos potencia")
		public void TestPotenciaMenorE() {
			Coche cocheElectrico = new Coche(Combustible.ELECTRICO,110);
			Assertions.assertEquals(Etiqueta.VERDE,oficina.asignaEtiqueta(cocheElectrico));
		}
		
		@Test
		@DisplayName("cochesElectricos con mas potencia")
		public void TestPotenciaMayorE() {
			Coche cocheElectrico = new Coche(Combustible.ELECTRICO,150);
			Assertions.assertEquals(Etiqueta.VERDE,oficina.asignaEtiqueta(cocheElectrico));
		}
	}
	
	@Nested
	class CochesCombustibles{
		@Test
		@DisplayName("cochesCombustible")
		public void TestCocheFosil() {
			Coche cocheCombustible = new Coche(Combustible.FOSIL);
			Assertions.assertEquals(Etiqueta.ROJA,oficina.asignaEtiqueta(cocheCombustible));
		}
		
		@Test
		@DisplayName("cochesCombustible con menos potencia")
		public void TestPotenciaMenorF() {
			Coche cocheCombustible = new Coche(Combustible.FOSIL,110);
			Assertions.assertEquals(Etiqueta.VERDE,oficina.asignaEtiqueta(cocheCombustible));
		}
		
		@Test
		@DisplayName("cochesCombustible con mas potencia")
		public void TestPotenciaMayorF() {
			Coche cocheCombustible = new Coche(Combustible.FOSIL,150);
			Assertions.assertEquals(Etiqueta.ROJA,oficina.asignaEtiqueta(cocheCombustible));
		}
	}

}
