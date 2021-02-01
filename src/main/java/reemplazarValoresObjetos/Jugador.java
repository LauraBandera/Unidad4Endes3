package reemplazarValoresObjetos;

public class Jugador {
	private Telefono telefono;
	
	private String nombre, apellido, nif;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Telefono getTelefono() {
		return telefono;
	}
	
	public Jugador(String nombre, String apellido, String nif, int edad, Telefono telf) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nif = nif;
		this.edad = edad;
		this.telefono = telf;
	}
	
	public Jugador() {
		super();
	}
	
}
