/**
 * 
 */
	import java.util.Scanner;
/**
 * @author Vicent Casasús
 *
 */
/**
* @param Programa que de un numero positivo diga la posicion.
*/
public class ejercicio11 {
	static Scanner teclado = new Scanner(System.in);

		public static int posicion(int numero) {
			int res = 0;
			
			int totalDigitos = numero;
			int contadorDigitos = 0;
			
			while(totalDigitos > 0) {
				totalDigitos = totalDigitos / 10;
				contadorDigitos++;
			}
		
			res = contadorDigitos;
			
			return res;
		}
		
		public static void main(String[] args) {
			int numero;
			int res = 0;
			int digito = 0;
			int divisionNum;
			int restaNum;
			
			
			System.out.println("Dime el número positivo:");
			numero = teclado.nextInt();
			
			System.out.println("Dime el digito: ");
			digito = teclado.nextInt();
			
			res = posicion(numero);
			divisionNum = numero;
			restaNum = numero;		
			
			int[] vectorNum = new int[res];
			
			for (int i = (vectorNum.length-1); i >= 0; i--) {
				numero = divisionNum % 10;
				divisionNum = divisionNum / 10;
				
				restaNum = numero;
				vectorNum[i] = numero;
			}
			
			for (int i = 0; i < vectorNum.length; i++) {

			}
			for (int i = 0; i < vectorNum.length; i++) {
				if (vectorNum[i] == digito)
				System.out.print(" izda " + (i+1));
			}
			
			
		}

	}




