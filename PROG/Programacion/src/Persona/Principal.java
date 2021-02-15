package Persona;

public class Principal {

	public static void main(String[] args) {
		
		Persona Pepe = new Persona(10,"Pepe");
		Persona Luis = new Persona(25,"Luis");
		Persona Maria = new Persona(20,"Maria");

		System.out.println(Pepe.getEdad()+" "+Pepe.getNombre()+" "+Luis.getEdad()+" "+Luis.getNombre()+" "+Maria.getEdad()+" "+Maria.getNombre());
		System.out.println(Luis.getEdad()+Maria.getEdad()-Pepe.getEdad());
	}

}
