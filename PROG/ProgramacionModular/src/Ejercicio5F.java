/**
 * 
 */
import java.util.Scanner;
/**
 * @author DAM
 *
 */
public class Ejercicio5F {

	/**
	 * @param args
	 */
	



		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Dame numero");
			int x = sc.nextInt();
			int res;
			res = dobleNumero(x); 
			System.out.println("El doble del numero es " + res);

		}


		public static int dobleNumero (int x) {
			int res;
			res = (x * 2);
			return res;
		}

	}
