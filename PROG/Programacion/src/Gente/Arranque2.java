
package Gente;
import Persona.Persona;

public class Arranque2 {

	public static void main(String[] args) {
		
		Persona pepe = new Persona(10,"Pepe");
		Persona luis = new Persona(25,"Luis");
		Persona maria = new Persona(20,"Maria");
		
		Coche c1 = new Coche("Ford","Azul","Fiesta");
		Coche c2 = new Coche("Renault","Rojo","Clio");
		
		System.out.println(pepe.getNombre() +" tiene un " + c2.getMarca());
		System.out.println(luis.getNombre() +" tiene un " + c2.getMarca());
		System.out.println(maria.getNombre() +" tiene un " + c1.getMarca());
		
	}

}