import java.util.Scanner;

public class Tablas {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n;
		
		System.out.println("Dime un número");
		n=teclado.nextInt();
		
		System.out.println("TABLA DEL " + n);
		System.out.println( n  * 1 );
		System.out.println( n  * 2 );
		System.out.println( n  * 3 );
		System.out.println( n  * 4 );
		System.out.println( n  * 5 );
		System.out.println( n  * 6 );
		System.out.println( n  * 7 );
		System.out.println( n  * 8 );
		System.out.println( n  * 9 );
		System.out.println( n  * 10 );
		

	
	teclado.close();
	}

}
