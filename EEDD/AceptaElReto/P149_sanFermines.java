import java.util.Scanner;

public class P149_sanFermines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		//VARIABLES
		int nToros;
		int nToro = 0;
		int cont = 0;

		//ALGORITMOS

		do {


			nToros = sc.nextInt();

			for(cont = 1; cont <= nToros; cont++) {
				nToro = sc.nextInt();
			}

			System.out.println(nToro);
		}while(cont <= nToros);

	}

}
