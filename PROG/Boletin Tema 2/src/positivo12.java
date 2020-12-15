import java.util.Scanner;

public class positivo12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		double numero = teclado.nextInt();

		if (numero < 0)
			System.out.println("Es negativo");
		else 
			System.out.println("Es positivo");
		
		
		
		
		
		
		
		
		
		
		teclado.close();
	}

}
