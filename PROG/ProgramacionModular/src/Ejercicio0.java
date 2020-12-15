import java.util.Scanner;

public class Ejercicio0 {

	public static void main(String[] args) {
		//AÑADIMOS EL TECLADO Y LE PEDIMOS 2 VARIABLES AL USUARIO
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame numero");
		int x = sc.nextInt();
		System.out.println("Dame otro numero");
		int y = sc.nextInt();
		int res;
		//ACTIVAMOS LA FUNCION maximoMedio
		res = maximoMedio (x,y);
		System.out.println("El maximo de los 2 numeros es " + res);

	}

	//Aqui esta la función para saber cual es mayor.
	public static int maximoMedio (int x, int y) {
		int res;
		if (x > y) {
			res = x;
		}
		else  res = y;

		return res;
	}
}

