import java.util.Scanner;

/**
 * 
 */

/**
 * @author Vicent Casasús Villanova
 *
 */
public class contador0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//En la siguiente línea le decimos al usuario que nos de el número 
		System.out.println("Dame un número");
		int num = teclado.nextInt(); //En esta línea agregamos la variable num y le asignamos el valor que nos de el usuario
		int res = 0;
		int num2;
		int cont = 0;
		//En las siguientes lineas comentamos lo que hace el programa
		for(; cont < num; cont ++) {
			if  (num % 10 == 0) {
				num = num/10;
				res = res +1;
			}
			else {
				num = num/10;
			}	
		}
		
	System.out.println(res);
		}
	}

