import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un número y te digo si es par o impar");
		int numero = teclado.nextInt();
		
		if (numero%2==0)
		    System.out.println("El número " + numero +  " es par" );
		else
		    System.out.println("El número " + numero +  " es impar");
		
		teclado.close();

	}

}
