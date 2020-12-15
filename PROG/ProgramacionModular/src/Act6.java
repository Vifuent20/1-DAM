/**
 * 
 */
import java.util.Scanner;
/**
 * @author Vicent
 *
 */
public class Act6 {

	/**
	 * @param args
	 */
	//Aqui es donde esta la funcion de multiplicar n numeros
	public static int nProducto (int x, int y) {
		int cont = x, res = 1;
		for (cont = x; cont <= y; cont++ ) {
			res = res * cont;
		}
		return res;
	}
//Aqui donde se ejecuta y se le pide al usuario los numeros
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int x, y, res1;
		
		System.out.println("Dime numero donde empieza");
		x = teclado.nextInt();
		System.out.println("Dame el número donde acaba");
		y = teclado.nextInt();

		res1 = nProducto(x,y);
		System.out.println("La multiplicación es de " + res1);
		

	}

}