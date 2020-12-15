import java.util.Scanner; 

public class P374_Crigenizacion {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int casos;
		long num;
		long max = 0; 
		long min = 0; 
		int vmin = 0;
		int vmax = 0;

		casos = teclado.nextInt();


		for(int i=0; i<casos; i++) {



			min = Long.MAX_VALUE;
			max = 0;
			vmin = 0;
			vmax= 0;
			do {
				num = teclado.nextLong();
				
				if (num != 0) {


					if(num < min) {

						min = num;
						vmin = 1;

					} else if(min == num) {

						vmin++;

					}

					if(num > max) {

						max = num;
						vmax = 1;

					} else if(max == num) {

						vmax++;
					}
				}
			} 	while(num != 0);

				System.out.printf("%d %d %d %d\n", min, vmin, max, vmax);

			
			
		}
	}
}



