/**
 * 
 */
	import java.util.Scanner;
/**
 * @author DAM
 *
 */
public class Ejercicio2F {

	/**
	 * @param args
	 */


		public static void main(String[] args) {
			//AÑADIMOS UN TECLADO Y PEDIMOS UNA VARIABLE
			Scanner sc = new Scanner (System.in);
			System.out.println("Dame numero");
			int x = sc.nextInt();
			int res;
			//PONEMOS LA FUNCION dobleNumero
			res = dobleNumero(x); 
			System.out.println("El doble del numero es " + res);

		}

		//AQUÍ ESTA LA FUNCION QUE MULTIPLICA LE NUMERO *2
		public static int dobleNumero (int x) {
			int res;
			res = (x * 2);
			return res;
		}

	}
