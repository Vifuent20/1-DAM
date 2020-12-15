import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame numero");
		int x = sc.nextInt();
		System.out.println("Dame otro numero");
		int y = sc.nextInt();
		int res;
		res = sumaNumero (x,y); 
		System.out.println("La suma de los numeros es " + res);

	} 


	public static int sumaNumero (int x, int y) {
		int res;
		res = (x + y);
		return res;
	}

}
