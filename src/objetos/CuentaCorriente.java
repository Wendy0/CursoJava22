package objetos;

public class CuentaCorriente extends Cuenta {
	
	private float descubierto;

	public CuentaCorriente() {
		super();
		descubierto = 100;
	}

	public CuentaCorriente(int pNum, float pSal, float pDescubierto) {
		super(pNum, pSal);
		descubierto = pDescubierto;
	}

	@Override
	public void debitar(float pValor) {
		if(pValor <= (getSaldo() + descubierto))
			setSaldo(getNumero() - pValor);

	}

}
