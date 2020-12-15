import java.util.Scanner;

public class PrimosPruebas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num;
		int suma;
		int total = 0;
		System.out.println("Dame un número");
		num = teclado.nextInt();
		suma = num;
		
		for (int cont = 0; cont < num; ) {

			if (suma %2==0) {
				total = suma + total;
				cont = cont+1;
			}

			suma = suma +1;
			
		}
		System.out.println(total);
		
	}


}


