
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);
		int a = 0;
		
		int sumatotal=0;		
		boolean Numeros = true;
		
		System.out.println("Introducir numeos para calcular su media:");
		System.out.println("NOTA: para finalizar pulse -1");

		while (Numeros) {
			a = teclado.nextInt();
			
			
			if (a == -1) {
				Numeros = false;
				sumatotal = a + sumatotal;
				System.out.println("La suma ha sido:" + sumatotal);
			}
		}
		


		teclado.close();
	}
}