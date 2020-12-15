import java.util.Scanner;

public class Bucles13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		int x = teclado.nextInt();
			while ( x!= 0) {
				if	(x >0) {
					System.out.println("Es positivo");
		
			}else 
				System.out.println("Es negativo");
			
				
			System.out.println("Dame un numero");	
			x = teclado.nextInt();
			}
	} 

	
	
	
	
	
	
	
	
	
			}
