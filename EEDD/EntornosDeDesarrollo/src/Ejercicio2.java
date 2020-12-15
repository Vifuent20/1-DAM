import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un número");
		
		int a = teclado.nextInt();;
		
		System.out.println("Dime otro número");
		
		int b = teclado.nextInt();;
		
		System.out.println("A es " + a +  " y B es " + b);
		
		System.out.println("La suma es " + (a + b) );
		
		System.out.println("La resta es " + (a - b ));
		
		System.out.println("La multiplicación es "+ a * b );
		
		System.out.println("La division es " + a / b );
		
		System.out.println("El resto es " + a % b );
  teclado.close();
	}

}
