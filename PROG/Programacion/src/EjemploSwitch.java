/* MENU POR SWITCH O IF/ELSE */
import java.util.Scanner;

public class EjemploSwitch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int OpcionSeleccionada;

		System.out.println("Introduce la opción que quieres hacer (1-4)");
		OpcionSeleccionada = teclado.nextInt();

		switch (OpcionSeleccionada) {
		case 1:
			System.out.println("Caminar");
			break;
		case 2:
			System.out.println("Correr");
			break;
		case 3:
			System.out.println("Esprintar");
			break;
		case 4:
			System.out.println("Volar");
			break;
		default:
			System.out.println("¡¡Error!!  Valores entre (1-4), gracias.");
			
			
			
		/*if(OpcionSeleccionada==1) {
			System.out.println("Caminar");
		}else {
			if(OpcionSeleccionada==2) {
				System.out.println("Correr");
			} else {
				if(OpcionSeleccionada==3) {
					System.out.println("Esprintar");
				}  else {
					if(OpcionSeleccionada==4) {
						System.out.println("Volar");
					}   */
						











	teclado.close();
					
		}
	}
}
	
