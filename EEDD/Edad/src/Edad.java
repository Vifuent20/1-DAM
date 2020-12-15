import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime Tu Edad");
		
		int edad = teclado.nextInt();
		
		System.out.println("Tienes " + edad + " años");
		
		System.out.println("Dime La Edad De Tu Hermano");
		
		int edad2 = teclado.nextInt();
		
		System.out.println("Tu hermano tiene " + edad2 + " años");

		System.out.println("Tu Edad mas la de tu hermano es de " + (edad+edad2));
		
		System.out.println("La Edad de tu herman");
	}

}
