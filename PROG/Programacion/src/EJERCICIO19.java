import java.util.Scanner;

/**
 * 
 */

/**
 * @author Vicent Casas�s Villanova
 *
 */
public class EJERCICIO19{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//En la siguiente l�nea le decimos al usuario que nos de el n�mero 
		System.out.println("Dame un n�mero");
		int num = teclado.nextInt(); //En esta l�nea agregamos la variable num y le asignamos el valor que nos de el usuario
		int res = 0;
		int num2;
		int cont = 0;
		//En las siguientes lineas comentamos lo que hace el programa
		while ( num > 0) {
		for (cont = 0; num > 0; cont++) {
				num = num/10;
		}
System.out.println(cont);
		
		System.out.println("Dame otro n�mero");
		num = teclado.nextInt();
		}
	
		}
	
		}

