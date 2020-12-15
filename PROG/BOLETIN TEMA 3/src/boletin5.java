import java.util.Scanner;
public class boletin5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();
        int factorial = 1;
        for (int i = num; i > 0; i--) {
           factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);

	}

}
