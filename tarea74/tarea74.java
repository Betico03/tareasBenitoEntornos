//JOSE ANTONIO FUENTES ORTEGA

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class tarea74 {
	
	private Alumno alumno;
	private Profesor profesor = new Profesor();
	
	@ParameterizedTest
	@DisplayName("Aprobados")
	@CsvSource({
		"Pedro Picapiedra,3,6,10",
		"Dora, LaExploradora,10,10,10",
	})
	
	public void testProfesorAprobado(String nombre, String apellido, int notaMates, int notaIngles, int notaLengua) {
		alumno=new Alumno(nombre, apellido, notaMates, notaIngles, notaLengua);
		Assertions.assertTrue(profesor.admitirAlumno(alumno));
	}
	
	
	@ParameterizedTest
	@DisplayName("Suspensos")
	@CsvSource({
		"Pablo M�rmol,1,5,3",
		"Bart Simpson,1,1,1",
	})
	
	public void testProfesorSuspenso(String nombre, String apellido, int notaMates, int notaIngles, int notaLengua) {
		alumno=new Alumno(nombre, apellido, notaMates, notaIngles, notaLengua);
		Assertions.assertFalse(profesor.admitirAlumno(alumno));
	}
}
