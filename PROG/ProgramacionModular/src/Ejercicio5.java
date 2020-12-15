import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame numero");
		int x = sc.nextInt();
		int res;
		res = sumaImpares(x);
		System.out.println("La suma de los impares es " + res);
	}
	
	
	
	
	
		public static int sumaImpares(int x) {
			int impar = 0;
			for (int cont = 1; cont <= x; cont= cont+2 ) {
				 impar = cont + impar;
			}
		return impar;}

	}


