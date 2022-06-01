package objetos;

import objetos.excepciones.SaldoInsuficienteException;

public abstract class Cuenta implements Vaciable{
	
	//Atributos
	private int numero;
	protected float saldo;
	private static int cantidadDeCuentas;
	//1- Método constructor
	//Es el primer método que se ejecuta cuando se crea un objeto
	public Cuenta() {
		cantidadDeCuentas ++;		
		numero = 100;
		saldo = 100; 
	}
	public Cuenta(int pNum, float pSal) {
		cantidadDeCuentas++;
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
	
	public static int getCantidadDeCuentas() {
		return cantidadDeCuentas;
	}
	
	public static void vaciarContador() {
		cantidadDeCuentas = 0;
	}
	
	public boolean isEmpty() {
		return numero == 0 && saldo == 0;
	}
	
	public abstract void debitar (float pValor) throws SaldoInsuficienteException;
	
	public boolean equals(Object obj) {
		boolean bln = false;
		if(obj instanceof Cuenta) {
			Cuenta cue = (Cuenta) obj;
			bln = numero == cue.getNumero() && saldo == cue.getSaldo();
		}
		return bln;
	}
	
	public int hashCode() {
		return numero + (int)saldo;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("\nnumero=");
		sb.append(numero);
		sb.append(",saldo=");
		sb.append(saldo);	
		
		return sb.toString();
	}
}
