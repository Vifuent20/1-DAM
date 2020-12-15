import java.util.Scanner;

public class P117_fiestaAburrida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Variable
		int cont;
		int num;
		
		String nombre;
		String[] parts;
		
		//Algoritmo
		num = sc.nextInt();
		sc.nextLine();
		
		for(cont = 1; cont <= num; cont++) {
			nombre = sc.nextLine();
			parts = nombre.split(" ");
			
			System.out.println("Hola, "+ parts[1] +".");
		}
	}

}
