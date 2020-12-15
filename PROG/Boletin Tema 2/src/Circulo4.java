import java.util.Scanner;

public class Circulo4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	int radio;
	System.out.println("¿Que radio tiene tu circulo?");
	radio = teclado.nextInt();
	
	System.out.println("La longitud de tu circulo es de " + 2*Math.PI*radio);
	System.out.println("La area de tu circulo es de " +  Math.PI * (radio*radio));
	System.out.println("El volumen de tu circulo es de " + (4/3) * Math.PI * (radio*radio*radio));

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	teclado.close();
	}
}
