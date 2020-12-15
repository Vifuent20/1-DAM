/**
 * 
 */
import java.util.Scanner;
/**
 * @author Vicent
 *
 */
public class Act5 {

	/**
	 * @param args
	 */
//Funcion suma de los n impares
		public static int imparesSuma(int x) {
			int res1 = 0, cont2 = 1;
			for (int cont = 0; cont < x;cont++ ) {
				res1 = res1 + cont2;
				cont2 = cont2 +2;
			}



			return res1;
		}
//Aqui es donde se ejecuta
		public static void main(String[] args) {

			Scanner teclado = new Scanner(System.in);

			int x, res;

			System.out.println("Dime un numero y se suman los n impares");
			x = teclado.nextInt();

			res = imparesSuma(x);

			System.out.println("La suma de impares es " + res);


			teclado.close();


		}

	}


	
