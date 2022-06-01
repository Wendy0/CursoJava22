package util;

/**
 * Esta clase permite ofrecer servicios para trabajar con string
 * @author e106626
 *
 */

public class StringUtil {
	/**
	 * Este método devuelve la cantidad de vocales que tiene el parametro
	 * @param pCadena es la cadena que se envia para analizar
	 * @return la cantidad de vocales
	 */

	public static int getCantidadDeVocales(String pCadena) {
		int vocales=0;
		for (int i=0; i<pCadena.length(); i++) {
			if (	pCadena.toUpperCase().charAt(i) == 'A' || 
					pCadena.toUpperCase().charAt(i) == 'E' || 
					pCadena.toUpperCase().charAt(i) == 'I' || 
					pCadena.toUpperCase().charAt(i) == 'O' || 
					pCadena.toUpperCase().charAt(i) == 'U' )
				vocales ++;
		}
		
		return vocales;
	}
	
}
