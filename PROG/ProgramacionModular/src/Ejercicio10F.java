import java.util.Scanner;

/**
 * @author Vicent Casasús
 *
 */
public class Ejercicio10F {

	/**
	 * @param Listar número al inverso
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A;
		int cifra;
		int aInverso = 0;
		
		System.out.println("Ingresa un numero");
		A = sc.nextInt();

		
		while (A > 0) {
			
			 cifra = A % 10;
			 aInverso = (aInverso * 10) + cifra;
			 A /= 10;
		}
		System.out.println(aInverso);
		}
	}


