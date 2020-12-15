import java.util.Scanner;

public class P117_FiestaAburrida {

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		int casos;
		casos = teclado.nextInt();		

		String nombre1;
		String nombre2;

		for(int i=1; i<=casos; i++){

			nombre1 = teclado.next();
			nombre2 = teclado.next();

			System.out.println("Hola, " +nombre2+ ".");

		}


	}

} 



