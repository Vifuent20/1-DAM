import java.util.Scanner;

public class boletin6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame un numero");
		int num = teclado.nextInt();
		int positivo = 0;
		int negativo = 0;
		int cont = 1;

		while (cont <= 10) {

			if (num > 0) {
				positivo = positivo + 1;
				cont = cont + 1;

			} else if (num < 0) {
				negativo = negativo + 1;
				cont = cont + 1;


			}

			System.out.println("Dame otro numero");
			num = teclado.nextInt();


		}
		if (negativo > 0) {
			System.out.println("He leído algun negativo");
		} else {
			System.out.println("No he leído ninguno negativo");
		}

	}
}




