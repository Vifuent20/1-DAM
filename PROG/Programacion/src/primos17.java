import java.util.Scanner;
/**
 *  
 */

/**
 * El programa va sobre dir si un numero es primo o no
 * @author Vicent Casasús Villanova
 * 09/11/2020
 *
 */
public class primos17 {

	/**
	 * @param args
	 * Dir si un número si es primo o no
	 */

		public static void main(String[] args) {
			
			
			Scanner teclado= new Scanner(System.in);
			//En la siguiente línea le decimos al usuario que nos de el número 
			System.out.println("Dame un número");
			int num = teclado.nextInt(); //En esta línea agregamos la variable num y le asignamos el valor que nos de el usuario
			
			//En la siguiente línea le decimos que ejecute el programa si es mayor que 0
			while (num > 0) {
			//En la siguiente línea digo que si es igual a algunos de los numeros primos base, diga que son primos
				if (num == 2 || num == 3 || num == 5 || num == 7) {  
					System.out.println("Es primo");
				}
			//En la siguiente línea digo que si el resto entre los numeros primos base es creo, diga que no son primos
				else if (num % 2 == 0 || num % 3 ==0 || num % 5 == 0 || num % 7 == 0) {
					System.out.println("No es primo");
			//En la siguiente línea digo que todos los demas numeros son primos
				}else 
					System.out.println("Es primo");
			//En la siguiente línea  digo que el usuario introduzca otro número 
					System.out.println("Dame otro numero");
					num = teclado.nextInt();}
			
			} 
	}
