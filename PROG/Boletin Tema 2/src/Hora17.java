import java.util.Scanner;

public class Hora17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Que hora es?");
		int hora=teclado.nextInt();
		
		System.out.println("Que minuto es?");
		int min=teclado.nextInt();
		
		System.out.println("Que segundo es?");
		int sec=teclado.nextInt();

		if (sec>=59) {
			sec=00;
			min=min+1;
			
		} else {
			sec=sec+1;
		}
			
		if (min>=59) {
		min=00;
		hora=hora+1;
		}
		
		if (hora >=23) {
		hora=00;
		}


		 
	System.out.println("Dentro de un segundo serán las " + hora + ":" + min + ":" + sec);
		 
		 
		 
		 
		 
		 
teclado.close();
		 
	}

}
