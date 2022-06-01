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
