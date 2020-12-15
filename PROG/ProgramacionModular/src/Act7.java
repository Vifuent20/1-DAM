/**
 * 
 */
	import java.util.Scanner;
/**
 * @author Vicent
 *
 */
public class Act7 {

	/**
	 * @param args
	 */
//FUNCION QUE CREA EL RECTANGULO EN ASTERISCOS		
		public static void asteriscoRectangulo(int base, int altura) {
			for (int cont = 1; cont <= altura; cont++) {
				for (int numero= 1; numero < base; numero++ ) {
					System.out.print("*");
				}
				System.out.println("*");	
			}
				
			
		}
//AQUI ES DONDE SE LE PIDE AL USUARIO, BASE Y ALTURA
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			int base, altura;
			
			System.out.println("Dime la base");
			base = teclado.nextInt();
			System.out.println("Dime la altura");
			altura = teclado.nextInt();

			asteriscoRectangulo(base,altura);
		}
	}
