
import java.util.Scanner;

public class Bucles15 {
	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);
		int a = 0;
		
		int sumatotal=0;		
		boolean Numeros = true;
		
		System.out.println("Introducir numeros para sumar");
		System.out.println("NOTA: para finalizar pulse 0");

		while (Numeros) {
			a = teclado.nextInt();
			sumatotal = a + sumatotal;
			
			if (a == 0) {
				Numeros = false;
				System.out.println("La suma ha sido:" + sumatotal);
			}
		}
		


		teclado.close();
	}
}