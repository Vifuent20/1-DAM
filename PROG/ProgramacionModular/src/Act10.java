/**
 * 
 */
import java.util.Scanner;
/**
 * @author Vicent
 *
 */
public class Act10 {

	/**
	 * @param args
	 */
// FUNCION SACA EL NUMERO AL REVES
		public static int invertidoNumero(int x) {
			int calculoresto = 0, invertido = 0;
			
			while (x > 0) {
				calculoresto = x % 10;
				invertido = invertido * 10 + calculoresto;
				x = x/10;
			}
			return invertido;
		}
		//PEDIMOS AL USUARIO EL NUMERO 
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			int x, res;
			System.out.println("Dime el número que invertir");
			x = teclado.nextInt();
			res = invertidoNumero(x);
			System.out.println("El número queda asi " + res);
			

			

		}

	}
