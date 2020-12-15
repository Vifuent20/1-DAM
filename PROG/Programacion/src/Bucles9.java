import java.util.Scanner;

public class Bucles9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		int x = teclado.nextInt();
			while ( x!= 0) {
				if	(x % 2 == 0) {
					System.out.println("Es par");
		
			}else 
				System.out.println("Es impar");
			
				
			System.out.println("Dame un numero");	
			x = teclado.nextInt();
			}
	} 

	
	
	
	
	
	
	
	
	
			}
