/**
 * 
 */
	import java.util.Scanner;
/**
 * @author Vicent
 *
 */
public class Act8 {

	/**
	 * @param args
	 */
//FUNCION AQUI CREA EL TRIANGULO CON ASTERISCO
		public static void asteriscoTriangulo (int altura) {
			for (int cont = 1; cont <= altura; cont++) {
				for (int numero = 1; numero < cont; numero++) {
					System.out.print("*");
				}
				System.out.println("*");
			}
		}
//AQUI SE LE PIDE AL USUARIO LA ALTURA
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			int altura;
			System.out.println("Dime la altura");
			altura = teclado.nextInt();
			
			asteriscoTriangulo(altura);
		}

	}

