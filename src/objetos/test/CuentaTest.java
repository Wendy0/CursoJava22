package objetos.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import objetos.CajaDeAhorro;
import objetos.Cuenta;
import objetos.CuentaCorriente;
import objetos.excepciones.SaldoInsuficienteException;

public class CuentaTest {

	Cuenta cueVacia;
	Cuenta cueConParametros;
	
	CajaDeAhorro caVacia;
	CajaDeAhorro caConParametrios;
	
	CuentaCorriente ccVacia;
	CuentaCorriente ccConParametros;
	
	List<Cuenta> listCuentas;
	Set<Cuenta> setCuentas;

	
	@Before
	public void setUp() throws Exception {
		
		//2- se crean los objetos
		cueVacia = new CajaDeAhorro();
		cueConParametros = new CajaDeAhorro(200, 200.50f, 2.3f);
				
		//cajas de ahorro
		caVacia = new CajaDeAhorro();
		caConParametrios = new CajaDeAhorro(15, 150, 8.3f);
		//una lista es ordered  , uno a continuacion del otro
				
		ccVacia = new CuentaCorriente();
		ccConParametros = new CuentaCorriente(20,2000.50f, 3000);

		
		//Una lista es ordered (ordenado según se introduce)
		listCuentas = new ArrayList<Cuenta>();
		
		listCuentas.add(new CajaDeAhorro());
		listCuentas.add(new CuentaCorriente());
		listCuentas.add(new CajaDeAhorro(101, 1000, 3.3f));
		listCuentas.add(new CuentaCorriente(202, 2000, 5000));
		
		//Unordered / se colocan sin orden
		//Es única, no se pueden crear 2 elementos iguales. Utiliza para ello el equals
		//y el hashcode.
		setCuentas = new HashSet<Cuenta>();
		
		setCuentas.add(new CajaDeAhorro());
		setCuentas.add(new CuentaCorriente());
		setCuentas.add(new CajaDeAhorro(101, 1000, 3.3f));
		setCuentas.add(new CuentaCorriente(202, 2000, 5000));
	}
	
	@After
	public void tearDown() throws Exception {
		cueVacia = null;
		cueConParametros = null;
		
		caVacia = null;
		caConParametrios = null;
		listCuentas = null;
		setCuentas = null;
		
		Cuenta.vaciarContador();
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
		Cuenta c1 = new CajaDeAhorro();
		assertTrue(cueVacia.equals(c1));
	}
	@Test
	public void testEquals_false() {
		Cuenta c1 = new CajaDeAhorro(45,45.3f,60f);
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
	@Test
	public void testListContains() {
		System.out.println("cueVacia " + cueVacia);
		System.out.println("La lista: ");
		System.out.println(listCuentas);
		assertTrue(listCuentas.contains(cueVacia));
	}
	@Test
	public void testListacontains_false() {
		CajaDeAhorro ca = new CajaDeAhorro(123, 123, 123);
		assertFalse(listCuentas.contains(ca));
	}
	@Test
	public void testListAdd_true() {
		assertTrue(listCuentas.add(new CajaDeAhorro()));
	}
	@Test
	public void testSetAdd_false() {
		assertFalse(setCuentas.add(new CajaDeAhorro()));
	}
	@Test
	public void testCajaDeahooAcreditar() {
		caVacia.acreditar(50);
		assertEquals(150,caVacia.getSaldo(),0.001);
	}
	@Test
	public void testCajaDeahorro_debitarAlcanza() {
		try {
			caVacia.debitar(80);
			assertEquals(20, caVacia.getSaldo(), 0.001);
		} catch (SaldoInsuficienteException e) {
			assertTrue(false); //pinta de rojo la exception
			e.printStackTrace();
		}
	}
	@Test
	public void testCajaDeAhorro_debitarNoAlcanza() {
		try {
			caVacia.debitar(500);
			assertTrue(false);
		} catch (SaldoInsuficienteException e) {
			assertEquals(100, caVacia.getSaldo(), 0.001); //pinta de rojo la exception
			e.printStackTrace();
		}
	}
	@Test
	public void testCuentaCorrienteAlcanzaConDescubierto() {
		//saldo 100
		//descubierto 1000
		try {
			ccVacia.debitar(300);
			assertEquals(-200, ccVacia.getSaldo(), 0.001);
		} catch (SaldoInsuficienteException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}
	@Test
	public void testCantidadDeObjetosCreados() {
		assertEquals(14, Cuenta.getCantidadDeCuentas());
	}
	
	@Test
	public void testIsEmptyCajaDeAhorro_true() {
		caVacia.setNumero(0);
		caVacia.setSaldo(0);
		caVacia.setInteres(0);
		assertTrue(caVacia.isEmpty());
	}
	@Test
	public void testIsEmptyCajaDeAhorro_false() {
		assertFalse(caVacia.isEmpty());
	}
}
