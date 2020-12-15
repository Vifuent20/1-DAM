/**
 * 
 */
import java.util.Scanner;
/**
 * @author Vicent Casasús
 *
 */
public class Ejercicio2Arrays {

	/**
	 * @param args //PROGRAMA QUE SACA LA MEDIA DE 10 NUMEROS PARES O IMPARES//
	 */ 
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		//INICIAMOS VARIABLES
		int [] notas = new int [12];
		int i;
		int median = 0;
		int cont1 = 1;
		int res = 0;
		int mayor = 0;
		//For para guardar 1 a 1 los numeros dentro del ARRAY
		for( i = 0; i<notas.length; i++) {
			System.out.println("Alumno " + (i + 1) + ": ");
			notas[i] = teclado.nextInt();
			
			if (notas[i] > 0) {
				res = notas[i] + res;
				median = res / cont1;
				cont1= cont1 + 1;
			}
			
		}System.out.println("Media de las notas es: " + median);
		System.out.println("Los alumnos por encima de la media son: ");
		for(i = 0; i<notas.length; i++){
		if (notas[i] > median)
			System.out.println(" Alumno " + (i + 1) + ": "+ "Nota =" + " " + notas[i]);
		} 
	}
}
