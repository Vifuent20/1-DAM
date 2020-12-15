import java.util.Scanner;

public class P116_holaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Variables
		
		int num;
		int cont;
		
		//Algoritmo
		
		num = sc.nextInt();
		
		for(cont = 1; cont <= num; cont++) {
			System.out.println("Hola mundo.");
		}
		
	}

}
