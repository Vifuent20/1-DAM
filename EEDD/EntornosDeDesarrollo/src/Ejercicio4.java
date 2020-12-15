import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el numero de chicos que hay en tu clase");
		
		double a = teclado.nextInt();
		
		System.out.println("Dime el numero de chicas que hay en tu clase");
		
		double b = teclado.nextInt();
				
		double porcentajeChicos = ((a * 100) / (a+b));
		double porcentajeChicas = ((b * 100) / (a+b));
		
		System.out.println("El porcentaje de chicos es " + porcentajeChicos + "%");
		System.out.println("El procentaje de chicas es " + porcentajeChicas + "%");
		
		
		
		
		
		
		
		
		teclado.close();

	}

}
