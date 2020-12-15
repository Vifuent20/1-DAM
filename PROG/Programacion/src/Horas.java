import java.util.Scanner;

public class Horas {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int minutos, horas, dias;
		
		System.out.println("Dime los minutos que quieres convertir");
		minutos=teclado.nextInt();
		System.out.println("Has puesto "+ minutos + " minutos." );
		dias = (minutos / 1440);
		horas = (dias / 60);
		minutos =  (horas % 60);
		System.out.println("Que en total son " + dias + " dias, " + horas + " horas, y " + minutos + "minutos");

		
		teclado.close();
	}

}
