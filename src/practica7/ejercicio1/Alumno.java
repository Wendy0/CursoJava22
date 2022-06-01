package practica7.ejercicio1;

public class Alumno extends Persona {
	
	private int legajo;

	public Alumno() {
		super();
		legajo = 5;
	}
	
	public Alumno(int pLegajo) {
		legajo = pLegajo;
	}

	public Alumno(String pApellido, String pNombre, int pLegajo) {
		super(pApellido, pNombre);
		pLegajo = 5;
	}
	
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public boolean equals(Object obj) {
		return super.equals(obj) && obj instanceof Alumno && legajo == ((Alumno)obj).getLegajo();
	}
	
	public int hashCode() {
		return super.hashCode() + (int)legajo;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("Legajo = ");
		sb.append(legajo);		
		return null;
	}

}
