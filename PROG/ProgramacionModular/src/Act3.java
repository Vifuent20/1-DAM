/**
 * 
 */
import java.util.Scanner;
/**
 * @author Vicent
 *
 */
public class Act3 {

	/**
	 * @param args
	 */
	//Calculo del area
	public static double aCilindro (double radio, double altura) {
		double area;
		area =2* radio * altura* Math.PI + 2 * Math.PI * (radio + radio);
		return area;
	}
	//Calculo del volumen
	public static double vCilindro (double radio, double altura) {
		double volumen;
		volumen = altura * Math.PI * (radio + radio);
		return volumen;
	}
	//El switch para elegir q calcular
	public static void fCilindro (double radio, double altura, int opcion) {
			switch (opcion) {
			
			case 1: {
				
				
				
				
				System.out.println("El área es: " +aCilindro(radio,altura));
				
				
				break;
			}
			case 2: {
				
				
				
				System.out.println("El volumen es: " +vCilindro(radio,altura) );
				
				break;
				
			}
			default: {
				System.out.println("Porfavor pulse entre los números 0, 1 o 2");
				break;
			}
			}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double radio, altura;
		int opciones;
		
		//AQUI ESTA LO QUE HACE EL PROGRAMA DEPENDIENDO DE 1 2 o 0 
		do {
			
			System.out.println("1 para calcular área");
			System.out.println("2 para calcular volumen");
			System.out.println("0 para salir del programa");
			opciones = teclado.nextInt();
			if(opciones != 0) {
				System.out.println("Dime radio");
				radio = teclado.nextDouble();
				System.out.println("Dime altura");
				altura = teclado.nextDouble();
				fCilindro(radio, altura, opciones);
			}
		}
			while (opciones != 0);
			teclado.close();
			}
	}
