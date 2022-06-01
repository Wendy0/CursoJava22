package util.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import util.CalendarUtil;;

public class CalendarUtilTest {
	//lote de pruebas
	Date fechaViernes;
	Date fechaDomingo;
		
	@Before
	public void setUp() throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.set(2022, Calendar.MAY , 27);
		fechaViernes = cal.getTime();
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2022, Calendar.MAY , 29);
		
		fechaDomingo = cal2.getTime();
	}

	@After
	public void tearDown() throws Exception {
		fechaViernes = null;
		fechaDomingo = null;
	}

	@Test
	public void testIsFinDeSemana_false() {
		assertFalse(CalendarUtil.isFinDeSemana(fechaViernes));
	}

	@Test
	public void testIsFinDeSemana_true() {
		assertTrue(CalendarUtil.isFinDeSemana(fechaDomingo));
	}

}
