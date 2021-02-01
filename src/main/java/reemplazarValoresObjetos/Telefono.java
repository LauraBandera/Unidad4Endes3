package reemplazarValoresObjetos;

public class Telefono {
	private String telefono;
	
	Telefono(String telf){
		this.telefono = telf;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(String telf) {
		this.telefono = telf;
	}
	
	public String getPrefijo() {
		return this.telefono.substring(1,3);
	}
}
