import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un n�mero y te digo si es par o impar");
		int numero = teclado.nextInt();
		
		if (numero%2==0)
		    System.out.println("El n�mero " + numero +  " es par" );
		else
		    System.out.println("El n�mero " + numero +  " es impar");
		
		teclado.close();

	}

}
