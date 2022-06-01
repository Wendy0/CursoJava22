package objetos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import objetos.CajaDeAhorro;
import objetos.Cuenta;
import objetos.CuentaCorriente;

public class CuentaTest {

	Cuenta cueVacia;
	Cuenta cueConParametros;
	
	Cuenta caVacia;
	Cuenta caConParametros;
	
	@Before
	public void setUp() throws Exception{
		
		cueVacia = new CuentaCorriente();         //Hay que crear tipo caja de ahorro y cuenta curriente
		cueConParametros = new CuentaCorriente(200, 100.3f, 200.50f);
		
		caVacia = new CajaDeAhorro();
		caConParametros = new CajaDeAhorro(15, 150, 8.3f);
	}
	
	@After
	public void tearDown() throws Exception {
		cueVacia = null;
		cueConParametros = null;
		
		caVacia = null;
		caConParametros = null;
	}
	
	@Test
	public void testCueVaciaNumero(){
		assertEquals(100, cueVacia.getNumero());
	}
	
	@Test
	public void testCueVaciaSaldo() {
		assertEquals(100, cueVacia.getSaldo(), 0.001);
	}
	
	@Test
	public void testEquals_true() {
		Cuenta c1 = new CuentaCorriente();
		assertTrue(cueVacia.equals(c1));
	}
	
	@Test
	public void testEquals_false() {
		Cuenta c1 = new CuentaCorriente(45,45.3f,60f);
		assertFalse(cueVacia.equals(c1));
	}
	
	@Test
	public void testEquals_falseOtroObjeto() {
		String s = new String("Hola");
		assertFalse(cueVacia.equals(s));
	}
	
	@Test
	public void testEquals_falseNull() {
		assertFalse(cueVacia.equals(null));
	}
	
	@Test
	public void testCajaDeAhorroVacia_interes() {
		assertEquals(10, ((CajaDeAhorro)caVacia).getInteres(),0.001);
	}
	
	@Test
	public void testCajaDeAhorroEquals_true() {
		Cuenta ca1 = new CajaDeAhorro();
		assertTrue(caVacia.equals(ca1));
	}
	
	@Test
	public void testCajaDeAhorroEquals_false() {
		Cuenta ca1 = new CajaDeAhorro(1,1,3);
		assertFalse(caVacia.equals(ca1));
	}
}
