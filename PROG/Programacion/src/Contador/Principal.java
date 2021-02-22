package Contador;
import java.util.Scanner;

import Persona.Persona;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Contador cont = new Contador(1);
		Contador cont2 = new Contador(5);
		Contador cont3 = new Contador(-2);
		Contador cont4 = new Contador(cont);
		
		
		cont2.decrementar();
		cont4.incrementar();
		
		System.out.println(" "+cont.getCont());
		System.out.println(" "+cont2.getCont());	
		System.out.println(" "+cont3.getCont());	
		System.out.println(" "+cont4.getCont());
		
		
	}

}
