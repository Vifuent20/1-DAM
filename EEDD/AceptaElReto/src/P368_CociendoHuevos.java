import java.util.Scanner;

public class P368_CociendoHuevos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int huevos = 3;
		int olla = 5;
		int minutos = 10;
		int resultado;
		do {
			huevos = sc.nextInt();
			olla = sc.nextInt();
			
			if (huevos != 0 && olla != 0){
				
				resultado = huevos / olla;                                                                                                                                                                                                                                                                                                                                                           
				
				if (huevos % olla !=0) {
					resultado += 1;
				}
				minutos = resultado * 10;
				
				System.out.println(minutos);
			}
		} while (huevos != 0 && olla != 0);
		sc.close();
	}
}