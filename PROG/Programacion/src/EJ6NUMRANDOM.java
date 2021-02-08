/**
 * 
 */
import java.util.Scanner;
/**
 * @author Vicent Casasús
 *
 */
public class EJ6NUMRANDOM {

	/**
	 * @param Programa que genera 10 numeros aleatorios.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] numRandom = new double [10];

		for (int i = 0; i < numRandom.length; i++) {
			numRandom[i] = Math.random();
		}

		for (int i = 0; i < numRandom.length; i++) {
			System.out.printf("El numero aleatorio guardado en la posición v[%d] = %.3f %n",i,numRandom[i]);
		}

		sc.close();
	}
}