/**
 * 
 */
import java.util.Scanner;
/**
 * @author Vicent Casasús
 *
 */

	/**
	 * @param Ejercicio tabla de multiplicar
	 */
	public class ejercicio14 {

		static Scanner teclado = new Scanner(System.in);
		
		public static void multiplicar(int numero) {
			for (int i = 1; i < 11; i++) {
				System.out.println(i +" * "+ numero +" = "+ numero*i);
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int numero;
			
			System.out.println("Dime un número");
			numero = teclado.nextInt();
			
			multiplicar(numero);
		}

	}
