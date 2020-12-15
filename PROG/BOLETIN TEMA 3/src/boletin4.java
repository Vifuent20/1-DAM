import java.util.Scanner;

public class boletin4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		int num = teclado.nextInt();
		for(int cont=1;cont<=num;cont++)
		System.out.println(cont);
		

}

}
