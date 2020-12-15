/**
 * 
 */
	import java.util.Scanner;
/**
 * @author DAM
 *
 */
public class Ejercicio4F {

	/**
	 * @param args
	 */

		public static void main(String[] args) {
			//AÑADIMOS EL TECLADO Y PEDIMOS EL NUMERO QUE QUEREMOS DECIR QUE SEA PRIMO O NO
			Scanner sc = new Scanner (System.in);
			System.out.println("Dame numero");
			int numero = sc.nextInt();
			
			boolean primo;
			//AQUI AÑADIMOS LA FUNCION ES PRIMO Y ABAJO UN IF PARA SABER SI ES PRIMO O NO
			primo = esPrimo(numero); 
			if (primo == true) {
				System.out.println("Es primo");
			} else {
				System.out.println("No es primo");
			}

		}

		//AQUI ESTA LA FUNCION esPirmo lo que hace es dividir entre todos los numeros hasta llegar al numero. si se divide en alguno no es primo. si llega hasta el numero es primo.
		public static boolean esPrimo (int numero){
			  int contador = 2;
			  boolean primo=true;
			  while ((primo) && (contador!=numero)){
			    if (numero % contador == 0)
			      primo = false;
			    contador++;
			  }
			  return primo;
			}
	}
