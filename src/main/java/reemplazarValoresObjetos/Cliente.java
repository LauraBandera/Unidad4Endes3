package reemplazarValoresObjetos;

public class Cliente {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador jugador = new Jugador("Sergio", "Ramos", "74928492w", 34, new Telefono("952786639"));
		System.out.println("El jugador " + jugador.getNombre() + " " + jugador.getApellido() +
				" tiene un prefijo de " + jugador.getTelefono().getPrefijo());
	}
	
}
