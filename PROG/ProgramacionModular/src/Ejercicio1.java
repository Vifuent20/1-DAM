import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame numero");
		int x = sc.nextInt();
		
		System.out.println("Dame otro numero");
		int y = sc.nextInt();
		
		entreEllos ( x, y);
	}


	public static void entreEllos (int x, int y) {
		int cont;
			for ( cont = x; cont <= y; cont++)
			System.out.print(cont + " ");
			

		}

	}
