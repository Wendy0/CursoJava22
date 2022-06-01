package objetos;

import objetos.excepciones.SaldoInsuficienteException;

public class CuentaCorriente extends Cuenta {
	
	private float descubierto;

	public CuentaCorriente() {
		super();
		descubierto = 1000;
	}

	public CuentaCorriente(int pNum, float pSal, float pDescubierto) {
		super(pNum, pSal);
		descubierto = pDescubierto;
	}
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && descubierto == 0;
	}
	
	@Override
	public void debitar(float pValor) throws SaldoInsuficienteException {
		if(pValor <= (saldo + descubierto))
			saldo -= pValor;
		else
			throw new SaldoInsuficienteException("El saldo es insuficiente.");
	}
	
	public float getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(float descubierto) {
		this.descubierto = descubierto;
	}
	
	public boolean equals(Object obj){		
		return super.equals(obj) 							&&
				obj instanceof CuentaCorriente 				&&
				descubierto == ((CuentaCorriente)obj).getDescubierto();
		
	}
	public int hashCoded(){
		return super.hashCode() + (int)descubierto;
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",descubierto=");
    	sb.append(descubierto);
    	return sb.toString();

	}




}
