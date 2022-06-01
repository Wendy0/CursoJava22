package util;

import java.util.Calendar;
import java.util.Date;

public class CalendarUtil {
	public static boolean isFinDeSemana(Date pFecha) {
		//crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
		cal.setTime(pFecha);
		return cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ||
				cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
	}
	
}
