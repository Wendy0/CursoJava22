package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import objetos.CajaDeAhorro;
import objetos.Cuenta;
import objetos.CuentaCorriente;

public class FuncionesLambda_2Simplificada {

	public static void main(String[] args) {
		//defino una lisa cuentas
		List<Cuenta> cuentas = Arrays.asList(new CajaDeAhorro(), 
											 new CuentaCorriente(),
											 new CajaDeAhorro(101, 500, 5.5f),
											 new CuentaCorriente(202, 2500, 7000),
											 new CuentaCorriente(203, 3000, 10000));
	
	  cuentas.forEach(c-> {
			c.acreditar(100);
			System.out.println(c);
		});


	}

}
