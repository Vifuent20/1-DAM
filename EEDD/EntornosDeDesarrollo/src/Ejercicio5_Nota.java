import java.util.Scanner;

public class Ejercicio5_Nota {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime nota primer examen");
		double Notaprimer = teclado.nextDouble();
		
		System.out.println("Dime nota que quieres en el final");
		double Notafinal = teclado.nextDouble();
				

		double primero = (Notaprimer * 0.4);
		double Notasegundo = ( Notafinal - primero );
		double finalexamen = (Notasegundo / 0.6);
				
		System.out.println(finalexamen + " es la nota que deberias sacar.");
		
		
		
		
		
		teclado.close();

	}

}
