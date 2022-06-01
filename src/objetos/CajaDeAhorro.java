package objetos;

public class CajaDeAhorro extends Cuenta {

	//Atributos
	private float interes;
	
	public CajaDeAhorro() {
		super();
		interes = 10;
	}

	public CajaDeAhorro(int pNum, float pSal, float pInteres) {
		super(pNum, pSal);
		interes = pInteres;
	}

	public float getInteres() {
		return interes;
	}

	public void setInteres(float interes) {
		this.interes = interes;
	}
	
	public boolean equals(Object obj) {
		return super.equals(obj) && obj instanceof CajaDeAhorro && interes == ((CajaDeAhorro)obj).getInteres();
	}
	
	public int hashCode() {
		return super.hashCode() + (int)interes;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(",interes = ");
		sb.append(interes);
		return sb.toString();
	}

	@Override
	public void debitar(float pValor) {
		if(pValor < getSaldo())
			setSaldo(getSaldo() - pValor);			
	}

}
