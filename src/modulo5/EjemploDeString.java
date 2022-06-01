package modulo5;
import java.util.Scanner;
import util.StringUtil;

public class EjemploDeString {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese una cadena de caracteres a codificar");
			//clave murcielago
			//      0123456789
			//el perro verde
			//56 p5229 v52d5
			String strOriginal = sc.nextLine();
			String strMayuscula = strOriginal.toUpperCase();
			String srtMurcielago = strOriginal.toUpperCase().replace('M', '0')
															.replace('U', '1')
															.replace('R', '2')
															.replace('C', '3')
															.replace('I', '4')
															.replace('E', '5')
															.replace('L', '6')
															.replace('A', '7')
															.replace('G', '8')
															.replace('O', '9');
															
			System.out.println("El texto original =" + strOriginal);
			System.out.println("El texto en MAYUSCULAS =" + strMayuscula);		
			System.out.println("El texto en minúsculas =" + strOriginal.toLowerCase());									
			System.out.println("El texto en clave = " + srtMurcielago);					
			
			int vocales = StringUtil.getCantidadDeVocales(strOriginal);
			System.out.println("\n La cantidad de vocales es " + vocales);
		}
		
}
