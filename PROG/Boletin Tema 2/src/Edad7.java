import java.util.Scanner;


public class Edad7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		int edad = teclado.nextInt();
		
		if (edad>18)
		    System.out.println("Eres mayor de edad");
		
			
		teclado.close();

	}

}
