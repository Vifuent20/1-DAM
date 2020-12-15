import java.util.Scanner;

public class Prueba5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame numero");
		int x = sc.nextInt();

		int res;
		res = multiFactorial(x); 
		System.out.println("El doble del numero es " + res);

	} 


	public static int multiFactorial (int x) {
		int res = 1;
		for (int cont = 1; cont <= x; cont ++) {
			res = res * cont;
		}
		return res;
	}
}


