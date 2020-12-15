import java.util.Scanner;
public class Bucles12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame un numero");
		int num = teclado.nextInt();

		while (num >=0) {

			System.out.println(num*num);


			System.out.println("Dame un numero");	
			num = teclado.nextInt();	
		}

	}
}
