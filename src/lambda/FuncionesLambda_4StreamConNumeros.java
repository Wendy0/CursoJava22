package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import objetos.CajaDeAhorro;
import objetos.Cuenta;
import objetos.CuentaCorriente;

public class FuncionesLambda_4StreamConNumeros {

	public static void main(String[] args) {
		int suma = Stream.of(1,2,3,4,5)
					.peek(e-> System.out.println("\ntaking integer=" + e))
					.filter(n->n%2==1)
					.peek(e-> System.out.println("Filtered Integer=" + e))
					.map(n-> n*n)
					.peek(e-> System.out.println("Mapped Integer=" + e))
					.reduce(0, Integer::sum);
		
		System.out.println("sum=" + suma);
		


	}

}
