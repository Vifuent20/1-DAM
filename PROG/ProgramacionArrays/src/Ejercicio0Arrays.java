/**
 * 
 */
import java.util.Scanner;
/**
 * @author Vicent Casasús
 *
 */
public class Ejercicio0Arrays {

	/**
	 * @param args //PROGRAMA QUE SACA LA MEDIA DE 10 TEMPERATURAS//
	 */ 
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		//INICIAMOS VARIABLES
		int [] temperatura = new int [10];
		int i;
		int mediap = 0;
		int median = 0;
		boolean positivo;
		int t;
		int cont1 = 1;
		int cont2 = 1;
		int res = 0;
		int res1 = 0;
		//For para guardar 1 a 1 la temperatura dentro del ARRAY
		for( i = 0; i<temperatura.length; i++) {
			System.out.println("Temperatura " + i + ": ");
			temperatura[i] = teclado.nextInt();
			//Si la ºC es positiva, se suma con res y se guarda en res, y luego sacamos la media con mediap, sumamos 1 al contador.
			if (temperatura[i] > 1) {
				positivo = true;
				res = temperatura[i] + res;
				mediap = res /cont1;
				cont1 = cont1 + 1;
			}
			//Si la ºC es negativa, se suma con res1 y se guarda en res1, y luego sacamos la media con median, sumamos 1 al contador.
			else {
				positivo = false;
				res1 = temperatura[i] + res1;
				median = res1 /cont2;
				cont2 = cont2 + 1;
			}
		}
		System.out.println("Media positivos: " + mediap);
		System.out.println("Media negativos: " + median);
	}

}
