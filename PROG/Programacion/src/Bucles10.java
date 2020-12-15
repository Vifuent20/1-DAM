import java.util.Scanner;

public class Bucles10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

	        int num;
	        int suma = 0;
	        System.out.println("Hasta que numero tengo q sumar?");
	        num = teclado.nextInt();
	        
	        for(int cont=1;cont<=num;cont++) {
	        	suma=suma +cont;

	
		        }
	        System.out.println(suma);}
}