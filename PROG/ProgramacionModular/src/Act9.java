/**
 * 
 */
import java.util.Scanner;
/**
 * @author Vicent
 *
 */
public class Act9 {

	/**
	 * @param args
	 */
//FUNCION CUENTA LOS DIGITOS DE ESTE NUMERO
	public static void numeroEnDigitos(int x) {
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		while(x != 0) {
			if(x < 0) {
				System.out.println("Error");
				System.out.println("Dime otro número");
				x = teclado.nextInt();
			}
			else {
				x = x/ 10;
				cont = cont +1;
			}
		}
		System.out.println("El número contiene " + cont + " digitos");
	}
//SE LE PIDE AL USUARIO UN NUMERO
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int x;
		System.out.println("Dime un número");
		x = teclado.nextInt();
		numeroEnDigitos(x);
	}

}
		
