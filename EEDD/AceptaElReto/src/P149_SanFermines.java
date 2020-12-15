import java.util.Scanner;
public class P149_SanFermines  {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int numToros;
		int v;
		int max;
		while (teclado.hasNext()); {	
			numToros = teclado.nextInt();
			max = 0;
			for (int i = 0; i < numToros; i++) {
				v = teclado.nextInt();
				if (v > max) {
					max = v;
				}
			}
			System.out.println(max);
		} 
	}
}