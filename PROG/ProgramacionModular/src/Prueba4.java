import java.util.Scanner;

public class Prueba4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame numero");
		int x = sc.nextInt();
		System.out.println("Dame otro numero");
		int y = sc.nextInt();
		int res;

		res = maximoMedio (x,y);
		System.out.println("El maximo de los 2 numeros es " + res);

	}


	public static int maximoMedio (int x, int y) {
		int res;
		if (x > y) {
			res = x;
		}
		else  res = y;

		return res;
	}
}

