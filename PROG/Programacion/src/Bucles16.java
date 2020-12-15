
import java.util.Scanner;

public class Bucles16 {
	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);
		double contador = 0;
		double nsuma = 0;
		double media = 0;
		System.out.println("Dime un numero");
		int num = teclado.nextInt();

	while(num>=0)  {
		contador = contador+1;
		nsuma = num + nsuma;
		media = nsuma/contador;
		System.out.println("Otro Numero");
		num = teclado.nextInt();
	}
	nsuma = num;
	System.out.println(media);
	}
}