/**
 * 
 */
import java.util.Scanner;
/**
 * @author Vicent Casasús
 *
 */
public class Ejercicio1Arrays {

	/**
	 * @param args //PROGRAMA QUE SACA LA MEDIA DE 10 NUMEROS PARES O IMPARES//
	 */ 
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		//INICIAMOS VARIABLES
		int [] numeros = new int [10];
		int i;
		int mediap = 0;
		int mediai = 0;
		boolean positivo;
		int t;
		int cont1 = 1;
		int cont2 = 1;
		int res = 0;
		int res1 = 0;
		//For para guardar 1 a 1 los numeros dentro del ARRAY
		for( i = 0; i<numeros.length; i++) {
			System.out.println("Numero " + i + ": ");
			numeros[i] = teclado.nextInt();
			//Si el numero es positivo, se suma con res y se guarda en res, y luego sacamos la media con mediap, sumamos 1 al contador.
			if (numeros[i] % 2 == 0) {
				positivo = true;
				res = numeros[i] + res;
				mediap = res /cont1;
				cont1 = cont1 + 1;
			}
			//Si el numero es negativo, se suma con res1 y se guarda en res1, y luego sacamos la media con mediai, sumamos 1 al contador.
			else {
				positivo = false;
				res1 = numeros[i] + res1;
				mediai = res1 /cont2;
				cont2 = cont2 + 1;
			}
		}
		System.out.println("Media pares: " + mediap);
		System.out.println("Media impares: " + mediai);
	}

}
