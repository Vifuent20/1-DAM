/**
 * 
 */
import java.util.Scanner;
/**
 * @author DAM
 *
 */
public class Ejercicio0F {

	/**
	 * @param args
	 */
	
	
		public static void main(String[] args) {
			//A�ADIMOS EL TECLADO Y LE PEDIMOS 2 VARIABLES AL USUARIO
			Scanner sc = new Scanner (System.in);
			System.out.println("Dame numero");
			int x = sc.nextInt();
			System.out.println("Dame otro numero");
			int y = sc.nextInt();
			int res;
			//ACTIVAMOS LA FUNCION maximoMedio
			res = maximoMedio (x,y);
			System.out.println("El maximo de los 2 numeros es " + res);

		}

		//Aqui esta la funci�n para saber cual es mayor.
		public static int maximoMedio (int x, int y) {
			int res;
			if (x > y) {
				res = x;
			}
			else  res = y;

			return res;
		}
	}

