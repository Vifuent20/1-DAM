
import java.util.Scanner;

public class Bucles14 {
	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);
		int a = 0;
		int contador = 0;
		int sumatotal=0;		
		boolean Numeros = true;
		
		System.out.println("Introducir numeros");
		System.out.println("Para finalizar introduzca un numero negativo");

		while (Numeros) {
			a = teclado.nextInt();
			contador = contador +1;
			
			if (a <= 0) {
				Numeros = false;
				System.out.println("Se han introducido " + (contador-1) +" numeros");
			}
		}
		


		teclado.close();
	}
}