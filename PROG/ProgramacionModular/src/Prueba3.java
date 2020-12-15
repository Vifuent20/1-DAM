import java.util.Scanner;

public class Prueba3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame numero");
		int x = sc.nextInt();
		System.out.println("Dame otro numero");
		int y = sc.nextInt();
		int res;

		res = numeroProducto (x,y);
		System.out.println("El producto de estos es " + res);

	}


	public static int numeroProducto (int x, int y) {
		int res;
		res = (x * y);
		return res;
	}
}
