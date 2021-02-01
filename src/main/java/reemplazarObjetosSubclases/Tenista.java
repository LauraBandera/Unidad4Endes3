package reemplazarObjetosSubclases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tenista {
	
	private Scanner s = new Scanner(System.in);
	private String nombre, apellido;
	
	public Tenista nivel() {
		int eleccion = -1;
		do {
			System.out.println("Introduzca el nivel: \n"
					+ "1 - Amateur\n"
					+ "2 - Semiprofesional\n"
					+ "3 - Profesional");
			try {
				eleccion = s.nextInt();
			}catch (InputMismatchException ime) {
				s.nextLine();
			}
		}while (eleccion < 1 || eleccion > 3);
		
		switch(eleccion) {
			case 1:
				return new Amateur();
			case 2:
				return new Semiprofesional();
			case 3:
				return new Profesional();		
		}
		return null;
	}
}
