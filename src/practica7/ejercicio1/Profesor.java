package practica7.ejercicio1;

public class Profesor extends Persona {

	private String iosfa;
	
	public Profesor() {
		super();
		iosfa = null;
	}
	
	public Profesor(String pIosfa) {
		super();
		iosfa = pIosfa;
	}

	public Profesor(String pApellido, String pNombre, String pIosfa) {
		super(pApellido, pNombre);
		iosfa = pIosfa;
	}

	public String getIosfa() {
		return iosfa;
	}

	public void setIosfa(String iosfa) {
		this.iosfa = iosfa;
	}
	
	public boolean equals(Object obj) {
		return super.equals(obj) && obj instanceof Profesor && iosfa == ((Profesor)obj).getIosfa();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("Iosfa = ");
		sb.append(iosfa);		
		return null;
	}
}
