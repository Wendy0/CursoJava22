package practica7.ejercicio1;

public class Persona {

	private String apellido;
	private String nombre;
	
	public Persona() {
		apellido = null;
		nombre = null;
	}
	public Persona(String pApellido, String pNombre) {
		apellido = pApellido;
		nombre = pNombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean bln = false;
		if(obj instanceof Persona) {
			//downcast
			Persona per = (Persona) obj;
			bln = nombre == per.getNombre() && apellido == per.getApellido();
		}
		return bln;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	public String toString() {
		
		String str = "Apellido = " + apellido + ",Nombre = " + nombre;
		return null;
	}
	
}
