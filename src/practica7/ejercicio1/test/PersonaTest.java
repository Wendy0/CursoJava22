package practica7.ejercicio1.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import practica7.ejercicio1.Alumno;
import practica7.ejercicio1.Persona;
import practica7.ejercicio1.Profesor;

public class PersonaTest {
	
	Persona aVacio;
	Persona aConParametros;
	
	Persona pVacio;
	Persona pConParametros;

	public PersonaTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void setUp() throws Exception{
		
		aVacio = new Alumno();         
		aConParametros = new Alumno("Rodriguez", "Ivan", 8);
		
		pVacio = new Profesor();
		pConParametros = new Profesor("Sanchez", "Nago", "pR37jQN2");
	}
	
	@After
	public void tearDown() throws Exception {
		aVacio = null;
		aConParametros = null;
		
		pVacio = null;
		pConParametros = null;
	}
	
	@Test
	public void testAVacio(){
		assertEquals(null, aVacio.getApellido());
	}
	
	@Test
	public void testAVacio_nombre() {
		assertEquals(null, aVacio.getNombre());
	}
	
	@Test
	public void testEquals_true() {
		Persona a1 = new Alumno();
		assertTrue(aVacio.equals(a1));
	}

	@Test
	public void testEquals_false() {
		Persona a1 = new Alumno("Olivas", "Bart", 2);
		assertFalse(aVacio.equals(a1));
	}
	
	@Test
	public void testEquals_falseOtroObjeto() {
		String s = new String("Hola");
		assertFalse(aVacio.equals(s));
	}
	
	@Test
	public void testEquals_falseNull() {
		assertFalse(aVacio.equals(null));
	}
	
	@Test
	public void testProfesorVacio_apellido() {
		assertEquals(null, ((Profesor)pVacio).getApellido());
	}
	
	@Test
	public void testProfesorVacioEquals_true() {
		Persona p1 = new Profesor();
		assertTrue(pVacio.equals(p1));
	}
	
	@Test
	public void testProfesorVacioEquals_false() {
		Persona ca1 = new Profesor("Jugo","Limon","JFOD");
		assertFalse(pVacio.equals(ca1));
	}

}
