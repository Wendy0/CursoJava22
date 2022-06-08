package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import objetos.CajaDeAhorro;
import objetos.Cuenta;
import objetos.CuentaCorriente;

public class FuncionesLambda_3Stream {

	public static void main(String[] args) {
		//defino una lisa cuentas
		List<Cuenta> cuentas = Arrays.asList(new CajaDeAhorro(), 
											 new CuentaCorriente(),
											 new CajaDeAhorro(101, 500, 5.5f),
											 new CuentaCorriente(202, 2500, 7000),
											 new CuentaCorriente(203, 3000, 10000));
	   List<Cuenta> cuentasMenoresA1000 = cuentas.stream()
			    								 .filter(c->c.getSaldo()<1000)
			    								 .collect(Collectors.toList());
	   
	
	  cuentasMenoresA1000.forEach(c->
	   {   c.acreditar(250);
		   System.out.println(c);
		
	   });
	  

	Optional<Float> suma = cuentas.stream()
	       .map(c->c.getSaldo())
	       .reduce(Float::sum);
			  	
	  System.out.println("suma " + suma);
	  System.out.println("cuentas" + cuentas);

	}

}
