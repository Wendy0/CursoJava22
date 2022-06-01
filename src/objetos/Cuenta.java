package objetos;

public abstract class Cuenta {
	
	//Atributos
	private int numero;
	private float saldo;
	//1- Método constructor
	//Es el primer método que se ejecuta cuando se crea un objeto
	public Cuenta() {
		numero = 100;
		saldo = 100; 
	}
	public Cuenta(int pNum, float pSal) {
		numero = pNum;
		saldo = pSal;
	}
	
	//2- Accesos: getter y setter
	//Tipo de dato que devuelve: nombre, parámetro
	public void setNumero(int pNum) {
		numero = pNum;
	}
	public int getNumero() {
		return numero;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getSaldo() {
		return saldo;
	}
	
	//3- Métodos de negocio
	public void acreditar(float pValor) {
		saldo += pValor;
	}
	public abstract void debitar (float pValor);
	
	public boolean equals(Object obj) {
		boolean bln = false;
		if(obj instanceof Cuenta) {
			//downcast
			Cuenta cue = (Cuenta) obj;
			bln = numero == cue.getNumero() && saldo == cue.getSaldo();
		}
		return bln;
	}
	
	public int hashCode() {
		return numero + (int)saldo;
	}
	
	public String tostring() {
		String str = "numero = " + numero + ",saldo = " + saldo;
		return null;
	}
}
