package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import objetos.CajaDeAhorro;
import objetos.Cuenta;
import objetos.CuentaCorriente;
import objetos.excepciones.SaldoInsuficienteException;

public class FuncionesLambda_1Consumer {


	public static void main(String[] args) {
		
		//defino una lisa cuentas
		List<Cuenta> cuentas = Arrays.asList(new CajaDeAhorro(), 
											 new CuentaCorriente(),
											 new CajaDeAhorro(101, 500, 5.5f),
											 new CuentaCorriente(202, 2500, 7000),
											 new CuentaCorriente(203, 3000, 10000));
		//defino una funcion a aplicar
		Consumer<Cuenta> consumer = c-> {
			try {
				c.debitar(50);
			} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(c);
		};
		
	  cuentas.forEach(consumer);

	}

}
