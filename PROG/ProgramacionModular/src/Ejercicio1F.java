/**
 * 
 */
	import java.util.Scanner;
/**
 * @author DAM
 *
 */
public class Ejercicio1F {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			//AÑADIMOS EL TECLADO Y LE PEDIMOS 2 VARIABLES AL USUARIO
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Dame numero");
			int x = sc.nextInt();
			
			System.out.println("Dame otro numero");
			int y = sc.nextInt();
			//ACTIVAMOS LA FUNCION entreEllos
			entreEllos ( x, y);
		}

		//Aqui esta la funcion entreEllos que muestra los numeros y los que hay entre ellos.
		public static void entreEllos (int x, int y) {
			int cont;
				for ( cont = x; cont <= y; cont++)
				System.out.print(cont + " ");
				

			}

		}
