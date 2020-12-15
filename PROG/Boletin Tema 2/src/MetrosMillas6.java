import java.util.Scanner;

public class MetrosMillas6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int metro, milla, resultado;
		milla = 1852;
		
		
		
		System.out.println("Dime las millas");
		resultado = teclado.nextInt();
		
		metro = milla * resultado;
		
		System.out.println(resultado + " millas, son " + metro +" metros.");
		
		
		
		
		
		
		
		
		
		
		
		teclado.close();

	}

}
