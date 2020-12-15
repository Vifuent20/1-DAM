import java.util.Scanner;

public class MayorIguales14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
				int numero1,numero2;
				System.out.println("Dime un numero");
				numero1= teclado.nextInt();
						
				System.out.println("Dime otro numero");
				numero2= teclado.nextInt();
				
				if (numero1>numero2)
					  System.out.println(numero1 + " es el mayor");
				else {
					if (numero1<numero2)
						  System.out.println(numero2 + " es el mayor");
					else {
						if (numero1==numero2)
							  System.out.println("Son iguales");
					
					}
				teclado.close();
				}
		}
}


