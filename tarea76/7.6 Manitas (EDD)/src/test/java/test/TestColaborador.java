//JOSE ANTONIO FUENTES ORTEGA

package test;

import code.ColaboradorReal;
import auxiliar.Clase;
import auxiliar.Valido;

// Junit
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestColaboradorReal {

	@ParameterizedTest
	@DisplayName("ColaboradorReal: Excepciones")
	@MethodSource("test.TestSourcesAleatorios#argColaboradorRealAleatorios")

	void testColaboradorRealExcepciones(
	    String argNIF,
	    String argNombre,
	    int argTelefono,
	    String argEMail,
	    int argId,
	    ServicioTipos argServicio,
	    Scoring argScoring,
	    double argTarifa,
	    boolean argDisponible) {

//0. Excepciones
	
		ColaboradorReal colaborador = new ColaboradorReal();

    try {colaborador.setNIF(argNIF);}
    catch (IllegalArgumentException exception) {
    if (argNIF == "" || argNIF == null)  assertEquals("Exception: NIF vac�o",exception.getMessage());
    if (!Valido.validarNIF(argNIF)) assertEquals("Exception: NIF incorrecto",exception.getMessage());}

 	try {colaborador.setNombre(argNombre);}
	catch (IllegalArgumentException exception) {
	if (argNombre == "" || argNombre == null)  assertEquals("Exception: Nombre vac�o",exception.getMessage());
  	else if (!Valido.validarNombre(argNombre)) assertEquals("Exception: Nombre incorrecto",exception.getMessage());}	
		
	try {colaborador.setTelefono(argTelefono);}
	catch (IllegalArgumentException exception) {assertEquals("Exception: Telefono incorrecto",exception.getMessage());}

	try {colaborador.setEMail(argEMail);}
    catch (IllegalArgumentException exception) {
    if (argEMail == "" || argEMail == null) 	assertEquals("Exception: eMail vac�o",exception.getMessage());
	else if (!Valido.validarEMail(argEMail)) 	assertEquals("Exception: eMail incorrecto",exception.getMessage());}

	
	try {colaborador.setId(argId);}
	catch (IllegalArgumentException exception) {assertEquals("Exception: Id <= 0",exception.getMessage());}
	
	try {colaborador.setServicio(argServicio);}
    catch (IllegalArgumentException exception) {
    if (argServicio == "" || argServicio == null) 	assertEquals("Exception: servicio vac�o",exception.getMessage());
	else if (!Valido.validarServicio(argServicio)) 	assertEquals("Exception: servicio incorrecto",exception.getMessage());}

	try{colaborador.setScoring(argScoring);}
	catch(IllegalArgumentException exception){
	if (argScoring == "" || argScoring == null) 	assertEquals("Exception: Scoring vac�o",exception.getMessage());
	else if (!Valido.validarScoring(argScoring)) 	assertEquals("Exception: Scoring incorrecto",exception.getMessage());}

	try{colaborador.setTarifa(argTarifa);}catch(
	IllegalArgumentException exception){
	if (argTarifa == "" || argTarifa == null)assertEquals("Exception: Tarifa vac�o", exception.getMessage());
	else if (!Valido.validarTarifa(argTarifa))assertEquals("Exception: Tarifa incorrecto", exception.getMessage());}

	try{colaborador.setDisponible(argDisponible);}catch(
	IllegalArgumentException exception){
	if (argDisponible == "" || argDisponible == null) 	assertEquals("Exception: Disponible vac�o",exception.getMessage());
	else if (!Valido.validarDisponible(argDisponible)) 	assertEquals("Exception: Disponible incorrecto",exception.getMessage());}

	@ParameterizedTest
	@DisplayName("ColaboradorReal: Clase")
	@MethodSource("test.TestSourcesValidos#argColaboradorRealValidos")

	void testColaboradorRealBasico(
	    String argNIF,
	    String argNombre,
	    int argTelefono,
	    String argEMail,
	    int argId,
	    ServicioTipos argServicio,
	    Scoring argScoring,
	    double argTarifa,
	    boolean argDisponible) {

//1. Constructor	
	ColaboradorReal colaborador = new ColaboradorReal(argNIF,argNombre,argTelefono,argEMail, argId, argServicio, argScoring, argTarifa, argDisponible); 
	
//2. Setters -> a trav�s del constructor
//3. Getters
	assertEquals(ColaboradorReal.getNIF(),argNIF);
	assertEquals(ColaboradorReal.getNombre(),argNombre);
	assertEquals(ColaboradorReal.getTelefono(),argTelefono);
	assertEquals(ColaboradorReal.getEMail(),argEMail);
	assertEquals(ColaboradorReal.getId(),argId);
	assertEquals(ColaboradorReal.getServicio(),argServicio);
	assertEquals(ColaboradorReal.getScoring(),argScoring);
	assertEquals(ColaboradorReal.getTarifa(),argTarifa);
	assertEquals(ColaboradorReal.getDisponible(),argDisponible);
			
// 4. toString 		
	assertEquals(ColaboradorReal.toString(),Clase.imprimeClase(Colaborador));
	System.out.println(Colaborador);}