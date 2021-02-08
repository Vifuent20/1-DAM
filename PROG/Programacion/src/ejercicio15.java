/**
 * 
 */
import java.util.Scanner;
/**
 * @author Vicent Casasus
 *
 */
public class ejercicio15 {
	/**
	 * @param PINTA UN CUADRARO HASTA LA CIFRA QUE INSERTES.
	 */
	static Scanner sc = new Scanner(System.in);

	public static int pintarCuadrado(int val1) {
		int res = 0;

		for (int i = 1; i <= val1; i++) {
			for (int j = 1; j <= val1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		return res;
	}

	public static void main(String[] args) {
		int num;
		int res;

		System.out.println("dime un número:");
		num = sc.nextInt();

		res = pintarCuadrado(num);
	}

}
