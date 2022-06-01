package modulo6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import util.CalendarUtil;

import java.util.Date;

public class EjemploDeCalendar {

	public static void main(String[] args) {
		
		Date fecha = new Date();
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEEE-dd-MM-yyyy");
		
		
		System.out.println("La fecha es " + fecha);
		System.out.println("La fecha es " + sdf.format(fecha));
		
		System.out.println("\nLa fecha es con calendar " + cal);
		System.out.println("La fecha es con calendar " + sdf.format(cal.getTime()));
		System.out.println("Hoy es fin de semana? " + CalendarUtil.isFinDeSemana(cal.getTime()));
		
		System.out.println("\nEl dia de una fecha es " + cal.get(Calendar.DATE));
		System.out.println("El dia de una fecha es " + cal.get(Calendar.MONTH) +1);  //Enero empieza en 0
		System.out.println("El mes de una fecha es " + cal.get(Calendar.YEAR));
		
		//si al dia de hoy le sumo 3 días
		cal.add(Calendar.MONTH, -3);
		System.out.println("La fecha mas 3 meses es " + sdf.format(cal.getTime()));
		
		cal.add(Calendar.MONTH, 1);
		System.out.println("Mañana es fin de semana? " + CalendarUtil.isFinDeSemana(cal.getTime()));
		
	}
		
}
