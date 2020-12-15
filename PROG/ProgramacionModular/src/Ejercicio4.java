import java.util.Scanner;
public class Ejercicio4 {




	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame numero");
		int numero = sc.nextInt();
		
		boolean primo;
		primo = esPrimo(numero); 
		if (primo == true) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}

	}


	public static boolean esPrimo (int numero){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
}
